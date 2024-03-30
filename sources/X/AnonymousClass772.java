package X;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: X.772  reason: invalid class name */
public class AnonymousClass772 implements Executor {
    public Runnable A00;
    public final Object A01 = C36441kJ.A11();
    public final ArrayDeque A02 = new ArrayDeque();
    public final Executor A03;

    public void A00() {
        Runnable runnable = (Runnable) this.A02.poll();
        this.A00 = runnable;
        if (runnable != null) {
            this.A03.execute(runnable);
        }
    }

    public void execute(Runnable runnable) {
        synchronized (this.A01) {
            this.A02.add(new AnonymousClass75C((Object) runnable, (Object) this, 17));
            if (this.A00 == null) {
                A00();
            }
        }
    }

    public AnonymousClass772(Executor executor) {
        this.A03 = executor;
    }
}
