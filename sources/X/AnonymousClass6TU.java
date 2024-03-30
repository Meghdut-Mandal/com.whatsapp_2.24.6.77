package X;

/* renamed from: X.6TU  reason: invalid class name */
public final class AnonymousClass6TU {
    public static final long A01 = C90484aE.A0J(0, 0);
    public final long A00;

    public boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof AnonymousClass6TU) || j != ((AnonymousClass6TU) obj).A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A00);
    }

    public String toString() {
        long j = this.A00;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append('(');
        A0u.append(C90494aF.A08(j));
        C90504aG.A1M(A0u);
        return C36321k7.A0G(A0u, C90474aD.A03(j));
    }

    public /* synthetic */ AnonymousClass6TU(long j) {
        this.A00 = j;
    }
}
