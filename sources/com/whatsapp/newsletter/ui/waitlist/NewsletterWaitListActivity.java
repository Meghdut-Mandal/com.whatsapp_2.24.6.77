package com.whatsapp.newsletter.ui.waitlist;

import X.AnonymousClass2PK;
import X.AnonymousClass3ZU;
import X.AnonymousClass4OS;
import X.C18800tq;
import X.C225314u;
import X.C25271Fq;
import X.C32241dD;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36431kI;
import X.C89344We;
import android.os.Bundle;
import com.whatsapp.R;

public final class NewsletterWaitListActivity extends C225314u implements AnonymousClass4OS {
    public C25271Fq A00;
    public C32241dD A01;
    public AnonymousClass3ZU A02;
    public boolean A03;

    public void A2F() {
        if (!this.A03) {
            this.A03 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C36361kB.A1C(A0B, this);
            this.A00 = C36391kE.A0d(A0B);
            this.A01 = C36431kI.A0n(A0B);
        }
    }

    public NewsletterWaitListActivity(int i) {
        this.A03 = false;
        C89344We.A00(this, 32);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        if (bundle == null) {
            Btl(new NewsletterWaitListSubscribeFragment(), "NewsletterWaitListSubscribeFragment");
            Bundle A0H = C36371kC.A0H(this);
            if (A0H != null) {
                C32241dD r5 = this.A01;
                if (r5 != null) {
                    boolean A1U = C36371kC.A1U(C36331k8.A06(this), "newsletter_wait_list_subscription");
                    boolean z = A0H.getBoolean("is_external_link");
                    if (C32241dD.A04(r5)) {
                        AnonymousClass2PK r2 = new AnonymousClass2PK();
                        Integer A0i = C36361kB.A0i();
                        r2.A01 = A0i;
                        r2.A00 = Boolean.valueOf(A1U);
                        if (z) {
                            A0i = C36361kB.A0j();
                        }
                        r2.A02 = A0i;
                        r5.A03.Bly(r2);
                        return;
                    }
                    return;
                }
                throw C36331k8.A0d("newsletterLogging");
            }
        }
    }

    public NewsletterWaitListActivity() {
        this(0);
    }
}
