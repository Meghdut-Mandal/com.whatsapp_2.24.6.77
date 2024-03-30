package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.04s  reason: invalid class name and case insensitive filesystem */
public abstract class C011004s {
    public static void A07(View view, C010904r r3) {
        View.OnApplyWindowInsetsListener r0;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, r3);
        }
        if (r3 == null) {
            r0 = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        } else {
            r0 = new C011104t(view, r3);
        }
        view.setOnApplyWindowInsetsListener(r0);
    }

    public static float A00(View view) {
        return view.getElevation();
    }

    public static ColorStateList A01(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode A02(View view) {
        return view.getBackgroundTintMode();
    }

    public static String A03(View view) {
        return view.getTransitionName();
    }

    public static boolean A0A(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void A04(View view) {
        view.stopNestedScroll();
    }

    public static void A05(View view, float f) {
        view.setElevation(f);
    }

    public static void A06(View view, float f) {
        view.setTranslationZ(f);
    }

    public static void A08(View view, String str) {
        view.setTransitionName(str);
    }

    public static void A09(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }
}
