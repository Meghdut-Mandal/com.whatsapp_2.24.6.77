package X;

import android.content.SharedPreferences;

/* renamed from: X.0yU  reason: invalid class name and case insensitive filesystem */
public final class C20990yU extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C19890wg $sharedPreferencesFactory;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20990yU(C19890wg r2) {
        super(0);
        this.$sharedPreferencesFactory = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        SharedPreferences A00 = this.$sharedPreferencesFactory.A00("dropped_wam_events");
        AnonymousClass00C.A08(A00);
        return A00;
    }
}
