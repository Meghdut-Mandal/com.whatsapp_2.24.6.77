package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* renamed from: X.3Qt  reason: invalid class name and case insensitive filesystem */
public abstract class C65103Qt {
    public static Point A02(WindowManager windowManager) {
        Point point = new Point();
        if (C19550w8.A07()) {
            WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
            int i = insetsIgnoringVisibility.right + insetsIgnoringVisibility.left;
            int i2 = insetsIgnoringVisibility.top + insetsIgnoringVisibility.bottom;
            Rect bounds = currentWindowMetrics.getBounds();
            point.set(bounds.width() - i, bounds.height() - i2);
            return point;
        }
        windowManager.getDefaultDisplay().getSize(point);
        return point;
    }

    public static int A00(Context context) {
        int[] iArr = {16843499};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, iArr);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static int A01(Context context, float f) {
        return Math.round((f * ((float) AnonymousClass000.A0X(context).densityDpi)) / 160.0f);
    }
}
