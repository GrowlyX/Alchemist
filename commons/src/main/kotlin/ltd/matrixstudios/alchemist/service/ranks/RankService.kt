package ltd.matrixstudios.alchemist.service.ranks

import io.github.nosequel.data.DataStoreType
import ltd.matrixstudios.alchemist.Alchemist
import ltd.matrixstudios.alchemist.models.ranks.Rank
import ltd.matrixstudios.alchemist.service.GeneralizedService
import java.util.concurrent.CompletableFuture
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.Executors
import java.util.concurrent.ForkJoinPool


object RankService : GeneralizedService {

    var handler = Alchemist.dataHandler.createStoreType<String, Rank>(DataStoreType.MONGO)

    var ranks = ConcurrentHashMap<String, Rank>()

    var FALLBACK_RANK = Rank("unknown", "Unknown", "Unknown", 1, arrayListOf(), arrayListOf(), "&f", "&f") //lunar.gg feature

    fun loadRanks() {
        //since there are only a limited amount of ranks we can just load on startup
        getValues().thenAccept {
            for (rank in it) {
                ranks[rank.id] = rank
            }

            if (byId("default") == null && findFirstAvailableDefaultRank() == null) {
                save(Rank(
                    "default",
                    "Default",
                    "Default",
                    1,
                    ArrayList(),
                    ArrayList(),
                    "",
                    "&7",
                    staff = false,
                    default = true)
                )
            }
        }
    }

    fun getValues() : CompletableFuture<Collection<Rank>> {
        return handler.retrieveAllAsync()
    }

    fun save(rank: Rank) : CompletableFuture<Void> {
        return CompletableFuture.runAsync {
            handler.store(rank.id, rank)
        }.thenAccept {
            ranks[rank.id] = rank
        }
    }

    fun delete(rank: Rank) {
        ranks.remove(rank.id)

        CompletableFuture.runAsync {
            handler.delete(rank.id)
        }
    }

    fun getAllRanksInOrder() : Collection<Rank>
    {
        return ranks.values.sortedByDescending { it.weight }
    }

    fun getRanksInOrder() : Collection<Rank>
    {
        val final = mutableListOf<Rank>()

        for (rank in ranks.values.sortedByDescending { it.weight })
        {
            if (rank.getRankScope().global || rank.getRankScope().appliesOn(Alchemist.globalServer))
            {
                final.add(rank)
            }
        }

        return final
    }


    fun findFirstAvailableDefaultRank() : Rank? {
        return ranks.values.firstOrNull { it.default }
    }

    fun byId(id: String) : Rank? {
        if (ranks.containsKey(id)) {
            return ranks[id]
        }

        return null
    }
}