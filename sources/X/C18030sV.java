package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.0sV  reason: invalid class name and case insensitive filesystem */
public class C18030sV extends AnimatorListenerAdapter {
    public int A00;
    public Object A01;
    public final int A02;

    public C18030sV(AnonymousClass6YL r1, int i, int i2) {
        this.A02 = i2;
        this.A01 = r1;
        this.A00 = i;
    }

    public void onAnimationEnd(Animator animator) {
        ((AnonymousClass6YL) this.A01).A0S(this.A00);
    }

    public void onAnimationStart(Animator animator) {
        if (1 - this.A02 != 0) {
            super.onAnimationStart(animator);
            return;
        }
        AnonymousClass6YL r0 = (AnonymousClass6YL) this.A01;
        r0.A0K.B0y(0, r0.A0B);
    }
}
