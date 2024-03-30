package X;

import android.view.View;
import com.whatsapp.settings.SettingsPrivacy;

/* renamed from: X.3Y8  reason: invalid class name */
public class AnonymousClass3Y8 implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public AnonymousClass3Y8(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new AnonymousClass3Y8(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x04d8, code lost:
        r2.setClassName(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x04db, code lost:
        r4.startActivity(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x04de, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x04fc, code lost:
        X.C81163wZ.A00(r1, r2, r0);
        com.whatsapp.settings.SettingsPrivacyAdvancedActivity.A01(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0502, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0230, code lost:
        r0.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0233, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x026c, code lost:
        r5 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x02e0, code lost:
        r4 = X.C36441kJ.A0I("android.intent.action.RINGTONE_PICKER");
        r4.putExtra("android.intent.extra.ringtone.TITLE", r1);
        r4.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
        r4.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
        r4.putExtra("android.intent.extra.ringtone.DEFAULT_URI", android.provider.Settings.System.DEFAULT_NOTIFICATION_URI);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x02fd, code lost:
        if (r6 == null) goto L_0x0312;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0305, code lost:
        if (r6.equals("Silent") != false) goto L_0x0312;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        r7 = X.C36381kD.A0K(android.view.LayoutInflater.from(r4), com.whatsapp.R.layout.f9nameremoved);
        r5 = (com.whatsapp.WaEditText) X.C36361kB.A0G(r7, com.whatsapp.R.id.proxy_port);
        r5.setFilters(new X.C66793Xi[]{new X.C66793Xi(0, 65535)});
        r3 = (android.widget.CheckBox) X.C36361kB.A0G(r7, com.whatsapp.R.id.proxy_use_tls);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0307, code lost:
        r1 = android.net.Uri.parse(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x030b, code lost:
        if (r1 == null) goto L_0x0312;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x030d, code lost:
        r4.putExtra("android.intent.extra.ringtone.EXISTING_URI", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x031c, code lost:
        if (android.os.Build.MANUFACTURER.equalsIgnoreCase("Xiaomi") == false) goto L_0x032b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x031e, code lost:
        r4.putExtra("android.intent.extra.ringtone.TYPE", 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0322, code lost:
        r3.startActivityForResult(android.content.Intent.createChooser(r4, (java.lang.CharSequence) null), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x032a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x032b, code lost:
        r4.putExtra("android.intent.extra.ringtone.TYPE", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0054, code lost:
        if (r6 == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0337, code lost:
        r1 = com.whatsapp.R.string.f12nameremoved;
        r0 = com.whatsapp.R.array.f3nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x033d, code lost:
        r4.Btm(com.whatsapp.SingleSelectionDialogFragment.A06(r2, r1, r3, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0344, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0056, code lost:
        r3.setVisibility(8);
        r0 = ((com.whatsapp.settings.SettingsSetupUserProxyViewModel) r4.A05.getValue()).A0S().A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0413, code lost:
        r2.putExtra(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0069, code lost:
        r0 = java.lang.String.valueOf(r0);
        X.C36391kE.A1K(r5);
        r5.append(r0);
        r2 = X.AnonymousClass3LW.A00(r4);
        r2.A0d(r8);
        r2.A0j(r7);
        r2.A0m(r4, new X.C67823at(r3, r5, r4, r6), com.whatsapp.R.string.f12nameremoved);
        r2.A0l(r4, X.C68023bD.A00, com.whatsapp.R.string.f12nameremoved);
        r0 = X.C36371kC.A0O(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x047d, code lost:
        r0 = r1.setClassName(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0481, code lost:
        r4.startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0484, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0096, code lost:
        r3.setVisibility(0);
        r3.setText(com.whatsapp.R.string.f12nameremoved);
        r1 = r4.A05;
        r3.setChecked(((com.whatsapp.settings.SettingsSetupUserProxyViewModel) r1.getValue()).A0S().A06);
        r0 = ((com.whatsapp.settings.SettingsSetupUserProxyViewModel) r1.getValue()).A0S().A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            int r0 = r9.A01
            switch(r0) {
                case 0: goto L_0x00bd;
                case 1: goto L_0x0234;
                case 2: goto L_0x0243;
                case 3: goto L_0x025e;
                case 4: goto L_0x026e;
                case 5: goto L_0x0278;
                case 6: goto L_0x0288;
                case 7: goto L_0x02b0;
                case 8: goto L_0x02d1;
                case 9: goto L_0x032f;
                case 10: goto L_0x0345;
                case 11: goto L_0x00ea;
                case 12: goto L_0x0366;
                case 13: goto L_0x037f;
                case 14: goto L_0x03a1;
                case 15: goto L_0x03c0;
                case 16: goto L_0x03dd;
                case 17: goto L_0x03ef;
                case 18: goto L_0x0418;
                case 19: goto L_0x0430;
                case 20: goto L_0x044a;
                case 21: goto L_0x0138;
                case 22: goto L_0x0466;
                case 23: goto L_0x0485;
                case 24: goto L_0x049f;
                case 25: goto L_0x04bb;
                case 26: goto L_0x0171;
                case 27: goto L_0x04df;
                case 28: goto L_0x04ee;
                case 29: goto L_0x0503;
                case 30: goto L_0x050b;
                case 31: goto L_0x051b;
                case 32: goto L_0x0015;
                case 33: goto L_0x001e;
                case 34: goto L_0x01ac;
                case 35: goto L_0x0531;
                case 36: goto L_0x0555;
                case 37: goto L_0x05ac;
                case 38: goto L_0x05b8;
                case 39: goto L_0x05cb;
                case 40: goto L_0x05de;
                case 41: goto L_0x0617;
                case 42: goto L_0x062a;
                case 43: goto L_0x0691;
                case 44: goto L_0x062a;
                case 45: goto L_0x0632;
                case 46: goto L_0x0657;
                case 47: goto L_0x066e;
                case 48: goto L_0x0680;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r9.A00
            X.02E r1 = (X.AnonymousClass02E) r1
            android.content.Context r0 = r1.A1D()
            android.content.Intent r0 = X.AnonymousClass190.A0E(r0)
            r1.A1C(r0)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r4 = r9.A00
            com.whatsapp.settings.SettingsSetupUserProxyActivity r4 = (com.whatsapp.settings.SettingsSetupUserProxyActivity) r4
            r6 = 1
            r8 = 2131893283(0x7f121c23, float:1.9421338E38)
            goto L_0x0026
        L_0x001e:
            java.lang.Object r4 = r9.A00
            com.whatsapp.settings.SettingsSetupUserProxyActivity r4 = (com.whatsapp.settings.SettingsSetupUserProxyActivity) r4
            r6 = 0
            r8 = 2131893282(0x7f121c22, float:1.9421336E38)
        L_0x0026:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r4)
            r0 = 2131625971(0x7f0e07f3, float:1.8879165E38)
            android.view.View r7 = X.C36381kD.A0K(r1, r0)
            r0 = 2131433031(0x7f0b1647, float:1.8487836E38)
            android.view.View r5 = X.C36361kB.A0G(r7, r0)
            com.whatsapp.WaEditText r5 = (com.whatsapp.WaEditText) r5
            r0 = 1
            X.3Xi[] r3 = new X.C66793Xi[r0]
            r2 = 65535(0xffff, float:9.1834E-41)
            r1 = 0
            X.3Xi r0 = new X.3Xi
            r0.<init>(r1, r2)
            r3[r1] = r0
            r5.setFilters(r3)
            r0 = 2131433036(0x7f0b164c, float:1.8487846E38)
            android.view.View r3 = X.C36361kB.A0G(r7, r0)
            android.widget.CheckBox r3 = (android.widget.CheckBox) r3
            if (r6 == 0) goto L_0x0096
            r0 = 8
            r3.setVisibility(r0)
            X.00T r0 = r4.A05
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.settings.SettingsSetupUserProxyViewModel r0 = (com.whatsapp.settings.SettingsSetupUserProxyViewModel) r0
            X.3QR r0 = r0.A0S()
            int r0 = r0.A01
        L_0x0069:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.C36391kE.A1K(r5)
            r5.append(r0)
            X.1qm r2 = X.AnonymousClass3LW.A00(r4)
            r2.A0d(r8)
            r2.A0j(r7)
            r1 = 2131893766(0x7f121e06, float:1.9422318E38)
            X.3at r0 = new X.3at
            r0.<init>(r3, r5, r4, r6)
            r2.A0m(r4, r0, r1)
            r1 = 2131896389(0x7f122845, float:1.9427638E38)
            X.3bD r0 = X.C68023bD.A00
            r2.A0l(r4, r0, r1)
            X.0FM r0 = X.C36371kC.A0O(r2)
            goto L_0x0230
        L_0x0096:
            r3.setVisibility(r1)
            r0 = 2131893285(0x7f121c25, float:1.9421342E38)
            r3.setText(r0)
            X.00T r1 = r4.A05
            java.lang.Object r0 = r1.getValue()
            com.whatsapp.settings.SettingsSetupUserProxyViewModel r0 = (com.whatsapp.settings.SettingsSetupUserProxyViewModel) r0
            X.3QR r0 = r0.A0S()
            boolean r0 = r0.A06
            r3.setChecked(r0)
            java.lang.Object r0 = r1.getValue()
            com.whatsapp.settings.SettingsSetupUserProxyViewModel r0 = (com.whatsapp.settings.SettingsSetupUserProxyViewModel) r0
            X.3QR r0 = r0.A0S()
            int r0 = r0.A00
            goto L_0x0069
        L_0x00bd:
            java.lang.Object r2 = r9.A00
            com.whatsapp.settings.SettingsNotifications r2 = (com.whatsapp.settings.SettingsNotifications) r2
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0C
            r0.toggle()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0C
            boolean r0 = r0.isChecked()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r3 = r1.equals(r0)
            r2.A0L = r3
            X.1CR r2 = r2.A0F
            java.lang.String r0 = "group_chat_defaults"
            X.3LI r1 = X.AnonymousClass1CR.A02(r2, r0)
            boolean r0 = r1.A0H
            if (r3 == r0) goto L_0x0014
            r1.A0H = r3
            X.AnonymousClass1CR.A06(r1, r2)
            return
        L_0x00ea:
            java.lang.Object r4 = r9.A00
            com.whatsapp.settings.SettingsPasskeysEnabledFragment r4 = (com.whatsapp.settings.SettingsPasskeysEnabledFragment) r4
            X.01I r3 = r4.A0h()
            if (r3 != 0) goto L_0x00f9
            java.lang.String r0 = "SettingsPasskeys/no activity bound"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00f9:
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.DialogActivity"
            X.AnonymousClass00C.A0E(r3, r0)
            if (r3 == 0) goto L_0x0014
            X.00T r0 = r4.A01
            X.3Ec r2 = X.C36381kD.A0g(r0)
            r1 = 0
            r0 = 12
            r2.A00(r0, r1)
            X.1qm r3 = X.AnonymousClass3LW.A00(r3)
            r0 = 2131894231(0x7f121fd7, float:1.942326E38)
            r3.A0d(r0)
            r0 = 2131894230(0x7f121fd6, float:1.9423259E38)
            r3.A0c(r0)
            r2 = 2131896389(0x7f122845, float:1.9427638E38)
            r1 = 6
            X.3Ud r0 = new X.3Ud
            r0.<init>(r4, r1)
            r3.A0l(r4, r0, r2)
            r2 = 2131894229(0x7f121fd5, float:1.9423257E38)
            r1 = 5
            X.3Ud r0 = new X.3Ud
            r0.<init>(r4, r1)
            r3.A0m(r4, r0, r2)
            r3.A0b()
            return
        L_0x0138:
            java.lang.Object r5 = r9.A00
            com.whatsapp.settings.SettingsPrivacy r5 = (com.whatsapp.settings.SettingsPrivacy) r5
            java.lang.Integer r3 = X.C36371kC.A0p()
            int r2 = r5.A00
            java.lang.String r1 = r5.A13
            java.lang.String r0 = "wcs_read_receipts"
            A01(r5, r3, r1, r0, r2)
            androidx.appcompat.widget.SwitchCompat r0 = r5.A0S
            boolean r0 = r0.isChecked()
            r4 = r0 ^ 1
            java.lang.String r3 = "all"
            if (r4 != 0) goto L_0x0157
            java.lang.String r3 = "none"
        L_0x0157:
            java.lang.String r2 = "readreceipts"
            X.1YV r1 = r5.A0p
            r0 = 1
            X.AnonymousClass1YV.A02(r1, r0)
            X.1Nv r0 = r5.A0T
            boolean r0 = r0.A04(r2, r3)
            if (r0 == 0) goto L_0x0014
            if (r4 == 0) goto L_0x0014
            X.0wU r1 = r5.A04
            r0 = 33
            X.C81163wZ.A00(r1, r5, r0)
            return
        L_0x0171:
            java.lang.Object r4 = r9.A00
            com.whatsapp.settings.SettingsPrivacy r4 = (com.whatsapp.settings.SettingsPrivacy) r4
            r0 = 18
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            int r2 = r4.A00
            java.lang.String r1 = r4.A13
            java.lang.String r0 = "camera_effects"
            A01(r4, r3, r1, r0, r2)
            com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel r3 = r4.A0w
            androidx.appcompat.widget.SwitchCompat r0 = r4.A0R
            boolean r0 = r0.isChecked()
            r2 = r0 ^ 1
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x0014
            X.1hi r0 = r3.A06
            java.lang.Object r0 = r0.A04()
            boolean r0 = X.C36371kC.A1X(r0, r2)
            if (r0 == 0) goto L_0x069d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "SettingsPrivacyCameraEffectsViewModelonPreferenceClicked isSwitchChecked is already "
            java.lang.String r0 = X.C36371kC.A0z(r0, r1, r2)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x01ac:
            java.lang.Object r4 = r9.A00
            com.whatsapp.settings.SettingsUserProxyActivity r4 = (com.whatsapp.settings.SettingsUserProxyActivity) r4
            com.whatsapp.settings.SettingsUserProxyViewModel r0 = r4.A09
            boolean r1 = r0.A0W()
            com.whatsapp.settings.SettingsUserProxyViewModel r0 = r4.A09
            if (r1 == 0) goto L_0x01e6
            X.3QR r3 = r0.A0S()
            java.lang.Class<com.whatsapp.settings.SettingsSetupUserProxyActivity> r0 = com.whatsapp.settings.SettingsSetupUserProxyActivity.class
            android.content.Intent r2 = X.C36441kJ.A0H(r4, r0)
            java.lang.String r1 = r3.A03
            java.lang.String r0 = "intent_host_name"
            r2.putExtra(r0, r1)
            int r1 = r3.A00
            java.lang.String r0 = "intent_chat_port"
            r2.putExtra(r0, r1)
            int r1 = r3.A01
            java.lang.String r0 = "intent_media_port"
            r2.putExtra(r0, r1)
            boolean r1 = r3.A06
            java.lang.String r0 = "intent_use_tls"
            r2.putExtra(r0, r1)
            r0 = 10001(0x2711, float:1.4014E-41)
            r4.startActivityForResult(r2, r0)
            return
        L_0x01e6:
            X.1VS r0 = r0.A0E
            X.1BX r0 = r0.A00
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x0014
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r4)
            r0 = 2131625970(0x7f0e07f2, float:1.8879163E38)
            android.view.View r1 = X.C36381kD.A0K(r1, r0)
            r0 = 2131433030(0x7f0b1646, float:1.8487834E38)
            android.widget.TextView r3 = X.C36391kE.A0O(r1, r0)
            com.whatsapp.settings.SettingsUserProxyViewModel r0 = r4.A09
            X.00s r0 = r0.A05
            java.lang.Object r0 = r0.A04()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r3.setText(r0)
            X.1qm r2 = X.AnonymousClass3LW.A00(r4)
            r0 = 2131893278(0x7f121c1e, float:1.9421328E38)
            r2.A0d(r0)
            r2.A0j(r1)
            r1 = 2131893766(0x7f121e06, float:1.9422318E38)
            r0 = 23
            X.C39001qm.A0J(r2, r3, r4, r0, r1)
            r1 = 2131896389(0x7f122845, float:1.9427638E38)
            X.3W5 r0 = X.AnonymousClass3W5.A00
            r2.A0f(r0, r1)
            X.0FM r0 = r2.create()
        L_0x0230:
            r0.show()
            return
        L_0x0234:
            java.lang.Object r3 = r9.A00
            com.whatsapp.settings.SettingsNotifications r3 = (com.whatsapp.settings.SettingsNotifications) r3
            r0 = 2131896997(0x7f122aa5, float:1.9428871E38)
            java.lang.String r1 = r3.getString(r0)
            java.lang.String r6 = r3.A0I
            r2 = 2
            goto L_0x026c
        L_0x0243:
            java.lang.Object r2 = r9.A00
            com.whatsapp.settings.SettingsNotifications r2 = (com.whatsapp.settings.SettingsNotifications) r2
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0A
            r0.toggle()
            X.0v0 r1 = r2.A09
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0A
            boolean r2 = r0.isChecked()
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r1)
            java.lang.String r0 = "conversation_sound"
            X.C36331k8.A0w(r1, r0, r2)
            return
        L_0x025e:
            java.lang.Object r3 = r9.A00
            com.whatsapp.settings.SettingsNotifications r3 = (com.whatsapp.settings.SettingsNotifications) r3
            r0 = 2131896997(0x7f122aa5, float:1.9428871E38)
            java.lang.String r1 = r3.getString(r0)
            java.lang.String r6 = r3.A0J
            r2 = 1
        L_0x026c:
            r5 = 7
            goto L_0x02e0
        L_0x026e:
            java.lang.Object r4 = r9.A00
            com.whatsapp.settings.SettingsNotifications r4 = (com.whatsapp.settings.SettingsNotifications) r4
            int r3 = r4.A03
            r2 = 12
            goto L_0x0337
        L_0x0278:
            java.lang.Object r4 = r9.A00
            com.whatsapp.settings.SettingsNotifications r4 = (com.whatsapp.settings.SettingsNotifications) r4
            int r3 = r4.A02
            r2 = 13
            r1 = 2131896995(0x7f122aa3, float:1.9428867E38)
            r0 = 2130903067(0x7f03001b, float:1.7412942E38)
            goto L_0x033d
        L_0x0288:
            java.lang.Object r5 = r9.A00
            com.whatsapp.settings.SettingsNotifications r5 = (com.whatsapp.settings.SettingsNotifications) r5
            int r4 = r5.A01
            X.0ts r1 = r5.A00
            int[] r0 = com.whatsapp.settings.SettingsNotifications.A0r
            java.lang.String[] r3 = r1.A0Q(r0)
            com.whatsapp.SingleSelectionDialogFragment r2 = new com.whatsapp.SingleSelectionDialogFragment
            r2.<init>()
            r1 = 14
            r0 = 2131896993(0x7f122aa1, float:1.9428863E38)
            android.os.Bundle r1 = X.C36371kC.A0G(r1, r4, r0)
            java.lang.String r0 = "items"
            r1.putStringArray(r0, r3)
            r2.A17(r1)
            r5.Btm(r2)
            return
        L_0x02b0:
            java.lang.Object r2 = r9.A00
            com.whatsapp.settings.SettingsNotifications r2 = (com.whatsapp.settings.SettingsNotifications) r2
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0B
            r0.toggle()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            androidx.appcompat.widget.SwitchCompat r0 = r2.A0B
            boolean r0 = r0.isChecked()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r1.equals(r0)
            r2.A0K = r1
            X.1CR r0 = r2.A0F
            r0.A0f(r1)
            return
        L_0x02d1:
            java.lang.Object r3 = r9.A00
            com.whatsapp.settings.SettingsNotifications r3 = (com.whatsapp.settings.SettingsNotifications) r3
            r0 = 2131896973(0x7f122a8d, float:1.9428822E38)
            java.lang.String r1 = r3.getString(r0)
            java.lang.String r6 = r3.A0H
            r2 = 3
            r5 = 1
        L_0x02e0:
            java.lang.String r0 = "android.intent.action.RINGTONE_PICKER"
            android.content.Intent r4 = X.C36441kJ.A0I(r0)
            java.lang.String r0 = "android.intent.extra.ringtone.TITLE"
            r4.putExtra(r0, r1)
            java.lang.String r0 = "android.intent.extra.ringtone.SHOW_SILENT"
            r1 = 1
            r4.putExtra(r0, r1)
            java.lang.String r0 = "android.intent.extra.ringtone.SHOW_DEFAULT"
            r4.putExtra(r0, r1)
            android.net.Uri r1 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI
            java.lang.String r0 = "android.intent.extra.ringtone.DEFAULT_URI"
            r4.putExtra(r0, r1)
            if (r6 == 0) goto L_0x0312
            java.lang.String r0 = "Silent"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0312
            android.net.Uri r1 = android.net.Uri.parse(r6)
            if (r1 == 0) goto L_0x0312
            java.lang.String r0 = "android.intent.extra.ringtone.EXISTING_URI"
            r4.putExtra(r0, r1)
        L_0x0312:
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "Xiaomi"
            boolean r0 = r1.equalsIgnoreCase(r0)
            java.lang.String r1 = "android.intent.extra.ringtone.TYPE"
            if (r0 == 0) goto L_0x032b
            r0 = 2
            r4.putExtra(r1, r0)
        L_0x0322:
            r0 = 0
            android.content.Intent r0 = android.content.Intent.createChooser(r4, r0)
            r3.startActivityForResult(r0, r2)
            return
        L_0x032b:
            r4.putExtra(r1, r5)
            goto L_0x0322
        L_0x032f:
            java.lang.Object r4 = r9.A00
            com.whatsapp.settings.SettingsNotifications r4 = (com.whatsapp.settings.SettingsNotifications) r4
            int r3 = r4.A00
            r2 = 15
        L_0x0337:
            r1 = 2131897002(0x7f122aaa, float:1.9428881E38)
            r0 = 2130903073(0x7f030021, float:1.7412954E38)
        L_0x033d:
            com.whatsapp.SingleSelectionDialogFragment r0 = com.whatsapp.SingleSelectionDialogFragment.A06(r2, r1, r3, r0)
            r4.Btm(r0)
            return
        L_0x0345:
            java.lang.Object r3 = r9.A00
            com.whatsapp.settings.SettingsPasskeysDisabledFragment r3 = (com.whatsapp.settings.SettingsPasskeysDisabledFragment) r3
            X.03e r0 = r3.A02
            r1 = 1
            if (r0 == 0) goto L_0x0355
            boolean r0 = r0.BL7()
            if (r0 != r1) goto L_0x0355
            return
        L_0x0355:
            androidx.lifecycle.LifecycleCoroutineScopeImpl r2 = X.C33311f5.A00(r3)
            r1 = 0
            com.whatsapp.settings.SettingsPasskeysDisabledFragment$initCreateButton$1$1 r0 = new com.whatsapp.settings.SettingsPasskeysDisabledFragment$initCreateButton$1$1
            r0.<init>(r3, r1)
            X.0A6 r0 = X.C36391kE.A12(r0, r2)
            r3.A02 = r0
            return
        L_0x0366:
            java.lang.Object r4 = r9.A00
            com.whatsapp.settings.SettingsPrivacy r4 = (com.whatsapp.settings.SettingsPrivacy) r4
            java.lang.Integer r3 = X.C36381kD.A0m()
            int r2 = r4.A00
            java.lang.String r1 = r4.A13
            java.lang.String r0 = "wcs_last_seen"
            A01(r4, r3, r1, r0, r2)
            android.content.Intent r1 = X.C36431kI.A0D()
            java.lang.String r0 = "com.whatsapp.lastseen.PresencePrivacyActivity"
            goto L_0x047d
        L_0x037f:
            java.lang.Object r4 = r9.A00
            com.whatsapp.settings.SettingsPrivacy r4 = (com.whatsapp.settings.SettingsPrivacy) r4
            java.lang.Integer r3 = X.C36401kF.A0j()
            int r2 = r4.A00
            java.lang.String r1 = r4.A13
            java.lang.String r0 = "calling_privacy"
            A01(r4, r3, r1, r0, r2)
            r3 = 0
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsCallingPrivacyActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "target_setting"
            goto L_0x0413
        L_0x03a1:
            java.lang.Object r4 = r9.A00
            com.whatsapp.settings.SettingsPrivacy r4 = (com.whatsapp.settings.SettingsPrivacy) r4
            r0 = 19
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            int r2 = r4.A00
            java.lang.String r1 = r4.A13
            java.lang.String r0 = "advanced_privacy_relay_calls"
            A01(r4, r3, r1, r0, r2)
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsPrivacyAdvancedActivity"
            goto L_0x04d8
        L_0x03c0:
            java.lang.Object r4 = r9.A00
            com.whatsapp.settings.SettingsPrivacy r4 = (com.whatsapp.settings.SettingsPrivacy) r4
            java.lang.Integer r3 = X.C36371kC.A0n()
            int r2 = r4.A00
            java.lang.String r1 = r4.A13
            java.lang.String r0 = "privacy_groups"
            A01(r4, r3, r1, r0, r2)
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.GroupAddPrivacyActivity"
            goto L_0x04d8
        L_0x03dd:
            java.lang.Object r2 = r9.A00
            android.content.Context r2 = (android.content.Context) r2
            android.content.Intent r1 = X.C36431kI.A0D()
            java.lang.String r0 = "com.whatsapp.avatar.privacy.AvatarStickerPrivacySettings"
            android.content.Intent r0 = r1.setClassName(r2, r0)
            r2.startActivity(r0)
            return
        L_0x03ef:
            java.lang.Object r4 = r9.A00
            com.whatsapp.settings.SettingsPrivacy r4 = (com.whatsapp.settings.SettingsPrivacy) r4
            java.lang.Integer r3 = X.C36421kH.A0U()
            int r2 = r4.A00
            java.lang.String r1 = r4.A13
            java.lang.String r0 = "screen_lock"
            A01(r4, r3, r1, r0, r2)
            java.lang.String r3 = r4.A13
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.authentication.AppAuthSettingsActivity"
            r2.setClassName(r1, r0)
            if (r3 == 0) goto L_0x04db
            java.lang.String r0 = "search_result_key"
        L_0x0413:
            r2.putExtra(r0, r3)
            goto L_0x04db
        L_0x0418:
            java.lang.Object r4 = r9.A00
            com.whatsapp.settings.SettingsPrivacy r4 = (com.whatsapp.settings.SettingsPrivacy) r4
            java.lang.Integer r3 = X.C36361kB.A0i()
            int r2 = r4.A00
            java.lang.String r1 = r4.A13
            java.lang.String r0 = "wcs_profile_photo"
            A01(r4, r3, r1, r0, r2)
            android.content.Intent r1 = X.C36431kI.A0D()
            java.lang.String r0 = "com.whatsapp.profile.ProfilePhotoPrivacyActivity"
            goto L_0x047d
        L_0x0430:
            java.lang.Object r4 = r9.A00
            com.whatsapp.settings.SettingsPrivacy r4 = (com.whatsapp.settings.SettingsPrivacy) r4
            java.lang.Integer r3 = X.C36401kF.A0i()
            int r2 = r4.A00
            java.lang.String r1 = r4.A13
            java.lang.String r0 = "disappearing_messages_privacy"
            A01(r4, r3, r1, r0, r2)
            r1 = 1
            android.content.Intent r0 = X.C36431kI.A0D()
            X.AnonymousClass190.A1T(r4, r0, r1)
            goto L_0x0481
        L_0x044a:
            java.lang.Object r4 = r9.A00
            com.whatsapp.settings.SettingsPrivacy r4 = (com.whatsapp.settings.SettingsPrivacy) r4
            java.lang.Integer r3 = X.C36381kD.A0n()
            int r2 = r4.A00
            java.lang.String r1 = r4.A13
            java.lang.String r0 = "privacy_blocked"
            A01(r4, r3, r1, r0, r2)
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.blocklist.BlockList"
            goto L_0x04d8
        L_0x0466:
            java.lang.Object r4 = r9.A00
            com.whatsapp.settings.SettingsPrivacy r4 = (com.whatsapp.settings.SettingsPrivacy) r4
            java.lang.Integer r3 = X.C36361kB.A0j()
            int r2 = r4.A00
            java.lang.String r1 = r4.A13
            java.lang.String r0 = "wcs_about_status"
            A01(r4, r3, r1, r0, r2)
            android.content.Intent r1 = X.C36431kI.A0D()
            java.lang.String r0 = "com.whatsapp.profile.AboutStatusPrivacyActivity"
        L_0x047d:
            android.content.Intent r0 = r1.setClassName(r4, r0)
        L_0x0481:
            r4.startActivity(r0)
            return
        L_0x0485:
            java.lang.Object r4 = r9.A00
            com.whatsapp.settings.SettingsPrivacy r4 = (com.whatsapp.settings.SettingsPrivacy) r4
            java.lang.Integer r3 = X.C36371kC.A0o()
            int r2 = r4.A00
            java.lang.String r1 = r4.A13
            java.lang.String r0 = "privacy_status"
            A01(r4, r3, r1, r0, r2)
            android.content.Intent r1 = X.AnonymousClass190.A0E(r4)
            r0 = 0
            r4.startActivityForResult(r1, r0)
            return
        L_0x049f:
            java.lang.Object r4 = r9.A00
            com.whatsapp.settings.SettingsPrivacy r4 = (com.whatsapp.settings.SettingsPrivacy) r4
            java.lang.Integer r3 = X.C36401kF.A0h()
            int r2 = r4.A00
            java.lang.String r1 = r4.A13
            java.lang.String r0 = "live_location"
            A01(r4, r3, r1, r0, r2)
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.location.LiveLocationPrivacyActivity"
            goto L_0x04d8
        L_0x04bb:
            java.lang.Object r4 = r9.A00
            com.whatsapp.settings.SettingsPrivacy r4 = (com.whatsapp.settings.SettingsPrivacy) r4
            r0 = 20
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            int r2 = r4.A00
            java.lang.String r1 = r4.A13
            java.lang.String r0 = "privacy_chat_lock"
            A01(r4, r3, r1, r0, r2)
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.chatlock.ChatLockPrivacySettingsActivity"
        L_0x04d8:
            r2.setClassName(r1, r0)
        L_0x04db:
            r4.startActivity(r2)
            return
        L_0x04df:
            java.lang.Object r2 = r9.A00
            com.whatsapp.settings.SettingsPrivacyAdvancedActivity r2 = (com.whatsapp.settings.SettingsPrivacyAdvancedActivity) r2
            boolean r0 = r2.A07
            r0 = r0 ^ 1
            r2.A07 = r0
            X.0wU r1 = r2.A04
            r0 = 41
            goto L_0x04fc
        L_0x04ee:
            java.lang.Object r2 = r9.A00
            com.whatsapp.settings.SettingsPrivacyAdvancedActivity r2 = (com.whatsapp.settings.SettingsPrivacyAdvancedActivity) r2
            boolean r0 = r2.A06
            r0 = r0 ^ 1
            r2.A06 = r0
            X.0wU r1 = r2.A04
            r0 = 43
        L_0x04fc:
            X.C81163wZ.A00(r1, r2, r0)
            com.whatsapp.settings.SettingsPrivacyAdvancedActivity.A01(r2)
            return
        L_0x0503:
            java.lang.Object r0 = r9.A00
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            X.C36421kH.A16(r0)
            return
        L_0x050b:
            java.lang.Object r2 = r9.A00
            X.155 r2 = (X.AnonymousClass155) r2
            java.lang.String r0 = "https://www.whatsapp.com/security"
            android.content.Intent r1 = X.C36331k8.A04(r0)
            X.1Dv r0 = r2.A01
            r0.A06(r2, r1)
            return
        L_0x051b:
            java.lang.Object r3 = r9.A00
            com.whatsapp.settings.SettingsSecurity r3 = (com.whatsapp.settings.SettingsSecurity) r3
            X.0xT r2 = r3.A03
            java.lang.String r1 = "security-and-privacy"
            java.lang.String r0 = "security-code-change-notification"
            android.net.Uri r0 = r2.A04(r1, r0)
            android.content.Intent r0 = X.C36391kE.A0G(r0)
            r3.startActivity(r0)
            return
        L_0x0531:
            java.lang.Object r2 = r9.A00
            com.whatsapp.settings.autoconf.ShareAutoConfVerifierActivity r2 = (com.whatsapp.settings.autoconf.ShareAutoConfVerifierActivity) r2
            X.3nH r1 = r2.A02
            if (r1 != 0) goto L_0x0540
            java.lang.String r0 = "updateAutoConfConsentManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0540:
            androidx.appcompat.widget.SwitchCompat r0 = r2.A00
            if (r0 != 0) goto L_0x054b
            java.lang.String r0 = "consentSwitch"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x054b:
            boolean r0 = r0.isChecked()
            r0 = r0 ^ 1
            r1.A00(r2, r0)
            return
        L_0x0555:
            java.lang.Object r6 = r9.A00
            X.2e0 r6 = (X.C47212e0) r6
            X.11F r2 = r6.A00
            if (r2 == 0) goto L_0x05a8
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x05a8
            X.16D r0 = r6.A01
            X.171 r1 = r6.A02
            r7 = 100
            X.141 r0 = r0.A08(r2)
            X.C18740tg.A06(r0)
            java.lang.String r2 = r1.A0I(r0)
            r1 = 2131896122(0x7f12273a, float:1.9427096E38)
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r4 = 0
            java.lang.String r3 = X.C36391kE.A0v(r6, r2, r0, r4, r1)
            boolean r1 = X.AnonymousClass1RC.A0A(r6)
            r0 = 2131896121(0x7f122739, float:1.9427094E38)
            if (r1 == 0) goto L_0x0589
            r0 = 2131896119(0x7f122737, float:1.942709E38)
        L_0x0589:
            java.lang.String r0 = r6.getString(r0)
            java.lang.String[] r2 = X.C36441kJ.A1S()
            r2[r4] = r3
            r2[r5] = r0
            com.whatsapp.settings.chat.wallpaper.WallpaperSetConfirmationDialogFragment r1 = new com.whatsapp.settings.chat.wallpaper.WallpaperSetConfirmationDialogFragment
            r1.<init>()
            r0 = 2131896118(0x7f122736, float:1.9427088E38)
            android.os.Bundle r0 = com.whatsapp.SingleSelectionDialogFragment.A05(r2, r7, r4, r0)
            r1.A17(r0)
            r6.Btm(r1)
            return
        L_0x05a8:
            r6.A3j(r2)
            return
        L_0x05ac:
            java.lang.Object r1 = r9.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 0
            r1.setResult(r0)
            r1.finish()
            return
        L_0x05b8:
            java.lang.Object r2 = r9.A00
            com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview r2 = (com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview) r2
            r1 = 0
            r0 = 0
            r2.setResult(r1, r0)
            com.whatsapp.collections.MarginCorrectedViewPager r0 = r2.A09
            int r0 = r0.getCurrentItem()
            com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview.A07(r2, r0)
            return
        L_0x05cb:
            java.lang.Object r0 = r9.A00
            X.7zg r0 = (X.C168087zg) r0
            X.32y r0 = r0.A01
            com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity r0 = r0.A00
            X.7zg r3 = r0.A06
            java.util.List r2 = r0.A07
            X.00I r1 = r0.A02
            r0 = 2
            r3.A0L(r1, r2, r0)
            return
        L_0x05de:
            java.lang.Object r4 = r9.A00
            com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity r4 = (com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity) r4
            X.147 r3 = r4.A07
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.qrcode.GroupLinkQrActivity"
            android.content.Intent r0 = r2.setClassName(r1, r0)
            X.C36371kC.A17(r0, r3)
            r4.startActivity(r0)
            java.lang.Integer r0 = X.C36361kB.A0j()
            X.2OW r2 = new X.2OW
            r2.<init>()
            r2.A00 = r0
            X.1EM r1 = r4.A09
            X.147 r0 = r4.A07
            int r0 = r1.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A01 = r0
            X.0yW r0 = r4.A04
            r0.Bly(r2)
            return
        L_0x0617:
            java.lang.Object r2 = r9.A00
            com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity r2 = (com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity) r2
            X.147 r1 = r2.A07
            X.C18740tg.A06(r1)
            r0 = 0
            com.whatsapp.RevokeLinkConfirmationDialogFragment r1 = X.C53122qo.A00(r1, r0)
            r0 = 0
            r2.Btl(r1, r0)
            return
        L_0x062a:
            java.lang.Object r0 = r9.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1b()
            return
        L_0x0632:
            java.lang.Object r3 = r9.A00
            com.whatsapp.spamreport.ReportSpamDialogFragment r3 = (com.whatsapp.spamreport.ReportSpamDialogFragment) r3
            X.190 r0 = r3.A0G
            if (r0 == 0) goto L_0x0652
            android.content.Context r0 = r10.getContext()
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsActivity"
            r2.setClassName(r1, r0)
            r3.A1C(r2)
            r3.A1b()
            return
        L_0x0652:
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        L_0x0657:
            java.lang.Object r0 = r9.A00
            X.1yu r0 = (X.C42491yu) r0
            android.content.Context r3 = r0.A07
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.status.playback.MyStatusesActivity"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            return
        L_0x066e:
            java.lang.Object r0 = r9.A00
            com.whatsapp.status.StatusesFragment r0 = (com.whatsapp.status.StatusesFragment) r0
            X.1dt r2 = r0.A0G
            X.01I r1 = r0.A0h()
            java.lang.Integer r0 = X.C36431kI.A12()
            r2.A01(r1, r0)
            return
        L_0x0680:
            java.lang.Object r1 = r9.A00
            com.whatsapp.status.StatusesFragment r1 = (com.whatsapp.status.StatusesFragment) r1
            X.0v0 r0 = r1.A0Y
            r0.A11()
            android.view.View r1 = r1.A02
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0691:
            X.2S0 r0 = new X.2S0
            r0.<init>()
            java.lang.String r0 = "source"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x069d:
            if (r2 == 0) goto L_0x06a6
            X.1Rs r1 = r3.A07
            r0 = 0
            r1.A0D(r0)
            return
        L_0x06a6:
            X.040 r2 = X.C109325Xd.A00(r3)
            r1 = 0
            com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel$onPreferenceClicked$1 r0 = new com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel$onPreferenceClicked$1
            r0.<init>(r3, r1)
            X.C36331k8.A1T(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Y8.onClick(android.view.View):void");
    }

    public static void A01(SettingsPrivacy settingsPrivacy, Integer num, Object obj, String str, int i) {
        boolean equals = str.equals(obj);
        if (i == -1) {
            i = 0;
            if (equals) {
                i = 2;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        C44642Oh r1 = new C44642Oh();
        r1.A00 = valueOf;
        r1.A01 = num;
        settingsPrivacy.A0f.Blv(r1);
    }
}
