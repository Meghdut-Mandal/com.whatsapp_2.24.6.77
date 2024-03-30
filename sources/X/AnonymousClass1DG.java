package X;

import android.database.Cursor;
import java.io.File;

/* renamed from: X.1DG  reason: invalid class name */
public class AnonymousClass1DG {
    public final AnonymousClass179 A00;
    public final AnonymousClass163 A01;
    public final C219712j A02;
    public final AnonymousClass12P A03;
    public final C20810yC A04;
    public final C24041Av A05;
    public final C219612i A06;

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01d8, code lost:
        r2.A06 = ((((((((r2.A03 + r2.A09) + r2.A00) + r2.A04) + r2.A0A) + r2.A07) + r2.A01) + r2.A02) + r2.A05) + r2.A08;
        r2.A0I = (((((r2.A0D + r2.A0B) + r2.A0E) + r2.A0H) + r2.A0F) + r2.A0C) + r2.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x020d, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C66753Xe A00(X.AnonymousClass1DG r15, X.AnonymousClass11F r16) {
        /*
            X.3Xe r2 = new X.3Xe
            r2.<init>()
            r13 = -9223372036854775808
        L_0x0007:
            r0 = 1
            long r13 = r13 + r0
            r8 = 3000(0xbb8, float:4.204E-42)
            r7 = 1
            r5 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "msgstore/messages "
            r1.append(r0)
            r3 = r16
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            X.14g r1 = new X.14g
            r1.<init>((java.lang.String) r0)
            r0 = 3
            java.lang.String[] r6 = new java.lang.String[r0]
            X.163 r0 = r15.A01
            long r3 = r0.A08(r3)
            java.lang.String r0 = java.lang.String.valueOf(r3)
            r6[r5] = r0
            java.lang.String r0 = java.lang.String.valueOf(r13)
            r6[r7] = r0
            r3 = 2
            java.lang.String r0 = java.lang.String.valueOf(r8)
            r6[r3] = r0
            X.0yC r4 = r15.A04
            r3 = 6261(0x1875, float:8.774E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r4, r3)
            if (r0 == 0) goto L_0x01d1
            java.lang.String r5 = "SELECT _id, starred, sort_id, message_type,  message_media.file_size AS file_size,  message_media.file_path AS file_path, table_version FROM message_media AS message_media JOIN available_message_view AS message WHERE message_media.message_row_id = message._id AND message.message_type != 7 AND message.chat_row_id = ? AND sort_id >= ? ORDER BY sort_id ASC LIMIT ?"
        L_0x0050:
            r7 = 1
            r9 = -9223372036854775808
            X.12P r0 = r15.A03
            X.1M0 r3 = r0.get()
            X.14e r4 = r3.A02     // Catch:{ all -> 0x0215 }
            java.lang.String r0 = "GET_N_MEDIA_MESSAGES_FOR_JID_STORAGE_USAGE"
            android.database.Cursor r6 = r4.A09(r5, r0, r6)     // Catch:{ all -> 0x0215 }
            boolean r0 = r6.moveToLast()     // Catch:{ all -> 0x0215 }
            if (r0 == 0) goto L_0x007c
            java.lang.String r0 = "_id"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0215 }
            long r7 = r6.getLong(r0)     // Catch:{ all -> 0x0215 }
            java.lang.String r0 = "sort_id"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0215 }
            long r9 = r6.getLong(r0)     // Catch:{ all -> 0x0215 }
        L_0x007c:
            r6.moveToFirst()     // Catch:{ all -> 0x0215 }
            r3.close()
            r1.A01()
            X.36f r5 = new X.36f
            r5.<init>(r6, r7, r9)
            long r3 = r5.A02
            android.database.Cursor r5 = r5.A00
            boolean r0 = r5.moveToFirst()     // Catch:{ all -> 0x020e }
            if (r0 == 0) goto L_0x01d5
            java.lang.String r0 = "message_type"
            int r6 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x020e }
        L_0x009a:
            int r1 = r5.getInt(r6)     // Catch:{ all -> 0x020e }
            int r0 = r2.A06     // Catch:{ all -> 0x020e }
            r8 = 1
            int r0 = r0 + 1
            r2.A06 = r0     // Catch:{ all -> 0x020e }
            boolean r0 = X.C66013Ui.A0J(r1)     // Catch:{ all -> 0x020e }
            r11 = 0
            if (r0 == 0) goto L_0x0130
            java.lang.String r0 = "thumb_image"
            int r0 = r5.getColumnIndex(r0)     // Catch:{ all -> 0x020e }
            if (r0 < 0) goto L_0x010d
            byte[] r0 = r5.getBlob(r0)     // Catch:{ all -> 0x020e }
            if (r0 == 0) goto L_0x0130
            java.io.ByteArrayInputStream r10 = new java.io.ByteArrayInputStream     // Catch:{ IOException | ClassCastException | ClassNotFoundException | IllegalArgumentException | IndexOutOfBoundsException | NegativeArraySizeException | NullPointerException -> 0x0106 }
            r10.<init>(r0)     // Catch:{ IOException | ClassCastException | ClassNotFoundException | IllegalArgumentException | IndexOutOfBoundsException | NegativeArraySizeException | NullPointerException -> 0x0106 }
            java.io.ObjectInputStream r0 = new java.io.ObjectInputStream     // Catch:{ all -> 0x00fc }
            r0.<init>(r10)     // Catch:{ all -> 0x00fc }
            java.lang.Object r9 = r0.readObject()     // Catch:{ all -> 0x00f2 }
            r0.close()     // Catch:{ all -> 0x00fc }
            r10.close()     // Catch:{ IOException | ClassCastException | ClassNotFoundException | IllegalArgumentException | IndexOutOfBoundsException | NegativeArraySizeException | NullPointerException -> 0x0106 }
            boolean r0 = r9 instanceof X.C65013Qj     // Catch:{ all -> 0x020e }
            if (r0 == 0) goto L_0x0130
            X.C18740tg.A06(r9)     // Catch:{ all -> 0x020e }
            X.3Qj r9 = (X.C65013Qj) r9     // Catch:{ all -> 0x020e }
            java.io.File r0 = r9.A0I     // Catch:{ all -> 0x020e }
            if (r0 == 0) goto L_0x0130
            java.lang.String r0 = r0.getPath()     // Catch:{ all -> 0x020e }
            if (r0 != 0) goto L_0x00e4
            r7 = 0
            goto L_0x00e9
        L_0x00e4:
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x020e }
            r7.<init>(r0)     // Catch:{ all -> 0x020e }
        L_0x00e9:
            X.179 r0 = r15.A00     // Catch:{ all -> 0x020e }
            java.io.File r7 = r0.A06(r7)     // Catch:{ all -> 0x020e }
            r9.A0I = r7     // Catch:{ all -> 0x020e }
            goto L_0x0124
        L_0x00f2:
            r7 = move-exception
            r0.close()     // Catch:{ all -> 0x00f7 }
            goto L_0x00fb
        L_0x00f7:
            r0 = move-exception
            r7.addSuppressed(r0)     // Catch:{ all -> 0x00fc }
        L_0x00fb:
            throw r7     // Catch:{ all -> 0x00fc }
        L_0x00fc:
            r7 = move-exception
            r10.close()     // Catch:{ all -> 0x0101 }
            goto L_0x0105
        L_0x0101:
            r0 = move-exception
            r7.addSuppressed(r0)     // Catch:{ IOException | ClassCastException | ClassNotFoundException | IllegalArgumentException | IndexOutOfBoundsException | NegativeArraySizeException | NullPointerException -> 0x0106 }
        L_0x0105:
            throw r7     // Catch:{ IOException | ClassCastException | ClassNotFoundException | IllegalArgumentException | IndexOutOfBoundsException | NegativeArraySizeException | NullPointerException -> 0x0106 }
        L_0x0106:
            r7 = move-exception
            java.lang.String r0 = "CachedMessageStore/getMessageMediaData"
            com.whatsapp.util.Log.e(r0, r7)     // Catch:{ all -> 0x020e }
            goto L_0x0130
        L_0x010d:
            java.lang.String r0 = "file_path"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x020e }
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x020e }
            if (r0 == 0) goto L_0x0130
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x020e }
            r7.<init>(r0)     // Catch:{ all -> 0x020e }
            X.179 r0 = r15.A00     // Catch:{ all -> 0x020e }
            java.io.File r7 = r0.A06(r7)     // Catch:{ all -> 0x020e }
        L_0x0124:
            if (r7 == 0) goto L_0x0130
            boolean r0 = r7.canRead()     // Catch:{ all -> 0x020e }
            if (r0 == 0) goto L_0x0130
            long r11 = r7.length()     // Catch:{ all -> 0x020e }
        L_0x0130:
            if (r1 == 0) goto L_0x01af
            if (r1 == r8) goto L_0x01a3
            r0 = 2
            if (r1 == r0) goto L_0x0197
            r0 = 3
            if (r1 == r0) goto L_0x018b
            r0 = 4
            if (r1 == r0) goto L_0x0184
            r0 = 5
            if (r1 == r0) goto L_0x017d
            r0 = 9
            if (r1 == r0) goto L_0x0171
            r0 = 16
            if (r1 == r0) goto L_0x017d
            r0 = 20
            if (r1 == r0) goto L_0x0165
            r0 = 81
            if (r1 == r0) goto L_0x0159
            r0 = 13
            if (r1 == r0) goto L_0x01b6
            r0 = 14
            if (r1 == r0) goto L_0x0184
            goto L_0x01c1
        L_0x0159:
            int r0 = r2.A07     // Catch:{ all -> 0x020e }
            int r0 = r0 + 1
            r2.A07 = r0     // Catch:{ all -> 0x020e }
            long r0 = r2.A0F     // Catch:{ all -> 0x020e }
            long r0 = r0 + r11
            r2.A0F = r0     // Catch:{ all -> 0x020e }
            goto L_0x01c1
        L_0x0165:
            int r0 = r2.A08     // Catch:{ all -> 0x020e }
            int r0 = r0 + 1
            r2.A08 = r0     // Catch:{ all -> 0x020e }
            long r0 = r2.A0G     // Catch:{ all -> 0x020e }
            long r0 = r0 + r11
            r2.A0G = r0     // Catch:{ all -> 0x020e }
            goto L_0x01c1
        L_0x0171:
            int r0 = r2.A02     // Catch:{ all -> 0x020e }
            int r0 = r0 + 1
            r2.A02 = r0     // Catch:{ all -> 0x020e }
            long r0 = r2.A0C     // Catch:{ all -> 0x020e }
            long r0 = r0 + r11
            r2.A0C = r0     // Catch:{ all -> 0x020e }
            goto L_0x01c1
        L_0x017d:
            int r0 = r2.A05     // Catch:{ all -> 0x020e }
            int r0 = r0 + 1
            r2.A05 = r0     // Catch:{ all -> 0x020e }
            goto L_0x01c1
        L_0x0184:
            int r0 = r2.A01     // Catch:{ all -> 0x020e }
            int r0 = r0 + 1
            r2.A01 = r0     // Catch:{ all -> 0x020e }
            goto L_0x01c1
        L_0x018b:
            int r0 = r2.A0A     // Catch:{ all -> 0x020e }
            int r0 = r0 + 1
            r2.A0A = r0     // Catch:{ all -> 0x020e }
            long r0 = r2.A0H     // Catch:{ all -> 0x020e }
            long r0 = r0 + r11
            r2.A0H = r0     // Catch:{ all -> 0x020e }
            goto L_0x01c1
        L_0x0197:
            int r0 = r2.A00     // Catch:{ all -> 0x020e }
            int r0 = r0 + 1
            r2.A00 = r0     // Catch:{ all -> 0x020e }
            long r0 = r2.A0B     // Catch:{ all -> 0x020e }
            long r0 = r0 + r11
            r2.A0B = r0     // Catch:{ all -> 0x020e }
            goto L_0x01c1
        L_0x01a3:
            int r0 = r2.A04     // Catch:{ all -> 0x020e }
            int r0 = r0 + 1
            r2.A04 = r0     // Catch:{ all -> 0x020e }
            long r0 = r2.A0E     // Catch:{ all -> 0x020e }
            long r0 = r0 + r11
            r2.A0E = r0     // Catch:{ all -> 0x020e }
            goto L_0x01c1
        L_0x01af:
            int r0 = r2.A09     // Catch:{ all -> 0x020e }
            int r0 = r0 + 1
            r2.A09 = r0     // Catch:{ all -> 0x020e }
            goto L_0x01c1
        L_0x01b6:
            int r0 = r2.A03     // Catch:{ all -> 0x020e }
            int r0 = r0 + 1
            r2.A03 = r0     // Catch:{ all -> 0x020e }
            long r0 = r2.A0D     // Catch:{ all -> 0x020e }
            long r0 = r0 + r11
            r2.A0D = r0     // Catch:{ all -> 0x020e }
        L_0x01c1:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x020e }
            if (r0 != 0) goto L_0x009a
            r5.close()
            int r0 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x01d8
            r13 = r3
            goto L_0x0007
        L_0x01d1:
            java.lang.String r5 = "SELECT _id, starred, sort_id, message_type,  message_media.file_size AS file_size,  message_media.file_path AS file_path, table_version FROM message_media AS message_media JOIN available_message_view AS message ON message_media.message_row_id = message._id WHERE message.message_type != 7 AND message.chat_row_id = ? AND sort_id >= ? ORDER BY sort_id ASC LIMIT ?"
            goto L_0x0050
        L_0x01d5:
            r5.close()
        L_0x01d8:
            int r1 = r2.A03
            int r0 = r2.A09
            int r1 = r1 + r0
            int r0 = r2.A00
            int r1 = r1 + r0
            int r0 = r2.A04
            int r1 = r1 + r0
            int r0 = r2.A0A
            int r1 = r1 + r0
            int r0 = r2.A07
            int r1 = r1 + r0
            int r0 = r2.A01
            int r1 = r1 + r0
            int r0 = r2.A02
            int r1 = r1 + r0
            int r0 = r2.A05
            int r1 = r1 + r0
            int r0 = r2.A08
            int r1 = r1 + r0
            r2.A06 = r1
            long r3 = r2.A0D
            long r0 = r2.A0B
            long r3 = r3 + r0
            long r0 = r2.A0E
            long r3 = r3 + r0
            long r0 = r2.A0H
            long r3 = r3 + r0
            long r0 = r2.A0F
            long r3 = r3 + r0
            long r0 = r2.A0C
            long r3 = r3 + r0
            long r0 = r2.A0G
            long r3 = r3 + r0
            r2.A0I = r3
            return r2
        L_0x020e:
            r1 = move-exception
            if (r5 == 0) goto L_0x021e
            r5.close()     // Catch:{ all -> 0x021a }
            throw r1
        L_0x0215:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x021a }
            throw r1
        L_0x021a:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x021e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1DG.A00(X.1DG, X.11F):X.3Xe");
    }

    public C65013Qj A01(Cursor cursor) {
        File file;
        C65013Qj r4 = new C65013Qj();
        boolean z = false;
        if (cursor.getLong(cursor.getColumnIndexOrThrow("autotransfer_retry_enabled")) == 1) {
            z = true;
        }
        r4.A0Q = z;
        r4.A0L = cursor.getString(cursor.getColumnIndexOrThrow("media_job_uuid"));
        boolean z2 = false;
        if (cursor.getLong(cursor.getColumnIndexOrThrow("transferred")) == 1) {
            z2 = true;
        }
        r4.A0V = z2;
        boolean z3 = false;
        if (cursor.getLong(cursor.getColumnIndexOrThrow("transcoded")) == 1) {
            z3 = true;
        }
        r4.A0U = z3;
        r4.A0C = cursor.getLong(cursor.getColumnIndexOrThrow("file_size"));
        r4.A09 = cursor.getInt(cursor.getColumnIndexOrThrow("suspicious_content"));
        r4.A0F = cursor.getLong(cursor.getColumnIndexOrThrow("trim_from"));
        r4.A0G = cursor.getLong(cursor.getColumnIndexOrThrow("trim_to"));
        r4.A02 = cursor.getInt(cursor.getColumnIndexOrThrow("face_x"));
        r4.A03 = cursor.getInt(cursor.getColumnIndexOrThrow("face_y"));
        r4.A0a = cursor.getBlob(cursor.getColumnIndexOrThrow("media_key"));
        r4.A0D = cursor.getLong(cursor.getColumnIndexOrThrow("media_key_timestamp"));
        r4.A0A = cursor.getInt(cursor.getColumnIndexOrThrow("width"));
        r4.A06 = cursor.getInt(cursor.getColumnIndexOrThrow("height"));
        boolean z4 = false;
        if (cursor.getLong(cursor.getColumnIndexOrThrow("has_streaming_sidecar")) == 1) {
            z4 = true;
        }
        r4.A0R = z4;
        r4.A05 = cursor.getInt(cursor.getColumnIndexOrThrow("gif_attribution"));
        r4.A00 = cursor.getFloat(cursor.getColumnIndexOrThrow("thumbnail_height_width_ratio"));
        r4.A0J = cursor.getString(cursor.getColumnIndexOrThrow("direct_path"));
        r4.A0X = cursor.getBlob(cursor.getColumnIndexOrThrow("first_scan_sidecar"));
        r4.A04 = cursor.getInt(cursor.getColumnIndexOrThrow("first_scan_length"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow("file_path"));
        r4.A0O = cursor.getString(cursor.getColumnIndexOrThrow("partial_media_hash"));
        r4.A0N = cursor.getString(cursor.getColumnIndexOrThrow("partial_media_enc_hash"));
        r4.A0M = cursor.getString(cursor.getColumnIndexOrThrow("media_upload_handle"));
        boolean z5 = false;
        if (cursor.getLong(cursor.getColumnIndexOrThrow("mute_video")) == 1) {
            z5 = true;
        }
        r4.A0T = z5;
        if (string == null) {
            file = null;
        } else {
            file = new File(string);
        }
        r4.A0I = this.A00.A06(file);
        r4.A0P = cursor.getString(cursor.getColumnIndexOrThrow("raw_transcription_text"));
        return r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x01ac, code lost:
        if (r1 != false) goto L_0x01ae;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0332 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x02b3 A[Catch:{ all -> 0x033d, all -> 0x0342, all -> 0x0347 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass3T1 r34) {
        /*
            r33 = this;
            r8 = r34
            boolean r0 = r8 instanceof X.AnonymousClass2bU
            if (r0 == 0) goto L_0x03a4
            X.3Qa r7 = r8.A1J
            X.11F r0 = r7.A00
            boolean r0 = r0 instanceof X.C177548dy
            if (r0 != 0) goto L_0x03a4
            long r0 = r8.A1N
            r20 = 0
            r6 = 0
            r5 = 1
            int r3 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            r2 = 0
            if (r3 <= 0) goto L_0x001a
            r2 = 1
        L_0x001a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaCoreMessageStore/insertOrUpdateMessage/message must have row_id set; key="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            X.C18740tg.A0E(r2, r0)
            r4 = r8
            X.2bU r4 = (X.AnonymousClass2bU) r4
            int r0 = r8.A0H()
            r2 = 0
            if (r0 != r5) goto L_0x0039
            r2 = 1
        L_0x0039:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaCoreMessageStore/insertOrUpdateMessage/message in main storage; key="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            X.C18740tg.A0E(r2, r0)
            r3 = r33
            X.12P r0 = r3.A03
            r32 = r0
            X.1M0 r23 = r32.A05()
            X.71s r22 = r23.B1k()     // Catch:{ all -> 0x0397 }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x038d }
            r2.<init>()     // Catch:{ all -> 0x038d }
            X.3Qj r9 = r4.A01     // Catch:{ all -> 0x038d }
            if (r9 == 0) goto L_0x0155
            X.C18740tg.A06(r9)     // Catch:{ all -> 0x038d }
            boolean r1 = r9.A0Q     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "autotransfer_retry_enabled"
            X.AnonymousClass3SW.A02(r2, r0, r1)     // Catch:{ all -> 0x038d }
            java.lang.String r1 = r9.A0L     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "media_job_uuid"
            X.AnonymousClass3SW.A01(r2, r0, r1)     // Catch:{ all -> 0x038d }
            boolean r1 = r9.A0V     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "transferred"
            X.AnonymousClass3SW.A02(r2, r0, r1)     // Catch:{ all -> 0x038d }
            boolean r1 = r9.A0U     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "transcoded"
            X.AnonymousClass3SW.A02(r2, r0, r1)     // Catch:{ all -> 0x038d }
            long r0 = r9.A0C     // Catch:{ all -> 0x038d }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "file_size"
            r2.put(r0, r1)     // Catch:{ all -> 0x038d }
            int r0 = r9.A09     // Catch:{ all -> 0x038d }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "suspicious_content"
            r2.put(r0, r1)     // Catch:{ all -> 0x038d }
            long r0 = r9.A0F     // Catch:{ all -> 0x038d }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "trim_from"
            r2.put(r0, r1)     // Catch:{ all -> 0x038d }
            long r0 = r9.A0G     // Catch:{ all -> 0x038d }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "trim_to"
            r2.put(r0, r1)     // Catch:{ all -> 0x038d }
            int r0 = r9.A02     // Catch:{ all -> 0x038d }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "face_x"
            r2.put(r0, r1)     // Catch:{ all -> 0x038d }
            int r0 = r9.A03     // Catch:{ all -> 0x038d }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "face_y"
            r2.put(r0, r1)     // Catch:{ all -> 0x038d }
            byte[] r1 = r9.A0a     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "media_key"
            X.AnonymousClass3SW.A03(r2, r0, r1)     // Catch:{ all -> 0x038d }
            long r0 = r9.A0D     // Catch:{ all -> 0x038d }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "media_key_timestamp"
            r2.put(r0, r1)     // Catch:{ all -> 0x038d }
            int r0 = r9.A0A     // Catch:{ all -> 0x038d }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "width"
            r2.put(r0, r1)     // Catch:{ all -> 0x038d }
            int r0 = r9.A06     // Catch:{ all -> 0x038d }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "height"
            r2.put(r0, r1)     // Catch:{ all -> 0x038d }
            boolean r1 = r9.A0R     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "has_streaming_sidecar"
            X.AnonymousClass3SW.A02(r2, r0, r1)     // Catch:{ all -> 0x038d }
            int r0 = r9.A05     // Catch:{ all -> 0x038d }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "gif_attribution"
            r2.put(r0, r1)     // Catch:{ all -> 0x038d }
            float r0 = r9.A00     // Catch:{ all -> 0x038d }
            java.lang.Float r1 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "thumbnail_height_width_ratio"
            r2.put(r0, r1)     // Catch:{ all -> 0x038d }
            java.lang.String r1 = r9.A0J     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "direct_path"
            X.AnonymousClass3SW.A01(r2, r0, r1)     // Catch:{ all -> 0x038d }
            byte[] r1 = r9.A0X     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "first_scan_sidecar"
            X.AnonymousClass3SW.A03(r2, r0, r1)     // Catch:{ all -> 0x038d }
            int r0 = r9.A04     // Catch:{ all -> 0x038d }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "first_scan_length"
            r2.put(r0, r1)     // Catch:{ all -> 0x038d }
            java.io.File r10 = r9.A0I     // Catch:{ all -> 0x038d }
            java.lang.String r1 = "file_path"
            if (r10 == 0) goto L_0x01a7
            X.179 r0 = r3.A00     // Catch:{ all -> 0x038d }
            java.lang.String r0 = r0.A08(r10)     // Catch:{ all -> 0x038d }
            r2.put(r1, r0)     // Catch:{ all -> 0x038d }
        L_0x0132:
            java.lang.String r1 = r9.A0O     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "partial_media_hash"
            X.AnonymousClass3SW.A01(r2, r0, r1)     // Catch:{ all -> 0x038d }
            java.lang.String r1 = r9.A0N     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "partial_media_enc_hash"
            X.AnonymousClass3SW.A01(r2, r0, r1)     // Catch:{ all -> 0x038d }
            java.lang.String r1 = r9.A0M     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "media_upload_handle"
            X.AnonymousClass3SW.A01(r2, r0, r1)     // Catch:{ all -> 0x038d }
            boolean r1 = r9.A0T     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "mute_video"
            X.AnonymousClass3SW.A02(r2, r0, r1)     // Catch:{ all -> 0x038d }
            java.lang.String r1 = r9.A0P     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "raw_transcription_text"
            X.AnonymousClass3SW.A01(r2, r0, r1)     // Catch:{ all -> 0x038d }
        L_0x0155:
            long r0 = r4.A1N     // Catch:{ all -> 0x038d }
            r30 = r0
            X.163 r1 = r3.A01     // Catch:{ all -> 0x038d }
            X.3Qa r0 = r4.A1J     // Catch:{ all -> 0x038d }
            X.11F r0 = r0.A00     // Catch:{ all -> 0x038d }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x038d }
            long r18 = r1.A08(r0)     // Catch:{ all -> 0x038d }
            java.lang.String r0 = r4.A08     // Catch:{ all -> 0x038d }
            r29 = r0
            java.lang.String r0 = r4.A07     // Catch:{ all -> 0x038d }
            r28 = r0
            java.lang.String r0 = r4.A05     // Catch:{ all -> 0x038d }
            r27 = r0
            long r0 = r4.A00     // Catch:{ all -> 0x038d }
            r25 = r0
            java.lang.String r17 = r4.A1b()     // Catch:{ all -> 0x038d }
            java.lang.String r14 = r4.A04     // Catch:{ all -> 0x038d }
            boolean r0 = r4 instanceof X.C46972by     // Catch:{ all -> 0x038d }
            r13 = 0
            if (r0 == 0) goto L_0x019f
            r1 = r4
            X.2by r1 = (X.C46972by) r1     // Catch:{ all -> 0x038d }
            int r0 = r1.A00     // Catch:{ all -> 0x038d }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x038d }
            java.lang.String r0 = r1.A01     // Catch:{ all -> 0x038d }
            r24 = r0
            r16 = 0
        L_0x0190:
            java.lang.String r11 = r4.A03     // Catch:{ all -> 0x038d }
            boolean r1 = r4 instanceof X.C46962bx     // Catch:{ all -> 0x038d }
            if (r1 == 0) goto L_0x01ab
            r0 = r4
            X.2bx r0 = (X.C46962bx) r0     // Catch:{ all -> 0x038d }
            boolean r0 = r0.A03     // Catch:{ all -> 0x038d }
            r10 = 1
            if (r0 != 0) goto L_0x01ae
            goto L_0x01ab
        L_0x019f:
            int r0 = r4.A0B     // Catch:{ all -> 0x038d }
            r16 = r0
            r12 = r13
            r24 = r13
            goto L_0x0190
        L_0x01a7:
            r2.putNull(r1)     // Catch:{ all -> 0x038d }
            goto L_0x0132
        L_0x01ab:
            r10 = 0
            if (r1 == 0) goto L_0x01b3
        L_0x01ae:
            r0 = r4
            X.2bx r0 = (X.C46962bx) r0     // Catch:{ all -> 0x038d }
            java.lang.Integer r13 = r0.A01     // Catch:{ all -> 0x038d }
        L_0x01b3:
            java.lang.String r1 = r4.A09     // Catch:{ all -> 0x038d }
            java.lang.Long r0 = java.lang.Long.valueOf(r30)     // Catch:{ all -> 0x038d }
            java.lang.String r9 = "message_row_id"
            r2.put(r9, r0)     // Catch:{ all -> 0x038d }
            java.lang.Long r15 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "chat_row_id"
            r2.put(r0, r15)     // Catch:{ all -> 0x038d }
            java.lang.String r15 = "multicast_id"
            r0 = r29
            X.AnonymousClass3SW.A01(r2, r15, r0)     // Catch:{ all -> 0x038d }
            java.lang.String r15 = "message_url"
            r0 = r28
            X.AnonymousClass3SW.A01(r2, r15, r0)     // Catch:{ all -> 0x038d }
            java.lang.String r15 = "mime_type"
            r0 = r27
            X.AnonymousClass3SW.A01(r2, r15, r0)     // Catch:{ all -> 0x038d }
            java.lang.Long r15 = java.lang.Long.valueOf(r25)     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "file_length"
            r2.put(r0, r15)     // Catch:{ all -> 0x038d }
            java.lang.String r15 = "media_name"
            r0 = r17
            X.AnonymousClass3SW.A01(r2, r15, r0)     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "file_hash"
            X.AnonymousClass3SW.A01(r2, r0, r14)     // Catch:{ all -> 0x038d }
            java.lang.String r14 = "media_duration"
            java.lang.Integer r15 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "page_count"
            if (r12 == 0) goto L_0x0233
            r2.put(r0, r12)     // Catch:{ all -> 0x038d }
            r2.put(r14, r15)     // Catch:{ all -> 0x038d }
        L_0x0201:
            java.lang.String r12 = "media_caption"
            r0 = r24
            X.AnonymousClass3SW.A01(r2, r12, r0)     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "enc_file_hash"
            X.AnonymousClass3SW.A01(r2, r0, r11)     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "is_animated_sticker"
            X.AnonymousClass3SW.A02(r2, r0, r10)     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "sticker_flags"
            r2.put(r0, r13)     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "original_file_hash"
            X.AnonymousClass3SW.A01(r2, r0, r1)     // Catch:{ all -> 0x038d }
            r0 = r23
            X.14e r11 = r0.A02     // Catch:{ all -> 0x038d }
            java.lang.String r10 = "message_media"
            java.lang.String r0 = "INSERT_MESSAGE_MEDIA_SQL"
            long r12 = r11.A04(r10, r0, r2)     // Catch:{ all -> 0x038d }
            int r0 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x0351
            long r1 = r8.A1N     // Catch:{ all -> 0x038d }
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x023f
            goto L_0x023e
        L_0x0233:
            r2.put(r0, r15)     // Catch:{ all -> 0x038d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x038d }
            r2.put(r14, r0)     // Catch:{ all -> 0x038d }
            goto L_0x0201
        L_0x023e:
            r6 = 1
        L_0x023f:
            java.lang.String r0 = "MediaCoreMessageStore/insertOrUpdateMessage/inserted row should have same row_id"
            X.C18740tg.A0F(r6, r0)     // Catch:{ all -> 0x038d }
            X.3Qj r2 = r4.A01     // Catch:{ all -> 0x038d }
            long r0 = r4.A1N     // Catch:{ all -> 0x038d }
            r24 = r0
            java.lang.String r8 = "sort_order"
            if (r2 == 0) goto L_0x0386
            com.whatsapp.InteractiveAnnotation[] r0 = r2.A0b     // Catch:{ all -> 0x038d }
            if (r0 == 0) goto L_0x0386
            X.1M0 r5 = r32.A05()     // Catch:{ all -> 0x038d }
            X.71s r20 = r5.B1k()     // Catch:{ all -> 0x0347 }
            com.whatsapp.InteractiveAnnotation[] r7 = r2.A0b     // Catch:{ all -> 0x033d }
            int r6 = r7.length     // Catch:{ all -> 0x033d }
            r4 = 0
            r19 = 0
        L_0x0260:
            if (r4 >= r6) goto L_0x0336
            r10 = r7[r4]     // Catch:{ all -> 0x033d }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x033d }
            r2.<init>()     // Catch:{ all -> 0x033d }
            java.lang.Long r0 = java.lang.Long.valueOf(r24)     // Catch:{ all -> 0x033d }
            r2.put(r9, r0)     // Catch:{ all -> 0x033d }
            java.lang.String r1 = "skip_confirmation"
            boolean r0 = r10.skipConfirmation     // Catch:{ all -> 0x033d }
            X.AnonymousClass3SW.A02(r2, r1, r0)     // Catch:{ all -> 0x033d }
            java.lang.Object r11 = r10.data     // Catch:{ all -> 0x033d }
            boolean r0 = r11 instanceof com.whatsapp.SerializableLocation     // Catch:{ all -> 0x033d }
            if (r0 == 0) goto L_0x02b8
            com.whatsapp.SerializableLocation r11 = (com.whatsapp.SerializableLocation) r11     // Catch:{ all -> 0x033d }
            java.lang.String r12 = "location_latitude"
            double r0 = r11.latitude     // Catch:{ all -> 0x033d }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x033d }
            r2.put(r12, r0)     // Catch:{ all -> 0x033d }
            java.lang.String r12 = "location_longitude"
            double r0 = r11.longitude     // Catch:{ all -> 0x033d }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x033d }
            r2.put(r12, r0)     // Catch:{ all -> 0x033d }
            java.lang.String r1 = "location_name"
            java.lang.String r0 = r11.name     // Catch:{ all -> 0x033d }
        L_0x0299:
            r2.put(r1, r0)     // Catch:{ all -> 0x033d }
        L_0x029c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)     // Catch:{ all -> 0x033d }
            r2.put(r8, r0)     // Catch:{ all -> 0x033d }
            X.14e r13 = r5.A02     // Catch:{ all -> 0x033d }
            java.lang.String r1 = "message_media_interactive_annotation"
            java.lang.String r0 = "INSERT_MESSAGE_MEDIA_INTERACTIVE_ANNOTATION_SQL"
            long r17 = r13.A04(r1, r0, r2)     // Catch:{ all -> 0x033d }
            int r19 = r19 + 1
            com.whatsapp.SerializablePoint[] r12 = r10.polygonVertices     // Catch:{ all -> 0x033d }
            if (r12 == 0) goto L_0x0332
            int r11 = r12.length     // Catch:{ all -> 0x033d }
            r10 = 0
            r16 = 0
            goto L_0x02f7
        L_0x02b8:
            boolean r0 = r11 instanceof X.C63393Jw     // Catch:{ all -> 0x033d }
            if (r0 == 0) goto L_0x029c
            X.3Jw r11 = (X.C63393Jw) r11     // Catch:{ all -> 0x033d }
            X.12j r1 = r3.A02     // Catch:{ all -> 0x033d }
            X.1Uw r0 = r11.A01     // Catch:{ all -> 0x033d }
            long r12 = r1.A07(r0)     // Catch:{ all -> 0x033d }
            java.lang.String r1 = "newsletter_jid_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x033d }
            r2.put(r1, r0)     // Catch:{ all -> 0x033d }
            java.lang.String r1 = "newsletter_server_message_id"
            int r0 = r11.A00     // Catch:{ all -> 0x033d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x033d }
            r2.put(r1, r0)     // Catch:{ all -> 0x033d }
            java.lang.String r1 = "newsletter_name"
            java.lang.String r0 = r11.A04     // Catch:{ all -> 0x033d }
            r2.put(r1, r0)     // Catch:{ all -> 0x033d }
            X.2pG r0 = r11.A02     // Catch:{ all -> 0x033d }
            java.lang.String r1 = "newsletter_content_type"
            if (r0 == 0) goto L_0x02f5
            int r0 = r0.value     // Catch:{ all -> 0x033d }
        L_0x02e9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x033d }
            r2.put(r1, r0)     // Catch:{ all -> 0x033d }
            java.lang.String r1 = "newsletter_accessibility_text"
            java.lang.String r0 = r11.A03     // Catch:{ all -> 0x033d }
            goto L_0x0299
        L_0x02f5:
            r0 = 0
            goto L_0x02e9
        L_0x02f7:
            if (r10 >= r11) goto L_0x0332
            r15 = r12[r10]     // Catch:{ all -> 0x033d }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x033d }
            r2.<init>()     // Catch:{ all -> 0x033d }
            java.lang.String r1 = "message_media_interactive_annotation_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x033d }
            r2.put(r1, r0)     // Catch:{ all -> 0x033d }
            java.lang.String r14 = "x"
            double r0 = r15.x     // Catch:{ all -> 0x033d }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x033d }
            r2.put(r14, r0)     // Catch:{ all -> 0x033d }
            java.lang.String r14 = "y"
            double r0 = r15.y     // Catch:{ all -> 0x033d }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x033d }
            r2.put(r14, r0)     // Catch:{ all -> 0x033d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x033d }
            r2.put(r8, r0)     // Catch:{ all -> 0x033d }
            java.lang.String r1 = "message_media_interactive_annotation_vertex"
            java.lang.String r0 = "INSERT_MESSAGE_MEDIA_INTERACTIVE_ANNOTATION_VERTEX_SQL"
            r13.A04(r1, r0, r2)     // Catch:{ all -> 0x033d }
            int r16 = r16 + 1
            int r10 = r10 + 1
            goto L_0x02f7
        L_0x0332:
            int r4 = r4 + 1
            goto L_0x0260
        L_0x0336:
            r20.A00()     // Catch:{ all -> 0x033d }
            r20.close()     // Catch:{ all -> 0x0347 }
            goto L_0x0383
        L_0x033d:
            r1 = move-exception
            r20.close()     // Catch:{ all -> 0x0342 }
            goto L_0x0346
        L_0x0342:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0347 }
        L_0x0346:
            throw r1     // Catch:{ all -> 0x0347 }
        L_0x0347:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x034c }
            goto L_0x0350
        L_0x034c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x038d }
        L_0x0350:
            throw r1     // Catch:{ all -> 0x038d }
        L_0x0351:
            r2.remove(r9)     // Catch:{ all -> 0x038d }
            java.lang.String r14 = "message_row_id = ?"
            java.lang.String[] r3 = new java.lang.String[r5]     // Catch:{ all -> 0x038d }
            long r0 = r8.A1N     // Catch:{ all -> 0x038d }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x038d }
            r3[r6] = r0     // Catch:{ all -> 0x038d }
            java.lang.String r15 = "UPDATE_MESSAGE_MEDIA_SQL"
            r12 = r2
            r13 = r10
            r16 = r3
            int r0 = r11.A01(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x038d }
            if (r0 == r5) goto L_0x0386
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x038d }
            r1.<init>()     // Catch:{ all -> 0x038d }
            java.lang.String r0 = "MediaCoreMessageStore/insertOrUpdateMessage/Failed to update message media; key="
            r1.append(r0)     // Catch:{ all -> 0x038d }
            r1.append(r7)     // Catch:{ all -> 0x038d }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x038d }
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x038d }
            r0.<init>(r1)     // Catch:{ all -> 0x038d }
            throw r0     // Catch:{ all -> 0x038d }
        L_0x0383:
            r5.close()     // Catch:{ all -> 0x038d }
        L_0x0386:
            r22.A00()     // Catch:{ all -> 0x038d }
            r22.close()     // Catch:{ all -> 0x0397 }
            goto L_0x03a1
        L_0x038d:
            r1 = move-exception
            r22.close()     // Catch:{ all -> 0x0392 }
            goto L_0x0396
        L_0x0392:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0397 }
        L_0x0396:
            throw r1     // Catch:{ all -> 0x0397 }
        L_0x0397:
            r1 = move-exception
            r23.close()     // Catch:{ all -> 0x039c }
            throw r1
        L_0x039c:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x03a1:
            r23.close()
        L_0x03a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1DG.A02(X.3T1):void");
    }

    public void A03(AnonymousClass2bU r7, boolean z, boolean z2) {
        File file;
        C65013Qj r0 = r7.A01;
        if (r0 != null && (file = r0.A0I) != null) {
            this.A05.A05(file, r7.A1I, 1, z | C66013Ui.A0y(r7), z2);
        }
    }

    public AnonymousClass1DG(C24041Av r1, AnonymousClass179 r2, AnonymousClass163 r3, C219712j r4, AnonymousClass12P r5, C219612i r6, C20810yC r7) {
        this.A04 = r7;
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
        this.A06 = r6;
        this.A03 = r5;
        this.A05 = r1;
    }
}
