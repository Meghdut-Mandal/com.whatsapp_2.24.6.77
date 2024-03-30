package X;

import android.animation.Animator;

/* renamed from: X.6Yd  reason: invalid class name and case insensitive filesystem */
public final class C133366Yd implements Animator.AnimatorListener {
    public final /* synthetic */ C100674vP A00;
    public final /* synthetic */ AnonymousClass6MO A01;
    public final /* synthetic */ C160377ku A02;

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }

    public C133366Yd(C100674vP r1, AnonymousClass6MO r2, C160377ku r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void onAnimationEnd(Animator animator) {
        C160377ku r2 = this.A02;
        AnonymousClass6JI.A00(this.A00, this.A01, r2);
    }
}
