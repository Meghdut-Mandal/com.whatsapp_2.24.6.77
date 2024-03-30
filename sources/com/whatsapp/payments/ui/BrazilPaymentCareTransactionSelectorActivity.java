package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass07B;
import X.AnonymousClass13E;
import X.AnonymousClass16D;
import X.AnonymousClass3DY;
import X.AnonymousClass9FD;
import X.B7Y;
import X.C03570Gk;
import X.C165567td;
import X.C165577te;
import X.C173918Tq;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C20050ww;
import X.C202319lY;
import X.C207249un;
import X.C23075B3f;
import X.C24631De;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36391kE;
import X.C50282kV;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.R;

public class BrazilPaymentCareTransactionSelectorActivity extends PaymentTransactionHistoryActivity {
    public AnonymousClass3DY A00;
    public C20050ww A01;
    public AnonymousClass16D A02;
    public AnonymousClass13E A03;
    public C24631De A04;
    public C23075B3f A05;
    public C50282kV A06;
    public boolean A07;

    public static C50282kV A07(BrazilPaymentCareTransactionSelectorActivity brazilPaymentCareTransactionSelectorActivity) {
        BrazilPaymentCareTransactionSelectorActivity brazilPaymentCareTransactionSelectorActivity2 = brazilPaymentCareTransactionSelectorActivity;
        C50282kV r0 = brazilPaymentCareTransactionSelectorActivity.A06;
        if (r0 != null && r0.A06() == 1) {
            brazilPaymentCareTransactionSelectorActivity.A06.A0D(false);
        }
        Bundle A072 = AnonymousClass001.A07();
        A072.putString("com.whatsapp.support.DescribeProblemActivity.from", "payments:settings");
        C20050ww r5 = brazilPaymentCareTransactionSelectorActivity2.A01;
        C50282kV r02 = new C50282kV(A072, brazilPaymentCareTransactionSelectorActivity2, brazilPaymentCareTransactionSelectorActivity2.A00, brazilPaymentCareTransactionSelectorActivity2.A06, r5, brazilPaymentCareTransactionSelectorActivity2.A04, (C207249un) null, (C202319lY) null, brazilPaymentCareTransactionSelectorActivity2.A03, brazilPaymentCareTransactionSelectorActivity2.A04, "payments:settings");
        brazilPaymentCareTransactionSelectorActivity2.A06 = r02;
        return r02;
    }

    public void A2F() {
        if (!this.A07) {
            this.A07 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C165567td.A11(A0B, this);
            C18830tt r1 = A0B.A00;
            C165567td.A0v(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A04 = C36341k9.A0T(A0B);
            C173918Tq.A01(A0B, r1, this);
            this.A02 = C36341k9.A0R(A0B);
            this.A03 = (AnonymousClass13E) A0B.A96.get();
            this.A04 = (C24631De) C165577te.A0f(A0B);
            this.A00 = (AnonymousClass3DY) A0B.A7b.get();
            this.A01 = (C20050ww) A0B.A7v.get();
            this.A05 = (C23075B3f) r1.A0R.get();
        }
    }

    public BrazilPaymentCareTransactionSelectorActivity(int i) {
        this.A07 = false;
        B7Y.A00(this, 40);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        C18740tg.A06(supportActionBar);
        supportActionBar.A0I(R.string.f12nameremoved);
        this.A0E.A00 = new AnonymousClass9FD(this);
        TextView textView = (TextView) C03570Gk.A0B(this, R.id.bottom_button);
        textView.setVisibility(0);
        textView.setText(R.string.f12nameremoved);
        C36391kE.A1I(textView, this, 15);
    }

    public BrazilPaymentCareTransactionSelectorActivity() {
        this(0);
    }
}
