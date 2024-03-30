package X;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: X.771  reason: invalid class name */
public final class AnonymousClass771 implements Executor {
    public Runnable A00;
    public final Object A01 = C36441kJ.A11();
    public final ArrayDeque A02 = new ArrayDeque();
    public final Executor A03;

    public void execute(Runnable runnable) {
        AnonymousClass00C.A0D(runnable, 0);
        synchronized (this.A01) {
            this.A02.offer(new AnonymousClass75C((Object) runnable, (Object) this, 4));
            if (this.A00 == null) {
                A00();
            }
        }
    }

    public final void A00() {
        synchronized (this.A01) {
            Object poll = this.A02.poll();
            Runnable runnable = (Runnable) poll;
            this.A00 = runnable;
            if (poll != null) {
                this.A03.execute(runnable);
            }
        }
    }

    public AnonymousClass771(Executor executor) {
        this.A03 = executor;
    }
}
