package X;

/* renamed from: X.4L0  reason: invalid class name */
public final class AnonymousClass4L0 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C203399nx $queryNode;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4L0(C203399nx r2) {
        super(1);
        this.$queryNode = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int A0I = AnonymousClass000.A0I(obj);
        C203399nx[] r0 = this.$queryNode.A02;
        if (r0 != null) {
            return r0[A0I];
        }
        return null;
    }
}
