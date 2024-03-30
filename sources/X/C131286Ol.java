package X;

/* renamed from: X.6Ol  reason: invalid class name and case insensitive filesystem */
public final class C131286Ol {
    public final long A00;

    public boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C131286Ol) || j != ((C131286Ol) obj).A00) {
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
        A0u.append(C90494aF.A08(j));
        A0u.append(" x ");
        return C36381kD.A10(A0u, C90474aD.A03(j));
    }

    public /* synthetic */ C131286Ol(long j) {
        this.A00 = j;
    }
}
