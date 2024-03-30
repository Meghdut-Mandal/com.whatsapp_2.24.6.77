package X;

import com.whatsapp.stickers.stickerpack.StickerPackDownloader;

/* renamed from: X.1Bk  reason: invalid class name and case insensitive filesystem */
public final class C24181Bk {
    public final C19420v0 A00;
    public final C20810yC A01;
    public final AnonymousClass1BR A02;
    public final C24131Bf A03;
    public final StickerPackDownloader A04;
    public final AnonymousClass1B5 A05;
    public final C19770wU A06;
    public final C21570zS A07;
    public final C19970wo A08;
    public final AnonymousClass1BD A09;

    public C24181Bk(C19970wo r2, C19420v0 r3, C20810yC r4, AnonymousClass1BR r5, C24131Bf r6, StickerPackDownloader stickerPackDownloader, AnonymousClass1BD r8, AnonymousClass1B5 r9, C19770wU r10, C21570zS r11) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r10, 3);
        AnonymousClass00C.A0D(r11, 4);
        AnonymousClass00C.A0D(r9, 5);
        AnonymousClass00C.A0D(r3, 6);
        AnonymousClass00C.A0D(r8, 7);
        AnonymousClass00C.A0D(stickerPackDownloader, 8);
        AnonymousClass00C.A0D(r5, 9);
        AnonymousClass00C.A0D(r6, 10);
        this.A08 = r2;
        this.A01 = r4;
        this.A06 = r10;
        this.A07 = r11;
        this.A05 = r9;
        this.A00 = r3;
        this.A09 = r8;
        this.A04 = stickerPackDownloader;
        this.A02 = r5;
        this.A03 = r6;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.util.List} */
    /* JADX WARNING: type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0193, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0197, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01f7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01fb, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A00() {
        /*
            r14 = this;
            X.1B5 r0 = r14.A05
            X.C18740tg.A00()
            X.1B6 r8 = r0.A03
            r2 = 0
            java.lang.String r1 = "getDownloadableStickerPacks/QUERY"
            java.lang.String r0 = "SELECT installed_id, installed_name, installed_size, installed_image_data_hash, installed_publisher, installed_description, installed_tray_image_id, installed_tray_image_preview_id, installed_animated_pack, installed_is_avatar_pack, installed_lottie_pack, installed_empty_favorites_avatar_template_id, installed_empty_recents_avatar_template_id, id, name, publisher, description, size, tray_image_id, preview_image_id_array, image_data_hash, tray_image_preview_id, animated_pack, lottie_pack FROM downloadable_sticker_packs LEFT JOIN installed_sticker_packs ON (id = installed_id)"
            java.util.ArrayList r13 = X.AnonymousClass1B6.A02(r8, r0, r1, r2)
            X.1BD r11 = r14.A09
            java.util.LinkedHashSet r3 = r11.A00()
            java.util.Iterator r2 = r13.iterator()
        L_0x001a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r1 = r2.next()
            X.68B r1 = (X.AnonymousClass68B) r1
            java.lang.String r0 = r1.A0F
            boolean r0 = r3.contains(r0)
            r1.A07 = r0
            goto L_0x001a
        L_0x002f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "StickerStoreInventoryManager/fetchDownloadableStickerPacks/size of sticker packs from db:"
            r1.append(r0)
            int r0 = r13.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Bf r5 = r14.A03
            boolean r0 = r5.A02()
            if (r0 == 0) goto L_0x0209
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ 1AR -> 0x01ff }
            r10.<init>()     // Catch:{ 1AR -> 0x01ff }
            java.util.Iterator r2 = r13.iterator()     // Catch:{ 1AR -> 0x01ff }
        L_0x0058:
            boolean r0 = r2.hasNext()     // Catch:{ 1AR -> 0x01ff }
            if (r0 == 0) goto L_0x006d
            java.lang.Object r1 = r2.next()     // Catch:{ 1AR -> 0x01ff }
            X.68B r1 = (X.AnonymousClass68B) r1     // Catch:{ 1AR -> 0x01ff }
            java.lang.String r0 = r1.A0F     // Catch:{ 1AR -> 0x01ff }
            X.AnonymousClass00C.A08(r0)     // Catch:{ 1AR -> 0x01ff }
            r10.put(r0, r1)     // Catch:{ 1AR -> 0x01ff }
            goto L_0x0058
        L_0x006d:
            int r0 = r13.size()     // Catch:{ 1AR -> 0x01ff }
            r9 = 0
            if (r0 <= 0) goto L_0x0075
            r9 = 1
        L_0x0075:
            X.1BR r6 = r14.A02     // Catch:{ 1AR -> 0x01ff }
            r3 = 0
            X.0wQ r0 = r6.A00     // Catch:{ 1AR -> 0x01ff }
            r0.A0G()     // Catch:{ 1AR -> 0x01ff }
            com.whatsapp.Me r7 = r0.A00     // Catch:{ 1AR -> 0x01ff }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1AR -> 0x01ff }
            r1.<init>()     // Catch:{ 1AR -> 0x01ff }
            java.lang.String r0 = "https://static.whatsapp.net/sticker?cat=all&lg="
            r1.append(r0)     // Catch:{ 1AR -> 0x01ff }
            X.0ts r0 = r6.A05     // Catch:{ 1AR -> 0x01ff }
            java.lang.String r0 = r0.A09()     // Catch:{ 1AR -> 0x01ff }
            r1.append(r0)     // Catch:{ 1AR -> 0x01ff }
            X.0yC r4 = r6.A06     // Catch:{ 1AR -> 0x01ff }
            r0 = 6785(0x1a81, float:9.508E-42)
            java.lang.String r0 = r4.A09(r0)     // Catch:{ 1AR -> 0x01ff }
            r1.append(r0)     // Catch:{ 1AR -> 0x01ff }
            java.lang.String r1 = r1.toString()     // Catch:{ 1AR -> 0x01ff }
            if (r7 == 0) goto L_0x00bf
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ 1AR -> 0x01ff }
            r2.<init>()     // Catch:{ 1AR -> 0x01ff }
            r2.append(r1)     // Catch:{ 1AR -> 0x01ff }
            java.lang.String r0 = "&country="
            r2.append(r0)     // Catch:{ 1AR -> 0x01ff }
            java.lang.String r1 = r7.cc     // Catch:{ 1AR -> 0x01ff }
            java.lang.String r0 = r7.number     // Catch:{ 1AR -> 0x01ff }
            java.lang.String r0 = X.AnonymousClass1M4.A01(r1, r0)     // Catch:{ 1AR -> 0x01ff }
            r2.append(r0)     // Catch:{ 1AR -> 0x01ff }
            java.lang.String r1 = r2.toString()     // Catch:{ 1AR -> 0x01ff }
        L_0x00bf:
            X.1Be r0 = r6.A08     // Catch:{ 1AR -> 0x01ff }
            java.lang.String r2 = r0.A01(r1)     // Catch:{ 1AR -> 0x01ff }
            X.AnonymousClass00C.A08(r2)     // Catch:{ 1AR -> 0x01ff }
            if (r9 == 0) goto L_0x00cb
            goto L_0x00cd
        L_0x00cb:
            r0 = r3
            goto L_0x00dd
        L_0x00cd:
            X.0v0 r0 = r6.A04     // Catch:{ 1AR -> 0x01ff }
            X.005 r0 = r0.A00     // Catch:{ 1AR -> 0x01ff }
            java.lang.Object r1 = r0.get()     // Catch:{ 1AR -> 0x01ff }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ 1AR -> 0x01ff }
            java.lang.String r0 = "sticker_store_etag"
            java.lang.String r0 = r1.getString(r0, r3)     // Catch:{ 1AR -> 0x01ff }
        L_0x00dd:
            X.5rA r3 = X.AnonymousClass1BR.A00(r3, r6, r2, r0)     // Catch:{ 1AR -> 0x01ff }
            if (r3 != 0) goto L_0x00e6
            java.lang.Boolean r0 = X.C18750th.A03     // Catch:{ 1AR -> 0x01ff }
            goto L_0x0133
        L_0x00e6:
            X.0v0 r0 = r6.A04     // Catch:{ 1AR -> 0x01ff }
            java.lang.String r2 = r3.A00     // Catch:{ 1AR -> 0x01ff }
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)     // Catch:{ 1AR -> 0x01ff }
            java.lang.String r0 = "sticker_store_etag"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)     // Catch:{ 1AR -> 0x01ff }
            r0.apply()     // Catch:{ 1AR -> 0x01ff }
            java.util.List r6 = r3.A01     // Catch:{ 1AR -> 0x01ff }
            java.lang.String r3 = "maybeInjectTestStickerPack/failedInjection"
            r0 = 6784(0x1a80, float:9.506E-42)
            org.json.JSONObject r4 = r4.A0A(r0)     // Catch:{ 1AR -> 0x01ff }
            java.lang.String r1 = "packs"
            boolean r0 = r4.has(r1)     // Catch:{ 1AR -> 0x01ff }
            r2 = 0
            if (r0 == 0) goto L_0x012c
            org.json.JSONArray r0 = r4.getJSONArray(r1)     // Catch:{ IOException | JSONException -> 0x0128 }
            java.lang.String r1 = r0.toString()     // Catch:{ IOException | JSONException -> 0x0128 }
            X.AnonymousClass00C.A08(r1)     // Catch:{ IOException | JSONException -> 0x0128 }
            java.nio.charset.Charset r0 = X.AnonymousClass0S4.A05     // Catch:{ IOException | JSONException -> 0x0128 }
            byte[] r1 = r1.getBytes(r0)     // Catch:{ IOException | JSONException -> 0x0128 }
            X.AnonymousClass00C.A08(r1)     // Catch:{ IOException | JSONException -> 0x0128 }
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ IOException | JSONException -> 0x0128 }
            r0.<init>(r1)     // Catch:{ IOException | JSONException -> 0x0128 }
            java.util.ArrayList r2 = X.AnonymousClass1BR.A01(r0)     // Catch:{ IOException | JSONException -> 0x0128 }
            goto L_0x012c
        L_0x0128:
            r0 = move-exception
            com.whatsapp.util.Log.w(r3, r0)     // Catch:{ 1AR -> 0x01ff }
        L_0x012c:
            if (r2 == 0) goto L_0x0134
            r0 = 0
            r6.addAll(r0, r2)     // Catch:{ 1AR -> 0x01ff }
            goto L_0x0134
        L_0x0133:
            r6 = 0
        L_0x0134:
            if (r6 == 0) goto L_0x0209
            java.util.Iterator r12 = r6.iterator()     // Catch:{ 1AR -> 0x01ff }
        L_0x013a:
            boolean r0 = r12.hasNext()     // Catch:{ 1AR -> 0x01ff }
            if (r0 == 0) goto L_0x0198
            java.lang.Object r9 = r12.next()     // Catch:{ 1AR -> 0x01ff }
            X.68B r9 = (X.AnonymousClass68B) r9     // Catch:{ 1AR -> 0x01ff }
            java.lang.String r1 = r9.A0F     // Catch:{ 1AR -> 0x01ff }
            X.AnonymousClass00C.A08(r1)     // Catch:{ 1AR -> 0x01ff }
            boolean r0 = r10.containsKey(r1)     // Catch:{ 1AR -> 0x01ff }
            if (r0 == 0) goto L_0x0166
            java.lang.Object r3 = r10.get(r1)     // Catch:{ 1AR -> 0x01ff }
            X.68B r3 = (X.AnonymousClass68B) r3     // Catch:{ 1AR -> 0x01ff }
            if (r3 == 0) goto L_0x013a
            java.lang.String r2 = r3.A03     // Catch:{ 1AR -> 0x01ff }
            long r0 = r3.A01     // Catch:{ 1AR -> 0x01ff }
            r9.A01 = r0     // Catch:{ 1AR -> 0x01ff }
            r9.A03 = r2     // Catch:{ 1AR -> 0x01ff }
            boolean r0 = r3.A07     // Catch:{ 1AR -> 0x01ff }
        L_0x0163:
            r9.A07 = r0     // Catch:{ 1AR -> 0x01ff }
            goto L_0x013a
        L_0x0166:
            int r0 = r10.size()     // Catch:{ 1AR -> 0x01ff }
            if (r0 <= 0) goto L_0x013a
            X.005 r0 = r11.A00     // Catch:{ 1AR -> 0x01ff }
            java.lang.Object r0 = r0.get()     // Catch:{ 1AR -> 0x01ff }
            X.16q r0 = (X.C229616q) r0     // Catch:{ 1AR -> 0x01ff }
            X.1M0 r7 = r0.A04()     // Catch:{ 1AR -> 0x01ff }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0191 }
            r4.<init>()     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = "pack_id"
            r4.put(r0, r1)     // Catch:{ all -> 0x0191 }
            X.14e r3 = r7.A02     // Catch:{ all -> 0x0191 }
            java.lang.String r2 = "new_sticker_packs"
            r1 = 5
            java.lang.String r0 = "markPackAsNew/INSERT_NEW_STICKER_PACK"
            r3.A08(r2, r0, r4, r1)     // Catch:{ all -> 0x0191 }
            r7.close()     // Catch:{ 1AR -> 0x01ff }
            r0 = 1
            goto L_0x0163
        L_0x0191:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0193 }
        L_0x0193:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)     // Catch:{ 1AR -> 0x01ff }
            throw r0     // Catch:{ 1AR -> 0x01ff }
        L_0x0198:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1AR -> 0x01fc }
            r1.<init>()     // Catch:{ 1AR -> 0x01fc }
            java.lang.String r0 = "StickerStoreInventoryManager/fetchDownloadableStickerPacks/size of sticker packs from web:"
            r1.append(r0)     // Catch:{ 1AR -> 0x01fc }
            int r0 = r6.size()     // Catch:{ 1AR -> 0x01fc }
            r1.append(r0)     // Catch:{ 1AR -> 0x01fc }
            java.lang.String r0 = r1.toString()     // Catch:{ 1AR -> 0x01fc }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1AR -> 0x01fc }
            X.C18740tg.A00()     // Catch:{ 1AR -> 0x01fc }
            X.005 r0 = r8.A00     // Catch:{ 1AR -> 0x01fc }
            java.lang.Object r0 = r0.get()     // Catch:{ 1AR -> 0x01fc }
            X.16q r0 = (X.C229616q) r0     // Catch:{ 1AR -> 0x01fc }
            X.1M0 r7 = r0.A04()     // Catch:{ 1AR -> 0x01fc }
            X.71s r4 = r7.B1k()     // Catch:{ all -> 0x01f5 }
            X.14e r3 = r7.A02     // Catch:{ all -> 0x01ee }
            java.lang.String r2 = "downloadable_sticker_packs"
            java.lang.String r1 = "addAllToDownloadable/DELETE_DOWNLOADABLE_STICKER_PACK"
            r0 = 0
            r3.A03(r2, r0, r1, r0)     // Catch:{ all -> 0x01ee }
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x01ee }
        L_0x01d1:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x01ee }
            if (r0 == 0) goto L_0x01e1
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x01ee }
            X.68B r0 = (X.AnonymousClass68B) r0     // Catch:{ all -> 0x01ee }
            X.AnonymousClass1B6.A03(r3, r0)     // Catch:{ all -> 0x01ee }
            goto L_0x01d1
        L_0x01e1:
            r4.A00()     // Catch:{ all -> 0x01ee }
            r4.close()     // Catch:{ all -> 0x01f5 }
            r7.close()     // Catch:{ 1AR -> 0x01fc }
            r5.A00()     // Catch:{ 1AR -> 0x01fc }
            return r6
        L_0x01ee:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01f0 }
        L_0x01f0:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x01f5 }
            throw r0     // Catch:{ all -> 0x01f5 }
        L_0x01f5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01f7 }
        L_0x01f7:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)     // Catch:{ 1AR -> 0x01fc }
            throw r0     // Catch:{ 1AR -> 0x01fc }
        L_0x01fc:
            r1 = move-exception
            r13 = r6
            goto L_0x0200
        L_0x01ff:
            r1 = move-exception
        L_0x0200:
            java.lang.String r0 = "StickerStoreInventoryManager/fetchDownloadableStickerPacks/getStickerPacksInStoreIfUpdated failed"
            com.whatsapp.util.Log.e(r0, r1)
            r5.A01()
            return r13
        L_0x0209:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24181Bk.A00():java.util.List");
    }
}
