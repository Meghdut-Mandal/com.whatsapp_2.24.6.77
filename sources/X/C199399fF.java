package X;

/* renamed from: X.9fF  reason: invalid class name and case insensitive filesystem */
public final class C199399fF {
    public static final C199399fF A02 = new C199399fF(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final C199399fF A03;
    public static final C199399fF A04;
    public static final C199399fF A05 = new C199399fF(0, Long.MAX_VALUE);
    public static final C199399fF A06 = new C199399fF(Long.MAX_VALUE, 0);
    public final long A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C199399fF r7 = (C199399fF) obj;
            if (!(this.A01 == r7.A01 && this.A00 == r7.A00)) {
                return false;
            }
        }
        return true;
    }

    static {
        C199399fF r5 = new C199399fF(0, 0);
        A04 = r5;
        A03 = r5;
    }

    public int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public C199399fF(long j, long j2) {
        boolean z = true;
        C200319h9.A01(C36401kF.A1U((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        C200319h9.A01(j2 < 0 ? false : z);
        this.A01 = j;
        this.A00 = j2;
    }
}
