package com.whatsapp.registration;

import X.AnonymousClass07B;
import X.AnonymousClass22g;
import X.AnonymousClass27v;
import X.C18800tq;
import X.C18830tt;
import X.C19460v5;
import X.C19470v6;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;
import X.C36381kD;
import X.C89354Wf;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public final class NotifyContactsSelector extends AnonymousClass27v {
    public C19460v5 A00;
    public boolean A01;

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            AnonymousClass22g.A0l(this);
            AnonymousClass22g.A0h(r2, r1, this);
            AnonymousClass22g.A0L(A0L, r2, this);
            this.A00 = C19470v6.A00;
        }
    }

    public void A3s(int i) {
        if (i <= 0) {
            AnonymousClass07B supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.A0H(R.string.f12nameremoved);
                return;
            }
            throw C36381kD.A0l();
        }
        super.A3s(i);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 150) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
            Log.i("NotifyContactsSelector/permissions denied");
            finish();
        }
    }

    public NotifyContactsSelector(int i) {
        this.A01 = false;
        C89354Wf.A00(this, 44);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null && !this.A08.A00()) {
            AnonymousClass22g.A0k(this, R.string.f12nameremoved, R.string.f12nameremoved);
        }
    }

    public NotifyContactsSelector() {
        this(0);
    }
}
