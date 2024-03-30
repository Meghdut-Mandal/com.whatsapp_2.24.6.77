package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.4aX  reason: invalid class name and case insensitive filesystem */
public class C90674aX extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ ViewPropertyAnimator A03;
    public final /* synthetic */ AnonymousClass0D3 A04;
    public final /* synthetic */ C97114oS A05;

    public C90674aX(View view, ViewPropertyAnimator viewPropertyAnimator, AnonymousClass0D3 r3, C97114oS r4, int i, int i2) {
        this.A05 = r4;
        this.A04 = r3;
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
        C97114oS r2 = this.A05;
        AnonymousClass0D3 r1 = this.A04;
        r2.A06(r1);
        r2.A05.remove(r1);
        r2.A0J();
    }

    public void onAnimationStart(Animator animator) {
        this.A05.A08 = true;
    }
}
