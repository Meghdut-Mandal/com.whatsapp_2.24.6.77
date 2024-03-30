package X;

import java.util.concurrent.Executor;

/* renamed from: X.0wX  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C19800wX implements Executor {
    public static final /* synthetic */ C19800wX A00 = new C19800wX();

    public final void execute(Runnable runnable) {
        Executor executor = C19780wV.A07;
        new C19950wm(runnable, "AnomalyExecutorThread").start();
    }
}
