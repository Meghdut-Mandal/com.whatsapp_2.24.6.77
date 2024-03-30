package X;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* renamed from: X.0Id  reason: invalid class name and case insensitive filesystem */
public class C03860Id extends C03870Ie {
    public float A00 = 1.0f;
    public float A01 = 1.0f;
    public float A02 = 4.0f;
    public float A03 = 0.0f;
    public float A04 = 1.0f;
    public float A05 = 0.0f;
    public float A06 = 0.0f;
    public Paint.Cap A07 = Paint.Cap.BUTT;
    public Paint.Join A08 = Paint.Join.MITER;
    public C06150Sm A09;
    public C06150Sm A0A;
    public int[] A0B;

    public boolean A01() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C06150Sm r1 = this.A09;
        if (r1.A02 == null && (colorStateList2 = r1.A01) != null && colorStateList2.isStateful()) {
            return true;
        }
        C06150Sm r12 = this.A0A;
        if (r12.A02 != null || (colorStateList = r12.A01) == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    public boolean A02(int[] iArr) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        int colorForState;
        ColorStateList colorStateList2;
        int colorForState2;
        C06150Sm r2 = this.A09;
        if (r2.A02 != null || (colorStateList2 = r2.A01) == null || !colorStateList2.isStateful() || (colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor())) == r2.A00) {
            z = false;
        } else {
            z = true;
            r2.A00 = colorForState2;
        }
        C06150Sm r22 = this.A0A;
        if (r22.A02 != null || (colorStateList = r22.A01) == null || !colorStateList.isStateful() || (colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor())) == r22.A00) {
            z2 = false;
        } else {
            z2 = true;
            r22.A00 = colorForState;
        }
        return z2 | z;
    }

    public int getFillColor() {
        return this.A09.A00;
    }

    public int getStrokeColor() {
        return this.A0A.A00;
    }

    public void setFillColor(int i) {
        this.A09.A00 = i;
    }

    public void setStrokeColor(int i) {
        this.A0A.A00 = i;
    }

    public C03860Id(C03860Id r3) {
        super(r3);
        this.A0B = r3.A0B;
        this.A0A = r3.A0A;
        this.A03 = r3.A03;
        this.A01 = r3.A01;
        this.A09 = r3.A09;
        this.A01 = r3.A01;
        this.A00 = r3.A00;
        this.A06 = r3.A06;
        this.A04 = r3.A04;
        this.A05 = r3.A05;
        this.A07 = r3.A07;
        this.A08 = r3.A08;
        this.A02 = r3.A02;
    }

    public void setFillAlpha(float f) {
        this.A00 = f;
    }

    public void setStrokeAlpha(float f) {
        this.A01 = f;
    }

    public void setStrokeWidth(float f) {
        this.A03 = f;
    }

    public void setTrimPathEnd(float f) {
        this.A04 = f;
    }

    public void setTrimPathOffset(float f) {
        this.A05 = f;
    }

    public void setTrimPathStart(float f) {
        this.A06 = f;
    }

    public float getFillAlpha() {
        return this.A00;
    }

    public float getStrokeAlpha() {
        return this.A01;
    }

    public float getStrokeWidth() {
        return this.A03;
    }

    public float getTrimPathEnd() {
        return this.A04;
    }

    public float getTrimPathOffset() {
        return this.A05;
    }

    public float getTrimPathStart() {
        return this.A06;
    }

    public C03860Id() {
    }
}
