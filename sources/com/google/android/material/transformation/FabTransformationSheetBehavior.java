package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import java.util.Map;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    public Map A00;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        if ((((X.C02460Ak) r2.getLayoutParams()).A0B instanceof com.google.android.material.transformation.FabTransformationScrimBehavior) == false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0R(android.view.View r7, android.view.View r8, boolean r9, boolean r10) {
        /*
            r6 = this;
            android.view.ViewParent r5 = r8.getParent()
            boolean r0 = r5 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r0 == 0) goto L_0x005e
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r4 = r5.getChildCount()
            if (r9 == 0) goto L_0x0017
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r4)
            r6.A00 = r0
        L_0x0017:
            r3 = 0
        L_0x0018:
            if (r3 >= r4) goto L_0x0059
            android.view.View r2 = r5.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            boolean r0 = r0 instanceof X.C02460Ak
            if (r0 == 0) goto L_0x0033
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            X.0Ak r0 = (X.C02460Ak) r0
            X.0XL r0 = r0.A0B
            boolean r1 = r0 instanceof com.google.android.material.transformation.FabTransformationScrimBehavior
            r0 = 1
            if (r1 != 0) goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            if (r2 == r8) goto L_0x004d
            if (r0 != 0) goto L_0x004d
            java.util.Map r1 = r6.A00
            if (r9 != 0) goto L_0x0050
            if (r1 == 0) goto L_0x004d
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x004d
            java.util.Map r0 = r6.A00
            int r0 = X.C90474aD.A06(r2, r0)
        L_0x004a:
            X.C011504z.A06(r2, r0)
        L_0x004d:
            int r3 = r3 + 1
            goto L_0x0018
        L_0x0050:
            int r0 = r2.getImportantForAccessibility()
            X.C36421kH.A1M(r2, r1, r0)
            r0 = 4
            goto L_0x004a
        L_0x0059:
            if (r9 != 0) goto L_0x005e
            r0 = 0
            r6.A00 = r0
        L_0x005e:
            boolean r0 = super.A0R(r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationSheetBehavior.A0R(android.view.View, android.view.View, boolean, boolean):boolean");
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FabTransformationSheetBehavior() {
    }
}
