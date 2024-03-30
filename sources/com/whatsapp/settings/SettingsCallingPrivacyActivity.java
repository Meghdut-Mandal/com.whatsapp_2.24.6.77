package com.whatsapp.settings;

import X.AnonymousClass000;
import X.AnonymousClass155;
import X.AnonymousClass17Y;
import X.AnonymousClass3Y7;
import X.AnonymousClass4P2;
import X.AnonymousClass6YV;
import X.C18800tq;
import X.C18830tt;
import X.C20350xQ;
import X.C20810yC;
import X.C21060yb;
import X.C24801Dv;
import X.C27341Nv;
import X.C33751fs;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36411kG;
import X.C36421kH;
import X.C89364Wg;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ProgressBar;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;

public final class SettingsCallingPrivacyActivity extends AnonymousClass155 implements AnonymousClass4P2 {
    public ProgressBar A00;
    public SwitchCompat A01;
    public C27341Nv A02;
    public C33751fs A03;
    public C20350xQ A04;
    public SettingsRowPrivacyLinearLayout A05;
    public boolean A06;
    public boolean A07;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        C36341k9.A0N(this).A0I(R.string.f12nameremoved);
        this.A05 = (SettingsRowPrivacyLinearLayout) C36361kB.A0H(this, R.id.silence_call_layout);
        this.A01 = (SwitchCompat) C36361kB.A0H(this, R.id.silence_switch);
        this.A00 = (ProgressBar) C36361kB.A0H(this, R.id.silence_progress_bar);
        C20810yC r8 = this.A0D;
        AnonymousClass17Y r5 = this.A05;
        C24801Dv r4 = this.A01;
        C21060yb r7 = this.A08;
        AnonymousClass6YV.A0E(this, Uri.parse("https://faq.whatsapp.com/1238612517047244/"), r4, r5, C36421kH.A0I(this, R.id.description_view), r7, r8, getString(R.string.f12nameremoved), "calling_privacy_help");
        SettingsRowPrivacyLinearLayout settingsRowPrivacyLinearLayout = this.A05;
        if (settingsRowPrivacyLinearLayout == null) {
            throw C36331k8.A0d("silenceCallLayout");
        }
        AnonymousClass3Y7.A00(settingsRowPrivacyLinearLayout, this, 16);
        if ("silence_unknown_caller".equals(getIntent().getStringExtra("target_setting"))) {
            SettingsRowPrivacyLinearLayout settingsRowPrivacyLinearLayout2 = this.A05;
            if (settingsRowPrivacyLinearLayout2 == null) {
                throw C36331k8.A0d("silenceCallLayout");
            }
            settingsRowPrivacyLinearLayout2.A00();
        }
    }

    private final void A01() {
        C27341Nv r0 = this.A02;
        if (r0 != null) {
            int A002 = r0.A00("calladd");
            C27341Nv r02 = this.A02;
            if (r02 != null) {
                boolean z = true;
                boolean A1V = AnonymousClass000.A1V(r02.A02.get("calladd"));
                ProgressBar progressBar = this.A00;
                if (A1V) {
                    if (progressBar == null) {
                        throw C36331k8.A0d("silenceCallPrivacySpinner");
                    }
                    progressBar.setVisibility(0);
                    SwitchCompat switchCompat = this.A01;
                    if (switchCompat == null) {
                        throw C36331k8.A0d("silenceCallPrivacySwitch");
                    }
                    switchCompat.setVisibility(4);
                } else if (progressBar == null) {
                    throw C36331k8.A0d("silenceCallPrivacySpinner");
                } else {
                    progressBar.setVisibility(4);
                    SwitchCompat switchCompat2 = this.A01;
                    if (switchCompat2 == null) {
                        throw C36331k8.A0d("silenceCallPrivacySwitch");
                    }
                    switchCompat2.setVisibility(0);
                    SwitchCompat switchCompat3 = this.A01;
                    if (switchCompat3 == null) {
                        throw C36331k8.A0d("silenceCallPrivacySwitch");
                    }
                    if (A002 != 5) {
                        z = false;
                    }
                    switchCompat3.setChecked(z);
                }
            } else {
                throw C36331k8.A0d("privacySettingManager");
            }
        } else {
            throw C36331k8.A0d("privacySettingManager");
        }
    }

    public void A2F() {
        if (!this.A07) {
            this.A07 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A03 = C36361kB.A0X(r1);
            this.A02 = C36411kG.A0X(A0B);
            this.A04 = C36361kB.A0a(A0B);
        }
    }

    public SettingsCallingPrivacyActivity(int i) {
        this.A07 = false;
        C89364Wg.A00(this, 21);
    }

    public void BgP() {
        A01();
    }

    public void onPause() {
        super.onPause();
        C27341Nv r0 = this.A02;
        if (r0 != null) {
            r0.A03.remove(this);
            return;
        }
        throw C36331k8.A0d("privacySettingManager");
    }

    public void onResume() {
        super.onResume();
        C27341Nv r0 = this.A02;
        if (r0 != null) {
            r0.A03.add(this);
            A01();
            return;
        }
        throw C36331k8.A0d("privacySettingManager");
    }

    public SettingsCallingPrivacyActivity() {
        this(0);
    }
}
