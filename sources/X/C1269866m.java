package X;

/* renamed from: X.66m  reason: invalid class name and case insensitive filesystem */
public class C1269866m {
    public int A00;
    public String A01 = "";
    public boolean A02;

    public boolean equals(Object obj) {
        if (!(obj instanceof C1269866m)) {
            return false;
        }
        C1269866m r4 = (C1269866m) obj;
        if (this.A01.equals(r4.A01) && this.A00 == r4.A00 && this.A02 == r4.A02) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        A1Q[0] = this.A01;
        AnonymousClass000.A1K(A1Q, this.A00);
        return C90484aE.A0D(Boolean.valueOf(this.A02), A1Q);
    }
}
