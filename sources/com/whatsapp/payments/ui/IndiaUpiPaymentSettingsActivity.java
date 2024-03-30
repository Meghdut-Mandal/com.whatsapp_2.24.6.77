package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass0FM;
import X.AnonymousClass3LW;
import X.AnonymousClass3M8;
import X.B5A;
import X.B7Z;
import X.B84;
import X.C1033154u;
import X.C165567td;
import X.C18800tq;
import X.C18830tt;
import X.C194949Rw;
import X.C199499fP;
import X.C202269lR;
import X.C21299AGd;
import X.C22976AzS;
import X.C36321k7;
import X.C36331k8;
import X.C36371kC;
import X.C39001qm;
import X.C46622Zo;
import X.C90504aG;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public final class IndiaUpiPaymentSettingsActivity extends C46622Zo {
    public C199499fP A00;
    public C202269lR A01;
    public C1033154u A02;
    public C194949Rw A03;
    public PaymentBottomSheet A04;
    public boolean A05;

    public void A2F() {
        if (!this.A05) {
            this.A05 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C165567td.A11(A0B, this);
            C18830tt r1 = A0B.A00;
            C165567td.A0v(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A00 = C36371kC.A0h(A0B);
            AnonymousClass3M8.A00(this, C90504aG.A0V(A0B));
            this.A00 = (C199499fP) r1.A5B.get();
            this.A02 = (C1033154u) A0B.AVf.get();
            this.A01 = (C202269lR) A0B.A48.get();
            this.A03 = (C194949Rw) r1.A62.get();
        }
    }

    public PaymentSettingsFragment A3i() {
        return new IndiaUpiPaymentSettingsFragment();
    }

    public Dialog onCreateDialog(int i) {
        C39001qm A002;
        PaymentSettingsFragment paymentSettingsFragment = this.A02;
        if (paymentSettingsFragment instanceof IndiaUpiPaymentSettingsFragment) {
            if (i == 100) {
                A002 = AnonymousClass3LW.A00(paymentSettingsFragment.A0i());
                A002.A0c(R.string.f12nameremoved);
                A002.A0r(false);
                B84.A00(A002, paymentSettingsFragment, 11, R.string.f12nameremoved);
                A002.A0d(R.string.f12nameremoved);
            } else if (i == 101) {
                A002 = AnonymousClass3LW.A00(paymentSettingsFragment.A0i());
                A002.A0c(R.string.f12nameremoved);
                A002.A0r(true);
                B84.A00(A002, paymentSettingsFragment, 12, R.string.f12nameremoved);
            }
            AnonymousClass0FM create = A002.create();
            if (create != null) {
                return create;
            }
        }
        return super.onCreateDialog(i);
    }

    public IndiaUpiPaymentSettingsActivity(int i) {
        this.A05 = false;
        B7Z.A00(this, 26);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A03.A00((C22976AzS) null);
        if (this.A00.A02.A0E(698)) {
            this.A02.A0F();
        }
        C165567td.A0j(this);
        if (getIntent().getBooleanExtra("extra_open_transaction_confirmation_fragment", false) && bundle == null) {
            PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
            this.A04 = paymentBottomSheet;
            Bundle A07 = AnonymousClass001.A07();
            IndiaUpiPaymentTransactionConfirmationFragment indiaUpiPaymentTransactionConfirmationFragment = new IndiaUpiPaymentTransactionConfirmationFragment();
            indiaUpiPaymentTransactionConfirmationFragment.A17(A07);
            indiaUpiPaymentTransactionConfirmationFragment.A17(C36371kC.A0H(this));
            indiaUpiPaymentTransactionConfirmationFragment.A0A = new C21299AGd(this, paymentBottomSheet);
            paymentBottomSheet.A02 = indiaUpiPaymentTransactionConfirmationFragment;
            Btl(paymentBottomSheet, "IndiaUpiPaymentTransactionConfirmationFragment");
            getIntent().putExtra("extra_open_transaction_confirmation_fragment", false);
        }
        this.A00.A01(new B5A(this, 3));
    }

    public void onResume() {
        super.onResume();
        if (this.A00.A02()) {
            C199499fP.A00(this);
        }
    }

    public IndiaUpiPaymentSettingsActivity() {
        this(0);
        this.A04 = new PaymentBottomSheet();
    }
}
