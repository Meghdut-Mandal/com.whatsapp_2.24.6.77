package X;

import android.view.KeyEvent;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: X.0bv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C09160bv implements View.OnUnhandledKeyEventListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AppBarLayout.BaseBehavior A01;
    public final /* synthetic */ AppBarLayout A02;

    public /* synthetic */ C09160bv(View view, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.A01 = baseBehavior;
        this.A00 = view;
        this.A02 = appBarLayout;
    }

    public final boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
        AppBarLayout.BaseBehavior.A01(keyEvent, this.A00, this.A02);
        return false;
    }
}
