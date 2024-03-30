package X;

import android.transition.Transition;

/* renamed from: X.0bX  reason: invalid class name and case insensitive filesystem */
public class C08920bX implements Transition.TransitionListener {
    public final /* synthetic */ C03660Hf A00;
    public final /* synthetic */ Runnable A01;

    public void onTransitionCancel(Transition transition) {
    }

    public void onTransitionPause(Transition transition) {
    }

    public void onTransitionResume(Transition transition) {
    }

    public void onTransitionStart(Transition transition) {
    }

    public C08920bX(C03660Hf r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    public void onTransitionEnd(Transition transition) {
        this.A01.run();
    }
}
