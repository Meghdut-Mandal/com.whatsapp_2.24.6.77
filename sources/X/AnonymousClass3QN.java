package X;

/* renamed from: X.3QN  reason: invalid class name */
public final class AnonymousClass3QN {
    public int A00;
    public int A01;
    public long A02;
    public String A03;
    public boolean A04;
    public boolean A05;

    public AnonymousClass3QN(String str, int i, int i2, long j, boolean z, boolean z2) {
        this.A01 = 0;
        this.A02 = 0;
        this.A03 = "";
        this.A04 = false;
        this.A05 = false;
        this.A00 = 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3QN) {
                AnonymousClass3QN r8 = (AnonymousClass3QN) obj;
                if (!(this.A01 == r8.A01 && this.A02 == r8.A02 && AnonymousClass00C.A0J(this.A03, r8.A03) && this.A04 == r8.A04 && this.A05 == r8.A05 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C53202qw.A00(C53202qw.A00(C36381kD.A08(this.A03, C36321k7.A00(this.A02, this.A01 * 31)), this.A04), this.A05) + this.A00;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GroupTrustSignalInfo(knownContacts=");
        A0u.append(this.A01);
        A0u.append(", sortTimestamp=");
        A0u.append(this.A02);
        A0u.append(", displayName=");
        A0u.append(this.A03);
        A0u.append(", isAdmin=");
        A0u.append(this.A04);
        A0u.append(", isCreatedByMe=");
        A0u.append(this.A05);
        A0u.append(", groupParticipantsCount=");
        return C36321k7.A0G(A0u, this.A00);
    }

    public AnonymousClass3QN() {
        this("", 0, 0, 0, false, false);
    }
}
