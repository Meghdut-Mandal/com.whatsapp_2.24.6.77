package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.Window;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.1RC  reason: invalid class name */
public abstract class AnonymousClass1RC {
    public static int A00(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        try {
            return AnonymousClass00F.A00(context, typedValue.resourceId);
        } catch (Resources.NotFoundException unused) {
            return AnonymousClass00F.A00(context, i2);
        }
    }

    public static C004602b A01(Context context) {
        C004602b r1;
        Configuration configuration = new Configuration();
        configuration.uiMode = (new Configuration().uiMode & -49) | 16;
        if (context instanceof C004602b) {
            r1 = (C004602b) context;
        } else {
            r1 = new C004602b(context, (Resources.Theme) null);
        }
        r1.A01(configuration);
        if (context instanceof C225814z) {
            r1.setTheme(((AnonymousClass155) ((C225814z) context)).A00);
        }
        return r1;
    }

    public static void A07(Context context, Window window, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            boolean z = !A0A(context);
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
            window.setStatusBarColor(AnonymousClass00F.A00(context, i));
            A09(window, z);
        }
    }

    public static void A08(Window window, int i, int i2) {
        if (window != null) {
            boolean z = true;
            if (i2 != 1 || A0A(window.getContext())) {
                z = false;
            } else if (!C19550w8.A04()) {
                return;
            }
            window.setNavigationBarColor(AnonymousClass00F.A00(window.getContext(), i));
            if (Build.VERSION.SDK_INT >= 27) {
                int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
                int i3 = systemUiVisibility & -17;
                if (z) {
                    i3 = systemUiVisibility | 16;
                }
                window.getDecorView().setSystemUiVisibility(i3);
            }
        }
    }

    public static void A09(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            int i = systemUiVisibility & -8193;
            if (z) {
                i = systemUiVisibility | DefaultCrypto.BUFFER_SIZE;
            }
            window.getDecorView().setSystemUiVisibility(i);
        }
    }

    public static void A02(int i, Dialog dialog) {
        A07(dialog.getContext(), dialog.getWindow(), i);
    }

    public static void A03(Activity activity) {
        Window window = activity.getWindow();
        if (window != null) {
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 256 | EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        }
    }

    public static void A04(Activity activity, int i) {
        Window window = activity.getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
            window.setStatusBarColor(AnonymousClass00F.A00(activity, i));
        }
    }

    public static void A05(Activity activity, int i) {
        A07(activity.getBaseContext(), activity.getWindow(), i);
    }

    public static void A06(Activity activity, int i, int i2) {
        A08(activity.getWindow(), i, i2);
    }

    public static boolean A0A(Context context) {
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }
}
