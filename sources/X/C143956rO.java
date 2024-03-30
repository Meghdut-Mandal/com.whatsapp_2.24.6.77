package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.6rO  reason: invalid class name and case insensitive filesystem */
public class C143956rO implements C34841hj {
    public final AnonymousClass72P A00;
    public final C195459Uj A01;
    public final AnonymousClass141 A02;
    public final String A03;
    public final List A04;
    public final int A05;

    public int BD8() {
        return 3;
    }

    public AnonymousClass11F BDC() {
        return null;
    }

    public int hashCode() {
        Object[] objArr = new Object[7];
        AnonymousClass000.A1J(objArr, 3);
        objArr[1] = this.A00;
        objArr[2] = this.A02;
        objArr[3] = this.A01;
        objArr[4] = this.A03;
        objArr[5] = this.A04;
        C36381kD.A1T(objArr, this.A05);
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C143956rO)) {
            return false;
        }
        C143956rO r4 = (C143956rO) obj;
        if (!C1901797e.A00(this.A00, r4.A00) || !C1901797e.A00(this.A02, r4.A02) || !C1901797e.A00(this.A01, r4.A01) || !C1901797e.A00(this.A03, r4.A03) || !C1901797e.A00(this.A04, r4.A04) || this.A05 != r4.A05) {
            return false;
        }
        return true;
    }

    public C143956rO(AnonymousClass72P r1, C195459Uj r2, AnonymousClass141 r3, String str, List list, int i) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = str;
        this.A04 = list;
        this.A05 = i;
    }

    public AnonymousClass72P B9E() {
        return this.A00;
    }

    public int BH3() {
        return this.A05;
    }
}
