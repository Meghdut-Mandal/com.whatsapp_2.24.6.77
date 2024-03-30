package X;

import android.os.MessageQueue;

/* renamed from: X.7s9  reason: invalid class name and case insensitive filesystem */
public class C164647s9 implements MessageQueue.IdleHandler {
    public Object A00;
    public final int A01;

    public C164647s9(C224914p r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final boolean queueIdle() {
        if (this.A01 != 0) {
            ((C224914p) this.A00).A2i();
            return false;
        }
        C224914p.A0P((C224914p) this.A00);
        return false;
    }
}
