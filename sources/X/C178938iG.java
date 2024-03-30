package X;

import android.view.View;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

/* renamed from: X.8iG  reason: invalid class name and case insensitive filesystem */
public final class C178938iG extends C178908iD {
    public final C22977AzT A00;
    public final PaymentMethodRow A01;

    public C178938iG(View view, C22977AzT azT) {
        super(view);
        this.A00 = azT;
        PaymentMethodRow paymentMethodRow = new PaymentMethodRow(view.getContext());
        this.A01 = paymentMethodRow;
        this.A00.addView(paymentMethodRow);
    }
}
