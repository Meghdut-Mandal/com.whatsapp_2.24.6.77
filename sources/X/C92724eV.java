package X;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.4eV  reason: invalid class name and case insensitive filesystem */
public final class C92724eV extends FrameLayout {
    public int A00;
    public int A01;
    public FrameLayout A02;
    public C92304dT A03;
    public C91144bX A04;
    public C91144bX A05;
    public int A06;
    public int A07;
    public int A08;
    public C91144bX A09;
    public boolean A0A;
    public final int A0B;
    public final Integer A0C;
    public final C92734eW A0D;
    public final Integer A0E;

    public void dispatchDraw(Canvas canvas) {
        C91144bX r4;
        AnonymousClass00C.A0D(canvas, 0);
        super.dispatchDraw(canvas);
        if (this.A0E != C023109s.A0G && (r4 = this.A09) != null && this.A0A) {
            int A012 = (int) (C36441kJ.A01(this) / 2.0f);
            int i = this.A06;
            r4.setBounds(A012 - i, this.A08, A012 + i, this.A07);
            r4.draw(canvas);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0123, code lost:
        if (r4 == r1) goto L_0x0125;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C92724eV(android.content.Context r6, X.C92734eW r7, X.C1271967i r8, X.AnonymousClass6WB r9) {
        /*
            r5 = this;
            r5.<init>(r6)
            r5.A0D = r7
            java.lang.Integer r4 = r9.A0A
            X.AnonymousClass00C.A07(r4)
            r5.A0E = r4
            java.lang.Integer r0 = r9.A06
            X.AnonymousClass00C.A07(r0)
            r5.A0C = r0
            boolean r1 = X.AnonymousClass6GU.A01(r6, r8)
            r0 = -1
            if (r1 == 0) goto L_0x001d
            r0 = -15787746(0xffffffffff0f191e, float:-1.9021002E38)
        L_0x001d:
            r5.A0B = r0
            java.lang.Integer r3 = X.C023109s.A0G
            if (r4 != r3) goto L_0x00f6
            r1 = 0
            r5.A00 = r1
            r5.A06 = r1
            r5.A08 = r1
            r5.A07 = r1
            r5.A0A = r1
            r0 = 0
            r5.A09 = r0
        L_0x0031:
            r5.A01 = r1
            java.lang.Integer r1 = r5.A0C
            java.lang.Integer r0 = X.C023109s.A0R
            if (r1 != r0) goto L_0x00d7
            boolean r1 = X.AnonymousClass6GU.A01(r6, r8)
            r0 = -920329(0xfffffffffff1f4f7, float:NaN)
            if (r1 == 0) goto L_0x0045
            r0 = -15787746(0xffffffffff0f191e, float:-1.9021002E38)
        L_0x0045:
            X.4bX r4 = new X.4bX
            r4.<init>()
            r4.A00(r0)
            int r0 = r5.A00
            float r1 = (float) r0
        L_0x0050:
            float[] r0 = r4.A03
            java.util.Arrays.fill(r0, r1)
            r0 = 1
            r4.A00 = r0
            r4.invalidateSelf()
            r5.setBackground(r4)
            r0 = -1
            android.view.ViewGroup$MarginLayoutParams r2 = new android.view.ViewGroup$MarginLayoutParams
            r2.<init>(r0, r0)
            int r1 = r5.A01
            r0 = 0
            r2.setMargins(r0, r1, r0, r0)
            r5.addView(r7, r2)
            X.4bX r2 = new X.4bX
            r2.<init>()
            r5.A05 = r2
            int r0 = r5.A00
            float r1 = (float) r0
            float[] r0 = r2.A03
            java.util.Arrays.fill(r0, r1)
            r0 = 1
            r2.A00 = r0
            r2.invalidateSelf()
            r0 = -1728053248(0xffffffff99000000, float:-6.617445E-24)
            X.AnonymousClass6GU.A01(r6, r8)
            android.graphics.Color.alpha(r0)
            X.4bX r0 = r5.A05
            if (r0 == 0) goto L_0x0092
            r0 = 0
            r5.setForeground(r0)
        L_0x0092:
            X.6bI r3 = r9.A03
            X.4bX r2 = new X.4bX
            r2.<init>()
            r5.A04 = r2
            int r0 = r5.A00
            float r1 = (float) r0
            float[] r0 = r2.A03
            java.util.Arrays.fill(r0, r1)
            r1 = 1
            r2.A00 = r1
            r2.invalidateSelf()
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r6)
            r5.A02 = r0
            r5.addView(r0, r1)
            if (r3 == 0) goto L_0x00c9
            boolean r0 = X.AnonymousClass6GU.A01(r6, r8)
            if (r0 == 0) goto L_0x00d4
            int r1 = r3.A00
        L_0x00bd:
            X.4bX r0 = r5.A04
            if (r0 != 0) goto L_0x00ca
            android.widget.FrameLayout r1 = r5.A02
            if (r1 == 0) goto L_0x00c9
            r0 = 0
        L_0x00c6:
            r1.setForeground(r0)
        L_0x00c9:
            return
        L_0x00ca:
            r0.A00(r1)
            android.widget.FrameLayout r1 = r5.A02
            if (r1 == 0) goto L_0x00c9
            X.4bX r0 = r5.A04
            goto L_0x00c6
        L_0x00d4:
            int r1 = r3.A01
            goto L_0x00bd
        L_0x00d7:
            int r3 = r5.A0B
            int r2 = r5.A00
            X.4dT r0 = new X.4dT
            r0.<init>(r6, r8, r3, r2)
            r5.A03 = r0
            X.C90474aD.A0z(r0)
            X.4dT r1 = r5.A03
            r0 = 0
            r5.addView(r1, r0)
            X.4bX r4 = new X.4bX
            r4.<init>()
            r4.A00(r3)
            float r1 = (float) r2
            goto L_0x0050
        L_0x00f6:
            r0 = 16
            float r0 = (float) r0
            float r0 = X.C109525Xx.A00(r6, r0)
            int r0 = (int) r0
            r5.A00 = r0
            r0 = 1099956224(0x41900000, float:18.0)
            float r0 = X.C109525Xx.A00(r6, r0)
            int r0 = (int) r0
            r5.A06 = r0
            r0 = 1086324736(0x40c00000, float:6.0)
            float r0 = X.C109525Xx.A00(r6, r0)
            int r0 = (int) r0
            r5.A08 = r0
            r0 = 1092616192(0x41200000, float:10.0)
            float r0 = X.C109525Xx.A00(r6, r0)
            int r0 = (int) r0
            r5.A07 = r0
            java.lang.Integer r2 = r9.A08
            java.lang.Integer r1 = X.C023109s.A00
            r0 = 1
            if (r2 != r1) goto L_0x0155
            r2 = r4
            if (r4 != r1) goto L_0x0157
        L_0x0125:
            r0 = r0 ^ 1
            r5.A0A = r0
            X.4bX r2 = new X.4bX
            r2.<init>()
            X.5Tp r0 = X.C108465Tp.BOTTOM_SHEET_HANDLE
            int r0 = X.AnonymousClass6GU.A00(r6, r0, r8)
            r2.A00(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = X.C109525Xx.A00(r6, r0)
            int r0 = (int) r0
            float r1 = (float) r0
            float[] r0 = r2.A03
            java.util.Arrays.fill(r0, r1)
            r0 = 1
            r2.A00 = r0
            r2.invalidateSelf()
            r5.A09 = r2
            r0 = 1098907648(0x41800000, float:16.0)
            float r0 = X.C109525Xx.A00(r6, r0)
            int r1 = (int) r0
            goto L_0x0031
        L_0x0155:
            java.lang.Integer r3 = X.C023109s.A0C
        L_0x0157:
            if (r2 == r3) goto L_0x0125
            r0 = 0
            goto L_0x0125
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92724eV.<init>(android.content.Context, X.4eW, X.67i, X.6WB):void");
    }

    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        int size = View.MeasureSpec.getSize(i2);
        if (this.A0E == C023109s.A0R) {
            i3 = Integer.MIN_VALUE;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size, i3));
        C92774ec contentPager = this.A0D.getContentPager();
        int measuredWidth = contentPager.getMeasuredWidth();
        int measuredHeight = contentPager.getMeasuredHeight() + this.A01;
        C92304dT r0 = this.A03;
        if (r0 != null) {
            r0.A00(measuredWidth, measuredHeight);
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }
}
