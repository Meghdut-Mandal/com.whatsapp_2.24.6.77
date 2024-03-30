package com.google.android.material.transformation;

import X.AnonymousClass001;
import X.AnonymousClass06I;
import X.C05520Qa;
import X.C162337oQ;
import X.C36441kJ;
import X.C90524aI;
import X.C90614aR;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    public AnimatorSet A00;

    public AnimatorSet A0S(View view, View view2, boolean z, boolean z2) {
        AnonymousClass06I r4;
        Property property;
        float[] fArr;
        FabTransformationScrimBehavior fabTransformationScrimBehavior = (FabTransformationScrimBehavior) this;
        ArrayList A0I = AnonymousClass001.A0I();
        if (z) {
            r4 = fabTransformationScrimBehavior.A01;
        } else {
            r4 = fabTransformationScrimBehavior.A00;
        }
        float f = 0.0f;
        if (z) {
            if (!z2) {
                view2.setAlpha(0.0f);
            }
            property = View.ALPHA;
            fArr = new float[1];
            f = 1.0f;
        } else {
            property = View.ALPHA;
            fArr = new float[1];
        }
        ObjectAnimator A08 = C90524aI.A08(property, view2, fArr, f, 0);
        r4.A00(A08);
        A0I.add(A08);
        AnimatorSet A0C = C36441kJ.A0C();
        C05520Qa.A00(A0C, A0I);
        A0C.addListener(new C90614aR(view2, fabTransformationScrimBehavior, z));
        return A0C;
    }

    public boolean A0R(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.A00;
        boolean z3 = false;
        if (animatorSet != null) {
            z3 = true;
            animatorSet.cancel();
        }
        AnimatorSet A0S = A0S(view, view2, z, z3);
        this.A00 = A0S;
        C162337oQ.A00(A0S, this, 8);
        this.A00.start();
        if (!z2) {
            this.A00.end();
        }
        return true;
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpandableTransformationBehavior() {
    }
}
