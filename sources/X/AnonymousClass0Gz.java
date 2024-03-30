package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.0Gz  reason: invalid class name */
public class AnonymousClass0Gz extends AnonymousClass0Up {
    public static final Interpolator A00 = new DecelerateInterpolator();
    public static final Interpolator A01 = new AnonymousClass066();
    public static final Interpolator A02 = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    public static C06650Um A00(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof C09000bf) {
            return ((C09000bf) tag).A01;
        }
        return null;
    }

    public static void A01(View view, WindowInsets windowInsets, C07460Xt r4, boolean z) {
        C06650Um A002 = A00(view);
        if (A002 != null) {
            A002.A00 = windowInsets;
            if (!z) {
                A002.A02(r4);
                z = AnonymousClass000.A1Q(A002.A01);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                A01(viewGroup.getChildAt(i), windowInsets, r4, z);
            }
        }
    }

    public static void A02(View view, AnonymousClass0Y8 r3, C07460Xt r4) {
        C06650Um A002 = A00(view);
        if (A002 != null) {
            A002.A00(r3, r4);
            if (A002.A01 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                A02(viewGroup.getChildAt(i), r3, r4);
            }
        }
    }

    public static void A03(View view, C07460Xt r3) {
        C06650Um A002 = A00(view);
        if (A002 != null) {
            A002.A03(r3);
            if (A002.A01 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                A03(viewGroup.getChildAt(i), r3);
            }
        }
    }

    public static void A04(View view, AnonymousClass09H r3, List list) {
        C06650Um A002 = A00(view);
        if (A002 != null) {
            A002.A01(r3, list);
            if (A002.A01 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                A04(viewGroup.getChildAt(i), r3, list);
            }
        }
    }

    public AnonymousClass0Gz(int i, Interpolator interpolator, long j) {
        super(i, interpolator, j);
    }
}
