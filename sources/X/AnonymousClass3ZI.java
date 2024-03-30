package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;

/* renamed from: X.3ZI  reason: invalid class name */
public class AnonymousClass3ZI implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ AnonymousClass3HI A01;

    public AnonymousClass3ZI(AnonymousClass3HI r1, float f) {
        this.A01 = r1;
        this.A00 = f;
    }

    public void onGlobalLayout() {
        AnonymousClass3HI r2 = this.A01;
        View view = r2.A03;
        C36361kB.A16(view, this);
        float A02 = C36441kJ.A02(view);
        float f = this.A00;
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f - (f / A02), 1, 0.0f);
        translateAnimation.setDuration(300);
        C36381kD.A1C(translateAnimation);
        view.startAnimation(translateAnimation);
        AnimationSet animationSet = new AnimationSet(true);
        C36381kD.A1C(animationSet);
        animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        animationSet.addAnimation(new TranslateAnimation(1, 0.0f, 1, 0.0f, 0, (A02 - f) * 1.4f, 0, 0.0f));
        animationSet.setDuration(300);
        r2.A05.startAnimation(animationSet);
        r2.A04.startAnimation(animationSet);
    }
}
