package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;

/* renamed from: X.0Ey  reason: invalid class name */
public class AnonymousClass0Ey extends LinearLayout.LayoutParams {
    public int A00 = 1;
    public Interpolator A01;
    public C06110Si A02;

    public AnonymousClass0Ey(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C06110Si r0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C27931Qk.A01);
        this.A00 = obtainStyledAttributes.getInt(1, 0);
        if (obtainStyledAttributes.getInt(0, 0) != 1) {
            r0 = null;
        } else {
            r0 = new C06110Si();
        }
        this.A02 = r0;
        if (obtainStyledAttributes.hasValue(2)) {
            this.A01 = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public AnonymousClass0Ey(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public AnonymousClass0Ey(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public AnonymousClass0Ey(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public AnonymousClass0Ey() {
        super(-1, -2);
    }
}
