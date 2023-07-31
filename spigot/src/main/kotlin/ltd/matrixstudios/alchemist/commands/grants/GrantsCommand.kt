package ltd.matrixstudios.alchemist.commands.grants

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandCompletion
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import ltd.matrixstudios.alchemist.commands.grants.menu.grants.GrantsMenu
import ltd.matrixstudios.alchemist.commands.grants.menu.grants.filter.GrantFilter
import ltd.matrixstudios.alchemist.models.grant.types.RankGrant
import ltd.matrixstudios.alchemist.models.profile.GameProfile
import ltd.matrixstudios.alchemist.profiles.AsyncGameProfile
import ltd.matrixstudios.alchemist.profiles.getCurrentRank
import ltd.matrixstudios.alchemist.service.expirable.RankGrantService
import ltd.matrixstudios.alchemist.util.Chat
import org.bukkit.entity.Player

object GrantsCommand : BaseCommand() {

    @CommandAlias("grants")
    @CommandPermission("alchemist.grants.admin")
    @CommandCompletion("@gameprofile")
    fun grants(player: Player, @Name("target")gameProfile: AsyncGameProfile)
    {
        gameProfile.use(player) {
            val all = RankGrantService.getFromCache(it.uuid).toMutableList()
            val grants = this.getViewableGrants(player, all)

            if (!player.hasPermission("alchemist.grants.admin.viewAll") && all.isNotEmpty() && grants.isEmpty())
            {
                player.sendMessage(Chat.format("&cThis player has grants in which you are unable to see due to your rank"))
            }

            if (grants.isEmpty())
            {
                player.sendMessage(Chat.format("&cThe user &e${it.username} &chas no visible grants!"))
                return@use
            }

            GrantsMenu(
                player,
                it,
                grants,
                GrantFilter.ALL
            ).updateMenu()
        }
    }

    fun getViewableGrants(player: Player, grants: MutableList<RankGrant>) : MutableList<RankGrant>
    {
        if (!player.hasPermission("alchemist.grants.admin.viewAll"))
        {
            return grants.filter {
                it.getGrantable().weight <= player.getCurrentRank().weight
            }.toMutableList()
        }

        return grants
    }
}