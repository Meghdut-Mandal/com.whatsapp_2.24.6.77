package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.0Ac  reason: invalid class name and case insensitive filesystem */
public class C02390Ac extends ViewGroup.LayoutParams {
    public float A00 = 0.0f;
    public int A01;
    public boolean A02;
    public int A03;
    public int A04;
    public boolean A05;

    public C02390Ac(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.A0p);
        this.A03 = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }

    public C02390Ac() {
        super(-1, -1);
    }
}
