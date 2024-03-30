package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.whatsapp.R;

/* renamed from: X.1wS  reason: invalid class name and case insensitive filesystem */
public abstract class C41001wS extends AnonymousClass0CZ {
    public static final CardView A00(View view, ViewGroup viewGroup) {
        View inflate = C36351kA.A0C(viewGroup).inflate(R.layout.f9nameremoved, viewGroup, false);
        AnonymousClass00C.A0E(inflate, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        CardView cardView = (CardView) inflate;
        cardView.addView(view);
        return cardView;
    }
}
