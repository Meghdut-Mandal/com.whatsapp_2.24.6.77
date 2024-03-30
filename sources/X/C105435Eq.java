package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.5Eq  reason: invalid class name and case insensitive filesystem */
public class C105435Eq extends C46482Xv {
    public final WaTextView A00;
    public final WaTextView A01;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C105205Dt r4 = (C105205Dt) obj;
        int i = r4.A00;
        if (i != 1) {
            int i2 = R.string.f12nameremoved;
            if (i != 2) {
                i2 = R.string.f12nameremoved;
            }
            this.A01.setText(i2);
            WaTextView waTextView = this.A00;
            waTextView.setText(R.string.f12nameremoved);
            waTextView.setVisibility(0);
            C18740tg.A06(r4.A01);
            C36361kB.A18(waTextView, r4, 27);
            return;
        }
        this.A01.setText(R.string.f12nameremoved);
        this.A00.setVisibility(8);
    }

    public C105435Eq(View view) {
        super(view);
        this.A01 = C36401kF.A0Q(view, R.id.error_message);
        this.A00 = C36401kF.A0Q(view, R.id.action_button);
    }
}
