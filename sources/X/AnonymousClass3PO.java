package X;

/* renamed from: X.3PO  reason: invalid class name */
public class AnonymousClass3PO {
    public final AnonymousClass11F A00;
    public final AnonymousClass11F A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof AnonymousClass3PO)) {
                return false;
            }
            AnonymousClass3PO r4 = (AnonymousClass3PO) obj;
            if (!C1901797e.A00(this.A00, r4.A00) || !C1901797e.A00(this.A01, r4.A01) || this.A02 != r4.A02) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass3PO(AnonymousClass11F r1, AnonymousClass11F r2, boolean z) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = z;
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        A1Q[0] = this.A00;
        A1Q[1] = this.A01;
        return AnonymousClass000.A0M(Boolean.valueOf(this.A02), A1Q, 2);
    }
}
