package X;

import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1eg  reason: invalid class name and case insensitive filesystem */
public final class C33081eg {
    public final C19420v0 A00;
    public final C20810yC A01;
    public final C19970wo A02;
    public final AnonymousClass1NA A03;

    public C33081eg(C19970wo r2, C19420v0 r3, C20810yC r4, AnonymousClass1NA r5) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r3, 4);
        this.A02 = r2;
        this.A01 = r4;
        this.A03 = r5;
        this.A00 = r3;
    }

    public final void A00() {
        C19420v0 r2 = this.A00;
        C19420v0.A00(r2).remove("create_group_tool_tip_nudge_count").apply();
        C19420v0.A00(r2).remove("create_group_tool_tip_nudge_next_show_time").apply();
        C19420v0.A00(r2).remove("create_group_tool_tip_nudge_last_impression_time").apply();
        C19420v0.A00(r2).remove("create_group_tool_tip_nudge_show_time").apply();
        C19420v0.A00(r2).remove("create_group_tool_tip_temp_dismissed").apply();
        C19420v0.A00(r2).putBoolean("create_group_tool_tip_perm_dismissed", true).apply();
    }

    public final void A01() {
        TimeUnit timeUnit;
        long j;
        C19420v0 r5 = this.A00;
        C19420v0.A00(r5).putBoolean("create_group_tool_tip_temp_dismissed", true).apply();
        int A08 = r5.A08() + 1;
        if (A08 <= 7) {
            long currentTimeMillis = System.currentTimeMillis();
            if (A08 == 2 || A08 == 3) {
                timeUnit = TimeUnit.DAYS;
                j = 7;
            } else {
                timeUnit = TimeUnit.DAYS;
                j = 30;
            }
            C19420v0.A00(r5).putLong("create_group_tool_tip_nudge_next_show_time", currentTimeMillis + timeUnit.toMillis(j)).apply();
        }
    }

    public final boolean A02() {
        int A08;
        if (C20800yB.A01(C21000yV.A02, this.A01, 5288)) {
            C19420v0 r3 = this.A00;
            AnonymousClass005 r2 = r3.A00;
            if (((SharedPreferences) r2.get()).getBoolean("create_group_tool_tip_perm_dismissed", false) || this.A03.A00() || (!((SharedPreferences) r2.get()).getBoolean("one_of_create_group_tool_tip_activated", false) && ((A08 = r3.A08()) > 7 || (A08 != 0 && ((SharedPreferences) r2.get()).getBoolean("create_group_tool_tip_temp_dismissed", false) && System.currentTimeMillis() <= ((SharedPreferences) r2.get()).getLong("create_group_tool_tip_nudge_next_show_time", 0))))) {
                return false;
            }
            return true;
        }
        return false;
    }
}
