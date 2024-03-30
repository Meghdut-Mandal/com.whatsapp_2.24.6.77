package X;

/* renamed from: X.3GI  reason: invalid class name */
public class AnonymousClass3GI {
    public final int A00;
    public final AnonymousClass3T1 A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass3GI r5 = (AnonymousClass3GI) obj;
            if (!(this.A00 == r5.A00 && this.A02 == r5.A02 && this.A01.equals(r5.A01))) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass3GI(AnonymousClass3T1 r1, int i, boolean z) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = z;
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        A1Q[0] = this.A01;
        AnonymousClass000.A1K(A1Q, this.A00);
        return AnonymousClass000.A0M(Boolean.valueOf(this.A02), A1Q, 2);
    }
}
