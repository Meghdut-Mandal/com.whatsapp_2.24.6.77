package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.0El  reason: invalid class name and case insensitive filesystem */
public class C03400El extends FrameLayout.LayoutParams {
    public int A00 = 0;
    public float A01 = 0.5f;

    public C03400El(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C27931Qk.A0A);
        this.A00 = obtainStyledAttributes.getInt(0, 0);
        this.A01 = obtainStyledAttributes.getFloat(1, 0.5f);
        obtainStyledAttributes.recycle();
    }

    public C03400El(int i, int i2) {
        super(i, i2);
    }

    public C03400El(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
