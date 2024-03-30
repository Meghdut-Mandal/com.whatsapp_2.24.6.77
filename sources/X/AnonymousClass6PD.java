package X;

/* renamed from: X.6PD  reason: invalid class name */
public final class AnonymousClass6PD {
    public static final AnonymousClass6PD A03 = new AnonymousClass6PD(0.0f, 4278190080L << 32, C133206Xf.A03);
    public final float A00;
    public final long A01;
    public final long A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6PD) {
                long j = this.A01;
                AnonymousClass6PD r9 = (AnonymousClass6PD) obj;
                long j2 = r9.A01;
                long j3 = C133336Xx.A01;
                if (j == j2) {
                    long j4 = this.A02;
                    long j5 = r9.A02;
                    long j6 = C133206Xf.A03;
                    if (!(j4 == j5 && this.A00 == r9.A00)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.A01;
        long j2 = C133336Xx.A01;
        int A08 = C90464aC.A08(j);
        long j3 = this.A02;
        long j4 = C133206Xf.A03;
        return C90514aH.A0C(C36321k7.A00(j3, A08), this.A00);
    }

    public AnonymousClass6PD(float f, long j, long j2) {
        this.A01 = j;
        this.A02 = j2;
        this.A00 = f;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Shadow(color=");
        C90484aE.A1J(A0u, this.A01);
        A0u.append(", offset=");
        A0u.append(C133206Xf.A04(this.A02));
        A0u.append(", blurRadius=");
        return C90464aC.A0g(A0u, this.A00);
    }

    static {
        long j = C133336Xx.A01;
    }
}
