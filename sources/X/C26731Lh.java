package X;

import android.content.SharedPreferences;

/* renamed from: X.1Lh  reason: invalid class name and case insensitive filesystem */
public final class C26731Lh implements C26701Le {
    public final C19420v0 A00;

    public /* bridge */ /* synthetic */ void BrK(Object obj) {
        C19420v0.A00(this.A00).putBoolean("ephemeral_nux", true).apply();
    }

    public /* bridge */ /* synthetic */ boolean BJz(Object obj) {
        return ((SharedPreferences) this.A00.A00.get()).getBoolean("ephemeral_nux", false);
    }

    public void BQQ(boolean z) {
        C19420v0.A00(this.A00).putBoolean("ephemeral_nux", z).apply();
    }

    public C26731Lh(C19420v0 r1) {
        this.A00 = r1;
    }

    public String BEa() {
        return "ephemeral";
    }
}
