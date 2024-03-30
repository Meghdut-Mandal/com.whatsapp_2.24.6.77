package X;

import android.content.Context;
import android.widget.LinearLayout;

/* renamed from: X.1ot  reason: invalid class name and case insensitive filesystem */
public abstract class C38461ot extends LinearLayout {
    public final void A01(int i, int i2, boolean z) {
        int i3 = 0;
        C36331k8.A0x(this);
        int i4 = i - i2;
        if (getMeasuredWidth() > i4) {
            float measuredWidth = ((float) i4) / ((float) getMeasuredWidth());
            if (z) {
                i3 = i + i2;
            }
            setPivotX((float) i3);
            setPivotY((float) getMeasuredHeight());
            setScaleX(measuredWidth);
            setScaleY(measuredWidth);
        }
    }

    public C38461ot(Context context) {
        super(context);
    }
}
