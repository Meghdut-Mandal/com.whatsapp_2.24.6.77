package X;

import org.json.JSONObject;

/* renamed from: X.9YF  reason: invalid class name */
public final class AnonymousClass9YF {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9YF) {
                AnonymousClass9YF r5 = (AnonymousClass9YF) obj;
                if (!(this.A00 == r5.A00 && this.A02 == r5.A02 && this.A09 == r5.A09 && this.A0B == r5.A0B && this.A0C == r5.A0C && this.A06 == r5.A06 && this.A0A == r5.A0A && this.A03 == r5.A03 && this.A0D == r5.A0D && this.A0E == r5.A0E && this.A01 == r5.A01 && this.A07 == r5.A07 && this.A08 == r5.A08 && this.A04 == r5.A04 && this.A05 == r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C195179Su A00() {
        C195179Su r1 = new C195179Su();
        r1.A00 = this.A00;
        r1.A02 = this.A02;
        r1.A0B = this.A09;
        r1.A0D = this.A0B;
        r1.A0E = this.A0C;
        r1.A06 = this.A06;
        r1.A0C = this.A0A;
        r1.A03 = this.A03;
        r1.A07 = this.A0D;
        r1.A0A = this.A0E;
        r1.A01 = this.A01;
        r1.A08 = this.A07;
        r1.A09 = this.A08;
        r1.A04 = this.A04;
        r1.A05 = this.A05;
        return r1;
    }

    public int hashCode() {
        return C53202qw.A00(C53202qw.A00(C53202qw.A00(C53202qw.A00(C53202qw.A00(C53202qw.A00(C53202qw.A00(C53202qw.A00(C53202qw.A00(C53202qw.A00(C53202qw.A00(C53202qw.A00(C53202qw.A00(this.A00 * 31, this.A02), this.A09), this.A0B), this.A0C), this.A06), this.A0A), this.A03), this.A0D), this.A0E), this.A01), this.A07), this.A08), this.A04) + C36341k9.A01(this.A05 ? 1 : 0);
    }

    public AnonymousClass9YF(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.A00 = i;
        this.A02 = z;
        this.A09 = z2;
        this.A0B = z3;
        this.A0C = z4;
        this.A06 = z5;
        this.A0A = z6;
        this.A03 = z7;
        this.A0D = z8;
        this.A0E = z9;
        this.A01 = z10;
        this.A07 = z11;
        this.A08 = z12;
        this.A04 = z13;
        this.A05 = z14;
    }

    public final JSONObject A01() {
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("brc", this.A00);
        A1B.put("cslm", this.A02);
        A1B.put("fml", this.A09);
        A1B.put("sml", this.A0B);
        A1B.put("tml", this.A0C);
        A1B.put("fbrl", this.A06);
        A1B.put("sbrl", this.A0A);
        A1B.put("dcl", this.A03);
        A1B.put("fcl", this.A0D);
        A1B.put("flcl", this.A0E);
        A1B.put("fkci", this.A01);
        A1B.put("fccl", this.A07);
        A1B.put("fclcl", this.A08);
        A1B.put("fbcl", this.A04);
        A1B.put("fblcl", this.A05);
        return A1B;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ConversionLoggingTracker(bizMessageReplyCount=");
        A0u.append(this.A00);
        A0u.append(", hasCustomerSentLastMessage=");
        A0u.append(this.A02);
        A0u.append(", hasFirstMessageBeenLogged=");
        A0u.append(this.A09);
        A0u.append(", hasSecondMessageBeenLogged=");
        A0u.append(this.A0B);
        A0u.append(", hasThirdMessageBeenLogged=");
        A0u.append(this.A0C);
        A0u.append(", hasFirstBizReplyBeenLogged=");
        A0u.append(this.A06);
        A0u.append(", hasSecondBizReplyBeenLogged=");
        A0u.append(this.A0A);
        A0u.append(", hasDeepConversationBeenLogged=");
        A0u.append(this.A03);
        A0u.append(", hasFirstCallBeenLogged=");
        A0u.append(this.A0D);
        A0u.append(", hasFirstLongCallBeenLogged=");
        A0u.append(this.A0E);
        A0u.append(", hasConsumerInitiatedCall=");
        A0u.append(this.A01);
        A0u.append(", hasFirstCustomerCallBeenLogged=");
        A0u.append(this.A07);
        A0u.append(", hasFirstCustomerLongCallBeenLogged=");
        A0u.append(this.A08);
        A0u.append(", hasFirstBizCallBeenLogged=");
        A0u.append(this.A04);
        A0u.append(", hasFirstBizLongCallBeenLogged=");
        return C36321k7.A0H(A0u, this.A05);
    }
}
