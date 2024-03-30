package com.whatsapp.settings.autoconf;

import X.AnonymousClass155;
import X.AnonymousClass17Y;
import X.AnonymousClass3Y8;
import X.AnonymousClass4OY;
import X.AnonymousClass6YV;
import X.AnonymousClass9JF;
import X.C18800tq;
import X.C18830tt;
import X.C19420v0;
import X.C20810yC;
import X.C21060yb;
import X.C24801Dv;
import X.C27591Ow;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36441kJ;
import X.C75433nE;
import X.C75463nH;
import X.C88534Tb;
import X.C89364Wg;
import android.os.Bundle;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;
import com.whatsapp.infra.graphql.generated.autoconf.CheckAutoConfConsentResponseImpl;
import com.whatsapp.util.Log;

public final class ShareAutoConfVerifierActivity extends AnonymousClass155 implements C88534Tb, AnonymousClass4OY {
    public SwitchCompat A00;
    public C27591Ow A01;
    public C75463nH A02;
    public C75433nE A03;
    public boolean A04;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C36321k7.A0P(this);
        setContentView((int) R.layout.f9nameremoved);
        setTitle(R.string.f12nameremoved);
        C20810yC r9 = this.A0D;
        AnonymousClass17Y r6 = this.A05;
        C24801Dv r5 = this.A01;
        C21060yb r8 = this.A08;
        AnonymousClass6YV.A0E(this, this.A04.A00("https://faq.whatsapp.com"), r5, r6, C36401kF.A0O(this.A00, R.id.description_with_learn_more), r8, r9, getString(R.string.f12nameremoved), "learn-more");
        C27591Ow r1 = this.A01;
        if (r1 != null) {
            this.A03 = new C75433nE(r1);
            this.A02 = new C75463nH(r1);
            SwitchCompat switchCompat = (SwitchCompat) C36361kB.A0G(this.A00, R.id.consent_toggle_switch_compat);
            this.A00 = switchCompat;
            if (switchCompat == null) {
                throw C36331k8.A0d("consentSwitch");
            }
            switchCompat.setChecked(C36371kC.A1U(C36331k8.A06(this), "autoconf_consent_given"));
            AnonymousClass3Y8.A00(C36361kB.A0G(this.A00, R.id.consent_toggle_layout), this, 35);
            return;
        }
        throw C36331k8.A0d("mexGraphQlClient");
    }

    public void A2F() {
        if (!this.A04) {
            this.A04 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A01 = C36391kE.A0g(A0B);
        }
    }

    public void Bju() {
        Log.i("ShareAutoConfVerifierActivity/onUpdateConsentFailure/");
    }

    public void Bjv() {
        Log.i("ShareAutoConfVerifierActivity/onUpdateConsentSuccess/");
        SwitchCompat switchCompat = this.A00;
        if (switchCompat == null) {
            throw C36331k8.A0d("consentSwitch");
        }
        switchCompat.toggle();
        C19420v0 r1 = this.A09;
        SwitchCompat switchCompat2 = this.A00;
        if (switchCompat2 == null) {
            throw C36331k8.A0d("consentSwitch");
        }
        C36331k8.A0w(C36331k8.A05(r1), "autoconf_consent_given", switchCompat2.isChecked());
    }

    public ShareAutoConfVerifierActivity(int i) {
        this.A04 = false;
        C89364Wg.A00(this, 33);
    }

    public void onResume() {
        super.onResume();
        C75433nE r4 = this.A03;
        if (r4 == null) {
            throw C36331k8.A0d("checkAutoConfConsentManager");
        }
        Log.i("CheckAutoConfConsentManager/checkAutoConfConsent");
        r4.A00 = this;
        r4.A01.A00(new AnonymousClass9JF(C36441kJ.A0d(), CheckAutoConfConsentResponseImpl.class, "CheckAutoConfConsent"), r4).A00();
    }

    public ShareAutoConfVerifierActivity() {
        this(0);
    }
}
