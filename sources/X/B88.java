package X;

import android.text.TextUtils;
import android.view.View;
import com.whatsapp.newsletter.ui.NewsletterCreationActivity;
import com.whatsapp.payments.ui.widget.IndiaUpiDisplaySecureQrCodeView;
import com.whatsapp.payments.ui.widget.PaymentAmountInputField;

public class B88 implements View.OnFocusChangeListener {
    public Object A00;
    public final int A01;

    public B88(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onFocusChange(View view, boolean z) {
        C178248fc r3;
        int i;
        switch (this.A01) {
            case 0:
                r3 = (C178248fc) this.A00;
                if (z) {
                    r3.A0I = C36421kH.A0Z(r3.A3i());
                    return;
                } else if (r3.A3n() != null) {
                    String str = r3.A0I;
                    if (str == null) {
                        throw C36331k8.A0d("tempDescriptionText");
                    } else if (!str.equals(C36421kH.A0Z(r3.A3i()))) {
                        i = 11;
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                r3 = (C178248fc) this.A00;
                String A0Z = C36421kH.A0Z(r3.A3j());
                if (z) {
                    r3.A0J = A0Z;
                    return;
                } else if (C36371kC.A0y(A0Z).length() > 0) {
                    String str2 = r3.A0J;
                    if (str2 == null) {
                        throw C36331k8.A0d("tempNameText");
                    } else if (!str2.equals(C36421kH.A0Z(r3.A3j()))) {
                        i = 6;
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                IndiaUpiDisplaySecureQrCodeView indiaUpiDisplaySecureQrCodeView = (IndiaUpiDisplaySecureQrCodeView) this.A00;
                if (z && !TextUtils.isEmpty(indiaUpiDisplaySecureQrCodeView.A0F.getText())) {
                    PaymentAmountInputField paymentAmountInputField = indiaUpiDisplaySecureQrCodeView.A0F;
                    paymentAmountInputField.setSelection(paymentAmountInputField.getText().length());
                    return;
                }
                return;
        }
        r3.A3l().A07(i, r3 instanceof NewsletterCreationActivity);
    }
}
