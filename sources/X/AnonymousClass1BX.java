package X;

/* renamed from: X.1BX  reason: invalid class name */
public final class AnonymousClass1BX {
    public final C20810yC A00;
    public final C19890wg A01;

    public AnonymousClass1BX(C20810yC r2, C19890wg r3) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final int A00() {
        return this.A01.A00("user_proxy_setting_pref").getInt("proxy_media_port", 587);
    }

    public final String A01() {
        return this.A01.A00("user_proxy_setting_pref").getString("proxy_ip_address", (String) null);
    }

    public final void A02(int i) {
        this.A01.A00("user_proxy_setting_pref").edit().putInt("proxy_media_connection_status", i).apply();
    }

    public final void A03(int i) {
        this.A01.A00("user_proxy_setting_pref").edit().putInt("proxy_connection_status", i).apply();
    }

    public final void A04(String str) {
        this.A01.A00("user_proxy_setting_pref").edit().putString("proxy_ip_address", str).apply();
    }

    public final void A05(boolean z) {
        this.A01.A00("user_proxy_setting_pref").edit().putBoolean("proxy_enabled", z).apply();
    }

    public final boolean A06() {
        if (!this.A01.A00("user_proxy_setting_pref").getBoolean("proxy_enabled", false)) {
            return false;
        }
        C20810yC r2 = this.A00;
        if (C20800yB.A01(C21000yV.A02, r2, 2784) || C20800yB.A01(C21000yV.A01, r2, 3641)) {
            return true;
        }
        return false;
    }

    public final boolean A07() {
        if (!A06() || !AnonymousClass3RW.A01(A01())) {
            return false;
        }
        return true;
    }
}
