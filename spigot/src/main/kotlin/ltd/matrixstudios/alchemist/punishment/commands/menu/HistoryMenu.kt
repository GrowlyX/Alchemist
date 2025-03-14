package ltd.matrixstudios.alchemist.punishment.commands.menu

import ltd.matrixstudios.alchemist.api.AlchemistAPI
import ltd.matrixstudios.alchemist.models.profile.GameProfile
import ltd.matrixstudios.alchemist.punishments.PunishmentType
import ltd.matrixstudios.alchemist.util.Chat
import ltd.matrixstudios.alchemist.util.menu.Button
import ltd.matrixstudios.alchemist.util.menu.Menu
import org.bukkit.entity.Player

class HistoryMenu(var gameprofile: GameProfile, var player: Player) : Menu(player) {

    init {
        staticSize = 27
        placeholder = true
    }
    override fun getButtons(player: Player): MutableMap<Int, Button> {
        val buttons = hashMapOf<Int, Button>()

        buttons[9] = HistoryPlaceholderButton(PunishmentType.WARN, gameprofile)
        buttons[11] = HistoryPlaceholderButton(PunishmentType.MUTE, gameprofile)
        buttons[13] = HistoryPlaceholderButton(PunishmentType.GHOST_MUTE, gameprofile)
        buttons[15] = HistoryPlaceholderButton(PunishmentType.BAN, gameprofile)
        buttons[17] = HistoryPlaceholderButton(PunishmentType.BLACKLIST, gameprofile)

        return buttons
    }

    override fun getTitle(player: Player): String {
        return Chat.format(AlchemistAPI.getRankDisplay(gameprofile.uuid))
    }
}