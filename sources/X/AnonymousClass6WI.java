package X;

/* renamed from: X.6WI  reason: invalid class name */
public final class AnonymousClass6WI {
    public static final long A01 = AnonymousClass6U3.A01(Float.NaN, 0);
    public static final AnonymousClass68V[] A02 = {new AnonymousClass68V(0), new AnonymousClass68V(4294967296L), new AnonymousClass68V(8589934592L)};
    public final long A00;

    public static final long A01(long j) {
        return A02[C90514aH.A0D(j & 1095216660480L)].A00;
    }

    public boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof AnonymousClass6WI) || j != ((AnonymousClass6WI) obj).A00) {
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

    public /* synthetic */ AnonymousClass6WI(long j) {
        this.A00 = j;
    }

    public static final float A00(long j) {
        return C90464aC.A00(j);
    }

    public static String A02(long j) {
        StringBuilder A0u;
        String str;
        long A012 = A01(j);
        if (A012 == 0) {
            return "Unspecified";
        }
        if (A012 == 4294967296L) {
            A0u = AnonymousClass000.A0u();
            A0u.append(C90464aC.A00(j));
            str = ".sp";
        } else if (A012 != 8589934592L) {
            return "Invalid";
        } else {
            A0u = AnonymousClass000.A0u();
            A0u.append(C90464aC.A00(j));
            str = ".em";
        }
        return AnonymousClass000.A0q(str, A0u);
    }
}
