package X;

/* renamed from: X.6r8  reason: invalid class name and case insensitive filesystem */
public final class C143796r8 implements C16220oo {
    public final int A00;
    public final int A01;
    public final C61243Bc A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C143796r8) {
                C143796r8 r5 = (C143796r8) obj;
                if (!(this.A03 == r5.A03 && AnonymousClass00C.A0J(this.A02, r5.A02) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36351kA.A05(this.A02, C36341k9.A01(this.A03 ? 1 : 0) * 31) + this.A01) * 31) + this.A00;
    }

    public C143796r8(C61243Bc r1, int i, int i2, boolean z) {
        this.A03 = z;
        this.A02 = r1;
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DisplayName(pulse=");
        A0u.append(this.A03);
        A0u.append(", title=");
        A0u.append(this.A02);
        A0u.append(", textColor=");
        A0u.append(this.A01);
        A0u.append(", avIconRes=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
