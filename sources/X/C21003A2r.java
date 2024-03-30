package X;

/* renamed from: X.A2r  reason: case insensitive filesystem */
public class C21003A2r implements C22884Axf {
    public int A00;
    public int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C21003A2r a2r = (C21003A2r) obj;
            if (!(this.A00 == a2r.A00 && this.A01 == a2r.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public C21003A2r(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public AnonymousClass905 BIb() {
        return AnonymousClass905.INPUT_ROTATION;
    }
}
