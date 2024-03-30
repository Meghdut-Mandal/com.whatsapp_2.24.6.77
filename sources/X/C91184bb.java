package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.4bb  reason: invalid class name and case insensitive filesystem */
public final class C91184bb extends Drawable {
    public float A00 = 1.0f;
    public float A01;
    public int A02;
    public Drawable A03;
    public boolean A04;
    public final float A05;
    public final int A06;
    public final Paint A07;

    public C91184bb(Context context, int i) {
        Drawable drawable;
        Paint A0L = C36441kJ.A0L(1);
        C36431kI.A1L(A0L);
        this.A07 = A0L;
        float A002 = C36341k9.A00(context);
        this.A05 = 0.75f * A002;
        this.A06 = (int) (A002 * ((float) 48));
        if (i != 0) {
            drawable = AnonymousClass00E.A00(context, i);
        } else {
            drawable = null;
        }
        this.A03 = drawable;
    }

    public void draw(Canvas canvas) {
        AnonymousClass00C.A0D(canvas, 0);
        Rect bounds = getBounds();
        AnonymousClass00C.A08(bounds);
        float min = (float) ((int) (((float) Math.min(bounds.width(), bounds.height())) * 0.4375f));
        if (this.A04) {
            Paint paint = this.A07;
            C36431kI.A1L(paint);
            paint.setColor(this.A02);
            canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), min, paint);
            C36431kI.A1L(paint);
            paint.setColor(-1);
            float f = (float) 2;
            canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), (this.A01 * 1.2f) / f, paint);
            if (Color.red(this.A02) > 240 && Color.green(this.A02) > 240 && Color.blue(this.A02) > 240) {
                C36421kH.A0q(paint);
                paint.setStrokeWidth(this.A05);
                int min2 = 255 - ((Math.min(Math.min(Color.red(this.A02), Color.green(this.A02)), Color.blue(this.A02)) - 240) * 3);
                paint.setColor(Color.argb(255, min2, min2, min2));
                canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), (this.A01 * 1.2f) / f, paint);
                return;
            }
            return;
        }
        if (this.A02 != 0) {
            Paint paint2 = this.A07;
            C36431kI.A1L(paint2);
            paint2.setColor(this.A02);
            canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), this.A00 * min, paint2);
        }
        Drawable drawable = this.A03;
        if (drawable != null) {
            drawable.setBounds(bounds.centerX() - (drawable.getIntrinsicWidth() / 2), bounds.centerY() - (drawable.getIntrinsicHeight() / 2), bounds.centerX() + (drawable.getIntrinsicWidth() / 2), bounds.centerY() + (drawable.getIntrinsicHeight() / 2));
            drawable.draw(canvas);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public final void A00(int i) {
        this.A02 = i;
        this.A00 = 1.0f;
        invalidateSelf();
    }

    public final void A01(int i, float f) {
        this.A01 = f;
        this.A02 = i;
        this.A00 = 1.0f;
        invalidateSelf();
    }

    public int getIntrinsicHeight() {
        return this.A06;
    }

    public int getIntrinsicWidth() {
        return this.A06;
    }
}
