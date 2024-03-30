package X;

/* renamed from: X.6C9  reason: invalid class name */
public final class AnonymousClass6C9 {
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6C9) {
                AnonymousClass6C9 r5 = (AnonymousClass6C9) obj;
                if (!AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90504aG.A0B(this.A01, C36381kD.A08(this.A02, C36381kD.A08(this.A00, C36421kH.A04(this.A03))));
    }

    public AnonymousClass6C9(String str, String str2, String str3, String str4) {
        C36321k7.A12(str2, str3, str4);
        this.A03 = str;
        this.A00 = str2;
        this.A02 = str3;
        this.A01 = str4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AIBotEmbodimentStatusData(state=");
        A0u.append(this.A03);
        A0u.append(", action=");
        A0u.append(this.A00);
        A0u.append(", sentiment=");
        A0u.append(this.A02);
        A0u.append(", intensity=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
