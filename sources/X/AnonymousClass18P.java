package X;

import android.database.sqlite.SQLiteDatabase;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.18P  reason: invalid class name */
public class AnonymousClass18P extends C229616q {
    public final AnonymousClass11g A00;
    public final AnonymousClass12S A01;
    public final C19660wJ A02;

    public AnonymousClass18P(C19700wN r4, C19630wG r5, AnonymousClass11g r6, AnonymousClass12S r7, AnonymousClass005 r8) {
        super(r5.A00, r4, "sync.db", 49);
        this.A01 = r7;
        this.A00 = r6;
        this.A02 = new C19660wJ(r8);
    }

    public void A08(SQLiteDatabase sQLiteDatabase) {
        Log.i("sync-db-helper/reset");
        C224614k.A01(sQLiteDatabase, "syncd_mutations");
        C224614k.A01(sQLiteDatabase, "collection_versions");
        C224614k.A01(sQLiteDatabase, "pending_mutations");
        C224614k.A01(sQLiteDatabase, "peer_messages");
        C224614k.A01(sQLiteDatabase, "msg_history_sync");
        C224614k.A01(sQLiteDatabase, "crypto_info");
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS peer_messages_bi_for_fanout_backfill_messages_trigger");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS peer_messages_message_key_index");
        C224614k.A01(sQLiteDatabase, "fanout_backfill_messages");
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS crypto_info_bi_for_missing_keys_trigger");
        C224614k.A01(sQLiteDatabase, "missing_keys");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS syncd_mutations_active_mutations_index");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS syncd_mutations_active_mutations_chat_jid_index");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS history_sync_companion_index");
        C224614k.A01(sQLiteDatabase, "history_sync_companion");
        C224614k.A01(sQLiteDatabase, "rmr_response_error");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS rmr_response_error_file_key_rmr_source");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS rmr_response_error_file_key_rmr_source_device_id");
        C224614k.A01(sQLiteDatabase, "placeholder_retry_message");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS placeholder_retry_timestamp_index");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS placeholder_retry_peer_msg_index");
        onCreate(sQLiteDatabase);
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            Log.i("sync-db-observer/onDbReset");
            ((C594734b) it.next()).A01.A03(5);
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE syncd_mutations(_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, mutation_index TEXT UNIQUE NOT NULL, mutation_value BLOB, mutation_version INTEGER NOT NULL, collection_name TEXT NOT NULL, are_dependencies_missing BOOLEAN NOT NULL, mutation_mac BLOB, device_id INTEGER NOT NULL DEFAULT 0, epoch INTEGER NOT NULL DEFAULT 0, chat_jid TEXT, mutation_name TEXT )");
        sQLiteDatabase.execSQL("CREATE TABLE collection_versions (collection_name TEXT PRIMARY KEY, version INTEGER NOT NULL, lt_hash BLOB, dirty_version INTEGER NOT NULL DEFAULT -1 ) ");
        sQLiteDatabase.execSQL("CREATE TABLE pending_mutations(_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, mutation_index TEXT UNIQUE NOT NULL, mutation_value BLOB, mutation_version INTEGER NOT NULL, operation BLOB NOT NULL, is_ready_to_sync BOOLEAN NOT NULL DEFAULT 1, collection_name TEXT, device_id INTEGER, epoch INTEGER, are_dependencies_missing BOOLEAN NOT NULL DEFAULT 0, mutation_name TEXT NOT NULL DEFAULT '', chat_jid TEXT )");
        sQLiteDatabase.execSQL("CREATE TABLE peer_messages(_id INTEGER PRIMARY KEY AUTOINCREMENT,message_type INTEGER NOT NULL, key_remote_jid TEXT NOT NULL, key_from_me INTEGER, key_id TEXT NOT NULL, device_id TEXT, timestamp INTEGER, data TEXT, acked BOOLEAN )");
        sQLiteDatabase.execSQL("CREATE TABLE msg_history_sync(_id INTEGER PRIMARY KEY AUTOINCREMENT, device_id TEXT NOT NULL, sync_type INTEGER NOT NULL, last_processed_msg_row_id INTEGER, oldest_msg_row_id INTEGER, sent_msgs_count INTEGER, chunk_order INTEGER, sent_bytes INTEGER, last_chunk_timestamp INTEGER, status INTEGER, peer_msg_row_id INTEGER, oldest_message_to_sync_row_id INTEGER, session_id TEXT, md_reg_attempt_id TEXT, size_limit_bytes INTEGER )");
        sQLiteDatabase.execSQL("CREATE TABLE crypto_info (device_id INTEGER NOT NULL, epoch INTEGER NOT NULL, key_data BLOB NOT NULL, timestamp INTEGER NOT NULL, fingerprint BLOB NOT NULL, stale_timestamp INTEGER NOT NULL DEFAULT 0, PRIMARY KEY ( device_id , epoch ) )");
        sQLiteDatabase.execSQL("CREATE TABLE missing_keys (device_id INTEGER NOT NULL, epoch INTEGER NOT NULL, collection_name TEXT NOT NULL, PRIMARY KEY ( device_id , epoch , collection_name ) )");
        sQLiteDatabase.execSQL("CREATE TRIGGER crypto_info_bi_for_missing_keys_trigger AFTER INSERT ON crypto_info BEGIN DELETE FROM missing_keys WHERE device_id=new.device_id AND epoch=new.epoch; END");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS syncd_mutations_active_mutations_index ON syncd_mutations (are_dependencies_missing)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS syncd_mutations_active_mutations_chat_jid_index ON syncd_mutations (chat_jid, are_dependencies_missing)");
        sQLiteDatabase.execSQL("CREATE TABLE history_sync_companion (message_id TEXT PRIMARY KEY NOT NULL, sync_type INTEGER NOT NULL, chunk_order INTEGER NOT NULL, media_key BLOB, media_hash TEXT NOT NULL, media_enc_hash TEXT NOT NULL, file_size INTEGER NOT NULL, direct_path TEXT NOT NULL, local_path TEXT, start_time INTEGER, inline_payload BLOB )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS history_sync_companion_index ON history_sync_companion (sync_type,chunk_order)");
        sQLiteDatabase.execSQL("CREATE TABLE rmr_response_error (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, file_key TEXT NOT NULL, rmr_source INTEGER NOT NULL, failure_count INTEGER NOT NULL, response_device_id INTEGER NOT NULL, last_fetch_timestamp INTEGER NOT NULL  ) ");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS rmr_response_error_file_key_rmr_source ON rmr_response_error (file_key, rmr_source)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS rmr_response_error_file_key_rmr_source_device_id ON rmr_response_error (file_key, rmr_source, response_device_id)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS placeholder_retry_message (message_row_id INTEGER PRIMARY KEY NOT NULL, peer_message_row_id INTEGER NOT NULL, timestamp INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS placeholder_retry_timestamp_index ON placeholder_retry_message (timestamp)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS placeholder_retry_peer_msg_index ON placeholder_retry_message (peer_message_row_id)");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("sync-db-helper/onDowngrade oldVersion:");
        sb.append(i);
        sb.append(", newVersion:");
        sb.append(i2);
        Log.i(sb.toString());
        A08(sQLiteDatabase);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0094, code lost:
        r5.execSQL("DROP TRIGGER IF EXISTS peer_messages_bi_for_fanout_backfill_messages_trigger");
        r5.execSQL("DROP INDEX IF EXISTS peer_messages_message_key_index");
        X.C224614k.A01(r5, "fanout_backfill_messages");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00a3, code lost:
        r5.execSQL("ALTER TABLE collection_versions ADD lt_hash BLOB");
        r5.execSQL("ALTER TABLE syncd_mutations ADD mutation_mac BLOB");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00ad, code lost:
        r5.execSQL("ALTER TABLE msg_history_sync ADD oldest_message_to_sync_row_id INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00b2, code lost:
        r5.execSQL("ALTER TABLE pending_mutations ADD is_ready_to_sync BOOLEAN NOT NULL DEFAULT 1");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00b7, code lost:
        r5.execSQL("ALTER TABLE pending_mutations ADD collection_name TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00bc, code lost:
        r5.execSQL("ALTER TABLE pending_mutations ADD device_id INTEGER");
        r5.execSQL("ALTER TABLE pending_mutations ADD epoch INTEGER");
        r5.execSQL("ALTER TABLE syncd_mutations ADD device_id INTEGER NOT NULL DEFAULT 0");
        r5.execSQL("ALTER TABLE syncd_mutations ADD epoch INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00d0, code lost:
        r5.execSQL("ALTER TABLE crypto_info ADD stale_timestamp INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00d5, code lost:
        r5.execSQL("ALTER TABLE pending_mutations ADD are_dependencies_missing BOOLEAN NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00da, code lost:
        r5.execSQL("ALTER TABLE syncd_mutations ADD chat_jid TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00df, code lost:
        r5.execSQL("CREATE INDEX IF NOT EXISTS syncd_mutations_active_mutations_index ON syncd_mutations (are_dependencies_missing)");
        r5.execSQL("CREATE INDEX IF NOT EXISTS syncd_mutations_active_mutations_chat_jid_index ON syncd_mutations (chat_jid, are_dependencies_missing)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e9, code lost:
        r5.execSQL("ALTER TABLE collection_versions ADD dirty_version INTEGER NOT NULL DEFAULT -1");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ee, code lost:
        r5.execSQL("ALTER TABLE peer_messages ADD acked BOOLEAN ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00f3, code lost:
        X.C224614k.A01(r5, "encrypted_mutations");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f8, code lost:
        r5.execSQL("ALTER TABLE syncd_mutations ADD mutation_name TEXT");
        r5.execSQL("ALTER TABLE pending_mutations ADD mutation_name TEXT NOT NULL DEFAULT ''");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0102, code lost:
        r5.execSQL("ALTER TABLE msg_history_sync ADD session_id TEXT");
        r5.execSQL("ALTER TABLE msg_history_sync ADD md_reg_attempt_id TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x010c, code lost:
        r5.execSQL("ALTER TABLE pending_mutations ADD chat_jid TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0111, code lost:
        r5.execSQL("CREATE TABLE history_sync_companion (message_id TEXT PRIMARY KEY NOT NULL, sync_type INTEGER NOT NULL, chunk_order INTEGER NOT NULL, media_key BLOB, media_hash TEXT NOT NULL, media_enc_hash TEXT NOT NULL, file_size INTEGER NOT NULL, direct_path TEXT NOT NULL, local_path TEXT, start_time INTEGER, inline_payload BLOB )");
        r5.execSQL("CREATE INDEX IF NOT EXISTS history_sync_companion_index ON history_sync_companion (sync_type,chunk_order)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x011b, code lost:
        r5.execSQL("CREATE TABLE rmr_response_error (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, file_key TEXT NOT NULL, rmr_source INTEGER NOT NULL, failure_count INTEGER NOT NULL, response_device_id INTEGER NOT NULL, last_fetch_timestamp INTEGER NOT NULL  ) ");
        r5.execSQL("CREATE INDEX IF NOT EXISTS rmr_response_error_file_key_rmr_source ON rmr_response_error (file_key, rmr_source)");
        r5.execSQL("CREATE INDEX IF NOT EXISTS rmr_response_error_file_key_rmr_source_device_id ON rmr_response_error (file_key, rmr_source, response_device_id)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x012a, code lost:
        r5.execSQL("ALTER TABLE msg_history_sync ADD size_limit_bytes INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0131, code lost:
        if (r6 < 44) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0138, code lost:
        r5.execSQL("CREATE TABLE IF NOT EXISTS placeholder_retry_message (message_row_id INTEGER PRIMARY KEY NOT NULL, peer_message_row_id INTEGER NOT NULL, timestamp INTEGER NOT NULL)");
        r5.execSQL("CREATE INDEX IF NOT EXISTS placeholder_retry_timestamp_index ON placeholder_retry_message (timestamp)");
        r5.execSQL("CREATE INDEX IF NOT EXISTS placeholder_retry_peer_msg_index ON placeholder_retry_message (peer_message_row_id)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0149, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003c, code lost:
        r3 = r4.A02.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0046, code lost:
        if (r3.hasNext() == false) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0048, code lost:
        r2 = (X.C594734b) r3.next();
        r1 = new java.lang.StringBuilder();
        r1.append("sync-db-observer/onDbReset(");
        r1.append(r6);
        r1.append(", ");
        r1.append(r7);
        r1.append(")");
        com.whatsapp.util.Log.i(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0071, code lost:
        if (r6 >= 43) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0073, code lost:
        if (43 > r7) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0075, code lost:
        r2.A00.A01(new com.whatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r5, int r6, int r7) {
        /*
            r4 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "sync-db-helper/onUpgrade oldVersion:"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r2 = ", newVersion:"
            r1.append(r2)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            switch(r6) {
                case 23: goto L_0x0080;
                case 24: goto L_0x0094;
                case 25: goto L_0x00a3;
                case 26: goto L_0x00ad;
                case 27: goto L_0x00b2;
                case 28: goto L_0x00b7;
                case 29: goto L_0x00bc;
                case 30: goto L_0x00d0;
                case 31: goto L_0x00d5;
                case 32: goto L_0x00da;
                case 33: goto L_0x00df;
                case 34: goto L_0x00e9;
                case 35: goto L_0x00ee;
                case 36: goto L_0x00f3;
                case 37: goto L_0x00f8;
                case 38: goto L_0x0102;
                case 39: goto L_0x0102;
                case 40: goto L_0x0102;
                case 41: goto L_0x010c;
                case 42: goto L_0x0111;
                case 43: goto L_0x0111;
                case 44: goto L_0x011b;
                case 45: goto L_0x011b;
                case 46: goto L_0x012a;
                case 47: goto L_0x0133;
                case 48: goto L_0x0138;
                default: goto L_0x001f;
            }
        L_0x001f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "sync-db-helper/onUpgrade unknown oldVersion:"
            r1.append(r0)
            r1.append(r6)
            r1.append(r2)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r4.A08(r5)
        L_0x003c:
            X.0wJ r0 = r4.A02
            java.util.Iterator r3 = r0.iterator()
        L_0x0042:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0149
            java.lang.Object r2 = r3.next()
            X.34b r2 = (X.C594734b) r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "sync-db-observer/onDbReset("
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 43
            if (r6 >= r0) goto L_0x0042
            if (r0 > r7) goto L_0x0042
            X.164 r1 = r2.A00
            com.whatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob r0 = new com.whatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob
            r0.<init>()
            r1.A01(r0)
            goto L_0x0042
        L_0x0080:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS crypto_info_bi_for_missing_keys_trigger"
            r5.execSQL(r0)
            java.lang.String r0 = "missing_keys"
            X.C224614k.A01(r5, r0)
            java.lang.String r0 = "CREATE TABLE missing_keys (device_id INTEGER NOT NULL, epoch INTEGER NOT NULL, collection_name TEXT NOT NULL, PRIMARY KEY ( device_id , epoch , collection_name ) )"
            r5.execSQL(r0)
            java.lang.String r0 = "CREATE TRIGGER crypto_info_bi_for_missing_keys_trigger AFTER INSERT ON crypto_info BEGIN DELETE FROM missing_keys WHERE device_id=new.device_id AND epoch=new.epoch; END"
            r5.execSQL(r0)
        L_0x0094:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS peer_messages_bi_for_fanout_backfill_messages_trigger"
            r5.execSQL(r0)
            java.lang.String r0 = "DROP INDEX IF EXISTS peer_messages_message_key_index"
            r5.execSQL(r0)
            java.lang.String r0 = "fanout_backfill_messages"
            X.C224614k.A01(r5, r0)
        L_0x00a3:
            java.lang.String r0 = "ALTER TABLE collection_versions ADD lt_hash BLOB"
            r5.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE syncd_mutations ADD mutation_mac BLOB"
            r5.execSQL(r0)
        L_0x00ad:
            java.lang.String r0 = "ALTER TABLE msg_history_sync ADD oldest_message_to_sync_row_id INTEGER"
            r5.execSQL(r0)
        L_0x00b2:
            java.lang.String r0 = "ALTER TABLE pending_mutations ADD is_ready_to_sync BOOLEAN NOT NULL DEFAULT 1"
            r5.execSQL(r0)
        L_0x00b7:
            java.lang.String r0 = "ALTER TABLE pending_mutations ADD collection_name TEXT"
            r5.execSQL(r0)
        L_0x00bc:
            java.lang.String r0 = "ALTER TABLE pending_mutations ADD device_id INTEGER"
            r5.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE pending_mutations ADD epoch INTEGER"
            r5.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE syncd_mutations ADD device_id INTEGER NOT NULL DEFAULT 0"
            r5.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE syncd_mutations ADD epoch INTEGER NOT NULL DEFAULT 0"
            r5.execSQL(r0)
        L_0x00d0:
            java.lang.String r0 = "ALTER TABLE crypto_info ADD stale_timestamp INTEGER NOT NULL DEFAULT 0"
            r5.execSQL(r0)
        L_0x00d5:
            java.lang.String r0 = "ALTER TABLE pending_mutations ADD are_dependencies_missing BOOLEAN NOT NULL DEFAULT 0"
            r5.execSQL(r0)
        L_0x00da:
            java.lang.String r0 = "ALTER TABLE syncd_mutations ADD chat_jid TEXT"
            r5.execSQL(r0)
        L_0x00df:
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS syncd_mutations_active_mutations_index ON syncd_mutations (are_dependencies_missing)"
            r5.execSQL(r0)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS syncd_mutations_active_mutations_chat_jid_index ON syncd_mutations (chat_jid, are_dependencies_missing)"
            r5.execSQL(r0)
        L_0x00e9:
            java.lang.String r0 = "ALTER TABLE collection_versions ADD dirty_version INTEGER NOT NULL DEFAULT -1"
            r5.execSQL(r0)
        L_0x00ee:
            java.lang.String r0 = "ALTER TABLE peer_messages ADD acked BOOLEAN "
            r5.execSQL(r0)
        L_0x00f3:
            java.lang.String r0 = "encrypted_mutations"
            X.C224614k.A01(r5, r0)
        L_0x00f8:
            java.lang.String r0 = "ALTER TABLE syncd_mutations ADD mutation_name TEXT"
            r5.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE pending_mutations ADD mutation_name TEXT NOT NULL DEFAULT ''"
            r5.execSQL(r0)
        L_0x0102:
            java.lang.String r0 = "ALTER TABLE msg_history_sync ADD session_id TEXT"
            r5.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE msg_history_sync ADD md_reg_attempt_id TEXT"
            r5.execSQL(r0)
        L_0x010c:
            java.lang.String r0 = "ALTER TABLE pending_mutations ADD chat_jid TEXT"
            r5.execSQL(r0)
        L_0x0111:
            java.lang.String r0 = "CREATE TABLE history_sync_companion (message_id TEXT PRIMARY KEY NOT NULL, sync_type INTEGER NOT NULL, chunk_order INTEGER NOT NULL, media_key BLOB, media_hash TEXT NOT NULL, media_enc_hash TEXT NOT NULL, file_size INTEGER NOT NULL, direct_path TEXT NOT NULL, local_path TEXT, start_time INTEGER, inline_payload BLOB )"
            r5.execSQL(r0)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS history_sync_companion_index ON history_sync_companion (sync_type,chunk_order)"
            r5.execSQL(r0)
        L_0x011b:
            java.lang.String r0 = "CREATE TABLE rmr_response_error (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, file_key TEXT NOT NULL, rmr_source INTEGER NOT NULL, failure_count INTEGER NOT NULL, response_device_id INTEGER NOT NULL, last_fetch_timestamp INTEGER NOT NULL  ) "
            r5.execSQL(r0)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS rmr_response_error_file_key_rmr_source ON rmr_response_error (file_key, rmr_source)"
            r5.execSQL(r0)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS rmr_response_error_file_key_rmr_source_device_id ON rmr_response_error (file_key, rmr_source, response_device_id)"
            r5.execSQL(r0)
        L_0x012a:
            java.lang.String r0 = "ALTER TABLE msg_history_sync ADD size_limit_bytes INTEGER"
            r5.execSQL(r0)
            r0 = 44
            if (r6 < r0) goto L_0x0138
        L_0x0133:
            java.lang.String r0 = "ALTER TABLE history_sync_companion ADD inline_payload BLOB"
            r5.execSQL(r0)
        L_0x0138:
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS placeholder_retry_message (message_row_id INTEGER PRIMARY KEY NOT NULL, peer_message_row_id INTEGER NOT NULL, timestamp INTEGER NOT NULL)"
            r5.execSQL(r0)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS placeholder_retry_timestamp_index ON placeholder_retry_message (timestamp)"
            r5.execSQL(r0)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS placeholder_retry_peer_msg_index ON placeholder_retry_message (peer_message_row_id)"
            r5.execSQL(r0)
            goto L_0x003c
        L_0x0149:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass18P.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }

    public C224114e A07() {
        String databaseName = getDatabaseName();
        return C224014d.A01(super.A02(), this.A00, this.A01, databaseName);
    }
}
