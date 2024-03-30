package X;

/* renamed from: X.883  reason: invalid class name */
public final class AnonymousClass883 extends C53062qe {
    public AnonymousClass00S A00 = null;
    public AnonymousClass00S A01;
    public boolean A02 = false;
    public boolean A03 = false;

    public AnonymousClass883(AnonymousClass00S r3) {
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass883) {
                AnonymousClass883 r5 = (AnonymousClass883) obj;
                if (this.A02 != r5.A02 || this.A03 != r5.A03 || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, ((((((C36341k9.A01(this.A02 ? 1 : 0) * 31) + C36341k9.A01(this.A03 ? 1 : 0)) * 31) + 10) * 31 * 31) + AnonymousClass000.A0H(this.A00)) * 31 * 31);
    }
}
