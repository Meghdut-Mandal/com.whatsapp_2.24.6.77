package X;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* renamed from: X.6cP  reason: invalid class name and case insensitive filesystem */
public final class C135256cP implements LineHeightSpan {
    public int A00 = Integer.MIN_VALUE;
    public int A01 = Integer.MIN_VALUE;
    public int A02 = Integer.MIN_VALUE;
    public int A03;
    public int A04 = Integer.MIN_VALUE;
    public int A05;
    public final float A06;
    public final float A07;
    public final boolean A08;
    public final boolean A09;
    public final int A0A;

    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5;
        float f;
        int i6 = fontMetricsInt.descent;
        int i7 = fontMetricsInt.ascent;
        int i8 = i6 - i7;
        if (i8 > 0) {
            boolean z = false;
            boolean z2 = true;
            if (i == 0) {
                z = true;
            }
            if (i2 != this.A0A) {
                z2 = false;
            }
            if (!z || !z2 || !this.A08 || !this.A09) {
                int i9 = this.A02;
                if (i9 == Integer.MIN_VALUE) {
                    int A042 = C90514aH.A04(this.A06);
                    int i10 = A042 - i8;
                    float f2 = this.A07;
                    if (f2 == -1.0f) {
                        f2 = Math.abs((float) i7) / ((float) i8);
                    }
                    float f3 = (float) i10;
                    if (i10 <= 0) {
                        f = f3 * f2;
                    } else {
                        f = f3 * (1.0f - f2);
                    }
                    int A043 = i6 + C90514aH.A04(f);
                    this.A01 = A043;
                    i9 = A043 - A042;
                    this.A00 = i9;
                    if (this.A08) {
                        i9 = i7;
                    }
                    this.A02 = i9;
                    if (this.A09) {
                        A043 = i6;
                    }
                    this.A04 = A043;
                    this.A03 = i7 - i9;
                    this.A05 = A043 - i6;
                }
                if (!z) {
                    i9 = this.A00;
                }
                fontMetricsInt.ascent = i9;
                if (z2) {
                    i5 = this.A04;
                } else {
                    i5 = this.A01;
                }
                fontMetricsInt.descent = i5;
            }
        }
    }

    public C135256cP(float f, float f2, int i, boolean z, boolean z2) {
        this.A06 = f;
        this.A0A = i;
        this.A08 = z;
        this.A09 = z2;
        this.A07 = f2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            throw AnonymousClass001.A09("topRatio should be in [0..1] range or -1");
        }
    }
}
