package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity;

/* renamed from: X.80P  reason: invalid class name */
public class AnonymousClass80P extends AnonymousClass0D3 implements View.OnClickListener {
    public final AnonymousClass9FI A00;
    public final ImageView A01;
    public final RadioButton A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;

    public void onClick(View view) {
        AnonymousClass9FI r1 = this.A00;
        int i = this.A05;
        if (i == -1) {
            i = this.A04;
        }
        IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity = r1.A00;
        if (!indiaUpiBankAccountPickerActivity.A0J && (!((C193899Ni) indiaUpiBankAccountPickerActivity.A0I.get(i)).A06)) {
            if (indiaUpiBankAccountPickerActivity.A0I.size() == 1) {
                IndiaUpiBankAccountPickerActivity.A10(indiaUpiBankAccountPickerActivity);
                return;
            }
            ((C193899Ni) indiaUpiBankAccountPickerActivity.A0I.get(indiaUpiBankAccountPickerActivity.A01)).A00 = false;
            ((C193899Ni) indiaUpiBankAccountPickerActivity.A0I.get(i)).A00 = true;
            AnonymousClass0CZ r12 = indiaUpiBankAccountPickerActivity.A02.A0G;
            if (r12 != null) {
                r12.A07(indiaUpiBankAccountPickerActivity.A01);
                indiaUpiBankAccountPickerActivity.A01 = i;
                indiaUpiBankAccountPickerActivity.A02.A0G.A07(i);
            }
        }
    }

    public AnonymousClass80P(View view, AnonymousClass9FI r3) {
        super(view);
        this.A01 = C36401kF.A0G(view, R.id.provider_icon);
        this.A04 = C36391kE.A0O(view, R.id.account_number);
        this.A03 = C36391kE.A0O(view, R.id.account_name);
        this.A05 = C36391kE.A0O(view, R.id.account_type);
        this.A02 = (RadioButton) C012005e.A02(view, R.id.radio_button);
        this.A00 = r3;
        view.setOnClickListener(this);
    }
}
