package X;

/* renamed from: X.6Bi  reason: invalid class name and case insensitive filesystem */
public final class C128206Bi {
    public final int A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128206Bi) {
                C128206Bi r5 = (C128206Bi) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A00 * 31) + C36341k9.A09(this.A01)) * 31) + C36421kH.A05(this.A02);
    }

    public C128206Bi(int i, String str, String str2) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ErrorResponse(errorMessageResId=");
        A0u.append(this.A00);
        A0u.append(", errorType=");
        A0u.append(this.A01);
        A0u.append(", exceptionMessage=");
        return C36321k7.A0E(this.A02, A0u);
    }
}
