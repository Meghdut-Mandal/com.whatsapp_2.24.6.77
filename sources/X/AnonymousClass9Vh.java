package X;

/* renamed from: X.9Vh  reason: invalid class name */
public final class AnonymousClass9Vh {
    public String A00;
    public String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9Vh) {
                AnonymousClass9Vh r5 = (AnonymousClass9Vh) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C36341k9.A09(this.A00) * 31) + C36421kH.A05(this.A01);
    }

    public AnonymousClass9Vh(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SendJobKey(jid=");
        A0u.append(this.A00);
        A0u.append(", keyId=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
