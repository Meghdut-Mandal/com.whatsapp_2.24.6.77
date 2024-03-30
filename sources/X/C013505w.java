package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: X.05w  reason: invalid class name and case insensitive filesystem */
public class C013505w extends C013405v {
    public int A00 = 0;

    public C013505w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C013505w(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super((ViewGroup.LayoutParams) marginLayoutParams);
        this.leftMargin = marginLayoutParams.leftMargin;
        this.topMargin = marginLayoutParams.topMargin;
        this.rightMargin = marginLayoutParams.rightMargin;
        this.bottomMargin = marginLayoutParams.bottomMargin;
    }

    public C013505w(C013505w r2) {
        super((C013405v) r2);
        this.A00 = r2.A00;
    }

    public C013505w(C013405v r2) {
        super(r2);
    }

    public C013505w(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public C013505w() {
        super(-2, -2);
        this.A00 = 8388627;
    }
}
