package X;

import android.content.SharedPreferences;
import android.os.ConditionVariable;

/* renamed from: X.1Hl  reason: invalid class name and case insensitive filesystem */
public final class C25731Hl {
    public final C19890wg A00;
    public final AnonymousClass00T A01 = new AnonymousClass00U(new C25741Hm(this));
    public final C19420v0 A02;

    public C25731Hl(C19420v0 r6, C19890wg r7) {
        AnonymousClass00C.A0D(r6, 1);
        AnonymousClass00C.A0D(r7, 2);
        this.A02 = r6;
        this.A00 = r7;
        ConditionVariable conditionVariable = C18740tg.A00;
        SharedPreferences A002 = r7.A00("chatlock_prefs");
        AnonymousClass00C.A08(A002);
        A002.edit().remove("userFailedAppSwitchAuth").apply();
        if (A002.getBoolean("shouldWarnLeakyCompanionIfAdded", false)) {
            ((SharedPreferences) this.A01.getValue()).edit().putBoolean("should_warn_leaky_companion", true).apply();
        }
        A002.edit().remove("shouldWarnLeakyCompanionIfAdded").apply();
    }

    public static final void A00(C25731Hl r5, String str) {
        AnonymousClass00T r52 = r5.A01;
        ((SharedPreferences) r52.getValue()).edit().putLong(str, ((SharedPreferences) r52.getValue()).getLong(str, 0) + 1).apply();
    }

    public void A01(boolean z) {
        ((SharedPreferences) this.A02.A00.get()).edit().putBoolean("lock_folder_hidden", z).apply();
    }

    public final void A02(boolean z) {
        ((SharedPreferences) this.A02.A00.get()).edit().putBoolean("does_user_have_passcode", z).apply();
    }

    public boolean A03() {
        return ((SharedPreferences) this.A02.A00.get()).getBoolean("lock_folder_hidden", false);
    }

    public final boolean A04() {
        return ((SharedPreferences) this.A02.A00.get()).getBoolean("does_user_have_passcode", false);
    }
}
