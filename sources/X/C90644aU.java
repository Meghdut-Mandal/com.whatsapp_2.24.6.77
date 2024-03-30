package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.TransitionDrawable;
import org.npci.upi.security.pinactivitycomponent.GetCredential;

/* renamed from: X.4aU  reason: invalid class name and case insensitive filesystem */
public class C90644aU extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ GetCredential A01;
    public final /* synthetic */ boolean A02;

    public C90644aU(GetCredential getCredential, int i, boolean z) {
        this.A01 = getCredential;
        this.A02 = z;
        this.A00 = i;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (!this.A02) {
            GetCredential getCredential = this.A01;
            getCredential.A04.setVisibility(8);
            getCredential.A05.setVisibility(8);
            getCredential.A03.resetTransition();
        }
    }

    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        boolean z = this.A02;
        GetCredential getCredential = this.A01;
        TransitionDrawable transitionDrawable = getCredential.A03;
        if (z) {
            transitionDrawable.startTransition(300);
            getCredential.A04.setVisibility(0);
            getCredential.A05.setVisibility(0);
            getCredential.A05.setLayoutDirection(0);
            if (getCredential.A04.getY() == 0.0f) {
                getCredential.A04.setY((float) (-this.A00));
                return;
            }
            return;
        }
        transitionDrawable.reverseTransition(300);
    }
}
