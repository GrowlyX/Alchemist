package ltd.matrixstudios.alchemist.grants.menu.grants.filter

import ltd.matrixstudios.alchemist.models.grant.types.RankGrant
import java.util.*
import ltd.matrixstudios.alchemist.punishments.actor.executor.Executor
import ltd.matrixstudios.alchemist.punishments.actor.ActorType

/**
 * Class created on 6/29/2023

 * @author 98ping
 * @project Alchemist
 * @website https://solo.to/redis
 */
enum class GrantFilter(
    val displayName: String,
    val lambda: (Collection<RankGrant>) -> List<RankGrant>
) {
    ALL("Every Grant", { rankGrants ->  rankGrants.toList() }),
    ACTIVE("Active", { rankGrant -> rankGrant.filter { it.expirable.isActive() } }),
    REMOVED("Removed", { rankGrant -> rankGrant.filter { it.removedBy != null && it.removedBy != UUID.fromString("00000000-0000-0000-0000-000000000000") } }),
    EXPIRED("Expired", { rankGrant -> rankGrant.filter { it.removedBy != null && it.removedBy == UUID.fromString("00000000-0000-0000-0000-000000000000") } }),
    TEMPORARY("Temporary", { rankGrants ->  rankGrants.filter { it.expirable.duration != kotlin.Long.Companion.MAX_VALUE }}),
    GAME_GRANTED("Granted In-Game", { rankGrants -> rankGrants.filter { it.actor.executor == Executor.PLAYER } }),
    CONSOLE_GRANTED("Granted In Console", { rankGrants -> rankGrants.filter { it.actor.executor == Executor.CONSOLE } }),
    GAME_ACTOR("Game-Based Actor", { rankGrants -> rankGrants.filter { it.actor.actorType == ActorType.GAME } })
}