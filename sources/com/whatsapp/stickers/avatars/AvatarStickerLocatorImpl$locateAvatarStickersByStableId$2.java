package com.whatsapp.stickers.avatars;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C24201Bn;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.avatars.AvatarStickerLocatorImpl$locateAvatarStickersByStableId$2", f = "AvatarStickerLocatorImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerLocatorImpl$locateAvatarStickersByStableId$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ List $stableIds;
    public int label;
    public final /* synthetic */ C24201Bn this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerLocatorImpl$locateAvatarStickersByStableId$2(C24201Bn r2, List list, C023509x r4) {
        super(2, r4);
        this.$stableIds = list;
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new AvatarStickerLocatorImpl$locateAvatarStickersByStableId$2(this.this$0, this.$stableIds, r5);
    }

    /* JADX WARNING: type inference failed for: r0v36, types: [X.03N] */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01de, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        X.C05600Qi.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01e2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01e5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        X.C05600Qi.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01e9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x023c, code lost:
        if (r1 != null) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0086, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        X.C05600Qi.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0091, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0120, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0123, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        X.C05600Qi.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0127, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r41) {
        /*
            r40 = this;
            r3 = r40
            int r0 = r3.label
            if (r0 != 0) goto L_0x02f5
            X.AnonymousClass0AN.A00(r41)
            java.util.List r0 = r3.$stableIds
            r7 = 10
            java.util.ArrayList r8 = X.C36351kA.A0z(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0015:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r1.next()
            X.690 r0 = (X.AnonymousClass690) r0
            java.lang.String r0 = r0.A00
            r8.add(r0)
            goto L_0x0015
        L_0x0027:
            X.1Bn r0 = r3.this$0
            X.1Aq r6 = r0.A06
            java.lang.String r5 = "StickerDBTableHelper/getByStableIds"
            r0 = 0
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r2 = r8.toArray(r0)
            r1 = 975(0x3cf, float:1.366E-42)
            X.72Z r0 = new X.72Z
            r0.<init>(r2, r1)
            java.util.Iterator r12 = r0.iterator()
        L_0x0043:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0097
            java.lang.Object r11 = r12.next()
            java.lang.String[] r11 = (java.lang.String[]) r11
            X.005 r0 = r6.A01     // Catch:{ SQLiteDatabaseCorruptException | NullPointerException -> 0x0092 }
            X.1M0 r9 = X.C90484aE.A0W(r0)     // Catch:{ SQLiteDatabaseCorruptException | NullPointerException -> 0x0092 }
            X.14e r10 = r9.A02     // Catch:{ all -> 0x008b }
            int r0 = r11.length     // Catch:{ all -> 0x008b }
            java.lang.String r2 = X.AnonymousClass1M2.A00(r0)     // Catch:{ all -> 0x008b }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x008b }
            java.lang.String r0 = "SELECT plain_file_hash, encrypted_file_hash, media_key, mime_type, height, width, sticker_pack_id, file_path, url, file_size, direct_path, emojis, hash_of_image_part, is_avatar, avatar_template_id, is_fun_sticker, is_lottie FROM stickers WHERE "
            r1.append(r0)     // Catch:{ all -> 0x008b }
            java.lang.String r0 = "avatar_template_id IN "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r2, r1)     // Catch:{ all -> 0x008b }
            java.lang.String r0 = "getByStableIds/QUERY_STICKER"
            android.database.Cursor r2 = r10.A09(r1, r0, r11)     // Catch:{ all -> 0x008b }
            X.AnonymousClass00C.A0B(r2)     // Catch:{ all -> 0x0084 }
            java.util.ArrayList r0 = r6.A01(r2)     // Catch:{ all -> 0x0084 }
            r4.addAll(r0)     // Catch:{ all -> 0x0084 }
            if (r2 == 0) goto L_0x0080
            r2.close()     // Catch:{ all -> 0x008b }
        L_0x0080:
            r9.close()     // Catch:{ SQLiteDatabaseCorruptException | NullPointerException -> 0x0092 }
            goto L_0x0043
        L_0x0084:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x008b }
            throw r0     // Catch:{ all -> 0x008b }
        L_0x008b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x008d }
        L_0x008d:
            r0 = move-exception
            X.C05600Qi.A00(r9, r1)     // Catch:{ SQLiteDatabaseCorruptException | NullPointerException -> 0x0092 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException | NullPointerException -> 0x0092 }
        L_0x0092:
            r0 = move-exception
            com.whatsapp.util.Log.e(r5, r0)
            goto L_0x0043
        L_0x0097:
            int r0 = X.AnonymousClass03U.A06(r4, r7)
            int r0 = X.C90484aE.A05(r0)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>(r0)
            java.util.Iterator r2 = r4.iterator()
        L_0x00a8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00bb
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.6c4 r0 = (X.C135066c4) r0
            java.lang.String r0 = r0.A06
            r6.put(r0, r1)
            goto L_0x00a8
        L_0x00bb:
            X.1Bn r0 = r3.this$0
            X.1As r5 = r0.A05
            r0 = 0
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r2 = r8.toArray(r0)
            r1 = 975(0x3cf, float:1.366E-42)
            X.72Z r0 = new X.72Z
            r0.<init>(r2, r1)
            java.util.Iterator r12 = r0.iterator()
        L_0x00d5:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x012f
            java.lang.Object r11 = r12.next()
            java.lang.String[] r11 = (java.lang.String[]) r11
            X.005 r0 = r5.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x0128 }
            X.1M0 r9 = X.C90484aE.A0W(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0128 }
            X.14e r10 = r9.A02     // Catch:{ all -> 0x0121 }
            int r0 = r11.length     // Catch:{ all -> 0x0121 }
            java.lang.String r2 = X.AnonymousClass1M2.A00(r0)     // Catch:{ all -> 0x0121 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "SELECT plaintext_hash, hash_of_image_part, timestamp, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avatar, avatar_template_id, is_fun_sticker, is_lottie FROM starred_stickers WHERE "
            r1.append(r0)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "avatar_template_id IN "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r2, r1)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "getStarredStickersByStableIds/QUERY_STICKER"
            android.database.Cursor r2 = r10.A09(r1, r0, r11)     // Catch:{ all -> 0x0121 }
        L_0x0103:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x011a }
            if (r0 == 0) goto L_0x0113
            X.6EB r0 = X.C24011As.A00(r2)     // Catch:{ all -> 0x011a }
            if (r0 == 0) goto L_0x0103
            r4.add(r0)     // Catch:{ all -> 0x011a }
            goto L_0x0103
        L_0x0113:
            r2.close()     // Catch:{ all -> 0x0121 }
            r9.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0128 }
            goto L_0x00d5
        L_0x011a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x011c }
        L_0x011c:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0121 }
            throw r0     // Catch:{ all -> 0x0121 }
        L_0x0121:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0123 }
        L_0x0123:
            r0 = move-exception
            X.C05600Qi.A00(r9, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0128 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0128 }
        L_0x0128:
            r1 = move-exception
            java.lang.String r0 = "StickerDBTableHelper/getStarredStickersByStableIds"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x00d5
        L_0x012f:
            X.1Bn r5 = r3.this$0
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            java.util.Iterator r4 = r4.iterator()
        L_0x0139:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0153
            java.lang.Object r2 = r4.next()
            X.6EB r2 = (X.AnonymousClass6EB) r2
            X.1Ap r1 = r5.A02
            X.1Av r0 = r5.A01
            X.6c4 r0 = X.C111675cf.A00(r0, r1, r2)
            if (r0 == 0) goto L_0x0139
            r9.add(r0)
            goto L_0x0139
        L_0x0153:
            int r0 = X.AnonymousClass03U.A06(r9, r7)
            int r0 = X.C90484aE.A05(r0)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r0)
            java.util.Iterator r2 = r9.iterator()
        L_0x0164:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0177
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.6c4 r0 = (X.C135066c4) r0
            java.lang.String r0 = r0.A06
            r5.put(r0, r1)
            goto L_0x0164
        L_0x0177:
            X.1Bn r0 = r3.this$0
            X.1Bq r4 = r0.A04
            r0 = 0
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r8 = r8.toArray(r0)
            r1 = 975(0x3cf, float:1.366E-42)
            X.72Z r0 = new X.72Z
            r0.<init>(r8, r1)
            java.util.Iterator r12 = r0.iterator()
        L_0x0191:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01f1
            java.lang.Object r11 = r12.next()
            java.lang.String[] r11 = (java.lang.String[]) r11
            X.005 r0 = r4.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x01ea }
            X.1M0 r9 = X.C90484aE.A0W(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01ea }
            X.14e r10 = r9.A02     // Catch:{ all -> 0x01e3 }
            int r0 = r11.length     // Catch:{ all -> 0x01e3 }
            java.lang.String r8 = X.AnonymousClass1M2.A00(r0)     // Catch:{ all -> 0x01e3 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01e3 }
            java.lang.String r0 = "SELECT plaintext_hash, entry_weight, hash_of_image_part, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avocado, last_sticker_sent_ts, avatar_template_id, is_fun_sticker, is_lottie FROM recent_stickers WHERE "
            r1.append(r0)     // Catch:{ all -> 0x01e3 }
            java.lang.String r0 = "avatar_template_id IN "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r8, r1)     // Catch:{ all -> 0x01e3 }
            java.lang.String r0 = "getStarredStickersByStableIds/QUERY_STICKER"
            android.database.Cursor r8 = r10.A09(r1, r0, r11)     // Catch:{ all -> 0x01e3 }
        L_0x01bf:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x01dc }
            if (r0 == 0) goto L_0x01d5
            X.005 r0 = r4.A00     // Catch:{ all -> 0x01dc }
            java.lang.Object r0 = X.C36411kG.A0v(r0)     // Catch:{ all -> 0x01dc }
            X.1Ap r0 = (X.C23981Ap) r0     // Catch:{ all -> 0x01dc }
            X.6c4 r0 = X.C24231Bq.A00(r8, r0)     // Catch:{ all -> 0x01dc }
            r2.add(r0)     // Catch:{ all -> 0x01dc }
            goto L_0x01bf
        L_0x01d5:
            r8.close()     // Catch:{ all -> 0x01e3 }
            r9.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01ea }
            goto L_0x0191
        L_0x01dc:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01de }
        L_0x01de:
            r0 = move-exception
            X.C05600Qi.A00(r8, r1)     // Catch:{ all -> 0x01e3 }
            throw r0     // Catch:{ all -> 0x01e3 }
        L_0x01e3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01e5 }
        L_0x01e5:
            r0 = move-exception
            X.C05600Qi.A00(r9, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01ea }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x01ea }
        L_0x01ea:
            r1 = move-exception
            java.lang.String r0 = "StickerDBTableHelper/getStarredStickersByStableIds"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0191
        L_0x01f1:
            int r0 = X.AnonymousClass03U.A06(r2, r7)
            int r0 = X.C90484aE.A05(r0)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r0)
            java.util.Iterator r2 = r2.iterator()
        L_0x0202:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0215
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.6c4 r0 = (X.C135066c4) r0
            java.lang.String r0 = r0.A06
            r4.put(r0, r1)
            goto L_0x0202
        L_0x0215:
            java.util.List r0 = r3.$stableIds
            X.1Bn r11 = r3.this$0
            java.util.ArrayList r10 = X.C36351kA.A0z(r0)
            java.util.Iterator r16 = r0.iterator()
        L_0x0221:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x02f4
            java.lang.Object r3 = r16.next()
            X.690 r3 = (X.AnonymousClass690) r3
            java.lang.String r2 = r3.A00
            boolean r0 = r6.containsKey(r2)
            r7 = 0
            if (r0 == 0) goto L_0x0247
            java.lang.Object r1 = r6.get(r2)
        L_0x023a:
            X.6c4 r1 = (X.C135066c4) r1
            if (r1 == 0) goto L_0x025d
        L_0x023e:
            X.5IO r0 = new X.5IO
            r0.<init>(r1)
        L_0x0243:
            r10.add(r0)
            goto L_0x0221
        L_0x0247:
            boolean r0 = r5.containsKey(r2)
            if (r0 == 0) goto L_0x0252
            java.lang.Object r1 = r5.get(r2)
            goto L_0x023a
        L_0x0252:
            boolean r0 = r4.containsKey(r2)
            if (r0 == 0) goto L_0x025d
            java.lang.Object r1 = r4.get(r2)
            goto L_0x023a
        L_0x025d:
            X.1Bp r0 = r11.A03
            java.io.File r15 = r0.A00(r3, r7)
            X.1Ap r12 = r11.A02
            r1 = 0
            boolean r0 = r15.exists()     // Catch:{ all -> 0x02d4 }
            r13 = 0
            if (r0 == 0) goto L_0x02eb
            long r7 = r15.length()     // Catch:{ all -> 0x02d4 }
            int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x02eb
            java.lang.String r9 = X.AnonymousClass6UG.A00(r15)     // Catch:{ all -> 0x02d4 }
            X.AnonymousClass00C.A08(r9)     // Catch:{ all -> 0x02d4 }
            r18 = 0
            r31 = 0
            X.6c4 r0 = new X.6c4     // Catch:{ all -> 0x02d4 }
            r20 = r18
            r21 = r18
            r22 = r18
            r23 = r18
            r24 = r18
            r25 = r18
            r26 = r18
            r27 = r18
            r28 = r18
            r29 = r18
            r30 = r18
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r17 = r0
            r19 = r18
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ all -> 0x02d4 }
            java.lang.String r13 = "meta-avatar"
            r0.A0G = r13     // Catch:{ all -> 0x02d4 }
            r0.A06 = r2     // Catch:{ all -> 0x02d4 }
            r12.A04(r0)     // Catch:{ all -> 0x02d4 }
            java.lang.String r2 = "image/webp"
            r0.A0D = r2     // Catch:{ all -> 0x02d4 }
            int r2 = (int) r7     // Catch:{ all -> 0x02d4 }
            r0.A00 = r2     // Catch:{ all -> 0x02d4 }
            java.lang.String r2 = r15.getAbsolutePath()     // Catch:{ all -> 0x02d4 }
            r0.A0A = r2     // Catch:{ all -> 0x02d4 }
            r0.A0E = r9     // Catch:{ all -> 0x02d4 }
            r0.A0B = r9     // Catch:{ all -> 0x02d4 }
            r2 = 1
            r0.A0L = r2     // Catch:{ all -> 0x02d4 }
            r2 = 512(0x200, float:7.175E-43)
            r0.A02 = r2     // Catch:{ all -> 0x02d4 }
            r0.A03 = r2     // Catch:{ all -> 0x02d4 }
            goto L_0x02d9
        L_0x02d4:
            r0 = move-exception
            X.03N r0 = X.C90524aI.A0t(r0)
        L_0x02d9:
            java.lang.Throwable r7 = X.AnonymousClass0AK.A00(r0)
            if (r7 == 0) goto L_0x02e4
            java.lang.String r2 = "AvatarStickerUtils/unable to recreate Avatar sticker from file"
            com.whatsapp.util.Log.e(r2, r7)
        L_0x02e4:
            boolean r2 = r0 instanceof X.AnonymousClass03N
            if (r2 != 0) goto L_0x02e9
            r1 = r0
        L_0x02e9:
            X.6c4 r1 = (X.C135066c4) r1
        L_0x02eb:
            if (r1 != 0) goto L_0x023e
            X.5IP r0 = new X.5IP
            r0.<init>(r3)
            goto L_0x0243
        L_0x02f4:
            return r10
        L_0x02f5:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.avatars.AvatarStickerLocatorImpl$locateAvatarStickersByStableId$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickerLocatorImpl$locateAvatarStickersByStableId$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
