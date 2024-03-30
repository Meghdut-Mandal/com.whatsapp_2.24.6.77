package X;

/* renamed from: X.9Wg  reason: invalid class name and case insensitive filesystem */
public final class C195839Wg {
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195839Wg) {
                C195839Wg r8 = (C195839Wg) obj;
                if (!AnonymousClass00C.A0J(this.A03, r8.A03) || !AnonymousClass00C.A0J(this.A02, r8.A02) || this.A01 != r8.A01 || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36341k9.A02(this.A00, C36321k7.A00(this.A01, C36381kD.A08(this.A02, C36421kH.A04(this.A03))));
    }

    public C195839Wg(long j, String str, long j2, String str2) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = j;
        this.A00 = j2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("InternationalPaymentState(credentialId=");
        A0u.append(this.A03);
        A0u.append(", activationStatus=");
        A0u.append(this.A02);
        A0u.append(", startTime=");
        A0u.append(this.A01);
        A0u.append(", endTime=");
        return C36331k8.A0j(A0u, this.A00);
    }
}
