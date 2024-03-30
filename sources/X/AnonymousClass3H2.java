package X;

/* renamed from: X.3H2  reason: invalid class name */
public class AnonymousClass3H2 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C80113ur A04;
    public final C80113ur A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass3H2 r5 = (AnonymousClass3H2) obj;
            if (!(this.A03 == r5.A03 && this.A01 == r5.A01 && this.A08 == r5.A08 && this.A02 == r5.A02 && this.A00 == r5.A00 && C1901797e.A00(this.A07, r5.A07) && C1901797e.A00(this.A06, r5.A06) && C1901797e.A00(this.A05, r5.A05) && C1901797e.A00(this.A04, r5.A04))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[9];
        AnonymousClass000.A1J(objArr, this.A03);
        AnonymousClass000.A1K(objArr, this.A01);
        objArr[2] = this.A07;
        objArr[3] = this.A06;
        objArr[4] = this.A05;
        objArr[5] = this.A04;
        objArr[6] = Boolean.valueOf(this.A08);
        C36361kB.A1V(objArr, this.A02);
        return AnonymousClass000.A0M(Integer.valueOf(this.A00), objArr, 8);
    }

    public AnonymousClass3H2(C80113ur r1, C80113ur r2, String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        this.A03 = i;
        this.A01 = i2;
        this.A07 = str;
        this.A06 = str2;
        this.A05 = r1;
        this.A04 = r2;
        this.A08 = z;
        this.A02 = i3;
        this.A00 = i4;
    }
}
