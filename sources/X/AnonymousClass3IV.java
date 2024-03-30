package X;

/* renamed from: X.3IV  reason: invalid class name */
public final class AnonymousClass3IV {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3IV) {
                AnonymousClass3IV r5 = (AnonymousClass3IV) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36421kH.A04(this.A00) + this.A01.hashCode();
    }

    public AnonymousClass3IV(String str, String str2) {
        C36321k7.A0x(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LanguageItem(language=");
        A0u.append(this.A00);
        A0u.append(", languageTag=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
