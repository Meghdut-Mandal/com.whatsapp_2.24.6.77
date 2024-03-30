package X;

import android.animation.ArgbEvaluator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* renamed from: X.4bo  reason: invalid class name and case insensitive filesystem */
public class C91314bo extends Drawable implements Animatable {
    public static final ArgbEvaluator A08 = new ArgbEvaluator();
    public static final TimeInterpolator A09 = new C133376Ye();
    public boolean A00;
    public final float A01;
    public final int A02;
    public final ValueAnimator.AnimatorUpdateListener A03;
    public final ValueAnimator A04;
    public final Paint A05;
    public final RectF A06 = C36441kJ.A0N();
    public final Integer A07;

    public int getOpacity() {
        return -1;
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public C91314bo(C118485ny r9, C118485ny r10, C1271967i r11, Integer num, float f, int i, int i2) {
        float f2;
        float f3;
        C111565cU r1 = new C111565cU(this, 1);
        this.A03 = r1;
        this.A07 = num;
        Paint A0K = C36441kJ.A0K();
        this.A05 = A0K;
        C36431kI.A1L(A0K);
        A0K.setAntiAlias(true);
        this.A02 = i2;
        this.A01 = f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.A04 = valueAnimator;
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(r1);
        valueAnimator.setStartDelay(((long) (i % 10)) * 200);
        valueAnimator.setDuration(2000);
        valueAnimator.setInterpolator(A09);
        valueAnimator.setEvaluator(A08);
        if (r11.A03) {
            f2 = r10.A00;
            f3 = r10.A01;
        } else {
            f2 = r9.A00;
            f3 = r9.A01;
        }
        float[] A0v = C90524aI.A0v();
        A0v[0] = f2;
        A0v[1] = f3;
        valueAnimator.setFloatValues(A0v);
        A0K.setColor(C109515Xw.A00(i2, f2));
    }

    public void draw(Canvas canvas) {
        int intValue = this.A07.intValue();
        RectF rectF = this.A06;
        if (intValue != 0) {
            float f = this.A01;
            canvas.drawRoundRect(rectF, f, f, this.A05);
            return;
        }
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, this.A05);
    }

    public boolean isRunning() {
        return this.A04.isStarted();
    }

    public void setAlpha(int i) {
        Paint paint = this.A05;
        if (paint.getAlpha() != i) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (!z) {
            this.A04.cancel();
        } else if (this.A00) {
            this.A04.start();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.A04.start();
        this.A00 = true;
    }

    public void stop() {
        this.A04.cancel();
        this.A00 = false;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A06.set(rect);
    }
}
