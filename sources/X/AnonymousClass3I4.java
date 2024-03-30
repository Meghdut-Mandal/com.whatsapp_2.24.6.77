package X;

/* renamed from: X.3I4  reason: invalid class name */
public final class AnonymousClass3I4 {
    public final Object A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3I4) {
                AnonymousClass3I4 r5 = (AnonymousClass3I4) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass000.A0H(this.A00) * 31) + C36421kH.A05(this.A01);
    }

    public AnonymousClass3I4(Object obj, String str) {
        this.A00 = obj;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PropertyValue(value=");
        A0u.append(this.A00);
        A0u.append(", id=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
