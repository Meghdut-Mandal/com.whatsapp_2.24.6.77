package X;

/* renamed from: X.Aka  reason: case insensitive filesystem */
public final class C22312Aka extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ B63 $msg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22312Aka(B63 b63) {
        super(1);
        this.$msg = b63;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass90V r0;
        AnonymousClass88K r3 = (AnonymousClass88K) obj;
        AnonymousClass00C.A0D(r3, 0);
        r3.A04 = C165597tg.A0t(C165617ti.A0i(((C172608Om) this.$msg).uuid_));
        int i = ((C172608Om) this.$msg).state_;
        if (i == 0) {
            r0 = AnonymousClass90V.READY;
        } else if (i != 1) {
            r0 = AnonymousClass90V.UNRECOGNIZED;
        } else {
            r0 = AnonymousClass90V.MAIN;
        }
        r3.A02 = r0;
        return AnonymousClass0AJ.A00;
    }
}
