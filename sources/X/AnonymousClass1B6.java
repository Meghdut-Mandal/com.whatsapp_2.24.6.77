package X;

import android.content.ContentValues;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1B6  reason: invalid class name */
public final class AnonymousClass1B6 {
    public final AnonymousClass005 A00;
    public final C19700wN A01;

    public AnonymousClass1B6(C19700wN r2, AnonymousClass005 r3) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        this.A00 = r3;
        this.A01 = r2;
    }

    public static final ArrayList A00(AnonymousClass1B6 r4, int i) {
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        }
        return A02(r4, "SELECT installed_id, installed_name, installed_size, installed_image_data_hash, installed_publisher, installed_description, installed_tray_image_id, installed_tray_image_preview_id, installed_animated_pack, installed_is_avatar_pack, installed_lottie_pack, installed_empty_favorites_avatar_template_id, installed_empty_recents_avatar_template_id, id, name, publisher, description, size, tray_image_id, preview_image_id_array, image_data_hash, tray_image_preview_id, animated_pack, lottie_pack FROM installed_sticker_packs LEFT JOIN downloadable_sticker_packs ON (installed_id = id) WHERE installed_is_avatar_pack = ?", "getInstalledStickerPacks/QUERY", new String[]{String.valueOf(i2)});
    }

    public static final ArrayList A01(AnonymousClass1B6 r3, String str) {
        String[] strArr;
        String str2;
        if (str == null) {
            strArr = null;
            str2 = "SELECT installed_id, installed_name, installed_size, installed_image_data_hash, installed_publisher, installed_description, installed_tray_image_id, installed_tray_image_preview_id, installed_animated_pack, installed_is_avatar_pack, installed_lottie_pack, installed_empty_favorites_avatar_template_id, installed_empty_recents_avatar_template_id, id, name, publisher, description, size, tray_image_id, preview_image_id_array, image_data_hash, tray_image_preview_id, animated_pack, lottie_pack FROM installed_sticker_packs LEFT JOIN downloadable_sticker_packs ON (installed_id = id)";
        } else {
            strArr = new String[]{str};
            str2 = "SELECT installed_id, installed_name, installed_size, installed_image_data_hash, installed_publisher, installed_description, installed_tray_image_id, installed_tray_image_preview_id, installed_animated_pack, installed_is_avatar_pack, installed_lottie_pack, installed_empty_favorites_avatar_template_id, installed_empty_recents_avatar_template_id, id, name, publisher, description, size, tray_image_id, preview_image_id_array, image_data_hash, tray_image_preview_id, animated_pack, lottie_pack FROM installed_sticker_packs LEFT JOIN downloadable_sticker_packs ON (installed_id = id) WHERE installed_id= ?";
        }
        return A02(r3, str2, "getInstalledStickerPacks/QUERY", strArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01ea, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        X.C05600Qi.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01ee, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01f1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        X.C05600Qi.A00(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01f5, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01d5 A[Catch:{ all -> 0x01ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01da A[Catch:{ all -> 0x01ea }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A02(X.AnonymousClass1B6 r37, java.lang.String r38, java.lang.String r39, java.lang.String[] r40) {
        /*
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r0 = r37
            X.005 r0 = r0.A00     // Catch:{ IllegalArgumentException -> 0x01f6 }
            java.lang.Object r0 = r0.get()     // Catch:{ IllegalArgumentException -> 0x01f6 }
            X.16q r0 = (X.C229616q) r0     // Catch:{ IllegalArgumentException -> 0x01f6 }
            X.1M0 r11 = r0.get()     // Catch:{ IllegalArgumentException -> 0x01f6 }
            X.14e r0 = r11.A02     // Catch:{ all -> 0x01ef }
            r3 = r38
            r2 = r39
            r1 = r40
            android.database.Cursor r10 = r0.A09(r3, r2, r1)     // Catch:{ all -> 0x01ef }
            X.AnonymousClass00C.A0B(r10)     // Catch:{ all -> 0x01e8 }
            r8 = 0
            X.AnonymousClass00C.A0D(r10, r8)     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = "id"
            int r36 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = "name"
            int r35 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = "publisher"
            int r34 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = "description"
            int r33 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = "size"
            int r32 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = "tray_image_id"
            int r31 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = "tray_image_preview_id"
            int r30 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = "preview_image_id_array"
            int r29 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = "image_data_hash"
            int r28 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = "animated_pack"
            int r27 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = "lottie_pack"
            int r26 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = "installed_id"
            int r25 = r10.getColumnIndex(r0)     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = "installed_name"
            int r24 = r10.getColumnIndex(r0)     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = "installed_publisher"
            int r23 = r10.getColumnIndex(r0)     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = "installed_description"
            int r22 = r10.getColumnIndex(r0)     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = "installed_size"
            int r21 = r10.getColumnIndex(r0)     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = "installed_image_data_hash"
            int r20 = r10.getColumnIndex(r0)     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = "installed_tray_image_id"
            int r19 = r10.getColumnIndex(r0)     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = "installed_tray_image_preview_id"
            int r18 = r10.getColumnIndex(r0)     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = "installed_animated_pack"
            int r7 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = "installed_is_avatar_pack"
            int r6 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = "installed_lottie_pack"
            int r5 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = "installed_empty_recents_avatar_template_id"
            int r4 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = "installed_empty_favorites_avatar_template_id"
            int r3 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01e8 }
        L_0x00b6:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x01e8 }
            if (r0 == 0) goto L_0x01e1
            X.65S r2 = new X.65S     // Catch:{ all -> 0x01e8 }
            r2.<init>()     // Catch:{ all -> 0x01e8 }
            r0 = r36
            java.lang.String r15 = r10.getString(r0)     // Catch:{ all -> 0x01e8 }
            r0 = r35
            java.lang.String r1 = r10.getString(r0)     // Catch:{ all -> 0x01e8 }
            r0 = r34
            java.lang.String r0 = r10.getString(r0)     // Catch:{ all -> 0x01e8 }
            r12 = r25
            java.lang.String r14 = r10.getString(r12)     // Catch:{ all -> 0x01e8 }
            r12 = r24
            java.lang.String r13 = r10.getString(r12)     // Catch:{ all -> 0x01e8 }
            r12 = r23
            java.lang.String r12 = r10.getString(r12)     // Catch:{ all -> 0x01e8 }
            r17 = 0
            if (r15 == 0) goto L_0x00ef
            int r16 = r15.length()     // Catch:{ all -> 0x01e8 }
            if (r16 != 0) goto L_0x00f9
        L_0x00ef:
            if (r14 == 0) goto L_0x00f7
            int r16 = r14.length()     // Catch:{ all -> 0x01e8 }
            if (r16 != 0) goto L_0x00f9
        L_0x00f7:
            r17 = 1
        L_0x00f9:
            if (r17 != 0) goto L_0x01d2
            r17 = 0
            if (r1 == 0) goto L_0x0105
            int r16 = r1.length()     // Catch:{ all -> 0x01e8 }
            if (r16 != 0) goto L_0x010f
        L_0x0105:
            if (r13 == 0) goto L_0x010d
            int r16 = r13.length()     // Catch:{ all -> 0x01e8 }
            if (r16 != 0) goto L_0x010f
        L_0x010d:
            r17 = 1
        L_0x010f:
            if (r17 != 0) goto L_0x01d2
            r17 = 0
            if (r0 == 0) goto L_0x011b
            int r16 = r0.length()     // Catch:{ all -> 0x01e8 }
            if (r16 != 0) goto L_0x0125
        L_0x011b:
            if (r12 == 0) goto L_0x0123
            int r16 = r12.length()     // Catch:{ all -> 0x01e8 }
            if (r16 != 0) goto L_0x0125
        L_0x0123:
            r17 = 1
        L_0x0125:
            if (r17 != 0) goto L_0x01d2
            r2.A0E = r15     // Catch:{ all -> 0x01e8 }
            r2.A0G = r1     // Catch:{ all -> 0x01e8 }
            r2.A0I = r0     // Catch:{ all -> 0x01e8 }
            r0 = r33
            java.lang.String r0 = r10.getString(r0)     // Catch:{ all -> 0x01e8 }
            r2.A03 = r0     // Catch:{ all -> 0x01e8 }
            r0 = r32
            int r0 = r10.getInt(r0)     // Catch:{ all -> 0x01e8 }
            long r0 = (long) r0     // Catch:{ all -> 0x01e8 }
            r2.A01 = r0     // Catch:{ all -> 0x01e8 }
            r0 = r31
            java.lang.String r0 = r10.getString(r0)     // Catch:{ all -> 0x01e8 }
            r2.A0K = r0     // Catch:{ all -> 0x01e8 }
            r0 = r28
            java.lang.String r0 = r10.getString(r0)     // Catch:{ all -> 0x01e8 }
            r2.A0F = r0     // Catch:{ all -> 0x01e8 }
            r0 = r30
            java.lang.String r0 = r10.getString(r0)     // Catch:{ all -> 0x01e8 }
            r2.A0L = r0     // Catch:{ all -> 0x01e8 }
            r0 = r27
            boolean r0 = X.C54282sh.A00(r10, r0)     // Catch:{ all -> 0x01e8 }
            r2.A0O = r0     // Catch:{ all -> 0x01e8 }
            r0 = r26
            boolean r0 = X.C54282sh.A00(r10, r0)     // Catch:{ all -> 0x01e8 }
            r2.A0U = r0     // Catch:{ all -> 0x01e8 }
            r0 = r29
            java.lang.String r1 = r10.getString(r0)     // Catch:{ all -> 0x01e8 }
            if (r1 == 0) goto L_0x0180
            int r0 = r1.length()     // Catch:{ all -> 0x01e8 }
            if (r0 == 0) goto L_0x0180
            java.lang.String r0 = ","
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ all -> 0x01e8 }
            java.util.List r0 = X.AnonymousClass099.A0L(r1, r0, r8)     // Catch:{ all -> 0x01e8 }
            r2.A0M = r0     // Catch:{ all -> 0x01e8 }
        L_0x0180:
            r2.A05 = r14     // Catch:{ all -> 0x01e8 }
            r2.A07 = r13     // Catch:{ all -> 0x01e8 }
            r0 = r22
            java.lang.String r0 = r10.getString(r0)     // Catch:{ all -> 0x01e8 }
            r2.A04 = r0     // Catch:{ all -> 0x01e8 }
            r2.A08 = r12     // Catch:{ all -> 0x01e8 }
            r0 = r20
            java.lang.String r0 = r10.getString(r0)     // Catch:{ all -> 0x01e8 }
            r2.A06 = r0     // Catch:{ all -> 0x01e8 }
            r0 = r21
            int r0 = r10.getInt(r0)     // Catch:{ all -> 0x01e8 }
            long r0 = (long) r0     // Catch:{ all -> 0x01e8 }
            r2.A00 = r0     // Catch:{ all -> 0x01e8 }
            r0 = r19
            java.lang.String r0 = r10.getString(r0)     // Catch:{ all -> 0x01e8 }
            r2.A09 = r0     // Catch:{ all -> 0x01e8 }
            r0 = r18
            java.lang.String r0 = r10.getString(r0)     // Catch:{ all -> 0x01e8 }
            r2.A0A = r0     // Catch:{ all -> 0x01e8 }
            boolean r0 = X.C54282sh.A00(r10, r7)     // Catch:{ all -> 0x01e8 }
            r2.A0Q = r0     // Catch:{ all -> 0x01e8 }
            boolean r0 = X.C54282sh.A00(r10, r6)     // Catch:{ all -> 0x01e8 }
            r2.A0R = r0     // Catch:{ all -> 0x01e8 }
            boolean r0 = X.C54282sh.A00(r10, r5)     // Catch:{ all -> 0x01e8 }
            r2.A0S = r0     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = r10.getString(r3)     // Catch:{ all -> 0x01e8 }
            r2.A0B = r0     // Catch:{ all -> 0x01e8 }
            java.lang.String r0 = r10.getString(r4)     // Catch:{ all -> 0x01e8 }
            r2.A0C = r0     // Catch:{ all -> 0x01e8 }
            X.68B r0 = r2.A00()     // Catch:{ all -> 0x01e8 }
            goto L_0x01d3
        L_0x01d2:
            r0 = 0
        L_0x01d3:
            if (r0 == 0) goto L_0x01da
            r9.add(r0)     // Catch:{ all -> 0x01e8 }
            goto L_0x00b6
        L_0x01da:
            java.lang.String r0 = "StickerPackStore/readStickerPackListFromDBTable/sticker pack is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01e8 }
            goto L_0x00b6
        L_0x01e1:
            r10.close()     // Catch:{ all -> 0x01ef }
            r11.close()     // Catch:{ IllegalArgumentException -> 0x01f6 }
            return r9
        L_0x01e8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01ea }
        L_0x01ea:
            r0 = move-exception
            X.C05600Qi.A00(r10, r1)     // Catch:{ all -> 0x01ef }
            throw r0     // Catch:{ all -> 0x01ef }
        L_0x01ef:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01f1 }
        L_0x01f1:
            r0 = move-exception
            X.C05600Qi.A00(r11, r1)     // Catch:{ IllegalArgumentException -> 0x01f6 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x01f6 }
        L_0x01f6:
            r3 = move-exception
            java.lang.String r0 = "StickerPackStore/readStickerPackListFromDBTable/exception"
            com.whatsapp.util.Log.e(r0, r3)
            r0 = r37
            X.0wN r2 = r0.A01
            java.lang.String r1 = r3.getMessage()
            java.lang.String r0 = "StickerPackStore/readStickerPackListFromDBTable/"
            r2.A0D(r0, r1, r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1B6.A02(X.1B6, java.lang.String, java.lang.String, java.lang.String[]):java.util.ArrayList");
    }

    public static final void A03(C224114e r5, AnonymousClass68B r6) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r6.A0F);
        contentValues.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r6.A0H);
        contentValues.put("description", r6.A0B);
        contentValues.put("publisher", r6.A0J);
        contentValues.put("size", Long.valueOf(r6.A02));
        contentValues.put("tray_image_id", r6.A0L);
        contentValues.put("tray_image_preview_id", r6.A0M);
        contentValues.put("image_data_hash", r6.A0G);
        List list = r6.A04;
        AnonymousClass00C.A08(list);
        if (!list.isEmpty()) {
            List list2 = r6.A04;
            AnonymousClass00C.A08(list2);
            contentValues.put("preview_image_id_array", C007103b.A0Q(",", "", "", list2, (C006302t) null));
        }
        C54272sg.A00(contentValues, "animated_pack", r6.A0N);
        C54272sg.A00(contentValues, "lottie_pack", r6.A0T);
        r5.A08("downloadable_sticker_packs", "insertStickerPackToDownloadableTable/INSERT_DOWNLOADABLE_STICKER_PACK", contentValues, 5);
    }
}
