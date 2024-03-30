package X;

import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Lm  reason: invalid class name and case insensitive filesystem */
public final class C26781Lm implements C26701Le {
    public static final long A02 = TimeUnit.DAYS.toMillis(7);
    public final C19970wo A00;
    public final C19420v0 A01;

    public /* bridge */ /* synthetic */ boolean BJz(Object obj) {
        AnonymousClass005 r7 = this.A01.A00;
        long j = ((SharedPreferences) r7.get()).getLong("pref_community_events_nux_first_seen_timestamp", 0);
        if (j == 0) {
            return false;
        }
        if (((SharedPreferences) r7.get()).getBoolean("pref_community_events_nux_seen", false) || ((SharedPreferences) r7.get()).getInt("pref_community_events_nux_times_displayed", 0) >= 3 || C19970wo.A00(this.A00) > j + A02) {
            return true;
        }
        return false;
    }

    public void BQQ(boolean z) {
        C19420v0.A00(this.A01).putBoolean("pref_community_events_nux_seen", z).apply();
    }

    public /* bridge */ /* synthetic */ void BrK(Object obj) {
        C19420v0 r7 = this.A01;
        AnonymousClass005 r2 = r7.A00;
        C19420v0.A00(r7).putInt("pref_community_events_nux_times_displayed", ((SharedPreferences) r2.get()).getInt("pref_community_events_nux_times_displayed", 0) + 1).apply();
        if (((SharedPreferences) r2.get()).getLong("pref_community_events_nux_first_seen_timestamp", 0) == 0) {
            C19420v0.A00(r7).putLong("pref_community_events_nux_first_seen_timestamp", C19970wo.A00(this.A00)).apply();
        }
        if (AnonymousClass00C.A0J(obj, true) || ((SharedPreferences) r2.get()).getInt("pref_community_events_nux_times_displayed", 0) >= 3 || C19970wo.A00(this.A00) > ((SharedPreferences) r2.get()).getLong("pref_community_events_nux_first_seen_timestamp", 0) + A02) {
            C19420v0.A00(r7).putBoolean("pref_community_events_nux_seen", true).apply();
        }
    }

    public C26781Lm(C19970wo r1, C19420v0 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public String BEa() {
        return "community_events";
    }
}
