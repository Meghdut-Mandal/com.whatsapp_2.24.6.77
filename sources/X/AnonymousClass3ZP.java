package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;

/* renamed from: X.3ZP  reason: invalid class name */
public class AnonymousClass3ZP implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ ViewGroup A03;
    public final /* synthetic */ C70803fk A04;

    public AnonymousClass3ZP(View view, ViewGroup viewGroup, C70803fk r3, int i, boolean z) {
        this.A04 = r3;
        this.A03 = viewGroup;
        this.A01 = z;
        this.A00 = view;
        this.A02 = i;
    }

    public void onGlobalLayout() {
        ViewGroup viewGroup = this.A03;
        C36361kB.A16(viewGroup, this);
        int height = viewGroup.getHeight();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) height, 0.0f);
        translateAnimation.setDuration(250);
        if (this.A01) {
            this.A04.A2U.startAnimation(translateAnimation);
        }
        C70803fk r6 = this.A04;
        if (viewGroup == r6.A0X && r6.A0T.getVisibility() == 0) {
            r6.A0T.startAnimation(translateAnimation);
        }
        if (r6.A4B.A0K) {
            r6.A0Y.startAnimation(translateAnimation);
        }
        this.A00.startAnimation(translateAnimation);
        Drawable background = r6.A2R.A02.getBackground();
        AnonymousClass00C.A08(background);
        View view = r6.A2R.A02;
        Drawable background2 = view.getBackground();
        if (!(background2 instanceof C36991ld)) {
            background2 = new C36991ld(view.getBackground());
            view.setBackground(background2);
        }
        C36991ld r1 = (C36991ld) background2;
        r1.A00 = height;
        r1.invalidateSelf();
        C37711n5 r2 = new C37711n5(background, this, r1, height);
        r2.setStartTime(-1);
        r2.setDuration(250);
        C89234Vt.A00(r2, this, 8);
        r6.A2R.A02.startAnimation(r2);
    }
}
