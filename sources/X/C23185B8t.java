package X;

import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.B8t  reason: case insensitive filesystem */
public class C23185B8t implements DialogInterface.OnDismissListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C23185B8t(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        DialogFragment dialogFragment;
        int i = this.A02;
        Object obj = this.A00;
        switch (i) {
            case 0:
                dialogFragment = (DialogFragment) this.A01;
                BrazilPaymentActivity brazilPaymentActivity = ((C21253AEj) obj).A05;
                brazilPaymentActivity.A01 = 7;
                brazilPaymentActivity.A3s((String) null);
                break;
            case 1:
                dialogFragment = (DialogFragment) this.A01;
                PaymentView paymentView = ((C21253AEj) obj).A05.A0U;
                if (paymentView != null) {
                    paymentView.A0r.setText((CharSequence) null);
                    break;
                }
                break;
            case 2:
                FingerprintBottomSheet fingerprintBottomSheet = (FingerprintBottomSheet) this.A01;
                AF3 A012 = ((C21253AEj) obj).A05.A0H.A01.A01("FB", "PIN");
                boolean A12 = fingerprintBottomSheet.A12();
                if (A012 != null) {
                    if (A12) {
                        fingerprintBottomSheet.A1j();
                        return;
                    }
                    return;
                } else if (A12) {
                    fingerprintBottomSheet.A1c();
                    return;
                } else {
                    return;
                }
            case 3:
                dialogFragment = (DialogFragment) this.A01;
                BrazilPaymentActivity brazilPaymentActivity2 = ((C21252AEi) obj).A00.A07;
                brazilPaymentActivity2.A01 = 7;
                brazilPaymentActivity2.A3s((String) null);
                break;
            default:
                dialogFragment = (DialogFragment) this.A01;
                PaymentView paymentView2 = ((C21252AEi) obj).A00.A07.A0U;
                if (paymentView2 != null) {
                    paymentView2.A0r.setText((CharSequence) null);
                    break;
                }
                break;
        }
        if (!dialogFragment.A12()) {
            return;
        }
        dialogFragment.A1c();
    }
}
