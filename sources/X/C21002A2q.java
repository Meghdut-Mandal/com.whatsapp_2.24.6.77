package X;

/* renamed from: X.A2q  reason: case insensitive filesystem */
public class C21002A2q implements C22884Axf {
    public int A00;
    public int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C21002A2q a2q = (C21002A2q) obj;
            if (!(this.A01 == a2q.A01 && this.A00 == a2q.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public C21002A2q(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public AnonymousClass905 BIb() {
        return AnonymousClass905.INPUT_PREVIEW_SIZE;
    }
}
