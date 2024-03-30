package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.61s  reason: invalid class name and case insensitive filesystem */
public final class C1258861s {
    public final View A00;
    public final AnonymousClass00T A01;

    public /* synthetic */ C1258861s(View view) {
        AnonymousClass00T A002 = C001400p.A00(C000800j.NONE, AnonymousClass7Q9.A00);
        C36321k7.A0x(view, A002);
        this.A00 = view;
        this.A01 = A002;
    }

    public final void A00() {
        AnonymousClass00T r2 = this.A01;
        if (((Animator) r2.getValue()).isRunning()) {
            ((ValueAnimator) r2.getValue()).removeAllUpdateListeners();
            this.A00.setAlpha(1.0f);
            ((Animator) r2.getValue()).cancel();
        }
    }
}
