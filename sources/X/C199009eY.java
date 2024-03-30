package X;

import android.content.Context;

/* renamed from: X.9eY  reason: invalid class name and case insensitive filesystem */
public final class C199009eY {
    public C183738rH A00;
    public final AnonymousClass17Y A01;
    public final C19600wD A02;
    public final C21159AAt A03;
    public final C194529Qc A04;
    public final AnonymousClass31A A05;
    public final AnonymousClass19A A06;
    public final C19770wU A07;
    public final C32691e2 A08;
    public final C21060yb A09;
    public final C20810yC A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r0.A04 != 1) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r10, android.util.Pair r11, X.C199009eY r12, java.lang.String r13, java.lang.String r14, boolean r15) {
        /*
            r5 = r13
            r1 = 1
            if (r11 == 0) goto L_0x005e
            java.lang.Object r0 = r11.first
            X.6Pu r0 = (X.C131626Pu) r0
            if (r0 == 0) goto L_0x005e
            boolean r0 = r0.A00()
            r7 = r0 ^ 1
        L_0x0010:
            r3 = 3
            if (r11 == 0) goto L_0x001e
            java.lang.Object r0 = r11.second
            X.9Oj r0 = (X.C194169Oj) r0
            if (r0 == 0) goto L_0x001e
            int r0 = r0.A04
            r8 = 1
            if (r0 == r1) goto L_0x001f
        L_0x001e:
            r8 = 0
        L_0x001f:
            X.9Qc r2 = r12.A04
            r9 = r15
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r15)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r2.A00(r1, r0, r3)
            r3 = 0
            if (r11 == 0) goto L_0x005c
            java.lang.Object r0 = r11.second
            X.9Oj r0 = (X.C194169Oj) r0
            if (r0 == 0) goto L_0x005c
            com.whatsapp.jid.UserJid r4 = r0.A0D
        L_0x0038:
            java.lang.String r0 = X.AnonymousClass3U8.A07(r4)
            if (r0 == 0) goto L_0x003f
            r5 = r0
        L_0x003f:
            X.AnonymousClass00C.A0B(r5)
            r6 = r14
            com.whatsapp.PhoneHyperLinkDialogFragment r2 = com.whatsapp.PhoneHyperLinkDialogFragment.A03(r4, r5, r6, r7, r8, r9)
            android.app.Activity r1 = X.C24801Dv.A00(r10)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.DialogActivity"
            X.AnonymousClass00C.A0E(r1, r0)
            X.14u r1 = (X.C225314u) r1
            boolean r0 = r1.BLh()
            if (r0 != 0) goto L_0x005b
            r1.Btl(r2, r3)
        L_0x005b:
            return
        L_0x005c:
            r4 = r3
            goto L_0x0038
        L_0x005e:
            r7 = 1
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199009eY.A00(android.content.Context, android.util.Pair, X.9eY, java.lang.String, java.lang.String, boolean):void");
    }

    public final C173798Tc A01(Context context, AnonymousClass3T1 r12, String str) {
        AnonymousClass3T1 r8 = r12;
        AnonymousClass00C.A0D(r12, 2);
        Context context2 = context;
        if (context == null) {
            return null;
        }
        if (!this.A0A.A0E(1215)) {
            return null;
        }
        String str2 = str;
        if (!AnonymousClass098.A07(str, "tel", false)) {
            return null;
        }
        return new C173798Tc(context2, this.A01, this.A08, this, this.A09, r8, str2);
    }

    public C199009eY(AnonymousClass17Y r1, C32691e2 r2, C19600wD r3, C21159AAt aAt, C194529Qc r5, AnonymousClass31A r6, C21060yb r7, C20810yC r8, AnonymousClass19A r9, C19770wU r10) {
        C36321k7.A1B(r8, r1, r7, r2, r10);
        C36321k7.A1C(r3, r9, aAt, r6, r5);
        this.A0A = r8;
        this.A01 = r1;
        this.A09 = r7;
        this.A08 = r2;
        this.A07 = r10;
        this.A02 = r3;
        this.A06 = r9;
        this.A03 = aAt;
        this.A05 = r6;
        this.A04 = r5;
    }
}
