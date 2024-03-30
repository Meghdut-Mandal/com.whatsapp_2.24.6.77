package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* renamed from: X.1kN  reason: invalid class name and case insensitive filesystem */
public final class C36481kN extends AnimatorListenerAdapter {
    public AnimatorSet A00;

    public void onAnimationCancel(Animator animator) {
        AnimatorSet animatorSet = this.A00;
        if (animatorSet != null) {
            animatorSet.removeListener(this);
        }
        this.A00 = null;
    }

    public void onAnimationEnd(Animator animator) {
        AnimatorSet animatorSet = this.A00;
        if (animatorSet != null) {
            animatorSet.removeListener(this);
        }
        this.A00 = null;
    }
}
