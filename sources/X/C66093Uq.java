package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3Uq  reason: invalid class name and case insensitive filesystem */
public class C66093Uq implements ValueAnimator.AnimatorUpdateListener {
    public final View A00;

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.A00;
        ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(view);
        A0a.setMargins(A0a.leftMargin, C36361kB.A01(valueAnimator), A0a.rightMargin, A0a.bottomMargin);
        view.setLayoutParams(A0a);
    }

    public C66093Uq(View view) {
        this.A00 = view;
    }
}
