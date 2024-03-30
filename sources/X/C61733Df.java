package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.whatsapp.R;

/* renamed from: X.3Df  reason: invalid class name and case insensitive filesystem */
public final class C61733Df {
    public final Activity A00;
    public final NestedScrollView A01;
    public final AnonymousClass3D5 A02;

    public final void A00() {
        NestedScrollView nestedScrollView = this.A01;
        if (nestedScrollView.getLayoutParams().height != -1) {
            ViewGroup.LayoutParams layoutParams = nestedScrollView.getLayoutParams();
            AnonymousClass00C.A0E(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            layoutParams.height = -1;
            nestedScrollView.setLayoutParams(layoutParams);
            nestedScrollView.post(C80213v2.A00(this, 37));
        }
    }

    public C61733Df(Activity activity, View view, AnonymousClass3D5 r4) {
        this.A00 = activity;
        this.A02 = r4;
        this.A01 = (NestedScrollView) C36361kB.A0G(view, R.id.scroll_view);
    }
}
