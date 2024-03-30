package X;

/* renamed from: X.6Cs  reason: invalid class name and case insensitive filesystem */
public final class C128556Cs {
    public final int A00;
    public final long A01;
    public final C134876bk A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128556Cs) {
                C128556Cs r8 = (C128556Cs) obj;
                if (this.A01 != r8.A01 || !AnonymousClass00C.A0J(this.A03, r8.A03) || !AnonymousClass00C.A0J(this.A02, r8.A02) || this.A00 != r8.A00 || !AnonymousClass00C.A0J(this.A04, r8.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((C90464aC.A08(this.A01) + C36341k9.A09(this.A03)) * 31) + AnonymousClass000.A0H(this.A02)) * 31) + this.A00) * 31) + C36421kH.A05(this.A04);
    }

    public C128556Cs(C134876bk r1, String str, String str2, int i, long j) {
        this.A01 = j;
        this.A03 = str;
        this.A02 = r1;
        this.A00 = i;
        this.A04 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("XFamilyStatusCrosspostingInfo(messageRowId=");
        A0u.append(this.A01);
        A0u.append(", crosspostingSessionId=");
        A0u.append(this.A03);
        A0u.append(", crosspostingStatusEnforcedEncryptedUniqueId=");
        A0u.append(this.A02);
        A0u.append(", state=");
        A0u.append(this.A00);
        A0u.append(", mediaPath=");
        return C36321k7.A0E(this.A04, A0u);
    }
}
