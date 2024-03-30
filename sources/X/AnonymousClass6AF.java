package X;

/* renamed from: X.6AF  reason: invalid class name */
public final class AnonymousClass6AF {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6AF) {
                AnonymousClass6AF r5 = (AnonymousClass6AF) obj;
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

    public AnonymousClass6AF(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FlowsEndpointPublicKey(publicKeyPem=");
        A0u.append(this.A00);
        A0u.append(", publicKeySignature=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
