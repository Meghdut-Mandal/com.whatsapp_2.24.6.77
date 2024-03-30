package X;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;

/* renamed from: X.80O  reason: invalid class name */
public final class AnonymousClass80O extends AnonymousClass0D3 implements View.OnClickListener {
    public final ImageView A00;
    public final ImageView A01;
    public final TextEmojiLabel A02;
    public final AnonymousClass9FP A03;

    public void onClick(View view) {
        Intent intent;
        String str;
        AnonymousClass00C.A0D(view, 0);
        AnonymousClass9FP r2 = this.A03;
        int i = this.A05;
        if (i == -1) {
            i = this.A04;
        }
        IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = r2.A00;
        AnonymousClass141 r5 = (AnonymousClass141) indiaUpiPaymentSettingsFragment.A0S.A00.get(i);
        AnonymousClass01I A0h = indiaUpiPaymentSettingsFragment.A0h();
        if (A0h != null) {
            intent = A0h.getIntent();
        } else {
            intent = null;
        }
        C131606Ps A0F = C165567td.A0F();
        A0F.A03("merchant_name", r5.A0K());
        AF7 af7 = indiaUpiPaymentSettingsFragment.A0M;
        Integer A0i = C36361kB.A0i();
        if (intent != null) {
            str = intent.getStringExtra("referral_screen");
        } else {
            str = null;
        }
        af7.BOp(A0F, A0i, 187, "payment_home", str);
        Intent A1Z = new AnonymousClass190().A1Z(indiaUpiPaymentSettingsFragment.A0h(), r5.A0H, 0);
        AnonymousClass01I A0h2 = indiaUpiPaymentSettingsFragment.A0h();
        A1Z.putExtra("share_msg", "Hi");
        A1Z.putExtra("confirm", true);
        A1Z.putExtra("has_share", true);
        AnonymousClass3M2.A00(A0h2, A1Z);
        indiaUpiPaymentSettingsFragment.A1C(A1Z);
    }

    public AnonymousClass80O(View view, AnonymousClass9FP r3) {
        super(view);
        this.A03 = r3;
        this.A00 = C36361kB.A0M(view, R.id.contact_icon);
        this.A02 = C36361kB.A0R(view, R.id.contact_image);
        this.A01 = C36361kB.A0M(view, R.id.contact_verified_badge);
        this.A0H.setOnClickListener(this);
    }
}
