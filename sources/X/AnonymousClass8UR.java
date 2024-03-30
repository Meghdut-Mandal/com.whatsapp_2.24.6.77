package X;

import android.transition.Transition;

/* renamed from: X.8UR  reason: invalid class name */
public final class AnonymousClass8UR extends C135266cQ {
    public final /* synthetic */ AnonymousClass8Z0 A00;

    public AnonymousClass8UR(AnonymousClass8Z0 r1) {
        this.A00 = r1;
    }

    public void onTransitionEnd(Transition transition) {
        this.A00.A06 = false;
    }

    public void onTransitionStart(Transition transition) {
        this.A00.A06 = true;
    }
}
