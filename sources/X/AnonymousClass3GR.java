package X;

/* renamed from: X.3GR  reason: invalid class name */
public class AnonymousClass3GR {
    public final String A00;
    public final String A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass3GR)) {
            return false;
        }
        AnonymousClass3GR r4 = (AnonymousClass3GR) obj;
        return this.A02 == r4.A02 && this.A01.equals(r4.A01) && this.A00.equals(r4.A00);
    }

    public AnonymousClass3GR(String str, String str2, boolean z) {
        this.A02 = z;
        this.A01 = str == null ? "" : str;
        this.A00 = str2 == null ? "" : str2;
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        A1Q[0] = Boolean.valueOf(this.A02);
        A1Q[1] = this.A01;
        return AnonymousClass000.A0M(this.A00, A1Q, 2);
    }
}
