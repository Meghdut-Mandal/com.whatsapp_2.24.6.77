package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.animation.Interpolator;
import com.whatsapp.R;

/* renamed from: X.4bc  reason: invalid class name and case insensitive filesystem */
public class C91194bc extends Drawable {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08 = -7829368;
    public int A09 = 3;
    public int A0A = 2;
    public long A0B = -1;
    public long A0C = -1;
    public long A0D = 0;
    public Bitmap A0E;
    public RectF A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public final float A0J;
    public final float A0K;
    public final float A0L;
    public final float A0M;
    public final float A0N;
    public final float A0O;
    public final int A0P;
    public final Context A0Q;
    public final Paint A0R;
    public final Paint A0S;
    public final Paint A0T;
    public final Paint A0U;
    public final Paint A0V;
    public final TextPaint A0W;
    public final TextPaint A0X;
    public final Interpolator A0Y = new C135976dZ();

    public int getOpacity() {
        return -1;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public float A00() {
        return Math.max(this.A04, this.A06 + this.A02 + C90524aI.A01(this.A0Q, 3.0f));
    }

    public void A01() {
        setBounds(0, 0, Math.round(this.A05), Math.round(this.A04));
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        float f;
        float f2;
        float A022;
        if (this.A09 != 3) {
            Canvas canvas2 = canvas;
            canvas.save();
            if (this.A09 == 2 && this.A0B == -1 && this.A0C == -1) {
                this.A0F.offsetTo(0.0f, 0.0f);
                canvas.save();
                canvas.translate(this.A0F.centerX(), A00() / 2.0f);
                Paint paint = this.A0T;
                paint.setColor(this.A08);
                float f3 = (float) this.A0P;
                canvas.drawCircle(0.0f, 0.0f, f3, paint);
                canvas.drawCircle(0.0f, 0.0f, f3 - this.A0K, this.A0S);
                canvas.restore();
            } else {
                RectF rectF = this.A0F;
                this.A0F.offsetTo(0.0f, 0.0f);
                canvas.save();
                canvas.translate(rectF.centerX(), A00() / 2.0f);
                float width = rectF.width() / 2.0f;
                Paint paint2 = this.A0T;
                paint2.setColor(this.A08);
                canvas.drawCircle(0.0f, 0.0f, width, paint2);
                canvas.drawCircle(0.0f, 0.0f, width - this.A0K, this.A0S);
                if (this.A0E != null) {
                    RectF A0N2 = C36441kJ.A0N();
                    float f4 = A0N2.left;
                    float f5 = width - this.A0L;
                    A0N2.left = f4 - f5;
                    A0N2.right = f5;
                    A0N2.top -= f5;
                    A0N2.bottom = f5;
                    canvas.drawBitmap(this.A0E, (Rect) null, A0N2, this.A0U);
                }
                canvas.restore();
                if (this.A0I && this.A0B == -1 && this.A0C == -1) {
                    if (!TextUtils.isEmpty(this.A0G)) {
                        int i = this.A0A;
                        RectF rectF2 = this.A0F;
                        if (i == 1) {
                            f2 = (rectF2.left - this.A03) - this.A0O;
                        } else {
                            f2 = rectF2.right + this.A0O;
                        }
                        float centerY = rectF2.centerY() - this.A0J;
                        String str = this.A0G;
                        canvas2.drawText(str, 0, str.length(), f2, centerY, this.A0R);
                        String str2 = this.A0G;
                        canvas2.drawText(str2, 0, str2.length(), f2, centerY, this.A0W);
                    }
                    if (!TextUtils.isEmpty(this.A0H)) {
                        int i2 = this.A0A;
                        RectF rectF3 = this.A0F;
                        if (i2 == 1) {
                            f = (rectF3.left - this.A07) - this.A0O;
                        } else {
                            f = rectF3.right + this.A0O;
                        }
                        float centerY2 = rectF3.centerY() + this.A06 + this.A0N;
                        canvas.drawText(this.A0H, f, centerY2, this.A0V);
                        canvas.drawText(this.A0H, f, centerY2, this.A0X);
                    }
                }
            }
            canvas.restore();
            long j = this.A0B;
            if (j != -1 || this.A0C != -1) {
                long j2 = this.A0D;
                float f6 = 0.0f;
                if (j2 == 0) {
                    A022 = 0.0f;
                } else {
                    long min = Math.min(C36441kJ.A0A(j), j2);
                    if (min >= j2) {
                        this.A0B = -1;
                        j = -1;
                    }
                    long min2 = Math.min(System.currentTimeMillis() - this.A0C, j2);
                    if (min2 >= j2) {
                        this.A0C = -1;
                    }
                    if (j == -1) {
                        min = min2;
                    }
                    A022 = C90494aF.A02(0.0f, 1.0f, this.A0Y.getInterpolation(((float) min) / ((float) j2)));
                }
                float f7 = this.A01;
                float f8 = 1.0f - 0.0f;
                float f9 = this.A00 - f7;
                if (f8 != 0.0f) {
                    f6 = (A022 - 0.0f) / f8;
                }
                float f10 = (f6 * f9) + f7;
                this.A05 = f10;
                this.A04 = f10;
                A01();
            }
        }
    }

    public int getIntrinsicHeight() {
        return Math.round(this.A04);
    }

    public int getIntrinsicWidth() {
        return Math.round(this.A05);
    }

    public C91194bc(Context context) {
        this.A0Q = context;
        this.A0P = C65103Qt.A01(context, 3.0f);
        this.A0M = C90524aI.A01(context, 120.0f);
        this.A0L = C90524aI.A01(context, 3.0f);
        this.A0O = C90524aI.A01(context, 4.0f);
        this.A0K = C90524aI.A01(context, 1.0f);
        this.A0J = C90524aI.A01(context, 1.5f);
        this.A0N = C90524aI.A01(context, 1.5f);
        AnonymousClass00C.A0D(context, 0);
        TextPaint textPaint = AnonymousClass6J8.A05;
        if (textPaint == null) {
            textPaint = new TextPaint();
            textPaint.setTextAlign(Paint.Align.LEFT);
            textPaint.setTextSize(C90524aI.A01(context, 12.0f));
            Typeface typeface = C108895Vj.A00;
            if (typeface == null) {
                typeface = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Medium.ttf");
                C108895Vj.A00 = typeface;
            }
            C18740tg.A06(typeface);
            AnonymousClass00C.A08(typeface);
            textPaint.setTypeface(typeface);
            C90484aE.A14(context.getResources(), textPaint, R.color.f6nameremoved);
            AnonymousClass6J8.A05 = textPaint;
        }
        this.A0W = textPaint;
        this.A0R = AnonymousClass6J8.A00(context);
        TextPaint textPaint2 = AnonymousClass6J8.A06;
        if (textPaint2 == null) {
            textPaint2 = new TextPaint();
            textPaint2.setTextSize(C90524aI.A01(context, 10.0f));
            textPaint2.setTextAlign(Paint.Align.LEFT);
            textPaint2.setTypeface(Typeface.DEFAULT);
            C90484aE.A14(context.getResources(), textPaint2, R.color.f6nameremoved);
            AnonymousClass6J8.A06 = textPaint2;
        }
        this.A0X = textPaint2;
        this.A0V = AnonymousClass6J8.A01(context);
        Paint paint = AnonymousClass6J8.A02;
        if (paint == null) {
            paint = C36371kC.A0E();
            C36431kI.A1L(paint);
            AnonymousClass6J8.A02 = paint;
        }
        this.A0T = paint;
        Paint paint2 = AnonymousClass6J8.A01;
        if (paint2 == null) {
            paint2 = C36371kC.A0E();
            C36421kH.A0q(paint2);
            C90484aE.A14(context.getResources(), paint2, R.color.f6nameremoved);
            paint2.setStrokeWidth(C90524aI.A01(context, 1.0f));
            AnonymousClass6J8.A01 = paint2;
        }
        this.A0S = paint2;
        Paint paint3 = AnonymousClass6J8.A03;
        if (paint3 == null) {
            paint3 = C36441kJ.A0K();
            paint3.setStyle(Paint.Style.FILL_AND_STROKE);
            AnonymousClass6J8.A03 = paint3;
        }
        this.A0U = paint3;
        this.A0F = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A0F = new RectF((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
    }
}
