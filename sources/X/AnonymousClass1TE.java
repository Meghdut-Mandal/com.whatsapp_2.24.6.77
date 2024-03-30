package X;

/* renamed from: X.1TE  reason: invalid class name */
public final class AnonymousClass1TE {
    public final AnonymousClass16D A00;
    public final C21060yb A01;
    public final C19630wG A02;
    public final C25271Fq A03;
    public final C20810yC A04;
    public final AnonymousClass1J1 A05;
    public final AnonymousClass1TF A06;
    public final AnonymousClass005 A07;
    public final AnonymousClass005 A08;

    public AnonymousClass1TE(AnonymousClass16D r2, C21060yb r3, C19630wG r4, C25271Fq r5, C20810yC r6, AnonymousClass1J1 r7, AnonymousClass1TF r8, AnonymousClass005 r9, AnonymousClass005 r10) {
        AnonymousClass00C.A0D(r6, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r2, 3);
        AnonymousClass00C.A0D(r3, 4);
        AnonymousClass00C.A0D(r7, 5);
        AnonymousClass00C.A0D(r8, 6);
        AnonymousClass00C.A0D(r5, 7);
        AnonymousClass00C.A0D(r9, 8);
        AnonymousClass00C.A0D(r10, 9);
        this.A04 = r6;
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A05 = r7;
        this.A06 = r8;
        this.A03 = r5;
        this.A07 = r9;
        this.A08 = r10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.lang.Integer} */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0095, code lost:
        if (X.C20800yB.A01(X.C21000yV.A02, r8.A04, 4117) != false) goto L_0x0097;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.content.Context r20, X.C07700Yy r21, X.AnonymousClass141 r22, X.AnonymousClass3T1 r23) {
        /*
            r19 = this;
            r0 = 0
            r2 = r20
            X.AnonymousClass00C.A0D(r2, r0)
            r0 = 1
            r11 = r23
            X.AnonymousClass00C.A0D(r11, r0)
            r8 = r19
            X.1TF r4 = r8.A06
            X.3P8 r1 = X.AnonymousClass1TF.A00(r11)
            if (r1 == 0) goto L_0x0072
            boolean r0 = r4.A08(r1)
            r3 = r21
            r9 = r22
            if (r0 == 0) goto L_0x0073
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r1 = r2.getPackageName()
            java.lang.String r0 = "com.whatsapp.notification.MessageOtpNotificationBroadcastReceiver"
            r4.setClassName(r1, r0)
            X.11F r0 = r9.A0H
            java.lang.String r1 = X.AnonymousClass143.A03(r0)
            java.lang.String r0 = "extra_remote_jid"
            r4.putExtra(r0, r1)
            X.3Qa r0 = r11.A1J
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "extra_message_key_id"
            r4.putExtra(r0, r1)
            r1 = 36
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r4 = X.C65743Th.A01(r2, r1, r4, r0)
            r1 = 2131231788(0x7f08042c, float:1.8079667E38)
            r0 = 2131891699(0x7f1215f3, float:1.9418125E38)
            java.lang.String r0 = r2.getString(r0)
            r3.A08(r1, r0, r4)
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r0 = 29
            if (r2 < r0) goto L_0x0060
            r3.A0T = r1
        L_0x0060:
            X.1J1 r10 = r8.A05
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r13 = 0
            r17 = 1
        L_0x0069:
            r15 = r13
            r16 = r13
            r18 = 0
            r14 = r13
            X.AnonymousClass1J1.A02(r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x0072:
            return
        L_0x0073:
            boolean r0 = r4.A07(r1)
            if (r0 == 0) goto L_0x0111
            int r1 = android.os.Build.VERSION.SDK_INT
            r17 = 1
            r7 = 0
            r0 = 31
            r10 = 0
            if (r1 < r0) goto L_0x0084
            r10 = 1
        L_0x0084:
            android.content.Intent r6 = r4.A01(r2, r11)
            if (r10 == 0) goto L_0x0097
            X.0yC r4 = r8.A04
            r1 = 4117(0x1015, float:5.769E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r1 = X.C20800yB.A01(r0, r4, r1)
            r0 = 1
            if (r1 == 0) goto L_0x0098
        L_0x0097:
            r0 = 0
        L_0x0098:
            r5 = 134217728(0x8000000, float:3.85186E-34)
            r4 = 45
            if (r0 == 0) goto L_0x00ce
            if (r6 == 0) goto L_0x00ce
        L_0x00a0:
            android.app.PendingIntent r2 = X.C65743Th.A00(r2, r4, r6, r5)
        L_0x00a4:
            X.AnonymousClass00C.A0B(r2)
            X.3P8 r0 = X.AnonymousClass1TF.A00(r11)
            if (r0 == 0) goto L_0x00cc
            java.lang.String r0 = r0.A01
            android.net.Uri r1 = android.net.Uri.parse(r0)
            java.lang.String r0 = "cta_display_name"
            java.lang.String r0 = r1.getQueryParameter(r0)
        L_0x00b9:
            r3.A08(r7, r0, r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x00c4
            r3.A0T = r7
        L_0x00c4:
            X.1J1 r10 = r8.A05
            java.lang.Integer r12 = java.lang.Integer.valueOf(r17)
            r13 = 0
            goto L_0x0069
        L_0x00cc:
            r0 = 0
            goto L_0x00b9
        L_0x00ce:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            java.lang.String r1 = r2.getPackageName()
            if (r10 == 0) goto L_0x00f3
            java.lang.String r0 = "com.whatsapp.notification.OtpOneTapNotificationHandlerActivity"
            r6.setClassName(r1, r0)
            X.11F r0 = r9.A0H
            java.lang.String r1 = X.AnonymousClass143.A03(r0)
            java.lang.String r0 = "extra_remote_jid"
            r6.putExtra(r0, r1)
            X.3Qa r0 = r11.A1J
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "extra_message_key_id"
            r6.putExtra(r0, r1)
            goto L_0x00a0
        L_0x00f3:
            java.lang.String r0 = "com.whatsapp.notification.MessageOtpNotificationBroadcastReceiver"
            r6.setClassName(r1, r0)
            X.11F r0 = r9.A0H
            java.lang.String r1 = X.AnonymousClass143.A03(r0)
            java.lang.String r0 = "extra_remote_jid"
            r6.putExtra(r0, r1)
            X.3Qa r0 = r11.A1J
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "extra_message_key_id"
            r6.putExtra(r0, r1)
            android.app.PendingIntent r2 = X.C65743Th.A01(r2, r4, r6, r5)
            goto L_0x00a4
        L_0x0111:
            boolean r0 = r4.A09(r1)
            if (r0 == 0) goto L_0x0072
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r1 = r2.getPackageName()
            java.lang.String r0 = "com.whatsapp.notification.OtpZeroTapMarkAsReadNotificationHandlerReceiver"
            r4.setClassName(r1, r0)
            X.11F r0 = r9.A0H
            java.lang.String r1 = X.AnonymousClass143.A03(r0)
            java.lang.String r0 = "extra_remote_jid"
            r4.putExtra(r0, r1)
            X.3Qa r0 = r11.A1J
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "extra_message_key_id"
            r4.putExtra(r0, r1)
            r1 = 66
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r1 = X.C65743Th.A01(r2, r1, r4, r0)
            r0 = 2131890906(0x7f1212da, float:1.9416517E38)
            java.lang.String r0 = r2.getString(r0)
            r2 = 0
            r3.A08(r2, r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0072
            r3.A0T = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1TE.A00(android.content.Context, X.0Yy, X.141, X.3T1):void");
    }

    public final boolean A01(AnonymousClass3T1 r5) {
        AnonymousClass00C.A0D(r5, 0);
        AnonymousClass1TF r1 = this.A06;
        if (r1.A06(r5)) {
            AnonymousClass3P8 A002 = AnonymousClass1TF.A00(r5);
            if (A002 == null || !r1.A09(A002)) {
                return true;
            }
            return !C20800yB.A01(C21000yV.A02, this.A04, 4980);
        }
    }
}
