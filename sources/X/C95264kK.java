package X;

import android.view.View;
import android.view.ViewParent;
import com.whatsapp.R;

/* renamed from: X.4kK  reason: invalid class name and case insensitive filesystem */
public class C95264kK extends AnonymousClass0V6 {
    public final /* synthetic */ AnonymousClass5ND A00;

    public int A03(View view, int i, int i2) {
        return i;
    }

    public int A04(View view, int i, int i2) {
        return i;
    }

    public C95264kK(AnonymousClass5ND r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(android.view.View r15, float r16, float r17) {
        /*
            r14 = this;
            X.5ND r3 = r14.A00
            boolean r2 = r3 instanceof X.AnonymousClass5NC
            if (r2 == 0) goto L_0x0014
            r1 = r3
            X.5NC r1 = (X.AnonymousClass5NC) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r15, r0)
            int r0 = r15.getTop()
            X.AnonymousClass5NC.A02(r15, r1, r0)
        L_0x0014:
            android.view.View r0 = r3.A0C
            if (r0 == 0) goto L_0x00b3
            if (r0 != r15) goto L_0x00b3
            float r4 = java.lang.Math.abs(r16)
            float r0 = java.lang.Math.abs(r17)
            r1 = 1077936128(0x40400000, float:3.0)
            r6 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x016f
            float r0 = r16 / r17
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0035
            r17 = 0
        L_0x0035:
            r5 = 1
            r4 = 0
            int r13 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            int r0 = r15.getWidth()
            if (r13 != 0) goto L_0x0156
            int r1 = r3.A0A(r0)
            r12 = 0
        L_0x0044:
            int r11 = (r17 > r6 ? 1 : (r17 == r6 ? 0 : -1))
            int r0 = r15.getHeight()
            if (r11 != 0) goto L_0x0148
            int r6 = r3.A0B(r0)
        L_0x0050:
            android.util.DisplayMetrics r9 = X.C36361kB.A0B(r3)
            int r0 = r3.A08
            int r0 = X.AnonymousClass000.A05(r1, r0)
            float r0 = (float) r0
            float r7 = r9.density
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            boolean r10 = X.C90484aE.A1Q(r0)
            int r0 = r3.A09
            int r0 = X.AnonymousClass000.A05(r6, r0)
            float r0 = (float) r0
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            boolean r8 = X.C90484aE.A1Q(r0)
            if (r12 != 0) goto L_0x007c
            int r7 = r15.getTop()
            int r0 = r9.heightPixels
            int r0 = r0 / 3
            if (r7 <= r0) goto L_0x0117
        L_0x007c:
            boolean r0 = r3.A0O
            if (r0 == 0) goto L_0x00b4
            r3.A0N = r5
            X.7dA r0 = r3.A0H
            if (r0 == 0) goto L_0x008d
            X.70Z r0 = (X.AnonymousClass70Z) r0
            X.70b r0 = r0.A00
            r0.B76(r5)
        L_0x008d:
            X.4eZ r5 = r3.A0K
            if (r5 == 0) goto L_0x00aa
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131099848(0x7f0600c8, float:1.781206E38)
            int r0 = r1.getColor(r0)
            r5.A0A(r4, r0)
            X.4eZ r1 = r3.A0K
            r0 = 6
            r1.setPlayerElevation(r0)
            X.4eZ r0 = r3.A0K
            r0.setVisibility(r4)
        L_0x00aa:
            if (r2 == 0) goto L_0x00b3
            X.5NC r3 = (X.AnonymousClass5NC) r3
            int r0 = r3.A05
            X.AnonymousClass5NC.A02(r15, r3, r0)
        L_0x00b3:
            return
        L_0x00b4:
            if (r12 == 0) goto L_0x0117
            boolean r0 = r3.A0Y
            if (r0 == 0) goto L_0x0117
            if (r10 == 0) goto L_0x00be
            if (r8 != 0) goto L_0x00d5
        L_0x00be:
            r7 = 1169915904(0x45bb8000, float:6000.0)
            if (r10 == 0) goto L_0x00cb
            float r0 = java.lang.Math.abs(r16)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d5
        L_0x00cb:
            if (r8 == 0) goto L_0x0117
            float r0 = java.lang.Math.abs(r17)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0117
        L_0x00d5:
            r3.A0E = r15
            r3.A0R = r5
            if (r13 != 0) goto L_0x0104
            float r0 = r15.getX()
            int r1 = (int) r0
        L_0x00e0:
            if (r11 != 0) goto L_0x00f6
            float r0 = r15.getY()
            int r5 = (int) r0
        L_0x00e7:
            X.0Z5 r0 = r3.A0Z
            r0.A0H(r15, r1, r5)
            r1 = 3
            X.72p r0 = new X.72p
            r0.<init>(r14, r1)
            r3.postOnAnimation(r0)
            goto L_0x008d
        L_0x00f6:
            int r0 = r15.getHeight()
            if (r11 <= 0) goto L_0x0101
            int r5 = X.C36431kI.A04(r3, r0)
            goto L_0x00e7
        L_0x0101:
            int r5 = r0 * -2
            goto L_0x00e7
        L_0x0104:
            if (r13 <= 0) goto L_0x0110
            int r1 = r15.getWidth()
            int r0 = r3.getWidth()
            int r1 = r1 + r0
            goto L_0x00e0
        L_0x0110:
            int r0 = r15.getHeight()
            int r1 = r0 * -2
            goto L_0x00e0
        L_0x0117:
            boolean r5 = r3.A0O
            X.0Z5 r0 = r3.A0Z
            if (r5 != 0) goto L_0x0129
            r0.A0E(r1, r6)
            r3.A04 = r1
            r3.A05 = r6
        L_0x0124:
            r3.invalidate()
            goto L_0x008d
        L_0x0129:
            r0.A0E(r4, r4)
            X.4eZ r0 = r3.A0K
            if (r0 == 0) goto L_0x0143
            X.5NK r0 = (X.AnonymousClass5NK) r0
            X.3Qq r0 = r0.A0H
            if (r0 == 0) goto L_0x0143
            boolean r0 = r0.A0X()
            if (r0 == 0) goto L_0x0143
            X.4eZ r1 = r3.A0K
            r0 = 100
            r1.A09(r0)
        L_0x0143:
            r3.A04 = r4
            r3.A05 = r4
            goto L_0x0124
        L_0x0148:
            if (r11 <= 0) goto L_0x0151
            int r6 = r3.A0D(r0)
        L_0x014e:
            r12 = 1
            goto L_0x0050
        L_0x0151:
            int r6 = r3.A0C(r0)
            goto L_0x014e
        L_0x0156:
            if (r13 <= 0) goto L_0x0165
            int r1 = r3.getRightOfDraggableArea()
            int r1 = r1 - r0
            int r0 = X.AnonymousClass5ND.A07(r3, r0)
            int r1 = r1 + r0
        L_0x0162:
            r12 = 1
            goto L_0x0044
        L_0x0165:
            int r1 = r3.getLeftOfDraggableArea()
            int r0 = X.AnonymousClass5ND.A07(r3, r0)
            int r1 = r1 - r0
            goto L_0x0162
        L_0x016f:
            float r0 = r17 / r16
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0035
            r16 = 0
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95264kK.A06(android.view.View, float, float):void");
    }

    public void A08(View view, int i, int i2, int i3, int i4) {
        AnonymousClass5ND r2 = this.A00;
        if (!r2.A0P) {
            r2.A0G.A01(view);
        }
        if (r2.A0Z.A02 == 1 && !r2.A0R) {
            r2.A05 = view.getTop();
            r2.A04 = view.getLeft();
        }
    }

    public boolean A09(View view, int i) {
        AnonymousClass5ND r1 = this.A00;
        View view2 = r1.A0C;
        if (view2 == null || view != view2 || r1.A0S) {
            return false;
        }
        return true;
    }

    public int A01(View view) {
        return view.getWidth();
    }

    public int A02(View view) {
        return view.getHeight();
    }

    public void A07(View view, int i) {
        C92754eZ r2;
        ViewParent parent = view.getParent();
        AnonymousClass5ND r3 = this.A00;
        r3.A08 = r3.A04;
        r3.A09 = r3.A05;
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        if (r3.A0O && (r2 = r3.A0K) != null) {
            r2.A0A(r3.getResources().getColor(R.color.f6nameremoved), 0);
            r3.A0K.setPlayerElevation(0);
            r3.A0K.setVisibility(8);
            C65083Qq r0 = ((AnonymousClass5NK) r3.A0K).A0H;
            if (r0 != null && r0.A0X()) {
                r3.A0K.A08();
            }
        }
    }
}
