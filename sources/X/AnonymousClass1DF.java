package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDiskIOException;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.1DF  reason: invalid class name */
public class AnonymousClass1DF {
    public static final String[] A0G = new String[0];
    public final C20690y0 A00;
    public final C19630wG A01;
    public final AnonymousClass163 A02;
    public final C20310xM A03;
    public final AnonymousClass1DG A04;
    public final C24061Ay A05;
    public final AnonymousClass12T A06;
    public final C220612s A07;
    public final AnonymousClass12P A08;
    public final AnonymousClass17U A09;
    public final C20810yC A0A;
    public final C19890wg A0B;
    public final C23981Ap A0C;
    public final AnonymousClass1A1 A0D;
    public final C19700wN A0E;
    public final AnonymousClass179 A0F;

    public AnonymousClass2bU A0B(String str) {
        Cursor A092;
        if (str == null) {
            return null;
        }
        AnonymousClass1M0 A042 = this.A08.get();
        try {
            A092 = A042.A02.A09("SELECT message_row_id, chat_row_id, autotransfer_retry_enabled, multicast_id, media_job_uuid, transferred, transcoded, file_path, file_size, suspicious_content, trim_from, trim_to, face_x, face_y, media_key, media_key_timestamp, width, height, has_streaming_sidecar, gif_attribution, thumbnail_height_width_ratio, direct_path, first_scan_sidecar, first_scan_length, message_url, mime_type, file_length, media_name, file_hash, media_duration, page_count, enc_file_hash, partial_media_hash, partial_media_enc_hash, is_animated_sticker, original_file_hash, mute_video, media_caption, media_upload_handle, sticker_flags, raw_transcription_text FROM message_media WHERE original_file_hash = ?", "SELECT_ORIGINAL_MESSAGE_FROM_ORIGINAL_FILE_HASH", new String[]{str});
            if (A092.moveToNext()) {
                AnonymousClass3T1 A012 = this.A0D.A01.A01(A092.getLong(A092.getColumnIndexOrThrow("message_row_id")));
                if (A012 instanceof AnonymousClass2bU) {
                    AnonymousClass2bU r1 = (AnonymousClass2bU) A012;
                    A092.close();
                    A042.close();
                    return r1;
                }
            }
            A092.close();
            A042.close();
            return null;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public ArrayList A0F(String str, int i) {
        File file;
        ArrayList A0D2 = A0D((C02680Bk) null, str, i);
        ArrayList arrayList = new ArrayList(A0D2.size());
        Iterator it = A0D2.iterator();
        while (it.hasNext()) {
            AnonymousClass2bU r2 = (AnonymousClass2bU) it.next();
            C65013Qj r1 = r2.A01;
            if (r1 != null && r1.A0V && (file = r1.A0I) != null && file.exists()) {
                arrayList.add(r2);
            }
        }
        return arrayList;
    }

    private String[] A00(AnonymousClass11F r5, long j) {
        ArrayList arrayList = new ArrayList();
        if (r5 != null) {
            arrayList.add(String.valueOf(this.A02.A08(r5)));
        }
        if (j > 0) {
            arrayList.add(String.valueOf(j));
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(A0G);
    }

    public int A01(AnonymousClass4QI r9, AnonymousClass11F r10, int i) {
        Cursor A092;
        C65013Qj r1;
        File file;
        StringBuilder sb = new StringBuilder();
        sb.append("mediamsgstore/getMediaMessagesCount:");
        sb.append(r10);
        Log.i(sb.toString());
        C224214g r6 = new C224214g(false);
        r6.A04("mediamsgstore/getMediaMessagesCount/");
        String str = C56892xB.A0A;
        int i2 = 0;
        String[] strArr = {String.valueOf(this.A02.A08(r10))};
        try {
            AnonymousClass1M0 A042 = this.A08.get();
            try {
                A092 = A042.A02.A09(str, "GET_MEDIA_MESSAGES_SQL_ORDER_BY_SORT_ID", strArr);
                while (A092.moveToNext() && !r9.BtY()) {
                    AnonymousClass3T1 A012 = this.A0D.A01(A092, r10);
                    if ((A012 instanceof AnonymousClass2bU) && (r1 = ((AnonymousClass2bU) A012).A01) != null) {
                        if ((A012.A1J.A02 || r1.A0V) && (file = r1.A0I) != null && new File(Uri.fromFile(file).getPath()).exists() && (i2 = i2 + 1) > i) {
                            A092.close();
                            A042.close();
                            return i2;
                        }
                    }
                }
                A092.close();
                A042.close();
                r6.A01();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("mediamsgstore/getMediaMessagesCount/count:");
                sb2.append(i2);
                Log.i(sb2.toString());
                return i2;
            } catch (Throwable th) {
                A042.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDiskIOException e) {
            this.A06.A00(1);
            throw e;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public Cursor A02(AnonymousClass11F r9) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("mediamsgstore/getMediaMessagesCursor:");
        sb.append(r9);
        Log.i(sb.toString());
        AnonymousClass1M0 A042 = this.A08.get();
        try {
            boolean A012 = C20800yB.A01(C21000yV.A02, this.A0A, 6550);
            if (A012) {
                str = "GET_MEDIA_ITEMS_ORDER_BY_SORT_ID";
            } else {
                str = "GET_MEDIA_MESSAGES_SQL_ORDER_BY_SORT_ID";
            }
            if (A012) {
                str2 = C56892xB.A04;
            } else {
                str2 = C56892xB.A0A;
            }
            Cursor A092 = A042.A02.A09(str2, str, new String[]{String.valueOf(this.A02.A08(r9))});
            A042.close();
            return A092;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public Cursor A03(AnonymousClass11F r8, int i) {
        AnonymousClass1M0 A042 = this.A08.get();
        try {
            Cursor A092 = A042.A02.A09(AnonymousClass2xD.A08, "GET_MEDIA_MESSAGES_BY_TYPE_SQL", new String[]{String.valueOf(this.A02.A08(r8)), Integer.toString(i)});
            A042.close();
            return A092;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public Cursor A04(AnonymousClass11F r9, int i, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("mediamsgstore/getMediaMessagesHeadCursor:");
        sb.append(r9);
        Log.i(sb.toString());
        AnonymousClass1M0 A042 = this.A08.get();
        try {
            StringBuilder sb2 = new StringBuilder(C56892xB.A0B);
            AnonymousClass17W.A02(sb2, true);
            if (i > 0) {
                sb2.append(" LIMIT ");
                sb2.append(i);
            }
            String obj = sb2.toString();
            Cursor A092 = A042.A02.A09(obj, "GET_MEDIA_MESSAGES_HEAD_CURSOR", new String[]{String.valueOf(this.A02.A08(r9)), String.valueOf(this.A09.A04(j))});
            A042.close();
            return A092;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public Cursor A05(AnonymousClass11F r8, int i, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("mediamsgstore/getMediaMessagesTailCursor:");
        sb.append(r8);
        Log.i(sb.toString());
        AnonymousClass1M0 A042 = this.A08.get();
        try {
            StringBuilder sb2 = new StringBuilder(C56892xB.A0B);
            AnonymousClass17W.A02(sb2, false);
            if (i > 0) {
                sb2.append(" LIMIT ");
                sb2.append(i);
            }
            String obj = sb2.toString();
            Cursor A092 = A042.A02.A09(obj, "GET_MEDIA_MESSAGES_TAIL_CURSOR", new String[]{String.valueOf(this.A02.A08(r8)), String.valueOf(this.A09.A04(j))});
            A042.close();
            return A092;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public Cursor A06(AnonymousClass11F r11, long j) {
        StringBuilder sb;
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("mediamsgstore/getMediaMessagesOrderedBySizeCursor jid:");
        sb2.append(r11);
        sb2.append(", fileSize:");
        sb2.append(j);
        Log.i(sb2.toString());
        AnonymousClass1M0 A042 = this.A08.get();
        boolean z = false;
        if (r11 != null) {
            z = true;
        }
        try {
            boolean A012 = C20800yB.A01(C21000yV.A02, this.A0A, 6261);
            C74003ku r0 = C74003ku.$redex_init_class;
            String str2 = " AND file_size > ?";
            String str3 = " AND message.chat_row_id = ?";
            if (A012) {
                sb = new StringBuilder();
                str = C56892xB.A01;
            } else {
                sb = new StringBuilder();
                str = C56892xB.A00;
            }
            sb.append(str);
            if (!z) {
                str3 = "";
            }
            sb.append(str3);
            if (j <= 0) {
                str2 = "";
            }
            sb.append(str2);
            sb.append(" ORDER BY file_size DESC");
            Cursor A092 = A042.A02.A09(sb.toString(), "GET_MEDIA_AND_DOC_MESSAGES_JOIN_MESSAGE_MEDIA_UNSORTED_ORDER_BY_FILE_SIZE_DESC", A00(r11, j));
            A042.close();
            return A092;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public Cursor A07(AnonymousClass11F r7, long j) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("mediamsgstore/getMediaMessagesOrderedByIDAscCursor jid:");
        sb.append(r7);
        sb.append(", fileSize:");
        sb.append(j);
        Log.i(sb.toString());
        AnonymousClass1M0 A042 = this.A08.get();
        boolean z = false;
        if (r7 != null) {
            z = true;
        }
        try {
            String A002 = C74003ku.A00(j, z, true);
            String[] A003 = A00(r7, j);
            if (j > 0) {
                str = "GET_MEDIA_AND_DOC_MESSAGES_JOIN_MESSAGE_MEDIA_UNSORTED_ORDER_BY_SORT_ID_ASC";
            } else {
                str = "GET_MEDIA_AND_DOC_MESSAGES_UNSORTED_ORDER_BY_SORT_ID_ASC";
            }
            Cursor A092 = A042.A02.A09(A002, str, A003);
            A042.close();
            return A092;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public Cursor A08(AnonymousClass11F r7, long j) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("mediamsgstore/getMediaAndDocMessagesOrderedByIDDescCursor jid:");
        sb.append(r7);
        sb.append(", fileSize:");
        sb.append(j);
        Log.i(sb.toString());
        AnonymousClass1M0 A042 = this.A08.get();
        boolean z = false;
        if (r7 != null) {
            z = true;
        }
        try {
            String A002 = C74003ku.A00(j, z, false);
            String[] A003 = A00(r7, j);
            if (j > 0) {
                str = "GET_MEDIA_AND_DOC_MESSAGES_JOIN_MESSAGE_MEDIA_UNSORTED_ORDER_BY_SORT_ID_DESC";
            } else {
                str = "GET_MEDIA_AND_DOC_MESSAGES_UNSORTED_ORDER_BY_SORT_ID_DESC";
            }
            Cursor A092 = A042.A02.A09(A002, str, A003);
            A042.close();
            return A092;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public ArrayList A0C(C02680Bk r5, File file, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = A0D(r5, str, -1).iterator();
        while (it.hasNext()) {
            AnonymousClass2bU r1 = (AnonymousClass2bU) it.next();
            C65013Qj r0 = r1.A01;
            if (r0 != null && file.equals(r0.A0I)) {
                arrayList.add(r1);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006c, code lost:
        r7 = (X.AnonymousClass2bU) r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A0E(X.AnonymousClass4QI r11, X.AnonymousClass11F r12, int r13, int r14) {
        /*
            r10 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "mediamsgstore/getMediaMessages:"
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " limit:"
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r8 = 0
            X.14g r6 = new X.14g
            r6.<init>((boolean) r8)
            java.lang.String r0 = "mediamsgstore/getMediaMessages/"
            r6.A04(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.163 r0 = r10.A02
            long r0 = r0.A08(r12)
            java.lang.String r9 = java.lang.String.valueOf(r0)
            r0 = 2
            if (r14 != r0) goto L_0x003f
            java.lang.String r7 = X.C56892xB.A09
            java.lang.String r5 = "GET_MEDIA_MESSAGES_FOR_EXPORT"
        L_0x003d:
            r2 = 1
            goto L_0x0044
        L_0x003f:
            java.lang.String r7 = X.C56892xB.A0A
            java.lang.String r5 = "GET_MEDIA_MESSAGES_SQL_ORDER_BY_SORT_ID"
            goto L_0x003d
        L_0x0044:
            X.12P r0 = r10.A08     // Catch:{ SQLiteDiskIOException -> 0x00d4 }
            X.1M0 r4 = r0.get()     // Catch:{ SQLiteDiskIOException -> 0x00d4 }
            X.14e r1 = r4.A02     // Catch:{ all -> 0x00ca }
            java.lang.String[] r0 = new java.lang.String[r2]     // Catch:{ all -> 0x00ca }
            r0[r8] = r9     // Catch:{ all -> 0x00ca }
            android.database.Cursor r5 = r1.A09(r7, r5, r0)     // Catch:{ all -> 0x00ca }
        L_0x0054:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x009c
            if (r11 == 0) goto L_0x0062
            boolean r0 = r11.BtY()     // Catch:{ all -> 0x00be }
            if (r0 != 0) goto L_0x009c
        L_0x0062:
            X.1A1 r0 = r10.A0D     // Catch:{ all -> 0x00be }
            X.3T1 r7 = r0.A01(r5, r12)     // Catch:{ all -> 0x00be }
            boolean r0 = r7 instanceof X.AnonymousClass2bU     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x0054
            X.2bU r7 = (X.AnonymousClass2bU) r7     // Catch:{ all -> 0x00be }
            X.3Qj r1 = r7.A01     // Catch:{ all -> 0x00be }
            if (r1 == 0) goto L_0x0054
            X.3Qa r0 = r7.A1J     // Catch:{ all -> 0x00be }
            boolean r0 = r0.A02     // Catch:{ all -> 0x00be }
            if (r0 != 0) goto L_0x007c
            boolean r0 = r1.A0V     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x0054
        L_0x007c:
            java.io.File r0 = r1.A0I     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x0054
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ all -> 0x00be }
            java.lang.String r1 = r0.getPath()     // Catch:{ all -> 0x00be }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00be }
            r0.<init>(r1)     // Catch:{ all -> 0x00be }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x0054
            r3.add(r7)     // Catch:{ all -> 0x00be }
            int r0 = r3.size()     // Catch:{ all -> 0x00be }
            if (r0 < r13) goto L_0x0054
        L_0x009c:
            r5.close()     // Catch:{ all -> 0x00ca }
            r4.close()     // Catch:{ SQLiteDiskIOException -> 0x00d4 }
            r6.A01()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "mediamsgstore/getMediaMessages/size:"
            r1.append(r0)
            int r0 = r3.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r3
        L_0x00be:
            r1 = move-exception
            if (r5 == 0) goto L_0x00c9
            r5.close()     // Catch:{ all -> 0x00c5 }
            goto L_0x00c9
        L_0x00c5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00ca }
        L_0x00c9:
            throw r1     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x00cf }
            goto L_0x00d3
        L_0x00cf:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDiskIOException -> 0x00d4 }
        L_0x00d3:
            throw r1     // Catch:{ SQLiteDiskIOException -> 0x00d4 }
        L_0x00d4:
            r1 = move-exception
            X.12T r0 = r10.A06
            r0.A00(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1DF.A0E(X.4QI, X.11F, int, int):java.util.ArrayList");
    }

    public AnonymousClass1DF(C19700wN r2, C20690y0 r3, AnonymousClass179 r4, C19630wG r5, AnonymousClass163 r6, C20310xM r7, AnonymousClass1DG r8, C24061Ay r9, AnonymousClass12T r10, C220612s r11, AnonymousClass12P r12, AnonymousClass17U r13, C20810yC r14, C19890wg r15, C23981Ap r16, AnonymousClass1A1 r17) {
        this.A0A = r14;
        this.A02 = r6;
        this.A01 = r5;
        this.A0E = r2;
        this.A00 = r3;
        this.A09 = r13;
        this.A0F = r4;
        this.A0C = r16;
        this.A05 = r9;
        this.A0D = r17;
        this.A03 = r7;
        this.A06 = r10;
        this.A08 = r12;
        this.A04 = r8;
        this.A0B = r15;
        this.A07 = r11;
    }

    public C123785x5 A09(String str, int i, boolean z) {
        String str2;
        String str3;
        String[] strArr;
        Cursor A092;
        C123785x5 r12;
        String str4;
        C18740tg.A00();
        AnonymousClass1M0 A042 = this.A08.get();
        int i2 = i;
        if (i2 == -1 || i == 0) {
            if (C20800yB.A01(C21000yV.A02, this.A0A, 6261)) {
                str4 = C56892xB.A0F;
            } else {
                str4 = C56892xB.A0E;
            }
            str3 = "GET_MEDIA_MESSAGE_FILE_BY_HASH_SQL";
            strArr = new String[]{str};
        } else {
            try {
                if (C20800yB.A01(C21000yV.A02, this.A0A, 6261)) {
                    str2 = C56892xB.A0D;
                } else {
                    str2 = C56892xB.A0C;
                }
                str3 = "GET_MEDIA_MESSAGE_FILE_BY_HASH_AND_MEDIA_TYPE_SQL";
                strArr = new String[]{str, Integer.toString(i2)};
            } catch (Throwable th) {
                try {
                    A042.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        try {
            A092 = A042.A02.A09(str2, str3, strArr);
            int columnIndexOrThrow = A092.getColumnIndexOrThrow("enc_file_hash");
            int columnIndexOrThrow2 = A092.getColumnIndexOrThrow("timestamp");
            int columnIndexOrThrow3 = A092.getColumnIndexOrThrow("file_hash");
            int columnIndexOrThrow4 = A092.getColumnIndexOrThrow("message_type");
            int columnIndexOrThrow5 = A092.getColumnIndexOrThrow("media_url");
            int columnIndexOrThrow6 = A092.getColumnIndexOrThrow("mime_type");
            while (A092.moveToNext()) {
                C65013Qj A012 = this.A04.A01(A092);
                String string = A092.getString(columnIndexOrThrow);
                long j = A092.getLong(columnIndexOrThrow2);
                A092.getString(columnIndexOrThrow3);
                byte b = (byte) ((int) A092.getLong(columnIndexOrThrow4));
                String string2 = A092.getString(columnIndexOrThrow5);
                String string3 = A092.getString(columnIndexOrThrow6);
                File file = A012.A0I;
                if (file != null) {
                    file.exists();
                    byte[] bArr = A012.A0a;
                    if (bArr != null && bArr.length == 32) {
                        if (A012.A0V) {
                            if (!A012.A0I.isAbsolute()) {
                                A012.A0I = this.A0F.A07(A012.A0I.getPath());
                            }
                            if (A012.A0I.exists()) {
                                r12 = new C123785x5(A012, string, string2, string3, b, j);
                                A092.close();
                                A042.close();
                                return r12;
                            }
                        }
                    }
                }
                if (!z) {
                    r12 = new C123785x5(A012, string, string2, string3, b, j);
                    A092.close();
                    A042.close();
                    return r12;
                }
            }
            A092.close();
            A042.close();
            return null;
        } catch (SQLiteDiskIOException e) {
            this.A06.A00(1);
            throw e;
        } catch (Throwable th3) {
            th.addSuppressed(th3);
        }
        throw th;
    }

    public C64933Qa A0A(String str, String str2, byte[] bArr, boolean z) {
        String str3;
        Cursor A092;
        C18740tg.A00();
        AnonymousClass1M0 A042 = this.A08.get();
        try {
            C224114e r5 = A042.A02;
            boolean A012 = C20800yB.A01(C21000yV.A02, this.A0A, 6261);
            C74003ku r0 = C74003ku.$redex_init_class;
            if (A012) {
                str3 = C56892xB.A0H;
            } else {
                str3 = C56892xB.A0G;
            }
            A092 = r5.A09(str3, "GET_MEDIA_MESSAGE_KEY_BY_HASHES_SQL", new String[]{str, str2});
            int columnIndexOrThrow = A092.getColumnIndexOrThrow("from_me");
            int columnIndexOrThrow2 = A092.getColumnIndexOrThrow("key_id");
            C64933Qa r10 = null;
            while (A092.moveToNext()) {
                AnonymousClass11F A0B2 = this.A02.A0B(A092);
                if (A0B2 == null) {
                    Log.w("msgstore/getMediaMessageKeyByHashes/jid is null or invalid!");
                } else {
                    boolean z2 = false;
                    if (A092.getInt(columnIndexOrThrow) == 1) {
                        z2 = true;
                    }
                    C64933Qa r6 = new C64933Qa(A0B2, A092.getString(columnIndexOrThrow2), z2);
                    C65013Qj A013 = this.A04.A01(A092);
                    byte[] bArr2 = A013.A0a;
                    if (bArr2 != null && bArr2.length == 32 && A013.A0V && Arrays.equals(bArr2, bArr)) {
                        if (!z) {
                            A092.close();
                            A042.close();
                            return r6;
                        }
                        r10 = r6;
                    }
                }
            }
            A092.close();
            A042.close();
            return r10;
        } catch (SQLiteDiskIOException e) {
            try {
                this.A06.A00(1);
                throw e;
            } catch (Throwable th) {
                try {
                    A042.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th.addSuppressed(th3);
        }
        throw th;
    }

    public ArrayList A0D(C02680Bk r8, String str, int i) {
        String str2;
        String str3;
        String[] strArr;
        String str4;
        C36721lC A0B2;
        C18740tg.A00();
        boolean A012 = C20800yB.A01(C21000yV.A02, this.A0A, 6261);
        if (i == -1) {
            if (A012) {
                str3 = C56892xB.A08;
            } else {
                str3 = C56892xB.A07;
            }
            strArr = new String[]{str};
            str4 = "GET_MEDIA_MESSAGES_BY_HASH_SQL";
        } else {
            if (A012) {
                str2 = C56892xB.A06;
            } else {
                str2 = C56892xB.A05;
            }
            strArr = new String[]{str, Integer.toString(i)};
            str4 = "GET_MEDIA_MESSAGES_BY_HASH_AND_TYPE_SQL";
        }
        ArrayList arrayList = new ArrayList();
        AnonymousClass1M0 A042 = this.A08.get();
        try {
            A0B2 = A042.A02.A0B(r8, str3, str4, strArr);
            while (A0B2.moveToNext()) {
                if (r8 != null) {
                    r8.A04();
                }
                AnonymousClass3T1 A002 = this.A0D.A00(A0B2);
                if (A002 instanceof AnonymousClass2bU) {
                    arrayList.add((AnonymousClass2bU) A002);
                }
            }
            A0B2.close();
            A042.close();
            return arrayList;
        } catch (SQLiteDiskIOException e) {
            try {
                this.A06.A00(1);
                throw e;
            } catch (Throwable th) {
                try {
                    A042.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th.addSuppressed(th3);
        }
        throw th;
    }
}
