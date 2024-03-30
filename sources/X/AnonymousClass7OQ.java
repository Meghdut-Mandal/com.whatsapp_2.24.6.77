package X;

/* renamed from: X.7OQ  reason: invalid class name */
public final class AnonymousClass7OQ extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass00S $boundsProvider;
    public final /* synthetic */ C160787la $childCoordinates;
    public final /* synthetic */ C93484gd this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7OQ(C93484gd r2, C160787la r3, AnonymousClass00S r4) {
        super(0);
        this.this$0 = r2;
        this.$childCoordinates = r3;
        this.$boundsProvider = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass6QC A00 = C93484gd.A00(this.this$0, this.$childCoordinates, this.$boundsProvider);
        if (A00 == null) {
            return null;
        }
        C94264hv r5 = (C94264hv) this.this$0.A00;
        long j = r5.A00;
        if (j == 0) {
            throw AnonymousClass001.A09("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        long A01 = C94264hv.A01(r5, A00, j);
        return A00.A02(C90464aC.A0B(-C133206Xf.A00(A01), -C133206Xf.A01(A01)));
    }
}
