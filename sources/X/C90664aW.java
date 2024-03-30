package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.4aW  reason: invalid class name and case insensitive filesystem */
public final class C90664aW extends AnimatorListenerAdapter {
    public final long A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C90554aL A02;

    public void onAnimationCancel(Animator animator) {
        AnonymousClass00C.A0D(animator, 0);
        C90554aL r5 = this.A02;
        if (r5.A00 == 0 && animator.getStartDelay() != 0) {
            animator.setStartDelay(this.A00);
        }
        r5.A00 = 0;
        r5.A01 = true;
        C90554aL.A00(r5, new C154267Rn(r5));
    }

    public void onAnimationEnd(Animator animator) {
        int i;
        AnonymousClass00C.A0D(animator, 0);
        C90554aL r5 = this.A02;
        if (r5.A00 == 0 && animator.getStartDelay() != 0) {
            animator.setStartDelay(this.A00);
        }
        int i2 = r5.A00 + 1;
        r5.A00 = i2;
        if (r5.A01 || ((i = this.A01) != -1 && i2 >= i)) {
            r5.A00 = 0;
            r5.A01 = false;
            C90554aL.A00(r5, new C154277Ro(r5));
            return;
        }
        animator.start();
    }

    public C90664aW(C90554aL r3, int i) {
        this.A02 = r3;
        this.A01 = i;
        this.A00 = r3.A05.getStartDelay();
    }

    public void onAnimationStart(Animator animator) {
        C90554aL r1 = this.A02;
        if (r1.A00 == 0) {
            C90554aL.A00(r1, new C154287Rp(r1));
        }
    }
}
