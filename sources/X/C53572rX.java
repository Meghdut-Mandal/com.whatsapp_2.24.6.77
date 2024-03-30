package X;

import android.animation.ValueAnimator;
import android.view.View;
import com.whatsapp.HomeActivity;
import com.whatsapp.PagerSlidingTabStrip;

/* renamed from: X.2rX  reason: invalid class name and case insensitive filesystem */
public class C53572rX implements ValueAnimator.AnimatorUpdateListener {
    public Object A00;
    public final int A01;

    public C53572rX(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.A01) {
            case 0:
                ((View) this.A00).setTranslationY((float) C36361kB.A01(valueAnimator));
                return;
            case 3:
                View view = (View) this.A00;
                AnonymousClass00C.A0D(valueAnimator, 1);
                view.getLayoutParams().height = C36341k9.A03(valueAnimator);
                view.requestLayout();
                return;
            default:
                HomeActivity homeActivity = (HomeActivity) this.A00;
                PagerSlidingTabStrip pagerSlidingTabStrip = homeActivity.A04;
                if (pagerSlidingTabStrip != null) {
                    pagerSlidingTabStrip.setBackgroundColor(C36361kB.A01(valueAnimator));
                }
                int i = 0;
                while (true) {
                    AnonymousClass1RF r1 = homeActivity.A0j;
                    if (i < r1.A00) {
                        AnonymousClass1RF.A00(r1, i).A05.setTextColor(C36361kB.A01(valueAnimator));
                        i++;
                    } else {
                        return;
                    }
                }
        }
    }
}
