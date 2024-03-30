package X;

/* renamed from: X.7RF  reason: invalid class name */
public final class AnonymousClass7RF extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C130536Ll this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7RF(C130536Ll r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C130536Ll r1 = this.this$0;
        if (!r1.A03) {
            synchronized (r1.A05) {
                C130596Lr r4 = r1.A02;
                AnonymousClass00C.A0B(r4);
                Object obj2 = r4.A03;
                AnonymousClass00C.A0B(obj2);
                int i = r4.A00;
                AnonymousClass0G9 r12 = r4.A02;
                if (r12 == null) {
                    r12 = new AnonymousClass0G9(6);
                    r4.A02 = r12;
                    r4.A04.A08(obj2, r12);
                }
                C130596Lr.A00(r12, r4, obj, obj2, i);
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
