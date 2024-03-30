package com.whatsapp.payments.ui.bottomsheet;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass3AO;
import X.AnonymousClass3NG;
import X.C012005e;
import X.C122735vL;
import X.C36331k8;
import X.C36341k9;
import X.C36401kF;
import X.C36421kH;
import X.C36431kI;
import X.C50772lY;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;

public final class PaymentMayBeInProgressBottomSheet extends Hilt_PaymentMayBeInProgressBottomSheet {
    public C122735vL A00;
    public String A01;

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        TextView A0M = C36341k9.A0M(view, R.id.payment_may_in_progress_body);
        Object[] A0L = AnonymousClass001.A0L();
        String str = this.A01;
        if (str == null) {
            throw C36331k8.A0d("receiverName");
        }
        A0M.setText(C36401kF.A0q(this, str, A0L, 0, R.string.f12nameremoved));
        C36421kH.A12(C012005e.A02(view, R.id.payment_may_in_progress_button_continue), this, 2);
        C36421kH.A12(C012005e.A02(view, R.id.payment_may_in_progress_button_back), this, 1);
    }

    public void A1k(AnonymousClass3NG r4) {
        AnonymousClass00C.A0D(r4, 0);
        C50772lY r1 = C50772lY.A00;
        AnonymousClass3AO r0 = r4.A00;
        r0.A04 = r1;
        r0.A06 = false;
    }

    public void onCancel(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onCancel(dialogInterface);
        C122735vL r1 = this.A00;
        if (r1 != null) {
            r1.A02.A1b();
            IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = r1.A01;
            if (indiaUpiCheckOrderDetailsActivity.BMo()) {
                indiaUpiCheckOrderDetailsActivity.finish();
                indiaUpiCheckOrderDetailsActivity.overridePendingTransition(0, 0);
            }
        }
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        String A17 = C36431kI.A17(A0b(), "arg_receiver_name");
        AnonymousClass00C.A08(A17);
        this.A01 = A17;
    }

    public int A1i() {
        return R.layout.f9nameremoved;
    }
}
