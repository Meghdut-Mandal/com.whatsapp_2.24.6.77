package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;

/* renamed from: X.4d1  reason: invalid class name and case insensitive filesystem */
public class C92034d1 extends Transition {
    public static final String[] A02 = {"circleTransition:transforms"};
    public final boolean A00;
    public final boolean A01;

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        float f;
        float f2;
        TransitionValues transitionValues3 = transitionValues;
        if (transitionValues != null) {
            TransitionValues transitionValues4 = transitionValues2;
            if (transitionValues2 != null) {
                AnonymousClass680 r2 = (AnonymousClass680) transitionValues3.values.get("circleTransition:transforms");
                AnonymousClass680 r5 = (AnonymousClass680) transitionValues4.values.get("circleTransition:transforms");
                if (!(r2 == null || r5 == null || r2.equals(r5))) {
                    float f3 = ((float) r2.A09) * r2.A04;
                    int i = r5.A09;
                    int i2 = i;
                    float f4 = (float) i;
                    float f5 = r5.A04;
                    float f6 = f4 * f5;
                    float f7 = ((float) ((-r5.A02) + r2.A02)) + ((f3 - f6) / 2.0f) + r2.A00;
                    int i3 = r5.A08;
                    int i4 = i3;
                    float f8 = (float) i3;
                    float f9 = f7 + ((f6 - (f8 * f5)) / 2.0f);
                    float f10 = (float) ((-r5.A03) + r2.A03);
                    float f11 = ((float) r2.A06) * r2.A05;
                    int i5 = r5.A06;
                    int i6 = i5;
                    float f12 = (float) i5;
                    float f13 = r5.A05;
                    float f14 = f12 * f13;
                    int i7 = r5.A07;
                    float f15 = (float) i7;
                    float f16 = f10 + ((f11 - f14) / 2.0f) + r2.A01 + ((f14 - (f15 * f13)) / 2.0f);
                    float f17 = r5.A00;
                    if (f4 / f8 < 1.0f) {
                        f = (((f6 - f8) / 2.0f) + f6) * f5;
                    } else {
                        f = 0.0f;
                    }
                    float f18 = f17 + f;
                    float f19 = r5.A01;
                    if (f12 / f15 < 1.0f) {
                        f2 = (((f14 - f15) / 2.0f) + f14) * f13;
                    } else {
                        f2 = 0.0f;
                    }
                    float f20 = f19 + f2;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(transitionValues4.view, View.TRANSLATION_X, View.TRANSLATION_Y, getPathMotion().getPath(f9, f16, f18, f20));
                    transitionValues4.view.setTranslationX(f9);
                    transitionValues4.view.setTranslationY(f16);
                    float A002 = C90524aI.A00(f11, f15, f3 / f8);
                    View view = transitionValues4.view;
                    Property property = View.SCALE_X;
                    float[] fArr = new float[2];
                    fArr[0] = A002;
                    ObjectAnimator A08 = C90524aI.A08(property, view, fArr, f6 / f8, 1);
                    View view2 = transitionValues4.view;
                    Property property2 = View.SCALE_Y;
                    float[] fArr2 = new float[2];
                    fArr2[0] = A002;
                    ObjectAnimator A082 = C90524aI.A08(property2, view2, fArr2, f14 / f15, 1);
                    float max = (float) Math.max(i2, i4);
                    float max2 = (float) Math.max(i6, i7);
                    float min = Math.min(max, max2) / 2.0f;
                    float sqrt = (float) (Math.sqrt((double) ((max * max) + (max2 * max2))) / 2.0d);
                    View view3 = transitionValues4.view;
                    int i8 = ((int) max) / 2;
                    int i9 = ((int) max2) / 2;
                    float f21 = sqrt;
                    if (this.A01) {
                        f21 = min;
                    }
                    boolean z = this.A00;
                    if (!z) {
                        min = sqrt;
                    }
                    C90564aM r22 = new C90564aM(ViewAnimationUtils.createCircularReveal(view3, i8, i9, f21, min));
                    transitionValues4.view.setAlpha(0.0f);
                    r22.addListener(new C90624aS(transitionValues4, r5, this));
                    if (z) {
                        transitionValues4.view.setOutlineProvider(new C92464e1(r5, this));
                        transitionValues4.view.setClipToOutline(true);
                        transitionValues4.view.invalidateOutline();
                    }
                    AnimatorSet A0C = C36441kJ.A0C();
                    Animator[] animatorArr = new Animator[4];
                    animatorArr[0] = ofFloat;
                    C90464aC.A1D(r22, A08, A082, animatorArr);
                    A0C.playTogether(animatorArr);
                    A0C.setInterpolator(getInterpolator());
                    return A0C;
                }
            }
        }
        return null;
    }

    public void captureEndValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            transitionValues.values.put("circleTransition:transforms", new AnonymousClass680(transitionValues.view));
        }
    }

    public void captureStartValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            transitionValues.values.put("circleTransition:transforms", new AnonymousClass680(transitionValues.view));
        }
    }

    public C92034d1(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }

    public String[] getTransitionProperties() {
        return A02;
    }
}
