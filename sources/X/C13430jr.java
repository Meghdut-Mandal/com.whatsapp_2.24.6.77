package X;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.0jr  reason: invalid class name and case insensitive filesystem */
public class C13430jr extends FutureTask {
    public final /* synthetic */ C12080hT A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13430jr(C12080hT r1, Callable callable) {
        super(callable);
        this.A00 = r1;
    }

    public void done() {
        try {
            Object obj = get();
            C12080hT r1 = this.A00;
            if (!r1.A03.get()) {
                r1.A00(obj);
            }
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (ExecutionException e2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
        } catch (CancellationException unused) {
            C12080hT r2 = this.A00;
            if (!r2.A03.get()) {
                r2.A00((Object) null);
            }
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
