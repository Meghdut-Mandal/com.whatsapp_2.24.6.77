package X;

/* renamed from: X.6Wz  reason: invalid class name and case insensitive filesystem */
public final class C133156Wz {
    public static final long A01 = C90464aC.A0B(0.0f, 0.0f);
    public final long A00;

    public boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C133156Wz) || j != ((C133156Wz) obj).A00) {
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
        A0u.append(C90464aC.A01(j));
        C90504aG.A1M(A0u);
        A0u.append(C90464aC.A00(j));
        return AnonymousClass000.A0q(") px/sec", A0u);
    }

    public /* synthetic */ C133156Wz(long j) {
        this.A00 = j;
    }

    public static final long A00(long j, long j2) {
        return C90464aC.A0B(C90494aF.A03(j) - C90494aF.A03(j2), C90464aC.A00(j) - C90464aC.A00(j2));
    }

    public static final long A01(long j, long j2) {
        return C90464aC.A0B(C90494aF.A03(j) + C90494aF.A03(j2), C90464aC.A00(j) + C90464aC.A00(j2));
    }
}
