package X;

/* renamed from: X.3GG  reason: invalid class name */
public class AnonymousClass3GG {
    public final int A00;
    public final AnonymousClass11F A01;
    public final Object A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnonymousClass3GG r4 = (AnonymousClass3GG) obj;
            if (this.A00 == r4.A00) {
                return C1901797e.A00(this.A02, r4.A02);
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.A00 * 31) + AnonymousClass000.A0J(this.A02);
    }

    public AnonymousClass3GG(AnonymousClass11F r1, Object obj, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = r1;
    }
}
