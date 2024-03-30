package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.4bl  reason: invalid class name and case insensitive filesystem */
public class C91284bl extends Drawable {
    public Path A00 = null;
    public final Drawable A01;
    public final AnonymousClass7fA A02;

    public void applyTheme(Resources.Theme theme) {
        this.A01.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        return this.A01.canApplyTheme();
    }

    public void clearColorFilter() {
        this.A01.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        if (this.A00 == null) {
            this.A00 = (Path) this.A02.apply(new RectF(copyBounds()));
        }
        canvas.drawARGB(0, 0, 0, 0);
        int save = canvas.save();
        canvas.clipPath(this.A00);
        this.A01.draw(canvas);
        canvas.restoreToCount(save);
    }

    public int getAlpha() {
        return this.A01.getAlpha();
    }

    public Drawable.Callback getCallback() {
        return this.A01.getCallback();
    }

    public int getChangingConfigurations() {
        return this.A01.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        return this.A01.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        return this.A01.getConstantState();
    }

    public Drawable getCurrent() {
        return this.A01.getCurrent();
    }

    public Rect getDirtyBounds() {
        return this.A01.getDirtyBounds();
    }

    public void getHotspotBounds(Rect rect) {
        this.A01.getHotspotBounds(rect);
    }

    public int getIntrinsicHeight() {
        return this.A01.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.A01.getIntrinsicWidth();
    }

    public int getLayoutDirection() {
        return this.A01.getLayoutDirection();
    }

    public int getMinimumHeight() {
        return this.A01.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.A01.getMinimumWidth();
    }

    public int getOpacity() {
        return this.A01.getOpacity();
    }

    public Insets getOpticalInsets() {
        return this.A01.getOpticalInsets();
    }

    public void getOutline(Outline outline) {
        this.A01.getOutline(outline);
    }

    public boolean getPadding(Rect rect) {
        return this.A01.getPadding(rect);
    }

    public int[] getState() {
        return this.A01.getState();
    }

    public Region getTransparentRegion() {
        return this.A01.getTransparentRegion();
    }

    public void invalidateSelf() {
        this.A01.invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.A01.isAutoMirrored();
    }

    public boolean isFilterBitmap() {
        return this.A01.isFilterBitmap();
    }

    public boolean isProjected() {
        return this.A01.isProjected();
    }

    public boolean isStateful() {
        return this.A01.isStateful();
    }

    public void jumpToCurrentState() {
        this.A01.jumpToCurrentState();
    }

    public Drawable mutate() {
        return this.A01.mutate();
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.A01.onLayoutDirectionChanged(i);
    }

    public void scheduleSelf(Runnable runnable, long j) {
        this.A01.scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.A01.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.A01.setAutoMirrored(z);
    }

    public void setBounds(Rect rect) {
        this.A01.setBounds(rect);
        this.A00 = (Path) this.A02.apply(new RectF(rect));
    }

    public void setChangingConfigurations(int i) {
        this.A01.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
    }

    @Deprecated
    public void setDither(boolean z) {
        this.A01.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.A01.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        this.A01.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.A01.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.A01.setState(iArr);
    }

    public void setTint(int i) {
        this.A01.setTint(i);
    }

    public void setTintBlendMode(BlendMode blendMode) {
        this.A01.setTintBlendMode(blendMode);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.A01.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.A01.setTintMode(mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return this.A01.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        this.A01.unscheduleSelf(runnable);
    }

    public C91284bl(Resources resources, Bitmap bitmap, AnonymousClass7fA r4) {
        this.A01 = new BitmapDrawable(resources, bitmap);
        this.A02 = r4;
    }

    public C91284bl(Resources.Theme theme, Resources resources, AnonymousClass7fA r4, int i) {
        Drawable A002 = AnonymousClass0BT.A00(theme, resources, i);
        C18740tg.A06(A002);
        this.A01 = A002;
        this.A02 = r4;
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        this.A01.setBounds(i, i2, i3, i4);
        this.A00 = (Path) this.A02.apply(new RectF((float) i, (float) i2, (float) i3, (float) i4));
    }

    @Deprecated
    public void setColorFilter(int i, PorterDuff.Mode mode) {
        this.A01.setColorFilter(i, mode);
    }

    public C91284bl(Drawable drawable, AnonymousClass7fA r3) {
        this.A01 = drawable;
        this.A02 = r3;
    }

    public C91284bl(Resources resources, Drawable drawable, AnonymousClass7fA r4) {
        this.A01 = drawable;
        this.A02 = r4;
    }
}
