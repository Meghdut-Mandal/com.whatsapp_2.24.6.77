package X;

/* renamed from: X.5QP  reason: invalid class name */
public final class AnonymousClass5QP extends C112015dD {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5QP) {
                AnonymousClass5QP r5 = (AnonymousClass5QP) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36421kH.A04(this.A01) + C36341k9.A09(this.A00);
    }

    public AnonymousClass5QP(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Success(phoneNumber=");
        String str2 = this.A01;
        int length = str2.length();
        int i = 4;
        if (4 > length) {
            i = length;
        }
        A0u.append(C90494aF.A0d(str2, length - i));
        A0u.append(", openOnPhoneNonce=");
        String str3 = this.A00;
        if (str3 != null) {
            int length2 = str3.length();
            int i2 = 4;
            if (4 > length2) {
                i2 = length2;
            }
            str = C90494aF.A0d(str3, length2 - i2);
        } else {
            str = null;
        }
        return C36321k7.A0E(str, A0u);
    }
}
