package X;

import android.content.SharedPreferences;

/* renamed from: X.1Lk  reason: invalid class name and case insensitive filesystem */
public final class C26761Lk implements C26701Le {
    public final C19420v0 A00;

    public /* bridge */ /* synthetic */ void BrK(Object obj) {
        C19420v0.A00(this.A00).putBoolean("newsletter_multi_admin_nux", true).apply();
    }

    public /* bridge */ /* synthetic */ boolean BJz(Object obj) {
        return ((SharedPreferences) this.A00.A00.get()).getBoolean("newsletter_multi_admin_nux", false);
    }

    public void BQQ(boolean z) {
        C19420v0.A00(this.A00).putBoolean("newsletter_multi_admin_nux", z).apply();
    }

    public C26761Lk(C19420v0 r1) {
        this.A00 = r1;
    }

    public String BEa() {
        return "newsletter_multi_admin";
    }
}
