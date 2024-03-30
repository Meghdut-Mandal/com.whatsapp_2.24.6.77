package X;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;

/* renamed from: X.2tn  reason: invalid class name and case insensitive filesystem */
public abstract class C54932tn {
    public static void A00(C224914p r5, int i) {
        Toolbar A0R = C36411kG.A0R(r5);
        AnonymousClass07B A0Q = C36431kI.A0Q(r5, A0R);
        if (A0Q != null) {
            C36331k8.A0l(r5);
            r5.getWindow().setStatusBarColor(AnonymousClass00F.A00(r5, R.color.f6nameremoved));
            C36341k9.A0q(r5, A0R, C36411kG.A01(r5));
            A0Q.A0L(AnonymousClass00E.A00(r5, i));
            A0Q.A0X(false);
            A0Q.A0U(true);
            A0R.setOverflowIcon(AnonymousClass3UF.A04(r5, AnonymousClass00E.A00(r5, R.drawable.vec_ic_more), R.color.f6nameremoved));
            View findViewById = r5.findViewById(R.id.scroll_view);
            if (findViewById != null) {
                findViewById.getViewTreeObserver().addOnScrollChangedListener(new AnonymousClass3ZY(findViewById, A0Q, r5));
            }
        }
    }
}
