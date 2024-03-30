package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: X.078  reason: invalid class name */
public abstract class AnonymousClass078 extends Drawable implements Drawable.Callback {
    public Drawable A00;

    public void draw(Canvas canvas) {
        this.A00.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.A00.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.A00.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.A00.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.A00.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.A00.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.A00.getMinimumWidth();
    }

    public int getOpacity() {
        return this.A00.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.A00.getPadding(rect);
    }

    public int[] getState() {
        return this.A00.getState();
    }

    public Region getTransparentRegion() {
        return this.A00.getTransparentRegion();
    }

    public boolean isAutoMirrored() {
        return AnonymousClass0XY.A02(this.A00);
    }

    public boolean isStateful() {
        return this.A00.isStateful();
    }

    public void jumpToCurrentState() {
        this.A00.jumpToCurrentState();
    }

    public void onBoundsChange(Rect rect) {
        this.A00.setBounds(rect);
    }

    public boolean onLevelChange(int i) {
        return this.A00.setLevel(i);
    }

    public void setAlpha(int i) {
        this.A00.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        AnonymousClass0XY.A01(this.A00, z);
    }

    public void setChangingConfigurations(int i) {
        this.A00.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A00.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.A00.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.A00.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        AnonymousClass076.A05(this.A00, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        AnonymousClass076.A07(this.A00, i, i2, i3, i4);
    }

    public void setTint(int i) {
        AnonymousClass076.A06(this.A00, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        AnonymousClass076.A01(colorStateList, this.A00);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        AnonymousClass076.A04(mode, this.A00);
    }

    public AnonymousClass078(Drawable drawable) {
        Drawable drawable2 = this.A00;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.A00 = drawable;
        drawable.setCallback(this);
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (super.setVisible(z, z2) || this.A00.setVisible(z, z2)) {
            return true;
        }
        return false;
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}
