package X;

import android.view.View;
import android.widget.Button;
import com.whatsapp.R;

/* renamed from: X.8ko  reason: invalid class name and case insensitive filesystem */
public class C179858ko extends AnonymousClass80F {
    public final View A00;
    public final Button A01;
    public final Button A02;
    public final Button A03;
    public final C202629mK A04;

    public C179858ko(View view, C202629mK r3) {
        super(view);
        this.A04 = r3;
        this.A02 = (Button) C012005e.A02(view, R.id.request_cancel_button);
        this.A03 = (Button) C012005e.A02(view, R.id.retry_withdrawal_button);
        this.A01 = (Button) C012005e.A02(view, R.id.accept_payment_button);
        this.A00 = C012005e.A02(view, R.id.button_group_view);
    }
}
