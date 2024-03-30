package X;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.79O  reason: invalid class name */
public class AnonymousClass79O extends FutureTask {
    public final /* synthetic */ AnonymousClass6TF A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass79O(AnonymousClass6TF r1, Callable callable) {
        super(callable);
        this.A00 = r1;
    }

    public void done() {
        if (!isCancelled()) {
            try {
                AnonymousClass6TF.A00((C131046Nn) get(), this.A00);
            } catch (InterruptedException | ExecutionException e) {
                AnonymousClass6TF.A00(new C131046Nn(e), this.A00);
            }
        }
    }
}
