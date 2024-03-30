package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;

/* renamed from: X.3ZM  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3ZM implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ C428921c A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ AnonymousClass3ZM(View view, ViewGroup viewGroup, C428921c r3, boolean z) {
        this.A02 = r3;
        this.A00 = view;
        this.A01 = viewGroup;
        this.A03 = z;
    }

    public final void onGlobalLayout() {
        C428921c r0 = this.A02;
        View view = this.A00;
        ViewGroup viewGroup = this.A01;
        boolean z = this.A03;
        C70803fk r3 = r0.A04;
        Drawable background = r3.A2R.A02.getBackground();
        AnonymousClass00C.A08(background);
        if (background instanceof C36991ld) {
            AnonymousClass3AC r2 = r3.A2R;
            Drawable drawable = ((C36991ld) background).A01;
            AnonymousClass00C.A0D(drawable, 0);
            C36991ld.A00(drawable, r2.A02);
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(0);
        view.startAnimation(translateAnimation);
        if (viewGroup == r3.A0X && r3.A0T.getVisibility() == 0) {
            r3.A0T.startAnimation(translateAnimation);
        }
        if (r3.A4B.A0K) {
            r3.A0Y.startAnimation(translateAnimation);
        }
        if (z) {
            r3.A2U.startAnimation(translateAnimation);
        }
        r3.A06 = 0;
        ViewGroup viewGroup2 = r3.A0X;
        if (viewGroup == viewGroup2) {
            viewGroup2.removeAllViews();
            r3.A2d = null;
        }
    }
}
