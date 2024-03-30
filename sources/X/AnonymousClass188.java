package X;

import java.lang.ref.WeakReference;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.188  reason: invalid class name */
public final /* synthetic */ class AnonymousClass188 implements ThreadFactory {
    public final /* synthetic */ AnonymousClass187 A00;

    public /* synthetic */ AnonymousClass188(AnonymousClass187 r1) {
        this.A00 = r1;
    }

    public final Thread newThread(Runnable runnable) {
        AnonymousClass187 r3 = this.A00;
        C19950wm r1 = new C19950wm(new C35691j6(runnable, 29), "SignalExecutor");
        r3.A01 = new WeakReference(r1);
        return r1;
    }
}
