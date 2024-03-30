package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: X.0sW  reason: invalid class name and case insensitive filesystem */
public class C18040sW extends AnimatorListenerAdapter {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C18040sW(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj3;
        this.A02 = obj;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.A03 != 0) {
            super.onAnimationCancel(animator);
        } else {
            ((C17190qs) this.A01).BR6((View) this.A02);
        }
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A03 != 0) {
            C07460Xt r2 = (C07460Xt) this.A01;
            r2.A00.A08(1.0f);
            AnonymousClass0Gz.A03((View) this.A02, r2);
            return;
        }
        ((C17190qs) this.A01).BR7((View) this.A02);
    }

    public void onAnimationStart(Animator animator) {
        if (this.A03 != 0) {
            super.onAnimationStart(animator);
        } else {
            ((C17190qs) this.A01).BR9((View) this.A02);
        }
    }
}
