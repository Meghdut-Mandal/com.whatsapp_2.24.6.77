package X;

/* renamed from: X.6Df  reason: invalid class name and case insensitive filesystem */
public final class C128686Df {
    public final AnonymousClass6QG A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128686Df) {
                C128686Df r5 = (C128686Df) obj;
                if (!AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A05, r5.A05) || this.A07 != r5.A07) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A052 = C36351kA.A05(this.A00, C36381kD.A08(this.A01, C36421kH.A04(this.A04)));
        return C36381kD.A08(this.A05, (((C36381kD.A08(this.A06, A052) + C36341k9.A09(this.A03)) * 31) + C36341k9.A09(this.A02)) * 31) + C36341k9.A01(this.A07 ? 1 : 0);
    }

    public C128686Df(AnonymousClass6QG r1, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.A04 = str;
        this.A01 = str2;
        this.A00 = r1;
        this.A06 = str3;
        this.A03 = str4;
        this.A02 = str5;
        this.A05 = str6;
        this.A07 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BusinessSearchRequestPayload(searchQuery=");
        A0u.append(this.A04);
        A0u.append(", countryCode=");
        A0u.append(this.A01);
        A0u.append(", searchLocation=");
        A0u.append(this.A00);
        A0u.append(", useCase=");
        A0u.append(this.A06);
        A0u.append(", searchId=");
        A0u.append(this.A03);
        A0u.append(", queryId=");
        A0u.append(this.A02);
        A0u.append(", searchSessionId=");
        A0u.append(this.A05);
        A0u.append(", isTest=");
        return C36321k7.A0H(A0u, this.A07);
    }
}
