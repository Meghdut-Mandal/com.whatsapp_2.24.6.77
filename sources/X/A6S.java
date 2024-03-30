package X;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class A6S implements C17880sD {
    public static final C17880sD A01 = new A6S((Object) null);
    public static final Logger A02 = C165587tf.A0p(A6S.class);
    public final Object A00;

    public boolean cancel(boolean z) {
        return false;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }

    public void B0P(Runnable runnable, Executor executor) {
        C20740y5.A04(runnable, "Runnable was null.");
        C20740y5.A04(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = A02;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder A0i = C90464aC.A0i(valueOf2, C90474aD.A05(valueOf) + 57);
            A0i.append("RuntimeException while executing runnable ");
            A0i.append(valueOf);
            logger.log(level, AnonymousClass000.A0p(" with executor ", valueOf2, A0i), e);
        }
    }

    public A6S(Object obj) {
        this.A00 = obj;
    }

    public Object get(long j, TimeUnit timeUnit) {
        Objects.requireNonNull(timeUnit);
        return get();
    }

    public String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.A00);
        StringBuilder A0i = C90464aC.A0i(valueOf, C90474aD.A05(obj) + 27);
        A0i.append(obj);
        A0i.append("[status=SUCCESS, result=[");
        A0i.append(valueOf);
        return AnonymousClass000.A0q("]]", A0i);
    }

    public Object get() {
        return this.A00;
    }
}
