package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;
import android.widget.ListView;
import com.whatsapp.KeyboardPopupLayout;

/* renamed from: X.3ZR  reason: invalid class name */
public class AnonymousClass3ZR implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final View A01;
    public final ViewGroup A02;
    public final ViewGroup A03;
    public final ListView A04;
    public final KeyboardPopupLayout A05;
    public final boolean A06;

    public void onGlobalLayout() {
        ViewGroup viewGroup = this.A02;
        C36351kA.A1C(viewGroup, this);
        int height = viewGroup.getHeight();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) height, 0.0f);
        translateAnimation.setDuration(250);
        if (this.A06) {
            this.A04.startAnimation(translateAnimation);
        }
        this.A01.startAnimation(translateAnimation);
        ViewGroup viewGroup2 = this.A03;
        Drawable background = viewGroup2.getBackground();
        Drawable background2 = viewGroup2.getBackground();
        if (!(background2 instanceof C36991ld)) {
            C36991ld.A00(new C36991ld(background2), viewGroup2);
        }
        C36991ld r0 = (C36991ld) viewGroup2.getBackground();
        r0.A00 = height;
        r0.invalidateSelf();
        C37681n2 r4 = new C37681n2(background, viewGroup2, height);
        r4.setStartTime(-1);
        r4.setDuration(250);
        r4.setAnimationListener(new C428821b(this.A04, this.A05, this.A00));
        viewGroup2.startAnimation(r4);
    }

    public AnonymousClass3ZR(View view, ViewGroup viewGroup, ViewGroup viewGroup2, ListView listView, KeyboardPopupLayout keyboardPopupLayout, int i, boolean z) {
        this.A02 = viewGroup;
        this.A01 = view;
        this.A05 = keyboardPopupLayout;
        this.A04 = listView;
        this.A03 = viewGroup2;
        this.A06 = z;
        this.A00 = i;
    }
}
