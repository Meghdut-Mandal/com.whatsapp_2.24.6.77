package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass1DR;
import X.AnonymousClass1EV;
import X.AnonymousClass1XC;
import X.AnonymousClass1YK;
import X.AnonymousClass6VG;
import X.B6J;
import X.B7Y;
import X.C1025050g;
import X.C147166wm;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165597tg;
import X.C165607th;
import X.C165617ti;
import X.C178808hb;
import X.C18800tq;
import X.C18830tt;
import X.C196039Xk;
import X.C199109ei;
import X.C199849g7;
import X.C200959iX;
import X.C201219j5;
import X.C201649k3;
import X.C202939my;
import X.C203449o2;
import X.C207249un;
import X.C25251Fo;
import X.C27111My;
import X.C29231Vv;
import X.C36321k7;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import android.content.Intent;
import android.view.View;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BrazilFbPayHubActivity extends C178808hb implements B6J {
    public C147166wm A00;
    public C202939my A01;
    public AnonymousClass1EV A02;
    public AnonymousClass6VG A03;
    public C200959iX A04;
    public C196039Xk A05;
    public C201219j5 A06;
    public C201649k3 A07;
    public C199849g7 A08;
    public C199109ei A09;
    public boolean A0A;

    public boolean BtK() {
        return true;
    }

    public boolean BtO() {
        return true;
    }

    public void A2F() {
        if (!this.A0A) {
            this.A0A = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r3 = A0L.A5g;
            C165567td.A11(r3, this);
            C18830tt r2 = r3.A00;
            C165567td.A0v(r3, r2, this, C36321k7.A05(r3, r2, this));
            this.A0A = C36381kD.A0f(r3);
            this.A07 = C165587tf.A0S(r3);
            this.A09 = C165587tf.A0T(r3);
            this.A0B = (AnonymousClass1XC) r3.A6F.get();
            this.A04 = C165607th.A0Y(r3);
            this.A08 = (AnonymousClass1DR) r3.A6G.get();
            this.A05 = (C29231Vv) r3.AVn.get();
            this.A03 = (C25251Fo) r3.A5J.get();
            this.A06 = (AnonymousClass1YK) r3.AVp.get();
            this.A04 = (C200959iX) r2.AAc.get();
            this.A00 = (C147166wm) r2.A5F.get();
            this.A06 = (C201219j5) r2.A5I.get();
            this.A05 = (C196039Xk) r2.AAd.get();
            this.A02 = C36371kC.A0h(r3);
            this.A08 = C165607th.A0e(r3);
            this.A01 = r2.A7n();
            this.A03 = (AnonymousClass6VG) r2.AAa.get();
            this.A07 = (C201649k3) r2.A5T.get();
            this.A09 = C27111My.A2x(A0L);
        }
    }

    public String BEC(C207249un r2) {
        return this.A08.A01(r2);
    }

    public void BQr(boolean z) {
        String A012 = C201649k3.A01(this.A07, "generic_context", false);
        Intent A0F = C165597tg.A0F(this);
        C1025050g.A01(A0F, "onboarding_context", "generic_context");
        C1025050g.A01(A0F, "referral_screen", "fbpay_payment_settings");
        if (A012 != null) {
            A0F.putExtra("screen_name", A012);
        } else {
            C1025050g.A01(A0F, "verification_needed", C165617ti.A0Y(z ? 1 : 0));
            A0F.putExtra("screen_name", "brpay_p_add_card");
        }
        A33(A0F, false);
    }

    public BrazilFbPayHubActivity(int i) {
        this.A0A = false;
        B7Y.A00(this, 34);
    }

    public void BcR(C207249un r3) {
        if (r3.A09() != 5) {
            startActivity(C165577te.A0I(this, r3, BrazilPaymentCardDetailsActivity.class));
        }
    }

    public void Bti(C207249un r2, PaymentMethodRow paymentMethodRow) {
        if (C203449o2.A08(r2)) {
            this.A06.A02(r2, paymentMethodRow);
        }
    }

    public void Bwm(List list) {
        ArrayList A0I = AnonymousClass001.A0I();
        ArrayList A0I2 = AnonymousClass001.A0I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C207249un A0S = C165607th.A0S(it);
            int A092 = A0S.A09();
            if (A092 == 5 || A092 == 9) {
                A0I.add(A0S);
            } else {
                A0I2.add(A0S);
            }
        }
        if (this.A02.A01()) {
            boolean isEmpty = A0I2.isEmpty();
            View view = this.A0G;
            if (isEmpty) {
                view.setVisibility(8);
                this.A0H.setVisibility(0);
            } else {
                view.setVisibility(0);
                this.A0H.setVisibility(8);
            }
        }
        super.Bwm(A0I2);
    }

    public void onResume() {
        super.onResume();
        if (!this.A07.A03.A03()) {
            finish();
        }
    }

    public /* synthetic */ int BEA(C207249un r2) {
        return 0;
    }

    public /* synthetic */ boolean Bt7(C207249un r2) {
        return false;
    }

    public BrazilFbPayHubActivity() {
        this(0);
    }
}
