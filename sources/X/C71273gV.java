package X;

import com.whatsapp.util.Log;

/* renamed from: X.3gV  reason: invalid class name and case insensitive filesystem */
public class C71273gV implements C30631aW {
    public final AnonymousClass1LO A00;
    public final AnonymousClass1LP A01;
    public final C20810yC A02;
    public final C21010yW A03;

    public /* synthetic */ void BV2() {
    }

    public void BV3() {
        C81803xe r2;
        if (this.A02.A0E(2321)) {
            Log.i("PollStatsLoggerDailyCron/sendPollDailyActionsLogging()");
            AnonymousClass1LO r4 = this.A00;
            AnonymousClass1M0 A032 = r4.get();
            try {
                try {
                    r2 = new C81803xe(A032.A02.A09("SELECT poll_id, poll_votes, poll_votes_changed, poll_vote_deletes, option_count, users_participated, poll_creation_ds, group_size_bucket, is_a_group_flag FROM poll_event_logging", "get_poll_action_counts", (String[]) null), new AnonymousClass4YI(this.A01, 3));
                    if (!r2.hasNext()) {
                        r2.close();
                        A032.close();
                        return;
                    }
                    while (r2.hasNext()) {
                        AnonymousClass2SB r1 = (AnonymousClass2SB) r2.next();
                        if (r1 != null) {
                            this.A03.Blv(r1);
                        }
                    }
                    r2.close();
                    A032.close();
                    AnonymousClass1LO.A01(r4.BJK().A00, r4, "poll_event_logging", "DROP TABLE IF EXISTS poll_event_logging", "CREATE TABLE poll_event_logging(poll_id INTEGER PRIMARY KEY, poll_votes INTEGER NOT NULL DEFAULT 0, poll_votes_changed INTEGER NOT NULL DEFAULT 0, poll_vote_deletes INTEGER NOT NULL DEFAULT 0,option_count INTEGER NOT NULL DEFAULT 0, users_participated INTEGER NOT NULL DEFAULT 0, poll_creation_ds INTEGER NOT NULL DEFAULT 0, group_size_bucket INTEGER NOT NULL DEFAULT 0, is_a_group_flag INTEGER NOT NULL DEFAULT 0)");
                    return;
                } catch (Exception e) {
                    C36321k7.A1W("PollDailyActionLoggingStore/getWamPollsDailyStats: ", AnonymousClass000.A0u(), e);
                }
            } catch (Throwable th) {
                try {
                    A032.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }

    public C71273gV(AnonymousClass1LO r1, AnonymousClass1LP r2, C20810yC r3, C21010yW r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
    }
}
