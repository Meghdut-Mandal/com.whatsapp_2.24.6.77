package X;

/* renamed from: X.56n  reason: invalid class name and case insensitive filesystem */
public final class C1036956n extends C1275568t {
    public final int A00;
    public final C125385zp A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1036956n) {
                C1036956n r5 = (C1036956n) obj;
                if (this.A04 != r5.A04 || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36381kD.A08(this.A02, C36351kA.A05(this.A01, C36341k9.A01(this.A04 ? 1 : 0) * 31)) + this.A00) * 31) + C36341k9.A09(this.A03);
    }

    public C1036956n(C125385zp r1, String str, String str2, int i, boolean z) {
        super(r1);
        this.A04 = z;
        this.A01 = r1;
        this.A02 = str;
        this.A00 = i;
        this.A03 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Downloading(selected=");
        A0u.append(this.A04);
        A0u.append(", section=");
        A0u.append(this.A01);
        A0u.append(", contentDescription=");
        A0u.append(this.A02);
        A0u.append(", progress=");
        A0u.append(this.A00);
        A0u.append(", trayIconPath=");
        return C36321k7.A0E(this.A03, A0u);
    }
}
