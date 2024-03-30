package X;

import java.util.concurrent.Executor;

/* renamed from: X.03B  reason: invalid class name */
public final class AnonymousClass03B extends C005602m implements Executor {
    public static final C005502l A00;
    public static final AnonymousClass03B A01 = new AnonymousClass03B();

    public String toString() {
        return "Dispatchers.IO";
    }

    static {
        AnonymousClass03C r3 = AnonymousClass03C.A00;
        int i = AnonymousClass031.A00;
        int i2 = 64;
        if (64 < i) {
            i2 = i;
        }
        A00 = r3.A01((int) AnonymousClass030.A00("kotlinx.coroutines.io.parallelism", (long) i2, (long) 1, (long) Integer.MAX_VALUE));
    }

    public C005502l A01(int i) {
        return AnonymousClass03C.A00.A01(i);
    }

    public void A02(Runnable runnable, C005102h r3) {
        A00.A02(runnable, r3);
    }

    public void A03(Runnable runnable, C005102h r3) {
        A00.A03(runnable, r3);
    }

    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    public void execute(Runnable runnable) {
        A00.A03(runnable, C008903u.A00);
    }
}
