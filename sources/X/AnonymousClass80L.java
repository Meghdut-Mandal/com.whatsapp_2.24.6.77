package X;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.payments.ui.IndiaUpiContactPicker;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;
import com.whatsapp.payments.ui.PaymentSettingsFragment;

/* renamed from: X.80L  reason: invalid class name */
public final class AnonymousClass80L extends AnonymousClass0D3 implements View.OnClickListener {
    public final ImageView A00;
    public final TextEmojiLabel A01;
    public final AnonymousClass9ID A02;

    public void onClick(View view) {
        AnonymousClass00C.A0D(view, 0);
        PaymentSettingsFragment paymentSettingsFragment = this.A02.A00;
        if (paymentSettingsFragment instanceof IndiaUpiPaymentSettingsFragment) {
            Intent A0H = C36441kJ.A0H(paymentSettingsFragment.A1D(), IndiaUpiContactPicker.class);
            A0H.putExtra("for_payments", true);
            paymentSettingsFragment.A1C(A0H);
        }
    }

    public AnonymousClass80L(View view, AnonymousClass9ID r3) {
        super(view);
        this.A02 = r3;
        this.A00 = C36361kB.A0M(view, R.id.contact_icon);
        this.A01 = C36361kB.A0R(view, R.id.contact_image);
        this.A0H.setOnClickListener(this);
    }
}
