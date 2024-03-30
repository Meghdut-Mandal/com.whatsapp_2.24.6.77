package X;

/* renamed from: X.6Xf  reason: invalid class name and case insensitive filesystem */
public final class C133206Xf {
    public static final long A01 = C90464aC.A0B(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final long A02 = C90464aC.A0B(Float.NaN, Float.NaN);
    public static final long A03 = C90464aC.A0B(0.0f, 0.0f);
    public final long A00;

    public static final float A00(long j) {
        if (j != A02) {
            return C90464aC.A01(j);
        }
        throw AnonymousClass001.A09("Offset is unspecified");
    }

    public static final float A01(long j) {
        if (j != A02) {
            return C90464aC.A00(j);
        }
        throw AnonymousClass001.A09("Offset is unspecified");
    }

    public static String A04(long j) {
        if (j == A02) {
            return "Offset.Unspecified";
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Offset(");
        C90474aD.A1L(A0u, AnonymousClass5WR.A00(A00(j)));
        return C36321k7.A0E(AnonymousClass5WR.A00(A01(j)), A0u);
    }

    public boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C133206Xf) || j != ((C133206Xf) obj).A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A00);
    }

    public String toString() {
        return A04(this.A00);
    }

    public /* synthetic */ C133206Xf(long j) {
        this.A00 = j;
    }

    public static final long A02(long j, long j2) {
        return C90464aC.A0B(A00(j) - A00(j2), A01(j) - A01(j2));
    }

    public static final long A03(long j, long j2) {
        return C90464aC.A0B(A00(j) + A00(j2), A01(j) + A01(j2));
    }
}
