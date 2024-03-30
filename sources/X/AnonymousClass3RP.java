package X;

import android.content.Context;
import android.view.View;
import android.view.ViewManager;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* renamed from: X.3RP  reason: invalid class name */
public abstract class AnonymousClass3RP {
    public static WeakReference A00 = AnonymousClass001.A0F((Object) null);

    public static void A00(Context context, View view) {
        view.setVisibility(8);
        try {
            ViewManager viewManager = (ViewManager) context.getSystemService("window");
            if (viewManager != null) {
                viewManager.removeView(view);
                WeakReference weakReference = A00;
                if (weakReference.get() == view) {
                    weakReference.clear();
                    return;
                }
                return;
            }
            throw AnonymousClass001.A09("Window manager required but not found.");
        } catch (IllegalArgumentException unused) {
        }
    }

    public static void A01(Context context, C92764ea r9, Integer num, boolean z) {
        int i;
        C92764ea r1 = (C92764ea) A00.get();
        if (r1 != null) {
            r1.A02(r1.A01);
        }
        int i2 = -1;
        if (z) {
            i2 = -2;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(i2, -2, 99, 8, -3);
        if (z) {
            i = 17;
        } else {
            i = 80;
            if (num.equals(C023109s.A00)) {
                i = 48;
            }
        }
        layoutParams.gravity = i;
        try {
            ViewManager viewManager = (ViewManager) context.getSystemService("window");
            if (viewManager != null) {
                viewManager.addView(r9, layoutParams);
                A00 = AnonymousClass001.A0F(r9);
                r9.setAlpha(0.0f);
                r9.getViewTreeObserver().addOnGlobalLayoutListener(new C164757sK(r9, 1));
                return;
            }
            throw AnonymousClass001.A09("Window manager required but not found.");
        } catch (WindowManager.BadTokenException unused) {
        }
    }
}
