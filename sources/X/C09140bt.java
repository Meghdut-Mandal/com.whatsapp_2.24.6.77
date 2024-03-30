package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ListView;

/* renamed from: X.0bt  reason: invalid class name and case insensitive filesystem */
public class C09140bt implements View.OnTouchListener {
    public static final int A0G = ViewConfiguration.getTapTimeout();
    public boolean A00;
    public int A01;
    public Runnable A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public float[] A07 = {Float.MAX_VALUE, Float.MAX_VALUE};
    public float[] A08 = {Float.MAX_VALUE, Float.MAX_VALUE};
    public float[] A09 = {0.0f, 0.0f};
    public float[] A0A = {0.0f, 0.0f};
    public float[] A0B = {0.0f, 0.0f};
    public final View A0C;
    public final Interpolator A0D = new AccelerateInterpolator();
    public final ListView A0E;
    public final C07110Wj A0F = new C07110Wj();

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0072, code lost:
        if (r6.A04 != false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008b, code lost:
        if (r6.A04 != false) goto L_0x0015;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private float A00(float r7, float r8, float r9, int r10) {
        /*
            r6 = this;
            float[] r0 = r6.A0A
            r1 = r0[r10]
            float[] r0 = r6.A07
            r4 = r0[r10]
            float r1 = r1 * r8
            r3 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0077
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = r1
            if (r0 >= 0) goto L_0x0077
            r4 = 0
        L_0x0014:
            r1 = 0
        L_0x0015:
            float r8 = r8 - r7
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0075
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0075
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0070
            float r8 = r8 / r4
            float r2 = r2 - r8
        L_0x0026:
            float r2 = r2 - r1
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0063
            android.view.animation.Interpolator r1 = r6.A0D
            float r0 = -r2
            float r0 = r1.getInterpolation(r0)
            float r5 = -r0
        L_0x0033:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x005c
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x003d:
            r4 = 0
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x009d
            float[] r0 = r6.A0B
            r3 = r0[r10]
            float[] r0 = r6.A09
            r2 = r0[r10]
            float[] r0 = r6.A08
            r4 = r0[r10]
            float r3 = r3 * r9
            if (r1 <= 0) goto L_0x008e
            float r5 = r5 * r3
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x009d
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r4 = r5
            if (r0 >= 0) goto L_0x009d
            return r2
        L_0x005c:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x003d
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x003d
        L_0x0063:
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x006e
            android.view.animation.Interpolator r0 = r6.A0D
            float r5 = r0.getInterpolation(r2)
            goto L_0x0033
        L_0x006e:
            r5 = 0
            goto L_0x003d
        L_0x0070:
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x0075
            goto L_0x0026
        L_0x0075:
            r2 = 0
            goto L_0x0026
        L_0x0077:
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0014
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0014
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0089
            float r0 = r7 / r4
            float r1 = r1 - r0
            goto L_0x0015
        L_0x0089:
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x0014
            goto L_0x0015
        L_0x008e:
            float r1 = -r5
            float r1 = r1 * r3
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0097
            r1 = r4
        L_0x0095:
            float r4 = -r1
            return r4
        L_0x0097:
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0095
            r1 = r2
            goto L_0x0095
        L_0x009d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09140bt.A00(float, float, float, int):float");
    }

    public static void A01(C09140bt r7) {
        if (r7.A06) {
            r7.A04 = false;
            return;
        }
        C07110Wj r72 = r7.A0F;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i = (int) (currentAnimationTimeMillis - r72.A06);
        int i2 = r72.A03;
        if (i <= i2) {
            i2 = i;
            if (i < 0) {
                i2 = 0;
            }
        }
        r72.A02 = i2;
        r72.A00 = C07110Wj.A00(r72, currentAnimationTimeMillis);
        r72.A07 = currentAnimationTimeMillis;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r6 = r8.A0E;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02() {
        /*
            r8 = this;
            X.0Wj r0 = r8.A0F
            float r1 = r0.A01
            float r0 = java.lang.Math.abs(r1)
            float r1 = r1 / r0
            int r7 = (int) r1
            if (r7 == 0) goto L_0x0033
            android.widget.ListView r6 = r8.A0E
            int r5 = r6.getCount()
            r4 = 0
            if (r5 == 0) goto L_0x0033
            int r3 = r6.getChildCount()
            int r2 = r6.getFirstVisiblePosition()
            int r1 = r2 + r3
            r0 = 1
            if (r7 <= 0) goto L_0x0035
            if (r1 < r5) goto L_0x0042
            int r3 = r3 - r0
            android.view.View r0 = r6.getChildAt(r3)
            int r1 = r0.getBottom()
            int r0 = r6.getHeight()
            if (r1 > r0) goto L_0x0042
        L_0x0033:
            r0 = 0
            return r0
        L_0x0035:
            if (r2 > 0) goto L_0x0042
            android.view.View r0 = r6.getChildAt(r4)
            int r0 = r0.getTop()
            if (r0 < 0) goto L_0x0042
            goto L_0x0033
        L_0x0042:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09140bt.A02():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r1 != 3) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            boolean r0 = r6.A05
            r5 = 0
            if (r0 == 0) goto L_0x0014
            int r1 = r8.getActionMasked()
            r4 = 1
            if (r1 == 0) goto L_0x0015
            if (r1 == r4) goto L_0x006e
            r0 = 2
            if (r1 == r0) goto L_0x0019
            r0 = 3
            if (r1 == r0) goto L_0x006e
        L_0x0014:
            return r5
        L_0x0015:
            r6.A00 = r4
            r6.A03 = r5
        L_0x0019:
            float r2 = r8.getX()
            int r0 = r7.getWidth()
            float r1 = (float) r0
            android.view.View r3 = r6.A0C
            int r0 = r3.getWidth()
            float r0 = (float) r0
            r6.A00(r2, r1, r0, r5)
            float r2 = r8.getY()
            int r0 = r7.getHeight()
            float r1 = (float) r0
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r1 = r6.A00(r2, r1, r0, r4)
            X.0Wj r0 = r6.A0F
            r0.A01 = r1
            boolean r0 = r6.A04
            if (r0 != 0) goto L_0x0014
            boolean r0 = r6.A02()
            if (r0 == 0) goto L_0x0014
            java.lang.Runnable r2 = r6.A02
            if (r2 != 0) goto L_0x0057
            X.0hR r2 = new X.0hR
            r2.<init>(r6)
            r6.A02 = r2
        L_0x0057:
            r6.A04 = r4
            r6.A06 = r4
            boolean r0 = r6.A03
            if (r0 != 0) goto L_0x006a
            int r0 = r6.A01
            if (r0 <= 0) goto L_0x006a
            long r0 = (long) r0
            X.C011504z.A08(r3, r2, r0)
        L_0x0067:
            r6.A03 = r4
            return r5
        L_0x006a:
            r2.run()
            goto L_0x0067
        L_0x006e:
            A01(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09140bt.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public C09140bt(ListView listView) {
        this.A0C = listView;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.A08;
        float f2 = ((float) ((int) ((1575.0f * f) + 0.5f))) / 1000.0f;
        fArr[0] = f2;
        fArr[1] = f2;
        float[] fArr2 = this.A09;
        float f3 = ((float) ((int) ((f * 315.0f) + 0.5f))) / 1000.0f;
        fArr2[0] = f3;
        fArr2[1] = f3;
        float[] fArr3 = this.A07;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.A0A;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.A0B;
        float f4 = 1.0f / 1000.0f;
        fArr5[0] = f4;
        fArr5[1] = f4;
        this.A01 = A0G;
        C07110Wj r1 = this.A0F;
        r1.A04 = 500;
        r1.A03 = 500;
        this.A0E = listView;
    }
}
