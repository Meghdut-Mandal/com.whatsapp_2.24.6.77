package X;

import com.whatsapp.storage.StorageUsageActivity;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.List;

/* renamed from: X.3wd  reason: invalid class name and case insensitive filesystem */
public class C81203wd implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public C81203wd(StorageUsageActivity storageUsageActivity) {
        this.A02 = 29;
        this.A01 = storageUsageActivity;
        this.A00 = C36431kI.A1H();
    }

    public static void A00(AnonymousClass17Y r1, Object obj, Object obj2, int i) {
        r1.A0H(new C81203wd(obj, obj2, i));
    }

    public static void A02(C19770wU r1, Object obj, Object obj2, int i) {
        r1.Boy(new C81203wd(obj, obj2, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r11v6, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x066b, code lost:
        if (r3 == false) goto L_0x066d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x071f, code lost:
        X.C41071wZ.A03(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0722, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0a4f, code lost:
        r3.A1f(r1, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0a53, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x0ad8, code lost:
        r3.A0H(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x0adb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0af9, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0afc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01d9, code lost:
        r8 = (X.AnonymousClass2bU) r8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0389 A[Catch:{ FileNotFoundException -> 0x0b30, all -> 0x0b52 }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x038f A[Catch:{ FileNotFoundException -> 0x0b30, all -> 0x0b52 }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0399 A[Catch:{ FileNotFoundException -> 0x0b30, all -> 0x0b52 }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:448:0x0b2a  */
    /* JADX WARNING: Removed duplicated region for block: B:494:0x0397 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r25 = this;
            r0 = r25
            int r1 = r0.A02
            switch(r1) {
                case 0: goto L_0x03e1;
                case 1: goto L_0x0a17;
                case 2: goto L_0x0349;
                case 3: goto L_0x0a0b;
                case 4: goto L_0x09e8;
                case 5: goto L_0x09b2;
                case 6: goto L_0x099c;
                case 7: goto L_0x0986;
                case 8: goto L_0x0952;
                case 9: goto L_0x0329;
                case 10: goto L_0x0931;
                case 11: goto L_0x0abf;
                case 12: goto L_0x091c;
                case 13: goto L_0x030c;
                case 14: goto L_0x0906;
                case 15: goto L_0x08eb;
                case 16: goto L_0x08dc;
                case 17: goto L_0x02c7;
                case 18: goto L_0x08d0;
                case 19: goto L_0x02a1;
                case 20: goto L_0x0856;
                case 21: goto L_0x083d;
                case 22: goto L_0x0281;
                case 23: goto L_0x0723;
                case 24: goto L_0x0252;
                case 25: goto L_0x0240;
                case 26: goto L_0x070a;
                case 27: goto L_0x06f4;
                case 28: goto L_0x06d6;
                case 29: goto L_0x021f;
                case 30: goto L_0x0156;
                case 31: goto L_0x06b6;
                case 32: goto L_0x0124;
                case 33: goto L_0x0652;
                case 34: goto L_0x05fd;
                case 35: goto L_0x05d6;
                case 36: goto L_0x05b0;
                case 37: goto L_0x0599;
                case 38: goto L_0x0556;
                case 39: goto L_0x0531;
                case 40: goto L_0x00c1;
                case 41: goto L_0x0038;
                case 42: goto L_0x051c;
                case 43: goto L_0x04bf;
                case 44: goto L_0x04af;
                case 45: goto L_0x0495;
                case 46: goto L_0x0441;
                case 47: goto L_0x042a;
                case 48: goto L_0x0400;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r0.A00
            X.6E3 r4 = (X.AnonymousClass6E3) r4
            java.lang.Object r3 = r0.A01
            X.6WC r3 = (X.AnonymousClass6WC) r3
            r2 = 0
            r4.A00()
            r1 = 0
            android.view.TextureView r0 = r4.A0A
            r0.setAlpha(r1)
            int r0 = r3.A00
            int r0 = r0 + 1
            r3.A00 = r0
            r3.A07 = r2
            r3.A06 = r2
            r2 = 0
            r3.A04 = r2
            r3.A05 = r2
            X.9Xa r1 = r3.A02
            r3.A02 = r2
            java.lang.Integer r0 = r3.A03
            r3.A03 = r2
            if (r1 == 0) goto L_0x0037
            if (r0 == 0) goto L_0x0037
            r3.A04(r1, r0)
        L_0x0037:
            return
        L_0x0038:
            java.lang.Object r6 = r0.A00
            X.4W3 r6 = (X.AnonymousClass4W3) r6
            java.lang.Object r0 = r0.A01
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x0037
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r0.iterator()
        L_0x004a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0061
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.141 r0 = (X.AnonymousClass141) r0
            X.11F r0 = r0.A0H
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x004a
            r4.add(r1)
            goto L_0x004a
        L_0x0061:
            java.util.ArrayList r3 = X.C36321k7.A0J(r4)
            java.util.Iterator r2 = r4.iterator()
        L_0x0069:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x007c
            X.11F r1 = X.C36341k9.A0W(r2)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.AnonymousClass00C.A0E(r1, r0)
            r3.add(r1)
            goto L_0x0069
        L_0x007c:
            java.lang.Object r7 = r6.A00
            X.3OF r7 = (X.AnonymousClass3OF) r7
            java.util.Set r1 = r7.A0H
            monitor-enter(r1)
            r1.addAll(r3)     // Catch:{ all -> 0x0a33 }
            java.lang.Long r0 = r7.A00     // Catch:{ all -> 0x0a33 }
            monitor-exit(r1)
            if (r0 == 0) goto L_0x0a2f
            long r3 = android.os.SystemClock.uptimeMillis()
            long r0 = r0.longValue()
            long r3 = r3 - r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            r0 = 1
            long r1 = r2.toMillis(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0a2f
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.A01
            r1 = 0
            r0 = 1
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 == 0) goto L_0x0037
            X.0wU r5 = r7.A0G
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            r0 = 2
            long r3 = r2.toMillis(r0)
            java.lang.String r2 = "ug_names_populator"
            r1 = 42
            X.3wd r0 = new X.3wd
            r0.<init>(r7, r6, r1)
            r5.BpM(r0, r2, r3)
            return
        L_0x00c1:
            java.lang.Object r1 = r0.A00
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r3 = r0.A01
            X.3OF r3 = (X.AnonymousClass3OF) r3
            r6 = 1
            X.AnonymousClass00C.A0D(r3, r6)
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r4 = r1.iterator()
        L_0x00d5:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0100
            java.lang.Object r2 = r4.next()
            r1 = r2
            X.11F r1 = (X.AnonymousClass11F) r1
            X.16D r0 = r3.A03
            X.141 r1 = r0.A0A(r1)
            if (r1 == 0) goto L_0x00d5
            boolean r0 = r1.A0G()
            if (r0 != r6) goto L_0x00d5
            java.lang.String r0 = r1.A0J()
            if (r0 == 0) goto L_0x00fc
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00d5
        L_0x00fc:
            r5.add(r2)
            goto L_0x00d5
        L_0x0100:
            java.util.Iterator r2 = r5.iterator()
        L_0x0104:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0037
            java.lang.Object r9 = r2.next()
            X.144 r9 = (X.AnonymousClass144) r9
            X.1LW r1 = r3.A09
            X.0wG r7 = r3.A08
            X.0wQ r4 = r3.A02
            X.16D r5 = r3.A03
            X.171 r6 = r3.A06
            X.17X r8 = r3.A0A
            java.lang.String r0 = X.AnonymousClass3SP.A00(r4, r5, r6, r7, r8, r9)
            r1.A02(r9, r0)
            goto L_0x0104
        L_0x0124:
            java.lang.Object r5 = r0.A00
            X.2rU r5 = (X.C53542rU) r5
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r4 = r0.iterator()
        L_0x0130:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0037
            java.lang.Object r3 = r4.next()
            X.3v0 r3 = (X.C80193v0) r3
            X.11F r1 = r3.A01()
            java.lang.Object r2 = r5.A00
            com.whatsapp.storage.StorageUsageGalleryActivity r2 = (com.whatsapp.storage.StorageUsageGalleryActivity) r2
            X.11F r0 = r2.A0M
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0130
            X.3Xe r0 = r3.A00
            long r0 = r0.A0I
            r2.A03 = r0
            com.whatsapp.storage.StorageUsageGalleryActivity.A07(r2)
            return
        L_0x0156:
            java.lang.Object r6 = r0.A00
            com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment r6 = (com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment) r6
            java.lang.Object r7 = r0.A01
            java.util.AbstractCollection r7 = (java.util.AbstractCollection) r7
            X.1X4 r2 = r6.A00
            r1 = 1
            r0 = 0
            r2.A0c(r7, r1, r0)
            X.4Rz r5 = r6.A01
            if (r5 == 0) goto L_0x0037
            java.util.Collection r0 = r6.A04
            java.util.Iterator r2 = r0.iterator()
            r10 = 0
        L_0x0171:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x018d
            X.3T1 r1 = X.C36391kE.A0l(r2)
            boolean r0 = r1 instanceof X.AnonymousClass2bU
            if (r0 == 0) goto L_0x0171
            boolean r0 = r1.A15
            if (r0 == 0) goto L_0x0187
            boolean r0 = r6.A06
            if (r0 == 0) goto L_0x0171
        L_0x0187:
            X.2bU r1 = (X.AnonymousClass2bU) r1
            long r0 = r1.A00
            long r10 = r10 + r0
            goto L_0x0171
        L_0x018d:
            java.util.HashMap r4 = X.AnonymousClass001.A0J()
            java.util.Collection r0 = r6.A03
            java.util.Iterator r2 = r0.iterator()
        L_0x0197:
            boolean r0 = r2.hasNext()
            r3 = 1
            if (r0 == 0) goto L_0x01b7
            X.3T1 r1 = X.C36391kE.A0l(r2)
            X.2bU r1 = (X.AnonymousClass2bU) r1
            java.lang.String r0 = r1.A04
            java.lang.Number r0 = X.C36441kJ.A10(r0, r4)
            java.lang.String r1 = r1.A04
            if (r0 == 0) goto L_0x01b3
            int r0 = r0.intValue()
            int r3 = r3 + r0
        L_0x01b3:
            X.C36341k9.A1K(r1, r4, r3)
            goto L_0x0197
        L_0x01b7:
            r12 = 0
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x01f5
            java.util.Collection r0 = r6.A03
        L_0x01bf:
            java.util.Iterator r9 = r0.iterator()
        L_0x01c3:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01f8
            X.3T1 r8 = X.C36391kE.A0l(r9)
            boolean r0 = r8 instanceof X.AnonymousClass2bU
            if (r0 == 0) goto L_0x01c3
            boolean r0 = r8.A15
            if (r0 == 0) goto L_0x01d9
            boolean r0 = r6.A06
            if (r0 == 0) goto L_0x01c3
        L_0x01d9:
            X.2bU r8 = (X.AnonymousClass2bU) r8
            java.lang.String r2 = r8.A04
            java.lang.Number r1 = X.C36441kJ.A10(r2, r4)
            if (r1 == 0) goto L_0x01c3
            int r0 = r1.intValue()
            if (r0 != r3) goto L_0x01f0
            r4.remove(r1)
            long r0 = r8.A00
            long r12 = r12 + r0
            goto L_0x01c3
        L_0x01f0:
            int r0 = r0 - r3
            X.C36341k9.A1K(r2, r4, r0)
            goto L_0x01c3
        L_0x01f5:
            java.util.Collection r0 = r6.A04
            goto L_0x01bf
        L_0x01f8:
            int r8 = r7.size()
            X.4Yr r5 = (X.C89994Yr) r5
            int r0 = r5.A01
            if (r0 == 0) goto L_0x0a36
            java.lang.Object r7 = r5.A00
            com.whatsapp.storage.StorageUsageGalleryActivity r7 = (com.whatsapp.storage.StorageUsageGalleryActivity) r7
            java.lang.String r0 = "storage-usage-gallery-activity/message delete started"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r9 = 2
            X.3vU r6 = new X.3vU
            r6.<init>(r7, r8, r9, r10, r12)
            r7.A0R = r6
            if (r8 <= 0) goto L_0x0037
            android.os.Handler r3 = r7.A0V
            java.lang.Runnable r2 = r7.A0W
            r0 = 800(0x320, double:3.953E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x021f:
            java.lang.String r1 = "storage-usage-activity/fetch chats"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.Object r4 = r0.A00
            java.util.concurrent.atomic.AtomicBoolean r4 = (java.util.concurrent.atomic.AtomicBoolean) r4
            boolean r1 = r4.get()
            if (r1 != 0) goto L_0x0037
            java.lang.Object r5 = r0.A01
            com.whatsapp.storage.StorageUsageActivity r5 = (com.whatsapp.storage.StorageUsageActivity) r5
            X.3Si r1 = r5.A0C
            X.16p r1 = r1.A00
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            android.database.Cursor r10 = r1.A0M()
            goto L_0x0a54
        L_0x0240:
            java.lang.Object r2 = r0.A00
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r1 = r0.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L_0x0037
            r1.run()
            return
        L_0x0252:
            java.lang.Object r1 = r0.A00
            X.5HA r1 = (X.AnonymousClass5HA) r1
            java.lang.Object r3 = r0.A01
            java.util.AbstractMap r3 = (java.util.AbstractMap) r3
            java.util.List r0 = r1.A05
            java.util.Iterator r2 = r0.iterator()
        L_0x0260:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0037
            java.lang.Object r1 = r2.next()
            X.4TT r1 = (X.AnonymousClass4TT) r1
            java.lang.String r0 = r1.getId()
            java.lang.Object r0 = r3.get(r0)
            X.68B r0 = (X.AnonymousClass68B) r0
            if (r0 == 0) goto L_0x0260
            X.5Ku r1 = (X.C106675Ku) r1
            r1.A06(r0)
            r1.A01()
            goto L_0x0260
        L_0x0281:
            java.lang.Object r1 = r0.A00
            com.whatsapp.stickers.info.StickerInfoDialogFragment r1 = (com.whatsapp.stickers.info.StickerInfoDialogFragment) r1
            java.lang.Object r3 = r0.A01
            android.net.Uri r3 = (android.net.Uri) r3
            X.01I r0 = r1.A0h()
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0037
            X.01I r2 = r1.A0i()
            X.11F r1 = r1.A0B
            r0 = 44
            X.C64473Oc.A00(r2, r3, r1, r0)
            return
        L_0x02a1:
            java.lang.Object r1 = r0.A00
            X.AUd r1 = (X.C21661AUd) r1
            java.lang.Object r2 = r0.A01
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            java.lang.ref.WeakReference r0 = r1.A03
            java.lang.Object r1 = r0.get()
            X.9Um r1 = (X.C195489Um) r1
            if (r1 == 0) goto L_0x0037
            boolean r0 = r2.isRecycled()
            if (r0 == 0) goto L_0x02bd
            java.lang.String r0 = "AnimatedSticker/StickerFramePreloader/run/frame is recycled"
            goto L_0x0af9
        L_0x02bd:
            boolean r0 = r1.A0G
            if (r0 == 0) goto L_0x0037
            r1.A01 = r2
            r1.A00()
            return
        L_0x02c7:
            java.lang.Object r2 = r0.A00
            X.2fM r2 = (X.C47642fM) r2
            java.lang.Object r1 = r0.A01
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            boolean r0 = r2.A02()
            if (r0 == 0) goto L_0x02ff
            r3 = 0
            if (r1 == 0) goto L_0x02de
            r3 = 1
            android.widget.ImageView r0 = r2.A00
            r0.setImageDrawable(r1)
        L_0x02de:
            X.4Rv r0 = r2.A02
            if (r0 == 0) goto L_0x02e5
            r0.Bhf(r3)
        L_0x02e5:
            java.lang.Integer r0 = r2.A04
            if (r0 == 0) goto L_0x0037
            X.1HC r2 = r2.A01
            int r1 = r0.intValue()
            java.lang.String r0 = "sticker_image_emitted_to_ui"
            r2.A01(r1, r0)
            if (r3 == 0) goto L_0x02fc
            X.2pF r0 = X.C52322pF.SUCCESS
        L_0x02f8:
            r2.A02(r0, r1)
            return
        L_0x02fc:
            X.2pF r0 = X.C52322pF.FAIL
            goto L_0x02f8
        L_0x02ff:
            java.lang.Integer r0 = r2.A04
            if (r0 == 0) goto L_0x0037
            X.1HC r2 = r2.A01
            int r1 = r0.intValue()
            X.2pF r0 = X.C52322pF.CANCEL
            goto L_0x02f8
        L_0x030c:
            java.lang.Object r2 = r0.A00
            X.3Qj r2 = (X.C65013Qj) r2
            java.lang.Object r1 = r0.A01
            X.2fB r1 = (X.C47592fB) r1
            java.io.File r0 = r2.A0I
            if (r0 == 0) goto L_0x0037
            boolean r0 = r2.A03()
            if (r0 != 0) goto L_0x0037
            X.17Y r3 = r1.A0C
            r0 = 44
            X.3wa r2 = new X.3wa
            r2.<init>((java.lang.Object) r1, (int) r0)
            goto L_0x0ad8
        L_0x0329:
            java.lang.Object r3 = r0.A00
            com.whatsapp.status.audienceselector.StatusPrivacyActivity r3 = (com.whatsapp.status.audienceselector.StatusPrivacyActivity) r3
            java.lang.Object r4 = r0.A01
            X.6bk r4 = (X.C134876bk) r4
            r0 = 2131429447(0x7f0b0847, float:1.8480567E38)
            android.view.View r1 = r3.findViewById(r0)
            if (r1 == 0) goto L_0x0037
            X.1i0 r0 = r3.A3i()
            X.7jy r5 = r3.A0H
            if (r5 != 0) goto L_0x0afd
            java.lang.String r0 = "crosspostAccountLinkingResultListener"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0349:
            java.lang.Object r5 = r0.A00
            com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview r5 = (com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview) r5
            java.lang.Object r9 = r0.A01
            java.lang.String r7 = "io-error"
            android.net.Uri r0 = r5.A01
            if (r0 != 0) goto L_0x0362
            java.lang.String r0 = "GalleryWallpaperPreview/saveWallpaperForChat/no uri found to save to. generating our own"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3T0 r0 = r5.A03
            android.net.Uri r0 = r0.A09()
            r5.A01 = r0
        L_0x0362:
            java.lang.String r0 = r0.getPath()
            if (r0 == 0) goto L_0x0037
            r13 = 90
            android.net.Uri r0 = r5.A01
            java.lang.String r0 = r0.getPath()
            java.io.File r12 = new java.io.File
            r12.<init>(r0)
            com.whatsapp.mediaview.PhotoView r0 = r5.A02
            android.graphics.Bitmap r8 = r0.getFullViewCroppedBitmap()
            X.C18740tg.A06(r8)
            r4 = 0
        L_0x037f:
            r6 = 1
            r3 = 0
            X.0yb r0 = r5.A08     // Catch:{ FileNotFoundException -> 0x0b30 }
            X.0ya r1 = r0.A0O()     // Catch:{ FileNotFoundException -> 0x0b30 }
            if (r1 != 0) goto L_0x038f
            java.lang.String r0 = "GalleryWallpaperPreview/saveWallpaperForChat/save cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ FileNotFoundException -> 0x0b30 }
            goto L_0x0395
        L_0x038f:
            android.net.Uri r0 = r5.A01     // Catch:{ FileNotFoundException -> 0x0b30 }
            java.io.OutputStream r4 = r1.A07(r0)     // Catch:{ FileNotFoundException -> 0x0b30 }
        L_0x0395:
            if (r4 != 0) goto L_0x0399
            goto L_0x0b0c
        L_0x0399:
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ FileNotFoundException -> 0x0b30 }
            r8.compress(r0, r13, r4)     // Catch:{ FileNotFoundException -> 0x0b30 }
            int r13 = r13 + -10
            X.AnonymousClass14X.A02(r4)
            int r0 = r5.A00
            if (r0 <= 0) goto L_0x03ba
            if (r13 <= 0) goto L_0x03ba
            boolean r0 = r12.exists()
            if (r0 == 0) goto L_0x03ba
            long r10 = r12.length()
            int r0 = r5.A00
            long r0 = (long) r0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x037f
        L_0x03ba:
            long r1 = r12.length()
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0b2a
            X.0wx r0 = r5.A08
            long r1 = r0.A01()
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0b2a
            java.lang.String r0 = "GalleryWallpaperPreview/saveWallpaperForChat/no space to save compressed image"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.content.Intent r1 = X.C36431kI.A0D()
            java.lang.String r0 = "no-space"
            android.content.Intent r0 = r1.putExtra(r0, r6)
            r5.setResult(r3, r0)
            return
        L_0x03e1:
            java.lang.Object r2 = r0.A00
            com.whatsapp.settings.SettingsUserProxyActivity r2 = (com.whatsapp.settings.SettingsUserProxyActivity) r2
            java.lang.Object r0 = r0.A01
            android.widget.EditText r0 = (android.widget.EditText) r0
            com.whatsapp.settings.SettingsUserProxyViewModel r1 = r2.A09
            java.lang.String r0 = X.C36361kB.A0n(r0)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0037
            com.whatsapp.settings.SettingsUserProxyViewModel r2 = r2.A09
            r1 = 1
            r0 = 0
            r2.A0V(r1, r0)
            r2.A0T()
            return
        L_0x0400:
            java.lang.Object r2 = r0.A00
            X.3xm r2 = (X.C81873xm) r2
            java.lang.Object r0 = r0.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()     // Catch:{ all -> 0x041a }
            monitor-enter(r2)
            int r0 = r2.A00     // Catch:{ all -> 0x0417 }
            int r0 = r0 + -1
            r2.A00 = r0     // Catch:{ all -> 0x0417 }
            X.C81873xm.A00(r2)     // Catch:{ all -> 0x0417 }
            monitor-exit(r2)     // Catch:{ all -> 0x0417 }
            return
        L_0x0417:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0417 }
            throw r1
        L_0x041a:
            r1 = move-exception
            monitor-enter(r2)
            int r0 = r2.A00     // Catch:{ all -> 0x0427 }
            int r0 = r0 + -1
            r2.A00 = r0     // Catch:{ all -> 0x0427 }
            X.C81873xm.A00(r2)     // Catch:{ all -> 0x0427 }
        L_0x0425:
            monitor-exit(r2)     // Catch:{ all -> 0x0427 }
            goto L_0x0429
        L_0x0427:
            r1 = move-exception
            goto L_0x0425
        L_0x0429:
            throw r1
        L_0x042a:
            java.lang.Object r3 = r0.A01
            X.6Tf r3 = (X.C132356Tf) r3
            monitor-enter(r3)
            java.util.Map r2 = r3.A06     // Catch:{ all -> 0x043e }
            java.lang.Object r1 = r0.A00     // Catch:{ all -> 0x043e }
            android.os.Handler r1 = (android.os.Handler) r1     // Catch:{ all -> 0x043e }
            java.lang.Boolean r0 = X.C36381kD.A0j()     // Catch:{ all -> 0x043e }
            r2.put(r1, r0)     // Catch:{ all -> 0x043e }
            monitor-exit(r3)     // Catch:{ all -> 0x043e }
            return
        L_0x043e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x043e }
            throw r0
        L_0x0441:
            java.lang.Object r3 = r0.A00
            X.3So r3 = (X.C65563So) r3
            java.lang.Object r4 = r0.A01
            X.38p r4 = (X.C606338p) r4
            X.6Oq r0 = X.C131336Oq.A00()
            X.7lZ r0 = r0.A00
            byte[] r1 = r0.B7p()
            byte[] r0 = r0.generatePublicKey(r1)
            X.35y r2 = new X.35y
            r2.<init>(r0, r1)
            byte[] r1 = r2.A01
            r0 = 3
            java.lang.String r11 = android.util.Base64.encodeToString(r1, r0)
            X.2zk r0 = r3.A01
            X.0w4 r0 = r0.A00
            X.0tq r1 = r0.A00
            X.0yC r8 = X.C36341k9.A0V(r1)
            X.0ww r6 = X.C36381kD.A0U(r1)
            X.0v0 r7 = X.C36351kA.A0Y(r1)
            X.004 r0 = r1.A96
            X.005 r10 = X.C18840tu.A00(r0)
            X.004 r12 = r1.A8H
            X.004 r13 = r1.A0d
            X.004 r0 = r1.A3W
            java.lang.Object r9 = r0.get()
            X.1WF r9 = (X.AnonymousClass1WF) r9
            X.2V2 r5 = new X.2V2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            X.3mX r0 = new X.3mX
            r0.<init>(r4, r3, r2)
            r5.Blp(r0)
            return
        L_0x0495:
            java.lang.Object r3 = r0.A00
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            java.lang.Object r2 = r0.A01
            X.1lQ r2 = (X.C36861lQ) r2
            boolean r0 = r3 instanceof com.whatsapp.status.ContactStatusThumbnail
            if (r0 == 0) goto L_0x04ab
            r0 = r3
            com.whatsapp.components.button.ThumbnailButton r0 = (com.whatsapp.components.button.ThumbnailButton) r0
            float r1 = r0.A00
            r0 = 2
            float r0 = (float) r0
            float r1 = r1 / r0
            r2.A00 = r1
        L_0x04ab:
            r3.setImageDrawable(r2)
            return
        L_0x04af:
            java.lang.Object r2 = r0.A00
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r1 = r0.A01
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            r2.setBackground(r1)
            return
        L_0x04bf:
            java.lang.Object r1 = r0.A00
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r5 = r0.A01
            X.3OF r5 = (X.AnonymousClass3OF) r5
            X.C36321k7.A0w(r1, r5)
            java.util.LinkedHashSet r4 = X.C36441kJ.A17()
            java.util.Iterator r6 = r1.iterator()
        L_0x04d2:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0518
            com.whatsapp.jid.UserJid r1 = X.C36441kJ.A0o(r6)
            X.17X r0 = r5.A0A
            X.17r r0 = r0.A07
            java.util.HashSet r0 = r0.A0F(r1)
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r0.iterator()
        L_0x04ec:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x04fe
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.AnonymousClass147
            if (r0 == 0) goto L_0x04ec
            r3.add(r1)
            goto L_0x04ec
        L_0x04fe:
            java.util.ArrayList r2 = X.C36321k7.A0J(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x0506:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0514
            java.lang.Object r0 = r1.next()
            r2.add(r0)
            goto L_0x0506
        L_0x0514:
            r4.addAll(r2)
            goto L_0x04d2
        L_0x0518:
            X.AnonymousClass3OF.A00(r5, r4)
            return
        L_0x051c:
            java.lang.Object r3 = r0.A00
            X.3OF r3 = (X.AnonymousClass3OF) r3
            java.lang.Object r2 = r0.A01
            X.4W3 r2 = (X.AnonymousClass4W3) r2
            r1 = 0
            X.AnonymousClass00C.A0D(r3, r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.A01
            r0.getAndSet(r1)
            X.AnonymousClass4W3.A02(r2)
            return
        L_0x0531:
            java.lang.Object r2 = r0.A00
            int[] r2 = (int[]) r2
            java.lang.Object r1 = r0.A01
            com.whatsapp.textstatus.AddTextStatusActivity r1 = (com.whatsapp.textstatus.AddTextStatusActivity) r1
            android.content.res.Resources r4 = r1.getResources()
            X.AnonymousClass00C.A08(r4)
            X.1H2 r3 = r1.A0C
            X.AnonymousClass00C.A08(r3)
            X.2M9 r5 = new X.2M9
            r5.<init>(r2)
            r7 = -1
            r6 = 1065353216(0x3f800000, float:1.0)
            android.graphics.drawable.Drawable r0 = r3.A06(r4, r5, r6, r7)
            com.whatsapp.textstatus.AddTextStatusActivity.A01(r0, r1)
            return
        L_0x0556:
            java.lang.Object r8 = r0.A00
            com.whatsapp.textstatus.AddTextStatusActivity r8 = (com.whatsapp.textstatus.AddTextStatusActivity) r8
            java.lang.Object r7 = r0.A01
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            r6 = 0
            java.util.List r5 = r8.A0M
            boolean r0 = r5.isEmpty()
            r4 = 8
            if (r0 == 0) goto L_0x0576
            r0 = 2131434479(0x7f0b1bef, float:1.8490773E38)
            X.C36341k9.A13(r8, r0, r4)
        L_0x056f:
            r0 = 2131433001(0x7f0b1629, float:1.8487775E38)
            X.C36341k9.A13(r8, r0, r4)
            return
        L_0x0576:
            X.1H2 r3 = r8.A0C
            X.AnonymousClass00C.A07(r3)
            X.33C r2 = r8.A0L
            X.33B r1 = r8.A0K
            X.1vx r0 = new X.1vx
            r0.<init>(r3, r1, r2, r5)
            r8.A0C = r0
            X.C36321k7.A0Q(r7)
            X.1vx r0 = r8.A0C
            if (r0 != 0) goto L_0x0592
            java.lang.RuntimeException r0 = X.C36331k8.A0Y()
            throw r0
        L_0x0592:
            r7.setAdapter(r0)
            r7.setVisibility(r6)
            goto L_0x056f
        L_0x0599:
            java.lang.Object r2 = r0.A00
            com.whatsapp.textstatus.AddTextStatusActivity r2 = (com.whatsapp.textstatus.AddTextStatusActivity) r2
            java.lang.Object r1 = r0.A01
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            com.whatsapp.WaImageButton r0 = r2.A02
            if (r0 != 0) goto L_0x05ac
            java.lang.String r0 = "emojiButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05ac:
            r0.setImageDrawable(r1)
            return
        L_0x05b0:
            java.lang.Object r3 = r0.A00
            X.3J6 r3 = (X.AnonymousClass3J6) r3
            java.lang.Object r2 = r0.A01
            com.whatsapp.textstatus.AddTextStatusActivity r2 = (com.whatsapp.textstatus.AddTextStatusActivity) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            r1 = 1
            boolean r0 = r3.A02()
            if (r0 == 0) goto L_0x05c6
            r3.A01(r1)
        L_0x05c6:
            com.whatsapp.textstatus.AddTextStatusActivity.A07(r2)
            X.1vx r1 = r2.A0C
            r0 = 0
            if (r1 != 0) goto L_0x05d3
            java.lang.RuntimeException r0 = X.C36331k8.A0Y()
            throw r0
        L_0x05d3:
            r1.A00 = r0
            return
        L_0x05d6:
            java.lang.Object r4 = r0.A00
            com.whatsapp.support.faq.SearchFAQ r4 = (com.whatsapp.support.faq.SearchFAQ) r4
            java.lang.Object r3 = r0.A01
            X.0yK r3 = (X.C20890yK) r3
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.Object[] r1 = X.AnonymousClass001.A0M()
            int r0 = r4.A00
            X.AnonymousClass000.A1J(r1, r0)
            java.util.HashSet r0 = r4.A0B
            int r0 = r0.size()
            X.AnonymousClass000.A1K(r1, r0)
            java.lang.String r0 = "search-faq/post-event count:%d read:%d"
            java.lang.String.format(r2, r0, r1)
            X.0yW r0 = r4.A02
            r0.Blw(r3)
            return
        L_0x05fd:
            java.lang.Object r3 = r0.A00
            com.whatsapp.support.faq.SearchFAQ r3 = (com.whatsapp.support.faq.SearchFAQ) r3
            java.lang.Object r2 = r0.A01
            android.content.Intent r2 = (android.content.Intent) r2
            java.lang.String r1 = "com.whatsapp.support.faq.SearchFAQ.showContactUs"
            boolean r0 = r2.hasExtra(r1)
            if (r0 == 0) goto L_0x0621
            boolean r0 = X.C36421kH.A1T(r2, r1)
            if (r0 == 0) goto L_0x0621
            X.3DY r2 = r3.A01
            X.1CF r0 = r3.A03
            boolean r1 = r0.A00()
            java.lang.String r0 = r3.A06
            X.AnonymousClass3DY.A00(r3, r2, r0, r1)
            return
        L_0x0621:
            java.lang.String r0 = r3.A06
            boolean r0 = X.C1906499t.A00(r0)
            if (r0 == 0) goto L_0x0650
            X.0yf r0 = r3.A06
            X.0yj r1 = X.C21100yf.A24
            java.lang.String r0 = r0.A07(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0650
            X.0yf r0 = r3.A06
            java.lang.String r8 = r0.A07(r1)
        L_0x063d:
            X.3FE r2 = r3.A04
            java.lang.String r6 = r3.A06
            java.lang.String r7 = r3.A07
            java.lang.String r9 = r3.A08
            java.util.ArrayList r10 = r3.A09
            java.util.List r11 = r3.A0C
            r12 = 1
            r4 = 0
            r5 = r4
            r2.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0650:
            r8 = 0
            goto L_0x063d
        L_0x0652:
            java.lang.Object r4 = r0.A00
            com.whatsapp.support.DescribeProblemActivity r4 = (com.whatsapp.support.DescribeProblemActivity) r4
            java.lang.Object r0 = r0.A01
            X.14u r0 = (X.C225314u) r0
            X.3E6 r1 = r4.A0B
            android.widget.EditText r2 = r4.A02
            java.lang.String r21 = X.C36331k8.A0f(r2)
            androidx.appcompat.widget.AppCompatCheckBox r2 = r4.A03
            if (r2 == 0) goto L_0x066d
            boolean r3 = r2.isChecked()
            r2 = 1
            if (r3 != 0) goto L_0x066e
        L_0x066d:
            r2 = 0
        L_0x066e:
            r11 = 0
            if (r2 == 0) goto L_0x06a3
            java.lang.String r7 = r4.A0M
            java.lang.String r8 = r4.A0N
            X.3Kk r2 = r4.A0F
            if (r2 == 0) goto L_0x067d
            java.util.ArrayList r11 = r2.A00()
        L_0x067d:
            r6 = 0
            X.1bS r3 = r4.A0I
            X.0wx r2 = r4.A08
            long r14 = r2.A01()
            X.0wx r2 = r4.A08
            long r16 = r2.A02()
            java.lang.String r10 = android.os.Environment.getExternalStorageState()
            X.1ft r2 = r4.A0A
            android.util.Pair r5 = r2.A00()
            r18 = 1
            r12 = r6
            r13 = r6
            r19 = 1
            r20 = 1
            r9 = r6
            java.lang.String r11 = r3.A05(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20)
        L_0x06a3:
            r23 = 1
            X.3n6 r2 = new X.3n6
            r2.<init>(r0, r4)
            r24 = 1
            r19 = r1
            r20 = r2
            r22 = r11
            r19.A00(r20, r21, r22, r23, r24)
            return
        L_0x06b6:
            java.lang.Object r4 = r0.A00
            com.whatsapp.storage.StorageUsageGalleryActivity r4 = (com.whatsapp.storage.StorageUsageGalleryActivity) r4
            java.lang.Object r2 = r0.A01
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.String r0 = "storage-usage-gallery-activity/load duplicate messages/timed out"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.storage.StorageUsageGalleryActivity.A01(r4)
            r1 = 1
            X.4Yr r0 = new X.4Yr
            r0.<init>(r4, r1)
            com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment r3 = com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment.A03(r0, r2, r2)
            X.01z r1 = r4.getSupportFragmentManager()
            goto L_0x0a4f
        L_0x06d6:
            java.lang.Object r3 = r0.A00
            com.whatsapp.storage.StorageUsageActivity r3 = (com.whatsapp.storage.StorageUsageActivity) r3
            java.lang.Object r2 = r0.A01
            X.37V r2 = (X.AnonymousClass37V) r2
            java.lang.String r0 = "storage-usage-activity/fetch media size/completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1wZ r1 = r3.A0H
            r1.A03 = r2
            r0 = 1
            int r0 = X.C41071wZ.A02(r1, r0)
            r1.A07(r0)
            r0 = 0
            com.whatsapp.storage.StorageUsageActivity.A0G(r3, r0)
            return
        L_0x06f4:
            java.lang.Object r2 = r0.A00
            com.whatsapp.storage.StorageUsageActivity r2 = (com.whatsapp.storage.StorageUsageActivity) r2
            java.lang.Object r1 = r0.A01
            X.37U r1 = (X.AnonymousClass37U) r1
            java.lang.String r0 = "storage-usage-activity/fetch large files/completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 1
            com.whatsapp.storage.StorageUsageActivity.A0G(r2, r0)
            X.1wZ r0 = r2.A0H
            r0.A02 = r1
            goto L_0x071f
        L_0x070a:
            java.lang.Object r2 = r0.A00
            com.whatsapp.storage.StorageUsageActivity r2 = (com.whatsapp.storage.StorageUsageActivity) r2
            java.lang.Object r1 = r0.A01
            X.37U r1 = (X.AnonymousClass37U) r1
            java.lang.String r0 = "storage-usage-activity/fetch forwarded files/completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2
            com.whatsapp.storage.StorageUsageActivity.A0G(r2, r0)
            X.1wZ r0 = r2.A0H
            r0.A01 = r1
        L_0x071f:
            X.C41071wZ.A03(r0)
            return
        L_0x0723:
            java.lang.Object r11 = r0.A00
            X.5HA r11 = (X.AnonymousClass5HA) r11
            java.lang.Object r10 = r0.A01
            X.68B r10 = (X.AnonymousClass68B) r10
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.util.ArrayList r18 = X.AnonymousClass001.A0I()
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.List r4 = r10.A05
            java.lang.String r1 = r10.A0D
            java.lang.Integer r0 = X.C36381kD.A0m()
            X.6c4 r13 = X.AnonymousClass3N8.A00(r0, r1, r4)
            java.util.List r1 = r10.A05
            java.lang.String r0 = r10.A0C
            java.lang.Integer r12 = X.C36361kB.A0i()
            X.6c4 r2 = X.AnonymousClass3N8.A00(r12, r0, r1)
            X.17Y r3 = r11.A0D
            r1 = 7
            X.737 r0 = new X.737
            r0.<init>(r11, r13, r2, r1)
            r3.A0H(r0)
            java.util.Iterator r17 = r4.iterator()
        L_0x076a:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x07d3
            java.lang.Object r2 = r17.next()
            X.6c4 r2 = (X.C135066c4) r2
            if (r2 == 0) goto L_0x076a
            X.3S2 r0 = r2.A04
            if (r0 == 0) goto L_0x076a
            X.1XQ[] r13 = r0.A0D
            if (r13 == 0) goto L_0x076a
            X.3Rc r0 = r11.A0F
            r20 = r0
            java.util.HashSet r1 = X.C36441kJ.A16()
            int r0 = r13.length
            r19 = r0
            r14 = 0
        L_0x078c:
            r0 = r19
            if (r14 >= r0) goto L_0x07aa
            r15 = r13[r14]
            r0 = r20
            java.util.HashMap r0 = r0.A00
            boolean r16 = r0.containsKey(r15)
            if (r16 == 0) goto L_0x07a7
            java.lang.Object r0 = r0.get(r15)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x07a7
            r1.addAll(r0)
        L_0x07a7:
            int r14 = r14 + 1
            goto L_0x078c
        L_0x07aa:
            A03(r12, r2, r1, r9)
            java.lang.Integer r0 = X.C36371kC.A0p()
            A03(r0, r2, r1, r8)
            java.lang.Integer r0 = X.C36371kC.A0n()
            A03(r0, r2, r1, r7)
            java.lang.Integer r0 = X.C36371kC.A0o()
            A03(r0, r2, r1, r6)
            java.lang.Integer r13 = X.C36381kD.A0n()
            r0 = r18
            A03(r13, r2, r1, r0)
            java.lang.Integer r0 = X.C36361kB.A0j()
            A03(r0, r2, r1, r5)
            goto L_0x076a
        L_0x07d3:
            X.3xX r1 = X.C81763xX.A00
            java.util.Collections.sort(r9, r1)
            java.util.Collections.sort(r8, r1)
            java.util.Collections.sort(r7, r1)
            java.util.Collections.sort(r6, r1)
            r0 = r18
            java.util.Collections.sort(r0, r1)
            java.util.Collections.sort(r5, r1)
            java.util.HashMap r2 = X.AnonymousClass001.A0J()
            android.content.Context r12 = r11.A05
            r0 = 2131886622(0x7f12021e, float:1.9407828E38)
            java.lang.String r1 = r12.getString(r0)
            java.lang.String r0 = "id_all"
            A01(r10, r0, r1, r2, r4)
            r0 = 2131886626(0x7f120222, float:1.9407836E38)
            java.lang.String r1 = r12.getString(r0)
            java.lang.String r0 = "id_love"
            A01(r10, r0, r1, r2, r5)
            r0 = 2131886624(0x7f120220, float:1.9407832E38)
            java.lang.String r1 = r12.getString(r0)
            java.lang.String r0 = "id_haha"
            A01(r10, r0, r1, r2, r9)
            r0 = 2131886628(0x7f120224, float:1.940784E38)
            java.lang.String r1 = r12.getString(r0)
            java.lang.String r0 = "id_sad"
            A01(r10, r0, r1, r2, r7)
            r0 = 2131886623(0x7f12021f, float:1.940783E38)
            java.lang.String r1 = r12.getString(r0)
            java.lang.String r0 = "id_angry"
            A01(r10, r0, r1, r2, r6)
            r0 = 2131886627(0x7f120223, float:1.9407838E38)
            java.lang.String r1 = r12.getString(r0)
            java.lang.String r0 = "id_reaction"
            A01(r10, r0, r1, r2, r8)
            r0 = 24
            A00(r3, r11, r2, r0)
            return
        L_0x083d:
            java.lang.Object r2 = r0.A00
            X.3EH r2 = (X.AnonymousClass3EH) r2
            java.lang.Object r1 = r0.A01
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0 = 0
            r2.A01 = r0
            X.4lK r2 = r2.A03
            java.lang.String r1 = r1.toString()
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.C95494lK.A01(r2, r1, r0)
            return
        L_0x0856:
            java.lang.Object r2 = r0.A00
            X.3P6 r2 = (X.AnonymousClass3P6) r2
            java.lang.Object r7 = r0.A01
            X.6c4 r7 = (X.C135066c4) r7
            r11 = 0
            r12 = 1
            android.widget.ImageButton r1 = r2.A02
            if (r1 != 0) goto L_0x086b
            java.lang.String r0 = "emojiButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x086b:
            r0 = 8
            r1.setVisibility(r0)
            X.1RJ r0 = r2.A04
            if (r0 != 0) goto L_0x087b
            java.lang.String r0 = "stickersHintView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x087b:
            r0.A03(r11)
            android.animation.AnimatorSet r0 = r2.A01
            java.lang.String r4 = "hintIcon"
            if (r0 != 0) goto L_0x0893
            com.whatsapp.stickers.StickerView r0 = r2.A03
            if (r0 != 0) goto L_0x088d
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x088d:
            android.animation.AnimatorSet r0 = X.AnonymousClass3P6.A00(r0)
            r2.A01 = r0
        L_0x0893:
            android.animation.AnimatorSet r3 = r2.A06
            r3.play(r0)
            r3.start()
            X.1HA r5 = r2.A08
            com.whatsapp.stickers.StickerView r6 = r2.A03
            if (r6 != 0) goto L_0x08a6
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x08a6:
            android.content.res.Resources r1 = X.C36341k9.A0F(r6)
            r0 = 2131165974(0x7f070316, float:1.794618E38)
            int r9 = r1.getDimensionPixelSize(r0)
            com.whatsapp.stickers.StickerView r0 = r2.A03
            if (r0 != 0) goto L_0x08ba
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x08ba:
            android.content.res.Resources r1 = X.C36341k9.A0F(r0)
            r0 = 2131165973(0x7f070315, float:1.7946178E38)
            int r10 = r1.getDimensionPixelSize(r0)
            X.3rQ r8 = X.C78013rQ.A00
            r5.A09(r6, r7, r8, r9, r10, r11, r12)
            r0 = 28
            X.AnonymousClass4VL.A00(r3, r2, r0)
            return
        L_0x08d0:
            java.lang.Object r1 = r0.A00
            com.whatsapp.stickers.StickerView r1 = (com.whatsapp.stickers.StickerView) r1
            java.lang.Object r0 = r0.A01
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            com.whatsapp.stickers.StickerView.A00(r0, r1)
            return
        L_0x08dc:
            java.lang.Object r1 = r0.A00
            X.4Rw r1 = (X.C88224Rw) r1
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            X.C36321k7.A0w(r1, r0)
            r1.Bhe(r0)
            return
        L_0x08eb:
            java.lang.Object r1 = r0.A00
            X.5Ar r1 = (X.C104665Ar) r1
            java.lang.Object r4 = r0.A01
            r0 = 1
            X.AnonymousClass00C.A0D(r4, r0)
            java.util.ArrayList r3 = r1.A0F()
            X.17Y r2 = r1.A01
            r1 = 16
            X.3wd r0 = new X.3wd
            r0.<init>(r4, r3, r1)
            r2.Bp3(r0)
            return
        L_0x0906:
            java.lang.Object r5 = r0.A00
            X.38m r5 = (X.C606038m) r5
            java.lang.Object r4 = r0.A01
            X.1Bk r0 = r5.A02
            java.util.List r1 = r0.A00()
            X.17Y r3 = r5.A00
            r0 = 5
            X.737 r2 = new X.737
            r2.<init>(r1, r4, r5, r0)
            goto L_0x0ad8
        L_0x091c:
            java.lang.Object r2 = r0.A00
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r2 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r2
            java.lang.Object r1 = r0.A01
            X.141 r1 = (X.AnonymousClass141) r1
            X.16D r0 = r2.A0C
            if (r0 == 0) goto L_0x092c
            r0.A0Q(r1)
            return
        L_0x092c:
            java.lang.RuntimeException r0 = X.C36331k8.A0Z()
            throw r0
        L_0x0931:
            java.lang.Object r1 = r0.A00
            com.whatsapp.status.playback.MessageReplyActivity r1 = (com.whatsapp.status.playback.MessageReplyActivity) r1
            java.lang.Object r5 = r0.A01
            X.6c4 r5 = (X.C135066c4) r5
            r0 = -1
            r1.setResult(r0)
            X.1X4 r2 = r1.A0D
            X.11F r3 = r1.A0k
            X.C18740tg.A06(r3)
            X.3T1 r4 = r1.A0v
            java.lang.Integer r6 = X.C36421kH.A0V()
            r7 = 0
            r2.A0L(r3, r4, r5, r6, r7)
            com.whatsapp.status.playback.MessageReplyActivity.A0Q(r1)
            return
        L_0x0952:
            java.lang.Object r4 = r0.A00
            com.whatsapp.status.audienceselector.StatusPrivacyActivity r4 = (com.whatsapp.status.audienceselector.StatusPrivacyActivity) r4
            java.lang.Object r3 = r0.A01
            X.3XT r3 = (X.AnonymousClass3XT) r3
            X.16E r2 = r4.A0B
            if (r2 == 0) goto L_0x097f
            int r1 = r3.A00
            if (r1 == 0) goto L_0x0975
            r0 = 1
            if (r1 == r0) goto L_0x0972
            java.util.List r0 = r3.A02
        L_0x0967:
            r2.A0F(r0, r1)
            X.6sT r0 = r4.A09
            if (r0 == 0) goto L_0x0978
            r0.A01()
            return
        L_0x0972:
            java.util.List r0 = r3.A01
            goto L_0x0967
        L_0x0975:
            X.09w r0 = X.C023409w.A00
            goto L_0x0967
        L_0x0978:
            java.lang.String r0 = "syncdUpdateHelper"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x097f:
            java.lang.String r0 = "statusStore"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0986:
            java.lang.Object r4 = r0.A00
            X.1yu r4 = (X.C42491yu) r4
            java.lang.Object r3 = r0.A01
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            X.0tq r0 = r4.A0E
            X.1SV r2 = X.C36401kF.A0g(r0)
            android.widget.ImageView r1 = r4.A0C
            X.3ta r0 = r4.A0I
            r2.A0D(r1, r3, r0)
            return
        L_0x099c:
            java.lang.Object r4 = r0.A00
            X.1yu r4 = (X.C42491yu) r4
            java.lang.Object r3 = r0.A01
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            X.0tq r0 = r4.A0E
            X.1SV r2 = X.C36401kF.A0g(r0)
            android.widget.ImageView r1 = r4.A0C
            X.3ta r0 = r4.A0I
            r2.A0C(r1, r3, r0)
            return
        L_0x09b2:
            java.lang.Object r3 = r0.A00
            com.whatsapp.spamreport.ReportSpamDialogFragment r3 = (com.whatsapp.spamreport.ReportSpamDialogFragment) r3
            java.lang.Object r2 = r0.A01
            X.147 r2 = (X.AnonymousClass147) r2
            X.1LV r0 = r3.A02
            if (r0 == 0) goto L_0x09e1
            java.util.HashSet r1 = r0.A04(r2)
            X.3l6 r0 = r3.A03
            if (r0 == 0) goto L_0x09da
            com.whatsapp.community.CommunityExitDialogFragment r2 = com.whatsapp.community.CommunityExitDialogFragment.A03(r2, r1)
            X.01I r0 = r3.A0h()
            android.app.Activity r1 = X.C36381kD.A0A(r0)
            X.14u r1 = (X.C225314u) r1
            java.lang.String r0 = "CommunityExitDialogFragment"
            r1.Btl(r2, r0)
            return
        L_0x09da:
            java.lang.String r0 = "communityExitDialogFragmentBridge"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x09e1:
            java.lang.String r0 = "communityChatManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x09e8:
            java.lang.Object r3 = r0.A00
            com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity r3 = (com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity) r3
            java.lang.Object r0 = r0.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            X.2OW r2 = new X.2OW
            r2.<init>()
            r2.A00 = r0
            X.1EM r1 = r3.A09
            X.147 r0 = r3.A07
            int r0 = r1.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A01 = r0
            X.0yW r0 = r3.A04
            r0.Bly(r2)
            return
        L_0x0a0b:
            java.lang.Object r1 = r0.A00
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsViewModel r1 = (com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsViewModel) r1
            java.lang.Object r0 = r0.A01
            X.11F r0 = (X.AnonymousClass11F) r0
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsViewModel.A01(r0, r1)
            return
        L_0x0a17:
            java.lang.Object r3 = r0.A00
            com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview r3 = (com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview) r3
            java.lang.Object r2 = r0.A01
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            android.content.Intent r1 = X.C36431kI.A0D()
            android.net.Uri r0 = r3.A01
            r1.setData(r0)
            X.C36341k9.A0t(r1, r2)
            X.C36331k8.A0o(r3, r1)
            return
        L_0x0a2f:
            X.AnonymousClass4W3.A02(r6)
            return
        L_0x0a33:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0a36:
            java.lang.Object r2 = r5.A00
            X.02E r2 = (X.AnonymousClass02E) r2
            com.whatsapp.storage.StorageUsageDeleteCompleteDialogFragment r3 = new com.whatsapp.storage.StorageUsageDeleteCompleteDialogFragment
            r3.<init>()
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            java.lang.String r0 = "deleted_disk_size"
            r1.putLong(r0, r12)
            r3.A17(r1)
            X.01z r1 = r2.A0k()
        L_0x0a4f:
            r0 = 0
            r3.A1f(r1, r0)
            return
        L_0x0a54:
            boolean r1 = r10.moveToNext()     // Catch:{ all -> 0x0ab3 }
            if (r1 == 0) goto L_0x0a88
            java.lang.String r1 = "jid"
            java.lang.String r1 = X.C36341k9.A0f(r10, r1)     // Catch:{ all -> 0x0ab3 }
            X.11F r8 = X.C36421kH.A0N(r1)     // Catch:{ all -> 0x0ab3 }
            if (r8 == 0) goto L_0x0a54
            java.lang.String r1 = "conversation_size"
            long r6 = X.C36351kA.A07(r10, r1)     // Catch:{ all -> 0x0ab3 }
            java.lang.String r1 = "conversation_message_count"
            int r1 = X.C36351kA.A03(r10, r1)     // Catch:{ all -> 0x0ab3 }
            X.3Xe r3 = new X.3Xe     // Catch:{ all -> 0x0ab3 }
            r3.<init>()     // Catch:{ all -> 0x0ab3 }
            r3.A0I = r6     // Catch:{ all -> 0x0ab3 }
            r3.A06 = r1     // Catch:{ all -> 0x0ab3 }
            java.lang.String r2 = r8.getRawString()     // Catch:{ all -> 0x0ab3 }
            X.3v0 r1 = new X.3v0     // Catch:{ all -> 0x0ab3 }
            r1.<init>(r3, r8, r2)     // Catch:{ all -> 0x0ab3 }
            r9.add(r1)     // Catch:{ all -> 0x0ab3 }
            goto L_0x0a54
        L_0x0a88:
            r10.close()
            r5.A0Q = r9
            r2 = 0
            r1 = 0
            com.whatsapp.storage.StorageUsageActivity.A0H(r5, r9, r2, r1)
            java.lang.String r1 = "storage-usage-activity/fetch chats/cache completed"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.util.ArrayList r1 = r5.A0Q
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0aac
            r1 = 11
            X.3wb r2 = X.C81183wb.A00(r0, r1)
            X.17Y r1 = r5.A05
            r0 = 25
            A00(r1, r5, r2, r0)
        L_0x0aac:
            X.3Si r1 = r5.A0C
            r0 = 0
            X.C65503Si.A01(r0, r1, r4)
            return
        L_0x0ab3:
            r1 = move-exception
            if (r10 == 0) goto L_0x0abe
            r10.close()     // Catch:{ all -> 0x0aba }
            throw r1
        L_0x0aba:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0abe:
            throw r1
        L_0x0abf:
            java.lang.Object r4 = r0.A00
            com.whatsapp.status.playback.MessageReplyActivity r4 = (com.whatsapp.status.playback.MessageReplyActivity) r4
            java.lang.Object r1 = r0.A01
            X.6c4 r1 = (X.C135066c4) r1
            X.1C2 r0 = r4.A13
            X.6c4 r1 = r0.A01(r1)
            if (r1 == 0) goto L_0x0adc
            X.17Y r3 = r4.A05
            r0 = 10
            X.3wd r2 = new X.3wd
            r2.<init>(r4, r1, r0)
        L_0x0ad8:
            r3.A0H(r2)
            return
        L_0x0adc:
            X.1Ae r3 = r4.A0u
            r2 = 4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "hasAvatar="
            r1.append(r0)
            X.1BF r0 = r4.A0t
            boolean r0 = r0.A01()
            java.lang.String r1 = X.C36421kH.A0d(r1, r0)
            java.lang.String r0 = "failed_to_send_cleaned_sticker_quick_reply"
            r3.A02(r2, r0, r1)
            java.lang.String r0 = "MessageReplyActivity/sendAvatarReactionMessage/Failed to send avatar sticker, skipping"
        L_0x0af9:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0afd:
            X.04e r2 = r3.A03
            if (r2 != 0) goto L_0x0b08
            java.lang.String r0 = "crosspostAccountUnlinkingActivityResultLauncher"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0b08:
            r0.A05(r1, r2, r3, r4, r5)
            return
        L_0x0b0c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ FileNotFoundException -> 0x0b30 }
            java.lang.String r0 = "GalleryWallpaperPreview/saveWallpaperForChat/failed to open output stream for "
            r1.append(r0)     // Catch:{ FileNotFoundException -> 0x0b30 }
            android.net.Uri r0 = r5.A01     // Catch:{ FileNotFoundException -> 0x0b30 }
            java.lang.String r0 = r0.getPath()     // Catch:{ FileNotFoundException -> 0x0b30 }
            X.C36321k7.A1a(r1, r0)     // Catch:{ FileNotFoundException -> 0x0b30 }
            android.content.Intent r0 = X.C36431kI.A0D()     // Catch:{ FileNotFoundException -> 0x0b30 }
            android.content.Intent r0 = r0.putExtra(r7, r6)     // Catch:{ FileNotFoundException -> 0x0b30 }
            r5.setResult(r3, r0)     // Catch:{ FileNotFoundException -> 0x0b30 }
            goto L_0x0b4e
        L_0x0b2a:
            X.17Y r0 = r5.A05
            A00(r0, r5, r9, r6)
            return
        L_0x0b30:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0b52 }
            java.lang.String r0 = "GalleryWallpaperPreview/saveWallpaperForChat/file not found at "
            r1.append(r0)     // Catch:{ all -> 0x0b52 }
            android.net.Uri r0 = r5.A01     // Catch:{ all -> 0x0b52 }
            java.lang.String r0 = r0.getPath()     // Catch:{ all -> 0x0b52 }
            X.C36351kA.A1Q(r0, r1, r2)     // Catch:{ all -> 0x0b52 }
            android.content.Intent r0 = X.C36431kI.A0D()     // Catch:{ all -> 0x0b52 }
            android.content.Intent r0 = r0.putExtra(r7, r6)     // Catch:{ all -> 0x0b52 }
            r5.setResult(r3, r0)     // Catch:{ all -> 0x0b52 }
        L_0x0b4e:
            X.AnonymousClass14X.A02(r4)
            return
        L_0x0b52:
            r0 = move-exception
            X.AnonymousClass14X.A02(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81203wd.run():void");
    }

    public static void A01(AnonymousClass68B r0, String str, String str2, AbstractMap abstractMap, List list) {
        AnonymousClass68B A002 = AnonymousClass5HA.A00(r0, str, str2, list);
        abstractMap.put(A002.A0F, A002);
    }

    public static void A03(Object obj, Object obj2, AbstractCollection abstractCollection, AbstractCollection abstractCollection2) {
        if (abstractCollection.contains(obj)) {
            abstractCollection2.add(obj2);
        }
    }

    public C81203wd(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }
}
