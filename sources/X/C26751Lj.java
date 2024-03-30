package X;

import android.content.SharedPreferences;

/* renamed from: X.1Lj  reason: invalid class name and case insensitive filesystem */
public final class C26751Lj implements C26701Le {
    public final C19420v0 A00;

    public /* bridge */ /* synthetic */ void BrK(Object obj) {
        C19420v0.A00(this.A00).putBoolean("view_once_receiver_nux", true).apply();
    }

    public /* bridge */ /* synthetic */ boolean BJz(Object obj) {
        return ((SharedPreferences) this.A00.A00.get()).getBoolean("view_once_receiver_nux", false);
    }

    public void BQQ(boolean z) {
        C19420v0.A00(this.A00).putBoolean("view_once_receiver_nux", z).apply();
    }

    public C26751Lj(C19420v0 r1) {
        this.A00 = r1;
    }

    public String BEa() {
        return "ephemeral_view_once_receiver";
    }
}
