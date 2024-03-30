package X;

/* renamed from: X.6PF  reason: invalid class name */
public final class AnonymousClass6PF {
    public static final C125395zq A03 = new C125395zq();
    public final Long A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6PF) {
                AnonymousClass6PF r5 = (AnonymousClass6PF) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36421kH.A04(this.A02) + C36341k9.A09(this.A01)) * 31) + C36411kG.A09(this.A00);
    }

    public AnonymousClass6PF(Long l, String str, String str2) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = l;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FlowsAssetVerification(publicKey=");
        A0u.append(this.A02);
        A0u.append(", prevPublicKey=");
        A0u.append(this.A01);
        A0u.append(", prevPublicKeyExpiryTimeInMilli=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
