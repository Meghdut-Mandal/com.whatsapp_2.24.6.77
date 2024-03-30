package X;

/* renamed from: X.3YU  reason: invalid class name */
public class AnonymousClass3YU implements C25711Hj {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass3YU(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009f, code lost:
        if (X.C36371kC.A1U(X.C36411kG.A0E(((X.C25731Hl) r6.A0B.get()).A01), "should_warn_leaky_companion") != false) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.A02
            switch(r0) {
                case 0: goto L_0x0028;
                case 1: goto L_0x00af;
                case 2: goto L_0x02c8;
                case 3: goto L_0x011d;
                case 4: goto L_0x0146;
                case 5: goto L_0x018e;
                case 6: goto L_0x019c;
                case 7: goto L_0x01e3;
                case 8: goto L_0x0210;
                case 9: goto L_0x0260;
                case 10: goto L_0x0298;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r7.A00
            X.3lB r4 = (X.C74173lB) r4
            java.lang.Object r3 = r7.A01
            X.2bU r3 = (X.AnonymousClass2bU) r3
            r2 = 0
            X.17Y r1 = r4.A02
            r0 = 38
            X.3vC r0 = X.C80313vC.A00(r4, r3, r0)
            r1.A0H(r0)
            monitor-enter(r3)
            X.3Qj r1 = X.AnonymousClass2bU.A00(r3)     // Catch:{ all -> 0x0025 }
            r1.A0V = r2     // Catch:{ all -> 0x0025 }
            r0 = 1
            r1.A0f = r0     // Catch:{ all -> 0x0025 }
            goto L_0x0296
        L_0x0025:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0028:
            java.lang.Object r6 = r7.A00
            X.18z r6 = (X.C235718z) r6
            java.lang.Object r3 = r7.A01
            X.02t r3 = (X.C006302t) r3
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r0 = 1
            int r5 = X.C36361kB.A04(r3, r8, r0)
            boolean r0 = r8.booleanValue()
            if (r0 == 0) goto L_0x0064
            X.0yC r1 = r6.A08
            r0 = 7282(0x1c72, float:1.0204E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x008b
            X.1J4 r0 = r6.A04
            java.util.Map r0 = r0.A00
            java.util.Iterator r4 = X.AnonymousClass000.A0z(r0)
            r2 = 2
            r1 = 0
        L_0x0051:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0067
            int r0 = X.C36341k9.A0A(r4)
            int r2 = java.lang.Math.min(r2, r0)
            int r1 = java.lang.Math.max(r1, r0)
            goto L_0x0051
        L_0x0064:
            X.2oH r0 = X.C51722oH.NO_BANNER
            goto L_0x0087
        L_0x0067:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            X.011 r2 = X.C36421kH.A0j(r0, r1)
            java.lang.Object r0 = r2.first
            int r1 = X.AnonymousClass000.A0I(r0)
            java.lang.Object r0 = r2.second
            int r0 = X.AnonymousClass000.A0I(r0)
            if (r1 != 0) goto L_0x00a4
            if (r0 != r5) goto L_0x00a1
            boolean r0 = r6.A0J()
            if (r0 != 0) goto L_0x00a1
            X.2oH r0 = X.C51722oH.LEAKY_COMPANION_WITH_SECRET_CODE
        L_0x0087:
            r3.invoke(r0)
            return
        L_0x008b:
            X.005 r0 = r6.A0B
            java.lang.Object r0 = r0.get()
            X.1Hl r0 = (X.C25731Hl) r0
            X.00T r0 = r0.A01
            android.content.SharedPreferences r1 = X.C36411kG.A0E(r0)
            java.lang.String r0 = "should_warn_leaky_companion"
            boolean r0 = X.C36371kC.A1U(r1, r0)
            if (r0 == 0) goto L_0x0064
        L_0x00a1:
            X.2oH r0 = X.C51722oH.LEAKY_COMPANION
            goto L_0x0087
        L_0x00a4:
            if (r0 != r5) goto L_0x0064
            boolean r0 = r6.A0J()
            if (r0 != 0) goto L_0x0064
            X.2oH r0 = X.C51722oH.FULL_SUPPORT
            goto L_0x0087
        L_0x00af:
            java.lang.Object r4 = r7.A00
            com.whatsapp.conversation.comments.CommentActionsBottomSheet r4 = (com.whatsapp.conversation.comments.CommentActionsBottomSheet) r4
            java.lang.Object r6 = r7.A01
            X.11F r6 = (X.AnonymousClass11F) r6
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r0 = 2
            X.AnonymousClass00C.A0D(r8, r0)
            X.00T r3 = r4.A0c
            java.lang.Object r0 = r3.getValue()
            X.14u r0 = (X.C225314u) r0
            boolean r0 = r0.BLh()
            if (r0 != 0) goto L_0x0297
            X.0yC r5 = r4.A0N
            if (r5 == 0) goto L_0x0118
            boolean r1 = r8.booleanValue()
            java.lang.String r0 = "comment_actions_bottom_sheet"
            X.3Pg r2 = new X.3Pg
            r2.<init>(r5, r6, r0, r1)
            r0 = 0
            r2.A00 = r0
            r2.A08 = r0
            X.3T1 r0 = r4.A0V
            java.lang.String r1 = "message"
            if (r0 != 0) goto L_0x00ea
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x00ea:
            com.whatsapp.jid.UserJid r0 = r0.A0L()
            r2.A01 = r0
            r0 = 0
            r2.A05 = r0
            r2.A07 = r0
            X.3T1 r0 = r4.A0V
            if (r0 != 0) goto L_0x00fe
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x00fe:
            X.3Qa r0 = r0.A1J
            r2.A02 = r0
            r1 = 0
            X.4Wn r0 = new X.4Wn
            r0.<init>(r4, r1)
            r2.A03 = r0
            com.whatsapp.spamreport.ReportSpamDialogFragment r1 = r2.A01()
            java.lang.Object r0 = r3.getValue()
            X.14u r0 = (X.C225314u) r0
            r0.Btm(r1)
            return
        L_0x0118:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x011d:
            java.lang.Object r2 = r7.A00
            com.whatsapp.deeplink.DeepLinkActivity r2 = (com.whatsapp.deeplink.DeepLinkActivity) r2
            java.lang.Object r0 = r7.A01
            X.3ty r0 = (X.C79593ty) r0
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r0.A0E()
            boolean r0 = r8.booleanValue()
            if (r0 != 0) goto L_0x013a
            X.0yC r1 = r2.A0D
            r0 = 7490(0x1d42, float:1.0496E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x0297
        L_0x013a:
            X.0v5 r0 = r2.A06
            r0.A02()
            java.lang.String r0 = "logBillingFlowImpression"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0146:
            java.lang.Object r4 = r7.A00
            X.3P3 r4 = (X.AnonymousClass3P3) r4
            java.lang.Object r3 = r7.A01
            X.2bU r3 = (X.AnonymousClass2bU) r3
            java.io.File r8 = (java.io.File) r8
            java.util.Map r0 = r4.A03
            r0.remove(r3)
            X.3Qj r2 = r3.A01
            X.C18740tg.A06(r2)
            r0 = 0
            r2.A0f = r0
            X.C18740tg.A06(r2)
            r2.A0Q = r0
            r2.A0I = r8
            long r0 = r8.length()
            r2.A0C = r0
            r0 = 1
            r2.A0U = r0
            X.3Qj r1 = X.AnonymousClass2bU.A00(r3)
            java.lang.String r0 = r3.A07
            if (r0 == 0) goto L_0x0182
            java.io.File r0 = r1.A0I
            if (r0 == 0) goto L_0x0182
            r0 = 1
        L_0x017a:
            r2.A0V = r0
            X.0xM r0 = r4.A01
            r0.A0k(r3)
            return
        L_0x0182:
            int r1 = r3.A0D
            r0 = 2
            int r0 = X.AnonymousClass3TJ.A00(r1, r0)
            boolean r0 = X.C36401kF.A1U(r0)
            goto L_0x017a
        L_0x018e:
            java.lang.Object r1 = r7.A00
            X.3P3 r1 = (X.AnonymousClass3P3) r1
            java.lang.Object r0 = r7.A01
            X.2bU r0 = (X.AnonymousClass2bU) r0
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            X.AnonymousClass3P3.A00(r1, r0, r8)
            return
        L_0x019c:
            java.lang.Object r4 = r7.A00
            com.whatsapp.mediaview.MediaViewFragment r4 = (com.whatsapp.mediaview.MediaViewFragment) r4
            java.lang.Object r1 = r7.A01
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            android.net.Uri r8 = (android.net.Uri) r8
            X.17Y r0 = r4.A0H
            r0.A02()
            android.content.Intent r3 = X.C36431kI.A0C()
            int r2 = r1.A1I
            r1 = 1
            if (r2 == r1) goto L_0x01da
            r0 = 3
            if (r2 == r0) goto L_0x01dd
            r0 = 13
            if (r2 == r0) goto L_0x01dd
            r0 = 42
            if (r2 == r0) goto L_0x0297
            r0 = 43
            if (r2 == r0) goto L_0x0297
            r3.setData(r8)
        L_0x01c6:
            r3.setFlags(r1)
            android.content.Context r1 = r4.A0a()
            X.4Up r0 = r4.A1C
            if (r0 == 0) goto L_0x01d4
            r0.BbL()
        L_0x01d4:
            X.1Dv r0 = r4.A0D
            r0.A06(r1, r3)
            return
        L_0x01da:
            java.lang.String r0 = "image/*"
            goto L_0x01df
        L_0x01dd:
            java.lang.String r0 = "video/*"
        L_0x01df:
            r3.setDataAndType(r8, r0)
            goto L_0x01c6
        L_0x01e3:
            java.lang.Object r3 = r7.A00
            com.whatsapp.mediaview.MediaViewFragment r3 = (com.whatsapp.mediaview.MediaViewFragment) r3
            java.lang.Object r1 = r7.A01
            X.2bU r1 = (X.AnonymousClass2bU) r1
            android.net.Uri r8 = (android.net.Uri) r8
            X.17Y r0 = r3.A0H
            r0.A02()
            android.content.Intent r2 = X.C36431kI.A0C()
            java.lang.String r0 = r1.A05
            r2.setDataAndType(r8, r0)
            r0 = 1
            r2.setFlags(r0)
            android.content.Context r1 = r3.A0a()
            X.4Up r0 = r3.A1C
            if (r0 == 0) goto L_0x020a
            r0.BbL()
        L_0x020a:
            X.1Dv r0 = r3.A0D
            r0.A06(r1, r2)
            return
        L_0x0210:
            java.lang.Object r4 = r7.A00
            com.whatsapp.mediaview.MediaViewFragment r4 = (com.whatsapp.mediaview.MediaViewFragment) r4
            java.lang.Object r5 = r7.A01
            X.3T1 r5 = (X.AnonymousClass3T1) r5
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            X.01I r0 = r4.A0h()
            if (r0 == 0) goto L_0x0297
            boolean r0 = X.AnonymousClass3SJ.A04(r0)
            if (r0 != 0) goto L_0x0297
            X.0yC r3 = r4.A0x
            X.11F r2 = r4.A13
            boolean r1 = r8.booleanValue()
            java.lang.String r0 = "media_viewer"
            X.3Pg r2 = X.C64743Pg.A00(r3, r2, r5, r0, r1)
            X.3Qa r0 = r5.A1J
            r2.A02 = r0
            r1 = 2
            X.4Wn r0 = new X.4Wn
            r0.<init>(r4, r1)
            r2.A03 = r0
            X.11F r1 = r4.A13
            boolean r0 = r1 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x0254
            X.12q r0 = r4.A0n
            X.3Qp r0 = X.C36371kC.A0W(r0, r1)
            X.C18740tg.A06(r0)
            X.2La r0 = (X.C44072La) r0
            r2.A02(r0)
        L_0x0254:
            X.01z r1 = r4.A0k()
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r2.A01()
            X.C65443Sb.A01(r0, r1)
            return
        L_0x0260:
            java.lang.Object r6 = r7.A00
            X.14u r6 = (X.C225314u) r6
            java.lang.Object r5 = r7.A01
            X.3T1 r5 = (X.AnonymousClass3T1) r5
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r0 = X.AnonymousClass3SJ.A04(r6)
            if (r0 != 0) goto L_0x0297
            X.0yC r4 = r6.A0D
            X.3Qa r3 = r5.A1J
            X.11F r2 = r3.A00
            boolean r1 = r8.booleanValue()
            java.lang.String r0 = "view_once_viewer"
            X.3Pg r2 = X.C64743Pg.A00(r4, r2, r5, r0, r1)
            r1 = 3
            X.4Wn r0 = new X.4Wn
            r0.<init>(r6, r1)
            r2.A03 = r0
            r2.A02 = r3
            com.whatsapp.spamreport.ReportSpamDialogFragment r1 = r2.A01()
            X.01z r0 = r6.getSupportFragmentManager()
            X.C65443Sb.A01(r1, r0)
            return
        L_0x0296:
            monitor-exit(r3)
        L_0x0297:
            return
        L_0x0298:
            java.lang.Object r1 = r7.A00
            X.3lB r1 = (X.C74173lB) r1
            java.lang.Object r3 = r7.A01
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            X.6Fp r8 = (X.C129166Fp) r8
            r0 = 2
            X.AnonymousClass00C.A0D(r8, r0)
            X.0xM r2 = r1.A04
            X.6Wx r0 = r8.A01()
            if (r0 == 0) goto L_0x02b9
            int r1 = r0.A01
            r0 = 13
            if (r1 != r0) goto L_0x02b9
        L_0x02b4:
            r0 = -1
        L_0x02b5:
            r2.A0n(r3, r0)
            return
        L_0x02b9:
            X.6Wx r0 = r8.A01()
            if (r0 == 0) goto L_0x02c6
            int r1 = r0.A01
            r0 = 24
            if (r1 != r0) goto L_0x02c6
            goto L_0x02b4
        L_0x02c6:
            r0 = 3
            goto L_0x02b5
        L_0x02c8:
            java.lang.Object r2 = r7.A00
            com.whatsapp.deeplink.DeepLinkActivity r2 = (com.whatsapp.deeplink.DeepLinkActivity) r2
            java.lang.Object r0 = r7.A01
            X.3ty r0 = (X.C79593ty) r0
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r0.A0E()
            android.os.Handler r1 = r2.A00
            r0 = 1
            r1.removeMessages(r0)
            r2.Bnv()
            boolean r1 = r8.booleanValue()
            X.0v5 r0 = r2.A03
            if (r1 == 0) goto L_0x02f0
            r0.A02()
            java.lang.String r0 = "getCoexistenceConnectionStatusActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x02f0:
            r0.A02()
            java.lang.String r0 = "getCoexistenceOnboardingActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3YU.accept(java.lang.Object):void");
    }
}
