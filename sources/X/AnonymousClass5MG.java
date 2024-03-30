package X;

import java.util.Collection;

/* renamed from: X.5MG  reason: invalid class name */
public class AnonymousClass5MG extends C132446Tt {
    public final C158317gj A00;
    public final C124005xR A01;
    public final boolean A02 = true;
    public final /* synthetic */ C122815vT A03;

    public AnonymousClass5MG(C158317gj r2, C122815vT r3, C124005xR r4) {
        this.A03 = r3;
        this.A01 = r4;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01d1, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01d2, code lost:
        if (r9 != null) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01dc, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r16) {
        /*
            r15 = this;
            r2 = r16
            java.lang.String[] r2 = (java.lang.String[]) r2
            X.C18740tg.A06(r2)
            int r0 = r2.length
            r1 = 0
            boolean r0 = X.AnonymousClass000.A1O(r0)
            X.C18740tg.A0B(r0)
            X.5xR r5 = r15.A01
            r3 = r2[r1]
            boolean r2 = r15.A02
            java.lang.String r0 = "StickerContextualSuggestionStore fetchMatchingStickersByTextFromDb"
            X.14g r8 = new X.14g
            r8.<init>((java.lang.String) r0)
            X.1XJ r1 = r5.A02
            r0 = 200(0xc8, float:2.8E-43)
            java.util.ArrayList r13 = r1.A02(r3, r0, r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Found and parsed emojis:"
            X.C36341k9.A1N(r0, r1, r13)
            java.lang.String r0 = r1.toString()
            r8.A02(r0)
            boolean r1 = r13.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0041
            java.util.ArrayList r0 = X.C36441kJ.A14(r0)
            return r0
        L_0x0041:
            java.util.LinkedHashSet r7 = X.C36441kJ.A17()
            java.lang.String r0 = "Start search for stickers"
            r8.A02(r0)
            int r1 = r13.size()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "SELECT plaintext_hash, from_third_party_pack_db, sticker_pack_identifier, mime_type, hash_of_image_part FROM (SELECT plaintext_hash as plaintext_hash, emojis as emojis, 10001 as primary_ordering, entry_weight as secondary_ordering, hash_of_image_part as hash_of_image_part, mimetype as mime_type, '' as sticker_pack_identifier, 0 as from_third_party_pack_db FROM recent_stickers UNION SELECT plaintext_hash as plaintext_hash, emojis as emojis, 10000 as primary_ordering, timestamp as secondary_ordering, hash_of_image_part as hash_of_image_part, mimetype as mime_type, '' as sticker_pack_identifier, 0 as from_third_party_pack_db FROM starred_stickers UNION SELECT plain_file_hash as plaintext_hash, emojis as emojis, sticker_pack_order.pack_order as primary_ordering, 0 as secondary_ordering, hash_of_image_part as hash_of_image_part, mime_type as mime_type, sticker_pack_order.sticker_pack_id as sticker_pack_identifier, 0 as from_third_party_pack_db FROM stickers LEFT JOIN sticker_pack_order ON sticker_pack_order.sticker_pack_id=stickers.sticker_pack_id UNION SELECT plaintext_hash as plaintext_hash, emojis as emojis, sticker_pack_order.pack_order as primary_ordering, 0 as secondary_ordering, hash_of_image_part as hash_of_image_part, 'image/webp' as mime_type, (third_party_sticker_emoji_mapping.authority || ' ' || third_party_sticker_emoji_mapping.sticker_pack_id) as sticker_pack_identifier, 1 as from_third_party_pack_db FROM third_party_sticker_emoji_mapping LEFT JOIN sticker_pack_order ON sticker_pack_order.sticker_pack_id=(third_party_sticker_emoji_mapping.authority || ' ' || third_party_sticker_emoji_mapping.sticker_pack_id) LEFT JOIN third_party_whitelist_packs ON third_party_sticker_emoji_mapping.sticker_pack_id=third_party_whitelist_packs.sticker_pack_id WHERE avoid_cache = 0 ) WHERE emojis LIKE "
            r2.append(r0)
            java.lang.String r0 = "?"
            java.util.List r1 = java.util.Collections.nCopies(r1, r0)
            java.lang.String r0 = " OR emojis LIKE "
            java.lang.String r0 = android.text.TextUtils.join(r0, r1)
            r2.append(r0)
            java.lang.String r0 = " GROUP BY "
            r2.append(r0)
            java.lang.String r11 = "plaintext_hash"
            r2.append(r11)
            java.lang.String r0 = " ORDER BY primary_ordering DESC, secondary_ordering DESC "
            r2.append(r0)
            java.lang.String r0 = " LIMIT 500"
            java.lang.String r12 = X.AnonymousClass000.A0q(r0, r2)
            r3 = 1
            X.005 r0 = r5.A05     // Catch:{ SQLiteDatabaseCorruptException -> 0x01e7 }
            X.1M0 r6 = X.C90484aE.A0W(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01e7 }
            X.14e r10 = r6.A02     // Catch:{ all -> 0x01dd }
            int r9 = r13.size()     // Catch:{ all -> 0x01dd }
            java.lang.String[] r4 = new java.lang.String[r9]     // Catch:{ all -> 0x01dd }
            r2 = 0
        L_0x008b:
            if (r2 >= r9) goto L_0x00a9
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01dd }
            java.lang.String r1 = "%"
            r14.append(r1)     // Catch:{ all -> 0x01dd }
            java.lang.Object r0 = r13.get(r2)     // Catch:{ all -> 0x01dd }
            X.1XQ r0 = (X.AnonymousClass1XQ) r0     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r1, r14)     // Catch:{ all -> 0x01dd }
            r4[r2] = r0     // Catch:{ all -> 0x01dd }
            int r2 = r2 + 1
            goto L_0x008b
        L_0x00a9:
            java.lang.String r0 = "DISTINCT_SYMBOL_FROM_STICKER_SUGGESTION_SEARCH_TAG"
            android.database.Cursor r9 = r10.A09(r12, r0, r4)     // Catch:{ all -> 0x01dd }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01d1 }
            java.lang.String r0 = "Found stickers:"
            r1.append(r0)     // Catch:{ all -> 0x01d1 }
            int r0 = r9.getCount()     // Catch:{ all -> 0x01d1 }
            java.lang.String r0 = X.C36381kD.A10(r1, r0)     // Catch:{ all -> 0x01d1 }
            r8.A02(r0)     // Catch:{ all -> 0x01d1 }
            int r0 = r9.getCount()     // Catch:{ all -> 0x01d1 }
            java.util.HashSet r10 = new java.util.HashSet     // Catch:{ all -> 0x01d1 }
            r10.<init>(r0)     // Catch:{ all -> 0x01d1 }
        L_0x00cc:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x01d1 }
            if (r0 == 0) goto L_0x01b3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01d1 }
            java.lang.String r0 = "Sticker #"
            r1.append(r0)     // Catch:{ all -> 0x01d1 }
            int r0 = r9.getPosition()     // Catch:{ all -> 0x01d1 }
            java.lang.String r0 = X.C36381kD.A10(r1, r0)     // Catch:{ all -> 0x01d1 }
            r8.A02(r0)     // Catch:{ all -> 0x01d1 }
            java.lang.String r2 = X.C36341k9.A0f(r9, r11)     // Catch:{ all -> 0x01d1 }
            java.lang.String r0 = "from_third_party_pack_db"
            int r0 = X.C36351kA.A03(r9, r0)     // Catch:{ all -> 0x01d1 }
            boolean r14 = X.AnonymousClass000.A1P(r0)
            java.lang.String r0 = "sticker_pack_identifier"
            java.lang.String r1 = X.C36341k9.A0f(r9, r0)     // Catch:{ all -> 0x01d1 }
            java.lang.String r0 = "hash_of_image_part"
            java.lang.String r4 = X.C36341k9.A0f(r9, r0)     // Catch:{ all -> 0x01d1 }
            java.lang.String r0 = "mime_type"
            java.lang.String r13 = X.C36341k9.A0f(r9, r0)     // Catch:{ all -> 0x01d1 }
            boolean r0 = r10.contains(r4)     // Catch:{ all -> 0x01d1 }
            if (r0 != 0) goto L_0x00cc
            boolean r0 = X.AnonymousClass14B.A0F(r4)     // Catch:{ all -> 0x01d1 }
            if (r0 != 0) goto L_0x0115
            r10.add(r4)     // Catch:{ all -> 0x01d1 }
        L_0x0115:
            X.6c4 r12 = new X.6c4     // Catch:{ all -> 0x01d1 }
            r12.<init>()     // Catch:{ all -> 0x01d1 }
            r12.A0E = r2     // Catch:{ all -> 0x01d1 }
            r12.A0D = r13     // Catch:{ all -> 0x01d1 }
            java.lang.String r0 = "application/was"
            boolean r0 = r0.equals(r13)     // Catch:{ all -> 0x01d1 }
            r12.A0N = r0     // Catch:{ all -> 0x01d1 }
            X.1Av r0 = r5.A01     // Catch:{ all -> 0x01d1 }
            java.io.File r4 = r0.A04(r2, r13)     // Catch:{ all -> 0x01d1 }
            boolean r0 = r4.exists()     // Catch:{ all -> 0x01d1 }
            if (r0 == 0) goto L_0x014d
            java.lang.String r0 = "Sticker file stored internally"
            r8.A02(r0)     // Catch:{ all -> 0x01d1 }
            java.lang.String r0 = r4.getAbsolutePath()     // Catch:{ all -> 0x01d1 }
            r12.A02(r0, r3)     // Catch:{ all -> 0x01d1 }
            X.1Ap r1 = r5.A03     // Catch:{ all -> 0x01d1 }
            X.3S2 r0 = r1.A02(r4, r13)     // Catch:{ all -> 0x01d1 }
            r12.A04 = r0     // Catch:{ all -> 0x01d1 }
            r1.A04(r12)     // Catch:{ all -> 0x01d1 }
            r7.add(r12)     // Catch:{ all -> 0x01d1 }
            goto L_0x00cc
        L_0x014d:
            java.lang.String r0 = "Sticker file not managed internally"
            r8.A02(r0)     // Catch:{ all -> 0x01d1 }
            if (r14 == 0) goto L_0x00cc
            if (r1 == 0) goto L_0x00cc
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x01d1 }
            if (r0 != 0) goto L_0x00cc
            java.lang.String r0 = " "
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x01d1 }
            if (r0 == 0) goto L_0x00cc
            android.util.Pair r0 = X.AnonymousClass1BM.A00(r1)     // Catch:{ all -> 0x01d1 }
            if (r0 == 0) goto L_0x00cc
            android.util.Pair r12 = X.AnonymousClass1BM.A00(r1)     // Catch:{ all -> 0x01d1 }
            X.C18740tg.A06(r12)     // Catch:{ all -> 0x01d1 }
            X.1BJ r4 = r5.A04     // Catch:{ all -> 0x01d1 }
            java.lang.Object r1 = r12.first     // Catch:{ all -> 0x01d1 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x01d1 }
            java.lang.Object r0 = r12.second     // Catch:{ all -> 0x01d1 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01d1 }
            monitor-enter(r4)     // Catch:{ all -> 0x01d1 }
            java.io.File r0 = X.AnonymousClass1BJ.A00(r4, r1, r0)     // Catch:{ all -> 0x01b0 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x01b0 }
            monitor-exit(r4)     // Catch:{ all -> 0x01d1 }
            if (r0 == 0) goto L_0x01a9
            java.lang.Object r1 = r12.first     // Catch:{ all -> 0x01d1 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x01d1 }
            java.lang.Object r0 = r12.second     // Catch:{ all -> 0x01d1 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01d1 }
            monitor-enter(r4)     // Catch:{ all -> 0x01d1 }
            java.util.List r2 = X.AnonymousClass1BJ.A01(r4, r1, r0, r2)     // Catch:{ all -> 0x01b0 }
            boolean r1 = r2.isEmpty()     // Catch:{ all -> 0x01b0 }
            r0 = 0
            if (r1 != 0) goto L_0x01a1
            java.lang.Object r0 = X.C36391kE.A0t(r2)     // Catch:{ all -> 0x01b0 }
            X.6c4 r0 = (X.C135066c4) r0     // Catch:{ all -> 0x01b0 }
        L_0x01a1:
            monitor-exit(r4)     // Catch:{ all -> 0x01d1 }
            if (r0 == 0) goto L_0x00cc
            r7.add(r0)     // Catch:{ all -> 0x01d1 }
            goto L_0x00cc
        L_0x01a9:
            java.lang.String r0 = "File not in cache, skipping"
            r8.A02(r0)     // Catch:{ all -> 0x01d1 }
            goto L_0x00cc
        L_0x01b0:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01d1 }
            throw r0     // Catch:{ all -> 0x01d1 }
        L_0x01b3:
            r9.close()     // Catch:{ all -> 0x01dd }
            r6.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01e7 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Finished parsing stickers:"
            X.C36341k9.A1N(r0, r1, r7)
            java.lang.String r0 = r1.toString()
            r8.A02(r0)
            r8.A01()
            java.util.ArrayList r0 = X.C36441kJ.A15(r7)
            return r0
        L_0x01d1:
            r1 = move-exception
            if (r9 == 0) goto L_0x01dc
            r9.close()     // Catch:{ all -> 0x01d8 }
            goto L_0x01dc
        L_0x01d8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01dd }
        L_0x01dc:
            throw r1     // Catch:{ all -> 0x01dd }
        L_0x01dd:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x01e2 }
            goto L_0x01e6
        L_0x01e2:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01e7 }
        L_0x01e6:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x01e7 }
        L_0x01e7:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0wN r2 = r5.A00
            java.lang.String r1 = r0.getMessage()
            java.lang.String r0 = "StickerContexualSuggestionStore/fetchMatchingStickersByEmojisFromDb"
            r2.A0E(r0, r1, r3)
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5MG.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Collection collection = (Collection) obj;
        C122815vT r1 = this.A03;
        if (r1.A00 == this) {
            r1.A00 = null;
        }
        if (!C36431kI.A1Y(this)) {
            this.A00.BfJ(collection);
        }
    }
}
