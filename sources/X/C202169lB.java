package X;

import java.util.Objects;

/* renamed from: X.9lB  reason: invalid class name and case insensitive filesystem */
public class C202169lB {
    public static final C219411z[] A03 = new C219411z[0];
    public int A00;
    public boolean A01;
    public C219411z[] A02;

    public C202169lB() {
        this(10);
    }

    public static C202169lB A00() {
        return new C202169lB(2);
    }

    public static C219411z[] A04(C219411z[] r2) {
        return r2.length < 1 ? A03 : (C219411z[]) r2.clone();
    }

    public C219411z[] A07() {
        int i = this.A00;
        if (i == 0) {
            return A03;
        }
        C219411z[] r2 = this.A02;
        if (r2.length == i) {
            this.A01 = true;
            return r2;
        }
        C219411z[] r1 = new C219411z[i];
        System.arraycopy(r2, 0, r1, 0, i);
        return r1;
    }

    public static void A02(C219411z r1, C202169lB r2, int i, boolean z) {
        r2.A06(new C22681Asl(r1, i, z));
    }

    public static void A03(C219411z r1, C202169lB r2, boolean z) {
        r2.A06(new C22681Asl(r1, z ? 1 : 0, z));
    }

    public C219411z A05(int i) {
        int i2 = this.A00;
        if (i < i2) {
            return this.A02[i];
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(i);
        throw C165567td.A0M(" >= ", A0u, i2);
    }

    public void A06(C219411z r7) {
        Objects.requireNonNull(r7, "'element' cannot be null");
        C219411z[] r5 = this.A02;
        int length = r5.length;
        int i = this.A00;
        boolean z = true;
        int i2 = i + 1;
        if (i2 <= length) {
            z = false;
        }
        if (this.A01 || z) {
            C219411z[] r1 = new C219411z[Math.max(length, (i2 >> 1) + i2)];
            System.arraycopy(r5, 0, r1, 0, i);
            this.A02 = r1;
            r5 = r1;
            this.A01 = false;
        }
        r5[this.A00] = r7;
        this.A00 = i2;
    }

    public C202169lB(int i) {
        C219411z[] r0;
        if (i >= 0) {
            if (i == 0) {
                r0 = A03;
            } else {
                r0 = new C219411z[i];
            }
            this.A02 = r0;
            this.A00 = 0;
            this.A01 = false;
            return;
        }
        throw AnonymousClass001.A08("'initialCapacity' must not be negative");
    }

    public static C22675Asf A01(C219411z r0, C202169lB r1) {
        r1.A06(r0);
        return new C22675Asf(r1);
    }
}
