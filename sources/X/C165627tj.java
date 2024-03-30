package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Handler;

/* renamed from: X.7tj  reason: invalid class name and case insensitive filesystem */
public class C165627tj extends AnimatorListenerAdapter {
    public final /* synthetic */ AnonymousClass9KS A00;
    public final /* synthetic */ AnonymousClass9NE A01;

    public C165627tj(AnonymousClass9KS r1, AnonymousClass9NE r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void onAnimationEnd(Animator animator) {
        AnonymousClass9NE r2 = this.A01;
        ValueAnimator valueAnimator = r2.A03;
        if (!valueAnimator.isRunning() && r2.A05) {
            valueAnimator.start();
        }
    }

    public void onAnimationStart(Animator animator) {
        AnonymousClass9KS r0 = this.A00;
        Handler handler = r0.A00;
        if (handler == null) {
            handler = C36341k9.A0H();
            r0.A00 = handler;
        }
        handler.post(r0.A01);
    }
}
