package X;

import android.os.Binder;
import android.os.Process;
import java.util.concurrent.Callable;

/* renamed from: X.0i9  reason: invalid class name and case insensitive filesystem */
public class C12490i9 implements Callable {
    public final /* synthetic */ C12080hT A00;

    public C12490i9(C12080hT r1) {
        this.A00 = r1;
    }

    public Object call() {
        C12080hT r4 = this.A00;
        r4.A03.set(true);
        Object obj = null;
        try {
            Process.setThreadPriority(10);
            obj = r4.A06.A06();
        } catch (AnonymousClass02S e) {
            if (!r4.A02.get()) {
                throw e;
            }
        } catch (Throwable th) {
            try {
                r4.A02.set(true);
                throw th;
            } catch (Throwable th2) {
                r4.A00(obj);
                throw th2;
            }
        }
        Binder.flushPendingCommands();
        r4.A00(obj);
        return obj;
    }

    public C12490i9() {
    }
}
