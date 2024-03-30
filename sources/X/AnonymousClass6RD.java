package X;

/* renamed from: X.6RD  reason: invalid class name */
public abstract class AnonymousClass6RD {
    public static final long A00 = C90464aC.A0B(0.0f, 0.0f);

    public static String A00(long j) {
        float A01 = C90464aC.A01(j);
        float A002 = C90464aC.A00(j);
        boolean A1Q = AnonymousClass000.A1Q((A01 > A002 ? 1 : (A01 == A002 ? 0 : -1)));
        StringBuilder A0u = AnonymousClass000.A0u();
        if (A1Q) {
            A0u.append("CornerRadius.circular(");
        } else {
            A0u.append("CornerRadius.elliptical(");
            C90474aD.A1L(A0u, AnonymousClass5WR.A00(A01));
            A01 = A002;
        }
        AnonymousClass5WR.A01(A0u, A01);
        return AnonymousClass000.A0t(A0u, ')');
    }
}
