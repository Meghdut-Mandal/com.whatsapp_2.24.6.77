package X;

/* renamed from: X.72k  reason: invalid class name and case insensitive filesystem */
public class C1496972k implements Runnable {
    public Object A00;
    public final int A01;

    public C1496972k(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0300, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0303, code lost:
        if (r3.A0E != false) goto L_0x03e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0305, code lost:
        r3.A0E = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0308, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        r10 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x030b, code lost:
        if (r10 != null) goto L_0x0314;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x030d, code lost:
        r10 = new org.whispersystems.curve25519.NativeVOPRFExtension();
        r3.A00 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0314, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        r6 = r3.A04;
        r0 = new byte[X.C36371kC.A01(X.AnonymousClass6W6.A00(r6), "token_length")];
        r4 = r10.A00;
        r4.A00(r0);
        r3.A0H = r0;
        r7 = null;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0330, code lost:
        if (r12 >= 256) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0332, code lost:
        r7 = new byte[X.AnonymousClass6W6.A00(r6).getInt("token_length", 0)];
        r4.A00(r7);
        r7[31] = (byte) (r7[31] & 31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x034c, code lost:
        if (r10.A00(r7) != false) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x034e, code lost:
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0352, code lost:
        if (r12 < 256) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0355, code lost:
        r0 = r10.A02(r3.A0H, r7, X.AnonymousClass6W6.A00(r6).getInt("token_length", 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0363, code lost:
        if (r0 != null) goto L_0x037b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0365, code lost:
        com.whatsapp.util.Log.e("ACSToken/generateCredentialToken failed to blind the token");
        r6.A04(7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x036f, code lost:
        com.whatsapp.util.Log.w("ACSToken/generateCredentialToken cannot generate valid blindingFactor");
        r6.A04(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0377, code lost:
        X.C132576Ui.A02(r3, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x037b, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        r3.A0F = r9;
        r3.A0G = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0382, code lost:
        if (r9 == false) goto L_0x0385;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0385, code lost:
        X.AnonymousClass6W6.A03(r6, "original_token_string", android.util.Base64.encodeToString(r3.A0H, 10));
        X.AnonymousClass6W6.A03(r6, "blinding_factor_string", android.util.Base64.encodeToString(r7, 10));
        X.AnonymousClass6W6.A03(r6, "shared_secret_string", (java.lang.String) null);
        X.AnonymousClass6W6.A01(r6, "redeem_count", -1);
        X.AnonymousClass6W6.A02(r6, "base_timestamp", 0);
        X.AnonymousClass6W6.A02(r6, "time_to_live_in_seconds", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03b1, code lost:
        X.AnonymousClass6W6.A03(r6, "next_original_token_string", android.util.Base64.encodeToString(r3.A0H, 10));
        X.AnonymousClass6W6.A03(r6, "blinding_factor_string", android.util.Base64.encodeToString(r7, 10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03c5, code lost:
        r3.A0B = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03cc, code lost:
        if (r3.A02.A04 != 2) goto L_0x03dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03ce, code lost:
        r3.A0D = r3.A05.A00(r3.A0G, r3.A09);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03da, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03dc, code lost:
        X.C132576Ui.A01(r3, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03e0, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03e3, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03e6, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03e7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x052e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x052f, code lost:
        X.C05600Qi.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0532, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x06a5, code lost:
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x06a9, code lost:
        r1.A0C(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x06ac, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0197, code lost:
        r2.A0H(new X.C1496972k(r3, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x019f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01aa, code lost:
        X.AnonymousClass3SJ.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01ad, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            int r0 = r14.A01
            switch(r0) {
                case 0: goto L_0x012a;
                case 1: goto L_0x0137;
                case 2: goto L_0x0013;
                case 3: goto L_0x0147;
                case 4: goto L_0x0157;
                case 5: goto L_0x0174;
                case 6: goto L_0x017c;
                case 7: goto L_0x018b;
                case 8: goto L_0x01a0;
                case 9: goto L_0x01ae;
                case 10: goto L_0x0046;
                case 11: goto L_0x01b8;
                case 12: goto L_0x01c2;
                case 13: goto L_0x005e;
                case 14: goto L_0x01cf;
                case 15: goto L_0x01e1;
                case 16: goto L_0x01fb;
                case 17: goto L_0x0220;
                case 18: goto L_0x0220;
                case 19: goto L_0x0228;
                case 20: goto L_0x0253;
                case 21: goto L_0x0268;
                case 22: goto L_0x02d2;
                case 23: goto L_0x02d2;
                case 24: goto L_0x02fb;
                case 25: goto L_0x02d8;
                case 26: goto L_0x02fb;
                case 27: goto L_0x006c;
                case 28: goto L_0x03eb;
                case 29: goto L_0x03f4;
                case 30: goto L_0x03fc;
                case 31: goto L_0x0417;
                case 32: goto L_0x0421;
                case 33: goto L_0x0429;
                case 34: goto L_0x0433;
                case 35: goto L_0x043c;
                case 36: goto L_0x0452;
                case 37: goto L_0x0462;
                case 38: goto L_0x0005;
                case 39: goto L_0x0005;
                case 40: goto L_0x0085;
                case 41: goto L_0x0497;
                case 42: goto L_0x00d8;
                case 43: goto L_0x0533;
                case 44: goto L_0x053d;
                case 45: goto L_0x0545;
                case 46: goto L_0x0583;
                case 47: goto L_0x05be;
                case 48: goto L_0x06ad;
                case 49: goto L_0x06ce;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r14.A00
            X.1Bs r1 = (X.C24251Bs) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            java.lang.String r0 = "event"
            r1.A01(r0)
        L_0x0012:
            return
        L_0x0013:
            java.lang.Object r4 = r14.A00
            X.1qM r4 = (X.C38871qM) r4
            X.4Oz r3 = r4.A04
            r1 = r3
            com.whatsapp.KeyboardPopupLayout r1 = (com.whatsapp.KeyboardPopupLayout) r1
            r0 = 0
            r1.A04 = r0
            android.app.Activity r2 = r4.A03
            int r0 = X.C36341k9.A04(r2)
            r1 = 1
            if (r0 != r1) goto L_0x0040
            boolean r0 = r4.A0C()
            if (r0 != 0) goto L_0x0040
            android.content.res.Configuration r0 = X.AnonymousClass000.A0U(r2)
            int r0 = r0.keyboard
            if (r0 != r1) goto L_0x0040
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "samsung"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0012
        L_0x0040:
            android.view.View r3 = (android.view.View) r3
            r3.requestLayout()
            return
        L_0x0046:
            java.lang.Object r2 = r14.A00
            com.whatsapp.WaEditText r2 = (com.whatsapp.WaEditText) r2
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0012
            X.0yb r0 = r2.A02
            android.view.inputmethod.InputMethodManager r1 = r0.A0N()
            X.C18740tg.A06(r1)
            r0 = 0
            r1.showSoftInput(r2, r0)
            r2.A04 = r0
            return
        L_0x005e:
            java.lang.Object r1 = r14.A00
            com.whatsapp.account.delete.DeleteAccountFeedback r1 = (com.whatsapp.account.delete.DeleteAccountFeedback) r1
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x0012
            X.0Ws r0 = r1.A05
            r0.A00()
            return
        L_0x006c:
            java.lang.Object r2 = r14.A00
            X.9Uf r2 = (X.C195419Uf) r2
            X.6VE r1 = r2.A06
            com.whatsapp.jid.UserJid r0 = r2.A08
            X.777 r0 = r1.A04(r0)
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x0012 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x0012 }
            X.00s r0 = r2.A04     // Catch:{ Exception -> 0x0012 }
            r0.A0C(r1)     // Catch:{ Exception -> 0x0012 }
            goto L_0x06ee
        L_0x0085:
            java.lang.Object r4 = r14.A00
            X.6xS r4 = (X.C147586xS) r4
            X.1Bt r0 = r4.A04
            X.00T r3 = r0.A01
            android.content.SharedPreferences$Editor r1 = X.C36351kA.A0A(r3)
            java.lang.String r0 = "pref_avatar_preview_cache_url"
            r2 = 0
            X.C36341k9.A0x(r1, r0, r2)
            android.content.SharedPreferences$Editor r1 = X.C36351kA.A0A(r3)
            java.lang.String r0 = "pref_avatar_profile_photo_poses"
            X.C36341k9.A0x(r1, r0, r2)
            X.6Mz r0 = r4.A05
            X.61E r0 = r0.A00
            r6 = 1
            X.AnonymousClass61E.A00(r0, r6)
            X.1Bp r0 = r4.A06
            r0.A03()
            X.1BF r0 = r4.A03
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0012
            X.0zA r0 = r4.A00
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x06ef
            X.65M r2 = r4.A02
            java.lang.String r3 = "avatar_art_update"
            X.7XR r4 = X.AnonymousClass7XR.A00
            r5 = 7
            X.AnonymousClass00C.A0D(r3, r6)
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.A0F
            r0 = 0
            r1.set(r0)
            X.0wU r0 = r2.A0E
            X.73p r1 = new X.73p
            r7 = 1
            r8 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.Boy(r1)
            return
        L_0x00d8:
            java.lang.Object r0 = r14.A00
            X.38x r0 = (X.C606738x) r0
            X.1BB r0 = r0.A03
            java.util.Iterator r3 = X.C36361kB.A0s(r0)
        L_0x00e2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r1 = r3.next()
            X.6Fn r1 = (X.C129156Fn) r1
            boolean r0 = r1 instanceof X.C162907pL
            if (r0 == 0) goto L_0x0111
            X.7pL r1 = (X.C162907pL) r1
            int r0 = r1.A02
            switch(r0) {
                case 4: goto L_0x0104;
                case 5: goto L_0x00fa;
                default: goto L_0x00f9;
            }
        L_0x00f9:
            goto L_0x00e2
        L_0x00fa:
            java.lang.Object r2 = r1.A01
            X.6Lo r2 = (X.C130566Lo) r2
            java.lang.Object r1 = r1.A00
            X.0sQ r1 = (X.C18000sQ) r1
            r0 = 1
            goto L_0x010d
        L_0x0104:
            java.lang.Object r2 = r1.A01
            X.6Lo r2 = (X.C130566Lo) r2
            java.lang.Object r1 = r1.A00
            X.0sQ r1 = (X.C18000sQ) r1
            r0 = 2
        L_0x010d:
            X.C130566Lo.A00(r2, r1, r0)
            goto L_0x00e2
        L_0x0111:
            boolean r0 = r1 instanceof X.C162897pK
            if (r0 == 0) goto L_0x00e2
            X.7pK r1 = (X.C162897pK) r1
            int r0 = r1.A01
            switch(r0) {
                case 1: goto L_0x011d;
                case 2: goto L_0x011d;
                case 3: goto L_0x011d;
                default: goto L_0x011c;
            }
        L_0x011c:
            goto L_0x00e2
        L_0x011d:
            java.lang.Object r0 = r1.A00
            X.6Xz r0 = (X.C133356Xz) r0
            X.7lO r1 = r0.A03
            if (r1 == 0) goto L_0x00e2
            r0 = 0
            r1.BXU(r0, r0)
            goto L_0x00e2
        L_0x012a:
            java.lang.Object r0 = r14.A00
            com.whatsapp.IntentChooserBottomSheetDialogFragment r0 = (com.whatsapp.IntentChooserBottomSheetDialogFragment) r0
            X.1N6 r2 = r0.A04
            r1 = 72
            r0 = 0
            r2.A03(r0, r1)
            return
        L_0x0137:
            java.lang.Object r2 = r14.A00
            X.4Oz r2 = (X.C87484Oz) r2
            r1 = r2
            com.whatsapp.KeyboardPopupLayout r1 = (com.whatsapp.KeyboardPopupLayout) r1
            r0 = 0
            r1.A04 = r0
            android.view.View r2 = (android.view.View) r2
            r2.requestLayout()
            return
        L_0x0147:
            java.lang.Object r0 = r14.A00
            X.1qM r0 = (X.C38871qM) r0
            X.4Oz r3 = r0.A04
            android.view.View r3 = (android.view.View) r3
            java.lang.Runnable r2 = r0.A07
            r0 = 100
            r3.postDelayed(r2, r0)
            return
        L_0x0157:
            java.lang.Object r5 = r14.A00
            X.5JX r5 = (X.AnonymousClass5JX) r5
            X.1lp r0 = r5.A04
            r4 = 1
            r0.removeMessages(r4)
            X.0wU r3 = r5.A05
            boolean r2 = r5.A0C
            boolean r0 = r5.A0B
            X.5JV r1 = new X.5JV
            r1.<init>(r5, r2, r4, r0)
            java.lang.Object[] r0 = X.C90524aI.A0w()
            r3.Box(r1, r0)
            return
        L_0x0174:
            java.lang.Object r3 = r14.A00
            X.5JX r3 = (X.AnonymousClass5JX) r3
            X.17Y r2 = r3.A02
            r1 = 4
            goto L_0x0197
        L_0x017c:
            java.lang.Object r2 = r14.A00
            X.5JX r2 = (X.AnonymousClass5JX) r2
            X.1lp r1 = r2.A04
            r0 = 1
            r1.removeMessages(r0)
            android.app.Activity r1 = r2.A01
            r0 = 201(0xc9, float:2.82E-43)
            goto L_0x01aa
        L_0x018b:
            java.lang.Object r3 = r14.A00
            X.5JX r3 = (X.AnonymousClass5JX) r3
            java.lang.String r0 = "restore>VerifyMessageStoreHelper/preparedb/cannot-start-db-restore-missing-key"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.17Y r2 = r3.A02
            r1 = 6
        L_0x0197:
            X.72k r0 = new X.72k
            r0.<init>(r3, r1)
            r2.A0H(r0)
            return
        L_0x01a0:
            java.lang.Object r0 = r14.A00
            X.5JV r0 = (X.AnonymousClass5JV) r0
            X.5JX r0 = r0.A01
            android.app.Activity r1 = r0.A01
            r0 = 108(0x6c, float:1.51E-43)
        L_0x01aa:
            X.AnonymousClass3SJ.A01(r1, r0)
            return
        L_0x01ae:
            java.lang.Object r0 = r14.A00
            X.3Gk r0 = (X.C62503Gk) r0
            android.widget.ListView r0 = r0.A01
            r0.focusableViewAvailable(r0)
            return
        L_0x01b8:
            java.lang.Object r0 = r14.A00
            X.6pE r0 = (X.C142656pE) r0
            X.164 r0 = r0.A00
            X.AnonymousClass164.A00(r0)
            return
        L_0x01c2:
            java.lang.Object r1 = r14.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "acceptlink/wait/timeout"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.finish()
            return
        L_0x01cf:
            java.lang.Object r2 = r14.A00
            android.app.Activity r2 = (android.app.Activity) r2
            r1 = 0
            java.lang.String r0 = "RemoveAccountActivity/startRemoveAccount/failure"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.AnonymousClass3SJ.A00(r2, r1)
            r0 = 2
            X.AnonymousClass3SJ.A01(r2, r0)
            return
        L_0x01e1:
            java.lang.Object r3 = r14.A00
            com.whatsapp.account.remove.RemoveAccountActivity r3 = (com.whatsapp.account.remove.RemoveAccountActivity) r3
            X.0wI r2 = r3.A04
            if (r2 == 0) goto L_0x01f4
            r1 = 16
            X.72k r0 = new X.72k
            r0.<init>(r3, r1)
            r2.A00(r0)
            return
        L_0x01f4:
            java.lang.String r0 = "mainThreadHandler"
            java.lang.RuntimeException r1 = X.C36331k8.A0d(r0)
            throw r1
        L_0x01fb:
            java.lang.Object r2 = r14.A00
            X.155 r2 = (X.AnonymousClass155) r2
            r0 = 0
            X.AnonymousClass3SJ.A00(r2, r0)
            X.1Dv r1 = r2.A01
            r3 = 0
            X.0v0 r0 = r2.A09
            int r5 = r0.A0I()
            long r7 = android.os.SystemClock.elapsedRealtime()
            X.0wh r0 = r2.A0A
            java.lang.String r4 = r0.A01()
            r6 = 14
            android.content.Intent r0 = X.AnonymousClass190.A1G(r2, r3, r4, r5, r6, r7)
            r1.A06(r2, r0)
            return
        L_0x0220:
            java.lang.Object r0 = r14.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
        L_0x0228:
            java.lang.Object r0 = r14.A00
            X.6Er r0 = (X.C129036Er) r0
            X.1RU r0 = r0.A01
            X.005 r0 = r0.A0D
            java.lang.Object r5 = r0.get()
            X.1Z0 r5 = (X.AnonymousClass1Z0) r5
            r4 = 1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "AccountSwitchingDataRepo/setShownMeTabMenuItemToolTip/"
            X.C36321k7.A1X(r0, r1, r4)
            X.6C2 r0 = X.AnonymousClass1Z0.A00(r5)
            java.util.List r3 = r0.A01
            java.lang.String r2 = r0.A00
            boolean r1 = r0.A02
            X.6C2 r0 = new X.6C2
            r0.<init>(r2, r3, r4, r1)
            X.AnonymousClass1Z0.A01(r0, r5)
            return
        L_0x0253:
            java.lang.Object r0 = r14.A00
            X.6PU r0 = (X.AnonymousClass6PU) r0
            r2 = 0
            X.17Y r1 = r0.A00
            if (r1 == 0) goto L_0x0263
            r0 = 2131890828(0x7f12128c, float:1.9416359E38)
            r1.A05(r2, r0)
            return
        L_0x0263:
            java.lang.RuntimeException r0 = X.C36321k7.A06()
            throw r0
        L_0x0268:
            java.lang.Object r1 = r14.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r7 = "AccountTransferReceiver/exception during export"
            r6 = 1
            byte[] r2 = X.C133306Xt.A05(r1, r6)
            if (r2 == 0) goto L_0x02b9
            int r0 = r2.length
            if (r0 == 0) goto L_0x02b9
            java.lang.String r0 = "AccountTransferReceiver/onReceive/exporting"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0JI r5 = new X.0JI
            r5.<init>((android.content.Context) r1)
            java.lang.String r4 = "com.whatsapp"
            X.AnonymousClass006.A01(r4)
            X.AnonymousClass006.A01(r2)
            X.0K6 r1 = new X.0K6
            r1.<init>(r4, r2)
            X.0Io r0 = new X.0Io
            r0.<init>(r1)
            com.google.android.gms.tasks.zzw r3 = X.C07590Yl.A01(r5, r0, r6)
            X.AnonymousClass00C.A08(r3)
            r1 = 10
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x02a3 }
            com.google.android.gms.tasks.Tasks.await(r3, r1, r0)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x02a3 }
            goto L_0x02bc
        L_0x02a3:
            r2 = move-exception
            r0 = 2
            X.AnonymousClass006.A01(r4)
            X.0K5 r1 = new X.0K5
            r1.<init>(r4, r0)
            X.0Ir r0 = new X.0Ir
            r0.<init>(r1)
            X.C07590Yl.A01(r5, r0, r6)
            com.whatsapp.util.Log.e(r7, r2)
            return
        L_0x02b9:
            java.lang.String r0 = "AccountTransferReceiver/onReceive/encrypted backup token is not present"
            goto L_0x02ce
        L_0x02bc:
            X.AnonymousClass006.A01(r4)
            X.0K5 r1 = new X.0K5
            r1.<init>(r4, r6)
            X.0Ir r0 = new X.0Ir
            r0.<init>(r1)
            X.C07590Yl.A01(r5, r0, r6)
            java.lang.String r0 = "AccountTransferReceiver/onReceive/exported successfully"
        L_0x02ce:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x02d2:
            java.lang.Object r3 = r14.A00
            X.6Ui r3 = (X.C132576Ui) r3
            r9 = 0
            goto L_0x0300
        L_0x02d8:
            java.lang.Object r3 = r14.A00
            X.6Ui r3 = (X.C132576Ui) r3
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3.A0C = r0
            X.19J r0 = r3.A02
            int r1 = r0.A04
            r0 = 2
            if (r1 != r0) goto L_0x02f6
            X.6xl r2 = r3.A05
            byte[] r1 = r3.A0G
            java.lang.String r0 = r3.A09
            java.lang.String r0 = r2.A00(r1, r0)
            r3.A0D = r0
            return
        L_0x02f6:
            r0 = 5
            X.C132576Ui.A01(r3, r0)
            return
        L_0x02fb:
            java.lang.Object r3 = r14.A00
            X.6Ui r3 = (X.C132576Ui) r3
            r9 = 1
        L_0x0300:
            monitor-enter(r3)
            boolean r0 = r3.A0E     // Catch:{ all -> 0x03e8 }
            if (r0 != 0) goto L_0x03e6
            r2 = 1
            r3.A0E = r2     // Catch:{ all -> 0x03e8 }
            monitor-enter(r3)     // Catch:{ all -> 0x03e8 }
            org.whispersystems.curve25519.NativeVOPRFExtension r10 = r3.A00     // Catch:{ all -> 0x03e3 }
            if (r10 != 0) goto L_0x0314
            org.whispersystems.curve25519.NativeVOPRFExtension r10 = new org.whispersystems.curve25519.NativeVOPRFExtension     // Catch:{ all -> 0x03e3 }
            r10.<init>()     // Catch:{ all -> 0x03e3 }
            r3.A00 = r10     // Catch:{ all -> 0x03e3 }
        L_0x0314:
            monitor-exit(r3)     // Catch:{ all -> 0x03e3 }
            X.6W6 r6 = r3.A04     // Catch:{ all -> 0x03e8 }
            android.content.SharedPreferences r0 = X.AnonymousClass6W6.A00(r6)     // Catch:{ all -> 0x03e8 }
            java.lang.String r11 = "token_length"
            int r0 = X.C36371kC.A01(r0, r11)     // Catch:{ all -> 0x03e8 }
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x03e8 }
            X.603 r4 = r10.A00     // Catch:{ all -> 0x03e8 }
            r4.A00(r0)     // Catch:{ all -> 0x03e8 }
            r3.A0H = r0     // Catch:{ all -> 0x03e8 }
            r8 = 0
            r5 = 0
            r7 = r8
            r12 = 0
        L_0x032e:
            r1 = 256(0x100, float:3.59E-43)
            if (r12 >= r1) goto L_0x0351
            android.content.SharedPreferences r0 = X.AnonymousClass6W6.A00(r6)     // Catch:{ all -> 0x03e8 }
            int r0 = r0.getInt(r11, r5)     // Catch:{ all -> 0x03e8 }
            byte[] r7 = new byte[r0]     // Catch:{ all -> 0x03e8 }
            r4.A00(r7)     // Catch:{ all -> 0x03e8 }
            r13 = 31
            byte r0 = r7[r13]     // Catch:{ all -> 0x03e8 }
            r0 = r0 & 31
            byte r0 = (byte) r0     // Catch:{ all -> 0x03e8 }
            r7[r13] = r0     // Catch:{ all -> 0x03e8 }
            boolean r0 = r10.A00(r7)     // Catch:{ all -> 0x03e8 }
            if (r0 != 0) goto L_0x0351
            int r12 = r12 + 1
            goto L_0x032e
        L_0x0351:
            r4 = 5
            if (r12 < r1) goto L_0x0355
            goto L_0x036f
        L_0x0355:
            byte[] r1 = r3.A0H     // Catch:{ all -> 0x03e8 }
            android.content.SharedPreferences r0 = X.AnonymousClass6W6.A00(r6)     // Catch:{ all -> 0x03e8 }
            int r0 = r0.getInt(r11, r5)     // Catch:{ all -> 0x03e8 }
            byte[] r0 = r10.A02(r1, r7, r0)     // Catch:{ all -> 0x03e8 }
            if (r0 != 0) goto L_0x037b
            java.lang.String r0 = "ACSToken/generateCredentialToken failed to blind the token"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x03e8 }
            r0 = 7
            r6.A04(r0)     // Catch:{ all -> 0x03e8 }
            goto L_0x0377
        L_0x036f:
            java.lang.String r0 = "ACSToken/generateCredentialToken cannot generate valid blindingFactor"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x03e8 }
            r6.A04(r4)     // Catch:{ all -> 0x03e8 }
        L_0x0377:
            X.C132576Ui.A02(r3, r2)     // Catch:{ all -> 0x03e8 }
            goto L_0x03e6
        L_0x037b:
            monitor-enter(r3)     // Catch:{ all -> 0x03e8 }
            r3.A0F = r9     // Catch:{ all -> 0x03e0 }
            r3.A0G = r0     // Catch:{ all -> 0x03e0 }
            r2 = 10
            if (r9 == 0) goto L_0x0385
            goto L_0x03b1
        L_0x0385:
            byte[] r0 = r3.A0H     // Catch:{ all -> 0x03e0 }
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r2)     // Catch:{ all -> 0x03e0 }
            java.lang.String r0 = "original_token_string"
            X.AnonymousClass6W6.A03(r6, r0, r1)     // Catch:{ all -> 0x03e0 }
            java.lang.String r1 = android.util.Base64.encodeToString(r7, r2)     // Catch:{ all -> 0x03e0 }
            java.lang.String r0 = "blinding_factor_string"
            X.AnonymousClass6W6.A03(r6, r0, r1)     // Catch:{ all -> 0x03e0 }
            java.lang.String r0 = "shared_secret_string"
            X.AnonymousClass6W6.A03(r6, r0, r8)     // Catch:{ all -> 0x03e0 }
            r1 = -1
            java.lang.String r0 = "redeem_count"
            X.AnonymousClass6W6.A01(r6, r0, r1)     // Catch:{ all -> 0x03e0 }
            r1 = 0
            java.lang.String r0 = "base_timestamp"
            X.AnonymousClass6W6.A02(r6, r0, r1)     // Catch:{ all -> 0x03e0 }
            java.lang.String r0 = "time_to_live_in_seconds"
            X.AnonymousClass6W6.A02(r6, r0, r1)     // Catch:{ all -> 0x03e0 }
            goto L_0x03c5
        L_0x03b1:
            byte[] r0 = r3.A0H     // Catch:{ all -> 0x03e0 }
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r2)     // Catch:{ all -> 0x03e0 }
            java.lang.String r0 = "next_original_token_string"
            X.AnonymousClass6W6.A03(r6, r0, r1)     // Catch:{ all -> 0x03e0 }
            java.lang.String r1 = android.util.Base64.encodeToString(r7, r2)     // Catch:{ all -> 0x03e0 }
            java.lang.String r0 = "blinding_factor_string"
            X.AnonymousClass6W6.A03(r6, r0, r1)     // Catch:{ all -> 0x03e0 }
        L_0x03c5:
            r3.A0B = r5     // Catch:{ all -> 0x03e0 }
            X.19J r0 = r3.A02     // Catch:{ all -> 0x03e0 }
            int r1 = r0.A04     // Catch:{ all -> 0x03e0 }
            r0 = 2
            if (r1 != r0) goto L_0x03dc
            X.6xl r2 = r3.A05     // Catch:{ all -> 0x03e0 }
            byte[] r1 = r3.A0G     // Catch:{ all -> 0x03e0 }
            java.lang.String r0 = r3.A09     // Catch:{ all -> 0x03e0 }
            java.lang.String r0 = r2.A00(r1, r0)     // Catch:{ all -> 0x03e0 }
            r3.A0D = r0     // Catch:{ all -> 0x03e0 }
        L_0x03da:
            monitor-exit(r3)     // Catch:{ all -> 0x03e0 }
            goto L_0x03e6
        L_0x03dc:
            X.C132576Ui.A01(r3, r4)     // Catch:{ all -> 0x03e0 }
            goto L_0x03da
        L_0x03e0:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x03e0 }
            goto L_0x03e5
        L_0x03e3:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x03e3 }
        L_0x03e5:
            throw r0     // Catch:{ all -> 0x03e8 }
        L_0x03e6:
            monitor-exit(r3)
            return
        L_0x03e8:
            r1 = move-exception
            monitor-exit(r3)
            throw r1
        L_0x03eb:
            java.lang.Object r1 = r14.A00
            X.4x6 r1 = (X.C101164x6) r1
            r0 = 0
            X.C101164x6.A00(r0, r1)
            return
        L_0x03f4:
            java.lang.Object r0 = r14.A00
            X.4x6 r0 = (X.C101164x6) r0
            X.C101164x6.A01(r0)
            return
        L_0x03fc:
            java.lang.Object r0 = r14.A00
            X.5p1 r0 = (X.C118965p1) r0
            com.whatsapp.anr.SigquitBasedANRDetector r2 = r0.A01
            java.io.File r1 = r0.A00
            java.lang.String r0 = "SigquitBasedANRDetector/abortANRAndDiscardReport"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "SigquitBasedANRDetector/abortANR"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            r2.A0A = r0
            X.11c r0 = r2.A04
            r0.A04(r1)
            return
        L_0x0417:
            java.lang.Object r0 = r14.A00
            X.5p1 r0 = (X.C118965p1) r0
            com.whatsapp.anr.SigquitBasedANRDetector r1 = r0.A01
            r0 = 0
            r1.A0A = r0
            return
        L_0x0421:
            java.lang.Object r0 = r14.A00
            com.whatsapp.authentication.AppAuthenticationActivity r0 = (com.whatsapp.authentication.AppAuthenticationActivity) r0
            r0.A0F()
            return
        L_0x0429:
            java.lang.Object r1 = r14.A00
            com.whatsapp.authentication.FingerprintView r1 = (com.whatsapp.authentication.FingerprintView) r1
            X.0BQ r0 = r1.A04
            com.whatsapp.authentication.FingerprintView.A00(r0, r1)
            return
        L_0x0433:
            java.lang.Object r1 = r14.A00
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r1 = (com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r1
            r0 = -1
            r1.Bjj(r0)
            return
        L_0x043c:
            java.lang.Object r3 = r14.A00
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r3 = (com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r3
            X.17Y r0 = r3.A04
            r0.A02()
            X.17Y r2 = r3.A04
            r1 = 2131895110(0x7f122346, float:1.9425044E38)
            r0 = 0
            r2.A06(r1, r0)
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment.A03(r3)
            return
        L_0x0452:
            java.lang.Object r1 = r14.A00
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r1 = (com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r1
            com.whatsapp.CodeInputField r0 = r1.A03
            r0.requestFocus()
            com.whatsapp.CodeInputField r1 = r1.A03
            r0 = 0
            r1.A0C(r0)
            return
        L_0x0462:
            java.lang.Object r4 = r14.A00
            X.02E r4 = (X.AnonymousClass02E) r4
            X.1qm r1 = X.AnonymousClass3LW.A04(r4)
            r0 = 2131894291(0x7f122013, float:1.9423383E38)
            r1.A0c(r0)
            X.0FM r3 = r1.create()
            r0 = 2131894290(0x7f122012, float:1.942338E38)
            java.lang.String r2 = r4.A0n(r0)
            r0 = 16
            X.4XL r1 = new X.4XL
            r1.<init>(r4, r0)
            r0 = -1
            r3.A04(r0, r2, r1)
            r0 = 2131896389(0x7f122845, float:1.9427638E38)
            java.lang.String r2 = r4.A0n(r0)
            X.6Z2 r1 = X.AnonymousClass6Z2.A00
            r0 = -2
            r3.A04(r0, r2, r1)
            r3.show()
            return
        L_0x0497:
            java.lang.Object r7 = r14.A00
            X.6xS r7 = (X.C147586xS) r7
            X.65M r4 = r7.A02
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.A0F
            r0 = 1
            r1.set(r0)
            java.util.concurrent.atomic.AtomicReference r0 = r4.A00
            java.lang.Object r3 = r0.get()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x04b9
            X.17Y r2 = r4.A01
            r1 = 11
            X.751 r0 = new X.751
            r0.<init>(r1, r3, r4)
            r2.A0H(r0)
        L_0x04b9:
            X.1B6 r1 = r4.A0D
            r0 = 2
            java.util.ArrayList r0 = X.AnonymousClass1B6.A00(r1, r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x04c4:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x04e9
            X.68B r1 = X.C90514aH.A0g(r6)
            boolean r0 = r1.A0R
            if (r0 == 0) goto L_0x04c4
            X.1AP r5 = r4.A0A
            java.lang.String r3 = r1.A0F
            X.7he r1 = r4.A09
            X.1BB r0 = r5.A0D
            X.5MC r2 = new X.5MC
            r2.<init>(r0, r1, r5)
            java.lang.String[] r1 = X.C90474aD.A1b(r3)
            X.0wU r0 = r5.A0N
            r0.Box(r2, r1)
            goto L_0x04c4
        L_0x04e9:
            X.6Mz r0 = r4.A06
            X.61E r1 = r0.A00
            r0 = 1
            X.AnonymousClass61E.A00(r1, r0)
            X.5Ar r3 = r4.A08
            X.0wk r2 = r3.A0C
            r1 = 49
            X.3wa r0 = new X.3wa
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.execute(r0)
            X.1Ar r6 = r4.A0C
            X.C18740tg.A00()
            X.C24001Ar.A00(r6)
            X.1As r0 = r6.A05
            X.005 r0 = r0.A00
            X.1M0 r5 = X.C90494aF.A0K(r0)
            java.lang.String r4 = "is_avatar = ?"
            java.lang.String r0 = "1"
            java.lang.String[] r3 = new java.lang.String[]{r0}     // Catch:{ all -> 0x052c }
            X.14e r2 = r5.A02     // Catch:{ all -> 0x052c }
            java.lang.String r1 = "starred_stickers"
            java.lang.String r0 = "removeStarredAvatarStickers/DELETE_STARRED_AVATAR_STICKERS"
            r2.A03(r1, r4, r0, r3)     // Catch:{ all -> 0x052c }
            r5.close()
            X.C24001Ar.A00(r6)
            X.1Bp r0 = r7.A06
            r0.A03()
            return
        L_0x052c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x052e }
        L_0x052e:
            r1 = move-exception
            X.C05600Qi.A00(r5, r0)
            throw r1
        L_0x0533:
            java.lang.Object r0 = r14.A00
            X.38x r0 = (X.C606738x) r0
            X.1BB r0 = r0.A03
            r0.A00()
            return
        L_0x053d:
            java.lang.Object r0 = r14.A00
            android.os.ConditionVariable r0 = (android.os.ConditionVariable) r0
            r0.open()
            return
        L_0x0545:
            java.lang.Object r3 = r14.A00
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r3 = (com.whatsapp.backup.encryptedbackup.EncBackupViewModel) r3
            X.19A r2 = r3.A0E     // Catch:{ 1ej -> 0x0551 }
            r0 = 32000(0x7d00, double:1.581E-319)
            r2.A0B(r0)     // Catch:{ 1ej -> 0x0551 }
            goto L_0x0562
        L_0x0551:
            r1 = move-exception
            java.lang.String r0 = "encb/EncBackupViewModel/Failed to connect to chatd"
            com.whatsapp.util.Log.w(r0, r1)
            r1 = 4
            java.lang.String r0 = "encb/EncBackupViewModel/failed to retrieve and save backup key due to a server error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.00s r0 = r3.A04
            X.C36341k9.A17(r0, r1)
        L_0x0562:
            X.1Ck r2 = r3.A0B
            X.00s r0 = r3.A05
            java.lang.Object r7 = X.C90524aI.A0c(r0)
            java.lang.String r7 = (java.lang.String) r7
            r0 = 0
            X.7sI r1 = new X.7sI
            r1.<init>(r3, r0)
            X.0wU r5 = r2.A06
            X.00b r6 = r2.A07
            X.1Cl r3 = r2.A04
            X.1Cm r4 = r2.A05
            X.4xo r0 = new X.4xo
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0.A02()
            return
        L_0x0583:
            java.lang.Object r4 = r14.A00
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r4 = (com.whatsapp.backup.encryptedbackup.EncBackupViewModel) r4
            X.00s r3 = r4.A02
            X.1Ck r0 = r4.A0B
            X.1Ci r1 = r0.A01     // Catch:{ IOException -> 0x05ae }
            byte[] r0 = r1.A03()     // Catch:{ IOException -> 0x05ae }
            if (r0 != 0) goto L_0x059c
            r0 = 32
            byte[] r0 = X.C18750th.A0H(r0)     // Catch:{ IOException -> 0x05ae }
            r1.A02(r0)     // Catch:{ IOException -> 0x05ae }
        L_0x059c:
            java.lang.String r2 = X.AnonymousClass14B.A0E(r0)     // Catch:{ IOException -> 0x05ae }
            int r1 = r2.length()     // Catch:{ IOException -> 0x05ae }
            r0 = 64
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            X.C18740tg.A0B(r0)     // Catch:{ IOException -> 0x05ae }
            goto L_0x05b5
        L_0x05ae:
            r1 = move-exception
            java.lang.String r0 = "encb/EncBackupManager/getAndSaveRootKey/failed to get and save root key"
            com.whatsapp.util.Log.e(r0, r1)
            r2 = 0
        L_0x05b5:
            r3.A0C(r2)
            X.00s r1 = r4.A03
            r0 = 301(0x12d, float:4.22E-43)
            goto L_0x06a5
        L_0x05be:
            java.lang.Object r2 = r14.A00
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r2 = (com.whatsapp.backup.encryptedbackup.EncBackupViewModel) r2
            X.1Ck r0 = r2.A0B
            X.1Ci r1 = r0.A01
            X.5sm r0 = r1.A00()
            if (r0 == 0) goto L_0x0690
            X.00s r0 = r2.A05
            java.lang.Object r0 = X.C90524aI.A0c(r0)
            java.lang.String r0 = (java.lang.String) r0
            X.5kj r9 = new X.5kj
            r9.<init>(r2)
            byte[] r10 = r0.getBytes()
            X.5sm r8 = r1.A00()
            X.C18740tg.A06(r8)
            byte[] r7 = r8.A02
            int r6 = r8.A00
            r5 = 512(0x200, float:7.175E-43)
            java.lang.String r4 = "PBKDF2WithHmacSHA512"
            int r3 = r10.length
            char[] r2 = new char[r3]
            r1 = 0
        L_0x05f0:
            if (r1 >= r3) goto L_0x05fa
            byte r0 = r10[r1]
            char r0 = (char) r0
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x05f0
        L_0x05fa:
            javax.crypto.SecretKey r0 = X.C18750th.A08(r4, r7, r2, r6, r5)
            byte[] r1 = r0.getEncoded()
            byte[] r0 = r8.A01
            boolean r0 = java.security.MessageDigest.isEqual(r1, r0)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r5 = r9.A00
            r1 = 1
            r6 = 5
            if (r0 == 0) goto L_0x063e
            java.lang.String r0 = "encb/EncBackupViewModel/successfully verified password"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00s r0 = r5.A0A
            X.C36341k9.A19(r0, r1)
            X.0v0 r0 = r5.A0D
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "encrypted_backup_num_attempts_remaining"
            X.C36341k9.A0v(r1, r0, r6)
            int r0 = r5.A0S()
            r2 = 3
            r1 = 4
            if (r0 == r1) goto L_0x0631
            if (r0 == r6) goto L_0x0699
            r5.A0U()
            return
        L_0x0631:
            X.00s r0 = r5.A04
            X.C36341k9.A17(r0, r2)
            r5.A0X(r1)
            X.00s r1 = r5.A03
            r0 = 302(0x12e, float:4.23E-43)
            goto L_0x06a5
        L_0x063e:
            java.lang.String r0 = "encb/EncBackupViewModel/invalid password"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0v0 r7 = r5.A0D
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r7)
            java.lang.String r4 = "encrypted_backup_num_attempts_remaining"
            int r3 = X.C36371kC.A01(r0, r4)
            int r3 = r3 - r1
            if (r3 > 0) goto L_0x0681
            X.1Ck r0 = r5.A0B
            X.1Ci r0 = r0.A01
            X.0wG r0 = r0.A00
            android.content.Context r2 = r0.A00
            java.io.File r1 = r2.getFilesDir()
            java.lang.String r0 = "password_hash.key"
            java.io.File r0 = X.C36441kJ.A0w(r1, r0)
            X.AnonymousClass6YY.A0P(r0)
            java.io.File r1 = r2.getFilesDir()
            java.lang.String r0 = "password_hash_salt.key"
            java.io.File r0 = X.C36441kJ.A0w(r1, r0)
            X.AnonymousClass6YY.A0P(r0)
            java.io.File r1 = r2.getFilesDir()
            java.lang.String r0 = "password_data.key"
            java.io.File r0 = X.C36441kJ.A0w(r1, r0)
            X.AnonymousClass6YY.A0P(r0)
        L_0x0681:
            X.C36321k7.A0q(r7, r4, r3)
            X.00s r0 = r5.A06
            X.C36341k9.A17(r0, r3)
            X.00s r1 = r5.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            goto L_0x06a9
        L_0x0690:
            java.lang.String r0 = "encb/EncBackupViewModel/no attempts remaining"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00s r1 = r2.A04
            r0 = 7
            goto L_0x06a5
        L_0x0699:
            X.00s r0 = r5.A04
            X.C36341k9.A17(r0, r2)
            r5.A0X(r1)
            X.00s r1 = r5.A03
            r0 = 300(0x12c, float:4.2E-43)
        L_0x06a5:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x06a9:
            r1.A0C(r0)
            return
        L_0x06ad:
            java.lang.Object r2 = r14.A00
            com.whatsapp.backup.encryptedbackup.EncryptionKeyInputFragment r2 = (com.whatsapp.backup.encryptedbackup.EncryptionKeyInputFragment) r2
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r2.A04
            r0 = 5
            r1.A0X(r0)
            com.whatsapp.deviceauth.BiometricAuthPlugin r0 = r2.A06
            if (r0 == 0) goto L_0x06c7
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x06c7
            com.whatsapp.deviceauth.BiometricAuthPlugin r0 = r2.A06
            r0.A06()
            return
        L_0x06c7:
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r2.A04
            r0 = 1
            r1.A0Z(r0)
            return
        L_0x06ce:
            java.lang.Object r3 = r14.A00
            com.whatsapp.backup.encryptedbackup.RestorePasswordInputFragment r3 = (com.whatsapp.backup.encryptedbackup.RestorePasswordInputFragment) r3
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r3.A03
            r0 = 3
            r1.A0Y(r0)
            X.1N3 r1 = r3.A01
            java.lang.String r0 = "https://faq.whatsapp.com/general/chats/cant-remember-password-for-encrypted-backup"
            android.net.Uri r0 = r1.A00(r0)
            android.content.Intent r2 = X.C36391kE.A0G(r0)
            X.1Dv r1 = r3.A00
            X.01I r0 = r3.A0i()
            r1.A06(r0, r2)
            return
        L_0x06ee:
            return
        L_0x06ef:
            X.60e r2 = r4.A01
            r1 = 7
            java.lang.String r0 = "avatar_art_update"
            r2.A00(r0, r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1496972k.run():void");
    }
}
