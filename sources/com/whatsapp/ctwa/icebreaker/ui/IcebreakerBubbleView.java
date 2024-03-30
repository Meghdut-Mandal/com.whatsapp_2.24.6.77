package com.whatsapp.ctwa.icebreaker.ui;

import X.C36441kJ;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.R;

public class IcebreakerBubbleView extends FrameLayout {
    private void A00() {
        setBackgroundResource(R.drawable.floating_spam_banner_background);
        int A05 = C36441kJ.A05(getResources(), R.dimen.f7nameremoved);
        setPadding(A05, A05, A05, 0);
    }

    public IcebreakerBubbleView(Context context) {
        super(context);
    }

    public IcebreakerBubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public IcebreakerBubbleView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
    }

    public IcebreakerBubbleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
