package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.0HY  reason: invalid class name */
public class AnonymousClass0HY implements ValueAnimator.AnimatorUpdateListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass0HY(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.A02 != 0) {
            float A002 = AnonymousClass000.A00(valueAnimator);
            View view = (View) this.A01;
            view.setScaleX(A002);
            view.setScaleY(A002);
            return;
        }
        ((View) ((C09790cw) ((C15750nv) this.A00)).A00.A09.getParent()).invalidate();
    }
}
