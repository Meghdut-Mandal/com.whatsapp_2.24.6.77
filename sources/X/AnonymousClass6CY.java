package X;

/* renamed from: X.6CY  reason: invalid class name */
public final class AnonymousClass6CY {
    public final int A00;
    public final long A01;
    public final C128216Bj A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6CY) {
                AnonymousClass6CY r8 = (AnonymousClass6CY) obj;
                if (this.A00 != r8.A00 || this.A01 != r8.A01 || !AnonymousClass00C.A0J(this.A02, r8.A02) || !AnonymousClass00C.A0J(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90504aG.A0B(this.A03, C36351kA.A05(this.A02, C36321k7.A00(this.A01, this.A00 * 31)));
    }

    public AnonymousClass6CY(C128216Bj r1, String str, int i, long j) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = r1;
        this.A03 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PreConsentBloksGraphQLIntegrityCheckIqResponse(disclosureId=");
        A0u.append(this.A00);
        A0u.append(", ttl=");
        A0u.append(this.A01);
        A0u.append(", pausedStateStatus=");
        A0u.append(this.A02);
        A0u.append(", dfToken=");
        return C36321k7.A0E(this.A03, A0u);
    }
}
