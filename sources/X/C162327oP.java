package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.7oP  reason: invalid class name and case insensitive filesystem */
public class C162327oP extends AnimatorListenerAdapter {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C162327oP(View view, ViewPropertyAnimator viewPropertyAnimator, C61983Eg r3, C97114oS r4, int i) {
        this.A04 = i;
        this.A00 = r4;
        this.A01 = r3;
        if (2 - i != 0) {
            this.A03 = viewPropertyAnimator;
            this.A02 = view;
        } else {
            this.A02 = viewPropertyAnimator;
            this.A03 = view;
        }
    }

    public void onAnimationCancel(Animator animator) {
        if (1 - this.A04 != 0) {
            super.onAnimationCancel(animator);
        } else {
            C90484aE.A16((View) this.A03);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002e, code lost:
        r2.remove(r0);
        r3.A0J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0091, code lost:
        r0.remove(r1);
        r2.A0J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0097, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.animation.Animator r5) {
        /*
            r4 = this;
            int r0 = r4.A04
            switch(r0) {
                case 0: goto L_0x005f;
                case 1: goto L_0x007c;
                case 2: goto L_0x0035;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r4.A03
            android.view.ViewPropertyAnimator r1 = (android.view.ViewPropertyAnimator) r1
            r0 = 0
            r1.setListener(r0)
            java.lang.Object r1 = r4.A02
            android.view.View r1 = (android.view.View) r1
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            r0 = 0
            r1.setTranslationX(r0)
            r1.setTranslationY(r0)
            java.lang.Object r3 = r4.A00
            X.4oS r3 = (X.C97114oS) r3
            java.lang.Object r1 = r4.A01
            X.3Eg r1 = (X.C61983Eg) r1
            X.0D3 r0 = r1.A04
            r3.A06(r0)
            java.util.ArrayList r2 = r3.A03
            X.0D3 r0 = r1.A04
        L_0x002e:
            r2.remove(r0)
            r3.A0J()
            return
        L_0x0035:
            java.lang.Object r1 = r4.A02
            android.view.ViewPropertyAnimator r1 = (android.view.ViewPropertyAnimator) r1
            r0 = 0
            r1.setListener(r0)
            java.lang.Object r1 = r4.A03
            android.view.View r1 = (android.view.View) r1
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            r0 = 0
            r1.setTranslationX(r0)
            r1.setTranslationY(r0)
            java.lang.Object r3 = r4.A00
            X.4oS r3 = (X.C97114oS) r3
            java.lang.Object r1 = r4.A01
            X.3Eg r1 = (X.C61983Eg) r1
            X.0D3 r0 = r1.A05
            r3.A06(r0)
            java.util.ArrayList r2 = r3.A03
            X.0D3 r0 = r1.A05
            goto L_0x002e
        L_0x005f:
            java.lang.Object r1 = r4.A01
            android.view.ViewPropertyAnimator r1 = (android.view.ViewPropertyAnimator) r1
            r0 = 0
            r1.setListener(r0)
            java.lang.Object r0 = r4.A03
            android.view.View r0 = (android.view.View) r0
            X.C90484aE.A16(r0)
            java.lang.Object r2 = r4.A00
            X.4oS r2 = (X.C97114oS) r2
            java.lang.Object r1 = r4.A02
            X.0D3 r1 = (X.AnonymousClass0D3) r1
            r2.A06(r1)
            java.util.ArrayList r0 = r2.A07
            goto L_0x0091
        L_0x007c:
            java.lang.Object r1 = r4.A01
            android.view.ViewPropertyAnimator r1 = (android.view.ViewPropertyAnimator) r1
            r0 = 0
            r1.setListener(r0)
            java.lang.Object r2 = r4.A00
            X.4oS r2 = (X.C97114oS) r2
            java.lang.Object r1 = r4.A02
            X.0D3 r1 = (X.AnonymousClass0D3) r1
            r2.A06(r1)
            java.util.ArrayList r0 = r2.A01
        L_0x0091:
            r0.remove(r1)
            r2.A0J()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162327oP.onAnimationEnd(android.animation.Animator):void");
    }

    public void onAnimationStart(Animator animator) {
        ((C97114oS) this.A00).A08 = true;
    }

    public C162327oP(View view, ViewPropertyAnimator viewPropertyAnimator, AnonymousClass0D3 r3, C97114oS r4, int i) {
        this.A04 = i;
        this.A00 = r4;
        this.A02 = r3;
        if (i != 0) {
            this.A03 = view;
            this.A01 = viewPropertyAnimator;
        } else {
            this.A01 = viewPropertyAnimator;
            this.A03 = view;
        }
    }
}
