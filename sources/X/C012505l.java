package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.Log;
import java.util.BitSet;

/* renamed from: X.05l  reason: invalid class name and case insensitive filesystem */
public class C012505l extends Drawable implements C012405k, C010604l {
    public static final Paint A0N;
    public int A00;
    public AnonymousClass06X A01;
    public AnonymousClass06J A02;
    public boolean A03;
    public boolean A04;
    public PorterDuffColorFilter A05;
    public PorterDuffColorFilter A06;
    public final Paint A07;
    public final Paint A08;
    public final Path A09;
    public final Path A0A;
    public final RectF A0B;
    public final RectF A0C;
    public final RectF A0D;
    public final C014206e A0E;
    public final C013906b A0F;
    public final BitSet A0G;
    public final AnonymousClass06Y[] A0H;
    public final AnonymousClass06Y[] A0I;
    public final Matrix A0J;
    public final Region A0K;
    public final Region A0L;
    public final AnonymousClass06Z A0M;

    static {
        Paint paint = new Paint(1);
        A0N = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public int getOpacity() {
        return -3;
    }

    public void invalidateSelf() {
        this.A03 = true;
        super.invalidateSelf();
    }

    public void onBoundsChange(Rect rect) {
        this.A03 = true;
        super.onBoundsChange(rect);
    }

    private float A00() {
        Paint.Style style = this.A01.A0G;
        if (style != Paint.Style.FILL_AND_STROKE && style != Paint.Style.STROKE) {
            return 0.0f;
        }
        Paint paint = this.A08;
        if (paint.getStrokeWidth() > 0.0f) {
            return paint.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private void A01(Canvas canvas) {
        if (this.A0G.cardinality() > 0) {
            Log.w("MaterialShapeDrawable", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.A01.A08 != 0) {
            canvas.drawPath(this.A09, this.A0M.A05);
        }
        int i = 0;
        do {
            AnonymousClass06Y r1 = this.A0H[i];
            AnonymousClass06Z r3 = this.A0M;
            int i2 = this.A01.A09;
            Matrix matrix = AnonymousClass06Y.A01;
            r1.A00(canvas, matrix, r3, i2);
            this.A0I[i].A00(canvas, matrix, r3, this.A01.A09);
            i++;
        } while (i < 4);
        if (this.A04) {
            AnonymousClass06X r12 = this.A01;
            double d = (double) r12.A08;
            double radians = Math.toRadians((double) r12.A0A);
            int sin = (int) (d * Math.sin(radians));
            int cos = (int) (d * Math.cos(radians));
            canvas.translate((float) (-sin), (float) (-cos));
            canvas.drawPath(this.A09, A0N);
            canvas.translate((float) sin, (float) cos);
        }
    }

    private void A02(Path path, RectF rectF) {
        C013906b r4 = this.A0F;
        AnonymousClass06X r0 = this.A01;
        Path path2 = path;
        RectF rectF2 = rectF;
        r4.A01(path2, rectF2, r0.A0K, this.A0E, r0.A01);
        if (this.A01.A03 != 1.0f) {
            Matrix matrix = this.A0J;
            matrix.reset();
            float f = this.A01.A03;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.A0C, true);
    }

    public static void A03(C012505l r5) {
        AnonymousClass06X r4 = r5.A01;
        float f = r4.A00 + r4.A05;
        r4.A09 = (int) Math.ceil((double) (0.75f * f));
        r4.A08 = (int) Math.ceil((double) (f * 0.25f));
        r5.A04();
        super.invalidateSelf();
    }

    private boolean A04() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2;
        PorterDuffColorFilter porterDuffColorFilter3 = this.A06;
        PorterDuffColorFilter porterDuffColorFilter4 = this.A05;
        AnonymousClass06X r0 = this.A01;
        ColorStateList colorStateList = r0.A0E;
        PorterDuff.Mode mode = r0.A0H;
        Paint paint = this.A07;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int A082 = A08(color);
            this.A00 = A082;
            if (A082 != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(A082, PorterDuff.Mode.SRC_IN);
            } else {
                porterDuffColorFilter = null;
            }
        } else {
            int A083 = A08(colorStateList.getColorForState(getState(), 0));
            this.A00 = A083;
            porterDuffColorFilter = new PorterDuffColorFilter(A083, mode);
        }
        this.A06 = porterDuffColorFilter;
        AnonymousClass06X r02 = this.A01;
        ColorStateList colorStateList2 = r02.A0D;
        PorterDuff.Mode mode2 = r02.A0H;
        if (colorStateList2 == null || mode2 == null) {
            porterDuffColorFilter2 = null;
        } else {
            int colorForState = colorStateList2.getColorForState(getState(), 0);
            this.A00 = colorForState;
            porterDuffColorFilter2 = new PorterDuffColorFilter(colorForState, mode2);
        }
        this.A05 = porterDuffColorFilter2;
        AnonymousClass06X r1 = this.A01;
        if (r1.A0L) {
            AnonymousClass06Z r5 = this.A0M;
            int colorForState2 = r1.A0E.getColorForState(getState(), 0);
            int A062 = C018107s.A06(colorForState2, 68);
            r5.A02 = A062;
            r5.A01 = C018107s.A06(colorForState2, 20);
            r5.A00 = colorForState2 & 16777215;
            r5.A05.setColor(A062);
        }
        if (!C014106d.A01(porterDuffColorFilter3, this.A06) || !C014106d.A01(porterDuffColorFilter4, this.A05)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r2 = r5.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r2 = r5.A08;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A05(int[] r6) {
        /*
            r5 = this;
            X.06X r0 = r5.A01
            android.content.res.ColorStateList r0 = r0.A0B
            r4 = 1
            if (r0 == 0) goto L_0x0035
            android.graphics.Paint r2 = r5.A07
            int r1 = r2.getColor()
            X.06X r0 = r5.A01
            android.content.res.ColorStateList r0 = r0.A0B
            int r0 = r0.getColorForState(r6, r1)
            if (r1 == r0) goto L_0x0035
            r2.setColor(r0)
            r3 = 1
        L_0x001b:
            X.06X r0 = r5.A01
            android.content.res.ColorStateList r0 = r0.A0C
            if (r0 == 0) goto L_0x0037
            android.graphics.Paint r2 = r5.A08
            int r1 = r2.getColor()
            X.06X r0 = r5.A01
            android.content.res.ColorStateList r0 = r0.A0C
            int r0 = r0.getColorForState(r6, r1)
            if (r1 == r0) goto L_0x0037
            r2.setColor(r0)
            return r4
        L_0x0035:
            r3 = 0
            goto L_0x001b
        L_0x0037:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C012505l.A05(int[]):boolean");
    }

    public int A08(int i) {
        AnonymousClass06X r2 = this.A01;
        float f = r2.A00 + r2.A05 + r2.A02;
        C014406g r0 = r2.A0J;
        if (r0 != null) {
            return r0.A00(i, f);
        }
        return i;
    }

    public void A09(float f) {
        AnonymousClass06X r1 = this.A01;
        if (r1.A00 != f) {
            r1.A00 = f;
            A03(this);
        }
    }

    public void A0A(int i, float f) {
        this.A01.A04 = f;
        invalidateSelf();
        A0D(ColorStateList.valueOf(i));
    }

    public void A0B(Context context) {
        this.A01.A0J = new C014406g(context);
        A03(this);
    }

    public void A0C(ColorStateList colorStateList) {
        AnonymousClass06X r1 = this.A01;
        if (r1.A0B != colorStateList) {
            r1.A0B = colorStateList;
            onStateChange(getState());
        }
    }

    public void A0D(ColorStateList colorStateList) {
        AnonymousClass06X r1 = this.A01;
        if (r1.A0C != colorStateList) {
            r1.A0C = colorStateList;
            onStateChange(getState());
        }
    }

    public void A0E(Canvas canvas) {
        Paint paint = this.A08;
        Path path = this.A0A;
        AnonymousClass06J r3 = this.A02;
        RectF rectF = this.A0B;
        RectF rectF2 = this.A0D;
        rectF2.set(getBounds());
        rectF.set(rectF2);
        float A002 = A00();
        rectF.inset(A002, A002);
        if (r3.A05(rectF)) {
            float BAD = r3.A07.BAD(rectF) * this.A01.A01;
            canvas.drawRoundRect(rectF, BAD, BAD, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f0, code lost:
        if (android.os.Build.VERSION.SDK_INT < 29) goto L_0x00f2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r15) {
        /*
            r14 = this;
            android.graphics.Paint r7 = r14.A07
            android.graphics.PorterDuffColorFilter r0 = r14.A06
            r7.setColorFilter(r0)
            int r6 = r7.getAlpha()
            X.06X r0 = r14.A01
            int r1 = r0.A06
            int r0 = r1 >>> 7
            int r1 = r1 + r0
            int r0 = r6 * r1
            int r0 = r0 >>> 8
            r7.setAlpha(r0)
            android.graphics.Paint r5 = r14.A08
            android.graphics.PorterDuffColorFilter r0 = r14.A05
            r5.setColorFilter(r0)
            X.06X r0 = r14.A01
            float r0 = r0.A04
            r5.setStrokeWidth(r0)
            int r4 = r5.getAlpha()
            X.06X r0 = r14.A01
            int r1 = r0.A06
            int r0 = r1 >>> 7
            int r1 = r1 + r0
            int r0 = r4 * r1
            int r0 = r0 >>> 8
            r5.setAlpha(r0)
            boolean r0 = r14.A03
            if (r0 == 0) goto L_0x00c5
            float r0 = r14.A00()
            float r0 = -r0
            X.06X r2 = r14.A01
            X.06J r9 = r2.A0K
            X.0D6 r8 = new X.0D6
            r8.<init>(r14, r0)
            X.06M r3 = new X.06M
            r3.<init>(r9)
            X.06K r10 = r9.A06
            boolean r0 = r10 instanceof X.AnonymousClass06L
            if (r0 != 0) goto L_0x005e
            float r1 = r8.A01
            X.0D7 r0 = new X.0D7
            r0.<init>(r10, r1)
            r10 = r0
        L_0x005e:
            r3.A02 = r10
            X.06K r10 = r9.A07
            boolean r0 = r10 instanceof X.AnonymousClass06L
            if (r0 != 0) goto L_0x006e
            float r1 = r8.A01
            X.0D7 r0 = new X.0D7
            r0.<init>(r10, r1)
            r10 = r0
        L_0x006e:
            r3.A03 = r10
            X.06K r10 = r9.A04
            boolean r0 = r10 instanceof X.AnonymousClass06L
            if (r0 != 0) goto L_0x007e
            float r1 = r8.A01
            X.0D7 r0 = new X.0D7
            r0.<init>(r10, r1)
            r10 = r0
        L_0x007e:
            r3.A00 = r10
            X.06K r9 = r9.A05
            boolean r0 = r9 instanceof X.AnonymousClass06L
            if (r0 != 0) goto L_0x008e
            float r1 = r8.A01
            X.0D7 r0 = new X.0D7
            r0.<init>(r9, r1)
            r9 = r0
        L_0x008e:
            r3.A01 = r9
            X.06J r11 = new X.06J
            r11.<init>(r3)
            r14.A02 = r11
            X.06b r8 = r14.A0F
            float r13 = r2.A01
            android.graphics.RectF r10 = r14.A0B
            android.graphics.RectF r1 = r14.A0D
            android.graphics.Rect r0 = r14.getBounds()
            r1.set(r0)
            r10.set(r1)
            float r0 = r14.A00()
            r10.inset(r0, r0)
            android.graphics.Path r9 = r14.A0A
            r12 = 0
            r8.A01(r9, r10, r11, r12, r13)
            android.graphics.Rect r0 = r14.getBounds()
            r1.set(r0)
            android.graphics.Path r0 = r14.A09
            r14.A02(r0, r1)
            r0 = 0
            r14.A03 = r0
        L_0x00c5:
            X.06X r2 = r14.A01
            int r1 = r2.A07
            r0 = 1
            if (r1 == r0) goto L_0x011d
            int r0 = r2.A09
            if (r0 <= 0) goto L_0x011d
            r0 = 2
            if (r1 == r0) goto L_0x00f2
            X.06J r2 = r2.A0K
            android.graphics.RectF r1 = r14.A0D
            android.graphics.Rect r0 = r14.getBounds()
            r1.set(r0)
            boolean r0 = r2.A05(r1)
            if (r0 != 0) goto L_0x011d
            android.graphics.Path r0 = r14.A09
            boolean r0 = r0.isConvex()
            if (r0 != 0) goto L_0x011d
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 >= r0) goto L_0x011d
        L_0x00f2:
            r15.save()
            X.06X r1 = r14.A01
            int r0 = r1.A08
            double r2 = (double) r0
            int r0 = r1.A0A
            double r0 = (double) r0
            double r10 = java.lang.Math.toRadians(r0)
            double r8 = java.lang.Math.sin(r10)
            double r0 = r2 * r8
            int r8 = (int) r0
            double r0 = java.lang.Math.cos(r10)
            double r2 = r2 * r0
            int r0 = (int) r2
            float r1 = (float) r8
            float r0 = (float) r0
            r15.translate(r1, r0)
            boolean r0 = r14.A04
            if (r0 != 0) goto L_0x016d
            r14.A01(r15)
        L_0x011a:
            r15.restore()
        L_0x011d:
            X.06X r2 = r14.A01
            android.graphics.Paint$Style r1 = r2.A0G
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r1 == r0) goto L_0x0129
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            if (r1 != r0) goto L_0x014a
        L_0x0129:
            android.graphics.Path r3 = r14.A09
            X.06J r1 = r2.A0K
            android.graphics.RectF r2 = r14.A0D
            android.graphics.Rect r0 = r14.getBounds()
            r2.set(r0)
            boolean r0 = r1.A05(r2)
            if (r0 == 0) goto L_0x0169
            X.06K r0 = r1.A07
            float r1 = r0.BAD(r2)
            X.06X r0 = r14.A01
            float r0 = r0.A01
            float r1 = r1 * r0
            r15.drawRoundRect(r2, r1, r1, r7)
        L_0x014a:
            X.06X r0 = r14.A01
            android.graphics.Paint$Style r1 = r0.A0G
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r1 == r0) goto L_0x0156
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            if (r1 != r0) goto L_0x0162
        L_0x0156:
            float r1 = r5.getStrokeWidth()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0162
            r14.A0E(r15)
        L_0x0162:
            r7.setAlpha(r6)
            r5.setAlpha(r4)
            return
        L_0x0169:
            r15.drawPath(r3, r7)
            goto L_0x014a
        L_0x016d:
            android.graphics.RectF r1 = r14.A0C
            float r2 = r1.width()
            android.graphics.Rect r0 = r14.getBounds()
            int r0 = r0.width()
            float r0 = (float) r0
            float r2 = r2 - r0
            int r3 = (int) r2
            float r2 = r1.height()
            android.graphics.Rect r0 = r14.getBounds()
            int r0 = r0.height()
            float r0 = (float) r0
            float r2 = r2 - r0
            int r2 = (int) r2
            if (r3 < 0) goto L_0x01e1
            if (r2 < 0) goto L_0x01e1
            float r0 = r1.width()
            int r8 = (int) r0
            X.06X r0 = r14.A01
            int r0 = r0.A09
            int r0 = r0 * 2
            int r8 = r8 + r0
            int r8 = r8 + r3
            float r0 = r1.height()
            int r1 = (int) r0
            X.06X r0 = r14.A01
            int r0 = r0.A09
            int r0 = r0 * 2
            int r1 = r1 + r0
            int r1 = r1 + r2
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r8, r1, r0)
            android.graphics.Canvas r9 = new android.graphics.Canvas
            r9.<init>(r8)
            android.graphics.Rect r0 = r14.getBounds()
            int r1 = r0.left
            X.06X r0 = r14.A01
            int r0 = r0.A09
            int r1 = r1 - r0
            int r1 = r1 - r3
            float r3 = (float) r1
            android.graphics.Rect r0 = r14.getBounds()
            int r1 = r0.top
            X.06X r0 = r14.A01
            int r0 = r0.A09
            int r1 = r1 - r0
            int r1 = r1 - r2
            float r2 = (float) r1
            float r1 = -r3
            float r0 = -r2
            r9.translate(r1, r0)
            r14.A01(r9)
            r0 = 0
            r15.drawBitmap(r8, r3, r2, r0)
            r8.recycle()
            goto L_0x011a
        L_0x01e1:
            java.lang.String r1 = "Invalid shadow bounds. Check that the treatments result in a valid path."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C012505l.draw(android.graphics.Canvas):void");
    }

    public int getAlpha() {
        return this.A01.A06;
    }

    public void getOutline(Outline outline) {
        AnonymousClass06X r2 = this.A01;
        if (r2.A07 != 2) {
            AnonymousClass06J r1 = r2.A0K;
            RectF rectF = this.A0D;
            rectF.set(getBounds());
            if (r1.A05(rectF)) {
                AnonymousClass06K r12 = this.A01.A0K.A06;
                rectF.set(getBounds());
                outline.setRoundRect(getBounds(), r12.BAD(rectF) * this.A01.A01);
                return;
            }
            rectF.set(getBounds());
            Path path = this.A09;
            A02(path, rectF);
            C05530Qb.A00(outline, path);
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.A01.A0I;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Drawable mutate() {
        this.A01 = new AnonymousClass06X(this.A01);
        return this;
    }

    public void setAlpha(int i) {
        AnonymousClass06X r1 = this.A01;
        if (r1.A06 != i) {
            r1.A06 = i;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A01.A0F = colorFilter;
        super.invalidateSelf();
    }

    public void setShapeAppearanceModel(AnonymousClass06J r2) {
        this.A01.A0K = r2;
        invalidateSelf();
    }

    public void setTintList(ColorStateList colorStateList) {
        this.A01.A0E = colorStateList;
        A04();
        super.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        AnonymousClass06X r1 = this.A01;
        if (r1.A0H != mode) {
            r1.A0H = mode;
            A04();
            super.invalidateSelf();
        }
    }

    public C012505l(AnonymousClass06X r6) {
        C013906b r0;
        this.A0H = new AnonymousClass06Y[4];
        this.A0I = new AnonymousClass06Y[4];
        this.A0G = new BitSet(8);
        this.A0J = new Matrix();
        this.A09 = new Path();
        this.A0A = new Path();
        this.A0D = new RectF();
        this.A0B = new RectF();
        this.A0L = new Region();
        this.A0K = new Region();
        Paint paint = new Paint(1);
        this.A07 = paint;
        Paint paint2 = new Paint(1);
        this.A08 = paint2;
        this.A0M = new AnonymousClass06Z();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            r0 = C013806a.A00;
        } else {
            r0 = new C013906b();
        }
        this.A0F = r0;
        this.A0C = new RectF();
        this.A04 = true;
        this.A01 = r6;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        A04();
        A05(getState());
        this.A0E = new C014306f(this);
    }

    public Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.A0L;
        region.set(bounds);
        RectF rectF = this.A0D;
        rectF.set(getBounds());
        Path path = this.A09;
        A02(path, rectF);
        Region region2 = this.A0K;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.A01.A0E;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.A01.A0D;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.A01.A0C;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.A01.A0B;
        if (colorStateList4 == null || !colorStateList4.isStateful()) {
            return false;
        }
        return true;
    }

    public boolean onStateChange(int[] iArr) {
        boolean A052 = A05(iArr);
        boolean A042 = A04();
        if (!A052 && !A042) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public Drawable.ConstantState getConstantState() {
        return this.A01;
    }

    public C012505l(AnonymousClass06J r2) {
        this(new AnonymousClass06X(r2));
    }

    public C012505l() {
        this(new AnonymousClass06J());
    }
}
