package X;

import android.content.SharedPreferences;

/* renamed from: X.1Bt  reason: invalid class name and case insensitive filesystem */
public final class C24261Bt {
    public final C19890wg A00;
    public final AnonymousClass00T A01 = new AnonymousClass00U(new C24271Bu(this));

    public C24261Bt(C19890wg r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A00 = r3;
    }

    public final void A02() {
        ((SharedPreferences) this.A01.getValue()).edit().putBoolean("pref_has_dismissed_sticker_upsell", true).apply();
    }

    public final Boolean A00() {
        AnonymousClass00T r1 = this.A01;
        if (!((SharedPreferences) r1.getValue()).contains("pref_has_avatar_config")) {
            return null;
        }
        return Boolean.valueOf(((SharedPreferences) r1.getValue()).getBoolean("pref_has_avatar_config", false));
    }

    public final String A01() {
        return ((SharedPreferences) this.A01.getValue()).getString("pref_avatar_art_revision", (String) null);
    }
}
