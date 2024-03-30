package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.2US  reason: invalid class name */
public class AnonymousClass2US extends C97024oH {
    public final TextView A00;

    public void A0G(Boolean bool) {
        View view;
        int dimensionPixelSize;
        if (bool == null || bool.booleanValue()) {
            view = this.A0H;
            dimensionPixelSize = C36341k9.A0F(view).getDimensionPixelSize(R.dimen.f7nameremoved);
        } else {
            view = this.A0H;
            dimensionPixelSize = C36341k9.A0F(view).getDimensionPixelSize(R.dimen.f7nameremoved) - C36341k9.A0F(view).getDimensionPixelSize(R.dimen.f7nameremoved);
        }
        C36421kH.A0y(view, this.A00, view.getPaddingLeft(), dimensionPixelSize, view.getPaddingRight());
    }

    public AnonymousClass2US(View view, int i) {
        super(view);
        TextView A0O = C36391kE.A0O(this.A0H, R.id.search_no_matches);
        this.A00 = A0O;
        A0O.setText(i);
    }
}
