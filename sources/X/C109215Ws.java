package X;

/* renamed from: X.5Ws  reason: invalid class name and case insensitive filesystem */
public abstract class C109215Ws {
    public static final int A00(long j, long j2) {
        boolean A1P = AnonymousClass000.A1P((int) (j & 4294967295L));
        if (A1P == AnonymousClass000.A1P((int) (j2 & 4294967295L))) {
            return (int) Math.signum(C90494aF.A03(j) - C90494aF.A03(j2));
        }
        if (A1P) {
            return -1;
        }
        return 1;
    }
}
