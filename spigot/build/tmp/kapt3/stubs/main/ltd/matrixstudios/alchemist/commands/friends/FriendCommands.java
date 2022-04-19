package ltd.matrixstudios.alchemist.commands.friends;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lltd/matrixstudios/alchemist/commands/friends/FriendCommands;", "Lco/aikar/commands/BaseCommand;", "()V", "add", "", "player", "Lorg/bukkit/entity/Player;", "gameProfile", "Lltd/matrixstudios/alchemist/models/profile/GameProfile;", "spigot"})
@co.aikar.commands.annotation.CommandAlias(value = "friend|f")
public final class FriendCommands extends co.aikar.commands.BaseCommand {
    
    public FriendCommands() {
        super();
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "add")
    public final void add(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @org.jetbrains.annotations.NotNull()
    @co.aikar.commands.annotation.Name(value = "target")
    ltd.matrixstudios.alchemist.models.profile.GameProfile gameProfile) {
    }
}