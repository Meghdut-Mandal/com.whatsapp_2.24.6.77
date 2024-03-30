package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.4VG  reason: invalid class name */
public class AnonymousClass4VG extends AnimatorListenerAdapter {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public AnonymousClass4VG(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A05 = i;
        this.A02 = obj3;
        this.A04 = obj2;
        this.A00 = obj4;
        this.A01 = obj5;
        this.A03 = obj;
    }

    public void onAnimationEnd(Animator animator) {
        Object obj;
        switch (this.A05) {
            case 0:
                AnonymousClass00C.A0D(animator, 0);
                super.onAnimationEnd(animator);
                View view = (View) this.A00;
                C63793Ll.A00(view);
                View view2 = (View) this.A01;
                C63793Ll.A00(view2);
                View[] viewArr = new View[2];
                viewArr[0] = view;
                C63793Ll.A01(C36341k9.A0m(view2, viewArr, 1));
                view.clearAnimation();
                view2.clearAnimation();
                obj = this.A03;
                break;
            case 1:
                AnonymousClass00C.A0D(animator, 0);
                super.onAnimationEnd(animator);
                Object[] objArr = new View[3];
                objArr[0] = this.A03;
                objArr[1] = this.A00;
                C63793Ll.A01(C36341k9.A0m(this.A04, objArr, 2));
                View view3 = (View) this.A01;
                C63793Ll.A00(view3);
                view3.clearAnimation();
                obj = this.A02;
                break;
            case 2:
                AnonymousClass00C.A0D(animator, 0);
                super.onAnimationEnd(animator);
                ((View) this.A02).clearAnimation();
                return;
            case 3:
                ((View) this.A04).animate().alpha(1.0f).setDuration(100).start();
                ((View) this.A01).animate().alpha(1.0f).setDuration(100).start();
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
        ((Animator) obj).start();
    }

    public void onAnimationStart(Animator animator) {
        int i;
        View view;
        switch (this.A05) {
            case 0:
                AnonymousClass00C.A0D(animator, 0);
                super.onAnimationStart(animator);
                ((View) this.A02).setVisibility(8);
                TransitionDrawable transitionDrawable = (TransitionDrawable) this.A04;
                if (transitionDrawable != null) {
                    transitionDrawable.startTransition(500);
                    return;
                }
                return;
            case 2:
                AnonymousClass00C.A0D(animator, 0);
                super.onAnimationStart(animator);
                ((View) this.A02).setAlpha(0.0f);
                ((View) this.A03).setVisibility(0);
                ((View) this.A01).setVisibility(0);
                i = 8;
                ((View) this.A04).setVisibility(8);
                view = (View) this.A00;
                break;
            case 3:
                ((AnonymousClass3HK) this.A00).A01.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) this.A03);
                C36421kH.A0u((View) this.A02, 8);
                View view2 = (View) this.A04;
                view2.setAlpha(0.0f);
                i = 0;
                view2.setVisibility(0);
                view = (View) this.A01;
                view.setAlpha(0.0f);
                break;
            default:
                super.onAnimationStart(animator);
                return;
        }
        view.setVisibility(i);
    }
}
