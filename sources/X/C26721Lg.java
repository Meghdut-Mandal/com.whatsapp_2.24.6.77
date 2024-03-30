package X;

/* renamed from: X.1Lg  reason: invalid class name and case insensitive filesystem */
public final class C26721Lg implements C26701Le {
    public final C19420v0 A00;
    public final C20810yC A01;

    public void BQQ(boolean z) {
        C19420v0 r2 = this.A00;
        C19420v0.A00(r2).putBoolean("create_community_nux_threshold_reached", z).apply();
        if (!z) {
            C19420v0.A00(r2).remove("pref_create_community_nux_times_displayed").apply();
        }
    }

    public /* bridge */ /* synthetic */ void BrK(Object obj) {
        if (obj != null) {
            C19420v0.A00(this.A00).putBoolean("create_community_nux_threshold_reached", true).apply();
        }
    }

    public C26721Lg(C19420v0 r1, C20810yC r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public String BEa() {
        return "community";
    }

    public /* bridge */ /* synthetic */ boolean BJz(Object obj) {
        return false;
    }
}
