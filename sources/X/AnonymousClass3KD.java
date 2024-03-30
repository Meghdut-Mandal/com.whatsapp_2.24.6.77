package X;

/* renamed from: X.3KD  reason: invalid class name */
public final class AnonymousClass3KD {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3KD) {
                AnonymousClass3KD r5 = (AnonymousClass3KD) obj;
                if (!(this.A00 == r5.A00 && AnonymousClass00C.A0J(this.A02, r5.A02) && this.A05 == r5.A05 && this.A04 == r5.A04 && AnonymousClass00C.A0J(this.A03, r5.A03) && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C53202qw.A00(C53202qw.A00(((this.A00 * 31) + C36341k9.A09(this.A02)) * 31, this.A05), this.A04) + C36421kH.A05(this.A03)) * 31) + this.A01;
    }

    public AnonymousClass3KD(String str, String str2, int i, int i2, boolean z, boolean z2) {
        this.A00 = i;
        this.A02 = str;
        this.A05 = z;
        this.A04 = z2;
        this.A03 = str2;
        this.A01 = i2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FetchDeviceConfirmationResult(status=");
        A0u.append(this.A00);
        A0u.append(", login=");
        A0u.append(this.A02);
        A0u.append(", newJid=");
        A0u.append(this.A05);
        A0u.append(", firstPartyMigrationInitiated=");
        A0u.append(this.A04);
        A0u.append(", retryAfter=");
        A0u.append(this.A03);
        A0u.append(", wamsysFailureReason=");
        return C36321k7.A0G(A0u, this.A01);
    }
}
