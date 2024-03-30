package X;

/* renamed from: X.9jH  reason: invalid class name and case insensitive filesystem */
public final class C201289jH {
    public static final C201289jH A02 = new C201289jH();
    public byte A00;
    public boolean A01;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || !(obj instanceof C201289jH)) {
                return false;
            }
            C201289jH r4 = (C201289jH) obj;
            if (!(this.A00 == r4.A00 && this.A01 == r4.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(new Boolean(this.A01), new Byte(this.A00).hashCode());
    }

    public C201289jH(byte b, boolean z) {
        this.A00 = b;
        this.A01 = z;
    }

    public C201289jH() {
        this.A00 = 3;
        this.A01 = true;
    }
}
