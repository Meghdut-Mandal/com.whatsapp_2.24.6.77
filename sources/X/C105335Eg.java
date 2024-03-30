package X;

import android.view.View;
import com.whatsapp.R;

/* renamed from: X.5Eg  reason: invalid class name and case insensitive filesystem */
public class C105335Eg extends C46482Xv {
    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        View view = this.A0H;
        View A02 = C012005e.A02(view, R.id.progress_bar);
        int dimensionPixelSize = C36341k9.A0F(view).getDimensionPixelSize(R.dimen.f7nameremoved);
        if (((AnonymousClass5EM) obj).A00 == 1) {
            dimensionPixelSize = C36341k9.A0F(view).getDimensionPixelSize(R.dimen.f7nameremoved);
        }
        A02.getLayoutParams().width = dimensionPixelSize;
        C36411kG.A1A(A02, dimensionPixelSize);
    }

    public C105335Eg(View view) {
        super(view);
    }
}
