package X;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;

/* renamed from: X.5WY  reason: invalid class name */
public abstract class AnonymousClass5WY {
    public static final void A00(int i, Paint paint) {
        if (Build.VERSION.SDK_INT >= 29) {
            C109075We.A00(i, paint);
        } else {
            paint.setXfermode(new PorterDuffXfermode(AnonymousClass6G6.A01(i)));
        }
    }
}