package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: X.5zn  reason: invalid class name and case insensitive filesystem */
public final class C125365zn {
    public final AnonymousClass6PE A00(Context context, WindowManager windowManager) {
        int i;
        int i2;
        C36321k7.A0w(context, windowManager);
        if (C19550w8.A07()) {
            Rect bounds = windowManager.getMaximumWindowMetrics().getBounds();
            AnonymousClass00C.A08(bounds);
            i = bounds.width();
            if (i % 2 != 0) {
                i--;
            }
            i2 = bounds.height();
        } else {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int i3 = point.x;
            if (i3 % 2 != 0) {
                i3--;
            }
            i2 = point.y;
        }
        if (i2 % 2 != 0) {
            i2--;
        }
        return new AnonymousClass6PE(i, i2, AnonymousClass000.A0X(context).densityDpi);
    }
}
