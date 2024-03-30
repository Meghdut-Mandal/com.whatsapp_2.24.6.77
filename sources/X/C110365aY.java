package X;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Exchanger;

/* renamed from: X.5aY  reason: invalid class name and case insensitive filesystem */
public abstract class C110365aY {
    public static Object A00(Handler handler, Object obj, Callable callable) {
        if (Thread.currentThread() == handler.getLooper().getThread()) {
            try {
                return callable.call();
            } catch (Exception e) {
                throw AnonymousClass001.A0B(e);
            }
        } else {
            Exchanger exchanger = new Exchanger();
            if (!handler.post(new C1501974i(exchanger, callable, 21))) {
                return obj;
            }
            try {
                return exchanger.exchange((Object) null);
            } catch (InterruptedException e2) {
                throw AnonymousClass001.A0B(e2);
            }
        }
    }
}
