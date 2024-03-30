package X;

import android.text.method.LinkMovementMethod;

/* renamed from: X.1gK  reason: invalid class name and case insensitive filesystem */
public class C34021gK extends LinkMovementMethod {
    public Runnable A00 = null;
    public C33981gG A01;
    public final int A02;
    public final int A03;
    public final boolean A04;

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.widget.TextView r20, android.text.Spannable r21, android.view.MotionEvent r22) {
        /*
            r19 = this;
            r17 = r22
            int r2 = r17.getAction()
            r0 = 3
            r4 = r19
            r18 = r20
            if (r2 != r0) goto L_0x0018
            X.1gG r3 = r4.A01
            if (r3 == 0) goto L_0x0018
            r1 = r17
            r0 = r18
            r3.BjD(r1, r0)
        L_0x0018:
            r3 = 1
            r16 = 0
            if (r2 == r3) goto L_0x0020
            if (r2 == 0) goto L_0x0020
        L_0x001f:
            return r16
        L_0x0020:
            float r0 = r17.getX()
            int r9 = (int) r0
            int r0 = r18.getTotalPaddingLeft()
            int r9 = r9 - r0
            int r0 = r18.getScrollX()
            int r9 = r9 + r0
            float r0 = r17.getY()
            int r1 = (int) r0
            int r0 = r18.getTotalPaddingTop()
            int r1 = r1 - r0
            int r0 = r18.getScrollY()
            int r1 = r1 + r0
            android.text.Layout r8 = r18.getLayout()
            int r6 = r8.getLineForVertical(r1)
            int r15 = r8.getLineStart(r6)
            int r14 = r8.getLineEnd(r6)
            java.lang.Class<X.1gG> r5 = X.C33981gG.class
            r7 = r21
            java.lang.Object[] r10 = r7.getSpans(r15, r14, r5)
            X.1gG[] r10 = (X.C33981gG[]) r10
            int r12 = r10.length
            if (r12 == 0) goto L_0x001f
            int r1 = r14 - r15
            r13 = 0
            int r0 = r4.A03     // Catch:{ all -> 0x00e3 }
            if (r1 > r0) goto L_0x0087
            int r11 = r4.A02     // Catch:{ all -> 0x00e3 }
            if (r1 > r11) goto L_0x00b6
            goto L_0x00c1
        L_0x0067:
            r0 = 8207(0x200f, float:1.15E-41)
            if (r1 == r0) goto L_0x0083
            r0 = 1564(0x61c, float:2.192E-42)
            if (r1 == r0) goto L_0x0083
            r0 = 1807(0x70f, float:2.532E-42)
            if (r1 == r0) goto L_0x0083
            r0 = 8234(0x202a, float:1.1538E-41)
            if (r1 < r0) goto L_0x00b4
            r0 = 8238(0x202e, float:1.1544E-41)
            if (r1 <= r0) goto L_0x0083
            r0 = 8294(0x2066, float:1.1622E-41)
            if (r1 < r0) goto L_0x00b4
            r0 = 8297(0x2069, float:1.1627E-41)
            if (r1 > r0) goto L_0x00b4
        L_0x0083:
            int r13 = r13 + 1
            if (r13 <= r11) goto L_0x00b4
        L_0x0087:
            r5 = 0
        L_0x0088:
            r1 = r10[r5]
            boolean r0 = r1 instanceof X.C429521l
            if (r0 == 0) goto L_0x00ac
            if (r1 == 0) goto L_0x00b1
            X.1gG[] r10 = new X.C33981gG[r3]
            r10[r16] = r1
        L_0x0094:
            int r0 = r10.length
            if (r0 == 0) goto L_0x001f
            java.lang.Runnable r0 = r4.A00
            if (r0 == 0) goto L_0x00a0
            if (r2 != r3) goto L_0x00a0
            r0.run()
        L_0x00a0:
            r2 = r10[r16]
            r4.A01 = r2
            r1 = r17
            r0 = r18
            r2.BjD(r1, r0)
            return r3
        L_0x00ac:
            int r5 = r5 + 1
            if (r5 >= r12) goto L_0x00b1
            goto L_0x0088
        L_0x00b1:
            if (r12 <= r3) goto L_0x0094
            return r16
        L_0x00b4:
            int r15 = r15 + 1
        L_0x00b6:
            if (r15 >= r14) goto L_0x00c1
            char r1 = r7.charAt(r15)     // Catch:{ all -> 0x00e3 }
            r0 = 8206(0x200e, float:1.1499E-41)
            if (r1 == r0) goto L_0x0083
            goto L_0x0067
        L_0x00c1:
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x00d7
            float r1 = (float) r9
            float r0 = r8.getLineLeft(r6)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x001f
            float r0 = r8.getLineRight(r6)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d7
            return r16
        L_0x00d7:
            float r0 = (float) r9
            int r0 = r8.getOffsetForHorizontal(r6, r0)
            java.lang.Object[] r10 = r7.getSpans(r0, r0, r5)
            X.1gG[] r10 = (X.C33981gG[]) r10
            goto L_0x0094
        L_0x00e3:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34021gK.onTouchEvent(android.widget.TextView, android.text.Spannable, android.view.MotionEvent):boolean");
    }

    public C34021gK(C20810yC r3) {
        C21000yV r1 = C21000yV.A02;
        this.A04 = C20800yB.A01(r1, r3, 6823);
        this.A03 = C20800yB.A00(r1, r3, 7089);
        this.A02 = C20800yB.A00(r1, r3, 7090);
    }
}
