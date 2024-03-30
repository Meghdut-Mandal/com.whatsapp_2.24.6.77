package com.whatsapp.profile;

import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36391kE;
import X.C36411kG;
import X.C430626v;
import X.C89354Wf;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;

public class ProfilePhotoPrivacyActivity extends C430626v {
    public View A00;
    public SettingsRowPhotoOrInitialText A01;
    public boolean A02;

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A05 = C36411kG.A0X(A0B);
        }
    }

    public ProfilePhotoPrivacyActivity(int i) {
        this.A02 = false;
        C89354Wf.A00(this, 26);
    }

    public void A3j() {
        View view;
        int i;
        super.A3j();
        int A002 = this.A05.A00("profile");
        if (this.A0D.A0E(6149)) {
            SettingsRowPhotoOrInitialText settingsRowPhotoOrInitialText = this.A01;
            float f = 1.0f;
            if (A002 == 0) {
                f = 0.5f;
            }
            settingsRowPhotoOrInitialText.setAlpha(f);
            view = this.A00;
            i = 0;
        } else {
            view = this.A00;
            i = 8;
        }
        view.setVisibility(i);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View findViewById = findViewById(R.id.alt_profile_view);
        this.A00 = findViewById;
        SettingsRowPhotoOrInitialText settingsRowPhotoOrInitialText = (SettingsRowPhotoOrInitialText) findViewById.findViewById(R.id.alt_profile_row);
        this.A01 = settingsRowPhotoOrInitialText;
        settingsRowPhotoOrInitialText.setName(C36391kE.A0w(this));
    }

    public ProfilePhotoPrivacyActivity() {
        this(0);
    }
}
