package X;

/* renamed from: X.9WI  reason: invalid class name */
public final class AnonymousClass9WI {
    public final String A00;
    public final String A01;
    public final long A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9WI) {
                AnonymousClass9WI r8 = (AnonymousClass9WI) obj;
                if (this.A02 != r8.A02 || !AnonymousClass00C.A0J(this.A01, r8.A01) || !AnonymousClass00C.A0J(this.A00, r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C90464aC.A08(this.A02) + C36341k9.A09(this.A01)) * 31) + C36421kH.A05(this.A00);
    }

    public AnonymousClass9WI(long j, String str, String str2) {
        this.A02 = j;
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ErrorMessage(errorCode=");
        A0u.append(this.A02);
        A0u.append(", errorTitle=");
        A0u.append(this.A01);
        A0u.append(", errorMessage=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
