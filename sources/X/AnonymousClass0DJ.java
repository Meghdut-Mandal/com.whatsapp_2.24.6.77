package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.0DJ  reason: invalid class name */
public class AnonymousClass0DJ extends AnimatorListenerAdapter {
    public final /* synthetic */ AnonymousClass008 A00;
    public final /* synthetic */ AnonymousClass054 A01;

    public AnonymousClass0DJ(AnonymousClass008 r1, AnonymousClass054 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void onAnimationEnd(Animator animator) {
        this.A00.remove(animator);
        this.A01.A00.remove(animator);
    }

    public void onAnimationStart(Animator animator) {
        this.A01.A00.add(animator);
    }
}
