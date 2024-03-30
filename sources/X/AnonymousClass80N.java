package X;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity;
import com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity;

/* renamed from: X.80N  reason: invalid class name */
public class AnonymousClass80N extends AnonymousClass0D3 implements View.OnClickListener {
    public final AnonymousClass9I9 A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;

    public void onClick(View view) {
        AnonymousClass9I9 r2 = this.A00;
        int i = this.A05;
        if (i == -1) {
            i = this.A04;
        }
        IndiaUpiProfileDetailsActivity indiaUpiProfileDetailsActivity = r2.A00;
        C206719tr r5 = (C206719tr) r2.A01.get(i);
        C131606Ps A0z = IndiaUpiProfileDetailsActivity.A0z(indiaUpiProfileDetailsActivity);
        A0z.A03("alias_type", r5.A03);
        indiaUpiProfileDetailsActivity.A0S.BOp(A0z, C36361kB.A0i(), 166, "payments_profile", indiaUpiProfileDetailsActivity.getIntent().getStringExtra("extra_referral_screen"));
        C135086c7 r22 = indiaUpiProfileDetailsActivity.A03;
        Intent A0H = C36441kJ.A0H(indiaUpiProfileDetailsActivity, IndiaUpiNumberSettingsActivity.class);
        A0H.putExtra("extra_payment_name", r22);
        A0H.putExtra("extra_payment_upi_alias", r5);
        A0H.putExtra("extra_referral_screen", indiaUpiProfileDetailsActivity.A08);
        indiaUpiProfileDetailsActivity.startActivityForResult(A0H, 1021);
    }

    public AnonymousClass80N(View view, AnonymousClass9I9 r3) {
        super(view);
        this.A01 = C36401kF.A0G(view, R.id.upi_number_image);
        this.A03 = C36391kE.A0O(view, R.id.upi_number_text);
        this.A02 = C36391kE.A0O(view, R.id.linked_upi_number_status);
        this.A00 = r3;
        view.setOnClickListener(this);
    }
}
