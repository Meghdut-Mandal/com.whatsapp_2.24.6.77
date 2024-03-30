package X;

/* renamed from: X.5Dx  reason: invalid class name and case insensitive filesystem */
public class C105245Dx extends AnonymousClass5EQ {
    public final boolean A00;
    public final boolean A01;

    public C105245Dx(boolean z, boolean z2) {
        super(3);
        this.A00 = z;
        this.A01 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            C105245Dx r5 = (C105245Dx) obj;
            if (!C1901797e.A00(Boolean.valueOf(this.A00), Boolean.valueOf(r5.A00)) || !C1901797e.A00(Boolean.valueOf(this.A01), Boolean.valueOf(r5.A01))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        AnonymousClass000.A1J(A1Q, super.hashCode());
        C36421kH.A1R(A1Q, this.A00);
        return C90484aE.A0D(Boolean.valueOf(this.A01), A1Q);
    }
}
