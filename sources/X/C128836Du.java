package X;

import java.util.List;

/* renamed from: X.6Du  reason: invalid class name and case insensitive filesystem */
public final class C128836Du {
    public final C131426Oz A00;
    public final Double A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;
    public final List A08;
    public final List A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128836Du) {
                C128836Du r5 = (C128836Du) obj;
                if (!AnonymousClass00C.A0J(this.A07, r5.A07) || !AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A09, r5.A09) || !AnonymousClass00C.A0J(this.A08, r5.A08) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A052 = C36351kA.A05(this.A09, C36351kA.A05(this.A06, C36391kE.A0A(this.A07)));
        return C36401kF.A02(this.A00, (((((((((C36351kA.A05(this.A08, A052) + C36341k9.A09(this.A03)) * 31) + C36341k9.A09(this.A05)) * 31) + AnonymousClass000.A0H(this.A01)) * 31) + C36341k9.A09(this.A04)) * 31) + C36421kH.A05(this.A02)) * 31);
    }

    public C128836Du(C131426Oz r1, Double d, String str, String str2, String str3, String str4, List list, List list2, List list3, List list4) {
        this.A07 = list;
        this.A06 = list2;
        this.A09 = list3;
        this.A08 = list4;
        this.A03 = str;
        this.A05 = str2;
        this.A01 = d;
        this.A04 = str3;
        this.A02 = str4;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BusinessSearchResult(categories=");
        A0u.append(this.A07);
        A0u.append(", apiBusinesses=");
        A0u.append(this.A06);
        A0u.append(", localBusinesses=");
        A0u.append(this.A09);
        A0u.append(", filterCategories=");
        A0u.append(this.A08);
        A0u.append(", pageId=");
        A0u.append(this.A03);
        A0u.append(", requestId=");
        A0u.append(this.A05);
        A0u.append(", proximityWeight=");
        A0u.append(this.A01);
        A0u.append(", rankingLogicVer=");
        A0u.append(this.A04);
        A0u.append(", csvmConfig=");
        A0u.append(this.A02);
        A0u.append(", serpMapViewResult=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
