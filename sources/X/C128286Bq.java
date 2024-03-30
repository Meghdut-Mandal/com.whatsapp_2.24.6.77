package X;

/* renamed from: X.6Bq  reason: invalid class name and case insensitive filesystem */
public final class C128286Bq {
    public AnonymousClass6NV A00 = null;
    public String A01;
    public boolean A02 = false;
    public final String A03;

    public C128286Bq(String str, String str2) {
        this.A03 = str;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128286Bq) {
                C128286Bq r5 = (C128286Bq) obj;
                if (!AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A01, r5.A01) || this.A02 != r5.A02 || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36381kD.A08(this.A01, C36421kH.A04(this.A03)) + C36341k9.A01(this.A02 ? 1 : 0)) * 31) + AnonymousClass000.A0H(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("TextSubstitutionValue(original=");
        A0u.append(this.A03);
        A0u.append(", substitution=");
        A0u.append(this.A01);
        A0u.append(", isShowingSubstitution=");
        A0u.append(this.A02);
        A0u.append(", layoutCache=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
