package X;

import java.util.Date;

/* renamed from: X.6Dt  reason: invalid class name and case insensitive filesystem */
public final class C128826Dt {
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final Date A07;
    public final Date A08;
    public final C206759tv A09;

    public C128826Dt(C206759tv r2, String str, String str2, String str3, String str4, String str5, Date date, Date date2, int i, long j) {
        AnonymousClass00C.A0D(str3, 3);
        this.A06 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A00 = i;
        this.A01 = j;
        this.A08 = date;
        this.A07 = date2;
        this.A02 = str4;
        this.A04 = str5;
        this.A09 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128826Dt) {
                C128826Dt r8 = (C128826Dt) obj;
                if (!AnonymousClass00C.A0J(this.A06, r8.A06) || !AnonymousClass00C.A0J(this.A05, r8.A05) || !AnonymousClass00C.A0J(this.A03, r8.A03) || this.A00 != r8.A00 || this.A01 != r8.A01 || !AnonymousClass00C.A0J(this.A08, r8.A08) || !AnonymousClass00C.A0J(this.A07, r8.A07) || !AnonymousClass00C.A0J(this.A02, r8.A02) || !AnonymousClass00C.A0J(this.A04, r8.A04) || !AnonymousClass00C.A0J(this.A09, r8.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A082 = C36381kD.A08(this.A05, C36421kH.A04(this.A06));
        long j = this.A01;
        return C36381kD.A08(this.A04, C36381kD.A08(this.A02, (((C36321k7.A00(j, (C36381kD.A08(this.A03, A082) + this.A00) * 31) + AnonymousClass000.A0H(this.A08)) * 31) + AnonymousClass000.A0H(this.A07)) * 31)) + C36411kG.A09(this.A09);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Promotion(promotionId=");
        C90494aF.A1N(A0u, this.A06);
        A0u.append(this.A05);
        A0u.append(", discount=");
        A0u.append(this.A03);
        A0u.append(", discountType=");
        A0u.append(this.A00);
        A0u.append(", minimumCartPrice=");
        A0u.append(this.A01);
        A0u.append(", startDate=");
        A0u.append(this.A08);
        A0u.append(", endDate=");
        A0u.append(this.A07);
        A0u.append(", description=");
        A0u.append(this.A02);
        A0u.append(", moreInfo=");
        A0u.append(this.A04);
        A0u.append(", media=");
        return AnonymousClass000.A0m(this.A09, A0u);
    }
}
