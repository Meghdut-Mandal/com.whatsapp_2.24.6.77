package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.0DI  reason: invalid class name */
public class AnonymousClass0DI extends AnimatorListenerAdapter {
    public boolean A00 = false;
    public final /* synthetic */ AnonymousClass0I5 A01;

    public void onAnimationCancel(Animator animator) {
        this.A00 = true;
    }

    public AnonymousClass0DI(AnonymousClass0I5 r2) {
        this.A01 = r2;
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A00) {
            this.A00 = false;
            return;
        }
        AnonymousClass0I5 r2 = this.A01;
        if (AnonymousClass000.A00(r2.A0K) == 0.0f) {
            r2.A02 = 0;
            r2.A07(0);
            return;
        }
        r2.A02 = 2;
        r2.A0A.invalidate();
    }
}
