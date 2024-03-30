package com.google.android.material.timepicker;

import X.AnonymousClass001;
import X.AnonymousClass064;
import X.AnonymousClass7cQ;
import X.C011504z;
import X.C014506h;
import X.C017807p;
import X.C27931Qk;
import X.C36441kJ;
import X.C90494aF;
import X.C90514aH;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import com.whatsapp.R;
import java.util.List;

public class ClockHandView extends View {
    public double A00;
    public float A01;
    public int A02;
    public int A03;
    public boolean A04;
    public boolean A05;
    public final float A06;
    public final int A07;
    public final int A08;
    public final Paint A09;
    public final RectF A0A;
    public final List A0B;
    public final TimeInterpolator A0C;
    public final ValueAnimator A0D;

    public void A00(float f) {
        ValueAnimator valueAnimator = this.A0D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = f % 360.0f;
        this.A01 = f2;
        this.A00 = Math.toRadians((double) (f2 - 90.0f));
        int A072 = C36441kJ.A07(this);
        int width = getWidth() / 2;
        int i = this.A03;
        int i2 = this.A02;
        if (i == 2) {
            i2 = C90514aH.A06((float) i2, 0.66f);
        }
        float f3 = (float) i2;
        double d = this.A00;
        float cos = ((float) width) + (((float) Math.cos(d)) * f3);
        float sin = ((float) A072) + (f3 * ((float) Math.sin(d)));
        RectF rectF = this.A0A;
        float f4 = (float) this.A07;
        rectF.set(cos - f4, sin - f4, cos + f4, sin + f4);
        for (AnonymousClass7cQ r2 : this.A0B) {
            ClockFaceView clockFaceView = (ClockFaceView) r2;
            if (C90494aF.A01(clockFaceView.A00, f2) > 0.001f) {
                clockFaceView.A00 = f2;
                ClockFaceView.A00(clockFaceView);
            }
        }
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas2);
        int A072 = C36441kJ.A07(this);
        int width = getWidth() / 2;
        int i = this.A03;
        int i2 = this.A02;
        if (i == 2) {
            i2 = C90514aH.A06((float) i2, 0.66f);
        }
        float f = (float) width;
        float f2 = (float) i2;
        double d = this.A00;
        float f3 = (float) A072;
        Paint paint = this.A09;
        paint.setStrokeWidth(0.0f);
        int i3 = this.A07;
        canvas2.drawCircle((((float) Math.cos(d)) * f2) + f, (f2 * ((float) Math.sin(d))) + f3, (float) i3, paint);
        double d2 = this.A00;
        double sin = Math.sin(d2);
        double cos = Math.cos(d2);
        double d3 = (double) ((float) (i2 - i3));
        paint.setStrokeWidth((float) this.A08);
        canvas2.drawLine(f, f3, (float) (width + ((int) (cos * d3))), (float) (A072 + ((int) (d3 * sin))), paint);
        canvas2.drawCircle(f, f3, this.A06, paint);
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0D = new ValueAnimator();
        this.A0B = AnonymousClass001.A0I();
        Paint A0K = C36441kJ.A0K();
        this.A09 = A0K;
        this.A0A = C36441kJ.A0N();
        this.A03 = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C27931Qk.A08, i, R.style.f13nameremoved);
        C014506h.A00(context, R.attr.f4nameremoved, 200);
        this.A0C = C017807p.A01(AnonymousClass064.A02, context, R.attr.f4nameremoved);
        this.A02 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.A07 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.A08 = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A06 = C36441kJ.A00(resources, R.dimen.f7nameremoved);
        int color = obtainStyledAttributes.getColor(0, 0);
        A0K.setAntiAlias(true);
        A0K.setColor(color);
        A00(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        C011504z.A06(this, 2);
        obtainStyledAttributes.recycle();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.A0D.isRunning()) {
            A00(this.A01);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0043, code lost:
        if (r0 != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (r0 == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        if (r5 != false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        A00(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            int r1 = r11.getActionMasked()
            float r8 = r11.getX()
            float r7 = r11.getY()
            r0 = 0
            r6 = 1
            if (r1 == 0) goto L_0x0090
            if (r1 == r6) goto L_0x0054
            r0 = 2
            if (r1 == r0) goto L_0x0054
            r5 = 0
        L_0x0016:
            r9 = 0
        L_0x0017:
            boolean r4 = r10.A05
            int r0 = r10.getWidth()
            int r0 = r0 / 2
            int r2 = X.C36441kJ.A07(r10)
            float r0 = (float) r0
            float r8 = r8 - r0
            double r0 = (double) r8
            float r2 = (float) r2
            float r7 = r7 - r2
            double r2 = (double) r7
            double r0 = java.lang.Math.atan2(r2, r0)
            double r1 = java.lang.Math.toDegrees(r0)
            int r0 = (int) r1
            int r1 = r0 + 90
            if (r1 >= 0) goto L_0x0038
            int r1 = r1 + 360
        L_0x0038:
            float r0 = r10.A01
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r9 == 0) goto L_0x004a
            if (r0 == 0) goto L_0x004c
        L_0x0045:
            r0 = 1
        L_0x0046:
            r0 = r0 | r4
            r10.A05 = r0
            return r6
        L_0x004a:
            if (r0 != 0) goto L_0x0050
        L_0x004c:
            if (r5 != 0) goto L_0x0050
            r0 = 0
            goto L_0x0046
        L_0x0050:
            r10.A00(r1)
            goto L_0x0045
        L_0x0054:
            boolean r5 = r10.A05
            boolean r0 = r10.A04
            if (r0 == 0) goto L_0x0016
            int r1 = r10.getWidth()
            r4 = 2
            int r1 = r1 / r4
            int r0 = r10.getHeight()
            int r0 = r0 / r4
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r8 - r1
            float r0 = r7 - r0
            double r2 = (double) r1
            double r0 = (double) r0
            double r0 = java.lang.Math.hypot(r2, r0)
            float r3 = (float) r0
            int r0 = r10.A02
            float r1 = (float) r0
            r0 = 1059648963(0x3f28f5c3, float:0.66)
            int r2 = X.C90514aH.A06(r1, r0)
            android.content.Context r1 = r10.getContext()
            r0 = 12
            float r1 = X.AnonymousClass062.A00(r1, r0)
            float r0 = (float) r2
            float r0 = r0 + r1
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008d
            r4 = 1
        L_0x008d:
            r10.A03 = r4
            goto L_0x0016
        L_0x0090:
            r10.A05 = r0
            r5 = 0
            r9 = 1
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.timepicker.ClockHandView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f4nameremoved);
    }

    public ClockHandView(Context context) {
        this(context, (AttributeSet) null);
    }
}
