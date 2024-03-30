package X;

import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1BI  reason: invalid class name */
public final class AnonymousClass1BI {
    public final C19630wG A00;
    public final AnonymousClass1BM A01;
    public final AnonymousClass1BB A02;
    public final AnonymousClass1BJ A03;
    public final AnonymousClass1BQ A04;
    public final AnonymousClass1BO A05;
    public final AnonymousClass1BP A06;
    public final AnonymousClass17Y A07;

    public AnonymousClass1BI(AnonymousClass17Y r2, C19630wG r3, AnonymousClass1BM r4, AnonymousClass1BB r5, AnonymousClass1BJ r6, AnonymousClass1BQ r7, AnonymousClass1BO r8, AnonymousClass1BP r9) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r5, 3);
        AnonymousClass00C.A0D(r6, 4);
        AnonymousClass00C.A0D(r4, 5);
        AnonymousClass00C.A0D(r8, 6);
        AnonymousClass00C.A0D(r9, 7);
        AnonymousClass00C.A0D(r7, 8);
        this.A00 = r3;
        this.A07 = r2;
        this.A02 = r5;
        this.A03 = r6;
        this.A01 = r4;
        this.A05 = r8;
        this.A06 = r9;
        this.A04 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x016a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x016e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0171, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0172, code lost:
        X.C05600Qi.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0175, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x017b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        X.C05600Qi.A00(r14, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x017f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0182, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0183, code lost:
        X.C05600Qi.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0186, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass68B A00(java.lang.String r23, java.lang.String r24) {
        /*
            r22 = this;
            r0 = 0
            r5 = r23
            X.AnonymousClass00C.A0D(r5, r0)
            r4 = 1
            r1 = r24
            X.AnonymousClass00C.A0D(r1, r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "ThirdPartyStickerManager/fetchPack/ "
            r2.append(r0)
            int r0 = r5.hashCode()
            r2.append(r0)
            r0 = 47
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3 = r22
            X.1BP r0 = r3.A06
            boolean r2 = r0.A03(r5, r1)
            if (r2 != 0) goto L_0x0042
            java.lang.String r0 = "ThirdPartyStickerManager/fetchPack/not using sticker cache"
        L_0x0038:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1BM r0 = r3.A01
            X.68B r6 = r0.A02(r5, r1)
        L_0x0041:
            return r6
        L_0x0042:
            X.1BM r2 = r3.A01     // Catch:{ Exception -> 0x0049 }
            X.68B r7 = r2.A03(r5, r1)     // Catch:{ Exception -> 0x0049 }
            goto L_0x0050
        L_0x0049:
            r6 = move-exception
            java.lang.String r2 = "ThirdPartyStickerManager/fetchPack/could not fetch pack metadata"
            com.whatsapp.util.Log.e(r2, r6)
            r7 = 0
        L_0x0050:
            r13 = 1
            if (r7 == 0) goto L_0x005a
            boolean r2 = r7.A0O
            if (r2 != r4) goto L_0x005a
            java.lang.String r0 = "ThirdPartyStickerManager/fetchPack/avoid caching is true"
            goto L_0x0038
        L_0x005a:
            java.lang.String r11 = "authority"
            r12 = 0
            X.005 r2 = r0.A00
            java.lang.Object r2 = r2.get()
            X.16q r2 = (X.C229616q) r2
            X.1M0 r2 = r2.get()
            X.14e r10 = r2.A02     // Catch:{ all -> 0x0180 }
            java.lang.String r9 = "SELECT authority, sticker_pack_id, sticker_pack_name, sticker_pack_publisher, sticker_pack_image_data_hash, avoid_cache, is_animated_pack FROM third_party_whitelist_packs WHERE authority = ? AND sticker_pack_id = ? LIMIT 1"
            r6 = 2
            java.lang.String[] r8 = new java.lang.String[r6]     // Catch:{ all -> 0x0180 }
            r8[r12] = r23     // Catch:{ all -> 0x0180 }
            r8[r4] = r24     // Catch:{ all -> 0x0180 }
            java.lang.String r6 = "getCachedPacks/QUERY_THIRD_PARTY_WHITELIST_PACKS"
            android.database.Cursor r14 = r10.A09(r9, r6, r8)     // Catch:{ all -> 0x0180 }
            boolean r8 = r14.moveToNext()     // Catch:{ all -> 0x0179 }
            r6 = 0
            if (r8 == 0) goto L_0x00ad
            int r15 = r14.getColumnIndexOrThrow(r11)     // Catch:{ all -> 0x0179 }
            java.lang.String r6 = "sticker_pack_id"
            int r16 = r14.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0179 }
            java.lang.String r6 = "sticker_pack_name"
            int r17 = r14.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0179 }
            java.lang.String r6 = "sticker_pack_publisher"
            int r18 = r14.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0179 }
            java.lang.String r6 = "sticker_pack_image_data_hash"
            int r19 = r14.getColumnIndex(r6)     // Catch:{ all -> 0x0179 }
            java.lang.String r6 = "avoid_cache"
            int r20 = r14.getColumnIndex(r6)     // Catch:{ all -> 0x0179 }
            java.lang.String r6 = "is_animated_pack"
            int r21 = r14.getColumnIndex(r6)     // Catch:{ all -> 0x0179 }
            X.68B r6 = X.AnonymousClass1BP.A00(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0179 }
        L_0x00ad:
            r14.close()     // Catch:{ all -> 0x0180 }
            r2.close()
            if (r7 == 0) goto L_0x00e4
            if (r6 == 0) goto L_0x00c3
            java.lang.String r8 = r6.A03
            if (r8 == 0) goto L_0x00c3
            java.lang.String r2 = r7.A0G
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x00e4
        L_0x00c3:
            r0.A02(r7, r5, r1)
            r6 = r7
            java.lang.String r0 = "ThirdPartyStickerManager/fetchPack/repopulate sticker pack db"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1BO r2 = r3.A05
            java.lang.String r0 = r7.A0F
            X.AnonymousClass00C.A08(r0)
            r2.A02(r0)
            X.1BM r0 = r3.A01
            byte[] r0 = r0.A04(r7)
            r2.A00(r7, r0)
        L_0x00df:
            X.1BJ r2 = r3.A03
            monitor-enter(r2)
            r0 = 0
            goto L_0x00e6
        L_0x00e4:
            r13 = 0
            goto L_0x00df
        L_0x00e6:
            java.util.List r9 = X.AnonymousClass1BJ.A01(r2, r5, r1, r0)     // Catch:{ all -> 0x0176 }
            monitor-exit(r2)
            X.AnonymousClass00C.A08(r9)
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x00f6
            if (r13 == 0) goto L_0x0109
        L_0x00f6:
            X.1BM r0 = r3.A01
            X.68B r0 = r0.A02(r5, r1)
            java.util.List r9 = r0.A05
            X.AnonymousClass00C.A08(r9)
            r2.A02(r5, r1, r9)
            java.lang.String r0 = "ThirdPartyStickerManager/fetchPack/repopulating sticker cache"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0109:
            java.util.Iterator r12 = r9.iterator()
        L_0x010d:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0154
            java.lang.Object r8 = r12.next()
            X.6c4 r8 = (X.C135066c4) r8
            java.lang.String r11 = r8.A0E
            if (r11 == 0) goto L_0x010d
            X.1BQ r0 = r3.A04
            r10 = 0
            X.005 r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.16q r0 = (X.C229616q) r0
            X.1M0 r5 = r0.get()
            X.14e r7 = r5.A02     // Catch:{ all -> 0x016f }
            java.lang.String r2 = "SELECT emojis FROM third_party_sticker_emoji_mapping WHERE plaintext_hash = ?"
            java.lang.String[] r1 = new java.lang.String[r4]     // Catch:{ all -> 0x016f }
            r1[r10] = r11     // Catch:{ all -> 0x016f }
            java.lang.String r0 = "getEmoji/QUERY_EMOJI"
            android.database.Cursor r2 = r7.A09(r2, r0, r1)     // Catch:{ all -> 0x016f }
            boolean r1 = r2.moveToNext()     // Catch:{ all -> 0x0168 }
            r0 = 0
            if (r1 == 0) goto L_0x014b
            java.lang.String r0 = "emojis"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0168 }
        L_0x014b:
            r2.close()     // Catch:{ all -> 0x016f }
            r5.close()
            r8.A08 = r0
            goto L_0x010d
        L_0x0154:
            X.C18740tg.A06(r6)
            r6.A05 = r9
            if (r13 == 0) goto L_0x0041
            X.17Y r2 = r3.A07
            r1 = 10
            X.1jE r0 = new X.1jE
            r0.<init>(r3, r6, r1)
            r2.A0H(r0)
            return r6
        L_0x0168:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x016a }
        L_0x016a:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x016f }
            throw r0     // Catch:{ all -> 0x016f }
        L_0x016f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0171 }
        L_0x0171:
            r1 = move-exception
            X.C05600Qi.A00(r5, r0)
            throw r1
        L_0x0176:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x0179:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x017b }
        L_0x017b:
            r0 = move-exception
            X.C05600Qi.A00(r14, r1)     // Catch:{ all -> 0x0180 }
            throw r0     // Catch:{ all -> 0x0180 }
        L_0x0180:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0182 }
        L_0x0182:
            r1 = move-exception
            X.C05600Qi.A00(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1BI.A00(java.lang.String, java.lang.String):X.68B");
    }

    public final File A01(String str) {
        AnonymousClass00C.A0D(str, 0);
        Pair A002 = AnonymousClass1BM.A00(str);
        if (A002 != null) {
            Object obj = A002.first;
            AnonymousClass00C.A07(obj);
            String str2 = (String) obj;
            Object obj2 = A002.second;
            AnonymousClass00C.A07(obj2);
            String str3 = (String) obj2;
            AnonymousClass00C.A0D(str2, 0);
            AnonymousClass00C.A0D(str3, 1);
            if (this.A06.A03(str2, str3)) {
                AnonymousClass1BO r3 = this.A05;
                File A012 = r3.A01(str);
                if (A012 != null && A012.exists()) {
                    return A012;
                }
                try {
                    AnonymousClass1BM r2 = this.A01;
                    AnonymousClass68B A022 = r2.A02((String) A002.first, (String) A002.second);
                    return r3.A00(A022, r2.A04(A022));
                } catch (Exception e) {
                    Log.e("ThirdPartyStickerManager/getTrayIcon/error fetching pack", e);
                    return null;
                }
            }
        }
        return null;
    }
}
