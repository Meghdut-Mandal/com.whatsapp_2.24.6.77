package X;

/* renamed from: X.6GH  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass6GH {
    public static long A01(C158887iP r3, float f) {
        float BC0;
        C158897iQ A00;
        AnonymousClass6MB r2 = AnonymousClass6MB.A01;
        if (r3.BC0() < AnonymousClass6MB.A00 || C90474aD.A1U(C112535e3.A00) || (A00 = r2.A00(r3.BC0())) == null) {
            BC0 = f / r3.BC0();
        } else {
            BC0 = A00.B3e(f);
        }
        return AnonymousClass6U3.A01(BC0, 4294967296L);
    }

    public static float A00(C158887iP r5, long j) {
        float f;
        if (AnonymousClass6WI.A01(j) == 4294967296L) {
            AnonymousClass6MB r2 = AnonymousClass6MB.A01;
            if (r5.BC0() < AnonymousClass6MB.A00 || C90474aD.A1U(C112535e3.A00)) {
                f = C90464aC.A00(j);
            } else {
                C158897iQ A00 = r2.A00(r5.BC0());
                f = C90464aC.A00(j);
                if (A00 != null) {
                    return A00.B3f(f);
                }
            }
            return f * r5.BC0();
        }
        throw AnonymousClass001.A09("Only Sp can convert to Px");
    }
}
