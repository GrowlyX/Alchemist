package ltd.matrixstudios.alchemist.models.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\f\u0012\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0002\u0010\u0015J\u000e\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CJ\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H\u00c6\u0003J\t\u0010F\u001a\u00020\u0014H\u00c6\u0003J\t\u0010G\u001a\u00020\u0005H\u00c6\u0003J\t\u0010H\u001a\u00020\u0005H\u00c6\u0003J\t\u0010I\u001a\u00020\bH\u00c6\u0003J\t\u0010J\u001a\u00020\u0005H\u00c6\u0003J\u0019\u0010K\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\fH\u00c6\u0003J\u0019\u0010L\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\fH\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00a1\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\f2\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u00c6\u0001J\u000e\u0010P\u001a\u00020\u001f2\u0006\u0010Q\u001a\u00020RJ\u0013\u0010S\u001a\u00020A2\b\u0010T\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\b\u0010\u001a\u001a\u0004\u0018\u00010CJ\f\u0010U\u001a\b\u0012\u0004\u0012\u00020W0VJ\u0014\u0010U\u001a\b\u0012\u0004\u0012\u00020W0V2\u0006\u0010X\u001a\u00020YJ\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0VJ\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00000\u0012J\b\u0010]\u001a\u0004\u0018\u00010[J\b\u0010^\u001a\u0004\u0018\u00010_J*\u00106\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010A0`j\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010A`aJ\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012J\f\u0010c\u001a\b\u0012\u0004\u0012\u00020W0VJ\u0006\u0010d\u001a\u00020AJ\u000e\u0010e\u001a\u00020A2\u0006\u0010X\u001a\u00020YJ\t\u0010f\u001a\u00020gH\u00d6\u0001J\u0006\u0010h\u001a\u00020AJ\u0014\u0010i\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000k0jJ\t\u0010l\u001a\u00020\u0005H\u00d6\u0001R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R*\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000bj\b\u0012\u0004\u0012\u00020\u0003`\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010\'R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001b\"\u0004\b+\u0010\u001dR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001b\"\u0004\b1\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001b\"\u0004\b;\u0010\u001dR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?\u00a8\u0006m"}, d2 = {"Lltd/matrixstudios/alchemist/models/profile/GameProfile;", "", "uuid", "Ljava/util/UUID;", "username", "", "lowercasedUsername", "metadata", "Lcom/google/gson/JsonObject;", "ip", "friends", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "friendInvites", "activeColor", "Lltd/matrixstudios/alchemist/models/chatcolor/ChatColor;", "activePrefix", "permissions", "", "lastSeenAt", "", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/JsonObject;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Lltd/matrixstudios/alchemist/models/chatcolor/ChatColor;Ljava/lang/String;Ljava/util/List;J)V", "getActiveColor", "()Lltd/matrixstudios/alchemist/models/chatcolor/ChatColor;", "setActiveColor", "(Lltd/matrixstudios/alchemist/models/chatcolor/ChatColor;)V", "getActivePrefix", "()Ljava/lang/String;", "setActivePrefix", "(Ljava/lang/String;)V", "currentSession", "Lltd/matrixstudios/alchemist/models/sessions/Session;", "getCurrentSession", "()Lltd/matrixstudios/alchemist/models/sessions/Session;", "setCurrentSession", "(Lltd/matrixstudios/alchemist/models/sessions/Session;)V", "getFriendInvites", "()Ljava/util/ArrayList;", "setFriendInvites", "(Ljava/util/ArrayList;)V", "getFriends", "setFriends", "getIp", "setIp", "getLastSeenAt", "()J", "setLastSeenAt", "(J)V", "getLowercasedUsername", "setLowercasedUsername", "getMetadata", "()Lcom/google/gson/JsonObject;", "setMetadata", "(Lcom/google/gson/JsonObject;)V", "getPermissions", "()Ljava/util/List;", "setPermissions", "(Ljava/util/List;)V", "getUsername", "setUsername", "getUuid", "()Ljava/util/UUID;", "setUuid", "(Ljava/util/UUID;)V", "canUse", "", "tag", "Lltd/matrixstudios/alchemist/models/tags/Tag;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "createNewSession", "server", "Lltd/matrixstudios/alchemist/models/server/UniqueServer;", "equals", "other", "getActivePunishments", "", "Lltd/matrixstudios/alchemist/models/grant/types/Punishment;", "type", "Lltd/matrixstudios/alchemist/punishments/PunishmentType;", "getAllGrants", "Lltd/matrixstudios/alchemist/models/grant/types/RankGrant;", "getAltAccounts", "getCurrentGrant", "getCurrentRank", "Lltd/matrixstudios/alchemist/models/ranks/Rank;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getPermissionsAsList", "getPunishments", "hasActivePrefix", "hasActivePunishment", "hashCode", "", "isOnline", "supplyFriendsAsProfiles", "Ljava/util/concurrent/CompletableFuture;", "", "toString", "commons"})
public final class GameProfile {
    @org.jetbrains.annotations.NotNull()
    private java.util.UUID uuid;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String username;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String lowercasedUsername;
    @org.jetbrains.annotations.NotNull()
    private com.google.gson.JsonObject metadata;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String ip;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.util.UUID> friends;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.util.UUID> friendInvites;
    @org.jetbrains.annotations.Nullable()
    private ltd.matrixstudios.alchemist.models.chatcolor.ChatColor activeColor;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String activePrefix;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> permissions;
    private long lastSeenAt;
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Transient()
    private transient ltd.matrixstudios.alchemist.models.sessions.Session currentSession;
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.alchemist.models.profile.GameProfile copy(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String lowercasedUsername, @org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject metadata, @org.jetbrains.annotations.NotNull()
    java.lang.String ip, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.util.UUID> friends, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.util.UUID> friendInvites, @org.jetbrains.annotations.Nullable()
    ltd.matrixstudios.alchemist.models.chatcolor.ChatColor activeColor, @org.jetbrains.annotations.Nullable()
    java.lang.String activePrefix, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> permissions, long lastSeenAt) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public GameProfile(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String lowercasedUsername, @org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject metadata, @org.jetbrains.annotations.NotNull()
    java.lang.String ip, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.util.UUID> friends, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.util.UUID> friendInvites, @org.jetbrains.annotations.Nullable()
    ltd.matrixstudios.alchemist.models.chatcolor.ChatColor activeColor, @org.jetbrains.annotations.Nullable()
    java.lang.String activePrefix, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> permissions, long lastSeenAt) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getUuid() {
        return null;
    }
    
    public final void setUuid(@org.jetbrains.annotations.NotNull()
    java.util.UUID p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUsername() {
        return null;
    }
    
    public final void setUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLowercasedUsername() {
        return null;
    }
    
    public final void setLowercasedUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.JsonObject component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.JsonObject getMetadata() {
        return null;
    }
    
    public final void setMetadata(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIp() {
        return null;
    }
    
    public final void setIp(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.util.UUID> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.util.UUID> getFriends() {
        return null;
    }
    
    public final void setFriends(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.util.UUID> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.util.UUID> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.util.UUID> getFriendInvites() {
        return null;
    }
    
    public final void setFriendInvites(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.util.UUID> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ltd.matrixstudios.alchemist.models.chatcolor.ChatColor component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ltd.matrixstudios.alchemist.models.chatcolor.ChatColor getActiveColor() {
        return null;
    }
    
    public final void setActiveColor(@org.jetbrains.annotations.Nullable()
    ltd.matrixstudios.alchemist.models.chatcolor.ChatColor p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getActivePrefix() {
        return null;
    }
    
    public final void setActivePrefix(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getPermissions() {
        return null;
    }
    
    public final void setPermissions(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    public final long component11() {
        return 0L;
    }
    
    public final long getLastSeenAt() {
        return 0L;
    }
    
    public final void setLastSeenAt(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ltd.matrixstudios.alchemist.models.sessions.Session getCurrentSession() {
        return null;
    }
    
    public final void setCurrentSession(@org.jetbrains.annotations.Nullable()
    ltd.matrixstudios.alchemist.models.sessions.Session p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Collection<ltd.matrixstudios.alchemist.models.grant.types.Punishment> getPunishments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Collection<ltd.matrixstudios.alchemist.models.grant.types.Punishment> getActivePunishments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ltd.matrixstudios.alchemist.models.profile.GameProfile> getAltAccounts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.alchemist.models.sessions.Session createNewSession(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.alchemist.models.server.UniqueServer server) {
        return null;
    }
    
    public final boolean hasActivePrefix() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ltd.matrixstudios.alchemist.models.tags.Tag getActivePrefix() {
        return null;
    }
    
    public final boolean canUse(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.alchemist.models.tags.Tag tag) {
        return false;
    }
    
    public final boolean isOnline() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.util.List<ltd.matrixstudios.alchemist.models.profile.GameProfile>> supplyFriendsAsProfiles() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Collection<ltd.matrixstudios.alchemist.models.grant.types.Punishment> getActivePunishments(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.alchemist.punishments.PunishmentType type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Collection<ltd.matrixstudios.alchemist.models.grant.types.RankGrant> getAllGrants() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getPermissionsAsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, java.lang.Boolean> getPermissions() {
        return null;
    }
    
    public final boolean hasActivePunishment(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.alchemist.punishments.PunishmentType type) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ltd.matrixstudios.alchemist.models.grant.types.RankGrant getCurrentGrant() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ltd.matrixstudios.alchemist.models.ranks.Rank getCurrentRank() {
        return null;
    }
}