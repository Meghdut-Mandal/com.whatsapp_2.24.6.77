package com.whatsapp.gallerypicker;

import X.C1030953q;
import X.C138736ic;
import X.C158267ge;
import android.content.Context;
import android.util.AttributeSet;

public class PhotoViewPager extends C1030953q {
    public C158267ge A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        if (r0 > 1) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r0 > 1) goto L_0x001a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006b A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            X.7ge r2 = r9.A00
            r3 = 0
            if (r2 == 0) goto L_0x0093
            float r1 = r9.A01
            float r0 = r9.A02
            int r1 = r2.BjF(r1, r0)
        L_0x000d:
            int r0 = r10.getPointerCount()
            r8 = 3
            r7 = 1
            if (r1 == r8) goto L_0x001a
            if (r1 == r7) goto L_0x001a
            r6 = 0
            if (r0 <= r7) goto L_0x001b
        L_0x001a:
            r6 = 1
        L_0x001b:
            r5 = 2
            if (r1 == r8) goto L_0x0023
            if (r1 == r5) goto L_0x0023
            r4 = 0
            if (r0 <= r7) goto L_0x0024
        L_0x0023:
            r4 = 1
        L_0x0024:
            int r0 = r10.getAction()
            r2 = r0 & 255(0xff, float:3.57E-43)
            r1 = -1
            if (r2 == r8) goto L_0x004e
            if (r2 == r7) goto L_0x004e
            if (r2 != 0) goto L_0x0050
            float r0 = r10.getX()
            r9.A03 = r0
            float r0 = r10.getRawX()
            r9.A01 = r0
            float r0 = r10.getRawY()
            r9.A02 = r0
        L_0x0043:
            int r0 = r10.getPointerId(r3)
            r9.A04 = r0
        L_0x0049:
            boolean r0 = super.onInterceptTouchEvent(r10)
            return r0
        L_0x004e:
            r9.A04 = r1
        L_0x0050:
            if (r2 == r5) goto L_0x006b
            r0 = 6
            if (r2 != r0) goto L_0x0049
            int r2 = r10.getActionIndex()
            int r1 = r10.getPointerId(r2)
            int r0 = r9.A04
            if (r1 != r0) goto L_0x0049
            if (r2 != 0) goto L_0x0064
            r3 = 1
        L_0x0064:
            float r0 = r10.getX(r3)
            r9.A03 = r0
            goto L_0x0043
        L_0x006b:
            if (r6 != 0) goto L_0x006f
            if (r4 == 0) goto L_0x0049
        L_0x006f:
            int r0 = r9.A04
            if (r0 == r1) goto L_0x0049
            int r0 = r10.findPointerIndex(r0)
            if (r0 == r1) goto L_0x0049
            float r1 = r10.getX(r0)
            if (r6 == 0) goto L_0x008a
            if (r4 != 0) goto L_0x0087
            float r0 = r9.A03
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0049
        L_0x0087:
            r9.A03 = r1
            return r3
        L_0x008a:
            if (r4 == 0) goto L_0x0049
            float r0 = r9.A03
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0049
            goto L_0x0087
        L_0x0093:
            r1 = 0
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.PhotoViewPager.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public PhotoViewPager(Context context) {
        super(context);
        A0L(C138736ic.A00, true);
    }

    public void setOnInterceptTouchListener(C158267ge r1) {
        this.A00 = r1;
    }

    public PhotoViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0L(C138736ic.A00, true);
    }
}
