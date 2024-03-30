package com.whatsapp.payments.ui;

import X.AnonymousClass01I;
import X.B7Z;
import X.C012005e;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C173858Tk;
import X.C178828hf;
import X.C18800tq;
import X.C18830tt;
import X.C27111My;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36421kH;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.RoundedBottomSheetDialogFragment;

public class IndiaUpiProvideMoreInfoBottomSheetActivity extends C178828hf {
    public boolean A00;

    public class BottomSheetProvideMoreInfoFragment extends RoundedBottomSheetDialogFragment {
        public void A19() {
            super.A19();
            C36341k9.A15(this);
        }

        public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View A0E = C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
            AnonymousClass01I A0h = A0h();
            if (A0h != null) {
                C36421kH.A13(C012005e.A02(A0E, R.id.close), this, 10);
                C36421kH.A13(C012005e.A02(A0E, R.id.account_recovery_info_continue), A0h, 11);
            }
            return A0E;
        }
    }

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173858Tk.A0h(A0L, r2, r1, this);
            C173858Tk.A0i(A0L, r2, r1, this, C165577te.A0f(r2));
            C173858Tk.A0q(r2, r1, this);
            C173858Tk.A0p(r2, r1, this);
            this.A00 = C165587tf.A0Q(r2);
        }
    }

    public IndiaUpiProvideMoreInfoBottomSheetActivity(int i) {
        this.A00 = false;
        B7Z.A00(this, 37);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        paymentBottomSheet.A02 = new BottomSheetProvideMoreInfoFragment();
        Btm(paymentBottomSheet);
    }

    public IndiaUpiProvideMoreInfoBottomSheetActivity() {
        this(0);
    }
}
