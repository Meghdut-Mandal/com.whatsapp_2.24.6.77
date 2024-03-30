package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.0DL  reason: invalid class name */
public class AnonymousClass0DL extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewPropertyAnimator A01;
    public final /* synthetic */ AnonymousClass0C0 A02;
    public final /* synthetic */ AnonymousClass0D3 A03;

    public AnonymousClass0DL(View view, ViewPropertyAnimator viewPropertyAnimator, AnonymousClass0C0 r3, AnonymousClass0D3 r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = viewPropertyAnimator;
        this.A00 = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.A01.setListener((Animator.AnimatorListener) null);
        this.A00.setAlpha(1.0f);
        AnonymousClass0C0 r2 = this.A02;
        AnonymousClass0D3 r1 = this.A03;
        r2.A06(r1);
        r2.A06.remove(r1);
        if (!r2.A0D()) {
            r2.A05();
        }
    }

    public void onAnimationStart(Animator animator) {
    }
}
