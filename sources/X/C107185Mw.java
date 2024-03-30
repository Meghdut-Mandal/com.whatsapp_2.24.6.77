package X;

import com.whatsapp.R;
import com.whatsapp.stickers.avatars.AvatarStickerPackFlowImpl$stickerPackFlow$1$observer$1$onStickerPackDownloadFailed$1;
import com.whatsapp.stickers.flow.StickerPackFlow;
import com.whatsapp.stickers.stickerpack.StickerPackDownloader;
import com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment;
import com.whatsapp.stickers.store.StickerStoreMyTabFragment;
import com.whatsapp.stickers.store.StickerStoreTabFragment;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5Mw  reason: invalid class name and case insensitive filesystem */
public class C107185Mw extends C132446Tt {
    public final int A00;
    public final AnonymousClass1BB A01;
    public final AnonymousClass1BA A02;
    public final StickerPackDownloader A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final boolean A07;
    public final C20810yC A08;
    public final C21010yW A09;
    public final C23871Ae A0A;
    public final C158517hd A0B;
    public final boolean A0C;

    public static void A00(C111615cZ r14, C107185Mw r15) {
        Object obj;
        C45482Rn r7 = new C45482Rn();
        r7.A04 = Integer.valueOf(r15.A00);
        String str = r15.A06;
        boolean equals = "meta-avatar".equals(str);
        r7.A02 = C36441kJ.A0x(equals);
        r7.A01 = Boolean.valueOf(equals);
        if (equals) {
            r7.A06 = r15.A0A.A02;
        }
        if (r15.A08.A0E(6787)) {
            r7.A03 = Boolean.valueOf(r15.A0C);
        }
        if (r14 instanceof AnonymousClass5KY) {
            AnonymousClass1BB r0 = r15.A01;
            AnonymousClass68B r2 = ((AnonymousClass5KY) r14).A00;
            Iterator A0s = C36361kB.A0s(r0);
            while (A0s.hasNext()) {
                ((C129156Fn) A0s.next()).A07(r2);
            }
            r7.A00 = C36381kD.A0j();
        } else if (r14 instanceof AnonymousClass5KX) {
            AnonymousClass5KX r9 = (AnonymousClass5KX) r14;
            Iterator A0s2 = C36361kB.A0s(r15.A01);
            while (A0s2.hasNext()) {
                C129156Fn r8 = (C129156Fn) A0s2.next();
                if (r8 instanceof C162907pL) {
                    C162907pL r82 = (C162907pL) r8;
                    switch (r82.A02) {
                        case 0:
                            if (!AnonymousClass00C.A0J(str, "meta-avatar")) {
                                break;
                            } else {
                                C124575yQ r5 = (C124575yQ) r82.A01;
                                C36381kD.A1R(r5.A05, new AvatarStickerPackFlowImpl$stickerPackFlow$1$observer$1$onStickerPackDownloadFailed$1(r5, (C023509x) null, (C18000sQ) r82.A00), r5.A06);
                                break;
                            }
                        case 1:
                            StickerPackFlow stickerPackFlow = (StickerPackFlow) r82.A01;
                            List list = stickerPackFlow.A00.A00;
                            ArrayList A0I = AnonymousClass001.A0I();
                            for (Object next : list) {
                                C36391kE.A1V(next, A0I, AnonymousClass00C.A0J(((C1268665y) next).A01(), str) ? 1 : 0);
                            }
                            if (AnonymousClass1Ax.A03(stickerPackFlow.A01, 7640) && str != null) {
                                Map map = stickerPackFlow.A0C;
                                Iterator A10 = AnonymousClass000.A10(map);
                                while (true) {
                                    if (A10.hasNext()) {
                                        Object next2 = A10.next();
                                        if (AnonymousClass00C.A0J(((C1268665y) next2).A01(), str)) {
                                            if (!(next2 == null || (obj = map.get(next2)) == null)) {
                                                map.remove(next2);
                                                AnonymousClass011 A19 = C36441kJ.A19(next2, obj);
                                                C36321k7.A1R("StickerPackFlow/getPacksAfterFailedDownload preview failed ", str, AnonymousClass000.A0u());
                                                A0I = C36361kB.A0q(A0I);
                                                A0I.add(C90474aD.A08(A19), A19.first);
                                            }
                                        }
                                    }
                                }
                            }
                            C129156Fn.A00(r82, stickerPackFlow, A0I);
                            break;
                    }
                } else if (r8 instanceof C162897pK) {
                    C162897pK r83 = (C162897pK) r8;
                    switch (r83.A01) {
                        case 1:
                        case 2:
                        case 3:
                            C133356Xz r22 = (C133356Xz) r83.A00;
                            r22.A0G.remove(str);
                            r22.A0H.remove(str);
                            List list2 = r22.A04;
                            if (list2 == null) {
                                break;
                            } else {
                                C133356Xz.A02(r22, (String) null, list2);
                                break;
                            }
                        case 4:
                            StickerStoreTabFragment stickerStoreTabFragment = (StickerStoreTabFragment) r83.A00;
                            if (stickerStoreTabFragment instanceof StickerStoreMyTabFragment) {
                                if (stickerStoreTabFragment.A0I == null) {
                                    break;
                                } else {
                                    int i = 0;
                                    while (true) {
                                        if (i >= stickerStoreTabFragment.A0I.size()) {
                                            break;
                                        } else {
                                            AnonymousClass68B A0f = C90514aH.A0f(stickerStoreTabFragment, i);
                                            if (A0f.A0F.equals(str)) {
                                                A0f.A06 = false;
                                                C96124mp r02 = stickerStoreTabFragment.A0G;
                                                if (r02 == null) {
                                                    break;
                                                } else {
                                                    r02.A07(i);
                                                    break;
                                                }
                                            } else {
                                                i++;
                                            }
                                        }
                                    }
                                }
                            } else {
                                StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = (StickerStoreFeaturedTabFragment) stickerStoreTabFragment;
                                if (stickerStoreFeaturedTabFragment.A0I == null) {
                                    break;
                                } else {
                                    for (int i2 = 0; i2 < stickerStoreFeaturedTabFragment.A0I.size(); i2++) {
                                        AnonymousClass68B A0f2 = C90514aH.A0f(stickerStoreFeaturedTabFragment, i2);
                                        if (A0f2.A0F.equals(str)) {
                                            A0f2.A06 = false;
                                            C96124mp r23 = stickerStoreFeaturedTabFragment.A0G;
                                            if (r23 != null) {
                                                int i3 = i2;
                                                if (StickerStoreFeaturedTabFragment.A03(stickerStoreFeaturedTabFragment)) {
                                                    i3 = i2 + 1;
                                                }
                                                r23.A07(i3);
                                            }
                                            stickerStoreFeaturedTabFragment.A04.A0E(C36401kF.A0q(stickerStoreFeaturedTabFragment, A0f2.A0H, new Object[1], 0, R.string.f12nameremoved), 1);
                                        }
                                    }
                                    break;
                                }
                            }
                        case 5:
                            StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) r83.A00;
                            AnonymousClass68B r84 = stickerStorePackPreviewActivity.A0G;
                            if (r84 != null && str.equals(r84.A0F)) {
                                r84.A06 = false;
                                StickerStorePackPreviewActivity.A0G(stickerStorePackPreviewActivity);
                                stickerStorePackPreviewActivity.A05.A0E(C36391kE.A0v(stickerStorePackPreviewActivity, r84.A0H, new Object[1], 0, R.string.f12nameremoved), 1);
                                break;
                            }
                    }
                }
            }
            r7.A00 = C36371kC.A0m();
            r7.A05 = r9.A00;
        }
        r15.A09.Bly(r7);
        AnonymousClass1BA r1 = r15.A02;
        r1.A01.remove(str);
        r1.A00.remove(str);
        C158517hd r03 = r15.A0B;
        if (r03 != null) {
            r03.Bhc(r14);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0087, code lost:
        if (X.C36401kF.A1a(r0) != false) goto L_0x0089;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r20) {
        /*
            r19 = this;
            r1 = r20
            X.68B[] r1 = (X.AnonymousClass68B[]) r1
            r2 = r19
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r6 = r2.A03
            r0 = 0
            r8 = r1[r0]
            boolean r1 = r2.A07
            X.6zB r7 = new X.6zB
            r7.<init>(r2)
            java.lang.Integer r5 = r2.A05
            java.lang.Integer r4 = r2.A04
            int r0 = r2.A00
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            r3 = 0
            X.AnonymousClass00C.A0D(r8, r3)
            X.1BG r0 = r6.A0B
            r0.A09()
            X.5Mw r0 = r7.A00
            boolean r0 = X.C36431kI.A1Y(r0)
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = "cancelled"
        L_0x002f:
            X.5KX r1 = new X.5KX
            r1.<init>(r0)
        L_0x0034:
            return r1
        L_0x0035:
            r2 = r8
            boolean r0 = r8.A0R
            if (r0 == 0) goto L_0x00c4
            java.util.List r0 = r8.A05
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x007e
            if (r1 == 0) goto L_0x007b
            r0 = 0
            com.whatsapp.stickers.stickerpack.StickerPackDownloader$fetchAvatarStickerPackDataWithOnDemand$onDeviceStableIds$1 r1 = new com.whatsapp.stickers.stickerpack.StickerPackDownloader$fetchAvatarStickerPackDataWithOnDemand$onDeviceStableIds$1
            r1.<init>(r6, r0)
            X.03u r0 = X.C008903u.A00
            java.lang.Object r1 = X.C110515an.A00(r0, r1)
            java.util.Set r1 = (java.util.Set) r1
        L_0x0052:
            X.1Br r10 = r6.A02
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            X.02l r0 = r10.A09
            r14 = 0
            r15 = 1
            com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchAvatarStickerPackSync$1 r9 = new com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchAvatarStickerPackSync$1
            r11 = r4
            r13 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15)
            java.lang.Object r2 = X.C110515an.A00(r0, r9)
            X.68B r2 = (X.AnonymousClass68B) r2
        L_0x0069:
            if (r2 != 0) goto L_0x0089
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "StickerPackDownloader/StickerError/could not get sticker pack by id, sticker pack id: "
            r1.append(r0)
            java.lang.String r0 = r8.A0F
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            goto L_0x002f
        L_0x007b:
            X.02c r1 = X.C004702c.A00
            goto L_0x0052
        L_0x007e:
            java.util.List r0 = r8.A05
            X.AnonymousClass00C.A08(r0)
            boolean r0 = X.C36401kF.A1a(r0)
            if (r0 == 0) goto L_0x00c4
        L_0x0089:
            java.util.List r0 = r2.A05
            r18 = r0
            X.AnonymousClass00C.A08(r18)
            X.5cZ r1 = com.whatsapp.stickers.stickerpack.StickerPackDownloader.A00(r2, r7, r6)
            boolean r0 = r1 instanceof X.AnonymousClass5KY
            if (r0 == 0) goto L_0x0034
            X.5KY r1 = (X.AnonymousClass5KY) r1
            java.util.List r0 = r1.A01
            r17 = r0
            X.0yC r1 = r6.A01
            r0 = 3792(0xed0, float:5.314E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x01c4
            boolean r0 = r2.A0R
            if (r0 == 0) goto L_0x01c4
            X.6c4 r1 = r2.A0A
            if (r1 == 0) goto L_0x01c4
            java.lang.String r0 = "StickerPackDownloader/downloadAvatarStickerDynamicIcon"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Bp r0 = r6.A05
            java.io.File r0 = r0.A01(r1)
            if (r0 == 0) goto L_0x01a9
            java.lang.String r0 = r0.getAbsolutePath()
            r1.A0A = r0
            goto L_0x00d1
        L_0x00c4:
            X.1BR r2 = r6.A04
            java.lang.String r1 = r8.A0F
            X.AnonymousClass00C.A08(r1)
            r0 = 0
            X.68B r2 = r2.A02(r0, r1)
            goto L_0x0069
        L_0x00d1:
            X.1C0 r7 = r6.A06     // Catch:{ all -> 0x01ac }
            r1 = 0
            if (r0 != 0) goto L_0x00e2
            java.lang.String r0 = "AvatarTrayIconManager/createIcon filePath is null"
        L_0x00d8:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01ac }
            java.lang.String r0 = "Unable to create avatar dynamic icon given template Id"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x01ac }
        L_0x00e1:
            throw r0     // Catch:{ all -> 0x01ac }
        L_0x00e2:
            android.graphics.Bitmap r14 = android.graphics.BitmapFactory.decodeFile(r0)     // Catch:{ all -> 0x00e7 }
            goto L_0x00ec
        L_0x00e7:
            r0 = move-exception
            X.03N r14 = X.C90524aI.A0t(r0)     // Catch:{ all -> 0x01ac }
        L_0x00ec:
            boolean r0 = r14 instanceof X.AnonymousClass03N     // Catch:{ all -> 0x01ac }
            if (r0 == 0) goto L_0x00f1
            r14 = r1
        L_0x00f1:
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14     // Catch:{ all -> 0x01ac }
            if (r14 != 0) goto L_0x00f8
            java.lang.String r0 = "AvatarTrayIconManager/createIcon stickerBitmap is null"
            goto L_0x00d8
        L_0x00f8:
            X.0wG r0 = r7.A00     // Catch:{ all -> 0x01ac }
            android.content.Context r8 = r0.A00     // Catch:{ all -> 0x01ac }
            android.content.res.Resources r1 = r8.getResources()     // Catch:{ all -> 0x01ac }
            r0 = 2131165369(0x7f0700b9, float:1.7944953E38)
            int r15 = r1.getDimensionPixelSize(r0)     // Catch:{ all -> 0x01ac }
            r0 = 2131099849(0x7f0600c9, float:1.7812063E38)
            int r1 = X.AnonymousClass00F.A00(r8, r0)     // Catch:{ all -> 0x01ac }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x01ac }
            android.graphics.Bitmap r12 = android.graphics.Bitmap.createBitmap(r15, r15, r0)     // Catch:{ all -> 0x01ac }
            X.AnonymousClass00C.A08(r12)     // Catch:{ all -> 0x01ac }
            int r0 = r12.getWidth()     // Catch:{ all -> 0x01ac }
            float r13 = (float) r0     // Catch:{ all -> 0x01ac }
            r0 = 1073741824(0x40000000, float:2.0)
            float r13 = r13 / r0
            android.graphics.Canvas r11 = X.C90524aI.A0A(r12)     // Catch:{ all -> 0x01ac }
            android.graphics.Paint r10 = X.C36441kJ.A0K()     // Catch:{ all -> 0x01ac }
            r0 = 1
            r10.setAntiAlias(r0)     // Catch:{ all -> 0x01ac }
            r10.setDither(r0)     // Catch:{ all -> 0x01ac }
            r10.setFilterBitmap(r0)     // Catch:{ all -> 0x01ac }
            android.graphics.Paint r9 = X.C36441kJ.A0K()     // Catch:{ all -> 0x01ac }
            r9.setAntiAlias(r0)     // Catch:{ all -> 0x01ac }
            r9.setDither(r0)     // Catch:{ all -> 0x01ac }
            r9.setFilterBitmap(r0)     // Catch:{ all -> 0x01ac }
            r9.setColor(r1)     // Catch:{ all -> 0x01ac }
            int r1 = r14.getWidth()     // Catch:{ all -> 0x01ac }
            int r0 = r14.getHeight()     // Catch:{ all -> 0x01ac }
            android.graphics.Rect r8 = new android.graphics.Rect     // Catch:{ all -> 0x01ac }
            r8.<init>(r3, r3, r1, r0)     // Catch:{ all -> 0x01ac }
            float r15 = (float) r15     // Catch:{ all -> 0x01ac }
            r0 = 0
            android.graphics.RectF r1 = new android.graphics.RectF     // Catch:{ all -> 0x01ac }
            r1.<init>(r0, r0, r15, r15)     // Catch:{ all -> 0x01ac }
            r11.drawARGB(r3, r3, r3, r3)     // Catch:{ all -> 0x01ac }
            android.graphics.Path r15 = X.C36441kJ.A0M()     // Catch:{ all -> 0x01ac }
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CW     // Catch:{ all -> 0x01ac }
            r15.addCircle(r13, r13, r13, r0)     // Catch:{ all -> 0x01ac }
            r11.clipPath(r15)     // Catch:{ all -> 0x01ac }
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.CLEAR     // Catch:{ all -> 0x01ac }
            r11.drawColor(r3, r0)     // Catch:{ all -> 0x01ac }
            r11.drawCircle(r13, r13, r13, r9)     // Catch:{ all -> 0x01ac }
            r11.drawBitmap(r14, r8, r1, r10)     // Catch:{ all -> 0x01ac }
            r14.recycle()     // Catch:{ all -> 0x01ac }
            java.io.ByteArrayOutputStream r1 = X.C90524aI.A0Q()     // Catch:{ all -> 0x01ac }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x01ac }
            r12.compress(r0, r3, r1)     // Catch:{ all -> 0x01ac }
            byte[] r0 = r1.toByteArray()     // Catch:{ all -> 0x01ac }
            java.io.ByteArrayInputStream r8 = X.C90524aI.A0P(r0)     // Catch:{ all -> 0x01ac }
            X.1BC r0 = r7.A01     // Catch:{ all -> 0x01ac }
            java.lang.String r1 = "meta-avatar-tab-icon"
            X.16L r0 = r0.A00     // Catch:{ all -> 0x01ac }
            X.1SZ r0 = r0.A04()     // Catch:{ all -> 0x01ac }
            r0.A0C(r1)     // Catch:{ all -> 0x01ac }
            X.1Bx r0 = r7.A02     // Catch:{ all -> 0x01ac }
            java.io.File r7 = r0.A00(r1)     // Catch:{ all -> 0x01ac }
            if (r7 == 0) goto L_0x01a1
            r0 = 500000(0x7a120, double:2.47033E-318)
            X.AnonymousClass6YY.A0T(r7, r8, r0)     // Catch:{ all -> 0x01ac }
            X.0AJ r0 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x01ac }
            goto L_0x01b1
        L_0x01a1:
            java.lang.String r0 = "Unable to create dynamic icon file"
            java.io.FileNotFoundException r0 = X.C90524aI.A0V(r0)     // Catch:{ all -> 0x01ac }
            goto L_0x00e1
        L_0x01a9:
            java.lang.String r0 = "StickerPackDownloader/failed to download avatar dynamic icon"
            goto L_0x01c1
        L_0x01ac:
            r0 = move-exception
            X.03N r0 = X.C90524aI.A0t(r0)
        L_0x01b1:
            java.lang.Throwable r7 = X.AnonymousClass0AK.A00(r0)
            if (r7 == 0) goto L_0x01c4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "StickerPackDownloader/failed to update avatar dynamic icon "
            java.lang.String r0 = X.C36331k8.A0i(r0, r1, r7)
        L_0x01c1:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x01c4:
            java.lang.String r0 = "stickers_downloaded"
            com.whatsapp.stickers.stickerpack.StickerPackDownloader.A02(r6, r5, r4, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "StickerPackDownloader/finished fetching stickers/sticker pack id: "
            r1.append(r0)
            java.lang.String r7 = r2.A0F
            X.C36321k7.A1a(r1, r7)
            boolean r10 = r2.A0R
            if (r10 == 0) goto L_0x0240
            java.lang.String r12 = r2.A0K
            if (r12 == 0) goto L_0x0311
            java.lang.String r0 = "StickerPackDownloader/updateAvatarStickerPackTrayIcon"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1BC r0 = r6.A08
            X.AnonymousClass00C.A08(r7)
            X.16L r0 = r0.A00
            X.1SZ r0 = r0.A04()
            r0.A0C(r7)
            X.1Bx r8 = r6.A0A
            java.util.List r0 = r2.A05
            r16 = r0
            X.AnonymousClass00C.A08(r16)
            boolean r0 = r16.isEmpty()
            if (r0 != 0) goto L_0x023b
            X.1By r9 = r8.A02
            java.util.Iterator r13 = r16.iterator()
        L_0x0207:
            boolean r0 = r13.hasNext()
            r11 = 0
            if (r0 == 0) goto L_0x0227
            java.lang.Object r11 = r13.next()
            r1 = r11
            X.6c4 r1 = (X.C135066c4) r1
            java.lang.String r0 = r1.A06
            if (r0 != 0) goto L_0x0221
            X.3S2 r0 = r1.A04
            if (r0 == 0) goto L_0x0207
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x0207
        L_0x0221:
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0207
        L_0x0227:
            X.6c4 r11 = (X.C135066c4) r11
            if (r11 != 0) goto L_0x0231
            java.lang.Object r11 = X.C007103b.A0L(r16)
            X.6c4 r11 = (X.C135066c4) r11
        L_0x0231:
            java.lang.String r0 = r11.A0A
            r1 = 0
            if (r0 != 0) goto L_0x0272
            java.lang.String r0 = "AvatarTrayIconManager/createIcon filePath is null"
        L_0x0238:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x023b:
            java.lang.String r0 = "tray_icon_updated"
            com.whatsapp.stickers.stickerpack.StickerPackDownloader.A02(r6, r5, r4, r0)
        L_0x0240:
            X.1B5 r9 = r6.A0C
            X.AnonymousClass00C.A08(r7)
            X.68B r1 = r9.A03(r7)
            if (r1 == 0) goto L_0x0385
            java.lang.String r0 = "StickerPackDownloader/deletePreviouslyInstalledStickerPack"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.List r8 = r1.A05
            X.AnonymousClass00C.A08(r8)
            java.util.List r13 = r2.A05
            X.AnonymousClass00C.A08(r13)
            java.util.ArrayList r12 = X.C36351kA.A0z(r8)
            java.util.Iterator r1 = r8.iterator()
        L_0x0262:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0318
            X.6c4 r0 = X.C90504aG.A0U(r1)
            java.lang.String r0 = r0.A0E
            r12.add(r0)
            goto L_0x0262
        L_0x0272:
            android.graphics.Bitmap r15 = android.graphics.BitmapFactory.decodeFile(r0)     // Catch:{ all -> 0x0277 }
            goto L_0x027c
        L_0x0277:
            r0 = move-exception
            X.03N r15 = X.C90524aI.A0t(r0)
        L_0x027c:
            boolean r0 = r15 instanceof X.AnonymousClass03N
            if (r0 == 0) goto L_0x0281
            r15 = r1
        L_0x0281:
            android.graphics.Bitmap r15 = (android.graphics.Bitmap) r15
            if (r15 != 0) goto L_0x0288
            java.lang.String r0 = "AvatarTrayIconManager/createIcon stickerBitmap is null"
            goto L_0x0238
        L_0x0288:
            X.0wG r0 = r9.A00
            android.content.Context r11 = r0.A00
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131165378(0x7f0700c2, float:1.7944971E38)
            int r9 = r1.getDimensionPixelSize(r0)
            r0 = 2131103013(0x7f060d25, float:1.781848E38)
            int r1 = X.AnonymousClass00F.A00(r11, r0)
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r13 = android.graphics.Bitmap.createBitmap(r9, r9, r0)
            X.AnonymousClass00C.A08(r13)
            android.graphics.Canvas r14 = X.C90524aI.A0A(r13)
            android.graphics.Paint r12 = X.C36441kJ.A0K()
            r0 = 1
            r12.setAntiAlias(r0)
            r12.setDither(r0)
            r12.setFilterBitmap(r0)
            r12.setColor(r1)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_OVER
            android.graphics.PorterDuffXfermode r0 = new android.graphics.PorterDuffXfermode
            r0.<init>(r1)
            r12.setXfermode(r0)
            int r1 = r15.getWidth()
            int r0 = r15.getHeight()
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>(r3, r3, r1, r0)
            float r9 = (float) r9
            r1 = 0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1, r1, r9, r9)
            r14.drawARGB(r3, r3, r3, r3)
            r14.drawOval(r0, r12)
            r14.drawBitmap(r15, r11, r0, r12)
            r15.recycle()
            java.io.ByteArrayOutputStream r1 = X.C90524aI.A0Q()
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG
            r13.compress(r0, r3, r1)
            byte[] r0 = r1.toByteArray()
            java.io.ByteArrayInputStream r9 = X.C90524aI.A0P(r0)
            r0 = r16
            java.lang.Object r0 = r0.get(r3)
            X.6c4 r0 = (X.C135066c4) r0
            java.lang.String r0 = r0.A0G
            if (r0 == 0) goto L_0x023b
            java.io.File r8 = r8.A00(r0)
            if (r8 == 0) goto L_0x023b
            r0 = 500000(0x7a120, double:2.47033E-318)
            X.AnonymousClass6YY.A0T(r8, r9, r0)
            goto L_0x023b
        L_0x0311:
            java.lang.String r0 = "StickerPackDownloader/avatar stickerpack without tray icon template"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0240
        L_0x0318:
            java.util.ArrayList r11 = X.C36351kA.A0z(r13)
            java.util.Iterator r1 = r13.iterator()
        L_0x0320:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0330
            X.6c4 r0 = X.C90504aG.A0U(r1)
            java.lang.String r0 = r0.A0E
            r11.add(r0)
            goto L_0x0320
        L_0x0330:
            java.util.Set r0 = X.C007103b.A0f(r11)
            java.util.Set r12 = X.C007103b.A0g(r12, r0)
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()
            java.util.Iterator r8 = r8.iterator()
        L_0x0340:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0359
            java.lang.Object r1 = r8.next()
            r0 = r1
            X.6c4 r0 = (X.C135066c4) r0
            java.lang.String r0 = r0.A0E
            boolean r0 = r12.contains(r0)
            if (r0 != 0) goto L_0x0340
            r11.add(r1)
            goto L_0x0340
        L_0x0359:
            r11.size()
            java.util.Iterator r12 = r11.iterator()
        L_0x0360:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0380
            X.6c4 r11 = X.C90504aG.A0U(r12)
            java.lang.String r0 = r11.A0A
            if (r0 == 0) goto L_0x0360
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0360
            java.lang.String r8 = r11.A0E
            if (r8 == 0) goto L_0x0360
            X.1Av r1 = r6.A00
            java.lang.String r0 = r11.A0D
            r1.A07(r8, r0)
            goto L_0x0360
        L_0x0380:
            java.lang.String r0 = "previous_stickers_deleted"
            com.whatsapp.stickers.stickerpack.StickerPackDownloader.A02(r6, r5, r4, r0)
        L_0x0385:
            int r8 = r9.A01(r7)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "StickerPackDownloader/installStickerPack(order="
            r1.append(r0)
            java.lang.String r0 = X.C36321k7.A0G(r1, r8)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r10 == 0) goto L_0x03b1
            java.util.Iterator r10 = r17.iterator()
            r1 = 0
        L_0x03a0:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x03ae
            X.6c4 r0 = X.C90504aG.A0U(r10)
            int r0 = r0.A00
            int r1 = r1 + r0
            goto L_0x03a0
        L_0x03ae:
            long r0 = (long) r1
            r2.A02 = r0
        L_0x03b1:
            r9.A04(r2)
            java.lang.String r0 = "stickerpack_installed"
            com.whatsapp.stickers.stickerpack.StickerPackDownloader.A02(r6, r5, r4, r0)
            X.1BH r0 = r6.A0D
            r0.A02(r7)
            X.68B r7 = r9.A03(r7)
            if (r7 == 0) goto L_0x03f7
            r0 = r18
            r7.A05 = r0
            r7.A06 = r3
            r7.A00 = r8
            r0 = 1
            r7.A09 = r0
            if (r5 == 0) goto L_0x03ef
            if (r4 == 0) goto L_0x03ef
            X.0zE r8 = r6.A03
            int r9 = r5.intValue()
            int r10 = r4.intValue()
            long r12 = r2.A02
            java.lang.String r11 = "stickerpack_size"
            r8.markerAnnotate((int) r9, (int) r10, (java.lang.String) r11, (long) r12)
            java.util.List r0 = r2.A05
            int r1 = r0.size()
            java.lang.String r0 = "stickerpack_amount"
            r8.markerAnnotate((int) r9, (int) r10, (java.lang.String) r0, (int) r1)
        L_0x03ef:
            X.5KY r1 = new X.5KY
            r0 = r18
            r1.<init>(r7, r0)
            return r1
        L_0x03f7:
            java.lang.String r0 = "Unable to get sticker pack from database"
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107185Mw.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C111615cZ r1 = (C111615cZ) obj;
        C18740tg.A06(r1);
        A00(r1, this);
    }

    public C107185Mw(C20810yC r2, C21010yW r3, C23871Ae r4, AnonymousClass1BB r5, AnonymousClass68B r6, C158517hd r7, AnonymousClass1BA r8, StickerPackDownloader stickerPackDownloader, Integer num, Integer num2, int i, boolean z) {
        this.A08 = r2;
        this.A0A = r4;
        this.A01 = r5;
        this.A03 = stickerPackDownloader;
        this.A02 = r8;
        this.A06 = r6.A0F;
        this.A0C = r6.A0T;
        this.A0B = r7;
        this.A09 = r3;
        this.A00 = i;
        this.A07 = z;
        this.A05 = num;
        this.A04 = num2;
    }
}
