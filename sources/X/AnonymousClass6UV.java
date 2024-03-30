package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6UV  reason: invalid class name */
public class AnonymousClass6UV {
    public static Handler A00;
    public static final List A01 = AnonymousClass001.A0I();

    public static synchronized Handler A00() {
        Handler handler;
        synchronized (AnonymousClass6UV.class) {
            if (A00 == null) {
                HandlerThread handlerThread = new HandlerThread("BackgroundLayoutPreparer", 5);
                handlerThread.start();
                A00 = C90514aH.A0M(handlerThread);
                handlerThread.getThreadId();
            }
            handler = A00;
        }
        return handler;
    }

    public static synchronized C114835hu A01(List list, int i, boolean z) {
        C114835hu r10;
        synchronized (AnonymousClass6UV.class) {
            Handler A002 = A00();
            List list2 = A01;
            Iterator it = list2.iterator();
            while (true) {
                int i2 = i;
                if (it.hasNext()) {
                    AnonymousClass757 r4 = (AnonymousClass757) it.next();
                    if (r4.A00 == i) {
                        ((C114835hu) r4.A01).A00.compareAndSet(false, true);
                    }
                    C114835hu r1 = (C114835hu) r4.A01;
                    if (r1.A00.get()) {
                        A002.removeCallbacksAndMessages(r1);
                        it.remove();
                    }
                } else {
                    r10 = new C114835hu();
                    AnonymousClass757 r8 = new AnonymousClass757(list, r10, i2, 1, z);
                    list2.add(r8);
                    A002.postAtTime(new C1497572q(r8, 11), r10, 0);
                }
            }
        }
        return r10;
    }
}
