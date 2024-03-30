package X;

/* renamed from: X.3IJ  reason: invalid class name */
public class AnonymousClass3IJ {
    public int A00;
    public AnonymousClass11F A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass3IJ r5 = (AnonymousClass3IJ) obj;
            if (this.A00 != r5.A00 || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A01) + this.A00;
    }

    public AnonymousClass3IJ(AnonymousClass11F r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A01);
        C36421kH.A1N(A0u);
        return C36381kD.A10(A0u, this.A00);
    }
}
