package X;

import android.content.DialogInterface;

/* renamed from: X.4XN  reason: invalid class name */
public class AnonymousClass4XN implements DialogInterface.OnClickListener {
    public Object A00;
    public final int A01;

    public AnonymousClass4XN(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02fc, code lost:
        X.AnonymousClass3SJ.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02ff, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0371, code lost:
        r4.BOm(r3, r2, r0, r1);
        r5.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0377, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0097, code lost:
        r3.Boy(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0137, code lost:
        r1.B2t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0168, code lost:
        r3.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x016b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x026b, code lost:
        r0.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x026e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r16, int r17) {
        /*
            r15 = this;
            int r0 = r15.A01
            r3 = r16
            switch(r0) {
                case 0: goto L_0x00d4;
                case 1: goto L_0x010d;
                case 2: goto L_0x00db;
                case 3: goto L_0x00f1;
                case 4: goto L_0x00f8;
                case 5: goto L_0x011c;
                case 6: goto L_0x0106;
                case 7: goto L_0x010d;
                case 8: goto L_0x0114;
                case 9: goto L_0x0238;
                case 10: goto L_0x017f;
                case 11: goto L_0x011c;
                case 12: goto L_0x0123;
                case 13: goto L_0x012c;
                case 14: goto L_0x013b;
                case 15: goto L_0x0007;
                case 16: goto L_0x0007;
                case 17: goto L_0x0007;
                case 18: goto L_0x016c;
                case 19: goto L_0x0177;
                case 20: goto L_0x016c;
                case 21: goto L_0x016c;
                case 22: goto L_0x017f;
                case 23: goto L_0x0186;
                case 24: goto L_0x0238;
                case 25: goto L_0x0007;
                case 26: goto L_0x023f;
                case 27: goto L_0x003b;
                case 28: goto L_0x025f;
                case 29: goto L_0x0267;
                case 30: goto L_0x0267;
                case 31: goto L_0x026f;
                case 32: goto L_0x004b;
                case 33: goto L_0x005b;
                case 34: goto L_0x000f;
                case 35: goto L_0x028c;
                case 36: goto L_0x0294;
                case 37: goto L_0x02b5;
                case 38: goto L_0x02c9;
                case 39: goto L_0x006b;
                case 40: goto L_0x02d9;
                case 41: goto L_0x009e;
                case 42: goto L_0x02e1;
                case 43: goto L_0x02f6;
                case 44: goto L_0x0300;
                case 45: goto L_0x0022;
                case 46: goto L_0x00b2;
                case 47: goto L_0x0308;
                case 48: goto L_0x0344;
                case 49: goto L_0x035b;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r15.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1b()
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r4 = r15.A00
            X.14u r4 = (X.C225314u) r4
            X.0v0 r1 = r4.A09
            r0 = 1
            r1.A1x(r0)
            X.0wU r3 = r4.A04
            r0 = 6
            X.74t r2 = new X.74t
            r2.<init>((java.lang.Object) r4, (int) r0)
            goto L_0x0097
        L_0x0022:
            java.lang.Object r0 = r15.A00
            X.2hz r0 = (X.C48752hz) r0
            java.lang.Object r0 = r0.A00
            X.8ha r0 = (X.C178798ha) r0
            X.8ld r1 = r0.A0L
            java.lang.String r0 = "DyiViewModel/export-report"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wU r3 = r1.A07
            r0 = 46
            X.AVY r2 = new X.AVY
            r2.<init>(r1, r0)
            goto L_0x0097
        L_0x003b:
            java.lang.Object r1 = r15.A00
            com.whatsapp.group.ReportGroupPrivacyTipDialogFragment r1 = (com.whatsapp.group.ReportGroupPrivacyTipDialogFragment) r1
            r0 = -1
            r2 = r17
            if (r2 != r0) goto L_0x000e
            r0 = 3
            r1.A00 = r0
            r1.A1b()
            return
        L_0x004b:
            java.lang.Object r0 = r15.A00
            X.01I r1 = X.C36441kJ.A0X(r0)
            boolean r0 = r1 instanceof X.AnonymousClass4TH
            if (r0 == 0) goto L_0x000e
            X.4TH r1 = (X.AnonymousClass4TH) r1
            r1.B3Z()
            return
        L_0x005b:
            java.lang.Object r0 = r15.A00
            X.01I r1 = X.C36441kJ.A0X(r0)
            boolean r0 = r1 instanceof X.AnonymousClass4TH
            if (r0 == 0) goto L_0x000e
            X.4TH r1 = (X.AnonymousClass4TH) r1
            r1.B2Z()
            return
        L_0x006b:
            java.lang.Object r0 = r15.A00
            com.whatsapp.mute.ui.MuteDialogFragment r0 = (com.whatsapp.mute.ui.MuteDialogFragment) r0
            X.00T r0 = r0.A04
            java.lang.Object r5 = r0.getValue()
            com.whatsapp.mute.ui.MuteDialogViewModel r5 = (com.whatsapp.mute.ui.MuteDialogViewModel) r5
            java.util.List r4 = r5.A02
            if (r4 == 0) goto L_0x000e
            boolean r3 = r5.A03
            X.0v0 r1 = r5.A09
            X.2pb r0 = r5.A01
            int r2 = r0.id
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r1)
            if (r3 != 0) goto L_0x009b
            java.lang.String r0 = "last_mute_selection"
        L_0x008b:
            X.C36341k9.A0v(r1, r0, r2)
            X.0wU r3 = r5.A0F
            r0 = 25
            X.74j r2 = new X.74j
            r2.<init>(r5, r4, r0)
        L_0x0097:
            r3.Boy(r2)
            return
        L_0x009b:
            java.lang.String r0 = "last_mute_call_selection"
            goto L_0x008b
        L_0x009e:
            java.lang.Object r0 = r15.A00
            X.01I r1 = X.C36441kJ.A0X(r0)
            boolean r0 = r1 instanceof X.AnonymousClass4OK
            if (r0 == 0) goto L_0x000e
            X.4OK r1 = (X.AnonymousClass4OK) r1
            if (r1 == 0) goto L_0x000e
            X.2Ya r1 = (X.C46502Ya) r1
            X.C46502Ya.A0F(r1)
            return
        L_0x00b2:
            java.lang.Object r0 = r15.A00
            com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment r0 = (com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment) r0
            X.01I r2 = r0.A0h()
            if (r2 == 0) goto L_0x000e
            X.3DY r1 = r0.A00
            X.1CF r0 = r0.A01
            boolean r10 = r0.A00()
            r3 = 0
            java.lang.String r6 = "payments-blocked"
            r5 = r3
            r7 = r3
            r8 = r3
            r9 = r3
            r4 = r3
            android.content.Intent r0 = r1.A01(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r2.startActivity(r0)
            return
        L_0x00d4:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2
            goto L_0x02fc
        L_0x00db:
            java.lang.Object r1 = r15.A00
            com.whatsapp.email.UpdateEmailActivity r1 = (com.whatsapp.email.UpdateEmailActivity) r1
            r0 = 2
            X.9Pi r2 = r1.A3i()
            java.lang.String r3 = r1.A09
            int r5 = r1.A00
            r6 = 4
            r8 = 3
            r4 = 0
            r7 = 4
            r2.A00(r3, r4, r5, r6, r7, r8)
            goto L_0x02fc
        L_0x00f1:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 3
            goto L_0x02fc
        L_0x00f8:
            java.lang.Object r1 = r15.A00
            com.whatsapp.email.UpdateEmailActivity r1 = (com.whatsapp.email.UpdateEmailActivity) r1
            r0 = 2
            X.AnonymousClass3SJ.A00(r1, r0)
            java.lang.String r0 = ""
            com.whatsapp.email.UpdateEmailActivity.A0F(r1, r0)
            return
        L_0x0106:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 7
            goto L_0x02fc
        L_0x010d:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 1
            goto L_0x02fc
        L_0x0114:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 8
            goto L_0x02fc
        L_0x011c:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 4
            goto L_0x02fc
        L_0x0123:
            java.lang.Object r1 = r15.A00
            X.4Q0 r1 = (X.AnonymousClass4Q0) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r3, r0)
            goto L_0x0137
        L_0x012c:
            java.lang.Object r1 = r15.A00
            X.4Q0 r1 = (X.AnonymousClass4Q0) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r3, r0)
            r3.dismiss()
        L_0x0137:
            r1.B2t()
            goto L_0x0168
        L_0x013b:
            java.lang.Object r0 = r15.A00
            com.whatsapp.events.EventInfoBottomSheet r0 = (com.whatsapp.events.EventInfoBottomSheet) r0
            X.1uu r0 = r0.A04
            if (r0 != 0) goto L_0x014a
            java.lang.String r0 = "eventInfoViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x014a:
            X.05L r2 = r0.A0A
        L_0x014c:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            X.3S4 r0 = (X.AnonymousClass3S4) r0
            X.2o0 r6 = X.C51552o0.BACK_TO_MAIN
            X.2bT r5 = r0.A00
            java.util.List r7 = r0.A03
            java.util.List r8 = r0.A02
            boolean r9 = r0.A04
            X.3S4 r4 = new X.3S4
            r4.<init>(r5, r6, r7, r8, r9)
            boolean r0 = r2.B3B(r1, r4)
            if (r0 == 0) goto L_0x014c
        L_0x0168:
            r3.dismiss()
            return
        L_0x016c:
            java.lang.Object r0 = r15.A00
            X.1uO r0 = (X.C39971uO) r0
            X.1Rs r1 = r0.A01
            r0 = 0
            X.C36341k9.A17(r1, r0)
            return
        L_0x0177:
            java.lang.Object r0 = r15.A00
            X.1uO r0 = (X.C39971uO) r0
            r0.A0S()
            return
        L_0x017f:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 6
            goto L_0x02fc
        L_0x0186:
            java.lang.Object r10 = r15.A00
            com.whatsapp.group.GroupChatInfoActivity r10 = (com.whatsapp.group.GroupChatInfoActivity) r10
            r0 = 6
            X.AnonymousClass3SJ.A00(r10, r0)
            X.141 r0 = r10.A0z
            com.whatsapp.jid.UserJid r4 = X.C36351kA.A0l(r0)
            X.1tr r0 = r10.A1H
            boolean r0 = r0.A0U(r4)
            if (r0 == 0) goto L_0x01a7
            X.0xQ r1 = r10.A1J
            X.147 r0 = r10.A1Y
            r1.A0d(r0, r4)
        L_0x01a3:
            com.whatsapp.group.GroupChatInfoActivity.A15(r10)
            return
        L_0x01a7:
            X.17X r1 = r10.A0M
            X.147 r0 = r10.A1Y
            X.6PM r0 = r1.A03(r0, r4)
            if (r0 == 0) goto L_0x01cc
            int r1 = r0.A01
            r0 = 2
            if (r1 != r0) goto L_0x01cc
            r3 = 2131889328(0x7f120cb0, float:1.9413316E38)
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()
            X.171 r1 = r10.A0j
            X.16D r0 = r10.A0G
            java.lang.String r1 = X.C36381kD.A0u(r0, r1, r4)
            r0 = 0
            r2[r0] = r1
            r10.BO9(r2, r0, r3)
            return
        L_0x01cc:
            boolean r0 = X.C36431kI.A1R(r10)
            if (r0 != 0) goto L_0x01e8
            X.17Y r2 = r10.A05
            android.content.Context r0 = r10.getApplicationContext()
            boolean r1 = X.C19600wD.A02(r0)
            r0 = 2131891264(0x7f121440, float:1.9417243E38)
            if (r1 == 0) goto L_0x01e4
            r0 = 2131891265(0x7f121441, float:1.9417245E38)
        L_0x01e4:
            r2.A03(r0)
            goto L_0x01a3
        L_0x01e8:
            r1 = 2131892106(0x7f12178a, float:1.941895E38)
            r0 = 2131893491(0x7f121cf3, float:1.942176E38)
            r10.Bu2(r1, r0)
            X.0xQ r11 = r10.A1J
            X.1Cf r9 = r10.A0K
            X.147 r12 = r10.A1Y
            java.util.List r13 = java.util.Collections.singletonList(r4)
            r7 = 30
            X.2VN r8 = new X.2VN
            r8.<init>(r9, r10, r11, r12, r13)
            X.0xg r2 = r10.A1P
            X.147 r3 = r8.A03
            java.util.List r6 = r8.A05
            X.C18740tg.A06(r6)
            boolean r0 = r8.A00
            if (r0 == 0) goto L_0x022c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GroupIqResponseUtil/remove-participants/timeout; groupId="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; participants="
            X.C36321k7.A1J(r6, r0, r1)
            r4 = 0
        L_0x0221:
            java.lang.String r5 = "remove"
            r8 = 0
            X.AcK r1 = X.C21891AcK.create()
            X.C20510xg.A01(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x022c:
            r14 = 0
            X.3Tc r4 = new X.3Tc
            r12 = r8
            r13 = r8
            r9 = r4
            r10 = r8
            r11 = r2
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x0221
        L_0x0238:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 5
            goto L_0x02fc
        L_0x023f:
            java.lang.Object r3 = r15.A00
            androidx.fragment.app.DialogFragment r3 = (androidx.fragment.app.DialogFragment) r3
            java.lang.String r0 = "group_info/onclick_setDescription"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.01I r2 = r3.A0h()
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            android.os.Bundle r1 = r3.A0b()
            java.lang.String r0 = "description"
            java.lang.String r0 = X.C36431kI.A17(r1, r0)
            com.whatsapp.group.GroupChatInfoActivity.A1F(r2, r0)
            r3.A1b()
            return
        L_0x025f:
            java.lang.Object r0 = r15.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r3.dismiss()
            goto L_0x026b
        L_0x0267:
            java.lang.Object r0 = r15.A00
            android.app.Activity r0 = (android.app.Activity) r0
        L_0x026b:
            r0.finish()
            return
        L_0x026f:
            java.lang.Object r0 = r15.A00
            com.whatsapp.interopui.optout.InteropOptOutDialogFragment r0 = (com.whatsapp.interopui.optout.InteropOptOutDialogFragment) r0
            r3.dismiss()
            X.00T r0 = r0.A00
            java.lang.Object r3 = r0.getValue()
            com.whatsapp.interopui.setting.InteropSettingsViewModel r3 = (com.whatsapp.interopui.setting.InteropSettingsViewModel) r3
            X.040 r2 = X.C109325Xd.A00(r3)
            r1 = 0
            com.whatsapp.interopui.setting.InteropSettingsViewModel$onTurnOffClicked$1 r0 = new com.whatsapp.interopui.setting.InteropSettingsViewModel$onTurnOffClicked$1
            r0.<init>(r3, r1)
            X.C36331k8.A1T(r0, r2)
            return
        L_0x028c:
            java.lang.Object r0 = r15.A00
            com.whatsapp.mediaview.MediaViewBaseFragment r0 = (com.whatsapp.mediaview.MediaViewBaseFragment) r0
            r0.A1g()
            return
        L_0x0294:
            java.lang.Object r3 = r15.A00
            com.whatsapp.migration.export.ui.ExportMigrationActivity r3 = (com.whatsapp.migration.export.ui.ExportMigrationActivity) r3
            X.68x r2 = r3.A0G
            java.lang.String r1 = r3.A0J
            r0 = 6
            r2.A00(r1, r0)
            X.0yW r0 = r3.A0B
            r2 = 8
            java.lang.String r1 = X.C55582ur.A00(r0, r2)
            r0 = 0
            android.content.Intent r2 = X.AnonymousClass190.A1F(r3, r1, r0, r2)
            X.1Dv r1 = r3.A01
            r0 = 5000(0x1388, float:7.006E-42)
            r1.A09(r3, r2, r0)
            return
        L_0x02b5:
            java.lang.Object r3 = r15.A00
            X.14p r3 = (X.C224914p) r3
            X.0wU r2 = r3.A04
            r1 = 24
            X.72n r0 = new X.72n
            r0.<init>(r3, r1)
            r2.Boy(r0)
            X.C36351kA.A12(r3)
            return
        L_0x02c9:
            java.lang.Object r0 = r15.A00
            com.whatsapp.mute.ui.MuteDialogFragment r0 = (com.whatsapp.mute.ui.MuteDialogFragment) r0
            X.00T r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.mute.ui.MuteDialogViewModel r0 = (com.whatsapp.mute.ui.MuteDialogViewModel) r0
            r0.A0S()
            return
        L_0x02d9:
            java.lang.Object r0 = r15.A00
            com.whatsapp.newsletter.MatchPhoneNumberConfirmationDialogFragment r0 = (com.whatsapp.newsletter.MatchPhoneNumberConfirmationDialogFragment) r0
            com.whatsapp.newsletter.MatchPhoneNumberConfirmationDialogFragment.A05(r0)
            return
        L_0x02e1:
            java.lang.Object r2 = r15.A00
            com.whatsapp.notification.PopupNotification r2 = (com.whatsapp.notification.PopupNotification) r2
            X.1NG r1 = r2.A0J
            X.141 r0 = r2.A0l
            com.whatsapp.jid.UserJid r0 = X.C36351kA.A0k(r0)
            r1.A0H(r2, r0)
            r0 = 106(0x6a, float:1.49E-43)
            X.AnonymousClass3SJ.A00(r2, r0)
            return
        L_0x02f6:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 106(0x6a, float:1.49E-43)
        L_0x02fc:
            X.AnonymousClass3SJ.A00(r1, r0)
            return
        L_0x0300:
            java.lang.Object r0 = r15.A00
            X.00S r0 = (X.AnonymousClass00S) r0
            r0.invoke()
            return
        L_0x0308:
            java.lang.Object r6 = r15.A00
            com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkActivity r6 = (com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkActivity) r6
            r5 = 1
            r6.A04 = r5
            android.widget.TextView r1 = r6.A00
            if (r1 == 0) goto L_0x033d
            r0 = 2131890895(0x7f1212cf, float:1.9416495E38)
            r1.setText(r0)
            X.AF7 r4 = r6.A3i()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r2 = X.C36371kC.A0p()
            java.lang.String r1 = X.C36331k8.A0e(r6)
            java.lang.String r0 = "alias_switch_confirm_dialog"
            r4.BOm(r3, r2, r0, r1)
            com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkViewModel r0 = r6.A03
            if (r0 == 0) goto L_0x0336
            r0.A0S(r5)
            return
        L_0x0336:
            java.lang.String r0 = "indiaUpiMapperLinkViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x033d:
            java.lang.String r0 = "titleTextView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0344:
            java.lang.Object r5 = r15.A00
            com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkActivity r5 = (com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkActivity) r5
            X.AF7 r4 = r5.A3i()
            java.lang.Integer r3 = X.C36361kB.A0i()
            java.lang.Integer r2 = X.C36371kC.A0n()
            java.lang.String r1 = X.C36331k8.A0e(r5)
            java.lang.String r0 = "alias_switch_confirm_dialog"
            goto L_0x0371
        L_0x035b:
            java.lang.Object r5 = r15.A00
            com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkActivity r5 = (com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkActivity) r5
            X.AF7 r4 = r5.A3i()
            java.lang.Integer r3 = X.C36361kB.A0i()
            java.lang.Integer r2 = X.C36371kC.A0n()
            java.lang.String r1 = X.C36331k8.A0e(r5)
            java.lang.String r0 = "error"
        L_0x0371:
            r4.BOm(r3, r2, r0, r1)
            r5.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XN.onClick(android.content.DialogInterface, int):void");
    }
}
