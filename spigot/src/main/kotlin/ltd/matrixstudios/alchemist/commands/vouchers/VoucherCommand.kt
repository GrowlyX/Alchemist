package ltd.matrixstudios.alchemist.commands.vouchers

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Default
import co.aikar.commands.annotation.Name
import co.aikar.commands.annotation.Subcommand
import ltd.matrixstudios.alchemist.api.AlchemistAPI
import ltd.matrixstudios.alchemist.models.profile.GameProfile
import ltd.matrixstudios.alchemist.models.vouchers.VoucherGrant
import ltd.matrixstudios.alchemist.models.vouchers.VoucherTemplate
import ltd.matrixstudios.alchemist.punishment.BukkitPunishmentFunctions
import ltd.matrixstudios.alchemist.service.vouchers.VoucherService
import ltd.matrixstudios.alchemist.util.Chat
import ltd.matrixstudios.alchemist.util.TimeUtil
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import java.util.*

@CommandAlias("voucher|vouchers")
@CommandPermission("alchemist.vouchers.admin")
class VoucherCommand : BaseCommand() {

    @Default
    fun openMenu(player: Player) {
        VoucherGrantsMenu(player, VoucherService.allGrantsFromPlayer(player.uniqueId)).updateMenu()
    }

    @Subcommand("template setprize")
    fun create(sender: CommandSender, @Name("id")id: String, @Name("prize")prize: String) {
        val template = VoucherService.findVoucherTemplate(id.lowercase())

        if (template == null) {
            sender.sendMessage(Chat.format("&cA voucher with this id does not exist"))
            return
        }

        template.whatFor = Chat.format(prize)
        VoucherService.insertTemplate(template)
        sender.sendMessage(Chat.format("&aSet the prize of &f$id &ato &f$prize"))
    }

    @Subcommand("issue")
    fun issue(sender: CommandSender, @Name("id")id: String, @Name("target")target: GameProfile, @Name("duration")duration: String) {
        val template = VoucherService.findVoucherTemplate(id.lowercase())
        if (template == null) {
            sender.sendMessage(Chat.format("&cA voucher with this id does not exist"))
            return
        }
        val grant = VoucherGrant(UUID.randomUUID(), template, false, System.currentTimeMillis(), false, BukkitPunishmentFunctions.getSenderUUID(sender), target.uuid)
        VoucherService.insertGrant(target.uuid, grant)
        sender.sendMessage(Chat.format("&aIssued a new voucher grant to " + AlchemistAPI.getRankDisplay(target.uuid)))
    }

    @Subcommand("template create")
    fun create(sender: CommandSender, @Name("id")id: String) {
        val template = VoucherService.findVoucherTemplate(id.lowercase())

        if (template != null) {
            sender.sendMessage(Chat.format("&cA voucher with this id already exists"))
            return
        }

        val toCreate = VoucherTemplate(id.lowercase(), id, "", mutableListOf())
        VoucherService.insertTemplate(toCreate)
        sender.sendMessage(Chat.format("&aCreated a new voucher template with the name &f$id"))
    }

    @Subcommand("template delete")
    fun delete(sender: CommandSender, @Name("id")id: String) {
        val template = VoucherService.findVoucherTemplate(id.lowercase())

        if (template == null) {
            sender.sendMessage(Chat.format("&cA voucher with this id does not exist"))
            return
        }

        VoucherService.handlerTemplates.deleteAsync(template.id)
        VoucherService.voucherTemplates.remove(template.id)

        sender.sendMessage(Chat.format("&aDeleted a voucher template with the name &f$id"))
    }
}