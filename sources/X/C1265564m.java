package X;

import java.util.Iterator;

/* renamed from: X.64m  reason: invalid class name and case insensitive filesystem */
public final class C1265564m {
    public C159557jY A00;
    public AnonymousClass5Ci A01;
    public boolean A02;
    public final float A03;
    public final AnonymousClass6V4 A04;
    public final C1270166p A05;
    public final AnonymousClass6L5 A06;
    public final AnonymousClass6FV A07;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        if (r2 != 6) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(android.view.MotionEvent r13, float r14, int r15, boolean r16) {
        /*
            r12 = this;
            r1 = 0
            X.AnonymousClass00C.A0D(r13, r1)
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x001d
            int r2 = r13.getActionMasked()
            r1 = 1
            if (r2 == 0) goto L_0x008d
            if (r2 == r1) goto L_0x0061
            r0 = 2
            if (r2 == r0) goto L_0x001e
            r0 = 3
            if (r2 == r0) goto L_0x0061
            r0 = 5
            if (r2 == r0) goto L_0x008d
            r0 = 6
            if (r2 == r0) goto L_0x0061
        L_0x001d:
            return r1
        L_0x001e:
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x001d
            X.5Ci r5 = r12.A01
            if (r5 == 0) goto L_0x001d
            int r7 = r13.getHistorySize()
            r6 = 0
        L_0x002b:
            X.66p r3 = r12.A05
            if (r6 >= r7) goto L_0x0049
            float r2 = r13.getHistoricalX(r6)
            float r0 = r13.getHistoricalY(r6)
            android.graphics.PointF r4 = r3.A00(r2, r0)
            long r2 = r13.getHistoricalEventTime(r6)
            X.6Px r0 = r5.A03
            if (r0 == 0) goto L_0x0046
            r0.A06(r4, r2)
        L_0x0046:
            int r6 = r6 + 1
            goto L_0x002b
        L_0x0049:
            float r2 = r13.getX()
            float r0 = r13.getY()
            android.graphics.PointF r4 = r3.A00(r2, r0)
            long r2 = r13.getEventTime()
            X.6Px r0 = r5.A03
            if (r0 == 0) goto L_0x001d
            r0.A06(r4, r2)
            return r1
        L_0x0061:
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x0085
            X.5Ci r5 = r12.A01
            if (r5 == 0) goto L_0x0082
            X.66p r3 = r12.A05
            float r2 = r13.getX()
            float r0 = r13.getY()
            android.graphics.PointF r4 = r3.A00(r2, r0)
            long r2 = r13.getEventTime()
            X.6Px r0 = r5.A03
            if (r0 == 0) goto L_0x0082
            r0.A05(r4, r2)
        L_0x0082:
            r0 = 0
            r12.A01 = r0
        L_0x0085:
            X.7jY r0 = r12.A00
            if (r0 == 0) goto L_0x001d
            r0.BW2()
            return r1
        L_0x008d:
            float r2 = r12.A03
            X.5Ci r0 = new X.5Ci
            r0.<init>(r2)
            r12.A01 = r0
            X.6L5 r2 = r12.A06
            r0.A0P(r2)
            r0.A0G(r15)
            r0.A0F(r14)
            X.6V4 r3 = r12.A04
            if (r16 == 0) goto L_0x010e
            android.graphics.Bitmap r2 = r3.A05
            if (r2 != 0) goto L_0x00ac
            X.AnonymousClass6V4.A01(r3, r1)
        L_0x00ac:
            android.graphics.Bitmap r5 = r3.A05
        L_0x00ae:
            X.AnonymousClass00C.A0B(r5)
            android.graphics.PointF r4 = r3.A0D
            X.AnonymousClass00C.A08(r4)
            int r3 = r3.A00
            r2 = 0
            X.AnonymousClass00C.A0D(r5, r2)
            r0.A01 = r5
            r0.A02 = r4
            r0.A00 = r3
            X.66p r4 = r12.A05
            float r3 = r13.getX()
            float r2 = r13.getY()
            android.graphics.PointF r5 = r4.A00(r3, r2)
            long r10 = r13.getEventTime()
            X.6L5 r7 = r0.A04
            if (r16 == 0) goto L_0x00fa
            if (r7 == 0) goto L_0x00fa
            android.graphics.Bitmap r3 = r0.A01
            android.graphics.PointF r6 = r0.A02
            int r9 = r0.A00
            android.graphics.Paint r4 = r0.A01
            float r8 = r0.A08()
            X.5Ct r2 = new X.5Ct
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
        L_0x00eb:
            r0.A03 = r2
            X.6FV r2 = r12.A07
            r2.A03(r0)
            X.7jY r0 = r12.A00
            if (r0 == 0) goto L_0x001d
            r0.BW1()
            return r1
        L_0x00fa:
            android.graphics.Bitmap r3 = r0.A01
            android.graphics.PointF r6 = r0.A02
            int r9 = r0.A00
            android.graphics.Paint r4 = r0.A01
            float r7 = r0.A08()
            float r8 = r0.A06
            X.5Cu r2 = new X.5Cu
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x00eb
        L_0x010e:
            android.graphics.Bitmap r2 = r3.A06
            if (r2 != 0) goto L_0x0115
            X.AnonymousClass6V4.A02(r3, r1)
        L_0x0115:
            android.graphics.Bitmap r5 = r3.A06
            goto L_0x00ae
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1265564m.A00(android.view.MotionEvent, float, int, boolean):boolean");
    }

    public C1265564m(AnonymousClass6V4 r4, C1270166p r5, AnonymousClass6FV r6, AnonymousClass6L5 r7, float f) {
        C36321k7.A11(r6, r4, r5);
        this.A07 = r6;
        this.A04 = r4;
        this.A05 = r5;
        this.A06 = r7;
        this.A03 = f;
        Iterator it = r6.A01().iterator();
        while (it.hasNext()) {
            ((AnonymousClass5Ci) it.next()).A0P(this.A06);
        }
    }
}
