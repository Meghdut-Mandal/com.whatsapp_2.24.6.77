package X;

import java.util.List;

/* renamed from: X.6E6  reason: invalid class name */
public final class AnonymousClass6E6 {
    public final Double A00;
    public final Double A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final boolean A0C;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6E6) {
                AnonymousClass6E6 r5 = (AnonymousClass6E6) obj;
                if (!AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A07, r5.A07) || !AnonymousClass00C.A0J(this.A0A, r5.A0A) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A02, r5.A02) || this.A0C != r5.A0C || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A09, r5.A09) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A0B, r5.A0B) || !AnonymousClass00C.A0J(this.A08, r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A082 = C36381kD.A08(this.A07, C36421kH.A04(this.A06));
        return C36351kA.A05(this.A0B, (((((((((((((((C36381kD.A08(this.A0A, A082) + AnonymousClass000.A0H(this.A04)) * 31) + AnonymousClass000.A0H(this.A03)) * 31) + AnonymousClass000.A0H(this.A02)) * 31) + C36341k9.A01(this.A0C ? 1 : 0)) * 31) + C36341k9.A09(this.A05)) * 31) + C36341k9.A09(this.A09)) * 31) + AnonymousClass000.A0H(this.A00)) * 31) + AnonymousClass000.A0H(this.A01)) * 31) + C36421kH.A05(this.A08);
    }

    public AnonymousClass6E6(Double d, Double d2, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z) {
        C36321k7.A11(str, str2, str3);
        this.A06 = str;
        this.A07 = str2;
        this.A0A = str3;
        this.A04 = num;
        this.A03 = num2;
        this.A02 = num3;
        this.A0C = z;
        this.A05 = str4;
        this.A09 = str5;
        this.A00 = d;
        this.A01 = d2;
        this.A0B = list;
        this.A08 = str6;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BusinessSearchProfile(id=");
        A0u.append(this.A06);
        A0u.append(", jid=");
        A0u.append(this.A07);
        A0u.append(", verifiedName=");
        A0u.append(this.A0A);
        A0u.append(", verificationLevel=");
        A0u.append(this.A04);
        A0u.append(", igFollowers=");
        A0u.append(this.A03);
        A0u.append(", fbFollowers=");
        A0u.append(this.A02);
        A0u.append(", isWelcomeBannerEligible=");
        A0u.append(this.A0C);
        A0u.append(", creationDate=");
        A0u.append(this.A05);
        A0u.append(", subTitle=");
        A0u.append(this.A09);
        A0u.append(", latitude=");
        A0u.append(this.A00);
        A0u.append(", longitude=");
        A0u.append(this.A01);
        A0u.append(", verifiedNameHighlightRanges=");
        A0u.append(this.A0B);
        A0u.append(", rankingId=");
        return C36321k7.A0E(this.A08, A0u);
    }
}
