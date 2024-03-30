package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.Gravity;

/* renamed from: X.0Dq  reason: invalid class name and case insensitive filesystem */
public class C03220Dq extends Drawable {
    public float A00;
    public int A01;
    public int A02;
    public int A03 = 119;
    public int A04 = 160;
    public boolean A05 = true;
    public boolean A06;
    public final Bitmap A07;
    public final BitmapShader A08;
    public final Matrix A09 = new Matrix();
    public final Paint A0A = new Paint(3);
    public final Rect A0B = AnonymousClass001.A06();
    public final RectF A0C = new RectF();

    public void A01() {
        this.A06 = true;
        this.A05 = true;
        this.A00 = (float) (Math.min(this.A01, this.A02) / 2);
        this.A0A.setShader(this.A08);
        invalidateSelf();
    }

    public void A00() {
        Rect rect;
        if (this.A05) {
            if (this.A06) {
                int min = Math.min(this.A02, this.A01);
                int i = this.A03;
                Rect bounds = getBounds();
                rect = this.A0B;
                Gravity.apply(i, min, min, bounds, rect, 0);
                int min2 = Math.min(rect.width(), rect.height());
                rect.inset(Math.max(0, (rect.width() - min2) / 2), Math.max(0, (rect.height() - min2) / 2));
                this.A00 = ((float) min2) * 0.5f;
            } else {
                int i2 = this.A03;
                int i3 = this.A02;
                int i4 = this.A01;
                Rect bounds2 = getBounds();
                rect = this.A0B;
                Gravity.apply(i2, i3, i4, bounds2, rect, 0);
            }
            RectF rectF = this.A0C;
            rectF.set(rect);
            BitmapShader bitmapShader = this.A08;
            if (bitmapShader != null) {
                Matrix matrix = this.A09;
                matrix.setTranslate(rectF.left, rectF.top);
                float width = rectF.width();
                Bitmap bitmap = this.A07;
                matrix.preScale(width / ((float) bitmap.getWidth()), rectF.height() / ((float) bitmap.getHeight()));
                bitmapShader.setLocalMatrix(matrix);
                this.A0A.setShader(bitmapShader);
            }
            this.A05 = false;
        }
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.A07;
        if (bitmap != null) {
            A00();
            Paint paint = this.A0A;
            if (paint.getShader() == null) {
                canvas.drawBitmap(bitmap, (Rect) null, this.A0B, paint);
                return;
            }
            RectF rectF = this.A0C;
            float f = this.A00;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public int getAlpha() {
        return this.A0A.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.A0A.getColorFilter();
    }

    public int getOpacity() {
        Bitmap bitmap;
        if (this.A03 != 119 || this.A06 || (bitmap = this.A07) == null || bitmap.hasAlpha() || this.A0A.getAlpha() < 255 || this.A00 > 0.05f) {
            return -3;
        }
        return -1;
    }

    public void setAlpha(int i) {
        Paint paint = this.A0A;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A0A.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDither(boolean z) {
        this.A0A.setDither(z);
        invalidateSelf();
    }

    public void setFilterBitmap(boolean z) {
        this.A0A.setFilterBitmap(z);
        invalidateSelf();
    }

    public C03220Dq(Resources resources, Bitmap bitmap) {
        if (resources != null) {
            this.A04 = resources.getDisplayMetrics().densityDpi;
        }
        this.A07 = bitmap;
        int i = this.A04;
        this.A02 = bitmap.getScaledWidth(i);
        this.A01 = bitmap.getScaledHeight(i);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.A08 = new BitmapShader(bitmap, tileMode, tileMode);
    }

    public void getOutline(Outline outline) {
        A00();
        outline.setRoundRect(this.A0B, this.A00);
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.A06) {
            this.A00 = (float) (Math.min(this.A01, this.A02) / 2);
        }
        this.A05 = true;
    }

    public int getIntrinsicHeight() {
        return this.A01;
    }

    public int getIntrinsicWidth() {
        return this.A02;
    }
}
