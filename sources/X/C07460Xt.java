package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import com.whatsapp.R;

/* renamed from: X.0Xt  reason: invalid class name and case insensitive filesystem */
public final class C07460Xt {
    public AnonymousClass0Up A00;

    public static C07460Xt A00(WindowInsetsAnimation windowInsetsAnimation) {
        C07460Xt r2 = new C07460Xt(0, (Interpolator) null, 0);
        if (Build.VERSION.SDK_INT >= 30) {
            r2.A00 = new AnonymousClass0Gy(windowInsetsAnimation);
        }
        return r2;
    }

    public static void A01(View view, C06650Um r4) {
        if (Build.VERSION.SDK_INT >= 30) {
            AnonymousClass0Gy.A03(view, r4);
            return;
        }
        Interpolator interpolator = AnonymousClass0Gz.A00;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (r4 == null) {
            view.setTag(R.id.tag_window_insets_animation_callback, (Object) null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
                return;
            }
            return;
        }
        C09000bf r1 = new C09000bf(view, r4);
        view.setTag(R.id.tag_window_insets_animation_callback, r1);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(r1);
        }
    }

    public C07460Xt(int i, Interpolator interpolator, long j) {
        AnonymousClass0Up r0;
        if (Build.VERSION.SDK_INT >= 30) {
            r0 = new AnonymousClass0Gy(i, interpolator, j);
        } else {
            r0 = new AnonymousClass0Gz(i, interpolator, j);
        }
        this.A00 = r0;
    }
}
