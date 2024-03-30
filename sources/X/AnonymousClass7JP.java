package X;

/* renamed from: X.7JP  reason: invalid class name */
public final class AnonymousClass7JP extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C123035vp this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7JP(C123035vp r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C129986Jg r0 = this.this$0.A00;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass001.A09("Trying to access the LayoutCache from outside a layout call");
    }
}
