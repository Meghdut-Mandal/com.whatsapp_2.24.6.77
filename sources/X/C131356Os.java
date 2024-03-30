package X;

/* renamed from: X.6Os  reason: invalid class name and case insensitive filesystem */
public final class C131356Os {
    public static final long A01;
    public final long A00;

    static {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(Float.NaN);
        A01 = C90474aD.A0C(floatToRawIntBits, floatToRawIntBits);
    }

    public boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C131356Os) || j != ((C131356Os) obj).A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A00);
    }

    public String toString() {
        long j = this.A00;
        long j2 = A01;
        if (j == j2) {
            return "DpOffset.Unspecified";
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append('(');
        if (j != j2) {
            A0u.append(AnonymousClass72X.A00(C90464aC.A01(j)));
            C90504aG.A1M(A0u);
            if (j != j2) {
                return AnonymousClass000.A0m(AnonymousClass72X.A00(C90464aC.A00(j)), A0u);
            }
            throw AnonymousClass001.A09("DpOffset is unspecified");
        }
        throw AnonymousClass001.A09("DpOffset is unspecified");
    }

    public /* synthetic */ C131356Os(long j) {
        this.A00 = j;
    }
}
