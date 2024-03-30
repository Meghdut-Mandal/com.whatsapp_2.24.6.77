package X;

/* renamed from: X.A2s  reason: case insensitive filesystem */
public class C21004A2s implements C22884Axf {
    public float A00;
    public int A01;
    public int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C21004A2s a2s = (C21004A2s) obj;
            if (!(this.A02 == a2s.A02 && this.A01 == a2s.A01 && this.A00 == a2s.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((this.A02 * 31) + this.A01) * 31) + ((int) this.A00);
    }

    public C21004A2s(int i, int i2, float f) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = f;
    }

    public AnonymousClass905 BIb() {
        return AnonymousClass905.PREVIEW_VIEW_SIZE;
    }
}
