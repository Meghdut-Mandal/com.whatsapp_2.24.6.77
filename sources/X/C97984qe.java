package X;

/* renamed from: X.4qe  reason: invalid class name and case insensitive filesystem */
public final class C97984qe extends C53062qe {
    public final int A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C97984qe) {
                C97984qe r8 = (C97984qe) obj;
                if (!(this.A00 == r8.A00 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36341k9.A02(this.A01, this.A00 * 31);
    }

    public C97984qe(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }
}
