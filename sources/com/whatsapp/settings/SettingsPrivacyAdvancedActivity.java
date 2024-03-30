package com.whatsapp.settings;

import X.AnonymousClass155;
import X.AnonymousClass196;
import X.AnonymousClass3Y8;
import X.C18800tq;
import X.C18830tt;
import X.C27631Pa;
import X.C32681e1;
import X.C33751fs;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C81163wZ;
import X.C89364Wg;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public final class SettingsPrivacyAdvancedActivity extends AnonymousClass155 {
    public SwitchCompat A00;
    public SwitchCompat A01;
    public C27631Pa A02;
    public AnonymousClass196 A03;
    public C33751fs A04;
    public C32681e1 A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;

    public static final void A01(SettingsPrivacyAdvancedActivity settingsPrivacyAdvancedActivity) {
        SwitchCompat switchCompat = settingsPrivacyAdvancedActivity.A00;
        if (switchCompat == null) {
            throw C36331k8.A0d("callRelayingPrivacySwitch");
        }
        switchCompat.setChecked(settingsPrivacyAdvancedActivity.A06);
        SwitchCompat switchCompat2 = settingsPrivacyAdvancedActivity.A01;
        if (switchCompat2 == null) {
            throw C36331k8.A0d("disableLinkPreviewsSwitch");
        }
        switchCompat2.setChecked(settingsPrivacyAdvancedActivity.A07);
    }

    public void A2F() {
        if (!this.A08) {
            this.A08 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A05 = C36351kA.A0p(r1);
            this.A03 = (AnonymousClass196) A0B.A8N.get();
            this.A04 = C36361kB.A0X(r1);
            this.A02 = (C27631Pa) A0B.A8z.get();
        }
    }

    public SettingsPrivacyAdvancedActivity(int i) {
        this.A08 = false;
        C89364Wg.A00(this, 29);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C27631Pa r0 = this.A02;
        if (r0 != null) {
            this.A06 = C27631Pa.A00(r0).getBoolean("privacy_always_relay", false);
            setContentView((int) R.layout.f9nameremoved);
            if (this.A0D.A0E(7955)) {
                C36361kB.A0H(this, R.id.disable_link_previews_section).setVisibility(0);
            }
            C36341k9.A0N(this).A0I(R.string.f12nameremoved);
            this.A00 = (SwitchCompat) C36361kB.A0H(this, R.id.call_relaying_privacy_switch);
            this.A01 = (SwitchCompat) C36361kB.A0H(this, R.id.disable_link_previews_switch);
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C36361kB.A0H(this, R.id.call_relaying_description);
            C32681e1 r3 = this.A05;
            if (r3 != null) {
                SpannableStringBuilder A032 = r3.A03(textEmojiLabel.getContext(), new C81163wZ((Object) this, 42), getString(R.string.f12nameremoved), "call_relaying_help", R.color.f6nameremoved);
                C36331k8.A1A(this.A0D, textEmojiLabel);
                textEmojiLabel.setText(A032);
                SwitchCompat switchCompat = this.A00;
                if (switchCompat == null) {
                    throw C36331k8.A0d("callRelayingPrivacySwitch");
                }
                AnonymousClass3Y8.A00(switchCompat, this, 28);
                SwitchCompat switchCompat2 = this.A01;
                if (switchCompat2 == null) {
                    throw C36331k8.A0d("disableLinkPreviewsSwitch");
                }
                AnonymousClass3Y8.A00(switchCompat2, this, 27);
                return;
            }
            throw C36331k8.A0b();
        }
        throw C36331k8.A0d("voipSharedPreferences");
    }

    public void onResume() {
        super.onResume();
        C27631Pa r0 = this.A02;
        if (r0 != null) {
            this.A06 = C36371kC.A1U(C27631Pa.A00(r0), "privacy_always_relay");
            this.A07 = C36371kC.A1U(C36331k8.A06(this), "privacy_linkpreview");
            A01(this);
            return;
        }
        throw C36331k8.A0d("voipSharedPreferences");
    }

    public SettingsPrivacyAdvancedActivity() {
        this(0);
    }
}
