package X;

import android.view.View;

/* renamed from: X.3Xx  reason: invalid class name and case insensitive filesystem */
public class C66943Xx implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C66943Xx(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C66943Xx(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.27v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.whatsapp.contact.picker.PhoneContactsSelector} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v48, resolved type: X.27v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v49, resolved type: X.27v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: com.whatsapp.contact.picker.AudienceSelectionContactPickerFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: com.whatsapp.contact.picker.VoipContactPickerFragment} */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02ec, code lost:
        r2 = r0.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x04cf, code lost:
        r3.A0w.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04d4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04f8, code lost:
        r1.A01(r2, java.lang.Integer.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04ff, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0553, code lost:
        r0.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0556, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0132, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0135, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0163, code lost:
        r2.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0166, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02a6, code lost:
        r1.A0D(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02a9, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 0: goto L_0x0109;
                case 1: goto L_0x0111;
                case 2: goto L_0x0119;
                case 3: goto L_0x012a;
                case 4: goto L_0x0136;
                case 5: goto L_0x0159;
                case 6: goto L_0x0121;
                case 7: goto L_0x0167;
                case 8: goto L_0x0174;
                case 9: goto L_0x0150;
                case 10: goto L_0x0005;
                case 11: goto L_0x019b;
                case 12: goto L_0x01c1;
                case 13: goto L_0x01f3;
                case 14: goto L_0x021d;
                case 15: goto L_0x023a;
                case 16: goto L_0x0248;
                case 17: goto L_0x025d;
                case 18: goto L_0x0282;
                case 19: goto L_0x0282;
                case 20: goto L_0x0295;
                case 21: goto L_0x02ae;
                case 22: goto L_0x02cb;
                case 23: goto L_0x000b;
                case 24: goto L_0x0282;
                case 25: goto L_0x02d3;
                case 26: goto L_0x0301;
                case 27: goto L_0x0309;
                case 28: goto L_0x0320;
                case 29: goto L_0x0089;
                case 30: goto L_0x0368;
                case 31: goto L_0x0370;
                case 32: goto L_0x00ba;
                case 33: goto L_0x03a7;
                case 34: goto L_0x0282;
                case 35: goto L_0x0452;
                case 36: goto L_0x0471;
                case 37: goto L_0x048c;
                case 38: goto L_0x0496;
                case 39: goto L_0x00de;
                case 40: goto L_0x04ae;
                case 41: goto L_0x04c1;
                case 42: goto L_0x04d5;
                case 43: goto L_0x028a;
                case 44: goto L_0x04f0;
                case 45: goto L_0x04e7;
                case 46: goto L_0x0500;
                case 47: goto L_0x037c;
                case 48: goto L_0x003f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r8.A00
            X.C36411kG.A1N(r0)
        L_0x000a:
            return
        L_0x000b:
            java.lang.Object r5 = r8.A00
            com.whatsapp.components.GroupHistoryBottomSheet r5 = (com.whatsapp.components.GroupHistoryBottomSheet) r5
            android.content.Context r4 = r5.A1D()
            if (r4 == 0) goto L_0x000a
            X.0xT r0 = r5.A01
            if (r0 == 0) goto L_0x0516
            java.lang.String r1 = "330159992681779"
            android.net.Uri r3 = r0.A02(r1)
            X.AnonymousClass00C.A08(r3)
            X.0xT r0 = r5.A01
            if (r0 == 0) goto L_0x050f
            android.net.Uri r0 = r0.A02(r1)
            android.content.Intent r2 = X.C36391kE.A0G(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "intent: "
            X.C36321k7.A1K(r3, r0, r1)
            X.1Dv r0 = r5.A00
            if (r0 == 0) goto L_0x0508
            r0.A06(r4, r2)
            return
        L_0x003f:
            java.lang.Object r7 = r8.A00
            android.app.Activity r7 = (android.app.Activity) r7
            r0 = 2131891984(0x7f121710, float:1.9418703E38)
            java.lang.String r6 = X.C36361kB.A0m(r7, r0)
            r0 = 2131891978(0x7f12170a, float:1.9418691E38)
            java.lang.String r5 = X.C36361kB.A0m(r7, r0)
            r0 = 2131891977(0x7f121709, float:1.941869E38)
            java.lang.String r4 = X.C36361kB.A0m(r7, r0)
            r0 = 2131891983(0x7f12170f, float:1.9418701E38)
            java.lang.String r3 = X.C36361kB.A0m(r7, r0)
            r0 = 28
            X.4XM r2 = new X.4XM
            r2.<init>(r7, r0)
            r1 = 27
            X.4XM r0 = new X.4XM
            r0.<init>(r7, r1)
            X.1qm r1 = X.AnonymousClass3LW.A00(r7)
            r1.setTitle(r6)
            r1.A0Z(r5)
            r1.A0Q(r2, r4)
            r1.A0S(r0, r3)
            boolean r0 = r7.isFinishing()
            if (r0 != 0) goto L_0x000a
            X.0FM r0 = r1.create()
            goto L_0x0553
        L_0x0089:
            java.lang.Object r5 = r8.A00
            X.3B5 r5 = (X.AnonymousClass3B5) r5
            android.accounts.Account[] r0 = r5.A01
            if (r0 == 0) goto L_0x000a
            android.content.Context r4 = r5.A02
            r1 = 2132084053(0x7f150555, float:1.9808266E38)
            X.02b r0 = new X.02b
            r0.<init>((android.content.Context) r4, (int) r1)
            X.1qm r3 = X.AnonymousClass3LW.A00(r0)
            r0 = 2131888261(0x7f120885, float:1.9411152E38)
            java.lang.String r0 = r4.getString(r0)
            r3.setTitle(r0)
            android.accounts.Account[] r7 = r5.A01
            int r2 = r7.length
            java.lang.String[] r6 = new java.lang.String[r2]
            r1 = 0
        L_0x00af:
            if (r1 >= r2) goto L_0x051d
            r0 = r7[r1]
            java.lang.String r0 = r0.name
            r6[r1] = r0
            int r1 = r1 + 1
            goto L_0x00af
        L_0x00ba:
            java.lang.Object r3 = r8.A00
            com.whatsapp.contact.picker.AddGroupParticipantsSelector r3 = (com.whatsapp.contact.picker.AddGroupParticipantsSelector) r3
            X.00T r0 = r3.A0Q
            X.11F r2 = X.C36421kH.A0O(r0)
            if (r2 == 0) goto L_0x000a
            X.3HA r1 = r3.A0D
            if (r1 == 0) goto L_0x0557
            X.00T r0 = r3.A0T
            boolean r0 = X.C36331k8.A1b(r0)
            if (r0 != 0) goto L_0x00dc
            X.00T r0 = r3.A0V
            X.147 r0 = X.C36431kI.A0k(r0)
        L_0x00d8:
            r1.A00(r3, r2, r0)
            return
        L_0x00dc:
            r0 = 0
            goto L_0x00d8
        L_0x00de:
            java.lang.Object r3 = r8.A00
            com.whatsapp.contact.picker.ContactPickerFragment r3 = (com.whatsapp.contact.picker.ContactPickerFragment) r3
            X.1eN r0 = r3.A1m
            r2 = 3
            r0.A00(r2)
            X.01I r1 = r3.A0h()
            r0 = 0
            android.content.Intent r0 = X.AnonymousClass190.A1O(r1, r0, r2)
            r1.startActivity(r0)
            X.C68733cN.A01(r3)
            X.1eg r0 = r3.A18
            X.0yC r1 = r0.A01
            r0 = 5288(0x14a8, float:7.41E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x000a
            X.1eg r0 = r3.A18
            r0.A00()
            return
        L_0x0109:
            java.lang.Object r0 = r8.A00
            X.3K2 r0 = (X.AnonymousClass3K2) r0
            X.C39161rN.setupButtons$lambda$7(r0, r9)
            return
        L_0x0111:
            java.lang.Object r0 = r8.A00
            X.3K2 r0 = (X.AnonymousClass3K2) r0
            X.C39161rN.setupButtons$lambda$8(r0, r9)
            return
        L_0x0119:
            java.lang.Object r0 = r8.A00
            X.3K2 r0 = (X.AnonymousClass3K2) r0
            X.C39161rN.setupButtons$lambda$9(r0, r9)
            return
        L_0x0121:
            java.lang.Object r1 = r8.A00
            X.3I0 r1 = (X.AnonymousClass3I0) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.00S r0 = r1.A01
            goto L_0x0132
        L_0x012a:
            java.lang.Object r1 = r8.A00
            X.3I1 r1 = (X.AnonymousClass3I1) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.00S r0 = r1.A00
        L_0x0132:
            r0.invoke()
            return
        L_0x0136:
            java.lang.Object r3 = r8.A00
            X.1yj r3 = (X.C42381yj) r3
            android.view.View r0 = r3.A00
            android.content.Context r1 = r0.getContext()
            java.lang.Class<X.01I> r0 = X.AnonymousClass01I.class
            android.app.Activity r2 = X.C24801Dv.A01(r1, r0)
            X.01I r2 = (X.AnonymousClass01I) r2
            X.1fs r1 = r3.A03
            java.lang.String r0 = "community-examples-article"
            r1.A01(r2, r0)
            return
        L_0x0150:
            java.lang.Object r0 = r8.A00
            X.3JZ r0 = (X.AnonymousClass3JZ) r0
            X.02t r2 = r0.A03
            X.147 r0 = r0.A02
            goto L_0x0163
        L_0x0159:
            java.lang.Object r1 = r8.A00
            X.3K3 r1 = (X.AnonymousClass3K3) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.02t r2 = r1.A02
            com.whatsapp.jid.GroupJid r0 = r1.A01
        L_0x0163:
            r2.invoke(r0)
            return
        L_0x0167:
            java.lang.Object r0 = r8.A00
            X.1q4 r0 = (X.C38781q4) r0
            X.1uO r0 = r0.A0J
            X.1Rs r1 = r0.A01
            r0 = 1
            X.C36341k9.A17(r1, r0)
            return
        L_0x0174:
            java.lang.Object r4 = r8.A00
            X.1pi r4 = (X.C38751pi) r4
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            X.1Dv r3 = r4.getActivityUtils$app_product_community_community_non_modified()
            android.content.Context r2 = r4.getContext()
            android.content.Context r1 = r4.getContext()
            X.147 r0 = r4.A02
            if (r0 != 0) goto L_0x0193
            java.lang.String r0 = "parentJid"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0193:
            android.content.Intent r0 = X.AnonymousClass190.A0s(r1, r0)
            r3.A06(r2, r0)
            return
        L_0x019b:
            java.lang.Object r1 = r8.A00
            com.whatsapp.companiondevice.CompanionHelloConfirmationActivity r1 = (com.whatsapp.companiondevice.CompanionHelloConfirmationActivity) r1
            X.0v5 r0 = r1.A00
            if (r0 == 0) goto L_0x01ba
            X.1LU r0 = r1.A02
            if (r0 == 0) goto L_0x01b3
            r0 = 5
            android.content.Intent r0 = X.AnonymousClass3LZ.A01(r1, r0)
            r1.startActivity(r0)
            r1.finish()
            return
        L_0x01b3:
            java.lang.String r0 = "smbMDExtensionUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01ba:
            java.lang.String r0 = "smbActivities"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01c1:
            java.lang.Object r4 = r8.A00
            com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity r4 = (com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity) r4
            com.whatsapp.jid.DeviceJid r0 = r4.A05
            if (r0 != 0) goto L_0x01d0
            java.lang.String r0 = "deviceJid"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01d0:
            X.1qm r3 = X.AnonymousClass3LW.A00(r4)
            r0 = 2131890735(0x7f12122f, float:1.941617E38)
            r3.A0c(r0)
            r2 = 2131890851(0x7f1212a3, float:1.9416405E38)
            r1 = 11
            X.2rZ r0 = new X.2rZ
            r0.<init>(r4, r1)
            r3.A0m(r4, r0, r2)
            r1 = 2131896389(0x7f122845, float:1.9427638E38)
            X.3ax r0 = X.C67863ax.A00
            r3.A0l(r4, r0, r1)
            r3.A0b()
            return
        L_0x01f3:
            java.lang.Object r1 = r8.A00
            X.30v r1 = (X.C587330v) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.2nQ r5 = X.C51192nQ.QR_CODE
            com.whatsapp.companiondevice.LinkedDevicesActivity r1 = r1.A00
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r4 = r1.A08
            X.3H6 r0 = r1.A09
            com.whatsapp.deviceauth.BiometricAuthPlugin r0 = r0.A04
            boolean r3 = r0.A05()
            com.whatsapp.companiondevice.LinkedDevicesViewModel r0 = r1.A0A
            int r2 = r0.A0S()
            com.whatsapp.companiondevice.LinkedDevicesViewModel r0 = r1.A0A
            X.19l r0 = r0.A04
            X.0yf r1 = r0.A00
            X.0yh r0 = X.C21100yf.A1N
            int r0 = r1.A04(r0)
            r4.A0T(r5, r2, r0, r3)
            return
        L_0x021d:
            java.lang.Object r2 = r8.A00
            X.1wd r2 = (X.C41111wd) r2
            r0 = 1
            r2.A04 = r0
            X.19n r0 = r2.A05
            android.content.SharedPreferences r0 = X.C237119n.A00(r0)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "syncd_last_fatal_error_time"
            X.C36341k9.A0u(r1, r0)
            X.C41111wd.A00(r2)
            r2.A06()
            return
        L_0x023a:
            java.lang.Object r1 = r8.A00
            X.1wd r1 = (X.C41111wd) r1
            r0 = 1
            r1.A04 = r0
            X.C41111wd.A00(r1)
            r1.A06()
            return
        L_0x0248:
            java.lang.Object r2 = r8.A00
            com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment r2 = (com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment) r2
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r1 = r2.A04
            X.3SB r0 = r2.A07
            com.whatsapp.jid.DeviceJid r0 = r0.A07
            java.lang.String r0 = r0.getRawString()
            r1.A0U(r0)
            r2.A1b()
            return
        L_0x025d:
            java.lang.Object r4 = r8.A00
            com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment r4 = (com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment) r4
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r3 = r4.A04
            X.38U r0 = r4.A0A
            java.lang.String r2 = r0.A03
            X.0v5 r1 = r3.A06
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x0278
            java.lang.Object r0 = r1.A02()
            X.1ex r0 = (X.C33241ex) r0
            r0.A00(r2)
        L_0x0278:
            X.1Rs r1 = r3.A0T
            r0 = 0
            r1.A0D(r0)
            r4.A1b()
            return
        L_0x0282:
            java.lang.Object r0 = r8.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1b()
            return
        L_0x028a:
            java.lang.Object r0 = r8.A00
            X.3FP r0 = (X.AnonymousClass3FP) r0
            X.1hi r1 = r0.A0E
            java.lang.Boolean r0 = X.C36381kD.A0j()
            goto L_0x02a6
        L_0x0295:
            java.lang.Object r0 = r8.A00
            com.whatsapp.companiondevice.optin.ui.ForcedOptInActivity r0 = (com.whatsapp.companiondevice.optin.ui.ForcedOptInActivity) r0
            X.1tz r1 = r0.A05
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x02aa
            X.1Rs r1 = r1.A04
            X.2rf r0 = new X.2rf
            r0.<init>()
        L_0x02a6:
            r1.A0D(r0)
            return
        L_0x02aa:
            X.C39861tz.A01(r1)
            return
        L_0x02ae:
            java.lang.Object r0 = r8.A00
            com.whatsapp.companionmode.registration.RegisterAsCompanionActivity r0 = (com.whatsapp.companionmode.registration.RegisterAsCompanionActivity) r0
            com.whatsapp.companionmode.registration.CompanionRegistrationViewModel r3 = r0.A07
            r2 = 0
            X.00s r1 = r3.A03
            X.2FU r0 = new X.2FU
            r0.<init>(r2)
            r1.A0C(r0)
            X.0wU r1 = r3.A07
            r0 = 17
            X.3v2 r0 = X.C80213v2.A00(r3, r0)
            r1.Bp1(r0)
            return
        L_0x02cb:
            java.lang.Object r0 = r8.A00
            android.view.View r0 = (android.view.View) r0
            r0.performClick()
            return
        L_0x02d3:
            java.lang.Object r0 = r8.A00
            X.3Qm r0 = (X.C65043Qm) r0
            X.4Pd r4 = r0.A09
            android.widget.EditText r0 = r0.A01
            if (r0 != 0) goto L_0x02e4
            java.lang.String r0 = "countryCodeField"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02e4:
            android.text.Editable r0 = r0.getText()
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x02fd
            java.lang.String r2 = r0.toString()
            r1 = 0
            r0 = 32
            int r0 = X.AnonymousClass099.A09(r2, r0, r1, r1)
            if (r0 <= 0) goto L_0x02fd
            java.lang.String r3 = X.C36431kI.A16(r1, r0, r2)
        L_0x02fd:
            r4.BUo(r3)
            return
        L_0x0301:
            java.lang.Object r0 = r8.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1c()
            return
        L_0x0309:
            java.lang.Object r0 = r8.A00
            X.3eu r0 = (X.C70283eu) r0
            X.3Gn r1 = r0.A07
            java.lang.String r4 = r0.A02
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            X.3Rv r3 = r1.A04
            android.content.Context r2 = r1.A02
            java.lang.String r1 = "sms:"
            r0 = 0
            r3.A02(r2, r0, r4, r1)
            return
        L_0x0320:
            java.lang.Object r4 = r8.A00
            X.39r r4 = (X.C608739r) r4
            r3 = 0
            X.AnonymousClass00C.A0D(r4, r3)
            X.4Pe r0 = r4.A02
            r0.BQo()
            java.lang.String r0 = "android.intent.action.INSERT"
            android.content.Intent r2 = X.C36441kJ.A0I(r0)
            java.lang.String r0 = "vnd.android.cursor.dir/contact"
            r2.setType(r0)
            X.3QT r0 = r4.A03
            java.lang.String r1 = r0.A02()
            java.lang.String r0 = "name"
            r2.putExtra(r0, r1)
            X.2Fm r0 = r4.A04
            java.lang.String r1 = r0.A03()
            java.lang.String r0 = "phone"
            r2.putExtra(r0, r1)
            android.app.Activity r1 = r4.A00     // Catch:{ ActivityNotFoundException -> 0x0355 }
            r0 = 1
            r1.startActivityForResult(r2, r0)     // Catch:{ ActivityNotFoundException -> 0x0355 }
            return
        L_0x0355:
            r2 = move-exception
            X.17Y r1 = r4.A01
            r0 = 2131895199(0x7f12239f, float:1.9425224E38)
            r1.A06(r0, r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "showNativeContactForm: Failed to start activity for result, message: "
            X.C36321k7.A1W(r0, r1, r2)
            return
        L_0x0368:
            java.lang.Object r0 = r8.A00
            X.3Kb r0 = (X.C63443Kb) r0
            r0.A01()
            return
        L_0x0370:
            java.lang.Object r1 = r8.A00
            X.3F1 r1 = (X.AnonymousClass3F1) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.A00()
            return
        L_0x037c:
            java.lang.Object r3 = r8.A00
            com.whatsapp.contact.picker.VoipContactPickerFragment r3 = (com.whatsapp.contact.picker.VoipContactPickerFragment) r3
            java.util.Map r0 = r3.A3o
            java.util.Set r0 = r0.keySet()
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            android.content.Intent r1 = X.C36431kI.A0D()
            X.AnonymousClass143.A0C(r0, r2)
            java.lang.String r0 = "jids"
            r1.putStringArrayListExtra(r0, r2)
            X.3cN r0 = r3.A0w
            r0.A03(r1)
            X.6W1 r2 = r3.A26()
            X.0wk r1 = r2.A03
            r0 = 4
            X.C80223v3.A01(r1, r2, r0)
            goto L_0x04cf
        L_0x03a7:
            java.lang.Object r3 = r8.A00
            com.whatsapp.contact.picker.AudienceSelectionContactPickerFragment r3 = (com.whatsapp.contact.picker.AudienceSelectionContactPickerFragment) r3
            int r2 = r3.A00
            r1 = 1
            X.1w2 r0 = r3.A25()
            java.util.List r0 = r0.A00
            if (r2 != r1) goto L_0x03c5
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x03d6
            X.17Y r2 = r3.A0Q
            java.lang.String r1 = "You need to select at least one contact"
        L_0x03c0:
            r0 = 1
            r2.A0K(r1, r0)
            return
        L_0x03c5:
            int r1 = r0.size()
            java.util.List r0 = r3.A2l
            int r0 = r0.size()
            if (r1 != r0) goto L_0x0402
            X.17Y r2 = r3.A0Q
            java.lang.String r1 = "You cannot exclude all contacts"
            goto L_0x03c0
        L_0x03d6:
            X.1w2 r0 = r3.A25()
            java.util.List r0 = r0.A00
            r0.size()
            X.3XT r0 = r3.A1W
            java.util.List r0 = r0.A01
            r0.clear()
            X.1w2 r0 = r3.A25()
            java.util.List r0 = r0.A00
            java.util.ArrayList r2 = X.C36321k7.A0J(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x03f4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0432
            X.11F r0 = X.C36341k9.A0W(r1)
            r2.add(r0)
            goto L_0x03f4
        L_0x0402:
            X.3XT r0 = r3.A1W
            java.util.List r0 = r0.A02
            r0.clear()
            X.1w2 r0 = r3.A25()
            java.util.List r0 = r0.A00
            java.util.ArrayList r2 = X.C36321k7.A0J(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0417:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0425
            X.11F r0 = X.C36341k9.A0W(r1)
            r2.add(r0)
            goto L_0x0417
        L_0x0425:
            java.util.List r0 = X.C007103b.A0Y(r2)
            java.util.List r1 = X.C007103b.A0V(r0)
            X.3XT r0 = r3.A1W
            java.util.List r0 = r0.A02
            goto L_0x043e
        L_0x0432:
            java.util.List r0 = X.C007103b.A0Y(r2)
            java.util.List r1 = X.C007103b.A0V(r0)
            X.3XT r0 = r3.A1W
            java.util.List r0 = r0.A01
        L_0x043e:
            r0.addAll(r1)
            android.content.Intent r2 = X.C36431kI.A0D()
            X.3Pu r1 = r3.A24
            X.3XT r0 = r3.A1W
            r1.A02(r2, r0)
            X.3cN r0 = r3.A0w
            r0.A03(r2)
            goto L_0x04cf
        L_0x0452:
            java.lang.Object r2 = r8.A00
            com.whatsapp.contact.picker.ContactPicker r2 = (com.whatsapp.contact.picker.ContactPicker) r2
            r0 = 0
            com.whatsapp.RequestPermissionActivity.A0G(r2, r0)
            java.lang.Integer r0 = X.C36361kB.A0j()
            X.2OH r1 = new X.2OH
            r1.<init>()
            r1.A00 = r0
            java.lang.Integer r0 = X.C36361kB.A0i()
            r1.A01 = r0
            X.0yW r0 = r2.A08
            r0.Bly(r1)
            return
        L_0x0471:
            java.lang.Object r0 = r8.A00
            X.2Gc r0 = (X.AnonymousClass2Gc) r0
            com.whatsapp.contact.picker.ContactPickerFragment r3 = r0.A05
            android.content.Context r0 = r3.A1D()
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity"
            r2.setClassName(r1, r0)
            r3.A1C(r2)
            return
        L_0x048c:
            java.lang.Object r0 = r8.A00
            X.2Gc r0 = (X.AnonymousClass2Gc) r0
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r0.A05
            r0.A1j()
            return
        L_0x0496:
            java.lang.Object r0 = r8.A00
            com.whatsapp.contact.picker.ContactPickerFragment r0 = (com.whatsapp.contact.picker.ContactPickerFragment) r0
            X.1dt r3 = r0.A0V
            X.01I r2 = r0.A0h()
            boolean r1 = r0.A31
            r0 = 3
            if (r1 == 0) goto L_0x04a6
            r0 = 6
        L_0x04a6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A01(r2, r0)
            return
        L_0x04ae:
            java.lang.Object r2 = r8.A00
            X.02E r2 = (X.AnonymousClass02E) r2
            X.01I r1 = r2.A0h()
            r0 = 16
            android.content.Intent r1 = X.C36381kD.A0C(r1, r0)
            r0 = 2
            r2.startActivityForResult(r1, r0)
            return
        L_0x04c1:
            java.lang.Object r3 = r8.A00
            com.whatsapp.contact.picker.ContactPickerFragment r3 = (com.whatsapp.contact.picker.ContactPickerFragment) r3
            X.01I r2 = r3.A0i()
            X.0xE r1 = r3.A0e
            r0 = 1
            r1.BuY(r2, r0, r0)
        L_0x04cf:
            X.3cN r0 = r3.A0w
            r0.A02()
            return
        L_0x04d5:
            java.lang.Object r2 = r8.A00
            com.whatsapp.contact.picker.ContactPickerFragment r2 = (com.whatsapp.contact.picker.ContactPickerFragment) r2
            X.3F6 r1 = r2.A0x
            X.00s r0 = r2.A3i
            java.lang.Object r0 = r0.A04()
            java.lang.String r0 = (java.lang.String) r0
            r1.A00(r2, r0)
            return
        L_0x04e7:
            java.lang.Object r2 = r8.A00
            com.whatsapp.contact.picker.PhoneContactsSelector r2 = (com.whatsapp.contact.picker.PhoneContactsSelector) r2
            X.1dt r1 = r2.A07
            r0 = 10
            goto L_0x04f8
        L_0x04f0:
            java.lang.Object r2 = r8.A00
            X.27v r2 = (X.AnonymousClass27v) r2
            X.1dt r1 = r2.A04
            r0 = 9
        L_0x04f8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01(r2, r0)
            return
        L_0x0500:
            java.lang.Object r0 = r8.A00
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment r0 = (com.whatsapp.contact.picker.SharedTextPreviewDialogFragment) r0
            r0.A1l()
            return
        L_0x0508:
            java.lang.String r0 = "activityUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x050f:
            java.lang.String r0 = "faqLinkFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0516:
            java.lang.String r0 = "faqLinkFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x051d:
            java.util.List r1 = java.util.Arrays.asList(r6)
            android.accounts.Account r0 = r5.A00
            java.lang.String r0 = r0.name
            int r2 = r1.indexOf(r0)
            r1 = 15
            X.4XM r0 = new X.4XM
            r0.<init>(r5, r1)
            r3.A0U(r0, r6, r2)
            r0 = 2131893766(0x7f121e06, float:1.9422318E38)
            java.lang.String r2 = r4.getString(r0)
            r1 = 16
            X.4XM r0 = new X.4XM
            r0.<init>(r5, r1)
            r3.A0S(r0, r2)
            r0 = 2131896389(0x7f122845, float:1.9427638E38)
            java.lang.String r1 = r4.getString(r0)
            r0 = 0
            r3.A0Q(r0, r1)
            X.0FM r0 = r3.create()
        L_0x0553:
            r0.show()
            return
        L_0x0557:
            java.lang.String r0 = "groupInviteClickUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66943Xx.onClick(android.view.View):void");
    }
}
