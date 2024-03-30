package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.2KN  reason: invalid class name */
public final class AnonymousClass2KN extends C196209Yd {
    public final C19700wN A00;
    public final C25791Hr A01;
    public final C20810yC A02;
    public final C25121Fb A03;
    public final AnonymousClass1JN A04;
    public final C194729Qz A05;
    public final AnonymousClass3DP A06;
    public final C19770wU A07;
    public final C64993Qh A08;
    public final AnonymousClass3CV A09;
    public final C30961b3 A0A;
    public final AnonymousClass005 A0B;

    public String A05() {
        return "cta_url";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r17 == null) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f7 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(android.app.Activity r23, X.AnonymousClass3T1 r24, X.C206969uL r25, int r26) {
        /*
            r22 = this;
            r0 = 0
            r10 = r23
            X.AnonymousClass00C.A0D(r10, r0)
            r0 = 2
            r12 = r24
            r1 = r25
            X.C36341k9.A1E(r12, r0, r1)
            boolean r0 = r12 instanceof X.C23043B1o
            if (r0 == 0) goto L_0x00bc
            java.lang.String r0 = r1.A01
            r1 = 0
            if (r0 == 0) goto L_0x00d1
            org.json.JSONObject r3 = X.C36441kJ.A1C(r0)
            java.lang.String r0 = "url"
            java.lang.String r17 = r3.optString(r0)
            if (r17 != 0) goto L_0x00bd
        L_0x0023:
            java.lang.String r17 = ""
            if (r3 != 0) goto L_0x00bd
            r14 = r1
            r4 = r1
        L_0x0029:
            java.lang.String r16 = ""
            X.3P8 r13 = new X.3P8
            r19 = 2
            r5 = r26
            r15 = r13
            r18 = r14
            r20 = r5
            r15.<init>(r16, r17, r18, r19, r20)
            r2 = r22
            X.0yC r6 = r2.A02
            r0 = 5970(0x1752, float:8.366E-42)
            boolean r0 = r6.A0E(r0)
            r15 = 1
            if (r0 == 0) goto L_0x005a
            if (r3 == 0) goto L_0x005a
            java.lang.String r0 = "webview_presentation"
            java.lang.String r3 = r3.optString(r0)
            if (r3 == 0) goto L_0x005a
            boolean r0 = X.AnonymousClass098.A06(r3)
            r0 = r0 ^ 1
            if (r0 != r15) goto L_0x005a
            r13.A03 = r3
        L_0x005a:
            com.whatsapp.jid.UserJid r7 = r12.A0L()
            if (r7 == 0) goto L_0x0066
            X.1Hr r3 = r2.A01
            r0 = 0
            r3.A01(r7, r12, r0)
        L_0x0066:
            r3 = 4194304(0x400000, float:5.877472E-39)
            int r0 = r12.A0A
            r0 = r0 & r3
            boolean r0 = X.AnonymousClass000.A1S(r0, r3)
            if (r0 != 0) goto L_0x00f7
            r3 = 2097152(0x200000, float:2.938736E-39)
            int r0 = r12.A0A
            r0 = r0 & r3
            boolean r0 = X.AnonymousClass000.A1S(r0, r3)
            if (r0 != 0) goto L_0x00f7
            com.whatsapp.jid.UserJid r1 = r12.A0L()
            boolean r0 = X.C203369nr.A07(r12)
            if (r0 == 0) goto L_0x009a
            X.0wU r3 = r2.A07
            r21 = 8
            X.3vW r0 = new X.3vW
            r16 = r0
            r17 = r2
            r18 = r12
            r19 = r13
            r16.<init>(r17, r18, r19, r20, r21)
            r3.Boy(r0)
        L_0x009a:
            java.lang.String r0 = "ctwa_auto_reply"
            boolean r0 = X.AnonymousClass00C.A0J(r4, r0)
            if (r0 == 0) goto L_0x00a9
            X.3CV r3 = r2.A09
            java.lang.String r0 = "cta_url"
            r3.A00(r1, r0)
        L_0x00a9:
            X.3Qh r9 = r2.A08
            boolean r0 = r9.A04(r12)
            if (r0 == 0) goto L_0x00d4
            r11 = 0
            r9.A02(r10, r11, r12, r13, r14, r15)
            if (r1 == 0) goto L_0x00bc
            X.1b3 r0 = r2.A0A
            r0.A01(r1)
        L_0x00bc:
            return
        L_0x00bd:
            java.lang.String r0 = "merchant_url"
            java.lang.String r1 = r3.optString(r0)
            java.lang.String r0 = "consented_users_url"
            java.lang.String r14 = r3.optString(r0)
            java.lang.String r0 = "message_origin"
            java.lang.String r4 = r3.optString(r0)
            goto L_0x0029
        L_0x00d1:
            r3 = r1
            goto L_0x0023
        L_0x00d4:
            if (r14 == 0) goto L_0x00f3
            int r0 = r14.length()
            if (r0 == 0) goto L_0x00f3
            if (r1 == 0) goto L_0x00f3
            X.005 r0 = r2.A0B
            java.lang.Object r0 = r0.get()
            X.1az r0 = (X.C30921az) r0
            boolean r0 = r0.A04(r1)
            if (r0 == 0) goto L_0x00f3
            r13.A01 = r14
            X.1b3 r0 = r2.A0A
            r0.A01(r1)
        L_0x00f3:
            r9.A03(r10, r12, r13)
            return
        L_0x00f7:
            if (r1 == 0) goto L_0x00ff
            boolean r0 = X.AnonymousClass098.A06(r1)
            if (r0 == 0) goto L_0x0101
        L_0x00ff:
            java.lang.String r1 = r13.A01
        L_0x0101:
            X.AnonymousClass00C.A0B(r1)
            java.lang.String r7 = r13.A01
            X.AnonymousClass00C.A07(r7)
            java.lang.String r4 = "UrlAction"
            r0 = 6626(0x19e2, float:9.285E-42)
            java.lang.String r9 = X.C36431kI.A19(r6, r0)
            boolean r0 = X.AnonymousClass00C.A0J(r1, r7)
            if (r0 != 0) goto L_0x0155
            boolean r0 = X.AnonymousClass098.A06(r9)
            if (r0 != 0) goto L_0x0155
            r3 = 0
            java.net.URI r8 = new java.net.URI     // Catch:{ URISyntaxException -> 0x014d }
            r8.<init>(r7)     // Catch:{ URISyntaxException -> 0x014d }
            java.lang.String r7 = r8.getScheme()     // Catch:{ URISyntaxException -> 0x014d }
            java.lang.String r0 = "https"
            if (r7 == 0) goto L_0x0145
            boolean r0 = r7.equalsIgnoreCase(r0)     // Catch:{ URISyntaxException -> 0x014d }
            if (r0 == 0) goto L_0x0145
            java.lang.String r0 = r8.getHost()     // Catch:{ URISyntaxException -> 0x014d }
            if (r0 == 0) goto L_0x013d
            boolean r0 = r0.equalsIgnoreCase(r9)     // Catch:{ URISyntaxException -> 0x014d }
            if (r0 != 0) goto L_0x0155
        L_0x013d:
            X.0wN r1 = r2.A00     // Catch:{ URISyntaxException -> 0x014d }
            java.lang.String r0 = "Trackable link domain mismatch"
            r1.A0E(r4, r0, r3)     // Catch:{ URISyntaxException -> 0x014d }
            return
        L_0x0145:
            X.0wN r1 = r2.A00     // Catch:{ URISyntaxException -> 0x014d }
            java.lang.String r0 = "Trackable link protocol mismatch"
            r1.A0E(r4, r0, r3)     // Catch:{ URISyntaxException -> 0x014d }
            return
        L_0x014d:
            X.0wN r1 = r2.A00
            java.lang.String r0 = "Trackable link uri syntax invalid"
            r1.A0E(r4, r0, r3)
            return
        L_0x0155:
            r0 = 5044(0x13b4, float:7.068E-42)
            boolean r0 = r6.A0E(r0)
            if (r0 == 0) goto L_0x01b1
            r0 = 6693(0x1a25, float:9.379E-42)
            boolean r0 = r6.A0E(r0)
            r4 = 0
            if (r0 == 0) goto L_0x01a9
            r0 = 2131895523(0x7f1224e3, float:1.9425881E38)
            java.lang.String r3 = X.C36361kB.A0m(r10, r0)
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r4] = r1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r15)
            java.lang.String r0 = java.lang.String.format(r3, r0)
            X.AnonymousClass00C.A08(r0)
            android.text.Spanned r0 = X.C05480Pw.A00(r0)
        L_0x0180:
            X.AnonymousClass00C.A0B(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            X.1qm r4 = X.C39001qm.A01(r10, r0)
            r1 = 2131895521(0x7f1224e1, float:1.9425877E38)
            r3 = r10
            X.012 r3 = (X.AnonymousClass012) r3
            X.3b1 r0 = X.C67903b1.A00
            r4.A0l(r3, r0, r1)
            r1 = 2131895524(0x7f1224e4, float:1.9425883E38)
            X.3au r0 = new X.3au
            r6 = r0
            r7 = r10
            r8 = r2
            r9 = r12
            r10 = r13
            r11 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            r4.A0m(r3, r0, r1)
            X.C36341k9.A11(r4)
            return
        L_0x01a9:
            r0 = 2131895522(0x7f1224e2, float:1.942588E38)
            java.lang.String r0 = X.C36351kA.A0w(r10, r1, r15, r0)
            goto L_0x0180
        L_0x01b1:
            A00(r10, r2, r12, r13, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2KN.A08(android.app.Activity, X.3T1, X.9uL, int):void");
    }

    public static final void A00(Activity activity, AnonymousClass2KN r5, AnonymousClass3T1 r6, AnonymousClass3P8 r7, int i) {
        if (AnonymousClass000.A1S(r6.A0A & 4194304, 4194304)) {
            r5.A03.A01(AnonymousClass3IP.A00(new C25111Fa[]{C25111Fa.SKIP_ADDONS, C25111Fa.SKIP_THUMBNAILS}), r6, new C81333wq(r5, i, 21, r6));
        }
        r5.A08.A03(activity, r6, r7);
    }

    public void A09(Activity activity, AnonymousClass3T1 r3, C206969uL r4, Class cls) {
        throw new UnsupportedOperationException();
    }

    public AnonymousClass2KN(C19700wN r2, C25791Hr r3, C64993Qh r4, AnonymousClass3CV r5, C20810yC r6, C25121Fb r7, AnonymousClass1JN r8, C194729Qz r9, C30961b3 r10, AnonymousClass3DP r11, C19770wU r12, AnonymousClass005 r13) {
        C36321k7.A1B(r6, r2, r12, r11, r7);
        C36321k7.A14(r8, r10, r13);
        AnonymousClass00C.A0D(r3, 11);
        this.A02 = r6;
        this.A00 = r2;
        this.A07 = r12;
        this.A06 = r11;
        this.A03 = r7;
        this.A08 = r4;
        this.A05 = r9;
        this.A04 = r8;
        this.A0A = r10;
        this.A0B = r13;
        this.A01 = r3;
        this.A09 = r5;
    }

    public int A03() {
        return R.drawable.ic_link_action;
    }

    public String A06(Context context, C206969uL r3) {
        return C36421kH.A0b(r3);
    }

    public boolean A0B(C20810yC r2, AnonymousClass8SX r3) {
        return C36351kA.A1Z(r2);
    }

    public boolean A0C(C20810yC r2, AnonymousClass8SX r3) {
        return C36351kA.A1Z(r2);
    }
}
