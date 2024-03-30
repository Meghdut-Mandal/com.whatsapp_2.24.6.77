package X;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* renamed from: X.3Qv  reason: invalid class name and case insensitive filesystem */
public abstract class C65123Qv {
    public static int A02(Context context, WindowManager windowManager) {
        int i;
        DisplayMetrics A0X;
        if (Build.VERSION.SDK_INT < 30) {
            A0X = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(A0X);
            i = A0X.densityDpi;
        } else {
            i = AnonymousClass000.A0U(context).densityDpi;
            A0X = AnonymousClass000.A0X(context);
        }
        float f = A0X.density;
        if (i >= 320) {
            return (int) (f * 25.0f);
        }
        if (i >= 240) {
            return 38;
        }
        if (i >= 160) {
            return 25;
        }
        return 19;
    }

    public static int A00(Context context) {
        float A00 = C36341k9.A00(context);
        float f = 2.0f;
        if (((float) AnonymousClass000.A0X(context).widthPixels) / A00 >= 360.0f) {
            f = 7.0f;
        }
        return Math.round(f * A00);
    }

    public static int A01(Context context) {
        return (int) (C36341k9.A00(context) * 83.333336f);
    }
}
