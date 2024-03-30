package X;

import android.view.View;

/* renamed from: X.2hz  reason: invalid class name and case insensitive filesystem */
public class C48752hz extends C33541fX {
    public Object A00;
    public final int A01;

    public C48752hz(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C48752hz(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.whatsapp.group.GroupChatInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: com.whatsapp.newsletter.NewsletterInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: com.whatsapp.group.GroupPermissionsActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: com.whatsapp.identity.IdentityVerificationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: com.whatsapp.group.GroupChatInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: com.whatsapp.group.GroupChatInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: com.whatsapp.group.GroupPermissionsActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: com.whatsapp.group.GroupPermissionsActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03a9, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03d1, code lost:
        X.AnonymousClass3SJ.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03d4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0478, code lost:
        r2.startActivity(X.C36391kE.A0G(r1.A02(r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0483, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05b1, code lost:
        r4.startActivity(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x05b4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x06b1, code lost:
        r3.A0h(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x06b4, code lost:
        X.C36341k9.A11(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x06b7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0206, code lost:
        r4.startActivity(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0209, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0712  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.view.View r13) {
        /*
            r12 = this;
            int r0 = r12.A01
            switch(r0) {
                case 0: goto L_0x05dc;
                case 1: goto L_0x05c2;
                case 2: goto L_0x05b5;
                case 3: goto L_0x05a2;
                case 4: goto L_0x058e;
                case 5: goto L_0x056f;
                case 6: goto L_0x055c;
                case 7: goto L_0x020a;
                case 8: goto L_0x0552;
                case 9: goto L_0x054a;
                case 10: goto L_0x0512;
                case 11: goto L_0x01e0;
                case 12: goto L_0x04de;
                case 13: goto L_0x04aa;
                case 14: goto L_0x0015;
                case 15: goto L_0x048b;
                case 16: goto L_0x046a;
                case 17: goto L_0x0454;
                case 18: goto L_0x043e;
                case 19: goto L_0x03db;
                case 20: goto L_0x03d5;
                case 21: goto L_0x0199;
                case 22: goto L_0x016d;
                case 23: goto L_0x03ca;
                case 24: goto L_0x0148;
                case 25: goto L_0x03c2;
                case 26: goto L_0x03ab;
                case 27: goto L_0x03a1;
                case 28: goto L_0x039c;
                case 29: goto L_0x038f;
                case 30: goto L_0x012e;
                case 31: goto L_0x037c;
                case 32: goto L_0x0374;
                case 33: goto L_0x010c;
                case 34: goto L_0x00e0;
                case 35: goto L_0x0346;
                case 36: goto L_0x033e;
                case 37: goto L_0x0319;
                case 38: goto L_0x02f9;
                case 39: goto L_0x00b9;
                case 40: goto L_0x02ee;
                case 41: goto L_0x0075;
                case 42: goto L_0x02c3;
                case 43: goto L_0x02bb;
                case 44: goto L_0x005c;
                case 45: goto L_0x02ab;
                case 46: goto L_0x0689;
                case 47: goto L_0x002e;
                case 48: goto L_0x0266;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r12.A00
            X.8ha r2 = (X.C178798ha) r2
            X.0wo r1 = r2.A07
            X.0wQ r0 = r2.A02
            java.lang.String r0 = X.C237919w.A00(r0, r1)
            r2.A3j(r0)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r4 = r12.A00
            com.whatsapp.identity.IdentityVerificationActivity r4 = (com.whatsapp.identity.IdentityVerificationActivity) r4
            X.141 r0 = r4.A0F
            com.whatsapp.jid.Jid r3 = X.C36431kI.A0h(r0)
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.identity.ScanQrCodeActivity"
            X.C36331k8.A0u(r2, r3, r1, r0)
            goto L_0x0206
        L_0x002e:
            java.lang.Object r4 = r12.A00
            X.8ha r4 = (X.C178798ha) r4
            X.8ld r3 = r4.A0L
            java.lang.String r0 = "DyiViewModel/download-report"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 3
            X.C180358ld.A02(r3, r1)
            X.00s r0 = r3.A02
            X.C36341k9.A17(r0, r1)
            X.0wU r2 = r3.A07
            r1 = 45
            X.AVY r0 = new X.AVY
            r0.<init>(r3, r1)
            r2.Boy(r0)
            boolean r0 = r4.A0Q
            if (r0 == 0) goto L_0x0014
            X.0yb r0 = r4.A08
            android.content.ClipboardManager r2 = r0.A09()
            if (r2 == 0) goto L_0x064c
            goto L_0x063a
        L_0x005c:
            r7 = 1
            if (r13 == 0) goto L_0x0014
            boolean r0 = r13.isEnabled()
            if (r0 != r7) goto L_0x0014
            java.lang.Object r8 = r12.A00
            com.whatsapp.payments.ui.BrazilPaymentMethodAddPixBottomSheet r8 = (com.whatsapp.payments.ui.BrazilPaymentMethodAddPixBottomSheet) r8
            com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel r10 = r8.A05
            java.lang.String r11 = "brazilAddPixKeyViewModel"
            r6 = 0
            if (r10 != 0) goto L_0x06b8
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r11)
            throw r0
        L_0x0075:
            java.lang.Object r0 = r12.A00
            X.1wR r0 = (X.C40991wR) r0
            com.whatsapp.newsletter.NewsletterInfoActivity r2 = r0.A04
            X.2EJ r0 = r2.A0j
            r7 = 0
            if (r0 != 0) goto L_0x0087
            java.lang.String r0 = "newsletterInfoViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0087:
            X.00s r0 = r0.A06
            java.lang.Object r1 = r0.A04()
            java.util.Set r1 = (java.util.Set) r1
            if (r1 == 0) goto L_0x0014
            X.01z r0 = r2.getSupportFragmentManager()
            java.lang.String r6 = "NewsletterInvitedAdminsFragment"
            X.02E r0 = r0.A0N(r6)
            if (r0 != 0) goto L_0x0014
            X.09Y r5 = X.C36341k9.A0O(r2)
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.Iterator r1 = r1.iterator()
        L_0x00a9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0728
            X.11F r0 = X.C36341k9.A0W(r1)
            if (r0 == 0) goto L_0x00a9
            r4.add(r0)
            goto L_0x00a9
        L_0x00b9:
            java.lang.Object r1 = r12.A00
            X.01I r1 = (X.AnonymousClass01I) r1
            X.01z r0 = r1.getSupportFragmentManager()
            java.lang.String r3 = "NewsletterSelectNewOwnerFragment"
            X.02E r0 = r0.A0N(r3)
            if (r0 != 0) goto L_0x0014
            com.whatsapp.newsletter.multiadmin.NewsletterSelectNewOwnerFragment r2 = new com.whatsapp.newsletter.multiadmin.NewsletterSelectNewOwnerFragment
            r2.<init>()
            X.09Y r1 = X.C36341k9.A0O(r1)
            r0 = 2131433594(0x7f0b187a, float:1.8488978E38)
            r1.A0F(r2, r3, r0)
            r0 = 0
            r1.A0J(r0)
            r1.A01()
            return
        L_0x00e0:
            java.lang.Object r0 = r12.A00
            com.whatsapp.migration.android.view.GoogleMigrateImporterActivity r0 = (com.whatsapp.migration.android.view.GoogleMigrateImporterActivity) r0
            com.whatsapp.migration.android.view.GoogleMigrateImporterViewModel r4 = r0.A04
            X.00s r0 = r4.A01
            java.lang.Number r0 = X.C36441kJ.A0z(r0)
            if (r0 == 0) goto L_0x0014
            int r1 = r0.intValue()
            r0 = 1
            r3 = 10
            java.lang.String r2 = "google_migrate_attempt_to_skip_import"
            if (r1 == r0) goto L_0x0107
            r0 = 3
            if (r1 != r0) goto L_0x0014
            X.3TX r1 = r4.A0A
            java.lang.String r0 = "google_migrate_import_started"
        L_0x0100:
            r1.A07(r0, r2)
            r4.A0U(r3)
            return
        L_0x0107:
            X.3TX r1 = r4.A0A
            java.lang.String r0 = "google_migrate_rejected_permission"
            goto L_0x0100
        L_0x010c:
            java.lang.Object r0 = r12.A00
            com.whatsapp.migration.android.view.GoogleMigrateImporterActivity r0 = (com.whatsapp.migration.android.view.GoogleMigrateImporterActivity) r0
            com.whatsapp.migration.android.view.GoogleMigrateImporterViewModel r3 = r0.A04
            X.00s r0 = r3.A01
            java.lang.Number r0 = X.C36441kJ.A0z(r0)
            if (r0 == 0) goto L_0x0014
            int r1 = r0.intValue()
            r2 = 1
            if (r1 == 0) goto L_0x0752
            if (r1 == r2) goto L_0x0752
            r0 = 5
            if (r1 == r0) goto L_0x074a
            r0 = 9
            if (r1 != r0) goto L_0x0014
            r3.A0T()
            return
        L_0x012e:
            r0 = 0
            X.AnonymousClass00C.A0D(r13, r0)
            java.lang.Object r0 = r12.A00
            com.whatsapp.mediacomposer.bottombar.recipients.DefaultRecipientsView r0 = (com.whatsapp.mediacomposer.bottombar.recipients.DefaultRecipientsView) r0
            X.4U9 r2 = r0.A03
            if (r2 == 0) goto L_0x0014
            java.lang.Object r1 = r13.getTag()
            java.lang.String r0 = "status_chip"
            boolean r0 = r0.equals(r1)
            r2.BeL(r0)
            return
        L_0x0148:
            java.lang.Object r2 = r12.A00
            X.6ov r2 = (X.C142466ov) r2
            com.whatsapp.location.DragBottomSheetIndicator r0 = r2.A0J
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0014
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.A0G
            int r1 = r0.A0J
            r0 = 5
            if (r1 != r0) goto L_0x0014
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = r2.A0F
            int r2 = r3.A0J
            r1 = 3
            r0 = 4
            if (r2 != r0) goto L_0x0167
            r3.A0W(r1)
            return
        L_0x0167:
            if (r2 != r1) goto L_0x0014
            r3.A0W(r0)
            return
        L_0x016d:
            java.lang.Object r1 = r12.A00
            X.6ov r1 = (X.C142466ov) r1
            boolean r0 = r1.A0T
            if (r0 != 0) goto L_0x0014
            android.app.Activity r2 = r1.A05
            X.3FM r1 = new X.3FM
            r1.<init>(r2)
            r0 = 2131233476(0x7f080ac4, float:1.808309E38)
            r1.A01 = r0
            java.lang.String[] r0 = X.AnonymousClass1P6.A09
            r1.A0C = r0
            r0 = 2131892845(0x7f121a6d, float:1.942045E38)
            r1.A03 = r0
            r0 = 2131892846(0x7f121a6e, float:1.9420452E38)
            r1.A02 = r0
            android.content.Intent r1 = r1.A02()
            r0 = 35
            r2.startActivityForResult(r1, r0)
            return
        L_0x0199:
            java.lang.Object r3 = r12.A00
            com.whatsapp.languageselector.LanguageSelectorBottomSheet r3 = (com.whatsapp.languageselector.LanguageSelectorBottomSheet) r3
            X.359 r0 = r3.A07
            if (r0 == 0) goto L_0x0014
            com.whatsapp.BottomSheetListView r0 = r3.A00
            android.widget.ListAdapter r2 = r0.getAdapter()
            X.1nJ r2 = (X.C37851nJ) r2
            boolean r0 = r2 instanceof X.AnonymousClass2XG
            if (r0 == 0) goto L_0x01de
            r0 = r2
            X.2XG r0 = (X.AnonymousClass2XG) r0
            int r1 = r0.A00
        L_0x01b2:
            java.util.List r0 = r2.A00
            java.lang.Object r0 = r0.get(r1)
            X.3IV r0 = (X.AnonymousClass3IV) r0
            X.359 r1 = r3.A07
            java.lang.String r3 = r0.A01
            com.whatsapp.languageselector.LanguageSelectorBottomSheet r0 = r1.A00
            r0.A1b()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "https://youtu.be/"
            r2.append(r0)
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment r1 = r1.A01
            java.lang.String r0 = com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment.A03(r1, r3)
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r2)
            android.content.Intent r0 = X.C36331k8.A04(r0)
            r1.A1C(r0)
            return
        L_0x01de:
            r1 = 0
            goto L_0x01b2
        L_0x01e0:
            java.lang.Object r4 = r12.A00
            X.AwV r4 = (X.C22820AwV) r4
            com.whatsapp.group.GroupPermissionsActivity r4 = (com.whatsapp.group.GroupPermissionsActivity) r4
            X.147 r3 = r4.A0E
            if (r3 == 0) goto L_0x0014
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.HistorySettingActivity"
            android.content.Intent r2 = r2.setClassName(r1, r0)
            java.lang.String r1 = r3.getRawString()
            java.lang.String r0 = "group_jid"
            r2.putExtra(r0, r1)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r2.setFlags(r0)
        L_0x0206:
            r4.startActivity(r2)
            return
        L_0x020a:
            java.lang.Object r2 = r12.A00
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            X.0xQ r0 = r2.A1J
            X.1EM r0 = r0.A11
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0014
            X.12q r1 = r2.A0J
            X.147 r0 = r2.A3t()
            int r1 = r1.A05(r0)
            r0 = 2
            if (r1 == r0) goto L_0x0240
            r0 = 6
            if (r1 == r0) goto L_0x0240
            r0 = 2131895208(0x7f1223a8, float:1.9425243E38)
            r2.BO5(r0)
            r0 = 2131431198(0x7f0b0f1e, float:1.8484118E38)
            android.view.View r0 = X.C03570Gk.A0B(r2, r0)
            r1 = 8
            r0.setVisibility(r1)
            X.1RJ r0 = r2.A20
            r0.A03(r1)
            return
        L_0x0240:
            X.147 r1 = r2.A1Y
            X.C18740tg.A06(r1)
            X.1LV r0 = r2.A0c
            X.147 r4 = r0.A02(r1)
            if (r4 == 0) goto L_0x0014
            X.147 r6 = r2.A1Y
            X.1Cd r5 = r2.A0V
            X.1Lo r7 = r2.A1Q
            r8 = 45
            X.74x r3 = new X.74x
            r3.<init>((java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (int) r8)
            X.3Bh r1 = r2.A0N
            X.141 r0 = r2.A0y
            X.9j8 r0 = r1.A00(r2, r0, r3)
            r0.A02()
            return
        L_0x0266:
            java.lang.Object r1 = r12.A00
            X.8ha r1 = (X.C178798ha) r1
            r0 = 2132083238(0x7f150226, float:1.9806613E38)
            X.1qm r3 = X.AnonymousClass3LW.A01(r1, r0)
            android.content.Context r4 = r1.getBaseContext()
            java.lang.String r2 = r1.A0O
            java.lang.String r0 = "business"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x02a7
            java.lang.String r0 = "personal"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x02a3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: DyiReportBaseActivity/getDyiExportDialogLabelTextRes - this payment account type is not supported. Payment account type = "
            X.C36321k7.A1P(r0, r2, r1)
            r0 = -1
        L_0x0291:
            X.C39001qm.A02(r4, r3, r0)
            X.C39001qm.A07(r3)
            r2 = 2131888962(0x7f120b42, float:1.9412574E38)
            r0 = 45
            X.4XN r1 = new X.4XN
            r1.<init>(r12, r0)
            goto L_0x06b1
        L_0x02a3:
            r0 = 2131888963(0x7f120b43, float:1.9412576E38)
            goto L_0x0291
        L_0x02a7:
            r0 = 2131888955(0x7f120b3b, float:1.941256E38)
            goto L_0x0291
        L_0x02ab:
            java.lang.Object r2 = r12.A00
            com.whatsapp.payments.ui.BrazilPixBottomSheet r2 = (com.whatsapp.payments.ui.BrazilPixBottomSheet) r2
            r1 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            com.whatsapp.payments.ui.BrazilPixBottomSheet.A05(r2, r0, r1)
            r2.A1b()
            return
        L_0x02bb:
            java.lang.Object r0 = r12.A00
            com.whatsapp.newsletter.ui.mv.NewsletterEditMVActivity r0 = (com.whatsapp.newsletter.ui.mv.NewsletterEditMVActivity) r0
            com.whatsapp.newsletter.ui.mv.NewsletterEditMVActivity.A07(r0)
            return
        L_0x02c3:
            java.lang.Object r3 = r12.A00
            X.8fc r3 = (X.C178248fc) r3
            com.whatsapp.WaEditText r0 = r3.A3j()
            java.lang.String r0 = X.C36421kH.A0Z(r0)
            java.lang.String r0 = X.C36371kC.A0y(r0)
            int r0 = r0.length()
            r2 = 0
            if (r0 != 0) goto L_0x02ea
            X.17Y r1 = r3.A05
            r0 = 2131891304(0x7f121468, float:1.9417324E38)
            r1.A06(r0, r2)
            com.whatsapp.WaEditText r0 = r3.A3j()
            r0.requestFocus()
            return
        L_0x02ea:
            r3.A3o()
            return
        L_0x02ee:
            java.lang.Object r0 = r12.A00
            X.1na r0 = (X.C38021na) r0
            com.whatsapp.newsletter.NewsletterInfoActivity r1 = r0.A0B
            r0 = 0
            r1.A40(r0)
            return
        L_0x02f9:
            java.lang.Object r4 = r12.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r4 = (com.whatsapp.newsletter.NewsletterInfoActivity) r4
            r4.A3x()
            r4.A3v()
            r4.A3u()
            X.1Uw r3 = r4.A3v()
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.newsletter.ui.delete.DeleteNewsletterActivity"
            X.C36331k8.A0u(r2, r3, r1, r0)
            goto L_0x05b1
        L_0x0319:
            java.lang.Object r0 = r12.A00
            X.155 r0 = (X.AnonymousClass155) r0
            X.01z r4 = r0.getSupportFragmentManager()
            X.0wQ r0 = r0.A02
            X.13w r3 = r0.A09()
            com.whatsapp.newsletter.multiadmin.DismissNewsletterAdminDialogFragment r2 = new com.whatsapp.newsletter.multiadmin.DismissNewsletterAdminDialogFragment
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            if (r3 == 0) goto L_0x0337
            java.lang.String r0 = "arg_contact_jid"
            X.C36401kF.A14(r1, r3, r0)
        L_0x0337:
            r2.A17(r1)
            X.C65443Sb.A02(r2, r4)
            return
        L_0x033e:
            java.lang.Object r0 = r12.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r0 = (com.whatsapp.newsletter.NewsletterInfoActivity) r0
            com.whatsapp.newsletter.NewsletterInfoActivity.A0w(r0)
            return
        L_0x0346:
            java.lang.Object r5 = r12.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r5 = (com.whatsapp.newsletter.NewsletterInfoActivity) r5
            X.2Sj r1 = r5.A0e
            if (r1 == 0) goto L_0x0354
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r1.A08 = r0
        L_0x0354:
            X.0yC r4 = r5.A0D
            X.AnonymousClass00C.A07(r4)
            X.1Uw r3 = r5.A3v()
            r2 = 0
            java.lang.String r0 = "newsletter_info_report"
            X.3Pg r1 = new X.3Pg
            r1.<init>(r4, r3, r0, r2)
            X.2La r0 = r5.A3t()
            r1.A02(r0)
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r1.A01()
            r5.Btm(r0)
            return
        L_0x0374:
            java.lang.Object r0 = r12.A00
            X.4R2 r0 = (X.AnonymousClass4R2) r0
            r0.BgE()
            return
        L_0x037c:
            java.lang.Object r2 = r12.A00
            X.4R1 r2 = (X.AnonymousClass4R1) r2
            r1 = r2
            X.4ab r1 = (X.C90714ab) r1
            r0 = 1
            r1.A08 = r0
            java.lang.String r0 = "MediaCaptionDialog/dismiss/send"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.onDismiss()
            return
        L_0x038f:
            java.lang.String r0 = "MediaCaptionDialog/dismiss/send"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r0 = r12.A00
            X.4ab r0 = (X.C90714ab) r0
            r0.onDismiss()
            return
        L_0x039c:
            java.lang.Object r1 = r12.A00
            android.app.Activity r1 = (android.app.Activity) r1
            goto L_0x03a9
        L_0x03a1:
            java.lang.Object r0 = r12.A00
            X.5B7 r0 = (X.AnonymousClass5B7) r0
            X.6ov r0 = r0.A06
            android.app.Activity r1 = r0.A05
        L_0x03a9:
            r0 = 0
            goto L_0x03d1
        L_0x03ab:
            java.lang.Object r2 = r12.A00
            X.6ov r2 = (X.C142466ov) r2
            r2.A0O()
            r0 = 0
            r2.A0W = r0
            r2.A0U = r0
            android.view.View r1 = r2.A0C
            r0 = 8
            r1.setVisibility(r0)
            r2.A0S()
            return
        L_0x03c2:
            java.lang.Object r0 = r12.A00
            X.6ov r0 = (X.C142466ov) r0
            X.C142466ov.A05(r0)
            return
        L_0x03ca:
            java.lang.Object r0 = r12.A00
            X.6ov r0 = (X.C142466ov) r0
            android.app.Activity r1 = r0.A05
            r0 = 2
        L_0x03d1:
            X.AnonymousClass3SJ.A01(r1, r0)
            return
        L_0x03d5:
            java.lang.Object r0 = r12.A00
            X.C36431kI.A1N(r0)
            return
        L_0x03db:
            java.lang.Object r5 = r12.A00
            com.whatsapp.invites.ViewGroupInviteActivity r5 = (com.whatsapp.invites.ViewGroupInviteActivity) r5
            boolean r0 = r5.A0N
            if (r0 == 0) goto L_0x0407
            com.whatsapp.jid.UserJid r1 = r5.A0G
            X.C18740tg.A06(r1)
            X.2bQ r0 = r5.A0J
            com.whatsapp.invites.RevokeInviteDialogFragment r4 = new com.whatsapp.invites.RevokeInviteDialogFragment
            r4.<init>()
            android.os.Bundle r3 = X.AnonymousClass001.A07()
            X.C18740tg.A06(r1)
            X.C36371kC.A1B(r3, r1)
            long r1 = r0.A1N
            java.lang.String r0 = "invite_row_id"
            r3.putLong(r0, r1)
            r4.A17(r3)
            r5.Btm(r4)
            return
        L_0x0407:
            X.1EM r1 = r5.A0L
            X.2bQ r0 = r5.A0J
            int r0 = r0.A00
            boolean r2 = r1.A03(r0)
            android.widget.TextView r1 = r5.A04
            r0 = 2131890640(0x7f1211d0, float:1.9415978E38)
            if (r2 == 0) goto L_0x041b
            r0 = 2131890642(0x7f1211d2, float:1.9415982E38)
        L_0x041b:
            r1.setText(r0)
            android.view.ViewGroup r1 = r5.A02
            r0 = 0
            r1.setVisibility(r0)
            android.view.ViewGroup r1 = r5.A01
            r0 = 4
            r1.setVisibility(r0)
            X.0wU r4 = r5.A04
            X.0wo r3 = r5.A07
            X.0xg r2 = r5.A0E
            X.38j r1 = r5.A0I
            X.C18740tg.A06(r1)
            X.2jY r0 = new X.2jY
            r0.<init>(r3, r2, r5, r1)
            X.C36391kE.A1Q(r0, r4)
            return
        L_0x043e:
            java.lang.Object r0 = r12.A00
            com.whatsapp.interopui.setting.InteropSettingsOptinFragment r0 = (com.whatsapp.interopui.setting.InteropSettingsOptinFragment) r0
            X.01I r2 = r0.A0i()
            X.0xT r1 = r0.A01
            if (r1 == 0) goto L_0x044d
            java.lang.String r0 = "818760060056834"
            goto L_0x0478
        L_0x044d:
            java.lang.String r0 = "faqLinkFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0454:
            java.lang.Object r1 = r12.A00
            com.whatsapp.interopui.setting.InteropSettingsOptinFragment r1 = (com.whatsapp.interopui.setting.InteropSettingsOptinFragment) r1
            X.3E7 r0 = r1.A00
            if (r0 == 0) goto L_0x0463
            r1.A0i()
            r0.A00()
            return
        L_0x0463:
            java.lang.String r0 = "optinManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x046a:
            java.lang.Object r0 = r12.A00
            com.whatsapp.interop.ui.InteropSystemAboutBottomSheet r0 = (com.whatsapp.interop.ui.InteropSystemAboutBottomSheet) r0
            X.01I r2 = r0.A0i()
            X.0xT r1 = r0.A01
            if (r1 == 0) goto L_0x0484
            java.lang.String r0 = "369709382495539"
        L_0x0478:
            android.net.Uri r0 = r1.A02(r0)
            android.content.Intent r0 = X.C36391kE.A0G(r0)
            r2.startActivity(r0)
            return
        L_0x0484:
            java.lang.String r0 = "faqLinkFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x048b:
            java.lang.Object r3 = r12.A00
            com.whatsapp.identity.IdentityVerificationActivity r3 = (com.whatsapp.identity.IdentityVerificationActivity) r3
            X.0v0 r1 = r3.A09
            java.lang.String r0 = "security_notifications_alert_timestamp"
            r1.A1Z(r0)
            android.view.animation.TranslateAnimation r2 = X.C36371kC.A0M()
            r0 = 13
            X.C89234Vt.A00(r2, r3, r0)
            r0 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r0)
            android.view.View r0 = r3.A01
            r0.startAnimation(r2)
            return
        L_0x04aa:
            java.lang.Object r0 = r12.A00
            com.whatsapp.group.view.custom.GroupDetailsCard r0 = (com.whatsapp.group.view.custom.GroupDetailsCard) r0
            X.1Dv r4 = r0.getActivityUtils()
            android.content.Context r3 = r0.getContext()
            X.190 r2 = X.C36441kJ.A0j()
            android.content.Context r1 = r0.getContext()
            X.141 r0 = r0.A0C
            if (r0 != 0) goto L_0x04c9
            java.lang.String r0 = "groupChat"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x04c9:
            X.11F r0 = X.C36351kA.A0j(r0)
            android.content.Intent r2 = X.C36391kE.A0F(r1, r2, r0)
            r1 = 5
            java.lang.String r0 = "args_conversation_screen_entry_point"
            android.content.Intent r1 = r2.putExtra(r0, r1)
            java.lang.String r0 = "GroupChatInfoActivity"
            r4.A08(r3, r1, r0)
            return
        L_0x04de:
            java.lang.Object r4 = r12.A00
            com.whatsapp.group.newgroup.NewGroup r4 = (com.whatsapp.group.newgroup.NewGroup) r4
            X.3Fy r2 = r4.A0R
            X.01z r1 = r4.getSupportFragmentManager()
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.0v0 r0 = r2.A00
            boolean r0 = X.AnonymousClass3OP.A00(r1, r0)
            if (r0 == 0) goto L_0x0507
            X.3Fy r3 = r4.A0R
            X.01z r2 = r4.getSupportFragmentManager()
            java.util.concurrent.atomic.AtomicReference r0 = r4.A0t
            java.lang.Object r1 = r0.get()
            X.11F r1 = (X.AnonymousClass11F) r1
            r0 = 2
            r3.A00(r2, r1, r0)
            return
        L_0x0507:
            int r2 = r4.A00
            X.01z r1 = r4.getSupportFragmentManager()
            r0 = 1
            com.whatsapp.ephemeral.ChangeEphemeralSettingsDialog.A03(r1, r2, r0)
            return
        L_0x0512:
            java.lang.Object r5 = r12.A00
            com.whatsapp.group.GroupPermissionsActivity r5 = (com.whatsapp.group.GroupPermissionsActivity) r5
            X.147 r4 = r5.A0E
            X.B3n r0 = r5.A0B
            if (r0 != 0) goto L_0x0521
            java.lang.RuntimeException r0 = X.C36331k8.A0a()
            throw r0
        L_0x0521:
            java.util.ArrayList r3 = r0.B8L()
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.EditGroupAdminsSelector"
            r2.setClassName(r1, r0)
            java.lang.String r1 = r4.getRawString()
            java.lang.String r0 = "gid"
            r2.putExtra(r0, r1)
            java.util.ArrayList r1 = X.AnonymousClass143.A07(r3)
            java.lang.String r0 = "selected"
            r2.putExtra(r0, r1)
            r0 = 17
            r5.startActivityForResult(r2, r0)
            return
        L_0x054a:
            java.lang.Object r0 = r12.A00
            com.whatsapp.group.GroupParticipantsSearchFragment r0 = (com.whatsapp.group.GroupParticipantsSearchFragment) r0
            r0.A1Z()
            return
        L_0x0552:
            java.lang.Object r0 = r12.A00
            X.2VG r0 = (X.AnonymousClass2VG) r0
            com.whatsapp.group.GroupChatInfoActivity r0 = r0.A09
            r0.openContextMenu(r13)
            return
        L_0x055c:
            java.lang.Object r3 = r12.A00
            com.whatsapp.group.GroupChatInfoActivity r3 = (com.whatsapp.group.GroupChatInfoActivity) r3
            X.0xE r2 = r3.A0e
            X.147 r1 = r3.A1Z
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = X.C03570Gk.A0B(r3, r0)
            r2.Bkv(r3, r0, r1)
            return
        L_0x056f:
            java.lang.Object r4 = r12.A00
            com.whatsapp.group.GroupChatInfoActivity r4 = (com.whatsapp.group.GroupChatInfoActivity) r4
            X.141 r0 = r4.A0y
            boolean r0 = X.C36421kH.A1Y(r0)
            if (r0 == 0) goto L_0x0583
            r1 = 1
            r0 = 2131886397(0x7f12013d, float:1.9407372E38)
            X.C54482t1.A00(r4, r1, r0)
            return
        L_0x0583:
            X.0xE r3 = r4.A0e
            X.147 r2 = r4.A1Y
            r1 = 8
            r0 = 3
            r3.BuZ(r4, r2, r1, r0)
            return
        L_0x058e:
            java.lang.Object r2 = r12.A00
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            android.content.Context r1 = r2.getApplicationContext()
            X.147 r0 = r2.A1Y
            android.content.Intent r1 = X.AnonymousClass190.A0j(r1, r0)
            r0 = 16
            r2.startActivityForResult(r1, r0)
            return
        L_0x05a2:
            java.lang.Object r4 = r12.A00
            com.whatsapp.group.GroupChatInfoActivity r4 = (com.whatsapp.group.GroupChatInfoActivity) r4
            android.content.Context r2 = r4.getApplicationContext()
            X.147 r1 = r4.A1Y
            r0 = 1
            android.content.Intent r2 = X.AnonymousClass190.A0e(r2, r1, r0)
        L_0x05b1:
            r4.startActivity(r2)
            return
        L_0x05b5:
            java.lang.Object r3 = r12.A00
            com.whatsapp.group.GroupChatInfoActivity r3 = (com.whatsapp.group.GroupChatInfoActivity) r3
            X.2XH r2 = r3.A1b
            X.147 r1 = r3.A1Y
            r0 = 0
            r2.A07(r3, r1, r0)
            return
        L_0x05c2:
            java.lang.Object r2 = r12.A00
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            X.2Sc r1 = r2.A1A
            if (r1 == 0) goto L_0x05d0
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r1.A0C = r0
        L_0x05d0:
            X.19g r0 = r2.A12
            X.3ty r1 = r0.A07()
            r0 = 13
            X.C79593ty.A00(r1, r12, r0)
            return
        L_0x05dc:
            java.lang.Object r5 = r12.A00
            com.whatsapp.group.GroupChatInfoActivity r5 = (com.whatsapp.group.GroupChatInfoActivity) r5
            X.2Sc r2 = r5.A1A
            r1 = 1
            if (r2 == 0) goto L_0x05eb
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2.A00 = r0
        L_0x05eb:
            boolean r0 = X.AnonymousClass22g.A0q(r5)
            r2 = 0
            if (r0 == 0) goto L_0x0636
            X.147 r1 = r5.A1Y
            X.C18740tg.A06(r1)
            X.1Nx r0 = r5.A1i
            r0.A06(r1)
            X.1Cd r1 = r5.A0V
            X.147 r0 = r5.A1Y
            r1.A00(r0)
            X.1EL r1 = r5.A0N
            X.147 r0 = r5.A1Y
            boolean r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x0613
            r0 = 8
            X.AnonymousClass3SJ.A01(r5, r0)
            return
        L_0x0613:
            r0 = 2131893491(0x7f121cf3, float:1.942176E38)
            r5.Bu1(r0)
            X.0wU r1 = r5.A04
            X.1YR r7 = r5.A0x
            X.1LV r6 = r5.A0c
            X.147 r0 = r5.A1Y
            java.util.Set r8 = java.util.Collections.singleton(r0)
            r0 = 7
            X.4ZI r4 = new X.4ZI
            r4.<init>(r12, r0)
            X.2j5 r3 = new X.2j5
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r1.Box(r3, r0)
            return
        L_0x0636:
            X.AnonymousClass3SJ.A01(r5, r1)
            return
        L_0x063a:
            java.lang.String r1 = "password"
            java.lang.String r0 = r4.A0P     // Catch:{ NullPointerException | SecurityException -> 0x0646 }
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r1, r0)     // Catch:{ NullPointerException | SecurityException -> 0x0646 }
            r2.setPrimaryClip(r0)     // Catch:{ NullPointerException | SecurityException -> 0x0646 }
            goto L_0x064c
        L_0x0646:
            r1 = move-exception
            java.lang.String r0 = "paymentsDyi/clipboard/"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x064c:
            r0 = 2132083238(0x7f150226, float:1.9806613E38)
            X.1qm r3 = X.AnonymousClass3LW.A01(r4, r0)
            r0 = 2131888968(0x7f120b48, float:1.9412586E38)
            r3.A0d(r0)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            android.content.Context r1 = r4.getBaseContext()
            r0 = 2131888966(0x7f120b46, float:1.9412582E38)
            X.C36351kA.A14(r1, r2, r0)
            X.C36421kH.A1N(r2)
            java.lang.String r0 = r4.A0P
            r2.append(r0)
            java.lang.String r0 = "\n\n"
            r2.append(r0)
            r0 = 2131888967(0x7f120b47, float:1.9412584E38)
            X.C36351kA.A14(r4, r2, r0)
            java.lang.String r0 = r2.toString()
            r3.A0p(r0)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            r0 = 0
            r3.A0f(r0, r1)
            goto L_0x06b4
        L_0x0689:
            java.lang.Object r1 = r12.A00
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            r0 = 2132083238(0x7f150226, float:1.9806613E38)
            X.1qm r3 = X.AnonymousClass3LW.A01(r1, r0)
            r0 = 2131888958(0x7f120b3e, float:1.9412566E38)
            r3.A0d(r0)
            android.content.Context r1 = r1.getBaseContext()
            r0 = 2131888959(0x7f120b3f, float:1.9412568E38)
            X.C39001qm.A02(r1, r3, r0)
            X.C39001qm.A07(r3)
            r2 = 2131896493(0x7f1228ad, float:1.9427849E38)
            r0 = 20
            X.B83 r1 = new X.B83
            r1.<init>(r12, r0)
        L_0x06b1:
            r3.A0h(r1, r2)
        L_0x06b4:
            X.C36341k9.A11(r3)
            return
        L_0x06b8:
            X.00s r0 = r10.A01
            java.lang.Object r2 = r0.A04()
            X.9WG r2 = (X.AnonymousClass9WG) r2
            r0 = 0
            if (r2 == 0) goto L_0x070c
            java.lang.String r9 = r2.A02
            java.lang.String r5 = r2.A00
            if (r9 == 0) goto L_0x070d
            if (r5 == 0) goto L_0x070d
            X.00s r0 = r10.A00
            X.C36341k9.A16(r0, r7)
            X.1EU r1 = r10.A07
            java.lang.String r0 = "custom_payment_method_linking"
            X.1EY r1 = r1.A02(r0)
            java.lang.String r0 = "custom_payment_method_tos"
            boolean r0 = r1.A0G(r0)
            java.lang.String r4 = r2.A01
            if (r0 == 0) goto L_0x06f2
            com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel.A01(r10, r4, r9, r5)
        L_0x06e5:
            java.lang.Integer r1 = X.C36371kC.A0o()
            com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel r0 = r8.A05
            if (r0 != 0) goto L_0x0718
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r11)
            throw r0
        L_0x06f2:
            X.1Vk r3 = r10.A06
            X.2l2 r0 = new X.2l2
            r0.<init>()
            java.util.List r2 = X.C36371kC.A11(r0)
            r0 = 0
            X.2lC r1 = new X.2lC
            r1.<init>(r2, r0)
            X.3oG r0 = new X.3oG
            r0.<init>(r10, r4, r9, r5)
            r3.A0E(r0, r1)
            goto L_0x06e5
        L_0x070c:
            r9 = r6
        L_0x070d:
            r10.A0T(r9)
            if (r2 == 0) goto L_0x0714
            java.lang.String r0 = r2.A00
        L_0x0714:
            r10.A0S(r0)
            goto L_0x06e5
        L_0x0718:
            X.00s r0 = r0.A01
            java.lang.Object r0 = r0.A04()
            X.9WG r0 = (X.AnonymousClass9WG) r0
            if (r0 == 0) goto L_0x0724
            java.lang.String r6 = r0.A01
        L_0x0724:
            com.whatsapp.payments.ui.BrazilPaymentMethodAddPixBottomSheet.A03(r8, r1, r6, r7)
            return
        L_0x0728:
            com.whatsapp.newsletter.multiadmin.NewsletterInvitedAdminsFragment r3 = new com.whatsapp.newsletter.multiadmin.NewsletterInvitedAdminsFragment
            r3.<init>()
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            java.lang.String r1 = "invitee_jids"
            java.util.ArrayList r0 = X.AnonymousClass143.A07(r4)
            r2.putStringArrayList(r1, r0)
            r3.A17(r2)
            r0 = 2131433594(0x7f0b187a, float:1.8488978E38)
            r5.A0F(r3, r6, r0)
            r5.A0J(r7)
            r5.A01()
            return
        L_0x074a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r3.A0V(r0)
            return
        L_0x0752:
            X.0wD r0 = r3.A05
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x076a
            java.lang.String r0 = "GoogleMigrateImporterViewModel/no network access"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            X.00s r1 = r3.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0766:
            r1.A0D(r0)
            return
        L_0x076a:
            X.00s r1 = r3.A04
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            goto L_0x0766
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48752hz.A02(android.view.View):void");
    }
}
