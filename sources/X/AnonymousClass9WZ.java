package X;

/* renamed from: X.9WZ  reason: invalid class name */
public final class AnonymousClass9WZ {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9WZ) {
                AnonymousClass9WZ r5 = (AnonymousClass9WZ) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36381kD.A08(this.A03, C36341k9.A09(this.A00) * 31) + C36341k9.A09(this.A01)) * 31) + C36421kH.A05(this.A02);
    }

    public AnonymousClass9WZ(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A02 = str4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SignedUserInfo(phoneNumber=");
        A0u.append(this.A00);
        A0u.append(", ttlTimestamp=");
        A0u.append(this.A03);
        A0u.append(", phoneNumberSignature=");
        A0u.append(this.A01);
        A0u.append(", postcode=");
        return C36321k7.A0E(this.A02, A0u);
    }
}
