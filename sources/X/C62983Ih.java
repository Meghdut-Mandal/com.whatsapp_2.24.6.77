package X;

/* renamed from: X.3Ih  reason: invalid class name and case insensitive filesystem */
public final class C62983Ih {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62983Ih) {
                C62983Ih r5 = (C62983Ih) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C36341k9.A09(this.A00) * 31) + C36421kH.A05(this.A01);
    }

    public C62983Ih(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LoggableErrorReason(className=");
        A0u.append(this.A00);
        A0u.append(", message=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
