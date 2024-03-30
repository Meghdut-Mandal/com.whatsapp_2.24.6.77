package X;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: X.1Ii  reason: invalid class name and case insensitive filesystem */
public abstract class C25961Ii {
    public static final int A00(Context context) {
        AnonymousClass00C.A0D(context, 0);
        Context A00 = C25981Ik.A00(context);
        int i = A00.getResources().getConfiguration().smallestScreenWidthDp;
        Point A01 = A01(A00);
        if (A01 != null) {
            float min = ((float) Math.min(A01.x, A01.y)) / A00.getResources().getDisplayMetrics().density;
            if (((double) Math.abs(min - ((float) i))) <= ((double) i) * 0.15d) {
                return (int) min;
            }
        }
        return i;
    }

    public static final Point A01(Context context) {
        Context A00 = C25981Ik.A00(context);
        Point point = new Point();
        Object systemService = A00.getSystemService("display");
        AnonymousClass00C.A0E(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        Display display = ((DisplayManager) systemService).getDisplay(0);
        if (display == null) {
            if (!C19550w8.A07() || A00.getDisplay() == null) {
                Object systemService2 = A00.getSystemService("window");
                AnonymousClass00C.A0E(systemService2, "null cannot be cast to non-null type android.view.WindowManager");
                display = ((WindowManager) systemService2).getDefaultDisplay();
            } else {
                display = A00.getDisplay();
            }
            if (display == null) {
                return null;
            }
        }
        display.getRealSize(point);
        return point;
    }

    public static final C26881Lw A02(Context context) {
        int i;
        int i2;
        AnonymousClass00C.A0D(context, 0);
        Object systemService = context.getSystemService("display");
        AnonymousClass00C.A0E(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        Display display = ((DisplayManager) systemService).getDisplay(0);
        if (display != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            display.getRealMetrics(displayMetrics);
            float f = displayMetrics.xdpi;
            if (f >= 100.0f) {
                float f2 = displayMetrics.ydpi;
                if (f2 >= 100.0f && (i = displayMetrics.widthPixels) > 0 && (i2 = displayMetrics.heightPixels) > 0) {
                    float f3 = ((float) (i * 100)) / f;
                    float f4 = ((float) (i2 * 100)) / f2;
                    return new C26881Lw((int) f3, (int) f4, (int) Math.sqrt(Math.pow((double) f3, 2.0d) + Math.pow((double) f4, 2.0d)));
                }
            }
        }
        return null;
    }
}
