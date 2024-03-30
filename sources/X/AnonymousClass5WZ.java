package X;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;

/* renamed from: X.5WZ  reason: invalid class name */
public abstract class AnonymousClass5WZ {
    public static final Bitmap A00(AnonymousClass6FX r5, int i, int i2, int i3) {
        Bitmap.Config config;
        if (i3 == 0) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.ALPHA_8;
        }
        return Bitmap.createBitmap((DisplayMetrics) null, i, i2, config, true, AnonymousClass5WW.A00(r5));
    }
}
