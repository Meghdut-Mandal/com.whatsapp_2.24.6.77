package androidx.constraintlayout.widget;

import X.AnonymousClass0BJ;
import X.AnonymousClass0BM;
import X.C02500Aq;
import android.content.Context;
import android.util.AttributeSet;

public class Group extends AnonymousClass0BM {
    public void A08(ConstraintLayout constraintLayout) {
        C02500Aq r1 = ((AnonymousClass0BJ) getLayoutParams()).A0s;
        r1.A09(0);
        r1.A08(0);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        A05();
    }

    public void setElevation(float f) {
        super.setElevation(f);
        A05();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        A05();
    }

    public void A06(AttributeSet attributeSet) {
        super.A06(attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public Group(Context context) {
        super(context);
    }
}
