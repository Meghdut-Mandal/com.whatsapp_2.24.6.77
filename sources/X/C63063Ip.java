package X;

/* renamed from: X.3Ip  reason: invalid class name and case insensitive filesystem */
public final class C63063Ip {
    public final long A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63063Ip) {
                C63063Ip r8 = (C63063Ip) obj;
                if (!AnonymousClass00C.A0J(this.A01, r8.A01) || !AnonymousClass00C.A0J(this.A02, r8.A02) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36341k9.A02(this.A00, C36381kD.A08(this.A02, C36341k9.A09(this.A01) * 31));
    }

    public C63063Ip(long j, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AccountLogoutRequestEventData(newDeviceName=");
        A0u.append(this.A01);
        A0u.append(", serverToken=");
        A0u.append(this.A02);
        A0u.append(", newAccountLoginAttemptTimestamp=");
        return C36331k8.A0j(A0u, this.A00);
    }
}
