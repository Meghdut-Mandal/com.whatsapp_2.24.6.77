package X;

import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;

/* renamed from: X.3wY  reason: invalid class name and case insensitive filesystem */
public class C81153wY implements Runnable {
    public Object A00;
    public final int A01;

    public C81153wY(VerifyPhoneNumber verifyPhoneNumber, int i) {
        this.A01 = i;
        switch (i) {
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                this.A00 = verifyPhoneNumber;
                return;
            default:
                this.A00 = verifyPhoneNumber;
                return;
        }
    }

    public static void A00(AnonymousClass17Y r1, Object obj, int i) {
        r1.A0H(new C81153wY(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.whatsapp.report.activity.banreport.BanReportViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: com.whatsapp.registration.phonenumberentry.RegisterPhone} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: com.whatsapp.registration.verifyphone.VerifyPhoneNumber} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: com.whatsapp.report.BusinessActivityReportViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v40, resolved type: com.whatsapp.report.activity.banreport.BanReportViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: com.whatsapp.report.BusinessActivityReportViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: com.whatsapp.report.activity.banreport.BanReportViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: com.whatsapp.registration.phonenumberentry.RegisterPhone} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: com.whatsapp.registration.phonenumberentry.RegisterPhone} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v58, resolved type: com.whatsapp.report.BusinessActivityReportViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v59, resolved type: com.whatsapp.report.BusinessActivityReportViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v36, resolved type: com.whatsapp.report.activity.banreport.BanReportViewModel} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02ef, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02f0, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        com.whatsapp.util.Log.e("BusinessActivityReportManager/prepare-report-for-export/can't prepare report file", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0301, code lost:
        if (r6.setLastModified(X.C19970wo.A00(r1.A02)) != false) goto L_0x032c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0303, code lost:
        com.whatsapp.util.Log.e("BusinessActivityReportManager/prepare-report-for-export/failed to update report file");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x032e, code lost:
        if (r4.A01 == 0) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0330, code lost:
        X.C36321k7.A1Q("BanReportViewModel/export-report/on-ready-to-export :: ", r5, X.AnonymousClass000.A0u());
        r0 = ((com.whatsapp.report.activity.banreport.BanReportViewModel) r4.A00).A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x033f, code lost:
        r0.A0C(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0343, code lost:
        X.C36321k7.A1Q("BusinessActivityReportViewModel/export-report/on-ready-to-export :: ", r5, X.AnonymousClass000.A0u());
        r0 = ((com.whatsapp.report.BusinessActivityReportViewModel) r4.A00).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x043e, code lost:
        r2.A06(r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0442, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x04b1, code lost:
        r0 = r3.getApplication();
        X.AnonymousClass00C.A08(r0);
        r1.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x04bb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x050b, code lost:
        r2 = r4.A08;
        r1 = new X.C81293wm((java.lang.Object) r4, 0, 12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x051c, code lost:
        X.C36341k9.A16(r3.A02, 3);
        r2 = r3.A08;
        r1 = new X.C81153wY((java.lang.Object) r3, 45);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x052b, code lost:
        r2.Boy(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x052e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x058c, code lost:
        r2 = r3.A08;
        r1 = 46;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0590, code lost:
        r2.Boy(new X.C81153wY((java.lang.Object) r3, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0598, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        X.C36341k9.A16(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x022d, code lost:
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02af, code lost:
        r4 = new X.AnonymousClass4Z0(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x02b4, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r6 = r1.A01;
        X.AnonymousClass6YY.A0E(r6.A0C(), 0);
        r0 = r6.A09();
        r6 = r6.A0T(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r3 = new java.io.FileInputStream(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        r0 = new java.io.FileOutputStream(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        X.AnonymousClass6YY.A0J(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02dc, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02e1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02e6, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02eb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r23 = this;
            r4 = r23
            int r0 = r4.A01
            switch(r0) {
                case 0: goto L_0x052f;
                case 1: goto L_0x0516;
                case 2: goto L_0x0581;
                case 3: goto L_0x0500;
                case 4: goto L_0x04e4;
                case 5: goto L_0x04d2;
                case 6: goto L_0x04c6;
                case 7: goto L_0x04bc;
                case 8: goto L_0x04a3;
                case 9: goto L_0x01aa;
                case 10: goto L_0x0480;
                case 11: goto L_0x0476;
                case 12: goto L_0x046e;
                case 13: goto L_0x0465;
                case 14: goto L_0x045c;
                case 15: goto L_0x044d;
                case 16: goto L_0x0443;
                case 17: goto L_0x0435;
                case 18: goto L_0x0427;
                case 19: goto L_0x03e3;
                case 20: goto L_0x03d6;
                case 21: goto L_0x03ce;
                case 22: goto L_0x03c6;
                case 23: goto L_0x03be;
                case 24: goto L_0x03b6;
                case 25: goto L_0x03ae;
                case 26: goto L_0x0575;
                case 27: goto L_0x0358;
                case 28: goto L_0x02a4;
                case 29: goto L_0x023a;
                case 30: goto L_0x0232;
                case 31: goto L_0x0192;
                case 32: goto L_0x00fd;
                case 33: goto L_0x0227;
                case 34: goto L_0x0212;
                case 35: goto L_0x00e4;
                case 36: goto L_0x020b;
                case 37: goto L_0x0200;
                case 38: goto L_0x00d4;
                case 39: goto L_0x00d4;
                case 40: goto L_0x00c5;
                case 41: goto L_0x00b0;
                case 42: goto L_0x00b0;
                case 43: goto L_0x0007;
                case 44: goto L_0x0007;
                case 45: goto L_0x01c5;
                case 46: goto L_0x01b8;
                case 47: goto L_0x007b;
                case 48: goto L_0x0042;
                case 49: goto L_0x001c;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r4.A00
            X.3pU r0 = (X.C76813pU) r0
            X.32r r0 = r0.A00
            com.whatsapp.report.BusinessActivityReportViewModel r2 = r0.A00
            X.00s r1 = r2.A01
            r0 = 2
            X.C36341k9.A16(r1, r0)
            X.00s r1 = r2.A02
        L_0x0017:
            r0 = 0
        L_0x0018:
            X.C36341k9.A16(r1, r0)
        L_0x001b:
            return
        L_0x001c:
            java.lang.Object r2 = r4.A00
            com.whatsapp.search.IteratingPlayer r2 = (com.whatsapp.search.IteratingPlayer) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            com.whatsapp.search.IteratingPlayer.A03(r2)
            int r0 = r2.A00
            int r1 = r0 + 1
            int r0 = r2.A02
            if (r1 <= r0) goto L_0x0031
            int r1 = r2.A01
        L_0x0031:
            com.whatsapp.search.IteratingPlayer.A04(r2, r1)
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x001b
            X.17Y r3 = r2.A06
            java.lang.Runnable r2 = r2.A07
            r0 = 2000(0x7d0, double:9.88E-321)
            r3.A0I(r2, r0)
            return
        L_0x0042:
            java.lang.Object r2 = r4.A00
            com.whatsapp.scroller.RecyclerFastScroller r2 = (com.whatsapp.scroller.RecyclerFastScroller) r2
            android.view.View r0 = r2.A02
            boolean r0 = r0.isPressed()
            if (r0 != 0) goto L_0x001b
            android.view.View r0 = r2.A02
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x001b
            r4 = 1
            r5 = 0
            boolean r0 = r2.A09
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0060
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0060:
            android.view.animation.TranslateAnimation r3 = new android.view.animation.TranslateAnimation
            r6 = 1
            r8 = 1
            r9 = 0
            r10 = 1
            r11 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = 200(0xc8, double:9.9E-322)
            r3.setDuration(r0)
            android.view.View r0 = r2.A02
            r0.startAnimation(r3)
            android.view.View r1 = r2.A02
            r0 = 4
            r1.setVisibility(r0)
            return
        L_0x007b:
            java.lang.Object r3 = r4.A00
            X.3t3 r3 = (X.C79023t3) r3
            X.12P r0 = r3.A00
            r0.A06()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x001b
            X.1Jh r0 = r3.A01
            java.util.ArrayList r0 = r0.A04()
            java.util.Iterator r2 = r0.iterator()
        L_0x0092:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.next()
            X.3KV r1 = (X.AnonymousClass3KV) r1
            X.005 r0 = r3.A02
            java.lang.Object r4 = r0.get()
            X.1b9 r4 = (X.C31021b9) r4
            long r5 = r1.A02
            long r8 = r1.A03
            boolean r7 = r1.A08
            r4.A02(r5, r7, r8)
            goto L_0x0092
        L_0x00b0:
            java.lang.Object r0 = r4.A00
            X.3pT r0 = (X.C76803pT) r0
            X.32s r0 = r0.A00
            com.whatsapp.report.BusinessActivityReportViewModel r2 = r0.A00
            X.1cX r0 = r2.A05
            int r1 = r0.A00()
            r0 = 1
            if (r1 != r0) goto L_0x001b
            com.whatsapp.report.BusinessActivityReportViewModel.A01(r2)
            return
        L_0x00c5:
            java.lang.Object r0 = r4.A00
            X.3pS r0 = (X.C76793pS) r0
            X.32t r0 = r0.A00
            com.whatsapp.report.BusinessActivityReportViewModel r0 = r0.A00
            com.whatsapp.report.BusinessActivityReportViewModel.A01(r0)
            X.00s r1 = r0.A01
            goto L_0x0017
        L_0x00d4:
            java.lang.Object r0 = r4.A00
            X.3pS r0 = (X.C76793pS) r0
            X.32t r0 = r0.A00
            com.whatsapp.report.BusinessActivityReportViewModel r0 = r0.A00
            com.whatsapp.report.BusinessActivityReportViewModel.A01(r0)
            X.00s r1 = r0.A01
            r0 = 3
            goto L_0x0018
        L_0x00e4:
            java.lang.Object r0 = r4.A00
            X.4a5 r0 = (X.C90394a5) r0
            java.lang.Object r1 = r0.A00
            com.whatsapp.report.ReportActivity r1 = (com.whatsapp.report.ReportActivity) r1
            boolean r0 = r1.BLh()
            if (r0 != 0) goto L_0x001b
            X.2o7 r0 = X.C51622o7.ACCOUNT
            r1.Bn9(r0)
            X.2o7 r0 = X.C51622o7.NEWSLETTER
            r1.Bn9(r0)
            return
        L_0x00fd:
            java.lang.Object r2 = r4.A00
            com.whatsapp.report.BusinessActivityReportViewModel r2 = (com.whatsapp.report.BusinessActivityReportViewModel) r2
            X.17Y r0 = r2.A03
            boolean r0 = r0.A0M()
            if (r0 == 0) goto L_0x001b
            X.00s r1 = r2.A01
            r0 = 1
            X.C36341k9.A16(r1, r0)
            X.3pU r8 = r2.A0D
            X.0wD r0 = r8.A02
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0190
            X.19A r7 = r8.A04
            java.lang.String r10 = r7.A09()
            r11 = 267(0x10b, float:3.74E-43)
            r5 = 2
            X.1AL[] r3 = new X.AnonymousClass1AL[r5]
            java.lang.String r1 = "action"
            java.lang.String r0 = "request"
            boolean r6 = X.C36371kC.A1Y(r1, r0, r3)
            X.0ts r0 = r8.A03
            java.lang.String r2 = r0.A06()
            java.lang.String r1 = "lang"
            X.1AL r0 = new X.1AL
            r0.<init>((java.lang.String) r1, (java.lang.String) r2)
            r2 = 1
            r3[r2] = r0
            java.lang.String r0 = "p2b"
            X.9nx r4 = new X.9nx
            r4.<init>(r0, r3)
            r0 = 6
            X.1AL[] r3 = new X.AnonymousClass1AL[r0]
            X.C36341k9.A1V(r3, r6)
            X.0wQ r0 = r8.A01
            com.whatsapp.jid.PhoneUserJid r0 = X.C36371kC.A0e(r0)
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "from"
            X.C36341k9.A1L(r0, r1, r3, r2)
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "w:biz:p2b_report"
            X.C36341k9.A1L(r1, r0, r3, r5)
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.C36361kB.A1Q(r1, r0, r3)
            java.lang.String r2 = "smax_id"
            java.lang.String r0 = "33"
            X.1AL r1 = new X.1AL
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)
            r0 = 4
            r3[r0] = r1
            java.lang.String r0 = "id"
            X.1AL r1 = new X.1AL
            r1.<init>((java.lang.String) r0, (java.lang.String) r10)
            r0 = 5
            r3[r0] = r1
            X.9nx r9 = X.C36391kE.A0m(r4, r3)
            r12 = 32000(0x7d00, double:1.581E-319)
            r7.A0F(r8, r9, r10, r11, r12)
            r2 = 1
        L_0x0186:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "app/sendRequestReport success:"
            X.C36321k7.A1X(r0, r1, r2)
            return
        L_0x0190:
            r2 = 0
            goto L_0x0186
        L_0x0192:
            java.lang.Object r3 = r4.A00
            com.whatsapp.report.BusinessActivityReportViewModel r3 = (com.whatsapp.report.BusinessActivityReportViewModel) r3
            X.17Y r0 = r3.A03
            boolean r0 = r0.A0M()
            if (r0 == 0) goto L_0x001b
            X.00s r1 = r3.A02
            r0 = 3
            X.C36341k9.A16(r1, r0)
            X.0wU r2 = r3.A0E
            r1 = 29
            goto L_0x0590
        L_0x01aa:
            java.lang.Object r1 = r4.A00
            X.01L r1 = (X.AnonymousClass01L) r1
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L_0x001b
            r1.invalidateOptionsMenu()
            return
        L_0x01b8:
            java.lang.Object r2 = r4.A00
            com.whatsapp.report.activity.banreport.BanReportViewModel r2 = (com.whatsapp.report.activity.banreport.BanReportViewModel) r2
            X.1cX r1 = r2.A07
            java.lang.String r5 = X.C36361kB.A0l()
            r0 = 1
            goto L_0x02af
        L_0x01c5:
            java.lang.Object r2 = r4.A00
            com.whatsapp.report.activity.banreport.BanReportViewModel r2 = (com.whatsapp.report.activity.banreport.BanReportViewModel) r2
            X.30O r0 = r2.A03
            java.lang.String r9 = r2.A00
            X.1U2 r3 = r0.A00
            X.0tq r1 = r3.A00
            X.0ww r4 = X.C36381kD.A0U(r1)
            X.0v0 r5 = X.C36351kA.A0Y(r1)
            X.004 r0 = r1.A96
            X.005 r8 = X.C18840tu.A00(r0)
            X.004 r0 = r1.A8i
            java.lang.Object r7 = r0.get()
            X.0wt r7 = (X.C20020wt) r7
            X.0yC r6 = X.C36341k9.A0V(r1)
            X.1U1 r0 = r3.A01
            X.004 r10 = r0.A17
            X.004 r11 = r0.A0D
            X.2dG r3 = new X.2dG
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = 0
            X.3SQ r0 = new X.3SQ
            r0.<init>(r2, r1)
            r3.Blp(r0)
            return
        L_0x0200:
            java.lang.Object r0 = r4.A00
            X.2jo r0 = (X.C49862jo) r0
            X.17Y r2 = r0.A00
            r1 = 2131889817(0x7f120e99, float:1.9414308E38)
            goto L_0x043e
        L_0x020b:
            java.lang.Object r0 = r4.A00
            X.2jn r0 = (X.C49852jn) r0
            X.17Y r2 = r0.A00
            goto L_0x022d
        L_0x0212:
            java.lang.Object r2 = r4.A00
            com.whatsapp.report.ReportActivity r2 = (com.whatsapp.report.ReportActivity) r2
            com.whatsapp.report.ShareReportConfirmationDialogFragment r1 = new com.whatsapp.report.ShareReportConfirmationDialogFragment
            r1.<init>()
            X.3qZ r0 = new X.3qZ
            r0.<init>(r2)
            r1.A00 = r0
            r0 = 0
            r2.Btl(r1, r0)
            return
        L_0x0227:
            java.lang.Object r0 = r4.A00
            X.14u r0 = (X.C225314u) r0
            X.17Y r2 = r0.A05
        L_0x022d:
            r1 = 2131889816(0x7f120e98, float:1.9414306E38)
            goto L_0x043e
        L_0x0232:
            java.lang.Object r0 = r4.A00
            X.3lB r0 = (X.C74173lB) r0
            r0.A08()
            return
        L_0x023a:
            java.lang.Object r0 = r4.A00
            com.whatsapp.report.BusinessActivityReportViewModel r0 = (com.whatsapp.report.BusinessActivityReportViewModel) r0
            X.1cX r1 = r0.A05
            X.3Cs r2 = new X.3Cs
            r2.<init>(r0)
            monitor-enter(r1)
            java.lang.String r0 = "BusinessActivityReportManager/download-report"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0355 }
            X.3XD r0 = r1.A00     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x028a
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x0355 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0355 }
            if (r0 != 0) goto L_0x028a
            X.1Yr r5 = r1.A04     // Catch:{ all -> 0x0355 }
            X.1Gl r7 = X.C25471Gl.A0A     // Catch:{ all -> 0x0355 }
            X.3XD r0 = r1.A00     // Catch:{ all -> 0x0355 }
            java.lang.String r10 = r0.A06     // Catch:{ all -> 0x0355 }
            java.lang.String r11 = r0.A05     // Catch:{ all -> 0x0355 }
            java.lang.String r12 = r0.A04     // Catch:{ all -> 0x0355 }
            java.lang.String r13 = r0.A08     // Catch:{ all -> 0x0355 }
            java.lang.String r14 = r0.A03     // Catch:{ all -> 0x0355 }
            r8 = 0
            java.lang.String r3 = r0.A07     // Catch:{ all -> 0x0355 }
            r0 = 2
            byte[] r16 = android.util.Base64.decode(r3, r0)     // Catch:{ all -> 0x0355 }
            X.3XD r0 = r1.A00     // Catch:{ all -> 0x0355 }
            long r3 = r0.A02     // Catch:{ all -> 0x0355 }
            r17 = 2
            r18 = 1
            r19 = 10
            r0 = 0
            X.4Yh r6 = new X.4Yh     // Catch:{ all -> 0x0355 }
            r6.<init>(r1, r2, r0)     // Catch:{ all -> 0x0355 }
            r15 = r8
            r20 = 0
            r9 = r8
            r21 = r3
            r5.A0A(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0355 }
            goto L_0x0353
        L_0x028a:
            java.lang.String r0 = "BusinessActivityReportManager/download-report no valid report info"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0355 }
            java.lang.String r0 = "BusinessActivityReportViewModel/download-report/on-error"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0355 }
            com.whatsapp.report.BusinessActivityReportViewModel r0 = r2.A00     // Catch:{ all -> 0x0355 }
            com.whatsapp.report.BusinessActivityReportViewModel.A01(r0)     // Catch:{ all -> 0x0355 }
            X.00s r2 = r0.A01     // Catch:{ all -> 0x0355 }
            r0 = 5
            X.C36341k9.A17(r2, r0)     // Catch:{ all -> 0x0355 }
            r1.A02()     // Catch:{ all -> 0x0355 }
            goto L_0x0353
        L_0x02a4:
            java.lang.Object r2 = r4.A00
            com.whatsapp.report.BusinessActivityReportViewModel r2 = (com.whatsapp.report.BusinessActivityReportViewModel) r2
            X.1cX r1 = r2.A05
            java.lang.String r5 = X.C36361kB.A0l()
            r0 = 0
        L_0x02af:
            X.4Z0 r4 = new X.4Z0
            r4.<init>(r2, r0)
            monitor-enter(r1)
            X.0y0 r6 = r1.A01     // Catch:{ all -> 0x0355 }
            java.io.File r0 = r6.A0C()     // Catch:{ all -> 0x0355 }
            r2 = 0
            X.AnonymousClass6YY.A0E(r0, r2)     // Catch:{ all -> 0x0355 }
            java.io.File r0 = r6.A09()     // Catch:{ all -> 0x0355 }
            java.io.File r6 = r6.A0T(r5)     // Catch:{ all -> 0x0355 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x02f0 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x02f0 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x02e6 }
            r0.<init>(r6)     // Catch:{ all -> 0x02e6 }
            X.AnonymousClass6YY.A0J(r3, r0)     // Catch:{ all -> 0x02dc }
            r0.close()     // Catch:{ all -> 0x02e6 }
            r3.close()     // Catch:{ IOException -> 0x02f0 }
            goto L_0x02f7
        L_0x02dc:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x02e1 }
            goto L_0x02e5
        L_0x02e1:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ all -> 0x02e6 }
        L_0x02e5:
            throw r2     // Catch:{ all -> 0x02e6 }
        L_0x02e6:
            r2 = move-exception
            r3.close()     // Catch:{ all -> 0x02eb }
            goto L_0x02ef
        L_0x02eb:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ IOException -> 0x02f0 }
        L_0x02ef:
            throw r2     // Catch:{ IOException -> 0x02f0 }
        L_0x02f0:
            r2 = move-exception
            java.lang.String r0 = "BusinessActivityReportManager/prepare-report-for-export/can't prepare report file"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0355 }
            goto L_0x0308
        L_0x02f7:
            X.0wo r0 = r1.A02     // Catch:{ all -> 0x0355 }
            long r2 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x0355 }
            boolean r0 = r6.setLastModified(r2)     // Catch:{ all -> 0x0355 }
            if (r0 != 0) goto L_0x032c
            java.lang.String r0 = "BusinessActivityReportManager/prepare-report-for-export/failed to update report file"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0355 }
        L_0x0308:
            int r0 = r4.A01     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x031c
            java.lang.String r0 = "BanReportViewModel/export-report/on-error"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0355 }
            java.lang.Object r0 = r4.A00     // Catch:{ all -> 0x0355 }
            com.whatsapp.report.activity.banreport.BanReportViewModel r0 = (com.whatsapp.report.activity.banreport.BanReportViewModel) r0     // Catch:{ all -> 0x0355 }
            X.00s r2 = r0.A02     // Catch:{ all -> 0x0355 }
            r0 = 1
            X.C36341k9.A16(r2, r0)     // Catch:{ all -> 0x0355 }
            goto L_0x0353
        L_0x031c:
            java.lang.String r0 = "BusinessActivityReportViewModel/export-report/on-error"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0355 }
            java.lang.Object r0 = r4.A00     // Catch:{ all -> 0x0355 }
            com.whatsapp.report.BusinessActivityReportViewModel r0 = (com.whatsapp.report.BusinessActivityReportViewModel) r0     // Catch:{ all -> 0x0355 }
            X.00s r2 = r0.A01     // Catch:{ all -> 0x0355 }
            r0 = 6
            X.C36341k9.A17(r2, r0)     // Catch:{ all -> 0x0355 }
            goto L_0x0353
        L_0x032c:
            int r0 = r4.A01     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x0343
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0355 }
            java.lang.String r0 = "BanReportViewModel/export-report/on-ready-to-export :: "
            X.C36321k7.A1Q(r0, r5, r2)     // Catch:{ all -> 0x0355 }
            java.lang.Object r0 = r4.A00     // Catch:{ all -> 0x0355 }
            com.whatsapp.report.activity.banreport.BanReportViewModel r0 = (com.whatsapp.report.activity.banreport.BanReportViewModel) r0     // Catch:{ all -> 0x0355 }
            X.00s r0 = r0.A01     // Catch:{ all -> 0x0355 }
        L_0x033f:
            r0.A0C(r5)     // Catch:{ all -> 0x0355 }
            goto L_0x0353
        L_0x0343:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0355 }
            java.lang.String r0 = "BusinessActivityReportViewModel/export-report/on-ready-to-export :: "
            X.C36321k7.A1Q(r0, r5, r2)     // Catch:{ all -> 0x0355 }
            java.lang.Object r0 = r4.A00     // Catch:{ all -> 0x0355 }
            com.whatsapp.report.BusinessActivityReportViewModel r0 = (com.whatsapp.report.BusinessActivityReportViewModel) r0     // Catch:{ all -> 0x0355 }
            X.00s r0 = r0.A00     // Catch:{ all -> 0x0355 }
            goto L_0x033f
        L_0x0353:
            monitor-exit(r1)
            return
        L_0x0355:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0358:
            java.lang.Object r6 = r4.A00
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r6 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r6
            int r0 = com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A01(r6)
            X.1RJ r1 = r6.A1A
            if (r0 == 0) goto L_0x03a8
            r0 = 0
            r1.A03(r0)
            r0 = 2131429543(0x7f0b08a7, float:1.8480762E38)
            android.widget.TextView r5 = X.C36391kE.A0Q(r6, r0)
            int r3 = r6.A03
            X.0wG r0 = r6.A0a
            android.content.Context r2 = r0.A00
            r0 = 1
            X.AnonymousClass00C.A0D(r2, r0)
            r1 = 2131888821(0x7f120ab5, float:1.9412288E38)
            if (r3 == r0) goto L_0x03a3
            r0 = 2
            r1 = 2131888807(0x7f120aa7, float:1.941226E38)
            if (r3 == r0) goto L_0x03a3
            r0 = 3
            r1 = 2131888815(0x7f120aaf, float:1.9412276E38)
            if (r3 == r0) goto L_0x03a3
            r0 = 4
            r1 = 2131888812(0x7f120aac, float:1.941227E38)
            if (r3 == r0) goto L_0x03a3
            r0 = 5
            if (r3 == r0) goto L_0x03a0
            java.lang.String r0 = ""
        L_0x0395:
            r5.setText(r0)
        L_0x0398:
            android.os.Handler r2 = r6.A0D
            r0 = 5000(0x1388, double:2.4703E-320)
            r2.postDelayed(r4, r0)
            return
        L_0x03a0:
            r1 = 2131888818(0x7f120ab2, float:1.9412282E38)
        L_0x03a3:
            java.lang.String r0 = X.C36361kB.A0m(r2, r1)
            goto L_0x0395
        L_0x03a8:
            r0 = 8
            r1.A03(r0)
            goto L_0x0398
        L_0x03ae:
            java.lang.Object r0 = r4.A00
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r0 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r0
            com.whatsapp.report.activity.banreport.BanReportViewModel r3 = r0.A17
            goto L_0x051c
        L_0x03b6:
            java.lang.Object r0 = r4.A00
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r0 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r0
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1B(r0)
            return
        L_0x03be:
            java.lang.Object r0 = r4.A00
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r0 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r0
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1C(r0)
            return
        L_0x03c6:
            java.lang.Object r0 = r4.A00
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r0 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r0
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1D(r0)
            return
        L_0x03ce:
            java.lang.Object r0 = r4.A00
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r0 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r0
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A17(r0)
            return
        L_0x03d6:
            java.lang.Object r1 = r4.A00
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r1 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r1
            r0 = 127(0x7f, float:1.78E-43)
            X.AnonymousClass3SJ.A01(r1, r0)
            com.whatsapp.report.activity.banreport.BanReportViewModel r4 = r1.A17
            goto L_0x050b
        L_0x03e3:
            java.lang.Object r3 = r4.A00
            X.155 r3 = (X.AnonymousClass155) r3
            X.0wQ r0 = r3.A02
            com.whatsapp.Me r0 = r0.A05()
            if (r0 == 0) goto L_0x0405
            java.lang.String r0 = "VerifyPhoneNumber/saveBackupToken/delete old phone number's token"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Context r2 = r3.getApplicationContext()
            X.0v0 r1 = r3.A09
            X.0wQ r0 = r3.A02
            com.whatsapp.Me r0 = r0.A05()
            java.lang.String r0 = r0.number
            X.C133306Xt.A02(r2, r1, r0)
        L_0x0405:
            java.lang.String r0 = "VerifyPhoneNumber/saveBackupToken/encrypt and save (new) phone number's token"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0422 }
            X.0wo r5 = r3.A07     // Catch:{ IOException -> 0x0422 }
            android.content.Context r4 = r3.getApplicationContext()     // Catch:{ IOException -> 0x0422 }
            X.0v0 r6 = r3.A09     // Catch:{ IOException -> 0x0422 }
            byte[] r9 = r6.A2X()     // Catch:{ IOException -> 0x0422 }
            X.0v0 r0 = r3.A09     // Catch:{ IOException -> 0x0422 }
            java.lang.String r8 = r0.A0h()     // Catch:{ IOException -> 0x0422 }
            r10 = 1
            r7 = 0
            X.C133306Xt.A01(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ IOException -> 0x0422 }
            return
        L_0x0422:
            r1 = move-exception
            java.lang.String r0 = "VerifyPhoneNumber/saveBackupToken/failed with IOException:"
            goto L_0x0571
        L_0x0427:
            java.lang.Object r0 = r4.A00
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r0 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r0
            X.3TX r2 = r0.A0z
            java.lang.String r1 = "flash_call_retry_dialog"
            java.lang.String r0 = "wrong_number"
            r2.A07(r1, r0)
            return
        L_0x0435:
            java.lang.Object r0 = r4.A00
            X.14u r0 = (X.C225314u) r0
            X.17Y r2 = r0.A05
            r1 = 2131894592(0x7f122140, float:1.9423993E38)
        L_0x043e:
            r0 = 0
            r2.A06(r1, r0)
            return
        L_0x0443:
            java.lang.Object r1 = r4.A00
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r1 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r1
            int r0 = r1.A04
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1E(r1, r0)
            return
        L_0x044d:
            java.lang.Object r3 = r4.A00
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r3 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r3
            X.9gZ r2 = r3.A0i
            r1 = 0
            java.lang.String r0 = "verify_phone"
            r2.A02(r1, r0)
            X.9XW r1 = r3.A0j
            goto L_0x04b1
        L_0x045c:
            java.lang.Object r1 = r4.A00
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r1 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r1
            r0 = 1
            r1.A3o(r0)
            return
        L_0x0465:
            java.lang.Object r1 = r4.A00
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r1 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r1
            r0 = 1
            r1.A3q(r0)
            return
        L_0x046e:
            java.lang.Object r0 = r4.A00
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r0 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r0
            r0.A3j()
            return
        L_0x0476:
            java.lang.Object r0 = r4.A00
            X.3qO r0 = (X.C77373qO) r0
            com.whatsapp.registration.phonenumberentry.RegisterPhone r0 = r0.A00
            r0.BKB()
            return
        L_0x0480:
            java.lang.Object r2 = r4.A00
            com.whatsapp.registration.phonenumberentry.RegisterPhone r2 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r2
            java.lang.String r0 = "RegisterPhone/whats-my-number/link-clicked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Em r1 = r2.A0r
            java.lang.Integer r0 = X.C36361kB.A0i()
            r1.A00 = r0
            X.0yE r0 = r2.A09
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x049f
            X.3US r0 = com.whatsapp.RequestPermissionActivity.A0B
            r0.A0C(r2)
            return
        L_0x049f:
            com.whatsapp.registration.phonenumberentry.RegisterPhone.A0n(r2)
            return
        L_0x04a3:
            java.lang.Object r3 = r4.A00
            com.whatsapp.registration.phonenumberentry.RegisterPhone r3 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r3
            X.9gZ r2 = r3.A0K
            r1 = 0
            java.lang.String r0 = "register_phone"
            r2.A02(r1, r0)
            X.9XW r1 = r3.A0L
        L_0x04b1:
            android.app.Application r0 = r3.getApplication()
            X.AnonymousClass00C.A08(r0)
            r1.A01(r0)
            return
        L_0x04bc:
            java.lang.Object r1 = r4.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 21
            X.AnonymousClass3SJ.A01(r1, r0)
            return
        L_0x04c6:
            java.lang.Object r0 = r4.A00
            com.whatsapp.registration.phonenumberentry.RegisterPhone r0 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r0
            X.0wU r1 = r0.A04
            X.2kO r0 = r0.A0V
            X.C36371kC.A1P(r0, r1)
            return
        L_0x04d2:
            java.lang.Object r0 = r4.A00
            X.14u r0 = (X.C225314u) r0
            android.content.Context r2 = r0.getApplicationContext()
            X.0v0 r1 = r0.A09
            java.lang.String r0 = r1.A0h()
            X.C133306Xt.A02(r2, r1, r0)
            return
        L_0x04e4:
            java.lang.Object r0 = r4.A00
            com.whatsapp.registration.phonenumberentry.RegisterPhone r0 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r0
            X.0v0 r1 = r0.A09
            X.005 r0 = r0.A0X
            java.lang.Object r0 = r0.get()
            X.1Z0 r0 = (X.AnonymousClass1Z0) r0
            X.6C2 r0 = X.AnonymousClass1Z0.A00(r0)
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            r1.A1D(r0)
            return
        L_0x0500:
            java.lang.Object r1 = r4.A00
            X.2d9 r1 = (X.AnonymousClass2d9) r1
            r0 = 127(0x7f, float:1.78E-43)
            X.AnonymousClass3SJ.A01(r1, r0)
            com.whatsapp.report.activity.banreport.BanReportViewModel r4 = r1.A0Q
        L_0x050b:
            r3 = 0
            X.0wU r2 = r4.A08
            r0 = 12
            X.3wm r1 = new X.3wm
            r1.<init>((java.lang.Object) r4, (int) r3, (int) r0)
            goto L_0x052b
        L_0x0516:
            java.lang.Object r0 = r4.A00
            X.2d9 r0 = (X.AnonymousClass2d9) r0
            com.whatsapp.report.activity.banreport.BanReportViewModel r3 = r0.A0Q
        L_0x051c:
            X.00s r1 = r3.A02
            r0 = 3
            X.C36341k9.A16(r1, r0)
            X.0wU r2 = r3.A08
            r0 = 45
            X.3wY r1 = new X.3wY
            r1.<init>((java.lang.Object) r3, (int) r0)
        L_0x052b:
            r2.Boy(r1)
            return
        L_0x052f:
            java.lang.Object r3 = r4.A00
            X.155 r3 = (X.AnonymousClass155) r3
            X.0wQ r0 = r3.A02
            com.whatsapp.Me r0 = r0.A05()
            if (r0 == 0) goto L_0x0551
            java.lang.String r0 = "EnterPhoneNumber/saveBackupToken/delete old phone number's token"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Context r2 = r3.getApplicationContext()
            X.0v0 r1 = r3.A09
            X.0wQ r0 = r3.A02
            com.whatsapp.Me r0 = r0.A05()
            java.lang.String r0 = r0.number
            X.C133306Xt.A02(r2, r1, r0)
        L_0x0551:
            java.lang.String r0 = "EnterPhoneNumber/saveBackupToken/encrypt and save (new) phone number's token"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x056e }
            X.0wo r5 = r3.A07     // Catch:{ IOException -> 0x056e }
            android.content.Context r4 = r3.getApplicationContext()     // Catch:{ IOException -> 0x056e }
            X.0v0 r6 = r3.A09     // Catch:{ IOException -> 0x056e }
            byte[] r9 = r6.A2X()     // Catch:{ IOException -> 0x056e }
            X.0v0 r0 = r3.A09     // Catch:{ IOException -> 0x056e }
            java.lang.String r8 = r0.A0h()     // Catch:{ IOException -> 0x056e }
            r10 = 1
            r7 = 0
            X.C133306Xt.A01(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ IOException -> 0x056e }
            return
        L_0x056e:
            r1 = move-exception
            java.lang.String r0 = "EnterPhoneNumber/saveBackupToken/failed with IOException:"
        L_0x0571:
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x0575:
            java.lang.Object r1 = r4.A00
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r1 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r1
            r0 = 127(0x7f, float:1.78E-43)
            X.AnonymousClass3SJ.A01(r1, r0)
            com.whatsapp.report.activity.banreport.BanReportViewModel r3 = r1.A17
            goto L_0x058c
        L_0x0581:
            java.lang.Object r1 = r4.A00
            X.2d9 r1 = (X.AnonymousClass2d9) r1
            r0 = 127(0x7f, float:1.78E-43)
            X.AnonymousClass3SJ.A01(r1, r0)
            com.whatsapp.report.activity.banreport.BanReportViewModel r3 = r1.A0Q
        L_0x058c:
            X.0wU r2 = r3.A08
            r1 = 46
        L_0x0590:
            X.3wY r0 = new X.3wY
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.Boy(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81153wY.run():void");
    }

    public C81153wY(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
