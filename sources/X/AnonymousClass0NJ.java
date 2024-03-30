package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.0NJ  reason: invalid class name */
public class AnonymousClass0NJ extends C016807f {
    public int A00 = -1;
    public final FrameLayout.LayoutParams A01;

    private int A00(View view, int i, int i2, int i3) {
        int measuredHeight;
        int i4;
        if (view == null) {
            int max = i2 / Math.max(1, i3);
            int i5 = this.A00;
            if (i5 == -1) {
                i5 = View.MeasureSpec.getSize(i);
            }
            measuredHeight = Math.min(i5, max);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 0);
        int childCount = getChildCount();
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt != view) {
                if (childAt.getVisibility() != 8) {
                    childAt.measure(i, makeMeasureSpec);
                    i4 = childAt.getMeasuredHeight();
                } else {
                    i4 = 0;
                }
                i6 += i4;
            }
        }
        return i6;
    }

    public AnonymousClass081 A03(Context context) {
        return new AnonymousClass0NI(context);
    }

    public int getMenuGravity() {
        return this.A01.gravity;
    }

    public void setItemMinimumHeight(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            requestLayout();
        }
    }

    public void setMenuGravity(int i) {
        FrameLayout.LayoutParams layoutParams = this.A01;
        if (layoutParams.gravity != i) {
            layoutParams.gravity = i;
            setLayoutParams(layoutParams);
        }
    }

    public AnonymousClass0NJ(Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.A01 = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i6;
                childAt.layout(0, i6, i5, measuredHeight);
                i6 = measuredHeight;
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int A002;
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = this.A0G.A04().size();
        if (size2 <= 1 || ((i3 = this.A09) != -1 ? i3 != 0 : size2 <= 3)) {
            A002 = A00((View) null, i, size, size2);
        } else {
            View childAt = getChildAt(this.A0B);
            if (childAt != null) {
                int max = size / Math.max(1, size2);
                int i5 = this.A00;
                if (i5 == -1) {
                    i5 = View.MeasureSpec.getSize(i);
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i5, max), 0);
                if (childAt.getVisibility() != 8) {
                    childAt.measure(i, makeMeasureSpec);
                    i4 = childAt.getMeasuredHeight();
                } else {
                    i4 = 0;
                }
                size -= i4;
                size2--;
            } else {
                i4 = 0;
            }
            A002 = i4 + A00(childAt, i, size, size2);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.resolveSizeAndState(A002, i2, 0));
    }

    public int getItemMinimumHeight() {
        return this.A00;
    }
}
