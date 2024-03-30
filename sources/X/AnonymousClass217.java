package X;

/* renamed from: X.217  reason: invalid class name */
public final class AnonymousClass217 extends C53062qe {
    public final AnonymousClass9QU A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass217) {
                AnonymousClass217 r5 = (AnonymousClass217) obj;
                if (!(this.A03 == r5.A03 && this.A02 == r5.A02 && AnonymousClass00C.A0J(this.A00, r5.A00) && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A00, ((C36341k9.A01(this.A03 ? 1 : 0) * 31) + C36341k9.A01(this.A02 ? 1 : 0)) * 31) + C36341k9.A01(this.A01 ? 1 : 0);
    }

    public AnonymousClass217(AnonymousClass9QU r1, boolean z, boolean z2, boolean z3) {
        this.A03 = z;
        this.A02 = z2;
        this.A00 = r1;
        this.A01 = z3;
    }

    public AnonymousClass217() {
        this(new C169748An(100), false, false, false);
    }
}
