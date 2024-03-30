package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.whatsapp.R;

/* renamed from: X.04t  reason: invalid class name and case insensitive filesystem */
public class C011104t implements View.OnApplyWindowInsetsListener {
    public AnonymousClass09H A00 = null;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C010904r A02;

    public C011104t(View view, C010904r r3) {
        this.A01 = view;
        this.A02 = r3;
    }

    public static void A00(View view, WindowInsets windowInsets) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        AnonymousClass09H A012 = AnonymousClass09H.A01(view, windowInsets);
        if (Build.VERSION.SDK_INT < 30) {
            A00(this.A01, windowInsets);
            if (A012.equals(this.A00)) {
                return this.A02.BRE(view, A012).A06();
            }
        }
        this.A00 = A012;
        AnonymousClass09H BRE = this.A02.BRE(view, A012);
        if (Build.VERSION.SDK_INT < 30) {
            AnonymousClass09G.A00(view);
        }
        return BRE.A06();
    }
}
