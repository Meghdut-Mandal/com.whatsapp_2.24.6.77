package X;

import java.io.File;
import java.nio.channels.FileChannel;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.6KP  reason: invalid class name */
public final class AnonymousClass6KP {
    public static final Map A03 = AnonymousClass001.A0J();
    public FileChannel A00;
    public final File A01;
    public final Lock A02;

    public AnonymousClass6KP(File file, String str) {
        Lock lock;
        File A0K = C90464aC.A0K(file, ".lck", AnonymousClass000.A0v(str));
        this.A01 = A0K;
        String A0w = C90514aH.A0w(A0K);
        Map map = A03;
        synchronized (map) {
            Object obj = map.get(A0w);
            if (obj == null) {
                obj = new ReentrantLock();
                map.put(A0w, obj);
            }
            lock = (Lock) obj;
        }
        this.A02 = lock;
    }
}
