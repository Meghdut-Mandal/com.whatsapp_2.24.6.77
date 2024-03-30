package X;

/* renamed from: X.5JL  reason: invalid class name */
public final class AnonymousClass5JL extends C1267065d {
    public final String A00;
    public final String A01;
    public final String A02;

    public AnonymousClass5JL(String str, String str2, String str3) {
        AnonymousClass00C.A0D(str3, 3);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5JL) {
                AnonymousClass5JL r5 = (AnonymousClass5JL) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90504aG.A0B(this.A02, (C36421kH.A04(this.A00) + C36341k9.A09(this.A01)) * 31);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WfacPushPayload(dataNotificationType=");
        A0u.append(this.A00);
        A0u.append(", dataToLid=");
        A0u.append(this.A01);
        A0u.append(", decision=");
        return C36321k7.A0E(this.A02, A0u);
    }
}
