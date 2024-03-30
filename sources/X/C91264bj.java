package X;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.4bj  reason: invalid class name and case insensitive filesystem */
public final class C91264bj extends Drawable {
    public ValueAnimator A00;
    public C125045zE A01;
    public final ValueAnimator.AnimatorUpdateListener A02 = new C111565cU(this, 3);
    public final Matrix A03;
    public final Paint A04;
    public final Rect A05;

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void A01() {
        C125045zE r0;
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null && !valueAnimator.isStarted() && (r0 = this.A01) != null && r0.A0G && getCallback() != null) {
            this.A00.start();
        }
    }

    public void A02(C125045zE r9) {
        boolean z;
        PorterDuff.Mode mode;
        this.A01 = r9;
        if (r9 != null) {
            Paint paint = this.A04;
            if (r9.A0F) {
                mode = PorterDuff.Mode.DST_IN;
            } else {
                mode = PorterDuff.Mode.SRC_IN;
            }
            paint.setXfermode(new PorterDuffXfermode(mode));
        }
        A00();
        if (this.A01 != null) {
            ValueAnimator valueAnimator = this.A00;
            if (valueAnimator != null) {
                z = valueAnimator.isStarted();
                this.A00.cancel();
                this.A00.removeAllUpdateListeners();
            } else {
                z = false;
            }
            float[] A0v = C90524aI.A0v();
            A0v[0] = 0.0f;
            C125045zE r0 = this.A01;
            A0v[1] = ((float) (r0.A0E / r0.A0D)) + 1.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(A0v);
            this.A00 = ofFloat;
            ofFloat.setRepeatMode(this.A01.A0B);
            this.A00.setRepeatCount(this.A01.A0A);
            ValueAnimator valueAnimator2 = this.A00;
            C125045zE r02 = this.A01;
            valueAnimator2.setDuration(r02.A0D + r02.A0E);
            this.A00.addUpdateListener(this.A02);
            if (z) {
                this.A00.start();
            }
        }
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        float f;
        float f2;
        if (this.A01 != null) {
            Paint paint = this.A04;
            if (paint.getShader() != null) {
                float tan = (float) Math.tan(Math.toRadians((double) this.A01.A03));
                Rect rect = this.A05;
                float height = ((float) rect.height()) + (((float) rect.width()) * tan);
                float width = ((float) rect.width()) + (tan * ((float) rect.height()));
                ValueAnimator valueAnimator = this.A00;
                float f3 = 0.0f;
                if (valueAnimator != null) {
                    f = valueAnimator.getAnimatedFraction();
                } else {
                    f = 0.0f;
                }
                int i = this.A01.A06;
                if (i != 1) {
                    if (i == 2) {
                        f3 = width + (((-width) - width) * f);
                    } else if (i != 3) {
                        float f4 = -width;
                        f3 = f4 + ((width - f4) * f);
                    } else {
                        f2 = height + (((-height) - height) * f);
                    }
                    f2 = 0.0f;
                } else {
                    float f5 = -height;
                    f2 = f5 + ((height - f5) * f);
                }
                Matrix matrix = this.A03;
                matrix.reset();
                matrix.setRotate(this.A01.A03, ((float) rect.width()) / 2.0f, ((float) rect.height()) / 2.0f);
                matrix.postTranslate(f3, f2);
                paint.getShader().setLocalMatrix(matrix);
                canvas.drawRect(rect, paint);
            }
        }
    }

    public int getOpacity() {
        C125045zE r1 = this.A01;
        if (r1 == null) {
            return -1;
        }
        if (r1.A0H || r1.A0F) {
            return -3;
        }
        return -1;
    }

    public C91264bj() {
        Paint A0K = C36441kJ.A0K();
        this.A04 = A0K;
        this.A05 = AnonymousClass001.A06();
        this.A03 = C90524aI.A0B();
        A0K.setAntiAlias(true);
    }

    private void A00() {
        C125045zE r2;
        Shader radialGradient;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width != 0 && height != 0 && (r2 = this.A01) != null) {
            int i = r2.A08;
            if (i <= 0) {
                i = C90514aH.A06(r2.A04, (float) width);
            }
            int i2 = r2.A07;
            if (i2 <= 0) {
                i2 = C90514aH.A06(r2.A01, (float) height);
            }
            if (r2.A0C != 1) {
                int i3 = r2.A06;
                if (i3 == 1 || i3 == 3) {
                    i = 0;
                } else {
                    i2 = 0;
                }
                radialGradient = new LinearGradient(0.0f, 0.0f, (float) i, (float) i2, r2.A0K, r2.A0J, Shader.TileMode.CLAMP);
            } else {
                radialGradient = new RadialGradient(((float) i) / 2.0f, ((float) i2) / 2.0f, (float) (((double) Math.max(i, i2)) / Math.sqrt(2.0d)), r2.A0K, r2.A0J, Shader.TileMode.CLAMP);
            }
            this.A04.setShader(radialGradient);
        }
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A05.set(0, 0, rect.width(), rect.height());
        A00();
        A01();
    }
}
