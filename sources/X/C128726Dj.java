package X;

/* renamed from: X.6Dj  reason: invalid class name and case insensitive filesystem */
public final class C128726Dj {
    public final int A00;
    public final AnonymousClass67W A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C128726Dj(AnonymousClass67W r2, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        AnonymousClass00C.A0D(str2, 2);
        this.A02 = str;
        this.A03 = str2;
        this.A00 = i;
        this.A05 = str3;
        this.A04 = str4;
        this.A07 = str5;
        this.A06 = str6;
        this.A01 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128726Dj) {
                C128726Dj r5 = (C128726Dj) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A03, r5.A03) || this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A07, r5.A07) || !AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A042 = C36421kH.A04(this.A02);
        String str = this.A05;
        return C36401kF.A02(this.A01, (((((C36381kD.A08(str, (C36381kD.A08(this.A03, A042) + this.A00) * 31) + C36341k9.A09(this.A04)) * 31) + C36341k9.A09(this.A07)) * 31) + C36421kH.A05(this.A06)) * 31);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AccountLinkingBloksFetcherParams(appId=");
        A0u.append(this.A02);
        A0u.append(", entryPoint=");
        A0u.append(this.A03);
        A0u.append(", accountType=");
        A0u.append(this.A00);
        A0u.append(", accessToken=");
        A0u.append(this.A05);
        A0u.append(", loggingEvent=");
        A0u.append(this.A04);
        A0u.append(", webAuthData=");
        A0u.append(this.A07);
        A0u.append(", opaqueTarget=");
        A0u.append(this.A06);
        A0u.append(", callbacks=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
