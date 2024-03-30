package X;

import java.util.List;

/* renamed from: X.9Uj  reason: invalid class name and case insensitive filesystem */
public class C195459Uj {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C61243Bc A04;
    public C61243Bc A05;
    public C61243Bc A06;
    public C61243Bc A07;
    public C61243Bc A08;
    public String A09 = "";
    public List A0A = AnonymousClass001.A0I();
    public List A0B = AnonymousClass001.A0I();
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C195459Uj r5 = (C195459Uj) obj;
            if (this.A00 != r5.A00 || this.A01 != r5.A01 || this.A02 != r5.A02 || this.A0C != r5.A0C || this.A0D != r5.A0D || this.A0E != r5.A0E || !C1901797e.A00(this.A07, r5.A07) || !C1901797e.A00(this.A0A, r5.A0A) || !C1901797e.A00(this.A05, r5.A05) || !C1901797e.A00(this.A04, r5.A04) || !C1901797e.A00(this.A0B, r5.A0B) || !C1901797e.A00(this.A06, r5.A06) || !C1901797e.A00(this.A08, r5.A08) || !C1901797e.A00(this.A09, r5.A09) || this.A03 != r5.A03 || this.A0F != r5.A0F) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[16];
        AnonymousClass000.A1J(objArr, this.A00);
        AnonymousClass000.A1K(objArr, this.A01);
        objArr[2] = this.A0A;
        C36341k9.A1T(objArr, this.A02);
        objArr[4] = this.A05;
        objArr[5] = this.A04;
        objArr[6] = Boolean.valueOf(this.A0C);
        objArr[7] = Boolean.valueOf(this.A0D);
        objArr[8] = Boolean.valueOf(this.A0E);
        objArr[9] = this.A07;
        objArr[10] = this.A0B;
        objArr[11] = this.A08;
        objArr[12] = this.A06;
        objArr[13] = this.A09;
        objArr[14] = Integer.valueOf(this.A03);
        return AnonymousClass000.A0M(Boolean.valueOf(this.A0F), objArr, 15);
    }
}
