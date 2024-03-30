package com.whatsapp.bloks;

import X.C36341k9;
import X.C36371kC;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C90484aE;
import X.C90514aH;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.whatsapp.R;

public class BloksCameraOverlay extends View {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public Path A06;
    public float A07;
    public int A08;
    public Path A09;
    public String A0A;
    public final Paint A0B = C36371kC.A0E();

    public void A00(String str) {
        String str2 = str;
        this.A0A = str2;
        DisplayMetrics A0P = C90484aE.A0P();
        int i = A0P.widthPixels;
        this.A05 = i;
        int i2 = A0P.heightPixels;
        this.A01 = i2;
        this.A08 = 125;
        if (TextUtils.equals(str2, "card")) {
            i = (this.A05 * 3) / 4;
            i2 = this.A01 / 4;
        } else if (TextUtils.equals(str2, "square")) {
            i2 = this.A05 - ((int) (A0P.density * 32.0f));
            this.A08 = 255;
            i = i2;
        } else if (TextUtils.equals(str2, "selfie")) {
            i = (this.A05 * 4) / 5;
            i2 = (this.A01 * 3) / 5;
            this.A08 = 255;
        }
        int i3 = (this.A05 - i) / 2;
        this.A02 = i3;
        int i4 = (this.A01 - i2) / 2;
        this.A04 = i4;
        this.A03 = i3 + i;
        this.A00 = i4 + i2;
        this.A07 = C36341k9.A0F(this).getDimension(R.dimen.f7nameremoved);
        Path A0M = C36441kJ.A0M();
        this.A09 = A0M;
        A0M.setFillType(Path.FillType.EVEN_ODD);
        this.A09.addRect(C90514aH.A0L((float) this.A05, this.A01), Path.Direction.CW);
        Path path = this.A09;
        RectF rectF = new RectF((float) this.A02, (float) this.A04, (float) this.A03, (float) this.A00);
        float f = A0P.density * 16.0f;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        if (TextUtils.equals(str2, "selfie")) {
            int i5 = this.A02;
            int i6 = this.A04;
            int i7 = this.A03;
            int i8 = this.A00;
            float f2 = (float) i5;
            float f3 = (((float) (i7 - i5)) / 2.0f) + f2;
            float f4 = (float) i6;
            float f5 = (float) (i8 - i6);
            float f6 = 0.4f * f5;
            float f7 = f4 + f6;
            float f8 = 0.5f * f5;
            float f9 = (0.8f * f5) + f4;
            float f10 = f5 * 0.25f;
            float f11 = f10 / 10.0f;
            float f12 = f6 / 2.0f;
            float f13 = f8 / 2.0f;
            RectF rectF2 = new RectF(f3 - f12, f7 - f13, f12 + f3, f7 + f13);
            float f14 = (1.5f * f10) / 2.0f;
            float f15 = f10 / 2.0f;
            RectF rectF3 = new RectF(f3 - f14, f9 - f15, f3 + f14, f9 + f15);
            Path A0M2 = C36441kJ.A0M();
            this.A06 = A0M2;
            A0M2.setFillType(Path.FillType.EVEN_ODD);
            Path path2 = this.A06;
            Path.Direction direction = Path.Direction.CW;
            path2.addOval(rectF2, direction);
            this.A06.addRoundRect(rectF3, f11, f11, direction);
            this.A06.addRect(f2, f4, (float) i7, (float) i8, direction);
        }
    }

    public void onDraw(Canvas canvas) {
        Paint paint = this.A0B;
        paint.setARGB(this.A08, 45, 52, 54);
        C36431kI.A1L(paint);
        canvas.drawPath(this.A09, paint);
        if (TextUtils.equals(this.A0A, "selfie")) {
            paint.setARGB(180, 50, 50, 50);
            C36431kI.A1L(paint);
            canvas.drawPath(this.A06, paint);
        }
        C36421kH.A0q(paint);
        paint.setColor(-2147418368);
        paint.setStrokeWidth(this.A07 * 2.0f);
    }

    public BloksCameraOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00((String) null);
    }

    public BloksCameraOverlay(Context context, AttributeSet attributeSet, int i, String str) {
        super(context, attributeSet, i);
        A00(str);
    }

    public BloksCameraOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00((String) null);
    }

    public BloksCameraOverlay(Context context) {
        super(context);
        A00((String) null);
    }
}
