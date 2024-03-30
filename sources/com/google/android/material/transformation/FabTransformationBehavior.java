package com.google.android.material.transformation;

import X.AnonymousClass001;
import X.AnonymousClass060;
import X.AnonymousClass064;
import X.AnonymousClass06H;
import X.AnonymousClass06I;
import X.C02460Ak;
import X.C115085iJ;
import X.C36441kJ;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public float A00;
    public float A01;
    public final Rect A02 = AnonymousClass001.A06();
    public final RectF A03 = C36441kJ.A0N();
    public final RectF A04 = C36441kJ.A0N();
    public final int[] A05 = C36441kJ.A1O();

    public static Pair A01(C115085iJ r3, float f, float f2, boolean z) {
        AnonymousClass06I A032;
        AnonymousClass06H r1;
        String str;
        int i;
        if (f == 0.0f || f2 == 0.0f) {
            A032 = r3.A00.A03("translationXLinear");
            r1 = r3.A00;
            str = "translationYLinear";
        } else if (!z ? i <= 0 : f2 >= 0.0f) {
            A032 = r3.A00.A03("translationXCurveDownwards");
            r1 = r3.A00;
            str = "translationYCurveDownwards";
        } else {
            A032 = r3.A00.A03("translationXCurveUpwards");
            r1 = r3.A00;
            str = "translationYCurveUpwards";
        }
        return C36441kJ.A0Q(A032, r1.A03(str));
    }

    public static float A00(AnonymousClass06I r8, C115085iJ r9, float f) {
        long j = r8.A02;
        long j2 = r8.A03;
        AnonymousClass06I A032 = r9.A00.A03("expansion");
        float f2 = ((float) (((A032.A02 + A032.A03) + 17) - j)) / ((float) j2);
        TimeInterpolator timeInterpolator = r8.A04;
        if (timeInterpolator == null) {
            timeInterpolator = AnonymousClass064.A02;
        }
        float interpolation = timeInterpolator.getInterpolation(f2);
        TimeInterpolator timeInterpolator2 = AnonymousClass064.A02;
        return f + (interpolation * (0.0f - f));
    }

    public void A0K(C02460Ak r2) {
        if (r2.A02 == 0) {
            r2.A02 = 80;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0166, code lost:
        if ((r5 instanceof android.view.ViewGroup) != false) goto L_0x0168;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.AnimatorSet A0S(android.view.View r20, android.view.View r21, boolean r22, boolean r23) {
        /*
            r19 = this;
            r13 = r21
            android.content.Context r1 = r13.getContext()
            r0 = 2130837535(0x7f02001f, float:1.7280027E38)
            r12 = r22
            if (r22 == 0) goto L_0x0010
            r0 = 2130837536(0x7f020020, float:1.7280029E38)
        L_0x0010:
            X.5iJ r11 = new X.5iJ
            r11.<init>()
            X.06H r0 = X.AnonymousClass06H.A00(r1, r0)
            r11.A00 = r0
            r10 = r19
            r14 = r20
            if (r22 == 0) goto L_0x002d
            float r0 = r14.getTranslationX()
            r10.A00 = r0
            float r0 = r14.getTranslationY()
            r10.A01 = r0
        L_0x002d:
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            java.util.ArrayList r18 = X.AnonymousClass001.A0I()
            float r4 = X.C011004s.A00(r13)
            float r0 = X.C011004s.A00(r14)
            float r4 = r4 - r0
            r3 = 0
            r1 = 1
            if (r22 == 0) goto L_0x01d0
            if (r23 != 0) goto L_0x0048
            float r0 = -r4
            r13.setTranslationZ(r0)
        L_0x0048:
            android.util.Property r2 = android.view.View.TRANSLATION_Z
            float[] r1 = new float[r1]
            r0 = 0
        L_0x004d:
            android.animation.ObjectAnimator r2 = X.C90524aI.A08(r2, r13, r1, r0, r3)
            X.06H r1 = r11.A00
            java.lang.String r0 = "elevation"
            X.06I r0 = r1.A03(r0)
            r0.A00(r2)
            r9.add(r2)
            android.graphics.RectF r8 = r10.A03
            android.graphics.RectF r7 = r10.A04
            r10.A02(r8, r14)
            float r1 = r10.A00
            float r0 = r10.A01
            r8.offset(r1, r0)
            r10.A02(r7, r13)
            float r6 = r7.centerX()
            float r0 = r8.centerX()
            float r6 = r6 - r0
            r0 = 0
            float r6 = r6 + r0
            r10.A02(r8, r14)
            float r1 = r10.A00
            float r0 = r10.A01
            r8.offset(r1, r0)
            r10.A02(r7, r13)
            float r5 = r7.centerY()
            float r0 = r8.centerY()
            float r5 = r5 - r0
            r4 = 0
            float r5 = r5 + r4
            android.util.Pair r1 = A01(r11, r6, r5, r12)
            java.lang.Object r0 = r1.first
            r17 = r0
            r0 = r17
            X.06I r0 = (X.AnonymousClass06I) r0
            r17 = r0
            java.lang.Object r15 = r1.second
            X.06I r15 = (X.AnonymousClass06I) r15
            r2 = 1
            if (r22 == 0) goto L_0x01bc
            if (r23 != 0) goto L_0x00b2
            float r0 = -r6
            r13.setTranslationX(r0)
            float r0 = -r5
            r13.setTranslationY(r0)
        L_0x00b2:
            android.util.Property r1 = android.view.View.TRANSLATION_X
            float[] r0 = new float[r2]
            android.animation.ObjectAnimator r16 = X.C90524aI.A08(r1, r13, r0, r4, r3)
            android.util.Property r0 = android.view.View.TRANSLATION_Y
            float[] r1 = new float[r2]
            android.animation.ObjectAnimator r1 = X.C90524aI.A08(r0, r13, r1, r4, r3)
            float r2 = -r6
            float r5 = -r5
            r0 = r17
            float r6 = A00(r0, r11, r2)
            float r2 = A00(r15, r11, r5)
            android.graphics.Rect r0 = r10.A02
            r13.getWindowVisibleDisplayFrame(r0)
            r8.set(r0)
            r10.A02(r7, r13)
            r7.offset(r6, r2)
            r7.intersect(r8)
            r8.set(r7)
        L_0x00e2:
            r2 = r16
            r0 = r17
            r0.A00(r2)
            r15.A00(r1)
            r9.add(r2)
            r9.add(r1)
            r8.width()
            r8.height()
            r10.A02(r8, r14)
            float r1 = r10.A00
            float r0 = r10.A01
            r8.offset(r1, r0)
            r10.A02(r7, r13)
            float r0 = r7.centerX()
            float r1 = r8.centerX()
            float r0 = r0 - r1
            float r0 = r0 + r4
            r10.A02(r8, r14)
            float r2 = r10.A00
            float r1 = r10.A01
            r8.offset(r2, r1)
            r10.A02(r7, r13)
            float r7 = r7.centerY()
            float r1 = r8.centerY()
            float r7 = r7 - r1
            float r7 = r7 + r4
            android.util.Pair r1 = A01(r11, r0, r7, r12)
            java.lang.Object r5 = r1.first
            X.06I r5 = (X.AnonymousClass06I) r5
            java.lang.Object r2 = r1.second
            X.06I r2 = (X.AnonymousClass06I) r2
            android.util.Property r8 = android.view.View.TRANSLATION_X
            r6 = 1
            float[] r1 = new float[r6]
            if (r22 != 0) goto L_0x013b
            float r0 = r10.A00
        L_0x013b:
            android.animation.ObjectAnimator r1 = X.C90524aI.A08(r8, r14, r1, r0, r3)
            android.util.Property r8 = android.view.View.TRANSLATION_Y
            float[] r0 = new float[r6]
            if (r22 != 0) goto L_0x0147
            float r7 = r10.A01
        L_0x0147:
            android.animation.ObjectAnimator r0 = X.C90524aI.A08(r8, r14, r0, r7, r3)
            r5.A00(r1)
            r2.A00(r0)
            r9.add(r1)
            r9.add(r0)
            boolean r0 = r13 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x018d
            r0 = 2131431815(0x7f0b1187, float:1.848537E38)
            android.view.View r5 = r13.findViewById(r0)
            if (r5 == 0) goto L_0x01ba
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x018d
        L_0x0168:
            if (r22 == 0) goto L_0x01b1
            if (r23 != 0) goto L_0x0175
            android.util.Property r1 = X.AnonymousClass0EC.A00
            java.lang.Float r0 = java.lang.Float.valueOf(r4)
            r1.set(r5, r0)
        L_0x0175:
            android.util.Property r2 = X.AnonymousClass0EC.A00
            float[] r1 = new float[r6]
            r0 = 1065353216(0x3f800000, float:1.0)
            android.animation.ObjectAnimator r2 = X.C90524aI.A08(r2, r5, r1, r0, r3)
        L_0x017f:
            X.06H r1 = r11.A00
            java.lang.String r0 = "contentFade"
            X.06I r0 = r1.A03(r0)
            r0.A00(r2)
            r9.add(r2)
        L_0x018d:
            android.animation.AnimatorSet r3 = X.C36441kJ.A0C()
            X.C05520Qa.A00(r3, r9)
            X.7oM r0 = new X.7oM
            r0.<init>(r13, r14, r10, r12)
            r3.addListener(r0)
            r2 = 0
            int r1 = r18.size()
        L_0x01a1:
            if (r2 >= r1) goto L_0x01d7
            r0 = r18
            java.lang.Object r0 = r0.get(r2)
            android.animation.Animator$AnimatorListener r0 = (android.animation.Animator.AnimatorListener) r0
            r3.addListener(r0)
            int r2 = r2 + 1
            goto L_0x01a1
        L_0x01b1:
            android.util.Property r1 = X.AnonymousClass0EC.A00
            float[] r0 = new float[r6]
            android.animation.ObjectAnimator r2 = X.C90524aI.A08(r1, r5, r0, r4, r3)
            goto L_0x017f
        L_0x01ba:
            r5 = r13
            goto L_0x0168
        L_0x01bc:
            android.util.Property r1 = android.view.View.TRANSLATION_X
            float[] r0 = new float[r2]
            float r6 = -r6
            android.animation.ObjectAnimator r16 = X.C90524aI.A08(r1, r13, r0, r6, r3)
            android.util.Property r1 = android.view.View.TRANSLATION_Y
            float[] r2 = new float[r2]
            float r0 = -r5
            android.animation.ObjectAnimator r1 = X.C90524aI.A08(r1, r13, r2, r0, r3)
            goto L_0x00e2
        L_0x01d0:
            android.util.Property r2 = android.view.View.TRANSLATION_Z
            float[] r1 = new float[r1]
            float r0 = -r4
            goto L_0x004d
        L_0x01d7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.A0S(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void A02(RectF rectF, View view) {
        rectF.set(0.0f, 0.0f, C36441kJ.A01(view), C36441kJ.A02(view));
        int[] iArr = this.A05;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    public boolean A0D(View view, View view2, CoordinatorLayout coordinatorLayout) {
        if (view.getVisibility() == 8) {
            throw AnonymousClass001.A09("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof AnonymousClass060)) {
            return false;
        } else {
            int i = ((AnonymousClass060) view2).A0D.A00;
            if (i == 0 || i == view.getId()) {
                return true;
            }
            return false;
        }
    }

    public FabTransformationBehavior() {
    }
}
