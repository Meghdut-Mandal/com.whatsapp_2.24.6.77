package X;

/* renamed from: X.3QF  reason: invalid class name */
public final class AnonymousClass3QF {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3QF) {
                AnonymousClass3QF r5 = (AnonymousClass3QF) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((C36421kH.A04(this.A01) + C36341k9.A09(this.A02)) * 31) + C36411kG.A09(this.A00)) * 31) + C36341k9.A01(this.A03 ? 1 : 0);
    }

    public AnonymousClass3QF(Integer num, String str, String str2, boolean z) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = num;
        this.A03 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UsernameModel(currentUsername=");
        A0u.append(this.A01);
        A0u.append(", requestedUsername=");
        A0u.append(this.A02);
        A0u.append(", errorMessage=");
        A0u.append(this.A00);
        A0u.append(", isLoading=");
        return C36321k7.A0H(A0u, this.A03);
    }

    public AnonymousClass3QF() {
        this((Integer) null, "", (String) null, false);
    }
}
