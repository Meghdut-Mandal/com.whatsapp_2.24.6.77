package com.whatsapp.payments.ui;

import X.AnonymousClass00C;
import X.AnonymousClass02E;
import X.C178558gj;
import X.C194489Px;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36431kI;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;

public final class PaymentCheckoutIncentiveFragment extends BasePaymentIncentiveFragment {
    public C194489Px A00;
    public String A01;

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        String string = A0b().getString("extra_formatted_discount");
        AnonymousClass00C.A0B(string);
        this.A01 = string;
        WaTextView waTextView = this.A02;
        Object[] objArr = new Object[1];
        if (string == null) {
            throw C36331k8.A0d("formattedDiscount");
        }
        objArr[0] = string;
        C36381kD.A1E(waTextView, this, objArr, R.string.f12nameremoved);
        TextEmojiLabel textEmojiLabel = this.A00;
        Object[] objArr2 = new Object[1];
        String str = this.A01;
        if (str == null) {
            throw C36331k8.A0d("formattedDiscount");
        }
        objArr2[0] = str;
        C36381kD.A1E(textEmojiLabel, this, objArr2, R.string.f12nameremoved);
        this.A03.setText(R.string.f12nameremoved);
        C36351kA.A1A(view, R.id.security_container, 0);
    }

    public void A1p() {
        AnonymousClass02E r1 = this.A0I;
        if (r1 instanceof DialogFragment) {
            C36431kI.A1N(r1);
        }
        C194489Px r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
    }

    public void A1q() {
        AnonymousClass02E r1 = this.A0I;
        if (r1 instanceof DialogFragment) {
            C36431kI.A1N(r1);
        }
        C194489Px r0 = this.A00;
        if (r0 != null) {
            IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = r0.A00;
            indiaUpiCheckOrderDetailsActivity.A07.A00.A08("valuePropsContinue");
            indiaUpiCheckOrderDetailsActivity.A0S.BOq(C178558gj.A00(), C36361kB.A0i(), 36, "payment_intro_prompt", indiaUpiCheckOrderDetailsActivity.A0f, indiaUpiCheckOrderDetailsActivity.A0i, indiaUpiCheckOrderDetailsActivity.A0h, false, true);
            indiaUpiCheckOrderDetailsActivity.A4R(indiaUpiCheckOrderDetailsActivity);
        }
    }

    public void A19() {
        super.A19();
        C194489Px r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
    }
}
