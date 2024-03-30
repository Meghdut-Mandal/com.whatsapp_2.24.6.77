package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.3Rm  reason: invalid class name and case insensitive filesystem */
public final class C65293Rm {
    public static int A09;
    public static WeakReference A0A;
    public ValueAnimator A00;
    public final C29731Xt A01;
    public final AnonymousClass1UM A02;
    public final C63623Kt A03;
    public final C107635Qg A04;
    public final AnonymousClass005 A05;
    public final AnonymousClass005 A06;
    public final AnonymousClass005 A07;
    public final AnonymousClass00T A08 = C36431kI.A1I(new C84714Eh(this));

    public static final void A01(C65293Rm r1) {
        ValueAnimator valueAnimator = r1.A00;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = r1.A00;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator3 = r1.A00;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
    }

    public C65293Rm(C29731Xt r2, AnonymousClass1UM r3, C63623Kt r4, C107635Qg r5, AnonymousClass005 r6, AnonymousClass005 r7, AnonymousClass005 r8) {
        C36321k7.A1B(r6, r4, r7, r8, r5);
        C36321k7.A10(r2, r3);
        this.A07 = r6;
        this.A03 = r4;
        this.A05 = r7;
        this.A06 = r8;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
    }

    public static final void A00(Animator.AnimatorListener animatorListener, View view, C65293Rm r5, int i, int i2, boolean z) {
        long j;
        A01(r5);
        int[] A1O = C36441kJ.A1O();
        A1O[0] = i;
        ValueAnimator A0C = C36411kG.A0C(A1O, i2);
        r5.A00 = A0C;
        if (A0C != null) {
            C36381kD.A14(A0C, 400);
            A0C.addListener(animatorListener);
            C53562rW.A00(A0C, view, 21);
            if (z) {
                j = 1400;
            } else {
                j = 0;
            }
            A0C.setStartDelay(j);
            A0C.start();
        }
    }
}
