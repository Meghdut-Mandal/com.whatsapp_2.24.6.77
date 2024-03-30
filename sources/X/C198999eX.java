package X;

import android.graphics.Matrix;
import android.graphics.Point;
import android.hardware.Camera;

/* renamed from: X.9eX  reason: invalid class name and case insensitive filesystem */
public class C198999eX {
    public int A00;
    public Camera A01;
    public C157797eh A02;
    public C114795hq A03;
    public boolean A04;
    public final AnonymousClass9WX A05;
    public final C200199gr A06;
    public volatile boolean A07;
    public volatile boolean A08;
    public volatile boolean A09;
    public volatile boolean A0A;

    public static void A00(Point point, C157797eh r6, C198999eX r7, Integer num) {
        if (r6 != null) {
            C114795hq r1 = r7.A03;
            if (!(point == null || r1 == null)) {
                float[] fArr = {(float) point.x, (float) point.y};
                Matrix matrix = r1.A00;
                Matrix A0B = C90524aI.A0B();
                matrix.invert(A0B);
                A0B.mapPoints(fArr);
                point.set((int) fArr[0], (int) fArr[1]);
            }
            C202399lk.A00(new C1503374w(r6, num, point, 17));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        if (X.C165607th.A1X(r1, 6) != false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r5 = this;
            X.9gr r1 = r5.A06
            java.lang.String r0 = "Setting focus mode for video must happen on the Optic thread."
            r1.A06(r0)
            boolean r0 = r5.A09
            if (r0 == 0) goto L_0x0015
            r0 = 1
            r5.A0A = r0
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x0016
            r0 = 0
            r5.A04 = r0
        L_0x0015:
            return
        L_0x0016:
            X.9WX r1 = r5.A05
            int r0 = r5.A00
            X.88o r4 = r1.A00(r0)
            X.88i r1 = r4.A00
            android.graphics.Rect r0 = X.C202799mg.A00
            X.9Ci r0 = X.C198429dX.A0q
            java.util.List r1 = X.C198429dX.A03(r0, r1)
            r3 = 3
            boolean r0 = X.C165607th.A1X(r1, r3)
            if (r0 != 0) goto L_0x0036
            r3 = 6
            boolean r0 = X.C165607th.A1X(r1, r3)
            if (r0 == 0) goto L_0x0041
        L_0x0036:
            X.9Up r2 = r4.A00
            X.9Cj r1 = X.C201049ih.A0C
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.A01(r1, r0)
        L_0x0041:
            r4.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C198999eX.A01():void");
    }

    public C198999eX(AnonymousClass9WX r1, C200199gr r2) {
        this.A06 = r2;
        this.A05 = r1;
    }
}
