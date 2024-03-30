package com.whatsapp.framework.alerts.ui;

import X.AnonymousClass00E;
import X.AnonymousClass00T;
import X.AnonymousClass02E;
import X.AnonymousClass07B;
import X.AnonymousClass09Y;
import X.AnonymousClass4BZ;
import X.C18800tq;
import X.C225314u;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36431kI;
import X.C89334Wd;
import android.os.Bundle;
import com.whatsapp.R;

public final class AlertCardListActivity extends C225314u {
    public boolean A00;
    public final AnonymousClass00T A01;

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C36361kB.A1C(A0B, this);
        }
    }

    public AlertCardListActivity(int i) {
        this.A00 = false;
        C89334Wd.A00(this, 27);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0I(R.string.f12nameremoved);
        }
        C36321k7.A0P(this);
        AnonymousClass07B supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.A0L(AnonymousClass00E.A00(this, R.drawable.ic_back));
        }
        AnonymousClass09Y A0O = C36341k9.A0O(this);
        A0O.A0E((AnonymousClass02E) this.A01.getValue(), (String) null, R.id.alert_list_fragment_container);
        A0O.A01();
    }

    public AlertCardListActivity() {
        this(0);
        this.A01 = C36431kI.A1I(new AnonymousClass4BZ(this));
    }
}
