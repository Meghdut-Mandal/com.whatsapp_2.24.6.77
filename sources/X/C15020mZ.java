package X;

/* renamed from: X.0mZ  reason: invalid class name and case insensitive filesystem */
public final class C15020mZ extends C11020fb implements C17160qp {
    public static final C15020mZ A00 = new C15020mZ(1, 0);

    public C15020mZ(int i, int i2) {
        super(i, i2, 1);
    }

    public boolean A01() {
        if (this.A00 > this.A01) {
            return true;
        }
        return false;
    }

    public boolean A02(int i) {
        if (this.A00 > i || i > this.A01) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C15020mZ)) {
            return false;
        }
        if (A01() && ((C11020fb) obj).A01()) {
            return true;
        }
        C11020fb r3 = (C11020fb) obj;
        if (this.A00 == r3.A00 && this.A01 == r3.A01) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (A01()) {
            return -1;
        }
        return (this.A00 * 31) + this.A01;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A00);
        A0u.append("..");
        A0u.append(this.A01);
        return A0u.toString();
    }

    public /* bridge */ /* synthetic */ Comparable BBY() {
        throw null;
    }

    public /* bridge */ /* synthetic */ Comparable BHr() {
        throw null;
    }
}
