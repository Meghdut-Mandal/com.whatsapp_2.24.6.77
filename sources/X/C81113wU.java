package X;

import java.util.Objects;

/* renamed from: X.3wU  reason: invalid class name and case insensitive filesystem */
public class C81113wU implements Runnable {
    public Object A00;
    public final int A01;

    public C81113wU(AnonymousClass3E3 r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public static void A00(AnonymousClass17Y r1, Object obj, int i) {
        r1.A0H(new C81113wU(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x028c, code lost:
        r1.onError(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x028f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x06e4, code lost:
        r3.setResult(0, r2.putExtra("error_message_id", r1));
        r3.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x06f1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x008e, code lost:
        r1.A0D(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0091, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r28 = this;
            r1 = r28
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x07af;
                case 1: goto L_0x07a7;
                case 2: goto L_0x079b;
                case 3: goto L_0x01a5;
                case 4: goto L_0x0031;
                case 5: goto L_0x076c;
                case 6: goto L_0x075e;
                case 7: goto L_0x075e;
                case 8: goto L_0x0743;
                case 9: goto L_0x072c;
                case 10: goto L_0x0719;
                case 11: goto L_0x0711;
                case 12: goto L_0x0708;
                case 13: goto L_0x0149;
                case 14: goto L_0x0702;
                case 15: goto L_0x06fa;
                case 16: goto L_0x06f2;
                case 17: goto L_0x06b5;
                case 18: goto L_0x06cd;
                case 19: goto L_0x06b5;
                case 20: goto L_0x06ad;
                case 21: goto L_0x0111;
                case 22: goto L_0x00dd;
                case 23: goto L_0x068c;
                case 24: goto L_0x0680;
                case 25: goto L_0x00c7;
                case 26: goto L_0x00a5;
                case 27: goto L_0x0674;
                case 28: goto L_0x0092;
                case 29: goto L_0x02ae;
                case 30: goto L_0x02a6;
                case 31: goto L_0x029e;
                case 32: goto L_0x0290;
                case 33: goto L_0x0286;
                case 34: goto L_0x0280;
                case 35: goto L_0x0280;
                case 36: goto L_0x0278;
                case 37: goto L_0x003b;
                case 38: goto L_0x001b;
                case 39: goto L_0x0007;
                case 40: goto L_0x0007;
                case 41: goto L_0x024f;
                case 42: goto L_0x0180;
                case 43: goto L_0x0228;
                case 44: goto L_0x0220;
                case 45: goto L_0x01f7;
                case 46: goto L_0x01d7;
                case 47: goto L_0x01c8;
                case 48: goto L_0x01c0;
                case 49: goto L_0x01b6;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r1.A00
            com.whatsapp.dmsetting.ChangeDMSettingActivity r3 = (com.whatsapp.dmsetting.ChangeDMSettingActivity) r3
            X.1fs r1 = r3.A06
            java.lang.String r0 = "about-disappearing-messages"
            r1.A01(r3, r0)
            X.3GX r2 = r3.A0A
            int r1 = r3.A01
            r0 = 4
            r2.A00(r0, r1)
        L_0x001a:
            return
        L_0x001b:
            java.lang.Object r3 = r1.A00
            X.1Ny r3 = (X.C27371Ny) r3
            X.17Y r2 = r3.A01
            r1 = 2131889558(0x7f120d96, float:1.9413783E38)
            r0 = 1
            r2.A06(r1, r0)
            X.00s r1 = r3.A00
            X.18x r0 = r3.A04
            java.lang.Integer r0 = r0.A04()
            goto L_0x008e
        L_0x0031:
            java.lang.Object r0 = r1.A00
            X.3o0 r0 = (X.C75913o0) r0
            X.1sS r0 = r0.A00
            X.00s r1 = r0.A0G
            r0 = 0
            goto L_0x008e
        L_0x003b:
            java.lang.Object r6 = r1.A00
            X.3p8 r6 = (X.C76593p8) r6
            X.2QF r5 = new X.2QF
            r5.<init>()
            int r4 = r6.A00
            java.lang.Long r0 = X.C36441kJ.A0y(r4)
            r5.A02 = r0
            X.1Ny r3 = r6.A02
            X.18x r2 = r3.A04
            int r0 = X.C36431kI.A05(r2)
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r5.A03 = r0
            X.19y r0 = r2.A03
            android.content.SharedPreferences r1 = X.C238119y.A00(r0)
            java.lang.String r0 = "disappearing_mode_timestamp"
            long r0 = X.C36341k9.A0B(r1, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A01 = r0
            int r0 = r6.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A00 = r0
            X.0yW r0 = r3.A05
            r0.Bly(r5)
            int r0 = X.C36431kI.A05(r2)
            if (r4 == r0) goto L_0x001a
            X.0wo r0 = r3.A03
            long r0 = X.C19970wo.A00(r0)
            r2.A05(r4, r0)
            X.00s r1 = r3.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
        L_0x008e:
            r1.A0D(r0)
            return
        L_0x0092:
            java.lang.Object r1 = r1.A00
            X.6tA r1 = (X.C144986tA) r1
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x001a
            X.6sV r0 = r1.A03
            X.17Y r0 = r0.A02
            r0.A02()
            r0 = 0
            r1.A00 = r0
            return
        L_0x00a5:
            java.lang.Object r5 = r1.A00
            X.5Mq r5 = (X.C107125Mq) r5
            long r3 = r5.A01
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x001a
            X.5FU r0 = r5.A07
            java.util.Iterator r1 = X.C36361kB.A0s(r0)
        L_0x00b7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r1.next()
            X.7ky r0 = (X.C160417ky) r0
            r0.BUy()
            goto L_0x00b7
        L_0x00c7:
            java.lang.Object r0 = r1.A00
            X.3mU r0 = (X.C74983mU) r0
            X.3L7 r0 = r0.A07
            X.1GZ r2 = r0.A06
            X.6CW r0 = r2.A01
            if (r0 == 0) goto L_0x001a
            r1 = 0
            X.6Po r0 = r0.A02
            r0.A02(r1)
            r0 = 0
            r2.A01 = r0
            return
        L_0x00dd:
            java.lang.Object r2 = r1.A00
            X.3HK r2 = (X.AnonymousClass3HK) r2
            boolean r0 = r2.A0E
            if (r0 == 0) goto L_0x001a
            int r1 = r2.A0H
            r0 = 2
            if (r1 != r0) goto L_0x001a
            boolean r0 = r2.A0D
            if (r0 != 0) goto L_0x001a
            X.80Q r2 = r2.A09
            X.C18740tg.A04(r2)
            boolean r0 = r2.A0E
            if (r0 != 0) goto L_0x001a
            int r1 = r2.getVisibility()
            r0 = 8
            if (r1 != r0) goto L_0x001a
            r0 = 5
            X.4Yk r1 = new X.4Yk
            r1.<init>(r2, r0)
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            r0.addOnPreDrawListener(r1)
            r0 = 0
            r2.setVisibility(r0)
            return
        L_0x0111:
            java.lang.Object r2 = r1.A00
            X.3HK r2 = (X.AnonymousClass3HK) r2
            boolean r0 = r2.A0E
            if (r0 == 0) goto L_0x001a
            int r1 = r2.A0H
            r0 = 2
            if (r1 != r0) goto L_0x001a
            X.80Q r3 = r2.A09
            X.C18740tg.A04(r3)
            boolean r0 = r3.A0E
            if (r0 != 0) goto L_0x001a
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x001a
            int r1 = r3.getHeight()
            if (r1 <= 0) goto L_0x07c1
            r0 = 1
            r3.A0E = r0
            X.4VX r2 = new X.4VX
            r2.<init>(r3, r1, r0)
            r0 = 10
            X.C89234Vt.A00(r2, r3, r0)
            r0 = 250(0xfa, double:1.235E-321)
            r2.setDuration(r0)
            r3.startAnimation(r2)
            return
        L_0x0149:
            java.lang.Object r2 = r1.A00
            com.whatsapp.conversationslist.LockedConversationsActivity r2 = (com.whatsapp.conversationslist.LockedConversationsActivity) r2
            X.18z r0 = r2.A3i()
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x015d
            X.17Y r1 = r2.A05
            r0 = 14
        L_0x0159:
            A00(r1, r2, r0)
            return
        L_0x015d:
            X.18z r0 = r2.A3i()
            X.12q r0 = r0.A06
            java.util.HashSet r0 = r0.A01
            boolean r0 = X.C36411kG.A1a(r0)
            if (r0 == 0) goto L_0x001a
            X.18S r0 = r2.A01
            if (r0 == 0) goto L_0x07c7
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x001a
            X.18z r0 = r2.A3i()
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x001a
            X.17Y r1 = r2.A05
            r0 = 12
            goto L_0x0159
        L_0x0180:
            java.lang.Object r2 = r1.A00
            com.whatsapp.email.VerifyEmailActivity r2 = (com.whatsapp.email.VerifyEmailActivity) r2
            com.whatsapp.CodeInputField r0 = r2.A02
            if (r0 != 0) goto L_0x018f
            java.lang.String r0 = "codeInputField"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x018f:
            java.lang.String r0 = r0.getCode()
            int r1 = r0.length()
            r0 = 6
            if (r1 != r0) goto L_0x001a
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A09
            if (r1 != 0) goto L_0x07ce
            java.lang.String r0 = "verifyBtn"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01a5:
            java.lang.Object r2 = r1.A00
            X.3pe r2 = (X.C76913pe) r2
            r0 = 1
            r2.A01 = r0
            X.0xX r1 = r2.A00
            if (r1 == 0) goto L_0x001a
            X.19J r0 = r2.A04
            r0.unregisterObserver(r1)
            return
        L_0x01b6:
            java.lang.Object r0 = r1.A00
            X.3J6 r0 = (X.AnonymousClass3J6) r0
            X.22t r0 = r0.A01
            r0.A0E()
            return
        L_0x01c0:
            java.lang.Object r0 = r1.A00
            android.view.View r0 = (android.view.View) r0
            r0.requestLayout()
            return
        L_0x01c8:
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            android.app.Dialog r0 = r0.A02
            android.view.Window r1 = r0.getWindow()
            r0 = 1
            r1.setSoftInputMode(r0)
            return
        L_0x01d7:
            java.lang.Object r1 = r1.A00
            com.whatsapp.email.VerifyEmailActivity r1 = (com.whatsapp.email.VerifyEmailActivity) r1
            X.9Pi r2 = r1.A05
            if (r2 == 0) goto L_0x01f0
            java.lang.String r3 = r1.A0A
            int r5 = r1.A00
            r6 = 8
            r7 = 5
            r8 = 1
            r4 = 0
            r2.A00(r3, r4, r5, r6, r7, r8)
            r0 = 3
            X.AnonymousClass3SJ.A00(r1, r0)
            return
        L_0x01f0:
            java.lang.String r0 = "emailVerificationLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01f7:
            java.lang.Object r4 = r1.A00
            com.whatsapp.email.VerifyEmailActivity r4 = (com.whatsapp.email.VerifyEmailActivity) r4
            r2 = 0
            X.1Dv r3 = r4.A01
            X.190 r0 = r4.A07
            if (r0 == 0) goto L_0x021b
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "state"
            int r2 = r1.getIntExtra(r0, r2)
            int r1 = r4.A00
            java.lang.String r0 = r4.A0A
            android.content.Intent r0 = X.AnonymousClass190.A17(r4, r0, r2, r1)
            r3.A06(r4, r0)
            r4.finish()
            return
        L_0x021b:
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        L_0x0220:
            java.lang.Object r0 = r1.A00
            com.whatsapp.email.VerifyEmailActivity r0 = (com.whatsapp.email.VerifyEmailActivity) r0
            com.whatsapp.email.VerifyEmailActivity.A07(r0)
            return
        L_0x0228:
            java.lang.Object r3 = r1.A00
            com.whatsapp.email.VerifyEmailActivity r3 = (com.whatsapp.email.VerifyEmailActivity) r3
            com.whatsapp.WaTextView r2 = r3.A04
            java.lang.String r1 = "resendCodeText"
            if (r2 != 0) goto L_0x0237
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x0237:
            r0 = 1
            r2.setClickable(r0)
            com.whatsapp.WaTextView r2 = r3.A04
            if (r2 != 0) goto L_0x0244
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x0244:
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131102869(0x7f060c95, float:1.7818188E38)
            X.C36351kA.A15(r1, r2, r0)
            return
        L_0x024f:
            java.lang.Object r5 = r1.A00
            com.whatsapp.email.EmailVerificationActivity r5 = (com.whatsapp.email.EmailVerificationActivity) r5
            X.1Dv r4 = r5.A01
            X.190 r0 = r5.A05
            if (r0 == 0) goto L_0x0273
            X.0v0 r0 = r5.A09
            java.lang.String r3 = r0.A0i()
            if (r3 == 0) goto L_0x026e
            int r2 = r5.A00
            java.lang.String r1 = r5.A08
            r0 = 2
            android.content.Intent r0 = X.C36401kF.A07(r5, r3, r0)
            X.C36361kB.A0w(r5, r0, r4, r1, r2)
            return
        L_0x026e:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()
            throw r0
        L_0x0273:
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        L_0x0278:
            java.lang.Object r0 = r1.A00
            com.whatsapp.deviceauth.DeviceCredentialsAuthPlugin r0 = (com.whatsapp.deviceauth.DeviceCredentialsAuthPlugin) r0
            r0.A06()
            return
        L_0x0280:
            java.lang.Object r1 = r1.A00
            X.4QO r1 = (X.AnonymousClass4QO) r1
            r0 = -1
            goto L_0x028c
        L_0x0286:
            java.lang.Object r1 = r1.A00
            X.4QO r1 = (X.AnonymousClass4QO) r1
            r0 = 500(0x1f4, float:7.0E-43)
        L_0x028c:
            r1.onError(r0)
            return
        L_0x0290:
            java.lang.Object r1 = r1.A00
            com.whatsapp.datasharingdisclosure.ui.DisclosureFragment r1 = (com.whatsapp.datasharingdisclosure.ui.DisclosureFragment) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            android.view.ViewTreeObserver$OnScrollChangedListener r0 = r1.A08
            r0.onScrollChanged()
            return
        L_0x029e:
            java.lang.Object r0 = r1.A00
            X.4T4 r0 = (X.AnonymousClass4T4) r0
            r0.Bha()
            return
        L_0x02a6:
            java.lang.Object r0 = r1.A00
            X.4T4 r0 = (X.AnonymousClass4T4) r0
            r0.BhX()
            return
        L_0x02ae:
            java.lang.Object r12 = r1.A00
            X.3cf r12 = (X.C68913cf) r12
            monitor-enter(r12)
            X.0wQ r0 = r12.A00     // Catch:{ all -> 0x0671 }
            r27 = r0
            com.whatsapp.jid.PhoneUserJid r0 = X.C36441kJ.A0n(r27)     // Catch:{ all -> 0x0671 }
            if (r0 == 0) goto L_0x066f
            X.17i r11 = r12.A0B     // Catch:{ all -> 0x0671 }
            X.0wo r0 = r11.A01     // Catch:{ all -> 0x0671 }
            long r4 = r0.A06()     // Catch:{ all -> 0x0671 }
            java.util.HashSet r10 = X.C36441kJ.A16()     // Catch:{ all -> 0x0671 }
            X.0v0 r0 = r12.A06     // Catch:{ all -> 0x0671 }
            r26 = r0
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r26)     // Catch:{ all -> 0x0671 }
            java.lang.String r24 = "adv_last_daily_check_ts"
            r0 = r24
            long r0 = X.C36341k9.A0B(r1, r0)     // Catch:{ all -> 0x0671 }
            long r6 = r4 - r0
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0654
            X.12P r0 = r12.A08     // Catch:{ all -> 0x0671 }
            r0.A06()     // Catch:{ all -> 0x0671 }
            boolean r0 = r0.A08     // Catch:{ all -> 0x0671 }
            if (r0 == 0) goto L_0x066f
            X.0wo r0 = r12.A05     // Catch:{ all -> 0x0671 }
            long r2 = X.C36371kC.A09(r0)     // Catch:{ all -> 0x0671 }
            X.0yC r7 = r12.A0C     // Catch:{ all -> 0x0671 }
            r0 = 730(0x2da, float:1.023E-42)
            int r1 = r7.A07(r0)     // Catch:{ all -> 0x0671 }
            r0 = 1
            int r1 = java.lang.Math.max(r1, r0)     // Catch:{ all -> 0x0671 }
            r0 = 35
            int r6 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x0671 }
            r0 = 731(0x2db, float:1.024E-42)
            int r1 = r7.A07(r0)     // Catch:{ all -> 0x0671 }
            r0 = 0
            int r1 = java.lang.Math.max(r1, r0)     // Catch:{ all -> 0x0671 }
            r0 = 35
            int r0 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x0671 }
            int r6 = r6 - r0
            long r0 = (long) r6     // Catch:{ all -> 0x0671 }
            r6 = 86400(0x15180, double:4.26873E-319)
            long r0 = r0 * r6
            long r16 = r2 - r0
            X.17j r13 = r11.A04     // Catch:{ all -> 0x0671 }
            X.17m r14 = r13.A02     // Catch:{ all -> 0x0671 }
            java.util.HashMap r9 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x0671 }
            java.util.HashMap r8 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x0671 }
            X.12P r0 = r14.A01     // Catch:{ all -> 0x0671 }
            X.1M0 r7 = r0.get()     // Catch:{ all -> 0x0671 }
            X.14e r15 = r7.A02     // Catch:{ all -> 0x062e }
            java.lang.String r6 = "SELECT raw_id, timestamp, expected_timestamp, expected_ts_last_device_job_ts, expected_timestamp_update_ts, account_encryption_type, user_jid_row_id FROM user_device_info WHERE timestamp < ? OR timestamp < expected_timestamp"
            java.lang.String[] r1 = X.C36371kC.A1a(r16)     // Catch:{ all -> 0x062e }
            java.lang.String r0 = "GET_ALL_USER_ADV_TIMESTAMPS_EXPIRING"
            android.database.Cursor r6 = r15.A09(r6, r0, r1)     // Catch:{ all -> 0x062e }
            java.lang.String r23 = "user_jid_row_id"
            r0 = r23
            int r15 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0622 }
        L_0x0345:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x0622 }
            if (r0 == 0) goto L_0x0357
            X.3QO r1 = X.C231817m.A00(r6)     // Catch:{ all -> 0x0622 }
            java.lang.Long r0 = X.C36361kB.A0k(r6, r15)     // Catch:{ all -> 0x0622 }
            r8.put(r0, r1)     // Catch:{ all -> 0x0622 }
            goto L_0x0345
        L_0x0357:
            r6.close()     // Catch:{ all -> 0x062e }
            r7.close()     // Catch:{ all -> 0x0671 }
            X.12j r6 = r14.A00     // Catch:{ all -> 0x0671 }
            java.lang.Class<com.whatsapp.jid.UserJid> r22 = com.whatsapp.jid.UserJid.class
            java.util.Set r1 = r8.keySet()     // Catch:{ all -> 0x0671 }
            r0 = r22
            java.util.HashMap r6 = r6.A0D(r0, r1)     // Catch:{ all -> 0x0671 }
            java.util.Iterator r8 = X.C36371kC.A10(r8)     // Catch:{ all -> 0x0671 }
        L_0x036f:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0671 }
            if (r0 == 0) goto L_0x038b
            java.util.Map$Entry r7 = X.AnonymousClass000.A11(r8)     // Catch:{ all -> 0x0671 }
            java.lang.Object r0 = r7.getKey()     // Catch:{ all -> 0x0671 }
            java.lang.Object r1 = r6.get(r0)     // Catch:{ all -> 0x0671 }
            if (r1 == 0) goto L_0x036f
            java.lang.Object r0 = r7.getValue()     // Catch:{ all -> 0x0671 }
            r9.put(r1, r0)     // Catch:{ all -> 0x0671 }
            goto L_0x036f
        L_0x038b:
            X.0wQ r1 = r13.A00     // Catch:{ all -> 0x0671 }
            com.whatsapp.jid.PhoneUserJid r0 = X.C36441kJ.A0n(r1)     // Catch:{ all -> 0x0671 }
            r9.remove(r0)     // Catch:{ all -> 0x0671 }
            X.13w r0 = r1.A08()     // Catch:{ all -> 0x0671 }
            r9.remove(r0)     // Catch:{ all -> 0x0671 }
            java.util.HashMap r8 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x0671 }
            java.util.HashSet r7 = X.C36441kJ.A16()     // Catch:{ all -> 0x0671 }
            java.util.Iterator r18 = X.C36371kC.A10(r9)     // Catch:{ all -> 0x0671 }
        L_0x03a7:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x0671 }
            if (r0 == 0) goto L_0x0409
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r18)     // Catch:{ all -> 0x0671 }
            java.lang.Object r14 = r0.getKey()     // Catch:{ all -> 0x0671 }
            com.whatsapp.jid.UserJid r14 = (com.whatsapp.jid.UserJid) r14     // Catch:{ all -> 0x0671 }
            java.lang.Object r13 = r0.getValue()     // Catch:{ all -> 0x0671 }
            X.3QO r13 = (X.AnonymousClass3QO) r13     // Catch:{ all -> 0x0671 }
            boolean r0 = X.AnonymousClass143.A0I(r14)     // Catch:{ all -> 0x0671 }
            r6 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0404
            X.12O r15 = r12.A09     // Catch:{ all -> 0x0671 }
            r0 = r14
            X.13w r0 = (X.C223313w) r0     // Catch:{ all -> 0x0671 }
            com.whatsapp.jid.PhoneUserJid r0 = r15.A0A(r0)     // Catch:{ all -> 0x0671 }
            if (r0 == 0) goto L_0x0404
            java.util.Map r0 = r11.A0C(r0)     // Catch:{ all -> 0x0671 }
        L_0x03d4:
            int r0 = r0.size()     // Catch:{ all -> 0x0671 }
            if (r0 <= r1) goto L_0x03db
            r6 = 1
        L_0x03db:
            boolean r0 = X.C68913cf.A00(r13, r12, r2)     // Catch:{ all -> 0x0671 }
            if (r0 == 0) goto L_0x03fb
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0671 }
            java.lang.String r0 = "DeviceADVInfoChecker/checkDeviceListADVInfo remove expired user="
            r1.append(r0)     // Catch:{ all -> 0x0671 }
            r1.append(r14)     // Catch:{ all -> 0x0671 }
            java.lang.String r0 = "; hasCompanion="
            java.lang.String r0 = X.C36371kC.A0z(r0, r1, r6)     // Catch:{ all -> 0x0671 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0671 }
            java.lang.String r0 = "adv_expired"
            r8.put(r14, r0)     // Catch:{ all -> 0x0671 }
        L_0x03fb:
            r10.add(r14)     // Catch:{ all -> 0x0671 }
            if (r6 != 0) goto L_0x03a7
            r7.add(r14)     // Catch:{ all -> 0x0671 }
            goto L_0x03a7
        L_0x0404:
            java.util.Map r0 = r11.A0C(r14)     // Catch:{ all -> 0x0671 }
            goto L_0x03d4
        L_0x0409:
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x0671 }
            if (r0 != 0) goto L_0x05e3
            X.1A6 r0 = r12.A04     // Catch:{ all -> 0x0671 }
            java.util.HashSet r15 = r0.A0C()     // Catch:{ all -> 0x0671 }
            java.util.HashSet r6 = X.C36441kJ.A16()     // Catch:{ all -> 0x0671 }
            java.util.HashSet r1 = X.C36441kJ.A16()     // Catch:{ all -> 0x0671 }
            java.util.Iterator r20 = r10.iterator()     // Catch:{ all -> 0x0671 }
        L_0x0421:
            boolean r0 = r20.hasNext()     // Catch:{ all -> 0x0671 }
            if (r0 == 0) goto L_0x0467
            com.whatsapp.jid.UserJid r13 = X.C36441kJ.A0o(r20)     // Catch:{ all -> 0x0671 }
            boolean r0 = r6.contains(r13)     // Catch:{ all -> 0x0671 }
            if (r0 != 0) goto L_0x0421
            X.12O r0 = r12.A09     // Catch:{ all -> 0x0671 }
            java.util.Set r14 = r0.A0G(r13)     // Catch:{ all -> 0x0671 }
            java.util.Iterator r19 = r14.iterator()     // Catch:{ all -> 0x0671 }
        L_0x043b:
            boolean r0 = r19.hasNext()     // Catch:{ all -> 0x0671 }
            if (r0 == 0) goto L_0x0463
            com.whatsapp.jid.UserJid r13 = X.C36441kJ.A0o(r19)     // Catch:{ all -> 0x0671 }
            X.16D r0 = r12.A02     // Catch:{ all -> 0x0671 }
            boolean r18 = r0.A0q(r13)     // Catch:{ all -> 0x0671 }
            if (r18 != 0) goto L_0x045f
            boolean r18 = r15.contains(r13)     // Catch:{ all -> 0x0671 }
            if (r18 != 0) goto L_0x045f
            X.141 r0 = r0.A08(r13)     // Catch:{ all -> 0x0671 }
            if (r0 == 0) goto L_0x043b
            boolean r0 = r0.A0C()     // Catch:{ all -> 0x0671 }
            if (r0 == 0) goto L_0x043b
        L_0x045f:
            r6.addAll(r14)     // Catch:{ all -> 0x0671 }
            goto L_0x0421
        L_0x0463:
            r1.addAll(r14)     // Catch:{ all -> 0x0671 }
            goto L_0x0421
        L_0x0467:
            X.17X r15 = r12.A07     // Catch:{ all -> 0x0671 }
            java.util.HashSet r21 = X.C36441kJ.A16()     // Catch:{ all -> 0x0671 }
            X.17u r0 = r15.A05     // Catch:{ all -> 0x0671 }
            java.util.Map r0 = r0.A07     // Catch:{ all -> 0x0671 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0671 }
            java.util.ArrayList r13 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0671 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x0671 }
        L_0x047d:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0671 }
            if (r0 == 0) goto L_0x0494
            java.lang.Object r0 = r14.next()     // Catch:{ all -> 0x0671 }
            X.6X6 r0 = (X.AnonymousClass6X6) r0     // Catch:{ all -> 0x0671 }
            X.0y7 r0 = r0.A05()     // Catch:{ all -> 0x0671 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x0671 }
            X.AnonymousClass03Y.A0B(r0, r13)     // Catch:{ all -> 0x0671 }
            goto L_0x047d
        L_0x0494:
            java.util.Set r14 = X.C007103b.A0f(r13)     // Catch:{ all -> 0x0671 }
            java.util.HashSet r13 = X.C36441kJ.A16()     // Catch:{ all -> 0x0671 }
            java.util.Iterator r18 = r1.iterator()     // Catch:{ all -> 0x0671 }
        L_0x04a0:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x0671 }
            if (r0 == 0) goto L_0x04ba
            java.lang.Object r1 = r18.next()     // Catch:{ all -> 0x0671 }
            boolean r0 = r14.contains(r1)     // Catch:{ all -> 0x0671 }
            if (r0 == 0) goto L_0x04b6
            r0 = r21
            r0.add(r1)     // Catch:{ all -> 0x0671 }
            goto L_0x04a0
        L_0x04b6:
            r13.add(r1)     // Catch:{ all -> 0x0671 }
            goto L_0x04a0
        L_0x04ba:
            boolean r0 = r13.isEmpty()     // Catch:{ all -> 0x0671 }
            if (r0 != 0) goto L_0x056e
            X.17r r14 = r15.A07     // Catch:{ all -> 0x0671 }
            java.lang.String r0 = ""
            X.C18740tg.A09(r0, r13)     // Catch:{ all -> 0x0671 }
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0671 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x0671 }
        L_0x04cf:
            boolean r1 = r13.hasNext()     // Catch:{ all -> 0x0671 }
            if (r1 == 0) goto L_0x04e5
            com.whatsapp.jid.UserJid r1 = X.C36441kJ.A0o(r13)     // Catch:{ all -> 0x0671 }
            long r18 = X.C232317r.A00(r14, r1)     // Catch:{ all -> 0x0671 }
            java.lang.String r1 = java.lang.String.valueOf(r18)     // Catch:{ all -> 0x0671 }
            r0.add(r1)     // Catch:{ all -> 0x0671 }
            goto L_0x04cf
        L_0x04e5:
            java.lang.String[] r1 = X.C19430v1.A0N     // Catch:{ all -> 0x0671 }
            java.lang.Object[] r13 = r0.toArray(r1)     // Catch:{ all -> 0x0671 }
            r1 = 975(0x3cf, float:1.366E-42)
            X.72Z r0 = new X.72Z     // Catch:{ all -> 0x0671 }
            r0.<init>(r13, r1)     // Catch:{ all -> 0x0671 }
            java.util.HashSet r20 = X.C36441kJ.A16()     // Catch:{ all -> 0x0671 }
            X.12P r1 = r14.A06     // Catch:{ all -> 0x0671 }
            X.1M0 r19 = r1.get()     // Catch:{ all -> 0x0671 }
            java.util.Iterator r18 = r0.iterator()     // Catch:{ all -> 0x055e }
        L_0x0500:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x055e }
            if (r0 == 0) goto L_0x0564
            java.lang.Object r13 = r18.next()     // Catch:{ all -> 0x055e }
            java.lang.String[] r13 = (java.lang.String[]) r13     // Catch:{ all -> 0x055e }
            r0 = r19
            X.14e r0 = r0.A02     // Catch:{ all -> 0x055e }
            r25 = r0
            int r0 = r13.length     // Catch:{ all -> 0x055e }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x055e }
            java.lang.String r15 = "SELECT user_jid_row_id FROM group_participant_user WHERE user_jid_row_id IN "
            X.C36351kA.A1O(r15, r1, r0)     // Catch:{ all -> 0x055e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x055e }
            java.lang.String r15 = "GET_USERS_IN_ANY_GROUP_BY_USER_JIDS_SQL"
            r1 = r25
            android.database.Cursor r13 = r1.A09(r0, r15, r13)     // Catch:{ all -> 0x055e }
            r0 = r23
            int r1 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0552 }
            java.util.HashSet r15 = X.C36441kJ.A16()     // Catch:{ all -> 0x0552 }
        L_0x0532:
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x0552 }
            if (r0 == 0) goto L_0x053c
            X.C36351kA.A17(r13, r15, r1)     // Catch:{ all -> 0x0552 }
            goto L_0x0532
        L_0x053c:
            X.12j r0 = r14.A05     // Catch:{ all -> 0x0552 }
            r1 = r0
            r0 = r22
            java.util.HashMap r0 = r1.A0D(r0, r15)     // Catch:{ all -> 0x0552 }
            java.util.Collection r1 = r0.values()     // Catch:{ all -> 0x0552 }
            r0 = r20
            r0.addAll(r1)     // Catch:{ all -> 0x0552 }
            r13.close()     // Catch:{ all -> 0x055e }
            goto L_0x0500
        L_0x0552:
            r1 = move-exception
            if (r13 == 0) goto L_0x055d
            r13.close()     // Catch:{ all -> 0x0559 }
            goto L_0x055d
        L_0x0559:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x055e }
        L_0x055d:
            throw r1     // Catch:{ all -> 0x055e }
        L_0x055e:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x0633 }
            goto L_0x0637
        L_0x0564:
            r19.close()     // Catch:{ all -> 0x0671 }
            r1 = r21
            r0 = r20
            r1.addAll(r0)     // Catch:{ all -> 0x0671 }
        L_0x056e:
            java.util.Iterator r13 = r21.iterator()     // Catch:{ all -> 0x0671 }
        L_0x0572:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0671 }
            if (r0 == 0) goto L_0x0586
            com.whatsapp.jid.UserJid r1 = X.C36441kJ.A0o(r13)     // Catch:{ all -> 0x0671 }
            X.12O r0 = r12.A09     // Catch:{ all -> 0x0671 }
            java.util.Set r0 = r0.A0G(r1)     // Catch:{ all -> 0x0671 }
            r6.addAll(r0)     // Catch:{ all -> 0x0671 }
            goto L_0x0572
        L_0x0586:
            java.util.Iterator r15 = r10.iterator()     // Catch:{ all -> 0x0671 }
        L_0x058a:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0671 }
            if (r0 == 0) goto L_0x05e3
            com.whatsapp.jid.UserJid r1 = X.C36441kJ.A0o(r15)     // Catch:{ all -> 0x0671 }
            boolean r0 = r6.contains(r1)     // Catch:{ all -> 0x0671 }
            if (r0 != 0) goto L_0x05ac
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0671 }
            java.lang.String r0 = "DeviceADVInfoChecker/checkDeviceListADVInfo remove user="
            X.C36321k7.A1L(r1, r0, r13)     // Catch:{ all -> 0x0671 }
            java.lang.String r0 = "device_not_in_contact_and_chat"
            r8.put(r1, r0)     // Catch:{ all -> 0x0671 }
            r7.add(r1)     // Catch:{ all -> 0x0671 }
            goto L_0x058a
        L_0x05ac:
            boolean r0 = r8.containsKey(r1)     // Catch:{ all -> 0x0671 }
            if (r0 == 0) goto L_0x058a
            boolean r0 = r7.contains(r1)     // Catch:{ all -> 0x0671 }
            if (r0 != 0) goto L_0x058a
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0671 }
            java.lang.String r0 = "DeviceADVInfoChecker/checkDeviceListADVInfo user has expired, jid="
            X.C36321k7.A1J(r1, r0, r13)     // Catch:{ all -> 0x0671 }
            X.1OE r14 = r12.A0A     // Catch:{ all -> 0x0671 }
            java.lang.Object r0 = r9.get(r1)     // Catch:{ all -> 0x0671 }
            X.3QO r0 = (X.AnonymousClass3QO) r0     // Catch:{ all -> 0x0671 }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x0671 }
            long r0 = r0.A05     // Catch:{ all -> 0x0671 }
            X.2NA r13 = new X.2NA     // Catch:{ all -> 0x0671 }
            r13.<init>()     // Catch:{ all -> 0x0671 }
            r18 = 3600(0xe10, double:1.7786E-320)
            long r0 = r0 / r18
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0671 }
            r13.A00 = r0     // Catch:{ all -> 0x0671 }
            X.0yW r0 = r14.A00     // Catch:{ all -> 0x0671 }
            r0.Bly(r13)     // Catch:{ all -> 0x0671 }
            goto L_0x058a
        L_0x05e3:
            r10.removeAll(r7)     // Catch:{ all -> 0x0671 }
            java.util.Iterator r6 = X.C36371kC.A10(r8)     // Catch:{ all -> 0x0671 }
        L_0x05ea:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0671 }
            if (r0 == 0) goto L_0x0604
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r6)     // Catch:{ all -> 0x0671 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0671 }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x0671 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0671 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0671 }
            r11.A0F(r1, r0)     // Catch:{ all -> 0x0671 }
            goto L_0x05ea
        L_0x0604:
            boolean r0 = r27.A0L()     // Catch:{ all -> 0x0671 }
            if (r0 == 0) goto L_0x064b
            X.3QO r1 = r11.A03()     // Catch:{ all -> 0x0671 }
            boolean r0 = X.C68913cf.A00(r1, r12, r2)     // Catch:{ all -> 0x0671 }
            if (r0 == 0) goto L_0x0638
            java.lang.String r0 = "DeviceADVInfoChecker/checkDeviceListADVInfo own device list expired, logging out"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0671 }
            X.1Ih r2 = r12.A01     // Catch:{ all -> 0x0671 }
            java.lang.String r1 = "invalid_adv_status"
            r0 = 1
            r2.A01(r1, r0, r0)     // Catch:{ all -> 0x0671 }
            goto L_0x066f
        L_0x0622:
            r1 = move-exception
            if (r6 == 0) goto L_0x062d
            r6.close()     // Catch:{ all -> 0x0629 }
            goto L_0x062d
        L_0x0629:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x062e }
        L_0x062d:
            throw r1     // Catch:{ all -> 0x062e }
        L_0x062e:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0633 }
            goto L_0x0637
        L_0x0633:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0671 }
        L_0x0637:
            throw r1     // Catch:{ all -> 0x0671 }
        L_0x0638:
            long r6 = r1.A05     // Catch:{ all -> 0x0671 }
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x0644
            long r1 = r1.A02     // Catch:{ all -> 0x0671 }
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x064b
        L_0x0644:
            com.whatsapp.jid.PhoneUserJid r0 = X.C36441kJ.A0n(r27)     // Catch:{ all -> 0x0671 }
            r10.add(r0)     // Catch:{ all -> 0x0671 }
        L_0x064b:
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r26)     // Catch:{ all -> 0x0671 }
            r0 = r24
            X.C36341k9.A0w(r1, r0, r4)     // Catch:{ all -> 0x0671 }
        L_0x0654:
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x0671 }
            if (r0 != 0) goto L_0x066f
            X.1Nr r0 = r12.A03     // Catch:{ all -> 0x0671 }
            X.164 r2 = r0.A00     // Catch:{ all -> 0x0671 }
            r0 = 0
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r0]     // Catch:{ all -> 0x0671 }
            java.lang.Object[] r1 = r10.toArray(r0)     // Catch:{ all -> 0x0671 }
            com.whatsapp.jid.UserJid[] r1 = (com.whatsapp.jid.UserJid[]) r1     // Catch:{ all -> 0x0671 }
            com.whatsapp.jobqueue.job.SyncDeviceForAdvValidationJob r0 = new com.whatsapp.jobqueue.job.SyncDeviceForAdvValidationJob     // Catch:{ all -> 0x0671 }
            r0.<init>(r1)     // Catch:{ all -> 0x0671 }
            r2.A01(r0)     // Catch:{ all -> 0x0671 }
        L_0x066f:
            monitor-exit(r12)
            return
        L_0x0671:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        L_0x0674:
            java.lang.Object r1 = r1.A00
            X.00S r1 = (X.AnonymousClass00S) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.invoke()
            return
        L_0x0680:
            java.lang.Object r0 = r1.A00
            X.3pe r0 = (X.C76913pe) r0
            X.3E3 r1 = r0.A05
            r0 = 422(0x1a6, float:5.91E-43)
            r1.A00(r0)
            return
        L_0x068c:
            java.lang.Object r3 = r1.A00
            X.3E3 r3 = (X.AnonymousClass3E3) r3
            java.lang.String r0 = "WebPagePreviewViewModel/CTWAListener/onDeliveryFailure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1sS r2 = r3.A03
            X.6tS r1 = r2.A01
            X.2pW r0 = X.C52492pW.LOADING_FAILED
            X.C39471sS.A01(r1, r2, r0)
            X.00s r4 = r3.A00
            X.398 r3 = r3.A02
            r2 = 0
            r1 = 0
            X.36W r0 = new X.36W
            r0.<init>(r1, r3, r2)
            r4.A0C(r0)
            return
        L_0x06ad:
            java.lang.Object r0 = r1.A00
            X.6sj r0 = (X.C144736sj) r0
            X.C144736sj.A00(r0)
            return
        L_0x06b5:
            java.lang.Object r3 = r1.A00
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.String r0 = "profileinfo/activityres/fail/not-a-image"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = "not-a-image"
            r0 = 1
            android.content.Intent r2 = r2.putExtra(r1, r0)
            r1 = 2131889286(0x7f120c86, float:1.9413231E38)
            goto L_0x06e4
        L_0x06cd:
            java.lang.Object r3 = r1.A00
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.String r0 = "profileinfo/activityres/oom-error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = "error-oom"
            r0 = 1
            android.content.Intent r2 = r2.putExtra(r1, r0)
            r1 = 2131889315(0x7f120ca3, float:1.941329E38)
        L_0x06e4:
            java.lang.String r0 = "error_message_id"
            android.content.Intent r1 = r2.putExtra(r0, r1)
            r0 = 0
            r3.setResult(r0, r1)
            r3.finish()
            return
        L_0x06f2:
            java.lang.Object r0 = r1.A00
            X.1MP r0 = (X.AnonymousClass1MP) r0
            r0.A02()
            return
        L_0x06fa:
            java.lang.Object r0 = r1.A00
            X.6OP r0 = (X.AnonymousClass6OP) r0
            X.AnonymousClass6OP.A00(r0)
            return
        L_0x0702:
            java.lang.Object r0 = r1.A00
            X.C36411kG.A1N(r0)
            return
        L_0x0708:
            java.lang.Object r1 = r1.A00
            com.whatsapp.conversationslist.LockedConversationsActivity r1 = (com.whatsapp.conversationslist.LockedConversationsActivity) r1
            r0 = 0
            com.whatsapp.conversationslist.LockedConversationsActivity.A0F(r1, r0, r0)
            return
        L_0x0711:
            java.lang.Object r1 = r1.A00
            com.whatsapp.conversationslist.ConversationsFragment r1 = (com.whatsapp.conversationslist.ConversationsFragment) r1
            r0 = 0
            r1.A2g = r0
            return
        L_0x0719:
            java.lang.Object r0 = r1.A00
            X.29Q r0 = (X.AnonymousClass29Q) r0
            com.whatsapp.conversationslist.ConversationsFragment r2 = r0.A04
            android.widget.ProgressBar r1 = r2.A0B
            r0 = 0
            r1.setVisibility(r0)
            android.widget.ProgressBar r1 = r2.A0B
            r0 = 1
            r1.setIndeterminate(r0)
            return
        L_0x072c:
            java.lang.Object r1 = r1.A00
            X.29Q r1 = (X.AnonymousClass29Q) r1
            java.lang.String r0 = "conversations-gdrive-observer/set-message/show-determinate"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.conversationslist.ConversationsFragment r2 = r1.A04
            android.widget.ProgressBar r0 = r2.A0B
            r1 = 0
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r2.A0B
            r0.setIndeterminate(r1)
            return
        L_0x0743:
            java.lang.Object r1 = r1.A00
            X.29Q r1 = (X.AnonymousClass29Q) r1
            java.lang.String r0 = "conversations-gdrive-observer/set-message/show-nothing"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.conversationslist.ConversationsFragment r2 = r1.A04
            android.widget.ProgressBar r1 = r2.A0B
            r0 = 8
            r1.setVisibility(r0)
            android.widget.ImageView r1 = r2.A09
            r0 = 2131232162(0x7f0805a2, float:1.8080425E38)
            r1.setImageResource(r0)
            return
        L_0x075e:
            java.lang.Object r0 = r1.A00
            X.9k6 r0 = (X.C201679k6) r0
            com.whatsapp.conversationslist.ViewHolder r0 = r0.A06
            android.view.View r1 = r0.A05
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x076c:
            java.lang.Object r0 = r1.A00
            X.3E3 r0 = (X.AnonymousClass3E3) r0
            X.1sS r4 = r0.A03     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0794 }
            X.6tS r3 = r4.A01     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0794 }
            X.0yC r2 = r4.A0U     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0794 }
            java.util.LinkedHashSet r0 = r3.A0K     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0794 }
            boolean r0 = r0.isEmpty()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0794 }
            if (r0 != 0) goto L_0x078c
            java.util.LinkedHashSet r0 = r3.A0K     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0794 }
            java.lang.Object[] r1 = r0.toArray()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0794 }
            r0 = 0
            r0 = r1[r0]     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0794 }
            X.00I r0 = (X.AnonymousClass00I) r0     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0794 }
            r3.A0F(r0, r2)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0794 }
        L_0x078c:
            X.6tS r1 = r4.A01     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0794 }
            X.2pW r0 = X.C52492pW.SMALL_THUMBNAIL_LOADED     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0794 }
            X.C39471sS.A01(r1, r4, r0)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0794 }
            return
        L_0x0794:
            r1 = move-exception
            java.lang.String r0 = "CTWAListener/onSuccess/failed to load thumb"
            com.whatsapp.util.Log.w(r0, r1)
            return
        L_0x079b:
            java.lang.Object r1 = r1.A00
            X.1uJ r1 = (X.C39941uJ) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.A0S()
            return
        L_0x07a7:
            java.lang.Object r0 = r1.A00
            X.1uh r0 = (X.C40061uh) r0
            X.C40061uh.A0A(r0)
            return
        L_0x07af:
            java.lang.Object r0 = r1.A00
            X.1uh r0 = (X.C40061uh) r0
            X.00s r2 = r0.A0S
            X.17T r1 = r0.A0n
            X.11F r0 = r0.A0t
            boolean r0 = r1.A07(r0)
            X.C36341k9.A19(r2, r0)
            return
        L_0x07c1:
            r0 = 8
            r3.setVisibility(r0)
            return
        L_0x07c7:
            java.lang.String r0 = "activityLifecycleCallbacks"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x07ce:
            r0 = 1
            r1.setEnabled(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81113wU.run():void");
    }

    public static void A01(C19770wU r2, Object obj) {
        Objects.requireNonNull(obj);
        r2.Boy(new C81113wU(obj, 16));
    }

    public C81113wU(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
