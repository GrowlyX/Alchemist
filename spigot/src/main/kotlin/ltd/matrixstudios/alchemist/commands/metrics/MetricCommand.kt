package ltd.matrixstudios.alchemist.commands.metrics

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import com.google.common.base.Stopwatch
import com.google.gson.JsonObject
import ltd.matrixstudios.alchemist.api.AlchemistAPI
import ltd.matrixstudios.alchemist.commands.metrics.menu.MetricsMenu
import ltd.matrixstudios.alchemist.metric.Metric
import ltd.matrixstudios.alchemist.metric.MetricService
import ltd.matrixstudios.alchemist.models.profile.GameProfile
import ltd.matrixstudios.alchemist.profiles.getProfile
import ltd.matrixstudios.alchemist.service.profiles.ProfileGameService
import ltd.matrixstudios.alchemist.service.ranks.RankService
import ltd.matrixstudios.alchemist.util.Chat
import org.bukkit.entity.Player
import java.util.*
import java.util.concurrent.TimeUnit

class MetricCommand : BaseCommand() {

    @CommandAlias("metrics|mylaggyserver")
    @CommandPermission("alchemist.metrics")
    fun metrics(player: Player) {
        val startMs = System.currentTimeMillis()
        //sends a decoy mongo request to know its working. If this takes long asf its my fault
        //for not being able to code :shrug:
        AlchemistAPI.syncFindProfile(player.uniqueId)
        MetricService.addMetric("Heartbeat", Metric("Heartbeat", System.currentTimeMillis().minus(startMs), System.currentTimeMillis()))

        MetricsMenu(player).openMenu()
    }

    @CommandAlias("decoyprofiles")
    @CommandPermission("alchemist.owner")
    fun decoy(player: Player, amt: Int) {
        for (int in 0 until amt) {
            val profile = GameProfile(
                UUID.randomUUID(), "Profile_${int}", "Profile_${int}".toLowerCase(), JsonObject(), "", arrayListOf(), arrayListOf(), null, null, mutableListOf(), System.currentTimeMillis()
            )

            ProfileGameService.save(profile)
            player.sendMessage(Chat.format("&aMade a new profile"))
        }
    }

    @CommandAlias("performancetest")
    @CommandPermission("alchemist.metrics")
    fun performanceTest(player: Player) {
        player.sendMessage(Chat.format("&6&lPerformance Evaluation"))
        player.sendMessage(" ")
        val startProfile = Stopwatch.createStarted()
        //only doing this to test timings.
        val profile = ProfileGameService.handler.retrieve(player.uniqueId)
        player.sendMessage(Chat.format("&eProfile Fetch &7- &f" + startProfile.elapsed(TimeUnit.MILLISECONDS) +"ms")).also {
            startProfile.stop()
        }

        val startGrantSort = Stopwatch.createStarted()
        val highestRank = profile!!.getCurrentRank()
        player.sendMessage(Chat.format("&eCurrent Grant Sort &7- &f" + startGrantSort.elapsed(TimeUnit.MILLISECONDS) +"ms")).also {
            startGrantSort.stop()
        }
        player.sendMessage(" ")
    }
}