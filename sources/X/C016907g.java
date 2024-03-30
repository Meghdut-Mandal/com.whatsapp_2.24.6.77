package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.07g  reason: invalid class name and case insensitive filesystem */
public class C016907g extends C016807f {
    public boolean A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final List A05 = new ArrayList();

    public AnonymousClass081 A03(Context context) {
        return new AnonymousClass082(context);
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        C016307a r0 = this.A0G;
        int size = View.MeasureSpec.getSize(i);
        int size2 = r0.A04().size();
        int childCount = getChildCount();
        List list = this.A05;
        list.clear();
        int size3 = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int i5 = this.A09;
        boolean z = true;
        if (i5 != -1 ? i5 != 0 : size2 <= 3) {
            z = false;
        }
        int i6 = 1;
        if (!z || !this.A00) {
            if (size2 != 0) {
                i6 = size2;
            }
            int min = Math.min(size / i6, this.A01);
            int i7 = size - (size2 * min);
            for (int i8 = 0; i8 < childCount; i8++) {
                if (getChildAt(i8).getVisibility() != 8) {
                    i3 = min;
                    if (i7 > 0) {
                        i3 = min + 1;
                        i7--;
                    }
                } else {
                    i3 = 0;
                }
                list.add(Integer.valueOf(i3));
            }
        } else {
            View childAt = getChildAt(this.A0B);
            int i9 = this.A02;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.A01, Integer.MIN_VALUE), makeMeasureSpec);
                i9 = Math.max(i9, childAt.getMeasuredWidth());
            }
            int i10 = 0;
            if (childAt.getVisibility() != 8) {
                i10 = 1;
            }
            int i11 = size2 - i10;
            int min2 = Math.min(size - (this.A04 * i11), Math.min(i9, this.A01));
            int i12 = size - min2;
            if (i11 != 0) {
                i6 = i11;
            }
            int min3 = Math.min(i12 / i6, this.A03);
            int i13 = i12 - (i11 * min3);
            for (int i14 = 0; i14 < childCount; i14++) {
                if (getChildAt(i14).getVisibility() != 8) {
                    i4 = min3;
                    if (i14 == this.A0B) {
                        i4 = min2;
                    }
                    if (i13 > 0) {
                        i4++;
                        i13--;
                    }
                } else {
                    i4 = 0;
                }
                list.add(Integer.valueOf(i4));
            }
        }
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Number) list.get(i16)).intValue(), 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i15 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(i15, size3);
    }

    public C016907g(Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.A03 = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A04 = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A01 = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A02 = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (AnonymousClass04F.A01(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.A00 = z;
    }
}
