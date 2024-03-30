package com.whatsapp.newsletter.ui.mv;

import X.AnonymousClass07B;
import X.AnonymousClass155;
import X.AnonymousClass3UC;
import X.AnonymousClass3Y4;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36421kH;
import X.C89344We;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

public final class NewsletterCreateMVUpsellActivity extends AnonymousClass155 {
    public AnonymousClass3UC A00;
    public WDSButton A01;
    public boolean A02;

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A00 = (AnonymousClass3UC) A0B.A5e.get();
        }
    }

    public NewsletterCreateMVUpsellActivity(int i) {
        this.A02 = false;
        C89344We.A00(this, 26);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        C36341k9.A12(this);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C36421kH.A19(supportActionBar);
            supportActionBar.A0I(R.string.f12nameremoved);
        }
        WDSButton wDSButton = (WDSButton) C36361kB.A0H(this, R.id.newsletter_mv_create_button);
        this.A01 = wDSButton;
        if (wDSButton == null) {
            throw C36331k8.A0d("createButton");
        }
        AnonymousClass3Y4.A00(wDSButton, this, 35);
    }

    public NewsletterCreateMVUpsellActivity() {
        this(0);
    }
}
