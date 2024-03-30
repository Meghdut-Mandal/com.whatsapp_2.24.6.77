package X;

import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

/* renamed from: X.6dT  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C135916dT implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ LinearLayout A01;
    public final /* synthetic */ RelativeLayout A02;
    public final /* synthetic */ ScrollView A03;

    public /* synthetic */ C135916dT(LinearLayout linearLayout, RelativeLayout relativeLayout, ScrollView scrollView, float f) {
        this.A02 = relativeLayout;
        this.A03 = scrollView;
        this.A00 = f;
        this.A01 = linearLayout;
    }

    public final void onScrollChanged() {
        RelativeLayout relativeLayout = this.A02;
        ScrollView scrollView = this.A03;
        float f = this.A00;
        LinearLayout linearLayout = this.A01;
        AnonymousClass00C.A0D(relativeLayout, 0);
        AnonymousClass00C.A0D(linearLayout, 3);
        float f2 = 0.0f;
        if (scrollView.canScrollVertically(-1)) {
            f2 = f;
        }
        C011004s.A05(relativeLayout, f2);
        if (!scrollView.canScrollVertically(1)) {
            f = 0.0f;
        }
        C011004s.A05(linearLayout, f);
    }
}
