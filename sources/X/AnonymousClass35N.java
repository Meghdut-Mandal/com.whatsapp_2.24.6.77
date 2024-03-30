package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;

/* renamed from: X.35N  reason: invalid class name */
public final class AnonymousClass35N {
    public final View A00;
    public final View A01;

    public AnonymousClass35N(View view, View view2, View view3, FrameLayout frameLayout, C19630wG r9) {
        C36321k7.A1B(r9, view, view2, frameLayout, view3);
        this.A01 = view2;
        this.A00 = view3;
        view3.animate().cancel();
        view3.setAlpha(1.0f);
        C36381kD.A1B(view3, view2);
        frameLayout.removeAllViews();
        C36391kE.A1G(view2, frameLayout, -2, 17);
        C34081gQ.A01(view);
        Context context = r9.A00;
        int color = context.getResources().getColor(C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved));
        view.setBackgroundColor(color);
        view3.setBackgroundColor(color);
    }
}
