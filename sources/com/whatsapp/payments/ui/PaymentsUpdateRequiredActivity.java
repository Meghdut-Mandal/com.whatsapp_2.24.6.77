package com.whatsapp.payments.ui;

import X.AnonymousClass07B;
import X.AnonymousClass155;
import X.C18800tq;
import X.C18830tt;
import X.C33751fs;
import X.C33771fu;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36421kH;
import X.C89354Wf;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

public class PaymentsUpdateRequiredActivity extends AnonymousClass155 {
    public C33771fu A00;
    public C33751fs A01;
    public WaImageView A02;
    public boolean A03;

    public void A2F() {
        if (!this.A03) {
            this.A03 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A00 = C36351kA.A0P(A0B);
            this.A01 = C36361kB.A0X(r1);
        }
    }

    public PaymentsUpdateRequiredActivity(int i) {
        this.A03 = false;
        C89354Wf.A00(this, 5);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        WaImageView waImageView = this.A02;
        int i = 0;
        if (configuration.orientation == 2) {
            i = 8;
        }
        waImageView.setVisibility(i);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0I(R.string.f12nameremoved);
            supportActionBar.A0U(true);
        }
        setContentView((int) R.layout.f9nameremoved);
        findViewById(R.id.update_title);
        findViewById(R.id.update_description);
        TextView A0Q = C36391kE.A0Q(this, R.id.upgrade_button);
        A0Q.setText(R.string.f12nameremoved);
        C36421kH.A13(A0Q, this, 42);
        this.A02 = (WaImageView) findViewById(R.id.update_icon);
    }

    public PaymentsUpdateRequiredActivity() {
        this(0);
    }
}
