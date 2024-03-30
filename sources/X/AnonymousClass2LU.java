package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.ImageView;

/* renamed from: X.2LU  reason: invalid class name */
public abstract class AnonymousClass2LU extends C39021qv {
    public int A00 = -1;
    public int A01 = -1;
    public float A02 = 3.0f;
    public C87234Nz A03;
    public Runnable A04;
    public float A05;
    public final Handler A06 = C36341k9.A0H();
    public final AnonymousClass3PL A07 = new AnonymousClass3PL((Bitmap) null);
    public final float[] A08 = new float[9];
    public final Matrix A09 = new Matrix();
    public final Matrix A0A = new Matrix();
    public final Matrix A0B = new Matrix();

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || getScale() <= 1.0f) {
            return super.onKeyDown(i, keyEvent);
        }
        A06(1.0f, C36441kJ.A01(this) / 2.0f, C36441kJ.A02(this) / 2.0f);
        return true;
    }

    public static int A02(AnonymousClass3PL r2) {
        Bitmap bitmap = r2.A00;
        if (bitmap == null) {
            return 0;
        }
        if (AnonymousClass3PL.A00(r2)) {
            return bitmap.getWidth();
        }
        return bitmap.getHeight();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        if (r1 < r2) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r8 = this;
            X.3PL r3 = r8.A07
            android.graphics.Bitmap r0 = r3.A00
            if (r0 == 0) goto L_0x0050
            android.graphics.Matrix r2 = r8.getImageViewMatrix()
            android.graphics.Bitmap r0 = r3.A00
            int r0 = r0.getWidth()
            float r1 = (float) r0
            android.graphics.Bitmap r0 = r3.A00
            int r0 = r0.getHeight()
            float r0 = (float) r0
            r5 = 0
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>(r5, r5, r1, r0)
            r2.mapRect(r7)
            float r1 = r7.height()
            float r6 = r7.width()
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = X.C36441kJ.A02(r8)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0060
            float r3 = r3 - r1
            float r3 = r3 / r4
            float r0 = r7.top
        L_0x0037:
            float r3 = r3 - r0
        L_0x0038:
            float r2 = X.C36441kJ.A01(r8)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0051
            float r2 = r2 - r6
            float r2 = r2 / r4
            float r1 = r7.left
        L_0x0044:
            float r5 = r2 - r1
        L_0x0046:
            r8.A05(r5, r3)
            android.graphics.Matrix r0 = r8.getImageViewMatrix()
            r8.setImageMatrix(r0)
        L_0x0050:
            return
        L_0x0051:
            float r1 = r7.left
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0059
            float r5 = -r1
            goto L_0x0046
        L_0x0059:
            float r1 = r7.right
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0046
            goto L_0x0044
        L_0x0060:
            float r1 = r7.top
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0068
            float r3 = -r1
            goto L_0x0038
        L_0x0068:
            float r0 = r7.bottom
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0075
            float r3 = X.C36441kJ.A02(r8)
            float r0 = r7.bottom
            goto L_0x0037
        L_0x0075:
            r3 = 0
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2LU.A04():void");
    }

    public void A05(float f, float f2) {
        this.A0B.postTranslate(f, f2);
    }

    public void A06(float f, float f2, float f3) {
        float f4 = this.A05;
        if (f > f4) {
            f = f4;
        }
        float scale = f / getScale();
        this.A0B.postScale(scale, scale, f2, f3);
        setImageMatrix(getImageViewMatrix());
        A04();
    }

    public Matrix getImageViewMatrix() {
        Matrix matrix = this.A0A;
        matrix.set(this.A09);
        matrix.postConcat(this.A0B);
        return matrix;
    }

    public float getScale() {
        Matrix matrix = this.A0B;
        float[] fArr = this.A08;
        matrix.getValues(fArr);
        return fArr[0];
    }

    public void setImageBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            super.setImageBitmap(bitmap);
        } else {
            A07(new AnonymousClass3PL(bitmap), true);
        }
    }

    public AnonymousClass2LU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private void A03(Matrix matrix, AnonymousClass3PL r11) {
        int i;
        Bitmap bitmap;
        int i2;
        float A012 = C36441kJ.A01(this);
        float A022 = C36441kJ.A02(this);
        Bitmap bitmap2 = r11.A00;
        if (bitmap2 == null) {
            i = 0;
        } else if (AnonymousClass3PL.A00(r11)) {
            i = bitmap2.getHeight();
        } else {
            i = bitmap2.getWidth();
        }
        float f = (float) i;
        float A023 = (float) A02(r11);
        matrix.reset();
        float f2 = this.A02;
        float min = Math.min(Math.min(A012 / f, f2), Math.min(A022 / A023, f2));
        Matrix matrix2 = new Matrix();
        if (!(r11.A01 == null || (bitmap = r11.A00) == null)) {
            int i3 = 0;
            int width = bitmap.getWidth() / 2;
            Bitmap bitmap3 = r11.A00;
            if (bitmap3 != null) {
                i3 = bitmap3.getHeight();
            }
            matrix2.preTranslate(-((float) width), -((float) (i3 / 2)));
            matrix2.postConcat(r11.A01);
            Bitmap bitmap4 = r11.A00;
            if (bitmap4 == null) {
                i2 = 0;
            } else if (AnonymousClass3PL.A00(r11)) {
                i2 = bitmap4.getHeight();
            } else {
                i2 = bitmap4.getWidth();
            }
            matrix2.postTranslate(((float) i2) / 2.0f, ((float) A02(r11)) / 2.0f);
        }
        matrix.postConcat(matrix2);
        matrix.postScale(min, min);
        matrix.postTranslate((A012 - (f * min)) / 2.0f, (A022 - (A023 * min)) / 2.0f);
    }

    public void A07(AnonymousClass3PL r6, boolean z) {
        int width;
        float max;
        if (getWidth() <= 0) {
            this.A04 = new AnonymousClass752(this, r6, 20, z);
            return;
        }
        Bitmap bitmap = r6.A00;
        Matrix matrix = this.A09;
        if (bitmap != null) {
            A03(matrix, r6);
            setImageBitmap(r6.A00, r6.A01);
        } else {
            matrix.reset();
            super.setImageBitmap((Bitmap) null);
        }
        if (z) {
            this.A0B.reset();
        }
        setImageMatrix(getImageViewMatrix());
        AnonymousClass3PL r4 = this.A07;
        Bitmap bitmap2 = r4.A00;
        if (bitmap2 == null) {
            max = 1.0f;
        } else {
            if (AnonymousClass3PL.A00(r4)) {
                width = bitmap2.getHeight();
            } else {
                width = bitmap2.getWidth();
            }
            max = Math.max(1.0f, Math.max(((float) width) / ((float) this.A01), ((float) A02(r4)) / ((float) this.A00)) * 4.0f);
        }
        this.A05 = max;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A01 = i3 - i;
        this.A00 = i4 - i2;
        Runnable runnable = this.A04;
        if (runnable != null) {
            this.A04 = null;
            runnable.run();
        }
        AnonymousClass3PL r1 = this.A07;
        if (r1.A00 != null) {
            A03(this.A09, r1);
            setImageMatrix(getImageViewMatrix());
        }
    }

    public void setMaxProperScale(float f) {
        this.A02 = f;
    }

    public void setRecycler(C87234Nz r1) {
        this.A03 = r1;
    }

    private void setImageBitmap(Bitmap bitmap, Matrix matrix) {
        super.setImageBitmap(bitmap);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setDither(true);
            drawable.setFilterBitmap(true);
        }
        AnonymousClass3PL r0 = this.A07;
        r0.A00 = bitmap;
        r0.A01 = matrix;
    }
}
