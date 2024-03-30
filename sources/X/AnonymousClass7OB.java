package X;

/* renamed from: X.7OB  reason: invalid class name */
public final class AnonymousClass7OB extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C162907pL $stickerObserver;
    public final /* synthetic */ AnonymousClass1BB $stickerObservers;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7OB(C162907pL r2, AnonymousClass1BB r3) {
        super(0);
        this.$stickerObservers = r3;
        this.$stickerObserver = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        this.$stickerObservers.unregisterObserver(this.$stickerObserver);
        return AnonymousClass0AJ.A00;
    }
}
