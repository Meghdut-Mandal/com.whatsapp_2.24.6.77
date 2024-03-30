package androidx.appcompat.widget;

import X.C010404j;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class ActivityChooserView$InnerLayout extends LinearLayout {
    public static final int[] A00 = {16842964};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C010404j r1 = new C010404j(context, context.obtainStyledAttributes(attributeSet, A00));
        setBackgroundDrawable(r1.A02(0));
        r1.A02.recycle();
    }
}
