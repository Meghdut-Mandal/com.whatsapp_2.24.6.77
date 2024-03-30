package X;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.79Y  reason: invalid class name */
public class AnonymousClass79Y extends ReentrantLock implements AutoCloseable {
    public boolean mEnableThreadLockSync = false;

    public void close() {
        if (this.mEnableThreadLockSync) {
            unlock();
        }
    }
}
