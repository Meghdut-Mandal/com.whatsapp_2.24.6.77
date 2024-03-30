package com.whatsapp;

import X.AnonymousClass1QZ;
import X.C18700tb;
import X.C36441kJ;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;

public class EnhancedConstraintLayoutGroup extends Group implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public EnhancedConstraintLayoutGroup(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public void A09(ConstraintLayout constraintLayout) {
        super.A09(constraintLayout);
        for (int findViewById : getReferencedIds()) {
            constraintLayout.findViewById(findViewById).setAlpha(getAlpha());
        }
    }

    public void setAlpha(float f) {
        super.setAlpha(f);
        A05();
    }

    public EnhancedConstraintLayoutGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public EnhancedConstraintLayoutGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public EnhancedConstraintLayoutGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }
}
