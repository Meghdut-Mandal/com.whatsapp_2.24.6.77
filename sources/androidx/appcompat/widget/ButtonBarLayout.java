package androidx.appcompat.widget;

import X.AnonymousClass1MJ;
import X.C012005e;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;

public class ButtonBarLayout extends LinearLayout {
    public int A00 = -1;
    public boolean A01;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = AnonymousClass1MJ.A0A;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C012005e.A0E(context, obtainStyledAttributes, attributeSet, this, iArr, 0);
        this.A01 = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    public int getMinimumHeight() {
        return Math.max(0, super.getMinimumHeight());
    }

    public void setAllowStacking(boolean z) {
        if (this.A01 != z) {
            this.A01 = z;
            if (!z && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        int i = 80;
        if (z) {
            i = 8388613;
        }
        setGravity(i);
        View findViewById = findViewById(R.id.spacer);
        if (findViewById != null) {
            int i2 = 4;
            if (z) {
                i2 = 8;
            }
            findViewById.setVisibility(i2);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b9, code lost:
        if (r2 != false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            int r2 = android.view.View.MeasureSpec.getSize(r7)
            boolean r0 = r6.A01
            r3 = 0
            if (r0 == 0) goto L_0x0019
            int r0 = r6.A00
            if (r2 <= r0) goto L_0x0017
            int r1 = r6.getOrientation()
            r0 = 1
            if (r1 != r0) goto L_0x0017
            r6.setStacked(r3)
        L_0x0017:
            r6.A00 = r2
        L_0x0019:
            int r0 = r6.getOrientation()
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r5 = 1
            if (r0 != 0) goto L_0x00bc
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 != r0) goto L_0x00bc
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r2 = 1
        L_0x0033:
            super.onMeasure(r0, r8)
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x00b9
            int r0 = r6.getOrientation()
            if (r0 == r5) goto L_0x00b9
            int r1 = r6.getMeasuredWidthAndState()
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r0
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            if (r1 != r0) goto L_0x00b9
            r6.setStacked(r5)
        L_0x004e:
            super.onMeasure(r7, r8)
        L_0x0051:
            r4 = 0
            int r1 = r6.getChildCount()
        L_0x0056:
            if (r4 >= r1) goto L_0x00a3
            int r0 = X.AnonymousClass001.A05(r6, r4)
            if (r0 != 0) goto L_0x00b6
            if (r4 < 0) goto L_0x00a3
            android.view.View r0 = r6.getChildAt(r4)
            android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass000.A0a(r0)
            int r1 = r6.getPaddingTop()
            int r0 = r0.getMeasuredHeight()
            int r1 = r1 + r0
            int r3 = X.AnonymousClass000.A0E(r2, r1)
            int r0 = r6.getOrientation()
            if (r0 != r5) goto L_0x00b0
            int r2 = r4 + 1
            int r1 = r6.getChildCount()
        L_0x0081:
            if (r2 >= r1) goto L_0x00a3
            int r0 = X.AnonymousClass001.A05(r6, r2)
            if (r0 != 0) goto L_0x00ad
            if (r2 < 0) goto L_0x00a3
            android.view.View r0 = r6.getChildAt(r2)
            int r2 = r0.getPaddingTop()
            r1 = 1098907648(0x41800000, float:16.0)
            android.content.res.Resources r0 = r6.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r0 = r0 * r1
            int r0 = (int) r0
            int r2 = r2 + r0
            int r3 = r3 + r2
        L_0x00a3:
            int r0 = X.C011504z.A01(r6)
            if (r0 == r3) goto L_0x00ac
            r6.setMinimumHeight(r3)
        L_0x00ac:
            return
        L_0x00ad:
            int r2 = r2 + 1
            goto L_0x0081
        L_0x00b0:
            int r0 = r6.getPaddingBottom()
            int r3 = r3 + r0
            goto L_0x00a3
        L_0x00b6:
            int r4 = r4 + 1
            goto L_0x0056
        L_0x00b9:
            if (r2 == 0) goto L_0x0051
            goto L_0x004e
        L_0x00bc:
            r0 = r7
            r2 = 0
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ButtonBarLayout.onMeasure(int, int):void");
    }
}
