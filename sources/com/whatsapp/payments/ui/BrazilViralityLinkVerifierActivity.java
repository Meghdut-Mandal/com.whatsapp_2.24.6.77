package com.whatsapp.payments.ui;

import X.B7Y;
import X.C131606Ps;
import X.C165567td;
import X.C165587tf;
import X.C165607th;
import X.C18800tq;
import X.C18830tt;
import X.C203049nB;
import X.C27111My;
import X.C33751fs;
import X.C36321k7;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import android.net.Uri;
import android.os.Bundle;

public class BrazilViralityLinkVerifierActivity extends ViralityLinkVerifierActivity {
    public boolean A00;

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A06 = C36351kA.A0P(r2);
            this.A05 = C36391kE.A0S(r2);
            this.A0F = C165587tf.A0Z(r2);
            this.A0D = C36381kD.A0f(r2);
            this.A0A = C165587tf.A0S(r2);
            this.A0G = C27111My.A3Y(A0L);
            this.A09 = (C33751fs) r1.A17.get();
            this.A0B = C165587tf.A0T(r2);
            this.A0C = C36371kC.A0h(r2);
        }
    }

    public BrazilViralityLinkVerifierActivity(int i) {
        this.A00 = false;
        B7Y.A00(this, 44);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Uri A0H = C165607th.A0H(this);
        C131606Ps r2 = new C131606Ps((String) null, new C131606Ps[0]);
        r2.A03("campaign_id", A0H.getLastPathSegment());
        C203049nB.A04(r2, this.A0D.A04("FBPAY").BBn(), "deeplink", (String) null);
    }

    public BrazilViralityLinkVerifierActivity() {
        this(0);
    }
}
