package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.5Eu  reason: invalid class name and case insensitive filesystem */
public class C105475Eu extends C46482Xv {
    public final WaTextView A00;
    public final WaTextView A01;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        WaTextView waTextView;
        int i;
        AnonymousClass5E1 r5 = (AnonymousClass5E1) obj;
        int i2 = r5.A00;
        if (i2 != 0) {
            WaTextView waTextView2 = this.A00;
            if (i2 != 1) {
                waTextView2.setText(R.string.f12nameremoved);
                waTextView = this.A01;
                waTextView.setVisibility(0);
                waTextView.setText(R.string.f12nameremoved);
                i = 22;
            } else {
                waTextView2.setText(R.string.f12nameremoved);
                waTextView = this.A01;
                waTextView.setVisibility(0);
                waTextView.setText(R.string.f12nameremoved);
                i = 21;
            }
            C36361kB.A17(waTextView, r5, i);
            return;
        }
        this.A00.setText(R.string.f12nameremoved);
        this.A01.setVisibility(8);
    }

    public C105475Eu(View view) {
        super(view);
        this.A00 = C36401kF.A0Q(view, R.id.error_message);
        this.A01 = C36401kF.A0Q(view, R.id.load_categories_btn);
    }
}
