package com.whatsapp.payments.ui.mapper.register;

import X.AF7;
import X.AnonymousClass155;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36421kH;
import X.C54932tn;
import X.C89354Wf;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.R;

public final class IndiaUpiMapperPendingActivity extends AnonymousClass155 {
    public AF7 A00;
    public boolean A01;

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A00 = C36371kC.A0i(A0B);
        }
    }

    public final AF7 A3i() {
        AF7 af7 = this.A00;
        if (af7 != null) {
            return af7;
        }
        throw C36331k8.A0d("indiaUpiFieldStatsLogger");
    }

    public IndiaUpiMapperPendingActivity(int i) {
        this.A01 = false;
        C89354Wf.A00(this, 8);
    }

    public void onBackPressed() {
        super.onBackPressed();
        AF7 A3i = A3i();
        Integer A0i = C36361kB.A0i();
        A3i.BOm(A0i, A0i, "pending_alias_setup", C36331k8.A0e(this));
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(DefaultCrypto.BUFFER_SIZE);
        }
        setContentView((int) R.layout.f9nameremoved);
        C54932tn.A00(this, R.drawable.onboarding_actionbar_home_close);
        View findViewById = findViewById(R.id.mapper_pending_done_button);
        View findViewById2 = findViewById(R.id.mapper_pending_profile_button);
        C36421kH.A12(findViewById, this, 13);
        C36421kH.A12(findViewById2, this, 14);
        AF7 A3i = A3i();
        Integer A0m = C36381kD.A0m();
        Intent intent = getIntent();
        if (intent != null) {
            str = intent.getStringExtra("extra_referral_screen");
        } else {
            str = null;
        }
        A3i.BOm(A0m, (Integer) null, "pending_alias_setup", str);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C36341k9.A06(menuItem) == 16908332) {
            A3i().BOm(C36361kB.A0i(), C36371kC.A0n(), "pending_alias_setup", C36331k8.A0e(this));
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public IndiaUpiMapperPendingActivity() {
        this(0);
    }
}
