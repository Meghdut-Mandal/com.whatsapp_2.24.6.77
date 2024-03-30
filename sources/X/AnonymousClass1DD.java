package X;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: X.1DD  reason: invalid class name */
public class AnonymousClass1DD extends C229616q {
    public final AnonymousClass11g A00;
    public final AnonymousClass12S A01;

    public AnonymousClass1DD(C19700wN r4, C19630wG r5, AnonymousClass11g r6, AnonymousClass12S r7) {
        super(r5.A00, r4, "media.db", 27);
        this.A01 = r7;
        this.A00 = r6;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C224614k.A01(sQLiteDatabase, "media_job");
        C224614k.A01(sQLiteDatabase, "media_experiments");
        C224614k.A01(sQLiteDatabase, "web_upload_media_data_store");
        C224614k.A01(sQLiteDatabase, "draft_voice_note_metadata");
        C224614k.A01(sQLiteDatabase, "express_path_download_data");
        sQLiteDatabase.execSQL("CREATE TABLE media_job (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,uuid TEXT NOT NULL, job_type INTEGER, create_time TIMESTAMP, transfer_start_time TIMESTAMP, last_update_time TIMESTAMP, user_initiated_attempt_count INTEGER, overall_cumulative_time TIMESTAMP, overall_cumulative_user_visible_time TIMESTAMP, streaming_playback_count INTEGER, media_key_reuse_type INTEGER, doodle_id TEXT, transferred_bytes INTEGER,reupload_attempt_count INTEGER,last_reupload_attempt_timestamp TIMESTAMP,last_reupload_success_timestamp TIMESTAMP)");
        sQLiteDatabase.execSQL("CREATE TABLE shared_media_ids (item_uuid TEXT PRIMARY KEY NOT NULL, file_name TEXT NOT NULL, mime_type TEXT NOT NULL, display_name TEXT, expiration_timestamp INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE draft_voice_note_metadata (chat_jid TEXT PRIMARY KEY NOT NULL, page_number INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE express_path_download_data (enc_file_hash TEXT PRIMARY KEY NOT NULL, ep_saved_time_ms INTEGER, ep_saved_bytes INTEGER, last_update_time TIMESTAMP, enc_file_restored BOOLEAN DEFAULT 0)");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C224614k.A01(sQLiteDatabase, "media_job");
        C224614k.A01(sQLiteDatabase, "media_experiments");
        C224614k.A01(sQLiteDatabase, "web_upload_media_key_store");
        C224614k.A01(sQLiteDatabase, "web_upload_media_data_store");
        C224614k.A01(sQLiteDatabase, "shared_media_ids");
        C224614k.A01(sQLiteDatabase, "draft_voice_note_metadata");
        C224614k.A01(sQLiteDatabase, "express_path_download_data");
        onCreate(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C224614k.A01(sQLiteDatabase, "media_job");
        C224614k.A01(sQLiteDatabase, "media_experiments");
        C224614k.A01(sQLiteDatabase, "web_upload_media_data_store");
        C224614k.A01(sQLiteDatabase, "shared_media_ids");
        C224614k.A01(sQLiteDatabase, "draft_voice_note_metadata");
        C224614k.A01(sQLiteDatabase, "express_path_download_data");
        if (i < 16) {
            C224614k.A01(sQLiteDatabase, "web_upload_media_key_store");
        }
        sQLiteDatabase.execSQL("CREATE TABLE media_job (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,uuid TEXT NOT NULL, job_type INTEGER, create_time TIMESTAMP, transfer_start_time TIMESTAMP, last_update_time TIMESTAMP, user_initiated_attempt_count INTEGER, overall_cumulative_time TIMESTAMP, overall_cumulative_user_visible_time TIMESTAMP, streaming_playback_count INTEGER, media_key_reuse_type INTEGER, doodle_id TEXT, transferred_bytes INTEGER,reupload_attempt_count INTEGER,last_reupload_attempt_timestamp TIMESTAMP,last_reupload_success_timestamp TIMESTAMP)");
        sQLiteDatabase.execSQL("CREATE TABLE shared_media_ids (item_uuid TEXT PRIMARY KEY NOT NULL, file_name TEXT NOT NULL, mime_type TEXT NOT NULL, display_name TEXT, expiration_timestamp INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE draft_voice_note_metadata (chat_jid TEXT PRIMARY KEY NOT NULL, page_number INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE express_path_download_data (enc_file_hash TEXT PRIMARY KEY NOT NULL, ep_saved_time_ms INTEGER, ep_saved_bytes INTEGER, last_update_time TIMESTAMP, enc_file_restored BOOLEAN DEFAULT 0)");
    }

    public C224114e A07() {
        String databaseName = getDatabaseName();
        return C224014d.A01(super.A02(), this.A00, this.A01, databaseName);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        sQLiteDatabase.execSQL("PRAGMA synchronous=NORMAL;");
    }
}
