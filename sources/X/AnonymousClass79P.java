package X;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: X.79P  reason: invalid class name */
public class AnonymousClass79P extends FutureTask {
    public final /* synthetic */ C101344xO A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass79P(C101344xO r1, Callable callable) {
        super(callable);
        this.A00 = r1;
    }

    public void done() {
        C101344xO r2 = this.A00;
        if (r2.A02.isCancelled()) {
            r2.A00.A04(C36371kC.A0m());
        }
        r2.A01.countDown();
    }
}