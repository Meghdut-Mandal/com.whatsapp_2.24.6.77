package X;

/* renamed from: X.7O9  reason: invalid class name */
public final class AnonymousClass7O9 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C162907pL $observer;
    public final /* synthetic */ C124575yQ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7O9(C162907pL r2, C124575yQ r3) {
        super(0);
        this.this$0 = r3;
        this.$observer = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        this.this$0.A01.unregisterObserver(this.$observer);
        return AnonymousClass0AJ.A00;
    }
}
