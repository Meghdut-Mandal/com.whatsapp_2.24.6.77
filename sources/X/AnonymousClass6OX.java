package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* renamed from: X.6OX  reason: invalid class name */
public class AnonymousClass6OX {
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public float A02 = 0.0f;
    public float A03 = 0.0f;
    public int A04;
    public int A05 = 0;
    public int A06;
    public int A07;
    public int A08;
    public VelocityTracker A09 = null;
    public AnonymousClass7cX A0A = null;
    public C158117fp A0B = null;
    public C158127fq A0C = null;
    public Integer A0D = null;
    public Integer A0E = C023109s.A00;
    public boolean A0F;
    public Context A0G;
    public GestureDetector A0H;

    public static void A00(AnonymousClass6OX r5) {
        if (!r5.A0F) {
            Context context = r5.A0G;
            if (context != null) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                Method method = C016507c.A00;
                int scaledPagingTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                int scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                r5.A04 = scaledPagingTouchSlop;
                r5.A08 = scaledTouchSlop;
                r5.A07 = scaledMinimumFlingVelocity;
                r5.A06 = scaledMaximumFlingVelocity;
                r5.A0F = true;
                r5.A0F = true;
                r5.A0G = null;
                return;
            }
            throw AnonymousClass001.A09("Init Context must not be null");
        }
    }

    public void A01() {
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        this.A0E = C023109s.A0G;
        VelocityTracker velocityTracker = this.A09;
        this.A09 = null;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r1 != 3) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a3, code lost:
        if ((r13.A05 & 8) == 8) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(android.view.MotionEvent r14) {
        /*
            r13 = this;
            X.7fp r0 = r13.A0B
            r6 = 0
            if (r0 == 0) goto L_0x0105
            int r0 = r13.A05
            if (r0 <= 0) goto L_0x0105
            int r1 = r14.getAction()
            float r4 = r14.getX()
            float r3 = r14.getY()
            r0 = 1
            if (r1 == 0) goto L_0x00df
            if (r1 == r0) goto L_0x00ab
            r10 = 2
            if (r1 == r10) goto L_0x0029
            r0 = 3
            if (r1 == r0) goto L_0x00ab
        L_0x0020:
            java.lang.Integer r1 = r13.A0E
            java.lang.Integer r0 = X.C023109s.A0C
            boolean r0 = X.C36361kB.A1a(r1, r0)
        L_0x0028:
            return r0
        L_0x0029:
            java.lang.Integer r0 = r13.A0E
            java.lang.Integer r5 = X.C023109s.A0G
            if (r0 == r5) goto L_0x0020
            java.lang.Integer r2 = X.C023109s.A0C
            if (r0 == r2) goto L_0x0020
            A00(r13)
            int r12 = r13.A04
            A00(r13)
            int r11 = r13.A08
            float r0 = r13.A00
            float r0 = r4 - r0
            int r9 = (int) r0
            float r0 = r13.A01
            float r0 = r3 - r0
            int r8 = (int) r0
            int r7 = java.lang.Math.abs(r9)
            int r6 = java.lang.Math.abs(r8)
            float r1 = r13.A02
            float r0 = (float) r9
            float r1 = r1 + r0
            r13.A02 = r1
            float r1 = r13.A03
            float r0 = (float) r8
            float r1 = r1 + r0
            r13.A03 = r1
            r0 = 1056964608(0x3f000000, float:0.5)
            if (r6 <= r11) goto L_0x0087
            if (r8 >= 0) goto L_0x007c
            int r0 = r13.A05
            r1 = 1
            r0 = r0 & 1
            if (r0 != r1) goto L_0x00a6
            java.lang.Integer r5 = X.C023109s.A00
        L_0x006a:
            r13.A00 = r4
            r13.A01 = r3
            r13.A0D = r5
            java.lang.Integer r0 = r13.A0E
            r13.A0E = r2
            if (r0 == r2) goto L_0x0020
            X.7fp r0 = r13.A0B
            r0.BWC(r5, r4, r3)
            goto L_0x0020
        L_0x007c:
            if (r8 <= 0) goto L_0x00a6
            int r0 = r13.A05
            r0 = r0 & 2
            if (r0 != r10) goto L_0x00a6
            java.lang.Integer r5 = X.C023109s.A01
            goto L_0x006a
        L_0x0087:
            if (r7 <= r12) goto L_0x0020
            float r1 = (float) r7
            float r1 = r1 * r0
            float r0 = (float) r6
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0020
            if (r9 >= 0) goto L_0x009b
            int r0 = r13.A05
            r1 = 4
            r0 = r0 & 4
            if (r0 != r1) goto L_0x00a6
            r5 = r2
            goto L_0x006a
        L_0x009b:
            if (r9 <= 0) goto L_0x00a6
            int r0 = r13.A05
            r1 = 8
            r0 = r0 & 8
            if (r0 != r1) goto L_0x00a6
            goto L_0x006a
        L_0x00a6:
            r13.A01()
            goto L_0x0020
        L_0x00ab:
            X.7fq r0 = r13.A0C
            if (r0 == 0) goto L_0x0020
            java.lang.Integer r1 = r13.A0E
            java.lang.Integer r0 = X.C023109s.A0G
            if (r1 == r0) goto L_0x0020
            java.lang.Integer r0 = X.C023109s.A0C
            if (r1 == r0) goto L_0x0020
            A00(r13)
            int r1 = r13.A08
            float r0 = r13.A02
            float r0 = java.lang.Math.abs(r0)
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0020
            float r0 = r13.A03
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0020
            X.7fq r0 = r13.A0C
            boolean r0 = r0.Biy(r4, r3)
            if (r0 != 0) goto L_0x0028
            r13.A01()
            return r0
        L_0x00df:
            java.lang.Integer r5 = X.C023109s.A01
            r13.A0E = r5
            r0 = 0
            r13.A02 = r0
            r13.A03 = r0
            X.7cX r2 = r13.A0A
            if (r2 == 0) goto L_0x0106
            com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar r2 = (com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar) r2
            int r0 = r2.getMeasuredHeight()
            int r0 = r0 / 2
            float r0 = (float) r0
            float r1 = X.C90494aF.A01(r3, r0)
            int r0 = r2.A04
            int r0 = r0 * 2
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0106
            r13.A01()
        L_0x0105:
            return r6
        L_0x0106:
            r13.A00 = r4
            r13.A01 = r3
            X.7cX r0 = r13.A0A
            if (r0 == 0) goto L_0x0020
            java.lang.Integer r2 = r13.A0D
            if (r2 != 0) goto L_0x011c
            int r2 = r13.A05
            r1 = 8
            r0 = r2 & 8
            if (r0 != r1) goto L_0x0131
            java.lang.Integer r2 = X.C023109s.A0G
        L_0x011c:
            r13.A00 = r4
            r13.A01 = r3
            r13.A0D = r2
            java.lang.Integer r1 = r13.A0E
            java.lang.Integer r0 = X.C023109s.A0C
            r13.A0E = r0
            if (r1 == r0) goto L_0x0020
            X.7fp r0 = r13.A0B
            r0.BWC(r2, r4, r3)
            goto L_0x0020
        L_0x0131:
            r1 = 2
            r0 = r2 & 2
            if (r0 != r1) goto L_0x0138
            r2 = r5
            goto L_0x011c
        L_0x0138:
            r1 = 1
            r0 = r2 & 1
            if (r0 != r1) goto L_0x0140
            java.lang.Integer r2 = X.C023109s.A00
            goto L_0x011c
        L_0x0140:
            java.lang.Integer r2 = X.C023109s.A0C
            goto L_0x011c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6OX.A02(android.view.MotionEvent):boolean");
    }

    public AnonymousClass6OX(Context context) {
        this.A0H = new GestureDetector(context, new C164527rx(this, 1));
        this.A0G = context;
    }
}
