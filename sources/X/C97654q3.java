package X;

import android.app.ActivityManager;
import android.graphics.Bitmap;
import java.util.ArrayList;

/* renamed from: X.4q3  reason: invalid class name and case insensitive filesystem */
public abstract class C97654q3 extends C139206jP {
    public static final ArrayList A0C = C36441kJ.A14(5);
    public static final String[] A0D;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public C1273667z A08 = new C1273667z();
    public final AnonymousClass6TZ A09;
    public final C130866Ms A0A = new C130866Ms();
    public final int[] A0B = C36441kJ.A1O();

    public abstract AnonymousClass6VI A07(int i, int i2, int i3);

    public void A09(int i, int i2, int i3, int i4) {
        String str;
        int i5 = this.A0C;
        AnonymousClass6VI r4 = new AnonymousClass6VI(i5, i5);
        r4.A02 = i;
        r4.A03 = i2;
        r4.A04 = i3;
        r4.A0B = 1;
        this.A09.A03(r4);
        C97794qH r2 = new C97794qH(this, r4, i, i2, i3, i4);
        if (i3 >= 0) {
            String[] strArr = A0D;
            if (i3 < 22) {
                str = strArr[i3];
                C133046Wl.A01(r2);
                C118505oA.A00(r2, str);
            }
        }
        str = "INVALID_ZOOM_LEVEL";
        C133046Wl.A01(r2);
        C118505oA.A00(r2, str);
    }

    static {
        String[] strArr = new String[22];
        A0D = strArr;
        int i = 0;
        do {
            strArr[i] = String.valueOf(i);
            i++;
        } while (i <= 21);
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x01a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(android.graphics.Canvas r36) {
        /*
            r35 = this;
            r9 = r35
            X.6jV r0 = r9.A07
            X.4ej r8 = r0.A0Q
            r0 = 0
            r9.A01 = r0
            r9.A00 = r0
            int r0 = r8.A0G
            int r2 = r9.A06
            if (r0 == r2) goto L_0x001e
            if (r2 < 0) goto L_0x0226
            java.lang.String[] r1 = A0D
            r0 = 22
            if (r2 >= r0) goto L_0x0226
            r0 = r1[r2]
        L_0x001b:
            X.C133046Wl.A02(r0)
        L_0x001e:
            int r0 = r8.A0G
            r9.A06 = r0
            X.6WY r0 = r9.A08
            X.6Ms r6 = r9.A0A
            r0.A07(r6)
            double r12 = r8.A04
            double r1 = r6.A01
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0038
            double r0 = r8.A00
            double r0 = java.lang.Math.ceil(r0)
            double r12 = r12 + r0
        L_0x0038:
            double r14 = r8.A05
            r29 = r36
            r29.save()
            float r3 = r8.A0C
            float r2 = r8.A06
            float r1 = r8.A07
            r0 = r29
            r0.rotate(r3, r2, r1)
            float r3 = r8.A02
            float r2 = r8.A06
            float r1 = r8.A07
            r0.scale(r3, r3, r2, r1)
            int r0 = r8.A03
            double r4 = (double) r0
            double r2 = r6.A01
            double r0 = r4 * r2
            int r2 = (int) r0
            r28 = r2
            double r2 = r6.A03
            double r0 = r4 * r2
            int r2 = (int) r0
            r27 = r2
            double r2 = r6.A02
            double r0 = r4 * r2
            int r2 = (int) r0
            r26 = r2
            double r0 = r6.A00
            double r4 = r4 * r0
            int r0 = (int) r4
            r25 = r0
            int r1 = r9.A04
            r0 = r28
            if (r1 != r0) goto L_0x0087
            int r1 = r9.A05
            r0 = r27
            if (r1 != r0) goto L_0x0087
            int r1 = r9.A02
            if (r1 != r2) goto L_0x0087
            int r1 = r9.A03
            r0 = r25
            if (r1 == r0) goto L_0x0096
        L_0x0087:
            int r2 = r8.A0G
            if (r2 < 0) goto L_0x0222
            java.lang.String[] r1 = A0D
            r0 = 22
            if (r2 >= r0) goto L_0x0222
            r0 = r1[r2]
        L_0x0093:
            X.C133046Wl.A02(r0)
        L_0x0096:
            r0 = r28
            r9.A04 = r0
            r0 = r27
            r9.A05 = r0
            r0 = r26
            r9.A02 = r0
            r0 = r25
            r9.A03 = r0
            int r10 = r8.A03
            r1 = 1
            int r24 = r10 + -1
            int r0 = r26 - r28
            int r7 = r0 + 1
            int r0 = r25 - r27
            int r6 = r0 + 1
            r23 = r6
            if (r7 <= r6) goto L_0x00b9
            r23 = r7
        L_0x00b9:
            int r23 = r23 * r23
            int r7 = r7 - r1
            int r7 = r7 >> r1
            int r7 = r7 + r28
            int r6 = r6 - r1
            int r6 = r6 >> r1
            int r6 = r6 + r27
            long r0 = r8.A0J
            double r4 = (double) r0
            double r2 = (double) r7
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 * r16
            double r10 = (double) r10
            double r2 = r2 / r10
            double r2 = r2 - r12
            double r0 = r4 * r2
            float r2 = r8.A06
            double r2 = (double) r2
            double r0 = r0 + r2
            float r2 = (float) r0
            r22 = r2
            double r0 = (double) r6
            double r0 = r0 * r16
            double r0 = r0 / r10
            double r0 = r0 - r14
            double r4 = r4 * r0
            float r0 = r8.A07
            double r0 = (double) r0
            double r4 = r4 + r0
            float r0 = (float) r4
            r21 = r0
            r11 = -1
            r20 = 0
            r10 = 0
            r5 = 0
            r17 = 0
        L_0x00eb:
            r1 = r20
            r0 = r23
            if (r1 >= r0) goto L_0x022a
            int r4 = r10 + r7
            int r3 = r5 + r6
            int r1 = r9.A0C
            int r0 = r1 * r10
            float r0 = (float) r0
            float r19 = r22 + r0
            int r0 = r1 * r5
            float r0 = (float) r0
            float r18 = r21 + r0
            r0 = r27
            if (r3 < r0) goto L_0x01a9
            r0 = r25
            if (r3 > r0) goto L_0x01a9
            float r0 = (float) r1
            float r32 = r19 + r0
            float r33 = r18 + r0
            android.graphics.Canvas$EdgeType r34 = android.graphics.Canvas.EdgeType.BW
            r30 = r19
            r31 = r18
            boolean r0 = r29.quickReject(r30, r31, r32, r33, r34)
            if (r0 != 0) goto L_0x01a9
            r13 = r4 & r24
            X.6TZ r12 = r9.A09
            int r14 = r8.A0G
            X.67z r2 = r9.A08
            r15 = 0
            r2.A03 = r15
            r1 = 0
            r2.A05 = r1
            r2.A04 = r1
        L_0x012a:
            X.6VI[] r0 = r2.A06
            r0[r15] = r1
            int r15 = r15 + 1
            r16 = 4
            r0 = r16
            if (r15 < r0) goto L_0x012a
            r2.A00 = r13
            r2.A01 = r3
            r2.A02 = r14
            X.6VI r1 = r12.A06
        L_0x013e:
            int r0 = r1.A04
            if (r0 >= r14) goto L_0x0158
            android.graphics.Bitmap r0 = r1.A02()
            if (r0 == 0) goto L_0x014a
            r2.A04 = r1
        L_0x014a:
            int r0 = r1.A04
            int r15 = X.C90484aE.A07(r14, r0, r13, r3)
            X.6VI[] r0 = r1.A09
            r0 = r0[r15]
            if (r0 == 0) goto L_0x0158
            r1 = r0
            goto L_0x013e
        L_0x0158:
            int r0 = r1.A04
            if (r0 != r14) goto L_0x016c
            int r0 = r1.A02
            if (r0 != r13) goto L_0x016c
            int r0 = r1.A03
            if (r0 != r3) goto L_0x016c
            android.graphics.Bitmap r0 = r1.A02()
            if (r0 == 0) goto L_0x01ff
            r2.A05 = r1
        L_0x016c:
            X.6VI r1 = r2.A05
            if (r1 != 0) goto L_0x0174
            X.6VI r1 = r2.A04
            if (r1 == 0) goto L_0x017f
        L_0x0174:
            X.AnonymousClass6TZ.A01(r12, r1)
            X.6VI r0 = r12.A05
            r0.A07 = r1
            r1.A06 = r0
            r12.A05 = r1
        L_0x017f:
            X.67z r2 = r9.A08
            X.6VI r0 = r2.A05
            if (r0 == 0) goto L_0x01f2
            r14 = 1
            r1 = 1
        L_0x0187:
            int r0 = r2.A03
            if (r0 != r1) goto L_0x0190
            java.util.ArrayList r0 = A0C
            X.C90474aD.A1H(r9, r0)
        L_0x0190:
            X.67z r12 = r9.A08
            r2 = r29
            r1 = r19
            r0 = r18
            r12.A00(r2, r1, r0)
            int r0 = r9.A01
            int r0 = r0 + 1
            r9.A01 = r0
            if (r14 != 0) goto L_0x01a9
            int r0 = r9.A00
            int r0 = r0 + 1
            r9.A00 = r0
        L_0x01a9:
            if (r10 == r5) goto L_0x01ee
            if (r10 >= 0) goto L_0x01e8
            int r0 = -r10
            if (r0 == r5) goto L_0x01ee
        L_0x01b0:
            r2 = r17
        L_0x01b2:
            int r4 = r4 + r2
            int r3 = r3 + r11
            r0 = r27
            if (r0 > r3) goto L_0x01cc
            r0 = r25
            if (r3 > r0) goto L_0x01cc
            r0 = r28
            if (r0 > r4) goto L_0x01cc
            r0 = r26
            if (r4 > r0) goto L_0x01cc
            int r10 = r10 + r2
            int r5 = r5 + r11
            r17 = r2
        L_0x01c8:
            int r20 = r20 + 1
            goto L_0x00eb
        L_0x01cc:
            r4 = r2 & 1
            r3 = 1
            int r4 = r4 << r3
            int r4 = r4 - r3
            int r4 = r4 * r10
            int r0 = r11 >> 1
            r0 = r0 & 1
            int r4 = r4 + r0
            r1 = r11 & 1
            int r1 = r1 << r3
            int r1 = r1 - r3
            int r1 = r1 * r5
            int r0 = -r2
            r17 = r0
            int r0 = r0 >> 1
            r0 = r0 & 1
            int r1 = r1 + r0
            int r11 = -r11
            r10 = r4
            r5 = r1
            goto L_0x01c8
        L_0x01e8:
            if (r10 <= 0) goto L_0x01b0
            int r0 = 1 - r5
            if (r10 != r0) goto L_0x01b0
        L_0x01ee:
            int r2 = -r11
            r11 = r17
            goto L_0x01b2
        L_0x01f2:
            r14 = 0
            int r0 = r2.A03
            r1 = 1
            if (r0 == r1) goto L_0x0187
            int r1 = r8.A0G
            r0 = 2
            r9.A09(r13, r3, r1, r0)
            goto L_0x0190
        L_0x01ff:
            int r0 = r1.A0B
            r2.A03 = r0
            X.6VI[] r14 = r1.A09
            X.6VI[] r15 = r2.A06
            r1 = 0
            r0 = r16
            java.lang.System.arraycopy(r14, r1, r15, r1, r0)
        L_0x020d:
            r15 = r14[r1]
            if (r15 == 0) goto L_0x021c
            X.AnonymousClass6TZ.A01(r12, r15)
            X.6VI r0 = r12.A05
            r0.A07 = r15
            r15.A06 = r0
            r12.A05 = r15
        L_0x021c:
            int r1 = r1 + 1
            r0 = 4
            if (r1 >= r0) goto L_0x016c
            goto L_0x020d
        L_0x0222:
            java.lang.String r0 = "INVALID_ZOOM_LEVEL"
            goto L_0x0093
        L_0x0226:
            java.lang.String r0 = "INVALID_ZOOM_LEVEL"
            goto L_0x001b
        L_0x022a:
            int r1 = r9.A01
            int r0 = r9.A07
            if (r1 <= r0) goto L_0x0248
            r9.A07 = r1
            int[] r2 = r9.A0B
            java.util.ArrayList r0 = X.C97814qJ.A07
            X.C90474aD.A1H(r9, r0)
            X.C97814qJ.A00(r2)
            X.6TZ r1 = r9.A09
            r0 = 0
            r0 = r2[r0]
            r1.A01 = r0
            r0 = 1
            r0 = r2[r0]
            r1.A02 = r0
        L_0x0248:
            r29.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97654q3.A06(android.graphics.Canvas):void");
    }

    public void A08() {
        AnonymousClass6TZ r2 = this.A09;
        AnonymousClass6VI r1 = r2.A04;
        while (r1 != null) {
            AnonymousClass6VI r0 = r1.A07;
            r1.A03();
            r1 = r0;
        }
        AnonymousClass6VI r12 = new AnonymousClass6VI(-1, -1);
        r2.A06 = r12;
        r12.A02 = 0;
        r12.A03 = 0;
        r12.A04 = 0;
        r2.A04 = r12;
        r2.A05 = r12;
        r2.A00 = 0;
    }

    public C97654q3(C139266jV r7, AnonymousClass6TZ r8) {
        super(r7);
        this.A09 = r8;
        ActivityManager activityManager = (ActivityManager) r7.A0O.getSystemService("activity");
        if (activityManager != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            if (!memoryInfo.lowMemory && memoryInfo.availMem >= 500000000 && memoryInfo.totalMem >= 3000000000L) {
                return;
            }
        }
        AnonymousClass6VI.A0D = Bitmap.Config.RGB_565;
    }

    public void A05(boolean z) {
        super.A05(z);
    }
}
