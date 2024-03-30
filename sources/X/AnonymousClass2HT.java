package X;

import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.whatsapp.R;

/* renamed from: X.2HT  reason: invalid class name */
public final class AnonymousClass2HT extends C42591z4 {
    public AnonymousClass2HT(CardView cardView) {
        super(cardView);
        ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.width = -2;
        cardView.setLayoutParams(layoutParams);
        cardView.setRadius(C36441kJ.A00(C36341k9.A0F(cardView), R.dimen.f7nameremoved));
    }
}
