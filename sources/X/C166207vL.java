package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiEditTransactionDescriptionFragment;

/* renamed from: X.7vL  reason: invalid class name and case insensitive filesystem */
public class C166207vL extends ClickableSpan {
    public final /* synthetic */ IndiaUpiEditTransactionDescriptionFragment A00;

    public C166207vL(IndiaUpiEditTransactionDescriptionFragment indiaUpiEditTransactionDescriptionFragment) {
        this.A00 = indiaUpiEditTransactionDescriptionFragment;
    }

    public void onClick(View view) {
        IndiaUpiEditTransactionDescriptionFragment indiaUpiEditTransactionDescriptionFragment = this.A00;
        indiaUpiEditTransactionDescriptionFragment.A07.BOp((C131606Ps) null, C36361kB.A0i(), C36401kF.A0i(), "payment_description", (String) null);
        indiaUpiEditTransactionDescriptionFragment.A1C(C36331k8.A04("https://faq.whatsapp.com/general/payments/about-the-security-of-your-payment-descriptions"));
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(C36341k9.A0G(this.A00).getColor(R.color.f6nameremoved));
        textPaint.setUnderlineText(false);
    }
}
