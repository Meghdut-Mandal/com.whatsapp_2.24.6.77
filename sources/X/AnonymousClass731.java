package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;

/* renamed from: X.731  reason: invalid class name */
public final class AnonymousClass731 implements Runnable {
    public Throwable A00;
    public final /* synthetic */ Handler A01;
    public final /* synthetic */ AnonymousClass02E A02;
    public final /* synthetic */ Runnable A03;

    public AnonymousClass731(Handler handler, AnonymousClass02E r6, Runnable runnable) {
        this.A02 = r6;
        this.A01 = handler;
        this.A03 = runnable;
        Thread currentThread = Thread.currentThread();
        StringBuilder A0i = C90524aI.A0i("Runnable instantiated on thread id: ");
        A0i.append(currentThread.getId());
        A0i.append(", name: ");
        this.A00 = new Throwable(AnonymousClass000.A0q(currentThread.getName(), A0i));
    }

    public void run() {
        try {
            AnonymousClass02E r0 = this.A02;
            Context A1D = r0.A1D();
            boolean z = true;
            boolean A1V = AnonymousClass000.A1V(r0.A0F);
            boolean A1W = AnonymousClass000.A1W(A1D);
            if (!(A1D instanceof ContextWrapper) || ((ContextWrapper) A1D).getBaseContext() != null) {
                z = false;
            }
            if (!A1V || A1W || z) {
                this.A01.post(this);
            } else {
                this.A03.run();
            }
        } catch (Throwable th) {
            Throwable th2 = this.A00;
            AnonymousClass6YR.A07("CDSThreadTracing", "--- start debug trace");
            AnonymousClass6YR.A0B("CDSThreadTracing", "Thread tracing stacktrace", th2);
            AnonymousClass6YR.A07("CDSThreadTracing", "--- end debug trace");
            throw th;
        }
    }
}
