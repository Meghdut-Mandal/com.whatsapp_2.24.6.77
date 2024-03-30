package X;

import java.util.List;

/* renamed from: X.3H9  reason: invalid class name */
public class AnonymousClass3H9 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass3CQ A03;
    public final AnonymousClass3GJ A04;
    public final C600336f A05;
    public final AnonymousClass3T1 A06;
    public final AnonymousClass3T1 A07;
    public final C64933Qa A08;
    public final Integer A09;
    public final List A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass3H9 r5 = (AnonymousClass3H9) obj;
            if (!(this.A0C == r5.A0C && this.A02 == r5.A02 && this.A05.equals(r5.A05) && C1901797e.A00(this.A09, r5.A09) && C1901797e.A00(this.A04, r5.A04) && C1901797e.A00(this.A06, r5.A06) && this.A0D == r5.A0D && this.A0B == r5.A0B && this.A00 == r5.A00 && this.A01 == r5.A01 && this.A07 == r5.A07 && this.A08 == r5.A08 && C1901797e.A00(this.A0A, r5.A0A))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[13];
        objArr[0] = Boolean.valueOf(this.A0C);
        objArr[1] = this.A05;
        C36331k8.A1V(objArr, this.A02);
        objArr[3] = this.A09;
        objArr[4] = this.A04;
        objArr[5] = this.A06;
        objArr[6] = Boolean.valueOf(this.A0D);
        objArr[7] = Boolean.valueOf(this.A0B);
        objArr[8] = Integer.valueOf(this.A00);
        objArr[9] = Integer.valueOf(this.A01);
        objArr[10] = this.A07;
        objArr[11] = this.A08;
        return AnonymousClass000.A0M(this.A0A, objArr, 12);
    }

    public AnonymousClass3H9(AnonymousClass3CQ r1, AnonymousClass3GJ r2, C600336f r3, AnonymousClass3T1 r4, AnonymousClass3T1 r5, C64933Qa r6, Integer num, List list, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        this.A0C = z;
        this.A0B = z2;
        this.A0D = z3;
        this.A0A = list;
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i;
        this.A05 = r3;
        this.A04 = r2;
        this.A09 = num;
        this.A06 = r4;
        this.A07 = r5;
        this.A08 = r6;
        this.A03 = r1;
    }
}
