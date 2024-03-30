package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: X.4VD  reason: invalid class name */
public class AnonymousClass4VD extends AnimatorListenerAdapter {
    public float A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4VD(Object obj, float f, int i) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = f;
    }

    public void onAnimationCancel(Animator animator) {
        int i = this.A02;
        Object obj = this.A01;
        switch (i) {
            case 0:
                ((View) obj).setX(this.A00);
                return;
            case 1:
                ((AnonymousClass4UC) obj).setBackgroundScale(this.A00);
                return;
            default:
                ((AnonymousClass4UC) obj).setForegroundScale(this.A00);
                return;
        }
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A02 != 0) {
            super.onAnimationEnd(animator);
        } else {
            ((View) this.A01).setX(this.A00);
        }
    }
}
