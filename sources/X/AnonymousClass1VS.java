package X;

/* renamed from: X.1VS  reason: invalid class name */
public class AnonymousClass1VS {
    public final AnonymousClass1BX A00;

    public final AnonymousClass3QR A00() {
        AnonymousClass1BX r1 = this.A00;
        if (r1.A06()) {
            AnonymousClass3QR A002 = C55172uC.A00(r1.A01(), 443, r1.A00(), r1.A01.A00("user_proxy_setting_pref").getBoolean("proxy_use_tls", true));
            if (AnonymousClass3RW.A00(A002.A05) || AnonymousClass3RW.A01(A002.A02)) {
                return A002;
            }
        }
        return null;
    }

    public final void A01(AnonymousClass3QR r6) {
        if (AnonymousClass3RW.A00(r6.A05) || AnonymousClass3RW.A01(r6.A02)) {
            AnonymousClass1BX r1 = this.A00;
            r1.A04(r6.A04);
            int i = r6.A01;
            C19890wg r4 = r1.A01;
            r4.A00("user_proxy_setting_pref").edit().putInt("proxy_media_port", i).apply();
            r4.A00("user_proxy_setting_pref").edit().putBoolean("proxy_use_tls", r6.A06).apply();
        }
    }

    public final boolean A02() {
        AnonymousClass1BX r1 = this.A00;
        if (r1.A06()) {
            C20810yC r2 = r1.A00;
            if (!C20800yB.A01(C21000yV.A01, r2, 3641) || !C20800yB.A01(C21000yV.A02, r2, 4074)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass1VS(AnonymousClass1BX r1) {
        this.A00 = r1;
    }
}
