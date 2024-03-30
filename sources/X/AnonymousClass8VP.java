package X;

/* renamed from: X.8VP  reason: invalid class name */
public final class AnonymousClass8VP extends AnonymousClass9EB {
    public final C128826Dt A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public AnonymousClass8VP(C128826Dt r2, String str, String str2, String str3, String str4, boolean z) {
        super(3);
        this.A05 = z;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A00 = r2;
        this.A02 = str4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass8VP) {
                AnonymousClass8VP r5 = (AnonymousClass8VP) obj;
                if (this.A05 != r5.A05 || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((C36341k9.A01(this.A05 ? 1 : 0) * 31) + C36341k9.A09(this.A04)) * 31) + C36341k9.A09(this.A03)) * 31) + C36341k9.A09(this.A01)) * 31) + AnonymousClass000.A0H(this.A00)) * 31) + C36421kH.A05(this.A02);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PriceDetailsDisplayItem(sentCartUseCase=");
        A0u.append(this.A05);
        A0u.append(", subTotal=");
        A0u.append(this.A04);
        A0u.append(", productDiscount=");
        A0u.append(this.A03);
        A0u.append(", couponDiscount=");
        A0u.append(this.A01);
        A0u.append(", appliedPromotion=");
        A0u.append(this.A00);
        A0u.append(", estimatedTotal=");
        return C36321k7.A0E(this.A02, A0u);
    }
}
