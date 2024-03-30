package com.whatsapp.components;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.WaLinearLayout;

public class MaxHeightLinearLayout extends WaLinearLayout {
    public boolean A00;
    public int A01;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r0 != 1073741824) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.A01
            if (r0 <= 0) goto L_0x0016
            int r2 = android.view.View.MeasureSpec.getSize(r5)
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x001d
            if (r0 == 0) goto L_0x001a
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x001d
        L_0x0016:
            super.onMeasure(r4, r5)
            return
        L_0x001a:
            int r0 = r3.A01
            goto L_0x0023
        L_0x001d:
            int r0 = r3.A01
            int r0 = java.lang.Math.min(r2, r0)
        L_0x0023:
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.components.MaxHeightLinearLayout.onMeasure(int, int):void");
    }

    public void setMaxHeight(int i) {
        if (this.A01 != i) {
            this.A01 = i;
            requestLayout();
        }
    }

    public MaxHeightLinearLayout(Context context) {
        super(context);
        A01();
    }

    public MaxHeightLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }

    public MaxHeightLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A01();
    }

    public MaxHeightLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }
}
