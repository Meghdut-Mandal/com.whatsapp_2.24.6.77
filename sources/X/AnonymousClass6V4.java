package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.6V4  reason: invalid class name */
public class AnonymousClass6V4 {
    public int A00 = 1;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Bitmap A05;
    public Bitmap A06;
    public Bitmap A07;
    public Bitmap A08;
    public C129196Ft A09;
    public boolean A0A;
    public boolean A0B;
    public final Paint A0C = C36441kJ.A0L(1);
    public final PointF A0D = new PointF();
    public final C117435mG A0E;
    public final AnonymousClass6OT A0F;
    public final AnonymousClass6FV A0G;
    public final C19970wo A0H;

    public static Bitmap A00(Bitmap bitmap, int i, int i2) {
        String str;
        if (bitmap != null && bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        if (bitmap != null) {
            bitmap.recycle();
        }
        if (i <= 0 || i2 <= 0) {
            return null;
        }
        try {
            return C90524aI.A09(i, i2);
        } catch (OutOfMemoryError e) {
            e = e;
            str = "oom trying to create bitmap cache";
            Log.i(str, e);
            return null;
        } catch (NullPointerException e2) {
            e = e2;
            str = "NPE trying to create bitmap cache";
            Log.i(str, e);
            return null;
        }
    }

    public void A03() {
        this.A0B = false;
        this.A0E.A00.invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        if (r6 == r3) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(X.AnonymousClass6V4 r8, boolean r9) {
        /*
            X.6OT r0 = r8.A0F
            android.graphics.RectF r5 = r0.A08
            android.util.DisplayMetrics r1 = r0.A09
            r7 = 0
            if (r5 == 0) goto L_0x0011
            if (r1 == 0) goto L_0x0011
            android.graphics.Bitmap r0 = r8.A05
            if (r0 != 0) goto L_0x0012
            if (r9 != 0) goto L_0x0012
        L_0x0011:
            return r7
        L_0x0012:
            int r0 = r1.widthPixels
            float r2 = (float) r0
            float r0 = r5.width()
            float r2 = r2 / r0
            int r0 = r1.heightPixels
            float r1 = (float) r0
            float r0 = r5.height()
            float r0 = X.C90524aI.A00(r1, r0, r2)
            int r0 = (int) r0
            r4 = 1
            int r6 = java.lang.Math.max(r4, r0)
            android.graphics.Bitmap r0 = r8.A05
            if (r0 == 0) goto L_0x0063
            int r2 = r0.getHeight()
            float r1 = r5.height()
            int r0 = r8.A00
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            if (r2 != r0) goto L_0x0063
            android.graphics.Bitmap r0 = r8.A05
            int r2 = r0.getWidth()
            float r1 = r5.width()
            int r3 = r8.A00
            float r0 = (float) r3
            float r1 = r1 * r0
            int r0 = (int) r1
            if (r2 != r0) goto L_0x0063
            android.graphics.PointF r2 = r8.A0D
            float r1 = r2.x
            float r0 = r5.left
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0063
            float r1 = r2.y
            float r0 = r5.top
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0063
            if (r6 == r3) goto L_0x0011
        L_0x0063:
            r8.A00 = r6
            android.graphics.Bitmap r3 = r8.A05
            float r1 = r5.width()
            int r0 = r8.A00
            float r0 = (float) r0
            float r1 = r1 * r0
            int r2 = (int) r1
            float r1 = r5.height()
            int r0 = r8.A00
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            android.graphics.Bitmap r0 = A00(r3, r2, r0)
            r8.A05 = r0
            android.graphics.PointF r2 = r8.A0D
            float r1 = r5.left
            float r0 = r5.top
            r2.set(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6V4.A01(X.6V4, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        if (r6 == r3) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A02(X.AnonymousClass6V4 r8, boolean r9) {
        /*
            X.6OT r0 = r8.A0F
            android.graphics.RectF r5 = r0.A08
            android.util.DisplayMetrics r1 = r0.A09
            r7 = 0
            if (r5 == 0) goto L_0x0011
            if (r1 == 0) goto L_0x0011
            android.graphics.Bitmap r0 = r8.A06
            if (r0 != 0) goto L_0x0012
            if (r9 != 0) goto L_0x0012
        L_0x0011:
            return r7
        L_0x0012:
            int r0 = r1.widthPixels
            float r2 = (float) r0
            float r0 = r5.width()
            float r2 = r2 / r0
            int r0 = r1.heightPixels
            float r1 = (float) r0
            float r0 = r5.height()
            float r0 = X.C90524aI.A00(r1, r0, r2)
            int r0 = (int) r0
            r4 = 1
            int r6 = java.lang.Math.max(r4, r0)
            android.graphics.Bitmap r0 = r8.A06
            if (r0 == 0) goto L_0x0063
            int r2 = r0.getHeight()
            float r1 = r5.height()
            int r0 = r8.A00
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            if (r2 != r0) goto L_0x0063
            android.graphics.Bitmap r0 = r8.A06
            int r2 = r0.getWidth()
            float r1 = r5.width()
            int r3 = r8.A00
            float r0 = (float) r3
            float r1 = r1 * r0
            int r0 = (int) r1
            if (r2 != r0) goto L_0x0063
            android.graphics.PointF r2 = r8.A0D
            float r1 = r2.x
            float r0 = r5.left
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0063
            float r1 = r2.y
            float r0 = r5.top
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0063
            if (r6 == r3) goto L_0x0011
        L_0x0063:
            r8.A00 = r6
            android.graphics.Bitmap r3 = r8.A06
            float r1 = r5.width()
            int r0 = r8.A00
            float r0 = (float) r0
            float r1 = r1 * r0
            int r2 = (int) r1
            float r1 = r5.height()
            int r0 = r8.A00
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            android.graphics.Bitmap r0 = A00(r3, r2, r0)
            r8.A06 = r0
            android.graphics.PointF r2 = r8.A0D
            float r1 = r5.left
            float r0 = r5.top
            r2.set(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6V4.A02(X.6V4, boolean):boolean");
    }

    public void A04() {
        Bitmap bitmap;
        C131646Px r1;
        Bitmap bitmap2 = this.A06;
        if (bitmap2 != null) {
            bitmap2.eraseColor(0);
        }
        Bitmap bitmap3 = this.A05;
        if (bitmap3 != null) {
            bitmap3.eraseColor(0);
        }
        ArrayList A012 = this.A0G.A01();
        if (!A012.isEmpty()) {
            A01(this, true);
            A02(this, true);
            Iterator it = A012.iterator();
            while (it.hasNext()) {
                AnonymousClass5Ci r12 = (AnonymousClass5Ci) it.next();
                if (r12.A03 instanceof C104985Cu) {
                    bitmap = this.A06;
                } else {
                    bitmap = this.A05;
                }
                PointF pointF = this.A0D;
                int i = this.A00;
                C36331k8.A1I(bitmap, pointF);
                r12.A01 = bitmap;
                r12.A02 = pointF;
                r12.A00 = i;
                r12.A05 = false;
                if (!(bitmap == null || (r1 = r12.A03) == null)) {
                    r1.A03(bitmap, pointF, i);
                    Canvas canvas = r1.A00;
                    if (canvas != null) {
                        r1.A04(canvas);
                    }
                }
            }
        }
    }

    public AnonymousClass6V4(C19970wo r2, C117435mG r3, AnonymousClass6OT r4, AnonymousClass6FV r5) {
        this.A0H = r2;
        this.A0F = r4;
        this.A0G = r5;
        this.A0E = r3;
    }
}
