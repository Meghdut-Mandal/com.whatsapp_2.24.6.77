package X;

import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: X.6dC  reason: invalid class name and case insensitive filesystem */
public class C135746dC implements View.OnTouchListener {
    public C114585hU A00;
    public final C1271967i A01;
    public final C140456lc A02;
    public final C140456lc A03;
    public final float A04;

    public C135746dC(C1271967i r2, C140456lc r3, C140456lc r4) {
        this.A03 = r3;
        this.A01 = r2;
        this.A02 = r4;
        this.A00 = (C114585hU) C133266Xn.A05(r2, r3);
        this.A04 = (float) ViewConfiguration.get(r2.A00).getScaledTouchSlop();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a6, code lost:
        if (r6.A00.A00 == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r1 != 4) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            int r1 = r8.getAction()
            r5 = 0
            if (r1 == 0) goto L_0x0015
            r0 = 1
            if (r1 == r0) goto L_0x0046
            r0 = 3
            if (r1 == r0) goto L_0x00a2
            r0 = 4
            if (r1 == r0) goto L_0x00a2
        L_0x0010:
            X.5hU r0 = r6.A00
            boolean r0 = r0.A00
            return r0
        L_0x0015:
            X.6lc r4 = r6.A03
            r0 = 36
            X.7ku r3 = r4.A0X(r0)
            if (r3 != 0) goto L_0x0020
            return r5
        L_0x0020:
            X.68b r1 = X.C1273868b.A00()
            X.6lc r0 = r6.A02
            X.6MO r2 = X.C1273868b.A04(r1, r0, r5)
            X.67i r1 = r6.A01
            java.util.List r0 = r4.A08
            X.4vP r0 = X.C100674vP.A00(r1, r3, r0)
            java.lang.Object r2 = X.AnonymousClass6JI.A00(r0, r2, r3)
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 != 0) goto L_0x00ad
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 != 0) goto L_0x00ad
            java.lang.String r1 = "bk.components.FoaTouchExtension"
            java.lang.String r0 = "Got non-boolean result while evaluating touch down expression"
            X.AnonymousClass6RS.A01(r1, r0)
            goto L_0x009c
        L_0x0046:
            X.5hU r0 = r6.A00
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0010
            float r4 = r8.getX()
            float r3 = r8.getY()
            float r2 = r6.A04
            X.AnonymousClass00C.A0D(r7, r5)
            float r1 = -r2
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00a8
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00a8
            int r1 = r7.getRight()
            int r0 = r7.getLeft()
            int r1 = r1 - r0
            float r0 = (float) r1
            float r0 = r0 + r2
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a8
            int r1 = r7.getBottom()
            int r0 = r7.getTop()
            int r1 = r1 - r0
            float r0 = (float) r1
            float r0 = r0 + r2
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a8
            X.6lc r4 = r6.A03
            r0 = 38
        L_0x0084:
            X.7ku r3 = r4.A0X(r0)
            if (r3 == 0) goto L_0x009c
            X.68b r2 = X.C1273868b.A00()
            X.6lc r0 = r6.A02
            r2.A0A(r0, r5)
            r1 = 1
            X.67i r0 = r6.A01
            r2.A0A(r0, r1)
            X.C1273868b.A06(r0, r4, r2, r3)
        L_0x009c:
            X.5hU r0 = r6.A00
            r0.A00 = r5
            goto L_0x0010
        L_0x00a2:
            X.5hU r0 = r6.A00
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0010
        L_0x00a8:
            X.6lc r4 = r6.A03
            r0 = 35
            goto L_0x0084
        L_0x00ad:
            X.5hU r1 = r6.A00
            boolean r0 = X.C129316Gk.A01(r2)
            r1.A00 = r0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135746dC.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
