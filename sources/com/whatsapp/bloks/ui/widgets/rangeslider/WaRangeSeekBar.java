package com.whatsapp.bloks.ui.widgets.rangeslider;

import X.AnonymousClass6OX;
import X.AnonymousClass7cX;
import X.AnonymousClass7cY;
import X.C023109s;
import X.C132376Ti;
import X.C143386qS;
import X.C158117fp;
import X.C158127fq;
import X.C224514j;
import X.C36341k9;
import X.C36441kJ;
import X.C90484aE;
import X.C90494aF;
import X.C90524aI;
import X.C92244dN;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.whatsapp.R;

public class WaRangeSeekBar extends FrameLayout implements C158117fp, C158127fq, AnonymousClass7cX {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public AnonymousClass7cY A05;
    public Integer A06;
    public int A07;
    public int A08;
    public Paint A09;
    public Paint A0A;
    public Paint A0B;
    public Paint A0C;
    public Paint A0D;
    public AnonymousClass6OX A0E;

    public static void A01(WaRangeSeekBar waRangeSeekBar) {
        AnonymousClass7cY r0 = waRangeSeekBar.A05;
        if (r0 != null) {
            C143386qS r02 = (C143386qS) r0;
            C132376Ti.A01(r02.A01, waRangeSeekBar.A03, waRangeSeekBar.A02, r02.A00);
        }
    }

    public static void A02(WaRangeSeekBar waRangeSeekBar) {
        AnonymousClass7cY r0 = waRangeSeekBar.A05;
        if (r0 != null) {
            C143386qS r02 = (C143386qS) r0;
            C132376Ti.A01(r02.A01, waRangeSeekBar.A03, waRangeSeekBar.A02, r02.A00);
        }
    }

    private float getCurrentPosition() {
        if (this.A06 == C023109s.A00) {
            return getStartThumbX();
        }
        return getEndThumbX();
    }

    private float getEndThumbX() {
        float f = this.A02;
        float f2 = this.A01;
        float f3 = this.A00;
        float f4 = (float) this.A04;
        return (((f - f2) / (f3 - f2)) * (((float) (getWidth() - this.A04)) - f4)) + f4;
    }

    private float getStartThumbX() {
        float f = this.A03;
        float f2 = this.A01;
        float f3 = this.A00;
        float f4 = (float) this.A04;
        return (((f - f2) / (f3 - f2)) * (((float) (getWidth() - this.A04)) - f4)) + f4;
    }

    private void setCurrentPosition(float f) {
        if (this.A06 != null) {
            float f2 = (float) this.A04;
            float f3 = this.A01;
            float f4 = this.A00;
            float width = (((f - f2) / (((float) (getWidth() - this.A04)) - f2)) * (f4 - f3)) + f3;
            if (this.A06 == C023109s.A00) {
                this.A03 = C90494aF.A02(f3, this.A02, width);
            } else {
                this.A02 = C90494aF.A02(this.A03, f4, width);
            }
            invalidate();
            A02(this);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.A0E.A02(motionEvent);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C92244dN r4 = (C92244dN) parcelable;
        super.onRestoreInstanceState(r4.getSuperState());
        float f = r4.A01;
        float f2 = r4.A00;
        if (f >= this.A01 && f2 <= this.A00 && f <= f2) {
            this.A03 = f;
            this.A02 = f2;
            invalidate();
            A02(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0091, code lost:
        if (r2 <= 0) goto L_0x009d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            X.6OX r4 = r8.A0E
            java.lang.Integer r0 = r4.A0E
            java.lang.Integer r2 = X.C023109s.A0C
            boolean r0 = X.C36361kB.A1a(r0, r2)
            r7 = 1
            r3 = 3
            if (r0 != 0) goto L_0x001b
            r4.A02(r9)
            java.lang.Integer r0 = r4.A0E
            int r0 = r0.intValue()
            if (r0 == r3) goto L_0x00ee
        L_0x0019:
            r0 = 1
            return r0
        L_0x001b:
            X.7fp r0 = r4.A0B
            if (r0 == 0) goto L_0x00ee
            int r0 = r4.A05
            if (r0 <= 0) goto L_0x00ee
            android.view.VelocityTracker r0 = r4.A09
            if (r0 != 0) goto L_0x002d
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r4.A09 = r0
        L_0x002d:
            r0.addMovement(r9)
            int r1 = r9.getAction()
            float r5 = r9.getX()
            float r6 = r9.getY()
            if (r1 == r7) goto L_0x0067
            r0 = 2
            if (r1 == r0) goto L_0x0044
            if (r1 == r3) goto L_0x0067
            goto L_0x0019
        L_0x0044:
            float r0 = r4.A00
            float r2 = r5 - r0
            float r0 = r4.A01
            float r1 = r6 - r0
            r4.A00 = r5
            r4.A01 = r6
            float r0 = r4.A02
            float r0 = r0 + r2
            r4.A02 = r0
            float r0 = r4.A03
            float r0 = r0 + r1
            r4.A03 = r0
            X.7fp r1 = r4.A0B
            com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar r1 = (com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar) r1
            float r0 = r1.getCurrentPosition()
            float r0 = r0 + r2
            r1.setCurrentPosition(r0)
            goto L_0x0019
        L_0x0067:
            android.view.VelocityTracker r3 = r4.A09
            r0 = 0
            r4.A09 = r0
            r1 = 1000(0x3e8, float:1.401E-42)
            X.AnonymousClass6OX.A00(r4)
            int r0 = r4.A06
            float r0 = (float) r0
            r3.computeCurrentVelocity(r1, r0)
            java.lang.Integer r1 = r4.A0D
            if (r1 == r2) goto L_0x00e9
            java.lang.Integer r0 = X.C023109s.A0G
            if (r1 == r0) goto L_0x00e9
            float r0 = r3.getYVelocity()
        L_0x0083:
            int r2 = (int) r0
            X.AnonymousClass6OX.A00(r4)
            int r1 = r4.A07
            int r0 = java.lang.Math.abs(r2)
            if (r0 <= r1) goto L_0x00a6
            if (r2 < 0) goto L_0x0093
            if (r2 <= 0) goto L_0x009d
        L_0x0093:
            X.7fp r1 = r4.A0B
            com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar r1 = (com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar) r1
            r0 = 0
            r1.A06 = r0
            A01(r1)
        L_0x009d:
            java.lang.Integer r0 = X.C023109s.A00
            r4.A0E = r0
            r3.recycle()
            goto L_0x0019
        L_0x00a6:
            X.7fq r0 = r4.A0C
            if (r0 == 0) goto L_0x0093
            X.AnonymousClass6OX.A00(r4)
            int r1 = r4.A08
            float r0 = r4.A02
            float r0 = java.lang.Math.abs(r0)
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0093
            float r0 = r4.A03
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0093
            X.7fq r2 = r4.A0C
            com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar r2 = (com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar) r2
            int r0 = r2.getMeasuredHeight()
            int r0 = r0 / 2
            float r0 = (float) r0
            float r1 = X.C90494aF.A01(r6, r0)
            int r0 = r2.A04
            int r0 = r0 * 2
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x009d
            r2.setCurrentThumb(r5)
            r2.setCurrentPosition(r5)
            r0 = 0
            r2.A06 = r0
            A01(r2)
            goto L_0x009d
        L_0x00e9:
            float r0 = r3.getXVelocity()
            goto L_0x0083
        L_0x00ee:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public WaRangeSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    private void A00() {
        int i;
        AnonymousClass6OX r5 = new AnonymousClass6OX(getContext());
        this.A0E = r5;
        Integer[] numArr = {C023109s.A0C, C023109s.A0G};
        int i2 = 0;
        r5.A05 = 0;
        int i3 = 0;
        do {
            if (numArr[i3] != null) {
                switch (C90524aI.A06(numArr, i3)) {
                    case 1:
                        i = 2;
                        break;
                    case 2:
                        i = 4;
                        break;
                    case 3:
                        i = 8;
                        break;
                    default:
                        i = 1;
                        break;
                }
                int i4 = i | i2;
                r5.A05 = i4;
                i2 = i4;
            }
            i3++;
        } while (i3 < 2);
        r5.A0A = this;
        r5.A0B = this;
        r5.A0C = this;
        Resources A0F = C36341k9.A0F(this);
        Paint A0K = C36441kJ.A0K();
        this.A09 = A0K;
        C90484aE.A14(A0F, A0K, C224514j.A00(getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        this.A09.setAntiAlias(true);
        this.A09.setStrokeWidth(C36441kJ.A00(A0F, R.dimen.f7nameremoved));
        Paint A0K2 = C36441kJ.A0K();
        this.A0A = A0K2;
        C90484aE.A14(A0F, A0K2, R.color.f6nameremoved);
        this.A0A.setStrokeWidth(C36441kJ.A00(A0F, R.dimen.f7nameremoved));
        Paint A0K3 = C36441kJ.A0K();
        this.A0B = A0K3;
        C90484aE.A14(A0F, A0K3, C224514j.A00(getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        this.A0B.setAlpha(127);
        this.A0B.setAntiAlias(true);
        Paint A0K4 = C36441kJ.A0K();
        this.A0C = A0K4;
        C90484aE.A14(A0F, A0K4, C224514j.A00(getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        this.A0C.setAntiAlias(true);
        Paint A0K5 = C36441kJ.A0K();
        this.A0D = A0K5;
        C90484aE.A14(A0F, A0K5, C224514j.A00(getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        this.A0D.setAntiAlias(true);
        this.A04 = A0F.getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A07 = A0F.getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A08 = A0F.getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A03 = Float.NaN;
        this.A02 = Float.NaN;
    }

    private int getCenterY() {
        return getMeasuredHeight() / 2;
    }

    private int getLeftBound() {
        return this.A04;
    }

    private int getRightBound() {
        return getWidth() - this.A04;
    }

    private void setCurrentThumb(float f) {
        int i;
        Integer num;
        float A012 = C90494aF.A01(getEndThumbX(), f);
        float A013 = C90494aF.A01(getStartThumbX(), f);
        if (A012 == A013) {
            i = (getStartThumbX() > f ? 1 : (getStartThumbX() == f ? 0 : -1));
        } else {
            i = (A012 > A013 ? 1 : (A012 == A013 ? 0 : -1));
        }
        if (i < 0) {
            num = C023109s.A01;
        } else {
            num = C023109s.A00;
        }
        this.A06 = num;
    }

    public boolean BWC(Integer num, float f, float f2) {
        setCurrentThumb(f);
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    public boolean Biy(float f, float f2) {
        if (C90494aF.A01(f2, (float) (getMeasuredHeight() / 2)) > ((float) (this.A04 * 2))) {
            return false;
        }
        setCurrentThumb(f);
        setCurrentPosition(f);
        this.A06 = null;
        A01(this);
        return true;
    }

    public void dispatchDraw(Canvas canvas) {
        float measuredHeight = (float) (getMeasuredHeight() / 2);
        float startThumbX = getStartThumbX();
        float endThumbX = getEndThumbX();
        canvas.save();
        canvas.drawLine((float) this.A04, measuredHeight, (float) (getWidth() - this.A04), measuredHeight, this.A0A);
        canvas.drawCircle(startThumbX, measuredHeight, (float) this.A04, this.A0B);
        canvas.drawCircle(endThumbX, measuredHeight, (float) this.A04, this.A0B);
        Canvas canvas2 = canvas;
        float f = measuredHeight;
        canvas2.drawLine(startThumbX, f, endThumbX, measuredHeight, this.A09);
        canvas.drawCircle(startThumbX, measuredHeight, (float) this.A07, this.A0C);
        canvas.drawCircle(endThumbX, measuredHeight, (float) this.A07, this.A0C);
        canvas.drawCircle(startThumbX, measuredHeight, (float) this.A08, this.A0D);
        canvas.drawCircle(endThumbX, measuredHeight, (float) this.A08, this.A0D);
        canvas.restore();
    }

    public float getRangeEndValue() {
        return this.A02;
    }

    public float getRangeStartValue() {
        return this.A03;
    }

    public Parcelable onSaveInstanceState() {
        C92244dN r1 = new C92244dN(super.onSaveInstanceState());
        r1.A01 = this.A03;
        r1.A00 = this.A02;
        return r1;
    }

    public void setRangeSeekBarChangeListener(AnonymousClass7cY r1) {
        this.A05 = r1;
    }

    public WaRangeSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public WaRangeSeekBar(Context context) {
        super(context);
        A00();
    }
}
