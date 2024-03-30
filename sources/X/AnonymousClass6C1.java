package X;

/* renamed from: X.6C1  reason: invalid class name */
public final class AnonymousClass6C1 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6C1) {
                AnonymousClass6C1 r5 = (AnonymousClass6C1) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90504aG.A0B(this.A03, C36381kD.A08(this.A02, C36381kD.A08(this.A01, C36421kH.A04(this.A00))));
    }

    public AnonymousClass6C1(String str, String str2, String str3, String str4) {
        C36321k7.A18(str, str2, str3, str4);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BotFlowsCommand(bizJid=");
        A0u.append(this.A00);
        A0u.append(", commandName=");
        A0u.append(this.A01);
        A0u.append(", flowId=");
        A0u.append(this.A02);
        A0u.append(", flowStartScreen=");
        return C36321k7.A0E(this.A03, A0u);
    }
}
