package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.4bk  reason: invalid class name and case insensitive filesystem */
public class C91274bk extends Drawable {
    public Bitmap A00;
    public Canvas A01;
    public Path A02 = null;
    public final Matrix A03 = C90524aI.A0B();
    public final Paint A04;
    public final Drawable A05;
    public final AnonymousClass7fA A06;

    public static Paint A00() {
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setFilterBitmap(true);
        paint.setAntiAlias(true);
        return paint;
    }

    public void applyTheme(Resources.Theme theme) {
        this.A05.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        return this.A05.canApplyTheme();
    }

    public void clearColorFilter() {
        this.A05.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        if (this.A02 == null) {
            this.A02 = (Path) this.A06.apply(new RectF(getBounds()));
        }
        if (this.A01 != null) {
            Paint paint = this.A04;
            if (paint.getShader() == null) {
                this.A05.draw(this.A01);
                Bitmap bitmap = this.A00;
                C18740tg.A06(bitmap);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            }
        }
        Path path = this.A02;
        if (path == null || this.A00 == null) {
            this.A05.draw(canvas);
        } else {
            canvas.drawPath(path, this.A04);
        }
    }

    public int getAlpha() {
        return this.A05.getAlpha();
    }

    public int getChangingConfigurations() {
        return this.A05.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        return this.A05.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        return this.A05.getConstantState();
    }

    public Drawable getCurrent() {
        return this.A05.getCurrent();
    }

    public Rect getDirtyBounds() {
        return this.A05.getDirtyBounds();
    }

    public void getHotspotBounds(Rect rect) {
        this.A05.getHotspotBounds(rect);
    }

    public int getIntrinsicHeight() {
        return this.A05.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.A05.getIntrinsicWidth();
    }

    public int getLayoutDirection() {
        return this.A05.getLayoutDirection();
    }

    public int getMinimumHeight() {
        return this.A05.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.A05.getMinimumWidth();
    }

    public int getOpacity() {
        return this.A05.getOpacity();
    }

    public Insets getOpticalInsets() {
        return this.A05.getOpticalInsets();
    }

    public void getOutline(Outline outline) {
        this.A05.getOutline(outline);
    }

    public boolean getPadding(Rect rect) {
        return this.A05.getPadding(rect);
    }

    public int[] getState() {
        return this.A05.getState();
    }

    public Region getTransparentRegion() {
        return this.A05.getTransparentRegion();
    }

    public boolean isAutoMirrored() {
        return this.A05.isAutoMirrored();
    }

    public boolean isFilterBitmap() {
        return this.A05.isFilterBitmap();
    }

    public boolean isProjected() {
        return this.A05.isProjected();
    }

    public boolean isStateful() {
        return this.A05.isStateful();
    }

    public void jumpToCurrentState() {
        this.A05.jumpToCurrentState();
    }

    public Drawable mutate() {
        return this.A05.mutate();
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.A05.onLayoutDirectionChanged(i);
    }

    public void scheduleSelf(Runnable runnable, long j) {
        this.A05.scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.A05.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.A05.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.A05.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A05.setColorFilter(colorFilter);
    }

    @Deprecated
    public void setDither(boolean z) {
        this.A05.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.A05.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        this.A05.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.A05.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.A05.setState(iArr);
    }

    public void setTint(int i) {
        this.A05.setTint(i);
    }

    public void setTintBlendMode(BlendMode blendMode) {
        this.A05.setTintBlendMode(blendMode);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.A05.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.A05.setTintMode(mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return this.A05.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        this.A05.unscheduleSelf(runnable);
    }

    public C91274bk(Resources resources, Bitmap bitmap, AnonymousClass7fA r4) {
        this.A05 = new BitmapDrawable(resources, bitmap);
        this.A06 = r4;
        this.A04 = A00();
    }

    public void invalidateSelf() {
        super.invalidateSelf();
        this.A05.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a0, code lost:
        if (r3 != null) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBoundsChange(android.graphics.Rect r7) {
        /*
            r6 = this;
            super.onBoundsChange(r7)
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r7)
            X.7fA r0 = r6.A06
            java.lang.Object r0 = r0.apply(r1)
            android.graphics.Path r0 = (android.graphics.Path) r0
            r6.A02 = r0
            r0 = 0
            r6.A00 = r0
            r6.A01 = r0
            android.graphics.Paint r5 = r6.A04
            r4 = 0
            r5.setShader(r0)
            android.graphics.drawable.Drawable r1 = r6.A05
            r1.setBounds(r7)
            boolean r0 = r1 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L_0x0087
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            android.graphics.Bitmap r0 = r1.getBitmap()
            r6.A00 = r0
        L_0x002e:
            android.graphics.Path r0 = r6.A02
            if (r0 == 0) goto L_0x0080
            android.graphics.Bitmap r1 = r6.A00
            if (r1 == 0) goto L_0x0080
            android.graphics.Canvas r0 = r6.A01
            if (r0 != 0) goto L_0x0080
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.BitmapShader r4 = new android.graphics.BitmapShader
            r4.<init>(r1, r0, r0)
            android.graphics.Bitmap r0 = r6.A00
            int r2 = r0.getWidth()
            int r0 = r7.width()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r2 == r0) goto L_0x0084
            int r0 = r7.width()
            float r3 = (float) r0
            android.graphics.Bitmap r0 = r6.A00
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r3 = r3 / r0
        L_0x005c:
            android.graphics.Bitmap r0 = r6.A00
            int r2 = r0.getHeight()
            int r0 = r7.height()
            if (r2 == r0) goto L_0x0075
            int r0 = r7.height()
            float r1 = (float) r0
            android.graphics.Bitmap r0 = r6.A00
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r1 = r1 / r0
        L_0x0075:
            android.graphics.Matrix r0 = r6.A03
            r0.reset()
            r0.preScale(r3, r1)
            r4.setLocalMatrix(r0)
        L_0x0080:
            r5.setShader(r4)
            return
        L_0x0084:
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L_0x005c
        L_0x0087:
            android.graphics.Bitmap r3 = r6.A00
            if (r3 != 0) goto L_0x00a2
            int r2 = r7.width()
            int r1 = r7.height()
            r3 = 0
            if (r2 <= 0) goto L_0x009e
            if (r1 <= 0) goto L_0x009e
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x009e }
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r2, r1, r0)     // Catch:{ OutOfMemoryError -> 0x009e }
        L_0x009e:
            r6.A00 = r3
            if (r3 == 0) goto L_0x002e
        L_0x00a2:
            android.graphics.Canvas r0 = X.C90524aI.A0A(r3)
            r6.A01 = r0
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91274bk.onBoundsChange(android.graphics.Rect):void");
    }

    public C91274bk(Resources.Theme theme, Resources resources, AnonymousClass7fA r4, int i) {
        Drawable A002 = AnonymousClass0BT.A00(theme, resources, i);
        C18740tg.A06(A002);
        this.A05 = A002;
        this.A06 = r4;
        this.A04 = A00();
    }

    @Deprecated
    public void setColorFilter(int i, PorterDuff.Mode mode) {
        this.A05.setColorFilter(i, mode);
    }

    public C91274bk(Drawable drawable, AnonymousClass7fA r3) {
        this.A05 = drawable;
        this.A06 = r3;
        this.A04 = A00();
    }

    public C91274bk(Resources resources, Drawable drawable, AnonymousClass7fA r4) {
        this.A05 = drawable;
        this.A06 = r4;
        this.A04 = A00();
    }
}
