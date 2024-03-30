package X;

import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* renamed from: X.6v8  reason: invalid class name and case insensitive filesystem */
public final class C146156v8 implements C160097kS {
    public final C20050ww A00;
    public final AnonymousClass17Z A01;
    public final AnonymousClass13E A02;
    public final C24261Bt A03;
    public final C23871Ae A04;
    public final AnonymousClass1HC A05;
    public final AnonymousClass66w A06;
    public final C146176vA A07;
    public final C146186vB A08;
    public final C21080yd A09;

    public InputStream BCm(C162167o8 r4, Integer num) {
        AnonymousClass5RE B8D = r4.B8D(this.A00, 0, 35);
        if ("gzip".equals(((C146096v1) r4).A01.getHeaderField("Content-Encoding"))) {
            return new GZIPInputStream(B8D);
        }
        return B8D;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0122, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        X.C05600Qi.A00(r20, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0128, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x012b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x012f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x015b, code lost:
        if (r0 == false) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01d5, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        X.C05600Qi.A00(r22, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01db, code lost:
        throw r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x022f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BJe(java.io.InputStream r28, java.lang.Integer r29, long r30) {
        /*
            r27 = this;
            java.lang.String r14 = ", error: "
            java.lang.String r13 = "mapping_file_parsing_failed"
            java.lang.String r12 = "sticker_mapping_file_download_finished"
            java.lang.String r11 = ", filters: "
            r10 = r27
            X.1Bt r0 = r10.A03
            r26 = r0
            java.lang.String r9 = r26.A01()
            X.66w r0 = r10.A06
            r25 = r0
            java.lang.String r8 = r25.A01()
            X.6vA r0 = r10.A07
            X.1Bt r0 = r0.A00
            X.00T r0 = r0.A01
            r24 = r0
            android.content.SharedPreferences$Editor r1 = X.C36351kA.A0A(r24)
            java.lang.String r0 = "pref_avatar_sticker_search_dictionary_filters"
            X.C36341k9.A0x(r1, r0, r8)
            java.lang.String r2 = r25.A00()
            android.content.SharedPreferences$Editor r1 = X.C36351kA.A0A(r24)
            java.lang.String r0 = "pref_avatar_sticker_search_dictionary_country_code"
            X.C36341k9.A0x(r1, r0, r2)
            r23 = 0
            r7 = 0
            r3 = r30
            android.util.JsonReader r22 = X.C90474aD.A0K(r28)     // Catch:{ IOException -> 0x0205, IllegalStateException -> 0x01dc }
            r22.beginObject()     // Catch:{ all -> 0x01d3 }
            r21 = 1
        L_0x0046:
            boolean r0 = r22.hasNext()     // Catch:{ all -> 0x01d3 }
            if (r0 == 0) goto L_0x018c
            java.lang.String r2 = r22.nextName()     // Catch:{ all -> 0x01d3 }
            java.lang.String r0 = "revision"
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)     // Catch:{ all -> 0x01d3 }
            if (r0 == 0) goto L_0x006b
            java.lang.String r2 = r22.nextString()     // Catch:{ all -> 0x01d3 }
            X.C36361kB.A1I(r2)     // Catch:{ all -> 0x01d3 }
            android.content.SharedPreferences$Editor r1 = X.C36351kA.A0A(r24)     // Catch:{ all -> 0x01d3 }
            java.lang.String r0 = "pref_avatar_sticker_search_dictionary_revision"
            X.C36341k9.A0x(r1, r0, r2)     // Catch:{ all -> 0x01d3 }
            r23 = 1
            goto L_0x0046
        L_0x006b:
            java.lang.String r0 = "languages"
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)     // Catch:{ all -> 0x01d3 }
            if (r0 == 0) goto L_0x0162
            X.6vB r0 = r10.A08     // Catch:{ all -> 0x01d3 }
            X.5r1 r7 = r0.A00     // Catch:{ all -> 0x01d3 }
            X.005 r0 = r7.A01     // Catch:{ all -> 0x0130 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0130 }
            X.54e r0 = (X.C1031554e) r0     // Catch:{ all -> 0x0130 }
            X.1M0 r6 = r0.A04()     // Catch:{ all -> 0x0130 }
            X.71s r20 = r6.B1k()     // Catch:{ all -> 0x0129 }
            X.14e r5 = r6.A02     // Catch:{ all -> 0x0120 }
            X.AnonymousClass00C.A08(r5)     // Catch:{ all -> 0x0120 }
            java.lang.String r2 = "avatar_sticker_search_dictionary"
            r1 = 0
            java.lang.String r0 = "AvatarStickerSearchDictionaryTable/clearAll/DELETE_AVATAR_STICKER_SEARCH_TAG"
            r5.A03(r2, r1, r0, r1)     // Catch:{ all -> 0x0120 }
            r22.beginObject()     // Catch:{ all -> 0x0120 }
        L_0x0097:
            boolean r0 = r22.hasNext()     // Catch:{ all -> 0x0120 }
            if (r0 == 0) goto L_0x0112
            r22.nextName()     // Catch:{ all -> 0x0120 }
            r22.beginObject()     // Catch:{ all -> 0x0120 }
        L_0x00a3:
            boolean r0 = r22.hasNext()     // Catch:{ all -> 0x0120 }
            if (r0 == 0) goto L_0x010e
            java.lang.String r19 = r22.nextName()     // Catch:{ all -> 0x0120 }
            r22.beginObject()     // Catch:{ all -> 0x0120 }
            java.util.LinkedHashSet r0 = X.C36441kJ.A17()     // Catch:{ all -> 0x0120 }
            r22.nextName()     // Catch:{ all -> 0x0120 }
            r22.beginArray()     // Catch:{ all -> 0x0120 }
        L_0x00ba:
            boolean r1 = r22.hasNext()     // Catch:{ all -> 0x0120 }
            if (r1 == 0) goto L_0x00cf
            java.lang.String r1 = r22.nextString()     // Catch:{ all -> 0x0120 }
            java.lang.String r1 = X.AnonymousClass14B.A06(r1)     // Catch:{ all -> 0x0120 }
            X.AnonymousClass00C.A08(r1)     // Catch:{ all -> 0x0120 }
            r0.add(r1)     // Catch:{ all -> 0x0120 }
            goto L_0x00ba
        L_0x00cf:
            r22.endArray()     // Catch:{ all -> 0x0120 }
            r22.nextName()     // Catch:{ all -> 0x0120 }
            int r18 = r22.nextInt()     // Catch:{ all -> 0x0120 }
            r22.endObject()     // Catch:{ all -> 0x0120 }
            X.AnonymousClass00C.A0B(r19)     // Catch:{ all -> 0x0120 }
            java.util.Iterator r17 = r0.iterator()     // Catch:{ all -> 0x0120 }
        L_0x00e3:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x0120 }
            if (r0 == 0) goto L_0x00a3
            java.lang.String r16 = X.AnonymousClass001.A0C(r17)     // Catch:{ all -> 0x0120 }
            android.content.ContentValues r1 = X.C36441kJ.A0E()     // Catch:{ all -> 0x0120 }
            java.lang.String r15 = "sticker_id"
            r0 = r19
            r1.put(r15, r0)     // Catch:{ all -> 0x0120 }
            java.lang.String r15 = "tag"
            r0 = r16
            r1.put(r15, r0)     // Catch:{ all -> 0x0120 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r18)     // Catch:{ all -> 0x0120 }
            java.lang.String r0 = "weight"
            r1.put(r0, r15)     // Catch:{ all -> 0x0120 }
            java.lang.String r0 = "insertAvatarStickerTags/REPLACE_AVATAR_STICKER_SEARCH_TAG"
            r5.A06(r2, r0, r1)     // Catch:{ all -> 0x0120 }
            goto L_0x00e3
        L_0x010e:
            r22.endObject()     // Catch:{ all -> 0x0120 }
            goto L_0x0097
        L_0x0112:
            r22.endObject()     // Catch:{ all -> 0x0120 }
            r20.A00()     // Catch:{ all -> 0x0120 }
            r0 = 1
            r20.close()     // Catch:{ all -> 0x0129 }
            r6.close()     // Catch:{ all -> 0x0130 }
            goto L_0x0157
        L_0x0120:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0122 }
        L_0x0122:
            r1 = move-exception
            r0 = r20
            X.C05600Qi.A00(r0, r2)     // Catch:{ all -> 0x0129 }
            throw r1     // Catch:{ all -> 0x0129 }
        L_0x0129:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x012b }
        L_0x012b:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)     // Catch:{ all -> 0x0130 }
            throw r0     // Catch:{ all -> 0x0130 }
        L_0x0130:
            r0 = move-exception
            X.03N r0 = X.C90524aI.A0t(r0)     // Catch:{ all -> 0x01d3 }
            java.lang.Throwable r2 = r0.exception     // Catch:{ all -> 0x01d3 }
            if (r2 == 0) goto L_0x0156
            X.005 r0 = r7.A00     // Catch:{ all -> 0x01d3 }
            java.lang.Object r6 = r0.get()     // Catch:{ all -> 0x01d3 }
            X.1Ae r6 = (X.C23871Ae) r6     // Catch:{ all -> 0x01d3 }
            r5 = 3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01d3 }
            java.lang.String r0 = "error: "
            java.lang.String r1 = X.C36331k8.A0i(r0, r1, r2)     // Catch:{ all -> 0x01d3 }
            java.lang.String r0 = "write_sticker_tags_to_database_failed"
            r6.A02(r5, r0, r1)     // Catch:{ all -> 0x01d3 }
            java.lang.String r0 = "AvatarStickerSearchDictionaryStore/populatedb/failed"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x01d3 }
        L_0x0156:
            r0 = 0
        L_0x0157:
            if (r21 == 0) goto L_0x015d
            r21 = 1
            if (r0 != 0) goto L_0x015f
        L_0x015d:
            r21 = 0
        L_0x015f:
            r7 = 1
            goto L_0x0046
        L_0x0162:
            X.1Ae r6 = r10.A04     // Catch:{ all -> 0x01d3 }
            java.lang.String r5 = "mapping_file_unexpected_field"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01d3 }
            java.lang.String r0 = "found unexpected field: '"
            r1.append(r0)     // Catch:{ all -> 0x01d3 }
            r1.append(r2)     // Catch:{ all -> 0x01d3 }
            java.lang.String r0 = "' (rev: "
            X.C36321k7.A1O(r0, r9, r11, r8, r1)     // Catch:{ all -> 0x01d3 }
            r0 = 41
            java.lang.String r1 = X.AnonymousClass000.A0t(r1, r0)     // Catch:{ all -> 0x01d3 }
            r0 = 3
            r6.A02(r0, r5, r1)     // Catch:{ all -> 0x01d3 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01d3 }
            java.lang.String r0 = "AvatarStickerSearchDictionaryNetworkClient/handle-network-response/unhandled field: "
            X.C36321k7.A1P(r0, r2, r1)     // Catch:{ all -> 0x01d3 }
            goto L_0x0046
        L_0x018c:
            r22.endObject()     // Catch:{ all -> 0x01d3 }
            java.lang.String r5 = "mapping_file_missing_field"
            if (r23 != 0) goto L_0x01a8
            X.1Ae r2 = r10.A04     // Catch:{ all -> 0x01d3 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01d3 }
            java.lang.String r0 = "mapping file is missing 'revision' field (rev: "
            X.C36321k7.A1O(r0, r9, r11, r8, r1)     // Catch:{ all -> 0x01d3 }
            r0 = 41
            java.lang.String r1 = X.AnonymousClass000.A0t(r1, r0)     // Catch:{ all -> 0x01d3 }
            r0 = 3
            r2.A02(r0, r5, r1)     // Catch:{ all -> 0x01d3 }
        L_0x01a8:
            if (r7 != 0) goto L_0x01bf
            X.1Ae r2 = r10.A04     // Catch:{ all -> 0x01d3 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01d3 }
            java.lang.String r0 = "mapping file is missing 'languages' field (rev: "
            X.C36321k7.A1O(r0, r9, r11, r8, r1)     // Catch:{ all -> 0x01d3 }
            r0 = 41
            java.lang.String r1 = X.AnonymousClass000.A0t(r1, r0)     // Catch:{ all -> 0x01d3 }
            r0 = 3
            r2.A02(r0, r5, r1)     // Catch:{ all -> 0x01d3 }
        L_0x01bf:
            r22.close()     // Catch:{ IOException -> 0x0205, IllegalStateException -> 0x01dc }
            if (r29 == 0) goto L_0x01d2
            int r2 = r29.intValue()
            X.1HC r1 = r10.A05
            X.5Ib r0 = X.C106025Ib.A00
            r1.A04(r0, r2, r3)
            r1.A01(r2, r12)
        L_0x01d2:
            return r21
        L_0x01d3:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x01d5 }
        L_0x01d5:
            r1 = move-exception
            r0 = r22
            X.C05600Qi.A00(r0, r2)     // Catch:{ IOException -> 0x0205, IllegalStateException -> 0x01dc }
            throw r1     // Catch:{ IOException -> 0x0205, IllegalStateException -> 0x01dc }
        L_0x01dc:
            r7 = move-exception
            java.lang.String r0 = "AvatarStickerSearchDictionaryNetworkClient/handle-network-response/parsing failed"
            com.whatsapp.util.Log.e(r0, r7)     // Catch:{ all -> 0x023f }
            java.lang.String r6 = r26.A01()     // Catch:{ all -> 0x023f }
            java.lang.String r5 = r25.A01()     // Catch:{ all -> 0x023f }
            X.1Ae r2 = r10.A04     // Catch:{ all -> 0x023f }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x023f }
            java.lang.String r0 = "illegal state exception while parsing (rev: "
            X.C36321k7.A1O(r0, r6, r11, r5, r1)     // Catch:{ all -> 0x023f }
            r1.append(r14)     // Catch:{ all -> 0x023f }
            java.lang.String r0 = r7.getMessage()     // Catch:{ all -> 0x023f }
            java.lang.String r1 = X.C36321k7.A0E(r0, r1)     // Catch:{ all -> 0x023f }
            r0 = 3
            r2.A02(r0, r13, r1)     // Catch:{ all -> 0x023f }
            goto L_0x022d
        L_0x0205:
            r7 = move-exception
            java.lang.String r0 = "AvatarStickerSearchDictionaryNetworkClient/handle-network-response/failed"
            com.whatsapp.util.Log.e(r0, r7)     // Catch:{ all -> 0x023f }
            java.lang.String r6 = r26.A01()     // Catch:{ all -> 0x023f }
            java.lang.String r5 = r25.A01()     // Catch:{ all -> 0x023f }
            X.1Ae r2 = r10.A04     // Catch:{ all -> 0x023f }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x023f }
            java.lang.String r0 = "unable to parse mapping file (rev: "
            X.C36321k7.A1O(r0, r6, r11, r5, r1)     // Catch:{ all -> 0x023f }
            r1.append(r14)     // Catch:{ all -> 0x023f }
            java.lang.String r0 = r7.getMessage()     // Catch:{ all -> 0x023f }
            java.lang.String r1 = X.C36321k7.A0E(r0, r1)     // Catch:{ all -> 0x023f }
            r0 = 3
            r2.A02(r0, r13, r1)     // Catch:{ all -> 0x023f }
        L_0x022d:
            if (r29 == 0) goto L_0x023d
            int r2 = r29.intValue()
            X.1HC r1 = r10.A05
            X.5Ib r0 = X.C106025Ib.A00
            r1.A04(r0, r2, r3)
            r1.A01(r2, r12)
        L_0x023d:
            r0 = 0
            return r0
        L_0x023f:
            r5 = move-exception
            if (r29 == 0) goto L_0x0250
            int r2 = r29.intValue()
            X.1HC r1 = r10.A05
            X.5Ib r0 = X.C106025Ib.A00
            r1.A04(r0, r2, r3)
            r1.A01(r2, r12)
        L_0x0250:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146156v8.BJe(java.io.InputStream, java.lang.Integer, long):boolean");
    }

    public C146156v8(C20050ww r1, AnonymousClass17Z r2, AnonymousClass13E r3, C24261Bt r4, C23871Ae r5, AnonymousClass1HC r6, AnonymousClass66w r7, C146176vA r8, C146186vB r9, C21080yd r10) {
        C36321k7.A1B(r1, r5, r3, r10, r6);
        C36321k7.A13(r4, r2, r9);
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
        this.A09 = r10;
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = r2;
        this.A08 = r9;
        this.A07 = r8;
        this.A06 = r7;
    }

    public C146096v1 B3S(String str, String str2) {
        String str3;
        C36321k7.A1Q("AvatarStickerSearchDictionaryNetworkClient/connect/language=", str2, AnonymousClass000.A0u());
        AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
        AnonymousClass66w r3 = this.A06;
        String A012 = r3.A01.A01();
        String A013 = r3.A01();
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AvatarStickerSearchDictionaryNetworkEndpoint/getEndpoint/revision=");
        A0u.append(A012);
        C36321k7.A1Q(", filters=", A013, A0u);
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("https://static.whatsapp.net/wa/static/avatar?cat=avatar_sticker_search");
        A0u2.append("&lgs=");
        A0u2.append(str2);
        if (A012 != null) {
            A0u2.append("&rev=");
            A0u2.append(A012);
        }
        A0u2.append("&filter=");
        A0u2.append(A013);
        if (r3.A00.A0E(4501)) {
            if (r3.A00().length() > 0) {
                StringBuilder A0u3 = AnonymousClass000.A0u();
                A0u3.append("&country=");
                str3 = AnonymousClass000.A0q(r3.A00(), A0u3);
                AnonymousClass00C.A08(str3);
            } else {
                str3 = "";
            }
            A0u2.append(str3);
        }
        return this.A02.A02(this.A09, C36381kD.A0y(A0u2), str);
    }
}
