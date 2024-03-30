package X;

import android.view.View;

/* renamed from: X.3Y3  reason: invalid class name */
public class AnonymousClass3Y3 implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public AnonymousClass3Y3(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new AnonymousClass3Y3(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02f5, code lost:
        X.C36331k8.A12(r2.A02(), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02fc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x04ea, code lost:
        r2.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x04ed, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0606, code lost:
        r2 = r0.A3i();
        r1 = "online";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0637, code lost:
        r2 = r0.A3i();
        r1 = "last";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x063d, code lost:
        r2.A04(r1, X.AnonymousClass3TL.A02(r1, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0644, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x06c3, code lost:
        r1.BoN();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x06c6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0731, code lost:
        X.C36331k8.A0t(r0, r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0734, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0885, code lost:
        if (r0 == false) goto L_0x0887;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r16) {
        /*
            r15 = this;
            int r0 = r15.A01
            switch(r0) {
                case 0: goto L_0x003e;
                case 1: goto L_0x05ef;
                case 2: goto L_0x0468;
                case 3: goto L_0x0380;
                case 4: goto L_0x038c;
                case 5: goto L_0x0394;
                case 6: goto L_0x00bf;
                case 7: goto L_0x0468;
                case 8: goto L_0x039c;
                case 9: goto L_0x03b7;
                case 10: goto L_0x0411;
                case 11: goto L_0x00ed;
                case 12: goto L_0x01a4;
                case 13: goto L_0x05ef;
                case 14: goto L_0x0431;
                case 15: goto L_0x000b;
                case 16: goto L_0x0448;
                case 17: goto L_0x000b;
                case 18: goto L_0x045e;
                case 19: goto L_0x01d1;
                case 20: goto L_0x0468;
                case 21: goto L_0x0470;
                case 22: goto L_0x01f3;
                case 23: goto L_0x0723;
                case 24: goto L_0x022b;
                case 25: goto L_0x0478;
                case 26: goto L_0x0490;
                case 27: goto L_0x0498;
                case 28: goto L_0x04a1;
                case 29: goto L_0x02c5;
                case 30: goto L_0x04dc;
                case 31: goto L_0x02fd;
                case 32: goto L_0x0319;
                case 33: goto L_0x04f5;
                case 34: goto L_0x0505;
                case 35: goto L_0x0542;
                case 36: goto L_0x033b;
                case 37: goto L_0x05cf;
                case 38: goto L_0x0645;
                case 39: goto L_0x05e4;
                case 40: goto L_0x05ef;
                case 41: goto L_0x0005;
                case 42: goto L_0x0005;
                case 43: goto L_0x0005;
                case 44: goto L_0x05f5;
                case 45: goto L_0x05fb;
                case 46: goto L_0x0601;
                case 47: goto L_0x060d;
                case 48: goto L_0x062c;
                case 49: goto L_0x0632;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r15.A00
            X.C36411kG.A1N(r0)
        L_0x000a:
            return
        L_0x000b:
            java.lang.Object r4 = r15.A00
            com.whatsapp.inappsupport.ui.ContactUsActivity r4 = (com.whatsapp.inappsupport.ui.ContactUsActivity) r4
            boolean r0 = X.C36431kI.A1R(r4)
            if (r0 != 0) goto L_0x0450
            r3 = 2131893412(0x7f121ca4, float:1.94216E38)
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()
            r0 = 2131888230(0x7f120866, float:1.941109E38)
            java.lang.String r1 = r4.getString(r0)
            r0 = 0
            r2[r0] = r1
            X.3P9 r2 = com.whatsapp.LegacyMessageDialogFragment.A03(r2, r3)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 2131891608(0x7f121598, float:1.941794E38)
            r2.A05 = r0
            r2.A0B = r1
            X.3Vc r1 = X.C66213Vc.A00
            r0 = 2131891806(0x7f12165e, float:1.9418342E38)
            r2.A03 = r0
            r2.A06 = r1
            goto L_0x02f5
        L_0x003e:
            r5 = 0
            r7 = r16
            X.AnonymousClass00C.A0D(r7, r5)
            java.lang.Object r4 = r15.A00
            com.whatsapp.group.view.custom.GroupDetailsCard r4 = (com.whatsapp.group.view.custom.GroupDetailsCard) r4
            com.whatsapp.group.GroupCallButtonController r3 = r4.A0G
            if (r3 == 0) goto L_0x000a
            X.2Sc r1 = r4.A0F
            if (r1 != 0) goto L_0x0057
            java.lang.String r0 = "wamGroupInfo"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0057:
            r11 = 1
            r2 = 4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            r1.A02 = r0
            java.lang.Integer r0 = r4.A0O
            if (r0 == 0) goto L_0x000a
            int r1 = r0.intValue()
            if (r1 == r2) goto L_0x009c
            r6 = 2
            r0 = 3
            if (r1 == r0) goto L_0x0075
            if (r1 == r11) goto L_0x0681
            if (r1 == r6) goto L_0x064d
            r0 = 5
            if (r1 == r0) goto L_0x064d
            return
        L_0x0075:
            X.5Nh r5 = r3.A06
            X.3KV r2 = r3.A02
            r3 = 11
            if (r5 == 0) goto L_0x008e
            X.1ND r2 = r4.getCallsManager()
            android.content.Context r1 = r4.getContext()
            int r0 = r5.A08
            if (r0 == r6) goto L_0x008a
            r11 = 0
        L_0x008a:
            r2.BNr(r1, r5, r3, r11)
            return
        L_0x008e:
            if (r2 == 0) goto L_0x000a
            X.1ND r1 = r4.getCallsManager()
            android.content.Context r0 = r4.getContext()
            r1.Bug(r0, r2, r3)
            return
        L_0x009c:
            android.content.Context r0 = r4.getContext()
            boolean r0 = r0 instanceof X.AnonymousClass01I
            if (r0 == 0) goto L_0x000a
            android.content.Context r1 = r4.getContext()
            java.lang.Class<X.01I> r0 = X.AnonymousClass01I.class
            android.app.Activity r5 = X.C24801Dv.A01(r1, r0)
            X.01I r5 = (X.AnonymousClass01I) r5
            X.16D r6 = r4.getContactManager()
            X.147 r7 = r4.A0J
            java.lang.String r0 = "gid"
            if (r7 != 0) goto L_0x0685
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00bf:
            java.lang.Object r4 = r15.A00
            com.whatsapp.identity.ScanQrCodeActivity r4 = (com.whatsapp.identity.ScanQrCodeActivity) r4
            com.whatsapp.qrcode.WaQrScannerView r0 = r4.A0B
            if (r0 != 0) goto L_0x00ce
            java.lang.String r0 = "qrScannerView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00ce:
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x000a
            X.1Q4 r0 = r4.A04
            if (r0 == 0) goto L_0x06e1
            X.0yE r0 = r0.A00
            java.lang.String r3 = "android.permission.CAMERA"
            int r0 = r0.A02(r3)
            if (r0 != 0) goto L_0x06c7
            com.whatsapp.qrcode.QrScannerOverlay r0 = r4.A0A
            if (r0 != 0) goto L_0x0698
            java.lang.String r0 = "qrScannerOverlay"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00ed:
            java.lang.Object r3 = r15.A00
            X.1qW r3 = (X.C38941qW) r3
            r2 = 0
            X.AnonymousClass00C.A0D(r3, r2)
            X.2Qi r1 = new X.2Qi
            r1.<init>()
            java.lang.Integer r0 = X.C36371kC.A0p()
            r1.A01 = r0
            X.0yW r0 = r3.getWamRuntime()
            r0.Blv(r1)
            com.whatsapp.inappsupport.ui.AddScreenshotImageView r1 = r3.getAddScreenshotImageView()
            android.graphics.Bitmap r0 = r1.A02
            if (r0 == 0) goto L_0x0115
            r0.recycle()
            r0 = 0
            r1.A02 = r0
        L_0x0115:
            com.whatsapp.inappsupport.ui.AddScreenshotImageView.A02(r1)
            r3.setRemoveButtonVisibility(r2)
            r3.setRetryLayoutVisibility(r2)
            X.4OB r0 = r3.A03
            if (r0 == 0) goto L_0x000a
            X.3n3 r0 = (X.C75333n3) r0
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r2 = r0.A01
            android.net.Uri[] r1 = r2.A0M
            int r6 = r0.A00
            r0 = 0
            r1[r6] = r0
            X.00T r5 = r2.A0Q
            java.lang.Object r1 = r5.getValue()
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r1 = (com.whatsapp.inappbugreporting.InAppBugReportingViewModel) r1
            if (r6 != 0) goto L_0x019b
            X.00s r0 = r1.A02
        L_0x0139:
            java.lang.Object r1 = r0.A04()
            X.2W8 r0 = X.AnonymousClass2W8.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            java.lang.Object r7 = r5.getValue()
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r7 = (com.whatsapp.inappbugreporting.InAppBugReportingViewModel) r7
            if (r0 == 0) goto L_0x0180
            X.3Ai r0 = r7.A0C
            java.util.HashMap r4 = r0.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            boolean r0 = r4.containsKey(r3)
            if (r0 == 0) goto L_0x0167
            java.lang.Object r1 = r4.get(r3)
            X.6vi r1 = (X.C146506vi) r1
            if (r1 == 0) goto L_0x0164
            r0 = 1
            r1.A04 = r0
        L_0x0164:
            r4.remove(r3)
        L_0x0167:
            X.2W6 r0 = X.AnonymousClass2W6.A00
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel.A01(r0, r7, r6)
        L_0x016c:
            java.lang.Object r0 = r5.getValue()
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r0 = (com.whatsapp.inappbugreporting.InAppBugReportingViewModel) r0
            X.00r r0 = r0.A07
            java.lang.Object r0 = r0.A04()
            boolean r0 = X.C36341k9.A1Z(r0)
            com.whatsapp.inappbugreporting.InAppBugReportingActivity.A0I(r2, r0)
            return
        L_0x0180:
            X.3Js[] r1 = r7.A05
            r0 = 0
            r1[r6] = r0
            if (r6 == 0) goto L_0x0198
            r0 = 1
            if (r6 == r0) goto L_0x0195
            r0 = 2
            if (r6 != r0) goto L_0x016c
            X.00s r1 = r7.A01
        L_0x018f:
            X.2W6 r0 = X.AnonymousClass2W6.A00
            r1.A0D(r0)
            goto L_0x016c
        L_0x0195:
            X.00s r1 = r7.A00
            goto L_0x018f
        L_0x0198:
            X.00s r1 = r7.A02
            goto L_0x018f
        L_0x019b:
            r0 = 1
            if (r6 != r0) goto L_0x01a1
            X.00s r0 = r1.A00
            goto L_0x0139
        L_0x01a1:
            X.00s r0 = r1.A01
            goto L_0x0139
        L_0x01a4:
            java.lang.Object r1 = r15.A00
            X.1qW r1 = (X.C38941qW) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.setRetryLayoutVisibility(r0)
            X.4OC r1 = r1.A04
            if (r1 == 0) goto L_0x000a
            X.3n4 r1 = (X.C75343n4) r1
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r3 = r1.A01
            android.net.Uri[] r0 = r3.A0M
            int r2 = r1.A00
            r1 = r0[r2]
            if (r1 == 0) goto L_0x01c6
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r0 = X.C36411kG.A0g(r3)
            r0.A0S(r1, r2)
        L_0x01c6:
            X.3Cf r2 = r3.A3i()
            r1 = 0
            r0 = 15
            r2.A00(r0, r1)
            return
        L_0x01d1:
            java.lang.Object r3 = r15.A00
            com.whatsapp.inappsupport.ui.ContextualHelpBkScreenFragment r3 = (com.whatsapp.inappsupport.ui.ContextualHelpBkScreenFragment) r3
            java.lang.String r1 = com.whatsapp.inappsupport.ui.ContextualHelpBkScreenFragment.A00(r3)
            if (r1 == 0) goto L_0x000a
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x000a
            X.1fs r0 = r3.A03
            if (r0 == 0) goto L_0x06ef
            java.lang.String r2 = r0.A00(r1)
            X.1e2 r1 = r3.A02
            if (r1 == 0) goto L_0x06e8
            android.content.Context r0 = r3.A0a()
            goto L_0x0731
        L_0x01f3:
            java.lang.Object r1 = r15.A00
            com.whatsapp.inappsupport.ui.SupportBkScreenFragment r1 = (com.whatsapp.inappsupport.ui.SupportBkScreenFragment) r1
            X.01I r3 = r1.A0h()
            if (r3 == 0) goto L_0x000a
            X.0wU r0 = r1.A0A
            if (r0 == 0) goto L_0x071e
            X.14u r3 = (X.C225314u) r3
            X.3DY r4 = r1.A03
            if (r4 == 0) goto L_0x0717
            X.0yb r6 = r1.A06
            if (r6 == 0) goto L_0x0712
            X.1CF r9 = r1.A08
            if (r9 == 0) goto L_0x070b
            X.0yE r7 = r1.A07
            if (r7 == 0) goto L_0x0704
            X.3UV r10 = r1.A09
            if (r10 == 0) goto L_0x06fd
            X.0wD r5 = r1.A05
            if (r5 == 0) goto L_0x06f6
            r12 = 0
            r13 = 1
            r2 = 0
            java.lang.String r11 = "csf/Bloks_fails_to_load"
            r14 = 1
            X.2kA r1 = new X.2kA
            r8 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.C36441kJ.A1E(r1, r0)
            return
        L_0x022b:
            java.lang.Object r6 = r15.A00
            com.whatsapp.inappsupport.ui.SupportNegativeFeedbackBottomSheet r6 = (com.whatsapp.inappsupport.ui.SupportNegativeFeedbackBottomSheet) r6
            X.0wD r0 = r6.A06
            if (r0 == 0) goto L_0x0771
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x024c
            java.lang.String r0 = "SupportNegativeFeedbackBottomSheet/sendNegativeFeedback/no-connectivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.01I r1 = r6.A0h()
            if (r1 == 0) goto L_0x000a
            X.3Rj r0 = r6.A07
            if (r0 == 0) goto L_0x073c
            X.C65263Rj.A00(r1)
            return
        L_0x024c:
            X.1ft r1 = r6.A08
            if (r1 == 0) goto L_0x076a
            r0 = 12
            r1.A01(r0)
            android.os.Bundle r1 = r6.A0A
            if (r1 == 0) goto L_0x000a
            java.lang.String r0 = "message_id"
            java.lang.String r7 = r1.getString(r0)
            if (r7 == 0) goto L_0x000a
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            r9 = 5
            X.011[] r8 = new X.AnonymousClass011[r9]
            android.widget.CheckBox r0 = r6.A02
            r5 = 1
            X.011 r1 = X.C36421kH.A0j(r0, r5)
            r0 = 0
            r8[r0] = r1
            android.widget.CheckBox r1 = r6.A01
            r2 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            X.C36341k9.A1J(r1, r0, r8, r5)
            android.widget.CheckBox r1 = r6.A04
            r3 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            X.C36341k9.A1J(r1, r0, r8, r2)
            android.widget.CheckBox r1 = r6.A00
            r2 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            X.C36341k9.A1J(r1, r0, r8, r3)
            android.widget.CheckBox r1 = r6.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            X.C36341k9.A1J(r1, r0, r8, r2)
            java.util.LinkedHashMap r0 = X.C000400e.A07(r8)
            java.util.Iterator r3 = X.AnonymousClass000.A0y(r0)
        L_0x02a1:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0743
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r3)
            java.lang.Object r2 = r0.getKey()
            android.widget.CompoundButton r2 = (android.widget.CompoundButton) r2
            java.lang.Object r0 = r0.getValue()
            int r1 = X.AnonymousClass000.A0I(r0)
            if (r2 == 0) goto L_0x02a1
            boolean r0 = r2.isChecked()
            if (r0 != r5) goto L_0x02a1
            X.AnonymousClass000.A1F(r4, r1)
            goto L_0x02a1
        L_0x02c5:
            java.lang.Object r1 = r15.A00
            com.whatsapp.inappsupport.ui.nux.SupportAiNuxBottomSheet r1 = (com.whatsapp.inappsupport.ui.nux.SupportAiNuxBottomSheet) r1
            X.0wD r0 = r1.A00
            if (r0 == 0) goto L_0x077f
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x0778
            java.lang.String r0 = "SupportAiNuxBottomSheet/continueButton/no-connectivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.01I r4 = r1.A0h()
            if (r4 == 0) goto L_0x000a
            r3 = 2131893412(0x7f121ca4, float:1.94216E38)
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()
            r0 = 2131888230(0x7f120866, float:1.941109E38)
            java.lang.String r1 = r4.getString(r0)
            r0 = 0
            java.lang.String r0 = X.C36391kE.A0v(r4, r1, r2, r0, r3)
            X.3P9 r2 = X.AnonymousClass3P9.A00(r0)
        L_0x02f5:
            com.whatsapp.LegacyMessageDialogFragment r0 = r2.A02()
            X.C36331k8.A12(r0, r4)
            return
        L_0x02fd:
            java.lang.Object r0 = r15.A00
            com.whatsapp.instrumentation.ui.ConfirmFragment r0 = (com.whatsapp.instrumentation.ui.ConfirmFragment) r0
            X.4OD r3 = r0.A02
            if (r3 == 0) goto L_0x000a
            com.whatsapp.instrumentation.ui.InstrumentationAuthActivity r3 = (com.whatsapp.instrumentation.ui.InstrumentationAuthActivity) r3
            java.lang.String r0 = r3.A0C
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r6 = r3.getCallingPackage()
            X.C18740tg.A06(r6)
            X.3Fg r7 = r3.A09
            monitor-enter(r7)
            goto L_0x0786
        L_0x0319:
            java.lang.Object r0 = r15.A00
            com.whatsapp.instrumentation.ui.PermissionsFragment r0 = (com.whatsapp.instrumentation.ui.PermissionsFragment) r0
            X.4OE r3 = r0.A03
            if (r3 == 0) goto L_0x000a
            com.whatsapp.instrumentation.ui.InstrumentationAuthActivity r3 = (com.whatsapp.instrumentation.ui.InstrumentationAuthActivity) r3
            X.0yf r1 = r3.A06
            X.0yi r0 = X.C21100yf.A0V
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x0899
            com.whatsapp.deviceauth.BiometricAuthPlugin r0 = r3.A03
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0899
            com.whatsapp.deviceauth.BiometricAuthPlugin r0 = r3.A03
            r0.A06()
            return
        L_0x033b:
            java.lang.Object r4 = r15.A00
            com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsActivity r4 = (com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsActivity) r4
            X.00T r3 = r4.A03
            java.lang.Object r0 = r3.getValue()
            com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsViewModel r0 = (com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsViewModel) r0
            X.00r r2 = r0.A02
            X.4KS r1 = new X.4KS
            r1.<init>(r4)
            r0 = 36
            X.C66023Uj.A01(r4, r2, r1, r0)
            r0 = 2131893767(0x7f121e07, float:1.942232E38)
            r4.Bu1(r0)
            java.lang.Object r5 = r3.getValue()
            com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsViewModel r5 = (com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsViewModel) r5
            X.00s r0 = r5.A03
            java.util.List r4 = X.C36401kF.A0w(r0)
            if (r4 == 0) goto L_0x000a
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            java.util.Iterator r1 = r4.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x08ad
            r1.next()
            java.lang.String r1 = "isChecked"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0380:
            java.lang.Object r2 = r15.A00
            X.14u r2 = (X.C225314u) r2
            X.17Y r1 = r2.A05
            r0 = 23
            X.C80253v6.A00(r1, r2, r0)
            return
        L_0x038c:
            java.lang.Object r0 = r15.A00
            com.whatsapp.identity.IdentityVerificationActivity r0 = (com.whatsapp.identity.IdentityVerificationActivity) r0
            com.whatsapp.identity.IdentityVerificationActivity.A0H(r0)
            return
        L_0x0394:
            java.lang.Object r0 = r15.A00
            com.whatsapp.identity.ScanQrCodeActivity r0 = (com.whatsapp.identity.ScanQrCodeActivity) r0
            com.whatsapp.identity.ScanQrCodeActivity.A01(r0)
            return
        L_0x039c:
            java.lang.Object r2 = r15.A00
            com.whatsapp.identity.ScanQrCodeActivity r2 = (com.whatsapp.identity.ScanQrCodeActivity) r2
            com.whatsapp.qrcode.WaQrScannerView r1 = r2.A0B
            java.lang.String r0 = "qrScannerView"
            if (r1 != 0) goto L_0x03ab
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x03ab:
            r1.BuR()
            com.whatsapp.qrcode.WaQrScannerView r1 = r2.A0B
            if (r1 != 0) goto L_0x06c3
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x03b7:
            java.lang.Object r2 = r15.A00
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r2 = (com.whatsapp.inappbugreporting.InAppBugReportingActivity) r2
            r8 = 0
            X.0yb r0 = r2.A08
            android.view.inputmethod.InputMethodManager r1 = r0.A0N()
            if (r1 == 0) goto L_0x03d7
            android.view.View r0 = r2.getCurrentFocus()
            if (r0 == 0) goto L_0x03d7
            android.view.View r0 = r2.getCurrentFocus()
            if (r0 == 0) goto L_0x03f5
            android.os.IBinder r0 = r0.getWindowToken()
        L_0x03d4:
            r1.hideSoftInputFromWindow(r0, r8)
        L_0x03d7:
            com.whatsapp.Me r0 = X.C36401kF.A0M(r2)
            if (r0 == 0) goto L_0x040d
            X.12U r0 = r2.A0A
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x040d
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r3 = X.C36411kG.A0g(r2)
            com.whatsapp.WaEditText r0 = r2.A09
            r4 = 0
            if (r0 != 0) goto L_0x03f7
            java.lang.String r0 = "titleEditText"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x03f5:
            r0 = 0
            goto L_0x03d4
        L_0x03f7:
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0401
            java.lang.String r4 = r0.toString()
        L_0x0401:
            java.lang.String r5 = com.whatsapp.inappbugreporting.InAppBugReportingActivity.A01(r2)
            android.net.Uri[] r7 = r2.A0M
            java.lang.String r6 = r2.A0L
            r3.A0T(r4, r5, r6, r7, r8)
            return
        L_0x040d:
            com.whatsapp.inappbugreporting.InAppBugReportingActivity.A0F(r2)
            return
        L_0x0411:
            java.lang.Object r4 = r15.A00
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r4 = (com.whatsapp.inappbugreporting.InAppBugReportingActivity) r4
            r3 = 0
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.inappbugreporting.BugReportingCategoriesActivity"
            r2.setClassName(r1, r0)
            r0 = 3
            r4.startActivityForResult(r2, r0)
            X.3Cf r1 = r4.A3i()
            r0 = 21
            r1.A00(r0, r3)
            return
        L_0x0431:
            java.lang.Object r0 = r15.A00
            com.whatsapp.inappsupport.ui.AboutAiSupportAssistantBottomSheet r0 = (com.whatsapp.inappsupport.ui.AboutAiSupportAssistantBottomSheet) r0
            X.1fs r2 = r0.A00
            if (r2 == 0) goto L_0x0441
            X.01I r1 = r0.A0i()
            java.lang.String r0 = "saga-help-article"
            goto L_0x04ea
        L_0x0441:
            java.lang.String r0 = "contextualHelpHandler"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0448:
            java.lang.Object r0 = r15.A00
            com.whatsapp.inappsupport.ui.ContactUsActivity r0 = (com.whatsapp.inappsupport.ui.ContactUsActivity) r0
            r0.onBackPressed()
            return
        L_0x0450:
            X.3SE r1 = r4.A0I
            boolean r0 = r1.A04()
            int r0 = X.C36371kC.A00(r0)
            r1.A02(r0)
            return
        L_0x045e:
            java.lang.Object r0 = r15.A00
            com.whatsapp.inappsupport.ui.ContactUsActivity r0 = (com.whatsapp.inappsupport.ui.ContactUsActivity) r0
            androidx.appcompat.widget.AppCompatCheckBox r0 = r0.A02
            X.C36421kH.A16(r0)
            return
        L_0x0468:
            java.lang.Object r0 = r15.A00
            X.14u r0 = (X.C225314u) r0
            r0.onBackPressed()
            return
        L_0x0470:
            java.lang.Object r0 = r15.A00
            android.app.Activity r0 = (android.app.Activity) r0
            X.C36331k8.A0m(r0)
            return
        L_0x0478:
            java.lang.Object r2 = r15.A00
            com.whatsapp.inappsupport.ui.SupportNegativeFeedbackBottomSheet r2 = (com.whatsapp.inappsupport.ui.SupportNegativeFeedbackBottomSheet) r2
            X.1ft r1 = r2.A08
            if (r1 == 0) goto L_0x0489
            r0 = 15
            r1.A01(r0)
            r2.A1b()
            return
        L_0x0489:
            java.lang.String r0 = "supportLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0490:
            java.lang.Object r0 = r15.A00
            com.whatsapp.inappsupport.ui.SupportTopicsActivity r0 = (com.whatsapp.inappsupport.ui.SupportTopicsActivity) r0
            r0.onBackPressed()
            return
        L_0x0498:
            java.lang.Object r1 = r15.A00
            com.whatsapp.inappsupport.ui.SupportTopicsActivity r1 = (com.whatsapp.inappsupport.ui.SupportTopicsActivity) r1
            r0 = 0
            r1.A3i(r0)
            return
        L_0x04a1:
            java.lang.Object r3 = r15.A00
            com.whatsapp.inappsupport.ui.SupportVideoActivity r3 = (com.whatsapp.inappsupport.ui.SupportVideoActivity) r3
            X.5NI r0 = r3.A09
            java.lang.String r2 = "videoPlayerControllerView"
            if (r0 != 0) goto L_0x04b0
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x04b0:
            boolean r1 = r0.A0A()
            X.5NI r0 = r3.A09
            if (r1 == 0) goto L_0x04c3
            if (r0 != 0) goto L_0x04bf
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x04bf:
            r0.A02()
            return
        L_0x04c3:
            if (r0 != 0) goto L_0x04ca
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x04ca:
            r0.A03()
            X.5NI r1 = r3.A09
            if (r1 != 0) goto L_0x04d6
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x04d6:
            r0 = 3000(0xbb8, float:4.204E-42)
            r1.A09(r0)
            return
        L_0x04dc:
            java.lang.Object r0 = r15.A00
            com.whatsapp.inappsupport.ui.nux.SupportAiNuxBottomSheet r0 = (com.whatsapp.inappsupport.ui.nux.SupportAiNuxBottomSheet) r0
            X.1fs r2 = r0.A01
            if (r2 == 0) goto L_0x04ee
            X.01I r1 = r0.A0i()
            java.lang.String r0 = "information-collection-when-contact-support"
        L_0x04ea:
            r2.A01(r1, r0)
            return
        L_0x04ee:
            java.lang.String r0 = "contextualHelpHandler"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x04f5:
            java.lang.Object r2 = r15.A00
            X.155 r2 = (X.AnonymousClass155) r2
            X.1Dv r1 = r2.A01
            java.lang.String r0 = "android.settings.INTERNAL_STORAGE_SETTINGS"
            android.content.Intent r0 = X.C36441kJ.A0I(r0)
            r1.A06(r2, r0)
            return
        L_0x0505:
            java.lang.Object r5 = r15.A00
            com.whatsapp.insufficientstoragespace.InsufficientStorageSpaceActivity r5 = (com.whatsapp.insufficientstoragespace.InsufficientStorageSpaceActivity) r5
            X.0v0 r1 = r5.A09
            java.lang.String r0 = "insufficient_storage_prompt_timestamp"
            r1.A1Z(r0)
            X.2Pb r4 = new X.2Pb
            r4.<init>()
            long r0 = r5.A00
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            r4.A02 = r3
            r1 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r4.A00 = r0
            java.lang.Integer r0 = X.C36361kB.A0j()
            r4.A01 = r0
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.Object[] r1 = X.C36431kI.A1Z(r3, r1)
            java.lang.String r0 = "insufficient-storage-activity/skipped space-required: %,d"
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0yW r0 = r5.A01
            r0.Blw(r4)
            r5.finish()
            return
        L_0x0542:
            java.lang.Object r3 = r15.A00
            com.whatsapp.interopui.compose.InteropComposeEnterInfoActivity r3 = (com.whatsapp.interopui.compose.InteropComposeEnterInfoActivity) r3
            X.00T r0 = r3.A0H
            java.lang.Object r7 = r0.getValue()
            com.whatsapp.interopui.compose.InteropComposeEnterInfoViewModel r7 = (com.whatsapp.interopui.compose.InteropComposeEnterInfoViewModel) r7
            X.3Xd r6 = r3.A09
            java.lang.String r0 = "integratorInfo"
            if (r6 != 0) goto L_0x0559
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0559:
            X.2p8 r0 = r6.A01
            int r1 = r0.ordinal()
            r0 = 0
            java.lang.String r2 = ""
            if (r1 == r0) goto L_0x05c5
            r0 = 1
            if (r1 == r0) goto L_0x057f
            r0 = 2
            if (r1 != r0) goto L_0x05c8
            com.whatsapp.WaEditText r0 = r3.A06
        L_0x056c:
            if (r0 == 0) goto L_0x057b
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x057b
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L_0x057b
            r2 = r0
        L_0x057b:
            r7.A0S(r6, r2)
            return
        L_0x057f:
            com.whatsapp.WaEditText r0 = r3.A05
            if (r0 == 0) goto L_0x058f
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x058f
            java.lang.String r1 = r0.toString()
            if (r1 != 0) goto L_0x0590
        L_0x058f:
            r1 = r2
        L_0x0590:
            com.whatsapp.WaEditText r0 = r3.A08
            if (r0 == 0) goto L_0x05a1
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x05a1
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L_0x05a1
            r2 = r0
        L_0x05a1:
            java.lang.String r5 = X.C36321k7.A0D(r1, r2)
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            r3 = 0
            int r2 = r5.length()
        L_0x05ae:
            if (r3 >= r2) goto L_0x05c0
            char r1 = r5.charAt(r3)
            boolean r0 = java.lang.Character.isDigit(r1)
            if (r0 == 0) goto L_0x05bd
            r4.append(r1)
        L_0x05bd:
            int r3 = r3 + 1
            goto L_0x05ae
        L_0x05c0:
            java.lang.String r2 = X.C36381kD.A0y(r4)
            goto L_0x057b
        L_0x05c5:
            com.whatsapp.WaEditText r0 = r3.A07
            goto L_0x056c
        L_0x05c8:
            java.lang.String r0 = "None of the available identifier types was present."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x05cf:
            java.lang.Object r0 = r15.A00
            X.02E r0 = (X.AnonymousClass02E) r0
            X.01I r0 = r0.A0i()
            X.01z r1 = r0.getSupportFragmentManager()
            com.whatsapp.interopui.optout.InteropOptOutDialogFragment r0 = new com.whatsapp.interopui.optout.InteropOptOutDialogFragment
            r0.<init>()
            X.C65443Sb.A01(r0, r1)
            return
        L_0x05e4:
            java.lang.Object r1 = r15.A00
            X.1vy r1 = (X.C40701vy) r1
            r0 = 1
            r1.A03 = r0
            r1.A06()
            return
        L_0x05ef:
            java.lang.Object r0 = r15.A00
            X.C36431kI.A1N(r0)
            return
        L_0x05f5:
            java.lang.Object r0 = r15.A00
            com.whatsapp.lastseen.PresencePrivacyActivity r0 = (com.whatsapp.lastseen.PresencePrivacyActivity) r0
            r3 = 0
            goto L_0x0606
        L_0x05fb:
            java.lang.Object r0 = r15.A00
            com.whatsapp.lastseen.PresencePrivacyActivity r0 = (com.whatsapp.lastseen.PresencePrivacyActivity) r0
            r3 = 1
            goto L_0x0637
        L_0x0601:
            java.lang.Object r0 = r15.A00
            com.whatsapp.lastseen.PresencePrivacyActivity r0 = (com.whatsapp.lastseen.PresencePrivacyActivity) r0
            r3 = 4
        L_0x0606:
            X.1Nv r2 = r0.A3i()
            java.lang.String r1 = "online"
            goto L_0x063d
        L_0x060d:
            java.lang.Object r2 = r15.A00
            com.whatsapp.lastseen.PresencePrivacyActivity r2 = (com.whatsapp.lastseen.PresencePrivacyActivity) r2
            X.190 r0 = r2.A01
            if (r0 == 0) goto L_0x0627
            android.content.Intent r1 = X.C36431kI.A0D()
            java.lang.String r0 = "com.whatsapp.lastseen.LastSeenBlockListPickerActivity"
            android.content.Intent r1 = r1.setClassName(r2, r0)
            X.AnonymousClass00C.A08(r1)
            r0 = 1
            r2.startActivityForResult(r1, r0)
            return
        L_0x0627:
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        L_0x062c:
            java.lang.Object r0 = r15.A00
            com.whatsapp.lastseen.PresencePrivacyActivity r0 = (com.whatsapp.lastseen.PresencePrivacyActivity) r0
            r3 = 0
            goto L_0x0637
        L_0x0632:
            java.lang.Object r0 = r15.A00
            com.whatsapp.lastseen.PresencePrivacyActivity r0 = (com.whatsapp.lastseen.PresencePrivacyActivity) r0
            r3 = 2
        L_0x0637:
            X.1Nv r2 = r0.A3i()
            java.lang.String r1 = "last"
        L_0x063d:
            java.lang.String r0 = X.AnonymousClass3TL.A02(r1, r3)
            r2.A04(r1, r0)
            return
        L_0x0645:
            java.lang.String r1 = "viewModel$delegate"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x064d:
            X.1ND r5 = r4.getCallsManager()
            X.141 r3 = r4.A0C
            if (r3 != 0) goto L_0x065c
            java.lang.String r0 = "groupChat"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x065c:
            X.17X r2 = r4.getGroupParticipantsManager()
            X.0wQ r1 = r4.getMeManager()
            X.16D r0 = r4.getContactManager()
            java.util.List r3 = X.AnonymousClass3UL.A04(r1, r0, r2, r3)
            android.content.Context r2 = r4.getContext()
            r1 = 10
            X.147 r0 = r4.A0J
            if (r0 != 0) goto L_0x067d
            java.lang.String r0 = "gid"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x067d:
            r5.BPb(r2, r0, r3, r1)
            return
        L_0x0681:
            com.whatsapp.group.view.custom.GroupDetailsCard.A02(r7, r4, r5)
            return
        L_0x0685:
            X.17X r1 = r4.getGroupParticipantsManager()
            X.0wQ r0 = r4.getMeManager()
            java.util.ArrayList r8 = X.AnonymousClass3UL.A03(r0, r1, r7)
            r9 = 0
            r10 = 24
            X.AnonymousClass3UD.A07(r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x0698:
            r1 = 0
            r0.setVisibility(r1)
            com.whatsapp.qrcode.WaQrScannerView r0 = r4.A0B
            java.lang.String r2 = "qrScannerView"
            if (r0 != 0) goto L_0x06a7
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x06a7:
            r0.setVisibility(r1)
            com.whatsapp.WaTextView r1 = r4.A02
            if (r1 != 0) goto L_0x06b5
            java.lang.String r0 = "errorIndicatorView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x06b5:
            r0 = 8
            r1.setVisibility(r0)
            com.whatsapp.qrcode.WaQrScannerView r1 = r4.A0B
            if (r1 != 0) goto L_0x06c3
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x06c3:
            r1.BoN()
            return
        L_0x06c7:
            r2 = 1
            X.3FM r1 = X.AnonymousClass3FM.A00(r4)
            r0 = 2131892787(0x7f121a33, float:1.9420332E38)
            r1.A02 = r0
            r0 = 2131892786(0x7f121a32, float:1.942033E38)
            r1.A03 = r0
            X.AnonymousClass3FM.A01(r1, r3)
            android.content.Intent r0 = r1.A02()
            r4.startActivityForResult(r0, r2)
            return
        L_0x06e1:
            java.lang.String r0 = "cameraPermissionsHelper"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x06e8:
            java.lang.String r0 = "linkLauncher"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x06ef:
            java.lang.String r0 = "contextualHelpHandler"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x06f6:
            java.lang.String r0 = "connectivityStateProvider"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x06fd:
            java.lang.String r0 = "registrationHttpManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0704:
            java.lang.String r0 = "waPermissionsHelper"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x070b:
            java.lang.String r0 = "supportGatingUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0712:
            java.lang.RuntimeException r0 = X.C36331k8.A0W()
            throw r0
        L_0x0717:
            java.lang.String r0 = "sendFeedback"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x071e:
            java.lang.RuntimeException r0 = X.C36321k7.A08()
            throw r0
        L_0x0723:
            java.lang.Object r0 = r15.A00
            com.whatsapp.inappsupport.ui.SupportBkScreenFragment r0 = (com.whatsapp.inappsupport.ui.SupportBkScreenFragment) r0
            X.1e2 r1 = r0.A02
            if (r1 == 0) goto L_0x0735
            android.content.Context r0 = r0.A0a()
            java.lang.String r2 = "https://faq.whatsapp.com/"
        L_0x0731:
            X.C36331k8.A0t(r0, r1, r2)
            return
        L_0x0735:
            java.lang.String r0 = "linkLauncher"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x073c:
            java.lang.String r0 = "supportMessageFeedbackUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0743:
            X.3IT r5 = new X.3IT
            r5.<init>(r7, r4)
            X.3Rj r4 = r6.A07
            if (r4 == 0) goto L_0x0763
            X.01I r0 = r6.A0h()
            X.14u r3 = X.C36401kF.A0L(r0)
            X.040 r2 = r4.A05
            r1 = 0
            com.whatsapp.inappsupport.SupportMessageFeedbackUtilsImpl$sendNegativeFeedback$1 r0 = new com.whatsapp.inappsupport.SupportMessageFeedbackUtilsImpl$sendNegativeFeedback$1
            r0.<init>(r3, r4, r5, r1)
            X.C36331k8.A1T(r0, r2)
            r6.A1b()
            return
        L_0x0763:
            java.lang.String r0 = "supportMessageFeedbackUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x076a:
            java.lang.String r0 = "supportLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0771:
            java.lang.String r0 = "connectivityStateProvider"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0778:
            r0 = 1
            r1.A03 = r0
            r1.A1b()
            return
        L_0x077f:
            java.lang.String r0 = "connectivityStateProvider"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0786:
            boolean r0 = r7.A01(r6, r0)     // Catch:{ all -> 0x0896 }
            if (r0 != 0) goto L_0x078e
            goto L_0x080e
        L_0x078e:
            X.1VE r12 = r7.A00     // Catch:{ all -> 0x0896 }
            java.lang.String r0 = "request/token"
            java.lang.String r4 = X.AnonymousClass1VE.A01(r6, r0)     // Catch:{ all -> 0x0896 }
            java.lang.String r0 = "request/token_ts"
            java.lang.String r1 = X.AnonymousClass1VE.A01(r6, r0)     // Catch:{ all -> 0x0896 }
            android.content.SharedPreferences r0 = X.AnonymousClass1VE.A00(r12)     // Catch:{ all -> 0x0896 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0896 }
            android.content.SharedPreferences$Editor r0 = r0.remove(r4)     // Catch:{ all -> 0x0896 }
            X.C36341k9.A0u(r0, r1)     // Catch:{ all -> 0x0896 }
            java.lang.String r0 = "auth/encryption_key"
            java.lang.String r1 = X.AnonymousClass1VE.A01(r6, r0)     // Catch:{ all -> 0x0896 }
            android.content.SharedPreferences r0 = X.AnonymousClass1VE.A00(r12)     // Catch:{ all -> 0x0896 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0896 }
            X.C36341k9.A0u(r0, r1)     // Catch:{ all -> 0x0896 }
            java.security.SecureRandom r4 = new java.security.SecureRandom     // Catch:{ all -> 0x0896 }
            r4.<init>()     // Catch:{ all -> 0x0896 }
            r0 = 16
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x0896 }
            r4.nextBytes(r1)     // Catch:{ all -> 0x0896 }
            r0 = 11
            java.lang.String r4 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ all -> 0x0896 }
            java.lang.String r0 = "auth/token"
            java.lang.String r11 = X.AnonymousClass1VE.A01(r6, r0)     // Catch:{ all -> 0x0896 }
            java.lang.String r0 = "auth/token_ts"
            java.lang.String r10 = X.AnonymousClass1VE.A01(r6, r0)     // Catch:{ all -> 0x0896 }
            java.lang.String r0 = "metadata/last_active_time"
            java.lang.String r9 = X.AnonymousClass1VE.A01(r6, r0)     // Catch:{ all -> 0x0896 }
            X.0wo r0 = r12.A01     // Catch:{ all -> 0x0896 }
            long r0 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x0896 }
            java.lang.String r5 = "metadata/last_call_ranking_time"
            java.lang.String r8 = X.AnonymousClass1VE.A01(r6, r5)     // Catch:{ all -> 0x0896 }
            java.lang.String r5 = "metadata/last_message_ranking_time"
            java.lang.String r6 = X.AnonymousClass1VE.A01(r6, r5)     // Catch:{ all -> 0x0896 }
            android.content.SharedPreferences r5 = X.AnonymousClass1VE.A00(r12)     // Catch:{ all -> 0x0896 }
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ all -> 0x0896 }
            android.content.SharedPreferences$Editor r5 = r5.putString(r11, r4)     // Catch:{ all -> 0x0896 }
            android.content.SharedPreferences$Editor r5 = r5.putLong(r10, r0)     // Catch:{ all -> 0x0896 }
            android.content.SharedPreferences$Editor r0 = r5.putLong(r9, r0)     // Catch:{ all -> 0x0896 }
            android.content.SharedPreferences$Editor r0 = r0.remove(r8)     // Catch:{ all -> 0x0896 }
            X.C36341k9.A0u(r0, r6)     // Catch:{ all -> 0x0896 }
            goto L_0x080f
        L_0x080e:
            r4 = 0
        L_0x080f:
            monitor-exit(r7)
            X.0wG r0 = r3.A02
            android.content.Context r0 = r0.A00
            android.content.Context r8 = r0.getApplicationContext()
            java.lang.Class<com.whatsapp.instrumentation.notification.DelayedNotificationReceiver> r9 = com.whatsapp.instrumentation.notification.DelayedNotificationReceiver.class
            android.content.Intent r1 = X.C36441kJ.A0H(r8, r9)
            r7 = 0
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            android.app.PendingIntent r0 = X.C65743Th.A01(r8, r7, r1, r0)
            if (r0 != 0) goto L_0x0859
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            double r0 = r0.nextDouble()
            r5 = 4712059816451768320(0x4164997000000000, double:1.08E7)
            double r0 = r0 * r5
            long r5 = (long) r0
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r5 = r5 + r0
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 + r5
            X.0yb r5 = r3.A08
            android.app.AlarmManager r5 = r5.A05()
            if (r5 == 0) goto L_0x0862
            android.content.Intent r6 = X.C36441kJ.A0H(r8, r9)
            r5 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r6 = X.C65743Th.A01(r8, r7, r6, r5)
            X.19h r5 = r3.A01
            X.19i r5 = r5.A00
            r5.A01(r6, r7, r0)
        L_0x0859:
            if (r4 != 0) goto L_0x0868
            r1 = 4
            java.lang.String r0 = "Request is not authorized!"
            com.whatsapp.instrumentation.ui.InstrumentationAuthActivity.A01(r3, r0, r1)
            return
        L_0x0862:
            java.lang.String r0 = "InstrumentationAuthActivity/scheduleDelayedNotification AlarmManager is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0859
        L_0x0868:
            X.142 r0 = X.C36431kI.A0V(r3)
            if (r0 == 0) goto L_0x0887
            X.11F r0 = X.C36351kA.A0j(r0)
            java.lang.String r1 = X.AnonymousClass3U8.A05(r0)
            X.005 r0 = X.AnonymousClass3S0.A03
            if (r1 == 0) goto L_0x0887
            java.lang.Object r0 = r0.get()
            java.util.regex.Pattern r0 = (java.util.regex.Pattern) r0
            boolean r0 = X.C36361kB.A1Z(r1, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0888
        L_0x0887:
            r1 = 0
        L_0x0888:
            java.lang.String r0 = "authorization_token"
            r2.putExtra(r0, r4)
            java.lang.String r0 = "is_test_user"
            r2.putExtra(r0, r1)
            X.C36331k8.A0o(r3, r2)
            return
        L_0x0896:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0899:
            X.09Y r2 = X.C36341k9.A0O(r3)
            r1 = 2131430411(0x7f0b0c0b, float:1.8482522E38)
            com.whatsapp.instrumentation.ui.ConfirmFragment r0 = r3.A05
            r2.A0B(r0, r1)
            r0 = 0
            r2.A0J(r0)
            r2.A01()
            return
        L_0x08ad:
            java.util.ArrayList r3 = X.C36321k7.A0J(r2)
            java.util.Iterator r1 = r2.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x08c6
            r1.next()
            java.lang.String r1 = "integratorInfo"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x08c6:
            X.040 r2 = X.C109325Xd.A00(r5)
            r1 = 0
            com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsViewModel$onAllowAppsButtonClicked$1$1 r0 = new com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsViewModel$onAllowAppsButtonClicked$1$1
            r0.<init>(r5, r3, r4, r1)
            X.C36331k8.A1T(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Y3.onClick(android.view.View):void");
    }
}
