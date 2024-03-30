package X;

import android.content.SharedPreferences;

/* renamed from: X.3gJ  reason: invalid class name and case insensitive filesystem */
public final class C71153gJ implements C30631aW {
    public final C238119y A00;

    public C71153gJ(C238119y r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public /* synthetic */ void BV3() {
    }

    public void BV2() {
        SharedPreferences.Editor edit = C238119y.A00(this.A00).edit();
        edit.remove("disappearing_mode_duration");
        edit.apply();
    }
}
