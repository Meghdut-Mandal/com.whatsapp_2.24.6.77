package com.whatsapp.settings;

import X.AnonymousClass09Y;
import X.AnonymousClass12U;
import X.AnonymousClass179;
import X.AnonymousClass18U;
import X.C100814vp;
import X.C163037pY;
import X.C18800tq;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.WaPreferenceFragment;
import com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment;
import com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment;

public class SettingsJidNotificationActivity extends C100814vp {
    public boolean A00;

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            C18800tq A0B = C36331k8.A0B(this);
            this.A04 = C36341k9.A0Z(A0B);
            this.A01 = C36351kA.A0M(A0B);
            this.A01 = (AnonymousClass179) A0B.A3D.get();
            this.A00 = (AnonymousClass18U) A0B.A0I.get();
            this.A02 = C36351kA.A0U(A0B);
            this.A03 = (AnonymousClass12U) A0B.A7L.get();
        }
    }

    public SettingsJidNotificationActivity(int i) {
        this.A00 = false;
        C163037pY.A00(this, 4);
    }

    public void onCreate(Bundle bundle) {
        WaPreferenceFragment settingsJidNotificationFragment;
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        if (bundle == null) {
            if (!this.A01.A0E(7628)) {
                settingsJidNotificationFragment = new SettingsJidNotificationFragment();
            } else if (getIntent().getBooleanExtra("advanced_settings", false)) {
                settingsJidNotificationFragment = new AdvancedNotificationSettingsFragment();
            } else {
                settingsJidNotificationFragment = new NotificationsAndSoundsFragment();
            }
            this.A0A = settingsJidNotificationFragment;
            AnonymousClass09Y A0O = C36341k9.A0O(this);
            A0O.A0F(this.A0A, "preferenceFragment", R.id.preference_fragment);
            A0O.A00(false);
            return;
        }
        setTitle(bundle.getCharSequence("settingsJidNotificationFragment"));
        this.A0A = (WaPreferenceFragment) getSupportFragmentManager().A0M(bundle, "preferenceFragment");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("settingsJidNotificationFragment", getTitle());
    }

    public SettingsJidNotificationActivity() {
        this(0);
    }
}
