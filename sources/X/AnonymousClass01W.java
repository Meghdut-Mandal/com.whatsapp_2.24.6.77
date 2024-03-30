package X;

import androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
import java.util.ArrayDeque;
import java.util.Iterator;

/* renamed from: X.01W  reason: invalid class name */
public final class AnonymousClass01W {
    public final ArrayDeque A00;
    public final Runnable A01;

    public void A00() {
        Iterator descendingIterator = this.A00.descendingIterator();
        while (descendingIterator.hasNext()) {
            AnonymousClass023 r1 = (AnonymousClass023) descendingIterator.next();
            if (r1.A01) {
                r1.A00();
                return;
            }
        }
        Runnable runnable = this.A01;
        if (runnable != null) {
            runnable.run();
        }
    }

    public AnonymousClass01W(Runnable runnable) {
        this.A00 = new ArrayDeque();
        this.A01 = runnable;
    }

    public void A01(AnonymousClass023 r4, AnonymousClass012 r5) {
        AnonymousClass01M lifecycle = r5.getLifecycle();
        if (((AnonymousClass01N) lifecycle).A02 != AnonymousClass01P.DESTROYED) {
            r4.A00.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(r4, this, lifecycle));
        }
    }

    public AnonymousClass01W() {
        this((Runnable) null);
    }
}
