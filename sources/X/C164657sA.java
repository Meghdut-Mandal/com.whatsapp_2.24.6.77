package X;

import android.os.Handler;
import android.os.MessageQueue;

/* renamed from: X.7sA  reason: invalid class name and case insensitive filesystem */
public class C164657sA implements MessageQueue.IdleHandler {
    public Object A00;
    public final int A01;

    public C164657sA(C124615yV r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final boolean queueIdle() {
        boolean z;
        int i = this.A01;
        C124615yV r3 = (C124615yV) this.A00;
        Handler handler = r3.A01;
        C1497572q r0 = new C1497572q(r3, 24);
        if (i != 0) {
            handler.post(r0);
            return true;
        }
        handler.post(r0);
        synchronized (r3) {
            if (!r3.A05.isEmpty() || !r3.A04.isEmpty()) {
                z = false;
            } else {
                r3.A08 = false;
                z = true;
            }
        }
        return !z;
    }
}
