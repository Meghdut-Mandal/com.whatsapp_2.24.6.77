package X;

/* renamed from: X.9XA  reason: invalid class name */
public final class AnonymousClass9XA {
    public C135086c7 A00;
    public C175698au A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9XA) {
                AnonymousClass9XA r5 = (AnonymousClass9XA) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || this.A04 != r5.A04 || this.A05 != r5.A05 || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((C36391kE.A0A(this.A01) + C36341k9.A01(this.A04 ? 1 : 0)) * 31) + C36341k9.A01(this.A05 ? 1 : 0)) * 31) + C36341k9.A09(this.A03)) * 31) + C36341k9.A09(this.A02)) * 31) + C36411kG.A09(this.A00);
    }

    public AnonymousClass9XA(C135086c7 r1, C175698au r2, String str, String str2, boolean z, boolean z2) {
        this.A01 = r2;
        this.A04 = z;
        this.A05 = z2;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("IndiaUpiNonWaContactData(indiaUpiContactData=");
        A0u.append(this.A01);
        A0u.append(", isMerchant=");
        A0u.append(this.A04);
        A0u.append(", isVerifiedMerchant=");
        A0u.append(this.A05);
        A0u.append(", transactionType=");
        A0u.append(this.A03);
        A0u.append(", merchantCarrierCode=");
        A0u.append(this.A02);
        A0u.append(", upiNumber=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
