package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* renamed from: X.06A  reason: invalid class name */
public final class AnonymousClass06A {
    public final Animator.AnimatorListener A00 = new C18020sU(this, 2);
    public final ArrayList A01 = new ArrayList();

    public void A00(ValueAnimator valueAnimator, int[] iArr) {
        AnonymousClass06D r1 = new AnonymousClass06D(valueAnimator, iArr);
        valueAnimator.addListener(this.A00);
        this.A01.add(r1);
    }
}
