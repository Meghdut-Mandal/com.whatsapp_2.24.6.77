package X;

import android.content.SharedPreferences;

/* renamed from: X.1Ll  reason: invalid class name and case insensitive filesystem */
public final class C26771Ll implements C26701Le {
    public final C19420v0 A00;

    public /* bridge */ /* synthetic */ void BrK(Object obj) {
        C19420v0.A00(this.A00).putBoolean("support_ai_nux_shown", true).apply();
    }

    public /* bridge */ /* synthetic */ boolean BJz(Object obj) {
        return ((SharedPreferences) this.A00.A00.get()).getBoolean("support_ai_nux_shown", false);
    }

    public void BQQ(boolean z) {
        C19420v0.A00(this.A00).putBoolean("support_ai_nux_shown", z).apply();
    }

    public C26771Ll(C19420v0 r1) {
        this.A00 = r1;
    }

    public String BEa() {
        return "support_ai";
    }
}
