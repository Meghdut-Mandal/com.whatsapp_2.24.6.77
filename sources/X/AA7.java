package X;

import android.content.SharedPreferences;
import java.util.Set;

public final class AA7 implements C159417jK {
    public final AnonymousClass9EX A00;
    public final C21010yW A01;
    public final C219211f A02;

    public void BV1() {
        C176568cK r8 = new C176568cK();
        C219211f r7 = this.A02;
        SharedPreferences A002 = C219211f.A00(r7);
        long A09 = ((C36371kC.A09(r7.A01) / 60) / 10) * 10;
        r8.A01 = C36441kJ.A0y(A002.getInt("total_cold_start_count_pref", 0));
        r8.A02 = C36441kJ.A0y(A002.getInt("fg_cold_start_count_pref", 0));
        r8.A00 = C36441kJ.A0y(A002.getInt("bg_cold_start_count_pref", 0));
        r8.A09 = C90504aG.A0h(A09, (long) A002.getInt("last_cold_start_time_min", 0));
        r8.A04 = C36441kJ.A0y(A002.getInt("warm_start_count_pref", 0));
        r8.A0C = C90504aG.A0h(A09, (long) A002.getInt("last_warm_start_time_min", 0));
        r8.A03 = C36441kJ.A0y(A002.getInt("lukewarm_start_count_pref", 0));
        r8.A0B = C90504aG.A0h(A09, (long) A002.getInt("last_lukewarm_start_time_min", 0));
        r8.A0A = C90504aG.A0h(A09, (long) A002.getInt("last_health_event_time_min", 0));
        SharedPreferences.Editor edit = C219211f.A00(r7).edit();
        edit.putInt("last_health_event_time_min", (int) A09);
        edit.apply();
        for (AnonymousClass162 Blj : (Set) this.A00.A00.get()) {
            Blj.Blj(r8);
        }
        this.A01.Blv(r8);
        synchronized (r7) {
            SharedPreferences.Editor edit2 = C219211f.A00(r7).edit();
            edit2.putInt("fg_cold_start_count_pref", 0);
            edit2.putInt("bg_cold_start_count_pref", 0);
            edit2.putInt("total_cold_start_count_pref", 0);
            edit2.putInt("warm_start_count_pref", 0);
            edit2.putInt("lukewarm_start_count_pref", 0);
            edit2.apply();
        }
    }

    public AA7(AnonymousClass9EX r1, C21010yW r2, C219211f r3) {
        C36321k7.A0x(r2, r3);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
