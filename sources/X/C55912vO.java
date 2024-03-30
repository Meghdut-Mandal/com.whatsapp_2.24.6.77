package X;

import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;

/* renamed from: X.2vO  reason: invalid class name and case insensitive filesystem */
public abstract class C55912vO {
    public static AnimationSet A00(boolean z) {
        AlphaAnimation alphaAnimation;
        AnimationSet animationSet = new AnimationSet(true);
        if (!z) {
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        }
        alphaAnimation.setDuration(125);
        animationSet.addAnimation(alphaAnimation);
        float f = 1.0f;
        float f2 = 0.0f;
        if (z) {
            f = 0.0f;
            f2 = 1.0f;
        }
        ScaleAnimation A0M = C36391kE.A0M(f, f2);
        A0M.setDuration(75);
        animationSet.addAnimation(A0M);
        animationSet.setDuration(75);
        return animationSet;
    }
}
