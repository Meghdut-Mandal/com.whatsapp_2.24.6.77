package X;

import android.view.Choreographer;

/* renamed from: X.7rT  reason: invalid class name and case insensitive filesystem */
public class C164227rT implements Choreographer.FrameCallback {
    public Object A00;
    public final int A01;

    public C164227rT(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0173, code lost:
        if (r6 > r2) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x017b, code lost:
        if (r6 < r2) goto L_0x017d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void doFrame(long r46) {
        /*
            r45 = this;
            r1 = r45
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x0054;
                case 1: goto L_0x0017;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r1.A00
            X.6LF r2 = (X.AnonymousClass6LF) r2
            X.00T r0 = r2.A05
            android.os.Handler r1 = X.C90524aI.A0C(r0)
            java.lang.Runnable r0 = r2.A03
            r1.postAtFrontOfQueue(r0)
        L_0x0016:
            return
        L_0x0017:
            java.lang.Object r0 = r1.A00
            r40 = r0
            r0 = r40
            X.6Ku r0 = (X.C130366Ku) r0
            r40 = r0
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0016
            r0 = r40
            X.6OB r0 = r0.A01
            r39 = r0
            if (r0 == 0) goto L_0x0016
            long r29 = android.os.SystemClock.uptimeMillis()
            r0 = r40
            long r0 = r0.A00
            long r2 = r29 - r0
            double r0 = (double) r2
            r35 = r0
            r0 = r39
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A04
            r44 = r0
            java.util.Iterator r1 = r44.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005a
            r1.next()
            java.lang.String r0 = "onBeforeIntegrate"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0054:
            java.lang.Object r0 = r1.A00
            X.C36411kG.A1O(r0)
            return
        L_0x005a:
            r0 = r39
            java.util.Set r0 = r0.A03
            r43 = r0
            java.util.Iterator r38 = r43.iterator()
        L_0x0064:
            boolean r0 = r38.hasNext()
            if (r0 == 0) goto L_0x01c7
            java.lang.Object r14 = r38.next()
            X.6E4 r14 = (X.AnonymousClass6E4) r14
            boolean r37 = r14.A02()
            if (r37 == 0) goto L_0x0080
            boolean r0 = r14.A06
            if (r0 == 0) goto L_0x0080
            r0 = r43
            r0.remove(r14)
            goto L_0x0064
        L_0x0080:
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r3 = r35 / r0
            if (r37 == 0) goto L_0x008e
            boolean r0 = r14.A06
            if (r0 == 0) goto L_0x008e
            goto L_0x0064
        L_0x008e:
            r1 = 4589276106681592316(0x3fb0624dd2f1a9fc, double:0.064)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0098
            r1 = r3
        L_0x0098:
            double r10 = r14.A02
            double r10 = r10 + r1
            r14.A02 = r10
            X.6Jy r0 = r14.A03
            double r8 = r0.A01
            double r15 = r0.A00
            X.5oR r0 = r14.A07
            r42 = r0
            double r6 = r0.A00
            double r4 = r0.A01
            X.5oR r0 = r14.A09
            r41 = r0
            double r12 = r0.A00
            double r2 = r0.A01
        L_0x00b3:
            r33 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r0 = (r10 > r33 ? 1 : (r10 == r33 ? 0 : -1))
            if (r0 < 0) goto L_0x012f
            double r10 = r10 - r33
            r14.A02 = r10
            int r0 = (r10 > r33 ? 1 : (r10 == r33 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ca
            X.5oR r0 = r14.A08
            r0.A00 = r6
            r0.A01 = r4
        L_0x00ca:
            double r0 = r14.A00
            double r31 = r0 - r12
            double r31 = r31 * r8
            double r2 = r15 * r4
            double r31 = r31 - r2
            double r12 = r4 * r33
            r17 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r12 = r12 * r17
            double r12 = r12 + r6
            double r2 = r31 * r33
            double r2 = r2 * r17
            double r27 = r4 + r2
            double r25 = r0 - r12
            double r25 = r25 * r8
            double r2 = r15 * r27
            double r25 = r25 - r2
            double r2 = r27 * r33
            double r2 = r2 * r17
            double r12 = r6 + r2
            double r2 = r25 * r33
            double r2 = r2 * r17
            double r19 = r4 + r2
            double r23 = r0 - r12
            double r23 = r23 * r8
            double r2 = r15 * r19
            double r23 = r23 - r2
            double r2 = r19 * r33
            double r12 = r6 + r2
            double r17 = r23 * r33
            double r2 = r4 + r17
            double r0 = r0 - r12
            double r0 = r0 * r8
            double r17 = r15 * r2
            double r0 = r0 - r17
            double r27 = r27 + r19
            r21 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r27 = r27 * r21
            double r19 = r4 + r27
            double r19 = r19 + r2
            r17 = 4595172819793696085(0x3fc5555555555555, double:0.16666666666666666)
            double r19 = r19 * r17
            double r25 = r25 + r23
            double r25 = r25 * r21
            double r31 = r31 + r25
            double r31 = r31 + r0
            double r31 = r31 * r17
            double r19 = r19 * r33
            double r6 = r6 + r19
            double r31 = r31 * r33
            double r4 = r4 + r31
            goto L_0x00b3
        L_0x012f:
            r0 = r41
            r0.A00 = r12
            r0.A01 = r2
            r0 = r42
            r0.A00 = r6
            r0.A01 = r4
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x015a
            double r10 = r10 / r33
            double r6 = r6 * r10
            X.5oR r12 = r14.A08
            double r2 = r12.A00
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r15 = r15 - r10
            double r2 = r2 * r15
            double r6 = r6 + r2
            r2 = r42
            r2.A00 = r6
            double r4 = r4 * r10
            double r2 = r12.A01
            double r2 = r2 * r15
            double r4 = r4 + r2
            r2 = r42
            r2.A01 = r4
        L_0x015a:
            boolean r2 = r14.A02()
            r12 = 1
            if (r2 != 0) goto L_0x017d
            boolean r2 = r14.A05
            if (r2 == 0) goto L_0x019a
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x019a
            double r10 = r14.A01
            double r2 = r14.A00
            int r13 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r13 >= 0) goto L_0x0175
            int r13 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r13 > 0) goto L_0x017d
        L_0x0175:
            int r13 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r13 <= 0) goto L_0x019a
            int r10 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r10 >= 0) goto L_0x019a
        L_0x017d:
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x01c2
            double r6 = r14.A00
            r14.A01 = r6
            r2 = r42
            r2.A00 = r6
        L_0x0189:
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0198
            r2 = r42
            r2.A01 = r0
            X.6OB r1 = r14.A0A
            java.lang.String r0 = r14.A0B
            r1.A01(r0)
        L_0x0198:
            r37 = 1
        L_0x019a:
            boolean r1 = r14.A06
            r0 = 0
            if (r1 == 0) goto L_0x01a1
            r14.A06 = r0
        L_0x01a1:
            if (r37 == 0) goto L_0x01c0
            r14.A06 = r12
        L_0x01a5:
            java.util.concurrent.CopyOnWriteArraySet r0 = r14.A04
            java.util.Iterator r1 = r0.iterator()
        L_0x01ab:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0064
            java.lang.Object r0 = r1.next()
            X.7ik r0 = (X.C159067ik) r0
            r0.Bgx(r14)
            if (r12 == 0) goto L_0x01ab
            r0.Bgw(r14)
            goto L_0x01ab
        L_0x01c0:
            r12 = 0
            goto L_0x01a5
        L_0x01c2:
            r14.A00 = r6
            r14.A01 = r6
            goto L_0x0189
        L_0x01c7:
            boolean r0 = r43.isEmpty()
            if (r0 == 0) goto L_0x01d2
            r1 = 1
            r0 = r39
            r0.A00 = r1
        L_0x01d2:
            java.util.Iterator r1 = r44.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01e6
            r1.next()
            java.lang.String r0 = "onAfterIntegrate"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x01e6:
            r0 = r39
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x01fa
            r0 = r39
            X.6Ku r2 = r0.A01
            r0 = 0
            r2.A02 = r0
            android.view.Choreographer r1 = r2.A04
            android.view.Choreographer$FrameCallback r0 = r2.A03
            r1.removeFrameCallback(r0)
        L_0x01fa:
            r1 = r29
            r0 = r40
            r0.A00 = r1
            android.view.Choreographer r1 = r0.A04
            android.view.Choreographer$FrameCallback r0 = r0.A03
            r1.postFrameCallback(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C164227rT.doFrame(long):void");
    }
}
