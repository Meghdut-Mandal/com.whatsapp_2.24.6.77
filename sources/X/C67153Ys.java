package X;

import android.view.View;

/* renamed from: X.3Ys  reason: invalid class name and case insensitive filesystem */
public class C67153Ys implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public C67153Ys(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A02 = str;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002e, code lost:
        X.C18740tg.A0D(false, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x021b, code lost:
        r2.A00(r3, r4, java.lang.Integer.valueOf(r0), r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0222, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0032, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r11) {
        /*
            r10 = this;
            int r0 = r10.A03
            switch(r0) {
                case 0: goto L_0x0083;
                case 1: goto L_0x0091;
                case 2: goto L_0x00d6;
                case 3: goto L_0x0122;
                case 4: goto L_0x01b4;
                case 5: goto L_0x0046;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r10.A00
            X.3Rm r2 = (X.C65293Rm) r2
            java.lang.String r6 = "status_fragment"
            java.lang.Object r4 = r10.A01
            X.4Tp r4 = (X.C88674Tp) r4
            r0 = 2
            X.AnonymousClass00C.A0D(r4, r0)
            X.5Qg r1 = r2.A04
            java.lang.String r0 = "TAP_BANNER_SETUP_SHARE"
            r1.A04(r0)
            X.005 r1 = r2.A07
            java.lang.Object r0 = r1.get()
            X.1i4 r0 = (X.C35051i4) r0
            java.util.ArrayList r0 = r0.A00()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0033
            java.lang.String r1 = "CrosspostContextualUpsellViewController/contextualUpsellOnClickListener recent statuses empty"
        L_0x002e:
            r0 = 0
            X.C18740tg.A0D(r0, r1)
            return
        L_0x0033:
            java.lang.Object r0 = r1.get()
            X.1i4 r0 = (X.C35051i4) r0
            java.util.ArrayList r0 = r0.A00()
            boolean r0 = X.AnonymousClass6Y4.A08(r0)
            if (r0 != 0) goto L_0x0204
            java.lang.String r1 = "CrosspostContextualUpsellViewController/contextualUpsellOnClickListener some sent messages are not delivered"
            goto L_0x002e
        L_0x0046:
            java.lang.Object r2 = r10.A00
            X.3Ab r2 = (X.C60973Ab) r2
            java.lang.String r6 = "status_fragment"
            java.lang.Object r4 = r10.A01
            X.4Tp r4 = (X.C88674Tp) r4
            r0 = 2
            X.AnonymousClass00C.A0D(r4, r0)
            X.5Qf r1 = r2.A04
            java.lang.String r0 = "TAP_F_ICON"
            r1.A04(r0)
            X.005 r1 = r2.A07
            java.lang.Object r0 = r1.get()
            X.1i4 r0 = (X.C35051i4) r0
            java.util.ArrayList r0 = r0.A00()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0070
            java.lang.String r1 = "CrosspostContextualShareViewController/fbIconOnClickListener recent statuses empty"
            goto L_0x002e
        L_0x0070:
            java.lang.Object r0 = r1.get()
            X.1i4 r0 = (X.C35051i4) r0
            java.util.ArrayList r0 = r0.A00()
            boolean r0 = X.AnonymousClass6Y4.A08(r0)
            if (r0 != 0) goto L_0x01ec
            java.lang.String r1 = "CrosspostContextualShareViewController/fbIconOnClickListener some sent messages are not delivered"
            goto L_0x002e
        L_0x0083:
            java.lang.Object r2 = r10.A00
            com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity r2 = (com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity) r2
            java.lang.String r1 = r10.A02
            java.lang.Object r0 = r10.A01
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity.A0F(r0, r2, r1)
            return
        L_0x0091:
            java.lang.Object r6 = r10.A00
            com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity r6 = (com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity) r6
            java.lang.String r5 = r10.A02
            java.lang.Object r1 = r10.A01
            X.3SB r1 = (X.AnonymousClass3SB) r1
            com.whatsapp.jid.DeviceJid r0 = r6.A05
            if (r0 != 0) goto L_0x00a6
            java.lang.String r0 = "deviceJid"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00a6:
            java.lang.String r4 = X.AnonymousClass3SB.A00(r6, r1)
            X.AnonymousClass00C.A08(r4)
            com.whatsapp.companiondevice.SetDeviceNicknameFragment r3 = new com.whatsapp.companiondevice.SetDeviceNicknameFragment
            r3.<init>()
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "device_jid_raw_string"
            r2.putString(r0, r1)
            java.lang.String r0 = "existing_display_name"
            r2.putString(r0, r5)
            java.lang.String r0 = "device_string"
            r2.putString(r0, r4)
            r3.A17(r2)
            X.01z r1 = r6.getSupportFragmentManager()
            java.lang.String r0 = "LinkedDeviceEditDeviceActivity"
            r3.A1f(r1, r0)
            return
        L_0x00d6:
            java.lang.Object r3 = r10.A00
            com.whatsapp.payments.pix.ui.FoundPixQrCodeBottomSheet r3 = (com.whatsapp.payments.pix.ui.FoundPixQrCodeBottomSheet) r3
            java.lang.Object r2 = r10.A01
            X.9uH r2 = (X.C206939uH) r2
            java.lang.String r4 = r10.A02
            X.0yb r0 = r3.A00
            if (r0 == 0) goto L_0x011d
            android.content.ClipboardManager r1 = r0.A09()
            if (r1 == 0) goto L_0x00f3
            java.lang.String r0 = r2.A00
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r0, r0)
            r1.setPrimaryClip(r0)
        L_0x00f3:
            X.01I r2 = r3.A0h()
            r0 = 2131893083(0x7f121b5b, float:1.9420933E38)
            r1 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            X.B3f r3 = r3.A02
            if (r3 == 0) goto L_0x0116
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0 = 186(0xba, float:2.6E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "pix_qr_code_found_prompt"
            r3.BOm(r2, r1, r0, r4)
            return
        L_0x0116:
            java.lang.String r0 = "paymentUIEventLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x011d:
            java.lang.RuntimeException r0 = X.C36331k8.A0W()
            throw r0
        L_0x0122:
            java.lang.Object r7 = r10.A00
            com.whatsapp.payments.ui.BusinessHubActivity r7 = (com.whatsapp.payments.ui.BusinessHubActivity) r7
            java.lang.String r4 = r10.A02
            java.lang.Object r8 = r10.A01
            X.54i r8 = (X.C1031954i) r8
            r5 = 0
            r3 = 1
            X.00T r2 = r7.A0E
            java.lang.Object r1 = r2.getValue()
            com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel r1 = (com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel) r1
            r6 = 0
            r0 = 108(0x6c, float:1.51E-43)
            r1.A0S(r0)
            r1 = 2131893536(0x7f121d20, float:1.9421851E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r5 = X.C36351kA.A0x(r7, r4, r0, r5, r1)
            java.lang.String r1 = r8.A00()
            java.lang.String r0 = "EXTERNALLY_DISABLED"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x019d
            r0 = 2131893545(0x7f121d29, float:1.942187E38)
            java.lang.String r9 = r7.getString(r0)
        L_0x0158:
            X.AnonymousClass00C.A0B(r9)
            java.lang.Object r0 = r2.getValue()
            com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel r0 = (com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel) r0
            X.1EU r0 = r0.A01
            X.B66 r0 = r0.A05()
            int r4 = r0.BB6()
            r0 = 2131893503(0x7f121cff, float:1.9421784E38)
            java.lang.String r3 = r7.getString(r0)
            r0 = 21
            X.4Xp r2 = new X.4Xp
            r2.<init>(r8, r7, r0)
            r0 = 2131896389(0x7f122845, float:1.9427638E38)
            java.lang.String r1 = r7.getString(r0)
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r7, r4)
            r0.setMessage(r9)
            r0.setTitle(r5)
            if (r3 == 0) goto L_0x0190
            r0.setPositiveButton(r3, r2)
        L_0x0190:
            if (r1 == 0) goto L_0x0195
            r0.setNegativeButton(r1, r6)
        L_0x0195:
            android.app.AlertDialog r0 = r0.create()
            r0.show()
            return
        L_0x019d:
            java.lang.String r1 = r8.A00()
            java.lang.String r0 = "INITED"
            boolean r1 = X.AnonymousClass00C.A0J(r1, r0)
            r0 = 2131893535(0x7f121d1f, float:1.942185E38)
            if (r1 == 0) goto L_0x01af
            r0 = 2131893537(0x7f121d21, float:1.9421853E38)
        L_0x01af:
            java.lang.String r9 = X.C36351kA.A0w(r7, r4, r3, r0)
            goto L_0x0158
        L_0x01b4:
            java.lang.Object r5 = r10.A00
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r5 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r5
            java.lang.Object r0 = r10.A01
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            java.lang.String r4 = r10.A02
            X.1Xt r3 = r5.A0a
            if (r3 == 0) goto L_0x01e5
            X.3Qa r0 = r0.A1J
            java.lang.String r2 = r0.A01
            X.AnonymousClass00C.A07(r2)
            java.lang.Boolean r1 = X.C36371kC.A0m()
            java.util.Map r0 = r3.A0E
            r0.put(r2, r1)
            X.1e2 r1 = r5.A02
            if (r1 == 0) goto L_0x01de
            android.content.Context r0 = r5.A0a()
            X.C36331k8.A0t(r0, r1, r4)
            return
        L_0x01de:
            java.lang.String r0 = "linkLauncher"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01e5:
            java.lang.String r0 = "statusesStatsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01ec:
            X.005 r0 = r2.A05
            java.lang.Object r2 = r0.get()
            X.3Oy r2 = (X.C64663Oy) r2
            android.content.Context r3 = X.C36371kC.A0B(r11)
            java.lang.Object r0 = r1.get()
            X.1i4 r0 = (X.C35051i4) r0
            java.util.ArrayList r7 = r0.A00()
            r0 = 3
            goto L_0x021b
        L_0x0204:
            X.005 r0 = r2.A05
            java.lang.Object r2 = r0.get()
            X.3Oy r2 = (X.C64663Oy) r2
            android.content.Context r3 = X.C36371kC.A0B(r11)
            java.lang.Object r0 = r1.get()
            X.1i4 r0 = (X.C35051i4) r0
            java.util.ArrayList r7 = r0.A00()
            r0 = 4
        L_0x021b:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r2.A00(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67153Ys.onClick(android.view.View):void");
    }

    public C67153Ys(C60973Ab r2, C88674Tp r3) {
        this.A03 = 5;
        this.A00 = r2;
        this.A02 = "status_fragment";
        this.A01 = r3;
    }

    public C67153Ys(C65293Rm r2, C88674Tp r3) {
        this.A03 = 6;
        this.A00 = r2;
        this.A02 = "status_fragment";
        this.A01 = r3;
    }
}
