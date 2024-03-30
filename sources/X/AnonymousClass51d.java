package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.51d  reason: invalid class name */
public class AnonymousClass51d extends AnonymousClass5FC {
    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        int i;
        AnonymousClass51V r6 = (AnonymousClass51V) obj;
        View view = this.A0H;
        C48812i6.A00(view, r6, this, 16);
        C48812i6.A00(this.A00, r6, this, 17);
        this.A01.setImageDrawable(C36381kD.A0H(view.getContext(), R.drawable.ic_location_nearby));
        this.A03.setText(R.string.f12nameremoved);
        boolean z = r6.A00;
        WaTextView waTextView = this.A02;
        if (z) {
            waTextView.setText(R.string.f12nameremoved);
            i = 0;
            waTextView.setVisibility(0);
            this.A00.setImageDrawable(C36381kD.A0H(view.getContext(), R.drawable.ic_action_info));
        } else {
            i = 8;
            waTextView.setVisibility(8);
        }
        this.A00.setVisibility(i);
    }

    public AnonymousClass51d(View view) {
        super(view);
    }
}
