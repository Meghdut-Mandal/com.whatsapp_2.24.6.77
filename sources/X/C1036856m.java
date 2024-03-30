package X;

/* renamed from: X.56m  reason: invalid class name and case insensitive filesystem */
public final class C1036856m extends C1275568t {
    public final C125385zp A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1036856m) {
                C1036856m r5 = (C1036856m) obj;
                if (this.A03 != r5.A03 || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36381kD.A08(this.A01, C36351kA.A05(this.A00, C36341k9.A01(this.A03 ? 1 : 0) * 31)) + C36341k9.A09(this.A02);
    }

    public C1036856m(C125385zp r1, String str, String str2, boolean z) {
        super(r1);
        this.A03 = z;
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Preview(selected=");
        A0u.append(this.A03);
        A0u.append(", section=");
        A0u.append(this.A00);
        A0u.append(", contentDescription=");
        A0u.append(this.A01);
        A0u.append(", trayIconPath=");
        return C36321k7.A0E(this.A02, A0u);
    }
}
