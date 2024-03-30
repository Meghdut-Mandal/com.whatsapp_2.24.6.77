package X;

/* renamed from: X.0fb  reason: invalid class name and case insensitive filesystem */
public class C11020fb implements Iterable, AnonymousClass00W {
    public final int A00;
    public final int A01;
    public final int A02;

    /* renamed from: A00 */
    public C13590k7 iterator() {
        return new C13590k7(this.A00, this.A01, this.A02);
    }

    public boolean A01() {
        int i = this.A02;
        int i2 = this.A00;
        int i3 = this.A01;
        if (i > 0) {
            if (i2 > i3) {
                return true;
            }
            return false;
        } else if (i2 < i3) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11020fb)) {
            return false;
        }
        if (A01() && ((C11020fb) obj).A01()) {
            return true;
        }
        C11020fb r3 = (C11020fb) obj;
        if (this.A00 == r3.A00 && this.A01 == r3.A01 && this.A02 == r3.A02) {
            return true;
        }
        return false;
    }

    public String toString() {
        int i = this.A02;
        StringBuilder A0u = AnonymousClass000.A0u();
        int i2 = this.A00;
        if (i > 0) {
            A0u.append(i2);
            A0u.append("..");
            A0u.append(this.A01);
            A0u.append(" step ");
        } else {
            A0u.append(i2);
            A0u.append(" downTo ");
            A0u.append(this.A01);
            A0u.append(" step ");
            i = -i;
        }
        A0u.append(i);
        return A0u.toString();
    }

    public C11020fb(int i, int i2, int i3) {
        if (i3 == 0) {
            throw AnonymousClass001.A08("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.A00 = i;
            if (i3 > 0) {
                if (i < i2) {
                    int i4 = i2 % i3;
                    int i5 = i % i3;
                    int i6 = ((i4 < 0 ? i4 + i3 : i4) - (i5 < 0 ? i5 + i3 : i5)) % i3;
                    i2 -= i6 < 0 ? i6 + i3 : i6;
                }
            } else if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                int i9 = i2 % i7;
                int i10 = ((i8 < 0 ? i8 + i7 : i8) - (i9 < 0 ? i9 + i7 : i9)) % i7;
                i2 += i10 < 0 ? i10 + i7 : i10;
            }
            this.A01 = i2;
            this.A02 = i3;
        } else {
            throw AnonymousClass001.A08("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public int hashCode() {
        if (A01()) {
            return -1;
        }
        return (((this.A00 * 31) + this.A01) * 31) + this.A02;
    }
}
