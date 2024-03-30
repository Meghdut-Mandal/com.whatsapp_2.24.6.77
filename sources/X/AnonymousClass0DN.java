package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.0DN  reason: invalid class name */
public class AnonymousClass0DN extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ ViewPropertyAnimator A03;
    public final /* synthetic */ AnonymousClass0C0 A04;
    public final /* synthetic */ AnonymousClass0D3 A05;

    public AnonymousClass0DN(View view, ViewPropertyAnimator viewPropertyAnimator, AnonymousClass0C0 r3, AnonymousClass0D3 r4, int i, int i2) {
        this.A04 = r3;
        this.A05 = r4;
        this.A00 = i;
        this.A02 = view;
        this.A01 = i2;
        this.A03 = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.A00 != 0) {
            this.A02.setTranslationX(0.0f);
        }
        if (this.A01 != 0) {
            this.A02.setTranslationY(0.0f);
        }
    }

    public void onAnimationEnd(Animator animator) {
        this.A03.setListener((Animator.AnimatorListener) null);
        AnonymousClass0C0 r2 = this.A04;
        AnonymousClass0D3 r1 = this.A05;
        r2.A06(r1);
        r2.A05.remove(r1);
        if (!r2.A0D()) {
            r2.A05();
        }
    }

    public void onAnimationStart(Animator animator) {
    }
}
