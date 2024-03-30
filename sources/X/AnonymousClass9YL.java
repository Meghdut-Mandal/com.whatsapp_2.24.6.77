package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9YL  reason: invalid class name */
public final class AnonymousClass9YL {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final long A04;
    public final AnonymousClass9VY A05;
    public final C202319lY A06;
    public final AnonymousClass11F A07;
    public final UserJid A08;
    public final AnonymousClass8SG A09;
    public final AnonymousClass8SX A0A;
    public final AnonymousClass8SX A0B;
    public final C64933Qa A0C;
    public final Long A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;

    public static AnonymousClass8SX A00(AnonymousClass9YL r1) {
        AnonymousClass00C.A0D(r1, 0);
        return r1.A0A;
    }

    public final AnonymousClass9YL A01(AnonymousClass8SX r46) {
        AnonymousClass8SX r22 = r46;
        AnonymousClass00C.A0D(r22, 0);
        AnonymousClass8SX r23 = this.A0B;
        AnonymousClass8SG r21 = this.A09;
        C202319lY r44 = this.A06;
        C64933Qa r24 = this.A0C;
        AnonymousClass11F r43 = this.A07;
        long j = this.A04;
        boolean z = this.A0M;
        boolean z2 = this.A0N;
        boolean z3 = this.A0O;
        int i = this.A00;
        Long l = this.A0D;
        int i2 = this.A01;
        String str = this.A0J;
        String str2 = this.A0L;
        String str3 = this.A0G;
        String str4 = this.A0F;
        String str5 = this.A0H;
        String str6 = this.A0K;
        String str7 = this.A0I;
        String str8 = this.A0E;
        UserJid userJid = this.A08;
        AnonymousClass9VY r2 = this.A05;
        return new AnonymousClass9YL(r2, r44, r43, userJid, r21, r22, r23, r24, l, str, str2, str3, str4, str5, str6, str7, str8, i, i2, j, z, z2, z3, this.A03, this.A02);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9YL) {
                AnonymousClass9YL r8 = (AnonymousClass9YL) obj;
                if (!AnonymousClass00C.A0J(this.A0A, r8.A0A) || !AnonymousClass00C.A0J(this.A0B, r8.A0B) || !AnonymousClass00C.A0J(this.A09, r8.A09) || !AnonymousClass00C.A0J(this.A06, r8.A06) || !AnonymousClass00C.A0J(this.A0C, r8.A0C) || !AnonymousClass00C.A0J(this.A07, r8.A07) || this.A04 != r8.A04 || this.A0M != r8.A0M || this.A0N != r8.A0N || this.A0O != r8.A0O || this.A00 != r8.A00 || !AnonymousClass00C.A0J(this.A0D, r8.A0D) || this.A01 != r8.A01 || !AnonymousClass00C.A0J(this.A0J, r8.A0J) || !AnonymousClass00C.A0J(this.A0L, r8.A0L) || !AnonymousClass00C.A0J(this.A0G, r8.A0G) || !AnonymousClass00C.A0J(this.A0F, r8.A0F) || !AnonymousClass00C.A0J(this.A0H, r8.A0H) || !AnonymousClass00C.A0J(this.A0K, r8.A0K) || !AnonymousClass00C.A0J(this.A0I, r8.A0I) || !AnonymousClass00C.A0J(this.A0E, r8.A0E) || !AnonymousClass00C.A0J(this.A08, r8.A08) || !AnonymousClass00C.A0J(this.A05, r8.A05) || this.A03 != r8.A03 || this.A02 != r8.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final AnonymousClass2bK A02(int i) {
        AnonymousClass2bK r0 = new AnonymousClass2bK(this.A0C, this.A0B.A0o(), 2, this.A01, this.A04);
        r0.A00 = i;
        return r0;
    }

    public final boolean A03() {
        if (this.A0N || this.A0O) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int A0A2 = C36391kE.A0A(this.A0A);
        C64933Qa r0 = this.A0C;
        return ((((((((((((((((((((((((((((((((((C36321k7.A00(this.A04, (C36351kA.A05(r0, (((C36351kA.A05(this.A0B, A0A2) + AnonymousClass000.A0H(this.A09)) * 31) + AnonymousClass000.A0H(this.A06)) * 31) + AnonymousClass000.A0H(this.A07)) * 31) + C36341k9.A01(this.A0M ? 1 : 0)) * 31) + C36341k9.A01(this.A0N ? 1 : 0)) * 31) + C36341k9.A01(this.A0O ? 1 : 0)) * 31) + this.A00) * 31) + AnonymousClass000.A0H(this.A0D)) * 31) + this.A01) * 31) + C36341k9.A09(this.A0J)) * 31) + C36341k9.A09(this.A0L)) * 31) + C36341k9.A09(this.A0G)) * 31) + C36341k9.A09(this.A0F)) * 31) + C36341k9.A09(this.A0H)) * 31) + C36341k9.A09(this.A0K)) * 31) + C36341k9.A09(this.A0I)) * 31) + C36341k9.A09(this.A0E)) * 31) + AnonymousClass000.A0H(this.A08)) * 31) + C36411kG.A09(this.A05)) * 31) + C36341k9.A01(this.A03 ? 1 : 0)) * 31) + C36341k9.A01(this.A02 ? 1 : 0);
    }

    public AnonymousClass9YL(AnonymousClass9VY r3, C202319lY r4, AnonymousClass11F r5, UserJid userJid, AnonymousClass8SG r7, AnonymousClass8SX r8, AnonymousClass8SX r9, C64933Qa r10, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A0A = r8;
        this.A0B = r9;
        this.A09 = r7;
        this.A06 = r4;
        this.A0C = r10;
        this.A07 = r5;
        this.A04 = j;
        this.A0M = z;
        this.A0N = z2;
        this.A0O = z3;
        this.A00 = i;
        this.A0D = l;
        this.A01 = i2;
        this.A0J = str;
        this.A0L = str2;
        this.A0G = str3;
        this.A0F = str4;
        this.A0H = str5;
        this.A0K = str6;
        this.A0I = str7;
        this.A0E = str8;
        this.A08 = userJid;
        this.A05 = r3;
        this.A03 = z4;
        this.A02 = z5;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ParseE2EMessageParams(e2eMessage=");
        A0u.append(this.A0A);
        A0u.append(", originalE2eMessage=");
        A0u.append(this.A0B);
        A0u.append(", contextInfo=");
        A0u.append(this.A09);
        A0u.append(", paymentTransactionInfo=");
        A0u.append(this.A06);
        A0u.append(", messageKey=");
        A0u.append(this.A0C);
        A0u.append(", chatJid=");
        A0u.append(this.A07);
        A0u.append(", timestamp=");
        A0u.append(this.A04);
        A0u.append(", includeQuotedMessage=");
        A0u.append(this.A0M);
        A0u.append(", isHistorySyncMessage=");
        A0u.append(this.A0N);
        A0u.append(", isQuotedMessage=");
        A0u.append(this.A0O);
        A0u.append(", durationSeconds=");
        A0u.append(this.A00);
        A0u.append(", csatTriggerExpiryMillis=");
        A0u.append(this.A0D);
        A0u.append(", editedVersion=");
        A0u.append(this.A01);
        A0u.append(", messageTypeAttribute=");
        A0u.append(this.A0J);
        A0u.append(", pollTypeAttribute=");
        A0u.append(this.A0L);
        A0u.append(", eventTypeAttribute=");
        A0u.append(this.A0G);
        A0u.append(", counterAbuseToken=");
        A0u.append(this.A0F);
        A0u.append(", hsmCategory=");
        A0u.append(this.A0H);
        A0u.append(", nativeFlowName=");
        A0u.append(this.A0K);
        A0u.append(", hsmTag=");
        A0u.append(this.A0I);
        A0u.append(", commentThreadMsgId=");
        A0u.append(this.A0E);
        A0u.append(", commentMsgSenderJid=");
        A0u.append(this.A08);
        A0u.append(", reportingInfo=");
        A0u.append(this.A05);
        A0u.append(", skipCommentFlagProcessing=");
        A0u.append(this.A03);
        A0u.append(", isPremiumMessage=");
        return C36321k7.A0H(A0u, this.A02);
    }
}
