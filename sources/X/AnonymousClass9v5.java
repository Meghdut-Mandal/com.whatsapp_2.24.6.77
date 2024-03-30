package X;

import android.view.View;

/* renamed from: X.9v5  reason: invalid class name */
public class AnonymousClass9v5 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass9v5(AnonymousClass1V6 r1, AnonymousClass005 r2, int i) {
        this.A02 = i;
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03ea, code lost:
        if (r0.length() == 0) goto L_0x03ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x06a6, code lost:
        if (r1 == null) goto L_0x06a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0aba, code lost:
        r4.A0b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0abd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0be6, code lost:
        if (r2.A06 != null) goto L_0x0c31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0144, code lost:
        r1 = new android.content.Intent(r0);
        r1.setClass(r3, com.whatsapp.migration.export.service.MessagesExporterService.class);
        r1.putExtra("IS_FIRST_PARTY", false);
        X.C111795cr.A01(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0cc5, code lost:
        r5.A1b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0cc8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0157, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x021d, code lost:
        if (r1 == 0) goto L_0x021f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r20) {
        /*
            r19 = this;
            r6 = r19
            int r0 = r6.A02
            r8 = r20
            switch(r0) {
                case 0: goto L_0x059b;
                case 1: goto L_0x0094;
                case 2: goto L_0x0029;
                case 3: goto L_0x012c;
                case 4: goto L_0x016d;
                case 5: goto L_0x062a;
                case 6: goto L_0x063c;
                case 7: goto L_0x017b;
                case 8: goto L_0x067e;
                case 9: goto L_0x068a;
                case 10: goto L_0x01dd;
                case 11: goto L_0x023a;
                case 12: goto L_0x026f;
                case 13: goto L_0x02d6;
                case 14: goto L_0x06ad;
                case 15: goto L_0x0338;
                case 16: goto L_0x06bd;
                case 17: goto L_0x0383;
                case 18: goto L_0x03d5;
                case 19: goto L_0x041f;
                case 20: goto L_0x0465;
                case 21: goto L_0x0479;
                case 22: goto L_0x048b;
                case 23: goto L_0x049f;
                case 24: goto L_0x04b5;
                case 25: goto L_0x06da;
                case 26: goto L_0x0762;
                case 27: goto L_0x0774;
                case 28: goto L_0x07a2;
                case 29: goto L_0x07b2;
                case 30: goto L_0x07d8;
                case 31: goto L_0x0868;
                case 32: goto L_0x087d;
                case 33: goto L_0x04da;
                case 34: goto L_0x0896;
                case 35: goto L_0x0930;
                case 36: goto L_0x093c;
                case 37: goto L_0x09cb;
                case 38: goto L_0x0a5d;
                case 39: goto L_0x0503;
                case 40: goto L_0x052f;
                case 41: goto L_0x0c99;
                case 42: goto L_0x0abe;
                case 43: goto L_0x0aef;
                case 44: goto L_0x0b0f;
                case 45: goto L_0x0b0f;
                case 46: goto L_0x0b34;
                case 47: goto L_0x0b79;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r4 = r6.A00
            X.7yi r4 = (X.C167737yi) r4
            java.lang.Object r3 = r6.A01
            X.8bC r3 = (X.C175868bC) r3
            X.9gU r9 = r4.A0O
            java.lang.String r2 = "FB"
            java.lang.String r10 = "KYC"
            X.AF3 r0 = r9.A01(r2, r10)
            if (r0 == 0) goto L_0x0582
            java.lang.String r1 = r0.A05
            boolean r0 = r1.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0582
            X.C167737yi.A01(r3, r4, r1)
        L_0x0028:
            return
        L_0x0029:
            java.lang.Object r11 = r6.A00
            com.whatsapp.migration.export.ui.ExportMigrationActivity r11 = (com.whatsapp.migration.export.ui.ExportMigrationActivity) r11
            java.lang.Object r0 = r6.A01
            int r1 = X.AnonymousClass000.A0I(r0)
            r0 = 2
            if (r0 != r1) goto L_0x0044
            java.lang.String r0 = "ExportMigrationActivity/activateContentProviderAndFinishActivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 100
            r11.setResult(r0)
        L_0x0040:
            r11.finish()
            return
        L_0x0044:
            r0 = 4
            if (r0 != r1) goto L_0x0075
            X.68x r2 = r11.A0G
            java.lang.String r1 = r11.A0J
            r0 = 13
            r2.A00(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ExportMigrationActivity/upgradeApp/user-accepted-update; playStoreEnabled: "
            r1.append(r0)
            X.1fu r0 = r11.A00
            boolean r0 = r0.A02()
            r1.append(r0)
            X.C90504aG.A1G(r1)
            X.1fu r0 = r11.A00
            android.net.Uri r0 = r0.A00()
            android.content.Intent r1 = X.C36391kE.A0G(r0)
            X.1Dv r0 = r11.A01
            r0.A06(r11, r1)
            goto L_0x0040
        L_0x0075:
            X.0v0 r0 = r11.A09
            boolean r0 = X.AnonymousClass6Y6.A05(r0)
            if (r0 != 0) goto L_0x05aa
            X.1ei r0 = r11.A07
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0S
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x05aa
            X.0wG r0 = r11.A0A
            android.content.Context r3 = r0.A00
            java.lang.String r0 = "xpm-export-service-startExport()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "ACTION_START_EXPORT"
            goto L_0x0144
        L_0x0094:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MediaViewFragment/onClick/audioClick "
            r1.append(r0)
            java.lang.Object r7 = r6.A00
            android.widget.ProgressBar r7 = (android.widget.ProgressBar) r7
            int r0 = r7.getProgress()
            r1.append(r0)
            java.lang.String r0 = " | "
            r1.append(r0)
            int r0 = r7.getMax()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.Object r2 = r6.A01
            com.whatsapp.mediaview.MediaViewFragment r2 = (com.whatsapp.mediaview.MediaViewFragment) r2
            int r0 = r2.A01
            X.C36321k7.A1Y(r1, r0)
            X.6Tw r0 = r2.A1h
            if (r0 == 0) goto L_0x0028
            int r0 = r2.A01
            r5 = 2
            r3 = 1
            r1 = 0
            if (r0 != r5) goto L_0x00e9
            int r0 = r7.getProgress()
            if (r0 <= 0) goto L_0x00e9
            int r4 = r7.getProgress()
            int r0 = r7.getMax()
            if (r4 >= r0) goto L_0x00e9
            X.3QH r0 = r2.A1i
            r0.A03()
            X.1V6 r0 = r2.A0b
            r0.A04()
            goto L_0x0bdf
        L_0x00e9:
            int r0 = r2.A01
            if (r0 != r5) goto L_0x010a
            X.6Tw r0 = r2.A1h
            int r4 = r0.A02()
            X.6Tw r0 = r2.A1h
            int r0 = r0.A03()
            if (r4 < r0) goto L_0x0bf3
            int r4 = r7.getProgress()
            int r0 = r7.getMax()
            if (r4 != r0) goto L_0x0bf3
            r7.setProgress(r1)
            goto L_0x0be9
        L_0x010a:
            if (r0 != r3) goto L_0x0110
            com.whatsapp.mediaview.MediaViewFragment.A0E(r2)
            return
        L_0x0110:
            int r0 = r2.A03
            X.2bU r0 = com.whatsapp.mediaview.MediaViewFragment.A07(r2, r0)
            X.C18740tg.A06(r0)
            com.whatsapp.mediaview.MediaViewFragment.A0M(r2, r0)
            X.6Tw r0 = r2.A1h
            if (r0 == 0) goto L_0x0028
            X.3QH r0 = r2.A1i
            r0.A03()
            X.1V6 r0 = r2.A0b
            r0.A04()
            goto L_0x0c1a
        L_0x012c:
            java.lang.Object r4 = r6.A00
            com.whatsapp.migration.export.ui.ExportMigrationActivity r4 = (com.whatsapp.migration.export.ui.ExportMigrationActivity) r4
            java.lang.Object r0 = r6.A01
            int r1 = X.AnonymousClass000.A0I(r0)
            r3 = 1
            if (r3 != r1) goto L_0x0158
            X.0wG r0 = r4.A0A
            android.content.Context r3 = r0.A00
            java.lang.String r0 = "xpm-export-service-cancelExport()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "ACTION_CANCEL_EXPORT"
        L_0x0144:
            r2 = 0
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0)
            java.lang.Class<com.whatsapp.migration.export.service.MessagesExporterService> r0 = com.whatsapp.migration.export.service.MessagesExporterService.class
            r1.setClass(r3, r0)
            java.lang.String r0 = "IS_FIRST_PARTY"
            r1.putExtra(r0, r2)
            X.C111795cr.A01(r3, r1)
            return
        L_0x0158:
            r0 = 4
            if (r0 != r1) goto L_0x0028
            r0 = 21
            X.72n r2 = new X.72n
            r2.<init>(r4, r0)
            r1 = 22
            X.72n r0 = new X.72n
            r0.<init>(r4, r1)
            com.whatsapp.migration.export.ui.ExportMigrationActivity.A0F(r4, r2, r0, r3)
            return
        L_0x016d:
            java.lang.Object r0 = r6.A00
            X.4mG r0 = (X.C95774mG) r0
            java.lang.Object r1 = r6.A01
            X.7h8 r0 = r0.A00
            if (r0 == 0) goto L_0x0028
            r0.BZO(r1)
            return
        L_0x017b:
            java.lang.Object r3 = r6.A00
            com.whatsapp.newsletter.ui.ShareNewsletterInviteLinkActivity r3 = (com.whatsapp.newsletter.ui.ShareNewsletterInviteLinkActivity) r3
            java.lang.Object r7 = r6.A01
            X.23s r7 = (X.AnonymousClass23s) r7
            r0 = 1
            X.AnonymousClass00C.A0D(r7, r0)
            X.1dD r6 = r3.A09
            if (r6 == 0) goto L_0x0c56
            X.1Uw r5 = r3.A07
            r4 = 0
            if (r5 != 0) goto L_0x0197
            java.lang.String r0 = "jid"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0197:
            X.2pY r2 = r3.A08
            r1 = 2
            r0 = 4
            r6.A08(r5, r2, r1, r0)
            java.lang.String r0 = "sharenewsletterinvitelinkactivity/sharetostatus/"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0yC r1 = r3.A0D
            r0 = 6445(0x192d, float:9.031E-42)
            boolean r0 = r1.A0E(r0)
            r2 = 0
            if (r0 == 0) goto L_0x01c3
            X.15V r1 = r3.A0N
            r0 = 2131890828(0x7f12128c, float:1.9416359E38)
            r1.A00(r2, r0)
            X.0wU r2 = r3.A04
            r1 = 20
            X.3wV r0 = new X.3wV
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.Boy(r0)
            return
        L_0x01c3:
            java.lang.String r1 = r7.A00
            if (r1 == 0) goto L_0x0028
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0028
            X.190 r0 = r3.A06
            if (r0 == 0) goto L_0x0c4f
            java.lang.Integer r0 = X.C36431kI.A13()
            android.content.Intent r0 = X.AnonymousClass190.A0V(r3, r4, r0, r1)
            r3.startActivity(r0)
            return
        L_0x01dd:
            java.lang.Object r2 = r6.A00
            X.1wX r2 = (X.C41051wX) r2
            java.lang.Object r0 = r6.A01
            X.0D3 r0 = (X.AnonymousClass0D3) r0
            X.C36391kE.A1T(r0)
            int r6 = r0.A04()
            if (r6 < 0) goto L_0x0028
            java.util.List r1 = r2.A08
            int r0 = r1.size()
            if (r6 >= r0) goto L_0x0028
            java.lang.Object r1 = r1.get(r6)
            boolean r0 = r1 instanceof X.C46542Yg
            if (r0 == 0) goto L_0x0028
            X.2Yg r1 = (X.C46542Yg) r1
            if (r1 == 0) goto L_0x0028
            X.4ON r5 = r2.A06
            X.2La r4 = r1.A02
            X.2Yd r5 = (X.C46512Yd) r5
            X.11F r3 = r4.A06()
            boolean r0 = r3 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x0028
            X.1Uw r3 = (X.C28981Uw) r3
            if (r3 == 0) goto L_0x0028
            java.lang.String r0 = r5.A0D
            if (r0 == 0) goto L_0x021f
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0220
        L_0x021f:
            r0 = 1
        L_0x0220:
            r2 = r0 ^ 1
            X.1dD r1 = r5.A3j()
            X.2pY r0 = X.C52512pY.NEWSLETTER_DIRECTORY
            r1.A09(r3, r0, r6, r2)
            X.1uz r0 = r5.A3k()
            r1 = 6
            if (r2 == 0) goto L_0x0234
            r1 = 9
        L_0x0234:
            X.3UC r0 = r0.A08
            r0.A08(r5, r4, r1)
            return
        L_0x023a:
            java.lang.Object r4 = r6.A00
            X.2Yr r4 = (X.C46592Yr) r4
            java.lang.Object r3 = r6.A01
            X.1wX r3 = (X.C41051wX) r3
            java.util.List r0 = X.AnonymousClass0D3.A0I
            r2 = 0
            X.AnonymousClass00C.A0D(r4, r2)
            int r1 = r4.A04()
            r0 = -1
            if (r1 == r0) goto L_0x0028
            X.1RJ r0 = r4.A08
            android.view.View r0 = r0.A01()
            X.AnonymousClass00C.A08(r0)
            r0.setVisibility(r2)
            com.whatsapp.WaImageView r2 = r4.A01
            r0 = 4
            r2.setVisibility(r0)
            int r1 = r4.A04()
            boolean r0 = r2.isSelected()
            r0 = r0 ^ 1
            r3.A0M(r1, r0)
            return
        L_0x026f:
            java.lang.Object r2 = r6.A00
            X.1wF r2 = (X.C40871wF) r2
            java.lang.Object r1 = r6.A01
            X.0D3 r1 = (X.AnonymousClass0D3) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            r5 = 1
            X.AnonymousClass00C.A0D(r1, r5)
            int r1 = r1.A04()
            r0 = -1
            if (r1 == r0) goto L_0x0028
            X.4OQ r4 = r2.A03
            java.util.List r0 = r2.A00
            java.lang.Object r0 = r0.get(r1)
            X.3JH r0 = (X.AnonymousClass3JH) r0
            X.2pt r3 = r0.A01
            com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity r4 = (com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity) r4
            r2 = 0
            X.1wF r1 = r4.A08
            if (r1 == 0) goto L_0x029c
            java.lang.String r0 = r4.A0C
            r1.A0L(r3, r0)
        L_0x029c:
            int r1 = r3.ordinal()
            r0 = 6
            if (r1 == r0) goto L_0x02c8
            r0 = 5
            if (r1 == r0) goto L_0x0c64
            X.0v5 r1 = r4.A03
            if (r1 == 0) goto L_0x0c5d
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x02b3
            r1.A02()
        L_0x02b3:
            r4.A09 = r3
            X.1uz r0 = r4.A3k()
            X.Aue r0 = r0.A00
            if (r0 == 0) goto L_0x02c0
            r0.cancel()
        L_0x02c0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r4.A3t(r0, r2)
            return
        L_0x02c8:
            X.0v5 r1 = r4.A03
            if (r1 == 0) goto L_0x0c68
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x0028
            r1.A02()
            return
        L_0x02d6:
            java.lang.Object r1 = r6.A00
            X.1vZ r1 = (X.C40451vZ) r1
            java.lang.Object r0 = r6.A01
            X.0D3 r0 = (X.AnonymousClass0D3) r0
            X.C36391kE.A1T(r0)
            int r0 = r0.A04()
            com.whatsapp.newsletter.ui.directory.filter.country.CountrySelectorBottomSheet r2 = r1.A03
            java.lang.Object r0 = r1.A0L(r0)
            X.36Z r0 = (X.AnonymousClass36Z) r0
            java.lang.String r1 = r0.A02
            X.AnonymousClass00C.A07(r1)
            X.355 r3 = r2.A04
            if (r3 == 0) goto L_0x0028
            X.2Yd r2 = r3.A00
            java.lang.String r0 = r2.A0C
            boolean r0 = X.AnonymousClass00C.A0J(r0, r1)
            if (r0 != 0) goto L_0x0332
            r2.A0C = r1
            r2.A3n()
            X.1GQ r0 = r2.A3i()
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0327
            androidx.appcompat.widget.Toolbar r0 = r2.A02
            if (r0 == 0) goto L_0x0327
            android.view.Menu r1 = r0.getMenu()
            if (r1 == 0) goto L_0x0327
            r0 = 10002(0x2712, float:1.4016E-41)
            android.view.MenuItem r1 = r1.findItem(r0)
            if (r1 == 0) goto L_0x0327
            r0 = 2131234122(0x7f080d4a, float:1.80844E38)
            r1.setIcon(r0)
        L_0x0327:
            r2.A3o()
            java.lang.Integer r1 = X.C36361kB.A0j()
            r0 = 0
            r2.A3t(r1, r0)
        L_0x0332:
            com.whatsapp.newsletter.ui.directory.filter.country.CountrySelectorBottomSheet r0 = r3.A01
            r0.A1c()
            return
        L_0x0338:
            java.lang.Object r2 = r6.A00
            X.1vt r2 = (X.C40651vt) r2
            java.lang.Object r0 = r6.A01
            X.0D3 r0 = (X.AnonymousClass0D3) r0
            X.C36391kE.A1T(r0)
            int r1 = r0.A04()
            if (r1 < 0) goto L_0x0028
            java.util.List r0 = r2.A00
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x0028
            java.util.List r0 = r2.A00
            java.lang.Object r1 = r0.get(r1)
            boolean r0 = r1 instanceof X.C46542Yg
            if (r0 == 0) goto L_0x0028
            X.2Yg r1 = (X.C46542Yg) r1
            if (r1 == 0) goto L_0x0028
            X.4OR r4 = r2.A03
            X.2La r1 = r1.A02
            com.whatsapp.newsletter.ui.mv.NewsletterSelectToUpgradeMVActivity r4 = (com.whatsapp.newsletter.ui.mv.NewsletterSelectToUpgradeMVActivity) r4
            X.190 r0 = r4.A02
            if (r0 == 0) goto L_0x0c6f
            X.1Uw r3 = r1.A0J()
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.newsletter.ui.mv.NewsletterUpgradeToMVActivity"
            X.C36331k8.A0u(r2, r3, r1, r0)
            r0 = 100
            r4.startActivityForResult(r2, r0)
            r4.finish()
            return
        L_0x0383:
            r0 = 0
            X.AnonymousClass00C.A0D(r8, r0)
            java.lang.Object r7 = r6.A00
            X.1V6 r7 = (X.AnonymousClass1V6) r7
            X.2bi r3 = r7.A01()
            if (r3 == 0) goto L_0x0028
            X.3Qa r0 = r3.A1J
            X.11F r2 = r0.A00
            if (r2 == 0) goto L_0x0028
            java.lang.Object r0 = r6.A01
            X.005 r0 = (X.AnonymousClass005) r0
            java.lang.Object r0 = r0.get()
            X.1V7 r0 = (X.AnonymousClass1V7) r0
            r0.A00 = r3
            r0.A02(r2)
            android.content.Context r6 = r8.getContext()
            X.190 r1 = new X.190
            r1.<init>()
            long r3 = r3.A1N
            r0 = 0
            android.content.Intent r5 = r1.A1Z(r6, r2, r0)
            long r1 = android.os.SystemClock.uptimeMillis()
            java.lang.String r0 = "start_t"
            android.content.Intent r1 = r5.putExtra(r0, r1)
            java.lang.String r0 = "row_id"
            r1.putExtra(r0, r3)
            r6.startActivity(r1)
            X.6zU r1 = r7.A00()
            if (r1 == 0) goto L_0x0028
            int r0 = r1.A03
            int r0 = r0 + 1
            r1.A03 = r0
            return
        L_0x03d5:
            java.lang.Object r7 = r6.A00
            X.54i r7 = (X.C1031954i) r7
            java.lang.Object r5 = r6.A01
            com.whatsapp.payments.ui.BusinessHubActivity r5 = (com.whatsapp.payments.ui.BusinessHubActivity) r5
            r4 = 0
            java.lang.String r0 = r7.A01()
            if (r0 == 0) goto L_0x03ec
            int r0 = r0.length()
            r3 = 109(0x6d, float:1.53E-43)
            if (r0 != 0) goto L_0x03ee
        L_0x03ec:
            r3 = 110(0x6e, float:1.54E-43)
        L_0x03ee:
            X.00T r1 = r5.A0E
            java.lang.Object r0 = r1.getValue()
            com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel r0 = (com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel) r0
            r2 = 0
            r0.A0S(r3)
            r1.getValue()
            java.lang.String r0 = r7.A01()
            if (r0 != 0) goto L_0x0417
            X.9un r0 = r7.A00
            if (r0 == 0) goto L_0x0028
            X.8bF r1 = r0.A08
            if (r1 == 0) goto L_0x0028
            boolean r0 = r1 instanceof X.C175888bE
            if (r0 == 0) goto L_0x0028
            X.8bE r1 = (X.C175888bE) r1
            if (r1 == 0) goto L_0x0028
            java.lang.String r0 = r1.A0B
            if (r0 == 0) goto L_0x0028
        L_0x0417:
            android.content.Intent r0 = X.AnonymousClass190.A1J(r5, r0, r2, r2, r4)
            r5.startActivity(r0)
            return
        L_0x041f:
            java.lang.Object r5 = r6.A00
            com.whatsapp.payments.ui.ConfirmPaymentFragment r5 = (com.whatsapp.payments.ui.ConfirmPaymentFragment) r5
            java.lang.Object r12 = r6.A01
            X.9un r12 = (X.C207249un) r12
            X.B3P r7 = r5.A0J
            if (r7 == 0) goto L_0x0028
            X.8ax r11 = r5.A0D
            if (r11 == 0) goto L_0x0434
            int r0 = r5.A01
            r11.A09(r0)
        L_0x0434:
            android.widget.ProgressBar r9 = r5.A07
            java.lang.Integer r2 = r5.A0O
            if (r2 == 0) goto L_0x0463
            java.util.List r1 = r5.A0R
            if (r1 == 0) goto L_0x0463
            X.9tD r0 = r5.A0L
            if (r0 == 0) goto L_0x0463
            int r0 = r2.intValue()
            java.lang.Object r4 = r1.get(r0)
            X.9ti r4 = (X.C206629ti) r4
            X.9tD r0 = r5.A0L
            int r3 = r0.A00
            int r2 = r4.A00
            X.9ua r1 = r4.A01
            X.9ua r0 = r4.A02
            X.9uW r10 = new X.9uW
            r10.<init>(r1, r0, r3, r2)
        L_0x045b:
            X.02E r13 = r5.A0I
            com.whatsapp.payments.ui.PaymentBottomSheet r13 = (com.whatsapp.payments.ui.PaymentBottomSheet) r13
            r7.BUD(r8, r9, r10, r11, r12, r13)
            return
        L_0x0463:
            r10 = 0
            goto L_0x045b
        L_0x0465:
            java.lang.Object r0 = r6.A00
            com.whatsapp.payments.ui.ConfirmPaymentFragment r0 = (com.whatsapp.payments.ui.ConfirmPaymentFragment) r0
            java.lang.Object r2 = r6.A01
            com.whatsapp.payments.ui.PaymentBottomSheet r2 = (com.whatsapp.payments.ui.PaymentBottomSheet) r2
            if (r2 == 0) goto L_0x0028
            X.B3P r1 = r0.A0J
            if (r1 == 0) goto L_0x0028
            int r0 = r0.A01
            r1.BcO(r2, r0)
            return
        L_0x0479:
            java.lang.Object r0 = r6.A00
            com.whatsapp.payments.ui.ConfirmPaymentFragment r0 = (com.whatsapp.payments.ui.ConfirmPaymentFragment) r0
            java.lang.Object r1 = r6.A01
            com.whatsapp.payments.ui.PaymentBottomSheet r1 = (com.whatsapp.payments.ui.PaymentBottomSheet) r1
            if (r1 == 0) goto L_0x0028
            X.B3P r0 = r0.A0J
            if (r0 == 0) goto L_0x0028
            r0.BjR(r1)
            return
        L_0x048b:
            java.lang.Object r0 = r6.A00
            com.whatsapp.payments.ui.ConfirmPaymentFragment r0 = (com.whatsapp.payments.ui.ConfirmPaymentFragment) r0
            java.lang.Object r2 = r6.A01
            com.whatsapp.payments.ui.PaymentBottomSheet r2 = (com.whatsapp.payments.ui.PaymentBottomSheet) r2
            if (r2 == 0) goto L_0x0028
            X.B3P r1 = r0.A0J
            if (r1 == 0) goto L_0x0028
            int r0 = r0.A01
            r1.BcZ(r2, r0)
            return
        L_0x049f:
            java.lang.Object r0 = r6.A00
            com.whatsapp.payments.ui.ConfirmPaymentFragment r0 = (com.whatsapp.payments.ui.ConfirmPaymentFragment) r0
            java.lang.Object r3 = r6.A01
            com.whatsapp.payments.ui.PaymentBottomSheet r3 = (com.whatsapp.payments.ui.PaymentBottomSheet) r3
            if (r3 == 0) goto L_0x0028
            X.B3P r2 = r0.A0J
            if (r2 == 0) goto L_0x0028
            int r1 = r0.A00
            int r0 = r0.A01
            r2.BcV(r3, r1, r0)
            return
        L_0x04b5:
            java.lang.Object r2 = r6.A00
            com.whatsapp.payments.ui.ConfirmPaymentFragment r2 = (com.whatsapp.payments.ui.ConfirmPaymentFragment) r2
            java.lang.Object r4 = r6.A01
            com.whatsapp.payments.ui.PaymentBottomSheet r4 = (com.whatsapp.payments.ui.PaymentBottomSheet) r4
            if (r4 == 0) goto L_0x0028
            X.B3P r3 = r2.A0J
            if (r3 == 0) goto L_0x0028
            java.lang.Integer r1 = r2.A0O
            if (r1 == 0) goto L_0x0028
            X.9tD r0 = r2.A0L
            if (r0 == 0) goto L_0x0028
            java.util.List r2 = r2.A0R
            X.C18740tg.A06(r2)
            int r1 = r1.intValue()
            int r0 = r0.A00
            r3.BZF(r4, r2, r1, r0)
            return
        L_0x04da:
            java.lang.Object r3 = r6.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity r3 = (com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity) r3
            java.lang.Object r2 = r6.A01
            android.content.DialogInterface r2 = (android.content.DialogInterface) r2
            r1 = r2
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0 = 0
            r1.setOnDismissListener(r0)
            r2.dismiss()
            X.8lb r3 = r3.A07
            X.9Ml r0 = r3.A06
            if (r0 == 0) goto L_0x0028
            java.lang.String r2 = r3.A0B
            X.3Qa r0 = r3.A07
            X.8rI r1 = new X.8rI
            r1.<init>(r3, r0, r2)
            r3.A04 = r1
            X.0wU r0 = r3.A0h
            X.C36331k8.A1F(r1, r0)
            return
        L_0x0503:
            java.lang.Object r4 = r6.A00
            com.whatsapp.payments.ui.compliance.ConfirmDateOfBirthBottomSheetFragment r4 = (com.whatsapp.payments.ui.compliance.ConfirmDateOfBirthBottomSheetFragment) r4
            java.lang.Object r5 = r6.A01
            androidx.fragment.app.DialogFragment r5 = (androidx.fragment.app.DialogFragment) r5
            android.widget.ProgressBar r0 = r4.A00
            if (r0 == 0) goto L_0x0c76
            int r0 = r0.getVisibility()
            r3 = 1
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            java.lang.String r2 = "enter_dob"
            java.lang.Integer r1 = X.C36371kC.A0n()
            if (r0 == 0) goto L_0x0529
            java.lang.String r0 = "confirm_dob_in_progress_prompt"
            r4.A1a(r1, r0, r2, r3)
        L_0x0525:
            if (r5 == 0) goto L_0x0028
            goto L_0x0cc5
        L_0x0529:
            java.lang.String r0 = "confirm_legal_name_in_progress_prompt"
            r4.A1a(r1, r2, r0, r3)
            goto L_0x0525
        L_0x052f:
            java.lang.Object r5 = r6.A00
            com.whatsapp.payments.ui.compliance.ConfirmLegalNameBottomSheetFragment r5 = (com.whatsapp.payments.ui.compliance.ConfirmLegalNameBottomSheetFragment) r5
            java.lang.Object r4 = r6.A01
            com.whatsapp.payments.ui.PaymentBottomSheet r4 = (com.whatsapp.payments.ui.PaymentBottomSheet) r4
            boolean r3 = X.C36371kC.A1V(r4)
            X.01I r1 = r5.A0h()
            if (r1 == 0) goto L_0x0580
            java.lang.String r0 = "input_method"
            java.lang.Object r1 = r1.getSystemService(r0)
        L_0x0547:
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            if (r1 == 0) goto L_0x0556
            com.whatsapp.wds.components.button.WDSButton r0 = r5.A0E
            if (r0 == 0) goto L_0x0c92
            android.os.IBinder r0 = r0.getWindowToken()
            r1.hideSoftInputFromWindow(r0, r3)
        L_0x0556:
            r2 = 0
            java.lang.String r1 = "confirm_legal_name_in_progress_prompt"
            java.lang.String r0 = "enter_name"
            r5.A1b(r2, r1, r0, r3)
            r5.A1c(r3)
            android.widget.LinearLayout r1 = r5.A01
            if (r1 == 0) goto L_0x0c8b
            r0 = 4
            r1.setVisibility(r0)
            android.widget.ProgressBar r0 = r5.A02
            if (r0 == 0) goto L_0x0c84
            r0.setVisibility(r3)
            X.B1e r1 = r5.A0A
            if (r1 == 0) goto L_0x0028
            com.whatsapp.WaEditText r0 = r5.A05
            if (r0 == 0) goto L_0x0c7d
            java.lang.String r0 = X.C36421kH.A0Z(r0)
            r1.BUa(r4, r0)
            return
        L_0x0580:
            r1 = 0
            goto L_0x0547
        L_0x0582:
            r0 = 3
            X.B9d r1 = new X.B9d
            r1.<init>(r3, r4, r0)
            X.0wG r0 = r4.A0C
            android.content.Context r5 = r0.A00
            X.17Y r6 = r4.A09
            X.1Vk r8 = r4.A0K
            X.1Vu r7 = r4.A0H
            X.9SR r4 = new X.9SR
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r4.A00(r1, r2)
            return
        L_0x059b:
            java.lang.Object r0 = r6.A00
            X.3tR r0 = (X.C79263tR) r0
            java.lang.Object r2 = r6.A01
            X.2bU r2 = (X.AnonymousClass2bU) r2
            com.whatsapp.mediaview.MediaViewFragment r1 = r0.A00
            r0 = 0
            com.whatsapp.mediaview.MediaViewFragment.A0Q(r1, r2, r0, r0)
            return
        L_0x05aa:
            X.68x r2 = r11.A0G
            java.lang.String r1 = r11.A0J
            r0 = 18
            r2.A00(r1, r0)
            X.1eq r0 = r11.A08
            java.util.concurrent.atomic.AtomicLong r0 = r0.A04
            long r0 = r0.get()
            X.1eq r2 = r11.A08
            java.util.concurrent.atomic.AtomicLong r2 = r2.A05
            long r6 = r2.get()
            r5 = -1
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0628
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0628
            r2 = 100
            long r2 = r2 * r0
            long r2 = r2 / r6
            int r4 = (int) r2
        L_0x05d3:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "ExportMigrationActivity/waitingForRestoreToComplete "
            X.C36321k7.A1S(r2, r3, r4)
            r2 = 2131891141(0x7f1213c5, float:1.9416994E38)
            java.lang.String r12 = r11.getString(r2)
            r10 = 1
            if (r4 != r5) goto L_0x05ff
            r0 = 2131891139(0x7f1213c3, float:1.941699E38)
            java.lang.String r0 = r11.getString(r0)
        L_0x05ed:
            X.1qm r4 = X.AnonymousClass3LW.A00(r11)
            r4.A0q(r12)
            r4.A0p(r0)
            r4.A0r(r10)
            X.C165587tf.A17(r4)
            goto L_0x0aba
        L_0x05ff:
            X.0ts r2 = r11.A00
            java.lang.String r3 = X.AnonymousClass3TF.A02(r2, r0)
            r9 = 2131891140(0x7f1213c4, float:1.9416992E38)
            r2 = 3
            java.lang.Object[] r8 = X.C36431kI.A1Z(r3, r2)
            X.0ts r2 = r11.A00
            java.lang.String r2 = X.AnonymousClass3TF.A02(r2, r6)
            r8[r10] = r2
            r5 = 2
            X.0ts r2 = r11.A00
            java.text.NumberFormat r4 = r2.A0N()
            double r2 = (double) r0
            double r0 = (double) r6
            double r2 = r2 / r0
            java.lang.String r0 = r4.format(r2)
            java.lang.String r0 = X.C36391kE.A0v(r11, r0, r8, r5, r9)
            goto L_0x05ed
        L_0x0628:
            r4 = -1
            goto L_0x05d3
        L_0x062a:
            java.lang.Object r1 = r6.A00
            X.5F9 r1 = (X.AnonymousClass5F9) r1
            java.lang.Object r2 = r6.A01
            X.5qb r2 = (X.C119875qb) r2
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.7h9 r1 = r1.A05
            X.141 r0 = r2.A00
            r1.BhE(r0)
            return
        L_0x063c:
            java.lang.Object r2 = r6.A00
            X.1wO r2 = (X.C40961wO) r2
            java.lang.Object r1 = r6.A01
            X.2La r1 = (X.C44072La) r1
            X.C36391kE.A1T(r1)
            com.whatsapp.newsletter.NewsletterInfoActivity r6 = r2.A07
            android.content.Context r0 = r6.getApplicationContext()
            X.1Uw r5 = r2.A06
            java.lang.String r4 = r1.A0K
            java.util.List r3 = r2.A09
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector"
            android.content.Intent r2 = r2.setClassName(r1, r0)
            java.lang.String r1 = X.AnonymousClass143.A03(r5)
            java.lang.String r0 = "jid"
            r2.putExtra(r0, r1)
            java.lang.String r0 = "name"
            r2.putExtra(r0, r4)
            java.util.ArrayList r1 = X.AnonymousClass143.A07(r3)
            java.lang.String r0 = "invited_admins_jids"
            r2.putExtra(r0, r1)
            r0 = 53
            r6.startActivityForResult(r2, r0)
            return
        L_0x067e:
            java.lang.Object r1 = r6.A00
            X.2Yd r1 = (X.C46512Yd) r1
            java.lang.Object r0 = r6.A01
            android.view.MenuItem r0 = (android.view.MenuItem) r0
            r1.onOptionsItemSelected(r0)
            return
        L_0x068a:
            java.lang.Object r1 = r6.A00
            X.2Yq r1 = (X.C46582Yq) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.4OP r3 = r1.A00
            X.2Yd r3 = (X.C46512Yd) r3
            X.1uz r0 = r3.A3k()
            X.00r r0 = r0.A03
            java.lang.Object r0 = r0.A04()
            X.38b r0 = (X.C604938b) r0
            r2 = 0
            if (r0 == 0) goto L_0x06a8
            java.lang.String r1 = r0.A02
            r0 = 1
            if (r1 != 0) goto L_0x06a9
        L_0x06a8:
            r0 = 0
        L_0x06a9:
            r3.A3t(r2, r0)
            return
        L_0x06ad:
            java.lang.Object r2 = r6.A00
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r6.A01
            android.content.Intent r1 = (android.content.Intent) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            r2.startActivity(r1)
            return
        L_0x06bd:
            r0 = 0
            X.AnonymousClass00C.A0D(r8, r0)
            java.lang.Object r2 = r6.A00
            X.1V6 r2 = (X.AnonymousClass1V6) r2
            X.6zU r1 = r2.A00()
            if (r1 == 0) goto L_0x06ce
            r0 = 1
            r1.A0R = r0
        L_0x06ce:
            java.lang.Object r1 = r6.A01
            X.005 r1 = (X.AnonymousClass005) r1
            android.view.View r0 = r8.getRootView()
            X.AnonymousClass3UR.A04(r0, r2, r1)
            return
        L_0x06da:
            java.lang.Object r3 = r6.A00
            com.whatsapp.payments.ui.ConfirmReceivePaymentFragment r3 = (com.whatsapp.payments.ui.ConfirmReceivePaymentFragment) r3
            java.lang.Object r0 = r6.A01
            X.9un r0 = (X.C207249un) r0
            X.02E r4 = r3.A0I
            com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment r3 = (com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment) r3
            java.lang.String r2 = r0.A0A
            X.17Y r5 = r3.A00
            r1 = 2131892184(0x7f1217d8, float:1.941911E38)
            r0 = 0
            r5.A05(r0, r1)
            X.1EV r0 = r3.A0C
            X.0yC r1 = r0.A02
            r0 = 2984(0xba8, float:4.181E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0733
            X.17Y r0 = r3.A00
            r0.A02()
            X.1EU r0 = r3.A03
            X.16S r0 = X.C165617ti.A0O(r0)
            X.9un r0 = r0.A07(r2)
            X.C18740tg.A06(r0)
            X.8bF r5 = r0.A08
            X.8bB r5 = (X.C175858bB) r5
            if (r5 == 0) goto L_0x0733
            java.lang.String r1 = r5.A0F
            java.lang.String r0 = "NEEDS_RETOKENIZATION"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0727
            java.lang.String r0 = "NEEDS_RETOKENIZATION_DELETED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0733
        L_0x0727:
            android.content.Context r0 = r3.A1D()
            android.content.Intent r0 = X.C175858bB.A00(r0, r5, r2)
            r3.A1C(r0)
            return
        L_0x0733:
            X.0wo r9 = r3.A02
            android.content.Context r6 = r3.A1D()
            X.17Y r7 = r3.A00
            X.0wQ r8 = r3.A01
            X.19A r11 = r3.A06
            X.1Vl r1 = r3.A0I
            X.1EU r15 = r3.A03
            X.1Vk r14 = r3.A0B
            X.646 r0 = r3.A0E
            X.16T r10 = r3.A04
            X.6VM r12 = r3.A09
            X.1Vu r13 = r3.A0A
            X.9Ss r5 = new X.9Ss
            r17 = r1
            r18 = r2
            r16 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = 0
            X.B9j r0 = new X.B9j
            r0.<init>(r4, r3, r2, r1)
            r5.A00(r0)
            return
        L_0x0762:
            java.lang.Object r4 = r6.A00
            com.whatsapp.payments.ui.ConfirmReceivePaymentFragment r4 = (com.whatsapp.payments.ui.ConfirmReceivePaymentFragment) r4
            java.lang.Object r3 = r6.A01
            X.3ty r2 = r4.A00
            r1 = 5
            X.B9r r0 = new X.B9r
            r0.<init>(r3, r4, r1)
            r2.A0A(r0)
            return
        L_0x0774:
            java.lang.Object r4 = r6.A00
            X.02E r4 = (X.AnonymousClass02E) r4
            java.lang.Object r3 = r6.A01
            androidx.fragment.app.DialogFragment r3 = (androidx.fragment.app.DialogFragment) r3
            X.01I r0 = r4.A0h()
            android.content.Intent r2 = X.C165597tg.A0F(r0)
            java.lang.String r1 = "screen_name"
            java.lang.String r0 = "brpay_p_add_card"
            r2.putExtra(r1, r0)
            java.util.HashMap r1 = X.AnonymousClass001.A0J()
            java.lang.String r0 = "screen_params"
            r2.putExtra(r0, r1)
            java.lang.String r1 = "onboarding_context"
            java.lang.String r0 = "p2p_context"
            X.C1025050g.A01(r2, r1, r0)
            r4.A1C(r2)
            r3.A1b()
            return
        L_0x07a2:
            java.lang.Object r1 = r6.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r6.A01
            X.9Yc r0 = (X.C196199Yc) r0
            X.0FM r0 = r0.A03(r1)
            r0.show()
            return
        L_0x07b2:
            java.lang.Object r3 = r6.A00
            com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity r3 = (com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity) r3
            java.lang.Object r2 = r6.A01
            android.content.DialogInterface r2 = (android.content.DialogInterface) r2
            r1 = r2
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0 = 0
            r1.setOnDismissListener(r0)
            r2.dismiss()
            X.7yZ r3 = r3.A03
            X.00s r2 = r3.A01
            X.0wG r0 = r3.A04
            android.content.Context r1 = r0.A00
            r0 = 2131893491(0x7f121cf3, float:1.942176E38)
            X.AnonymousClass9IK.A00(r1, r2, r0)
            X.8gR r0 = r3.A0J
            r0.A02()
            return
        L_0x07d8:
            java.lang.Object r0 = r6.A00
            com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity r0 = (com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity) r0
            java.lang.Object r3 = r6.A01
            android.content.DialogInterface r3 = (android.content.DialogInterface) r3
            r2 = r3
            android.app.Dialog r2 = (android.app.Dialog) r2
            r1 = 0
            r2.setOnDismissListener(r1)
            r3.dismiss()
            X.7yZ r4 = r0.A03
            X.17Y r3 = r4.A0B
            r2 = 2131893491(0x7f121cf3, float:1.942176E38)
            r1 = 0
            r3.A05(r1, r2)
            X.9lY r7 = r4.A07
            X.8av r2 = r7.A0A
            boolean r1 = r2 instanceof X.C175928bI
            if (r1 == 0) goto L_0x0866
            X.8bI r2 = (X.C175928bI) r2
            X.9jw r1 = r2.A0G
            if (r1 == 0) goto L_0x0866
            X.9je r6 = r1.A0C
            if (r6 == 0) goto L_0x0866
        L_0x0807:
            X.8gS r11 = r4.A08
            r12 = 1
            X.BAe r8 = new X.BAe
            r8.<init>(r4, r12)
            java.lang.String r1 = "PAY: rejectPayeeMandate called"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.lang.String r1 = "action"
            java.lang.String r4 = "upi-reject-mandate-request"
            X.C36381kD.A1M(r1, r4, r5)
            X.AnonymousClass8gS.A01(r7, r11, r5)
            X.8av r3 = r7.A0A
            X.8bI r3 = (X.C175928bI) r3
            r2 = 0
            r1 = 0
            X.AnonymousClass8gS.A02(r6, r3, r2, r5, r1)
            X.9YX r10 = X.AnonymousClass9I1.A04(r11, r4)
            X.9nx[] r3 = X.AnonymousClass8gS.A03(r7, r11)
            X.1Vk r13 = r11.A01
            X.1AL[] r2 = X.C165577te.A1a(r5, r1)
            java.lang.String r1 = "account"
            X.9nx r15 = X.C203399nx.A05(r1, r2, r3)
            android.content.Context r6 = r11.A00
            X.17Y r7 = r11.A02
            X.1Vu r9 = r11.A06
            X.B7M r5 = new X.B7M
            r5.<init>((android.content.Context) r6, (X.AnonymousClass17Y) r7, (X.C22953Az5) r8, (X.C29221Vu) r9, (X.AnonymousClass9YX) r10, (X.AnonymousClass8gS) r11)
            r17 = 0
            java.lang.String r16 = "set"
            r14 = r5
            r13.A0H(r14, r15, r16, r17)
            X.AF7 r7 = r0.A0S
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            r1 = 105(0x69, float:1.47E-43)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            java.lang.String r11 = r0.A04
            java.lang.String r10 = "decline_mandate_dialogue"
            r7.BOn(r8, r9, r10, r11, r12)
            return
        L_0x0866:
            r6 = 0
            goto L_0x0807
        L_0x0868:
            java.lang.Object r0 = r6.A00
            X.AGR r0 = (X.AGR) r0
            java.lang.Object r4 = r6.A01
            com.whatsapp.payments.ui.PaymentBottomSheet r4 = (com.whatsapp.payments.ui.PaymentBottomSheet) r4
            X.8hw r3 = r0.A06
            r2 = 3
            java.lang.String r1 = "add_credential_prompt"
            r0 = 0
            r3.A4a(r0, r1, r2)
            r4.A1m()
            return
        L_0x087d:
            java.lang.Object r1 = r6.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment r1 = (com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment) r1
            java.lang.Object r0 = r6.A01
            android.view.View r0 = (android.view.View) r0
            X.1Dv r3 = r1.A04
            android.content.Context r2 = r0.getContext()
            java.lang.String r0 = "https://faq.whatsapp.com/general/payments/about-payments-data"
            android.net.Uri r1 = android.net.Uri.parse(r0)
            r0 = 0
            r3.Bp7(r2, r1, r0)
            return
        L_0x0896:
            java.lang.Object r9 = r6.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity r9 = (com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity) r9
            java.lang.Object r4 = r6.A01
            android.view.View r4 = (android.view.View) r4
            X.0yC r3 = r9.A0D
            X.0yW r2 = r9.A0C
            X.0zE r1 = r9.A03
            java.lang.String r0 = "onboarding"
            boolean r0 = X.AnonymousClass6HC.A00(r3, r2, r1, r0)
            r12 = 0
            if (r0 == 0) goto L_0x08b9
            r2 = 2131893758(0x7f121dfe, float:1.9422302E38)
            r1 = 2131893757(0x7f121dfd, float:1.94223E38)
        L_0x08b3:
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r9.BO9(r0, r2, r1)
            return
        L_0x08b9:
            boolean r0 = X.AnonymousClass970.A00()
            if (r0 == 0) goto L_0x08d4
            X.AF7 r4 = r9.A0S
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r2 = 0
            java.lang.String r1 = "upi_payments_unavailable_on_legacy_android_dialog"
            java.lang.String r0 = "tos_page"
            r4.BOm(r3, r2, r1, r0)
            r2 = 2131895297(0x7f122401, float:1.9425423E38)
            r1 = 2131895296(0x7f122400, float:1.942542E38)
            goto L_0x08b3
        L_0x08d4:
            X.8kT r0 = r9.A03
            java.lang.String r1 = "tosAccepted"
            X.0zf r0 = r0.A00
            r0.A08(r1)
            X.AF7 r0 = r9.A0S
            r0.Buu()
            X.67b r0 = r9.A02
            r0.A01()
            r0 = 8
            r4.setVisibility(r0)
            r0 = 2131433000(0x7f0b1628, float:1.8487773E38)
            X.C36341k9.A13(r9, r0, r12)
            X.1Vk r10 = r9.A0M
            r3 = 1
            r1 = 2
            X.19A r4 = r10.A06
            java.lang.String r2 = r4.A09()
            java.util.ArrayList r0 = X.C185988vE.A00
            java.lang.Long r0 = X.C36441kJ.A0y(r1)
            X.8vE r11 = new X.8vE
            r11.<init>(r2, r0)
            X.9nx r1 = r11.A00
            X.0wG r0 = r10.A03
            android.content.Context r6 = r0.A00
            X.17Y r8 = r10.A00
            X.1Vu r7 = r10.A08
            X.B7K r5 = new X.B7K
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.C165577te.A19(r4, r5, r1, r2)
            X.8cT r1 = r9.A08
            java.lang.Integer r0 = X.C36371kC.A0p()
            r1.A07 = r0
            X.C176658cT.A02(r1, r3)
            java.lang.String r0 = r9.A0b
            r1.A0Y = r0
            java.lang.String r0 = r9.A0e
            r1.A0a = r0
            X.C173858Tk.A0r(r1, r9)
            return
        L_0x0930:
            java.lang.Object r1 = r6.A00
            com.whatsapp.payments.ui.IndiaUpiSimPickerDialogFragment r1 = (com.whatsapp.payments.ui.IndiaUpiSimPickerDialogFragment) r1
            java.lang.Object r0 = r6.A01
            android.widget.RadioGroup r0 = (android.widget.RadioGroup) r0
            r1.A1k(r0)
            return
        L_0x093c:
            java.lang.Object r3 = r6.A00
            com.whatsapp.payments.ui.PaymentMerchantUpsellEducationBottomSheet r3 = (com.whatsapp.payments.ui.PaymentMerchantUpsellEducationBottomSheet) r3
            java.lang.Object r5 = r6.A01
            android.content.Context r5 = (android.content.Context) r5
            r2 = 1
            X.1ee r1 = r3.A01
            if (r1 == 0) goto L_0x09c4
            int r0 = r3.A00
            r1.A00(r0)
            r0 = 100
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r3.A00
            java.lang.String r4 = "merchant_payment_upsell_prompt"
            com.whatsapp.payments.ui.PaymentMerchantUpsellEducationBottomSheet.A03(r3, r1, r2, r0)
            int r1 = r3.A00
            if (r1 == 0) goto L_0x099d
            r0 = 6
            if (r1 == r0) goto L_0x0974
            java.lang.String r0 = "Unsupported action"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0967:
            r3.A1b()
            X.1ee r1 = r3.A01
            if (r1 == 0) goto L_0x09af
            int r0 = r3.A00
            r1.A00(r0)
            return
        L_0x0974:
            X.1EU r0 = r3.A04
            if (r0 == 0) goto L_0x09b6
            X.B66 r0 = r0.A05()
            X.9jA r0 = r0.BE1()
            if (r0 == 0) goto L_0x0967
            com.whatsapp.payments.ui.BrazilPaymentMethodAddPixBottomSheet r2 = new com.whatsapp.payments.ui.BrazilPaymentMethodAddPixBottomSheet
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            java.lang.String r0 = "referral_screen"
            r1.putString(r0, r4)
            r2.A17(r1)
            X.01z r1 = r3.A0l()
            java.lang.String r0 = "PaymentMethodAddPixBottomSheet"
            X.C65443Sb.A03(r2, r1, r0)
            goto L_0x0967
        L_0x099d:
            X.1EU r0 = r3.A04
            if (r0 == 0) goto L_0x09bd
            X.B66 r0 = r0.A05()
            X.9jA r0 = r0.BE1()
            if (r0 == 0) goto L_0x0967
            r0.A00(r5, r4)
            goto L_0x0967
        L_0x09af:
            java.lang.String r0 = "merchantEducationManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x09b6:
            java.lang.String r0 = "paymentsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x09bd:
            java.lang.String r0 = "paymentsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x09c4:
            java.lang.String r0 = "merchantEducationManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x09cb:
            java.lang.Object r0 = r6.A00
            X.7zm r0 = (X.C168147zm) r0
            java.lang.Object r4 = r6.A01
            X.9lY r4 = (X.C202319lY) r4
            X.9FD r0 = r0.A00
            com.whatsapp.payments.ui.BrazilPaymentCareTransactionSelectorActivity r3 = r0.A00
            boolean r0 = X.C200899iR.A01(r4)
            if (r0 == 0) goto L_0x0a53
            X.9S7 r1 = new X.9S7
            r1.<init>()
            java.lang.String r0 = "wa_payment_hub_support"
            r1.A04 = r0
            r1.A02 = r4
            X.1FR r0 = r3.A0H
            r1.A03 = r0
            X.16D r0 = r3.A02
            r1.A00 = r0
            X.0ts r0 = r3.A04
            r1.A01 = r0
            r1.A00(r3)
        L_0x09f7:
            X.6Ps r5 = X.C165567td.A0F()
            boolean r0 = X.C200899iR.A01(r4)
            if (r0 == 0) goto L_0x0a50
            java.lang.String r1 = "p2m"
        L_0x0a03:
            java.lang.String r0 = "product_flow"
            r5.A03(r0, r1)
            java.lang.String r1 = r4.A0K
            java.lang.String r0 = "transaction_id"
            r5.A03(r0, r1)
            int r1 = r4.A03
            int r0 = r4.A02
            java.lang.String r1 = X.C203419nz.A03(r1, r0)
            java.lang.String r0 = "transaction_status"
            r5.A03(r0, r1)
            X.0ts r2 = r3.A04
            X.1FR r0 = r3.A0H
            int r1 = r0.A0C(r4)
            android.content.Context r0 = r2.A00
            java.lang.String r1 = X.C36401kF.A0o(r0, r1)
            java.lang.String r0 = "transaction_status_name"
            r5.A03(r0, r1)
            java.lang.String r1 = "hc_entrypoint"
            java.lang.String r0 = "wa_payment_hub_support"
            r5.A03(r1, r0)
            java.lang.String r1 = "consumer"
            java.lang.String r0 = "app_type"
            r5.A03(r0, r1)
            X.B3f r4 = r3.A05
            java.lang.Integer r6 = X.C36361kB.A0i()
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r9 = 0
            java.lang.String r8 = "payment_home"
            r4.BOp(r5, r6, r7, r8, r9)
            return
        L_0x0a50:
            java.lang.String r1 = "p2p"
            goto L_0x0a03
        L_0x0a53:
            X.0wU r1 = r3.A04
            X.2kV r0 = com.whatsapp.payments.ui.BrazilPaymentCareTransactionSelectorActivity.A07(r3)
            X.C36331k8.A1F(r0, r1)
            goto L_0x09f7
        L_0x0a5d:
            java.lang.Object r7 = r6.A00
            com.whatsapp.payments.ui.bottomsheet.IndiaUpiDobPickerBottomSheet r7 = (com.whatsapp.payments.ui.bottomsheet.IndiaUpiDobPickerBottomSheet) r7
            java.lang.Object r0 = r6.A01
            android.widget.DatePicker r0 = (android.widget.DatePicker) r0
            r8 = 0
            r4 = 1
            int r3 = r0.getYear()
            int r2 = r0.getMonth()
            int r1 = r0.getDayOfMonth()
            java.util.GregorianCalendar r0 = new java.util.GregorianCalendar
            r0.<init>(r3, r2, r1)
            java.util.Date r0 = r0.getTime()
            long r2 = r0.getTime()
            android.content.Context r6 = r7.A0a()
            r5 = 2131888182(0x7f120836, float:1.9410992E38)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            X.00T r0 = r7.A03
            java.lang.Object r1 = X.C36381kD.A0p(r0)
            java.text.Format r1 = (java.text.Format) r1
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = r1.format(r0)
            java.lang.String r0 = X.C36351kA.A0x(r6, r0, r4, r8, r5)
            X.1qm r4 = X.AnonymousClass3LW.A04(r7)
            r4.A0p(r0)
            r4.A0r(r8)
            r1 = 2131888180(0x7f120834, float:1.9410988E38)
            X.6Yt r0 = new X.6Yt
            r0.<init>(r7, r2)
            r4.A0h(r0, r1)
            r1 = 2131888181(0x7f120835, float:1.941099E38)
            X.9pR r0 = X.C204089pR.A00
            r4.A0f(r0, r1)
        L_0x0aba:
            r4.A0b()
            return
        L_0x0abe:
            java.lang.Object r0 = r6.A00
            com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity r0 = (com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity) r0
            java.lang.Object r6 = r6.A01
            android.app.Dialog r6 = (android.app.Dialog) r6
            r5 = 1
            X.AnonymousClass00C.A0D(r6, r5)
            java.lang.String r4 = r0.A0e
            if (r4 == 0) goto L_0x0aeb
            X.00T r0 = r0.A0C
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationViewModel r1 = (com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationViewModel) r1
            r0 = 184(0xb8, float:2.58E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.AF7 r2 = r1.A04
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.String r0 = "international_payment_prompt"
            X.8cT r0 = r2.A04(r1, r3, r0, r4)
            r2.BOl(r0)
        L_0x0aeb:
            r6.show()
            return
        L_0x0aef:
            java.lang.Object r1 = r6.A00
            X.A9q r1 = (X.C21130A9q) r1
            java.lang.Object r0 = r6.A01
            java.util.List r0 = (java.util.List) r0
            com.whatsapp.payments.ui.invites.PaymentInviteFragment r2 = r1.A04
            r0.size()
            X.7yC r0 = r2.A02
            r1 = 3
            X.00s r0 = r0.A00
            X.C36341k9.A16(r0, r1)
            java.util.List r0 = r2.A04
            int r1 = r0.size()
            r0 = 0
            r2.A1a(r1, r0)
            return
        L_0x0b0f:
            java.lang.Object r7 = r6.A00
            com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity r7 = (com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity) r7
            java.lang.Object r6 = r6.A01
            android.content.Intent r6 = (android.content.Intent) r6
            r5 = 1
            X.AnonymousClass00C.A0D(r6, r5)
            X.AF7 r4 = r7.A3i()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r2 = X.C36371kC.A0p()
            java.lang.String r1 = X.C36331k8.A0e(r7)
            java.lang.String r0 = "alias_intro"
            r4.BOm(r3, r2, r0, r1)
            r7.A33(r6, r5)
            return
        L_0x0b34:
            java.lang.Object r2 = r6.A00
            X.9Ke r2 = (X.C193189Ke) r2
            java.lang.Object r1 = r6.A01
            X.0D3 r1 = (X.AnonymousClass0D3) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.9IG r6 = r2.A00
            int r5 = r1.A04()
            X.7zX r4 = r6.A01
            int r2 = r4.A00
            java.util.List r3 = r4.A03
            java.lang.Object r1 = r3.get(r2)
            X.9Ke r1 = (X.C193189Ke) r1
            r0 = 0
            r1.A02 = r0
            r4.A07(r2)
            r4.A00 = r5
            java.lang.Object r1 = r3.get(r5)
            X.9Ke r1 = (X.C193189Ke) r1
            r0 = 1
            r1.A02 = r0
            r4.A07(r5)
            com.whatsapp.payments.ui.InstallmentBottomSheetFragment r2 = r6.A00
            java.lang.Object r1 = r3.get(r5)
            X.9Ke r1 = (X.C193189Ke) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.A04 = r0
            r2.A03 = r1
            return
        L_0x0b79:
            java.lang.Object r1 = r6.A00
            X.0D3 r1 = (X.AnonymousClass0D3) r1
            java.lang.Object r0 = r6.A01
            X.9Mk r0 = (X.C193679Mk) r0
            X.9IH r0 = r0.A04
            int r4 = r1.A04()
            X.7zc r3 = r0.A01
            X.9FS r2 = r0.A00
            r6 = 0
        L_0x0b8c:
            java.util.List r5 = r3.A03
            int r0 = r5.size()
            if (r6 >= r0) goto L_0x0ba9
            java.lang.Object r0 = r5.get(r6)
            X.9Mk r0 = (X.C193679Mk) r0
            X.9tH r0 = r0.A03
            java.lang.String r1 = r0.A0A
            java.lang.String r0 = r3.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0baa
            int r6 = r6 + 1
            goto L_0x0b8c
        L_0x0ba9:
            r6 = -1
        L_0x0baa:
            java.lang.Object r1 = r5.get(r6)
            X.9Mk r1 = (X.C193679Mk) r1
            r0 = 0
            r1.A00 = r0
            r3.A07(r6)
            java.lang.Object r0 = r5.get(r4)
            X.9Mk r0 = (X.C193679Mk) r0
            X.9tH r0 = r0.A03
            java.lang.String r0 = r0.A0A
            r3.A00 = r0
            java.lang.Object r1 = r5.get(r4)
            X.9Mk r1 = (X.C193679Mk) r1
            r0 = 1
            r1.A00 = r0
            r3.A07(r4)
            java.lang.String r3 = r3.A00
            com.whatsapp.payments.ui.orderdetails.PaymentOptionsBottomSheet r2 = r2.A00
            r2.A06 = r3
            r0 = 84
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1
            com.whatsapp.payments.ui.orderdetails.PaymentOptionsBottomSheet.A05(r2, r1, r3, r0)
            return
        L_0x0bdf:
            X.6Tw r0 = r2.A1h     // Catch:{ IOException -> 0x0c07 }
            r0.A08()     // Catch:{ IOException -> 0x0c07 }
            android.os.Handler r0 = r2.A06
            if (r0 == 0) goto L_0x0c36
            goto L_0x0c31
        L_0x0be9:
            X.6Tw r0 = r2.A1h     // Catch:{ IOException | IllegalStateException -> 0x0bef }
            r0.A0A(r1)     // Catch:{ IOException | IllegalStateException -> 0x0bef }
            goto L_0x0bf3
        L_0x0bef:
            r1 = move-exception
            java.lang.String r0 = "MediaViewFragment/onClick/failed to start from beginning reset pause"
            goto L_0x0c0a
        L_0x0bf3:
            X.3QH r0 = r2.A1i
            r0.A03()
            X.1V6 r0 = r2.A0b
            r0.A04()
            X.6Tw r0 = r2.A1h     // Catch:{ IOException -> 0x0c03 }
            r0.A08()     // Catch:{ IOException -> 0x0c03 }
            goto L_0x0c2a
        L_0x0c03:
            r1 = move-exception
            java.lang.String r0 = "MediaViewFragment/onClick/failed to start from beginning no reset pause"
            goto L_0x0c0a
        L_0x0c07:
            r1 = move-exception
            java.lang.String r0 = "MediaViewFragment/onClick/failed to start from mid pause"
        L_0x0c0a:
            com.whatsapp.util.Log.e(r0, r1)
            X.01I r1 = r2.A0i()
            X.14u r1 = (X.C225314u) r1
            r0 = 2131889780(0x7f120e74, float:1.9414233E38)
            r1.BO5(r0)
            return
        L_0x0c1a:
            X.6Tw r0 = r2.A1h     // Catch:{ IOException -> 0x0c3c }
            r0.A08()     // Catch:{ IOException -> 0x0c3c }
            com.whatsapp.mediaview.MediaViewFragment.A0G(r2)
            android.os.Handler r0 = r2.A06
            if (r0 == 0) goto L_0x0c39
            r0.sendEmptyMessage(r1)
            goto L_0x0c39
        L_0x0c2a:
            android.os.Handler r0 = r2.A06
            if (r0 == 0) goto L_0x0c36
            r0.removeMessages(r1)
        L_0x0c31:
            android.os.Handler r0 = r2.A06
            r0.sendEmptyMessage(r1)
        L_0x0c36:
            com.whatsapp.mediaview.MediaViewFragment.A0G(r2)
        L_0x0c39:
            r2.A01 = r3
            return
        L_0x0c3c:
            r1 = move-exception
            java.lang.String r0 = "MediaViewFragment/onClick/failed to start from unknown"
            com.whatsapp.util.Log.e(r0, r1)
            X.01I r1 = r2.A0i()
            X.14u r1 = (X.C225314u) r1
            r0 = 2131889780(0x7f120e74, float:1.9414233E38)
            r1.BO5(r0)
            return
        L_0x0c4f:
            java.lang.String r0 = "waIntents"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0c56:
            java.lang.String r0 = "newsletterLogging"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0c5d:
            java.lang.String r0 = "discoveryOptional"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0c64:
            r4.A3p()
            return
        L_0x0c68:
            java.lang.String r0 = "discoveryOptional"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0c6f:
            java.lang.String r0 = "waIntents"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0c76:
            java.lang.String r0 = "progressBar"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0c7d:
            java.lang.String r0 = "nameEditText"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0c84:
            java.lang.String r0 = "progressBar"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0c8b:
            java.lang.String r0 = "inputContainer"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0c92:
            java.lang.String r0 = "continueButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0c99:
            java.lang.Object r4 = r6.A00
            com.whatsapp.payments.ui.compliance.ConfirmLegalNameBottomSheetFragment r4 = (com.whatsapp.payments.ui.compliance.ConfirmLegalNameBottomSheetFragment) r4
            java.lang.Object r5 = r6.A01
            androidx.fragment.app.DialogFragment r5 = (androidx.fragment.app.DialogFragment) r5
            r3 = 1
            X.AnonymousClass00C.A0D(r5, r3)
            android.widget.ProgressBar r0 = r4.A02
            if (r0 == 0) goto L_0x0ccf
            int r0 = r0.getVisibility()
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            java.lang.String r2 = "enter_name"
            java.lang.Integer r1 = X.C36371kC.A0n()
            if (r0 == 0) goto L_0x0cc9
            java.lang.String r0 = "confirm_legal_name_in_progress_prompt"
            r4.A1b(r1, r0, r2, r3)
        L_0x0cbe:
            X.B1e r0 = r4.A0A
            if (r0 == 0) goto L_0x0cc5
            r0.BT0()
        L_0x0cc5:
            r5.A1b()
            return
        L_0x0cc9:
            java.lang.String r0 = "order_details"
            r4.A1b(r1, r2, r0, r3)
            goto L_0x0cbe
        L_0x0ccf:
            java.lang.String r0 = "progressBar"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9v5.onClick(android.view.View):void");
    }

    public AnonymousClass9v5(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }
}
