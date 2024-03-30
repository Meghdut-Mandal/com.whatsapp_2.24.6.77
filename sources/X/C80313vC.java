package X;

/* renamed from: X.3vC  reason: invalid class name and case insensitive filesystem */
public class C80313vC implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public C80313vC(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public static C80313vC A00(Object obj, Object obj2, int i) {
        return new C80313vC(obj, obj2, i);
    }

    public static void A01(C19770wU r1, Object obj, Object obj2, int i) {
        r1.Boy(new C80313vC(obj, obj2, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03a9, code lost:
        if (r1 != 403) goto L_0x03ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x082b, code lost:
        r0.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x082e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0a96, code lost:
        if (r0 == 2) goto L_0x0a98;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0adc, code lost:
        if (r3 != 408) goto L_0x0ade;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0b89, code lost:
        if (r4 != null) goto L_0x0ba9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0ba7, code lost:
        if (r4.equals("Unknown encoding") == false) goto L_0x0ba9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0ba9, code lost:
        com.whatsapp.util.Log.i("QrScannerView/notifyQrCodeDetected");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0bb0, code lost:
        if (r3.A07 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0bb2, code lost:
        r3.A0J.post(new X.C1503274v(18, r4, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0bbe, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x0c87, code lost:
        r2.BOx(r1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0c8b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x06dc A[Catch:{ RemoteException -> 0x073f, all -> 0x0758 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r23 = this;
            r6 = r23
            int r0 = r6.A02
            switch(r0) {
                case 0: goto L_0x0d5b;
                case 1: goto L_0x0d4b;
                case 2: goto L_0x0d4b;
                case 3: goto L_0x0d3c;
                case 4: goto L_0x0d1d;
                case 5: goto L_0x0cb9;
                case 6: goto L_0x0c8c;
                case 7: goto L_0x0c63;
                case 8: goto L_0x0c2d;
                case 9: goto L_0x0c03;
                case 10: goto L_0x0bc5;
                case 11: goto L_0x0b21;
                case 12: goto L_0x0b0d;
                case 13: goto L_0x0921;
                case 14: goto L_0x0915;
                case 15: goto L_0x0907;
                case 16: goto L_0x08f9;
                case 17: goto L_0x08dc;
                case 18: goto L_0x08be;
                case 19: goto L_0x08b4;
                case 20: goto L_0x0772;
                case 21: goto L_0x0567;
                case 22: goto L_0x0556;
                case 23: goto L_0x0542;
                case 24: goto L_0x0510;
                case 25: goto L_0x04c0;
                case 26: goto L_0x0457;
                case 27: goto L_0x043c;
                case 28: goto L_0x0007;
                case 29: goto L_0x0007;
                case 30: goto L_0x03c7;
                case 31: goto L_0x03b7;
                case 32: goto L_0x036f;
                case 33: goto L_0x0315;
                case 34: goto L_0x02ae;
                case 35: goto L_0x029b;
                case 36: goto L_0x0285;
                case 37: goto L_0x0266;
                case 38: goto L_0x0257;
                case 39: goto L_0x020c;
                case 40: goto L_0x0200;
                case 41: goto L_0x01e7;
                case 42: goto L_0x01c4;
                case 43: goto L_0x019a;
                case 44: goto L_0x0185;
                case 45: goto L_0x0172;
                case 46: goto L_0x0166;
                case 47: goto L_0x0158;
                case 48: goto L_0x0132;
                case 49: goto L_0x0ccd;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r6.A00
            com.whatsapp.registration.accountdefence.AccountDefenceFetchDeviceConfirmationPoller r3 = (com.whatsapp.registration.accountdefence.AccountDefenceFetchDeviceConfirmationPoller) r3
            java.lang.Object r2 = r6.A01
            X.37K r2 = (X.AnonymousClass37K) r2
            X.0wG r0 = r3.A03
            android.content.Context r1 = r0.A00
            java.lang.String r7 = r2.A02
            X.6M2 r0 = X.C56442wI.A00
            java.lang.String r14 = r0.A01(r1, r7)
            java.lang.String r0 = "FetchDeviceConfirmationPoller/fetchDeviceConfirmation"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0v0 r6 = r3.A04
            X.005 r5 = r6.A00
            android.content.SharedPreferences r4 = X.C36391kE.A0H(r5)
            java.lang.String r0 = "com.whatsapp.registration.RegisterPhone.mistyped_state"
            r1 = 0
            java.lang.String r9 = r4.getString(r0, r1)
            X.0yb r0 = r3.A02
            android.telephony.TelephonyManager r4 = r0.A0K()
            if (r4 == 0) goto L_0x0061
            java.lang.String r0 = r4.getNetworkOperator()
        L_0x003b:
            X.3St r13 = X.C65603St.A00(r0)
            if (r4 == 0) goto L_0x005f
            java.lang.String r0 = r4.getSimOperator()
        L_0x0045:
            X.3St r12 = X.C65603St.A00(r0)
            android.content.SharedPreferences r0 = X.C36391kE.A0H(r5)
            java.lang.String r4 = "reg_attempts_fetch_device_confirmation"
            int r0 = X.C36371kC.A01(r0, r4)
            int r0 = r0 + 1
            X.C36321k7.A0q(r6, r4, r0)
            X.3DL r11 = new X.3DL
            r11.<init>(r0, r1)
            r0 = -1
            goto L_0x0063
        L_0x005f:
            r0 = r1
            goto L_0x0045
        L_0x0061:
            r0 = r1
            goto L_0x003b
        L_0x0063:
            X.3UV r10 = r3.A05     // Catch:{ Exception -> 0x011f }
            java.lang.String r6 = r2.A01     // Catch:{ Exception -> 0x011f }
            android.content.SharedPreferences r8 = X.C36391kE.A0H(r5)     // Catch:{ Exception -> 0x011f }
            java.lang.String r5 = "registration_failure_reason"
            java.lang.String r4 = ""
            java.lang.String r8 = r8.getString(r5, r4)     // Catch:{ Exception -> 0x011f }
            r4 = 0
            X.AnonymousClass00C.A0D(r6, r4)     // Catch:{ Exception -> 0x011f }
            r5 = 1
            X.C36331k8.A1G(r7, r5, r8)     // Catch:{ Exception -> 0x011f }
            boolean r4 = r10.A0I()     // Catch:{ Exception -> 0x011f }
            if (r4 != 0) goto L_0x0084
            r10 = 14
            goto L_0x00f2
        L_0x0084:
            r10.A0H(r5)     // Catch:{ Exception -> 0x011f }
            byte[] r18 = r10.A0K(r6, r7)     // Catch:{ Exception -> 0x011f }
            java.lang.String r4 = "fetchAccountDefenceDeviceConfirmation"
            byte[] r19 = r10.A0J(r4)     // Catch:{ Exception -> 0x011f }
            java.util.LinkedHashMap r5 = X.C36431kI.A1G()     // Catch:{ Exception -> 0x011f }
            if (r9 == 0) goto L_0x00a0
            byte[] r9 = X.C36351kA.A1b(r9)     // Catch:{ Exception -> 0x011f }
            java.lang.String r4 = "mistyped"
            r5.put(r4, r9)     // Catch:{ Exception -> 0x011f }
        L_0x00a0:
            java.nio.charset.Charset r9 = X.AnonymousClass0S4.A05     // Catch:{ Exception -> 0x011f }
            byte[] r8 = X.C36371kC.A1Z(r8, r9)     // Catch:{ Exception -> 0x011f }
            java.lang.String r4 = "reason"
            r5.put(r4, r8)     // Catch:{ Exception -> 0x011f }
            org.json.JSONObject r4 = r11.A00()     // Catch:{ Exception -> 0x011f }
            java.lang.String r4 = X.C36381kD.A0y(r4)     // Catch:{ Exception -> 0x011f }
            byte[] r8 = X.C36371kC.A1Z(r4, r9)     // Catch:{ Exception -> 0x011f }
            java.lang.String r4 = "client_metrics"
            r5.put(r4, r8)     // Catch:{ Exception -> 0x011f }
            X.AnonymousClass3UV.A0A(r13, r12, r9, r5)     // Catch:{ Exception -> 0x011f }
            X.AnonymousClass3UV.A03(r10, r5)     // Catch:{ Exception -> 0x011f }
            X.3Sd r4 = r10.A09     // Catch:{ Exception -> 0x011f }
            java.lang.String r8 = "fetch_device_confirm_entrypoint"
            java.lang.String r15 = r10.A0G(r6, r8)     // Catch:{ Exception -> 0x011f }
            java.util.List r16 = X.AnonymousClass3UV.A02(r10)     // Catch:{ Exception -> 0x011f }
            X.33T r10 = r10.A08     // Catch:{ Exception -> 0x011f }
            r20 = 2
            X.4WS r9 = new X.4WS     // Catch:{ Exception -> 0x011f }
            r17 = r5
            r13 = r7
            r12 = r6
            r11 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x011f }
            java.lang.Object r7 = X.AnonymousClass3PM.A00(r9)     // Catch:{ Exception -> 0x011f }
            X.3KD r7 = (X.AnonymousClass3KD) r7     // Catch:{ Exception -> 0x011f }
            if (r7 != 0) goto L_0x00fc
            java.lang.String r4 = "FetchDeviceConfirmationPoller/fetchDeviceConfirmation/result is null"
            com.whatsapp.util.Log.e((java.lang.String) r4)     // Catch:{ Exception -> 0x011f }
            com.whatsapp.registration.accountdefence.AccountDefenceFetchDeviceConfirmationPoller.A00(r1, r2, r3)     // Catch:{ Exception -> 0x011f }
            X.4Ta r4 = r2.A00     // Catch:{ Exception -> 0x011f }
            r4.onError(r0)     // Catch:{ Exception -> 0x011f }
            return
        L_0x00f2:
            r9 = r1
            r11 = -1
            r12 = 0
            r13 = 0
            X.3KD r7 = new X.3KD     // Catch:{ Exception -> 0x011f }
            r8 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x011f }
        L_0x00fc:
            int r6 = r7.A00     // Catch:{ Exception -> 0x011f }
            r5 = 14
            if (r6 != r5) goto L_0x010d
            java.lang.String r4 = "FetchDeviceConfirmationPoller/fetchDeviceConfirmation/wamsys initialization fails"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ Exception -> 0x011f }
            X.4Ta r4 = r2.A00     // Catch:{ Exception -> 0x011f }
            r4.onError(r5)     // Catch:{ Exception -> 0x011f }
            return
        L_0x010d:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x011f }
            java.lang.String r4 = "FetchDeviceConfirmationPoller/fetchDeviceConfirmation/success status:"
            X.C36321k7.A1T(r4, r5, r6)     // Catch:{ Exception -> 0x011f }
            com.whatsapp.registration.accountdefence.AccountDefenceFetchDeviceConfirmationPoller.A00(r7, r2, r3)     // Catch:{ Exception -> 0x011f }
            X.4Ta r4 = r2.A00     // Catch:{ Exception -> 0x011f }
            r4.BU2(r7)     // Catch:{ Exception -> 0x011f }
            return
        L_0x011f:
            r6 = move-exception
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "FetchDeviceConfirmationPoller/fetchDeviceConfirmation/error "
            X.C36321k7.A1J(r6, r4, r5)
            com.whatsapp.registration.accountdefence.AccountDefenceFetchDeviceConfirmationPoller.A00(r1, r2, r3)
            X.4Ta r1 = r2.A00
            r1.onError(r0)
            return
        L_0x0132:
            java.lang.Object r1 = r6.A00
            com.whatsapp.settings.SettingsPasskeysDisabledFragment r1 = (com.whatsapp.settings.SettingsPasskeysDisabledFragment) r1
            java.lang.Object r0 = r6.A01
            X.97X r0 = (X.AnonymousClass97X) r0
            X.C36321k7.A0w(r1, r0)
            X.3Dp r2 = r1.A00
            if (r2 == 0) goto L_0x0151
            android.content.Context r1 = r1.A0a()
            X.8ob r0 = (X.C182138ob) r0
            java.lang.Object r0 = r0.A00
            X.9Vu r0 = (X.C195749Vu) r0
            X.8zD r0 = r0.A00
            r2.A00(r1, r0)
            return
        L_0x0151:
            java.lang.String r0 = "passkeyRemedyPresenter"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0158:
            java.lang.Object r0 = r6.A00
            com.whatsapp.service.RestoreChatConnectionWorker r0 = (com.whatsapp.service.RestoreChatConnectionWorker) r0
            java.lang.Object r1 = r6.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            android.os.Handler r0 = r0.A00
            r0.removeCallbacks(r1)
            return
        L_0x0166:
            java.lang.Object r0 = r6.A00
            com.whatsapp.service.RestoreChatConnectionWorker r0 = (com.whatsapp.service.RestoreChatConnectionWorker) r0
            java.lang.Object r1 = r6.A01
            X.19J r0 = r0.A03
            r0.unregisterObserver(r1)
            return
        L_0x0172:
            java.lang.Object r0 = r6.A00
            X.4YE r0 = (X.AnonymousClass4YE) r0
            java.lang.Object r1 = r6.A01
            X.11F r1 = (X.AnonymousClass11F) r1
            java.lang.Object r0 = r0.A00
            com.whatsapp.search.SearchFragment r0 = (com.whatsapp.search.SearchFragment) r0
            com.whatsapp.search.SearchFragment.A05(r1, r0)
            X.C36421kH.A1E(r0)
            return
        L_0x0185:
            java.lang.Object r2 = r6.A00
            com.whatsapp.search.SearchFragment r2 = (com.whatsapp.search.SearchFragment) r2
            java.lang.Object r0 = r6.A01
            java.lang.Number r0 = (java.lang.Number) r0
            androidx.recyclerview.widget.RecyclerView r1 = r2.A05
            int r0 = r0.intValue()
            r1.A0h(r0)
            com.whatsapp.search.SearchFragment.A09(r2)
            return
        L_0x019a:
            java.lang.Object r3 = r6.A00
            com.whatsapp.search.SearchFragment r3 = (com.whatsapp.search.SearchFragment) r3
            java.lang.Object r2 = r6.A01
            X.11F r2 = (X.AnonymousClass11F) r2
            com.whatsapp.search.SearchViewModel r0 = r3.A1d
            int r1 = r0.A0W(r2)
            r0 = 5
            if (r1 != r0) goto L_0x01c1
            java.lang.String r5 = "business_search"
        L_0x01ad:
            X.1Hx r3 = r3.A0y
            com.whatsapp.jid.UserJid r4 = X.C36401kF.A0b(r2)
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = "whatsapp"
            r3.A02(r4, r5, r6, r7, r9)
            return
        L_0x01c1:
            java.lang.String r5 = "global_search_new_chat"
            goto L_0x01ad
        L_0x01c4:
            java.lang.Object r0 = r6.A00
            X.3pT r0 = (X.C76803pT) r0
            java.lang.Object r4 = r6.A01
            X.3XD r4 = (X.AnonymousClass3XD) r4
            X.32s r0 = r0.A00
            com.whatsapp.report.BusinessActivityReportViewModel r3 = r0.A00
            X.1cX r2 = r3.A05
            int r1 = r2.A00()
            r0 = 4
            if (r1 == r0) goto L_0x01e3
            r2.A03(r4)
            X.00s r1 = r3.A02
            r0 = 2
            X.C36341k9.A16(r1, r0)
            return
        L_0x01e3:
            com.whatsapp.report.BusinessActivityReportViewModel.A01(r3)
            return
        L_0x01e7:
            java.lang.Object r3 = r6.A00
            com.whatsapp.report.ReportActivity r3 = (com.whatsapp.report.ReportActivity) r3
            java.lang.Object r2 = r6.A01
            X.2o7 r2 = (X.C51622o7) r2
            com.whatsapp.report.ShareReportConfirmationDialogFragment r1 = new com.whatsapp.report.ShareReportConfirmationDialogFragment
            r1.<init>()
            X.3qa r0 = new X.3qa
            r0.<init>(r2, r3)
            r1.A00 = r0
            r0 = 0
            r3.Btl(r1, r0)
            return
        L_0x0200:
            java.lang.Object r1 = r6.A00
            com.whatsapp.report.ReportActivity r1 = (com.whatsapp.report.ReportActivity) r1
            java.lang.Object r0 = r6.A01
            X.2o7 r0 = (X.C51622o7) r0
            com.whatsapp.report.ReportActivity.A0G(r0, r1)
            return
        L_0x020c:
            java.lang.Object r5 = r6.A00
            com.whatsapp.report.ReportActivity r5 = (com.whatsapp.report.ReportActivity) r5
            java.lang.Object r6 = r6.A01
            X.3lB r6 = (X.C74173lB) r6
            X.17Y r0 = r5.A05
            boolean r0 = r0.A0M()
            if (r0 == 0) goto L_0x0cfc
            X.2o7 r1 = r6.A06
            r0 = 2
            com.whatsapp.report.ReportActivity.A07(r1, r5, r0)
            X.2o7 r0 = X.C51622o7.NEWSLETTER
            if (r1 != r0) goto L_0x0253
            X.2by r0 = r6.A03()
            if (r0 == 0) goto L_0x0250
            long r3 = r0.A00
        L_0x022e:
            int r0 = r6.A01
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0253
            X.2by r0 = r6.A03()
            if (r0 == 0) goto L_0x024d
            long r2 = r0.A00
        L_0x023d:
            r1 = 1
            X.2Ky r0 = new X.2Ky
            r0.<init>(r6, r5, r1)
            com.whatsapp.report.DownloadLargeNewsletterReportFileConfirmationDialogFragment r1 = new com.whatsapp.report.DownloadLargeNewsletterReportFileConfirmationDialogFragment
            r1.<init>(r0, r2)
            r0 = 0
            r5.Btl(r1, r0)
            return
        L_0x024d:
            r2 = 0
            goto L_0x023d
        L_0x0250:
            r3 = 0
            goto L_0x022e
        L_0x0253:
            r6.A0E(r5)
            return
        L_0x0257:
            java.lang.Object r0 = r6.A00
            X.3lB r0 = (X.C74173lB) r0
            java.lang.Object r2 = r6.A01
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            X.16J r1 = r0.A05
            r0 = -1
            r1.A05(r2, r0)
            return
        L_0x0266:
            java.lang.Object r1 = r6.A00
            X.4aA r1 = (X.C90444aA) r1
            java.lang.Object r0 = r6.A01
            X.3KD r0 = (X.AnonymousClass3KD) r0
            java.lang.Object r1 = r1.A00
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r1 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r1
            java.lang.String r2 = r1.A1D
            java.lang.String r3 = r1.A1F
            java.lang.String r4 = r0.A02
            boolean r5 = r0.A05
            boolean r6 = r0.A04
            r0 = 0
            r7 = 0
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0r(r0, r1, r2, r3, r4, r5, r6, r7)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1D(r1)
            return
        L_0x0285:
            java.lang.Object r2 = r6.A00
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r2 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r2
            java.lang.Object r1 = r6.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            java.lang.String r0 = "VerifyPhoneNumber/edit"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r1 == 0) goto L_0x0297
            r1.run()
        L_0x0297:
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1B(r2)
            return
        L_0x029b:
            java.lang.Object r1 = r6.A01
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r1 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r1
            boolean r0 = X.AnonymousClass3PP.A00(r1)
            if (r0 == 0) goto L_0x02a9
            r0 = 2
            r1.A3k(r0)
        L_0x02a9:
            r0 = 1
            r1.A3p(r0)
            return
        L_0x02ae:
            java.lang.Object r0 = r6.A00
            com.whatsapp.registration.phonenumberentry.RegisterPhone r0 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r0
            X.005 r0 = r0.A0a
            X.3Ae r5 = X.AnonymousClass3D0.A00(r0)
            java.lang.Object r4 = r6.A01
            X.3KK r4 = (X.AnonymousClass3KK) r4
            X.0v0 r3 = r5.A05
            java.lang.String r2 = r4.A03
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r3)
            java.lang.String r0 = "pref_wfs_name"
            X.C36341k9.A0x(r1, r0, r2)
            java.lang.String r2 = r4.A04
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r3)
            java.lang.String r0 = "pref_nta_profile_pic"
            X.C36341k9.A0x(r1, r0, r2)
            java.lang.Integer r0 = r4.A00
            if (r0 == 0) goto L_0x0313
            int r2 = r0.intValue()
        L_0x02dc:
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r3)
            java.lang.String r0 = "pref_nta_disclosure_id"
            X.C36341k9.A0v(r1, r0, r2)
            r1 = 4
            X.48T r0 = new X.48T
            r0.<init>(r5)
            java.lang.Object r0 = X.C131886Rd.A00(r0, r1)
            int r2 = X.AnonymousClass000.A0I(r0)
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r3)
            java.lang.String r0 = "pref_nta_source"
            X.C36341k9.A0v(r1, r0, r2)
            java.util.List r0 = r4.A05
            if (r0 != 0) goto L_0x0302
            X.09w r0 = X.C023409w.A00
        L_0x0302:
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r3)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r0)
            java.lang.String r0 = "pref_nta_target_accounts"
            android.content.SharedPreferences$Editor r0 = r2.putStringSet(r0, r1)
            goto L_0x082b
        L_0x0313:
            r2 = -1
            goto L_0x02dc
        L_0x0315:
            java.lang.Object r5 = r6.A00
            X.3TX r5 = (X.AnonymousClass3TX) r5
            java.lang.Object r3 = r6.A01
            X.3Fi r3 = (X.C62243Fi) r3
            r0 = 1
            X.AnonymousClass00C.A0D(r3, r0)
            X.005 r0 = r5.A01
            java.lang.Object r2 = r0.get()
            X.3UV r2 = (X.AnonymousClass3UV) r2
            monitor-enter(r5)
            X.005 r1 = r5.A02     // Catch:{ all -> 0x036c }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x036c }
            X.0v0 r0 = (X.C19420v0) r0     // Catch:{ all -> 0x036c }
            java.lang.String r6 = r0.A0f()     // Catch:{ all -> 0x036c }
            X.AnonymousClass00C.A08(r6)     // Catch:{ all -> 0x036c }
            monitor-exit(r5)
            monitor-enter(r5)
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x036c }
            X.0v0 r0 = (X.C19420v0) r0     // Catch:{ all -> 0x036c }
            java.lang.String r7 = r0.A0h()     // Catch:{ all -> 0x036c }
            X.AnonymousClass00C.A08(r7)     // Catch:{ all -> 0x036c }
            monitor-exit(r5)
            java.util.Map r11 = r3.A00
            java.lang.String r8 = "unknown"
            boolean r0 = r2.A0I()
            if (r0 == 0) goto L_0x0cfc
            byte[] r12 = r2.A0K(r6, r7)
            java.lang.String r0 = "sendClientFunnelLog"
            byte[] r13 = r2.A0J(r0)
            X.3Sd r5 = r2.A09
            X.33T r4 = r2.A08
            r10 = r8
            X.2ku r3 = new X.2ku
            r9 = r8
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.AnonymousClass3PM.A00(r3)
            return
        L_0x036c:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        L_0x036f:
            java.lang.Object r3 = r6.A00
            com.whatsapp.registration.email.RegisterEmail r3 = (com.whatsapp.registration.email.RegisterEmail) r3
            java.lang.Object r0 = r6.A01
            java.lang.Number r0 = (java.lang.Number) r0
            X.9Pi r4 = r3.A03
            if (r4 == 0) goto L_0x03b0
            java.lang.String r5 = r3.A0D
            int r7 = r3.A00
            java.lang.String r6 = java.lang.String.valueOf(r0)
            r8 = 1
            r9 = 2
            r10 = 2
            r4.A00(r5, r6, r7, r8, r9, r10)
            X.AnonymousClass3SJ.A00(r3, r8)
            if (r0 == 0) goto L_0x03ab
            int r1 = r0.intValue()
            r0 = 533(0x215, float:7.47E-43)
            if (r1 != r0) goto L_0x03a6
            X.1RJ r1 = r3.A0A
            if (r1 != 0) goto L_0x03a1
            java.lang.String r0 = "invalidEmailViewStub"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x03a1:
            r0 = 0
            r1.A03(r0)
            return
        L_0x03a6:
            r0 = 403(0x193, float:5.65E-43)
            r2 = 3
            if (r1 == r0) goto L_0x03ac
        L_0x03ab:
            r2 = 2
        L_0x03ac:
            X.AnonymousClass3SJ.A01(r3, r2)
            return
        L_0x03b0:
            java.lang.String r0 = "emailVerificationLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x03b7:
            java.lang.Object r0 = r6.A00
            com.whatsapp.registration.directmigration.MigrationProviderOrderedBroadcastReceiver r0 = (com.whatsapp.registration.directmigration.MigrationProviderOrderedBroadcastReceiver) r0
            java.lang.Object r2 = r6.A01
            android.content.Context r2 = (android.content.Context) r2
            X.1Ca r1 = r0.A03
            X.1Cg r0 = r0.A07
            X.AnonymousClass6YO.A0A(r2, r1, r0)
            return
        L_0x03c7:
            java.lang.Object r2 = r6.A00
            com.whatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment r2 = (com.whatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment) r2
            java.lang.Object r0 = r6.A01
            X.3Ip r0 = (X.C63063Ip) r0
            com.whatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment.A06 = r0
            android.view.View r1 = r2.A00
            r0 = 2131431798(0x7f0b1176, float:1.8485335E38)
            android.widget.TextView r5 = X.C36391kE.A0O(r1, r0)
            X.3Ip r0 = com.whatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment.A06
            long r3 = r0.A00
            java.util.Date r0 = new java.util.Date
            r0.<init>(r3)
            X.0wo r4 = r2.A04
            X.0ts r3 = r2.A01
            long r0 = r0.getTime()
            X.AnonymousClass3UY.A0H(r5, r4, r3, r0)
            android.view.View r1 = r2.A00
            r0 = 2131431799(0x7f0b1177, float:1.8485337E38)
            android.widget.TextView r3 = X.C36391kE.A0O(r1, r0)
            X.3Ip r0 = com.whatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment.A06
            java.lang.String r0 = r0.A01
            if (r0 != 0) goto L_0x0430
            r0 = 2131886260(0x7f1200b4, float:1.9407094E38)
            java.lang.String r0 = r2.A0n(r0)
        L_0x0404:
            r3.setText(r0)
            android.view.View r1 = r2.A00
            r0 = 2131431287(0x7f0b0f77, float:1.8484299E38)
            android.view.View r1 = X.C012005e.A02(r1, r0)
            r0 = 4
            r1.setVisibility(r0)
            android.view.View r1 = r2.A00
            r0 = 2131431801(0x7f0b1179, float:1.8485341E38)
            android.view.View r0 = X.C012005e.A02(r1, r0)
            r1 = 0
            r0.setVisibility(r1)
            android.widget.Button r0 = r2.A02
            if (r0 == 0) goto L_0x0428
            r0.setVisibility(r1)
        L_0x0428:
            android.widget.Button r0 = r2.A01
            if (r0 == 0) goto L_0x0cfc
            r0.setVisibility(r1)
            return
        L_0x0430:
            r1 = 2131886259(0x7f1200b3, float:1.9407092E38)
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r0)
            java.lang.String r0 = r2.A0o(r1, r0)
            goto L_0x0404
        L_0x043c:
            java.lang.Object r3 = r6.A00
            com.whatsapp.registration.VerifyTwoFactorAuth r3 = (com.whatsapp.registration.VerifyTwoFactorAuth) r3
            java.lang.Object r2 = r6.A01
            X.3BH r2 = (X.AnonymousClass3BH) r2
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/dismiss-verification-complete-dialog"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r2.A0E
            if (r0 == 0) goto L_0x0455
            java.lang.String r1 = r3.A0X
        L_0x044f:
            java.lang.String r0 = r2.A07
            r3.A3j(r1, r0)
            return
        L_0x0455:
            r1 = 0
            goto L_0x044f
        L_0x0457:
            java.lang.Object r1 = r6.A00
            X.3Cr r1 = (X.C61593Cr) r1
            java.lang.Object r0 = r6.A01
            com.whatsapp.infra.graphql.generated.registration.enums.GraphQLXWA2RegUpsell r0 = (com.whatsapp.infra.graphql.generated.registration.enums.GraphQLXWA2RegUpsell) r0
            int r2 = r0.ordinal()
            r0 = 2
            if (r2 == r0) goto L_0x048d
            r0 = 1
            com.whatsapp.registration.RegisterName r1 = r1.A00
            if (r2 == r0) goto L_0x046f
            com.whatsapp.registration.RegisterName.A0G(r1)
            return
        L_0x046f:
            java.lang.String r0 = "RegisterName//maybeShowRegistrationEmailCaptureScreen"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 22
            X.AnonymousClass3SJ.A01(r1, r0)
            X.1DY r3 = r1.A0k
            r0 = 13
            X.1vp r2 = new X.1vp
            r2.<init>(r1, r0)
            X.1DZ r1 = r3.A02
            X.3lG r0 = new X.3lG
            r0.<init>(r3, r2)
            r1.A01(r0)
            return
        L_0x048d:
            java.lang.String r0 = "RegisterName/showNextScreen/getRegistrationUpsell/maybeShowPasskeyCreateEducationScreen"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.registration.RegisterName r5 = r1.A00
            X.4Rb r2 = r5.A1O
            X.4Rc r1 = r5.A1P
            r0 = 1
            X.3Ec r0 = r1.B41(r0)
            com.whatsapp.registration.passkeys.PasskeyFacade r4 = r2.B40(r0)
            java.lang.String r0 = "RegisterName//maybeShowPasskeyCreateEducationScreen"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 22
            X.AnonymousClass3SJ.A01(r5, r0)
            r0 = 12
            X.1vp r3 = new X.1vp
            r3.<init>(r5, r0)
            androidx.lifecycle.LifecycleCoroutineScopeImpl r2 = X.C33311f5.A00(r5)
            r1 = 0
            com.whatsapp.registration.passkeys.PasskeyFacade$checkPasskeyExists$1 r0 = new com.whatsapp.registration.passkeys.PasskeyFacade$checkPasskeyExists$1
            r0.<init>(r4, r1, r3)
            X.C36331k8.A1T(r0, r2)
            return
        L_0x04c0:
            java.lang.Object r7 = r6.A00
            com.whatsapp.registration.RegisterName r7 = (com.whatsapp.registration.RegisterName) r7
            java.lang.Object r2 = r6.A01
            java.lang.Number r2 = (java.lang.Number) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "RegisterName//maybeShowRegistrationEmailCaptureScreen/result : "
            X.C36321k7.A1K(r2, r0, r1)
            r5 = 22
            X.AnonymousClass3SJ.A00(r7, r5)
            int r0 = r2.intValue()
            r4 = 1
            if (r0 == r4) goto L_0x0505
            if (r0 == 0) goto L_0x0505
            X.3Eb r1 = r7.A1D
            java.lang.String r0 = "EMAIL"
            r1.A00(r0)
            java.lang.String r3 = X.C36361kB.A0l()
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r7.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.email.EmailEducationScreen"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "entrypoint"
            r2.putExtra(r0, r4)
            java.lang.String r0 = "session_id"
            r2.putExtra(r0, r3)
            r7.startActivityForResult(r2, r5)
            return
        L_0x0505:
            X.3Eb r1 = r7.A1D
            java.lang.String r0 = "NONE"
            r1.A00(r0)
            com.whatsapp.registration.RegisterName.A0G(r7)
            return
        L_0x0510:
            java.lang.Object r3 = r6.A00
            com.whatsapp.registration.RegisterName r3 = (com.whatsapp.registration.RegisterName) r3
            java.lang.Object r2 = r6.A01
            r0 = 22
            X.AnonymousClass3SJ.A00(r3, r0)
            X.8yv r0 = X.C188028yv.DOES_NOT_HAVE_PASSKEY
            X.3Eb r1 = r3.A1D
            if (r2 != r0) goto L_0x0539
            java.lang.String r0 = "PASSKEYS"
            r1.A00(r0)
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.passkey.PasskeyCreateEducationScreen"
            r2.setClassName(r1, r0)
            r0 = 21
            r3.startActivityForResult(r2, r0)
            return
        L_0x0539:
            java.lang.String r0 = "NONE"
            r1.A00(r0)
            com.whatsapp.registration.RegisterName.A0G(r3)
            return
        L_0x0542:
            java.lang.Object r2 = r6.A00
            com.whatsapp.registration.RegisterName r2 = (com.whatsapp.registration.RegisterName) r2
            java.lang.Object r1 = r6.A01
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            boolean r0 = X.AnonymousClass000.A1V(r1)
            r2.A1c = r0
            android.widget.ImageView r0 = r2.A01
            r0.setImageBitmap(r1)
            return
        L_0x0556:
            java.lang.Object r1 = r6.A00
            android.app.Dialog r1 = (android.app.Dialog) r1
            java.lang.Object r0 = r6.A01
            X.00S r0 = (X.AnonymousClass00S) r0
            r1.dismiss()
            if (r0 == 0) goto L_0x0cfc
            r0.invoke()
            return
        L_0x0567:
            java.lang.Object r3 = r6.A00
            X.3Op r3 = (X.C64593Op) r3
            java.lang.Object r7 = r6.A01
            X.0v0 r7 = (X.C19420v0) r7
            int r1 = r3.A00     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            r0 = 2
            if (r1 != r0) goto L_0x0738
            com.google.android.finsky.externalreferrer.IGetInstallReferrerService r0 = r3.A02     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            if (r0 == 0) goto L_0x0738
            android.content.ServiceConnection r0 = r3.A01     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            if (r0 == 0) goto L_0x0738
            android.os.Bundle r2 = X.AnonymousClass001.A07()     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            android.content.Context r0 = r3.A03     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            java.lang.String r1 = r0.getPackageName()     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            java.lang.String r0 = "package_name"
            r2.putString(r0, r1)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            com.google.android.finsky.externalreferrer.IGetInstallReferrerService r6 = r3.A02     // Catch:{ RemoteException -> 0x072e }
            X.3WZ r6 = (X.AnonymousClass3WZ) r6     // Catch:{ RemoteException -> 0x072e }
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x072e }
            java.lang.String r0 = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService"
            r5.writeInterfaceToken(r0)     // Catch:{ RemoteException -> 0x072e }
            r4 = 1
            r5.writeInt(r4)     // Catch:{ RemoteException -> 0x072e }
            r1 = 0
            r2.writeToParcel(r5, r1)     // Catch:{ RemoteException -> 0x072e }
            android.os.Parcel r2 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x072e }
            android.os.IBinder r0 = r6.A00     // Catch:{ RuntimeException -> 0x0724 }
            r0.transact(r4, r5, r2, r1)     // Catch:{ RuntimeException -> 0x0724 }
            r2.readException()     // Catch:{ RuntimeException -> 0x0724 }
            r5.recycle()     // Catch:{ RemoteException -> 0x072e }
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR     // Catch:{ RemoteException -> 0x072e }
            int r0 = r2.readInt()     // Catch:{ RemoteException -> 0x072e }
            if (r0 != 0) goto L_0x05b9
            r1 = 0
            goto L_0x05bf
        L_0x05b9:
            java.lang.Object r1 = r1.createFromParcel(r2)     // Catch:{ RemoteException -> 0x072e }
            android.os.Parcelable r1 = (android.os.Parcelable) r1     // Catch:{ RemoteException -> 0x072e }
        L_0x05bf:
            android.os.Bundle r1 = (android.os.Bundle) r1     // Catch:{ RemoteException -> 0x072e }
            r2.recycle()     // Catch:{ RemoteException -> 0x072e }
            X.2xI r0 = new X.2xI     // Catch:{ RemoteException -> 0x072e }
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x072e }
            android.os.Bundle r6 = r0.A00     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            java.lang.String r2 = "install_referrer"
            java.lang.String r5 = r6.getString(r2)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            if (r5 == 0) goto L_0x066e
            int r0 = r5.length()     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            if (r0 == 0) goto L_0x066e
            java.lang.String r1 = "1on1_invite_code="
            r0 = 0
            int r0 = X.AnonymousClass099.A0C(r5, r1, r0, r0)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            if (r0 != 0) goto L_0x0611
            r0 = 17
            java.lang.String r8 = r5.substring(r0)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            X.AnonymousClass00C.A08(r8)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
        L_0x05eb:
            java.lang.String r1 = "app=messenger"
            r0 = 0
            boolean r0 = X.AnonymousClass099.A0O(r5, r1, r0)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            if (r0 == 0) goto L_0x0613
            java.lang.String r1 = "utm_source="
            r0 = 0
            boolean r0 = X.AnonymousClass099.A0O(r5, r1, r0)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            if (r0 == 0) goto L_0x0613
            java.lang.String r4 = X.C36411kG.A0y(r5, r1)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            int r0 = r4.length()     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            if (r0 == 0) goto L_0x0613
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r7)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            java.lang.String r0 = "pref_wa_me_messenger_referrer_link"
            X.C36341k9.A0x(r1, r0, r4)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            goto L_0x0613
        L_0x0611:
            r8 = 0
            goto L_0x05eb
        L_0x0613:
            if (r8 == 0) goto L_0x061d
            int r0 = r8.length()     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            if (r0 == 0) goto L_0x061d
            r12 = 1
            goto L_0x0630
        L_0x061d:
            java.lang.String r1 = "invite_code="
            r0 = 0
            int r0 = X.AnonymousClass099.A0C(r5, r1, r0, r0)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            if (r0 != 0) goto L_0x066e
            r0 = 12
            java.lang.String r8 = r5.substring(r0)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            X.AnonymousClass00C.A08(r8)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            r12 = 0
        L_0x0630:
            int r0 = r8.length()     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            if (r0 == 0) goto L_0x066e
            X.005 r4 = r7.A00     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            android.content.SharedPreferences r1 = X.C36391kE.A0H(r4)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            java.lang.String r0 = "invite_code_from_referrer"
            java.lang.String r0 = X.C36371kC.A0t(r1, r0)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            if (r0 == 0) goto L_0x06b8
            android.content.SharedPreferences r0 = X.C36391kE.A0H(r4)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            java.lang.String r9 = "referrer_clicked_time"
            long r10 = X.C36341k9.A0B(r0, r9)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            java.lang.String r1 = "referrer_click_timestamp_seconds"
            long r4 = r6.getLong(r1)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x066e
            long r4 = r6.getLong(r1)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            if (r12 == 0) goto L_0x06b1
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r7)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            java.lang.String r0 = "1on1_invite_code_from_referrer"
        L_0x0664:
            X.C36341k9.A0x(r1, r0, r8)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r7)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            X.C36341k9.A0w(r0, r9, r4)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
        L_0x066e:
            java.lang.String r2 = r6.getString(r2)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            r11 = 0
            if (r2 == 0) goto L_0x0705
            int r0 = r2.length()     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            if (r0 == 0) goto L_0x0705
            java.lang.String r1 = "&"
            X.0fN r0 = new X.0fN     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            r0.<init>((java.lang.String) r1)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            java.util.List r2 = r0.A01(r2, r11)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            boolean r0 = r2.isEmpty()     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            if (r0 != 0) goto L_0x06ae
            int r0 = r2.size()     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            java.util.ListIterator r1 = r2.listIterator(r0)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
        L_0x0694:
            boolean r0 = r1.hasPrevious()     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            if (r0 == 0) goto L_0x06ae
            int r0 = X.C36411kG.A0A(r1)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            if (r0 == 0) goto L_0x0694
            java.util.List r0 = X.C36411kG.A14(r2, r1)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
        L_0x06a4:
            java.lang.String[] r10 = X.C36431kI.A1b(r0)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            int r9 = r10.length     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            java.lang.String r8 = "unknown"
            r6 = r8
            r5 = 0
            goto L_0x06da
        L_0x06ae:
            X.09w r0 = X.C023409w.A00     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            goto L_0x06a4
        L_0x06b1:
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r7)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            java.lang.String r0 = "invite_code_from_referrer"
            goto L_0x0664
        L_0x06b8:
            java.lang.String r0 = "referrer_click_timestamp_seconds"
            long r4 = r6.getLong(r0)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            if (r12 == 0) goto L_0x06d3
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r7)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            java.lang.String r0 = "1on1_invite_code_from_referrer"
        L_0x06c6:
            X.C36341k9.A0x(r1, r0, r8)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r7)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            java.lang.String r0 = "referrer_clicked_time"
            X.C36341k9.A0w(r1, r0, r4)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            goto L_0x066e
        L_0x06d3:
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r7)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            java.lang.String r0 = "invite_code_from_referrer"
            goto L_0x06c6
        L_0x06da:
            if (r5 >= r9) goto L_0x0708
            r4 = r10[r5]     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            java.lang.String r1 = "utm_source="
            boolean r0 = X.AnonymousClass099.A0O(r4, r1, r11)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x06f1
            X.0fN r0 = new X.0fN     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            r0.<init>((java.lang.String) r1)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            java.lang.String r8 = r0.A00(r4, r2)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
        L_0x06f1:
            java.lang.String r1 = "utm_campaign="
            boolean r0 = X.AnonymousClass099.A0O(r4, r1, r11)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            if (r0 == 0) goto L_0x0702
            X.0fN r0 = new X.0fN     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            r0.<init>((java.lang.String) r1)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            java.lang.String r6 = r0.A00(r4, r2)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
        L_0x0702:
            int r5 = r5 + 1
            goto L_0x06da
        L_0x0705:
            java.lang.String r2 = "unknown|unknown"
            goto L_0x0715
        L_0x0708:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r8)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            r0 = 124(0x7c, float:1.74E-43)
            r1.append(r0)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            java.lang.String r2 = X.AnonymousClass000.A0q(r6, r1)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
        L_0x0715:
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r7)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            java.lang.String r0 = "app_install_source"
            X.C36341k9.A0x(r1, r0, r2)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            java.lang.String r0 = "InstallReferrerUtils/onInstallReferrerSetupFinished/InstallReferrerResponse.OK/referrer saved"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            goto L_0x073f
        L_0x0724:
            r0 = move-exception
            r2.recycle()     // Catch:{ all -> 0x0729 }
            throw r0     // Catch:{ all -> 0x0729 }
        L_0x0729:
            r0 = move-exception
            r5.recycle()     // Catch:{ RemoteException -> 0x072e }
            throw r0     // Catch:{ RemoteException -> 0x072e }
        L_0x072e:
            r1 = move-exception
            java.lang.String r0 = "RemoteException getting install referrer information"
            X.AnonymousClass3LL.A01(r0)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            r0 = 0
            r3.A00 = r0     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            throw r1     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
        L_0x0738:
            java.lang.String r0 = "Service not connected. Please start a connection before using the service."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
            throw r0     // Catch:{ RemoteException -> 0x073f, all -> 0x0758 }
        L_0x073f:
            r0 = 3
            r3.A00 = r0
            android.content.ServiceConnection r0 = r3.A01
            r2 = 0
            if (r0 == 0) goto L_0x0755
            java.lang.String r0 = "Unbinding from service."
            X.AnonymousClass3LL.A00(r0)
            android.content.Context r1 = r3.A03
            android.content.ServiceConnection r0 = r3.A01
            r1.unbindService(r0)
            r3.A01 = r2
        L_0x0755:
            r3.A02 = r2
            return
        L_0x0758:
            r4 = move-exception
            r0 = 3
            r3.A00 = r0
            android.content.ServiceConnection r0 = r3.A01
            r2 = 0
            if (r0 == 0) goto L_0x076f
            java.lang.String r0 = "Unbinding from service."
            X.AnonymousClass3LL.A00(r0)
            android.content.Context r1 = r3.A03
            android.content.ServiceConnection r0 = r3.A01
            r1.unbindService(r0)
            r3.A01 = r2
        L_0x076f:
            r3.A02 = r2
            throw r4
        L_0x0772:
            java.lang.Object r4 = r6.A00
            com.whatsapp.registration.EULA r4 = (com.whatsapp.registration.EULA) r4
            java.lang.Object r3 = r6.A01
            X.0Yl r3 = (X.C07590Yl) r3
            X.32n r1 = r4.A0V
            java.lang.String r0 = "FoaBackupTokenRequester/requestFoaBackupToken"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1XH r5 = r1.A00
            boolean r0 = r5.A01()
            if (r0 == 0) goto L_0x0797
            X.1kh r2 = new X.1kh
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            java.lang.String r0 = "com.facebook.GET_FOA_BACKUP_TOKEN"
            r5.A00(r2, r1, r0)
        L_0x0797:
            java.lang.String r0 = "EULA/retrieveBackupToken/try to retrieve token from block store"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0v0 r8 = r4.A09
            X.4ry r7 = new X.4ry
            r7.<init>(r4)
            r5 = 0
            X.0Wq r6 = new X.0Wq
            r6.<init>(r5)
            r0 = 1
            X.0Ky[] r1 = new X.C04520Ky[r0]
            X.0Ky r0 = X.C114115gf.A00
            r2 = 0
            r1[r2] = r0
            r6.A03 = r1
            X.A3I r0 = new X.A3I
            r0.<init>(r7)
            r6.A01 = r0
            r6.A02 = r2
            r0 = 1570(0x622, float:2.2E-42)
            r6.A00 = r0
            X.0JY r0 = r6.A00()
            com.google.android.gms.tasks.zzw r7 = X.C07590Yl.A01(r7, r0, r2)
            r0 = 10
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x07d0 }
            com.google.android.gms.tasks.Tasks.await(r7, r0, r6)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x07d0 }
            goto L_0x07d6
        L_0x07d0:
            r1 = move-exception
            java.lang.String r0 = "BackupTokenUtils/retrieveBlockStore/exception receiving bytes"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x07d6:
            boolean r0 = r7.isSuccessful()
            r1 = 0
            if (r0 == 0) goto L_0x089a
            java.lang.Object r0 = r7.getResult()
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L_0x089a
            int r0 = r0.length
            if (r0 == 0) goto L_0x089a
            java.lang.Object r7 = r7.getResult()
            byte[] r7 = (byte[]) r7
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "BackupTokenUtils/retrieveBlockStore/Block Store token success/saved token size is "
            r6.append(r0)
            int r1 = r7.length
            r6.append(r1)
            java.lang.String r0 = " bytes"
            X.C36321k7.A1a(r6, r0)
            X.C133306Xt.A04(r8, r5, r1)
            r0 = 1
            X.C133306Xt.A03(r4, r5, r7, r0)
        L_0x0807:
            r6 = 1
            java.io.File r1 = r4.getFilesDir()
            java.lang.String r0 = "backup_token"
            java.io.File r0 = X.C36441kJ.A0w(r1, r0)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x082f
            java.lang.String r0 = "EULA/retrieveBackupToken/successfully retrieved token from block store"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0v0 r0 = r4.A09
            java.lang.String r2 = "block_store"
        L_0x0821:
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "backup_token_source"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)
        L_0x082b:
            r0.apply()
            return
        L_0x082f:
            if (r3 != 0) goto L_0x0837
            java.lang.String r0 = "EULA/retrieveBackupToken/account transfer/accountTransferClient is null"
        L_0x0833:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0837:
            java.lang.String r0 = "com.whatsapp"
            X.AnonymousClass006.A01(r0)
            X.0K3 r1 = new X.0K3
            r1.<init>(r0)
            X.0Iq r0 = new X.0Iq
            r0.<init>(r1)
            com.google.android.gms.tasks.zzw r3 = X.C07590Yl.A01(r3, r0, r2)
            r1 = 10
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0877 }
            com.google.android.gms.tasks.Tasks.await(r3, r1, r0)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0877 }
            boolean r0 = r3.isSuccessful()
            if (r0 == 0) goto L_0x0cfc
            java.lang.String r0 = "EULA/retrieveBackupToken/account transfer/import successful"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r3.getResult()
            byte[] r1 = (byte[]) r1
            if (r1 == 0) goto L_0x0874
            int r0 = r1.length
            if (r0 == 0) goto L_0x0874
            java.lang.String r0 = "EULA/retrieveBackupToken/account transfer/save imported token to backup_token file"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.C133306Xt.A03(r4, r5, r1, r6)
            X.0v0 r0 = r4.A09
            java.lang.String r2 = "device_to_device_transfer"
            goto L_0x0821
        L_0x0874:
            java.lang.String r0 = "EULA/retrieveBackupToken/account transfer/imported empty data"
            goto L_0x0833
        L_0x0877:
            r2 = move-exception
            java.lang.String r0 = "EULA/retrieveBackupToken/account transfer/error during import"
            com.whatsapp.util.Log.e(r0, r2)
            boolean r0 = r2 instanceof java.util.concurrent.ExecutionException
            if (r0 == 0) goto L_0x08ae
            java.lang.Throwable r0 = r2.getCause()
            boolean r0 = r0 instanceof X.AnonymousClass0JD
            if (r0 == 0) goto L_0x08ae
            java.lang.Throwable r0 = r2.getCause()
            com.google.android.gms.common.api.ApiException r0 = (com.google.android.gms.common.api.ApiException) r0
            com.google.android.gms.common.api.Status r0 = r0.mStatus
            int r1 = r0.A01
            r0 = 20501(0x5015, float:2.8728E-41)
            if (r1 != r0) goto L_0x08ae
            java.lang.String r0 = "EULA/retrieveBackupToken/account transfer/NO_DATA_AVAILABLE exception"
            goto L_0x0833
        L_0x089a:
            boolean r0 = r7.isSuccessful()
            if (r0 != 0) goto L_0x08a4
            java.lang.Exception r1 = r7.getException()
        L_0x08a4:
            X.C133306Xt.A04(r8, r1, r2)
            java.lang.String r0 = "BackupTokenUtils/retrieveBlockStore/Block Store token not retrieved"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0807
        L_0x08ae:
            java.lang.String r0 = "EULA/create/exception during retrieving data from account transfer"
            com.whatsapp.util.Log.e(r0, r2)
            return
        L_0x08b4:
            java.lang.Object r1 = r6.A00
            X.4Ta r1 = (X.C88524Ta) r1
            java.lang.Object r0 = r6.A01
            r1.BU2(r0)
            return
        L_0x08be:
            java.lang.Object r3 = r6.A00
            com.whatsapp.reactions.ReactionsTrayViewModel r3 = (com.whatsapp.reactions.ReactionsTrayViewModel) r3
            java.lang.Object r2 = r6.A01
            X.3ty r2 = (X.C79593ty) r2
            X.3T1 r0 = r3.A0G
            if (r0 != 0) goto L_0x08d3
            r0 = 0
        L_0x08cb:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A0C(r0)
            return
        L_0x08d3:
            X.1Fz r1 = r3.A08
            X.3T1 r0 = r3.A0G
            boolean r0 = r1.A01(r0)
            goto L_0x08cb
        L_0x08dc:
            java.lang.Object r4 = r6.A00
            com.whatsapp.reactions.ReactionsBottomSheetDialogFragment r4 = (com.whatsapp.reactions.ReactionsBottomSheetDialogFragment) r4
            java.lang.Object r1 = r6.A01
            X.147 r1 = (X.AnonymousClass147) r1
            X.1LV r0 = r4.A08
            X.147 r3 = r0.A02(r1)
            if (r3 == 0) goto L_0x0cfc
            X.1YC r2 = r4.A0I
            X.12q r0 = r4.A0G
            int r1 = r0.A05(r1)
            r0 = 0
            r2.A00(r3, r1, r0)
            return
        L_0x08f9:
            java.lang.Object r0 = r6.A00
            X.3pc r0 = (X.C76893pc) r0
            java.lang.Object r1 = r6.A01
            X.39R r1 = (X.AnonymousClass39R) r1
            X.4RY r0 = r0.A02
            r0.BfB(r1)
            return
        L_0x0907:
            java.lang.Object r0 = r6.A00
            X.2jZ r0 = (X.C49712jZ) r0
            java.lang.Object r1 = r6.A01
            X.141 r1 = (X.AnonymousClass141) r1
            X.16D r0 = r0.A01
            r0.A0R(r1)
            return
        L_0x0915:
            java.lang.Object r1 = r6.A00
            X.3qC r1 = (X.C77253qC) r1
            java.lang.Object r0 = r6.A01
            X.39R r0 = (X.AnonymousClass39R) r0
            r1.BfB(r0)
            return
        L_0x0921:
            java.lang.Object r4 = r6.A00
            X.3qC r4 = (X.C77253qC) r4
            java.lang.Object r12 = r6.A01
            X.6Pu r12 = (X.C131626Pu) r12
            X.39R r14 = r4.A02
            java.lang.ref.WeakReference r0 = r4.A0M
            java.lang.Object r2 = r0.get()
            X.3Pk r2 = (X.C64783Pk) r2
            if (r2 == 0) goto L_0x0cfc
            r11 = 0
            if (r14 == 0) goto L_0x0b0a
            com.whatsapp.jid.UserJid r5 = r14.A02
            if (r5 == 0) goto L_0x0b0a
            X.185 r0 = r4.A0B
            X.3L0 r11 = r0.A02(r5)
            X.16D r0 = r4.A0A
            boolean r0 = r0.A0q(r5)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r0)
            X.14u r3 = r2.A05
            boolean r0 = r3 instanceof X.AnonymousClass4OW
            if (r0 == 0) goto L_0x097f
            X.4OW r3 = (X.AnonymousClass4OW) r3
            com.whatsapp.qrcode.contactqr.QrSheetDeepLinkActivity r3 = (com.whatsapp.qrcode.contactqr.QrSheetDeepLinkActivity) r3
            boolean r0 = X.C36431kI.A1V(r3, r5)
            if (r0 != 0) goto L_0x097f
            android.content.Intent r6 = r3.getIntent()
            r1 = 4
            java.lang.String r0 = "extra_entry_point"
            int r7 = r6.getIntExtra(r0, r1)
            X.0yC r1 = r3.A0D
            java.lang.String r0 = r3.A0M
            boolean r0 = X.AnonymousClass1DW.A0A(r1, r0)
            r6 = 3
            if (r0 == 0) goto L_0x0af1
            X.3Gi r3 = r3.A0E
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r3.A01(r5, r1, r0)
        L_0x097f:
            X.0yW r13 = r4.A0I
            int r6 = r4.A05
            r1 = 0
            java.lang.String r7 = r4.A0L
            boolean r18 = X.C65683Tb.A04(r7)
            r17 = r6
            r16 = r1
            X.C65683Tb.A03(r11, r12, r13, r14, r15, r16, r17, r18)
            int r0 = r4.A04
            java.lang.String r3 = X.C65683Tb.A02(r7, r0)
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x09a0
            X.14u r0 = r2.A05
            r0.Bnv()
        L_0x09a0:
            r9 = 0
            r2.A00 = r1
            r8 = 0
            if (r14 == 0) goto L_0x09b0
            com.whatsapp.jid.UserJid r1 = r14.A02
            if (r1 == 0) goto L_0x09b0
            X.16D r0 = r2.A0B
            X.141 r9 = r0.A08(r1)
        L_0x09b0:
            r10 = 5
            if (r6 != r10) goto L_0x0aed
            java.lang.String r1 = "message_short_link"
        L_0x09b5:
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x0a74
            if (r14 == 0) goto L_0x0a74
            if (r9 == 0) goto L_0x0a74
            X.16D r0 = r2.A0B
            com.whatsapp.jid.UserJid r11 = r14.A02
            boolean r0 = r0.A0q(r11)
            r5 = 2
            if (r0 == 0) goto L_0x09d9
            X.171 r4 = r2.A0E
            r0 = -1
            boolean r0 = r4.A0g(r9, r0)
            if (r0 == 0) goto L_0x09e8
            X.0wQ r0 = r2.A08
            boolean r0 = r0.A0M(r11)
            if (r0 != 0) goto L_0x09e8
        L_0x09d9:
            int r4 = r14.A01
            r0 = 3
            if (r4 == r0) goto L_0x09e8
            if (r4 != r5) goto L_0x0a74
            X.1A6 r0 = r2.A0F
            boolean r0 = r0.A0E(r11)
            if (r0 == 0) goto L_0x0a74
        L_0x09e8:
            if (r6 != r10) goto L_0x09ef
            X.14u r0 = r2.A05
            r0.finish()
        L_0x09ef:
            java.lang.String r4 = r14.A03
            int r6 = r14.A01
            if (r6 == r5) goto L_0x0a46
            r0 = 3
            if (r6 != r0) goto L_0x0a69
            X.0yC r4 = r2.A0J
            boolean r0 = X.AnonymousClass1DW.A0A(r4, r7)
            if (r0 == 0) goto L_0x0a3c
            r7 = 20
        L_0x0a02:
            X.190 r4 = X.C36441kJ.A0j()
            X.14u r8 = r2.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            android.content.Intent r7 = r4.A1X(r8, r9, r0)
        L_0x0a10:
            java.lang.String r4 = r2.A01
            java.lang.String r0 = "extra_deep_link_session_id"
            r7.putExtra(r0, r4)
            android.content.Intent r0 = X.C36371kC.A0C(r8)
            r8.startActivity(r0)
            java.lang.String r0 = "QrHandler"
            X.AnonymousClass3M9.A01(r7, r0)
            r8.startActivity(r7)
            if (r6 != r5) goto L_0x0a38
            X.0wU r4 = r2.A0Q
            r10 = 6
            X.3vV r0 = new X.3vV
            r5 = r0
            r6 = r2
            r7 = r14
            r8 = r1
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            r4.Boy(r0)
        L_0x0a38:
            r0 = 0
            r2.A0e = r0
            return
        L_0x0a3c:
            boolean r0 = X.AnonymousClass1DW.A09(r4, r7)
            r7 = 1
            if (r0 == 0) goto L_0x0a02
            r7 = 19
            goto L_0x0a02
        L_0x0a46:
            X.11F r17 = X.C36351kA.A0j(r9)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0a69
            if (r17 == 0) goto L_0x0a69
            X.190 r15 = X.C36441kJ.A0j()
            X.14u r8 = r2.A05
            r20 = 1
            r19 = 0
            r21 = 1
            r22 = 1
            r18 = r4
            r16 = r8
            android.content.Intent r7 = r15.A1a(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0a10
        L_0x0a69:
            X.190 r0 = X.C36441kJ.A0j()
            X.14u r8 = r2.A05
            android.content.Intent r7 = r0.A1W(r8, r9)
            goto L_0x0a10
        L_0x0a74:
            X.0yC r0 = r2.A0J
            boolean r4 = X.AnonymousClass1DW.A09(r0, r7)
            if (r14 == 0) goto L_0x0a7e
            com.whatsapp.jid.UserJid r8 = r14.A02
        L_0x0a7e:
            X.3Nj r5 = new X.3Nj
            r5.<init>(r8, r1, r3)
            if (r14 == 0) goto L_0x0ade
            int r3 = r14.A00
            if (r3 != 0) goto L_0x0ae0
            if (r12 == 0) goto L_0x0ade
            boolean r0 = r12.A00()
            if (r0 == 0) goto L_0x0ade
            int r0 = r14.A01
            if (r0 == 0) goto L_0x0a98
            r1 = 2
            if (r0 != r1) goto L_0x0ae8
        L_0x0a98:
            com.whatsapp.qrcode.contactqr.ScannedCodeDialogFragment r3 = new com.whatsapp.qrcode.contactqr.ScannedCodeDialogFragment
            r3.<init>()
            android.os.Bundle r4 = X.AnonymousClass001.A07()
            r1 = 0
            if (r0 == 0) goto L_0x0aa8
            r1 = 1
            if (r0 == r1) goto L_0x0aa8
            r1 = 2
        L_0x0aa8:
            java.lang.String r0 = "ARG_TYPE"
            r4.putInt(r0, r1)
            com.whatsapp.jid.UserJid r0 = r14.A02
            java.lang.String r1 = X.C36381kD.A0w(r0)
            java.lang.String r0 = "ARG_JID"
            r4.putString(r0, r1)
            java.lang.String r1 = r14.A03
            java.lang.String r0 = "ARG_MESSAGE"
            r4.putString(r0, r1)
            java.lang.String r1 = r5.A03
            java.lang.String r0 = "ARG_SOURCE"
            r4.putString(r0, r1)
            java.lang.String r1 = r5.A02
            java.lang.String r0 = "ARG_QR_CODE_ID"
            r4.putString(r0, r1)
            r3.A17(r4)
        L_0x0ad0:
            X.14u r1 = r2.A05
            java.lang.String r0 = "qr_code_scanning_dialog_fragment_tag"
            r1.Btl(r3, r0)
            goto L_0x0a38
        L_0x0ad9:
            r0 = 408(0x198, float:5.72E-43)
            r1 = 3
            if (r3 == r0) goto L_0x0ae8
        L_0x0ade:
            r1 = 0
            goto L_0x0ae8
        L_0x0ae0:
            r0 = 404(0x194, float:5.66E-43)
            if (r3 != r0) goto L_0x0ad9
            r1 = 1
            if (r4 == 0) goto L_0x0ae8
            r1 = 7
        L_0x0ae8:
            com.whatsapp.qrcode.contactqr.ErrorDialogFragment r3 = X.C36391kE.A0n(r1)
            goto L_0x0ad0
        L_0x0aed:
            java.lang.String r1 = "qr_code"
            goto L_0x09b5
        L_0x0af1:
            X.0yC r1 = r3.A0D
            java.lang.String r0 = r3.A0M
            boolean r0 = X.AnonymousClass1DW.A09(r1, r0)
            if (r0 == 0) goto L_0x097f
            X.3Gi r3 = r3.A0E
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r3.A00(r5, r1, r0)
            goto L_0x097f
        L_0x0b0a:
            r15 = r11
            goto L_0x097f
        L_0x0b0d:
            java.lang.Object r0 = r6.A00
            X.4X4 r0 = (X.AnonymousClass4X4) r0
            java.lang.Object r2 = r6.A01
            X.67E r2 = (X.AnonymousClass67E) r2
            java.lang.Object r0 = r0.A00
            com.whatsapp.qrcode.QrScannerViewV2 r0 = (com.whatsapp.qrcode.QrScannerViewV2) r0
            X.4UB r1 = r0.A04
            java.lang.String r0 = r2.A02
            r1.Bdv(r0)
            return
        L_0x0b21:
            java.lang.Object r3 = r6.A00
            X.1mP r3 = (X.C37461mP) r3
            java.lang.Object r8 = r6.A01
            byte[] r8 = (byte[]) r8
            android.hardware.Camera$Size r2 = r3.A02
            X.8Ek r7 = r3.A06
            if (r7 == 0) goto L_0x0b5e
            boolean r0 = r7.A02()
            if (r0 == 0) goto L_0x0b5e
            X.9PP r6 = new X.9PP
            r6.<init>()
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r8)
            int r4 = r2.width
            int r1 = r2.height
            r0 = 17
            r6.A00(r4, r1, r5, r0)
            X.9Gz r1 = r6.A00
            java.nio.ByteBuffer r0 = r1.A00
            if (r0 != 0) goto L_0x0b54
            java.lang.String r0 = "Missing image data.  Call either setBitmap or setImageData to specify the image"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0b54:
            android.util.SparseArray r1 = r7.A00(r1)     // Catch:{ NullPointerException -> 0x0b59 }
            goto L_0x0b8c
        L_0x0b59:
            java.lang.String r0 = "QrScannerView/decodeQrCodeUsingGoogleVision npe thrown in detecting qr code"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0b5e:
            int r9 = r2.width
            int r0 = r9 * 3
            int r13 = r0 / 4
            r1 = 320(0x140, float:4.48E-43)
            if (r13 >= r1) goto L_0x0b69
            r13 = r9
        L_0x0b69:
            int r10 = r2.height
            int r0 = r10 * 3
            int r14 = r0 / 4
            if (r14 >= r1) goto L_0x0b72
            r14 = r10
        L_0x0b72:
            int r0 = r9 - r13
            int r11 = r0 / 2
            int r0 = r10 - r14
            int r12 = r0 / 2
            X.8Sl r7 = new X.8Sl
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            X.9dm r1 = r3.A0M     // Catch:{ 92A -> 0x0bbf, all -> 0x0bc3 }
            java.util.Map r0 = r3.A0A     // Catch:{ 92A -> 0x0bbf, all -> 0x0bc3 }
            X.67E r0 = X.C1901897f.A00(r7, r1, r0)     // Catch:{ 92A -> 0x0bbf, all -> 0x0bc3 }
            java.lang.String r4 = r0.A02
            if (r4 == 0) goto L_0x0bbf
            goto L_0x0ba9
        L_0x0b8c:
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x0b5e
            r0 = 0
            java.lang.Object r0 = r1.valueAt(r0)
            X.8Cb r0 = (X.C170128Cb) r0
            java.lang.String r4 = r0.A0C
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0b5e
            java.lang.String r0 = "Unknown encoding"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0b5e
        L_0x0ba9:
            java.lang.String r0 = "QrScannerView/notifyQrCodeDetected"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4UB r0 = r3.A07
            if (r0 == 0) goto L_0x0cfc
            android.os.Handler r2 = r3.A0J
            r1 = 18
            X.74v r0 = new X.74v
            r0.<init>(r1, r4, r3)
            r2.post(r0)
            return
        L_0x0bbf:
            r3.BoN()
            return
        L_0x0bc3:
            r4 = move-exception
            throw r4
        L_0x0bc5:
            java.lang.Object r3 = r6.A00
            X.1mP r3 = (X.C37461mP) r3
            java.lang.Object r1 = r6.A01
            android.view.SurfaceHolder r1 = (android.view.SurfaceHolder) r1
            r2 = 0
            boolean r0 = r1.isCreating()     // Catch:{ RuntimeException -> 0x0be6, IOException -> 0x0bf1 }
            if (r0 != 0) goto L_0x0bd9
            android.hardware.Camera r0 = r3.A03     // Catch:{ RuntimeException -> 0x0be6, IOException -> 0x0bf1 }
            r0.stopPreview()     // Catch:{ RuntimeException -> 0x0be6, IOException -> 0x0bf1 }
        L_0x0bd9:
            android.hardware.Camera r0 = r3.A03     // Catch:{ RuntimeException -> 0x0be6, IOException -> 0x0bf1 }
            r0.setPreviewDisplay(r1)     // Catch:{ RuntimeException -> 0x0be6, IOException -> 0x0bf1 }
            android.os.Handler r1 = r3.A04     // Catch:{ RuntimeException -> 0x0be6, IOException -> 0x0bf1 }
            r0 = 40
            X.C81133wW.A00(r1, r3, r0)     // Catch:{ RuntimeException -> 0x0be6, IOException -> 0x0bf1 }
            return
        L_0x0be6:
            r1 = move-exception
            android.hardware.Camera r0 = r3.A03
            r0.release()
            r3.A03 = r2
            java.lang.String r0 = "qrview/surfacechanged "
            goto L_0x0bfb
        L_0x0bf1:
            r1 = move-exception
            android.hardware.Camera r0 = r3.A03
            r0.release()
            r3.A03 = r2
            java.lang.String r0 = "qrview/surfacechanged: error setting preview display"
        L_0x0bfb:
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 1
            X.C37461mP.A00(r3, r0)
            return
        L_0x0c03:
            java.lang.Object r0 = r6.A00
            X.4Yu r0 = (X.C90024Yu) r0
            java.lang.Object r1 = r6.A01
            java.lang.Object r2 = r0.A00
            com.whatsapp.qrcode.DevicePairQrScannerActivity r2 = (com.whatsapp.qrcode.DevicePairQrScannerActivity) r2
            boolean r0 = r2.BLh()
            if (r0 != 0) goto L_0x0cfc
            X.3Ne r0 = r2.A0E
            X.3Sv r0 = X.C64233Ne.A00(r0)
            X.3Iw r0 = r0.A00
            if (r0 == 0) goto L_0x0cfc
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0cfc
            java.lang.Runnable r1 = r2.A0G
            if (r1 == 0) goto L_0x0cfc
            android.view.View r0 = r2.A00
            r0.removeCallbacks(r1)
            return
        L_0x0c2d:
            java.lang.Object r0 = r6.A00
            X.4Yu r0 = (X.C90024Yu) r0
            java.lang.Object r1 = r6.A01
            java.lang.Object r2 = r0.A00
            com.whatsapp.qrcode.DevicePairQrScannerActivity r2 = (com.whatsapp.qrcode.DevicePairQrScannerActivity) r2
            boolean r0 = r2.BLh()
            if (r0 != 0) goto L_0x0cfc
            X.3Ne r0 = r2.A0E
            X.3Sv r0 = X.C64233Ne.A00(r0)
            X.3Iw r0 = r0.A00
            if (r0 == 0) goto L_0x0cfc
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0cfc
            X.17Y r1 = r2.A05
            java.lang.Runnable r0 = r2.A0K
            r1.A0G(r0)
            com.whatsapp.qrcode.DevicePairQrScannerActivity.A01(r2)
            X.0yb r0 = r2.A08
            X.C36391kE.A1N(r0)
            r2.finish()
            X.4Tr r2 = r2.A09
            r1 = 4
            goto L_0x0c87
        L_0x0c63:
            java.lang.Object r0 = r6.A00
            X.4Yu r0 = (X.C90024Yu) r0
            java.lang.Object r2 = r6.A01
            java.lang.Object r1 = r0.A00
            com.whatsapp.qrcode.DevicePairQrScannerActivity r1 = (com.whatsapp.qrcode.DevicePairQrScannerActivity) r1
            boolean r0 = r1.BLh()
            if (r0 != 0) goto L_0x0cfc
            X.3Ne r0 = r1.A0E
            X.3Sv r0 = X.C64233Ne.A00(r0)
            X.3Iw r0 = r0.A00
            if (r0 == 0) goto L_0x0cfc
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0cfc
            X.4Tr r2 = r1.A09
            r1 = 8
        L_0x0c87:
            r0 = 0
            r2.BOx(r1, r0)
            return
        L_0x0c8c:
            java.lang.Object r0 = r6.A00
            X.4Yu r0 = (X.C90024Yu) r0
            java.lang.Object r2 = r6.A01
            java.lang.Object r1 = r0.A00
            com.whatsapp.qrcode.DevicePairQrScannerActivity r1 = (com.whatsapp.qrcode.DevicePairQrScannerActivity) r1
            boolean r0 = r1.BLh()
            if (r0 != 0) goto L_0x0cfc
            X.3Ne r0 = r1.A0E
            X.3Sv r0 = X.C64233Ne.A00(r0)
            X.3Iw r0 = r0.A00
            if (r0 == 0) goto L_0x0cfc
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0cfc
            r0 = 2131889300(0x7f120c94, float:1.941326E38)
            r1.BO5(r0)
            com.whatsapp.qrcode.DevicePairQrScannerActivity.A01(r1)
            r0 = 0
            r1.A06 = r0
            return
        L_0x0cb9:
            java.lang.Object r0 = r6.A00
            X.9YA r0 = (X.AnonymousClass9YA) r0
            java.lang.Object r1 = r6.A01
            android.view.View r1 = (android.view.View) r1
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x0cfc
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0ccd:
            java.lang.Object r0 = r6.A00
            com.whatsapp.settings.SettingsSetupUserProxyActivity r0 = (com.whatsapp.settings.SettingsSetupUserProxyActivity) r0
            java.lang.Object r1 = r6.A01
            X.011 r1 = (X.AnonymousClass011) r1
            X.00T r0 = r0.A05
            java.lang.Object r3 = r0.getValue()
            com.whatsapp.settings.SettingsSetupUserProxyViewModel r3 = (com.whatsapp.settings.SettingsSetupUserProxyViewModel) r3
            java.lang.Object r2 = r1.second
            X.3QR r2 = (X.AnonymousClass3QR) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            X.1VS r1 = r3.A03
            java.lang.String r6 = r2.A05
            boolean r0 = X.AnonymousClass3RW.A00(r6)
            if (r0 != 0) goto L_0x0cfd
            java.lang.String r0 = r2.A02
            boolean r0 = X.AnonymousClass3RW.A01(r0)
            if (r0 != 0) goto L_0x0cfd
            java.lang.String r0 = "SettingsSetupUserProxyViewModel/saveUserProxySettings/Unable to save proxy setting"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0cfc:
            return
        L_0x0cfd:
            java.lang.String r5 = r2.A02
            int r7 = r2.A00
            int r8 = r2.A01
            boolean r9 = r2.A06
            X.3QR r4 = new X.3QR
            r4.<init>(r5, r6, r7, r8, r9)
            r3.A01 = r4
            r1.A01(r2)
            X.00s r1 = r3.A02
            java.lang.Integer r0 = X.C36361kB.A0j()
            X.011 r0 = X.C36441kJ.A19(r0, r2)
            r1.A0C(r0)
            return
        L_0x0d1d:
            java.lang.Object r5 = r6.A00
            X.3UB r5 = (X.AnonymousClass3UB) r5
            java.lang.Object r4 = r6.A01
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            X.0wN r3 = r5.A0O
            java.lang.String r2 = "ptvcameraui/stopVideoCaptureAsyncTimeout"
            r1 = 0
            r0 = 0
            r3.A0E(r2, r1, r0)
            com.whatsapp.camera.litecamera.LiteCameraView r0 = r5.A04
            r0.Bv8()
            com.whatsapp.camera.litecamera.LiteCameraView r0 = r5.A04
            r0.pause()
            r4.run()
            return
        L_0x0d3c:
            java.lang.Object r2 = r6.A00
            X.0xM r2 = (X.C20310xM) r2
            java.lang.Object r0 = r6.A01
            r1 = 1
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r2.A0u(r0, r1)
            return
        L_0x0d4b:
            java.lang.Object r2 = r6.A00
            X.4TU r2 = (X.AnonymousClass4TU) r2
            java.lang.Object r1 = r6.A01
            java.lang.Exception r1 = (java.lang.Exception) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            r2.onFailure(r1)
            return
        L_0x0d5b:
            java.lang.Object r4 = r6.A00
            X.39Q r4 = (X.AnonymousClass39Q) r4
            java.lang.Object r3 = r6.A01
            X.4TU r3 = (X.AnonymousClass4TU) r3
            r0 = 1
            X.AnonymousClass00C.A0D(r3, r0)
            X.004 r0 = r4.A04
            java.lang.Object r2 = r0.get()
            X.1XW r2 = (X.AnonymousClass1XW) r2
            r0 = 0
            X.2rb r1 = new X.2rb
            r1.<init>(r4, r3, r0)
            X.6OQ r0 = r2.A00()
            if (r0 == 0) goto L_0x0d85
            java.lang.String r0 = "Avatar user does exist"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            r1.onFailure(r0)
            return
        L_0x0d85:
            X.005 r0 = r2.A02
            java.lang.Object r2 = r0.get()
            X.1UA r2 = (X.AnonymousClass1UA) r2
            X.6P0 r4 = X.C113335fN.A00
            r0 = 1
            X.4Yy r3 = new X.4Yy
            r3.<init>(r1, r0)
            r5 = 0
            r0 = -1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r8 = r5
            r9 = r5
            r7 = r5
            r2.A03(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80313vC.run():void");
    }
}
