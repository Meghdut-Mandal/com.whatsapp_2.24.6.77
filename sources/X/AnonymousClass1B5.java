package X;

import java.util.ArrayList;

/* renamed from: X.1B5  reason: invalid class name */
public final class AnonymousClass1B5 {
    public final C24041Av A00;
    public final C19630wG A01;
    public final AnonymousClass1B9 A02;
    public final AnonymousClass1B6 A03;
    public final AnonymousClass1B7 A04;
    public final C23991Aq A05;
    public final AnonymousClass005 A06;
    public final C23981Ap A07;

    public AnonymousClass1B5(C24041Av r2, C19630wG r3, C23981Ap r4, AnonymousClass1B9 r5, AnonymousClass1B6 r6, AnonymousClass1B7 r7, C23991Aq r8, AnonymousClass005 r9) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r8, 2);
        AnonymousClass00C.A0D(r4, 3);
        AnonymousClass00C.A0D(r6, 4);
        AnonymousClass00C.A0D(r7, 5);
        AnonymousClass00C.A0D(r9, 6);
        AnonymousClass00C.A0D(r5, 7);
        AnonymousClass00C.A0D(r2, 8);
        this.A01 = r3;
        this.A05 = r8;
        this.A07 = r4;
        this.A03 = r6;
        this.A04 = r7;
        this.A06 = r9;
        this.A02 = r5;
        this.A00 = r2;
    }

    public final int A01(String str) {
        AnonymousClass00C.A0D(str, 0);
        C18740tg.A00();
        return this.A02.A00(str);
    }

    public final AnonymousClass68B A02(String str) {
        AnonymousClass00C.A0D(str, 0);
        C18740tg.A00();
        ArrayList A022 = AnonymousClass1B6.A02(this.A03, "SELECT installed_id, installed_name, installed_size, installed_image_data_hash, installed_publisher, installed_description, installed_tray_image_id, installed_tray_image_preview_id, installed_animated_pack, installed_is_avatar_pack, installed_lottie_pack, installed_empty_favorites_avatar_template_id, installed_empty_recents_avatar_template_id, id, name, publisher, description, size, tray_image_id, preview_image_id_array, image_data_hash, tray_image_preview_id, animated_pack, lottie_pack FROM downloadable_sticker_packs LEFT JOIN installed_sticker_packs ON (id = installed_id) WHERE id= ?", "getDownloadableStickerPacks/QUERY", new String[]{str});
        if (A022.isEmpty()) {
            return null;
        }
        if (A022.size() < 2) {
            return (AnonymousClass68B) A022.get(0);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("StickerPackStore/getDownloadablePackById/there should only be one sticker that matches this id: ");
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    public final AnonymousClass68B A03(String str) {
        AnonymousClass00C.A0D(str, 0);
        C18740tg.A00();
        ArrayList A012 = AnonymousClass1B6.A01(this.A03, str);
        if (A012.isEmpty()) {
            return null;
        }
        if (A012.size() < 2) {
            AnonymousClass68B r2 = (AnonymousClass68B) A012.get(0);
            if (r2 == null) {
                return r2;
            }
            ArrayList A022 = this.A05.A02(str);
            this.A07.A05(A022);
            r2.A05 = A022;
            return r2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("StickerPackStore/getInstalledPackById/there should only be one sticker that matches this id: ");
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0094, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0095, code lost:
        X.C05600Qi.A00(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0098, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009c, code lost:
        X.C05600Qi.A00(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x009f, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0052, code lost:
        if (r5 <= 0) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(X.AnonymousClass68B r9, X.AnonymousClass1B5 r10, boolean r11) {
        /*
            X.C18740tg.A00()
            X.1B6 r0 = r10.A03
            java.lang.String r9 = r9.A0F
            X.AnonymousClass00C.A08(r9)
            r1 = 0
            X.005 r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.16q r0 = (X.C229616q) r0
            X.1M0 r6 = r0.A04()
            java.lang.String r4 = "installed_id LIKE ?"
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0099 }
            r3[r1] = r9     // Catch:{ all -> 0x0099 }
            X.14e r2 = r6.A02     // Catch:{ all -> 0x0099 }
            java.lang.String r1 = "installed_sticker_packs"
            java.lang.String r0 = "deleteInstalledStickerPack/DELETE_INSTALLED_STICKER_PACK"
            int r5 = r2.A03(r1, r4, r0, r3)     // Catch:{ all -> 0x0099 }
            r6.close()
            X.1Aq r0 = r10.A05
            r1 = 0
            X.005 r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.16q r0 = (X.C229616q) r0
            X.1M0 r4 = r0.A04()
            java.lang.String r8 = "sticker_pack_id LIKE ?"
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0092 }
            r3[r1] = r9     // Catch:{ all -> 0x0092 }
            X.14e r2 = r4.A02     // Catch:{ all -> 0x0092 }
            java.lang.String r1 = "stickers"
            java.lang.String r0 = "deleteAllStickersOfStickerPack/DELETE_STICKER"
            int r0 = r2.A03(r1, r8, r0, r3)     // Catch:{ all -> 0x0092 }
            r4.close()
            r7 = 1
            if (r0 <= 0) goto L_0x0054
            r6 = 1
            if (r5 > 0) goto L_0x0055
        L_0x0054:
            r6 = 0
        L_0x0055:
            if (r11 != 0) goto L_0x0091
            X.1B9 r5 = r10.A02
            monitor-enter(r5)
            X.005 r0 = r5.A00     // Catch:{ all -> 0x008e }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x008e }
            X.54e r0 = (X.C1031554e) r0     // Catch:{ all -> 0x008e }
            X.1M0 r4 = r0.A04()     // Catch:{ all -> 0x008e }
            java.lang.String[] r3 = new java.lang.String[r7]     // Catch:{ all -> 0x0084 }
            r0 = 0
            r3[r0] = r9     // Catch:{ all -> 0x0084 }
            X.14e r2 = r4.A02     // Catch:{ all -> 0x0084 }
            java.lang.String r1 = "sticker_pack_order"
            java.lang.String r0 = "StickerPackOrderDBTableHelper/deleteRow/DELETE_STICKER_PACK_ORDER"
            int r1 = r2.A03(r1, r8, r0, r3)     // Catch:{ all -> 0x0084 }
            r4.close()     // Catch:{ all -> 0x008e }
            monitor-exit(r5)
            r0 = 0
            if (r1 <= 0) goto L_0x007d
            r0 = 1
        L_0x007d:
            if (r6 == 0) goto L_0x0082
            if (r0 == 0) goto L_0x0082
            return r7
        L_0x0082:
            r7 = 0
            return r7
        L_0x0084:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0089 }
            goto L_0x008d
        L_0x0089:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x008e }
        L_0x008d:
            throw r1     // Catch:{ all -> 0x008e }
        L_0x008e:
            r1 = move-exception
            monitor-exit(r5)
            throw r1
        L_0x0091:
            return r6
        L_0x0092:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r1 = move-exception
            X.C05600Qi.A00(r4, r0)
            throw r1
        L_0x0099:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x009b }
        L_0x009b:
            r1 = move-exception
            X.C05600Qi.A00(r6, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1B5.A00(X.68B, X.1B5, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00b4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00bb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bc, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00bf, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.AnonymousClass68B r10) {
        /*
            r9 = this;
            X.C18740tg.A00()
            r6 = 1
            A00(r10, r9, r6)
            X.1B6 r0 = r9.A03
            X.005 r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.16q r0 = (X.C229616q) r0
            X.1M0 r4 = r0.A04()
            X.71s r5 = r4.B1k()     // Catch:{ all -> 0x00b9 }
            X.14e r8 = r4.A02     // Catch:{ all -> 0x00b2 }
            X.AnonymousClass00C.A08(r8)     // Catch:{ all -> 0x00b2 }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x00b2 }
            r7.<init>()     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = r10.A0F     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "installed_id"
            r7.put(r0, r3)     // Catch:{ all -> 0x00b2 }
            java.lang.String r1 = r10.A0H     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "installed_name"
            r7.put(r0, r1)     // Catch:{ all -> 0x00b2 }
            java.lang.String r1 = r10.A0B     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "installed_description"
            r7.put(r0, r1)     // Catch:{ all -> 0x00b2 }
            java.lang.String r1 = r10.A0J     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "installed_publisher"
            r7.put(r0, r1)     // Catch:{ all -> 0x00b2 }
            long r0 = r10.A02     // Catch:{ all -> 0x00b2 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "installed_size"
            r7.put(r0, r1)     // Catch:{ all -> 0x00b2 }
            java.lang.String r1 = r10.A0G     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "installed_image_data_hash"
            r7.put(r0, r1)     // Catch:{ all -> 0x00b2 }
            java.lang.String r1 = r10.A0L     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "installed_tray_image_id"
            r7.put(r0, r1)     // Catch:{ all -> 0x00b2 }
            java.lang.String r1 = r10.A0M     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "installed_tray_image_preview_id"
            r7.put(r0, r1)     // Catch:{ all -> 0x00b2 }
            boolean r1 = r10.A0N     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "installed_animated_pack"
            X.C54272sg.A00(r7, r0, r1)     // Catch:{ all -> 0x00b2 }
            boolean r1 = r10.A0R     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "installed_is_avatar_pack"
            X.C54272sg.A00(r7, r0, r1)     // Catch:{ all -> 0x00b2 }
            boolean r1 = r10.A0T     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "installed_lottie_pack"
            X.C54272sg.A00(r7, r0, r1)     // Catch:{ all -> 0x00b2 }
            java.lang.String r1 = r10.A0C     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "installed_empty_favorites_avatar_template_id"
            r7.put(r0, r1)     // Catch:{ all -> 0x00b2 }
            java.lang.String r1 = r10.A0D     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "installed_empty_recents_avatar_template_id"
            r7.put(r0, r1)     // Catch:{ all -> 0x00b2 }
            java.lang.String r2 = "installed_sticker_packs"
            r1 = 5
            java.lang.String r0 = "insertStickerPackToInstalledTable/INSERT_INSTALLED_STICKER_PACK"
            r8.A08(r2, r0, r7, r1)     // Catch:{ all -> 0x00b2 }
            r5.A00()     // Catch:{ all -> 0x00b2 }
            r5.close()     // Catch:{ all -> 0x00b9 }
            r4.close()
            java.util.List r0 = r10.A05
            X.AnonymousClass00C.A08(r0)
            boolean r0 = r0.isEmpty()
            r6 = r6 ^ r0
            if (r6 == 0) goto L_0x00a9
            X.1Aq r1 = r9.A05
            java.util.List r0 = r10.A05
            X.AnonymousClass00C.A08(r0)
            r1.A03(r0)
        L_0x00a9:
            X.1B9 r0 = r9.A02
            int r0 = r0.A00(r3)
            r10.A00 = r0
            return
        L_0x00b2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x00b9 }
            throw r0     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1B5.A04(X.68B):void");
    }
}
