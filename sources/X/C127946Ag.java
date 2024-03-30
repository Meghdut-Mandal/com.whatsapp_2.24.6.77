package X;

/* renamed from: X.6Ag  reason: invalid class name and case insensitive filesystem */
public final class C127946Ag {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C127946Ag)) {
            return false;
        }
        C127946Ag r4 = (C127946Ag) obj;
        return this.A01 == r4.A01 && this.A00 == r4.A00;
    }

    public int hashCode() {
        int i = this.A00;
        int i2 = this.A01;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public C127946Ag(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C90494aF.A1L(A0u, this.A01);
        return C36381kD.A10(A0u, this.A00);
    }
}
