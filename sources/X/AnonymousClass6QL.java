package X;

import java.util.ArrayList;

/* renamed from: X.6QL  reason: invalid class name */
public final class AnonymousClass6QL {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05 = -1;
    public boolean A06;
    public final int A07;
    public final C1496372c A08;
    public final int[] A09;
    public final Object[] A0A;
    public final int A0B;

    public final void A07() {
        int i;
        this.A06 = true;
        C1496372c r1 = this.A08;
        if (r1 != r1 || (i = r1.A01) <= 0) {
            throw AnonymousClass6XJ.A01("Unexpected reader close()");
        }
        r1.A01 = i - 1;
    }

    public static final Object A00(AnonymousClass6QL r4, int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) != 0) {
            return r4.A0A[iArr[i2 + 4] + AnonymousClass6QR.A00(i3 >> 30)];
        }
        return null;
    }

    public final int A01() {
        int i = 1;
        if (this.A04 == 0) {
            int[] iArr = this.A09;
            int i2 = this.A01;
            if (!AnonymousClass6QR.A03(iArr, i2)) {
                i = C90494aF.A0C(iArr, i2 * 5);
            }
            this.A01 = i2 + C90524aI.A05(iArr, i2);
            return i;
        }
        throw AnonymousClass6XJ.A01("Cannot skip while in an empty region");
    }

    public final AnonymousClass606 A02(int i) {
        ArrayList arrayList = this.A08.A04;
        int A012 = AnonymousClass6QR.A01(arrayList, i, this.A07);
        if (A012 >= 0) {
            return (AnonymousClass606) arrayList.get(A012);
        }
        AnonymousClass606 r0 = new AnonymousClass606(i);
        arrayList.add(-(A012 + 1), r0);
        return r0;
    }

    public final Object A03() {
        int i = this.A01;
        if (i >= this.A00) {
            return C36381kD.A0m();
        }
        int[] iArr = this.A09;
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) == 0) {
            return C129736Ig.A00;
        }
        Object[] objArr = this.A0A;
        int length = iArr.length;
        if (i2 < length) {
            length = AnonymousClass6QR.A00(i3 >> 29) + iArr[i2 + 4];
        }
        return objArr[length];
    }

    public final Object A04() {
        int i;
        if (this.A04 > 0 || (i = this.A02) >= this.A03) {
            return C129736Ig.A00;
        }
        Object[] objArr = this.A0A;
        this.A02 = i + 1;
        return objArr[i];
    }

    public final Object A05(int i) {
        int[] iArr = this.A09;
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) == 0) {
            return C129736Ig.A00;
        }
        Object[] objArr = this.A0A;
        int length = iArr.length;
        if (i2 < length) {
            length = AnonymousClass6QR.A00(i3 >> 29) + iArr[i2 + 4];
        }
        return objArr[length];
    }

    public final Object A06(int i, int i2) {
        int i3;
        int[] iArr = this.A09;
        int A022 = AnonymousClass6QR.A02(iArr, i);
        int i4 = i + 1;
        if (i4 < this.A07) {
            i3 = iArr[(i4 * 5) + 4];
        } else {
            i3 = this.A0B;
        }
        int i5 = A022 + i2;
        if (i5 < i3) {
            return this.A0A[i5];
        }
        return C129736Ig.A00;
    }

    public final void A08() {
        int A052;
        if (this.A04 != 0) {
            return;
        }
        if (this.A01 == this.A00) {
            int[] iArr = this.A09;
            int i = iArr[(this.A05 * 5) + 2];
            this.A05 = i;
            if (i < 0) {
                A052 = this.A07;
            } else {
                A052 = i + C90524aI.A05(iArr, i);
            }
            this.A00 = A052;
            return;
        }
        throw AnonymousClass6XJ.A01("endGroup() not called at the end of a group");
    }

    public final void A09() {
        if (this.A04 == 0) {
            this.A01 = this.A00;
            return;
        }
        throw AnonymousClass6XJ.A01("Cannot skip the enclosing group while in an empty region");
    }

    public final void A0A() {
        int i;
        if (this.A04 <= 0) {
            int i2 = this.A05;
            int i3 = this.A01;
            int[] iArr = this.A09;
            int i4 = i3 * 5;
            if (iArr[i4 + 2] == i2) {
                this.A05 = i3;
                this.A00 = iArr[i4 + 3] + i3;
                int i5 = i3 + 1;
                this.A01 = i5;
                this.A02 = AnonymousClass6QR.A02(iArr, i3);
                if (i3 >= this.A07 - 1) {
                    i = this.A0B;
                } else {
                    i = iArr[(i5 * 5) + 4];
                }
                this.A03 = i;
                return;
            }
            throw AnonymousClass001.A08("Invalid slot table detected");
        }
    }

    public final void A0B(int i) {
        int i2;
        if (this.A04 == 0) {
            this.A01 = i;
            int i3 = this.A07;
            if (i < i3) {
                i2 = this.A09[(i * 5) + 2];
            } else {
                i2 = -1;
            }
            this.A05 = i2;
            if (i2 < 0) {
                this.A00 = i3;
            } else {
                this.A00 = i2 + C90524aI.A05(this.A09, i2);
            }
            this.A02 = 0;
            this.A03 = 0;
            return;
        }
        throw AnonymousClass6XJ.A01("Cannot reposition while in an empty region");
    }

    public AnonymousClass6QL(C1496372c r3) {
        this.A08 = r3;
        this.A09 = r3.A07;
        int i = r3.A00;
        this.A07 = i;
        this.A0A = r3.A08;
        this.A0B = r3.A02;
        this.A00 = i;
    }

    public String toString() {
        int i;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SlotReader(current=");
        int i2 = this.A01;
        A0u.append(i2);
        A0u.append(", key=");
        int i3 = this.A00;
        if (i2 < i3) {
            i = this.A09[i2 * 5];
        } else {
            i = 0;
        }
        A0u.append(i);
        A0u.append(", parent=");
        A0u.append(this.A05);
        A0u.append(", end=");
        return C36321k7.A0G(A0u, i3);
    }
}
