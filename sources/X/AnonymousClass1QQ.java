package X;

/* renamed from: X.1QQ  reason: invalid class name */
public class AnonymousClass1QQ {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass005 A03;
    public final AnonymousClass005 A04;
    public final AnonymousClass005 A05;
    public final AnonymousClass005 A06;
    public final C19970wo A07;
    public final AnonymousClass005 A08;
    public final AnonymousClass005 A09;
    public final AnonymousClass005 A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x035f, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        r0.close();
        r1 = r2.A02;
        r1.A03 = "messages.bin";
        r1.A05 = r23;
        r1.A04 = "protobuf";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0680, code lost:
        if (r5 == null) goto L_0x0685;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x06fb, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0705, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:86:0x02b3, B:247:0x06f7] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(android.os.CancellationSignal r48, X.AnonymousClass7fT r49, X.C45822Sv r50, java.io.File r51, long r52) {
        /*
            r47 = this;
            r3 = r47
            X.5yZ r2 = new X.5yZ     // Catch:{ IOException -> 0x0747 }
            r2.<init>()     // Catch:{ IOException -> 0x0747 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0747 }
            r2.A00 = r0     // Catch:{ IOException -> 0x0747 }
            java.lang.String r0 = "android"
            r2.A06 = r0     // Catch:{ IOException -> 0x0747 }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x0747 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0747 }
            r2.A07 = r0     // Catch:{ IOException -> 0x0747 }
            java.lang.String r0 = "consumer"
            r2.A03 = r0     // Catch:{ IOException -> 0x0747 }
            java.lang.String r0 = "2.24.6.77"
            java.util.Objects.requireNonNull(r0)     // Catch:{ IOException -> 0x0747 }
            r2.A04 = r0     // Catch:{ IOException -> 0x0747 }
            java.lang.String r0 = "1.0"
            r2.A05 = r0     // Catch:{ IOException -> 0x0747 }
            java.lang.String r0 = "MessageStoreIncrementalBackup/exporting sequences"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0747 }
            X.005 r0 = r3.A06     // Catch:{ IOException -> 0x0747 }
            java.lang.Object r1 = r0.get()     // Catch:{ IOException -> 0x0747 }
            X.3My r1 = (X.C64173My) r1     // Catch:{ IOException -> 0x0747 }
            X.005 r0 = r3.A09     // Catch:{ IOException -> 0x0747 }
            r46 = r0
            java.lang.Object r6 = r46.get()     // Catch:{ IOException -> 0x0747 }
            X.65w r6 = (X.C1268465w) r6     // Catch:{ IOException -> 0x0747 }
            X.005 r0 = r3.A02     // Catch:{ IOException -> 0x0747 }
            r45 = r0
            java.lang.Object r7 = r45.get()     // Catch:{ IOException -> 0x0747 }
            X.6F6 r7 = (X.AnonymousClass6F6) r7     // Catch:{ IOException -> 0x0747 }
            r15 = r48
            boolean r0 = r15.isCanceled()     // Catch:{ IOException -> 0x0747 }
            if (r0 == 0) goto L_0x0053
            r8 = 0
            goto L_0x00cc
        L_0x0053:
            java.lang.String r0 = "sequences"
            X.4yi r10 = new X.4yi     // Catch:{ IOException -> 0x0747 }
            r10.<init>(r0)     // Catch:{ IOException -> 0x0747 }
            java.util.HashMap r1 = X.C64173My.A00(r1)     // Catch:{ IOException -> 0x0747 }
            int r0 = r1.size()     // Catch:{ IOException -> 0x0747 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ IOException -> 0x0747 }
            r9.<init>(r0)     // Catch:{ IOException -> 0x0747 }
            java.util.Set r0 = r1.entrySet()     // Catch:{ IOException -> 0x0747 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ IOException -> 0x0747 }
        L_0x006f:
            boolean r0 = r8.hasNext()     // Catch:{ IOException -> 0x0747 }
            if (r0 == 0) goto L_0x0096
            java.lang.Object r0 = r8.next()     // Catch:{ IOException -> 0x0747 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ IOException -> 0x0747 }
            java.lang.Object r5 = r0.getKey()     // Catch:{ IOException -> 0x0747 }
            java.lang.Object r4 = r0.getValue()     // Catch:{ IOException -> 0x0747 }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ IOException -> 0x0747 }
            r1.<init>()     // Catch:{ IOException -> 0x0747 }
            java.lang.String r0 = "name"
            r1.put(r0, r5)     // Catch:{ IOException -> 0x0747 }
            java.lang.String r0 = "value"
            r1.put(r0, r4)     // Catch:{ IOException -> 0x0747 }
            r9.add(r1)     // Catch:{ IOException -> 0x0747 }
            goto L_0x006f
        L_0x0096:
            java.lang.String r8 = "sequences.json"
            java.io.File r6 = r6.A00(r8)     // Catch:{ IOException -> 0x0747 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ JSONException -> 0x073e }
            r5.<init>(r6)     // Catch:{ JSONException -> 0x073e }
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0734 }
            r4.<init>(r5)     // Catch:{ all -> 0x0734 }
            org.json.JSONObject r1 = r10.A01(r9)     // Catch:{ all -> 0x072a }
            r0 = 4
            java.lang.String r0 = r1.toString(r0)     // Catch:{ all -> 0x072a }
            r4.write(r0)     // Catch:{ all -> 0x072a }
            r4.close()     // Catch:{ all -> 0x0734 }
            r5.close()     // Catch:{ JSONException -> 0x073e }
            r0 = 1
            long r6 = r7.A02(r6, r8, r0)     // Catch:{ IOException -> 0x0747 }
            r4 = 0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00cc
            java.lang.String r0 = "SequencesHandler/Failed to register sequences file in metadata manager."
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0747 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0747 }
            goto L_0x0746
        L_0x00cc:
            r2.A08 = r8     // Catch:{ IOException -> 0x0747 }
            r0 = 20
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0747 }
            r14 = r49
            r14.B2F(r0)     // Catch:{ IOException -> 0x0747 }
            java.lang.String r0 = "MessageStoreIncrementalBackup/exporting messages"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0747 }
            X.005 r0 = r3.A0A     // Catch:{ IOException -> 0x0747 }
            java.lang.Object r8 = r0.get()     // Catch:{ IOException -> 0x0747 }
            X.5ww r8 = (X.C123695ww) r8     // Catch:{ IOException -> 0x0747 }
            java.lang.Object r12 = r46.get()     // Catch:{ IOException -> 0x0747 }
            X.65w r12 = (X.C1268465w) r12     // Catch:{ IOException -> 0x0747 }
            java.lang.Object r11 = r45.get()     // Catch:{ IOException -> 0x0747 }
            X.6F6 r11 = (X.AnonymousClass6F6) r11     // Catch:{ IOException -> 0x0747 }
            boolean r0 = r15.isCanceled()     // Catch:{ IOException -> 0x0747 }
            r28 = r52
            if (r0 == 0) goto L_0x0120
            java.lang.String r0 = "IncrementalBackup/MessagesExporter/Operation cancelled."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0747 }
        L_0x00ff:
            X.1HI r7 = r8.A05     // Catch:{ IOException -> 0x0747 }
            java.util.HashSet r5 = r7.A01     // Catch:{ IOException -> 0x0747 }
            boolean r0 = r5.isEmpty()     // Catch:{ IOException -> 0x0747 }
            r6 = 0
            if (r0 != 0) goto L_0x0374
            java.lang.String r4 = r5.toString()     // Catch:{ IOException -> 0x0747 }
            int r1 = r4.length()     // Catch:{ IOException -> 0x0747 }
            r0 = 1
            int r1 = r1 - r0
            java.lang.String r1 = r4.substring(r0, r1)     // Catch:{ IOException -> 0x0747 }
            boolean r0 = r1.isEmpty()     // Catch:{ IOException -> 0x0747 }
            if (r0 != 0) goto L_0x0374
            goto L_0x0373
        L_0x0120:
            java.lang.String r10 = "messages.bin"
            java.io.File r1 = r12.A00(r10)     // Catch:{ IOException -> 0x0747 }
            r0 = 1
            long r4 = r11.A02(r1, r10, r0)     // Catch:{ IOException -> 0x0747 }
            r35 = 0
            int r0 = (r4 > r35 ? 1 : (r4 == r35 ? 0 : -1))
            if (r0 < 0) goto L_0x0722
            X.3Sy r0 = r8.A00     // Catch:{ IOException -> 0x0714 }
            r26 = r0
            X.12P r0 = r8.A02     // Catch:{ IOException -> 0x0714 }
            r25 = r0
            java.io.FileOutputStream r24 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0714 }
            r0 = r24
            r0.<init>(r1)     // Catch:{ IOException -> 0x0714 }
            java.util.ArrayList r23 = new java.util.ArrayList     // Catch:{ all -> 0x070a }
            r23.<init>()     // Catch:{ all -> 0x070a }
            X.0yC r4 = r8.A04     // Catch:{ all -> 0x070a }
            r1 = 7155(0x1bf3, float:1.0026E-41)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ all -> 0x070a }
            boolean r0 = X.C20800yB.A01(r0, r4, r1)     // Catch:{ all -> 0x070a }
            r39 = 1
            r7 = 0
            if (r0 == 0) goto L_0x0189
            r0 = r26
            X.12P r0 = r0.A00     // Catch:{ all -> 0x070a }
            X.1M0 r6 = r0.get()     // Catch:{ all -> 0x070a }
            X.14e r5 = r6.A02     // Catch:{ all -> 0x06f6 }
            java.lang.String r4 = "SELECT table_row_id FROM backup_changes WHERE table_name = 'message' AND _id <= ? ORDER BY table_row_id DESC LIMIT 1"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = java.lang.String.valueOf(r28)     // Catch:{ all -> 0x06f6 }
            r1[r7] = r0     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = "BackupChangesStore/FETCH_LAST_MESSAGE_ROW_ID"
            android.database.Cursor r0 = r5.A09(r4, r0, r1)     // Catch:{ all -> 0x06f6 }
            boolean r1 = r0.moveToNext()     // Catch:{ all -> 0x06ea }
            if (r1 == 0) goto L_0x0180
            java.lang.String r1 = "table_row_id"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x06ea }
            long r17 = r0.getLong(r1)     // Catch:{ all -> 0x06ea }
            goto L_0x0182
        L_0x0180:
            r17 = 1
        L_0x0182:
            r0.close()     // Catch:{ all -> 0x06f6 }
            r6.close()     // Catch:{ all -> 0x070a }
            goto L_0x018f
        L_0x0189:
            X.17T r0 = r8.A03     // Catch:{ all -> 0x070a }
            long r17 = r0.A01()     // Catch:{ all -> 0x070a }
        L_0x018f:
            int r0 = (r39 > r17 ? 1 : (r39 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x0362
            r15.throwIfCanceled()     // Catch:{ all -> 0x070a }
            X.5p7 r6 = new X.5p7     // Catch:{ all -> 0x070a }
            r6.<init>()     // Catch:{ all -> 0x070a }
            long r21 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x070a }
            r4 = 5000(0x1388, float:7.006E-42)
            long r0 = (long) r4     // Catch:{ all -> 0x070a }
            java.lang.String r38 = "message"
            r37 = r26
            r43 = r0
            r41 = r28
            X.33r r0 = r37.A06(r38, r39, r41, r43)     // Catch:{ all -> 0x070a }
            java.util.List r0 = r0.A01     // Catch:{ all -> 0x070a }
            int r1 = r0.size()     // Catch:{ all -> 0x070a }
            if (r1 == 0) goto L_0x0362
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x070a }
            r5.<init>(r0)     // Catch:{ all -> 0x070a }
            java.util.Collections.sort(r5)     // Catch:{ all -> 0x070a }
            r1 = 0
            int r0 = (r39 > r35 ? 1 : (r39 == r35 ? 0 : -1))
            if (r0 <= 0) goto L_0x01d3
            java.lang.Long r0 = java.lang.Long.valueOf(r39)     // Catch:{ all -> 0x070a }
            int r0 = java.util.Collections.binarySearch(r5, r0)     // Catch:{ all -> 0x070a }
            int r9 = r0 + 1
            if (r0 >= 0) goto L_0x01d4
            int r0 = -r0
            int r9 = r0 + -1
            goto L_0x01d4
        L_0x01d3:
            r9 = 0
        L_0x01d4:
            int r0 = r5.size()     // Catch:{ all -> 0x070a }
            if (r9 >= r0) goto L_0x0362
            int r13 = r5.size()     // Catch:{ all -> 0x070a }
            int r13 = r13 - r9
            r0 = 100
            int r0 = java.lang.Math.min(r0, r4)     // Catch:{ all -> 0x070a }
            int r13 = java.lang.Math.min(r13, r0)     // Catch:{ all -> 0x070a }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x070a }
            r4.<init>(r13)     // Catch:{ all -> 0x070a }
        L_0x01ee:
            int r0 = r5.size()     // Catch:{ all -> 0x070a }
            if (r9 >= r0) goto L_0x0217
            int r0 = r4.size()     // Catch:{ all -> 0x070a }
            if (r0 >= r13) goto L_0x0217
            java.lang.Object r0 = r5.get(r9)     // Catch:{ all -> 0x070a }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x070a }
            long r19 = r0.longValue()     // Catch:{ all -> 0x070a }
            int r0 = (r17 > r35 ? 1 : (r17 == r35 ? 0 : -1))
            if (r0 < 0) goto L_0x020d
            int r0 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x020d
            goto L_0x0217
        L_0x020d:
            java.lang.Long r0 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x070a }
            r4.add(r0)     // Catch:{ all -> 0x070a }
            int r9 = r9 + 1
            goto L_0x01ee
        L_0x0217:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x070a }
            r5.<init>()     // Catch:{ all -> 0x070a }
            java.lang.String r0 = "   SELECT "
            r5.append(r0)     // Catch:{ all -> 0x070a }
            java.lang.String r0 = X.C56842wy.A01     // Catch:{ all -> 0x070a }
            r5.append(r0)     // Catch:{ all -> 0x070a }
            java.lang.String r0 = ", "
            r5.append(r0)     // Catch:{ all -> 0x070a }
            java.lang.String r0 = "chat_row_id"
            r5.append(r0)     // Catch:{ all -> 0x070a }
            java.lang.String r0 = " FROM "
            r5.append(r0)     // Catch:{ all -> 0x070a }
            java.lang.String r0 = "available_message_view"
            r5.append(r0)     // Catch:{ all -> 0x070a }
            java.lang.String r0 = " WHERE "
            r5.append(r0)     // Catch:{ all -> 0x070a }
            java.lang.String r0 = "(_id IN "
            r5.append(r0)     // Catch:{ all -> 0x070a }
            int r0 = r4.size()     // Catch:{ all -> 0x070a }
            java.lang.String r0 = X.AnonymousClass1M2.A00(r0)     // Catch:{ all -> 0x070a }
            r5.append(r0)     // Catch:{ all -> 0x070a }
            java.lang.String r0 = ")"
            r5.append(r0)     // Catch:{ all -> 0x070a }
            java.lang.String r0 = " AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1) "
            r5.append(r0)     // Catch:{ all -> 0x070a }
            java.lang.String r0 = " ORDER BY "
            r5.append(r0)     // Catch:{ all -> 0x070a }
            java.lang.String r0 = "_id ASC"
            r5.append(r0)     // Catch:{ all -> 0x070a }
            java.lang.String r9 = r5.toString()     // Catch:{ all -> 0x070a }
            int r0 = r4.size()     // Catch:{ all -> 0x070a }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x070a }
            r5.<init>(r0)     // Catch:{ all -> 0x070a }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x070a }
        L_0x0274:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x070a }
            if (r0 == 0) goto L_0x0286
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x070a }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x070a }
            r5.add(r0)     // Catch:{ all -> 0x070a }
            goto L_0x0274
        L_0x0286:
            java.lang.String r0 = java.lang.String.valueOf(r21)     // Catch:{ all -> 0x070a }
            r5.add(r0)     // Catch:{ all -> 0x070a }
            X.00I r0 = new X.00I     // Catch:{ all -> 0x070a }
            r0.<init>(r9, r5)     // Catch:{ all -> 0x070a }
            java.lang.Object r5 = r0.A00     // Catch:{ all -> 0x070a }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x070a }
            java.lang.Object r4 = r0.A01     // Catch:{ all -> 0x070a }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x070a }
            java.lang.String[] r0 = new java.lang.String[r1]     // Catch:{ all -> 0x070a }
            java.lang.Object[] r9 = r4.toArray(r0)     // Catch:{ all -> 0x070a }
            java.lang.String[] r9 = (java.lang.String[]) r9     // Catch:{ all -> 0x070a }
            X.1M0 r4 = r25.get()     // Catch:{ all -> 0x070a }
            X.14e r1 = r4.A02     // Catch:{ all -> 0x0700 }
            java.lang.String r0 = "SELECT_MESSAGES_FOR_HISTORY_CHUNK_BY_VIEW_SQL"
            android.database.Cursor r9 = r1.A09(r5, r0, r9)     // Catch:{ all -> 0x0700 }
            r4.close()     // Catch:{ all -> 0x070a }
            if (r9 == 0) goto L_0x0362
            int r0 = r9.getCount()     // Catch:{ all -> 0x06fb }
            long r4 = (long) r0     // Catch:{ all -> 0x06fb }
            r6.A01 = r4     // Catch:{ all -> 0x06fb }
            X.5wy r13 = r2.A02     // Catch:{ all -> 0x06fb }
            long r0 = r13.A02     // Catch:{ all -> 0x06fb }
            long r0 = r0 + r4
            r13.A02 = r0     // Catch:{ all -> 0x06fb }
            boolean r0 = r9.moveToLast()     // Catch:{ all -> 0x06fb }
            if (r0 == 0) goto L_0x035f
            java.lang.String r0 = "_id"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x06fb }
            long r39 = r9.getLong(r0)     // Catch:{ all -> 0x06fb }
            r9.moveToFirst()     // Catch:{ all -> 0x06fb }
            r0 = -1
            r9.move(r0)     // Catch:{ all -> 0x06fb }
            X.5SH r0 = X.AnonymousClass5SH.FOR_INCREMENTAL_BACKUP     // Catch:{ all -> 0x06fb }
            X.63Y r1 = X.C110955bV.A00(r0)     // Catch:{ all -> 0x06fb }
            r0 = 1
            r1.A03 = r0     // Catch:{ all -> 0x06fb }
            r1.A02 = r0     // Catch:{ all -> 0x06fb }
            r0 = 0
            r1.A00 = r0     // Catch:{ all -> 0x06fb }
            X.6CO r32 = r1.A00()     // Catch:{ all -> 0x06fb }
            X.1HI r13 = r8.A05     // Catch:{ all -> 0x06fb }
            X.6uz r0 = new X.6uz     // Catch:{ all -> 0x06fb }
            r0.<init>(r8)     // Catch:{ all -> 0x06fb }
            java.util.ArrayList r34 = new java.util.ArrayList     // Catch:{ all -> 0x06fb }
            r34.<init>()     // Catch:{ all -> 0x06fb }
            r30 = r13
            r31 = r9
            r33 = r0
            java.util.LinkedHashMap r1 = r30.A02(r31, r32, r33, r34, r35)     // Catch:{ all -> 0x06fb }
            int r0 = r1.size()     // Catch:{ all -> 0x06fb }
            if (r0 == 0) goto L_0x035f
            X.4uP r0 = X.C100064uP.DEFAULT_INSTANCE     // Catch:{ all -> 0x06fb }
            X.8NN r4 = r0.A0p()     // Catch:{ all -> 0x06fb }
            X.4tx r4 = (X.C99784tx) r4     // Catch:{ all -> 0x06fb }
            X.5UH r0 = X.AnonymousClass5UH.FULL     // Catch:{ all -> 0x06fb }
            r4.A0Y(r0)     // Catch:{ all -> 0x06fb }
            java.util.Set r0 = r1.entrySet()     // Catch:{ all -> 0x06fb }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ all -> 0x06fb }
        L_0x031b:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x06fb }
            if (r0 == 0) goto L_0x0343
            java.lang.Object r0 = r16.next()     // Catch:{ all -> 0x06fb }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x06fb }
            r15.throwIfCanceled()     // Catch:{ all -> 0x06fb }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x06fb }
            X.11F r1 = (X.AnonymousClass11F) r1     // Catch:{ all -> 0x06fb }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06fb }
            X.4tv r0 = (X.C99764tv) r0     // Catch:{ all -> 0x06fb }
            boolean r5 = r1 instanceof X.AnonymousClass144     // Catch:{ all -> 0x06fb }
            if (r5 == 0) goto L_0x033f
            X.144 r1 = (X.AnonymousClass144) r1     // Catch:{ all -> 0x06fb }
            r13.A03(r1, r0)     // Catch:{ all -> 0x06fb }
        L_0x033f:
            r4.A0W(r0)     // Catch:{ all -> 0x06fb }
            goto L_0x031b
        L_0x0343:
            r4.A0U(r7)     // Catch:{ all -> 0x06fb }
            X.8Hz r1 = r4.A0R()     // Catch:{ all -> 0x06fb }
            X.4uP r1 = (X.C100064uP) r1     // Catch:{ all -> 0x06fb }
            r0 = r24
            r1.A0m(r0)     // Catch:{ all -> 0x06fb }
            r6.A00 = r7     // Catch:{ all -> 0x06fb }
            r0 = r23
            r0.add(r6)     // Catch:{ all -> 0x06fb }
            int r7 = r7 + 1
            r9.close()     // Catch:{ all -> 0x070a }
            goto L_0x018f
        L_0x035f:
            r9.close()     // Catch:{ all -> 0x070a }
        L_0x0362:
            r24.close()     // Catch:{ IOException -> 0x0714 }
            X.5wy r1 = r2.A02     // Catch:{ IOException -> 0x0714 }
            r1.A03 = r10     // Catch:{ IOException -> 0x0714 }
            r0 = r23
            r1.A05 = r0     // Catch:{ IOException -> 0x0714 }
            java.lang.String r0 = "protobuf"
            r1.A04 = r0     // Catch:{ IOException -> 0x0714 }
            goto L_0x00ff
        L_0x0373:
            r6 = r1
        L_0x0374:
            r9 = r50
            r9.A0E = r6     // Catch:{ IOException -> 0x0747 }
            java.util.HashSet r6 = r7.A00     // Catch:{ IOException -> 0x0747 }
            boolean r0 = r6.isEmpty()     // Catch:{ IOException -> 0x0747 }
            r7 = 0
            if (r0 != 0) goto L_0x0396
            java.lang.String r4 = r6.toString()     // Catch:{ IOException -> 0x0747 }
            int r1 = r4.length()     // Catch:{ IOException -> 0x0747 }
            r0 = 1
            int r1 = r1 - r0
            java.lang.String r1 = r4.substring(r0, r1)     // Catch:{ IOException -> 0x0747 }
            boolean r0 = r1.isEmpty()     // Catch:{ IOException -> 0x0747 }
            if (r0 != 0) goto L_0x0396
            r7 = r1
        L_0x0396:
            r9.A0D = r7     // Catch:{ IOException -> 0x0747 }
            X.5kn r4 = r2.A01     // Catch:{ IOException -> 0x0747 }
            boolean r0 = r15.isCanceled()     // Catch:{ IOException -> 0x0747 }
            if (r0 == 0) goto L_0x04cb
            java.lang.String r0 = "IncrementalBackup/MessagesExporter/Operation cancelled."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0747 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ IOException -> 0x0747 }
            r1.<init>()     // Catch:{ IOException -> 0x0747 }
        L_0x03aa:
            java.util.List r0 = r4.A00     // Catch:{ IOException -> 0x0747 }
            r0.addAll(r1)     // Catch:{ IOException -> 0x0747 }
            X.5wy r0 = r2.A02     // Catch:{ IOException -> 0x0747 }
            java.util.List r0 = r0.A05     // Catch:{ IOException -> 0x0747 }
            int r0 = r0.size()     // Catch:{ IOException -> 0x0747 }
            if (r0 <= 0) goto L_0x03c3
            X.5wy r4 = r2.A02     // Catch:{ IOException -> 0x0747 }
            X.3Sy r0 = r8.A00     // Catch:{ IOException -> 0x0747 }
            long r0 = r0.A03()     // Catch:{ IOException -> 0x0747 }
            r4.A00 = r0     // Catch:{ IOException -> 0x0747 }
        L_0x03c3:
            r5.clear()     // Catch:{ IOException -> 0x0747 }
            r6.clear()     // Catch:{ IOException -> 0x0747 }
            r0 = 40
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0747 }
            r14.B2F(r0)     // Catch:{ IOException -> 0x0747 }
            java.lang.String r0 = "MessageStoreIncrementalBackup/exporting entities"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0747 }
            X.005 r0 = r3.A08     // Catch:{ IOException -> 0x0747 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x0747 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ IOException -> 0x0747 }
            java.util.Iterator r17 = r0.iterator()     // Catch:{ IOException -> 0x0747 }
        L_0x03e3:
            boolean r0 = r17.hasNext()     // Catch:{ IOException -> 0x0747 }
            if (r0 == 0) goto L_0x04db
            java.lang.Object r4 = r17.next()     // Catch:{ IOException -> 0x0747 }
            X.9dz r4 = (X.C198659dz) r4     // Catch:{ IOException -> 0x0747 }
            java.util.List r0 = r4.A01     // Catch:{ IOException -> 0x0747 }
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch:{ IOException -> 0x0747 }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ IOException -> 0x0747 }
        L_0x03f9:
            boolean r0 = r16.hasNext()     // Catch:{ IOException -> 0x0747 }
            if (r0 == 0) goto L_0x04c2
            java.lang.Object r5 = r16.next()     // Catch:{ IOException -> 0x0747 }
            X.6LG r5 = (X.AnonymousClass6LG) r5     // Catch:{ IOException -> 0x0747 }
            X.005 r0 = r3.A01     // Catch:{ IOException -> 0x0747 }
            java.lang.Object r6 = r0.get()     // Catch:{ IOException -> 0x0747 }
            X.5kl r6 = (X.C116545kl) r6     // Catch:{ IOException -> 0x0747 }
            java.lang.Object r9 = r46.get()     // Catch:{ IOException -> 0x0747 }
            X.65w r9 = (X.C1268465w) r9     // Catch:{ IOException -> 0x0747 }
            java.lang.Object r8 = r45.get()     // Catch:{ IOException -> 0x0747 }
            X.6F6 r8 = (X.AnonymousClass6F6) r8     // Catch:{ IOException -> 0x0747 }
            java.lang.String r1 = r5.A03     // Catch:{ IOException -> 0x0747 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0747 }
            r7.<init>()     // Catch:{ IOException -> 0x0747 }
            r7.append(r1)     // Catch:{ IOException -> 0x0747 }
            java.lang.String r0 = "_deleted_%d.json"
            r7.append(r0)     // Catch:{ IOException -> 0x0747 }
            java.lang.String r23 = r7.toString()     // Catch:{ IOException -> 0x0747 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0747 }
            r7.<init>()     // Catch:{ IOException -> 0x0747 }
            java.lang.String r10 = "EntityTableProcessor/"
            r7.append(r10)     // Catch:{ IOException -> 0x0747 }
            r7.append(r1)     // Catch:{ IOException -> 0x0747 }
            java.lang.String r0 = "/"
            r7.append(r0)     // Catch:{ IOException -> 0x0747 }
            java.lang.String r22 = r7.toString()     // Catch:{ IOException -> 0x0747 }
            X.4yk r7 = new X.4yk     // Catch:{ IOException -> 0x0747 }
            r18 = r7
            r19 = r6
            r20 = r9
            r21 = r8
            r24 = r1
            r25 = r28
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ IOException -> 0x0747 }
            java.util.List r7 = r7.A00(r15)     // Catch:{ IOException -> 0x0747 }
            java.util.List r11 = r5.A04     // Catch:{ IOException -> 0x0747 }
            r11.addAll(r7)     // Catch:{ IOException -> 0x0747 }
            java.lang.String r7 = r5.A02     // Catch:{ IOException -> 0x0747 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0747 }
            r13.<init>()     // Catch:{ IOException -> 0x0747 }
            r13.append(r1)     // Catch:{ IOException -> 0x0747 }
            java.lang.String r12 = "_modified_%d.json"
            r13.append(r12)     // Catch:{ IOException -> 0x0747 }
            java.lang.String r25 = r13.toString()     // Catch:{ IOException -> 0x0747 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0747 }
            r12.<init>()     // Catch:{ IOException -> 0x0747 }
            r12.append(r10)     // Catch:{ IOException -> 0x0747 }
            r12.append(r1)     // Catch:{ IOException -> 0x0747 }
            r12.append(r0)     // Catch:{ IOException -> 0x0747 }
            java.lang.String r24 = r12.toString()     // Catch:{ IOException -> 0x0747 }
            X.4yi r10 = new X.4yi     // Catch:{ IOException -> 0x0747 }
            r10.<init>(r1)     // Catch:{ IOException -> 0x0747 }
            X.4yl r0 = new X.4yl     // Catch:{ IOException -> 0x0747 }
            r18 = r0
            r19 = r15
            r20 = r6
            r21 = r10
            r22 = r9
            r23 = r8
            r26 = r1
            r27 = r7
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ IOException -> 0x0747 }
            java.util.List r0 = r0.A00(r15)     // Catch:{ IOException -> 0x0747 }
            java.util.List r8 = r5.A05     // Catch:{ IOException -> 0x0747 }
            r8.addAll(r0)     // Catch:{ IOException -> 0x0747 }
            java.util.List r0 = java.util.Collections.unmodifiableList(r11)     // Catch:{ IOException -> 0x0747 }
            int r0 = r0.size()     // Catch:{ IOException -> 0x0747 }
            if (r0 > 0) goto L_0x04b8
            java.util.List r0 = java.util.Collections.unmodifiableList(r8)     // Catch:{ IOException -> 0x0747 }
            int r0 = r0.size()     // Catch:{ IOException -> 0x0747 }
            if (r0 <= 0) goto L_0x03f9
        L_0x04b8:
            X.3Sy r0 = r6.A00     // Catch:{ IOException -> 0x0747 }
            long r0 = r0.A04(r1, r7)     // Catch:{ IOException -> 0x0747 }
            r5.A00 = r0     // Catch:{ IOException -> 0x0747 }
            goto L_0x03f9
        L_0x04c2:
            java.util.Map r1 = r2.A09     // Catch:{ IOException -> 0x0747 }
            java.lang.String r0 = r4.A00     // Catch:{ IOException -> 0x0747 }
            r1.put(r0, r4)     // Catch:{ IOException -> 0x0747 }
            goto L_0x03e3
        L_0x04cb:
            X.4yj r0 = new X.4yj     // Catch:{ IOException -> 0x0747 }
            r7 = r0
            r9 = r2
            r10 = r12
            r12 = r28
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x0747 }
            java.util.List r1 = r0.A00(r15)     // Catch:{ IOException -> 0x0747 }
            goto L_0x03aa
        L_0x04db:
            r0 = 80
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0747 }
            r14.B2F(r0)     // Catch:{ IOException -> 0x0747 }
            java.lang.Object r0 = r46.get()     // Catch:{ IOException -> 0x0747 }
            X.65w r0 = (X.C1268465w) r0     // Catch:{ IOException -> 0x0747 }
            java.lang.Object r7 = r45.get()     // Catch:{ IOException -> 0x0747 }
            X.6F6 r7 = (X.AnonymousClass6F6) r7     // Catch:{ IOException -> 0x0747 }
            java.lang.String r10 = "header"
            java.io.File r6 = r0.A00(r10)     // Catch:{ IOException -> 0x0747 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ JSONException -> 0x06dc }
            r5.<init>(r6)     // Catch:{ JSONException -> 0x06dc }
            r8 = 4
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ all -> 0x06d2 }
            r4.<init>()     // Catch:{ all -> 0x06d2 }
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ all -> 0x06d2 }
            r9.<init>()     // Catch:{ all -> 0x06d2 }
            long r0 = r2.A00     // Catch:{ all -> 0x06d2 }
            java.lang.String r11 = "creation_date"
            r9.put(r11, r0)     // Catch:{ all -> 0x06d2 }
            java.lang.String r1 = r2.A06     // Catch:{ all -> 0x06d2 }
            java.lang.String r0 = "os"
            r9.put(r0, r1)     // Catch:{ all -> 0x06d2 }
            java.lang.String r1 = r2.A07     // Catch:{ all -> 0x06d2 }
            java.lang.String r0 = "os_version"
            r9.put(r0, r1)     // Catch:{ all -> 0x06d2 }
            java.lang.String r1 = r2.A03     // Catch:{ all -> 0x06d2 }
            java.lang.String r0 = "app_name"
            r9.put(r0, r1)     // Catch:{ all -> 0x06d2 }
            java.lang.String r1 = r2.A04     // Catch:{ all -> 0x06d2 }
            java.lang.String r0 = "app_version"
            r9.put(r0, r1)     // Catch:{ all -> 0x06d2 }
            java.lang.String r1 = r2.A05     // Catch:{ all -> 0x06d2 }
            java.lang.String r0 = "format_version"
            r9.put(r0, r1)     // Catch:{ all -> 0x06d2 }
            r4.put(r10, r9)     // Catch:{ all -> 0x06d2 }
            X.5wy r10 = r2.A02     // Catch:{ all -> 0x06d2 }
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ all -> 0x06d2 }
            r9.<init>()     // Catch:{ all -> 0x06d2 }
            java.lang.String r1 = r10.A03     // Catch:{ all -> 0x06d2 }
            java.lang.String r0 = "filename"
            r9.put(r0, r1)     // Catch:{ all -> 0x06d2 }
            java.lang.String r1 = r10.A04     // Catch:{ all -> 0x06d2 }
            java.lang.String r0 = "format"
            r9.put(r0, r1)     // Catch:{ all -> 0x06d2 }
            long r0 = r10.A00     // Catch:{ all -> 0x06d2 }
            java.lang.String r11 = "messages_count_on_backup"
            r9.put(r11, r0)     // Catch:{ all -> 0x06d2 }
            long r0 = r10.A02     // Catch:{ all -> 0x06d2 }
            java.lang.String r11 = "messages_updated"
            r9.put(r11, r0)     // Catch:{ all -> 0x06d2 }
            long r0 = r10.A01     // Catch:{ all -> 0x06d2 }
            java.lang.String r11 = "messages_deleted"
            r9.put(r11, r0)     // Catch:{ all -> 0x06d2 }
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch:{ all -> 0x06d2 }
            r11.<init>()     // Catch:{ all -> 0x06d2 }
            java.lang.String r0 = "chunks"
            r9.put(r0, r11)     // Catch:{ all -> 0x06d2 }
            java.util.List r0 = r10.A05     // Catch:{ all -> 0x06d2 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x06d2 }
        L_0x056d:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x06d2 }
            if (r0 == 0) goto L_0x0590
            java.lang.Object r10 = r13.next()     // Catch:{ all -> 0x06d2 }
            X.5p7 r10 = (X.C119025p7) r10     // Catch:{ all -> 0x06d2 }
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ all -> 0x06d2 }
            r12.<init>()     // Catch:{ all -> 0x06d2 }
            int r1 = r10.A00     // Catch:{ all -> 0x06d2 }
            java.lang.String r0 = "chunk_number"
            r12.put(r0, r1)     // Catch:{ all -> 0x06d2 }
            long r0 = r10.A01     // Catch:{ all -> 0x06d2 }
            java.lang.String r10 = "messages_count"
            r12.put(r10, r0)     // Catch:{ all -> 0x06d2 }
            r11.put(r12)     // Catch:{ all -> 0x06d2 }
            goto L_0x056d
        L_0x0590:
            java.lang.String r0 = "added_messages"
            r4.put(r0, r9)     // Catch:{ all -> 0x06d2 }
            X.5kn r0 = r2.A01     // Catch:{ all -> 0x06d2 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ all -> 0x06d2 }
            r10.<init>()     // Catch:{ all -> 0x06d2 }
            java.util.List r1 = r0.A00     // Catch:{ all -> 0x06d2 }
            int r0 = r1.size()     // Catch:{ all -> 0x06d2 }
            if (r0 <= 0) goto L_0x05c0
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ all -> 0x06d2 }
            r9.<init>()     // Catch:{ all -> 0x06d2 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x06d2 }
        L_0x05ad:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x06d2 }
            if (r0 == 0) goto L_0x05bb
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x06d2 }
            r9.put(r0)     // Catch:{ all -> 0x06d2 }
            goto L_0x05ad
        L_0x05bb:
            java.lang.String r0 = "deleted_message_ids_files"
            r10.put(r0, r9)     // Catch:{ all -> 0x06d2 }
        L_0x05c0:
            java.lang.String r0 = "deleted_messages"
            r4.put(r0, r10)     // Catch:{ all -> 0x06d2 }
            java.util.Map r1 = r2.A09     // Catch:{ all -> 0x06d2 }
            int r0 = r1.size()     // Catch:{ all -> 0x06d2 }
            if (r0 <= 0) goto L_0x0604
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ all -> 0x06d2 }
            r9.<init>()     // Catch:{ all -> 0x06d2 }
            java.lang.String r0 = "entities"
            r4.put(r0, r9)     // Catch:{ all -> 0x06d2 }
            java.util.Collection r0 = r1.values()     // Catch:{ all -> 0x06d2 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ all -> 0x06d2 }
        L_0x05df:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x06d2 }
            if (r0 == 0) goto L_0x0604
            java.lang.Object r0 = r10.next()     // Catch:{ all -> 0x06d2 }
            X.9dz r0 = (X.C198659dz) r0     // Catch:{ all -> 0x06d2 }
            java.lang.String r2 = r0.A00     // Catch:{ all -> 0x06d2 }
            X.4yf r1 = new X.4yf     // Catch:{ all -> 0x06d2 }
            r1.<init>(r2)     // Catch:{ all -> 0x06d2 }
            java.util.List r0 = r0.A01     // Catch:{ all -> 0x06d2 }
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch:{ all -> 0x06d2 }
            org.json.JSONObject r0 = r1.A01(r0)     // Catch:{ all -> 0x06d2 }
            org.json.JSONArray r0 = r0.getJSONArray(r2)     // Catch:{ all -> 0x06d2 }
            r9.put(r2, r0)     // Catch:{ all -> 0x06d2 }
            goto L_0x05df
        L_0x0604:
            java.lang.String r1 = r4.toString(r8)     // Catch:{ all -> 0x06d2 }
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x06d2 }
            byte[] r0 = r1.getBytes(r0)     // Catch:{ all -> 0x06d2 }
            r5.write(r0)     // Catch:{ all -> 0x06d2 }
            r5.close()     // Catch:{ JSONException -> 0x06dc }
            java.lang.String r1 = "header.json"
            r0 = 1
            long r4 = r7.A02(r6, r1, r0)     // Catch:{ IOException -> 0x0747 }
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x06ca
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0747 }
            r0 = r51
            r6.<init>(r0)     // Catch:{ IOException -> 0x0747 }
            java.util.zip.ZipOutputStream r7 = new java.util.zip.ZipOutputStream     // Catch:{ all -> 0x06bf }
            r7.<init>(r6)     // Catch:{ all -> 0x06bf }
            java.lang.Object r0 = r45.get()     // Catch:{ all -> 0x06b5 }
            X.6F6 r0 = (X.AnonymousClass6F6) r0     // Catch:{ all -> 0x06b5 }
            X.3xe r9 = r0.A03()     // Catch:{ all -> 0x06b5 }
        L_0x0637:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x06ab }
            if (r0 == 0) goto L_0x0686
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x06ab }
            X.5xH r0 = (X.C123905xH) r0     // Catch:{ all -> 0x06ab }
            if (r0 == 0) goto L_0x0637
            java.io.File r2 = r0.A02     // Catch:{ all -> 0x06ab }
            java.lang.String r8 = r0.A04     // Catch:{ all -> 0x06ab }
            boolean r0 = r2.exists()     // Catch:{ all -> 0x06ab }
            if (r0 == 0) goto L_0x0637
            r0 = 131072(0x20000, float:1.83671E-40)
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x06ab }
            r5 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x067f }
            r4.<init>(r2)     // Catch:{ all -> 0x067f }
            java.util.zip.ZipEntry r2 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x0675 }
            r2.<init>(r8)     // Catch:{ all -> 0x0675 }
            r7.putNextEntry(r2)     // Catch:{ all -> 0x0672 }
            X.005 r0 = r3.A05     // Catch:{ all -> 0x0672 }
            r0.get()     // Catch:{ all -> 0x0672 }
            X.AnonymousClass6T9.A01(r15, r4, r7, r1)     // Catch:{ all -> 0x0672 }
            r4.close()     // Catch:{ all -> 0x0670 }
            r7.closeEntry()     // Catch:{ all -> 0x06ab }
            goto L_0x0637
        L_0x0670:
            r0 = move-exception
            goto L_0x0682
        L_0x0672:
            r1 = move-exception
            r5 = r2
            goto L_0x0676
        L_0x0675:
            r1 = move-exception
        L_0x0676:
            r4.close()     // Catch:{ all -> 0x067a }
            goto L_0x067e
        L_0x067a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x067f }
        L_0x067e:
            throw r1     // Catch:{ all -> 0x067f }
        L_0x067f:
            r0 = move-exception
            if (r5 == 0) goto L_0x0685
        L_0x0682:
            r7.closeEntry()     // Catch:{ all -> 0x06ab }
        L_0x0685:
            throw r0     // Catch:{ all -> 0x06ab }
        L_0x0686:
            r9.close()     // Catch:{ all -> 0x06b5 }
            r7.close()     // Catch:{ all -> 0x06bf }
            r6.close()     // Catch:{ IOException -> 0x0747 }
            r0 = 100
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0747 }
            r14.B2F(r0)     // Catch:{ IOException -> 0x0747 }
            java.lang.Object r0 = r45.get()
            X.6F6 r0 = (X.AnonymousClass6F6) r0
            r0.A04()
            java.lang.Object r0 = r46.get()
            X.65w r0 = (X.C1268465w) r0
            r0.A01()
            return
        L_0x06ab:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x06b0 }
            goto L_0x06b4
        L_0x06b0:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x06b5 }
        L_0x06b4:
            throw r1     // Catch:{ all -> 0x06b5 }
        L_0x06b5:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x06ba }
            goto L_0x06be
        L_0x06ba:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x06bf }
        L_0x06be:
            throw r1     // Catch:{ all -> 0x06bf }
        L_0x06bf:
            r2 = move-exception
            r6.close()     // Catch:{ all -> 0x06c5 }
            goto L_0x0746
        L_0x06c5:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ IOException -> 0x0747 }
            goto L_0x0746
        L_0x06ca:
            java.lang.String r0 = "Failed to export metadata file."
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0747 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0747 }
            goto L_0x0746
        L_0x06d2:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x06d7 }
            goto L_0x06db
        L_0x06d7:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ JSONException -> 0x06dc }
        L_0x06db:
            throw r1     // Catch:{ JSONException -> 0x06dc }
        L_0x06dc:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreIncrementalBackup/Failed to write header file."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x0747 }
            java.lang.String r0 = "MessageStoreIncrementalBackup/Failed to write header file"
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0747 }
            r2.<init>(r0, r1)     // Catch:{ IOException -> 0x0747 }
            goto L_0x0746
        L_0x06ea:
            r1 = move-exception
            if (r0 == 0) goto L_0x06f5
            r0.close()     // Catch:{ all -> 0x06f1 }
            goto L_0x06f5
        L_0x06f1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x06f6 }
        L_0x06f5:
            throw r1     // Catch:{ all -> 0x06f6 }
        L_0x06f6:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0705 }
            goto L_0x0709
        L_0x06fb:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0705 }
            goto L_0x0709
        L_0x0700:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0705 }
            goto L_0x0709
        L_0x0705:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x070a }
        L_0x0709:
            throw r1     // Catch:{ all -> 0x070a }
        L_0x070a:
            r1 = move-exception
            r24.close()     // Catch:{ all -> 0x070f }
            goto L_0x0713
        L_0x070f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0714 }
        L_0x0713:
            throw r1     // Catch:{ IOException -> 0x0714 }
        L_0x0714:
            r1 = move-exception
            java.lang.String r0 = "IncrementalBackup/MessagesExporter/Failed to export and assemble data."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x0747 }
            java.lang.String r0 = "Failed to export messages data."
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0747 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0747 }
            goto L_0x0746
        L_0x0722:
            java.lang.String r0 = "Failed to export messages file."
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0747 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0747 }
            goto L_0x0746
        L_0x072a:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x072f }
            goto L_0x0733
        L_0x072f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0734 }
        L_0x0733:
            throw r1     // Catch:{ all -> 0x0734 }
        L_0x0734:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0739 }
            goto L_0x073d
        L_0x0739:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ JSONException -> 0x073e }
        L_0x073d:
            throw r1     // Catch:{ JSONException -> 0x073e }
        L_0x073e:
            r1 = move-exception
            java.lang.String r0 = "SequencesHandler/Failed to write deleted message IDs to JSON"
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0747 }
            r2.<init>(r0, r1)     // Catch:{ IOException -> 0x0747 }
        L_0x0746:
            throw r2     // Catch:{ IOException -> 0x0747 }
        L_0x0747:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreIncrementalBackup/Failed to export and assemble data."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0755 }
            java.lang.String r1 = "Failed to export backup data."
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0755 }
            r0.<init>(r1)     // Catch:{ all -> 0x0755 }
            throw r0     // Catch:{ all -> 0x0755 }
        L_0x0755:
            r1 = move-exception
            X.005 r0 = r3.A02
            java.lang.Object r0 = r0.get()
            X.6F6 r0 = (X.AnonymousClass6F6) r0
            r0.A04()
            X.005 r0 = r3.A09
            java.lang.Object r0 = r0.get()
            X.65w r0 = (X.C1268465w) r0
            r0.A01()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QQ.A00(android.os.CancellationSignal, X.7fT, X.2Sv, java.io.File, long):void");
    }

    public AnonymousClass1QQ(C19970wo r1, AnonymousClass005 r2, AnonymousClass005 r3, AnonymousClass005 r4, AnonymousClass005 r5, AnonymousClass005 r6, AnonymousClass005 r7, AnonymousClass005 r8, AnonymousClass005 r9, AnonymousClass005 r10, AnonymousClass005 r11) {
        this.A07 = r1;
        this.A08 = r2;
        this.A0A = r3;
        this.A04 = r4;
        this.A06 = r5;
        this.A09 = r6;
        this.A03 = r7;
        this.A00 = r8;
        this.A05 = r9;
        this.A01 = r10;
        this.A02 = r11;
    }
}
