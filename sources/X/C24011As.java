package X;

import android.database.Cursor;

/* renamed from: X.1As  reason: invalid class name and case insensitive filesystem */
public final class C24011As {
    public final AnonymousClass005 A00;
    public final C19700wN A01;

    public C24011As(C19700wN r2, AnonymousClass005 r3) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        this.A00 = r3;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(java.lang.String r7) {
        /*
            r6 = this;
            r1 = 0
            X.AnonymousClass00C.A0D(r7, r1)
            X.005 r0 = r6.A00
            java.lang.Object r0 = r0.get()
            X.16q r0 = (X.C229616q) r0
            X.1M0 r5 = r0.A04()
            java.lang.String r4 = "plaintext_hash = ?"
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0024 }
            r3[r1] = r7     // Catch:{ all -> 0x0024 }
            X.14e r2 = r5.A02     // Catch:{ all -> 0x0024 }
            java.lang.String r1 = "starred_stickers"
            java.lang.String r0 = "removeStarredStickerHash/DELETE_STARRED_STICKER"
            r2.A03(r1, r4, r0, r3)     // Catch:{ all -> 0x0024 }
            r5.close()
            return
        L_0x0024:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24011As.A03(java.lang.String):void");
    }

    public static final AnonymousClass6EB A00(Cursor cursor) {
        Cursor cursor2 = cursor;
        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("plaintext_hash");
        int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("hash_of_image_part");
        int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("timestamp");
        int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("url");
        int columnIndexOrThrow5 = cursor2.getColumnIndexOrThrow("enc_hash");
        int columnIndexOrThrow6 = cursor2.getColumnIndexOrThrow("direct_path");
        int columnIndexOrThrow7 = cursor2.getColumnIndexOrThrow("mimetype");
        int columnIndexOrThrow8 = cursor2.getColumnIndexOrThrow("media_key");
        int columnIndexOrThrow9 = cursor2.getColumnIndexOrThrow("file_size");
        int columnIndexOrThrow10 = cursor2.getColumnIndexOrThrow("width");
        int columnIndexOrThrow11 = cursor2.getColumnIndexOrThrow("height");
        int columnIndexOrThrow12 = cursor2.getColumnIndexOrThrow("emojis");
        int columnIndexOrThrow13 = cursor2.getColumnIndexOrThrow("is_first_party");
        int columnIndexOrThrow14 = cursor2.getColumnIndexOrThrow("is_avatar");
        int columnIndexOrThrow15 = cursor2.getColumnIndexOrThrow("avatar_template_id");
        int columnIndexOrThrow16 = cursor2.getColumnIndexOrThrow("is_fun_sticker");
        int columnIndexOrThrow17 = cursor2.getColumnIndexOrThrow("is_lottie");
        String string = cursor2.getString(columnIndexOrThrow);
        String string2 = cursor2.getString(columnIndexOrThrow6);
        if (string == null) {
            return null;
        }
        String string3 = cursor2.getString(columnIndexOrThrow2);
        long j = cursor2.getLong(columnIndexOrThrow3);
        String string4 = cursor2.getString(columnIndexOrThrow4);
        String string5 = cursor2.getString(columnIndexOrThrow5);
        String string6 = cursor2.getString(columnIndexOrThrow7);
        String string7 = cursor2.getString(columnIndexOrThrow8);
        int i = cursor2.getInt(columnIndexOrThrow9);
        int i2 = cursor2.getInt(columnIndexOrThrow10);
        int i3 = cursor2.getInt(columnIndexOrThrow11);
        return new AnonymousClass6EB(string, string3, string4, string5, string2, string6, string7, cursor2.getString(columnIndexOrThrow12), cursor2.getString(columnIndexOrThrow15), i, i2, i3, j, C54282sh.A00(cursor2, columnIndexOrThrow13), C54282sh.A00(cursor2, columnIndexOrThrow14), C54282sh.A00(cursor2, columnIndexOrThrow16), C54282sh.A00(cursor2, columnIndexOrThrow17));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0115, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        X.C05600Qi.A00(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0119, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        X.C05600Qi.A00(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0120, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A01(int r42, int r43) {
        /*
            r41 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r6 = r43
            if (r43 != 0) goto L_0x0020
            java.lang.String r5 = "SELECT plaintext_hash, hash_of_image_part, timestamp, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avatar, avatar_template_id, is_fun_sticker, is_lottie FROM starred_stickers ORDER BY timestamp DESC LIMIT ?"
        L_0x000b:
            r4 = 2
            if (r6 != r4) goto L_0x001d
            java.lang.String r0 = "1"
        L_0x0010:
            r3 = 0
            r1 = 1
            if (r43 != 0) goto L_0x0023
            java.lang.String[] r4 = new java.lang.String[r1]
            java.lang.String r0 = java.lang.String.valueOf(r42)
            r4[r3] = r0
            goto L_0x002d
        L_0x001d:
            java.lang.String r0 = "0"
            goto L_0x0010
        L_0x0020:
            java.lang.String r5 = "SELECT plaintext_hash, hash_of_image_part, timestamp, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avatar, avatar_template_id, is_fun_sticker, is_lottie FROM starred_stickers WHERE is_avatar = ? ORDER BY timestamp DESC LIMIT ?"
            goto L_0x000b
        L_0x0023:
            java.lang.String[] r4 = new java.lang.String[r4]
            r4[r3] = r0
            java.lang.String r0 = java.lang.String.valueOf(r42)
            r4[r1] = r0
        L_0x002d:
            r40 = r41
            r0 = r40
            X.005 r0 = r0.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x0121 }
            java.lang.Object r0 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0121 }
            X.16q r0 = (X.C229616q) r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0121 }
            X.1M0 r1 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0121 }
            X.14e r3 = r1.A02     // Catch:{ all -> 0x011a }
            java.lang.String r0 = "getStarredStickersData/QUERY_RECENT_STARRED_STICKERS"
            android.database.Cursor r0 = r3.A09(r5, r0, r4)     // Catch:{ all -> 0x011a }
            java.lang.String r3 = "plaintext_hash"
            int r20 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0113 }
            java.lang.String r3 = "hash_of_image_part"
            int r19 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0113 }
            java.lang.String r3 = "timestamp"
            int r18 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0113 }
            java.lang.String r3 = "url"
            int r17 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0113 }
            java.lang.String r3 = "enc_hash"
            int r16 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0113 }
            java.lang.String r3 = "direct_path"
            int r15 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0113 }
            java.lang.String r3 = "mimetype"
            int r14 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0113 }
            java.lang.String r3 = "media_key"
            int r13 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0113 }
            java.lang.String r3 = "file_size"
            int r12 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0113 }
            java.lang.String r3 = "width"
            int r11 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0113 }
            java.lang.String r3 = "height"
            int r10 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0113 }
            java.lang.String r3 = "emojis"
            int r9 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0113 }
            java.lang.String r3 = "is_first_party"
            int r8 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0113 }
            java.lang.String r3 = "is_avatar"
            int r7 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0113 }
            java.lang.String r3 = "avatar_template_id"
            int r6 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0113 }
            java.lang.String r3 = "is_fun_sticker"
            int r5 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0113 }
            java.lang.String r3 = "is_lottie"
            int r4 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0113 }
        L_0x00ab:
            boolean r3 = r0.moveToNext()     // Catch:{ all -> 0x0113 }
            if (r3 == 0) goto L_0x010c
            r3 = r20
            java.lang.String r22 = r0.getString(r3)     // Catch:{ all -> 0x0113 }
            java.lang.String r26 = r0.getString(r15)     // Catch:{ all -> 0x0113 }
            if (r22 == 0) goto L_0x00ab
            r3 = r19
            java.lang.String r23 = r0.getString(r3)     // Catch:{ all -> 0x0113 }
            r3 = r18
            long r34 = r0.getLong(r3)     // Catch:{ all -> 0x0113 }
            r3 = r17
            java.lang.String r24 = r0.getString(r3)     // Catch:{ all -> 0x0113 }
            r3 = r16
            java.lang.String r25 = r0.getString(r3)     // Catch:{ all -> 0x0113 }
            java.lang.String r27 = r0.getString(r14)     // Catch:{ all -> 0x0113 }
            java.lang.String r28 = r0.getString(r13)     // Catch:{ all -> 0x0113 }
            int r31 = r0.getInt(r12)     // Catch:{ all -> 0x0113 }
            int r32 = r0.getInt(r11)     // Catch:{ all -> 0x0113 }
            int r33 = r0.getInt(r10)     // Catch:{ all -> 0x0113 }
            java.lang.String r29 = r0.getString(r9)     // Catch:{ all -> 0x0113 }
            boolean r36 = X.C54282sh.A00(r0, r8)     // Catch:{ all -> 0x0113 }
            boolean r37 = X.C54282sh.A00(r0, r7)     // Catch:{ all -> 0x0113 }
            java.lang.String r30 = r0.getString(r6)     // Catch:{ all -> 0x0113 }
            boolean r38 = X.C54282sh.A00(r0, r5)     // Catch:{ all -> 0x0113 }
            boolean r39 = X.C54282sh.A00(r0, r4)     // Catch:{ all -> 0x0113 }
            X.6EB r3 = new X.6EB     // Catch:{ all -> 0x0113 }
            r21 = r3
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r37, r38, r39)     // Catch:{ all -> 0x0113 }
            r2.add(r3)     // Catch:{ all -> 0x0113 }
            goto L_0x00ab
        L_0x010c:
            r0.close()     // Catch:{ all -> 0x011a }
            r1.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0121 }
            return r2
        L_0x0113:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0115 }
        L_0x0115:
            r3 = move-exception
            X.C05600Qi.A00(r0, r4)     // Catch:{ all -> 0x011a }
            throw r3     // Catch:{ all -> 0x011a }
        L_0x011a:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x011c }
        L_0x011c:
            r0 = move-exception
            X.C05600Qi.A00(r1, r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0121 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0121 }
        L_0x0121:
            r1 = move-exception
            java.lang.String r4 = "StarredStickerDBTableHelper.getStarredStickersData"
            com.whatsapp.util.Log.e(r4, r1)
            r0 = r40
            X.0wN r3 = r0.A01
            java.lang.String r1 = r1.getMessage()
            r0 = 1
            r3.A0E(r4, r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24011As.A01(int, int):java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00bc, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x00b8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00b9, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass6EB r7) {
        /*
            r6 = this;
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            java.lang.String r1 = r7.A0B
            java.lang.String r0 = "plaintext_hash"
            r5.put(r0, r1)
            java.lang.String r1 = r7.A01
            java.lang.String r0 = "hash_of_image_part"
            r5.put(r0, r1)
            long r0 = r7.A07
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "timestamp"
            r5.put(r0, r1)
            java.lang.String r1 = r7.A0E
            java.lang.String r0 = "url"
            r5.put(r0, r1)
            java.lang.String r1 = r7.A0A
            java.lang.String r0 = "enc_hash"
            r5.put(r0, r1)
            java.lang.String r1 = r7.A08
            java.lang.String r0 = "direct_path"
            r5.put(r0, r1)
            java.lang.String r1 = r7.A0D
            java.lang.String r0 = "mimetype"
            r5.put(r0, r1)
            java.lang.String r1 = r7.A0C
            java.lang.String r0 = "media_key"
            r5.put(r0, r1)
            int r0 = r7.A04
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "file_size"
            r5.put(r0, r1)
            int r0 = r7.A06
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "width"
            r5.put(r0, r1)
            int r0 = r7.A05
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "height"
            r5.put(r0, r1)
            java.lang.String r1 = r7.A09
            java.lang.String r0 = "emojis"
            r5.put(r0, r1)
            boolean r0 = r7.A0G
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_first_party"
            r5.put(r0, r1)
            boolean r0 = r7.A02
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_avatar"
            r5.put(r0, r1)
            java.lang.String r1 = r7.A00
            java.lang.String r0 = "avatar_template_id"
            r5.put(r0, r1)
            boolean r0 = r7.A0F
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_fun_sticker"
            r5.put(r0, r1)
            boolean r0 = r7.A03
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_lottie"
            r5.put(r0, r1)
            X.005 r0 = r6.A00
            java.lang.Object r0 = r0.get()
            X.16q r0 = (X.C229616q) r0
            X.1M0 r4 = r0.A04()
            X.14e r3 = r4.A02     // Catch:{ all -> 0x00b6 }
            java.lang.String r2 = "starred_stickers"
            r1 = 5
            java.lang.String r0 = "addStarredStickerHash/INSERT_STARRED_STICKER"
            r3.A08(r2, r0, r5, r1)     // Catch:{ all -> 0x00b6 }
            r4.close()
            return
        L_0x00b6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24011As.A02(X.6EB):void");
    }
}
