package X;

import java.util.List;

/* renamed from: X.3H5  reason: invalid class name */
public class AnonymousClass3H5 {
    public List A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final AnonymousClass3CQ A06;
    public final C600336f A07;
    public final AnonymousClass3T1 A08;
    public final boolean A09;
    public final long A0A;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass3H5 r7 = (AnonymousClass3H5) obj;
            if (!(this.A09 == r7.A09 && this.A02 == r7.A02 && this.A05 == r7.A05 && this.A0A == r7.A0A && this.A04 == r7.A04 && this.A03 == r7.A03 && this.A08.equals(r7.A08) && C1901797e.A00(this.A07, r7.A07) && this.A00.equals(r7.A00) && this.A01 == r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[11];
        objArr[0] = Boolean.valueOf(this.A09);
        AnonymousClass000.A1K(objArr, this.A02);
        C36331k8.A1V(objArr, this.A05);
        objArr[3] = this.A08;
        C36341k9.A1U(objArr, 100);
        objArr[5] = Long.valueOf(this.A0A);
        C36381kD.A1T(objArr, this.A04);
        C36361kB.A1V(objArr, this.A03);
        objArr[8] = this.A07;
        objArr[9] = this.A00;
        return AnonymousClass000.A0M(Boolean.valueOf(this.A01), objArr, 10);
    }

    public AnonymousClass3H5(AnonymousClass3CQ r1, C600336f r2, AnonymousClass3T1 r3, List list, int i, int i2, int i3, int i4, long j, boolean z, boolean z2) {
        this.A09 = z;
        this.A02 = i;
        this.A05 = i2;
        this.A08 = r3;
        this.A0A = j;
        this.A04 = i3;
        this.A03 = i4;
        this.A07 = r2;
        this.A00 = list;
        this.A01 = z2;
        this.A06 = r1;
    }
}
