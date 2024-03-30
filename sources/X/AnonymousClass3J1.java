package X;

/* renamed from: X.3J1  reason: invalid class name */
public final class AnonymousClass3J1 {
    public final String A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3J1) {
                AnonymousClass3J1 r5 = (AnonymousClass3J1) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((C36341k9.A09(this.A00) * 31) + C36341k9.A09(this.A01)) * 31) + C36421kH.A05(this.A02);
    }

    public AnonymousClass3J1(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("InitialsCacheKey(firstName=");
        A0u.append(this.A00);
        A0u.append(", lastName=");
        A0u.append(this.A01);
        A0u.append(", pushName=");
        return C36321k7.A0E(this.A02, A0u);
    }
}
