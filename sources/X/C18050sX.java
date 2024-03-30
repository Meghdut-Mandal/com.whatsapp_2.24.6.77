package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: X.0sX  reason: invalid class name and case insensitive filesystem */
public class C18050sX extends AnimatorListenerAdapter {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C18050sX(View view, ViewPropertyAnimator viewPropertyAnimator, AnonymousClass0C0 r4, AnonymousClass0D3 r5) {
        this.A04 = 0;
        this.A00 = r4;
        this.A02 = r5;
        this.A03 = view;
        this.A01 = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.A04 != 0) {
            super.onAnimationCancel(animator);
        } else {
            ((View) this.A03).setAlpha(1.0f);
        }
    }

    public void onAnimationEnd(Animator animator) {
        AnonymousClass0C0 r3;
        ArrayList arrayList;
        AnonymousClass0D3 r0;
        switch (this.A04) {
            case 0:
                ((ViewPropertyAnimator) this.A01).setListener((Animator.AnimatorListener) null);
                AnonymousClass0C0 r2 = (AnonymousClass0C0) this.A00;
                AnonymousClass0D3 r1 = (AnonymousClass0D3) this.A02;
                r2.A06(r1);
                r2.A03.remove(r1);
                if (!r2.A0D()) {
                    r2.A05();
                    return;
                }
                return;
            case 1:
                ((ViewPropertyAnimator) this.A02).setListener((Animator.AnimatorListener) null);
                View view = (View) this.A03;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                r3 = (AnonymousClass0C0) this.A00;
                AnonymousClass0U5 r12 = (AnonymousClass0U5) this.A01;
                r3.A06(r12.A05);
                arrayList = r3.A04;
                r0 = r12.A05;
                break;
            default:
                ((ViewPropertyAnimator) this.A03).setListener((Animator.AnimatorListener) null);
                View view2 = (View) this.A02;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                r3 = (AnonymousClass0C0) this.A00;
                AnonymousClass0U5 r13 = (AnonymousClass0U5) this.A01;
                r3.A06(r13.A04);
                arrayList = r3.A04;
                r0 = r13.A04;
                break;
        }
        arrayList.remove(r0);
        if (!r3.A0D()) {
            r3.A05();
        }
    }

    public void onAnimationStart(Animator animator) {
    }

    public C18050sX(View view, ViewPropertyAnimator viewPropertyAnimator, AnonymousClass0U5 r3, AnonymousClass0C0 r4, int i) {
        this.A04 = i;
        this.A00 = r4;
        this.A01 = r3;
        if (1 - i != 0) {
            this.A03 = viewPropertyAnimator;
            this.A02 = view;
        } else {
            this.A02 = viewPropertyAnimator;
            this.A03 = view;
        }
    }
}
