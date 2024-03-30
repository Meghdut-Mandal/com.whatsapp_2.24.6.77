package X;

import android.content.SharedPreferences;
import java.util.AbstractCollection;

/* renamed from: X.3gT  reason: invalid class name and case insensitive filesystem */
public class C71253gT implements C30631aW {
    public final C24031Au A00;
    public final C63513Ki A01;
    public final AnonymousClass005 A02;

    public static SharedPreferences.Editor A00(SharedPreferences.Editor editor, String str, String str2, String str3) {
        return editor.putInt(str, 0).putInt(str2, 0).putInt(str3, 0);
    }

    public static Long A01(SharedPreferences sharedPreferences, String str, AbstractCollection abstractCollection) {
        Long valueOf = Long.valueOf((long) sharedPreferences.getInt(str, 0));
        abstractCollection.add(valueOf);
        return valueOf;
    }

    public /* synthetic */ void BV3() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x022c, code lost:
        r0 = ((X.C146796wB) r1).A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BV2() {
        /*
            r32 = this;
            r31 = r32
            r0 = r31
            X.3Ki r4 = r0.A01
            X.3GT r0 = r4.A03
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x006d
            X.2QT r8 = new X.2QT
            r8.<init>()
            X.0v0 r0 = r4.A01
            X.005 r7 = r0.A00
            android.content.SharedPreferences r0 = X.C36391kE.A0H(r7)
            java.lang.String r6 = "sticker_suggestion_triggered_count"
            r1 = 0
            int r0 = r0.getInt(r6, r1)
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r8.A02 = r0
            android.content.SharedPreferences r0 = X.C36391kE.A0H(r7)
            java.lang.String r5 = "sticker_suggestion_icon_clicked_count"
            int r0 = r0.getInt(r5, r1)
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r8.A00 = r0
            android.content.SharedPreferences r0 = X.C36391kE.A0H(r7)
            java.lang.String r3 = "sticker_suggestion_sticker_sent_count"
            int r0 = r0.getInt(r3, r1)
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r8.A01 = r0
            android.content.SharedPreferences r0 = X.C36391kE.A0H(r7)
            java.lang.String r2 = "sticker_suggestion_num_suggestions_array"
            java.lang.String r1 = "[]"
            java.lang.String r0 = r0.getString(r2, r1)
            r8.A03 = r0
            X.0yW r0 = r4.A02
            r0.Bly(r8)
            android.content.SharedPreferences r0 = X.C36391kE.A0H(r7)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = A00(r0, r6, r5, r3)
            X.C36341k9.A0x(r0, r2, r1)
            r0 = 0
            r4.A00 = r0
        L_0x006d:
            r0 = r31
            X.1Au r0 = r0.A00
            r30 = r0
            java.util.ArrayList r29 = X.AnonymousClass001.A0I()
            X.1At r13 = r0.A01
            android.content.SharedPreferences r2 = X.C24021At.A00(r13)
            java.lang.String r28 = "sticker_send_count"
            r1 = r28
            r0 = r29
            java.lang.Long r27 = A01(r2, r1, r0)
            android.content.SharedPreferences r2 = X.C24021At.A00(r13)
            java.lang.String r26 = "sticker_send_from_recent_count"
            r1 = r26
            java.lang.Long r25 = A01(r2, r1, r0)
            android.content.SharedPreferences r2 = X.C24021At.A00(r13)
            java.lang.String r24 = "sticker_send_from_favorites_count"
            r1 = r24
            java.lang.Long r23 = A01(r2, r1, r0)
            android.content.SharedPreferences r2 = X.C24021At.A00(r13)
            java.lang.String r22 = "sticker_send_from_pack_count"
            r1 = r0
            r0 = r22
            java.lang.Long r21 = A01(r2, r0, r1)
            android.content.SharedPreferences r1 = X.C24021At.A00(r13)
            java.lang.String r11 = "sticker_send_from_emotion_count"
            r0 = r29
            java.lang.Long r20 = A01(r1, r11, r0)
            android.content.SharedPreferences r1 = X.C24021At.A00(r13)
            java.lang.String r10 = "sticker_send_from_search_count"
            java.lang.Long r19 = A01(r1, r10, r0)
            android.content.SharedPreferences r1 = X.C24021At.A00(r13)
            java.lang.String r9 = "sticker_send_from_forward_count"
            java.lang.Long r18 = A01(r1, r9, r0)
            android.content.SharedPreferences r1 = X.C24021At.A00(r13)
            java.lang.String r8 = "sticker_send_first_party_count"
            java.lang.Long r17 = A01(r1, r8, r0)
            android.content.SharedPreferences r1 = X.C24021At.A00(r13)
            java.lang.String r7 = "sticker_send_animated_count"
            java.lang.Long r16 = A01(r1, r7, r0)
            java.lang.Object r1 = r13.A03
            monitor-enter(r1)
            android.content.SharedPreferences r0 = X.C24021At.A00(r13)     // Catch:{ all -> 0x037c }
            java.lang.String r6 = "sticker_picker_opened_count"
            int r0 = X.C36371kC.A01(r0, r6)     // Catch:{ all -> 0x037c }
            monitor-exit(r1)     // Catch:{ all -> 0x037c }
            java.lang.Long r15 = X.C36441kJ.A0y(r0)
            r0 = r29
            r0.add(r15)
            monitor-enter(r1)
            android.content.SharedPreferences r0 = X.C24021At.A00(r13)     // Catch:{ all -> 0x0379 }
            java.lang.String r5 = "sticker_search_opened_count"
            int r0 = X.C36371kC.A01(r0, r5)     // Catch:{ all -> 0x0379 }
            monitor-exit(r1)     // Catch:{ all -> 0x0379 }
            java.lang.Long r14 = X.C36441kJ.A0y(r0)
            r0 = r29
            r0.add(r14)
            java.lang.Object r1 = r13.A01
            monitor-enter(r1)
            android.content.SharedPreferences r0 = X.C24021At.A00(r13)     // Catch:{ all -> 0x0376 }
            java.lang.String r4 = "sticker_add_to_favorites_count"
            int r0 = X.C36371kC.A01(r0, r4)     // Catch:{ all -> 0x0376 }
            monitor-exit(r1)     // Catch:{ all -> 0x0376 }
            java.lang.Long r12 = X.C36441kJ.A0y(r0)
            r0 = r29
            r0.add(r12)
            java.lang.Object r1 = r13.A02
            monitor-enter(r1)
            android.content.SharedPreferences r0 = X.C24021At.A00(r13)     // Catch:{ all -> 0x0373 }
            java.lang.String r3 = "sticker_pack_delete_count"
            int r0 = X.C36371kC.A01(r0, r3)     // Catch:{ all -> 0x0373 }
            monitor-exit(r1)     // Catch:{ all -> 0x0373 }
            java.lang.Long r2 = X.C36441kJ.A0y(r0)
            r0 = r29
            r0.add(r2)
            X.2Sg r1 = new X.2Sg
            r1.<init>()
            r0 = r27
            r1.A04 = r0
            r0 = r25
            r1.A0B = r0
            r0 = r23
            r1.A09 = r0
            r0 = r21
            r1.A0A = r0
            r0 = r20
            r1.A08 = r0
            r0 = r19
            r1.A0C = r0
            r0 = r18
            r1.A05 = r0
            r0 = r17
            r1.A07 = r0
            r0 = r16
            r1.A06 = r0
            r1.A02 = r15
            r1.A03 = r14
            r1.A00 = r12
            r1.A01 = r2
            java.util.Iterator r2 = r29.iterator()
        L_0x016f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01b2
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x016f
            long r16 = r0.longValue()
            r14 = 0
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x016f
            r0 = r30
            X.0yW r0 = r0.A00
            r0.Bly(r1)
            android.content.SharedPreferences r0 = X.C24021At.A00(r13)
            android.content.SharedPreferences$Editor r13 = r0.edit()
            r12 = 0
            r2 = r28
            r1 = r26
            r0 = r24
            android.content.SharedPreferences$Editor r1 = A00(r13, r2, r1, r0)
            r0 = r22
            android.content.SharedPreferences$Editor r0 = A00(r1, r0, r11, r10)
            android.content.SharedPreferences$Editor r0 = A00(r0, r9, r8, r7)
            android.content.SharedPreferences$Editor r0 = A00(r0, r6, r5, r4)
            X.C36341k9.A0v(r0, r3, r12)
        L_0x01b2:
            r0 = r31
            X.005 r0 = r0.A02
            java.lang.Object r3 = r0.get()
            X.39W r3 = (X.AnonymousClass39W) r3
            java.lang.String r0 = "cleanUpOrphanInternalStickerFiles"
            X.14g r6 = new X.14g
            r6.<init>((java.lang.String) r0)
            r6.A03()
            X.2RU r2 = new X.2RU
            r2.<init>()
            java.util.HashMap r4 = X.AnonymousClass001.A0J()
            X.005 r0 = r3.A03
            java.lang.Object r0 = r0.get()
            X.16q r0 = (X.C229616q) r0
            X.1M0 r8 = r0.get()
            X.14e r7 = r8.A02     // Catch:{ all -> 0x0369 }
            java.lang.String r5 = "SELECT plaintext_hash, mime_type FROM ( SELECT plain_file_hash as plaintext_hash, mime_type as mime_type FROM stickers UNION SELECT plaintext_hash as plaintext_hash, mimetype as mime_type FROM recent_stickers UNION SELECT plaintext_hash as plaintext_hash, mimetype as mime_type FROM starred_stickers )"
            r1 = 0
            java.lang.String r0 = "STICKER_REFERENCE_ALL_INTERNAL_STICKER_HASHES"
            android.database.Cursor r9 = r7.A09(r5, r0, r1)     // Catch:{ all -> 0x0369 }
            java.lang.String r0 = "plaintext_hash"
            int r7 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x035d }
            java.lang.String r0 = "mime_type"
            int r5 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x035d }
        L_0x01f2:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x035d }
            if (r0 == 0) goto L_0x020c
            java.lang.String r1 = r9.getString(r7)     // Catch:{ all -> 0x035d }
            java.lang.String r0 = r9.getString(r5)     // Catch:{ all -> 0x035d }
            if (r1 == 0) goto L_0x0206
            r4.put(r1, r0)     // Catch:{ all -> 0x035d }
            goto L_0x01f2
        L_0x0206:
            java.lang.String r0 = "InternalStickerFileReferenceManager/getAllInternalStickerPlainTextHashes/a sticker plaintextHash is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x035d }
            goto L_0x01f2
        L_0x020c:
            r9.close()     // Catch:{ all -> 0x0369 }
            r8.close()
            X.5Aq r0 = r3.A02
            java.util.ArrayList r0 = r0.A04()
            java.util.Iterator r5 = r0.iterator()
        L_0x021c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x023a
            java.lang.Object r1 = r5.next()
            X.7mX r1 = (X.C161307mX) r1
            boolean r0 = r1 instanceof X.C146796wB
            if (r0 == 0) goto L_0x021c
            X.6wB r1 = (X.C146796wB) r1
            X.6c4 r0 = r1.A00
            java.lang.String r1 = r0.A0E
            if (r1 == 0) goto L_0x021c
            java.lang.String r0 = r0.A0D
            r4.put(r1, r0)
            goto L_0x021c
        L_0x023a:
            long r0 = r6.A00()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A04 = r0
            java.lang.String r0 = "finished db query"
            r6.A02(r0)
            X.1Av r15 = r3.A00     // Catch:{ Exception -> 0x0345 }
            X.0y0 r0 = r15.A00     // Catch:{ Exception -> 0x0345 }
            java.io.File r14 = r0.A0G()     // Catch:{ Exception -> 0x0345 }
            X.C18740tg.A06(r14)     // Catch:{ Exception -> 0x0345 }
            boolean r0 = r14.exists()     // Catch:{ Exception -> 0x0345 }
            if (r0 == 0) goto L_0x035c
            int r0 = r4.size()     // Catch:{ Exception -> 0x0345 }
            java.util.HashSet r13 = new java.util.HashSet     // Catch:{ Exception -> 0x0345 }
            r13.<init>(r0)     // Catch:{ Exception -> 0x0345 }
            java.util.Iterator r8 = X.C36371kC.A10(r4)     // Catch:{ Exception -> 0x0345 }
        L_0x0267:
            boolean r0 = r8.hasNext()     // Catch:{ Exception -> 0x0345 }
            if (r0 == 0) goto L_0x029e
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r8)     // Catch:{ Exception -> 0x0345 }
            java.lang.Object r7 = r0.getKey()     // Catch:{ Exception -> 0x0345 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0345 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ Exception -> 0x0345 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0345 }
            java.lang.String r0 = "application/was"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0345 }
            if (r0 == 0) goto L_0x029b
            java.lang.String r5 = ".was"
        L_0x0287:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0345 }
            r1 = 47
            r0 = 45
            java.lang.String r0 = r7.replace(r1, r0)     // Catch:{ Exception -> 0x0345 }
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r5, r4)     // Catch:{ Exception -> 0x0345 }
            r13.add(r0)     // Catch:{ Exception -> 0x0345 }
            goto L_0x0267
        L_0x029b:
            java.lang.String r5 = ".webp"
            goto L_0x0287
        L_0x029e:
            java.lang.String[] r12 = r14.list()     // Catch:{ Exception -> 0x0345 }
            X.C18740tg.A06(r12)     // Catch:{ Exception -> 0x0345 }
            java.lang.String r0 = "finished string conversion"
            r6.A02(r0)     // Catch:{ Exception -> 0x0345 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0345 }
            java.lang.String r0 = "cleanUpOrphanInternalStickerFiles/total file count: "
            r1.append(r0)     // Catch:{ Exception -> 0x0345 }
            int r11 = r12.length     // Catch:{ Exception -> 0x0345 }
            X.C36321k7.A1Y(r1, r11)     // Catch:{ Exception -> 0x0345 }
            r19 = 0
            long r17 = r6.A00()     // Catch:{ Exception -> 0x0345 }
            r10 = 0
            r4 = 0
        L_0x02bf:
            if (r10 >= r11) goto L_0x0314
            r1 = r12[r10]     // Catch:{ Exception -> 0x0345 }
            java.lang.String r0 = ".png"
            boolean r0 = r1.endsWith(r0)     // Catch:{ Exception -> 0x0345 }
            if (r0 != 0) goto L_0x0307
            boolean r0 = r13.contains(r1)     // Catch:{ Exception -> 0x0345 }
            if (r0 != 0) goto L_0x0307
            java.io.File r5 = X.C36441kJ.A0w(r14, r1)     // Catch:{ Exception -> 0x0345 }
            boolean r0 = r5.exists()     // Catch:{ Exception -> 0x0345 }
            if (r0 == 0) goto L_0x0307
            int r4 = r4 + 1
            long r0 = r5.length()     // Catch:{ Exception -> 0x0345 }
            long r19 = r19 + r0
            X.AnonymousClass6YY.A0P(r5)     // Catch:{ Exception -> 0x0345 }
            X.1Ay r0 = r15.A02     // Catch:{ Exception -> 0x0345 }
            java.lang.String r16 = r5.getAbsolutePath()     // Catch:{ Exception -> 0x0345 }
            X.12P r0 = r0.A00     // Catch:{ Exception -> 0x0345 }
            X.1M0 r9 = r0.A05()     // Catch:{ Exception -> 0x0345 }
            X.14e r8 = r9.A02     // Catch:{ all -> 0x030a }
            java.lang.String r7 = "media_refs"
            java.lang.String r5 = "path = ?"
            java.lang.String[] r1 = X.C36441kJ.A1R()     // Catch:{ all -> 0x030a }
            r0 = 0
            r1[r0] = r16     // Catch:{ all -> 0x030a }
            java.lang.String r0 = "DELETE_MEDIA_REF_SQL"
            r8.A03(r7, r5, r0, r1)     // Catch:{ all -> 0x030a }
            r9.close()     // Catch:{ Exception -> 0x0345 }
        L_0x0307:
            int r10 = r10 + 1
            goto L_0x02bf
        L_0x030a:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x030f }
            goto L_0x0313
        L_0x030f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0345 }
        L_0x0313:
            throw r1     // Catch:{ Exception -> 0x0345 }
        L_0x0314:
            long r0 = r6.A00()     // Catch:{ Exception -> 0x0345 }
            long r0 = r0 - r17
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0345 }
            r2.A03 = r0     // Catch:{ Exception -> 0x0345 }
            java.lang.Long r0 = X.C36441kJ.A0y(r4)     // Catch:{ Exception -> 0x0345 }
            r2.A01 = r0     // Catch:{ Exception -> 0x0345 }
            r0 = 1024(0x400, double:5.06E-321)
            long r19 = r19 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r19)     // Catch:{ Exception -> 0x0345 }
            r2.A02 = r0     // Catch:{ Exception -> 0x0345 }
            java.lang.Integer r0 = X.C36361kB.A0i()     // Catch:{ Exception -> 0x0345 }
            r2.A00 = r0     // Catch:{ Exception -> 0x0345 }
            java.lang.String r0 = "finished orphan file deletion"
            r6.A02(r0)     // Catch:{ Exception -> 0x0345 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0345 }
            java.lang.String r0 = "cleanUpOrphanInternalStickerFiles/total orphan file count: "
            X.C36321k7.A1T(r0, r1, r4)     // Catch:{ Exception -> 0x0345 }
            goto L_0x0357
        L_0x0345:
            r1 = move-exception
            java.lang.String r0 = "InternalStickerFileReferenceManager/cleanUpOrphanInternalStickerFiles/exception"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.Integer r0 = X.C36361kB.A0j()
            r2.A00 = r0
            java.lang.String r0 = r1.getMessage()
            r2.A05 = r0
        L_0x0357:
            X.0yW r0 = r3.A01
            r0.Bly(r2)
        L_0x035c:
            return
        L_0x035d:
            r1 = move-exception
            if (r9 == 0) goto L_0x0368
            r9.close()     // Catch:{ all -> 0x0364 }
            goto L_0x0368
        L_0x0364:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0369 }
        L_0x0368:
            throw r1     // Catch:{ all -> 0x0369 }
        L_0x0369:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x036e }
            throw r1
        L_0x036e:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0373:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0373 }
            throw r0
        L_0x0376:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0376 }
            throw r0
        L_0x0379:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0379 }
            throw r0
        L_0x037c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x037c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71253gT.BV2():void");
    }

    public C71253gT(C24031Au r1, C63513Ki r2, AnonymousClass005 r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
