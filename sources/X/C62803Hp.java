package X;

/* renamed from: X.3Hp  reason: invalid class name and case insensitive filesystem */
public final class C62803Hp {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62803Hp) {
                C62803Hp r5 = (C62803Hp) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C36341k9.A09(this.A01) * 31) + this.A00.hashCode();
    }

    public C62803Hp(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SharePnDialogData(myMaskedNumber=");
        A0u.append(this.A01);
        A0u.append(", learnMoreLink=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
