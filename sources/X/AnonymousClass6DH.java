package X;

/* renamed from: X.6DH  reason: invalid class name */
public final class AnonymousClass6DH {
    public String A00;
    public String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6DH) {
                AnonymousClass6DH r5 = (AnonymousClass6DH) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90504aG.A0B(this.A03, C36381kD.A08(this.A04, C36381kD.A08(this.A01, C36381kD.A08(this.A05, C36381kD.A08(this.A00, C36421kH.A04(this.A02))))));
    }

    public AnonymousClass6DH(String str, String str2, String str3, String str4, String str5, String str6) {
        C36331k8.A1H(str4, str5);
        this.A02 = str;
        this.A00 = str2;
        this.A05 = str3;
        this.A01 = str4;
        this.A04 = str5;
        this.A03 = str6;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FlowsReportingData(data=");
        A0u.append(this.A02);
        A0u.append(", flowId=");
        A0u.append(this.A00);
        A0u.append(", sessionId=");
        A0u.append(this.A05);
        A0u.append(", t=");
        C90494aF.A1N(A0u, this.A01);
        A0u.append(this.A04);
        A0u.append(", entrypoint=");
        return C36321k7.A0E(this.A03, A0u);
    }
}
