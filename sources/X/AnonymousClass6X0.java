package X;

/* renamed from: X.6X0  reason: invalid class name */
public final class AnonymousClass6X0 {
    public static final long A01 = C90464aC.A0B(Float.NaN, Float.NaN);
    public static final long A02 = C90464aC.A0B(0.0f, 0.0f);
    public final long A00;

    public static final float A00(long j) {
        if (j != A01) {
            return C90464aC.A00(j);
        }
        throw AnonymousClass001.A09("Size is unspecified");
    }

    public static final float A01(long j) {
        if (j != A01) {
            return C90464aC.A01(j);
        }
        throw AnonymousClass001.A09("Size is unspecified");
    }

    public static String A02(long j) {
        if (j == A01) {
            return "Size.Unspecified";
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Size(");
        C90474aD.A1L(A0u, AnonymousClass5WR.A00(A01(j)));
        return C36321k7.A0E(AnonymousClass5WR.A00(A00(j)), A0u);
    }

    public boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof AnonymousClass6X0) || j != ((AnonymousClass6X0) obj).A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A00);
    }

    public String toString() {
        return A02(this.A00);
    }

    public /* synthetic */ AnonymousClass6X0(long j) {
        this.A00 = j;
    }

    public static final boolean A03(long j) {
        if (A01(j) <= 0.0f || A00(j) <= 0.0f) {
            return true;
        }
        return false;
    }
}
