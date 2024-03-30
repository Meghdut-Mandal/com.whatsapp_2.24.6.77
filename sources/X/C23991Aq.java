package X;

import android.database.Cursor;
import java.util.ArrayList;

/* renamed from: X.1Aq  reason: invalid class name and case insensitive filesystem */
public final class C23991Aq {
    public final C23981Ap A00;
    public final AnonymousClass005 A01;

    public C23991Aq(C23981Ap r2, AnonymousClass005 r3) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C135066c4 A00(java.lang.String r8) {
        /*
            r7 = this;
            r6 = 0
            r5 = 0
            X.005 r0 = r7.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x004b }
            java.lang.Object r0 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x004b }
            X.16q r0 = (X.C229616q) r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x004b }
            X.1M0 r3 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x004b }
            X.14e r4 = r3.A02     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = "SELECT plain_file_hash, encrypted_file_hash, media_key, mime_type, height, width, sticker_pack_id, file_path, url, file_size, direct_path, emojis, hash_of_image_part, is_avatar, avatar_template_id, is_fun_sticker, is_lottie FROM stickers WHERE avatar_template_id = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0044 }
            r1[r6] = r8     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = "getByPackId/QUERY_STICKER"
            android.database.Cursor r2 = r4.A09(r2, r0, r1)     // Catch:{ all -> 0x0044 }
            X.AnonymousClass00C.A0B(r2)     // Catch:{ all -> 0x003d }
            java.util.ArrayList r1 = r7.A01(r2)     // Catch:{ all -> 0x003d }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x003d }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0033
            java.lang.Object r0 = r1.get(r6)     // Catch:{ all -> 0x003d }
            X.6c4 r0 = (X.C135066c4) r0     // Catch:{ all -> 0x003d }
            goto L_0x0034
        L_0x0033:
            r0 = r5
        L_0x0034:
            if (r2 == 0) goto L_0x0039
            r2.close()     // Catch:{ all -> 0x0044 }
        L_0x0039:
            r3.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x004b }
            return r0
        L_0x003d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003f }
        L_0x003f:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0044 }
            throw r0     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x004b }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x004b }
        L_0x004b:
            r1 = move-exception
            java.lang.String r0 = "StickerDBTableHelper/getByPackId"
            com.whatsapp.util.Log.e(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23991Aq.A00(java.lang.String):X.6c4");
    }

    public final ArrayList A01(Cursor cursor) {
        Cursor cursor2 = cursor;
        AnonymousClass00C.A0D(cursor2, 0);
        ArrayList arrayList = new ArrayList();
        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("plain_file_hash");
        int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("encrypted_file_hash");
        int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("media_key");
        int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("mime_type");
        int columnIndexOrThrow5 = cursor2.getColumnIndexOrThrow("height");
        int columnIndexOrThrow6 = cursor2.getColumnIndexOrThrow("width");
        int columnIndexOrThrow7 = cursor2.getColumnIndexOrThrow("sticker_pack_id");
        int columnIndexOrThrow8 = cursor2.getColumnIndexOrThrow("file_path");
        int columnIndexOrThrow9 = cursor2.getColumnIndexOrThrow("file_size");
        int columnIndexOrThrow10 = cursor2.getColumnIndexOrThrow("url");
        int columnIndexOrThrow11 = cursor2.getColumnIndexOrThrow("direct_path");
        int columnIndexOrThrow12 = cursor2.getColumnIndexOrThrow("emojis");
        int columnIndexOrThrow13 = cursor2.getColumnIndexOrThrow("hash_of_image_part");
        int columnIndexOrThrow14 = cursor2.getColumnIndexOrThrow("is_avatar");
        int columnIndexOrThrow15 = cursor2.getColumnIndexOrThrow("avatar_template_id");
        int columnIndexOrThrow16 = cursor2.getColumnIndexOrThrow("is_fun_sticker");
        int columnIndexOrThrow17 = cursor2.getColumnIndexOrThrow("is_lottie");
        while (cursor2.moveToNext()) {
            C135066c4 r22 = new C135066c4((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String[]) null, 0, 0, 0, false, false, false, false, false, false);
            r22.A0E = cursor2.getString(columnIndexOrThrow);
            r22.A09 = cursor2.getString(columnIndexOrThrow2);
            r22.A0C = cursor2.getString(columnIndexOrThrow3);
            r22.A0D = cursor2.getString(columnIndexOrThrow4);
            r22.A02 = cursor2.getInt(columnIndexOrThrow5);
            r22.A03 = cursor2.getInt(columnIndexOrThrow6);
            r22.A0G = cursor2.getString(columnIndexOrThrow7);
            r22.A02(cursor2.getString(columnIndexOrThrow8), 1);
            r22.A00 = cursor2.getInt(columnIndexOrThrow9);
            r22.A0H = cursor2.getString(columnIndexOrThrow10);
            r22.A07 = cursor2.getString(columnIndexOrThrow11);
            r22.A08 = cursor2.getString(columnIndexOrThrow12);
            r22.A0B = cursor2.getString(columnIndexOrThrow13);
            r22.A0L = C54282sh.A00(cursor2, columnIndexOrThrow14);
            r22.A06 = cursor2.getString(columnIndexOrThrow15);
            r22.A0I = C54282sh.A00(cursor2, columnIndexOrThrow16);
            r22.A0N = C54282sh.A00(cursor2, columnIndexOrThrow17);
            this.A00.A04(r22);
            arrayList.add(r22);
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0039, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A02(java.lang.String r7) {
        /*
            r6 = this;
            r5 = 0
            X.005 r0 = r6.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x003a }
            java.lang.Object r0 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x003a }
            X.16q r0 = (X.C229616q) r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x003a }
            X.1M0 r4 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x003a }
            X.14e r3 = r4.A02     // Catch:{ all -> 0x0033 }
            java.lang.String r2 = "SELECT plain_file_hash, encrypted_file_hash, media_key, mime_type, height, width, sticker_pack_id, file_path, url, file_size, direct_path, emojis, hash_of_image_part, is_avatar, avatar_template_id, is_fun_sticker, is_lottie FROM stickers WHERE sticker_pack_id = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0033 }
            r1[r5] = r7     // Catch:{ all -> 0x0033 }
            java.lang.String r0 = "getByPackId/QUERY_STICKER"
            android.database.Cursor r2 = r3.A09(r2, r0, r1)     // Catch:{ all -> 0x0033 }
            X.AnonymousClass00C.A0B(r2)     // Catch:{ all -> 0x002c }
            java.util.ArrayList r0 = r6.A01(r2)     // Catch:{ all -> 0x002c }
            if (r2 == 0) goto L_0x0028
            r2.close()     // Catch:{ all -> 0x0033 }
        L_0x0028:
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x003a }
            return r0
        L_0x002c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002e }
        L_0x002e:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0033 }
            throw r0     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x003a }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x003a }
        L_0x003a:
            r1 = move-exception
            java.lang.String r0 = "StickerDBTableHelper/getByPackId"
            com.whatsapp.util.Log.e(r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23991Aq.A02(java.lang.String):java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00cf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00d3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d7, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00da, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(java.util.List r9) {
        /*
            r8 = this;
            X.005 r0 = r8.A01
            java.lang.Object r0 = r0.get()
            X.16q r0 = (X.C229616q) r0
            X.1M0 r3 = r0.A04()
            X.71s r4 = r3.B1k()     // Catch:{ all -> 0x00d4 }
            java.util.Iterator r7 = r9.iterator()     // Catch:{ all -> 0x00cd }
        L_0x0014:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x00cd }
            if (r0 == 0) goto L_0x00c3
            java.lang.Object r2 = r7.next()     // Catch:{ all -> 0x00cd }
            X.6c4 r2 = (X.C135066c4) r2     // Catch:{ all -> 0x00cd }
            X.14e r6 = r3.A02     // Catch:{ all -> 0x00cd }
            X.AnonymousClass00C.A08(r6)     // Catch:{ all -> 0x00cd }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x00cd }
            r5.<init>()     // Catch:{ all -> 0x00cd }
            java.lang.String r1 = r2.A0E     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = "plain_file_hash"
            r5.put(r0, r1)     // Catch:{ all -> 0x00cd }
            java.lang.String r1 = r2.A09     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = "encrypted_file_hash"
            r5.put(r0, r1)     // Catch:{ all -> 0x00cd }
            java.lang.String r1 = r2.A0C     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = "media_key"
            r5.put(r0, r1)     // Catch:{ all -> 0x00cd }
            java.lang.String r1 = r2.A0D     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = "mime_type"
            r5.put(r0, r1)     // Catch:{ all -> 0x00cd }
            int r0 = r2.A02     // Catch:{ all -> 0x00cd }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = "height"
            r5.put(r0, r1)     // Catch:{ all -> 0x00cd }
            int r0 = r2.A03     // Catch:{ all -> 0x00cd }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = "width"
            r5.put(r0, r1)     // Catch:{ all -> 0x00cd }
            java.lang.String r1 = r2.A0G     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = "sticker_pack_id"
            r5.put(r0, r1)     // Catch:{ all -> 0x00cd }
            java.lang.String r1 = r2.A0A     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = "file_path"
            r5.put(r0, r1)     // Catch:{ all -> 0x00cd }
            int r0 = r2.A00     // Catch:{ all -> 0x00cd }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = "file_size"
            r5.put(r0, r1)     // Catch:{ all -> 0x00cd }
            java.lang.String r1 = r2.A0H     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = "url"
            r5.put(r0, r1)     // Catch:{ all -> 0x00cd }
            java.lang.String r1 = r2.A07     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = "direct_path"
            r5.put(r0, r1)     // Catch:{ all -> 0x00cd }
            java.lang.String r1 = r2.A08     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = "emojis"
            r5.put(r0, r1)     // Catch:{ all -> 0x00cd }
            java.lang.String r1 = r2.A0B     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = "hash_of_image_part"
            r5.put(r0, r1)     // Catch:{ all -> 0x00cd }
            boolean r0 = r2.A0L     // Catch:{ all -> 0x00cd }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = "is_avatar"
            r5.put(r0, r1)     // Catch:{ all -> 0x00cd }
            boolean r0 = r2.A0I     // Catch:{ all -> 0x00cd }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = "is_fun_sticker"
            r5.put(r0, r1)     // Catch:{ all -> 0x00cd }
            boolean r0 = r2.A0N     // Catch:{ all -> 0x00cd }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = "is_lottie"
            r5.put(r0, r1)     // Catch:{ all -> 0x00cd }
            java.lang.String r1 = r2.A06     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = "avatar_template_id"
            r5.put(r0, r1)     // Catch:{ all -> 0x00cd }
            java.lang.String r2 = "stickers"
            r1 = 5
            java.lang.String r0 = "insertStickerToDB/INSERT_STICKER"
            r6.A08(r2, r0, r5, r1)     // Catch:{ all -> 0x00cd }
            goto L_0x0014
        L_0x00c3:
            r4.A00()     // Catch:{ all -> 0x00cd }
            r4.close()     // Catch:{ all -> 0x00d4 }
            r3.close()
            return
        L_0x00cd:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00cf }
        L_0x00cf:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x00d4 }
            throw r0     // Catch:{ all -> 0x00d4 }
        L_0x00d4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d6 }
        L_0x00d6:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23991Aq.A03(java.util.List):void");
    }
}
