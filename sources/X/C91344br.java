package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.4br  reason: invalid class name and case insensitive filesystem */
public class C91344br extends Drawable implements Drawable.Callback {
    public int A00;
    public int A01;
    public final Drawable A02;
    public final Drawable A03;

    public int getOpacity() {
        return -3;
    }

    public void draw(Canvas canvas) {
        this.A03.draw(canvas);
        this.A02.draw(canvas);
    }

    public void setAlpha(int i) {
        this.A03.setAlpha(i);
        this.A02.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
        this.A02.setColorFilter(colorFilter);
    }

    public C91344br(Context context) {
        Drawable A0H = C36381kD.A0H(context, R.drawable.carousel_scrollbar_track);
        this.A03 = A0H;
        A0H.setCallback(this);
        Drawable A0H2 = C36381kD.A0H(context, R.drawable.carousel_scrollbar_thumb);
        this.A02 = A0H2;
        A0H2.setCallback(this);
    }

    public static void A00(C91344br r6) {
        Rect bounds = r6.getBounds();
        r6.A03.setBounds(bounds);
        Drawable drawable = r6.A02;
        int i = bounds.left + r6.A01;
        drawable.setBounds(i, bounds.top, i + r6.A00, bounds.bottom);
        r6.invalidateSelf();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void onBoundsChange(Rect rect) {
        A00(this);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}
