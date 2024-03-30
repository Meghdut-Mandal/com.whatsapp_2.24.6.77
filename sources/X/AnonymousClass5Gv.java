package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.5Gv  reason: invalid class name */
public class AnonymousClass5Gv extends AnonymousClass80F {
    public TextView A00;
    public TextView A01;

    public void A0B(AnonymousClass9FU r3, int i) {
        AnonymousClass5Gw r32 = (AnonymousClass5Gw) r3;
        this.A01.setText(r32.A01);
        String str = r32.A00;
        if (str != null) {
            TextView textView = this.A00;
            textView.setText(str);
            textView.setVisibility(0);
        }
    }

    public AnonymousClass5Gv(View view) {
        super(view);
        this.A01 = C36391kE.A0O(view, R.id.header);
        this.A00 = C36391kE.A0O(view, R.id.description);
    }
}
