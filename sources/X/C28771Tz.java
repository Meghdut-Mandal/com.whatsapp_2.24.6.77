package X;

import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1Tz  reason: invalid class name and case insensitive filesystem */
public final class C28771Tz implements AnonymousClass09C, AnonymousClass09D {
    public final Set A00 = new HashSet();

    public void A00() {
        Thread thread = C1892692x.A00;
        if (thread == null) {
            thread = Looper.getMainLooper().getThread();
            C1892692x.A00 = thread;
        }
        if (Thread.currentThread() == thread) {
            Iterator it = this.A00.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException("onCleared");
            }
            return;
        }
        throw new IllegalStateException("Must be called on the Main thread.");
    }
}
