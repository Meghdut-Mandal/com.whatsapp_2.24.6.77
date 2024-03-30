package X;

import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;

/* renamed from: X.2ru  reason: invalid class name and case insensitive filesystem */
public abstract class C53802ru {
    public static final AnimationSet A00(boolean z) {
        AnonymousClass011 A19;
        AnonymousClass011 A192;
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        if (z) {
            A19 = C36441kJ.A19(valueOf, valueOf2);
        } else {
            A19 = C36441kJ.A19(valueOf2, valueOf);
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(C36441kJ.A03(A19.first), C36441kJ.A03(A19.second));
        alphaAnimation.setDuration(160);
        if (z) {
            A192 = C36441kJ.A19(valueOf, valueOf2);
        } else {
            A192 = C36441kJ.A19(valueOf2, valueOf);
        }
        ScaleAnimation A0M = C36391kE.A0M(C36441kJ.A03(A192.first), C36441kJ.A03(A192.second));
        A0M.setDuration(160);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(160);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(A0M);
        return animationSet;
    }
}
