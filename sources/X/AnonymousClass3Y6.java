package X;

import android.view.View;

/* renamed from: X.3Y6  reason: invalid class name */
public class AnonymousClass3Y6 implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public AnonymousClass3Y6(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new AnonymousClass3Y6(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03fd, code lost:
        if (r1 == false) goto L_0x03ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00bd, code lost:
        com.whatsapp.quickcontact.QuickContactActivity.A0F(r4, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0593, code lost:
        X.AnonymousClass3SJ.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0596, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x05e0, code lost:
        r2 = X.AnonymousClass001.A07();
        r2.putString("VERIFY_ANOTHER_WAY_CODE_METHOD", r1);
        r3.A0l().A0o("VERIFY_ANOTHER_WAY_FRAGMENT_RESULT", r2);
        r3.A1c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x05f5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0710, code lost:
        r4.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0713, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r17) {
        /*
            r16 = this;
            r1 = r16
            int r0 = r1.A01
            r7 = r17
            switch(r0) {
                case 0: goto L_0x01cb;
                case 1: goto L_0x01d3;
                case 2: goto L_0x01cb;
                case 3: goto L_0x0067;
                case 4: goto L_0x007c;
                case 5: goto L_0x01db;
                case 6: goto L_0x01ef;
                case 7: goto L_0x01d3;
                case 8: goto L_0x0284;
                case 9: goto L_0x0284;
                case 10: goto L_0x029a;
                case 11: goto L_0x032a;
                case 12: goto L_0x000f;
                case 13: goto L_0x0332;
                case 14: goto L_0x002a;
                case 15: goto L_0x004f;
                case 16: goto L_0x0396;
                case 17: goto L_0x0096;
                case 18: goto L_0x03c2;
                case 19: goto L_0x03d6;
                case 20: goto L_0x0532;
                case 21: goto L_0x0009;
                case 22: goto L_0x053b;
                case 23: goto L_0x0548;
                case 24: goto L_0x00c2;
                case 25: goto L_0x0559;
                case 26: goto L_0x056f;
                case 27: goto L_0x01cb;
                case 28: goto L_0x01cb;
                case 29: goto L_0x057b;
                case 30: goto L_0x0586;
                case 31: goto L_0x0597;
                case 32: goto L_0x05c1;
                case 33: goto L_0x05c9;
                case 34: goto L_0x05d5;
                case 35: goto L_0x01d3;
                case 36: goto L_0x05f6;
                case 37: goto L_0x05fe;
                case 38: goto L_0x00ed;
                case 39: goto L_0x01a8;
                case 40: goto L_0x064c;
                case 41: goto L_0x01d3;
                case 42: goto L_0x0654;
                case 43: goto L_0x0681;
                case 44: goto L_0x0009;
                case 45: goto L_0x0009;
                case 46: goto L_0x069b;
                case 47: goto L_0x0009;
                case 48: goto L_0x06f8;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A00
            X.C36411kG.A1N(r0)
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r0 = r1.A00
            X.3QZ r0 = (X.AnonymousClass3QZ) r0
            com.whatsapp.quickcontact.QuickContactActivity r4 = r0.A00
            X.3Rv r3 = r4.A0N
            X.141 r0 = r4.A0U
            X.3IL r0 = r0.A0F
            java.lang.String r2 = r0.A01
            r0 = 16
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "smsto:"
            r3.A02(r4, r1, r2, r0)
            goto L_0x00bd
        L_0x002a:
            java.lang.Object r0 = r1.A00
            X.3QZ r0 = (X.AnonymousClass3QZ) r0
            com.whatsapp.quickcontact.QuickContactActivity r4 = r0.A00
            X.1Dv r3 = r4.A01
            X.190 r1 = X.C36441kJ.A0j()
            X.141 r0 = r4.A0U
            android.content.Intent r1 = r1.A1W(r4, r0)
            java.lang.String r0 = "args_conversation_screen_entry_point"
            r2 = 1
            android.content.Intent r1 = r1.putExtra(r0, r2)
            java.lang.String r0 = "extra_show_search_on_create"
            android.content.Intent r1 = r1.putExtra(r0, r2)
            java.lang.String r0 = "QuickContactActivity"
            r3.A08(r4, r1, r0)
            goto L_0x00bd
        L_0x004f:
            java.lang.Object r3 = r1.A00
            X.3QZ r3 = (X.AnonymousClass3QZ) r3
            com.whatsapp.quickcontact.QuickContactActivity r4 = r3.A00
            X.17X r2 = r4.A0R
            com.whatsapp.jid.GroupJid r1 = r4.A0b
            X.141 r0 = r4.A0U
            X.11F r0 = r0.A0H
            X.00s r1 = r2.A02(r0, r1)
            r0 = 10
            X.C65973Ue.A01(r4, r1, r3, r0)
            goto L_0x00bd
        L_0x0067:
            java.lang.Object r2 = r1.A00
            com.whatsapp.qrcode.contactqr.QrScanCodeFragment r2 = (com.whatsapp.qrcode.contactqr.QrScanCodeFragment) r2
            com.whatsapp.qrcode.WaQrScannerView r1 = r2.A03
            X.4Ur r0 = r1.A01
            boolean r0 = r0.BvN()
            if (r0 == 0) goto L_0x000e
            r1.Bvw()
            com.whatsapp.qrcode.contactqr.QrScanCodeFragment.A00(r2)
            return
        L_0x007c:
            java.lang.Object r0 = r1.A00
            X.01I r2 = X.C36441kJ.A0X(r0)
            boolean r0 = r2 instanceof X.C47072cl
            if (r0 == 0) goto L_0x000e
            X.2cl r2 = (X.C47072cl) r2
            r0 = 14
            android.content.Intent r1 = X.AnonymousClass190.A0H(r2, r0)
            r0 = 1
            r2.A0X = r0
            r0 = 2
            r2.startActivityForResult(r1, r0)
            return
        L_0x0096:
            java.lang.Object r0 = r1.A00
            X.3QZ r0 = (X.AnonymousClass3QZ) r0
            com.whatsapp.quickcontact.QuickContactActivity r4 = r0.A00
            X.147 r0 = r4.A0c
            if (r0 == 0) goto L_0x000e
            X.1Dv r2 = r4.A01
            X.190 r1 = X.C36441kJ.A0j()
            X.141 r0 = r4.A0U
            X.C36391kE.A1A(r4, r2, r0, r1)
            X.16D r5 = r4.A0I
            X.147 r6 = r4.A0c
            X.17X r1 = r4.A0R
            X.0wQ r0 = r4.A02
            java.util.ArrayList r7 = X.AnonymousClass3UL.A03(r0, r1, r6)
            r8 = 0
            r10 = 1
            r9 = 7
            X.AnonymousClass3UD.A07(r4, r5, r6, r7, r8, r9, r10)
        L_0x00bd:
            r0 = 0
            com.whatsapp.quickcontact.QuickContactActivity.A0F(r4, r0)
            return
        L_0x00c2:
            java.lang.Object r3 = r1.A00
            com.whatsapp.registration.RegisterName r3 = (com.whatsapp.registration.RegisterName) r3
            r0 = 1
            r3.A1a = r0
            X.3TX r2 = r3.A1J
            java.lang.String r1 = "profile_photo"
            java.lang.String r0 = "tapped"
            r2.A08(r1, r0)
            X.1P3 r2 = r3.A14
            X.141 r4 = r3.A0i
            r6 = 1
            r5 = 12
            r10 = 0
            r7 = 1
            r8 = 1
            r9 = 1
            r2.A08(r3, r4, r5, r6, r7, r8, r9, r10)
            X.0v5 r1 = r3.A0A
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x000e
            java.lang.NullPointerException r0 = X.C36411kG.A0u(r1)
            throw r0
        L_0x00ed:
            java.lang.Object r9 = r1.A00
            com.whatsapp.registration.VerifyCaptcha r9 = (com.whatsapp.registration.VerifyCaptcha) r9
            r14 = 0
            com.whatsapp.WaImageButton r0 = r9.A0C
            java.lang.String r6 = "captchaAudioBtn"
            if (r0 != 0) goto L_0x00fd
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x00fd:
            r0.setEnabled(r14)
            java.io.File r0 = r9.A0T
            r3 = 1
            if (r0 == 0) goto L_0x0190
            java.lang.String r4 = "captchaAudioFile"
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0190
            android.media.MediaPlayer r0 = r9.A08
            if (r0 != 0) goto L_0x0141
            android.media.MediaPlayer r2 = new android.media.MediaPlayer     // Catch:{ Exception -> 0x071b }
            r2.<init>()     // Catch:{ Exception -> 0x071b }
            r9.A08 = r2     // Catch:{ Exception -> 0x071b }
            X.0wG r0 = r9.A0G     // Catch:{ Exception -> 0x071b }
            if (r0 == 0) goto L_0x0714
            android.content.Context r1 = r0.A00     // Catch:{ Exception -> 0x071b }
            java.io.File r0 = r9.A0T     // Catch:{ Exception -> 0x071b }
            if (r0 != 0) goto L_0x0127
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)     // Catch:{ Exception -> 0x071b }
            throw r0     // Catch:{ Exception -> 0x071b }
        L_0x0127:
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ Exception -> 0x071b }
            r2.setDataSource(r1, r0)     // Catch:{ Exception -> 0x071b }
            android.media.MediaPlayer r0 = r9.A08     // Catch:{ Exception -> 0x071b }
            if (r0 == 0) goto L_0x0135
            r0.prepare()     // Catch:{ Exception -> 0x071b }
        L_0x0135:
            android.media.MediaPlayer r1 = r9.A08
            if (r1 == 0) goto L_0x0141
            X.3WR r0 = new X.3WR
            r0.<init>(r9)
            r1.setOnCompletionListener(r0)
        L_0x0141:
            android.media.AudioManager r0 = r9.A07
            if (r0 == 0) goto L_0x0187
            r2 = 3
            int r0 = r0.getStreamVolume(r2)
            float r1 = (float) r0
            android.media.AudioManager r0 = r9.A07
            if (r0 == 0) goto L_0x0187
            int r0 = r0.getStreamMaxVolume(r2)
            float r0 = (float) r0
            float r1 = r1 / r0
            double r4 = (double) r1
            r1 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0187
            android.view.View r8 = r9.A00
            X.AnonymousClass00C.A08(r8)
            r12 = 2131887550(0x7f1205be, float:1.940971E38)
            r13 = 3000(0xbb8, float:4.204E-42)
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()
            X.0yb r10 = r9.A08
            X.AnonymousClass00C.A07(r10)
            X.3ZU r7 = new X.3ZU
            r7.<init>((android.view.View) r8, (X.AnonymousClass012) r9, (X.C21060yb) r10, (java.util.List) r11, (int) r12, (int) r13, (boolean) r14)
            r2 = 2131888874(0x7f120aea, float:1.9412396E38)
            r1 = 36
            X.3Y6 r0 = new X.3Y6
            r0.<init>(r7, r1)
            r7.A04(r0, r2)
            r7.A02()
        L_0x0187:
            android.media.MediaPlayer r0 = r9.A08     // Catch:{ Exception -> 0x072f }
            if (r0 == 0) goto L_0x000e
            r0.start()     // Catch:{ Exception -> 0x072f }
            goto L_0x072e
        L_0x0190:
            com.whatsapp.WaImageButton r0 = r9.A0C
            if (r0 != 0) goto L_0x0199
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x0199:
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L_0x000e
            com.whatsapp.WaImageButton r0 = r9.A0C
            if (r0 != 0) goto L_0x0742
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x01a8:
            java.lang.Object r4 = r1.A00
            com.whatsapp.registration.VerifyCaptcha r4 = (com.whatsapp.registration.VerifyCaptcha) r4
            android.widget.ProgressBar r0 = r4.A09
            r2 = 0
            if (r0 != 0) goto L_0x01b8
            java.lang.String r0 = "captchaRequestLoading"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01b8:
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 != r0) goto L_0x000e
            com.whatsapp.WaImageView r0 = r4.A0E
            if (r0 != 0) goto L_0x0746
            java.lang.String r0 = "captchaImage"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01cb:
            java.lang.Object r0 = r1.A00
            X.14u r0 = (X.C225314u) r0
            r0.onBackPressed()
            return
        L_0x01d3:
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1b()
            return
        L_0x01db:
            java.lang.Object r1 = r1.A00
            com.whatsapp.qrcode.contactqr.QrScanCodeFragment r1 = (com.whatsapp.qrcode.contactqr.QrScanCodeFragment) r1
            r0 = 0
            r1.A04 = r0
            com.whatsapp.qrcode.WaQrScannerView r0 = r1.A03
            if (r0 == 0) goto L_0x01e9
            r0.BoN()
        L_0x01e9:
            com.whatsapp.qrcode.WaQrScannerView r0 = r1.A03
            r0.Bog()
            return
        L_0x01ef:
            java.lang.Object r3 = r1.A00
            com.whatsapp.qrcode.contactqr.ScannedCodeDialogFragment r3 = (com.whatsapp.qrcode.contactqr.ScannedCodeDialogFragment) r3
            int r1 = r3.A00
            r9 = 1
            if (r1 == 0) goto L_0x0236
            if (r1 == r9) goto L_0x022a
            r0 = 2
            if (r1 != r0) goto L_0x0259
            android.content.Context r5 = r3.A0a()
            java.lang.String r0 = r3.A0M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            X.190 r4 = X.C36441kJ.A0j()
            com.whatsapp.jid.UserJid r6 = r3.A0G
            if (r0 != 0) goto L_0x022e
            java.lang.String r7 = r3.A0M
            r8 = 0
            r10 = 1
            r11 = 1
            android.content.Intent r0 = r4.A1a(r5, r6, r7, r8, r9, r10, r11)
            r3.A1C(r0)
        L_0x021b:
            X.0wU r2 = r3.A0K
            r1 = 46
            X.3wW r0 = new X.3wW
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.Boy(r0)
            r3.A1b()
        L_0x022a:
            r3.A1b()
            return
        L_0x022e:
            android.content.Intent r0 = X.C36391kE.A0F(r5, r4, r6)
            X.AnonymousClass3LQ.A00(r0, r3)
            goto L_0x021b
        L_0x0236:
            X.141 r0 = r3.A0E
            X.3IL r0 = r0.A0F
            if (r0 == 0) goto L_0x0260
            X.01I r0 = r3.A0i()
            android.content.Intent r0 = X.C36371kC.A0C(r0)
            r3.A1C(r0)
            X.190 r2 = X.C36441kJ.A0j()
            android.content.Context r1 = r3.A0a()
            com.whatsapp.jid.UserJid r0 = r3.A0G
            android.content.Intent r0 = X.C36391kE.A0F(r1, r2, r0)
            X.AnonymousClass3LQ.A00(r0, r3)
            goto L_0x022a
        L_0x0259:
            java.lang.String r0 = "Unhandled type"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0260:
            X.1eE r4 = r3.A0J
            com.whatsapp.jid.UserJid r0 = r3.A0G
            java.lang.String r2 = X.AnonymousClass3U8.A04(r0)
            X.C18740tg.A06(r2)
            X.141 r0 = r3.A0E
            java.lang.String r1 = r0.A0a
            r0 = 0
            android.content.Intent r1 = X.C32811eE.A00(r4, r2, r1, r9, r0)
            java.lang.String r0 = "finishActivityOnSaveCompleted"
            r1.putExtra(r0, r9)
            r3.startActivityForResult(r1, r9)
            X.1dz r1 = r3.A0I
            r0 = 11
            r1.A03(r9, r0)
            return
        L_0x0284:
            java.lang.Object r0 = r1.A00
            com.whatsapp.qrcode.contactqr.ScannedCodeDialogFragment r0 = (com.whatsapp.qrcode.contactqr.ScannedCodeDialogFragment) r0
            X.01I r2 = r0.A0h()
            X.190 r1 = X.C36441kJ.A0j()
            X.141 r0 = r0.A0E
            android.content.Intent r0 = r1.A1V(r2, r0)
            r2.startActivity(r0)
            return
        L_0x029a:
            java.lang.Object r9 = r1.A00
            com.whatsapp.quickcontact.QuickContactActivity r9 = (com.whatsapp.quickcontact.QuickContactActivity) r9
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "location_latitude"
            r2 = 0
            double r12 = r1.getDoubleExtra(r0, r2)
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "location_longitude"
            double r14 = r1.getDoubleExtra(r0, r2)
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x030f
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x030f
            X.1P5 r8 = r9.A0d
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "gjid"
            X.11F r4 = X.C36401kF.A0Z(r1, r0)
            X.C18740tg.A06(r4)
            X.141 r1 = r9.A0U
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r7 = X.C36381kD.A0e(r1, r0)
            java.lang.Object r6 = r8.A0Q
            monitor-enter(r6)
            java.util.Map r0 = X.AnonymousClass1P5.A05(r8)     // Catch:{ all -> 0x0306 }
            java.lang.Object r1 = r0.get(r4)     // Catch:{ all -> 0x0306 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x0306 }
            X.0wo r0 = r8.A0D     // Catch:{ all -> 0x0306 }
            long r4 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x0306 }
            if (r1 == 0) goto L_0x0304
            java.lang.Object r7 = r1.get(r7)     // Catch:{ all -> 0x0306 }
            X.375 r7 = (X.AnonymousClass375) r7     // Catch:{ all -> 0x0306 }
            if (r7 == 0) goto L_0x0304
            long r0 = r7.A00     // Catch:{ all -> 0x0306 }
            boolean r0 = X.AnonymousClass1P5.A0G(r0, r4)     // Catch:{ all -> 0x0306 }
            if (r0 == 0) goto L_0x0304
            java.util.Map r1 = r8.A0Z     // Catch:{ all -> 0x0306 }
            com.whatsapp.jid.UserJid r0 = r7.A01     // Catch:{ all -> 0x0306 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0306 }
            X.3Kq r0 = (X.C63593Kq) r0     // Catch:{ all -> 0x0306 }
        L_0x0302:
            monitor-exit(r6)     // Catch:{ all -> 0x0306 }
            goto L_0x0309
        L_0x0304:
            r0 = 0
            goto L_0x0302
        L_0x0306:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0306 }
            throw r0
        L_0x0309:
            if (r0 == 0) goto L_0x030f
            double r12 = r0.A00
            double r14 = r0.A01
        L_0x030f:
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0325
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0325
            X.171 r1 = r9.A0K
            X.141 r0 = r9.A0U
            java.lang.String r10 = r1.A0H(r0)
            X.2XH r8 = r9.A0e
            r11 = 0
            r8.A08(r9, r10, r11, r12, r14)
        L_0x0325:
            r0 = 0
            com.whatsapp.quickcontact.QuickContactActivity.A0F(r9, r0)
            return
        L_0x032a:
            java.lang.Object r0 = r1.A00
            com.whatsapp.quickcontact.QuickContactActivity r0 = (com.whatsapp.quickcontact.QuickContactActivity) r0
            r0.A3i()
            return
        L_0x0332:
            java.lang.Object r6 = r1.A00
            X.3QZ r6 = (X.AnonymousClass3QZ) r6
            com.whatsapp.quickcontact.QuickContactActivity r4 = r6.A00
            X.141 r0 = r4.A0U
            boolean r0 = r0.A0G()
            r3 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0363
            X.1LV r1 = r4.A0F
            X.147 r0 = r4.A0c
            X.147 r2 = r1.A02(r0)
            X.12q r1 = r4.A0Q
            X.147 r0 = r4.A0c
            boolean r0 = r1.A0O(r0)
            if (r0 == 0) goto L_0x0382
            if (r2 == 0) goto L_0x0382
            X.0xE r1 = r4.A0G
            android.content.Context r0 = r7.getContext()
            boolean r0 = r1.Bkz(r0, r7, r2)
            if (r0 == 0) goto L_0x0382
            return
        L_0x0363:
            X.141 r0 = r4.A0U
            X.11F r2 = r0.A0H
            boolean r0 = r2 instanceof X.C177618e5
            if (r0 == 0) goto L_0x0374
            r1 = 0
            android.content.Intent r0 = X.AnonymousClass190.A0p(r4, r2, r5)
            X.C05290Pd.A00(r4, r0, r1)
            goto L_0x0392
        L_0x0374:
            X.17X r1 = r4.A0R
            com.whatsapp.jid.GroupJid r0 = r4.A0b
            X.00s r1 = r1.A02(r2, r0)
            r0 = 9
            X.C65973Ue.A01(r4, r1, r6, r0)
            goto L_0x0392
        L_0x0382:
            X.141 r0 = r4.A0U
            X.11F r0 = r0.A0H
            android.content.Intent r1 = X.AnonymousClass190.A0q(r4, r0, r5, r3, r5)
            java.lang.String r0 = "QuickContactActivity"
            X.AnonymousClass3M9.A01(r1, r0)
            r4.startActivity(r1)
        L_0x0392:
            com.whatsapp.quickcontact.QuickContactActivity.A0F(r4, r3)
            return
        L_0x0396:
            java.lang.Object r0 = r1.A00
            X.3QZ r0 = (X.AnonymousClass3QZ) r0
            com.whatsapp.quickcontact.QuickContactActivity r4 = r0.A00
            X.5Nh r3 = r4.A0s
            if (r3 == 0) goto L_0x03ab
            X.1ND r2 = r4.A0C
            r1 = 10
            X.1NE r2 = (X.AnonymousClass1NE) r2
            r0 = 0
            r2.BNr(r4, r3, r1, r0)
            return
        L_0x03ab:
            X.3KV r2 = r4.A0T
            if (r2 == 0) goto L_0x03b7
            X.1ND r1 = r4.A0C
            r0 = 10
            r1.Bug(r4, r2, r0)
            return
        L_0x03b7:
            X.0wN r3 = r4.A03
            r2 = 0
            java.lang.String r1 = "LinkedCallLogPrefetchNotCompletedOnTime"
            java.lang.String r0 = "quickContactDialog "
            r3.A0E(r1, r0, r2)
            return
        L_0x03c2:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "changenumberoverview/next"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Intent r0 = X.AnonymousClass190.A00(r1)
            r1.startActivity(r0)
            r1.finish()
            return
        L_0x03d6:
            java.lang.Object r4 = r1.A00
            com.whatsapp.registration.EULA r4 = (com.whatsapp.registration.EULA) r4
            X.0yb r0 = r4.A08
            android.telephony.TelephonyManager r1 = r0.A0K()
            r3 = 2
            if (r1 != 0) goto L_0x03ec
            java.lang.String r0 = "EULA/cellular-network null"
        L_0x03e5:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.AnonymousClass3SJ.A01(r4, r3)
            return
        L_0x03ec:
            X.0yE r0 = r4.A0C
            int r2 = X.C131896Re.A01(r1, r0)
            X.0wD r0 = r4.A07
            X.1M8 r0 = r0.A04()
            if (r0 == 0) goto L_0x03ff
            boolean r1 = r0.A03
            r0 = 1
            if (r1 != 0) goto L_0x0400
        L_0x03ff:
            r0 = 0
        L_0x0400:
            if (r2 != 0) goto L_0x0407
            if (r0 != 0) goto L_0x0407
            java.lang.String r0 = "EULA/cellular-network unknown"
            goto L_0x03e5
        L_0x0407:
            X.12U r0 = r4.A0A
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x043a
            X.3Rl r9 = r4.A0H
            long r7 = java.lang.System.currentTimeMillis()
            long r0 = r9.A00
            long r5 = r7 - r0
            long r1 = X.C65283Rl.A09
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x043a
            r9.A00 = r7
            java.util.List r2 = r9.A06
            java.util.List r1 = r9.A05
            r2.addAll(r1)
            java.util.List r0 = r9.A04
            r2.addAll(r0)
            r1.clear()
            r0.clear()
            X.0wU r1 = r9.A03
            r0 = 19
            X.C80253v6.A01(r1, r9, r0)
        L_0x043a:
            java.lang.String r0 = "EULA/register/eula/accept"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wU r1 = r4.A04
            r0 = 6
            X.C81143wX.A01(r1, r4, r0)
            X.0v0 r0 = r4.A09
            long r5 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "eula_accepted_time"
            X.C36341k9.A0w(r1, r0, r5)
            X.005 r0 = r4.A0b
            java.lang.Object r0 = r0.get()
            X.3D0 r0 = (X.AnonymousClass3D0) r0
            X.3Ae r0 = r0.A01()
            if (r0 == 0) goto L_0x0489
            X.6OK r1 = r4.A0G
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            boolean r0 = X.AnonymousClass3LX.A00(r4)
            if (r0 != 0) goto L_0x0474
            boolean r0 = X.AnonymousClass3LX.A01(r4, r1)
            if (r0 == 0) goto L_0x0489
        L_0x0474:
            X.005 r0 = r4.A0b
            X.3Ae r0 = X.AnonymousClass3D0.A00(r0)
            X.66E r5 = r0.A04
            X.0zE r2 = r5.A01
            r1 = 551497305(0x20df2e59, float:3.780834E-19)
            r0 = 467(0x1d3, float:6.54E-43)
            r2.markerEnd(r1, r0)
            r0 = 0
            r5.A00 = r0
        L_0x0489:
            X.0wU r1 = r4.A04
            r0 = 7
            X.3wX r0 = X.C81143wX.A00(r4, r0)
            r1.Bp1(r0)
            X.1Pc r1 = r4.A0B
            X.0wp r0 = r1.A02
            android.content.SharedPreferences r0 = X.C19980wp.A00(r0)
            java.lang.String r2 = "previously_logged_out_from_primary"
            boolean r0 = X.C36371kC.A1U(r0, r2)
            if (r0 != 0) goto L_0x04a8
            X.1Pe r0 = r1.A01
            r0.A00()
        L_0x04a8:
            X.1Pc r1 = r4.A0B
            X.0wp r0 = r1.A02
            android.content.SharedPreferences r0 = X.C19980wp.A00(r0)
            boolean r0 = X.C36371kC.A1U(r0, r2)
            if (r0 != 0) goto L_0x04f0
            X.1Pe r0 = r1.A01
            X.2nr r2 = r0.A00()
            X.2nr r0 = X.C51462nr.PHONE
            if (r2 == r0) goto L_0x04f0
            X.1Pd r0 = r1.A00
            int r1 = r0.A00()
            r0 = 1
            if (r1 == r0) goto L_0x04f0
            if (r1 == r3) goto L_0x04d5
            boolean r0 = X.C18750th.A0D()
            if (r0 != 0) goto L_0x04f0
            X.2nr r0 = X.C51462nr.TABLET
            if (r2 != r0) goto L_0x04f0
        L_0x04d5:
            java.lang.String r0 = "EULA/show companion registration flow"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r3 = "entry_eula"
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.companionmode.registration.RegisterAsCompanionActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "entry_point"
            r2.putExtra(r0, r3)
            goto L_0x070d
        L_0x04f0:
            X.1QD r0 = r4.A0U
            r0.A01()
            X.1Ww r0 = r4.A0R
            r10 = 1
            X.C29501Ww.A02(r0, r10, r10)
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r9 = "com.whatsapp.registration.RegisterPhone.phone_number"
            java.lang.String r8 = r0.getStringExtra(r9)
            java.lang.String r7 = "com.whatsapp.registration.RegisterPhone.country_code"
            java.lang.String r6 = r0.getStringExtra(r7)
            java.lang.String r5 = "com.whatsapp.registration.RegisterPhone.clear_phone_number"
            boolean r3 = r0.getBooleanExtra(r5, r10)
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.phonenumberentry.RegisterPhone"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            r1.putExtra(r9, r8)
            r1.putExtra(r7, r6)
            java.lang.String r0 = "com.whatsapp.registration.RegisterPhone.resetstate"
            r1.putExtra(r0, r10)
            r1.putExtra(r5, r3)
            r4.startActivity(r1)
            goto L_0x0710
        L_0x0532:
            java.lang.Object r1 = r1.A00
            com.whatsapp.registration.MaacGrantConsentActivity r1 = (com.whatsapp.registration.MaacGrantConsentActivity) r1
            r0 = 0
            com.whatsapp.registration.MaacGrantConsentActivity.A01(r1, r0)
            return
        L_0x053b:
            java.lang.Object r1 = r1.A00
            com.whatsapp.registration.RegisterName r1 = (com.whatsapp.registration.RegisterName) r1
            java.lang.String r0 = "RegisterName/clicked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.A3n()
            return
        L_0x0548:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2131428682(0x7f0b054a, float:1.8479015E38)
            android.view.View r0 = X.C03570Gk.A0B(r1, r0)
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.toggle()
            return
        L_0x0559:
            java.lang.Object r1 = r1.A00
            X.226 r1 = (X.AnonymousClass226) r1
            java.lang.String r0 = "RegisterName/init/stack "
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.C224714l.A01()
            com.whatsapp.registration.RegisterName r2 = r1.A01
            X.3Gu r1 = r2.A0q
            java.lang.String r0 = "regname-init"
            X.C62603Gu.A00(r2, r1, r0)
            return
        L_0x056f:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 130(0x82, float:1.82E-43)
            X.AnonymousClass3SJ.A00(r1, r0)
            r0 = 126(0x7e, float:1.77E-43)
            goto L_0x0593
        L_0x057b:
            java.lang.Object r0 = r1.A00
            X.228 r0 = (X.AnonymousClass228) r0
            com.whatsapp.registration.RegisterName r1 = r0.A07
            r0 = 1
            r1.A3l(r0)
            return
        L_0x0586:
            java.lang.Object r1 = r1.A00
            X.228 r1 = (X.AnonymousClass228) r1
            java.lang.String r0 = "RegisterName/restoredialog/skip"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.registration.RegisterName r1 = r1.A07
            r0 = 106(0x6a, float:1.49E-43)
        L_0x0593:
            X.AnonymousClass3SJ.A01(r1, r0)
            return
        L_0x0597:
            java.lang.Object r1 = r1.A00
            X.228 r1 = (X.AnonymousClass228) r1
            java.lang.String r0 = "RegisterName/restoredialog/done"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.registration.RegisterName r5 = r1.A07
            X.1ei r0 = r5.A0L
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x05bb
            X.0v0 r4 = r5.A09
            long r2 = java.lang.System.currentTimeMillis()
            r0 = 604800000(0x240c8400, double:2.988109026E-315)
            long r2 = r2 + r0
            r4.A1G(r2)
            r0 = 1
            r5.A1d = r0
            return
        L_0x05bb:
            r0 = 103(0x67, float:1.44E-43)
            X.AnonymousClass3SJ.A00(r5, r0)
            return
        L_0x05c1:
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1c()
            return
        L_0x05c9:
            java.lang.Object r3 = r1.A00
            androidx.fragment.app.DialogFragment r3 = (androidx.fragment.app.DialogFragment) r3
            java.lang.String r0 = "VerifyAnotherWayBottomSheetFragment/call-me"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = "voice"
            goto L_0x05e0
        L_0x05d5:
            java.lang.Object r3 = r1.A00
            androidx.fragment.app.DialogFragment r3 = (androidx.fragment.app.DialogFragment) r3
            java.lang.String r0 = "VerifyAnotherWayBottomSheetFragment/send-sms"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = "sms"
        L_0x05e0:
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            java.lang.String r0 = "VERIFY_ANOTHER_WAY_CODE_METHOD"
            r2.putString(r0, r1)
            X.01z r1 = r3.A0l()
            java.lang.String r0 = "VERIFY_ANOTHER_WAY_FRAGMENT_RESULT"
            r1.A0o(r0, r2)
            r3.A1c()
            return
        L_0x05f6:
            java.lang.Object r0 = r1.A00
            X.3ZU r0 = (X.AnonymousClass3ZU) r0
            r0.A01()
            return
        L_0x05fe:
            java.lang.Object r3 = r1.A00
            com.whatsapp.registration.VerifyCaptcha r3 = (com.whatsapp.registration.VerifyCaptcha) r3
            com.whatsapp.CodeInputField r0 = r3.A0A
            if (r0 != 0) goto L_0x060d
            java.lang.String r0 = "codeInputField"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x060d:
            java.lang.String r6 = r0.getCode()
            X.AnonymousClass00C.A08(r6)
            int r1 = r6.length()
            r0 = 3
            if (r1 == r0) goto L_0x0620
            r0 = 1
            X.AnonymousClass3SJ.A01(r3, r0)
            return
        L_0x0620:
            java.lang.String r4 = r3.A0U
            if (r4 != 0) goto L_0x062b
            java.lang.String r0 = "countryCode"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x062b:
            java.lang.String r5 = r3.A0V
            if (r5 != 0) goto L_0x0636
            java.lang.String r0 = "phoneNumber"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0636:
            X.0wU r0 = r3.A04
            X.3UV r2 = r3.A0N
            if (r2 == 0) goto L_0x0645
            X.2js r1 = new X.2js
            r1.<init>(r2, r3, r4, r5, r6)
            X.C36441kJ.A1E(r1, r0)
            return
        L_0x0645:
            java.lang.String r0 = "registrationHttpManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x064c:
            java.lang.Object r0 = r1.A00
            com.whatsapp.registration.VerifyTwoFactorAuth r0 = (com.whatsapp.registration.VerifyTwoFactorAuth) r0
            com.whatsapp.registration.VerifyTwoFactorAuth.A07(r0)
            return
        L_0x0654:
            java.lang.Object r4 = r1.A00
            com.whatsapp.registration.VerifyTwoFactorAuth r4 = (com.whatsapp.registration.VerifyTwoFactorAuth) r4
            int r1 = X.C36441kJ.A08(r4)
            r0 = 18
            if (r1 != r0) goto L_0x0675
            java.lang.String r0 = "VerifyTwoFactorAuth/onClickForgotPinDialogPositiveButton/Send code"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0v0 r3 = r4.A09
            X.0wG r2 = r4.A0F
            X.0zN r1 = r4.A0I
            r0 = 3902(0xf3e, float:5.468E-42)
            boolean r0 = r1.A0E(r0)
            X.AnonymousClass97V.A00(r2, r3, r4, r0)
            return
        L_0x0675:
            java.lang.String r0 = "VerifyTwoFactorAuth/onClickForgotPinDialogPositiveButton/Send email"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2 = 1
            r1 = 0
            r0 = 0
            com.whatsapp.registration.VerifyTwoFactorAuth.A0G(r4, r1, r2, r0)
            return
        L_0x0681:
            java.lang.Object r4 = r1.A00
            com.whatsapp.registration.VerifyTwoFactorAuth r4 = (com.whatsapp.registration.VerifyTwoFactorAuth) r4
            int r3 = com.whatsapp.registration.VerifyTwoFactorAuth.A01(r4)
            com.whatsapp.registration.VerifyTwoFactorAuth$resetAccountDialog r2 = new com.whatsapp.registration.VerifyTwoFactorAuth$resetAccountDialog
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            java.lang.String r0 = "wipeStatus"
            r1.putInt(r0, r3)
            X.C36381kD.A17(r1, r2, r4)
            return
        L_0x069b:
            java.lang.Object r3 = r1.A00
            com.whatsapp.registration.accountdefence.ui.OldDeviceMoveAccountNoticeActivity r3 = (com.whatsapp.registration.accountdefence.ui.OldDeviceMoveAccountNoticeActivity) r3
            X.1ei r0 = r3.A02
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0Q
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x06df
            java.lang.String r0 = "OldDeviceMoveAccountNoticeActivity/onMoveButtonClick/backup in-progress"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "OldDeviceMoveAccountNoticeActivity/showBackupRunningWarningDialog"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1qm r2 = X.AnonymousClass3LW.A00(r3)
            r0 = 2131886253(0x7f1200ad, float:1.940708E38)
            r2.A0d(r0)
            r0 = 2131886252(0x7f1200ac, float:1.9407078E38)
            r2.A0c(r0)
            r1 = 2131886250(0x7f1200aa, float:1.9407074E38)
            r0 = 46
            X.C39001qm.A0D(r2, r3, r0, r1)
            r1 = 2131886251(0x7f1200ab, float:1.9407076E38)
            r0 = 47
            X.C39001qm.A0C(r2, r3, r0, r1)
            r1 = 2131886249(0x7f1200a9, float:1.9407072E38)
            X.3W1 r0 = X.AnonymousClass3W1.A00
            r2.A0g(r0, r1)
            r2.A0b()
            return
        L_0x06df:
            java.lang.String r0 = "OldDeviceMoveAccountNoticeActivity/launchConfirmationDialog"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.32k r0 = new X.32k
            r0.<init>(r3)
            com.whatsapp.registration.accountdefence.ui.OldDeviceMoveAccountConfirmationDialogFragment r2 = new com.whatsapp.registration.accountdefence.ui.OldDeviceMoveAccountConfirmationDialogFragment
            r2.<init>(r0)
            X.01z r1 = r3.getSupportFragmentManager()
            java.lang.String r0 = "OldDeviceMoveAccountNoticeActivity"
            r2.A1f(r1, r0)
            return
        L_0x06f8:
            java.lang.Object r4 = r1.A00
            android.app.Activity r4 = (android.app.Activity) r4
            android.content.Context r0 = r7.getContext()
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.twofactor.SettingsTwoFactorAuthActivity"
            r2.setClassName(r1, r0)
        L_0x070d:
            r4.startActivity(r2)
        L_0x0710:
            r4.finish()
            return
        L_0x0714:
            java.lang.String r0 = "waContext"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)     // Catch:{ Exception -> 0x071b }
            throw r0     // Catch:{ Exception -> 0x071b }
        L_0x071b:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VerifyCaptcha/setupCaptchaAudioPlayback/mediaPlayer ex: "
            X.C36321k7.A1J(r2, r0, r1)
            com.whatsapp.WaImageButton r0 = r9.A0C
            if (r0 != 0) goto L_0x0742
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x072e:
            return
        L_0x072f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VerifyCaptcha/setupCaptchaAudioPlayback/mediaPlayer.start ex: "
            X.C36321k7.A1J(r2, r0, r1)
            com.whatsapp.WaImageButton r0 = r9.A0C
            if (r0 != 0) goto L_0x0742
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x0742:
            r0.setEnabled(r3)
            return
        L_0x0746:
            r0.setImageBitmap(r2)
            java.lang.String r3 = r4.A0U
            if (r3 != 0) goto L_0x0754
            java.lang.String r0 = "countryCode"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0754:
            java.lang.String r2 = r4.A0V
            if (r2 != 0) goto L_0x075f
            java.lang.String r0 = "phoneNumber"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x075f:
            X.0zN r1 = r4.A0J
            if (r1 == 0) goto L_0x0770
            X.0v0 r0 = r4.A09
            X.2d2 r0 = X.C65983Uf.A08(r0, r1)
            com.whatsapp.registration.VerifyCaptcha.A0H(r4, r0, r3, r2)
            com.whatsapp.registration.VerifyCaptcha.A0F(r4)
            return
        L_0x0770:
            java.lang.String r0 = "abPreChatdProps"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Y6.onClick(android.view.View):void");
    }
}
