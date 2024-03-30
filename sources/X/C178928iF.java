package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

/* renamed from: X.8iF  reason: invalid class name and case insensitive filesystem */
public final class C178928iF extends AnonymousClass80D {
    public final C22977AzT A00;
    public final C199849g7 A01;
    public final PaymentMethodRow A02;
    public final View A03;
    public final C18820ts A04;
    public final AnonymousClass1EU A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C178928iF(View view, C18820ts r3, AnonymousClass1EU r4, C22977AzT azT, C199849g7 r6) {
        super(view);
        AnonymousClass00C.A0D(view, 1);
        this.A03 = view;
        this.A04 = r3;
        this.A05 = r4;
        this.A01 = r6;
        this.A00 = azT;
        this.A02 = (PaymentMethodRow) C36361kB.A0F(view, R.id.payment_method_row);
    }
}
