package X;

/* renamed from: X.5JK  reason: invalid class name */
public final class AnonymousClass5JK extends C1267065d {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5JK) {
                AnonymousClass5JK r5 = (AnonymousClass5JK) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36421kH.A04(this.A00) + C36341k9.A09(this.A01);
    }

    public AnonymousClass5JK(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GenericPushPayload(dataNotificationType=");
        A0u.append(this.A00);
        A0u.append(", dataToLid=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
