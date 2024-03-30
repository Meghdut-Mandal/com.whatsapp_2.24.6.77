package X;

import java.util.concurrent.Callable;

/* renamed from: X.76w  reason: invalid class name and case insensitive filesystem */
public final class C1508176w implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C1269166e A03;
    public final /* synthetic */ AnonymousClass69N A04;
    public final /* synthetic */ AnonymousClass69N A05;
    public final /* synthetic */ AnonymousClass5SZ A06;
    public final /* synthetic */ C123035vp A07;
    public final /* synthetic */ C140456lc A08;
    public final /* synthetic */ boolean A09;

    public C1508176w(C1269166e r1, AnonymousClass69N r2, AnonymousClass69N r3, AnonymousClass5SZ r4, C123035vp r5, C140456lc r6, int i, int i2, int i3, boolean z) {
        this.A05 = r2;
        this.A04 = r3;
        this.A03 = r1;
        this.A08 = r6;
        this.A07 = r5;
        this.A00 = i;
        this.A06 = r4;
        this.A02 = i2;
        this.A01 = i3;
        this.A09 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00fe, code lost:
        if (r1 == null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x016c, code lost:
        if (X.AnonymousClass00C.A00(r2.A00 ^ Integer.MIN_VALUE, r0.A00 ^ Integer.MIN_VALUE) <= 0) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0181, code lost:
        if (r1 == null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0185, code lost:
        r0 = (java.lang.String) X.C140456lc.A0I(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r29 = this;
            r2 = r29
            X.69N r4 = r2.A05
            int r11 = r4.A00()
            X.69N r3 = r2.A04
            int r10 = r3.A00()
            X.66e r6 = r2.A03
            X.6lc r5 = r2.A08
            r1 = 1
            X.6Kq r22 = r6.A00(r5, r1)
            X.6T6 r20 = X.C130326Kq.A04
            X.5vp r12 = r2.A07
            android.content.Context r0 = r12.A02
            r28 = r0
            r8 = 0
            X.6Aw r9 = new X.6Aw
            r9.<init>(r5, r8, r8)
            java.lang.Object r0 = r12.A03
            r19 = r0
            r7 = r19
            X.67i r7 = (X.C1271967i) r7
            if (r7 == 0) goto L_0x0037
            r13 = 2131428023(0x7f0b02b7, float:1.8477679E38)
            android.util.SparseArray r0 = r7.A01
            r0.get(r13)
        L_0x0037:
            int r0 = r12.A01
            r25 = r0
            long r26 = X.AnonymousClass5YT.A00(r11, r10)
            r21 = r28
            r23 = r9
            r24 = r19
            X.6Kq r12 = r20.A02(r21, r22, r23, r24, r25, r26)
            r6.A01(r12, r5, r1)
            boolean r0 = r4.A02()
            if (r0 == 0) goto L_0x0059
            boolean r0 = r3.A02()
            if (r0 == 0) goto L_0x0059
        L_0x0058:
            return r12
        L_0x0059:
            X.5vr r0 = r12.A02
            com.facebook.rendercore.RenderTreeNode r0 = r0.A02
            android.graphics.Rect r0 = r0.A03
            int r11 = r0.width()
            int r10 = r0.height()
            int r9 = r2.A00
            X.5SZ r0 = r2.A06
            r22 = r0
            int r0 = r2.A02
            int r3 = r2.A01
            boolean r2 = r2.A09
            r18 = r2
            r21 = r10
            X.6lc r17 = X.AnonymousClass6GR.A00(r5)
            if (r17 != 0) goto L_0x00cb
            X.0fP r3 = new X.0fP
            r3.<init>(r11)
            X.0fP r0 = new X.0fP
            r0.<init>(r10)
        L_0x0087:
            X.011 r1 = X.C36441kJ.A19(r3, r0)
            java.lang.Object r0 = r1.first
            X.0fP r0 = (X.C10900fP) r0
            int r2 = r0.A00
            java.lang.Object r0 = r1.second
            X.0fP r0 = (X.C10900fP) r0
            int r1 = r0.A00
            if (r2 != r11) goto L_0x009b
            if (r1 == r10) goto L_0x0058
        L_0x009b:
            int r0 = X.C112845eY.A00
            r0 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            r3 = 0
            X.6Kq r22 = r6.A00(r5, r3)
            X.6Aw r2 = new X.6Aw
            r2.<init>(r5, r8, r8)
            if (r7 == 0) goto L_0x00bb
            r1 = 2131428023(0x7f0b02b7, float:1.8477679E38)
            android.util.SparseArray r0 = r7.A01
            r0.get(r1)
        L_0x00bb:
            long r26 = X.AnonymousClass5YT.A00(r9, r4)
            r21 = r28
            r23 = r2
            X.6Kq r12 = r20.A02(r21, r22, r23, r24, r25, r26)
            r6.A01(r12, r5, r3)
            return r12
        L_0x00cb:
            r4 = 1
            r14 = r11
            if (r9 == r1) goto L_0x00d2
            r14 = r10
            r21 = r11
        L_0x00d2:
            int r13 = android.view.View.MeasureSpec.getMode(r3)
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            int r1 = android.view.View.MeasureSpec.getMode(r0)
            int r2 = android.view.View.MeasureSpec.getSize(r0)
            X.6lc r0 = X.AnonymousClass6GR.A00(r5)
            X.69N r16 = X.AnonymousClass6XE.A02(r0, r1, r2, r9)
            X.6lc r0 = X.AnonymousClass6GR.A00(r5)
            X.69N r2 = X.AnonymousClass6XE.A01(r0, r13, r3, r9)
            X.6lc r1 = X.AnonymousClass6GR.A00(r5)
            r15 = r3
            if (r13 != 0) goto L_0x00fa
            r15 = 0
        L_0x00fa:
            if (r9 != r4) goto L_0x017f
            r0 = 41
            if (r1 != 0) goto L_0x0185
        L_0x0100:
            r0 = r8
        L_0x0101:
            X.0fP r1 = X.AnonymousClass6XE.A04(r0, r8, r15)
            if (r1 == 0) goto L_0x0112
            int r0 = r1.A00
            int r0 = r2.A01(r0)
            X.0fP r1 = new X.0fP
            r1.<init>(r0)
        L_0x0112:
            java.lang.Float r0 = X.AnonymousClass6GR.A01(r17)
            if (r0 == 0) goto L_0x0149
            double r13 = X.AnonymousClass0VZ.A00(r21)
            float r0 = r0.floatValue()
            double r0 = (double) r0
            if (r9 != r4) goto L_0x0147
            double r13 = r13 * r0
        L_0x0124:
            int r14 = X.C14960mT.A00(r13)
        L_0x0128:
            int r2 = r2.A01(r14)
            r1 = r16
            r0 = r21
            int r1 = r1.A01(r0)
            r0 = r1
            if (r9 != r4) goto L_0x0138
            r0 = r2
        L_0x0138:
            X.0fP r3 = new X.0fP
            r3.<init>(r0)
            if (r9 != r4) goto L_0x0140
            r2 = r1
        L_0x0140:
            X.0fP r0 = new X.0fP
            r0.<init>(r2)
            goto L_0x0087
        L_0x0147:
            double r13 = r13 / r0
            goto L_0x0124
        L_0x0149:
            if (r13 != 0) goto L_0x014c
            r3 = 0
        L_0x014c:
            if (r18 == 0) goto L_0x0128
            X.5SZ r13 = X.AnonymousClass5SZ.STRETCH
            r0 = r22
            if (r0 != r13) goto L_0x0128
            if (r1 != 0) goto L_0x0128
            boolean r0 = r2.A02()
            if (r0 != 0) goto L_0x0128
            X.0fP r0 = r2.A01
            if (r0 == 0) goto L_0x016e
            int r13 = r2.A00
            int r1 = r0.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r13 = r13 ^ r0
            r1 = r1 ^ r0
            int r0 = X.AnonymousClass00C.A00(r13, r1)
            if (r0 > 0) goto L_0x0128
        L_0x016e:
            int r3 = r2.A01(r3)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r14 ^ r0
            r0 = r0 ^ r3
            int r0 = java.lang.Integer.compare(r1, r0)
            if (r0 >= 0) goto L_0x0128
            r14 = r3
            goto L_0x0128
        L_0x017f:
            r0 = 35
            if (r1 != 0) goto L_0x0185
            goto L_0x0100
        L_0x0185:
            java.lang.Object r0 = X.C140456lc.A0I(r1, r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0101
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1508176w.call():java.lang.Object");
    }
}
