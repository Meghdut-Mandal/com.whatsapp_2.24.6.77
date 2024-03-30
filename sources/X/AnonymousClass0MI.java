package X;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* renamed from: X.0MI  reason: invalid class name */
public final class AnonymousClass0MI extends AnonymousClass0E7 {
    public final /* synthetic */ C10340e5 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0MI(Looper looper, C10340e5 r2) {
        super(looper);
        this.A00 = r2;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C06380Tj r3 = (C06380Tj) message.obj;
            C10340e5 r0 = this.A00;
            Lock lock = r0.A0D;
            lock.lock();
            try {
                if (r0.A0E == r3.A00) {
                    r3.A00();
                }
            } finally {
                lock.unlock();
            }
        } else if (i != 2) {
            Log.w("GACStateManager", AnonymousClass000.A0r("Unknown message id: ", AnonymousClass000.A0u(), i));
        } else {
            throw ((Throwable) message.obj);
        }
    }
}
