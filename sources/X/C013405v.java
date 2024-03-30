package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: X.05v  reason: invalid class name and case insensitive filesystem */
public class C013405v extends ViewGroup.MarginLayoutParams {
    public int A00;

    public C013405v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1MJ.A01);
        this.A00 = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public C013405v(int i, int i2, int i3) {
        super(i, -2);
        this.A00 = i3;
    }

    public C013405v(int i, int i2) {
        super(i, i2);
        this.A00 = 8388627;
    }

    public C013405v(C013405v r2) {
        super(r2);
        this.A00 = 0;
        this.A00 = r2.A00;
    }

    public C013405v(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.A00 = 0;
    }
}
