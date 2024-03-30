package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: X.54e  reason: invalid class name and case insensitive filesystem */
public class C1031554e extends C229616q {
    public final C19700wN A00;
    public final AnonymousClass11g A01;
    public final AnonymousClass12S A02;

    public C1031554e(C19700wN r4, C19630wG r5, AnonymousClass11g r6, AnonymousClass12S r7) {
        super(r5.A00, r4, "stickers.db", 45);
        this.A00 = r4;
        this.A02 = r7;
        this.A01 = r6;
    }

    private void A00(SQLiteDatabase sQLiteDatabase) {
        C224614k.A01(sQLiteDatabase, "downloadable_sticker_packs");
        C224614k.A01(sQLiteDatabase, "stickers");
        C224614k.A01(sQLiteDatabase, "installed_sticker_packs");
        C224614k.A01(sQLiteDatabase, "starred_stickers");
        C224614k.A01(sQLiteDatabase, "sticker_pack_order");
        C224614k.A01(sQLiteDatabase, "recent_stickers");
        C224614k.A01(sQLiteDatabase, "unseen_sticker_packs");
        C224614k.A01(sQLiteDatabase, "third_party_whitelist_packs");
        C224614k.A01(sQLiteDatabase, "new_sticker_packs");
        C224614k.A01(sQLiteDatabase, "third_party_sticker_emoji_mapping");
        C224614k.A01(sQLiteDatabase, "avatar_sticker_search_dictionary");
        C224614k.A01(sQLiteDatabase, "sticker_md_upload");
    }

    public static void A01(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS sticker_is_avatar_index ON stickers (is_avatar)");
        } catch (SQLiteException e) {
            C18740tg.A08("StickerDBHelper/addStickerIsAvatarColumnIndex", e);
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE stickers (plain_file_hash TEXT NOT NULL, encrypted_file_hash TEXT, media_key TEXT, mime_type TEXT, height INTEGER NOT NULL, width INTEGER NOT NULL, sticker_pack_id TEXT, file_path TEXT, url TEXT, file_size INTEGER, direct_path TEXT, emojis TEXT, hash_of_image_part TEXT, is_avatar INTEGER NOT NULL DEFAULT 0, avatar_template_id TEXT, is_fun_sticker INTEGER, is_lottie INTEGER, PRIMARY KEY(plain_file_hash))");
        sQLiteDatabase.execSQL("CREATE TABLE downloadable_sticker_packs (id TEXT NOT NULL, name TEXT, publisher TEXT, description TEXT, size INTEGER NOT NULL, tray_image_id TEXT, tray_image_preview_id TEXT, preview_image_id_array TEXT, image_data_hash TEXT NOT NULL, animated_pack INTEGER NOT NULL, lottie_pack INTEGER, PRIMARY KEY(id))");
        sQLiteDatabase.execSQL("CREATE TABLE installed_sticker_packs (installed_id TEXT NOT NULL, installed_name TEXT, installed_publisher TEXT, installed_description TEXT, installed_size INTEGER NOT NULL, installed_image_data_hash TEXT NOT NULL, installed_tray_image_id TEXT NOT NULL, installed_tray_image_preview_id TEXT, installed_animated_pack INTEGER NOT NULL, installed_is_avatar_pack INTEGER NOT NULL DEFAULT 0, installed_empty_favorites_avatar_template_id TEXT, installed_empty_recents_avatar_template_id TEXT, installed_lottie_pack INTEGER, PRIMARY KEY(installed_id))");
        sQLiteDatabase.execSQL("CREATE TABLE starred_stickers (plaintext_hash TEXT  NOT NULL , timestamp LONG , hash_of_image_part TEXT , url TEXT , enc_hash TEXT , direct_path TEXT , mimetype TEXT , media_key TEXT , file_size INTEGER , width INTEGER , height INTEGER , emojis TEXT , is_first_party INTEGER , is_avatar INTEGER  NOT NULL  DEFAULT 0 , avatar_template_id TEXT , is_fun_sticker INTEGER  , is_lottie INTEGER  , PRIMARY KEY(plaintext_hash))");
        sQLiteDatabase.execSQL("CREATE TABLE sticker_pack_order (sticker_pack_id TEXT PRIMARY KEY NOT NULL, pack_order INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE recent_stickers (plaintext_hash TEXT  NOT NULL , entry_weight FLOAT  NOT NULL , hash_of_image_part TEXT , url TEXT , enc_hash TEXT , direct_path TEXT , mimetype TEXT , media_key TEXT , file_size INTEGER , width INTEGER , height INTEGER , emojis TEXT , is_first_party INTEGER , is_avocado INTEGER  NOT NULL  DEFAULT 0 , last_sticker_sent_ts INTEGER  NOT NULL  DEFAULT 0 , avatar_template_id TEXT , is_fun_sticker INTEGER  , is_lottie INTEGER  , PRIMARY KEY(plaintext_hash))");
        sQLiteDatabase.execSQL("CREATE TABLE unseen_sticker_packs (pack_id TEXT PRIMARY KEY NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE third_party_whitelist_packs (authority TEXT NOT NULL, sticker_pack_id TEXT NOT NULL, sticker_pack_name TEXT, sticker_pack_publisher TEXT, sticker_pack_image_data_hash TEXT, avoid_cache INTEGER, is_animated_pack INTEGER, PRIMARY KEY (authority,sticker_pack_id))");
        sQLiteDatabase.execSQL("CREATE TABLE new_sticker_packs (pack_id TEXT PRIMARY KEY NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE third_party_sticker_emoji_mapping (plaintext_hash TEXT  NOT NULL , authority TEXT  NOT NULL , sticker_pack_id TEXT  NOT NULL , emojis TEXT , hash_of_image_part TEXT , PRIMARY KEY(plaintext_hash))");
        sQLiteDatabase.execSQL("CREATE TABLE avatar_sticker_search_dictionary (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, sticker_id TEXT NOT NULL, tag TEXT NOT NULL, weight INTEGER NOT NULL DEFAULT 0)");
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS sticker_avatar_template_id_index ON stickers (avatar_template_id)");
        } catch (SQLiteException e) {
            C18740tg.A08("StickerDBHelper/addStickerIsAvatarColumnIndex", e);
        }
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS recent_sticker_is_avocado_index ON recent_stickers (is_avocado)");
        } catch (SQLiteException e2) {
            C18740tg.A08("StickersDBHelper/addRecentStickerAvocadoColumnIndex", e2);
        }
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS recent_sticker_avatar_template_index ON recent_stickers (avatar_template_id)");
        } catch (SQLiteException e3) {
            C18740tg.A08("StickersDBHelper/addRecentStickerAvocadoColumnIndex", e3);
        }
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS starred_sticker_is_avatar_index ON starred_stickers (is_avatar)");
        } catch (SQLiteException e4) {
            C18740tg.A08("StickersDBHelper/addStarredStickerAvocadoColumnIndex", e4);
        }
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS starred_sticker_avatar_template_id_index ON starred_stickers (avatar_template_id)");
        } catch (SQLiteException e5) {
            C18740tg.A08("StickersDBHelper/addRecentStickerAvocadoColumnIndex", e5);
        }
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS installed_sticker_packs_avatar_pack_index ON installed_sticker_packs (installed_is_avatar_pack)");
        } catch (SQLiteException e6) {
            C18740tg.A08("StickerDBHelper/addInstalledIsAvatarStickerPackColumnIndex", e6);
        }
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS sticker_pack_id_index ON stickers (sticker_pack_id)");
        } catch (SQLiteException e7) {
            C18740tg.A08("StickerDBHelper/addStickerPackIdIndex", e7);
        }
        A01(sQLiteDatabase);
        try {
            sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS avatar_sticker_search_index ON avatar_sticker_search_dictionary (tag, sticker_id)");
        } catch (SQLiteException e8) {
            C18740tg.A08("StickerDBHelper/addAvatarStickerSearchIndex", e8);
        }
    }

    public C224114e A07() {
        String databaseName = getDatabaseName();
        return C224014d.A01(super.A02(), this.A01, this.A02, databaseName);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StickerDBHelper/onDowngrade/oldVersion:");
        A0u.append(i);
        C36321k7.A1T(", newVersion:", A0u, i2);
        A00(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x009f, code lost:
        X.C224614k.A01(r7, "unseen_sticker_packs");
        r7.execSQL("CREATE TABLE unseen_sticker_packs (pack_id TEXT PRIMARY KEY NOT NULL)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00a9, code lost:
        X.C224614k.A01(r7, "third_party_whitelist_packs");
        r7.execSQL("CREATE TABLE third_party_whitelist_packs (authority TEXT NOT NULL, sticker_pack_id TEXT NOT NULL, sticker_pack_name TEXT, sticker_pack_publisher TEXT, sticker_pack_image_data_hash TEXT, avoid_cache INTEGER, is_animated_pack INTEGER, PRIMARY KEY (authority,sticker_pack_id))");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00b1, code lost:
        X.C224614k.A01(r7, "installed_sticker_packs");
        r7.execSQL("CREATE TABLE installed_sticker_packs (installed_id TEXT NOT NULL, installed_name TEXT, installed_publisher TEXT, installed_description TEXT, installed_size INTEGER NOT NULL, installed_image_data_hash TEXT NOT NULL, installed_tray_image_id TEXT NOT NULL, installed_tray_image_preview_id TEXT, installed_animated_pack INTEGER NOT NULL, installed_is_avatar_pack INTEGER NOT NULL DEFAULT 0, installed_empty_favorites_avatar_template_id TEXT, installed_empty_recents_avatar_template_id TEXT, installed_lottie_pack INTEGER, PRIMARY KEY(installed_id))");
        X.C224614k.A01(r7, "stickers");
        r7.execSQL("CREATE TABLE stickers (plain_file_hash TEXT NOT NULL, encrypted_file_hash TEXT, media_key TEXT, mime_type TEXT, height INTEGER NOT NULL, width INTEGER NOT NULL, sticker_pack_id TEXT, file_path TEXT, url TEXT, file_size INTEGER, direct_path TEXT, emojis TEXT, hash_of_image_part TEXT, is_avatar INTEGER NOT NULL DEFAULT 0, avatar_template_id TEXT, is_fun_sticker INTEGER, is_lottie INTEGER, PRIMARY KEY(plain_file_hash))");
        X.C224614k.A01(r7, "downloadable_sticker_packs");
        r7.execSQL("CREATE TABLE downloadable_sticker_packs (id TEXT NOT NULL, name TEXT, publisher TEXT, description TEXT, size INTEGER NOT NULL, tray_image_id TEXT, tray_image_preview_id TEXT, preview_image_id_array TEXT, image_data_hash TEXT NOT NULL, animated_pack INTEGER NOT NULL, lottie_pack INTEGER, PRIMARY KEY(id))");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00c7, code lost:
        X.C132766Ve.A02(r7, "third_party_whitelist_packs", "sticker_pack_name", "TEXT");
        X.C132766Ve.A02(r7, "third_party_whitelist_packs", "sticker_pack_publisher", "TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00d1, code lost:
        X.C224614k.A01(r7, "new_sticker_packs");
        r7.execSQL("CREATE TABLE new_sticker_packs (pack_id TEXT PRIMARY KEY NOT NULL)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00db, code lost:
        X.C132766Ve.A02(r7, "stickers", "direct_path", "TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00e0, code lost:
        r9 = "hash_of_image_part";
        X.C132766Ve.A02(r7, "recent_stickers", r9, "TEXT");
        X.C132766Ve.A02(r7, "starred_stickers", r9, "TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00e8, code lost:
        X.C132766Ve.A02(r7, "third_party_whitelist_packs", "sticker_pack_image_data_hash", "TEXT");
        X.C132766Ve.A02(r7, "third_party_whitelist_packs", "avoid_cache", "INTEGER");
        X.C132766Ve.A02(r7, "third_party_whitelist_packs", "is_animated_pack", "INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00f7, code lost:
        X.C132766Ve.A02(r7, "downloadable_sticker_packs", "animated_pack", "INTEGER");
        X.C132766Ve.A02(r7, "installed_sticker_packs", "installed_animated_pack", "INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0101, code lost:
        X.C132766Ve.A02(r7, "recent_stickers", "url", "TEXT");
        X.C132766Ve.A02(r7, "recent_stickers", "enc_hash", "TEXT");
        X.C132766Ve.A02(r7, "recent_stickers", "direct_path", "TEXT");
        X.C132766Ve.A02(r7, "recent_stickers", "mimetype", "TEXT");
        X.C132766Ve.A02(r7, "recent_stickers", "media_key", "TEXT");
        X.C132766Ve.A02(r7, "recent_stickers", "file_size", "INTEGER");
        X.C132766Ve.A02(r7, "recent_stickers", "width", "INTEGER");
        X.C132766Ve.A02(r7, "recent_stickers", "height", "INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0129, code lost:
        r16 = new java.lang.String[]{"urlTEXT", "enc_hashTEXT", "direct_pathTEXT", "mimetypeTEXT", "media_keyTEXT", "file_sizeINTEGER", "widthINTEGER", "heightINTEGER"};
        r14 = X.C36431kI.A1G();
        r14.put("plaintext_hash", "TEXT NOT NULL");
        r14.put("entry_weight", "FLOAT NOT NULL");
        r14.put("hash_of_image_part", "TEXT");
        r14.put("url", "TEXT");
        r14.put("enc_hash", "TEXT");
        r14.put("direct_path", "TEXT");
        r14.put("mimetype", "TEXT");
        r14.put("media_key", "TEXT");
        r14.put("file_size", "INTEGER");
        r14.put("width", "INTEGER");
        r14.put("height", "INTEGER");
        r10 = X.AnonymousClass000.A0u();
        r10.append("SELECT * FROM ");
        r10.append("recent_stickers");
        r12 = r7.rawQuery(X.AnonymousClass000.A0q(" LIMIT 0", r10), (java.lang.String[]) null);
        r10 = 0;
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x01a2, code lost:
        if (r10 >= 8) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x01a4, code lost:
        if (r15 != false) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x01ad, code lost:
        if (r12.getColumnIndex(r16[r10]) == -1) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x01af, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x01b0, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x01b3, code lost:
        if (r15 == false) goto L_0x02ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x01b5, code lost:
        r16 = r14.keySet();
        r15 = r16.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x01c1, code lost:
        if (r15.hasNext() == false) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01c3, code lost:
        r10 = X.AnonymousClass001.A0C(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01cb, code lost:
        if (r12.getColumnIndex(r10) != -1) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x01cd, code lost:
        r17.A00.A0E("StickersDBHelper/removeUndesiredColumns", X.AnonymousClass000.A0p(" table migration failed due to non-existent desired column ", r10, X.AnonymousClass000.A0v("recent_stickers")), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01e3, code lost:
        r11 = X.AnonymousClass000.A0q("_temp", X.AnonymousClass000.A0v("recent_stickers"));
        r18 = android.text.TextUtils.join(",", r14.keySet());
        r10 = X.AnonymousClass001.A0I();
        r16 = r16.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0203, code lost:
        if (r16.hasNext() == false) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0205, code lost:
        r15 = X.AnonymousClass001.A0C(r16);
        r9 = X.AnonymousClass000.A0v(r15);
        X.C36421kH.A1N(r9);
        r10.add(X.AnonymousClass000.A0q(X.C90504aG.A0l(r15, r14), r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x021c, code lost:
        r17 = android.text.TextUtils.join(", ", r10);
        r16 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x022a, code lost:
        if (r14.containsKey("plaintext_hash") == false) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x022c, code lost:
        r14 = X.AnonymousClass000.A0u();
        X.AnonymousClass000.A1D(", PRIMARY KEY(", "plaintext_hash", ")", r14);
        r16 = r14.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0239, code lost:
        r15 = X.AnonymousClass000.A0u();
        X.C36321k7.A1O("CREATE TEMPORARY TABLE ", r11, " (", r17, r15);
        r7.execSQL(X.AnonymousClass000.A0q(")", r15));
        r9 = X.AnonymousClass000.A0u();
        X.C36321k7.A1O("INSERT INTO ", r11, " SELECT ", r18, r9);
        r7.execSQL(X.AnonymousClass000.A0p(" FROM ", "recent_stickers", r9));
        r7.execSQL(X.C36321k7.A0D("DROP TABLE ", "recent_stickers"));
        r14 = X.AnonymousClass000.A0u();
        X.C36321k7.A1O("CREATE TABLE ", "recent_stickers", " (", r17, r14);
        r7.execSQL(X.AnonymousClass000.A0p(r16, ")", r14));
        r14 = X.AnonymousClass000.A0u();
        X.C36321k7.A1O("INSERT INTO ", "recent_stickers", " SELECT ", r18, r14);
        r7.execSQL(X.AnonymousClass000.A0p(" FROM ", r11, r14));
        r7.execSQL(X.C36321k7.A0D("DROP TABLE ", r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x02a2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x02a3, code lost:
        if (r12 != null) goto L_0x02a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x02a8, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x02a9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x02aa, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x02ad, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x02ae, code lost:
        if (r12 == null) goto L_0x02b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x02b0, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x02b3, code lost:
        X.C132766Ve.A02(r7, "starred_stickers", "url", "TEXT");
        X.C132766Ve.A02(r7, "starred_stickers", "enc_hash", "TEXT");
        X.C132766Ve.A02(r7, "starred_stickers", "direct_path", "TEXT");
        X.C132766Ve.A02(r7, "starred_stickers", "mimetype", "TEXT");
        X.C132766Ve.A02(r7, "starred_stickers", "media_key", "TEXT");
        X.C132766Ve.A02(r7, "starred_stickers", "file_size", "INTEGER");
        X.C132766Ve.A02(r7, "starred_stickers", "width", "INTEGER");
        X.C132766Ve.A02(r7, "starred_stickers", "height", "INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x02db, code lost:
        X.C132766Ve.A02(r7, "stickers", "emojis", "TEXT");
        X.C132766Ve.A02(r7, "recent_stickers", "emojis", "TEXT");
        X.C132766Ve.A02(r7, "recent_stickers", "is_first_party", "INTEGER");
        X.C132766Ve.A02(r7, "starred_stickers", "emojis", "TEXT");
        X.C132766Ve.A02(r7, "starred_stickers", "is_first_party", "INTEGER");
        X.C224614k.A01(r7, "third_party_sticker_emoji_mapping");
        r7.execSQL("CREATE TABLE third_party_sticker_emoji_mapping (plaintext_hash TEXT  NOT NULL , authority TEXT  NOT NULL , sticker_pack_id TEXT  NOT NULL , emojis TEXT , hash_of_image_part TEXT , PRIMARY KEY(plaintext_hash))");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x02f8, code lost:
        r9 = "hash_of_image_part";
        X.C132766Ve.A02(r7, "stickers", r9, "TEXT");
        X.C132766Ve.A02(r7, "third_party_sticker_emoji_mapping", r9, "TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0302, code lost:
        X.C132766Ve.A02(r7, "recent_stickers", "is_avocado", "INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r7.execSQL("CREATE INDEX IF NOT EXISTS recent_sticker_is_avocado_index ON recent_stickers (is_avocado)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x030d, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x030e, code lost:
        X.C18740tg.A08("StickersDBHelper/addRecentStickerAvocadoColumnIndex", r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0081, code lost:
        X.C224614k.A01(r7, "downloadable_sticker_packs");
        r7.execSQL("CREATE TABLE downloadable_sticker_packs (id TEXT NOT NULL, name TEXT, publisher TEXT, description TEXT, size INTEGER NOT NULL, tray_image_id TEXT, tray_image_preview_id TEXT, preview_image_id_array TEXT, image_data_hash TEXT NOT NULL, animated_pack INTEGER NOT NULL, lottie_pack INTEGER, PRIMARY KEY(id))");
        X.C224614k.A01(r7, "sticker_pack_order");
        r7.execSQL("CREATE TABLE sticker_pack_order (sticker_pack_id TEXT PRIMARY KEY NOT NULL, pack_order INTEGER NOT NULL)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0091, code lost:
        X.C224614k.A01(r7, "recent_stickers");
        r7.execSQL("CREATE TABLE recent_stickers (plaintext_hash TEXT  NOT NULL , entry_weight FLOAT  NOT NULL , hash_of_image_part TEXT , url TEXT , enc_hash TEXT , direct_path TEXT , mimetype TEXT , media_key TEXT , file_size INTEGER , width INTEGER , height INTEGER , emojis TEXT , is_first_party INTEGER , is_avocado INTEGER  NOT NULL  DEFAULT 0 , last_sticker_sent_ts INTEGER  NOT NULL  DEFAULT 0 , avatar_template_id TEXT , is_fun_sticker INTEGER  , is_lottie INTEGER  , PRIMARY KEY(plaintext_hash))");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0099, code lost:
        X.C224614k.A01(r7, "downloadable_sticker_packs");
        r7.execSQL("CREATE TABLE downloadable_sticker_packs (id TEXT NOT NULL, name TEXT, publisher TEXT, description TEXT, size INTEGER NOT NULL, tray_image_id TEXT, tray_image_preview_id TEXT, preview_image_id_array TEXT, image_data_hash TEXT NOT NULL, animated_pack INTEGER NOT NULL, lottie_pack INTEGER, PRIMARY KEY(id))");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r35, int r36, int r37) {
        /*
            r34 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "StickersDBHelper/onUpgrade/old version:"
            r1.append(r0)
            r12 = r36
            r1.append(r12)
            java.lang.String r0 = ", new version: "
            r1.append(r0)
            r9 = r37
            r1.append(r9)
            java.lang.String r0 = ", stacktrace:"
            r1.append(r0)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            X.C36321k7.A1a(r1, r0)
            java.lang.String r33 = "avatar_template_id"
            java.lang.String r32 = "height"
            java.lang.String r31 = "width"
            java.lang.String r30 = "file_size"
            java.lang.String r29 = "media_key"
            java.lang.String r28 = "mimetype"
            java.lang.String r27 = "enc_hash"
            java.lang.String r26 = "url"
            java.lang.String r11 = "CREATE TABLE downloadable_sticker_packs (id TEXT NOT NULL, name TEXT, publisher TEXT, description TEXT, size INTEGER NOT NULL, tray_image_id TEXT, tray_image_preview_id TEXT, preview_image_id_array TEXT, image_data_hash TEXT NOT NULL, animated_pack INTEGER NOT NULL, lottie_pack INTEGER, PRIMARY KEY(id))"
            java.lang.String r25 = "direct_path"
            java.lang.String r24 = "hash_of_image_part"
            java.lang.String r8 = "downloadable_sticker_packs"
            java.lang.String r6 = "INTEGER NOT NULL DEFAULT 0"
            java.lang.String r5 = "installed_sticker_packs"
            java.lang.String r10 = "third_party_whitelist_packs"
            java.lang.String r4 = "stickers"
            java.lang.String r3 = "starred_stickers"
            java.lang.String r2 = "recent_stickers"
            java.lang.String r1 = "INTEGER"
            java.lang.String r0 = "TEXT"
            r17 = r34
            r7 = r35
            switch(r36) {
                case 1: goto L_0x0070;
                case 2: goto L_0x0070;
                case 3: goto L_0x0070;
                case 4: goto L_0x0070;
                case 5: goto L_0x0070;
                case 6: goto L_0x0079;
                case 7: goto L_0x0081;
                case 8: goto L_0x0091;
                case 9: goto L_0x0099;
                case 10: goto L_0x009f;
                case 11: goto L_0x00a9;
                case 12: goto L_0x00b1;
                case 13: goto L_0x00c7;
                case 14: goto L_0x00d1;
                case 15: goto L_0x00db;
                case 16: goto L_0x00e0;
                case 17: goto L_0x00e8;
                case 18: goto L_0x00e8;
                case 19: goto L_0x00f7;
                case 20: goto L_0x0101;
                case 21: goto L_0x0101;
                case 22: goto L_0x0129;
                case 23: goto L_0x02b3;
                case 24: goto L_0x02db;
                case 25: goto L_0x02f8;
                case 26: goto L_0x0302;
                case 27: goto L_0x0302;
                case 28: goto L_0x0313;
                case 29: goto L_0x0324;
                case 30: goto L_0x0335;
                case 31: goto L_0x033d;
                case 32: goto L_0x0342;
                case 33: goto L_0x0347;
                case 34: goto L_0x034c;
                case 35: goto L_0x035d;
                case 36: goto L_0x036e;
                case 37: goto L_0x037a;
                case 38: goto L_0x0386;
                case 39: goto L_0x0390;
                case 40: goto L_0x0393;
                case 41: goto L_0x03a9;
                case 42: goto L_0x03b0;
                case 43: goto L_0x03bb;
                case 44: goto L_0x03c6;
                default: goto L_0x0058;
            }
        L_0x0058:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unknown upgrade from "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " to "
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r1, r9)
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            r0.<init>(r1)
            throw r0
        L_0x0070:
            r0 = r17
            r0.A00(r7)
            r0.onCreate(r7)
            return
        L_0x0079:
            X.C224614k.A01(r7, r3)
            java.lang.String r9 = "CREATE TABLE starred_stickers (plaintext_hash TEXT  NOT NULL , timestamp LONG , hash_of_image_part TEXT , url TEXT , enc_hash TEXT , direct_path TEXT , mimetype TEXT , media_key TEXT , file_size INTEGER , width INTEGER , height INTEGER , emojis TEXT , is_first_party INTEGER , is_avatar INTEGER  NOT NULL  DEFAULT 0 , avatar_template_id TEXT , is_fun_sticker INTEGER  , is_lottie INTEGER  , PRIMARY KEY(plaintext_hash))"
            r7.execSQL(r9)
        L_0x0081:
            X.C224614k.A01(r7, r8)
            r7.execSQL(r11)
            java.lang.String r9 = "sticker_pack_order"
            X.C224614k.A01(r7, r9)
            java.lang.String r9 = "CREATE TABLE sticker_pack_order (sticker_pack_id TEXT PRIMARY KEY NOT NULL, pack_order INTEGER NOT NULL)"
            r7.execSQL(r9)
        L_0x0091:
            X.C224614k.A01(r7, r2)
            java.lang.String r9 = "CREATE TABLE recent_stickers (plaintext_hash TEXT  NOT NULL , entry_weight FLOAT  NOT NULL , hash_of_image_part TEXT , url TEXT , enc_hash TEXT , direct_path TEXT , mimetype TEXT , media_key TEXT , file_size INTEGER , width INTEGER , height INTEGER , emojis TEXT , is_first_party INTEGER , is_avocado INTEGER  NOT NULL  DEFAULT 0 , last_sticker_sent_ts INTEGER  NOT NULL  DEFAULT 0 , avatar_template_id TEXT , is_fun_sticker INTEGER  , is_lottie INTEGER  , PRIMARY KEY(plaintext_hash))"
            r7.execSQL(r9)
        L_0x0099:
            X.C224614k.A01(r7, r8)
            r7.execSQL(r11)
        L_0x009f:
            java.lang.String r9 = "unseen_sticker_packs"
            X.C224614k.A01(r7, r9)
            java.lang.String r9 = "CREATE TABLE unseen_sticker_packs (pack_id TEXT PRIMARY KEY NOT NULL)"
            r7.execSQL(r9)
        L_0x00a9:
            X.C224614k.A01(r7, r10)
            java.lang.String r9 = "CREATE TABLE third_party_whitelist_packs (authority TEXT NOT NULL, sticker_pack_id TEXT NOT NULL, sticker_pack_name TEXT, sticker_pack_publisher TEXT, sticker_pack_image_data_hash TEXT, avoid_cache INTEGER, is_animated_pack INTEGER, PRIMARY KEY (authority,sticker_pack_id))"
            r7.execSQL(r9)
        L_0x00b1:
            X.C224614k.A01(r7, r5)
            java.lang.String r9 = "CREATE TABLE installed_sticker_packs (installed_id TEXT NOT NULL, installed_name TEXT, installed_publisher TEXT, installed_description TEXT, installed_size INTEGER NOT NULL, installed_image_data_hash TEXT NOT NULL, installed_tray_image_id TEXT NOT NULL, installed_tray_image_preview_id TEXT, installed_animated_pack INTEGER NOT NULL, installed_is_avatar_pack INTEGER NOT NULL DEFAULT 0, installed_empty_favorites_avatar_template_id TEXT, installed_empty_recents_avatar_template_id TEXT, installed_lottie_pack INTEGER, PRIMARY KEY(installed_id))"
            r7.execSQL(r9)
            X.C224614k.A01(r7, r4)
            java.lang.String r9 = "CREATE TABLE stickers (plain_file_hash TEXT NOT NULL, encrypted_file_hash TEXT, media_key TEXT, mime_type TEXT, height INTEGER NOT NULL, width INTEGER NOT NULL, sticker_pack_id TEXT, file_path TEXT, url TEXT, file_size INTEGER, direct_path TEXT, emojis TEXT, hash_of_image_part TEXT, is_avatar INTEGER NOT NULL DEFAULT 0, avatar_template_id TEXT, is_fun_sticker INTEGER, is_lottie INTEGER, PRIMARY KEY(plain_file_hash))"
            r7.execSQL(r9)
            X.C224614k.A01(r7, r8)
            r7.execSQL(r11)
        L_0x00c7:
            java.lang.String r9 = "sticker_pack_name"
            X.C132766Ve.A02(r7, r10, r9, r0)
            java.lang.String r9 = "sticker_pack_publisher"
            X.C132766Ve.A02(r7, r10, r9, r0)
        L_0x00d1:
            java.lang.String r9 = "new_sticker_packs"
            X.C224614k.A01(r7, r9)
            java.lang.String r9 = "CREATE TABLE new_sticker_packs (pack_id TEXT PRIMARY KEY NOT NULL)"
            r7.execSQL(r9)
        L_0x00db:
            r9 = r25
            X.C132766Ve.A02(r7, r4, r9, r0)
        L_0x00e0:
            r9 = r24
            X.C132766Ve.A02(r7, r2, r9, r0)
            X.C132766Ve.A02(r7, r3, r9, r0)
        L_0x00e8:
            java.lang.String r9 = "sticker_pack_image_data_hash"
            X.C132766Ve.A02(r7, r10, r9, r0)
            java.lang.String r9 = "avoid_cache"
            X.C132766Ve.A02(r7, r10, r9, r1)
            java.lang.String r9 = "is_animated_pack"
            X.C132766Ve.A02(r7, r10, r9, r1)
        L_0x00f7:
            java.lang.String r9 = "animated_pack"
            X.C132766Ve.A02(r7, r8, r9, r1)
            java.lang.String r9 = "installed_animated_pack"
            X.C132766Ve.A02(r7, r5, r9, r1)
        L_0x0101:
            r9 = r26
            X.C132766Ve.A02(r7, r2, r9, r0)
            r9 = r27
            X.C132766Ve.A02(r7, r2, r9, r0)
            r9 = r25
            X.C132766Ve.A02(r7, r2, r9, r0)
            r9 = r28
            X.C132766Ve.A02(r7, r2, r9, r0)
            r9 = r29
            X.C132766Ve.A02(r7, r2, r9, r0)
            r9 = r30
            X.C132766Ve.A02(r7, r2, r9, r1)
            r9 = r31
            X.C132766Ve.A02(r7, r2, r9, r1)
            r9 = r32
            X.C132766Ve.A02(r7, r2, r9, r1)
        L_0x0129:
            java.lang.String r9 = "urlTEXT"
            java.lang.String r10 = "enc_hashTEXT"
            java.lang.String r11 = "direct_pathTEXT"
            java.lang.String r12 = "mimetypeTEXT"
            java.lang.String r13 = "media_keyTEXT"
            java.lang.String r14 = "file_sizeINTEGER"
            java.lang.String r15 = "widthINTEGER"
            java.lang.String r16 = "heightINTEGER"
            java.lang.String[] r16 = new java.lang.String[]{r9, r10, r11, r12, r13, r14, r15, r16}
            java.util.LinkedHashMap r14 = X.C36431kI.A1G()
            java.lang.String r13 = "plaintext_hash"
            java.lang.String r9 = "TEXT NOT NULL"
            r14.put(r13, r9)
            java.lang.String r10 = "entry_weight"
            java.lang.String r9 = "FLOAT NOT NULL"
            r14.put(r10, r9)
            r9 = r24
            r14.put(r9, r0)
            r9 = r26
            r14.put(r9, r0)
            r9 = r27
            r14.put(r9, r0)
            r9 = r25
            r14.put(r9, r0)
            r9 = r28
            r14.put(r9, r0)
            r9 = r29
            r14.put(r9, r0)
            r9 = r30
            r14.put(r9, r1)
            r9 = r31
            r14.put(r9, r1)
            r9 = r32
            r14.put(r9, r1)
            java.lang.String r23 = "DROP TABLE "
            java.lang.String r22 = " FROM "
            java.lang.String r21 = " SELECT "
            java.lang.String r20 = "INSERT INTO "
            java.lang.String r19 = " ("
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()
            java.lang.String r9 = "SELECT * FROM "
            r10.append(r9)
            r10.append(r2)
            java.lang.String r9 = " LIMIT 0"
            java.lang.String r10 = X.AnonymousClass000.A0q(r9, r10)
            r9 = 0
            android.database.Cursor r12 = r7.rawQuery(r10, r9)
            r10 = 0
            r15 = 0
        L_0x019f:
            r9 = 8
            r11 = -1
            if (r10 >= r9) goto L_0x01b3
            if (r15 != 0) goto L_0x01af
            r9 = r16[r10]     // Catch:{ all -> 0x02a2 }
            int r9 = r12.getColumnIndex(r9)     // Catch:{ all -> 0x02a2 }
            r15 = 0
            if (r9 == r11) goto L_0x01b0
        L_0x01af:
            r15 = 1
        L_0x01b0:
            int r10 = r10 + 1
            goto L_0x019f
        L_0x01b3:
            if (r15 == 0) goto L_0x02ae
            java.util.Set r16 = r14.keySet()     // Catch:{ all -> 0x02a2 }
            java.util.Iterator r15 = r16.iterator()     // Catch:{ all -> 0x02a2 }
        L_0x01bd:
            boolean r9 = r15.hasNext()     // Catch:{ all -> 0x02a2 }
            if (r9 == 0) goto L_0x01e3
            java.lang.String r10 = X.AnonymousClass001.A0C(r15)     // Catch:{ all -> 0x02a2 }
            int r9 = r12.getColumnIndex(r10)     // Catch:{ all -> 0x02a2 }
            if (r9 != r11) goto L_0x01bd
            r9 = r17
            X.0wN r13 = r9.A00     // Catch:{ all -> 0x02a2 }
            java.lang.String r11 = "StickersDBHelper/removeUndesiredColumns"
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0v(r2)     // Catch:{ all -> 0x02a2 }
            java.lang.String r9 = " table migration failed due to non-existent desired column "
            java.lang.String r10 = X.AnonymousClass000.A0p(r9, r10, r14)     // Catch:{ all -> 0x02a2 }
            r9 = 1
            r13.A0E(r11, r10, r9)     // Catch:{ all -> 0x02a2 }
            goto L_0x02b0
        L_0x01e3:
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0v(r2)     // Catch:{ all -> 0x02a2 }
            java.lang.String r9 = "_temp"
            java.lang.String r11 = X.AnonymousClass000.A0q(r9, r10)     // Catch:{ all -> 0x02a2 }
            java.lang.String r10 = ","
            java.util.Set r9 = r14.keySet()     // Catch:{ all -> 0x02a2 }
            java.lang.String r18 = android.text.TextUtils.join(r10, r9)     // Catch:{ all -> 0x02a2 }
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x02a2 }
            java.util.Iterator r16 = r16.iterator()     // Catch:{ all -> 0x02a2 }
        L_0x01ff:
            boolean r9 = r16.hasNext()     // Catch:{ all -> 0x02a2 }
            if (r9 == 0) goto L_0x021c
            java.lang.String r15 = X.AnonymousClass001.A0C(r16)     // Catch:{ all -> 0x02a2 }
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0v(r15)     // Catch:{ all -> 0x02a2 }
            X.C36421kH.A1N(r9)     // Catch:{ all -> 0x02a2 }
            java.lang.String r15 = X.C90504aG.A0l(r15, r14)     // Catch:{ all -> 0x02a2 }
            java.lang.String r9 = X.AnonymousClass000.A0q(r15, r9)     // Catch:{ all -> 0x02a2 }
            r10.add(r9)     // Catch:{ all -> 0x02a2 }
            goto L_0x01ff
        L_0x021c:
            java.lang.String r9 = ", "
            java.lang.String r17 = android.text.TextUtils.join(r9, r10)     // Catch:{ all -> 0x02a2 }
            java.lang.String r16 = ""
            java.lang.String r10 = ")"
            boolean r9 = r14.containsKey(r13)     // Catch:{ all -> 0x02a2 }
            if (r9 == 0) goto L_0x0239
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02a2 }
            java.lang.String r9 = ", PRIMARY KEY("
            X.AnonymousClass000.A1D(r9, r13, r10, r14)     // Catch:{ all -> 0x02a2 }
            java.lang.String r16 = r14.toString()     // Catch:{ all -> 0x02a2 }
        L_0x0239:
            java.lang.StringBuilder r15 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02a2 }
            java.lang.String r14 = "CREATE TEMPORARY TABLE "
            r13 = r19
            r9 = r17
            X.C36321k7.A1O(r14, r11, r13, r9, r15)     // Catch:{ all -> 0x02a2 }
            java.lang.String r9 = X.AnonymousClass000.A0q(r10, r15)     // Catch:{ all -> 0x02a2 }
            r7.execSQL(r9)     // Catch:{ all -> 0x02a2 }
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02a2 }
            r15 = r20
            r14 = r21
            r13 = r18
            X.C36321k7.A1O(r15, r11, r14, r13, r9)     // Catch:{ all -> 0x02a2 }
            r13 = r22
            java.lang.String r9 = X.AnonymousClass000.A0p(r13, r2, r9)     // Catch:{ all -> 0x02a2 }
            r7.execSQL(r9)     // Catch:{ all -> 0x02a2 }
            r9 = r23
            java.lang.String r9 = X.C36321k7.A0D(r9, r2)     // Catch:{ all -> 0x02a2 }
            r7.execSQL(r9)     // Catch:{ all -> 0x02a2 }
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02a2 }
            java.lang.String r15 = "CREATE TABLE "
            r13 = r19
            r9 = r17
            X.C36321k7.A1O(r15, r2, r13, r9, r14)     // Catch:{ all -> 0x02a2 }
            r9 = r16
            java.lang.String r9 = X.AnonymousClass000.A0p(r9, r10, r14)     // Catch:{ all -> 0x02a2 }
            r7.execSQL(r9)     // Catch:{ all -> 0x02a2 }
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02a2 }
            r13 = r20
            r10 = r21
            r9 = r18
            X.C36321k7.A1O(r13, r2, r10, r9, r14)     // Catch:{ all -> 0x02a2 }
            r9 = r22
            java.lang.String r9 = X.AnonymousClass000.A0p(r9, r11, r14)     // Catch:{ all -> 0x02a2 }
            r7.execSQL(r9)     // Catch:{ all -> 0x02a2 }
            r9 = r23
            java.lang.String r9 = X.C36321k7.A0D(r9, r11)     // Catch:{ all -> 0x02a2 }
            r7.execSQL(r9)     // Catch:{ all -> 0x02a2 }
            goto L_0x02ae
        L_0x02a2:
            r1 = move-exception
            if (r12 == 0) goto L_0x02ad
            r12.close()     // Catch:{ all -> 0x02a9 }
            throw r1
        L_0x02a9:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x02ad:
            throw r1
        L_0x02ae:
            if (r12 == 0) goto L_0x02b3
        L_0x02b0:
            r12.close()
        L_0x02b3:
            r9 = r26
            X.C132766Ve.A02(r7, r3, r9, r0)
            r9 = r27
            X.C132766Ve.A02(r7, r3, r9, r0)
            r9 = r25
            X.C132766Ve.A02(r7, r3, r9, r0)
            r9 = r28
            X.C132766Ve.A02(r7, r3, r9, r0)
            r9 = r29
            X.C132766Ve.A02(r7, r3, r9, r0)
            r9 = r30
            X.C132766Ve.A02(r7, r3, r9, r1)
            r9 = r31
            X.C132766Ve.A02(r7, r3, r9, r1)
            r9 = r32
            X.C132766Ve.A02(r7, r3, r9, r1)
        L_0x02db:
            java.lang.String r10 = "emojis"
            X.C132766Ve.A02(r7, r4, r10, r0)
            X.C132766Ve.A02(r7, r2, r10, r0)
            java.lang.String r9 = "is_first_party"
            X.C132766Ve.A02(r7, r2, r9, r1)
            X.C132766Ve.A02(r7, r3, r10, r0)
            X.C132766Ve.A02(r7, r3, r9, r1)
            java.lang.String r9 = "third_party_sticker_emoji_mapping"
            X.C224614k.A01(r7, r9)
            java.lang.String r9 = "CREATE TABLE third_party_sticker_emoji_mapping (plaintext_hash TEXT  NOT NULL , authority TEXT  NOT NULL , sticker_pack_id TEXT  NOT NULL , emojis TEXT , hash_of_image_part TEXT , PRIMARY KEY(plaintext_hash))"
            r7.execSQL(r9)
        L_0x02f8:
            r9 = r24
            X.C132766Ve.A02(r7, r4, r9, r0)
            java.lang.String r10 = "third_party_sticker_emoji_mapping"
            X.C132766Ve.A02(r7, r10, r9, r0)
        L_0x0302:
            java.lang.String r9 = "is_avocado"
            X.C132766Ve.A02(r7, r2, r9, r6)
            java.lang.String r9 = "CREATE INDEX IF NOT EXISTS recent_sticker_is_avocado_index ON recent_stickers (is_avocado)"
            r7.execSQL(r9)     // Catch:{ SQLiteException -> 0x030d }
            goto L_0x0313
        L_0x030d:
            r10 = move-exception
            java.lang.String r9 = "StickersDBHelper/addRecentStickerAvocadoColumnIndex"
            X.C18740tg.A08(r9, r10)
        L_0x0313:
            java.lang.String r9 = "is_avatar"
            X.C132766Ve.A02(r7, r3, r9, r6)
            java.lang.String r9 = "CREATE INDEX IF NOT EXISTS starred_sticker_is_avatar_index ON starred_stickers (is_avatar)"
            r7.execSQL(r9)     // Catch:{ SQLiteException -> 0x031e }
            goto L_0x0324
        L_0x031e:
            r10 = move-exception
            java.lang.String r9 = "StickersDBHelper/addStarredStickerAvocadoColumnIndex"
            X.C18740tg.A08(r9, r10)
        L_0x0324:
            java.lang.String r9 = "installed_is_avatar_pack"
            X.C132766Ve.A02(r7, r5, r9, r6)
            java.lang.String r9 = "CREATE INDEX IF NOT EXISTS installed_sticker_packs_avatar_pack_index ON installed_sticker_packs (installed_is_avatar_pack)"
            r7.execSQL(r9)     // Catch:{ SQLiteException -> 0x032f }
            goto L_0x0335
        L_0x032f:
            r10 = move-exception
            java.lang.String r9 = "StickerDBHelper/addInstalledIsAvatarStickerPackColumnIndex"
            X.C18740tg.A08(r9, r10)
        L_0x0335:
            java.lang.String r9 = "is_avatar"
            X.C132766Ve.A02(r7, r4, r9, r6)
            A01(r7)
        L_0x033d:
            java.lang.String r9 = "last_sticker_sent_ts"
            X.C132766Ve.A02(r7, r2, r9, r6)
        L_0x0342:
            java.lang.String r9 = "sticker_md_upload"
            X.C224614k.A01(r7, r9)
        L_0x0347:
            r9 = r33
            X.C132766Ve.A02(r7, r4, r9, r0)
        L_0x034c:
            r9 = r33
            X.C132766Ve.A02(r7, r2, r9, r0)
            java.lang.String r9 = "CREATE INDEX IF NOT EXISTS recent_sticker_avatar_template_index ON recent_stickers (avatar_template_id)"
            r7.execSQL(r9)     // Catch:{ SQLiteException -> 0x0357 }
            goto L_0x035d
        L_0x0357:
            r10 = move-exception
            java.lang.String r9 = "StickersDBHelper/addRecentStickerAvocadoColumnIndex"
            X.C18740tg.A08(r9, r10)
        L_0x035d:
            r9 = r33
            X.C132766Ve.A02(r7, r3, r9, r0)
            java.lang.String r9 = "CREATE INDEX IF NOT EXISTS starred_sticker_avatar_template_id_index ON starred_stickers (avatar_template_id)"
            r7.execSQL(r9)     // Catch:{ SQLiteException -> 0x0368 }
            goto L_0x036e
        L_0x0368:
            r10 = move-exception
            java.lang.String r9 = "StickersDBHelper/addRecentStickerAvocadoColumnIndex"
            X.C18740tg.A08(r9, r10)
        L_0x036e:
            java.lang.String r9 = "CREATE INDEX IF NOT EXISTS sticker_avatar_template_id_index ON stickers (avatar_template_id)"
            r7.execSQL(r9)     // Catch:{ SQLiteException -> 0x0374 }
            goto L_0x037a
        L_0x0374:
            r10 = move-exception
            java.lang.String r9 = "StickerDBHelper/addStickerIsAvatarColumnIndex"
            X.C18740tg.A08(r9, r10)
        L_0x037a:
            java.lang.String r9 = "CREATE INDEX IF NOT EXISTS sticker_pack_id_index ON stickers (sticker_pack_id)"
            r7.execSQL(r9)     // Catch:{ SQLiteException -> 0x0380 }
            goto L_0x0386
        L_0x0380:
            r10 = move-exception
            java.lang.String r9 = "StickerDBHelper/addStickerPackIdIndex"
            X.C18740tg.A08(r9, r10)
        L_0x0386:
            java.lang.String r9 = "installed_empty_recents_avatar_template_id"
            X.C132766Ve.A02(r7, r5, r9, r0)
            java.lang.String r9 = "installed_empty_favorites_avatar_template_id"
            X.C132766Ve.A02(r7, r5, r9, r0)
        L_0x0390:
            A01(r7)
        L_0x0393:
            java.lang.String r0 = "avatar_sticker_search_dictionary"
            X.C224614k.A01(r7, r0)
            java.lang.String r0 = "CREATE TABLE avatar_sticker_search_dictionary (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, sticker_id TEXT NOT NULL, tag TEXT NOT NULL, weight INTEGER NOT NULL DEFAULT 0)"
            r7.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS avatar_sticker_search_index ON avatar_sticker_search_dictionary (tag, sticker_id)"
            r7.execSQL(r0)     // Catch:{ SQLiteException -> 0x03a3 }
            goto L_0x03a9
        L_0x03a3:
            r9 = move-exception
            java.lang.String r0 = "StickerDBHelper/addAvatarStickerSearchIndex"
            X.C18740tg.A08(r0, r9)
        L_0x03a9:
            java.lang.String r9 = "avatar_sticker_search_dictionary"
            java.lang.String r0 = "weight"
            X.C132766Ve.A02(r7, r9, r0, r6)
        L_0x03b0:
            java.lang.String r0 = "is_fun_sticker"
            X.C132766Ve.A02(r7, r4, r0, r1)
            X.C132766Ve.A02(r7, r3, r0, r1)
            X.C132766Ve.A02(r7, r2, r0, r1)
        L_0x03bb:
            java.lang.String r0 = "is_lottie"
            X.C132766Ve.A02(r7, r4, r0, r1)
            X.C132766Ve.A02(r7, r3, r0, r1)
            X.C132766Ve.A02(r7, r2, r0, r1)
        L_0x03c6:
            java.lang.String r0 = "lottie_pack"
            X.C132766Ve.A02(r7, r8, r0, r1)
            java.lang.String r0 = "installed_lottie_pack"
            X.C132766Ve.A02(r7, r5, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1031554e.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
