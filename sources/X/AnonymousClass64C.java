package X;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import java.util.List;

/* renamed from: X.64C  reason: invalid class name */
public final class AnonymousClass64C {
    public int A00 = -1;
    public int A01 = -1;
    public long A02;
    public final SparseBooleanArray A03 = new SparseBooleanArray();
    public final SparseLongArray A04 = new SparseLongArray();
    public final List A05 = AnonymousClass001.A0I();

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        if (r5 == 9) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fa, code lost:
        if (r9 != 4) goto L_0x00fc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0184  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C118315ng A00(android.view.MotionEvent r39, X.C158847iK r40) {
        /*
            r38 = this;
            r1 = r39
            int r5 = r1.getActionMasked()
            r8 = 3
            r0 = r38
            if (r5 != r8) goto L_0x0017
            android.util.SparseLongArray r1 = r0.A04
            r1.clear()
            android.util.SparseBooleanArray r0 = r0.A03
            r0.clear()
            r0 = 0
            return r0
        L_0x0017:
            int r3 = r1.getPointerCount()
            r2 = 1
            if (r3 != r2) goto L_0x003d
            r2 = 0
            int r4 = r1.getToolType(r2)
            int r3 = r1.getSource()
            int r2 = r0.A01
            if (r4 != r2) goto L_0x002f
            int r2 = r0.A00
            if (r3 == r2) goto L_0x003d
        L_0x002f:
            r0.A01 = r4
            r0.A00 = r3
            android.util.SparseBooleanArray r2 = r0.A03
            r2.clear()
            android.util.SparseLongArray r2 = r0.A04
            r2.clear()
        L_0x003d:
            int r3 = r1.getActionMasked()
            r6 = 1
            if (r3 == 0) goto L_0x01be
            r2 = 5
            if (r3 == r2) goto L_0x01be
            r2 = 9
            if (r3 != r2) goto L_0x0061
            r2 = 0
            int r8 = r1.getPointerId(r2)
            android.util.SparseLongArray r4 = r0.A04
            int r2 = r4.indexOfKey(r8)
            if (r2 >= 0) goto L_0x0061
            long r2 = r0.A02
            long r6 = r6 + r2
            r0.A02 = r6
            r4.put(r8, r2)
        L_0x0061:
            r2 = 10
            r4 = 1
            if (r5 == r2) goto L_0x006f
            r2 = 7
            if (r5 == r2) goto L_0x006f
            r2 = 9
            r19 = 0
            if (r5 != r2) goto L_0x0071
        L_0x006f:
            r19 = 1
        L_0x0071:
            r2 = 8
            boolean r18 = X.AnonymousClass000.A1S(r5, r2)
            if (r19 == 0) goto L_0x0086
            int r2 = r1.getActionIndex()
            int r3 = r1.getPointerId(r2)
            android.util.SparseBooleanArray r2 = r0.A03
            r2.put(r3, r4)
        L_0x0086:
            if (r5 == r4) goto L_0x01bb
            r2 = 6
            if (r5 == r2) goto L_0x01b5
            r8 = -1
        L_0x008c:
            java.util.List r14 = r0.A05
            r14.clear()
            int r17 = r1.getPointerCount()
            r2 = 0
        L_0x0096:
            r3 = r17
            if (r2 >= r3) goto L_0x01e4
            if (r19 != 0) goto L_0x01b1
            if (r2 == r8) goto L_0x01b1
            if (r18 == 0) goto L_0x00a6
            int r3 = r1.getButtonState()
            if (r3 == 0) goto L_0x01b1
        L_0x00a6:
            r36 = 1
        L_0x00a8:
            int r9 = r1.getPointerId(r2)
            android.util.SparseLongArray r5 = r0.A04
            int r3 = r5.indexOfKey(r9)
            if (r3 < 0) goto L_0x01a5
            long r6 = r5.valueAt(r3)
        L_0x00b8:
            float r22 = r1.getPressure(r2)
            float r4 = r1.getX(r2)
            float r3 = r1.getY(r2)
            long r11 = X.C90464aC.A0B(r4, r3)
            float r4 = X.C133206Xf.A00(r11)
            float r3 = X.C133206Xf.A01(r11)
            long r34 = X.C90464aC.A0B(r4, r3)
            r5 = r40
            if (r2 != 0) goto L_0x0193
            float r4 = r1.getRawX()
            float r3 = r1.getRawY()
            long r3 = X.C90464aC.A0B(r4, r3)
        L_0x00e4:
            long r11 = X.AnonymousClass5WS.A02(r5, r3)
        L_0x00e8:
            int r9 = r1.getToolType(r2)
            r5 = 1
            if (r9 == 0) goto L_0x00fc
            if (r9 == r5) goto L_0x018f
            r5 = 2
            if (r9 == r5) goto L_0x018b
            r5 = 3
            if (r9 == r5) goto L_0x0187
            r5 = 4
            r23 = 4
            if (r9 == r5) goto L_0x00fe
        L_0x00fc:
            r23 = 0
        L_0x00fe:
            int r5 = r1.getHistorySize()
            java.util.ArrayList r15 = X.C36441kJ.A14(r5)
            int r13 = r1.getHistorySize()
            r5 = 0
        L_0x010b:
            if (r5 >= r13) goto L_0x0144
            float r10 = r1.getHistoricalX(r2, r5)
            float r9 = r1.getHistoricalY(r2, r5)
            boolean r16 = java.lang.Float.isInfinite(r10)
            if (r16 != 0) goto L_0x0141
            boolean r16 = java.lang.Float.isNaN(r10)
            if (r16 != 0) goto L_0x0141
            boolean r16 = java.lang.Float.isInfinite(r9)
            if (r16 != 0) goto L_0x0141
            boolean r16 = java.lang.Float.isNaN(r9)
            if (r16 != 0) goto L_0x0141
            long r27 = X.C90464aC.A0B(r10, r9)
            long r25 = r1.getHistoricalEventTime(r5)
            X.62N r9 = new X.62N
            r24 = r9
            r29 = r27
            r24.<init>(r25, r27, r29)
            r15.add(r9)
        L_0x0141:
            int r5 = r5 + 1
            goto L_0x010b
        L_0x0144:
            int r9 = r1.getActionMasked()
            r5 = 8
            if (r9 != r5) goto L_0x0184
            r5 = 10
            float r9 = r1.getAxisValue(r5)
            r5 = 9
            float r5 = r1.getAxisValue(r5)
            float r5 = -r5
            r10 = 0
            float r5 = r5 + r10
            long r32 = X.C90464aC.A0B(r9, r5)
        L_0x015f:
            android.util.SparseBooleanArray r10 = r0.A03
            int r9 = r1.getPointerId(r2)
            r5 = 0
            boolean r37 = r10.get(r9, r5)
            long r26 = r1.getEventTime()
            X.6Dw r5 = new X.6Dw
            r24 = r6
            r28 = r3
            r30 = r11
            r20 = r5
            r21 = r15
            r20.<init>(r21, r22, r23, r24, r26, r28, r30, r32, r34, r36, r37)
            r14.add(r5)
            int r2 = r2 + 1
            goto L_0x0096
        L_0x0184:
            long r32 = X.C133206Xf.A03
            goto L_0x015f
        L_0x0187:
            r23 = 2
            goto L_0x00fe
        L_0x018b:
            r23 = 3
            goto L_0x00fe
        L_0x018f:
            r23 = 1
            goto L_0x00fe
        L_0x0193:
            int r4 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r4 < r3) goto L_0x019f
            long r3 = X.C109145Wl.A00(r1, r2)
            goto L_0x00e4
        L_0x019f:
            long r3 = r5.BOT(r11)
            goto L_0x00e8
        L_0x01a5:
            long r6 = r0.A02
            r3 = 1
            long r3 = r3 + r6
            r0.A02 = r3
            r5.put(r9, r6)
            goto L_0x00b8
        L_0x01b1:
            r36 = 0
            goto L_0x00a8
        L_0x01b5:
            int r8 = r1.getActionIndex()
            goto L_0x008c
        L_0x01bb:
            r8 = 0
            goto L_0x008c
        L_0x01be:
            int r10 = r1.getActionIndex()
            int r9 = r1.getPointerId(r10)
            android.util.SparseLongArray r4 = r0.A04
            int r2 = r4.indexOfKey(r9)
            if (r2 >= 0) goto L_0x0061
            long r2 = r0.A02
            long r6 = r6 + r2
            r0.A02 = r6
            r4.put(r9, r2)
            int r2 = r1.getToolType(r10)
            if (r2 != r8) goto L_0x0061
            android.util.SparseBooleanArray r3 = r0.A03
            r2 = 1
            r3.put(r9, r2)
            goto L_0x0061
        L_0x01e4:
            int r3 = r1.getActionMasked()
            r5 = 1
            if (r3 == r5) goto L_0x0221
            r2 = 6
            if (r3 == r2) goto L_0x0221
        L_0x01ee:
            android.util.SparseLongArray r7 = r0.A04
            int r3 = r7.size()
            int r2 = r1.getPointerCount()
            if (r3 <= r2) goto L_0x023b
            int r6 = r7.size()
            int r6 = r6 - r5
        L_0x01ff:
            r2 = -1
            if (r2 >= r6) goto L_0x023b
            int r5 = r7.keyAt(r6)
            int r4 = r1.getPointerCount()
            r3 = 0
        L_0x020b:
            if (r3 >= r4) goto L_0x0216
            int r2 = r1.getPointerId(r3)
            if (r2 == r5) goto L_0x021e
            int r3 = r3 + 1
            goto L_0x020b
        L_0x0216:
            r7.removeAt(r6)
            android.util.SparseBooleanArray r2 = r0.A03
            r2.delete(r5)
        L_0x021e:
            int r6 = r6 + -1
            goto L_0x01ff
        L_0x0221:
            int r2 = r1.getActionIndex()
            int r4 = r1.getPointerId(r2)
            android.util.SparseBooleanArray r3 = r0.A03
            r2 = 0
            boolean r2 = r3.get(r4, r2)
            if (r2 != 0) goto L_0x01ee
            android.util.SparseLongArray r2 = r0.A04
            r2.delete(r4)
            r3.delete(r4)
            goto L_0x01ee
        L_0x023b:
            r1.getEventTime()
            X.5ng r0 = new X.5ng
            r0.<init>(r1, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass64C.A00(android.view.MotionEvent, X.7iK):X.5ng");
    }
}
