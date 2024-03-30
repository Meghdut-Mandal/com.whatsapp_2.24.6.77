package X;

import com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment;

/* renamed from: X.2i4  reason: invalid class name and case insensitive filesystem */
public class C48792i4 extends C33541fX {
    public int A00;
    public Object A01;
    public final int A02;

    public static PrivacyCheckupBaseFragment A00(C48792i4 r1, Object obj) {
        AnonymousClass00C.A0D(obj, 0);
        return (PrivacyCheckupBaseFragment) r1.A01;
    }

    public C48792i4(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x021e, code lost:
        r3 = r1.setClassName(r2, r0);
        X.AnonymousClass00C.A08(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x02b4, code lost:
        r1.A1a(r4, java.lang.Integer.valueOf(r2));
        r0 = r10.getContext();
        r3 = X.C36431kI.A0D();
        r3.setClassName(r0.getPackageName(), "com.whatsapp.privacy.checkup.PrivacyCheckupDetailActivity");
        r3.putExtra("DETAIL_CATEGORY", r2);
        r0 = "ENTRY_POINT";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x02d3, code lost:
        r3.putExtra(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x036c, code lost:
        r3.setClassName(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x036f, code lost:
        X.C36371kC.A16(r3, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0372, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.view.View r10) {
        /*
            r9 = this;
            int r0 = r9.A02
            switch(r0) {
                case 0: goto L_0x0087;
                case 1: goto L_0x0122;
                case 2: goto L_0x01a9;
                case 3: goto L_0x01b5;
                case 4: goto L_0x01e4;
                case 5: goto L_0x0203;
                case 6: goto L_0x0227;
                case 7: goto L_0x0248;
                case 8: goto L_0x0274;
                case 9: goto L_0x0295;
                case 10: goto L_0x029d;
                case 11: goto L_0x02a5;
                case 12: goto L_0x02ad;
                case 13: goto L_0x02d8;
                case 14: goto L_0x030c;
                case 15: goto L_0x032b;
                case 16: goto L_0x034c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r6 = r9.A01
            com.whatsapp.settings.Settings r6 = (com.whatsapp.settings.Settings) r6
            int r0 = r9.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.whatsapp.settings.Settings.A0K(r6, r0)
            android.content.Intent r5 = X.C36431kI.A0D()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.profile.ProfileInfoActivity"
            r5.setClassName(r1, r0)
            boolean r0 = X.C36421kH.A1V(r6)
            r7 = 0
            r4 = 1
            if (r0 != 0) goto L_0x006e
            boolean r0 = r6.A17
            if (r0 == 0) goto L_0x006e
            r0 = 2
            X.00I[] r3 = new X.AnonymousClass00I[r0]
            android.widget.ImageView r2 = r6.A04
            X.3CG r0 = new X.3CG
            r0.<init>(r6)
            r1 = 2131897115(0x7f122b1b, float:1.942911E38)
            android.content.Context r0 = r0.A00
            java.lang.String r0 = X.C36401kF.A0o(r0, r1)
            X.00I r0 = X.C36441kJ.A0W(r2, r0)
            r3[r7] = r0
            com.whatsapp.WaImageView r2 = r6.A0K
            X.3CG r0 = new X.3CG
            r0.<init>(r6)
            r1 = 2131897116(0x7f122b1c, float:1.9429112E38)
            android.content.Context r0 = r0.A00
            java.lang.String r0 = X.C36401kF.A0o(r0, r1)
            X.00I r0 = X.C36441kJ.A0W(r2, r0)
            r3[r4] = r0
        L_0x005a:
            boolean r0 = X.AnonymousClass3U9.A00
            if (r0 == 0) goto L_0x006c
            X.0Gb r0 = X.AnonymousClass0YW.A01(r6, r3)
            android.app.ActivityOptions r0 = r0.A00
            android.os.Bundle r0 = r0.toBundle()
        L_0x0068:
            X.C05290Pd.A00(r6, r5, r0)
        L_0x006b:
            return
        L_0x006c:
            r0 = 0
            goto L_0x0068
        L_0x006e:
            X.00I[] r3 = new X.AnonymousClass00I[r4]
            android.widget.ImageView r2 = r6.A04
            X.3CG r0 = new X.3CG
            r0.<init>(r6)
            r1 = 2131897115(0x7f122b1b, float:1.942911E38)
            android.content.Context r0 = r0.A00
            java.lang.String r0 = X.C36401kF.A0o(r0, r1)
            X.00I r0 = X.C36441kJ.A0W(r2, r0)
            r3[r7] = r0
            goto L_0x005a
        L_0x0087:
            java.lang.Object r1 = r9.A01
            X.1zB r1 = (X.C42661zB) r1
            com.whatsapp.components.button.ThumbnailButton r6 = r1.A01
            r0 = 2131431278(0x7f0b0f6e, float:1.848428E38)
            java.lang.Object r0 = r6.getTag(r0)
            if (r0 == 0) goto L_0x006b
            com.whatsapp.biz.catalog.view.CatalogCarouselDetailImageView r8 = r1.A02
            X.9Y1 r2 = r8.A02
            X.9Sx r1 = X.C36321k7.A03(r2)
            X.C36321k7.A0p(r1, r2)
            java.lang.Integer r0 = X.C36381kD.A0n()
            r1.A06 = r0
            r0 = 25
            X.C36411kG.A1G(r1, r0)
            X.9up r0 = r8.A01
            java.lang.String r0 = r0.A0F
            r1.A0G = r0
            com.whatsapp.jid.UserJid r0 = r8.A08
            r1.A00 = r0
            r2.A03(r1)
            X.9up r0 = r8.A01
            java.lang.String r0 = r0.A0F
            int r7 = r9.A00
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0v(r0)
            java.lang.String r2 = "_"
            java.lang.String r0 = X.AnonymousClass000.A0r(r2, r0, r7)
            r6.setTag(r0)
            android.content.Context r0 = r8.getContext()
            com.whatsapp.jid.UserJid r3 = r8.A08
            android.content.Intent r5 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.CatalogMediaView"
            r5.setClassName(r1, r0)
            java.lang.String r0 = "target_image_index"
            r5.putExtra(r0, r7)
            java.lang.String r1 = r3.getRawString()
            java.lang.String r0 = "cached_jid"
            r5.putExtra(r0, r1)
            X.9up r1 = r8.A01
            java.lang.String r0 = "product"
            r5.putExtra(r0, r1)
            android.content.Context r0 = r8.getContext()
            X.AnonymousClass3U9.A08(r0, r5, r6)
            android.content.Context r4 = r8.getContext()
            android.content.Context r0 = r8.getContext()
            X.3CG r3 = new X.3CG
            r3.<init>(r0)
            X.9up r0 = r8.A01
            java.lang.String r0 = r0.A0F
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0v(r0)
            java.lang.String r2 = X.AnonymousClass000.A0r(r2, r0, r7)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "thumb-transition-"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)
            X.AnonymousClass3U9.A09(r4, r5, r6, r3, r0)
            return
        L_0x0122:
            java.lang.Object r1 = r9.A01
            X.1zB r1 = (X.C42661zB) r1
            com.whatsapp.components.button.ThumbnailButton r5 = r1.A01
            r0 = 2131431278(0x7f0b0f6e, float:1.848428E38)
            java.lang.Object r0 = r5.getTag(r0)
            if (r0 == 0) goto L_0x006b
            com.whatsapp.biz.catalog.view.CatalogCarouselDetailImageView r6 = r1.A02
            X.9Y1 r2 = r6.A02
            X.9Sx r1 = X.C36321k7.A03(r2)
            X.C36321k7.A0p(r1, r2)
            java.lang.Integer r0 = X.C36381kD.A0n()
            r1.A06 = r0
            r0 = 25
            X.C36411kG.A1G(r1, r0)
            X.9up r0 = r6.A01
            java.lang.String r0 = r0.A0F
            r1.A0G = r0
            com.whatsapp.jid.UserJid r0 = r6.A08
            r1.A00 = r0
            r2.A03(r1)
            android.app.Activity r4 = X.C36361kB.A06(r6)
            X.9up r0 = r6.A01
            java.lang.String r0 = r0.A0F
            int r7 = r9.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r0)
            java.lang.String r0 = "_"
            java.lang.String r2 = X.AnonymousClass000.A0r(r0, r1, r7)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "thumb-transition-"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)
            X.C011004s.A08(r5, r0)
            android.content.Context r0 = r6.getContext()
            com.whatsapp.jid.UserJid r3 = r6.A08
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.CatalogImageListActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "image_index"
            r2.putExtra(r0, r7)
            java.lang.String r1 = r3.getRawString()
            java.lang.String r0 = "cached_jid"
            r2.putExtra(r0, r1)
            X.9up r1 = r6.A01
            java.lang.String r0 = "product"
            r2.putExtra(r0, r1)
            java.lang.String r0 = X.C011004s.A03(r5)
            android.os.Bundle r0 = X.AnonymousClass3U9.A05(r4, r5, r0)
            X.C05290Pd.A00(r4, r2, r0)
            return
        L_0x01a9:
            java.lang.Object r1 = r9.A01
            X.1nC r1 = (X.C37781nC) r1
            int r0 = r9.A00
            r1.A00 = r0
            r1.notifyDataSetChanged()
            return
        L_0x01b5:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r1 = A00(r9, r10)
            int r4 = r9.A00
            java.lang.Integer r0 = X.C36401kF.A0j()
            r1.A1a(r4, r0)
            r0 = 5
            r1.A1Z(r0, r4)
            X.1NC r0 = r1.A00
            if (r0 == 0) goto L_0x01dd
            android.content.Context r0 = r10.getContext()
            java.lang.String r1 = "read_receipts_enabled"
            android.content.Intent r3 = X.AnonymousClass190.A0D(r0)
            java.lang.String r0 = "target_setting"
            r3.putExtra(r0, r1)
            java.lang.String r0 = "entry_point"
            goto L_0x02d3
        L_0x01dd:
            java.lang.String r0 = "activities"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01e4:
            r3 = 0
            X.AnonymousClass00C.A0D(r10, r3)
            java.lang.Object r2 = r9.A01
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r2 = (com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment) r2
            int r1 = r9.A00
            java.lang.Integer r0 = X.C36401kF.A0i()
            r2.A1a(r1, r0)
            r2.A1Z(r3, r1)
            android.content.Context r2 = r10.getContext()
            android.content.Intent r1 = X.C36431kI.A0D()
            java.lang.String r0 = "com.whatsapp.lastseen.PresencePrivacyActivity"
            goto L_0x021e
        L_0x0203:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r2 = A00(r9, r10)
            int r1 = r9.A00
            java.lang.Integer r0 = X.C36391kE.A0r()
            r2.A1a(r1, r0)
            r0 = 1
            r2.A1Z(r0, r1)
            android.content.Context r2 = r10.getContext()
            android.content.Intent r1 = X.C36431kI.A0D()
            java.lang.String r0 = "com.whatsapp.profile.ProfilePhotoPrivacyActivity"
        L_0x021e:
            android.content.Intent r3 = r1.setClassName(r2, r0)
            X.AnonymousClass00C.A08(r3)
            goto L_0x036f
        L_0x0227:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r2 = A00(r9, r10)
            int r1 = r9.A00
            java.lang.Integer r0 = X.C36401kF.A0h()
            r2.A1a(r1, r0)
            r0 = 6
            r2.A1Z(r0, r1)
            android.content.Context r0 = r10.getContext()
            android.content.Intent r3 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.blocklist.BlockList"
            goto L_0x036c
        L_0x0248:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r2 = A00(r9, r10)
            int r1 = r9.A00
            java.lang.Integer r0 = X.C36381kD.A0n()
            r2.A1a(r1, r0)
            r0 = 10
            r2.A1Z(r0, r1)
            android.content.Context r0 = r10.getContext()
            java.lang.String r2 = "silence_unknown_caller"
            android.content.Intent r3 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsCallingPrivacyActivity"
            r3.setClassName(r1, r0)
            java.lang.String r0 = "target_setting"
            r3.putExtra(r0, r2)
            goto L_0x036f
        L_0x0274:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r2 = A00(r9, r10)
            int r1 = r9.A00
            java.lang.Integer r0 = X.C36371kC.A0p()
            r2.A1a(r1, r0)
            r0 = 3
            r2.A1Z(r0, r1)
            android.content.Context r0 = r10.getContext()
            android.content.Intent r3 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.GroupAddPrivacyActivity"
            goto L_0x036c
        L_0x0295:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r1 = A00(r9, r10)
            int r4 = r9.A00
            r2 = 4
            goto L_0x02b4
        L_0x029d:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r1 = A00(r9, r10)
            int r4 = r9.A00
            r2 = 3
            goto L_0x02b4
        L_0x02a5:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r1 = A00(r9, r10)
            int r4 = r9.A00
            r2 = 2
            goto L_0x02b4
        L_0x02ad:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r1 = A00(r9, r10)
            int r4 = r9.A00
            r2 = 1
        L_0x02b4:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A1a(r4, r0)
            android.content.Context r0 = r10.getContext()
            android.content.Intent r3 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.privacy.checkup.PrivacyCheckupDetailActivity"
            r3.setClassName(r1, r0)
            java.lang.String r0 = "DETAIL_CATEGORY"
            r3.putExtra(r0, r2)
            java.lang.String r0 = "ENTRY_POINT"
        L_0x02d3:
            r3.putExtra(r0, r4)
            goto L_0x036f
        L_0x02d8:
            r0 = 0
            X.AnonymousClass00C.A0D(r10, r0)
            java.lang.Object r3 = r9.A01
            com.whatsapp.privacy.checkup.PrivacyCheckupMorePrivacyFragment r3 = (com.whatsapp.privacy.checkup.PrivacyCheckupMorePrivacyFragment) r3
            int r1 = r9.A00
            java.lang.Integer r0 = X.C36421kH.A0V()
            r3.A1a(r1, r0)
            r0 = 16
            r3.A1Z(r0, r1)
            android.content.Context r2 = r10.getContext()
            X.1Ck r0 = r3.A01
            if (r0 == 0) goto L_0x0305
            X.0v0 r0 = r0.A03
            boolean r1 = r0.A2I()
            r0 = 1
            if (r1 == 0) goto L_0x0300
            r0 = 3
        L_0x0300:
            android.content.Intent r3 = X.AnonymousClass190.A0G(r2, r0)
            goto L_0x036f
        L_0x0305:
            java.lang.String r0 = "encBackupManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x030c:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r2 = A00(r9, r10)
            int r1 = r9.A00
            java.lang.Integer r0 = X.C36421kH.A0U()
            r2.A1a(r1, r0)
            r0 = 12
            r2.A1Z(r0, r1)
            android.content.Context r1 = r10.getContext()
            r0 = 1
            android.content.Intent r3 = X.C36431kI.A0D()
            X.AnonymousClass190.A1T(r1, r3, r0)
            goto L_0x036f
        L_0x032b:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r2 = A00(r9, r10)
            int r1 = r9.A00
            java.lang.Integer r0 = X.C36421kH.A0W()
            r2.A1a(r1, r0)
            r0 = 17
            r2.A1Z(r0, r1)
            android.content.Context r0 = r10.getContext()
            android.content.Intent r3 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.twofactor.SettingsTwoFactorAuthActivity"
            goto L_0x036c
        L_0x034c:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r2 = A00(r9, r10)
            int r1 = r9.A00
            java.lang.Integer r0 = X.C36401kF.A0k()
            r2.A1a(r1, r0)
            r0 = 11
            r2.A1Z(r0, r1)
            android.content.Context r0 = r10.getContext()
            android.content.Intent r3 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.authentication.AppAuthSettingsActivity"
        L_0x036c:
            r3.setClassName(r1, r0)
        L_0x036f:
            X.C36371kC.A16(r3, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48792i4.A02(android.view.View):void");
    }
}
