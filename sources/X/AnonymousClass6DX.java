package X;

/* renamed from: X.6DX  reason: invalid class name */
public final class AnonymousClass6DX {
    public final int A00;
    public final long A01;
    public final C108475Tq A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6DX) {
                AnonymousClass6DX r8 = (AnonymousClass6DX) obj;
                if (this.A01 != r8.A01 || !AnonymousClass00C.A0J(this.A06, r8.A06) || !AnonymousClass00C.A0J(this.A05, r8.A05) || !AnonymousClass00C.A0J(this.A04, r8.A04) || !AnonymousClass00C.A0J(this.A03, r8.A03) || this.A00 != r8.A00 || this.A02 != r8.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A02, (((((((((C90464aC.A08(this.A01) + C36341k9.A09(this.A06)) * 31) + C36341k9.A09(this.A05)) * 31) + C36341k9.A09(this.A04)) * 31) + C36421kH.A05(this.A03)) * 31) + this.A00) * 31);
    }

    public AnonymousClass6DX(C108475Tq r1, String str, String str2, String str3, String str4, int i, long j) {
        this.A01 = j;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A03 = str4;
        this.A00 = i;
        this.A02 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StatusCrosspostingInfo(messageRowId=");
        A0u.append(this.A01);
        A0u.append(", crosspostingSessionId=");
        A0u.append(this.A06);
        A0u.append(", uniqueId=");
        A0u.append(this.A05);
        A0u.append(", mediaFilePath=");
        A0u.append(this.A04);
        A0u.append(", directUrlPath=");
        A0u.append(this.A03);
        A0u.append(", state=");
        A0u.append(this.A00);
        A0u.append(", destination=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
