package X;

/* renamed from: X.6QY  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass6QY {
    public static long A02(C161937ni r4, long j) {
        long j2 = C113625fq.A00;
        if (j == j2) {
            return AnonymousClass6X0.A01;
        }
        if (j != j2) {
            float Bvq = r4.Bvq(C90464aC.A01(j));
            if (j != j2) {
                long A0B = C90464aC.A0B(Bvq, r4.Bvq(C90464aC.A00(j)));
                long j3 = AnonymousClass6X0.A02;
                return A0B;
            }
            throw AnonymousClass001.A09("DpSize is unspecified");
        }
        throw AnonymousClass001.A09("DpSize is unspecified");
    }

    public static float A00(C161937ni r5, long j) {
        if (AnonymousClass6WI.A01(j) == 4294967296L) {
            return r5.Bvq(r5.Bvh(j));
        }
        throw AnonymousClass001.A09("Only Sp can convert to Px");
    }

    public static int A01(C161937ni r0, float f) {
        float Bvq = r0.Bvq(f);
        if (Float.isInfinite(Bvq)) {
            return Integer.MAX_VALUE;
        }
        return C14960mT.A01(Bvq);
    }
}
