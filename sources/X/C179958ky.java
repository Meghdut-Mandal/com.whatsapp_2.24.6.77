package X;

/* renamed from: X.8ky  reason: invalid class name and case insensitive filesystem */
public final class C179958ky extends AnonymousClass5Gz {
    public final AnonymousClass11F A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C179958ky) && AnonymousClass00C.A0J(this.A00, ((C179958ky) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C179958ky(AnonymousClass11F r2) {
        super(1008);
        this.A00 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("IndiaUpiTransactionDetailContactMerchantViewData(merchantJid=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
