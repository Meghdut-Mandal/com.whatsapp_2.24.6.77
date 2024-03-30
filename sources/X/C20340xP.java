package X;

import android.content.ContentValues;
import com.whatsapp.jid.UserJid;

/* renamed from: X.0xP  reason: invalid class name and case insensitive filesystem */
public class C20340xP implements AnonymousClass00M {
    public final C19700wN A00;
    public final AnonymousClass1FA A01;
    public final C25081Ex A02;
    public final AnonymousClass163 A03;
    public final AnonymousClass1F8 A04;
    public final AnonymousClass1F3 A05;
    public final C219712j A06;
    public final AnonymousClass1F0 A07;
    public final AnonymousClass1DG A08;
    public final C25091Ey A09;
    public final AnonymousClass176 A0A;
    public final AnonymousClass12P A0B;
    public final C25061Ev A0C;
    public final AnonymousClass1F9 A0D;
    public final C24881Ed A0E;
    public final C25101Ez A0F;
    public final AnonymousClass1F1 A0G;
    public final C24921Eh A0H;
    public final C25071Ew A0I;
    public final AnonymousClass1F2 A0J;
    public final AnonymousClass17E A0K;
    public final AnonymousClass179 A0L;
    public final AnonymousClass178 A0M;
    public final C219612i A0N;
    public final C24931Ei A0O;

    /* JADX WARNING: Code restructure failed: missing block: B:201:0x051b, code lost:
        if (r3 != 2) goto L_0x051d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x064e, code lost:
        if (r6 == 0) goto L_0x0650;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x06f5, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x06f9, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x07d3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x07d4, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x07d7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x07e7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x07e8, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x07eb, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:75:0x0260, B:279:0x06e3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C20340xP r25, X.AnonymousClass3T1 r26, boolean r27) {
        /*
            r1 = r26
            X.3T1 r0 = r1.A0S()
            boolean r2 = r0 instanceof X.AnonymousClass2bL
            r5 = r25
            if (r2 == 0) goto L_0x00ce
            X.1F0 r10 = r5.A07
            r9 = r0
            X.2bL r9 = (X.AnonymousClass2bL) r9
            long r3 = r1.A1N
            int r6 = r9.A0H()
            r13 = 0
            r8 = 1
            r2 = 2
            r7 = 0
            if (r6 != r2) goto L_0x001e
            r7 = 1
        L_0x001e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = "LocationMessageStore/insertOrUpdateQuotedLocationMessage/message in main storage; key="
            r6.append(r2)
            X.3Qa r2 = r9.A1J
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            X.C18740tg.A0E(r7, r2)
            X.12P r2 = r10.A01
            X.1M0 r2 = r2.A05()
            android.content.ContentValues r15 = new android.content.ContentValues     // Catch:{ all -> 0x07e2 }
            r15.<init>()     // Catch:{ all -> 0x07e2 }
            java.lang.Long r7 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteConstraintException -> 0x00ac }
            java.lang.String r6 = "message_row_id"
            r15.put(r6, r7)     // Catch:{ SQLiteConstraintException -> 0x00ac }
            double r6 = r9.A00     // Catch:{ SQLiteConstraintException -> 0x00ac }
            java.lang.Double r7 = java.lang.Double.valueOf(r6)     // Catch:{ SQLiteConstraintException -> 0x00ac }
            java.lang.String r6 = "latitude"
            r15.put(r6, r7)     // Catch:{ SQLiteConstraintException -> 0x00ac }
            double r6 = r9.A01     // Catch:{ SQLiteConstraintException -> 0x00ac }
            java.lang.Double r7 = java.lang.Double.valueOf(r6)     // Catch:{ SQLiteConstraintException -> 0x00ac }
            java.lang.String r6 = "longitude"
            r15.put(r6, r7)     // Catch:{ SQLiteConstraintException -> 0x00ac }
            boolean r6 = r9 instanceof X.C46912bs     // Catch:{ SQLiteConstraintException -> 0x00ac }
            java.lang.String r10 = "url"
            java.lang.String r11 = "place_address"
            java.lang.String r12 = "place_name"
            if (r6 == 0) goto L_0x0097
            r7 = r9
            X.2bs r7 = (X.C46912bs) r7     // Catch:{ SQLiteConstraintException -> 0x00ac }
            java.lang.String r6 = r7.A01     // Catch:{ SQLiteConstraintException -> 0x00ac }
            X.AnonymousClass3SW.A01(r15, r12, r6)     // Catch:{ SQLiteConstraintException -> 0x00ac }
            java.lang.String r6 = r7.A00     // Catch:{ SQLiteConstraintException -> 0x00ac }
            X.AnonymousClass3SW.A01(r15, r11, r6)     // Catch:{ SQLiteConstraintException -> 0x00ac }
            java.lang.String r6 = r7.A02     // Catch:{ SQLiteConstraintException -> 0x00ac }
            X.AnonymousClass3SW.A01(r15, r10, r6)     // Catch:{ SQLiteConstraintException -> 0x00ac }
        L_0x007a:
            X.3Kz r6 = r9.A0V()     // Catch:{ SQLiteConstraintException -> 0x00ac }
            byte[] r7 = r6.A02()     // Catch:{ SQLiteConstraintException -> 0x00ac }
            java.lang.String r6 = "thumbnail"
            X.AnonymousClass3SW.A03(r15, r6, r7)     // Catch:{ SQLiteConstraintException -> 0x00ac }
            X.14e r9 = r2.A02     // Catch:{ SQLiteConstraintException -> 0x00ac }
            java.lang.String r7 = "message_quoted_location"
            java.lang.String r6 = "INSERT_MESSAGE_QUOTED_LOCATION_SQL"
            long r9 = r9.A05(r7, r6, r15)     // Catch:{ SQLiteConstraintException -> 0x00ac }
            int r6 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            r7 = 0
            if (r6 != 0) goto L_0x00a6
            goto L_0x00a5
        L_0x0097:
            boolean r6 = r9 instanceof X.C46902br     // Catch:{ SQLiteConstraintException -> 0x00ac }
            if (r6 == 0) goto L_0x007a
            r15.putNull(r12)     // Catch:{ SQLiteConstraintException -> 0x00ac }
            r15.putNull(r11)     // Catch:{ SQLiteConstraintException -> 0x00ac }
            r15.putNull(r10)     // Catch:{ SQLiteConstraintException -> 0x00ac }
            goto L_0x007a
        L_0x00a5:
            r7 = 1
        L_0x00a6:
            java.lang.String r6 = "LocationMessageStore/insertOrUpdateQuotedLocationMessage/inserted row should have same row_id"
            X.C18740tg.A0F(r7, r6)     // Catch:{ SQLiteConstraintException -> 0x00ac }
            goto L_0x00cb
        L_0x00ac:
            r7 = move-exception
            java.lang.String r6 = "message_row_id"
            r15.remove(r6)     // Catch:{ all -> 0x07e2 }
            X.14e r14 = r2.A02     // Catch:{ all -> 0x07e2 }
            java.lang.String r16 = "message_quoted_location"
            java.lang.String r17 = "message_row_id = ?"
            java.lang.String[] r6 = new java.lang.String[r8]     // Catch:{ all -> 0x07e2 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x07e2 }
            r6[r13] = r3     // Catch:{ all -> 0x07e2 }
            java.lang.String r18 = "UPDATE_MESSAGE_QUOTED_LOCATION_SQL"
            r19 = r6
            int r3 = r14.A01(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x07e2 }
            if (r3 == r8) goto L_0x00cb
            throw r7     // Catch:{ all -> 0x07e2 }
        L_0x00cb:
            r2.close()
        L_0x00ce:
            boolean r2 = r0 instanceof X.AnonymousClass2bU
            if (r2 == 0) goto L_0x0267
            X.1DG r9 = r5.A08
            r11 = r0
            X.2bU r11 = (X.AnonymousClass2bU) r11
            long r2 = r1.A1N
            r19 = r2
            int r3 = r11.A0H()
            r8 = 0
            r7 = 1
            r2 = 2
            r4 = 0
            if (r3 != r2) goto L_0x00e6
            r4 = 1
        L_0x00e6:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "MediaCoreMessageStore/insertOrUpdateQuotedMediaMessage/message in main storage; key="
            r3.append(r2)
            X.3Qa r6 = r11.A1J
            r3.append(r6)
            java.lang.String r2 = r3.toString()
            X.C18740tg.A0E(r4, r2)
            X.12P r2 = r9.A03
            X.1M0 r18 = r2.A05()
            X.71s r17 = r18.B1k()     // Catch:{ all -> 0x025f }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0255 }
            r4.<init>()     // Catch:{ all -> 0x0255 }
            boolean r2 = r11 instanceof X.C46972by     // Catch:{ all -> 0x0255 }
            r13 = 0
            if (r2 == 0) goto L_0x020a
            r3 = r11
            X.2by r3 = (X.C46972by) r3     // Catch:{ all -> 0x0255 }
            int r2 = r3.A00     // Catch:{ all -> 0x0255 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0255 }
            java.lang.String r2 = r3.A01     // Catch:{ all -> 0x0255 }
            r26 = r2
            r16 = 0
        L_0x011f:
            X.3Kz r2 = r11.A0V()     // Catch:{ all -> 0x0255 }
            if (r2 == 0) goto L_0x0129
            byte[] r13 = r2.A02()     // Catch:{ all -> 0x0255 }
        L_0x0129:
            java.lang.String r2 = r11.A07     // Catch:{ all -> 0x0255 }
            r25 = r2
            java.lang.String r2 = r11.A05     // Catch:{ all -> 0x0255 }
            r24 = r2
            long r2 = r11.A00     // Catch:{ all -> 0x0255 }
            r22 = r2
            java.lang.String r15 = r11.A1b()     // Catch:{ all -> 0x0255 }
            java.lang.String r3 = r11.A04     // Catch:{ all -> 0x0255 }
            java.lang.String r2 = r11.A03     // Catch:{ all -> 0x0255 }
            r21 = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0255 }
            java.lang.String r10 = "message_row_id"
            r4.put(r10, r2)     // Catch:{ all -> 0x0255 }
            java.lang.String r14 = "message_url"
            r2 = r25
            X.AnonymousClass3SW.A01(r4, r14, r2)     // Catch:{ all -> 0x0255 }
            java.lang.String r14 = "mime_type"
            r2 = r24
            X.AnonymousClass3SW.A01(r4, r14, r2)     // Catch:{ all -> 0x0255 }
            java.lang.Long r14 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x0255 }
            java.lang.String r2 = "file_length"
            r4.put(r2, r14)     // Catch:{ all -> 0x0255 }
            java.lang.String r2 = "media_name"
            X.AnonymousClass3SW.A01(r4, r2, r15)     // Catch:{ all -> 0x0255 }
            java.lang.String r2 = "file_hash"
            X.AnonymousClass3SW.A01(r4, r2, r3)     // Catch:{ all -> 0x0255 }
            java.lang.String r14 = "media_duration"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0255 }
            java.lang.String r2 = "page_count"
            if (r12 == 0) goto L_0x0201
            r4.put(r2, r12)     // Catch:{ all -> 0x0255 }
        L_0x0176:
            r4.put(r14, r3)     // Catch:{ all -> 0x0255 }
            java.lang.String r3 = "enc_file_hash"
            r2 = r21
            X.AnonymousClass3SW.A01(r4, r3, r2)     // Catch:{ all -> 0x0255 }
            java.lang.String r2 = "thumbnail"
            X.AnonymousClass3SW.A03(r4, r2, r13)     // Catch:{ all -> 0x0255 }
            java.lang.String r3 = "media_caption"
            r2 = r26
            X.AnonymousClass3SW.A01(r4, r3, r2)     // Catch:{ all -> 0x0255 }
            X.3Qj r11 = r11.A01     // Catch:{ all -> 0x0255 }
            if (r11 == 0) goto L_0x01ea
            X.C18740tg.A06(r11)     // Catch:{ all -> 0x0255 }
            java.lang.String r3 = r11.A0L     // Catch:{ all -> 0x0255 }
            java.lang.String r2 = "media_job_uuid"
            X.AnonymousClass3SW.A01(r4, r2, r3)     // Catch:{ all -> 0x0255 }
            boolean r3 = r11.A0V     // Catch:{ all -> 0x0255 }
            java.lang.String r2 = "transferred"
            X.AnonymousClass3SW.A02(r4, r2, r3)     // Catch:{ all -> 0x0255 }
            long r2 = r11.A0C     // Catch:{ all -> 0x0255 }
            java.lang.Long r3 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0255 }
            java.lang.String r2 = "file_size"
            r4.put(r2, r3)     // Catch:{ all -> 0x0255 }
            byte[] r3 = r11.A0a     // Catch:{ all -> 0x0255 }
            java.lang.String r2 = "media_key"
            X.AnonymousClass3SW.A03(r4, r2, r3)     // Catch:{ all -> 0x0255 }
            long r2 = r11.A0D     // Catch:{ all -> 0x0255 }
            java.lang.Long r3 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0255 }
            java.lang.String r2 = "media_key_timestamp"
            r4.put(r2, r3)     // Catch:{ all -> 0x0255 }
            int r2 = r11.A0A     // Catch:{ all -> 0x0255 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0255 }
            java.lang.String r2 = "width"
            r4.put(r2, r3)     // Catch:{ all -> 0x0255 }
            int r2 = r11.A06     // Catch:{ all -> 0x0255 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0255 }
            java.lang.String r2 = "height"
            r4.put(r2, r3)     // Catch:{ all -> 0x0255 }
            java.lang.String r3 = r11.A0J     // Catch:{ all -> 0x0255 }
            java.lang.String r2 = "direct_path"
            X.AnonymousClass3SW.A01(r4, r2, r3)     // Catch:{ all -> 0x0255 }
            java.io.File r11 = r11.A0I     // Catch:{ all -> 0x0255 }
            java.lang.String r3 = "file_path"
            if (r11 == 0) goto L_0x01fd
            X.179 r2 = r9.A00     // Catch:{ all -> 0x0255 }
            java.lang.String r2 = r2.A08(r11)     // Catch:{ all -> 0x0255 }
            r4.put(r3, r2)     // Catch:{ all -> 0x0255 }
        L_0x01ea:
            r2 = r18
            X.14e r11 = r2.A02     // Catch:{ all -> 0x0255 }
            java.lang.String r9 = "message_quoted_media"
            java.lang.String r2 = "INSERT_MESSAGE_QUOTED_MEDIA_SQL"
            long r14 = r11.A04(r9, r2, r4)     // Catch:{ all -> 0x0255 }
            r12 = 0
            int r2 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r2 < 0) goto L_0x0219
            goto L_0x0213
        L_0x01fd:
            r4.putNull(r3)     // Catch:{ all -> 0x0255 }
            goto L_0x01ea
        L_0x0201:
            r4.put(r2, r3)     // Catch:{ all -> 0x0255 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0255 }
            goto L_0x0176
        L_0x020a:
            int r2 = r11.A0B     // Catch:{ all -> 0x0255 }
            r16 = r2
            r12 = r13
            r26 = r13
            goto L_0x011f
        L_0x0213:
            int r2 = (r19 > r14 ? 1 : (r19 == r14 ? 0 : -1))
            if (r2 != 0) goto L_0x0249
            r8 = 1
            goto L_0x0249
        L_0x0219:
            r4.remove(r10)     // Catch:{ all -> 0x0255 }
            java.lang.String r13 = "message_row_id = ?"
            java.lang.String[] r3 = new java.lang.String[r7]     // Catch:{ all -> 0x0255 }
            java.lang.String r2 = java.lang.String.valueOf(r19)     // Catch:{ all -> 0x0255 }
            r3[r8] = r2     // Catch:{ all -> 0x0255 }
            java.lang.String r14 = "UPDATE_MESSAGE_QUOTED_MEDIA_SQL"
            r10 = r11
            r11 = r4
            r12 = r9
            r15 = r3
            int r2 = r10.A01(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0255 }
            if (r2 == r7) goto L_0x024e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0255 }
            r1.<init>()     // Catch:{ all -> 0x0255 }
            java.lang.String r0 = "MediaCoreMessageStore/insertOrUpdateQuotedMediaMessage/Failed to insert / update quoted media data; key="
            r1.append(r0)     // Catch:{ all -> 0x0255 }
            r1.append(r6)     // Catch:{ all -> 0x0255 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0255 }
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x0255 }
            r0.<init>(r1)     // Catch:{ all -> 0x0255 }
            throw r0     // Catch:{ all -> 0x0255 }
        L_0x0249:
            java.lang.String r2 = "MediaCoreMessageStore/insertOrUpdateQuotedMediaMessage/inserted row should have same row_id"
            X.C18740tg.A0F(r8, r2)     // Catch:{ all -> 0x0255 }
        L_0x024e:
            r17.A00()     // Catch:{ all -> 0x0255 }
            r17.close()     // Catch:{ all -> 0x025f }
            goto L_0x0264
        L_0x0255:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x025a }
            goto L_0x025e
        L_0x025a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x025f }
        L_0x025e:
            throw r1     // Catch:{ all -> 0x025f }
        L_0x025f:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x07e7 }
            throw r1
        L_0x0264:
            r18.close()
        L_0x0267:
            boolean r2 = r0 instanceof X.C46852bm
            if (r2 == 0) goto L_0x02d8
            X.1Ez r8 = r5.A0F
            r7 = r0
            X.2bm r7 = (X.C46852bm) r7
            long r2 = r1.A1N
            int r6 = r7.A0H()
            r10 = 1
            r4 = 2
            r9 = 0
            if (r6 != r4) goto L_0x027c
            r9 = 1
        L_0x027c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r4 = "ProductMessageStore/insertOrUpdateQuotedProductMessage/message in main storage; key="
            r6.append(r4)
            X.3Qa r4 = r7.A1J
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            X.C18740tg.A0E(r9, r4)
            X.12P r4 = r8.A00     // Catch:{ SQLiteConstraintException -> 0x02c3 }
            X.1M0 r9 = r4.A05()     // Catch:{ SQLiteConstraintException -> 0x02c3 }
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x02b9 }
            r11.<init>()     // Catch:{ all -> 0x02b9 }
            X.C25101Ez.A00(r11, r8, r7, r2)     // Catch:{ all -> 0x02b9 }
            X.14e r8 = r9.A02     // Catch:{ all -> 0x02b9 }
            java.lang.String r7 = "message_quoted_product"
            r6 = 5
            java.lang.String r4 = "INSERT_MESSAGE_QUOTED_PRODUCT_SQL"
            long r6 = r8.A08(r7, r4, r11, r6)     // Catch:{ all -> 0x02b9 }
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x02b0
            r10 = 0
        L_0x02b0:
            java.lang.String r2 = "ProductMessageStore/insertOrUpdateQuotedProductMessage/inserted row should have same row_id"
            X.C18740tg.A0F(r10, r2)     // Catch:{ all -> 0x02b9 }
            r9.close()     // Catch:{ SQLiteConstraintException -> 0x02c3 }
            goto L_0x02d8
        L_0x02b9:
            r3 = move-exception
            r9.close()     // Catch:{ all -> 0x02be }
            goto L_0x02c2
        L_0x02be:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch:{ SQLiteConstraintException -> 0x02c3 }
        L_0x02c2:
            throw r3     // Catch:{ SQLiteConstraintException -> 0x02c3 }
        L_0x02c3:
            r4 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "ProductMessageStore/insertOrUpdateQuotedProductMessage/fail to insert. Error message is: "
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.e((java.lang.String) r2)
        L_0x02d8:
            boolean r2 = r0 instanceof X.C46842bl
            if (r2 == 0) goto L_0x0349
            X.1Ex r8 = r5.A02
            r7 = r0
            X.2bl r7 = (X.C46842bl) r7
            long r2 = r1.A1N
            int r6 = r7.A0H()
            r10 = 1
            r4 = 2
            r9 = 0
            if (r6 != r4) goto L_0x02ed
            r9 = 1
        L_0x02ed:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r4 = "CatalogMessageStore/insertOrUpdateQuotedCatalogMessage/message in main storage; key="
            r6.append(r4)
            X.3Qa r4 = r7.A1J
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            X.C18740tg.A0E(r9, r4)
            X.12P r4 = r8.A00     // Catch:{ SQLiteConstraintException -> 0x0334 }
            X.1M0 r9 = r4.A05()     // Catch:{ SQLiteConstraintException -> 0x0334 }
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x032a }
            r11.<init>()     // Catch:{ all -> 0x032a }
            X.C25081Ex.A00(r11, r8, r7, r2)     // Catch:{ all -> 0x032a }
            X.14e r8 = r9.A02     // Catch:{ all -> 0x032a }
            java.lang.String r7 = "message_quoted_product"
            r6 = 5
            java.lang.String r4 = "INSERT_MESSAGE_QUOTED_CATALOG_SQL"
            long r6 = r8.A08(r7, r4, r11, r6)     // Catch:{ all -> 0x032a }
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0321
            r10 = 0
        L_0x0321:
            java.lang.String r2 = "CatalogMessageStore/insertOrUpdateQuotedCatalogMessage/inserted row should have same row_id"
            X.C18740tg.A0F(r10, r2)     // Catch:{ all -> 0x032a }
            r9.close()     // Catch:{ SQLiteConstraintException -> 0x0334 }
            goto L_0x0349
        L_0x032a:
            r3 = move-exception
            r9.close()     // Catch:{ all -> 0x032f }
            goto L_0x0333
        L_0x032f:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch:{ SQLiteConstraintException -> 0x0334 }
        L_0x0333:
            throw r3     // Catch:{ SQLiteConstraintException -> 0x0334 }
        L_0x0334:
            r4 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "CatalogMessageStore/insertOrUpdateQuotedCatalogMessage/fail to insert. Error message is: "
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.e((java.lang.String) r2)
        L_0x0349:
            boolean r2 = r0 instanceof X.AnonymousClass2bQ
            if (r2 == 0) goto L_0x036b
            X.1F8 r7 = r5.A04
            r6 = r0
            X.2bQ r6 = (X.AnonymousClass2bQ) r6
            long r3 = r1.A1N
            X.12P r2 = r7.A01
            X.1M0 r2 = r2.A05()
            android.content.ContentValues r8 = X.AnonymousClass1F8.A00(r7, r6, r3)     // Catch:{ all -> 0x07e2 }
            X.14e r7 = r2.A02     // Catch:{ all -> 0x07e2 }
            java.lang.String r6 = "message_quoted_group_invite"
            r4 = 5
            java.lang.String r3 = "INSERT_QUOTED_GROUP_INVITE_MESSAGE_SQL"
            r7.A08(r6, r3, r8, r4)     // Catch:{ all -> 0x07e2 }
            r2.close()
        L_0x036b:
            boolean r2 = r0 instanceof X.C46952bw
            if (r2 == 0) goto L_0x0471
            X.1Ev r11 = r5.A0C
            r7 = r0
            X.2bw r7 = (X.C46952bw) r7
            long r3 = r1.A1N
            int r6 = r7.A0H()
            r9 = 1
            r2 = 2
            r8 = 0
            if (r6 != r2) goto L_0x0380
            r8 = 1
        L_0x0380:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = "OrderMessageStore/insertOrUpdateQuotedOrderMessage/message in main storage; key="
            r6.append(r2)
            X.3Qa r2 = r7.A1J
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            X.C18740tg.A0E(r8, r2)
            X.12P r2 = r11.A01     // Catch:{ SQLiteConstraintException -> 0x045c }
            X.1M0 r8 = r2.A05()     // Catch:{ SQLiteConstraintException -> 0x045c }
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ all -> 0x0452 }
            r10.<init>()     // Catch:{ all -> 0x0452 }
            java.lang.Long r6 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0452 }
            java.lang.String r2 = "message_row_id"
            r10.put(r2, r6)     // Catch:{ all -> 0x0452 }
            java.lang.String r6 = r7.A07     // Catch:{ all -> 0x0452 }
            java.lang.String r2 = "order_id"
            X.AnonymousClass3SW.A01(r10, r2, r6)     // Catch:{ all -> 0x0452 }
            java.lang.String r6 = r7.A08     // Catch:{ all -> 0x0452 }
            java.lang.String r2 = "order_title"
            X.AnonymousClass3SW.A01(r10, r2, r6)     // Catch:{ all -> 0x0452 }
            int r2 = r7.A00     // Catch:{ all -> 0x0452 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0452 }
            java.lang.String r2 = "item_count"
            r10.put(r2, r6)     // Catch:{ all -> 0x0452 }
            int r2 = r7.A01     // Catch:{ all -> 0x0452 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0452 }
            java.lang.String r2 = "message_version"
            r10.put(r2, r6)     // Catch:{ all -> 0x0452 }
            int r2 = r7.A02     // Catch:{ all -> 0x0452 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0452 }
            java.lang.String r2 = "status"
            r10.put(r2, r6)     // Catch:{ all -> 0x0452 }
            int r2 = r7.A03     // Catch:{ all -> 0x0452 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0452 }
            java.lang.String r2 = "surface"
            r10.put(r2, r6)     // Catch:{ all -> 0x0452 }
            java.lang.String r6 = r7.A06     // Catch:{ all -> 0x0452 }
            java.lang.String r2 = "message"
            X.AnonymousClass3SW.A01(r10, r2, r6)     // Catch:{ all -> 0x0452 }
            com.whatsapp.jid.UserJid r6 = r7.A04     // Catch:{ all -> 0x0452 }
            if (r6 == 0) goto L_0x03fe
            X.12j r2 = r11.A00     // Catch:{ all -> 0x0452 }
            long r11 = r2.A07(r6)     // Catch:{ all -> 0x0452 }
            java.lang.Long r6 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0452 }
            java.lang.String r2 = "seller_jid"
            r10.put(r2, r6)     // Catch:{ all -> 0x0452 }
        L_0x03fe:
            java.lang.String r6 = r7.A09     // Catch:{ all -> 0x0452 }
            java.lang.String r2 = "token"
            X.AnonymousClass3SW.A01(r10, r2, r6)     // Catch:{ all -> 0x0452 }
            X.3Kz r2 = r7.A0V()     // Catch:{ all -> 0x0452 }
            if (r2 == 0) goto L_0x0418
            X.3Kz r2 = r7.A0V()     // Catch:{ all -> 0x0452 }
            byte[] r6 = r2.A02()     // Catch:{ all -> 0x0452 }
            java.lang.String r2 = "thumbnail"
            X.AnonymousClass3SW.A03(r10, r2, r6)     // Catch:{ all -> 0x0452 }
        L_0x0418:
            java.lang.String r6 = r7.A05     // Catch:{ all -> 0x0452 }
            if (r6 == 0) goto L_0x043a
            java.math.BigDecimal r2 = r7.A0A     // Catch:{ all -> 0x0452 }
            if (r2 == 0) goto L_0x043a
            java.lang.String r2 = "currency_code"
            r10.put(r2, r6)     // Catch:{ all -> 0x0452 }
            java.math.BigDecimal r6 = r7.A0A     // Catch:{ all -> 0x0452 }
            java.math.BigDecimal r2 = X.C129676Ia.A00     // Catch:{ all -> 0x0452 }
            java.math.BigDecimal r2 = r6.multiply(r2)     // Catch:{ all -> 0x0452 }
            long r6 = r2.longValue()     // Catch:{ all -> 0x0452 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0452 }
            java.lang.String r2 = "total_amount_1000"
            r10.put(r2, r6)     // Catch:{ all -> 0x0452 }
        L_0x043a:
            X.14e r7 = r8.A02     // Catch:{ all -> 0x0452 }
            java.lang.String r6 = "message_quoted_order"
            java.lang.String r2 = "INSERT_MESSAGE_QUOTED_ORDER_SQL"
            long r6 = r7.A05(r6, r2, r10)     // Catch:{ all -> 0x0452 }
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0449
            r9 = 0
        L_0x0449:
            java.lang.String r2 = "OrderMessageStore/insertOrUpdateQuotedOrderMessage/inserted row should have same row_id"
            X.C18740tg.A0F(r9, r2)     // Catch:{ all -> 0x0452 }
            r8.close()     // Catch:{ SQLiteConstraintException -> 0x045c }
            goto L_0x0471
        L_0x0452:
            r3 = move-exception
            r8.close()     // Catch:{ all -> 0x0457 }
            goto L_0x045b
        L_0x0457:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch:{ SQLiteConstraintException -> 0x045c }
        L_0x045b:
            throw r3     // Catch:{ SQLiteConstraintException -> 0x045c }
        L_0x045c:
            r4 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "OrderMessageStore/insertOrUpdateQuotedOrderMessage/fail to insert. Error message is: "
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.e((java.lang.String) r2)
        L_0x0471:
            boolean r2 = r0 instanceof X.C23043B1o
            if (r2 == 0) goto L_0x04f5
            X.1F3 r8 = r5.A05
            r4 = r0
            X.B1o r4 = (X.C23043B1o) r4
            long r12 = r1.A1N
            X.9uk r2 = r4.BA8()
            if (r2 == 0) goto L_0x04f5
            X.12P r2 = r8.A01     // Catch:{ SQLiteConstraintException -> 0x04e0 }
            X.1M0 r6 = r2.A05()     // Catch:{ SQLiteConstraintException -> 0x04e0 }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x04d6 }
            r7.<init>()     // Catch:{ all -> 0x04d6 }
            java.lang.String r3 = "message_row_id"
            java.lang.Long r2 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x04d6 }
            r7.put(r3, r2)     // Catch:{ all -> 0x04d6 }
            java.lang.String r3 = "element_type"
            X.9uk r2 = r4.BA8()     // Catch:{ all -> 0x04d6 }
            int r2 = r8.A0A(r2)     // Catch:{ all -> 0x04d6 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x04d6 }
            r7.put(r3, r2)     // Catch:{ all -> 0x04d6 }
            X.9uk r2 = r4.BA8()     // Catch:{ all -> 0x04d6 }
            org.json.JSONObject r2 = X.AnonymousClass96X.A00(r2)     // Catch:{ all -> 0x04d6 }
            if (r2 == 0) goto L_0x04d0
            java.lang.String r3 = r2.toString()     // Catch:{ all -> 0x04d6 }
        L_0x04b5:
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x04d6 }
            if (r2 != 0) goto L_0x04c0
            java.lang.String r2 = "element_content"
            r7.put(r2, r3)     // Catch:{ all -> 0x04d6 }
        L_0x04c0:
            java.lang.String r9 = "message_quoted_ui_elements"
            java.lang.String r10 = "MessageUIElementsStore/insertOrUpdateQuotedMultiElementMessage"
            X.9uk r2 = r4.BA8()     // Catch:{ all -> 0x04d6 }
            int r11 = r8.A0A(r2)     // Catch:{ all -> 0x04d6 }
            X.AnonymousClass1F3.A04(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x04d6 }
            goto L_0x04d2
        L_0x04d0:
            r3 = 0
            goto L_0x04b5
        L_0x04d2:
            r6.close()     // Catch:{ SQLiteConstraintException -> 0x04e0 }
            goto L_0x04f5
        L_0x04d6:
            r3 = move-exception
            r6.close()     // Catch:{ all -> 0x04db }
            goto L_0x04df
        L_0x04db:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch:{ SQLiteConstraintException -> 0x04e0 }
        L_0x04df:
            throw r3     // Catch:{ SQLiteConstraintException -> 0x04e0 }
        L_0x04e0:
            r4 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "MessageUIElementsStore/insertOrUpdateQuotedMultiElementMessage/fail to insert. Error quotedMessage is: "
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.e((java.lang.String) r2)
        L_0x04f5:
            boolean r2 = r0 instanceof X.AnonymousClass2cT
            if (r2 == 0) goto L_0x0523
            X.1F3 r7 = r5.A05
            r4 = r0
            X.2cT r4 = (X.AnonymousClass2cT) r4
            long r11 = r1.A1N
            java.lang.String r8 = "message_quoted_ui_elements_reply"
            android.content.ContentValues r6 = X.AnonymousClass1F3.A00(r4)
            java.lang.Long r3 = java.lang.Long.valueOf(r11)
            java.lang.String r2 = "message_row_id"
            r6.put(r2, r3)
            X.9ud r2 = r4.A00
            if (r2 == 0) goto L_0x051d
            int r3 = r2.A05
            r10 = 1
            if (r3 == r10) goto L_0x051e
            r2 = 2
            r10 = 8
            if (r3 == r2) goto L_0x051e
        L_0x051d:
            r10 = 0
        L_0x051e:
            java.lang.String r9 = "MessageUIElementsStore/insertOrUpdateQuoteResponseMessage"
            X.AnonymousClass1F3.A04(r6, r7, r8, r9, r10, r11)
        L_0x0523:
            boolean r2 = r0 instanceof X.AnonymousClass2cU
            if (r2 == 0) goto L_0x055e
            X.1F3 r7 = r5.A05
            r4 = r0
            X.2cU r4 = (X.AnonymousClass2cU) r4
            long r11 = r1.A1N
            java.lang.String r8 = "message_quoted_ui_elements_reply"
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            r2 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = "element_type"
            r6.put(r2, r3)
            java.lang.String r3 = r4.A0b()
            java.lang.String r2 = "reply_values"
            r6.put(r2, r3)
            java.lang.String r3 = r4.A00
            java.lang.String r2 = "reply_description"
            r6.put(r2, r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r11)
            java.lang.String r2 = "message_row_id"
            r6.put(r2, r3)
            java.lang.String r9 = "MessageUIElementsStore/insertOrUpdateQuoteButtonsResponseMessage"
            r10 = 2
            X.AnonymousClass1F3.A04(r6, r7, r8, r9, r10, r11)
        L_0x055e:
            if (r0 == 0) goto L_0x05e6
            boolean r2 = r0.A1H()
            if (r2 == 0) goto L_0x05cf
            X.1Ey r11 = r5.A09
            long r3 = r1.A1N
            java.util.List r6 = r0.A0w
            if (r6 == 0) goto L_0x05cf
            boolean r2 = r6.isEmpty()
            if (r2 != 0) goto L_0x05cf
            X.12P r2 = r11.A03
            X.1M0 r2 = r2.A05()
            X.71s r13 = r2.B1k()     // Catch:{ all -> 0x07e2 }
            java.util.Iterator r12 = r6.iterator()     // Catch:{ all -> 0x05c6 }
        L_0x0582:
            boolean r6 = r12.hasNext()     // Catch:{ all -> 0x05c6 }
            if (r6 == 0) goto L_0x05bf
            java.lang.Object r8 = r12.next()     // Catch:{ all -> 0x05c6 }
            X.3ux r8 = (X.C80163ux) r8     // Catch:{ all -> 0x05c6 }
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ all -> 0x05c6 }
            r10.<init>()     // Catch:{ all -> 0x05c6 }
            java.lang.String r7 = "message_row_id"
            java.lang.Long r6 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x05c6 }
            r10.put(r7, r6)     // Catch:{ all -> 0x05c6 }
            java.lang.String r9 = "jid_row_id"
            X.12j r7 = r11.A02     // Catch:{ all -> 0x05c6 }
            X.11F r6 = r8.A00     // Catch:{ all -> 0x05c6 }
            long r6 = r7.A07(r6)     // Catch:{ all -> 0x05c6 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x05c6 }
            r10.put(r9, r6)     // Catch:{ all -> 0x05c6 }
            java.lang.String r7 = "display_name"
            java.lang.String r6 = r8.A01     // Catch:{ all -> 0x05c6 }
            r10.put(r7, r6)     // Catch:{ all -> 0x05c6 }
            X.14e r9 = r2.A02     // Catch:{ all -> 0x05c6 }
            java.lang.String r8 = "message_quoted_mentions"
            r7 = 4
            java.lang.String r6 = "INSERT_TABLE_QUOTED_MESSAGE_MENTIONS"
            r9.A08(r8, r6, r10, r7)     // Catch:{ all -> 0x05c6 }
            goto L_0x0582
        L_0x05bf:
            r13.A00()     // Catch:{ all -> 0x05c6 }
            r13.close()     // Catch:{ all -> 0x07e2 }
            goto L_0x05cc
        L_0x05c6:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x07dd }
            goto L_0x07e1
        L_0x05cc:
            r2.close()
        L_0x05cf:
            r2 = 8
            boolean r2 = r0.A1R(r2)
            if (r2 == 0) goto L_0x05e6
            X.1F3 r7 = r5.A05
            X.3Cq r2 = r0.A0T()
            X.37E r6 = r2.A00
            long r2 = r1.A1N
            java.lang.String r4 = "message_quoted_ui_elements"
            X.AnonymousClass1F3.A06(r7, r6, r4, r2)
        L_0x05e6:
            boolean r2 = r0 instanceof X.AnonymousClass2bX
            if (r2 == 0) goto L_0x065e
            X.1Ew r7 = r5.A0I
            r4 = r0
            X.2bX r4 = (X.AnonymousClass2bX) r4
            long r2 = r1.A1N
            java.lang.String r6 = r4.A1X()
            boolean r4 = android.text.TextUtils.isEmpty(r6)
            if (r4 != 0) goto L_0x05fe
            X.C25071Ew.A01(r7, r6, r2)
        L_0x05fe:
            boolean r2 = r0 instanceof X.AnonymousClass2bV
            if (r2 == 0) goto L_0x06fd
            X.1Eh r8 = r5.A0H
            long r3 = r1.A1N
            X.3Qa r9 = r0.A1J
            android.os.ConditionVariable r2 = X.C18740tg.A00
            r7 = 1
            r10 = 0
            int r2 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            r10 = 0
            if (r2 <= 0) goto L_0x0613
            r10 = 1
        L_0x0613:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = "TextMessageStore/insertOrUpdateQuotedTextMessage/message must have row_id set; key="
            r6.append(r2)
            r6.append(r9)
            java.lang.String r2 = r6.toString()
            X.C18740tg.A0E(r10, r2)
            int r6 = r0.A0H()
            r2 = 2
            if (r6 == r2) goto L_0x062f
            r7 = 0
        L_0x062f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = "TextMessageStore/insertOrUpdateQuotedTextMessage/message in main storage; key="
            r6.append(r2)
            r6.append(r9)
            java.lang.String r2 = r6.toString()
            X.C18740tg.A0E(r7, r2)
            r10 = r0
            X.2bV r10 = (X.AnonymousClass2bV) r10
            byte[] r2 = r10.A1c()
            if (r2 == 0) goto L_0x0650
            int r6 = r2.length
            r2 = 1
            if (r6 != 0) goto L_0x0651
        L_0x0650:
            r2 = 0
        L_0x0651:
            java.lang.String r12 = "message_quoted_text"
            r7 = 0
            r6 = 1
            if (r2 == 0) goto L_0x06db
            X.12P r2 = r8.A00
            X.1M0 r2 = r2.A05()
            goto L_0x069c
        L_0x065e:
            boolean r2 = r0 instanceof X.AnonymousClass2bW
            if (r2 == 0) goto L_0x05fe
            X.1Ew r9 = r5.A0I
            r2 = r0
            X.2bW r2 = (X.AnonymousClass2bW) r2
            long r3 = r1.A1N
            java.util.List r6 = r2.A1X()
            boolean r2 = r6.isEmpty()
            if (r2 != 0) goto L_0x05fe
            X.12P r2 = r9.A07
            X.1M0 r2 = r2.A05()
            X.71s r8 = r2.B1k()     // Catch:{ all -> 0x07e2 }
            java.util.Iterator r7 = r6.iterator()     // Catch:{ all -> 0x07d8 }
        L_0x0681:
            boolean r6 = r7.hasNext()     // Catch:{ all -> 0x07d8 }
            if (r6 == 0) goto L_0x0691
            java.lang.Object r6 = r7.next()     // Catch:{ all -> 0x07d8 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x07d8 }
            X.C25071Ew.A01(r9, r6, r3)     // Catch:{ all -> 0x07d8 }
            goto L_0x0681
        L_0x0691:
            r8.A00()     // Catch:{ all -> 0x07d8 }
            r8.close()     // Catch:{ all -> 0x07e2 }
            r2.close()
            goto L_0x05fe
        L_0x069c:
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x07e2 }
            r11.<init>()     // Catch:{ all -> 0x07e2 }
            java.lang.String r9 = "message_row_id"
            java.lang.Long r8 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x07e2 }
            r11.put(r9, r8)     // Catch:{ all -> 0x07e2 }
            java.lang.String r9 = "thumbnail"
            byte[] r8 = r10.A1c()     // Catch:{ all -> 0x07e2 }
            X.AnonymousClass3SW.A03(r11, r9, r8)     // Catch:{ all -> 0x07e2 }
            X.14e r10 = r2.A02     // Catch:{ all -> 0x07e2 }
            java.lang.String r13 = "message_row_id = ?"
            java.lang.String[] r15 = new java.lang.String[r6]     // Catch:{ all -> 0x07e2 }
            java.lang.String r8 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x07e2 }
            r15[r7] = r8     // Catch:{ all -> 0x07e2 }
            java.lang.String r14 = "UPDATE_MESSAGE_QUOTED_TEXT_SQL"
            int r8 = r10.A01(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x07e2 }
            if (r8 == r6) goto L_0x06d7
            java.lang.String r6 = "INSERT_MESSAGE_QUOTED_TEXT_SQL"
            long r8 = r10.A05(r12, r6, r11)     // Catch:{ all -> 0x07e2 }
            int r6 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x06d2
            r7 = 1
        L_0x06d2:
            java.lang.String r3 = "TextMessageStore/insertOrUpdateQuotedTextMessage/inserted row should have same row_id"
            X.C18740tg.A0F(r7, r3)     // Catch:{ all -> 0x07e2 }
        L_0x06d7:
            r2.close()
            goto L_0x06fd
        L_0x06db:
            if (r27 == 0) goto L_0x06fd
            X.12P r2 = r8.A00
            X.1M0 r10 = r2.A05()
            X.14e r9 = r10.A02     // Catch:{ all -> 0x06f5 }
            java.lang.String r8 = "message_row_id = ?"
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ all -> 0x06f5 }
            java.lang.String r2 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x06f5 }
            r6[r7] = r2     // Catch:{ all -> 0x06f5 }
            java.lang.String r2 = "DELETE_MESSAGE_QUOTED_TEXT_SQL"
            r9.A03(r12, r8, r2, r6)     // Catch:{ all -> 0x06f5 }
            goto L_0x06fa
        L_0x06f5:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x07e7 }
            throw r1
        L_0x06fa:
            r10.close()
        L_0x06fd:
            boolean r2 = r0 instanceof X.AnonymousClass2bR
            if (r2 == 0) goto L_0x0713
            X.1F9 r6 = r5.A0D
            r2 = r0
            X.2bR r2 = (X.AnonymousClass2bR) r2
            long r10 = r1.A1N
            int r9 = r2.A00
            long r12 = r2.A01
            java.lang.String r7 = "message_quoted_payment_invite"
            java.lang.String r8 = "INSERT_QUOTED_PAYMENT_INVITE"
            X.AnonymousClass1F9.A01(r6, r7, r8, r9, r10, r12)
        L_0x0713:
            boolean r2 = r0 instanceof X.AnonymousClass2c5
            if (r2 == 0) goto L_0x075d
            X.1F2 r2 = r5.A0J
            r6 = r0
            X.2c5 r6 = (X.AnonymousClass2c5) r6
            long r3 = r1.A1N
            X.12P r2 = r2.A00
            X.1M0 r2 = r2.A05()
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x07e2 }
            r8.<init>()     // Catch:{ all -> 0x07e2 }
            java.lang.String r7 = "message_row_id"
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x07e2 }
            r8.put(r7, r3)     // Catch:{ all -> 0x07e2 }
            java.lang.String r3 = r6.A01     // Catch:{ all -> 0x07e2 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x07e2 }
            if (r3 != 0) goto L_0x0741
            java.lang.String r4 = "parent_group_jid"
            java.lang.String r3 = r6.A01     // Catch:{ all -> 0x07e2 }
            r8.put(r4, r3)     // Catch:{ all -> 0x07e2 }
        L_0x0741:
            java.lang.String r3 = r6.A00     // Catch:{ all -> 0x07e2 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x07e2 }
            if (r3 != 0) goto L_0x0750
            java.lang.String r4 = "group_subject"
            java.lang.String r3 = r6.A00     // Catch:{ all -> 0x07e2 }
            r8.put(r4, r3)     // Catch:{ all -> 0x07e2 }
        L_0x0750:
            X.14e r7 = r2.A02     // Catch:{ all -> 0x07e2 }
            java.lang.String r6 = "message_quoted_blank_reply"
            r4 = 5
            java.lang.String r3 = "INSERT_QUOTED_BLANK_REPLY"
            r7.A08(r6, r3, r8, r4)     // Catch:{ all -> 0x07e2 }
            r2.close()
        L_0x075d:
            boolean r2 = r0 instanceof X.C106265Iz
            if (r2 == 0) goto L_0x077a
            X.1FA r2 = r5.A01
            X.5Iz r0 = (X.C106265Iz) r0
            long r3 = r1.A1N
            r1 = 0
            X.AnonymousClass00C.A0D(r0, r1)
            X.1FB r2 = r2.A00
            X.3Kh r1 = r0.A01
            java.lang.Object r7 = r1.A00
            X.5Nh r7 = (X.C107265Nh) r7
            if (r7 != 0) goto L_0x077b
            java.lang.String r0 = "MessageCallLogStore/insertOrUpdateQuotedMessageCallLog call log is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x077a:
            return
        L_0x077b:
            X.12P r1 = r2.A00
            X.1M0 r6 = r1.A05()
            r1 = 3
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x07d1 }
            r5.<init>(r1)     // Catch:{ all -> 0x07d1 }
            java.lang.String r2 = "message_row_id"
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x07d1 }
            r5.put(r2, r1)     // Catch:{ all -> 0x07d1 }
            java.lang.String r2 = "video_call"
            boolean r1 = r7.A0K     // Catch:{ all -> 0x07d1 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x07d1 }
            r5.put(r2, r1)     // Catch:{ all -> 0x07d1 }
            java.lang.String r2 = "call_result"
            int r1 = r7.A07     // Catch:{ all -> 0x07d1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x07d1 }
            r5.put(r2, r1)     // Catch:{ all -> 0x07d1 }
            X.14e r4 = r6.A02     // Catch:{ all -> 0x07d1 }
            java.lang.String r3 = "message_quoted_call_log"
            r2 = 5
            java.lang.String r1 = "INSERT_OR_UPDATE_QUOTED_CALL_LOG_MESSAGE"
            long r4 = r4.A08(r3, r1, r5, r2)     // Catch:{ all -> 0x07d1 }
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x07cd
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x07d1 }
            r2.<init>()     // Catch:{ all -> 0x07d1 }
            java.lang.String r1 = "MessageCallLogStore/insertOrUpdateQuotedMessageCallLog/insert error, rowId="
            r2.append(r1)     // Catch:{ all -> 0x07d1 }
            long r0 = r0.A1N     // Catch:{ all -> 0x07d1 }
            r2.append(r0)     // Catch:{ all -> 0x07d1 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x07d1 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x07d1 }
        L_0x07cd:
            r6.close()
            return
        L_0x07d1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x07d3 }
        L_0x07d3:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)
            throw r0
        L_0x07d8:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x07dd }
            goto L_0x07e1
        L_0x07dd:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x07e2 }
        L_0x07e1:
            throw r1     // Catch:{ all -> 0x07e2 }
        L_0x07e2:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x07e7 }
            throw r1
        L_0x07e7:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20340xP.A00(X.0xP, X.3T1, boolean):void");
    }

    public C20340xP(C19700wN r2, AnonymousClass1FA r3, AnonymousClass179 r4, C25081Ex r5, AnonymousClass163 r6, AnonymousClass1F8 r7, AnonymousClass1F3 r8, C219712j r9, AnonymousClass1F0 r10, AnonymousClass178 r11, AnonymousClass1DG r12, C25091Ey r13, AnonymousClass176 r14, AnonymousClass12P r15, C25061Ev r16, AnonymousClass1F9 r17, C24881Ed r18, C25101Ez r19, C219612i r20, AnonymousClass1F1 r21, C24921Eh r22, C25071Ew r23, AnonymousClass1F2 r24, C24931Ei r25, AnonymousClass17E r26) {
        this.A06 = r9;
        this.A03 = r6;
        this.A00 = r2;
        this.A0L = r4;
        this.A0M = r11;
        this.A0H = r22;
        this.A0O = r25;
        this.A0C = r16;
        this.A0N = r20;
        this.A0I = r23;
        this.A02 = r5;
        this.A09 = r13;
        this.A0A = r14;
        this.A0B = r15;
        this.A0F = r19;
        this.A07 = r10;
        this.A0G = r21;
        this.A08 = r12;
        this.A0J = r24;
        this.A05 = r8;
        this.A04 = r7;
        this.A0E = r18;
        this.A0K = r26;
        this.A0D = r17;
        this.A01 = r3;
    }

    public void A01(AnonymousClass3T1 r14) {
        long j;
        AnonymousClass1M0 A052;
        AnonymousClass3T1 A0S = r14.A0S();
        if (A0S != null) {
            boolean z = false;
            if (A0S.A0H() == 2) {
                z = true;
            }
            C18740tg.A0C(z);
            AnonymousClass1M0 A053 = this.A0B.A05();
            try {
                C1495671s B1k = A053.B1k();
                try {
                    long j2 = r14.A1N;
                    AnonymousClass11F r10 = r14.A1J.A00;
                    C18740tg.A06(r10);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("message_row_id", Long.valueOf(j2));
                    AnonymousClass163 r11 = this.A03;
                    long A082 = r11.A08(r10);
                    contentValues.put("parent_message_chat_row_id", Long.valueOf(A082));
                    C64933Qa r2 = A0S.A1J;
                    AnonymousClass11F r0 = r2.A00;
                    if (r0 != null) {
                        C18740tg.A06(r0);
                        A082 = r11.A08(r0);
                    } else {
                        C18740tg.A0D(r10 instanceof UserJid, "Quoted message chatJid is not specified, parentJid is not a UserJid.");
                    }
                    contentValues.put("chat_row_id", Long.valueOf(A082));
                    contentValues.put("from_me", Integer.valueOf(r2.A02 ? 1 : 0));
                    AnonymousClass11F A0J2 = A0S.A0J();
                    if (A0J2 == null) {
                        j = 0;
                    } else {
                        j = this.A06.A07(A0J2);
                    }
                    contentValues.put("sender_jid_row_id", Long.valueOf(j));
                    contentValues.put("key_id", r2.A01);
                    contentValues.put("timestamp", Long.valueOf(A0S.A0I));
                    contentValues.put("message_type", Integer.valueOf(A0S.A1I));
                    contentValues.put("origin", Integer.valueOf(A0S.A09));
                    contentValues.put("text_data", A0S.A0d());
                    contentValues.put("payment_transaction_id", A0S.A0t);
                    contentValues.put("lookup_tables", Long.valueOf(A0S.A0I()));
                    A053.A02.A07("message_quoted", "INSERT_TABLE_MESSAGE_QUOTED", contentValues);
                    A00(this, r14, false);
                    if (A0S instanceof C88854Uh) {
                        AnonymousClass1F1 r7 = this.A0G;
                        C88854Uh r9 = (C88854Uh) A0S;
                        long j3 = r14.A1N;
                        boolean z2 = true;
                        boolean z3 = false;
                        if (j3 > 0) {
                            z3 = true;
                        }
                        C18740tg.A0E(z3, "TemplateMessageStore/fillQuotedTemplateData/parent message row must be set");
                        A052 = r7.A00.A05();
                        AnonymousClass3F4 BIE = r9.BIE();
                        ContentValues contentValues2 = new ContentValues(3);
                        contentValues2.put("message_row_id", Long.valueOf(j3));
                        contentValues2.put("content_text_data", BIE.A02);
                        contentValues2.put("footer_text_data", BIE.A03);
                        if (j3 != A052.A02.A08("message_template_quoted", "INSERT_TEMPLATE_QUOTED_SQL", contentValues2, 5)) {
                            z2 = false;
                        }
                        C18740tg.A0F(z2, "TemplateMessageStore/insertOrUpdateTemplateQuotedData/inserted row should have same row_id");
                        A052.close();
                    }
                    B1k.A00();
                    B1k.close();
                    A053.close();
                    return;
                } catch (Throwable th) {
                    B1k.close();
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    A053.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } else {
            return;
        }
        throw th;
    }
}
