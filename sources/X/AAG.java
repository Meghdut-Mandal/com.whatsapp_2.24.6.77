package X;

import com.whatsapp.preference.WaMuteSettingPreference;
import com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment;

public final class AAG implements C24521Ct {
    public final /* synthetic */ NotificationsAndSoundsFragment A00;

    public /* synthetic */ void BUf(AnonymousClass11F r1) {
    }

    public void BUg(AnonymousClass11F r3) {
        AnonymousClass3FH r0;
        AnonymousClass3FH r02;
        AnonymousClass00C.A0D(r3, 0);
        NotificationsAndSoundsFragment notificationsAndSoundsFragment = this.A00;
        if (AnonymousClass00C.A0J(notificationsAndSoundsFragment.A04, r3)) {
            WaMuteSettingPreference waMuteSettingPreference = notificationsAndSoundsFragment.A07;
            if (!(waMuteSettingPreference == null || (r02 = waMuteSettingPreference.A04) == null)) {
                r02.A00();
            }
            WaMuteSettingPreference waMuteSettingPreference2 = notificationsAndSoundsFragment.A06;
            if (waMuteSettingPreference2 != null && (r0 = waMuteSettingPreference2.A04) != null) {
                r0.A00();
            }
        }
    }

    public /* synthetic */ void BUh(AnonymousClass11F r1, boolean z) {
    }

    public /* synthetic */ void BUi(AnonymousClass11F r1) {
    }

    public /* synthetic */ void BUj(AnonymousClass11F r1) {
    }

    public /* synthetic */ void BUm(int i) {
    }

    public /* synthetic */ void BUn() {
    }

    public AAG(NotificationsAndSoundsFragment notificationsAndSoundsFragment) {
        this.A00 = notificationsAndSoundsFragment;
    }
}
