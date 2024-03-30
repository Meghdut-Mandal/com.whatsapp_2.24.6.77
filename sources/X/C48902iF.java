package X;

import android.view.View;
import com.whatsapp.gallery.MediaGalleryFragmentBase;

/* renamed from: X.2iF  reason: invalid class name and case insensitive filesystem */
public class C48902iF extends C33541fX {
    public Object A00;
    public Object A01;
    public final int A02;

    public C48902iF(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public static void A00(View view, Object obj, Object obj2, int i) {
        view.setOnClickListener(new C48902iF(obj, obj2, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: com.whatsapp.settings.chat.wallpaper.WallpaperCategoriesActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0638, code lost:
        if (r1 != com.whatsapp.R.id.duration_480_min) goto L_0x063a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x083c, code lost:
        r6.startActivityForResult(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x083f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0258, code lost:
        X.C36381kD.A1F(r4, r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x025b, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.view.View r22) {
        /*
            r21 = this;
            r3 = r21
            int r0 = r3.A02
            r2 = r22
            switch(r0) {
                case 0: goto L_0x0324;
                case 1: goto L_0x03ac;
                case 2: goto L_0x03db;
                case 3: goto L_0x03e7;
                case 4: goto L_0x03ef;
                case 5: goto L_0x041f;
                case 6: goto L_0x0482;
                case 7: goto L_0x004d;
                case 8: goto L_0x0065;
                case 9: goto L_0x04aa;
                case 10: goto L_0x0077;
                case 11: goto L_0x0023;
                case 12: goto L_0x04df;
                case 13: goto L_0x0502;
                case 14: goto L_0x063e;
                case 15: goto L_0x0646;
                case 16: goto L_0x064e;
                case 17: goto L_0x0656;
                case 18: goto L_0x0674;
                case 19: goto L_0x0689;
                case 20: goto L_0x00b1;
                case 21: goto L_0x069b;
                case 22: goto L_0x06af;
                case 23: goto L_0x06c5;
                case 24: goto L_0x06ec;
                case 25: goto L_0x00e7;
                case 26: goto L_0x010d;
                case 27: goto L_0x07b0;
                case 28: goto L_0x0706;
                case 29: goto L_0x01a0;
                case 30: goto L_0x01c4;
                case 31: goto L_0x071d;
                case 32: goto L_0x0733;
                case 33: goto L_0x0733;
                case 34: goto L_0x01f1;
                case 35: goto L_0x0223;
                case 36: goto L_0x025c;
                case 37: goto L_0x0275;
                case 38: goto L_0x0294;
                case 39: goto L_0x02f6;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r4 = r3.A01
            X.6Uv r4 = (X.C132686Uv) r4
            X.1N3 r1 = r4.A02
            java.lang.String r0 = "https://www.facebook.com"
            android.net.Uri r0 = r1.A00(r0)
            android.content.Intent r2 = X.C36391kE.A0G(r0)
            X.1Dv r1 = r4.A00
            java.lang.Object r0 = r3.A00
            android.content.Context r0 = (android.content.Context) r0
            r1.A06(r0, r2)
        L_0x0022:
            return
        L_0x0023:
            java.lang.Object r0 = r3.A00
            X.01I r0 = (X.AnonymousClass01I) r0
            X.01z r5 = r0.getSupportFragmentManager()
            java.lang.Object r0 = r3.A01
            java.lang.String r3 = r0.toString()
            java.lang.String r2 = "number"
            r1 = 0
            X.AnonymousClass00C.A0D(r3, r1)
            com.whatsapp.identity.CompareNumberBottomSheet r4 = new com.whatsapp.identity.CompareNumberBottomSheet
            r4.<init>()
            r0 = 1
            X.011[] r0 = new X.AnonymousClass011[r0]
            X.C36341k9.A1J(r2, r3, r0, r1)
            android.os.Bundle r0 = X.C05430Pr.A00(r0)
            r4.A17(r0)
            java.lang.String r0 = "CompareNumberBottomSheet"
            goto L_0x0258
        L_0x004d:
            java.lang.Object r1 = r3.A01
            X.56D r1 = (X.AnonymousClass56D) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.02t r1 = r1.A01
            if (r1 == 0) goto L_0x0022
            java.lang.Object r0 = r3.A00
            X.55w r0 = (X.C1035455w) r0
            X.5zp r0 = r0.A00
            java.lang.String r0 = r0.A00()
            r1.invoke(r0)
            return
        L_0x0065:
            java.lang.Object r0 = r3.A01
            X.1xr r0 = (X.C41841xr) r0
            X.2Ty r2 = r0.A00
            X.4V2 r1 = r2.A08
            if (r1 == 0) goto L_0x0022
            java.lang.Object r0 = r3.A00
            com.whatsapp.gallery.MediaGalleryFragmentBase r0 = (com.whatsapp.gallery.MediaGalleryFragmentBase) r0
            r0.A1e(r1, r2)
            return
        L_0x0077:
            java.lang.Object r5 = r3.A01
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            if (r5 == 0) goto L_0x0022
            java.lang.Object r0 = r3.A00
            X.2VG r0 = (X.AnonymousClass2VG) r0
            X.31r r0 = r0.A08
            com.whatsapp.group.GroupChatInfoActivity r4 = r0.A00
            X.13q r0 = X.AnonymousClass11F.A00
            X.11F r3 = X.C222713q.A00(r5)
            com.whatsapp.status.viewmodels.StatusesViewModel r0 = r4.A1q
            if (r0 == 0) goto L_0x074c
            if (r3 == 0) goto L_0x074c
            X.3Ed r1 = r0.A0S(r5)
            boolean r0 = r4.A24
            boolean r0 = X.AnonymousClass3TM.A03(r1, r0)
            if (r0 == 0) goto L_0x074c
            com.whatsapp.status.viewmodels.StatusesViewModel r2 = r4.A1q
            java.lang.Integer r1 = X.C36381kD.A0n()
            r0 = 0
            r2.A0U(r3, r1, r0)
            r1 = 1
            r0 = 0
            android.content.Intent r0 = X.AnonymousClass190.A0b(r4, r3, r1, r0, r0)
            r4.startActivity(r0)
            return
        L_0x00b1:
            java.lang.Object r0 = r3.A00
            X.2nb r0 = (X.C51302nb) r0
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x075c
            r0 = 2
            if (r1 != r0) goto L_0x0022
            java.lang.Object r3 = r3.A01
            X.014 r3 = (X.AnonymousClass014) r3
            X.1qm r2 = X.AnonymousClass3LW.A00(r3)
            r0 = 2131891505(0x7f121531, float:1.9417732E38)
            r2.A0d(r0)
            r0 = 2131891504(0x7f121530, float:1.941773E38)
            r2.A0c(r0)
            r1 = 2131896389(0x7f122845, float:1.9427638E38)
            X.3b5 r0 = X.C67943b5.A00
            r2.A0l(r3, r0, r1)
            r1 = 2131893503(0x7f121cff, float:1.9421784E38)
            r0 = 41
            X.C39001qm.A06(r3, r2, r0, r1)
            X.C36341k9.A11(r2)
            return
        L_0x00e7:
            java.lang.Object r1 = r3.A00
            X.8pP r1 = (X.C182638pP) r1
            android.app.Activity r4 = X.C36361kB.A06(r1)
            boolean r0 = r4 instanceof X.C225314u
            if (r0 == 0) goto L_0x0022
            java.lang.Object r8 = r3.A01
            X.2by r8 = (X.C46972by) r8
            X.1X7 r9 = r1.A06
            X.17Y r5 = r1.A02
            X.0wN r3 = r1.A01
            X.0wU r11 = r1.A08
            X.1Dv r2 = r1.A00
            X.1TA r7 = r1.A04
            X.14u r4 = (X.C225314u) r4
            X.0yE r6 = r1.A03
            X.13J r10 = r1.A07
            X.C53872s2.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x010d:
            java.lang.Object r0 = r3.A01
            X.0D3 r0 = (X.AnonymousClass0D3) r0
            int r1 = r0.A04()
            java.lang.Object r0 = r3.A00
            X.1wH r0 = (X.C40891wH) r0
            X.35W r2 = r0.A05
            java.util.List r0 = r0.A08
            int r1 = X.C36351kA.A06(r0, r1)
            com.whatsapp.settings.chat.wallpaper.WallpaperCategoriesActivity r6 = r2.A00
            boolean r5 = r2.A01
            r4 = 1
            if (r1 == 0) goto L_0x017f
            if (r1 == r4) goto L_0x017f
            r0 = 2
            if (r1 == r0) goto L_0x0172
            r0 = 3
            if (r1 == r0) goto L_0x0152
            r0 = 4
            if (r1 == r0) goto L_0x077b
            r0 = 5
            if (r1 != r0) goto L_0x0022
            X.11F r3 = r6.A05
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.chat.wallpaper.DefaultWallpaperPreview"
        L_0x0142:
            android.content.Intent r1 = r2.setClassName(r1, r0)
            X.C36341k9.A0t(r1, r3)
            java.lang.String r0 = "is_using_global_wallpaper"
            r1.putExtra(r0, r5)
        L_0x014e:
            r0 = 17
            goto L_0x083c
        L_0x0152:
            X.11F r4 = r6.A05
            r3 = 30
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.gallerypicker.GalleryPickerLauncher"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            X.C36341k9.A0t(r1, r4)
            java.lang.String r0 = "is_using_global_wallpaper"
            r1.putExtra(r0, r5)
            java.lang.String r0 = "media_sharing_user_journey_origin"
            r1.putExtra(r0, r3)
            goto L_0x014e
        L_0x0172:
            X.11F r3 = r6.A05
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.chat.wallpaper.SolidColorWallpaper"
            goto L_0x0142
        L_0x017f:
            X.11F r3 = r6.A05
            if (r1 == 0) goto L_0x0184
            r4 = 0
        L_0x0184:
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            X.C36341k9.A0t(r1, r3)
            java.lang.String r0 = "is_using_global_wallpaper"
            r1.putExtra(r0, r5)
            java.lang.String r0 = "IS_BRIGHT_KEY"
            r1.putExtra(r0, r4)
            goto L_0x014e
        L_0x01a0:
            java.lang.Object r1 = r3.A01
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r1 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r1
            android.content.Context r2 = r1.A1D()
            if (r2 == 0) goto L_0x0022
            java.lang.Object r0 = r3.A00
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            X.3Jw r0 = r0.A0W()
            if (r0 == 0) goto L_0x0022
            com.whatsapp.newsletter.NewsletterLinkLauncher r1 = r1.A0T
            if (r1 == 0) goto L_0x0840
            X.1Uw r3 = r0.A01
            int r0 = r0.A00
            long r6 = (long) r0
            r5 = 3
            X.1Ts r4 = X.C28711Ts.STATUS_HEADER
            r1.A03(r2, r3, r4, r5, r6)
            return
        L_0x01c4:
            java.lang.Object r6 = r3.A01
            X.2fA r6 = (X.C47582fA) r6
            X.3T1 r5 = r6.A05
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageMedia"
            X.AnonymousClass00C.A0E(r5, r0)
            X.2bU r5 = (X.AnonymousClass2bU) r5
            boolean r0 = r5.A1P
            if (r0 != 0) goto L_0x0022
            X.3Qj r0 = X.AnonymousClass2bU.A00(r5)
            int r0 = r0.A09
            r4 = 1
            if (r0 != r4) goto L_0x0847
            int r2 = r5.A1I
            r0 = 2
            r1 = 2131889808(0x7f120e90, float:1.941429E38)
            if (r2 != r0) goto L_0x01e9
            r1 = 2131889807(0x7f120e8f, float:1.9414288E38)
        L_0x01e9:
            java.lang.Object r0 = r3.A00
            X.17Y r0 = (X.AnonymousClass17Y) r0
            r0.A04(r1, r4)
            return
        L_0x01f1:
            java.lang.Object r0 = r3.A00
            X.5LC r0 = (X.AnonymousClass5LC) r0
            com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment r4 = r0.A01
            X.6O1 r2 = r4.A07
            r0 = 16
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1
            r2.A02(r1, r0, r0)
            java.lang.Object r5 = r3.A01
            X.68B r5 = (X.AnonymousClass68B) r5
            boolean r0 = r5.A06
            if (r0 != 0) goto L_0x0022
            X.1AP r3 = r4.A0E
            X.0wU r2 = r3.A0N
            r1 = 4
            X.1jE r0 = new X.1jE
            r0.<init>(r3, r5, r1)
            r2.Boy(r0)
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r4 = r4.A0F
            r6 = 0
            r9 = 2
            r10 = 0
            r8 = r6
            r7 = r6
            r4.A03(r5, r6, r7, r8, r9, r10)
            return
        L_0x0223:
            java.lang.Object r0 = r3.A00
            X.5L8 r0 = (X.AnonymousClass5L8) r0
            com.whatsapp.stickers.store.StickerStoreMyTabFragment r5 = r0.A00
            X.6O1 r4 = r5.A07
            java.lang.Integer r2 = X.C36401kF.A0k()
            r1 = 1
            r0 = 7
            r4.A02(r2, r1, r0)
            X.01z r5 = r5.A0M
            if (r5 == 0) goto L_0x0022
            java.lang.Object r3 = r3.A01
            X.68B r3 = (X.AnonymousClass68B) r3
            com.whatsapp.stickers.store.ConfirmPackDeleteDialogFragment r4 = new com.whatsapp.stickers.store.ConfirmPackDeleteDialogFragment
            r4.<init>()
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            java.lang.String r1 = r3.A0F
            java.lang.String r0 = "pack_id"
            r2.putString(r0, r1)
            java.lang.String r1 = r3.A0H
            java.lang.String r0 = "pack_name"
            r2.putString(r0, r1)
            r4.A17(r2)
            java.lang.String r0 = "confirm_delete"
        L_0x0258:
            X.C36381kD.A1F(r4, r5, r0)
            return
        L_0x025c:
            java.lang.Object r1 = r3.A01
            X.68B r1 = (X.AnonymousClass68B) r1
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x0022
            java.lang.Object r0 = r3.A00
            X.4mp r0 = (X.C96124mp) r0
            com.whatsapp.stickers.store.StickerStoreTabFragment r0 = r0.A01
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r0 = r0.A0F
            r2 = 0
            r5 = 2
            r6 = 1
            r4 = r2
            r3 = r2
            r0.A03(r1, r2, r3, r4, r5, r6)
            return
        L_0x0275:
            java.lang.Object r2 = r3.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r2 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r2
            X.6tS r0 = r2.A0I
            if (r0 == 0) goto L_0x0022
            X.36r r0 = r0.A05
            if (r0 == 0) goto L_0x0022
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "video/mp4"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x086f
            java.lang.String r0 = "image/gif"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x086f
            return
        L_0x0294:
            java.lang.Object r6 = r3.A01
            X.38t r6 = (X.AnonymousClass38t) r6
            X.11F r1 = r6.A00
            if (r1 != 0) goto L_0x02d5
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r0 = r6.A03
            X.0xM r7 = r0.A0B
            long r0 = r6.A02
            X.12P r2 = r7.A0c
            X.1M0 r5 = r2.get()
            X.14e r4 = r5.A02     // Catch:{ all -> 0x08a5 }
            java.lang.String r2 = "SELECT chat_row_id FROM message_view WHERE _id = ?"
            java.lang.String[] r1 = X.C36371kC.A1a(r0)     // Catch:{ all -> 0x08a5 }
            java.lang.String r0 = "GET_CHAT_JID_FROM_MESSAGE_ID"
            android.database.Cursor r2 = r4.A09(r2, r0, r1)     // Catch:{ all -> 0x08a5 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0899 }
            if (r0 == 0) goto L_0x02c6
            X.163 r0 = r7.A0H     // Catch:{ all -> 0x0899 }
            X.11F r1 = r0.A0B(r2)     // Catch:{ all -> 0x0899 }
            r2.close()     // Catch:{ all -> 0x08a5 }
            goto L_0x02ce
        L_0x02c6:
            r2.close()     // Catch:{ all -> 0x08a5 }
            r5.close()
            r1 = 0
            goto L_0x02d1
        L_0x02ce:
            r5.close()
        L_0x02d1:
            r6.A00 = r1
            if (r1 == 0) goto L_0x0022
        L_0x02d5:
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r0 = r6.A03
            X.16D r0 = r0.A03
            X.141 r2 = r0.A08(r1)
            if (r2 == 0) goto L_0x0022
            X.190 r1 = X.C36441kJ.A0j()
            java.lang.Object r0 = r3.A00
            X.1w6 r0 = (X.C40781w6) r0
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r5 = r0.A01
            android.content.Intent r4 = r1.A1W(r5, r2)
            long r1 = r6.A02
            java.lang.String r0 = "row_id"
            r4.putExtra(r0, r1)
            goto L_0x08af
        L_0x02f6:
            java.lang.Object r0 = r3.A01
            X.7fj r0 = (X.C158057fj) r0
            X.3dc r5 = new X.3dc
            r5.<init>(r0)
            X.7ku r0 = r5.B7y()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = r3.A00
            com.whatsapp.wabloks.ui.BkActionBottomSheet r0 = (com.whatsapp.wabloks.ui.BkActionBottomSheet) r0
            X.60P r4 = r0.A00
            X.01z r3 = r0.A0l()
            X.01I r2 = r0.A0h()
            X.01L r2 = (X.AnonymousClass01L) r2
            java.util.Map r1 = r0.A03
            X.5kv r0 = new X.5kv
            r0.<init>(r1)
            X.4zs r0 = r4.A00(r2, r3, r0)
            X.C142326oh.A0B(r0, r5)
            return
        L_0x0324:
            java.lang.Object r0 = r3.A01
            X.3HD r0 = (X.AnonymousClass3HD) r0
            boolean r0 = r0.A0F
            if (r0 == 0) goto L_0x0376
            java.lang.Object r2 = r3.A00
            X.3fk r2 = (X.C70803fk) r2
            X.31v r0 = r2.A3x
            X.0yC r1 = r0.A00
            r0 = 3180(0xc6c, float:4.456E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x0376
            X.11F r0 = r2.A45
            java.lang.String r8 = "group-suspend-appeal"
            X.147 r1 = X.C65533Sl.A01(r0)
            if (r1 == 0) goto L_0x0374
            android.os.Bundle r5 = X.AnonymousClass001.A07()
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.suspendedEntityJid"
            r5.putParcelable(r0, r1)
        L_0x034f:
            X.4V6 r1 = r2.A2l
            X.3DY r3 = r2.A1Y
            X.155 r4 = r1.getActivityNullable()
            X.4V6 r0 = r2.A2l
            X.1CF r0 = r0.getSupportGatingUtils()
            boolean r12 = r0.A00()
            r6 = 0
            r9 = r6
            r10 = r6
            r11 = r6
            r7 = r6
            android.content.Intent r0 = r3.A01(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1.startActivity(r0)
        L_0x036d:
            X.4V6 r1 = r2.A2l
            r0 = 0
            r1.overridePendingTransition(r0, r0)
            return
        L_0x0374:
            r5 = 0
            goto L_0x034f
        L_0x0376:
            java.lang.Object r2 = r3.A00
            X.3fk r2 = (X.C70803fk) r2
            X.0xf r1 = r2.A3o
            X.11F r0 = r2.A45
            boolean r0 = X.AnonymousClass3M3.A01(r1, r0)
            if (r0 != 0) goto L_0x036d
            X.0yC r1 = X.C70803fk.A0H(r2)
            X.11F r0 = r2.A45
            boolean r0 = X.AnonymousClass3RR.A00(r1, r0)
            if (r0 != 0) goto L_0x036d
            X.11F r0 = r2.A45
            boolean r0 = X.AnonymousClass143.A0H(r0)
            if (r0 != 0) goto L_0x036d
            X.155 r1 = X.C70803fk.A0C(r2)
            X.141 r0 = r2.A3Y
            X.11F r0 = r0.A0H
            android.content.Intent r3 = X.C36361kB.A07(r1, r0)
            X.4V6 r1 = r2.A2l
            r0 = 42
            r1.startActivityForResult(r3, r0)
            goto L_0x036d
        L_0x03ac:
            java.lang.Object r5 = r3.A00
            X.2Kd r5 = (X.C43872Kd) r5
            X.1Ew r4 = r5.A01
            java.lang.Object r2 = r3.A01
            X.11F r2 = (X.AnonymousClass11F) r2
            r1 = 1
            X.12q r0 = r4.A04
            X.3Qp r3 = X.C36371kC.A0W(r0, r2)
            if (r3 == 0) goto L_0x03d3
            int r0 = r3.A0B
            if (r0 == r1) goto L_0x03d3
            r3.A0B = r1
            X.1C7 r2 = r4.A02
            r0 = 31
            X.1j7 r1 = new X.1j7
            r1.<init>(r4, r3, r0)
            r0 = 44
            r2.A01(r1, r0)
        L_0x03d3:
            android.view.ViewGroup r1 = r5.A02
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x03db:
            java.lang.Object r1 = r3.A01
            X.3FB r1 = (X.AnonymousClass3FB) r1
            java.lang.Object r0 = r3.A00
            X.4mu r0 = (X.C96174mu) r0
            r1.A00(r0)
            return
        L_0x03e7:
            java.lang.Object r0 = r3.A01
            X.3J6 r0 = (X.AnonymousClass3J6) r0
            r0.A03()
            return
        L_0x03ef:
            java.lang.Object r0 = r3.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r4 = r0.getContext()
            android.content.Context r0 = r0.getContext()
            java.lang.Object r3 = r3.A00
            com.whatsapp.jid.Jid r3 = (com.whatsapp.jid.Jid) r3
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.event.EventsActivity"
            r2.setClassName(r1, r0)
            java.lang.String r1 = r3.getRawString()
            java.lang.String r0 = "chat_jid"
            r2.putExtra(r0, r1)
            r1 = 0
            java.lang.String r0 = "source"
            r2.putExtra(r0, r1)
            r4.startActivity(r2)
            return
        L_0x041f:
            java.lang.String r0 = "android.intent.action.INSERT"
            android.content.Intent r1 = X.C36441kJ.A0I(r0)
            android.net.Uri r0 = android.provider.CalendarContract.Events.CONTENT_URI
            android.content.Intent r4 = r1.setData(r0)
            java.lang.Object r5 = r3.A00
            X.2bT r5 = (X.AnonymousClass2bT) r5
            long r1 = r5.A00
            java.lang.String r0 = "beginTime"
            android.content.Intent r2 = r4.putExtra(r0, r1)
            java.lang.String r1 = r5.A05
            java.lang.String r0 = "title"
            android.content.Intent r4 = r2.putExtra(r0, r1)
            java.lang.Object r3 = r3.A01
            android.view.View r3 = (android.view.View) r3
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            java.lang.String r1 = r5.A03
            if (r1 == 0) goto L_0x0454
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0454
            r2.add(r1)
        L_0x0454:
            java.lang.String r1 = r5.A04
            if (r1 == 0) goto L_0x0461
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0461
            r2.add(r1)
        L_0x0461:
            java.lang.String r0 = "\n\n"
            java.lang.String r1 = X.C36381kD.A0x(r0, r2)
            java.lang.String r0 = "description"
            android.content.Intent r2 = r4.putExtra(r0, r1)
            X.3J7 r0 = r5.A01
            if (r0 == 0) goto L_0x0480
            java.lang.String r1 = r0.A02
        L_0x0473:
            java.lang.String r0 = "eventLocation"
            android.content.Intent r0 = r2.putExtra(r0, r1)
            X.AnonymousClass00C.A08(r0)
            X.C36371kC.A16(r0, r3)
            return
        L_0x0480:
            r1 = 0
            goto L_0x0473
        L_0x0482:
            java.lang.Object r4 = r3.A01
            X.1q7 r4 = (X.C38801q7) r4
            X.190 r2 = r4.getWaIntents()
            android.content.Context r1 = r4.getContext()
            java.lang.Object r0 = r3.A00
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            android.content.Intent r2 = r2.A1c(r1, r0)
            X.AnonymousClass00C.A08(r2)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r2.addFlags(r0)
            X.1Dv r1 = r4.getActivityUtils()
            android.content.Context r0 = r4.getContext()
            r1.A07(r0, r2)
            return
        L_0x04aa:
            X.2NU r5 = new X.2NU
            r5.<init>()
            java.lang.Object r4 = r3.A00
            X.3XU r4 = (X.AnonymousClass3XU) r4
            int r2 = r4.A00
            r1 = 1
            r0 = 0
            if (r2 == r1) goto L_0x04bd
            r0 = 2
            if (r2 != r0) goto L_0x04d4
            r0 = 1
        L_0x04bd:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A00 = r0
            java.lang.Object r1 = r3.A01
            X.59d r1 = (X.C1043159d) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.0yW r0 = r1.A06
            r0.Bly(r5)
            X.4Qe r0 = r1.A08
            r0.BYd(r4)
            return
        L_0x04d4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unexpected provider type "
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0d(r0, r1, r2)
            throw r1
        L_0x04df:
            java.lang.Object r0 = r3.A00
            com.whatsapp.identity.IdentityVerificationActivity r0 = (com.whatsapp.identity.IdentityVerificationActivity) r0
            X.36a r0 = r0.A0D
            X.8QQ r0 = r0.A02
            byte[] r0 = r0.A0o()
            byte[] r0 = X.C196869af.A00(r0)
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0)
            java.lang.Object r1 = r3.A01
            android.content.ClipboardManager r1 = (android.content.ClipboardManager) r1
            java.lang.String r0 = "QR code"
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r0, r2)
            r1.setPrimaryClip(r0)
            return
        L_0x0502:
            java.lang.Object r2 = r3.A00
            X.6Zc r2 = (X.C133586Zc) r2
            java.lang.Object r3 = r3.A01
            X.3Zp r3 = (X.C67383Zp) r3
            X.0yb r0 = r2.A15
            android.location.LocationManager r1 = r0.A0C()
            if (r1 == 0) goto L_0x0529
            java.lang.String r0 = "gps"
            boolean r0 = r1.isProviderEnabled(r0)
            if (r0 != 0) goto L_0x0529
            java.lang.String r0 = "network"
            boolean r0 = r1.isProviderEnabled(r0)
            if (r0 != 0) goto L_0x0529
            X.01L r1 = r2.A0P
            r0 = 2
            X.AnonymousClass3SJ.A01(r1, r0)
            return
        L_0x0529:
            X.3Qc r1 = r2.A14
            r0 = 8
            r1.A03(r0)
            int r1 = r3.A00
            r0 = 2131429716(0x7f0b0954, float:1.8481113E38)
            if (r1 != r0) goto L_0x062e
            r5 = 900(0x384, float:1.261E-42)
        L_0x0539:
            android.location.Location r7 = r2.A05
            r6 = 0
            if (r7 == 0) goto L_0x0549
            float r1 = r7.getAccuracy()
            r0 = 1128792064(0x43480000, float:200.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0549
            r7 = r6
        L_0x0549:
            X.01L r0 = r2.A0P
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r0 = "quoted_message_row_id"
            r3 = 0
            long r0 = r1.getLongExtra(r0, r3)
            X.01L r8 = r2.A0P
            android.content.Intent r9 = r8.getIntent()
            java.lang.String r8 = "quoted_group_jid"
            X.147 r9 = X.C65533Sl.A00(r9, r8)
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 <= 0) goto L_0x0620
            X.3T1 r6 = X.C133586Zc.A02(r2, r0)
        L_0x056b:
            X.11F r11 = r2.A0S
            if (r11 == 0) goto L_0x0602
            X.1X4 r4 = r2.A11
            X.C18740tg.A06(r11)
            X.5yO r0 = r2.A0T
            com.whatsapp.mentions.MentionableEntry r0 = r0.A07
            java.lang.String r10 = r0.getStringText()
            X.5yO r0 = r2.A0T
            com.whatsapp.mentions.MentionableEntry r0 = r0.A07
            java.util.List r9 = r0.getMentions()
            X.01L r0 = r2.A0P
            android.content.Intent r3 = r0.getIntent()
            r1 = 0
            java.lang.String r0 = "has_number_from_url"
            boolean r12 = r3.getBooleanExtra(r0, r1)
            X.19w r0 = r4.A11
            r8 = 1
            X.3Qa r11 = r0.A02(r11, r8)
            X.0wo r13 = r4.A0K
            long r0 = X.C19970wo.A00(r13)
            X.2br r3 = new X.2br
            r3.<init>(r11, r0)
            if (r7 == 0) goto L_0x05b1
            double r0 = r7.getLatitude()
            r3.A00 = r0
            double r0 = r7.getLongitude()
            r3.A01 = r0
        L_0x05b1:
            r3.A02 = r8
            r3.A0n(r8)
            r3.A00 = r5
            r3.A03 = r10
            r3.A18(r9)
            X.1FO r0 = r4.A14
            r0.A00(r3, r6)
            if (r12 == 0) goto L_0x05c8
            r0 = 4
            r3.A0j(r0)
        L_0x05c8:
            r4.A0T(r3)
            X.0xM r15 = r4.A0X
            r0 = 2
            r15.A0m(r3, r0)
            X.0wN r9 = r4.A00
            X.0ww r11 = r4.A06
            X.16J r6 = r4.A0a
            X.13E r5 = r4.A0n
            X.0yE r14 = r4.A0M
            X.19m r10 = r4.A01
            X.1FN r0 = r4.A0b
            X.1P5 r1 = r4.A0o
            X.1G5 r12 = r4.A0I
            X.2ka r8 = new X.2ka
            r17 = r0
            r18 = r5
            r19 = r1
            r20 = r3
            r16 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0 = 15
            r8.A00 = r0
            X.0wG r0 = r4.A0L
            android.content.Context r0 = r0.A00
            com.whatsapp.location.LocationSharingService.A02(r0, r1)
            X.0wU r0 = r4.A1J
            X.C36391kE.A1Q(r8, r0)
        L_0x0602:
            java.lang.String r0 = "CLOSE_ATTACHMENT_TRAY"
            android.content.Intent r1 = X.C36441kJ.A0I(r0)
            X.0wG r0 = r2.A17
            android.content.Context r0 = r0.A00
            X.0YC r0 = X.AnonymousClass0YC.A00(r0)
            r0.A03(r1)
            X.01L r1 = r2.A0P
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.setResult(r0)
            X.01L r0 = r2.A0P
            r0.finish()
            return
        L_0x0620:
            if (r9 == 0) goto L_0x056b
            X.0wo r0 = r2.A16
            long r0 = X.C19970wo.A00(r0)
            X.2c5 r6 = X.C55162uB.A00(r9, r6, r6, r0)
            goto L_0x056b
        L_0x062e:
            r0 = 2131429718(0x7f0b0956, float:1.8481117E38)
            if (r1 == r0) goto L_0x063a
            r0 = 2131429717(0x7f0b0955, float:1.8481115E38)
            r5 = 28800(0x7080, float:4.0357E-41)
            if (r1 == r0) goto L_0x0539
        L_0x063a:
            r5 = 3600(0xe10, float:5.045E-42)
            goto L_0x0539
        L_0x063e:
            java.lang.Object r0 = r3.A01
            android.app.Activity r0 = (android.app.Activity) r0
            X.AnonymousClass3UJ.A06(r0)
            return
        L_0x0646:
            java.lang.Object r0 = r3.A01
            X.7kW r0 = (X.C160137kW) r0
            r0.BQm()
            return
        L_0x064e:
            java.lang.Object r0 = r3.A01
            X.4UT r0 = (X.AnonymousClass4UT) r0
            r0.BQm()
            return
        L_0x0656:
            java.lang.Object r0 = r3.A01
            X.4UT r0 = (X.AnonymousClass4UT) r0
            X.6vv r0 = (X.C146636vv) r0
            X.7kW r4 = r0.A00
            com.whatsapp.mediacomposer.MediaComposerActivity r4 = (com.whatsapp.mediacomposer.MediaComposerActivity) r4
            X.66x r3 = r4.A1O
            X.6VT r0 = r4.A0s
            int r2 = r0.A06()
            java.lang.Integer r1 = X.C36401kF.A0j()
            r0 = 1
            r3.A02(r1, r0, r2)
            com.whatsapp.mediacomposer.MediaComposerActivity.A0k(r4)
            return
        L_0x0674:
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            java.lang.Object r0 = r3.A01
            X.3ES r0 = (X.AnonymousClass3ES) r0
            android.view.View$OnClickListener r0 = r0.A01
            r0.onClick(r2)
            java.lang.Object r0 = r3.A00
            android.widget.PopupWindow r0 = (android.widget.PopupWindow) r0
            r0.dismiss()
            return
        L_0x0689:
            java.lang.Object r0 = r3.A01
            X.5E0 r0 = (X.AnonymousClass5E0) r0
            X.4RB r1 = r0.A01
            java.lang.Object r0 = r3.A00
            X.0D3 r0 = (X.AnonymousClass0D3) r0
            android.content.Context r0 = X.C36441kJ.A0F(r0)
            r1.Bfc(r0)
            return
        L_0x069b:
            java.lang.Object r0 = r3.A01
            X.2Zv r0 = (X.C46642Zv) r0
            X.4Uj r1 = r0.A01
            X.B1o r3 = r0.A02
            java.lang.String r4 = r0.A03
            X.9ua r2 = r0.A00
            java.lang.String r5 = r0.A04
            java.util.List r6 = r0.A05
            r1.BcU(r2, r3, r4, r5, r6)
            return
        L_0x06af:
            java.lang.Object r0 = r3.A00
            X.1wU r0 = (X.C41021wU) r0
            X.1u3 r1 = r0.A08
            java.lang.Object r0 = r3.A01
            X.3uv r0 = (X.C80143uv) r0
            long r2 = r0.A00
            X.1Rs r1 = r1.A07
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A0D(r0)
            return
        L_0x06c5:
            com.whatsapp.languageselector.LanguageSelectorBottomSheet r2 = new com.whatsapp.languageselector.LanguageSelectorBottomSheet
            r2.<init>()
            java.lang.Object r1 = r3.A01
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            X.3nM r0 = new X.3nM
            r0.<init>(r1, r3)
            r2.A05 = r0
            X.3nN r0 = new X.3nN
            r0.<init>(r3)
            r2.A06 = r0
            r1 = 0
            X.3LR r0 = new X.3LR
            r0.<init>(r2, r3, r1)
            r2.A04 = r0
            java.lang.Object r0 = r3.A00
            X.14u r0 = (X.C225314u) r0
            r0.Btm(r2)
            return
        L_0x06ec:
            java.lang.Object r0 = r3.A00
            X.1og r0 = (X.C38391og) r0
            X.2XH r1 = r0.A05
            android.content.Context r2 = r0.getContext()
            java.lang.Object r0 = r3.A01
            X.2bs r0 = (X.C46912bs) r0
            double r5 = r0.A00
            double r7 = r0.A01
            java.lang.String r3 = r0.A01
            java.lang.String r4 = r0.A00
            r1.A08(r2, r3, r4, r5, r7)
            return
        L_0x0706:
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            java.lang.Object r0 = r3.A01
            X.3LJ r0 = (X.AnonymousClass3LJ) r0
            X.1Du r4 = r0.A00
            android.content.Context r2 = X.C36371kC.A0B(r2)
            java.lang.Object r1 = r3.A00
            android.net.Uri r1 = (android.net.Uri) r1
            r0 = 0
            r4.Bp7(r2, r1, r0)
            return
        L_0x071d:
            java.lang.Object r2 = r3.A00
            X.1XY r2 = (X.AnonymousClass1XY) r2
            java.lang.Object r0 = r3.A01
            X.2fA r0 = (X.C47582fA) r0
            X.3T1 r1 = r0.A05
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageMedia"
            X.AnonymousClass00C.A0E(r1, r0)
            X.2bU r1 = (X.AnonymousClass2bU) r1
            r0 = 1
            r2.A06(r1, r0, r0)
            return
        L_0x0733:
            java.lang.Object r2 = r3.A01
            X.3BK r2 = (X.AnonymousClass3BK) r2
            android.view.View r1 = r2.A0B
            r0 = 0
            r1.setVisibility(r0)
            android.view.View r1 = r2.A0B
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            java.lang.Object r0 = r3.A00
            X.2f8 r0 = (X.C47562f8) r0
            X.C47562f8.A01(r0)
            return
        L_0x074c:
            java.lang.Integer r0 = X.C36371kC.A0o()
            X.3Pd r1 = X.C64713Pd.A00(r2, r5, r0)
            X.147 r0 = r4.A1Y
            r1.A01 = r0
            r1.A02(r4)
            return
        L_0x075c:
            java.lang.Object r4 = r3.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r4 = (com.whatsapp.newsletter.NewsletterInfoActivity) r4
            r4.A3u()
            X.1Uw r3 = X.AnonymousClass22g.A0F(r4)
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.newsletter.ui.mv.NewsletterUpgradeToMVActivity"
            X.C36331k8.A0u(r2, r3, r1, r0)
            r4.startActivity(r2)
            r4.finish()
            return
        L_0x077b:
            r0 = 112(0x70, float:1.57E-43)
            X.3L4 r3 = new X.3L4
            r3.<init>(r0)
            r0 = 2131896136(0x7f122748, float:1.9427125E38)
            java.lang.String r1 = r6.getString(r0)
            android.os.Bundle r2 = r3.A00
            java.lang.String r0 = "message"
            r2.putCharSequence(r0, r1)
            r0 = 2131896135(0x7f122747, float:1.9427123E38)
            java.lang.String r1 = r6.getString(r0)
            java.lang.String r0 = "positive_button"
            r2.putString(r0, r1)
            r0 = 2131896389(0x7f122845, float:1.9427638E38)
            java.lang.String r1 = r6.getString(r0)
            java.lang.String r0 = "negative_button"
            r2.putString(r0, r1)
            com.whatsapp.dialogs.PromptDialogFragment r0 = r3.A00()
            r6.Btm(r0)
            return
        L_0x07b0:
            java.lang.Object r0 = r3.A01
            X.0D3 r0 = (X.AnonymousClass0D3) r0
            int r9 = r0.A04()
            java.lang.Object r2 = r3.A00
            X.7zg r2 = (X.C168087zg) r2
            int r1 = r2.getItemViewType(r9)
            r0 = 1
            if (r1 != r0) goto L_0x07c5
            int r9 = r9 + -1
        L_0x07c5:
            X.32y r0 = r2.A01
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity r6 = r0.A00
            java.util.List r0 = r6.A07
            X.C18740tg.A06(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x07d6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x07ea
            java.lang.Object r0 = r1.next()
            java.io.File r0 = (java.io.File) r0
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            r8.add(r0)
            goto L_0x07d6
        L_0x07ea:
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            X.00I r0 = r6.A02
            if (r0 == 0) goto L_0x080c
            java.lang.Object r0 = r0.A00
            X.C18740tg.A06(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            r7.addAll(r0)
            X.00I r0 = r6.A02
            java.lang.Object r0 = r0.A01
            X.C18740tg.A06(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            r5.addAll(r0)
        L_0x080c:
            X.11F r4 = r6.A00
            boolean r3 = r6.A01
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPreviewActivity"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            java.lang.String r0 = "STARTING_POSITION_KEY"
            r1.putExtra(r0, r9)
            java.lang.String r0 = "THUMBNAIL_URIS_KEY"
            r1.putExtra(r0, r8)
            java.lang.String r0 = "WHATSAPP_THUMBNAIL_RES_KEY"
            r1.putExtra(r0, r7)
            java.lang.String r0 = "WHATSAPP_FULL_RES_KEY"
            r1.putExtra(r0, r5)
            X.C36341k9.A0t(r1, r4)
            java.lang.String r0 = "is_using_global_wallpaper"
            r1.putExtra(r0, r3)
            r0 = 111(0x6f, float:1.56E-43)
        L_0x083c:
            r6.startActivityForResult(r1, r0)
            return
        L_0x0840:
            java.lang.String r0 = "newsletterLinkLauncher"
            java.lang.RuntimeException r1 = X.C36331k8.A0d(r0)
            throw r1
        L_0x0847:
            java.lang.String r0 = r5.A07
            if (r0 == 0) goto L_0x085e
            X.1X4 r1 = r6.A02
            android.view.View r0 = r6.A00
            X.C18740tg.A04(r0)
            android.app.Activity r0 = X.C36361kB.A06(r0)
            X.14u r0 = X.C36401kF.A0L(r0)
            r1.A0G(r0, r5, r4)
            return
        L_0x085e:
            java.lang.String r0 = "cannot download media message with no media attached"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r2 = r3.A00
            X.17Y r2 = (X.AnonymousClass17Y) r2
            r1 = 2131890547(0x7f121173, float:1.9415789E38)
            r0 = 0
            r2.A06(r1, r0)
            return
        L_0x086f:
            com.whatsapp.webpagepreview.WebPagePreviewView r1 = r2.A0n
            r0 = 1
            r1.setImageProgressBarVisibility(r0)
            java.lang.Object r1 = r3.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.setVisibility(r0)
            X.0wU r6 = r2.A04
            X.0y0 r5 = r2.A04
            X.6tS r0 = r2.A0I
            X.36r r0 = r0.A05
            java.lang.String r4 = r0.A02
            java.lang.String r2 = r0.A01
            r0 = 2
            X.4Z7 r1 = new X.4Z7
            r1.<init>(r3, r0)
            X.5MI r0 = new X.5MI
            r0.<init>(r5, r1, r4, r2)
            X.C36441kJ.A1E(r0, r6)
            return
        L_0x0899:
            r1 = move-exception
            if (r2 == 0) goto L_0x08a4
            r2.close()     // Catch:{ all -> 0x08a0 }
            goto L_0x08a4
        L_0x08a0:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x08a5 }
        L_0x08a4:
            throw r1     // Catch:{ all -> 0x08a5 }
        L_0x08a5:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x08aa }
            throw r1
        L_0x08aa:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x08af:
            X.1A1 r0 = r5.A0D     // Catch:{ all -> 0x08c7 }
            X.3T1 r3 = X.C36421kH.A0R(r0, r1)     // Catch:{ all -> 0x08c7 }
            long r1 = r3.A1O
            java.lang.String r0 = "sort_id"
            r4.putExtra(r0, r1)
            X.3Qa r0 = r3.A1J
            X.AnonymousClass3UJ.A00(r4, r0)
            X.1Dv r0 = r5.A01
            r0.A07(r5, r4)
            return
        L_0x08c7:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48902iF.A02(android.view.View):void");
    }

    public void onClick(View view) {
        if (8 - this.A02 == 0) {
            AnonymousClass00C.A0D(view, 0);
            AnonymousClass2Ty r3 = ((C41841xr) this.A01).A00;
            AnonymousClass4V2 r2 = r3.A08;
            MediaGalleryFragmentBase mediaGalleryFragmentBase = (MediaGalleryFragmentBase) this.A00;
            if (mediaGalleryFragmentBase.A1i() && r2 != null) {
                mediaGalleryFragmentBase.A1e(r2, r3);
                return;
            }
        }
        super.onClick(view);
    }
}
