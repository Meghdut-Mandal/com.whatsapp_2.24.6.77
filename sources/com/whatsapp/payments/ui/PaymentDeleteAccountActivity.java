package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass07B;
import X.AnonymousClass155;
import X.AnonymousClass17Y;
import X.AnonymousClass1EU;
import X.AnonymousClass1XA;
import X.AnonymousClass1XD;
import X.AnonymousClass9XR;
import X.AnonymousClass9YX;
import X.C165567td;
import X.C165587tf;
import X.C165607th;
import X.C18800tq;
import X.C18830tt;
import X.C19770wU;
import X.C202059ky;
import X.C20310xM;
import X.C23140B7a;
import X.C24601Db;
import X.C24611Dc;
import X.C29121Vk;
import X.C29131Vl;
import X.C29221Vu;
import X.C36321k7;
import X.C36331k8;
import X.C36371kC;
import X.C36381kD;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;

public class PaymentDeleteAccountActivity extends AnonymousClass155 implements AnonymousClass1XD {
    public C20310xM A00;
    public C29221Vu A01;
    public C24601Db A02;
    public C29121Vk A03;
    public AnonymousClass1XA A04;
    public AnonymousClass1EU A05;
    public C29131Vl A06;
    public int A07;
    public boolean A08;
    public final C24611Dc A09;

    public void A2x(int i) {
        setResult(-1);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        int i = 1;
        if (supportActionBar != null) {
            supportActionBar.A0I(R.string.f12nameremoved);
            supportActionBar.A0U(true);
        }
        if (getIntent() != null) {
            i = getIntent().getIntExtra("extra_remove_payment_account", 1);
        }
        this.A07 = i;
        AnonymousClass17Y r4 = this.A05;
        C19770wU r12 = this.A04;
        C29131Vl r11 = this.A06;
        AnonymousClass1EU r10 = this.A05;
        new AnonymousClass9XR(this, r4, this.A00, this.A01, this.A02, this.A03, this.A04, r10, r11, r12).A00(this);
        this.A09.A06("deleted payments store and sending delete account request");
        onConfigurationChanged(AnonymousClass000.A0U(this));
    }

    public void A2F() {
        if (!this.A08) {
            this.A08 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C165567td.A11(A0B, this);
            C18830tt r1 = A0B.A00;
            C165567td.A0v(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A06 = C165587tf.A0Z(A0B);
            this.A05 = C36381kD.A0f(A0B);
            this.A00 = C36371kC.A0Z(A0B);
            this.A02 = C165587tf.A0S(A0B);
            this.A03 = C165587tf.A0T(A0B);
            this.A04 = (AnonymousClass1XA) A0B.A6L.get();
            this.A01 = (C29221Vu) A0B.A6A.get();
        }
    }

    public void Bf0(C202059ky r4) {
        int BBe = this.A05.A05().BAJ().BBe((AnonymousClass9YX) null, r4.A00);
        if (BBe == 0) {
            BBe = R.string.f12nameremoved;
        }
        BO5(BBe);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bf1(X.AnonymousClass9KX r5) {
        /*
            r4 = this;
            X.1Dc r2 = r4.A09
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "onDeleteAccount successful: "
            r1.append(r0)
            boolean r0 = r5.A02
            r1.append(r0)
            java.lang.String r0 = " remove type: "
            r1.append(r0)
            int r0 = r4.A07
            X.C165577te.A1D(r2, r1, r0)
            r0 = 2131433000(0x7f0b1628, float:1.8487773E38)
            android.view.View r0 = r4.findViewById(r0)
            r3 = 8
            r0.setVisibility(r3)
            boolean r0 = r5.A02
            r2 = 1
            if (r0 == 0) goto L_0x0066
            int r0 = r4.A07
            if (r0 != r2) goto L_0x0045
            r1 = 2131892150(0x7f1217b6, float:1.941904E38)
        L_0x0032:
            r0 = 2131434933(0x7f0b1db5, float:1.8491694E38)
            android.widget.TextView r0 = X.C36391kE.A0Q(r4, r0)
            r0.setText(r1)
            r0 = 2131434932(0x7f0b1db4, float:1.8491692E38)
            X.C36341k9.A13(r4, r0, r3)
            r4.BO5(r1)
        L_0x0045:
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x004e
            X.1EU r0 = r4.A05
            r0.A08(r2, r2)
        L_0x004e:
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x0065
            int r1 = r4.A07
            r0 = 2
            if (r1 != r0) goto L_0x0065
            android.content.Intent r2 = X.C36431kI.A0D()
            int r1 = r4.A07
            java.lang.String r0 = "extra_remove_payment_account"
            r2.putExtra(r0, r1)
            X.C36331k8.A0o(r4, r2)
        L_0x0065:
            return
        L_0x0066:
            r1 = 2131892149(0x7f1217b5, float:1.9419038E38)
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.PaymentDeleteAccountActivity.Bf1(X.9KX):void");
    }

    public PaymentDeleteAccountActivity(int i) {
        this.A08 = false;
        C23140B7a.A00(this, 1);
    }

    public void Bes(C202059ky r2) {
        BO5(R.string.f12nameremoved);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View findViewById = findViewById(R.id.hero_payments);
        int i = 0;
        if (configuration.orientation == 2) {
            i = 8;
        }
        findViewById.setVisibility(i);
    }

    public PaymentDeleteAccountActivity() {
        this(0);
        this.A09 = C165607th.A0c("PaymentDeleteAccountActivity", "payment-settings");
    }
}
