package X;

/* renamed from: X.3wb  reason: invalid class name and case insensitive filesystem */
public class C81183wb implements Runnable {
    public Object A00;
    public final int A01;

    public C81183wb(C195489Um r2) {
        this.A01 = 2;
        this.A00 = AnonymousClass001.A0F(r2);
    }

    public static C81183wb A00(Object obj, int i) {
        return new C81183wb(obj, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02c5, code lost:
        com.whatsapp.storage.StorageUsageActivity.A0G((com.whatsapp.storage.StorageUsageActivity) r1, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02cb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        r3.postDelayed(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x037d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0381, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03db, code lost:
        r1.fullScroll(130);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03e0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            int r0 = r15.A01
            switch(r0) {
                case 0: goto L_0x003a;
                case 1: goto L_0x01d6;
                case 2: goto L_0x0054;
                case 3: goto L_0x0064;
                case 4: goto L_0x01e0;
                case 5: goto L_0x01eb;
                case 6: goto L_0x007e;
                case 7: goto L_0x01f3;
                case 8: goto L_0x029d;
                case 9: goto L_0x02a8;
                case 10: goto L_0x02b8;
                case 11: goto L_0x02bf;
                case 12: goto L_0x02cc;
                case 13: goto L_0x02d6;
                case 14: goto L_0x02e2;
                case 15: goto L_0x02ed;
                case 16: goto L_0x0317;
                case 17: goto L_0x0099;
                case 18: goto L_0x0325;
                case 19: goto L_0x0389;
                case 20: goto L_0x03a5;
                case 21: goto L_0x011e;
                case 22: goto L_0x03c8;
                case 23: goto L_0x03d3;
                case 24: goto L_0x03e1;
                case 25: goto L_0x0005;
                case 26: goto L_0x0178;
                case 27: goto L_0x014d;
                case 28: goto L_0x013e;
                case 29: goto L_0x014d;
                case 30: goto L_0x0178;
                case 31: goto L_0x0005;
                case 32: goto L_0x03f2;
                case 33: goto L_0x019d;
                case 34: goto L_0x0418;
                case 35: goto L_0x0443;
                case 36: goto L_0x04de;
                case 37: goto L_0x04f7;
                case 38: goto L_0x0500;
                case 39: goto L_0x051c;
                case 40: goto L_0x0525;
                case 41: goto L_0x05bc;
                case 42: goto L_0x01c5;
                case 43: goto L_0x05d4;
                case 44: goto L_0x0616;
                case 45: goto L_0x0624;
                case 46: goto L_0x0646;
                case 47: goto L_0x0653;
                case 48: goto L_0x0661;
                case 49: goto L_0x0692;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r15.A00
            X.1lt r4 = (X.C37151lt) r4
            int r0 = r4.A01
            if (r0 <= 0) goto L_0x0037
            float r2 = r4.A00
            float r0 = (float) r0
            float r2 = r2 / r0
        L_0x0011:
            r0 = 0
            r4.A00 = r0
            r0 = 0
            r4.A01 = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0027
            android.os.Handler r1 = r4.A06
            X.72t r0 = new X.72t
            r0.<init>(r4, r2)
            r1.post(r0)
        L_0x0027:
            android.os.Handler r3 = r4.A03
            if (r3 == 0) goto L_0x0036
            r0 = 25
            X.3wb r2 = A00(r4, r0)
            long r0 = r4.A05
        L_0x0033:
            r3.postDelayed(r2, r0)
        L_0x0036:
            return
        L_0x0037:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0011
        L_0x003a:
            java.lang.Object r0 = r15.A00
            X.5Ar r0 = (X.C104665Ar) r0
            X.1BB r0 = r0.A07
            java.util.Iterator r1 = X.C36361kB.A0s(r0)
        L_0x0044:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = r1.next()
            X.6Fn r0 = (X.C129156Fn) r0
            r0.A05()
            goto L_0x0044
        L_0x0054:
            java.lang.Object r0 = r15.A00
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r0 = r0.get()
            X.9Um r0 = (X.C195489Um) r0
            if (r0 == 0) goto L_0x0036
            r0.A00()
            return
        L_0x0064:
            java.lang.Object r3 = r15.A00
            com.whatsapp.stickers.store.StickerStoreActivity r3 = (com.whatsapp.stickers.store.StickerStoreActivity) r3
            com.whatsapp.stickers.store.StickerStoreMyTabFragment r1 = r3.A06
            X.1s8 r0 = r3.A04
            if (r0 == 0) goto L_0x0036
            java.util.List r0 = r0.A00
            int r2 = r0.indexOf(r1)
            r0 = -1
            if (r2 == r0) goto L_0x0036
            androidx.viewpager.widget.ViewPager r1 = r3.A00
            r0 = 1
            r1.A0J(r2, r0)
            return
        L_0x007e:
            java.lang.Object r0 = r15.A00
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r2 = r0.iterator()
        L_0x0086:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.String r1 = X.AnonymousClass001.A0C(r2)
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            X.AnonymousClass6YY.A0P(r0)
            goto L_0x0086
        L_0x0099:
            java.lang.Object r3 = r15.A00
            X.3O1 r3 = (X.AnonymousClass3O1) r3
            X.0wU r2 = r3.A05
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            X.0Bk r2 = X.C55882vL.A00(r2, r0)
            X.3Rr r8 = r3.A03     // Catch:{ 02S -> 0x06bb }
            X.199 r4 = r8.A00     // Catch:{ 02S -> 0x06bb }
            java.lang.String r7 = "STORAGE_USAGE_MEDIA_SIZE_CACHE_TIME"
            java.lang.Long r0 = r4.A06(r7)     // Catch:{ 02S -> 0x06bb }
            boolean r0 = X.AnonymousClass3O1.A00(r3, r0)     // Catch:{ 02S -> 0x06bb }
            if (r0 == 0) goto L_0x00d6
            java.lang.String r0 = "storage-usage-prefetcher/prefetch media size"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 02S -> 0x06bb }
            X.0y0 r0 = r3.A00     // Catch:{ 02S -> 0x06bb }
            java.io.File r0 = r0.A0H()     // Catch:{ 02S -> 0x06bb }
            long r5 = X.AnonymousClass6YY.A00(r2, r0)     // Catch:{ 02S -> 0x06bb }
            java.lang.String r1 = "STORAGE_USAGE_MEDIA_SIZE"
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ 02S -> 0x06bb }
            X.AnonymousClass199.A04(r4, r1, r0)     // Catch:{ 02S -> 0x06bb }
            X.C65343Rr.A00(r8, r7)     // Catch:{ 02S -> 0x06bb }
            java.lang.String r0 = "storage-usage-prefetcher/prefetch media size/completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 02S -> 0x06bb }
        L_0x00d6:
            java.lang.String r0 = "STORAGE_USAGE_LARGE_FILES_CACHE_TIME"
            java.lang.Long r0 = r4.A06(r0)     // Catch:{ 02S -> 0x06bb }
            boolean r0 = X.AnonymousClass3O1.A00(r3, r0)     // Catch:{ 02S -> 0x06bb }
            r5 = 10
            if (r0 == 0) goto L_0x00f4
            java.lang.String r0 = "storage-usage-prefetcher/prefetch large files"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 02S -> 0x06bb }
            X.3Ez r1 = r3.A04     // Catch:{ 02S -> 0x06bb }
            r0 = 2
            r1.A00(r2, r5, r0)     // Catch:{ 02S -> 0x06bb }
            java.lang.String r0 = "storage-usage-prefetcher/prefetch large files/completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 02S -> 0x06bb }
        L_0x00f4:
            java.lang.String r0 = "STORAGE_USAGE_FORWARDED_FILES_CACHE_TIME"
            java.lang.Long r0 = r4.A06(r0)     // Catch:{ 02S -> 0x06bb }
            boolean r0 = X.AnonymousClass3O1.A00(r3, r0)     // Catch:{ 02S -> 0x06bb }
            if (r0 == 0) goto L_0x0110
            java.lang.String r0 = "storage-usage-prefetcher/prefetch forwarded files"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 02S -> 0x06bb }
            X.3Ez r1 = r3.A04     // Catch:{ 02S -> 0x06bb }
            r0 = 1
            r1.A00(r2, r5, r0)     // Catch:{ 02S -> 0x06bb }
            java.lang.String r0 = "storage-usage-prefetcher/prefetch forwarded files/completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 02S -> 0x06bb }
        L_0x0110:
            java.lang.String r0 = "STORAGE_USAGE_CHAT_LIST_CACHE_TIME"
            java.lang.Long r0 = r4.A06(r0)     // Catch:{ 02S -> 0x06bb }
            boolean r0 = X.AnonymousClass3O1.A00(r3, r0)     // Catch:{ 02S -> 0x06bb }
            if (r0 == 0) goto L_0x0036
            goto L_0x06a0
        L_0x011e:
            java.lang.Object r0 = r15.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r0 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r0
            X.1sS r3 = r0.A0K
            X.6tS r1 = r3.A01
            boolean r0 = r1 instanceof X.AnonymousClass28S
            if (r0 == 0) goto L_0x0036
            X.28S r1 = (X.AnonymousClass28S) r1
            com.whatsapp.jid.UserJid r2 = r1.A00
            X.1KK r0 = r3.A0K
            java.lang.String r1 = r0.A08(r2)
            if (r1 == 0) goto L_0x013a
            X.6tS r0 = r3.A01
            r0.A0C = r1
        L_0x013a:
            X.C39471sS.A04(r3, r2)
            return
        L_0x013e:
            java.lang.Object r2 = r15.A00
            X.1lt r2 = (X.C37151lt) r2
            X.6Q9 r0 = r2.A04
            if (r0 != 0) goto L_0x0036
            X.70j r11 = new X.70j
            r11.<init>(r2)
            goto L_0x06c1
        L_0x014d:
            java.lang.Object r2 = r15.A00
            X.1lt r2 = (X.C37151lt) r2
            X.6Q9 r0 = r2.A04
            if (r0 == 0) goto L_0x016a
            float r1 = r0.A02()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x016a
            float r0 = r2.A00
            float r0 = r0 + r1
            r2.A00 = r0
            int r0 = r2.A01
            int r0 = r0 + 1
            r2.A01 = r0
        L_0x016a:
            android.os.Handler r3 = r2.A03
            if (r3 == 0) goto L_0x0036
            r0 = 29
            X.3wb r2 = A00(r2, r0)
            r0 = 16
            goto L_0x0033
        L_0x0178:
            java.lang.Object r5 = r15.A00
            X.1lt r5 = (X.C37151lt) r5
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r0 = r5.A02
            long r3 = r3 - r0
            android.os.Handler r2 = r5.A06
            r1 = 20
            X.3vB r0 = new X.3vB
            r0.<init>(r5, r3, r1)
            r2.post(r0)
            android.os.Handler r3 = r5.A03
            if (r3 == 0) goto L_0x0036
            r0 = 30
            X.3wb r2 = A00(r5, r0)
            r0 = 150(0x96, double:7.4E-322)
            goto L_0x0033
        L_0x019d:
            java.lang.Object r0 = r15.A00
            X.1lt r0 = (X.C37151lt) r0
            java.lang.ref.WeakReference r0 = r0.A0E
            java.lang.Object r2 = r0.get()
            X.6zV r2 = (X.C148836zV) r2
            if (r2 == 0) goto L_0x0036
            X.14r r1 = r2.A0F
            r0 = 2131889330(0x7f120cb2, float:1.941332E38)
            r1.BO5(r0)
            X.4Ol r0 = r2.A05
            if (r0 == 0) goto L_0x01c0
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r0 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r0
            X.6vw r0 = r0.A0g
            if (r0 == 0) goto L_0x01c0
            X.C146646vw.A00(r0)
        L_0x01c0:
            r0 = 1
            X.C148836zV.A03(r2, r0)
            return
        L_0x01c5:
            java.lang.Object r0 = r15.A00
            X.3Aa r0 = (X.C60963Aa) r0
            X.3J6 r1 = r0.A04
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x0036
            r0 = 1
            r1.A01(r0)
            return
        L_0x01d6:
            java.lang.Object r0 = r15.A00
            X.5Ar r0 = (X.C104665Ar) r0
            X.1BB r0 = r0.A07
            r0.A00()
            return
        L_0x01e0:
            java.lang.Object r0 = r15.A00
            com.whatsapp.stickers.store.StickerStoreActivity r0 = (com.whatsapp.stickers.store.StickerStoreActivity) r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r0.A01
            r0 = 3
            r1.A0W(r0)
            return
        L_0x01eb:
            java.lang.Object r0 = r15.A00
            com.whatsapp.stickers.store.StickerStoreMyTabFragment r0 = (com.whatsapp.stickers.store.StickerStoreMyTabFragment) r0
            com.whatsapp.stickers.store.StickerStoreMyTabFragment.A00(r0)
            return
        L_0x01f3:
            java.lang.Object r6 = r15.A00
            com.whatsapp.storage.StorageUsageActivity r6 = (com.whatsapp.storage.StorageUsageActivity) r6
            com.whatsapp.storage.StorageUsageActivity.A07(r6)
            com.whatsapp.storage.StorageUsageActivity.A0F(r6)
            java.lang.String r0 = "storage-usage-activity/fetch cache"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Rr r4 = r6.A0I
            java.lang.String r3 = "STORAGE_USAGE_MEDIA_SIZE_CACHE_TIME"
            boolean r0 = X.C65343Rr.A01(r4, r3)
            if (r0 != 0) goto L_0x0217
            X.199 r2 = r4.A00
            r1 = 0
            X.AnonymousClass199.A04(r2, r3, r1)
            java.lang.String r0 = "STORAGE_USAGE_MEDIA_SIZE"
            X.AnonymousClass199.A04(r2, r0, r1)
        L_0x0217:
            java.lang.String r3 = "STORAGE_USAGE_LARGE_FILES_CACHE_TIME"
            boolean r0 = X.C65343Rr.A01(r4, r3)
            if (r0 != 0) goto L_0x0234
            X.199 r2 = r4.A00
            r1 = 0
            X.AnonymousClass199.A04(r2, r3, r1)
            java.lang.String r0 = "STORAGE_USAGE_LARGE_FILES_MEDIA_SIZE"
            X.AnonymousClass199.A04(r2, r0, r1)
            java.lang.String r0 = "STORAGE_USAGE_LARGE_FILES_COUNT"
            X.AnonymousClass199.A04(r2, r0, r1)
            java.lang.String r0 = "STORAGE_USAGE_LARGE_FILES_ROW_IDS"
            X.AnonymousClass199.A04(r2, r0, r1)
        L_0x0234:
            java.lang.String r3 = "STORAGE_USAGE_FORWARDED_FILES_CACHE_TIME"
            boolean r0 = X.C65343Rr.A01(r4, r3)
            if (r0 != 0) goto L_0x0251
            X.199 r2 = r4.A00
            r1 = 0
            X.AnonymousClass199.A04(r2, r3, r1)
            java.lang.String r0 = "STORAGE_USAGE_FORWARDED_FILES_MEDIA_SIZE"
            X.AnonymousClass199.A04(r2, r0, r1)
            java.lang.String r0 = "STORAGE_USAGE_FORWARDED_FILES_COUNT"
            X.AnonymousClass199.A04(r2, r0, r1)
            java.lang.String r0 = "STORAGE_USAGE_FORWARDED_FILES_ROW_IDS"
            X.AnonymousClass199.A04(r2, r0, r1)
        L_0x0251:
            X.3Rr r0 = r6.A0I
            X.3AN r5 = r0.A02()
            java.lang.Long r0 = r5.A04
            if (r0 != 0) goto L_0x0287
            r8 = 0
        L_0x025c:
            java.util.List r4 = r5.A06
            java.lang.Integer r3 = r5.A01
            java.lang.Long r2 = r5.A03
            X.1SV r1 = r6.A0L
            X.1A1 r0 = r6.A0K
            X.37U r7 = X.AnonymousClass1V2.A03(r0, r1, r3, r2, r4)
            java.util.List r4 = r5.A05
            java.lang.Integer r3 = r5.A00
            java.lang.Long r2 = r5.A02
            X.1SV r1 = r6.A0L
            X.1A1 r0 = r6.A0K
            X.37U r9 = X.AnonymousClass1V2.A03(r0, r1, r3, r2, r4)
            r10 = 18
            X.753 r4 = new X.753
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.17Y r1 = r6.A05
            r0 = 25
            X.C81203wd.A00(r1, r6, r4, r0)
            return
        L_0x0287:
            long r9 = r0.longValue()
            X.0wx r0 = r6.A08
            long r11 = r0.A01()
            X.0wx r0 = r6.A08
            long r13 = r0.A03()
            X.37V r8 = new X.37V
            r8.<init>(r9, r11, r13)
            goto L_0x025c
        L_0x029d:
            java.lang.Object r0 = r15.A00
            com.whatsapp.storage.StorageUsageActivity r0 = (com.whatsapp.storage.StorageUsageActivity) r0
            com.whatsapp.storage.StorageUsageActivity.A07(r0)
            com.whatsapp.storage.StorageUsageActivity.A0F(r0)
            return
        L_0x02a8:
            java.lang.Object r3 = r15.A00
            com.whatsapp.storage.StorageUsageActivity r3 = (com.whatsapp.storage.StorageUsageActivity) r3
            X.2pI r0 = X.C52352pI.ALL
            r3.A0G = r0
            java.util.ArrayList r2 = r3.A0Q
            r1 = 0
            r0 = 0
            com.whatsapp.storage.StorageUsageActivity.A0H(r3, r2, r1, r0)
            return
        L_0x02b8:
            java.lang.Object r0 = r15.A00
            X.2rU r0 = (X.C53542rU) r0
            java.lang.Object r1 = r0.A00
            goto L_0x02c5
        L_0x02bf:
            java.lang.Object r0 = r15.A00
            X.3wd r0 = (X.C81203wd) r0
            java.lang.Object r1 = r0.A01
        L_0x02c5:
            com.whatsapp.storage.StorageUsageActivity r1 = (com.whatsapp.storage.StorageUsageActivity) r1
            r0 = 3
            com.whatsapp.storage.StorageUsageActivity.A0G(r1, r0)
            return
        L_0x02cc:
            java.lang.Object r2 = r15.A00
            X.1wZ r2 = (X.C41071wZ) r2
            r1 = 2
            r0 = 1
            X.C41071wZ.A04(r2, r1, r0)
            return
        L_0x02d6:
            java.lang.Object r0 = r15.A00
            X.4Vm r0 = (X.C89164Vm) r0
            java.lang.Object r0 = r0.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1c()
            return
        L_0x02e2:
            java.lang.Object r1 = r15.A00
            X.14u r1 = (X.C225314u) r1
            r0 = 2131888725(0x7f120a55, float:1.9412093E38)
            r1.Bu1(r0)
            return
        L_0x02ed:
            java.lang.Object r3 = r15.A00
            com.whatsapp.storage.StorageUsageGalleryActivity r3 = (com.whatsapp.storage.StorageUsageGalleryActivity) r3
            r1 = 2131890828(0x7f12128c, float:1.9416359E38)
            r0 = 0
            com.whatsapp.dialogs.ProgressDialogFragment r1 = com.whatsapp.dialogs.ProgressDialogFragment.A03(r0, r1)
            r3.A0K = r1
            r0 = 1
            r1.A1g(r0)
            com.whatsapp.dialogs.ProgressDialogFragment r2 = r3.A0K
            r1 = 4
            X.4ZV r0 = new X.4ZV
            r0.<init>(r3, r1)
            r2.A00 = r0
            X.01z r1 = r3.getSupportFragmentManager()
            java.lang.Class<com.whatsapp.dialogs.ProgressDialogFragment> r0 = com.whatsapp.dialogs.ProgressDialogFragment.class
            java.lang.String r0 = r0.getName()
            r2.A1f(r1, r0)
            return
        L_0x0317:
            java.lang.Object r3 = r15.A00
            com.whatsapp.storage.StorageUsageMediaPreviewView r3 = (com.whatsapp.storage.StorageUsageMediaPreviewView) r3
            java.util.List r2 = r3.A05
            int r1 = r3.A00
            java.lang.String r0 = r3.A04
            r3.setPreviewMediaItems(r2, r1, r0)
            return
        L_0x0325:
            java.lang.Object r7 = r15.A00
            com.whatsapp.textstatus.AddTextStatusActivity r7 = (com.whatsapp.textstatus.AddTextStatusActivity) r7
            java.util.List r0 = r7.A0M
            java.lang.String r6 = "\n"
            r5 = 0
            r4 = 1
            X.AnonymousClass00C.A0D(r0, r4)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0382 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ IOException -> 0x0382 }
        L_0x033a:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x0382 }
            if (r0 == 0) goto L_0x0357
            java.lang.Object r1 = r2.next()     // Catch:{ IOException -> 0x0382 }
            X.3Jg r1 = (X.C63233Jg) r1     // Catch:{ IOException -> 0x0382 }
            java.lang.String r0 = r1.A02     // Catch:{ IOException -> 0x0382 }
            r3.append(r0)     // Catch:{ IOException -> 0x0382 }
            r3.append(r6)     // Catch:{ IOException -> 0x0382 }
            java.lang.String r0 = r1.A03     // Catch:{ IOException -> 0x0382 }
            r3.append(r0)     // Catch:{ IOException -> 0x0382 }
            r3.append(r6)     // Catch:{ IOException -> 0x0382 }
            goto L_0x033a
        L_0x0357:
            int r0 = r3.length()     // Catch:{ IOException -> 0x0382 }
            if (r0 <= r4) goto L_0x0365
            int r0 = r3.length()     // Catch:{ IOException -> 0x0382 }
            int r0 = r0 - r4
            r3.deleteCharAt(r0)     // Catch:{ IOException -> 0x0382 }
        L_0x0365:
            java.lang.String r0 = "customTSValues"
            java.io.FileOutputStream r0 = r7.openFileOutput(r0, r5)     // Catch:{ IOException -> 0x0382 }
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0382 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0382 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x037b }
            r2.writeObject(r0)     // Catch:{ all -> 0x037b }
            r2.close()     // Catch:{ IOException -> 0x0382 }
            return
        L_0x037b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x037d }
        L_0x037d:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ IOException -> 0x0382 }
            throw r0     // Catch:{ IOException -> 0x0382 }
        L_0x0382:
            r1 = move-exception
            java.lang.String r0 = "SaveCustomStatus"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x0389:
            java.lang.Object r3 = r15.A00
            com.whatsapp.textstatus.AddTextStatusActivity r3 = (com.whatsapp.textstatus.AddTextStatusActivity) r3
            android.content.res.Resources r2 = r3.getResources()
            X.AnonymousClass00C.A08(r2)
            X.1H2 r0 = r3.A0C
            X.AnonymousClass00C.A08(r0)
            java.lang.String r1 = "💬"
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3SX.A00(r2, r0, r1)
            com.whatsapp.textstatus.AddTextStatusActivity.A01(r0, r3)
            r3.A0E = r1
            return
        L_0x03a5:
            java.lang.Object r3 = r15.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r3 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r3
            android.view.View r1 = r3.A04
            if (r1 == 0) goto L_0x03c0
            r0 = 8
            r1.setVisibility(r0)
            android.view.animation.AlphaAnimation r2 = X.C36371kC.A0L()
            r0 = 320(0x140, double:1.58E-321)
            r2.setDuration(r0)
            android.view.View r0 = r3.A04
            r0.startAnimation(r2)
        L_0x03c0:
            X.17Y r1 = r3.A05
            java.lang.Runnable r0 = r3.A14
            r1.A0G(r0)
            return
        L_0x03c8:
            java.lang.Object r0 = r15.A00
            X.4VI r0 = (X.AnonymousClass4VI) r0
            java.lang.Object r0 = r0.A01
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r0 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r0
            android.widget.ScrollView r1 = r0.A08
            goto L_0x03db
        L_0x03d3:
            java.lang.Object r0 = r15.A00
            X.2g6 r0 = (X.AnonymousClass2g6) r0
            X.3OJ r0 = r0.A00
            android.widget.ScrollView r1 = r0.A07
        L_0x03db:
            r0 = 130(0x82, float:1.82E-43)
            r1.fullScroll(r0)
            return
        L_0x03e1:
            java.lang.Object r1 = r15.A00
            java.io.File r1 = (java.io.File) r1
            boolean r0 = X.C224714l.A02()
            r0 = r0 ^ 1
            X.C18740tg.A0B(r0)
            X.AnonymousClass6YY.A0P(r1)
            return
        L_0x03f2:
            java.lang.Object r5 = r15.A00
            X.1lt r5 = (X.C37151lt) r5
            X.6Q9 r0 = r5.A04
            r4 = 0
            if (r0 == 0) goto L_0x0416
            X.00T r0 = r0.A0A
            java.lang.Object r3 = r0.getValue()
        L_0x0401:
            X.6Q9 r0 = r5.A04
            if (r0 == 0) goto L_0x0409
            java.io.File r4 = r0.A03()
        L_0x0409:
            android.os.Handler r2 = r5.A06
            r1 = 14
            X.737 r0 = new X.737
            r0.<init>(r5, r4, r3, r1)
            r2.post(r0)
            return
        L_0x0416:
            r3 = r4
            goto L_0x0401
        L_0x0418:
            java.lang.Object r3 = r15.A00
            X.6zX r3 = (X.C148856zX) r3
            X.6Tw r0 = r3.A02
            r2 = 0
            if (r0 == 0) goto L_0x0441
            int r1 = r0.A03()
        L_0x0425:
            X.6Tw r0 = r3.A02
            if (r0 == 0) goto L_0x042d
            int r2 = r0.A02()
        L_0x042d:
            if (r1 <= 0) goto L_0x0439
            X.00s r0 = r3.A07
            X.C36341k9.A16(r0, r2)
            X.00s r0 = r3.A06
            X.C36341k9.A16(r0, r1)
        L_0x0439:
            android.os.Handler r2 = r3.A04
            r0 = 16
            r2.postDelayed(r15, r0)
            return
        L_0x0441:
            r1 = 0
            goto L_0x0425
        L_0x0443:
            java.lang.Object r9 = r15.A00
            X.1tl r9 = (X.C39781tl) r9
            r0 = 0
            X.AnonymousClass00C.A0D(r9, r0)
            com.whatsapp.jid.UserJid r8 = r9.A00
            if (r8 != 0) goto L_0x0451
            com.whatsapp.jid.UserJid r8 = r9.A01
        L_0x0451:
            X.3K0 r7 = r9.A04
            boolean r0 = r7.A02
            if (r0 != 0) goto L_0x045b
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x049f
        L_0x045b:
            boolean r0 = r7.A04
            if (r0 != 0) goto L_0x049f
            X.1e8 r6 = r9.A03
            java.util.List r5 = r6.A00(r8)
        L_0x0465:
            r10 = 0
            if (r5 == 0) goto L_0x049d
            java.util.ArrayList r0 = X.C36441kJ.A15(r5)
            java.util.List r0 = X.C007103b.A0X(r0)
        L_0x0470:
            r9.A02 = r0
            X.1hi r5 = r9.A05
            r5.A04()
            int r4 = r7.A01
            float r3 = r7.A00
            if (r8 == 0) goto L_0x049b
            X.0wG r0 = r6.A04
            android.content.Context r2 = r0.A00
            X.AnonymousClass00C.A08(r2)
            X.16D r0 = r6.A02
            X.141 r1 = r0.A08(r8)
            if (r1 == 0) goto L_0x049b
            X.1Ps r0 = r6.A03
            android.graphics.Bitmap r1 = r0.A05(r2, r1, r3, r4)
        L_0x0492:
            X.3Q4 r0 = new X.3Q4
            r0.<init>(r1, r8, r10)
            r5.A0C(r0)
            return
        L_0x049b:
            r1 = r10
            goto L_0x0492
        L_0x049d:
            r0 = r10
            goto L_0x0470
        L_0x049f:
            X.1e8 r6 = r9.A03
            r5 = 0
            if (r8 == 0) goto L_0x0465
            X.005 r0 = r6.A05
            java.lang.Object r0 = r0.get()
            X.6BB r0 = (X.AnonymousClass6BB) r0
            X.6E1 r0 = r0.A00(r8)
            if (r0 == 0) goto L_0x0465
            java.util.List r0 = r0.A09
            java.util.ArrayList r5 = X.C36321k7.A0J(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x04bc:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0465
            java.lang.Object r0 = r4.next()
            X.3uw r0 = (X.C80153uw) r0
            java.lang.String r3 = r0.A01
            java.lang.String r2 = r0.A00
            X.1e9 r1 = r6.A00
            java.lang.String r0 = r8.getRawString()
            r1.A00(r0, r3)
            X.3uw r0 = new X.3uw
            r0.<init>(r3, r2)
            r5.add(r0)
            goto L_0x04bc
        L_0x04de:
            java.lang.Object r3 = r15.A00
            com.whatsapp.twofactor.SetEmailFragment r3 = (com.whatsapp.twofactor.SetEmailFragment) r3
            com.whatsapp.twofactor.TwoFactorAuthActivity r2 = r3.A05
            com.whatsapp.twofactor.SetEmailFragment$ConfirmSkipEmailDialog r1 = new com.whatsapp.twofactor.SetEmailFragment$ConfirmSkipEmailDialog
            r1.<init>()
            r0 = -1
            r1.A0y(r3, r0)
            java.lang.Class<com.whatsapp.twofactor.SetEmailFragment$ConfirmSkipEmailDialog> r0 = com.whatsapp.twofactor.SetEmailFragment.ConfirmSkipEmailDialog.class
            java.lang.String r0 = r0.getName()
            r2.Btl(r1, r0)
            return
        L_0x04f7:
            java.lang.Object r1 = r15.A00
            com.whatsapp.twofactor.SettingsTwoFactorAuthActivity r1 = (com.whatsapp.twofactor.SettingsTwoFactorAuthActivity) r1
            r0 = -1
            r1.Bjj(r0)
            return
        L_0x0500:
            java.lang.Object r4 = r15.A00
            com.whatsapp.twofactor.SettingsTwoFactorAuthActivity r4 = (com.whatsapp.twofactor.SettingsTwoFactorAuthActivity) r4
            X.1Uz r0 = r4.A0A
            java.lang.String r0 = r0.A02()
            boolean r0 = r0.isEmpty()
            r3 = r0 ^ 1
            X.17Y r2 = r4.A05
            r1 = 7
            X.3vD r0 = new X.3vD
            r0.<init>(r1, r4, r3)
            r2.A0H(r0)
            return
        L_0x051c:
            java.lang.Object r1 = r15.A00
            com.whatsapp.twofactor.TwoFactorAuthActivity r1 = (com.whatsapp.twofactor.TwoFactorAuthActivity) r1
            r0 = -1
            r1.Bjj(r0)
            return
        L_0x0525:
            java.lang.Object r3 = r15.A00
            com.whatsapp.twofactor.TwoFactorAuthActivity r3 = (com.whatsapp.twofactor.TwoFactorAuthActivity) r3
            r3.Bnv()
            int[] r1 = r3.A07
            int r0 = r1.length
            r4 = 0
            r2 = 1
            if (r0 != r2) goto L_0x0580
            r1 = r1[r4]
            if (r1 == r2) goto L_0x057a
            r0 = 2
            if (r1 != r0) goto L_0x0542
            X.17Y r1 = r3.A05
            r0 = 2131895112(0x7f122348, float:1.9425048E38)
        L_0x053f:
            r1.A06(r0, r2)
        L_0x0542:
            X.1Uz r0 = r3.A01
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0576
            int[] r0 = r3.A07
            r0 = r0[r4]
            if (r0 != r2) goto L_0x0576
            java.lang.String r0 = "TwoFactorAuthActivity/workflowComplete/start twoFactorAddEmailActivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Uz r0 = r3.A01
            r0.A00 = r4
            java.lang.String r5 = X.C36361kB.A0l()
            r4 = 3
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.twofactor.AddEmailActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "entrypoint"
            r2.putExtra(r0, r4)
            java.lang.String r0 = "session_id"
            r2.putExtra(r0, r5)
            r3.startActivity(r2)
        L_0x0576:
            r3.finish()
            return
        L_0x057a:
            X.17Y r1 = r3.A05
            r0 = 2131895103(0x7f12233f, float:1.942503E38)
            goto L_0x053f
        L_0x0580:
            X.01z r1 = r3.getSupportFragmentManager()
        L_0x0584:
            int r0 = r1.A0I()
            if (r0 <= 0) goto L_0x058e
            r1.A0W()
            goto L_0x0584
        L_0x058e:
            android.view.View r1 = r3.getCurrentFocus()
            if (r1 == 0) goto L_0x0599
            X.1N2 r0 = r3.A0C
            r0.A01(r1)
        L_0x0599:
            X.07B r0 = r3.A00
            if (r0 == 0) goto L_0x05a5
            r0.A0U(r4)
            X.07B r0 = r3.A00
            r0.A0W(r4)
        L_0x05a5:
            java.lang.String r2 = r3.A06
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            java.lang.String r0 = "primaryCTA"
            r1.putString(r0, r2)
            com.whatsapp.twofactor.DoneFragment r0 = new com.whatsapp.twofactor.DoneFragment
            r0.<init>()
            r0.A17(r1)
            r3.A3j(r0, r4)
            return
        L_0x05bc:
            java.lang.Object r3 = r15.A00
            com.whatsapp.twofactor.TwoFactorAuthActivity r3 = (com.whatsapp.twofactor.TwoFactorAuthActivity) r3
            java.lang.String r2 = r3.A02
            if (r2 != 0) goto L_0x05cc
            X.1Uz r0 = r3.A01
            java.lang.String r2 = r0.A02()
            r3.A02 = r2
        L_0x05cc:
            X.1Uz r1 = r3.A01
            java.lang.String r0 = r3.A04
            r1.A04(r2, r0)
            return
        L_0x05d4:
            java.lang.Object r3 = r15.A00
            X.2Mn r3 = (X.C44222Mn) r3
            r2 = 0
            X.12P r0 = r3.A04
            r0.A06()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0613
            X.0wQ r0 = r3.A01
            r0.A0G()
            X.142 r0 = r0.A0E
            if (r0 == 0) goto L_0x0606
            X.11F r1 = r0.A0H
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            if (r1 == 0) goto L_0x0606
            X.17X r0 = r3.A03
            X.17r r0 = r0.A07
            java.util.HashSet r0 = r0.A0F(r1)
            r1 = 1
            boolean r0 = X.C36411kG.A1a(r0)
            if (r0 != r1) goto L_0x0606
            X.0xQ r1 = r3.A05
            r0 = 3
            r1.A0U(r0, r2)
        L_0x0606:
            X.0v0 r0 = r3.A02
            r2 = 1
        L_0x0609:
            android.content.SharedPreferences$Editor r1 = X.C36331k8.A05(r0)
            java.lang.String r0 = "ug_sync_state"
            X.C36331k8.A0w(r1, r0, r2)
            return
        L_0x0613:
            X.0v0 r0 = r3.A02
            goto L_0x0609
        L_0x0616:
            java.lang.Object r0 = r15.A00
            X.01I r0 = X.C36441kJ.A0X(r0)
            X.14u r0 = X.C36401kF.A0L(r0)
            r0.Bnv()
            return
        L_0x0624:
            java.lang.Object r2 = r15.A00
            X.02E r2 = (X.AnonymousClass02E) r2
            X.01I r1 = r2.A0h()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.DialogActivity"
            X.AnonymousClass00C.A0E(r1, r0)
            X.14u r1 = (X.C225314u) r1
            r1.Bnv()
            X.01I r1 = r2.A0h()
            X.AnonymousClass00C.A0E(r1, r0)
            X.14u r1 = (X.C225314u) r1
            r0 = 2131894457(0x7f1220b9, float:1.942372E38)
            r1.BO5(r0)
            return
        L_0x0646:
            java.lang.Object r0 = r15.A00
            X.5LV r0 = (X.AnonymousClass5LV) r0
            android.media.MediaPlayer r0 = r0.A01
            r0.reset()
            r0.release()
            return
        L_0x0653:
            java.lang.Object r1 = r15.A00
            X.3A7 r1 = (X.AnonymousClass3A7) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.00S r0 = r1.A01
            r0.invoke()
            return
        L_0x0661:
            java.lang.Object r3 = r15.A00
            com.whatsapp.util.FloatingChildLayout r3 = (com.whatsapp.util.FloatingChildLayout) r3
            android.animation.ValueAnimator r0 = r3.A06
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x0673
            android.animation.ValueAnimator r0 = r3.A06
            r0.reverse()
            return
        L_0x0673:
            int[] r0 = X.C36441kJ.A1O()
            r0 = {0, 127} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofInt(r0)
            r3.A06 = r1
            r0 = 17
            X.C53562rW.A00(r1, r3, r0)
            android.animation.ValueAnimator r2 = r3.A06
            int r0 = r3.A01
            long r0 = (long) r0
            android.animation.ValueAnimator r0 = r2.setDuration(r0)
            r0.start()
            return
        L_0x0692:
            java.lang.Object r2 = r15.A00
            X.3Zz r2 = (X.C67483Zz) r2
            android.widget.TextView r1 = r2.A02
            r0 = 1
            r1.setSelected(r0)
            r0 = 0
            r2.A00 = r0
            return
        L_0x06a0:
            java.lang.String r0 = "storage-usage-prefetcher/prefetch chat list"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ RuntimeException -> 0x06b4 }
            X.3Si r1 = r3.A02     // Catch:{ RuntimeException -> 0x06b4 }
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C36431kI.A1H()     // Catch:{ RuntimeException -> 0x06b4 }
            X.C65503Si.A01(r2, r1, r0)     // Catch:{ RuntimeException -> 0x06b4 }
            java.lang.String r0 = "storage-usage-prefetcher/prefetch chat list/completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ RuntimeException -> 0x06b4 }
            return
        L_0x06b4:
            r1 = move-exception
            java.lang.String r0 = "StorageUsagePrefetcher/maybePrefetchStorageUsageData/loading-chat-list"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ 02S -> 0x06bb }
            return
        L_0x06bb:
            java.lang.String r0 = "storage-usage-prefetcherprefetch prefetch cancelled"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x06c1:
            X.0wo r9 = r2.A0C     // Catch:{ Exception -> 0x06e3 }
            X.0yC r10 = r2.A0D     // Catch:{ Exception -> 0x06e3 }
            X.17Y r6 = r2.A09     // Catch:{ Exception -> 0x06e3 }
            com.whatsapp.audioRecording.AudioRecordFactory r7 = r2.A0A     // Catch:{ Exception -> 0x06e3 }
            com.whatsapp.audioRecording.OpusRecorderFactory r8 = r2.A0B     // Catch:{ Exception -> 0x06e3 }
            X.0y0 r5 = r2.A08     // Catch:{ Exception -> 0x06e3 }
            X.0wN r4 = r2.A07     // Catch:{ Exception -> 0x06e3 }
            X.6Q9 r3 = new X.6Q9     // Catch:{ Exception -> 0x06e3 }
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x06e3 }
            r3.A04()     // Catch:{ Exception -> 0x06e3 }
            r3.A05()     // Catch:{ Exception -> 0x06e3 }
            r2.A04 = r3     // Catch:{ Exception -> 0x06e3 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x06e3 }
            r2.A02 = r0     // Catch:{ Exception -> 0x06e3 }
            return
        L_0x06e3:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = 1
            X.C37151lt.A00(r2, r0)
            android.os.Handler r1 = r2.A06
            r0 = 33
            X.3wb r0 = A00(r2, r0)
            r1.post(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81183wb.run():void");
    }

    public C81183wb(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
