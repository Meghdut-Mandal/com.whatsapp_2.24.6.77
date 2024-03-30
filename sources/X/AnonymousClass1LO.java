package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;

/* renamed from: X.1LO  reason: invalid class name */
public class AnonymousClass1LO extends C229616q {
    public final AnonymousClass11g A00;
    public final AnonymousClass12S A01;

    public AnonymousClass1LO(C19700wN r4, C19630wG r5, AnonymousClass11g r6, AnonymousClass12S r7) {
        super(r5.A00, r4, "daily_metrics.db", 6);
        this.A01 = r7;
        this.A00 = r6;
    }

    private void A00(SQLiteDatabase sQLiteDatabase) {
        Log.i("DailyMetricsDbHelper/createDB");
        A01(sQLiteDatabase, this, "community_home_action_logging", "DROP TABLE IF EXISTS community_home_action_logging", "CREATE TABLE community_home_action_logging(jid_row_id INTEGER PRIMARY KEY, home_view_count INTEGER NOT NULL DEFAULT 0, home_group_navigation_count INTEGER NOT NULL DEFAULT 0, home_group_discovery_count INTEGER NOT NULL DEFAULT 0, home_group_join_count INTEGER NOT NULL DEFAULT 0)");
        A01(sQLiteDatabase, this, "poll_event_logging", "DROP TABLE IF EXISTS poll_event_logging", "CREATE TABLE poll_event_logging(poll_id INTEGER PRIMARY KEY, poll_votes INTEGER NOT NULL DEFAULT 0, poll_votes_changed INTEGER NOT NULL DEFAULT 0, poll_vote_deletes INTEGER NOT NULL DEFAULT 0,option_count INTEGER NOT NULL DEFAULT 0, users_participated INTEGER NOT NULL DEFAULT 0, poll_creation_ds INTEGER NOT NULL DEFAULT 0, group_size_bucket INTEGER NOT NULL DEFAULT 0, is_a_group_flag INTEGER NOT NULL DEFAULT 0)");
        A01(sQLiteDatabase, this, "pnh_daily_event_logging", "DROP TABLE IF EXISTS pnh_daily_event_logging", "CREATE TABLE pnh_daily_event_logging(community_id TEXT NOT NULL, type_of_subgroup INTEGER NOT NULL, reaction_open_tray_count INTEGER NOT NULL DEFAULT 0, reaction_delete_count INTEGER NOT NULL DEFAULT 0, pnh_indicator_clicks_chat INTEGER NOT NULL DEFAULT 0, pnh_indicator_clicks_info_screen INTEGER NOT NULL DEFAULT 0, PRIMARY KEY (community_id, type_of_subgroup))");
        A01(sQLiteDatabase, this, "comments_event_logging", "DROP TABLE IF EXISTS comments_event_logging", "CREATE TABLE comments_event_logging (comment_space_id TEXT PRIMARY KEY, comment_parent_group_id TEXT NOT NULL, comments INTEGER NOT NULL DEFAULT 0, comment_deletes INTEGER NOT NULL DEFAULT 0, accumulated_comments INTEGER NOT NULL DEFAULT 0, group_size_bucket INTEGER NOT NULL DEFAULT 0, cag_message_sent_ds INTEGER NOT NULL DEFAULT 0)");
    }

    public C224114e A07() {
        Log.i("DailyMetricsDbHelper/initDatabase");
        try {
            String databaseName = getDatabaseName();
            return C224014d.A01(super.A02(), this.A00, this.A01, databaseName);
        } catch (SQLiteException e) {
            Log.e("failed to open writable daily metrics store", e);
            String databaseName2 = getDatabaseName();
            return C224014d.A01(super.A02(), this.A00, this.A01, databaseName2);
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.i("DailyMetricsDbHelper/onCreate; version=6");
        A00(sQLiteDatabase);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("DailyMetricsDbHelper/downgrade from ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        Log.i(sb.toString());
        onCreate(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Log.i("DailyMetricsDbHelper/onUpgrade");
        A00(sQLiteDatabase);
    }

    public static void A01(SQLiteDatabase sQLiteDatabase, AnonymousClass1LO r4, String str, String str2, String str3) {
        try {
            sQLiteDatabase.execSQL(str2);
            sQLiteDatabase.execSQL(str3);
        } catch (SQLiteException e) {
            C19700wN r2 = r4.A05;
            StringBuilder sb = new StringBuilder();
            sb.append("Issue recreating ");
            sb.append(str);
            sb.append(" table");
            r2.A0D("DailyMetricsDbHelper/recreateActionTable", sb.toString(), e);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("DailyMetricsDbHelper/failed to recreate ");
            sb2.append(str);
            sb2.append(" logging table");
            Log.e(sb2.toString(), e);
        }
    }
}
