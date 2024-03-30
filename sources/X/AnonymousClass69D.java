package X;

/* renamed from: X.69D  reason: invalid class name */
public final class AnonymousClass69D {
    public final long A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass69D) {
                long j = this.A01;
                AnonymousClass69D r9 = (AnonymousClass69D) obj;
                long j2 = r9.A01;
                long j3 = C133336Xx.A01;
                if (!(j == j2 && this.A00 == r9.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.A01;
        long j2 = C133336Xx.A01;
        return C36341k9.A02(this.A00, C90464aC.A08(j));
    }

    public AnonymousClass69D(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SelectionColors(selectionHandleColor=");
        C90484aE.A1J(A0u, this.A01);
        A0u.append(", selectionBackgroundColor=");
        return AnonymousClass000.A0m(C133336Xx.A07(this.A00), A0u);
    }
}
