package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1YM  reason: invalid class name */
public class AnonymousClass1YM {
    public final C19630wG A00;
    public final AnonymousClass1EV A01;
    public final C19770wU A02;
    public final C25271Fq A03;
    public final AnonymousClass16S A04;
    public final AnonymousClass1EW A05;
    public final C24601Db A06;
    public final AnonymousClass1EU A07;
    public final AnonymousClass1CR A08;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068 A[Catch:{ JSONException -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0069 A[Catch:{ JSONException -> 0x0077 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass1YM r10) {
        /*
            X.1EV r1 = r10.A01
            r0 = 0
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x00ce
            X.1Db r6 = r10.A06
            android.content.SharedPreferences r1 = r6.A03()
            java.lang.String r0 = "payment_kyc_info"
            r3 = 0
            java.lang.String r2 = r1.getString(r0, r3)
            if (r2 == 0) goto L_0x0075
            boolean r0 = X.AnonymousClass14B.A0F(r2)
            if (r0 != 0) goto L_0x007c
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0077 }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x0077 }
            java.lang.String r0 = "state"
            java.lang.String r7 = r1.getString(r0)     // Catch:{ JSONException -> 0x0077 }
            java.lang.String r0 = "rejection-code"
            r9 = -1
            int r8 = r1.optInt(r0, r9)     // Catch:{ JSONException -> 0x0077 }
            java.lang.String r0 = "actions-requested"
            org.json.JSONObject r1 = r1.optJSONObject(r0)     // Catch:{ JSONException -> 0x0077 }
            if (r1 == 0) goto L_0x0065
            java.lang.String r0 = "obligation"
            java.lang.String r5 = r1.getString(r0)     // Catch:{ JSONException -> 0x0060 }
            java.lang.String r0 = "actions"
            org.json.JSONArray r4 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x0060 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0060 }
            r2.<init>()     // Catch:{ JSONException -> 0x0060 }
            r1 = 0
        L_0x004a:
            int r0 = r4.length()     // Catch:{ JSONException -> 0x0060 }
            if (r1 >= r0) goto L_0x005a
            java.lang.String r0 = r4.getString(r1)     // Catch:{ JSONException -> 0x0060 }
            r2.add(r0)     // Catch:{ JSONException -> 0x0060 }
            int r1 = r1 + 1
            goto L_0x004a
        L_0x005a:
            X.9u8 r1 = new X.9u8     // Catch:{ JSONException -> 0x0060 }
            r1.<init>(r5, r2)     // Catch:{ JSONException -> 0x0060 }
            goto L_0x0066
        L_0x0060:
            java.lang.String r0 = "PAY: PaymentKycActionsRequested fromJsonString threw exception"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ JSONException -> 0x0077 }
        L_0x0065:
            r1 = 0
        L_0x0066:
            if (r8 == r9) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r0 = r3
            goto L_0x006f
        L_0x006b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ JSONException -> 0x0077 }
        L_0x006f:
            X.9uc r4 = new X.9uc     // Catch:{ JSONException -> 0x0077 }
            r4.<init>(r1, r0, r7)     // Catch:{ JSONException -> 0x0077 }
            goto L_0x007d
        L_0x0075:
            r4 = r3
            goto L_0x007d
        L_0x0077:
            java.lang.String r0 = "PAY: PaymentKycInfo fromJsonString threw exception"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x007c:
            r4 = r3
        L_0x007d:
            android.content.SharedPreferences r2 = r6.A03()
            java.lang.String r1 = "payment_kyc_update_ack"
            r0 = 1
            boolean r0 = r2.getBoolean(r1, r0)
            if (r4 == 0) goto L_0x00c5
            if (r0 != 0) goto L_0x00c5
            java.lang.String r1 = r4.A02
            java.lang.String r0 = "PENDING"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ae
            X.0wG r0 = r10.A00
            android.content.Context r1 = r0.A00
            r0 = 2131891719(0x7f121607, float:1.9418166E38)
            java.lang.String r2 = r1.getString(r0)
            r0 = 2131891718(0x7f121606, float:1.9418164E38)
        L_0x00a4:
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "KYC"
            A02(r10, r2, r1, r0, r3)
            return
        L_0x00ae:
            java.lang.String r0 = "COMPLETED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ce
            X.0wG r0 = r10.A00
            android.content.Context r1 = r0.A00
            r0 = 2131891717(0x7f121605, float:1.9418162E38)
            java.lang.String r2 = r1.getString(r0)
            r0 = 2131891716(0x7f121604, float:1.941816E38)
            goto L_0x00a4
        L_0x00c5:
            X.1Fq r2 = r10.A03
            r1 = 26
            java.lang.String r0 = "PAYMENTS_KYC_UPDATE"
            r2.A03(r1, r0)
        L_0x00ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1YM.A00(X.1YM):void");
    }

    public static void A01(AnonymousClass1YM r8, String str) {
        if (r8.A01.A04(0)) {
            ArrayList arrayList = new ArrayList();
            AnonymousClass1EW r0 = r8.A05;
            if (str != null) {
                C21667AUj A032 = r0.A03(str);
                if (A032 != null) {
                    arrayList.add(A032);
                } else {
                    r8.A03.A04(28, str, "PAYMENTS_STEP_UP_UPDATE");
                }
            } else {
                arrayList.addAll(r0.A04());
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C21667AUj aUj = (C21667AUj) it.next();
                C206359tF r3 = aUj.A03;
                boolean z = r8.A06.A03().getBoolean("payment_step_up_update_ack", true);
                if (r3 == null || z) {
                    r8.A03.A04(28, str, "PAYMENTS_STEP_UP_UPDATE");
                    return;
                }
                A02(r8, aUj.A08, aUj.A05, "STEP_UP", aUj.A06);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0071, code lost:
        r5 = new android.content.Intent(r4, r0);
        r5.addFlags(335544320);
        r5.putExtra("notification-type", "ALIAS_DEREGISTER");
        r1 = r14.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0082, code lost:
        if (r1.A06() == null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x008a, code lost:
        if (r1.A06().A08 == null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008c, code lost:
        r5.putExtra("extra_payment_name", r1.A06().A08.A08());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009b, code lost:
        r2.A0D = X.C65743Th.A00(r4, 0, r5, 134217728);
        r14.A03.A02(47, r2.A05());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ac, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00ad, code lost:
        r0 = r14.A07.A05().BFl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b7, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b9, code lost:
        r1 = new android.content.Intent(r4, r0);
        r1.addFlags(335544320);
        r1.putExtra("notification-type", "STEP_UP");
        r5 = r18;
        r1.putExtra("step-up-id", r5);
        r2.A0D = X.C65743Th.A00(r4, 0, r1, 134217728);
        r14.A03.A07(r5, 28, r2.A05());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00dc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00dd, code lost:
        r1 = r14.A07.A05().BFl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00e7, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e9, code lost:
        r0 = new android.content.Intent(r4, r1);
        r0.addFlags(335544320);
        r0.putExtra("notification-type", "DOC_VERIF_SUCCESS");
        r0 = X.C65743Th.A00(r4, 0, r0, 134217728);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0117, code lost:
        if (r0 == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x011b, code lost:
        r0 = new android.content.Intent(r4, r14.A07.A05().BFl());
        r0.addFlags(335544320);
        r2.A0D = X.C65743Th.A00(r4, 0, r0, 0);
        r14.A03.A02(26, r2.A05());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x013c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x013d, code lost:
        r1 = new android.content.Intent("android.intent.action.VIEW");
        r1.addFlags(335544320);
        r1.putExtra("notification-type", "DOC_VERIF_FAILURE");
        r1.setData(android.net.Uri.parse("https://faq.whatsapp.com/general/payments/learn-more-about-identity-documents-br"));
        r0 = X.C65743Th.A00(r4, 0, r1, 134217728);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0157, code lost:
        r2.A0D = r0;
        r14.A03.A02(37, r2.A05());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0162, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0061, code lost:
        switch(r13) {
            case 0: goto L_0x0065;
            case 1: goto L_0x00ad;
            case 2: goto L_0x00dd;
            case 3: goto L_0x013d;
            case 4: goto L_0x011b;
            default: goto L_0x0064;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0065, code lost:
        r0 = r14.A07.A05().BFh();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006f, code lost:
        if (r0 == null) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.AnonymousClass1YM r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
        /*
            X.0wG r0 = r14.A00
            android.content.Context r4 = r0.A00
            X.0Yy r2 = X.C20600xp.A02(r4)
            java.lang.String r0 = "status"
            r2.A0L = r0
            r13 = 1
            r2.A09 = r13
            r2.A0I(r13)
            r0 = 4
            r2.A06(r0)
            r3 = 0
            r2.A0A = r3
            r1 = 2131231578(0x7f08035a, float:1.807924E38)
            android.app.Notification r0 = r2.A0B
            r0.icon = r1
            r2.A0F(r15)
            r1 = r16
            r2.A0E(r1)
            androidx.core.app.NotificationCompat$BigTextStyle r0 = new androidx.core.app.NotificationCompat$BigTextStyle
            r0.<init>()
            r0.A0C(r1)
            r2.A0C(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            if (r0 < r7) goto L_0x0047
            X.1CR r0 = r14.A08
            X.3LI r0 = r0.A0R()
            X.2dt r0 = (X.C47192dt) r0
            java.lang.String r0 = r0.A0E()
            r2.A0M = r0
        L_0x0047:
            r5 = r17
            int r0 = r5.hashCode()
            java.lang.String r12 = "DOC_VERIF_FAILURE"
            java.lang.String r10 = "DOC_VERIF_SUCCESS"
            java.lang.String r11 = "STEP_UP"
            java.lang.String r1 = "ALIAS_DEREGISTER"
            switch(r0) {
                case -1986195565: goto L_0x00f9;
                case -1175556882: goto L_0x00ff;
                case -1094966371: goto L_0x0104;
                case -314370780: goto L_0x010a;
                case 74901: goto L_0x0110;
                default: goto L_0x0058;
            }
        L_0x0058:
            r13 = -1
        L_0x0059:
            r5 = 37
            r8 = 134217728(0x8000000, float:3.85186E-34)
            java.lang.String r9 = "notification-type"
            r6 = 335544320(0x14000000, float:6.4623485E-27)
            switch(r13) {
                case 0: goto L_0x0065;
                case 1: goto L_0x00ad;
                case 2: goto L_0x00dd;
                case 3: goto L_0x013d;
                case 4: goto L_0x011b;
                default: goto L_0x0064;
            }
        L_0x0064:
            return
        L_0x0065:
            X.1EU r0 = r14.A07
            X.B66 r0 = r0.A05()
            java.lang.Class r0 = r0.BFh()
            if (r0 == 0) goto L_0x0064
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r4, r0)
            r5.addFlags(r6)
            r5.putExtra(r9, r1)
            X.16S r1 = r14.A04
            X.9un r0 = r1.A06()
            if (r0 == 0) goto L_0x009b
            X.9un r0 = r1.A06()
            X.8bF r0 = r0.A08
            if (r0 == 0) goto L_0x009b
            X.9un r0 = r1.A06()
            X.8bF r0 = r0.A08
            X.6c7 r1 = r0.A08()
            java.lang.String r0 = "extra_payment_name"
            r5.putExtra(r0, r1)
        L_0x009b:
            android.app.PendingIntent r0 = X.C65743Th.A00(r4, r3, r5, r8)
            r2.A0D = r0
            android.app.Notification r2 = r2.A05()
            X.1Fq r1 = r14.A03
            r0 = 47
            r1.A02(r0, r2)
            return
        L_0x00ad:
            X.1EU r0 = r14.A07
            X.B66 r0 = r0.A05()
            java.lang.Class r0 = r0.BFl()
            if (r0 == 0) goto L_0x0064
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r4, r0)
            r1.addFlags(r6)
            r1.putExtra(r9, r11)
            java.lang.String r0 = "step-up-id"
            r5 = r18
            r1.putExtra(r0, r5)
            android.app.PendingIntent r0 = X.C65743Th.A00(r4, r3, r1, r8)
            r2.A0D = r0
            android.app.Notification r2 = r2.A05()
            X.1Fq r1 = r14.A03
            r0 = 28
            r1.A07(r5, r0, r2)
            return
        L_0x00dd:
            X.1EU r0 = r14.A07
            X.B66 r0 = r0.A05()
            java.lang.Class r1 = r0.BFl()
            if (r1 == 0) goto L_0x0064
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r4, r1)
            r0.addFlags(r6)
            r0.putExtra(r9, r10)
            android.app.PendingIntent r0 = X.C65743Th.A00(r4, r3, r0, r8)
            goto L_0x0157
        L_0x00f9:
            boolean r0 = r5.equals(r1)
            r13 = 0
            goto L_0x0117
        L_0x00ff:
            boolean r0 = r5.equals(r11)
            goto L_0x0117
        L_0x0104:
            boolean r0 = r5.equals(r10)
            r13 = 2
            goto L_0x0117
        L_0x010a:
            boolean r0 = r5.equals(r12)
            r13 = 3
            goto L_0x0117
        L_0x0110:
            java.lang.String r0 = "KYC"
            boolean r0 = r5.equals(r0)
            r13 = 4
        L_0x0117:
            if (r0 != 0) goto L_0x0059
            goto L_0x0058
        L_0x011b:
            X.1EU r0 = r14.A07
            X.B66 r0 = r0.A05()
            java.lang.Class r1 = r0.BFl()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r4, r1)
            r0.addFlags(r6)
            android.app.PendingIntent r0 = X.C65743Th.A00(r4, r3, r0, r3)
            r2.A0D = r0
            android.app.Notification r1 = r2.A05()
            X.1Fq r0 = r14.A03
            r0.A02(r7, r1)
            return
        L_0x013d:
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0)
            r1.addFlags(r6)
            r1.putExtra(r9, r12)
            java.lang.String r0 = "https://faq.whatsapp.com/general/payments/learn-more-about-identity-documents-br"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r1.setData(r0)
            android.app.PendingIntent r0 = X.C65743Th.A00(r4, r3, r1, r8)
        L_0x0157:
            r2.A0D = r0
            android.app.Notification r1 = r2.A05()
            X.1Fq r0 = r14.A03
            r0.A02(r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1YM.A02(X.1YM, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public void A03(String str) {
        this.A02.Boy(new C35481il(12, str, this));
    }

    public AnonymousClass1YM(C19630wG r1, C25271Fq r2, AnonymousClass16S r3, AnonymousClass1EW r4, C24601Db r5, AnonymousClass1EV r6, AnonymousClass1EU r7, AnonymousClass1CR r8, C19770wU r9) {
        this.A00 = r1;
        this.A02 = r9;
        this.A05 = r4;
        this.A07 = r7;
        this.A08 = r8;
        this.A06 = r5;
        this.A01 = r6;
        this.A03 = r2;
        this.A04 = r3;
    }
}
