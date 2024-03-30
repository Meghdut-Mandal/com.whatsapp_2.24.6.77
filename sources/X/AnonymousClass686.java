package X;

/* renamed from: X.686  reason: invalid class name */
public class AnonymousClass686 {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;

    public static long A00(int i, long j) {
        if (i == 0) {
            return 0;
        }
        return (((j - 1) / 1024) + 1) * 1024;
    }

    public C1040558c A01() {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        C1040558c r5 = new C1040558c();
        r5.A01 = C36371kC.A0n();
        r5.A00 = Integer.valueOf(AnonymousClass6UH.A01(this.A00, 0, false));
        Long l5 = this.A0C;
        if (l5 == null || (l4 = this.A0B) == null) {
            l = null;
        } else {
            l = C90484aE.A0i(l5, l4.longValue());
        }
        r5.A0B = l;
        Long l6 = this.A0A;
        if (l6 == null || (l3 = this.A09) == null) {
            l2 = null;
        } else {
            l2 = C90484aE.A0i(l6, l3.longValue());
        }
        r5.A02 = l2;
        r5.A09 = Long.valueOf(this.A07);
        r5.A0A = Long.valueOf(this.A08);
        r5.A06 = Long.valueOf(this.A04);
        long j = this.A01;
        r5.A03 = Long.valueOf(A00((j > 0 ? 1 : (j == 0 ? 0 : -1)), j));
        r5.A07 = Long.valueOf(this.A05);
        long j2 = this.A02;
        r5.A04 = Long.valueOf(A00((j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)), j2));
        r5.A08 = Long.valueOf(this.A06);
        long j3 = this.A03;
        r5.A05 = Long.valueOf(A00((j3 > 0 ? 1 : (j3 == 0 ? 0 : -1)), j3));
        return r5;
    }

    public String toString() {
        return A01().toString();
    }
}
