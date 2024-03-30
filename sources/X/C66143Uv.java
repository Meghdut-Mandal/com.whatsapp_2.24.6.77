package X;

import android.animation.ValueAnimator;
import android.text.Spannable;

/* renamed from: X.3Uv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C66143Uv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Spannable A01;
    public final /* synthetic */ C64343Np A02;

    public /* synthetic */ C66143Uv(Spannable spannable, C64343Np r2, int i) {
        this.A02 = r2;
        this.A01 = spannable;
        this.A00 = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C64343Np r3 = this.A02;
        Spannable spannable = this.A01;
        int i = this.A00;
        C36321k7.A0y(spannable, valueAnimator);
        C64343Np.A00(spannable, r3, i, C36341k9.A03(valueAnimator));
    }
}
