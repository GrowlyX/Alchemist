package ltd.matrixstudios.alchemist.service.expirable;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0002J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lltd/matrixstudios/alchemist/service/expirable/PunishmentService;", "Lltd/matrixstudios/alchemist/service/expirable/ExpiringService;", "Lltd/matrixstudios/alchemist/models/grant/types/Punishment;", "()V", "handler", "Lio/github/nosequel/data/store/StoreType;", "Ljava/util/UUID;", "getHandler", "()Lio/github/nosequel/data/store/StoreType;", "setHandler", "(Lio/github/nosequel/data/store/StoreType;)V", "clearOutModels", "", "getValues", "", "save", "punishment", "sortByActorType", "", "actorType", "Lltd/matrixstudios/alchemist/punishments/actor/ActorType;", "sortByPunishmentType", "punishmentType", "Lltd/matrixstudios/alchemist/punishments/PunishmentType;", "commons"})
public final class PunishmentService extends ltd.matrixstudios.alchemist.service.expirable.ExpiringService<ltd.matrixstudios.alchemist.models.grant.types.Punishment> {
    @org.jetbrains.annotations.NotNull()
    public static final ltd.matrixstudios.alchemist.service.expirable.PunishmentService INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static io.github.nosequel.data.store.StoreType<java.util.UUID, ltd.matrixstudios.alchemist.models.grant.types.Punishment> handler;
    
    private PunishmentService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.github.nosequel.data.store.StoreType<java.util.UUID, ltd.matrixstudios.alchemist.models.grant.types.Punishment> getHandler() {
        return null;
    }
    
    public final void setHandler(@org.jetbrains.annotations.NotNull()
    io.github.nosequel.data.store.StoreType<java.util.UUID, ltd.matrixstudios.alchemist.models.grant.types.Punishment> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Collection<ltd.matrixstudios.alchemist.models.grant.types.Punishment> getValues() {
        return null;
    }
    
    public final void save(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.alchemist.models.grant.types.Punishment punishment) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ltd.matrixstudios.alchemist.models.grant.types.Punishment> sortByActorType(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.alchemist.punishments.actor.ActorType actorType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ltd.matrixstudios.alchemist.models.grant.types.Punishment> sortByPunishmentType(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.alchemist.punishments.PunishmentType punishmentType) {
        return null;
    }
    
    @java.lang.Override()
    public void clearOutModels() {
    }
}