package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.1kP  reason: invalid class name and case insensitive filesystem */
public class C36501kP extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C77933rI A01;
    public final /* synthetic */ boolean A02;

    public C36501kP(C77933rI r1, int i, boolean z) {
        this.A01 = r1;
        this.A02 = z;
        this.A00 = i;
    }

    public void onAnimationEnd(Animator animator) {
        this.A01.A01.setVisibility(this.A00);
    }

    public void onAnimationStart(Animator animator) {
        if (this.A02) {
            this.A01.A01.setVisibility(0);
        }
    }
}
