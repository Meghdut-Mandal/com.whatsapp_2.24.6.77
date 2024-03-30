package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: X.0NO  reason: invalid class name */
public class AnonymousClass0NO extends C012505l implements Drawable.Callback, AnonymousClass08G, C010604l {
    public static final ShapeDrawable A0w = new ShapeDrawable(new OvalShape());
    public static final int[] A0x = {16842910};
    public float A00 = -1.0f;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public int A0D = 255;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public ColorStateList A0I;
    public ColorStateList A0J;
    public ColorStateList A0K;
    public ColorStateList A0L;
    public ColorStateList A0M;
    public ColorStateList A0N;
    public ColorStateList A0O;
    public ColorFilter A0P;
    public PorterDuffColorFilter A0Q;
    public Drawable A0R;
    public Drawable A0S;
    public Drawable A0T;
    public Drawable A0U;
    public TextUtils.TruncateAt A0V;
    public AnonymousClass06H A0W;
    public AnonymousClass06H A0X;
    public CharSequence A0Y;
    public CharSequence A0Z;
    public WeakReference A0a = AnonymousClass001.A0F((Object) null);
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public int[] A0h;
    public int A0i;
    public int A0j;
    public int A0k;
    public ColorStateList A0l;
    public PorterDuff.Mode A0m = PorterDuff.Mode.SRC_IN;
    public boolean A0n;
    public boolean A0o;
    public final Context A0p;
    public final Paint.FontMetrics A0q = new Paint.FontMetrics();
    public final Paint A0r = new Paint(1);
    public final Path A0s = new Path();
    public final PointF A0t = new PointF();
    public final RectF A0u = new RectF();
    public final AnonymousClass0UX A0v;

    public void A0S(ColorStateList colorStateList) {
        this.A0o = true;
        if (this.A0K != colorStateList) {
            this.A0K = colorStateList;
            if (A05()) {
                AnonymousClass076.A01(colorStateList, this.A0S);
            }
            AnonymousClass000.A17(this);
        }
    }

    private void A01(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            AnonymousClass08I.A05(AnonymousClass08I.A00(this), drawable);
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.A0T) {
                if (drawable.isStateful()) {
                    drawable.setState(this.A0h);
                }
                AnonymousClass076.A01(this.A0N, drawable);
                return;
            }
            Drawable drawable2 = this.A0S;
            if (drawable == drawable2 && this.A0o) {
                AnonymousClass076.A01(this.A0K, drawable2);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    private boolean A04() {
        if (!this.A0c || this.A0R == null || !this.A0e) {
            return false;
        }
        return true;
    }

    private boolean A05() {
        if (!this.A0n || this.A0S == null) {
            return false;
        }
        return true;
    }

    public static boolean A06(AnonymousClass0NO r1) {
        if (!r1.A0d || r1.A0T == null) {
            return false;
        }
        return true;
    }

    public float A0H() {
        if (!this.A0f) {
            return this.A00;
        }
        AnonymousClass06K r2 = this.A01.A0K.A06;
        RectF rectF = this.A0D;
        rectF.set(getBounds());
        return r2.BAD(rectF);
    }

    public void A0I() {
        C16060oU r1 = (C16060oU) this.A0a.get();
        if (r1 != null) {
            Chip chip = (Chip) r1;
            chip.A08(chip.A00);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    @Deprecated
    public void A0J(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            setShapeAppearanceModel(this.A01.A0K.A04(f));
        }
    }

    public void A0K(float f) {
        if (this.A02 != f) {
            float A0F2 = A0F();
            this.A02 = f;
            float A0F3 = A0F();
            invalidateSelf();
            if (A0F2 != A0F3) {
                A0I();
            }
        }
    }

    public void A0L(float f) {
        if (this.A05 != f) {
            this.A05 = f;
            this.A0r.setStrokeWidth(f);
            if (this.A0f) {
                this.A01.A04 = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public void A0M(float f) {
        if (this.A06 != f) {
            this.A06 = f;
            invalidateSelf();
            if (A06(this)) {
                A0I();
            }
        }
    }

    public void A0N(float f) {
        if (this.A07 != f) {
            this.A07 = f;
            invalidateSelf();
            if (A06(this)) {
                A0I();
            }
        }
    }

    public void A0O(float f) {
        if (this.A08 != f) {
            this.A08 = f;
            invalidateSelf();
            if (A06(this)) {
                A0I();
            }
        }
    }

    public void A0P(float f) {
        if (this.A09 != f) {
            float A0F2 = A0F();
            this.A09 = f;
            float A0F3 = A0F();
            invalidateSelf();
            if (A0F2 != A0F3) {
                A0I();
            }
        }
    }

    public void A0Q(float f) {
        if (this.A0A != f) {
            float A0F2 = A0F();
            this.A0A = f;
            float A0F3 = A0F();
            invalidateSelf();
            if (A0F2 != A0F3) {
                A0I();
            }
        }
    }

    public void A0R(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.A0I != colorStateList) {
            this.A0I = colorStateList;
            if (this.A0c && (drawable = this.A0R) != null && this.A0b) {
                AnonymousClass076.A01(colorStateList, drawable);
            }
            AnonymousClass000.A17(this);
        }
    }

    public void A0T(ColorStateList colorStateList) {
        if (this.A0L != colorStateList) {
            this.A0L = colorStateList;
            if (this.A0f) {
                A0D(colorStateList);
            }
            AnonymousClass000.A17(this);
        }
    }

    public void A0U(ColorStateList colorStateList) {
        if (this.A0N != colorStateList) {
            this.A0N = colorStateList;
            if (A06(this)) {
                AnonymousClass076.A01(colorStateList, this.A0T);
            }
            AnonymousClass000.A17(this);
        }
    }

    public void A0V(Drawable drawable) {
        if (this.A0R != drawable) {
            float A0F2 = A0F();
            this.A0R = drawable;
            float A0F3 = A0F();
            AnonymousClass000.A12(this.A0R);
            A01(this.A0R);
            invalidateSelf();
            if (A0F2 != A0F3) {
                A0I();
            }
        }
    }

    public void A0W(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.A0S;
        if (drawable3 == null) {
            drawable3 = null;
        } else if (drawable3 instanceof AnonymousClass077) {
            drawable3 = ((C03240Dt) ((AnonymousClass077) drawable3)).A00;
        }
        if (drawable3 != drawable) {
            float A0F2 = A0F();
            if (drawable != null) {
                drawable2 = AnonymousClass08I.A01(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.A0S = drawable2;
            float A0F3 = A0F();
            AnonymousClass000.A12(drawable3);
            if (A05()) {
                A01(this.A0S);
            }
            invalidateSelf();
            if (A0F2 != A0F3) {
                A0I();
            }
        }
    }

    public void A0X(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.A0T;
        if (drawable3 == null) {
            drawable3 = null;
        } else if (drawable3 instanceof AnonymousClass077) {
            drawable3 = ((C03240Dt) ((AnonymousClass077) drawable3)).A00;
        }
        if (drawable3 != drawable) {
            float A0G2 = A0G();
            if (drawable != null) {
                drawable2 = AnonymousClass08I.A01(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.A0T = drawable2;
            this.A0U = new RippleDrawable(C014906l.A02(this.A0O), this.A0T, A0w);
            float A0G3 = A0G();
            AnonymousClass000.A12(drawable3);
            if (A06(this)) {
                A01(this.A0T);
            }
            invalidateSelf();
            if (A0G2 != A0G3) {
                A0I();
            }
        }
    }

    public void A0Y(boolean z) {
        if (this.A0b != z) {
            this.A0b = z;
            float A0F2 = A0F();
            if (!z && this.A0e) {
                this.A0e = false;
            }
            float A0F3 = A0F();
            invalidateSelf();
            if (A0F2 != A0F3) {
                A0I();
            }
        }
    }

    public void A0Z(boolean z) {
        if (this.A0c != z) {
            boolean A042 = A04();
            this.A0c = z;
            boolean A043 = A04();
            if (A042 != A043) {
                Drawable drawable = this.A0R;
                if (A043) {
                    A01(drawable);
                } else {
                    AnonymousClass000.A12(drawable);
                }
                invalidateSelf();
                A0I();
            }
        }
    }

    public void A0a(boolean z) {
        if (this.A0n != z) {
            boolean A052 = A05();
            this.A0n = z;
            boolean A053 = A05();
            if (A052 != A053) {
                Drawable drawable = this.A0S;
                if (A053) {
                    A01(drawable);
                } else {
                    AnonymousClass000.A12(drawable);
                }
                invalidateSelf();
                A0I();
            }
        }
    }

    public void A0b(boolean z) {
        if (this.A0d != z) {
            boolean A062 = A06(this);
            this.A0d = z;
            boolean A063 = A06(this);
            if (A062 != A063) {
                Drawable drawable = this.A0T;
                if (A063) {
                    A01(drawable);
                } else {
                    AnonymousClass000.A12(drawable);
                }
                invalidateSelf();
                A0I();
            }
        }
    }

    public void draw(Canvas canvas) {
        int i;
        float f;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.A0D) != 0) {
            int i2 = 0;
            Canvas canvas2 = canvas;
            if (i < 255) {
                float f2 = (float) bounds.left;
                float f3 = (float) bounds.top;
                float f4 = (float) bounds.right;
                float f5 = (float) bounds.bottom;
                if (Build.VERSION.SDK_INT > 21) {
                    i2 = canvas2.saveLayerAlpha(f2, f3, f4, f5, i);
                } else {
                    i2 = canvas2.saveLayerAlpha(f2, f3, f4, f5, i, 31);
                }
            }
            if (!this.A0f) {
                Paint paint = this.A0r;
                paint.setColor(this.A0G);
                paint.setStyle(Paint.Style.FILL);
                RectF rectF = this.A0u;
                rectF.set(bounds);
                canvas2.drawRoundRect(rectF, A0H(), A0H(), paint);
            }
            if (!this.A0f) {
                Paint paint2 = this.A0r;
                paint2.setColor(this.A0E);
                paint2.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.A0P;
                if (colorFilter == null) {
                    colorFilter = this.A0Q;
                }
                paint2.setColorFilter(colorFilter);
                RectF rectF2 = this.A0u;
                rectF2.set(bounds);
                canvas2.drawRoundRect(rectF2, A0H(), A0H(), paint2);
            }
            if (this.A0f) {
                super.draw(canvas2);
            }
            if (this.A05 > 0.0f && !this.A0f) {
                Paint paint3 = this.A0r;
                paint3.setColor(this.A0F);
                paint3.setStyle(Paint.Style.STROKE);
                if (!this.A0f) {
                    ColorFilter colorFilter2 = this.A0P;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.A0Q;
                    }
                    paint3.setColorFilter(colorFilter2);
                }
                RectF rectF3 = this.A0u;
                float f6 = this.A05 / 2.0f;
                rectF3.set(((float) bounds.left) + f6, ((float) bounds.top) + f6, ((float) bounds.right) - f6, ((float) bounds.bottom) - f6);
                float f7 = this.A00 - (this.A05 / 2.0f);
                canvas2.drawRoundRect(rectF3, f7, f7, paint3);
            }
            Paint paint4 = this.A0r;
            paint4.setColor(0);
            paint4.setStyle(Paint.Style.FILL);
            RectF rectF4 = this.A0u;
            rectF4.set(bounds);
            if (!this.A0f) {
                canvas2.drawRoundRect(rectF4, A0H(), A0H(), paint4);
            } else {
                RectF rectF5 = new RectF(bounds);
                Path path = this.A0s;
                C013906b r13 = this.A0F;
                AnonymousClass06X r0 = this.A01;
                r13.A01(path, rectF5, r0.A0K, this.A0E, r0.A01);
                RectF rectF6 = this.A0D;
                rectF6.set(getBounds());
                AnonymousClass06J r4 = this.A01.A0K;
                if (r4.A05(rectF6)) {
                    float BAD = r4.A07.BAD(rectF6) * this.A01.A01;
                    canvas2.drawRoundRect(rectF6, BAD, BAD, paint4);
                } else {
                    canvas2.drawPath(path, paint4);
                }
            }
            if (A05()) {
                A00(bounds, rectF4);
                float f8 = rectF4.left;
                float f9 = rectF4.top;
                canvas2.translate(f8, f9);
                this.A0S.setBounds(0, 0, (int) rectF4.width(), (int) rectF4.height());
                this.A0S.draw(canvas2);
                canvas2.translate(-f8, -f9);
            }
            if (A04()) {
                A00(bounds, rectF4);
                float f10 = rectF4.left;
                float f11 = rectF4.top;
                canvas2.translate(f10, f11);
                this.A0R.setBounds(0, 0, (int) rectF4.width(), (int) rectF4.height());
                this.A0R.draw(canvas2);
                canvas2.translate(-f10, -f11);
            }
            if (this.A0g && this.A0Z != null) {
                PointF pointF = this.A0t;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                if (this.A0Z != null) {
                    float A0F2 = this.A04 + A0F() + this.A0C;
                    if (AnonymousClass08I.A00(this) == 0) {
                        pointF.x = ((float) bounds.left) + A0F2;
                    } else {
                        pointF.x = ((float) bounds.right) - A0F2;
                        align = Paint.Align.RIGHT;
                    }
                    float centerY = (float) bounds.centerY();
                    TextPaint textPaint = this.A0v.A04;
                    Paint.FontMetrics fontMetrics = this.A0q;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF4.setEmpty();
                if (this.A0Z != null) {
                    float A0F3 = this.A04 + A0F() + this.A0C;
                    float A0G2 = this.A01 + A0G() + this.A0B;
                    int A002 = AnonymousClass08I.A00(this);
                    float f12 = (float) bounds.left;
                    if (A002 == 0) {
                        rectF4.left = f12 + A0F3;
                        f = ((float) bounds.right) - A0G2;
                    } else {
                        rectF4.left = f12 + A0G2;
                        f = ((float) bounds.right) - A0F3;
                    }
                    rectF4.right = f;
                    rectF4.top = (float) bounds.top;
                    rectF4.bottom = (float) bounds.bottom;
                }
                AnonymousClass0UX r10 = this.A0v;
                if (r10.A00 != null) {
                    TextPaint textPaint2 = r10.A04;
                    textPaint2.drawableState = getState();
                    r10.A00.A04(this.A0p, textPaint2, r10.A05);
                }
                TextPaint textPaint3 = r10.A04;
                textPaint3.setTextAlign(align);
                int round = Math.round(r10.A00(this.A0Z.toString()));
                int i3 = 0;
                boolean z = false;
                if (round > Math.round(rectF4.width())) {
                    z = true;
                    i3 = canvas2.save();
                    canvas2.clipRect(rectF4);
                }
                CharSequence charSequence = this.A0Z;
                if (z && this.A0V != null) {
                    charSequence = TextUtils.ellipsize(charSequence, textPaint3, rectF4.width(), this.A0V);
                }
                canvas2.drawText(charSequence, 0, charSequence.length(), pointF.x, pointF.y, textPaint3);
                if (z) {
                    canvas2.restoreToCount(i3);
                }
            }
            if (A06(this)) {
                rectF4.setEmpty();
                if (A06(this)) {
                    float f13 = this.A01 + this.A06;
                    if (AnonymousClass08I.A00(this) == 0) {
                        float f14 = ((float) bounds.right) - f13;
                        rectF4.right = f14;
                        rectF4.left = f14 - this.A07;
                    } else {
                        float f15 = ((float) bounds.left) + f13;
                        rectF4.left = f15;
                        rectF4.right = f15 + this.A07;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f16 = this.A07;
                    float f17 = exactCenterY - (f16 / 2.0f);
                    rectF4.top = f17;
                    rectF4.bottom = f17 + f16;
                }
                float f18 = rectF4.left;
                float f19 = rectF4.top;
                canvas2.translate(f18, f19);
                this.A0T.setBounds(0, 0, (int) rectF4.width(), (int) rectF4.height());
                this.A0U.setBounds(this.A0T.getBounds());
                this.A0U.jumpToCurrentState();
                this.A0U.draw(canvas2);
                canvas2.translate(-f18, -f19);
            }
            if (this.A0D < 255) {
                canvas2.restoreToCount(i2);
            }
        }
    }

    public int getIntrinsicHeight() {
        return (int) this.A03;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.A04 + A0F() + this.A0C + this.A0v.A00(this.A0Z.toString()) + this.A0B + A0G() + this.A01), this.A0H);
    }

    public void getOutline(Outline outline) {
        Outline outline2 = outline;
        if (this.A0f) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.A00);
        } else {
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.A03, this.A00);
        }
        outline.setAlpha(((float) this.A0D) / 255.0f);
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.A0M;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.A0J;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.A0L;
        if (colorStateList4 != null && colorStateList4.isStateful()) {
            return true;
        }
        AnonymousClass0YF r0 = this.A0v.A00;
        if (r0 != null && (colorStateList = r0.A01) != null && colorStateList.isStateful()) {
            return true;
        }
        if (this.A0c && this.A0R != null && this.A0b) {
            return true;
        }
        Drawable drawable = this.A0S;
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        Drawable drawable2 = this.A0R;
        if (drawable2 != null && drawable2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList5 = this.A0l;
        if (colorStateList5 == null || !colorStateList5.isStateful()) {
            return false;
        }
        return true;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.A0f) {
            super.onStateChange(iArr);
        }
        return A07(this, iArr, this.A0h);
    }

    public void setAlpha(int i) {
        if (this.A0D != i) {
            this.A0D = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.A0P != colorFilter) {
            this.A0P = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.A0l != colorStateList) {
            this.A0l = colorStateList;
            AnonymousClass000.A17(this);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.A0m != mode) {
            this.A0m = mode;
            ColorStateList colorStateList = this.A0l;
            if (colorStateList == null || mode == null) {
                porterDuffColorFilter = null;
            } else {
                porterDuffColorFilter = AnonymousClass000.A0V(colorStateList, mode, this);
            }
            this.A0Q = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    public AnonymousClass0NO(Context context, AttributeSet attributeSet, int i) {
        super(new AnonymousClass06J(AnonymousClass06J.A01(context, attributeSet, i, R.style.f13nameremoved)));
        A0B(context);
        this.A0p = context;
        AnonymousClass0UX r1 = new AnonymousClass0UX(this);
        this.A0v = r1;
        this.A0Z = "";
        r1.A04.density = AnonymousClass000.A0X(context).density;
        int[] iArr = A0x;
        setState(iArr);
        if (!Arrays.equals(this.A0h, iArr)) {
            this.A0h = iArr;
            if (A06(this)) {
                A07(this, getState(), iArr);
            }
        }
        this.A0g = true;
        A0w.setTint(-1);
    }

    private void A00(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        rectF.setEmpty();
        if (A05() || A04()) {
            float f = this.A04 + this.A0A;
            if (this.A0e) {
                drawable = this.A0R;
            } else {
                drawable = this.A0S;
            }
            float f2 = this.A02;
            if (f2 <= 0.0f && drawable != null) {
                f2 = (float) drawable.getIntrinsicWidth();
            }
            if (AnonymousClass08I.A00(this) == 0) {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + f2;
            } else {
                float f4 = ((float) rect.right) - f;
                rectF.right = f4;
                rectF.left = f4 - f2;
            }
            if (this.A0e) {
                drawable2 = this.A0R;
            } else {
                drawable2 = this.A0S;
            }
            float f5 = this.A02;
            if (f5 <= 0.0f && drawable2 != null) {
                f5 = (float) Math.ceil((double) AnonymousClass062.A00(this.A0p, 24));
                if (((float) drawable2.getIntrinsicHeight()) <= f5) {
                    f5 = (float) drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f5;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0224  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.util.AttributeSet r12, X.AnonymousClass0NO r13, int r14) {
        /*
            r11 = 2132084599(0x7f150777, float:1.9809373E38)
            android.content.Context r6 = r13.A0p
            int[] r8 = X.C27931Qk.A05
            r1 = 0
            int[] r9 = new int[r1]
            r7 = r12
            r10 = r14
            android.content.res.TypedArray r2 = X.C013205s.A00(r6, r7, r8, r9, r10, r11)
            r0 = 37
            boolean r0 = r2.hasValue(r0)
            r13.A0f = r0
            r0 = 24
            android.content.res.ColorStateList r3 = X.AnonymousClass061.A00(r6, r2, r0)
            android.content.res.ColorStateList r0 = r13.A0M
            if (r0 == r3) goto L_0x0027
            r13.A0M = r3
            X.AnonymousClass000.A17(r13)
        L_0x0027:
            r0 = 11
            android.content.res.ColorStateList r3 = X.AnonymousClass061.A00(r6, r2, r0)
            android.content.res.ColorStateList r0 = r13.A0J
            if (r0 == r3) goto L_0x0036
            r13.A0J = r3
            X.AnonymousClass000.A17(r13)
        L_0x0036:
            r0 = 19
            r3 = 0
            float r4 = r2.getDimension(r0, r3)
            float r0 = r13.A03
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x004b
            r13.A03 = r4
            r13.invalidateSelf()
            r13.A0I()
        L_0x004b:
            r0 = 12
            r4 = 12
            boolean r0 = r2.hasValue(r0)
            if (r0 == 0) goto L_0x005c
            float r0 = r2.getDimension(r4, r3)
            r13.A0J(r0)
        L_0x005c:
            r0 = 22
            android.content.res.ColorStateList r0 = X.AnonymousClass061.A00(r6, r2, r0)
            r13.A0T(r0)
            r0 = 23
            float r0 = r2.getDimension(r0, r3)
            r13.A0L(r0)
            r0 = 36
            android.content.res.ColorStateList r4 = X.AnonymousClass061.A00(r6, r2, r0)
            android.content.res.ColorStateList r0 = r13.A0O
            if (r0 == r4) goto L_0x007d
            r13.A0O = r4
            X.AnonymousClass000.A17(r13)
        L_0x007d:
            r0 = 5
            java.lang.CharSequence r4 = r2.getText(r0)
            if (r4 != 0) goto L_0x0086
            java.lang.String r4 = ""
        L_0x0086:
            java.lang.CharSequence r0 = r13.A0Z
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 != 0) goto L_0x009b
            r13.A0Z = r4
            X.0UX r4 = r13.A0v
            r0 = 1
            r4.A02 = r0
            r13.invalidateSelf()
            r13.A0I()
        L_0x009b:
            boolean r0 = r2.hasValue(r1)
            if (r0 == 0) goto L_0x0242
            int r0 = r2.getResourceId(r1, r1)
            if (r0 == 0) goto L_0x0242
            X.0YF r5 = new X.0YF
            r5.<init>(r6, r0)
        L_0x00ac:
            r4 = 1
            float r0 = r5.A00
            float r0 = r2.getDimension(r4, r0)
            r5.A00 = r0
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r4 >= r0) goto L_0x00c2
            r0 = 2
            android.content.res.ColorStateList r0 = X.AnonymousClass061.A00(r6, r2, r0)
            r5.A01 = r0
        L_0x00c2:
            X.0UX r0 = r13.A0v
            r0.A01(r6, r5)
            r0 = 3
            int r4 = r2.getInt(r0, r1)
            r0 = 1
            if (r4 == r0) goto L_0x023e
            r0 = 2
            if (r4 == r0) goto L_0x023a
            r0 = 3
            if (r4 != r0) goto L_0x00d9
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
        L_0x00d7:
            r13.A0V = r0
        L_0x00d9:
            r0 = 18
            boolean r0 = r2.getBoolean(r0, r1)
            r13.A0a(r0)
            java.lang.String r4 = "http://schemas.android.com/apk/res-auto"
            if (r12 == 0) goto L_0x00ff
            java.lang.String r0 = "chipIconEnabled"
            java.lang.String r0 = r12.getAttributeValue(r4, r0)
            if (r0 == 0) goto L_0x00ff
            java.lang.String r0 = "chipIconVisible"
            java.lang.String r0 = r12.getAttributeValue(r4, r0)
            if (r0 != 0) goto L_0x00ff
            r0 = 15
            boolean r0 = r2.getBoolean(r0, r1)
            r13.A0a(r0)
        L_0x00ff:
            r0 = 14
            android.graphics.drawable.Drawable r0 = X.AnonymousClass061.A02(r6, r2, r0)
            r13.A0W(r0)
            r0 = 17
            r5 = 17
            boolean r0 = r2.hasValue(r0)
            if (r0 == 0) goto L_0x0119
            android.content.res.ColorStateList r0 = X.AnonymousClass061.A00(r6, r2, r5)
            r13.A0S(r0)
        L_0x0119:
            r5 = 16
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = r2.getDimension(r5, r0)
            r13.A0K(r0)
            r0 = 31
            boolean r0 = r2.getBoolean(r0, r1)
            r13.A0b(r0)
            if (r12 == 0) goto L_0x0148
            java.lang.String r0 = "closeIconEnabled"
            java.lang.String r0 = r12.getAttributeValue(r4, r0)
            if (r0 == 0) goto L_0x0148
            java.lang.String r0 = "closeIconVisible"
            java.lang.String r0 = r12.getAttributeValue(r4, r0)
            if (r0 != 0) goto L_0x0148
            r0 = 26
            boolean r0 = r2.getBoolean(r0, r1)
            r13.A0b(r0)
        L_0x0148:
            r0 = 25
            android.graphics.drawable.Drawable r0 = X.AnonymousClass061.A02(r6, r2, r0)
            r13.A0X(r0)
            r0 = 30
            android.content.res.ColorStateList r0 = X.AnonymousClass061.A00(r6, r2, r0)
            r13.A0U(r0)
            r0 = 28
            float r0 = r2.getDimension(r0, r3)
            r13.A0N(r0)
            r0 = 6
            boolean r0 = r2.getBoolean(r0, r1)
            r13.A0Y(r0)
            r0 = 10
            boolean r0 = r2.getBoolean(r0, r1)
            r13.A0Z(r0)
            if (r12 == 0) goto L_0x018f
            java.lang.String r0 = "checkedIconEnabled"
            java.lang.String r0 = r12.getAttributeValue(r4, r0)
            if (r0 == 0) goto L_0x018f
            java.lang.String r0 = "checkedIconVisible"
            java.lang.String r0 = r12.getAttributeValue(r4, r0)
            if (r0 != 0) goto L_0x018f
            r0 = 8
            boolean r0 = r2.getBoolean(r0, r1)
            r13.A0Z(r0)
        L_0x018f:
            r0 = 7
            android.graphics.drawable.Drawable r0 = X.AnonymousClass061.A02(r6, r2, r0)
            r13.A0V(r0)
            r0 = 9
            r1 = 9
            boolean r0 = r2.hasValue(r0)
            if (r0 == 0) goto L_0x01a8
            android.content.res.ColorStateList r0 = X.AnonymousClass061.A00(r6, r2, r1)
            r13.A0R(r0)
        L_0x01a8:
            r0 = 39
            X.06H r0 = X.AnonymousClass06H.A01(r6, r2, r0)
            r13.A0X = r0
            r0 = 33
            X.06H r0 = X.AnonymousClass06H.A01(r6, r2, r0)
            r13.A0W = r0
            r0 = 21
            float r1 = r2.getDimension(r0, r3)
            float r0 = r13.A04
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x01cc
            r13.A04 = r1
            r13.invalidateSelf()
            r13.A0I()
        L_0x01cc:
            r0 = 35
            float r0 = r2.getDimension(r0, r3)
            r13.A0Q(r0)
            r0 = 34
            float r0 = r2.getDimension(r0, r3)
            r13.A0P(r0)
            r0 = 41
            float r1 = r2.getDimension(r0, r3)
            float r0 = r13.A0C
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x01f2
            r13.A0C = r1
            r13.invalidateSelf()
            r13.A0I()
        L_0x01f2:
            r0 = 40
            float r1 = r2.getDimension(r0, r3)
            float r0 = r13.A0B
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0206
            r13.A0B = r1
            r13.invalidateSelf()
            r13.A0I()
        L_0x0206:
            r0 = 29
            float r0 = r2.getDimension(r0, r3)
            r13.A0O(r0)
            r0 = 27
            float r0 = r2.getDimension(r0, r3)
            r13.A0M(r0)
            r0 = 13
            float r1 = r2.getDimension(r0, r3)
            float r0 = r13.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x022c
            r13.A01 = r1
            r13.invalidateSelf()
            r13.A0I()
        L_0x022c:
            r1 = 4
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r0 = r2.getDimensionPixelSize(r1, r0)
            r13.A0H = r0
            r2.recycle()
            return
        L_0x023a:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L_0x00d7
        L_0x023e:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.START
            goto L_0x00d7
        L_0x0242:
            r5 = 0
            goto L_0x00ac
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0NO.A02(android.util.AttributeSet, X.0NO, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008b, code lost:
        if (r8.A0b == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a4, code lost:
        if (r1 != r8.A0F()) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A07(X.AnonymousClass0NO r8, int[] r9, int[] r10) {
        /*
            boolean r7 = super.onStateChange(r9)
            android.content.res.ColorStateList r1 = r8.A0M
            r4 = 0
            if (r1 == 0) goto L_0x013c
            int r0 = r8.A0G
            int r0 = r1.getColorForState(r9, r0)
        L_0x000f:
            int r2 = r8.A08(r0)
            int r0 = r8.A0G
            r6 = 1
            if (r0 == r2) goto L_0x001b
            r8.A0G = r2
            r7 = 1
        L_0x001b:
            android.content.res.ColorStateList r1 = r8.A0J
            if (r1 == 0) goto L_0x0139
            int r0 = r8.A0E
            int r0 = r1.getColorForState(r9, r0)
        L_0x0025:
            int r1 = r8.A08(r0)
            int r0 = r8.A0E
            if (r0 == r1) goto L_0x0030
            r8.A0E = r1
            r7 = 1
        L_0x0030:
            int r2 = X.C018107s.A05(r1, r2)
            int r0 = r8.A0i
            r1 = 0
            if (r0 == r2) goto L_0x003a
            r1 = 1
        L_0x003a:
            X.06X r0 = r8.A01
            android.content.res.ColorStateList r0 = r0.A0B
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r1 = r1 | r0
            if (r1 == 0) goto L_0x004f
            r8.A0i = r2
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r2)
            r8.A0C(r0)
            r7 = 1
        L_0x004f:
            android.content.res.ColorStateList r1 = r8.A0L
            if (r1 == 0) goto L_0x0136
            int r0 = r8.A0F
            int r1 = r1.getColorForState(r9, r0)
        L_0x0059:
            int r0 = r8.A0F
            if (r0 == r1) goto L_0x0060
            r8.A0F = r1
            r7 = 1
        L_0x0060:
            X.0UX r0 = r8.A0v
            X.0YF r0 = r0.A00
            if (r0 == 0) goto L_0x0133
            android.content.res.ColorStateList r1 = r0.A01
            if (r1 == 0) goto L_0x0133
            int r0 = r8.A0j
            int r1 = r1.getColorForState(r9, r0)
        L_0x0070:
            int r0 = r8.A0j
            if (r0 == r1) goto L_0x0077
            r8.A0j = r1
            r7 = 1
        L_0x0077:
            int[] r5 = r8.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r5 == 0) goto L_0x008d
            int r2 = r5.length
            r1 = 0
        L_0x0082:
            if (r1 >= r2) goto L_0x008d
            r0 = r5[r1]
            if (r0 != r3) goto L_0x012f
            boolean r0 = r8.A0b
            r2 = 1
            if (r0 != 0) goto L_0x008e
        L_0x008d:
            r2 = 0
        L_0x008e:
            boolean r0 = r8.A0e
            if (r0 == r2) goto L_0x00a6
            android.graphics.drawable.Drawable r0 = r8.A0R
            if (r0 == 0) goto L_0x00a6
            float r1 = r8.A0F()
            r8.A0e = r2
            float r0 = r8.A0F()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r7 = 1
            r5 = 1
            if (r0 != 0) goto L_0x00a7
        L_0x00a6:
            r5 = 0
        L_0x00a7:
            android.content.res.ColorStateList r1 = r8.A0l
            if (r1 == 0) goto L_0x012d
            int r0 = r8.A0k
            int r1 = r1.getColorForState(r9, r0)
        L_0x00b1:
            int r0 = r8.A0k
            if (r0 == r1) goto L_0x012b
            r8.A0k = r1
            android.content.res.ColorStateList r1 = r8.A0l
            android.graphics.PorterDuff$Mode r2 = r8.A0m
            if (r1 == 0) goto L_0x0129
            if (r2 == 0) goto L_0x0129
            int[] r0 = r8.getState()
            int r0 = r1.getColorForState(r0, r4)
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter
            r1.<init>(r0, r2)
        L_0x00cc:
            r8.A0Q = r1
        L_0x00ce:
            android.graphics.drawable.Drawable r0 = r8.A0S
            if (r0 == 0) goto L_0x00df
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x00df
            android.graphics.drawable.Drawable r0 = r8.A0S
            boolean r0 = r0.setState(r9)
            r6 = r6 | r0
        L_0x00df:
            android.graphics.drawable.Drawable r0 = r8.A0R
            if (r0 == 0) goto L_0x00f0
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x00f0
            android.graphics.drawable.Drawable r0 = r8.A0R
            boolean r0 = r0.setState(r9)
            r6 = r6 | r0
        L_0x00f0:
            android.graphics.drawable.Drawable r0 = r8.A0T
            if (r0 == 0) goto L_0x010d
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x010d
            int r3 = r9.length
            int r2 = r10.length
            int r0 = r3 + r2
            int[] r1 = new int[r0]
            java.lang.System.arraycopy(r9, r4, r1, r4, r3)
            java.lang.System.arraycopy(r10, r4, r1, r3, r2)
            android.graphics.drawable.Drawable r0 = r8.A0T
            boolean r0 = r0.setState(r1)
            r6 = r6 | r0
        L_0x010d:
            android.graphics.drawable.Drawable r0 = r8.A0U
            if (r0 == 0) goto L_0x011e
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x011e
            android.graphics.drawable.Drawable r0 = r8.A0U
            boolean r0 = r0.setState(r10)
            r6 = r6 | r0
        L_0x011e:
            if (r6 == 0) goto L_0x0123
            r8.invalidateSelf()
        L_0x0123:
            if (r5 == 0) goto L_0x0128
            r8.A0I()
        L_0x0128:
            return r6
        L_0x0129:
            r1 = 0
            goto L_0x00cc
        L_0x012b:
            r6 = r7
            goto L_0x00ce
        L_0x012d:
            r1 = 0
            goto L_0x00b1
        L_0x012f:
            int r1 = r1 + 1
            goto L_0x0082
        L_0x0133:
            r1 = 0
            goto L_0x0070
        L_0x0136:
            r1 = 0
            goto L_0x0059
        L_0x0139:
            r0 = 0
            goto L_0x0025
        L_0x013c:
            r0 = 0
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0NO.A07(X.0NO, int[], int[]):boolean");
    }

    public float A0F() {
        Drawable drawable;
        if (!A05() && !A04()) {
            return 0.0f;
        }
        float f = this.A0A;
        if (this.A0e) {
            drawable = this.A0R;
        } else {
            drawable = this.A0S;
        }
        float f2 = this.A02;
        if (f2 <= 0.0f && drawable != null) {
            f2 = (float) drawable.getIntrinsicWidth();
        }
        return f + f2 + this.A09;
    }

    public float A0G() {
        if (A06(this)) {
            return this.A08 + this.A07 + this.A06;
        }
        return 0.0f;
    }

    public void Bj0() {
        A0I();
        invalidateSelf();
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (A05()) {
            onLayoutDirectionChanged |= AnonymousClass08I.A05(i, this.A0S);
        }
        if (A04()) {
            onLayoutDirectionChanged |= AnonymousClass08I.A05(i, this.A0R);
        }
        if (A06(this)) {
            onLayoutDirectionChanged |= AnonymousClass08I.A05(i, this.A0T);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (A05()) {
            onLevelChange |= this.A0S.setLevel(i);
        }
        if (A04()) {
            onLevelChange |= this.A0R.setLevel(i);
        }
        if (A06(this)) {
            onLevelChange |= this.A0T.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (A05()) {
            visible |= this.A0S.setVisible(z, z2);
        }
        if (A04()) {
            visible |= this.A0R.setVisible(z, z2);
        }
        if (A06(this)) {
            visible |= this.A0T.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public int getAlpha() {
        return this.A0D;
    }

    public ColorFilter getColorFilter() {
        return this.A0P;
    }
}
