package X;

import java.util.Random;

/* renamed from: X.0u5  reason: invalid class name and case insensitive filesystem */
public class C18950u5 {
    public final int A00;
    public final Random A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C18950u5 r5 = (C18950u5) obj;
            return this.A04 == r5.A04 && this.A02 == r5.A02 && this.A03 == r5.A03 && this.A00 == r5.A00 && this.A05 == r5.A05;
        }
        return false;
    }

    public boolean A00() {
        int i = this.A00;
        if (i <= 0 || this.A01.nextInt(i) != 0) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((this.A04 * 31) + this.A02) * 31) + this.A03) * 31) + this.A00) * 31) + (this.A05 ? 1 : 0);
    }

    public C18950u5(int i, int i2, int i3, int i4, boolean z) {
        this.A04 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i4;
        this.A05 = z;
        this.A01 = new Random();
    }

    public C18950u5(int i, int i2) {
        this(1, i, i, i2, true);
    }

    public C18950u5(int i, int i2, int i3, boolean z) {
        this(i, i2, i2, i3, z);
    }
}
