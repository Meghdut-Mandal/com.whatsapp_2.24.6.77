package X;

import android.content.Intent;
import android.view.KeyEvent;
import android.widget.TextView;
import com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity;
import com.whatsapp.payments.ui.mapper.register.IndiaUpiCreateCustomNumberActivity;
import com.whatsapp.payments.ui.widget.IndiaUpiDisplaySecureQrCodeView;

/* renamed from: X.B7b  reason: case insensitive filesystem */
public class C23141B7b implements TextView.OnEditorActionListener {
    public Object A00;
    public final int A01;

    public C23141B7b(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        String str;
        switch (this.A01) {
            case 0:
                IndiaUpiDebitCardVerificationActivity indiaUpiDebitCardVerificationActivity = (IndiaUpiDebitCardVerificationActivity) this.A00;
                if (i != 6) {
                    return false;
                }
                IndiaUpiDebitCardVerificationActivity.A11(indiaUpiDebitCardVerificationActivity);
                return true;
            case 1:
                IndiaUpiCreateCustomNumberActivity indiaUpiCreateCustomNumberActivity = (IndiaUpiCreateCustomNumberActivity) this.A00;
                if ((keyEvent == null || keyEvent.getKeyCode() != 66) && i != 6) {
                    return false;
                }
                AF7 af7 = indiaUpiCreateCustomNumberActivity.A05;
                if (af7 != null) {
                    Integer A0j = C36361kB.A0j();
                    Intent intent = indiaUpiCreateCustomNumberActivity.getIntent();
                    if (intent != null) {
                        str = intent.getStringExtra("extra_referral_screen");
                    } else {
                        str = null;
                    }
                    af7.BOm(A0j, (Integer) null, "create_numeric_upi_alias", str);
                    IndiaUpiCreateCustomNumberActivity.A01(indiaUpiCreateCustomNumberActivity);
                    return true;
                }
                throw C36331k8.A0d("fieldStatsLogger");
            default:
                IndiaUpiDisplaySecureQrCodeView indiaUpiDisplaySecureQrCodeView = (IndiaUpiDisplaySecureQrCodeView) this.A00;
                if (i != 6) {
                    return false;
                }
                indiaUpiDisplaySecureQrCodeView.A0G.A02.A0D(C36361kB.A0n(indiaUpiDisplaySecureQrCodeView.A0F));
                return true;
        }
    }
}
