package X;

import android.graphics.Rect;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* renamed from: X.9mL  reason: invalid class name and case insensitive filesystem */
public class C202639mL {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public Rect A04;
    public Rect A05;
    public C1692888m A06;
    public C1692988n A07;
    public C198429dX A08;
    public List A09;
    public List A0A;
    public boolean A0B;
    public MeteringRectangle[] A0C;
    public MeteringRectangle[] A0D;
    public final Handler A0E = new Handler(Looper.getMainLooper(), new C23167B8b(this, 1));
    public final AnonymousClass9VB A0F = new AnonymousClass9VB();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r11 < r10) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r11 == r10) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static float A00(float r7, float r8, float r9, float r10, float r11) {
        /*
            r6 = 0
            r5 = 1
            int r0 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x000b
            int r0 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            r3 = 0
            if (r0 >= 0) goto L_0x000c
        L_0x000b:
            r3 = 1
        L_0x000c:
            int r0 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0015
            int r0 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            r2 = 1
            if (r0 != 0) goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            if (r3 != 0) goto L_0x002f
            if (r2 != 0) goto L_0x002f
            int r0 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x002e
            int r0 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x002e
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0027
            return r11
        L_0x0027:
            float r7 = r7 - r8
            float r9 = r9 - r8
            float r7 = r7 / r9
            float r11 = r11 - r10
            float r7 = r7 * r11
            float r7 = r7 + r10
            return r7
        L_0x002e:
            return r10
        L_0x002f:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            java.lang.String r1 = ""
            if (r3 == 0) goto L_0x0076
            java.lang.String r0 = "invalid range bounds"
        L_0x0039:
            r4.append(r0)
            if (r3 == 0) goto L_0x0074
            if (r2 == 0) goto L_0x0074
            java.lang.String r0 = " & "
        L_0x0042:
            r4.append(r0)
            if (r2 == 0) goto L_0x0049
            java.lang.String r1 = "zero source range"
        L_0x0049:
            r4.append(r1)
            java.lang.String r3 = "Camera2Device"
            java.util.Locale r2 = java.util.Locale.US
            r0 = 6
            java.lang.Object[] r1 = new java.lang.Object[r0]
            X.AnonymousClass000.A1I(r1, r7, r6)
            X.AnonymousClass000.A1I(r1, r8, r5)
            r0 = 2
            X.AnonymousClass000.A1I(r1, r9, r0)
            r0 = 3
            X.AnonymousClass000.A1I(r1, r10, r0)
            r0 = 4
            X.AnonymousClass000.A1I(r1, r11, r0)
            r0 = 5
            X.C90514aH.A1Q(r4, r1, r0)
            java.lang.String r0 = "Projecting zoom value %.3f from [%.2f, %.2f] to [%.2f, %.2f] failed - %s"
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)
            X.C202389lj.A02(r3, r0)
            r7 = 0
            return r7
        L_0x0074:
            r0 = r1
            goto L_0x0042
        L_0x0076:
            r0 = r1
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202639mL.A00(float, float, float, float, float):float");
    }

    public static float A01(C202639mL r9, float f) {
        float A012;
        Object obj;
        List list = r9.A0A;
        List list2 = r9.A09;
        if (list == null || list2 == null) {
            return 0.0f;
        }
        float A002 = A00(f, -1.0f, 1.0f, (float) (-C36431kI.A07(list2)), (float) C36431kI.A07(list));
        double d = (double) A002;
        int floor = (int) Math.floor(d);
        int ceil = (int) Math.ceil(d);
        if (A002 >= 0.0f) {
            A012 = C165577te.A01(list, floor) / 100.0f;
            obj = list.get(ceil);
        } else {
            A012 = C165577te.A01(list2, -floor) / 100.0f;
            obj = list2.get(-ceil);
        }
        return A00(A002, (float) floor, (float) ceil, A012, C36441kJ.A03(obj) / 100.0f);
    }

    public static MeteringRectangle[] A03(C202639mL r3, MeteringRectangle[] meteringRectangleArr) {
        C198429dX r0 = r3.A08;
        C1692888m r1 = r3.A06;
        Rect rect = r3.A04;
        if (r0 == null || !r3.A0B) {
            if (r1 == null || rect == null) {
                throw AnonymousClass001.A09("Creating Metering Rects for zoom with mCameraSettings or mCropRectangle null.");
            } else if (C201049ih.A02(C201049ih.A0z, r1) != 0) {
                return new MeteringRectangle[]{new MeteringRectangle(new Rect(0, 0, rect.width(), rect.height()), 0)};
            }
        }
        return meteringRectangleArr;
    }

    public float A04() {
        C1692888m r1 = this.A06;
        if (r1 == null) {
            return -1.0f;
        }
        return C36441kJ.A03(C201049ih.A04(C201049ih.A0s, r1));
    }

    public int A05() {
        C1692888m r1 = this.A06;
        if (r1 == null) {
            return 0;
        }
        return C201049ih.A02(C201049ih.A0z, r1);
    }

    public static void A02(Rect rect, Rect rect2, float f) {
        int width = rect.width();
        int height = rect.height();
        double d = ((double) f) * 2.0d;
        int i = (int) (((double) width) / d);
        int i2 = (int) (((double) height) / d);
        int i3 = width / 2;
        int i4 = height / 2;
        rect2.set(i3 - i, i4 - i2, i3 + i, i4 + i2);
    }
}
