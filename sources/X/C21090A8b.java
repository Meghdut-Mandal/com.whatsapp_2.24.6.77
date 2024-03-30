package X;

import android.content.SharedPreferences;

/* renamed from: X.A8b  reason: case insensitive filesystem */
public final class C21090A8b implements C19710wO {
    public final C219211f A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass005 A03;
    public final AnonymousClass005 A04;

    public String BIB() {
        return "PerfAsyncInit";
    }

    public /* synthetic */ void BRM() {
    }

    public void BRL() {
        C219211f r5 = this.A00;
        synchronized (r5) {
            SharedPreferences.Editor edit = C219211f.A00(r5).edit();
            edit.putInt("total_cold_start_count_pref", C219211f.A00(r5).getInt("total_cold_start_count_pref", 0) + 1);
            if (AnonymousClass11j.A00()) {
                edit.putInt("bg_cold_start_count_pref", C219211f.A00(r5).getInt("bg_cold_start_count_pref", 0) + 1);
            }
            edit.putInt("last_cold_start_time_min", (int) (((C36371kC.A09(r5.A01) / 60) / 10) * 10));
            edit.apply();
        }
    }

    public C21090A8b(C219211f r1, AnonymousClass005 r2, AnonymousClass005 r3, AnonymousClass005 r4, AnonymousClass005 r5) {
        C36321k7.A1B(r2, r3, r1, r4, r5);
        this.A04 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r4;
        this.A03 = r5;
    }
}
