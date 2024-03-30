package X;

/* renamed from: X.1bz  reason: invalid class name and case insensitive filesystem */
public final class C31541bz {
    public final C19630wG A00;
    public final AnonymousClass1DW A01;
    public final AnonymousClass16D A02;
    public final C19970wo A03;
    public final C25271Fq A04;
    public final C31531by A05;

    public C31541bz(AnonymousClass16D r2, C19970wo r3, C19630wG r4, C25271Fq r5, AnonymousClass1DW r6, C31531by r7) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r2, 3);
        AnonymousClass00C.A0D(r6, 4);
        AnonymousClass00C.A0D(r5, 5);
        AnonymousClass00C.A0D(r7, 6);
        this.A03 = r3;
        this.A00 = r4;
        this.A02 = r2;
        this.A01 = r6;
        this.A04 = r5;
        this.A05 = r7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C87374On r20, int r21) {
        /*
            r19 = this;
            r13 = 1
            r17 = r20
            r12 = r17
            X.ATi r12 = (X.C21642ATi) r12
            X.9Nl r11 = r12.A07
            if (r11 != 0) goto L_0x0011
            java.lang.String r0 = "PSANotificationComposer/null primary creative"
        L_0x000d:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0011:
            r10 = r19
            X.0wG r0 = r10.A00
            android.content.Context r9 = r0.A00
            X.AnonymousClass00C.A08(r9)
            X.8e7 r1 = X.C177638e7.A00
            X.16D r0 = r10.A02
            X.141 r0 = r0.A08(r1)
            if (r0 != 0) goto L_0x0027
            java.lang.String r0 = "PushPSANotificationComposer/null server contact"
            goto L_0x000d
        L_0x0027:
            r0 = 0
            X.0Yy r8 = new X.0Yy
            r8.<init>(r9, r0)
            r0 = 2131102006(0x7f060936, float:1.7816438E38)
            int r0 = X.AnonymousClass00F.A00(r9, r0)
            r8.A06 = r0
            long r0 = java.lang.System.currentTimeMillis()
            r8.A09(r0)
            r0 = 3
            r8.A06(r0)
            r0 = 0
            r8.A09 = r0
            r8.A0I(r13)
            r8.A0A = r0
            java.lang.String r0 = "status"
            r8.A0L = r0
            java.lang.String r0 = r11.A06
            r8.A0F(r0)
            java.lang.String r0 = r11.A05
            r8.A0E(r0)
            java.lang.String r14 = r12.A0F
            int r7 = r12.A00
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            java.lang.String r5 = "com.whatsapp.waquickpromotionclient.ui.PushPsaNotificationActivity"
            r6.setClassName(r9, r5)
            java.lang.String r0 = r6.getAction()
            r6.setAction(r0)
            java.lang.String r4 = "is_dismiss_intent"
            r6.putExtra(r4, r13)
            java.lang.String r3 = "surface_id"
            r18 = r21
            r0 = r18
            r6.putExtra(r3, r0)
            java.lang.String r2 = "campaign_id"
            r6.putExtra(r2, r14)
            java.lang.String r1 = "eligibility_duration_after_impression_ms"
            r6.putExtra(r1, r7)
            java.lang.String r0 = "com.whatsapp.waquickpromotionclient.ui.PushPsaNotificationAction"
            r6.setAction(r0)
            long r15 = java.lang.System.currentTimeMillis()
            int r0 = (int) r15
            r15 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r0 = X.C65743Th.A00(r9, r0, r6, r15)
            X.AnonymousClass00C.A08(r0)
            android.app.Notification r6 = r8.A0B
            r6.deleteIntent = r0
            X.39c r0 = r11.A01
            if (r0 != 0) goto L_0x00fa
            java.lang.String r0 = "PushPSANotificationComposer/handleCTA/no primary action"
        L_0x00a1:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00a4:
            r0 = 2131231578(0x7f08035a, float:1.807924E38)
            r6.icon = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x00b3
            java.lang.String r0 = "failure_notifications@1"
            r8.A0M = r0
        L_0x00b3:
            X.1by r5 = r10.A05
            X.2Ol r1 = new X.2Ol
            r1.<init>()
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            r1.A01 = r14
            X.0yW r0 = r5.A00
            r0.Bly(r1)
            X.040 r4 = r5.A03
            r3 = 0
            com.whatsapp.waquickpromotionclient.psa.PushPsaNotificationLogger$logPushShow$1 r2 = new com.whatsapp.waquickpromotionclient.psa.PushPsaNotificationLogger$logPushShow$1
            r1 = r17
            r0 = r18
            r2.<init>(r5, r1, r3, r0)
            X.03u r1 = X.C008903u.A00
            java.lang.Integer r0 = X.C023109s.A00
            X.AnonymousClass0A2.A02(r0, r1, r2, r4)
            java.lang.String r1 = r12.A0D
            if (r1 == 0) goto L_0x00ee
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            r0.append(r1)
            java.lang.String r14 = r0.toString()
        L_0x00ee:
            X.1Fq r2 = r10.A04
            r1 = 71
            android.app.Notification r0 = r8.A05()
            r2.A07(r14, r1, r0)
            return
        L_0x00fa:
            java.lang.String r15 = r0.A03
            if (r15 == 0) goto L_0x014d
            boolean r0 = X.AnonymousClass098.A06(r15)
            if (r0 != 0) goto L_0x014d
            android.net.Uri r0 = android.net.Uri.parse(r15)
            if (r0 != 0) goto L_0x010d
            java.lang.String r0 = "PushPSANotificationComposer/handleCTA/parsed uri is null"
            goto L_0x00a1
        L_0x010d:
            android.content.Intent r11 = new android.content.Intent
            r11.<init>()
            r11.setClassName(r9, r5)
            java.lang.String r5 = r11.getAction()
            r11.setAction(r5)
            X.1DW r5 = r10.A01
            int r0 = r5.A0C(r0)
            if (r13 != r0) goto L_0x014a
            java.lang.String r0 = "universal_link"
        L_0x0126:
            r11.putExtra(r0, r15)
            r0 = 0
            r11.putExtra(r4, r0)
            r0 = r18
            r11.putExtra(r3, r0)
            r11.putExtra(r2, r14)
            r11.putExtra(r1, r7)
            long r0 = java.lang.System.currentTimeMillis()
            int r2 = (int) r0
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r0 = X.C65743Th.A00(r9, r2, r11, r0)
            X.AnonymousClass00C.A08(r0)
            r8.A0D = r0
            goto L_0x00a4
        L_0x014a:
            java.lang.String r0 = "deep_link"
            goto L_0x0126
        L_0x014d:
            java.lang.String r0 = "PushPSANotificationComposer/handleCTA/No urls provided"
            goto L_0x00a1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31541bz.A00(X.4On, int):void");
    }
}
