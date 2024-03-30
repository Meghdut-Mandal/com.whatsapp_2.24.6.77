package X;

/* renamed from: X.674  reason: invalid class name */
public final class AnonymousClass674 {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof AnonymousClass674)) {
                long j = this.A00;
                AnonymousClass674 r9 = (AnonymousClass674) obj;
                long j2 = r9.A00;
                long j3 = C133336Xx.A01;
                if (!(j == j2 && this.A01 == r9.A01 && this.A02 == r9.A02 && this.A03 == r9.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.A00;
        long j2 = C133336Xx.A01;
        return C36341k9.A02(this.A03, C36321k7.A00(this.A02, C36321k7.A00(this.A01, C90464aC.A08(j))));
    }

    public AnonymousClass674(long j, long j2, long j3, long j4) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = j3;
        this.A03 = j4;
    }
}
