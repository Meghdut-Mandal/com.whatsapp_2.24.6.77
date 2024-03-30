package X;

/* renamed from: X.3KM  reason: invalid class name */
public final class AnonymousClass3KM {
    public final C63333Jq A00;
    public final AnonymousClass141 A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final String A06;
    public final String A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3KM) {
                AnonymousClass3KM r5 = (AnonymousClass3KM) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A07, r5.A07) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Boolean bool = this.A03;
        return C36401kF.A02(this.A00, (((((C36351kA.A05(bool, (((C36391kE.A0A(this.A01) + AnonymousClass000.A0H(this.A04)) * 31) + C36341k9.A09(this.A07)) * 31) + C36341k9.A09(this.A06)) * 31) + AnonymousClass000.A0H(this.A02)) * 31) + AnonymousClass000.A0H(this.A05)) * 31);
    }

    public AnonymousClass3KM(C63333Jq r1, AnonymousClass141 r2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2) {
        this.A01 = r2;
        this.A04 = bool;
        this.A07 = str;
        this.A03 = bool2;
        this.A06 = str2;
        this.A02 = bool3;
        this.A05 = bool4;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ContactInfoUiState(contact=");
        A0u.append(this.A01);
        A0u.append(", shouldShowAsVerified=");
        A0u.append(this.A04);
        A0u.append(", titleText=");
        A0u.append(this.A07);
        A0u.append(", setTitleTextMessageYourself=");
        A0u.append(this.A03);
        A0u.append(", pushName=");
        A0u.append(this.A06);
        A0u.append(", isChatPSAJid=");
        A0u.append(this.A02);
        A0u.append(", shouldShowBusinessLayout=");
        A0u.append(this.A05);
        A0u.append(", encryptionInfoViewState=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
