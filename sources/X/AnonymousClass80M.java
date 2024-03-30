package X;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;

/* renamed from: X.80M  reason: invalid class name */
public final class AnonymousClass80M extends AnonymousClass0D3 implements View.OnClickListener {
    public final ImageView A00;
    public final TextEmojiLabel A01;
    public final AnonymousClass9FP A02;

    public void onClick(View view) {
        String str;
        AnonymousClass00C.A0D(view, 0);
        IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = this.A02.A00;
        Intent intent = indiaUpiPaymentSettingsFragment.A0h().getIntent();
        AF7 af7 = indiaUpiPaymentSettingsFragment.A0M;
        Integer A0i = C36361kB.A0i();
        if (intent != null) {
            str = intent.getStringExtra("referral_screen");
        } else {
            str = null;
        }
        af7.BOm(A0i, 188, "payment_home", str);
        indiaUpiPaymentSettingsFragment.A1u();
    }

    public AnonymousClass80M(View view, AnonymousClass9FP r3) {
        super(view);
        this.A02 = r3;
        this.A00 = C36361kB.A0M(view, R.id.contact_icon);
        this.A01 = C36361kB.A0R(view, R.id.contact_image);
        this.A0H.setOnClickListener(this);
    }
}
