package com.whatsapp.registration.directmigration;

import X.AnonymousClass27h;
import X.C36331k8;
import X.C89364Wg;
import android.os.Bundle;
import com.whatsapp.RequestPermissionActivity;

public class RequestPermissionFromSisterAppActivity extends RequestPermissionActivity {
    public boolean A00;

    public void A2k(String str, Bundle bundle) {
        super.A2k(A2j(bundle, true), bundle);
    }

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass27h.A0L(C36331k8.A0B(this), this);
        }
    }

    public RequestPermissionFromSisterAppActivity(int i) {
        this.A00 = false;
        C89364Wg.A00(this, 3);
    }

    public RequestPermissionFromSisterAppActivity() {
        this(0);
    }
}
