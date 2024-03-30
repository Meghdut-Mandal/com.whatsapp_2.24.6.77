package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

/* renamed from: X.0sY  reason: invalid class name and case insensitive filesystem */
public class C18060sY extends AnimatorListenerAdapter {
    public Object A00;
    public final int A01;

    public C18060sY(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.A01 != 0) {
            super.onAnimationCancel(animator);
            return;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.A00;
        actionBarOverlayLayout.A00 = null;
        actionBarOverlayLayout.A04 = false;
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.A01) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.A00;
                actionBarOverlayLayout.A00 = null;
                actionBarOverlayLayout.A04 = false;
                return;
            case 1:
                ((HideBottomViewOnScrollBehavior) this.A00).A06 = null;
                return;
            default:
                ((AnonymousClass6YL) this.A00).A0O();
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        if (2 - this.A01 != 0) {
            super.onAnimationStart(animator);
            return;
        }
        AnonymousClass6YL r0 = (AnonymousClass6YL) this.A00;
        C17130qm A0A = r0.A0K;
        int A06 = r0.A0C;
        int A07 = r0.A0A;
        A0A.B0x(A06 - A07, A07);
    }
}
