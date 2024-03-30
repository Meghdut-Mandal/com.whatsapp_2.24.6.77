package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: X.4aS  reason: invalid class name and case insensitive filesystem */
public class C90624aS extends AnimatorListenerAdapter {
    public final /* synthetic */ TransitionValues A00;
    public final /* synthetic */ AnonymousClass680 A01;
    public final /* synthetic */ C92034d1 A02;

    public void onAnimationEnd(Animator animator) {
    }

    public C90624aS(TransitionValues transitionValues, AnonymousClass680 r2, C92034d1 r3) {
        this.A02 = r3;
        this.A00 = transitionValues;
        this.A01 = r2;
    }

    public void onAnimationStart(Animator animator) {
        TransitionValues transitionValues = this.A00;
        transitionValues.view.setAlpha(1.0f);
        AnonymousClass680 r2 = this.A01;
        if (((float) r2.A09) / ((float) r2.A08) < 1.0f || ((float) r2.A06) / ((float) r2.A07) < 1.0f) {
            ViewParent parent = transitionValues.view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).setClipChildren(false);
            }
        }
    }
}
