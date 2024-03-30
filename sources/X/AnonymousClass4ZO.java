package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;

/* renamed from: X.4ZO  reason: invalid class name */
public class AnonymousClass4ZO implements C34871hm {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4ZO(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BZ9(View view) {
        GradientDrawable gradientDrawable;
        int i;
        int i2;
        switch (this.A02) {
            case 0:
                View view2 = (View) this.A00;
                AnonymousClass00C.A0D(view, 2);
                Drawable background = view.getBackground();
                AnonymousClass00C.A0E(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                gradientDrawable = (GradientDrawable) background;
                gradientDrawable.mutate();
                i = C65103Qt.A01(view2.getContext(), 1.0f);
                Context context = view2.getContext();
                boolean z = ((AnonymousClass3T1) this.A01).A1J.A02;
                int i3 = R.color.f6nameremoved;
                if (z) {
                    i3 = R.color.f6nameremoved;
                }
                i2 = AnonymousClass00F.A00(context, i3);
                break;
            case 1:
                View view3 = (View) this.A00;
                Context context2 = view3.getContext();
                boolean z2 = ((AnonymousClass3T1) this.A01).A1J.A02;
                Context context3 = view3.getContext();
                int i4 = R.attr.f4nameremoved;
                int i5 = R.color.f6nameremoved;
                if (z2) {
                    i4 = R.attr.f4nameremoved;
                    i5 = R.color.f6nameremoved;
                }
                view.setBackground(new C36821lM(C36351kA.A02(context3, context2, i4, i5)));
                return;
            case 2:
                View view4 = (View) this.A00;
                gradientDrawable = (GradientDrawable) view.getBackground();
                gradientDrawable.mutate();
                i = C65103Qt.A01(view4.getContext(), 1.0f);
                Resources resources = view4.getResources();
                boolean z3 = ((AnonymousClass3T1) this.A01).A1J.A02;
                int i6 = R.color.f6nameremoved;
                if (z3) {
                    i6 = R.color.f6nameremoved;
                }
                i2 = resources.getColor(i6);
                break;
            default:
                Context context4 = (Context) this.A01;
                CircularProgressBar circularProgressBar = (CircularProgressBar) view;
                circularProgressBar.setMax(100);
                circularProgressBar.A0A = AnonymousClass00F.A00(context4, C224314h.A01(((View) this.A00).getContext(), R.attr.f4nameremoved));
                circularProgressBar.A09 = AnonymousClass00F.A00(context4, R.color.f6nameremoved);
                return;
        }
        gradientDrawable.setStroke(i, i2);
    }
}
