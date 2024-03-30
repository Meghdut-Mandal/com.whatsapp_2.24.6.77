package X;

/* renamed from: X.2ui  reason: invalid class name and case insensitive filesystem */
public class C55492ui implements AnonymousClass04S {
    public Object A00;
    public final int A01;

    public C55492ui(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass012 r1, C001600r r2, int i) {
        r2.A08(r1, new C55492ui(r1, i));
    }

    public static void A01(AnonymousClass012 r1, C001600r r2, Object obj, int i) {
        r2.A08(r1, new C55492ui(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x029b, code lost:
        if (r1 != 6) goto L_0x029d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02b4, code lost:
        if (r2.A02.A0a() == false) goto L_0x029d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003d, code lost:
        if (r3.A0D.A0E(4870) == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0412, code lost:
        r3.A02.A0W(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0417, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0163, code lost:
        if (r8.length() != 64) goto L_0x0165;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BTH(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x0262;
                case 1: goto L_0x000b;
                case 8: goto L_0x0019;
                case 9: goto L_0x026a;
                case 10: goto L_0x02c2;
                case 11: goto L_0x010d;
                case 12: goto L_0x014e;
                case 13: goto L_0x02d5;
                case 15: goto L_0x02e6;
                case 16: goto L_0x032b;
                case 17: goto L_0x0335;
                case 40: goto L_0x016a;
                case 41: goto L_0x0360;
                case 42: goto L_0x017f;
                case 43: goto L_0x036e;
                case 44: goto L_0x039d;
                case 45: goto L_0x03ae;
                case 49: goto L_0x03c1;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.A00
            X.C36331k8.A1J(r0, r8)
        L_0x000a:
            return
        L_0x000b:
            java.lang.Object r1 = r7.A00
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            boolean r0 = r1.A12()
            if (r0 == 0) goto L_0x000a
            r1.A1b()
            return
        L_0x0019:
            java.lang.Object r3 = r7.A00
            com.whatsapp.backup.encryptedbackup.EncBackupMainActivity r3 = (com.whatsapp.backup.encryptedbackup.EncBackupMainActivity) r3
            int r6 = X.AnonymousClass000.A0I(r8)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r3.A02
            r1 = 1
            X.00s r0 = r0.A04
            X.C36341k9.A16(r0, r1)
            X.0yC r2 = r3.A0D
            r0 = 5113(0x13f9, float:7.165E-42)
            boolean r0 = r2.A0E(r0)
            r4 = 0
            if (r0 == 0) goto L_0x003f
            X.0yC r2 = r3.A0D
            r0 = 4870(0x1306, float:6.824E-42)
            boolean r0 = r2.A0E(r0)
            r5 = 1
            if (r0 != 0) goto L_0x0040
        L_0x003f:
            r5 = 0
        L_0x0040:
            X.01z r0 = r3.A00
            java.lang.String r2 = java.lang.String.valueOf(r6)
            X.02E r0 = r0.A0N(r2)
            if (r0 != 0) goto L_0x00bd
            r0 = 200(0xc8, float:2.8E-43)
            if (r6 == r0) goto L_0x00db
            r0 = 500(0x1f4, float:7.0E-43)
            if (r6 == r0) goto L_0x046e
            r0 = 502(0x1f6, float:7.03E-43)
            if (r6 == r0) goto L_0x044a
            r0 = 202(0xca, float:2.83E-43)
            if (r6 == r0) goto L_0x043b
            r0 = 203(0xcb, float:2.84E-43)
            if (r6 == r0) goto L_0x0435
            switch(r6) {
                case 102: goto L_0x0418;
                case 103: goto L_0x0426;
                case 104: goto L_0x042c;
                default: goto L_0x0063;
            }
        L_0x0063:
            r2 = 3
            switch(r6) {
                case 300: goto L_0x00c9;
                case 301: goto L_0x040a;
                case 302: goto L_0x0404;
                default: goto L_0x0067;
            }
        L_0x0067:
            switch(r6) {
                case 400: goto L_0x03de;
                case 401: goto L_0x0441;
                case 402: goto L_0x03e4;
                default: goto L_0x006a;
            }
        L_0x006a:
            com.whatsapp.backup.encryptedbackup.EnableInfoFragment r0 = new com.whatsapp.backup.encryptedbackup.EnableInfoFragment
            r0.<init>()
            com.whatsapp.backup.encryptedbackup.EncBackupMainActivity.A07(r3, r0, r6, r1)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r3.A02
            r0.A0W(r1)
            if (r5 == 0) goto L_0x000a
        L_0x0079:
            r0 = 2131434777(0x7f0b1d19, float:1.8491378E38)
            X.C36361kB.A0v(r3, r0)
            r0 = 2131429944(0x7f0b0a38, float:1.8481575E38)
            android.view.View r5 = X.C03570Gk.A0B(r3, r0)
            androidx.appcompat.widget.Toolbar r5 = (androidx.appcompat.widget.Toolbar) r5
            r0 = 2131889107(0x7f120bd3, float:1.9412868E38)
            r5.setTitle((int) r0)
            android.content.res.Resources r2 = r3.getResources()
            int r0 = X.C224314h.A00(r3)
            int r2 = r2.getColor(r0)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            r5.setBackgroundDrawable(r0)
            X.07B r0 = X.C36431kI.A0Q(r3, r5)
            if (r0 == 0) goto L_0x00af
            X.07B r0 = r3.getSupportActionBar()
            r0.A0U(r1)
        L_0x00af:
            r5.setVisibility(r4)
            r0 = 2131430411(0x7f0b0c0b, float:1.8482522E38)
            android.view.View r0 = X.C03570Gk.A0B(r3, r0)
            r0.setPadding(r4, r4, r4, r4)
            return
        L_0x00bd:
            X.01z r0 = r3.A00
            r0.A0n(r2, r4)
            if (r5 == 0) goto L_0x000a
            r0 = 100
            if (r6 != r0) goto L_0x000a
            goto L_0x0079
        L_0x00c9:
            com.whatsapp.backup.encryptedbackup.CreatePasswordFragment r0 = new com.whatsapp.backup.encryptedbackup.CreatePasswordFragment
            r0.<init>()
            com.whatsapp.backup.encryptedbackup.EncBackupMainActivity.A07(r3, r0, r6, r1)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r3.A02
            int r0 = r0.A0S()
            if (r0 != r1) goto L_0x000a
            goto L_0x0412
        L_0x00db:
            com.whatsapp.backup.encryptedbackup.EnableEducationFragment r0 = new com.whatsapp.backup.encryptedbackup.EnableEducationFragment
            r0.<init>()
            com.whatsapp.backup.encryptedbackup.EncBackupMainActivity.A07(r3, r0, r6, r1)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r3.A02
            r0 = 2
            r1.A0W(r0)
            if (r5 == 0) goto L_0x000a
            r0 = 2131430411(0x7f0b0c0b, float:1.8482522E38)
            android.view.View r2 = X.C03570Gk.A0B(r3, r0)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165419(0x7f0700eb, float:1.7945055E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.setPadding(r0, r4, r0, r0)
            r0 = 2131434777(0x7f0b1d19, float:1.8491378E38)
            X.C36391kE.A16(r3, r0, r4)
            r0 = 2131429944(0x7f0b0a38, float:1.8481575E38)
            X.C36361kB.A0v(r3, r0)
            return
        L_0x010d:
            java.lang.Object r4 = r7.A00
            com.whatsapp.backup.encryptedbackup.EncryptionKeyInputFragment r4 = (com.whatsapp.backup.encryptedbackup.EncryptionKeyInputFragment) r4
            int r1 = X.AnonymousClass000.A0I(r8)
            android.content.Context r0 = r4.A1D()
            if (r0 == 0) goto L_0x000a
            r0 = 2
            r3 = 0
            if (r1 != r0) goto L_0x0123
            r4.A1Z(r3)
            return
        L_0x0123:
            r0 = 5
            if (r1 != r0) goto L_0x000a
            r0 = 2131889166(0x7f120c0e, float:1.9412988E38)
            java.lang.String r2 = r4.A0n(r0)
            X.1qm r0 = X.AnonymousClass3LW.A05(r4)
            X.C39001qm.A0A(r0, r2)
            X.C36341k9.A11(r0)
            X.0yb r0 = r4.A05
            X.AnonymousClass3T3.A03(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "encb/EncBackupMainActivity/error modal shown with message: "
            X.C36321k7.A1Q(r0, r2, r1)
            r4.A1Z(r3)
            X.0yb r0 = r4.A05
            X.AnonymousClass3T3.A03(r0)
            return
        L_0x014e:
            java.lang.Object r3 = r7.A00
            com.whatsapp.backup.encryptedbackup.EncryptionKeyInputFragment r3 = (com.whatsapp.backup.encryptedbackup.EncryptionKeyInputFragment) r3
            java.lang.String r8 = (java.lang.String) r8
            android.content.Context r0 = r3.A1D()
            if (r0 == 0) goto L_0x000a
            if (r8 == 0) goto L_0x0165
            int r2 = r8.length()
            r1 = 64
            r0 = 1
            if (r2 == r1) goto L_0x0166
        L_0x0165:
            r0 = 0
        L_0x0166:
            r3.A1Z(r0)
            return
        L_0x016a:
            java.lang.Object r2 = r7.A00
            X.14u r2 = (X.C225314u) r2
            int r0 = X.AnonymousClass000.A0I(r8)
            if (r0 != 0) goto L_0x000a
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryEducationNuxFragment r1 = new com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryEducationNuxFragment
            r1.<init>()
            java.lang.String r0 = "nux_tag"
            r2.Btl(r1, r0)
            return
        L_0x017f:
            java.lang.Object r3 = r7.A00
            com.whatsapp.calling.calllink.view.CallLinkActivity r3 = (com.whatsapp.calling.calllink.view.CallLinkActivity) r3
            X.3XZ r8 = (X.AnonymousClass3XZ) r8
            int r6 = r8.A03
            r4 = 0
            r5 = 1
            boolean r2 = X.AnonymousClass000.A1Q(r6)
            r1 = r2 ^ 1
            android.view.ViewGroup r0 = r3.A00
            r0.setEnabled(r1)
            X.23r r0 = r3.A01
            android.view.View r0 = r0.A00
            r0.setEnabled(r1)
            X.23t r0 = r3.A03
            android.view.View r0 = r0.A00
            r0.setEnabled(r1)
            X.23s r0 = r3.A04
            android.view.View r0 = r0.A00
            r0.setEnabled(r1)
            X.23u r0 = r3.A02
            android.view.View r0 = r0.A00
            r0.setEnabled(r1)
            r3.A2C(r2)
            X.23r r1 = r3.A01
            java.lang.String r2 = r8.A04
            r1.A00 = r2
            X.74i r0 = new X.74i
            r0.<init>(r3, r8, r4)
            r1.A02 = r0
            android.widget.TextView r1 = r3.A01
            int r0 = r8.A00
            X.C36331k8.A0r(r3, r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x021a
            android.widget.TextView r0 = r3.A01
            r0.setText(r2)
        L_0x01d2:
            if (r6 == 0) goto L_0x01fc
            if (r6 == r5) goto L_0x0224
            r0 = 2
            if (r6 == r0) goto L_0x0208
            r0 = 3
            if (r6 != r0) goto L_0x000a
            r1 = 20
            X.2Ff r0 = new X.2Ff
            r0.<init>(r3)
            com.whatsapp.voipcalling.VoipErrorDialogFragment r2 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A05(r0, r1)
            r2.A1g(r4)
            X.01z r0 = r3.getSupportFragmentManager()
            r1 = 0
            r2.A1f(r0, r1)
            android.widget.LinearLayout r0 = r3.A00
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r3.A00
            r0.setOnLongClickListener(r1)
        L_0x01fc:
            android.widget.LinearLayout r0 = r3.A00
            r1 = 0
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r3.A00
            r0.setOnLongClickListener(r1)
            return
        L_0x0208:
            r1 = 19
            X.2Ff r0 = new X.2Ff
            r0.<init>(r3)
            com.whatsapp.voipcalling.VoipErrorDialogFragment r0 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A05(r0, r1)
            r0.A1g(r4)
            X.C36331k8.A12(r0, r3)
            goto L_0x01fc
        L_0x021a:
            int r1 = r8.A01
            if (r1 == 0) goto L_0x01d2
            android.widget.TextView r0 = r3.A01
            r0.setText(r1)
            goto L_0x01d2
        L_0x0224:
            int r0 = r8.A02
            if (r0 == 0) goto L_0x000a
            java.lang.String r1 = r3.getString(r0)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r2
            java.lang.String r2 = java.lang.String.format(r1, r0)
            X.23t r0 = r3.A03
            r0.A02 = r2
            android.view.View r1 = r0.A00
            r0 = 48
            X.C36411kG.A1C(r1, r3, r8, r0)
            X.23s r1 = r3.A04
            r1.A00 = r2
            r4 = 49
            X.74h r0 = new X.74h
            r0.<init>(r3, r8, r4)
            r1.A02 = r0
            android.widget.TextView r2 = r3.A01
            r1 = 2130969984(0x7f040580, float:1.7548665E38)
            r0 = 2131101114(0x7f0605ba, float:1.7814629E38)
            X.C36321k7.A0M(r3, r2, r1, r0)
            android.widget.LinearLayout r0 = r3.A00
            X.C36411kG.A1C(r0, r3, r8, r4)
            android.widget.LinearLayout r0 = r3.A00
            X.AnonymousClass4Y7.A00(r0, r3, r8, r5)
            return
        L_0x0262:
            java.lang.Object r0 = r7.A00
            X.0r3 r0 = (X.C17300r3) r0
            r0.BwE(r8)
            return
        L_0x026a:
            java.lang.Object r2 = r7.A00
            com.whatsapp.backup.encryptedbackup.EncBackupMainActivity r2 = (com.whatsapp.backup.encryptedbackup.EncBackupMainActivity) r2
            int r1 = X.AnonymousClass000.A0I(r8)
            r0 = 2
            if (r1 != r0) goto L_0x02be
            r3 = 2131889202(0x7f120c32, float:1.941306E38)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r2.A02
            int r0 = r0.A0S()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C18740tg.A06(r0)
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x02ba
            r0 = 8
            if (r1 == r0) goto L_0x02b6
            r0 = 10
            if (r1 == r0) goto L_0x02b6
            r0 = 4
            if (r1 == r0) goto L_0x02a2
            r0 = 5
            if (r1 == r0) goto L_0x02ae
            r0 = 6
            if (r1 == r0) goto L_0x02ae
        L_0x029d:
            r0 = 0
            r2.Bu2(r0, r3)
            return
        L_0x02a2:
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r2.A02
            boolean r0 = r0.A0a()
            if (r0 == 0) goto L_0x029d
            r3 = 2131889139(0x7f120bf3, float:1.9412933E38)
            goto L_0x029d
        L_0x02ae:
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r2.A02
            boolean r0 = r0.A0a()
            if (r0 == 0) goto L_0x029d
        L_0x02b6:
            r3 = 2131889186(0x7f120c22, float:1.9413028E38)
            goto L_0x029d
        L_0x02ba:
            r3 = 2131889156(0x7f120c04, float:1.9412968E38)
            goto L_0x029d
        L_0x02be:
            r2.Bnv()
            return
        L_0x02c2:
            java.lang.Object r2 = r7.A00
            android.app.Activity r2 = (android.app.Activity) r2
            int r1 = X.AnonymousClass000.A0I(r8)
            android.content.Intent r0 = X.C36431kI.A0D()
            r2.setResult(r1, r0)
            r2.finish()
            return
        L_0x02d5:
            java.lang.Object r1 = r7.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "restore>RestoreTransferSelectorActivity/Skip confirmed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 3
            r1.setResult(r0)
            r1.finish()
            return
        L_0x02e6:
            java.lang.Object r5 = r7.A00
            X.3dG r5 = (X.C69273dG) r5
            X.3Jv r8 = (X.C63383Jv) r8
            boolean r0 = r8.A03
            r0 = r0 ^ 1
            boolean r4 = r8.A04
            r3 = 0
            r2 = 8
            android.view.View r1 = r5.A0S
            if (r0 == 0) goto L_0x0314
            r1.setVisibility(r3)
            r0 = r4 ^ 1
            r1.setEnabled(r0)
            com.whatsapp.wds.components.actiontile.WDSActionTile r1 = (com.whatsapp.wds.components.actiontile.WDSActionTile) r1
            r0 = 2131893113(0x7f121b79, float:1.9420993E38)
            if (r4 == 0) goto L_0x030b
            r0 = 2131893114(0x7f121b7a, float:1.9420995E38)
        L_0x030b:
            r1.setText((int) r0)
        L_0x030e:
            android.view.View r0 = r5.A00
            X.C69273dG.A01(r0, r5, r2)
            return
        L_0x0314:
            r1.setVisibility(r2)
            X.141 r0 = r5.A0J
            boolean r0 = r0.A0B()
            if (r0 != 0) goto L_0x030e
            X.141 r0 = r5.A0J
            X.141 r0 = r0.A0G
            if (r0 != 0) goto L_0x030e
            android.view.View r0 = r5.A00
            X.C69273dG.A01(r0, r5, r3)
            return
        L_0x032b:
            java.lang.Object r0 = r7.A00
            X.3dG r0 = (X.C69273dG) r0
            java.lang.String r8 = (java.lang.String) r8
            X.C69273dG.A05(r0, r8)
            return
        L_0x0335:
            java.lang.Object r5 = r7.A00
            com.whatsapp.biz.compliance.view.BusinessComplianceDetailActivity r5 = (com.whatsapp.biz.compliance.view.BusinessComplianceDetailActivity) r5
            java.lang.Number r8 = (java.lang.Number) r8
            android.widget.ProgressBar r1 = r5.A01
            int r4 = r8.intValue()
            r3 = 0
            r0 = 8
            if (r4 != 0) goto L_0x0347
            r0 = 0
        L_0x0347:
            r1.setVisibility(r0)
            android.widget.LinearLayout r2 = r5.A00
            r1 = 3
            r0 = 8
            if (r4 != r1) goto L_0x0352
            r0 = 0
        L_0x0352:
            r2.setVisibility(r0)
            androidx.cardview.widget.CardView r1 = r5.A02
            r0 = 1
            if (r4 == r0) goto L_0x035c
            r3 = 8
        L_0x035c:
            r1.setVisibility(r3)
            return
        L_0x0360:
            java.lang.Object r0 = r7.A00
            com.whatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment r0 = (com.whatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment) r0
            java.util.List r8 = (java.util.List) r8
            X.1vi r0 = r0.A01
            r0.A00 = r8
            r0.A06()
            return
        L_0x036e:
            java.lang.Object r5 = r7.A00
            com.whatsapp.calling.calllink.view.CallLinkActivity r5 = (com.whatsapp.calling.calllink.view.CallLinkActivity) r5
            X.3XX r8 = (X.AnonymousClass3XX) r8
            int r0 = r8.A00
            android.graphics.drawable.Drawable r1 = X.AnonymousClass00E.A00(r5, r0)
            if (r1 == 0) goto L_0x0385
            r0 = -1
            X.AnonymousClass076.A06(r1, r0)
            com.whatsapp.WaImageView r0 = r5.A05
            r0.setImageDrawable(r1)
        L_0x0385:
            X.23u r4 = r5.A02
            int r0 = r8.A01
            java.lang.String r3 = r5.getString(r0)
            int r0 = r8.A02
            java.lang.String r2 = r5.getString(r0)
            r1 = 0
            X.3YE r0 = new X.3YE
            r0.<init>(r5, r8, r1)
            r4.A01(r0, r3, r2)
            return
        L_0x039d:
            java.lang.Object r2 = r7.A00
            com.whatsapp.calling.calllink.view.CallLinkActivity r2 = (com.whatsapp.calling.calllink.view.CallLinkActivity) r2
            int r0 = X.AnonymousClass000.A0I(r8)
            X.23t r1 = r2.A03
            java.lang.String r0 = r2.getString(r0)
            r1.A01 = r0
            return
        L_0x03ae:
            java.lang.Object r2 = r7.A00
            android.app.Activity r2 = (android.app.Activity) r2
            int r1 = X.AnonymousClass000.A0I(r8)
            r0 = 2131434041(0x7f0b1a39, float:1.8489885E38)
            android.widget.TextView r0 = X.C36401kF.A0H(r2, r0)
            r0.setText(r1)
            return
        L_0x03c1:
            java.lang.Object r1 = r7.A00
            com.whatsapp.calling.schedulecall.upcomingcalls.view.UpcomingScheduledCallsActivity r1 = (com.whatsapp.calling.schedulecall.upcomingcalls.view.UpcomingScheduledCallsActivity) r1
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            boolean r0 = r1.A06
            if (r0 == 0) goto L_0x03cf
            r0 = 0
            r1.A06 = r0
            return
        L_0x03cf:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x03d8
            r1.finish()
        L_0x03d8:
            X.4mO r0 = r1.A01
            r0.A0M(r8)
            return
        L_0x03de:
            com.whatsapp.backup.encryptedbackup.ConfirmPasswordFragment r0 = new com.whatsapp.backup.encryptedbackup.ConfirmPasswordFragment
            r0.<init>()
            goto L_0x0446
        L_0x03e4:
            com.whatsapp.backup.encryptedbackup.DisableDoneFragment r5 = new com.whatsapp.backup.encryptedbackup.DisableDoneFragment
            r5.<init>()
            X.01z r0 = r3.A00
            if (r0 == 0) goto L_0x03fc
            int r2 = r0.A0I()
            r1 = 0
        L_0x03f2:
            if (r1 >= r2) goto L_0x03fc
            X.01z r0 = r3.A00
            r0.A0V()
            int r1 = r1 + 1
            goto L_0x03f2
        L_0x03fc:
            com.whatsapp.backup.encryptedbackup.EncBackupMainActivity.A07(r3, r5, r6, r4)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r3.A02
            r0 = 8
            goto L_0x046a
        L_0x0404:
            com.whatsapp.backup.encryptedbackup.ConfirmDisableFragment r0 = new com.whatsapp.backup.encryptedbackup.ConfirmDisableFragment
            r0.<init>()
            goto L_0x0446
        L_0x040a:
            com.whatsapp.backup.encryptedbackup.EncryptionKeyInfoFragment r0 = new com.whatsapp.backup.encryptedbackup.EncryptionKeyInfoFragment
            r0.<init>()
            com.whatsapp.backup.encryptedbackup.EncBackupMainActivity.A07(r3, r0, r6, r1)
        L_0x0412:
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r3.A02
            r0.A0W(r2)
            return
        L_0x0418:
            com.whatsapp.backup.encryptedbackup.EnabledLandingFragment r0 = new com.whatsapp.backup.encryptedbackup.EnabledLandingFragment
            r0.<init>()
            com.whatsapp.backup.encryptedbackup.EncBackupMainActivity.A07(r3, r0, r6, r1)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r3.A02
            r0.A0X(r1)
            return
        L_0x0426:
            com.whatsapp.backup.encryptedbackup.RestorePasswordInputFragment r0 = new com.whatsapp.backup.encryptedbackup.RestorePasswordInputFragment
            r0.<init>()
            goto L_0x0446
        L_0x042c:
            com.whatsapp.backup.encryptedbackup.ForcedRegLandingFragment r0 = new com.whatsapp.backup.encryptedbackup.ForcedRegLandingFragment
            r0.<init>()
            com.whatsapp.backup.encryptedbackup.EncBackupMainActivity.A07(r3, r0, r6, r4)
            return
        L_0x0435:
            com.whatsapp.backup.encryptedbackup.EncryptionKeyInputFragment r0 = new com.whatsapp.backup.encryptedbackup.EncryptionKeyInputFragment
            r0.<init>()
            goto L_0x0446
        L_0x043b:
            com.whatsapp.backup.encryptedbackup.VerifyPasswordFragment r0 = new com.whatsapp.backup.encryptedbackup.VerifyPasswordFragment
            r0.<init>()
            goto L_0x0446
        L_0x0441:
            com.whatsapp.backup.encryptedbackup.ConfirmEncryptionKeyFragment r0 = new com.whatsapp.backup.encryptedbackup.ConfirmEncryptionKeyFragment
            r0.<init>()
        L_0x0446:
            com.whatsapp.backup.encryptedbackup.EncBackupMainActivity.A07(r3, r0, r6, r1)
            return
        L_0x044a:
            com.whatsapp.backup.encryptedbackup.ChangePasswordDoneFragment r6 = new com.whatsapp.backup.encryptedbackup.ChangePasswordDoneFragment
            r6.<init>()
            r5 = 502(0x1f6, float:7.03E-43)
            X.01z r0 = r3.A00
            if (r0 == 0) goto L_0x0464
            int r2 = r0.A0I()
            r1 = 0
        L_0x045a:
            if (r1 >= r2) goto L_0x0464
            X.01z r0 = r3.A00
            r0.A0V()
            int r1 = r1 + 1
            goto L_0x045a
        L_0x0464:
            com.whatsapp.backup.encryptedbackup.EncBackupMainActivity.A07(r3, r6, r5, r4)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r3.A02
            r0 = 7
        L_0x046a:
            r1.A0X(r0)
            return
        L_0x046e:
            com.whatsapp.backup.encryptedbackup.EnableDoneFragment r0 = new com.whatsapp.backup.encryptedbackup.EnableDoneFragment
            r0.<init>()
            com.whatsapp.backup.encryptedbackup.EncBackupMainActivity.A07(r3, r0, r6, r1)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r3.A02
            r0 = 4
            r1.A0W(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55492ui.BTH(java.lang.Object):void");
    }
}
