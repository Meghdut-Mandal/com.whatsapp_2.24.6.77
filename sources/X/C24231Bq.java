package X;

import android.database.Cursor;

/* renamed from: X.1Bq  reason: invalid class name and case insensitive filesystem */
public final class C24231Bq {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;
    public final boolean A02;

    public C24231Bq(AnonymousClass005 r2, AnonymousClass005 r3, boolean z) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = z;
    }

    public static final C135066c4 A00(Cursor cursor, C23981Ap r26) {
        C135066c4 r2 = new C135066c4((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String[]) null, 0, 0, 0, false, false, false, false, false, false);
        Cursor cursor2 = cursor;
        r2.A0E = cursor2.getString(cursor2.getColumnIndexOrThrow("plaintext_hash"));
        r2.A0H = cursor2.getString(cursor2.getColumnIndexOrThrow("url"));
        r2.A09 = cursor2.getString(cursor2.getColumnIndexOrThrow("enc_hash"));
        r2.A07 = cursor2.getString(cursor2.getColumnIndexOrThrow("direct_path"));
        r2.A0D = cursor2.getString(cursor2.getColumnIndexOrThrow("mimetype"));
        r2.A0C = cursor2.getString(cursor2.getColumnIndexOrThrow("media_key"));
        r2.A00 = cursor2.getInt(cursor2.getColumnIndexOrThrow("file_size"));
        r2.A03 = cursor2.getInt(cursor2.getColumnIndexOrThrow("width"));
        r2.A02 = cursor2.getInt(cursor2.getColumnIndexOrThrow("height"));
        r2.A08 = cursor2.getString(cursor2.getColumnIndexOrThrow("emojis"));
        r2.A0M = C54282sh.A00(cursor2, cursor2.getColumnIndexOrThrow("is_first_party"));
        r2.A06 = cursor2.getString(cursor2.getColumnIndexOrThrow("avatar_template_id"));
        r2.A0I = C54282sh.A00(cursor2, cursor2.getColumnIndexOrThrow("is_fun_sticker"));
        r2.A0N = C54282sh.A00(cursor2, cursor2.getColumnIndexOrThrow("is_lottie"));
        r26.A04(r2);
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x009c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009d, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C135066c4 r11) {
        /*
            r10 = this;
            r1 = 0
            java.lang.String r0 = r11.A0E
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "RecentStickerDBStorage/updateSticker/sticker filehash is null, could not be updated"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x000b:
            X.005 r0 = r10.A01
            java.lang.Object r0 = r0.get()
            X.16q r0 = (X.C229616q) r0
            X.1M0 r2 = r0.A04()
            java.lang.String r7 = "plaintext_hash = ?"
            r4 = 1
            java.lang.String[] r9 = new java.lang.String[r4]     // Catch:{ all -> 0x009a }
            java.lang.String r0 = r11.A0E     // Catch:{ all -> 0x009a }
            r9[r1] = r0     // Catch:{ all -> 0x009a }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x009a }
            r5.<init>()     // Catch:{ all -> 0x009a }
            java.lang.String r1 = "url"
            java.lang.String r0 = r11.A0H     // Catch:{ all -> 0x009a }
            r5.put(r1, r0)     // Catch:{ all -> 0x009a }
            java.lang.String r1 = "enc_hash"
            java.lang.String r0 = r11.A09     // Catch:{ all -> 0x009a }
            r5.put(r1, r0)     // Catch:{ all -> 0x009a }
            java.lang.String r1 = "direct_path"
            java.lang.String r0 = r11.A07     // Catch:{ all -> 0x009a }
            r5.put(r1, r0)     // Catch:{ all -> 0x009a }
            java.lang.String r1 = "mimetype"
            java.lang.String r0 = r11.A0D     // Catch:{ all -> 0x009a }
            r5.put(r1, r0)     // Catch:{ all -> 0x009a }
            java.lang.String r1 = "media_key"
            java.lang.String r0 = r11.A0C     // Catch:{ all -> 0x009a }
            r5.put(r1, r0)     // Catch:{ all -> 0x009a }
            java.lang.String r1 = "file_size"
            int r0 = r11.A00     // Catch:{ all -> 0x009a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x009a }
            r5.put(r1, r0)     // Catch:{ all -> 0x009a }
            java.lang.String r1 = "width"
            int r0 = r11.A03     // Catch:{ all -> 0x009a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x009a }
            r5.put(r1, r0)     // Catch:{ all -> 0x009a }
            java.lang.String r1 = "height"
            int r0 = r11.A02     // Catch:{ all -> 0x009a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x009a }
            r5.put(r1, r0)     // Catch:{ all -> 0x009a }
            java.lang.String r1 = "emojis"
            java.lang.String r0 = r11.A08     // Catch:{ all -> 0x009a }
            r5.put(r1, r0)     // Catch:{ all -> 0x009a }
            java.lang.String r3 = "is_first_party"
            boolean r1 = r11.A0M     // Catch:{ all -> 0x009a }
            r0 = 0
            if (r1 == 0) goto L_0x0078
            r0 = 1
        L_0x0078:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x009a }
            r5.put(r3, r0)     // Catch:{ all -> 0x009a }
            java.lang.String r1 = "is_lottie"
            boolean r0 = r11.A0N     // Catch:{ all -> 0x009a }
            if (r0 != 0) goto L_0x0086
            r4 = 0
        L_0x0086:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x009a }
            r5.put(r1, r0)     // Catch:{ all -> 0x009a }
            X.14e r4 = r2.A02     // Catch:{ all -> 0x009a }
            java.lang.String r6 = "recent_stickers"
            java.lang.String r8 = "updateSticker/UPDATE_RECENT_STICKERS"
            r4.A01(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x009a }
            r2.close()
            return
        L_0x009a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009c }
        L_0x009c:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24231Bq.A02(X.6c4):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x017f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.C05600Qi.A00(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0183, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0186, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0187, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x018a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A01() {
        /*
            r50 = this;
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]
            r3 = r50
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0020
            java.lang.String r1 = "1"
        L_0x0010:
            r0 = 0
            r6[r0] = r1
            X.005 r0 = r3.A01
            java.lang.Object r0 = r0.get()
            X.16q r0 = (X.C229616q) r0
            X.1M0 r2 = r0.get()
            goto L_0x0023
        L_0x0020:
            java.lang.String r1 = "0"
            goto L_0x0010
        L_0x0023:
            X.14e r5 = r2.A02     // Catch:{ all -> 0x0184 }
            java.lang.String r1 = "SELECT plaintext_hash, entry_weight, hash_of_image_part, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avocado, last_sticker_sent_ts, avatar_template_id, is_fun_sticker, is_lottie FROM recent_stickers WHERE is_avocado = ? ORDER BY entry_weight DESC"
            java.lang.String r0 = "loadWeightedStickerIdentifiersFromDB/QUERY_RECENT_STICKER"
            android.database.Cursor r1 = r5.A09(r1, r0, r6)     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = "plaintext_hash"
            int r26 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017d }
            java.lang.String r0 = "entry_weight"
            int r25 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017d }
            java.lang.String r0 = "hash_of_image_part"
            int r24 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017d }
            java.lang.String r0 = "url"
            int r23 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017d }
            java.lang.String r0 = "enc_hash"
            int r22 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017d }
            java.lang.String r0 = "direct_path"
            int r21 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017d }
            java.lang.String r0 = "mimetype"
            int r20 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017d }
            java.lang.String r0 = "media_key"
            int r19 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017d }
            java.lang.String r0 = "file_size"
            int r18 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017d }
            java.lang.String r0 = "width"
            int r17 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017d }
            java.lang.String r0 = "height"
            int r16 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017d }
            java.lang.String r0 = "emojis"
            int r15 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017d }
            java.lang.String r0 = "is_first_party"
            int r14 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017d }
            java.lang.String r0 = "last_sticker_sent_ts"
            int r12 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017d }
            java.lang.String r0 = "is_avocado"
            int r11 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017d }
            java.lang.String r0 = "avatar_template_id"
            int r10 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017d }
            java.lang.String r0 = "is_fun_sticker"
            int r9 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017d }
            java.lang.String r0 = "is_lottie"
            int r8 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x017d }
        L_0x0099:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x017d }
            if (r0 == 0) goto L_0x0176
            r0 = r26
            java.lang.String r7 = r1.getString(r0)     // Catch:{ all -> 0x017d }
            r0 = r25
            float r6 = r1.getFloat(r0)     // Catch:{ all -> 0x017d }
            r0 = r24
            java.lang.String r5 = r1.getString(r0)     // Catch:{ all -> 0x017d }
            r28 = 0
            r41 = 0
            X.6c4 r0 = new X.6c4     // Catch:{ all -> 0x017d }
            r30 = r28
            r31 = r28
            r32 = r28
            r33 = r28
            r34 = r28
            r35 = r28
            r36 = r28
            r37 = r28
            r38 = r28
            r39 = r28
            r40 = r28
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r27 = r0
            r29 = r28
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)     // Catch:{ all -> 0x017d }
            r0.A0E = r7     // Catch:{ all -> 0x017d }
            r13 = r23
            java.lang.String r13 = r1.getString(r13)     // Catch:{ all -> 0x017d }
            r0.A0H = r13     // Catch:{ all -> 0x017d }
            r13 = r22
            java.lang.String r13 = r1.getString(r13)     // Catch:{ all -> 0x017d }
            r0.A09 = r13     // Catch:{ all -> 0x017d }
            r13 = r21
            java.lang.String r13 = r1.getString(r13)     // Catch:{ all -> 0x017d }
            r0.A07 = r13     // Catch:{ all -> 0x017d }
            r13 = r20
            java.lang.String r13 = r1.getString(r13)     // Catch:{ all -> 0x017d }
            r0.A0D = r13     // Catch:{ all -> 0x017d }
            r13 = r19
            java.lang.String r13 = r1.getString(r13)     // Catch:{ all -> 0x017d }
            r0.A0C = r13     // Catch:{ all -> 0x017d }
            r13 = r18
            int r13 = r1.getInt(r13)     // Catch:{ all -> 0x017d }
            r0.A00 = r13     // Catch:{ all -> 0x017d }
            r13 = r17
            int r13 = r1.getInt(r13)     // Catch:{ all -> 0x017d }
            r0.A03 = r13     // Catch:{ all -> 0x017d }
            r13 = r16
            int r13 = r1.getInt(r13)     // Catch:{ all -> 0x017d }
            r0.A02 = r13     // Catch:{ all -> 0x017d }
            java.lang.String r13 = r1.getString(r15)     // Catch:{ all -> 0x017d }
            r0.A08 = r13     // Catch:{ all -> 0x017d }
            boolean r13 = X.C54282sh.A00(r1, r14)     // Catch:{ all -> 0x017d }
            r0.A0M = r13     // Catch:{ all -> 0x017d }
            r0.A0B = r5     // Catch:{ all -> 0x017d }
            boolean r13 = X.C54282sh.A00(r1, r11)     // Catch:{ all -> 0x017d }
            r0.A0L = r13     // Catch:{ all -> 0x017d }
            java.lang.String r13 = r1.getString(r10)     // Catch:{ all -> 0x017d }
            r0.A06 = r13     // Catch:{ all -> 0x017d }
            boolean r13 = X.C54282sh.A00(r1, r9)     // Catch:{ all -> 0x017d }
            r0.A0I = r13     // Catch:{ all -> 0x017d }
            boolean r13 = X.C54282sh.A00(r1, r8)     // Catch:{ all -> 0x017d }
            r0.A0N = r13     // Catch:{ all -> 0x017d }
            long r32 = r1.getLong(r12)     // Catch:{ all -> 0x017d }
            X.005 r13 = r3.A00     // Catch:{ all -> 0x017d }
            java.lang.Object r13 = r13.get()     // Catch:{ all -> 0x017d }
            X.1Ap r13 = (X.C23981Ap) r13     // Catch:{ all -> 0x017d }
            r13.A04(r0)     // Catch:{ all -> 0x017d }
            java.lang.String r13 = r0.A06     // Catch:{ all -> 0x017d }
            r31 = r13
            X.67c r13 = new X.67c     // Catch:{ all -> 0x017d }
            r27 = r13
            r28 = r0
            r29 = r7
            r30 = r5
            r27.<init>(r28, r29, r30, r31, r32)     // Catch:{ all -> 0x017d }
            X.6vG r0 = new X.6vG     // Catch:{ all -> 0x017d }
            r0.<init>(r13, r6)     // Catch:{ all -> 0x017d }
            r4.add(r0)     // Catch:{ all -> 0x017d }
            goto L_0x0099
        L_0x0176:
            r1.close()     // Catch:{ all -> 0x0184 }
            r2.close()
            return r4
        L_0x017d:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x017f }
        L_0x017f:
            r0 = move-exception
            X.C05600Qi.A00(r1, r3)     // Catch:{ all -> 0x0184 }
            throw r0     // Catch:{ all -> 0x0184 }
        L_0x0184:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0186 }
        L_0x0186:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24231Bq.A01():java.util.ArrayList");
    }
}
