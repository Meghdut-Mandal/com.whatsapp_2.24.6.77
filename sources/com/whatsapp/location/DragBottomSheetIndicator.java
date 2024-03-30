package com.whatsapp.location;

import X.AnonymousClass1QZ;
import X.C18700tb;
import X.C36341k9;
import X.C36421kH;
import X.C36441kJ;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;

public class DragBottomSheetIndicator extends View implements C18700tb {
    public AnonymousClass1QZ A00;
    public float A01;
    public float A02;
    public long A03;
    public long A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Paint A08;
    public final Paint A09;
    public final Path A0A;

    private void A00(Context context) {
        Paint paint = this.A08;
        C36421kH.A0q(paint);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setStrokeWidth(C36341k9.A00(context) * 2.0f);
        paint.setColor(-1);
        Paint paint2 = this.A09;
        C36421kH.A0q(paint2);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeWidth(C36341k9.A00(context) * 4.0f);
        paint2.setColor(855638016);
    }

    public void A01() {
        if (!this.A06) {
            this.A06 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void setExpanded(boolean z) {
        this.A05 = z;
        this.A01 = 0.0f;
        this.A02 = 0.0f;
        invalidate();
    }

    public void setOffset(float f) {
        this.A04 = this.A03;
        this.A02 = this.A01;
        this.A03 = SystemClock.elapsedRealtime();
        this.A01 = f;
        invalidate();
    }

    public void setUpdating(boolean z) {
        this.A07 = z;
        if (z) {
            invalidate();
        }
    }

    public DragBottomSheetIndicator(Context context) {
        super(context);
        A01();
        this.A08 = C36441kJ.A0L(1);
        this.A09 = C36441kJ.A0L(1);
        this.A0A = C36441kJ.A0M();
        A00(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006f, code lost:
        if (r7.A05 != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0073, code lost:
        if (r4 >= 0.0f) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0077, code lost:
        if (r7.A05 != false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0079, code lost:
        r4 = (float) (((double) r4) * 0.25d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0088, code lost:
        if (r4 > 0.0f) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            super.onDraw(r8)
            float r5 = r7.A01
            float r0 = r7.A02
            float r4 = r5 - r0
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r4 = r4 * r0
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r7.A04
            long r2 = r2 - r0
            float r0 = (float) r2
            float r4 = r4 / r0
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0067
            r4 = 0
        L_0x001f:
            int r6 = r7.getPaddingLeft()
            int r2 = r7.getPaddingTop()
            int r5 = X.AnonymousClass000.A0B(r7)
            int r1 = X.AnonymousClass000.A0A(r7)
            int r0 = r1 + r2
            int r0 = r0 / 2
            float r3 = (float) r0
            int r1 = r1 - r2
            float r2 = (float) r1
            boolean r1 = r7.A05
            r0 = 1056964608(0x3f000000, float:0.5)
            if (r1 == 0) goto L_0x003e
            r0 = -1090519040(0xffffffffbf000000, float:-0.5)
        L_0x003e:
            float r0 = r0 + r4
            float r2 = r2 * r0
            float r2 = r2 + r3
            android.graphics.Path r1 = r7.A0A
            r1.reset()
            float r0 = (float) r6
            r1.moveTo(r0, r2)
            int r6 = r6 + r5
            int r0 = r6 / 2
            float r0 = (float) r0
            r1.lineTo(r0, r3)
            float r0 = (float) r5
            r1.lineTo(r0, r2)
            android.graphics.Paint r0 = r7.A09
            r8.drawPath(r1, r0)
            android.graphics.Paint r0 = r7.A08
            r8.drawPath(r1, r0)
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x0066
            r7.invalidate()
        L_0x0066:
            return
        L_0x0067:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x007f
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x006d:
            boolean r0 = r7.A05
            if (r0 == 0) goto L_0x0079
        L_0x0071:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x001f
        L_0x0075:
            boolean r0 = r7.A05
            if (r0 == 0) goto L_0x001f
        L_0x0079:
            double r2 = (double) r4
            r0 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r2 = r2 * r0
            float r4 = (float) r2
            goto L_0x001f
        L_0x007f:
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0086
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0075
        L_0x0086:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0071
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.DragBottomSheetIndicator.onDraw(android.graphics.Canvas):void");
    }

    public DragBottomSheetIndicator(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A01();
    }

    public DragBottomSheetIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        this.A08 = C36441kJ.A0L(1);
        this.A09 = C36441kJ.A0L(1);
        this.A0A = C36441kJ.A0M();
        A00(context);
    }

    public DragBottomSheetIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01();
        this.A08 = C36441kJ.A0L(1);
        this.A09 = C36441kJ.A0L(1);
        this.A0A = C36441kJ.A0M();
        A00(context);
    }

    public DragBottomSheetIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        this.A08 = C36441kJ.A0L(1);
        this.A09 = C36441kJ.A0L(1);
        this.A0A = C36441kJ.A0M();
        A00(context);
    }
}
