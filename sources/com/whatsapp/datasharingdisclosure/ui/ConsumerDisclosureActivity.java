package com.whatsapp.datasharingdisclosure.ui;

import X.AnonymousClass00T;
import X.AnonymousClass09Y;
import X.AnonymousClass11F;
import X.AnonymousClass155;
import X.AnonymousClass2PT;
import X.AnonymousClass3N9;
import X.AnonymousClass4BH;
import X.C18800tq;
import X.C18830tt;
import X.C21010yW;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36431kI;
import X.C51612o6;
import X.C54172sW;
import X.C74093l3;
import X.C89334Wd;
import android.os.Bundle;
import com.whatsapp.R;

public final class ConsumerDisclosureActivity extends AnonymousClass155 {
    public AnonymousClass3N9 A00;
    public boolean A01;
    public final AnonymousClass00T A02;

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C18800tq r2 = C36351kA.A0L(this).A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A00 = new AnonymousClass3N9((C21010yW) r2.A79.get());
        }
    }

    public ConsumerDisclosureActivity(int i) {
        this.A01 = false;
        C89334Wd.A00(this, 12);
    }

    public void onBackPressed() {
        super.onBackPressed();
        AnonymousClass3N9 r0 = this.A00;
        if (r0 != null) {
            C21010yW r2 = r0.A00;
            AnonymousClass2PT r1 = new AnonymousClass2PT();
            r1.A01 = C36361kB.A0i();
            AnonymousClass2PT.A00(r2, r1, 4);
            return;
        }
        throw C36331k8.A0d("dataSharingCtwaDisclosureLogger");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        if (bundle == null) {
            AnonymousClass3N9 r0 = this.A00;
            if (r0 != null) {
                C21010yW r2 = r0.A00;
                AnonymousClass2PT r1 = new AnonymousClass2PT();
                r1.A01 = C36361kB.A0i();
                AnonymousClass2PT.A00(r2, r1, 0);
                ConsumerDisclosureFragment A002 = C54172sW.A00((AnonymousClass11F) null, C51612o6.BLOCKING_DISCLOSURE, (Boolean) null);
                A002.A05 = new C74093l3(this);
                AnonymousClass09Y A0O = C36341k9.A0O(this);
                A0O.A0B(A002, R.id.fragment_container);
                A0O.A03();
                return;
            }
            throw C36331k8.A0d("dataSharingCtwaDisclosureLogger");
        }
    }

    public ConsumerDisclosureActivity() {
        this(0);
        this.A02 = C36431kI.A1I(new AnonymousClass4BH(this));
    }
}
