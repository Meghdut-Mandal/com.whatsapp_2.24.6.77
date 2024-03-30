package X;

import android.content.DialogInterface;
import com.whatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.6Yw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C133526Yw implements DialogInterface.OnClickListener {
    public final /* synthetic */ PaymentView A00;
    public final /* synthetic */ C135066c4 A01;
    public final /* synthetic */ Integer A02;

    public /* synthetic */ C133526Yw(PaymentView paymentView, C135066c4 r2, Integer num) {
        this.A00 = paymentView;
        this.A01 = r2;
        this.A02 = num;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        PaymentView paymentView = this.A00;
        C135066c4 r2 = this.A01;
        Integer num = this.A02;
        C144326s0 r0 = paymentView.A0s;
        if (r0 != null) {
            r0.A00(r2, num);
        }
    }
}
