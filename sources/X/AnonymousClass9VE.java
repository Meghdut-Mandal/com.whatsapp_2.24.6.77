package X;

/* renamed from: X.9VE  reason: invalid class name */
public final class AnonymousClass9VE {
    public final String A00;

    public AnonymousClass9VE(String str) {
        AnonymousClass00C.A0D(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass9VE) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass9VE) obj).A00));
    }

    public int hashCode() {
        return C36421kH.A04(this.A00) + 1237;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UpiIndiaWithdrawInputSummaryViewData(conversionSummary=");
        A0u.append(this.A00);
        A0u.append(", isShimmering=");
        return C36321k7.A0H(A0u, false);
    }
}
