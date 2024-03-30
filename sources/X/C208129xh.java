package X;

import android.app.Activity;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.9xh  reason: invalid class name and case insensitive filesystem */
public final class C208129xh implements C22851Ax0 {
    public final C22851Ax0 A00;
    public final WeakHashMap A01 = new WeakHashMap();
    public final ReentrantLock A02 = new ReentrantLock();

    public void Bkk(Activity activity, AnonymousClass9V8 r5) {
        AnonymousClass00C.A0D(activity, 0);
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            WeakHashMap weakHashMap = this.A01;
            if (!AnonymousClass00C.A0J(r5, (AnonymousClass9V8) weakHashMap.get(activity))) {
                weakHashMap.put(activity, r5);
                reentrantLock.unlock();
                this.A00.Bkk(activity, r5);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public C208129xh(C22851Ax0 ax0) {
        this.A00 = ax0;
    }
}
