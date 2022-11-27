package ltd.matrixstudios.alchemist.commands.punishments.create

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.*
import co.aikar.commands.annotation.Optional
import ltd.matrixstudios.alchemist.models.grant.types.Punishment
import ltd.matrixstudios.alchemist.models.grant.types.proof.ProofEntry
import ltd.matrixstudios.alchemist.models.profile.GameProfile
import ltd.matrixstudios.alchemist.punishment.BukkitPunishmentFunctions
import ltd.matrixstudios.alchemist.punishments.PunishmentType
import ltd.matrixstudios.alchemist.punishments.actor.ActorType
import ltd.matrixstudios.alchemist.punishments.actor.DefaultActor
import ltd.matrixstudios.alchemist.punishments.actor.executor.Executor
import ltd.matrixstudios.alchemist.util.Chat
import org.bukkit.Bukkit
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import java.util.*

class BlacklistCommand : BaseCommand() {

    @CommandAlias("blacklist|bl")
    @CommandPermission("alchemist.punishments.blacklist")
    @CommandCompletion("@gameprofile")
    @Syntax("<target> [-a] <reason>")
    fun ban(sender: CommandSender, @Name("target") gameProfile: GameProfile, @Name("reason") reason: String) {
        val punishment = Punishment(
            PunishmentType.BLACKLIST.name,
            UUID.randomUUID().toString().substring(0, 4),
            mutableListOf<ProofEntry>(),
            gameProfile.uuid,
            BukkitPunishmentFunctions.getSenderUUID(sender),
            BukkitPunishmentFunctions.parseReason(reason, "Unspecified"), Long.MAX_VALUE,

            DefaultActor(
                BukkitPunishmentFunctions.getExecutorFromSender(sender),
                ActorType.GAME)

        )

        val hasPunishment = gameProfile.hasActivePunishment(PunishmentType.BLACKLIST)

        if (hasPunishment)
        {
            sender.sendMessage(Chat.format("&cPlayer is already blacklisted!"))
            return
        }

        BukkitPunishmentFunctions.dispatch(punishment, BukkitPunishmentFunctions.isSilent(reason))

    }

}