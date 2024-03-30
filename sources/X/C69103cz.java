package X;

/* renamed from: X.3cz  reason: invalid class name and case insensitive filesystem */
public class C69103cz implements C19710wO {
    public final C19970wo A00;
    public final AnonymousClass12P A01;
    public final C20810yC A02;
    public final C21010yW A03;

    public String BIB() {
        return "MessageDBAsync";
    }

    public /* synthetic */ void BRL() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014c, code lost:
        if (java.lang.Integer.parseInt(X.AnonymousClass14m.A00(r0, "chat_hidden_column_update_version", java.lang.String.valueOf(0))) != 1) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r3.BJK().A00.beginTransaction();
        r0.A0D("CREATE INDEX IF NOT EXISTS chat_hidden_index ON chat (hidden)", "chat/createAsyncIndex/chat_hidden_index");
        r7 = X.C36441kJ.A0E();
        r7.put("hidden", 0);
        r0.A01(r7, "chat", "hidden IS NULL", "DatabaseHelper/updateNullHidden/hidden", (java.lang.String[]) null);
        X.AnonymousClass14m.A02(r0, "chat_hidden_column_update_version", "MessageDBAsync", 1);
        r3.BJK().A00.setTransactionSuccessful();
        r3.BJK().A00.endTransaction();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00c7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x014e */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c A[Catch:{ all -> 0x0259, all -> 0x025e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BRM() {
        /*
            r97 = this;
            java.lang.String r8 = "chat_hidden_column_update_version"
            r1 = r97
            X.12P r3 = r1.A01
            r3.A06()
            java.io.File r2 = r3.A03
            java.lang.String r0 = "msgstore/open-existing-db/list "
            X.AnonymousClass6YY.A0G(r2, r0)
            long r4 = android.os.SystemClock.uptimeMillis()
            X.1M0 r18 = r3.A05()
            r3.A06()     // Catch:{ all -> 0x0259 }
            X.12f r3 = r3.A02     // Catch:{ all -> 0x0259 }
            r0 = r18
            X.14e r0 = r0.A02     // Catch:{ all -> 0x0259 }
            java.lang.String r12 = "MessagesDBHelper_CreateAsyncIndexes"
            r2 = 1
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ NumberFormatException -> 0x0033 }
            java.lang.String r2 = X.AnonymousClass14m.A00(r0, r12, r2)     // Catch:{ NumberFormatException -> 0x0033 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0033 }
            if (r2 != 0) goto L_0x0033
            goto L_0x0060
        L_0x0033:
            java.lang.String r11 = "MessagesDBHelper_CreateAsyncIndexesFailedAttempts"
            r13 = 0
            java.lang.String r2 = java.lang.String.valueOf(r13)     // Catch:{ NumberFormatException -> 0x0043 }
            java.lang.String r2 = X.AnonymousClass14m.A00(r0, r11, r2)     // Catch:{ NumberFormatException -> 0x0043 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0043 }
            goto L_0x0044
        L_0x0043:
            r2 = 0
        L_0x0044:
            int r10 = r2 + 1
            long r6 = (long) r10     // Catch:{ all -> 0x0259 }
            java.lang.String r9 = "DatabaseHelper"
            X.AnonymousClass14m.A02(r0, r11, r9, r6)     // Catch:{ all -> 0x0259 }
            r2 = 20
            r14 = 0
            java.lang.String r7 = "DatabaseHelper/createDatabaseIndexesAsync; failed to create async indexes"
            java.lang.String r6 = "0"
            if (r10 < r2) goto L_0x006e
            X.AnonymousClass14m.A03(r0, r12, r6, r9)     // Catch:{ all -> 0x0259 }
            X.AnonymousClass14m.A01(r0, r11)     // Catch:{ all -> 0x0259 }
            X.0wN r2 = r3.A04     // Catch:{ all -> 0x0259 }
            r2.A0E(r7, r14, r13)     // Catch:{ all -> 0x0259 }
        L_0x0060:
            X.0yC r7 = r1.A02     // Catch:{ all -> 0x0259 }
            X.0yV r6 = X.C21000yV.A01     // Catch:{ all -> 0x0259 }
            r2 = 3910(0xf46, float:5.479E-42)
            boolean r2 = X.C20800yB.A01(r6, r7, r2)     // Catch:{ all -> 0x0259 }
            if (r2 == 0) goto L_0x0190
            goto L_0x013e
        L_0x006e:
            X.38G r2 = X.AnonymousClass12f.A00(r3)     // Catch:{ all -> 0x0259 }
            X.38H r14 = new X.38H     // Catch:{ all -> 0x0259 }
            r14.<init>(r2)     // Catch:{ all -> 0x0259 }
            X.3Qo r13 = new X.3Qo     // Catch:{ all -> 0x0259 }
            r13.<init>()     // Catch:{ all -> 0x0259 }
            X.005 r2 = r3.A0A     // Catch:{ all -> 0x0259 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0259 }
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ all -> 0x0259 }
            java.util.Iterator r7 = r2.iterator()     // Catch:{ all -> 0x0259 }
        L_0x0088:
            boolean r2 = r7.hasNext()     // Catch:{ all -> 0x0259 }
            if (r2 == 0) goto L_0x0098
            java.lang.Object r2 = r7.next()     // Catch:{ all -> 0x0259 }
            X.15z r2 = (X.AnonymousClass15z) r2     // Catch:{ all -> 0x0259 }
            r2.B7n(r0, r14, r13)     // Catch:{ all -> 0x0259 }
            goto L_0x0088
        L_0x0098:
            java.util.Map r13 = r13.A00     // Catch:{ all -> 0x0259 }
            r13.size()     // Catch:{ all -> 0x0259 }
            java.util.Iterator r17 = X.AnonymousClass000.A0y(r13)     // Catch:{ all -> 0x0259 }
            r16 = 1
        L_0x00a3:
            boolean r2 = r17.hasNext()     // Catch:{ all -> 0x0259 }
            if (r2 == 0) goto L_0x00db
            java.util.Map$Entry r2 = X.AnonymousClass000.A11(r17)     // Catch:{ all -> 0x0259 }
            java.lang.Object r14 = r2.getKey()     // Catch:{ all -> 0x0259 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x0259 }
            java.lang.Object r7 = r2.getValue()     // Catch:{ all -> 0x0259 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0259 }
            java.lang.StringBuilder r15 = X.AnonymousClass000.A0v(r9)     // Catch:{ SQLiteException -> 0x00c7 }
            java.lang.String r2 = "schema-registry/createAsyncIndexes/"
            java.lang.String r2 = X.AnonymousClass000.A0p(r2, r14, r15)     // Catch:{ SQLiteException -> 0x00c7 }
            r0.A0D(r7, r2)     // Catch:{ SQLiteException -> 0x00c7 }
            goto L_0x00a3
        L_0x00c7:
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0v(r9)     // Catch:{ all -> 0x0259 }
            java.lang.String r2 = "/Failed to create index '"
            r7.append(r2)     // Catch:{ all -> 0x0259 }
            r7.append(r14)     // Catch:{ all -> 0x0259 }
            java.lang.String r2 = "'"
            X.C36321k7.A1Z(r7, r2)     // Catch:{ all -> 0x0259 }
            r16 = 0
            goto L_0x00a3
        L_0x00db:
            if (r16 == 0) goto L_0x00e5
            X.AnonymousClass14m.A03(r0, r12, r6, r9)     // Catch:{ all -> 0x0259 }
            X.AnonymousClass14m.A01(r0, r11)     // Catch:{ all -> 0x0259 }
            goto L_0x0060
        L_0x00e5:
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0259 }
            java.util.Set r2 = r13.keySet()     // Catch:{ all -> 0x0259 }
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r2)     // Catch:{ all -> 0x0259 }
            java.util.Iterator r14 = r2.iterator()     // Catch:{ all -> 0x0259 }
        L_0x00f5:
            boolean r2 = r14.hasNext()     // Catch:{ all -> 0x0259 }
            if (r2 == 0) goto L_0x010f
            java.lang.String r13 = X.AnonymousClass001.A0C(r14)     // Catch:{ all -> 0x0259 }
            java.lang.String r2 = "index"
            java.lang.String r2 = X.C224614k.A00(r0, r2, r13)     // Catch:{ all -> 0x0259 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0259 }
            if (r2 == 0) goto L_0x00f5
            r7.add(r13)     // Catch:{ all -> 0x0259 }
            goto L_0x00f5
        L_0x010f:
            boolean r2 = r7.isEmpty()     // Catch:{ all -> 0x0259 }
            if (r2 == 0) goto L_0x0122
            X.AnonymousClass14m.A03(r0, r12, r6, r9)     // Catch:{ all -> 0x0259 }
            X.AnonymousClass14m.A01(r0, r11)     // Catch:{ all -> 0x0259 }
            java.lang.String r2 = "DatabaseHelper/createDatabaseIndexesAsync; all indexes are created."
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x0259 }
            goto L_0x0060
        L_0x0122:
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0259 }
            java.lang.String r2 = "DatabaseHelper/createDatabaseIndexesAsync; failed to create async indexes, attemp #"
            r6.append(r2)     // Catch:{ all -> 0x0259 }
            r6.append(r10)     // Catch:{ all -> 0x0259 }
            java.lang.String r2 = ". Missing indexes: "
            r6.append(r2)     // Catch:{ all -> 0x0259 }
            java.lang.String r2 = ","
            java.lang.String r2 = android.text.TextUtils.join(r2, r7)     // Catch:{ all -> 0x0259 }
            X.C36321k7.A1Z(r6, r2)     // Catch:{ all -> 0x0259 }
            goto L_0x0060
        L_0x013e:
            r9 = 0
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.String r2 = X.AnonymousClass14m.A00(r0, r8, r2)     // Catch:{ NumberFormatException -> 0x014e }
            int r6 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x014e }
            r2 = 1
            if (r6 == r2) goto L_0x0190
        L_0x014e:
            X.14e r2 = r3.BJK()     // Catch:{ all -> 0x0259 }
            android.database.sqlite.SQLiteDatabase r2 = r2.A00     // Catch:{ all -> 0x0259 }
            r2.beginTransaction()     // Catch:{ all -> 0x0259 }
            java.lang.String r6 = "CREATE INDEX IF NOT EXISTS chat_hidden_index ON chat (hidden)"
            java.lang.String r2 = "chat/createAsyncIndex/chat_hidden_index"
            r0.A0D(r6, r2)     // Catch:{ all -> 0x0259 }
            android.content.ContentValues r7 = X.C36441kJ.A0E()     // Catch:{ all -> 0x0259 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0259 }
            java.lang.String r2 = "hidden"
            r7.put(r2, r6)     // Catch:{ all -> 0x0259 }
            java.lang.String r11 = "chat"
            java.lang.String r12 = "hidden IS NULL"
            r14 = 0
            java.lang.String r13 = "DatabaseHelper/updateNullHidden/hidden"
            r9 = r0
            r10 = r7
            r9.A01(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0259 }
            r6 = 1
            java.lang.String r2 = "MessageDBAsync"
            X.AnonymousClass14m.A02(r0, r8, r2, r6)     // Catch:{ all -> 0x0259 }
            X.14e r2 = r3.BJK()     // Catch:{ all -> 0x0259 }
            android.database.sqlite.SQLiteDatabase r2 = r2.A00     // Catch:{ all -> 0x0259 }
            r2.setTransactionSuccessful()     // Catch:{ all -> 0x0259 }
            X.14e r2 = r3.BJK()     // Catch:{ all -> 0x0259 }
            android.database.sqlite.SQLiteDatabase r2 = r2.A00     // Catch:{ all -> 0x0259 }
            r2.endTransaction()     // Catch:{ all -> 0x0259 }
        L_0x0190:
            java.lang.String r19 = "links_ready"
            java.lang.String r20 = "location_ready"
            java.lang.String r21 = "revoked_ready"
            java.lang.String r22 = "main_message_ready"
            java.lang.String r23 = "mention_message_ready"
            java.lang.String r24 = "new_vcards_ready"
            java.lang.String r25 = "receipt_user_ready"
            java.lang.String r26 = "system_message_ready"
            java.lang.String r27 = "quoted_message_ready"
            java.lang.String r28 = "thumbnail_ready"
            java.lang.String r29 = "text_ready"
            java.lang.String r30 = "future_ready"
            java.lang.String r31 = "send_count_ready"
            java.lang.String r32 = "labeled_jids_ready"
            java.lang.String r33 = "frequent_ready"
            java.lang.String r34 = "participant_user_ready"
            java.lang.String r35 = "receipt_device_migration_complete"
            java.lang.String r36 = "new_pay_transaction_ready"
            java.lang.String r37 = "quoted_order_message_ready"
            java.lang.String r38 = "quoted_order_message_v2_migration_ready"
            java.lang.String r39 = "quoted_ui_elements_reply_message_migration_ready"
            java.lang.String r40 = "links_index_start"
            java.lang.String r41 = "jid_ready"
            java.lang.String r42 = "jid_map_ready"
            java.lang.String r43 = "chat_ready"
            java.lang.String r44 = "call_log_ready"
            java.lang.String r45 = "missed_calls_ready"
            java.lang.String r46 = "media_message_ready"
            java.lang.String r47 = "media_message_fixer_ready"
            java.lang.String r48 = "migration_completed"
            java.lang.String r49 = "status_list_ready"
            java.lang.String r50 = "blank_me_jid_ready"
            java.lang.String r51 = "broadcast_me_jid_ready"
            java.lang.String r52 = "write_to_old_schema_disabled"
            java.lang.String r53 = "vcards_index_start"
            java.lang.String r54 = "vcards_ready"
            java.lang.String r55 = "migration_message_main_retry"
            java.lang.String r56 = "migration_message_main_index"
            java.lang.String r57 = "quoted_ui_elements_reply_message_start_index"
            java.lang.String r58 = "quoted_ui_elements_reply_message_retry_count"
            java.lang.String r59 = "migration_chat_store_retry_count"
            java.lang.String r60 = "migration_chat_store_start_index"
            java.lang.String r61 = "migration_jid_store_retry_count"
            java.lang.String r62 = "migration_jid_store_start_index"
            java.lang.String r63 = "payment_transaction"
            java.lang.String r65 = "migration_pay_transaction_index"
            java.lang.String r66 = "migration_pay_transaction_retry"
            java.lang.String r67 = "migration_message_send_count_index"
            java.lang.String r68 = "migration_message_send_count_retry"
            java.lang.String r69 = "migration_message_media_index"
            java.lang.String r70 = "migration_message_media_retry"
            java.lang.String r71 = "migration_participant_user_index"
            java.lang.String r72 = "migration_participant_user_retry"
            java.lang.String r73 = "migration_broadcast_me_jid_index"
            java.lang.String r74 = "migration_broadcast_me_jid_retry"
            java.lang.String r75 = "migration_message_location_index"
            java.lang.String r76 = "migration_message_location_retry"
            java.lang.String r77 = "migration_receipt_device_index"
            java.lang.String r78 = "migration_receipt_device_retry"
            java.lang.String r79 = "migration_message_mention_index"
            java.lang.String r80 = "migration_message_mention_retry"
            java.lang.String r81 = "migration_missed_calls_log_index"
            java.lang.String r82 = "migration_missed_calls_log_retry"
            java.lang.String r83 = "migration_message_system_index"
            java.lang.String r84 = "migration_message_system_retry"
            java.lang.String r85 = "migration_message_revoked_index"
            java.lang.String r86 = "migration_message_revoked_retry"
            java.lang.String r87 = "migration_frequent_index"
            java.lang.String r88 = "migration_frequent_retry"
            java.lang.String r89 = "migration_message_future_index"
            java.lang.String r90 = "migration_message_future_retry"
            java.lang.String r91 = "migration_vcard_index"
            java.lang.String r92 = "migration_vcard_retry"
            java.lang.String r93 = "migration_message_text_index"
            java.lang.String r94 = "migration_message_text_retry"
            java.lang.String r95 = "migration_receipt_index"
            java.lang.String r96 = "migration_receipt_retry"
            r64 = r63
            java.lang.String[] r6 = new java.lang.String[]{r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96}     // Catch:{ all -> 0x0259 }
            r3 = 0
        L_0x0231:
            r2 = r6[r3]     // Catch:{ all -> 0x0259 }
            X.AnonymousClass14m.A01(r0, r2)     // Catch:{ all -> 0x0259 }
            int r3 = r3 + 1
            r2 = 78
            if (r3 < r2) goto L_0x0231
            r18.close()
            X.135 r6 = new X.135
            r6.<init>()
            long r2 = android.os.SystemClock.uptimeMillis()
            long r2 = r2 - r4
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r6.A00 = r0
            java.lang.String r0 = "MessageDBAsync/onAsyncInitUserRegisteredAndDbReady"
            r6.A02 = r0
            X.0yW r0 = r1.A03
            r0.Bly(r6)
            return
        L_0x0259:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x025e }
            throw r1
        L_0x025e:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69103cz.BRM():void");
    }

    public C69103cz(C19970wo r1, AnonymousClass12P r2, C20810yC r3, C21010yW r4) {
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
    }
}
