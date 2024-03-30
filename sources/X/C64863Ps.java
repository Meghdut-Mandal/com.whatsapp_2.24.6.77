package X;

/* renamed from: X.3Ps  reason: invalid class name and case insensitive filesystem */
public final class C64863Ps {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C64863Ps) {
                C64863Ps r5 = (C64863Ps) obj;
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

    public C64863Ps(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AliasedName(displayName=");
        A0u.append(this.A00);
        A0u.append(", username=");
        return C36321k7.A0E(this.A01, A0u);
    }

    public C64863Ps() {
        this((String) null, (String) null);
    }
}
