package X;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.5Gt  reason: invalid class name */
public class AnonymousClass5Gt extends C96954oA {
    public Button A00;
    public ImageView A01;
    public LinearLayout A02;
    public TextView A03;
    public TextView A04;

    public AnonymousClass5Gt(View view) {
        super(view);
        this.A01 = C36401kF.A0G(view, R.id.payout_bank_icon);
        this.A04 = C36391kE.A0O(view, R.id.payout_bank_name);
        this.A03 = C36391kE.A0O(view, R.id.payout_bank_status);
        this.A02 = C90514aH.A0U(view, R.id.warning_container);
        this.A00 = (Button) C012005e.A02(view, R.id.cta_button);
    }
}
