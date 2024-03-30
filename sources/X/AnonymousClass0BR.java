package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.0BR  reason: invalid class name */
public class AnonymousClass0BR implements Drawable.Callback {
    public final /* synthetic */ AnonymousClass0BQ A00;

    public AnonymousClass0BR(AnonymousClass0BQ r1) {
        this.A00 = r1;
    }

    public void invalidateDrawable(Drawable drawable) {
        this.A00.invalidateSelf();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.A00.scheduleSelf(runnable, j);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.A00.unscheduleSelf(runnable);
    }
}
