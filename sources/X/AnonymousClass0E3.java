package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.concurrent.Executor;

/* renamed from: X.0E3  reason: invalid class name */
public class AnonymousClass0E3 extends Handler {
    public void handleMessage(Message message) {
        C06050Sc r2 = (C06050Sc) message.obj;
        int i = message.what;
        if (i == 1) {
            C12080hT r4 = r2.A00;
            Object obj = r2.A01[0];
            if (r4.A02.get()) {
                try {
                    r4.A06.A0A(r4, obj);
                } catch (Throwable th) {
                    r4.A00.countDown();
                    throw th;
                }
            } else {
                C03760Hp r1 = r4.A06;
                if (r1.A02 != r4) {
                    r1.A0A(r4, obj);
                } else if (r1.A02) {
                    r1.A0B(obj);
                } else {
                    r1.A04 = false;
                    SystemClock.uptimeMillis();
                    r1.A02 = null;
                    r1.A04(obj);
                }
            }
            r4.A00.countDown();
            r4.A05 = C023109s.A0C;
        } else if (i == 2) {
            Executor executor = C12080hT.A08;
        }
    }

    public AnonymousClass0E3() {
        super(Looper.getMainLooper());
    }
}
