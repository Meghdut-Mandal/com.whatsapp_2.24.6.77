package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* renamed from: X.1pE  reason: invalid class name and case insensitive filesystem */
public class C38521pE extends LinearLayout implements ViewGroup.OnHierarchyChangeListener, C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;
    public int[] A02;

    public void onChildViewRemoved(View view, View view2) {
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C38521pE(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A02 = new int[4];
        setOnHierarchyChangeListener(this);
    }

    public void onChildViewAdded(View view, View view2) {
        int childCount = getChildCount();
        if (this.A02.length < childCount) {
            this.A02 = new int[childCount];
        }
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        int i3 = 1;
        if (childCount > 1 && size > 0) {
            View childAt = getChildAt(0);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(0, 0), i2);
            int size2 = View.MeasureSpec.getSize(i) - childAt.getMeasuredWidth();
            int i4 = 1;
            boolean z = false;
            int i5 = 0;
            do {
                View childAt2 = getChildAt(i4);
                C36421kH.A0w(childAt2, size2, 0, i2);
                this.A02[i4] = childAt2.getMeasuredWidth();
                i5 += this.A02[i4];
                if (((float) childAt2.getMeasuredWidth()) > ((float) size2) / ((float) (childCount - 1))) {
                    z = true;
                }
                i4++;
            } while (i4 < childCount);
            if (z) {
                do {
                    C36421kH.A0w(getChildAt(i3), (this.A02[i3] * size2) / i5, 1073741824, i2);
                    i3++;
                } while (i3 < childCount);
                setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                return;
            }
        }
        super.onMeasure(i, i2);
    }
}
