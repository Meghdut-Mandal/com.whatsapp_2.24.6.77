package com.whatsapp.components;

import X.AnonymousClass1QZ;
import X.C162337oQ;
import X.C18700tb;
import X.C36441kJ;
import X.C90524aI;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

public class AnimatingArrowsLayout extends LinearLayout implements C18700tb {
    public List A00;
    public AnonymousClass1QZ A01;
    public boolean A02;
    public final AnimatorSet A03;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A01;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public AnimatingArrowsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A03.start();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.A03;
        animatorSet.removeAllListeners();
        animatorSet.end();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        View[] viewArr = new View[4];
        int i = 0;
        viewArr[0] = getChildAt(3);
        viewArr[1] = getChildAt(2);
        viewArr[2] = getChildAt(1);
        this.A00 = C90524aI.A0p(getChildAt(0), viewArr, 3);
        ArrayList A14 = C36441kJ.A14(4);
        do {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A00.get(i), "alpha", new float[]{0.0f, 0.6f, 0.0f});
            ofFloat.setDuration(750);
            ofFloat.setStartDelay((long) (i * 100));
            A14.add(ofFloat);
            i++;
        } while (i < 4);
        AnimatorSet animatorSet = this.A03;
        animatorSet.playTogether(A14);
        C162337oQ.A00(animatorSet, this, 19);
        animatorSet.start();
    }

    public AnimatingArrowsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        this.A03 = C36441kJ.A0C();
    }

    public AnimatingArrowsLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
