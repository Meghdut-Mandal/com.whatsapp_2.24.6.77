package X;

/* renamed from: X.56k  reason: invalid class name */
public final class AnonymousClass56k extends C1275568t {
    public final int A00;
    public final C125385zp A01;
    public final String A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass56k) {
                AnonymousClass56k r5 = (AnonymousClass56k) obj;
                if (this.A03 != r5.A03 || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36381kD.A08(this.A02, C36351kA.A05(this.A01, C36341k9.A01(this.A03 ? 1 : 0) * 31)) + this.A00;
    }

    public AnonymousClass56k(C125385zp r1, String str, int i, boolean z) {
        super(r1);
        this.A03 = z;
        this.A01 = r1;
        this.A02 = str;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CustomIcon(selected=");
        A0u.append(this.A03);
        A0u.append(", section=");
        A0u.append(this.A01);
        A0u.append(", contentDescription=");
        A0u.append(this.A02);
        A0u.append(", trayIconResource=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
