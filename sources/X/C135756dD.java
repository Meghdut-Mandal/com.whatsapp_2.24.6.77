package X;

import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.View;

/* renamed from: X.6dD  reason: invalid class name and case insensitive filesystem */
public class C135756dD implements View.OnTouchListener {
    public float A00 = Float.MAX_VALUE;
    public float A01 = Float.MAX_VALUE;
    public boolean A02 = false;
    public final GestureDetector A03;
    public final ScaleGestureDetector A04;
    public final C92094d7 A05;

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c9, code lost:
        if (r2.A05(r0) != null) goto L_0x00cb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d2 A[Catch:{ all -> 0x01b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00dc A[Catch:{ all -> 0x01b4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            r12 = this;
            android.graphics.Matrix r0 = X.C129826Ip.A00
            android.view.MotionEvent r5 = android.view.MotionEvent.obtain(r14)
            android.graphics.Matrix r0 = r13.getMatrix()
            r5.transform(r0)
            int r0 = r13.getLeft()
            float r1 = (float) r0
            int r0 = r13.getTop()
            float r0 = (float) r0
            r5.offsetLocation(r1, r0)
            android.view.ScaleGestureDetector r0 = r12.A04     // Catch:{ all -> 0x01b4 }
            r0.onTouchEvent(r5)     // Catch:{ all -> 0x01b4 }
            android.view.ViewParent r7 = r13.getParent()     // Catch:{ all -> 0x01b4 }
            boolean r0 = r0.isInProgress()     // Catch:{ all -> 0x01b4 }
            r6 = 1
            if (r0 == 0) goto L_0x003d
            X.4d7 r1 = r12.A05     // Catch:{ all -> 0x01b4 }
            r0 = 44
            X.7ku r0 = r1.A05(r0)     // Catch:{ all -> 0x01b4 }
            if (r0 == 0) goto L_0x003d
            if (r7 == 0) goto L_0x003b
            r7.requestDisallowInterceptTouchEvent(r6)     // Catch:{ all -> 0x01b4 }
            r12.A02 = r6     // Catch:{ all -> 0x01b4 }
        L_0x003b:
            r4 = 1
            goto L_0x0043
        L_0x003d:
            android.view.GestureDetector r0 = r12.A03     // Catch:{ all -> 0x01b4 }
            boolean r4 = r0.onTouchEvent(r5)     // Catch:{ all -> 0x01b4 }
        L_0x0043:
            int r1 = r5.getActionMasked()     // Catch:{ all -> 0x01b4 }
            if (r7 == 0) goto L_0x0173
            if (r1 == 0) goto L_0x0162
            if (r1 == r6) goto L_0x00e0
            r0 = 2
            if (r1 == r0) goto L_0x0064
            r0 = 3
            if (r1 != r0) goto L_0x0173
            X.4d7 r10 = r12.A05     // Catch:{ all -> 0x01b4 }
            r0 = 61
            X.7ku r9 = r10.A05(r0)     // Catch:{ all -> 0x01b4 }
            boolean r0 = r10.A02     // Catch:{ all -> 0x01b4 }
            r8 = 0
            if (r0 == 0) goto L_0x0199
            if (r9 == 0) goto L_0x0199
            goto L_0x0175
        L_0x0064:
            float r0 = r12.A00     // Catch:{ all -> 0x01b4 }
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00cd
            float r0 = r12.A01     // Catch:{ all -> 0x01b4 }
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00cd
            int r0 = r5.getPointerCount()     // Catch:{ all -> 0x01b4 }
            if (r0 <= r6) goto L_0x0084
            X.4d7 r1 = r12.A05     // Catch:{ all -> 0x01b4 }
            r0 = 44
            X.7ku r0 = r1.A05(r0)     // Catch:{ all -> 0x01b4 }
            if (r0 == 0) goto L_0x0084
            goto L_0x00cb
        L_0x0084:
            X.4d7 r2 = r12.A05     // Catch:{ all -> 0x01b4 }
            boolean r0 = r2.A04     // Catch:{ all -> 0x01b4 }
            if (r0 != 0) goto L_0x008e
            boolean r0 = r2.A03     // Catch:{ all -> 0x01b4 }
            if (r0 != 0) goto L_0x0097
        L_0x008e:
            r0 = 48
            X.7ku r0 = r2.A05(r0)     // Catch:{ all -> 0x01b4 }
            if (r0 == 0) goto L_0x0097
            goto L_0x00cb
        L_0x0097:
            float r3 = r5.getX()     // Catch:{ all -> 0x01b4 }
            float r0 = r12.A00     // Catch:{ all -> 0x01b4 }
            float r3 = r3 - r0
            float r1 = r5.getY()     // Catch:{ all -> 0x01b4 }
            float r0 = r12.A01     // Catch:{ all -> 0x01b4 }
            float r1 = X.C90494aF.A01(r1, r0)     // Catch:{ all -> 0x01b4 }
            float r0 = java.lang.Math.abs(r3)     // Catch:{ all -> 0x01b4 }
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00bb
            r0 = 38
            X.7ku r0 = r2.A05(r0)     // Catch:{ all -> 0x01b4 }
            if (r0 != 0) goto L_0x00cb
            r0 = 42
            goto L_0x00c5
        L_0x00bb:
            r0 = 40
            X.7ku r0 = r2.A05(r0)     // Catch:{ all -> 0x01b4 }
            if (r0 != 0) goto L_0x00cb
            r0 = 41
        L_0x00c5:
            X.7ku r0 = r2.A05(r0)     // Catch:{ all -> 0x01b4 }
            if (r0 == 0) goto L_0x00cd
        L_0x00cb:
            r1 = 1
            goto L_0x00ce
        L_0x00cd:
            r1 = 0
        L_0x00ce:
            boolean r0 = r12.A02     // Catch:{ all -> 0x01b4 }
            if (r0 == 0) goto L_0x00dc
            if (r1 != 0) goto L_0x0173
            r0 = 0
            r7.requestDisallowInterceptTouchEvent(r0)     // Catch:{ all -> 0x01b4 }
            r12.A02 = r0     // Catch:{ all -> 0x01b4 }
            goto L_0x0173
        L_0x00dc:
            if (r1 == 0) goto L_0x0173
            goto L_0x016e
        L_0x00e0:
            X.4d7 r9 = r12.A05     // Catch:{ all -> 0x01b4 }
            r0 = 0
            r9.A04 = r0     // Catch:{ all -> 0x01b4 }
            boolean r0 = r9.A02     // Catch:{ all -> 0x01b4 }
            r8 = 0
            if (r0 == 0) goto L_0x0134
            android.view.View r0 = r9.A01     // Catch:{ all -> 0x01b4 }
            if (r0 == 0) goto L_0x0132
            r0 = 53
            X.7ku r3 = r9.A05(r0)     // Catch:{ all -> 0x01b4 }
            r0 = 61
            X.7ku r4 = r9.A05(r0)     // Catch:{ all -> 0x01b4 }
            r11 = 3
            r10 = 2
            if (r3 == 0) goto L_0x0112
            X.6lc r2 = r9.A07     // Catch:{ all -> 0x01b4 }
            X.68b r1 = X.C92094d7.A00(r9)     // Catch:{ all -> 0x01b4 }
            X.67i r0 = r9.A05     // Catch:{ all -> 0x01b4 }
            r1.A09(r0, r6)     // Catch:{ all -> 0x01b4 }
            X.C92094d7.A03(r5, r9, r1, r10)     // Catch:{ all -> 0x01b4 }
            X.C92094d7.A02(r5, r9, r1, r11)     // Catch:{ all -> 0x01b4 }
            X.C1273868b.A06(r0, r2, r1, r3)     // Catch:{ all -> 0x01b4 }
        L_0x0112:
            if (r4 == 0) goto L_0x0132
            X.6lc r3 = r9.A07     // Catch:{ all -> 0x01b4 }
            X.68b r2 = X.C92094d7.A00(r9)     // Catch:{ all -> 0x01b4 }
            X.67i r1 = r9.A05     // Catch:{ all -> 0x01b4 }
            r2.A09(r1, r6)     // Catch:{ all -> 0x01b4 }
            r2.A09(r3, r10)     // Catch:{ all -> 0x01b4 }
            java.lang.String r0 = "released"
            r2.A09(r0, r11)     // Catch:{ all -> 0x01b4 }
            r0 = 4
            X.C92094d7.A03(r5, r9, r2, r0)     // Catch:{ all -> 0x01b4 }
            r0 = 5
            X.C92094d7.A02(r5, r9, r2, r0)     // Catch:{ all -> 0x01b4 }
            X.C1273868b.A06(r1, r3, r2, r4)     // Catch:{ all -> 0x01b4 }
        L_0x0132:
            r9.A02 = r8     // Catch:{ all -> 0x01b4 }
        L_0x0134:
            r0 = 50
            X.7ku r4 = r9.A05(r0)     // Catch:{ all -> 0x01b4 }
            if (r4 == 0) goto L_0x019b
            android.view.View r0 = r9.A01     // Catch:{ all -> 0x01b4 }
            if (r0 == 0) goto L_0x019b
            float r2 = r5.getX()     // Catch:{ all -> 0x01b4 }
            float r0 = r5.getY()     // Catch:{ all -> 0x01b4 }
            android.graphics.PointF r1 = new android.graphics.PointF     // Catch:{ all -> 0x01b4 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x01b4 }
            android.view.View r0 = r9.A01     // Catch:{ all -> 0x01b4 }
            android.graphics.PointF r3 = X.C129826Ip.A00(r1, r0)     // Catch:{ all -> 0x01b4 }
            X.6lc r2 = r9.A07     // Catch:{ all -> 0x01b4 }
            X.68b r1 = X.C92094d7.A00(r9)     // Catch:{ all -> 0x01b4 }
            X.67i r0 = r9.A05     // Catch:{ all -> 0x01b4 }
            X.C92094d7.A01(r3, r9, r1, r0)     // Catch:{ all -> 0x01b4 }
            X.C1273868b.A06(r0, r2, r1, r4)     // Catch:{ all -> 0x01b4 }
            goto L_0x019b
        L_0x0162:
            float r0 = r5.getX()     // Catch:{ all -> 0x01b4 }
            r12.A00 = r0     // Catch:{ all -> 0x01b4 }
            float r0 = r5.getY()     // Catch:{ all -> 0x01b4 }
            r12.A01 = r0     // Catch:{ all -> 0x01b4 }
        L_0x016e:
            r7.requestDisallowInterceptTouchEvent(r6)     // Catch:{ all -> 0x01b4 }
            r12.A02 = r6     // Catch:{ all -> 0x01b4 }
        L_0x0173:
            r6 = r4
            goto L_0x01ab
        L_0x0175:
            android.view.View r0 = r10.A01     // Catch:{ all -> 0x01b4 }
            if (r0 == 0) goto L_0x0199
            X.6lc r4 = r10.A07     // Catch:{ all -> 0x01b4 }
            X.68b r3 = X.C92094d7.A00(r10)     // Catch:{ all -> 0x01b4 }
            X.67i r2 = r10.A05     // Catch:{ all -> 0x01b4 }
            r3.A09(r2, r6)     // Catch:{ all -> 0x01b4 }
            r0 = 2
            r3.A09(r4, r0)     // Catch:{ all -> 0x01b4 }
            r1 = 3
            java.lang.String r0 = "cancelled"
            r3.A09(r0, r1)     // Catch:{ all -> 0x01b4 }
            r0 = 4
            X.C92094d7.A03(r5, r10, r3, r0)     // Catch:{ all -> 0x01b4 }
            r0 = 5
            X.C92094d7.A02(r5, r10, r3, r0)     // Catch:{ all -> 0x01b4 }
            X.C1273868b.A06(r2, r4, r3, r9)     // Catch:{ all -> 0x01b4 }
        L_0x0199:
            r10.A02 = r8     // Catch:{ all -> 0x01b4 }
        L_0x019b:
            boolean r0 = r12.A02     // Catch:{ all -> 0x01b4 }
            if (r0 == 0) goto L_0x01a4
            r7.requestDisallowInterceptTouchEvent(r8)     // Catch:{ all -> 0x01b4 }
            r12.A02 = r8     // Catch:{ all -> 0x01b4 }
        L_0x01a4:
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r12.A01 = r0     // Catch:{ all -> 0x01b4 }
            r12.A00 = r0     // Catch:{ all -> 0x01b4 }
        L_0x01ab:
            X.4d7 r1 = r12.A05     // Catch:{ all -> 0x01b4 }
            r0 = 0
            r1.A03 = r0     // Catch:{ all -> 0x01b4 }
            r5.recycle()
            return r6
        L_0x01b4:
            r0 = move-exception
            r5.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135756dD.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public C135756dD(GestureDetector gestureDetector, ScaleGestureDetector scaleGestureDetector, C92094d7 r4) {
        this.A05 = r4;
        this.A03 = gestureDetector;
        this.A04 = scaleGestureDetector;
    }
}
