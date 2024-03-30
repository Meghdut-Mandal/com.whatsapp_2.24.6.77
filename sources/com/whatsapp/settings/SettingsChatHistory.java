package com.whatsapp.settings;

import X.AnonymousClass09Y;
import X.C100834vr;
import X.C163037pY;
import X.C18800tq;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.WaPreferenceFragment;

public class SettingsChatHistory extends C100834vr {
    public boolean A00;

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            C18800tq A0B = C36331k8.A0B(this);
            this.A04 = C36341k9.A0Z(A0B);
            this.A01 = C36351kA.A0M(A0B);
        }
    }

    public SettingsChatHistory(int i) {
        this.A00 = false;
        C163037pY.A00(this, 3);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        if (bundle == null) {
            this.A0A = new SettingsChatHistoryFragment();
            AnonymousClass09Y A0O = C36341k9.A0O(this);
            A0O.A0F(this.A0A, "preferenceFragment", R.id.preference_fragment);
            A0O.A00(false);
            return;
        }
        setTitle(bundle.getCharSequence("settingsChatHistoryTitle"));
        this.A0A = (WaPreferenceFragment) getSupportFragmentManager().A0N("preferenceFragment");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("settingsChatHistoryTitle", getTitle());
    }

    public SettingsChatHistory() {
        this(0);
    }
}
