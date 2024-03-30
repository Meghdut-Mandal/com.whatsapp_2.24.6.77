package X;

import android.os.Message;
import java.util.List;
import java.util.Objects;

/* renamed from: X.9QI  reason: invalid class name */
public final class AnonymousClass9QI {
    public Message A00;
    public C201079ik A01;

    public void A01() {
        Message message = this.A00;
        Objects.requireNonNull(message);
        message.sendToTarget();
        this.A00 = null;
        this.A01 = null;
        List list = C201079ik.A01;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(this);
            }
        }
    }

    public static void A00(C201079ik r2, Object obj, int i) {
        AnonymousClass9QI A002 = C201079ik.A00();
        A002.A00 = r2.A00.obtainMessage(i, obj);
        A002.A01 = r2;
        A002.A01();
    }
}
