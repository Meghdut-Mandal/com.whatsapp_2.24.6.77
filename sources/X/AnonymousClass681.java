package X;

/* renamed from: X.681  reason: invalid class name */
public class AnonymousClass681 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public C61243Bc A06;
    public String A07 = "";
    public String A08 = "";
    public boolean A09;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass681)) {
            return false;
        }
        AnonymousClass681 r4 = (AnonymousClass681) obj;
        return this.A00 == r4.A00 && this.A01 == r4.A01 && C1901797e.A00(this.A06, r4.A06) && C1901797e.A00(this.A07, r4.A07) && this.A02 == r4.A02 && this.A03 == r4.A03 && this.A04 == r4.A04 && this.A05 == r4.A05 && this.A08.equals(r4.A08) && this.A09 == r4.A09;
    }

    public int hashCode() {
        Object[] objArr = new Object[10];
        AnonymousClass000.A1J(objArr, this.A00);
        AnonymousClass000.A1K(objArr, this.A01);
        objArr[2] = this.A06;
        objArr[3] = this.A07;
        C36341k9.A1U(objArr, this.A02);
        C36371kC.A1S(objArr, this.A03);
        C36381kD.A1T(objArr, this.A04);
        C36361kB.A1V(objArr, this.A05);
        objArr[8] = this.A08;
        return AnonymousClass000.A0M(Boolean.valueOf(this.A09), objArr, 9);
    }
}
