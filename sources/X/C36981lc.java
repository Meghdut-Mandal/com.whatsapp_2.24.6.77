package X;

import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* renamed from: X.1lc  reason: invalid class name and case insensitive filesystem */
public final class C36981lc extends InsetDrawable {
    public final PorterDuffColorFilter A00;

    public C36981lc(Drawable drawable) {
        super(drawable, 0);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.DST);
        this.A00 = porterDuffColorFilter;
        super.setColorFilter(porterDuffColorFilter);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(this.A00);
    }

    public void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(this.A00);
    }
}
