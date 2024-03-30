package X;

/* renamed from: X.Aof  reason: case insensitive filesystem */
public final class C22554Aof extends AnonymousClass00R implements C009003v {
    public static final C22554Aof A00 = new C22554Aof();

    public C22554Aof() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C184068rq r8 = (C184068rq) obj;
        C184068rq r9 = (C184068rq) obj2;
        boolean A1a = C36341k9.A1a(r8, r9);
        long A0B = C165587tf.A0B(((C184328sG) r8.A00).A04);
        long A0B2 = C165587tf.A0B(((C184328sG) r9.A00).A04);
        if (A0B < A0B2) {
            return C90494aF.A0U();
        }
        if (A0B > A0B2) {
            return Integer.valueOf(A1a ? 1 : 0);
        }
        return 0;
    }
}
