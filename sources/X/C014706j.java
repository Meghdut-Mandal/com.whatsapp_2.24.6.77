package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.06j  reason: invalid class name and case insensitive filesystem */
public class C014706j extends Drawable {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public ColorStateList A06;
    public AnonymousClass06J A07;
    public boolean A08 = true;
    public final Paint A09;
    public final Rect A0A = new Rect();
    public final RectF A0B = new RectF();
    public final Path A0C = new Path();
    public final RectF A0D = new RectF();
    public final C014806k A0E = new C014806k(this);
    public final C013906b A0F = C013806a.A00;

    public void onBoundsChange(Rect rect) {
        this.A08 = true;
    }

    public void draw(Canvas canvas) {
        if (this.A08) {
            Paint paint = this.A09;
            Rect rect = this.A0A;
            copyBounds(rect);
            float height = this.A00 / ((float) rect.height());
            paint.setShader(new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{C018107s.A05(this.A05, this.A03), C018107s.A05(this.A04, this.A03), C018107s.A05(this.A04 & 16777215, this.A03), C018107s.A05(this.A01 & 16777215, this.A03), C018107s.A05(this.A01, this.A03), C018107s.A05(this.A02, this.A03)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.A08 = false;
        }
        Paint paint2 = this.A09;
        float strokeWidth = paint2.getStrokeWidth() / 2.0f;
        Rect rect2 = this.A0A;
        copyBounds(rect2);
        RectF rectF = this.A0D;
        rectF.set(rect2);
        AnonymousClass06K r1 = this.A07.A06;
        RectF rectF2 = this.A0B;
        rectF2.set(getBounds());
        float min = Math.min(r1.BAD(rectF2), rectF.width() / 2.0f);
        AnonymousClass06J r12 = this.A07;
        rectF2.set(getBounds());
        if (r12.A05(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, min, min, paint2);
        }
    }

    public int getOpacity() {
        if (this.A00 > 0.0f) {
            return -3;
        }
        return -2;
    }

    public void getOutline(Outline outline) {
        AnonymousClass06J r1 = this.A07;
        RectF rectF = this.A0B;
        rectF.set(getBounds());
        if (r1.A05(rectF)) {
            AnonymousClass06K r12 = this.A07.A06;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), r12.BAD(rectF));
            return;
        }
        Rect rect = this.A0A;
        copyBounds(rect);
        RectF rectF2 = this.A0D;
        rectF2.set(rect);
        C013906b r0 = this.A0F;
        AnonymousClass06J r3 = this.A07;
        Path path = this.A0C;
        r0.A01(path, rectF2, r3, (C014206e) null, 1.0f);
        C05530Qb.A00(outline, path);
    }

    public boolean getPadding(Rect rect) {
        AnonymousClass06J r2 = this.A07;
        RectF rectF = this.A0B;
        rectF.set(getBounds());
        if (!r2.A05(rectF)) {
            return true;
        }
        int round = Math.round(this.A00);
        rect.set(round, round, round, round);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.A06;
        if ((colorStateList == null || !colorStateList.isStateful()) && !super.isStateful()) {
            return false;
        }
        return true;
    }

    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.A06;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.A03)) == this.A03)) {
            this.A08 = true;
            this.A03 = colorForState;
        }
        if (this.A08) {
            invalidateSelf();
        }
        return this.A08;
    }

    public void setAlpha(int i) {
        this.A09.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A09.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C014706j(AnonymousClass06J r3) {
        this.A07 = r3;
        Paint paint = new Paint(1);
        this.A09 = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public Drawable.ConstantState getConstantState() {
        return this.A0E;
    }
}
