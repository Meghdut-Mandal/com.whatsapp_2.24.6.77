package X;

/* renamed from: X.3TT  reason: invalid class name */
public class AnonymousClass3TT {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C80113ur A04;
    public C80113ur A05;
    public String A06;
    public String A07;
    public boolean A08;

    public static AnonymousClass3TT A00(AnonymousClass3L0 r2) {
        AnonymousClass3TT r1 = new AnonymousClass3TT();
        r1.A01 = r2.A03;
        r1.A06 = r2.A08;
        r1.A04 = r2.A00();
        r1.A00 = AnonymousClass3U1.A00(r2);
        return r1;
    }

    public static AnonymousClass3TT A01(AnonymousClass3L0 r2) {
        AnonymousClass3TT r1 = new AnonymousClass3TT();
        r1.A03 = r2.A03;
        r1.A07 = r2.A08;
        r1.A05 = r2.A00();
        r1.A02 = AnonymousClass3U1.A00(r2);
        return r1;
    }

    public AnonymousClass3H2 A02() {
        int i = this.A03;
        int i2 = this.A01;
        String str = this.A07;
        String str2 = this.A06;
        return new AnonymousClass3H2(this.A05, this.A04, str, str2, i, i2, this.A02, this.A00, this.A08);
    }

    public AnonymousClass3TT(AnonymousClass3H2 r3) {
        this.A03 = 0;
        this.A01 = 0;
        this.A07 = null;
        this.A06 = null;
        this.A05 = null;
        this.A04 = null;
        this.A08 = false;
        this.A02 = 1;
        this.A00 = 1;
        this.A03 = r3.A03;
        this.A01 = r3.A01;
        this.A07 = r3.A07;
        this.A06 = r3.A06;
        this.A05 = r3.A05;
        this.A04 = r3.A04;
        this.A08 = r3.A08;
        this.A02 = r3.A02;
        this.A00 = r3.A00;
    }

    public AnonymousClass3TT(C80113ur r2, C80113ur r3, String str, String str2, int i, int i2, int i3, int i4) {
        this.A08 = false;
        this.A03 = i;
        this.A01 = i2;
        this.A07 = str;
        this.A06 = str2;
        this.A05 = r2;
        this.A04 = r3;
        this.A02 = i3;
        this.A00 = i4;
    }

    public AnonymousClass3TT() {
        this.A03 = 0;
        this.A01 = 0;
        this.A07 = null;
        this.A06 = null;
        this.A05 = null;
        this.A04 = null;
        this.A08 = false;
        this.A02 = 1;
        this.A00 = 1;
    }
}
