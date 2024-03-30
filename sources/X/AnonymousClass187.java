package X;

import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.187  reason: invalid class name */
public class AnonymousClass187 {
    public final ThreadPoolExecutor A00 = new ThreadPoolExecutor(0, 1, 300, TimeUnit.SECONDS, new LinkedBlockingQueue(), new AnonymousClass188(this));
    public volatile WeakReference A01;

    public boolean A00() {
        WeakReference weakReference = this.A01;
        if (weakReference == null || Thread.currentThread() != weakReference.get()) {
            return false;
        }
        return true;
    }
}
