package X;

import android.util.DisplayMetrics;
import android.view.WindowManager;

/* renamed from: X.2vC  reason: invalid class name and case insensitive filesystem */
public abstract class C55792vC {
    public static final Long A00(WindowManager windowManager, C20810yC r3) {
        C36321k7.A0w(r3, windowManager);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        long max = (long) (((float) (Math.max(r3.A07(4538), 921600) * 4)) * displayMetrics.density);
        C36321k7.A1V("MediaBitmapUtils/maxPixelsAllowed = ", AnonymousClass000.A0u(), max);
        return Long.valueOf(max);
    }
}
