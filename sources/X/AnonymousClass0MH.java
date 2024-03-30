package X;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* renamed from: X.0MH  reason: invalid class name */
public final class AnonymousClass0MH extends AnonymousClass0E7 {
    public final /* synthetic */ AnonymousClass0JO A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0MH(Looper looper, AnonymousClass0JO r2) {
        super(looper);
        this.A00 = r2;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            AnonymousClass0JO r2 = this.A00;
            Lock lock = r2.A0E;
            lock.lock();
            try {
                if (r2.A0D()) {
                    AnonymousClass0JO.A00(r2);
                }
            } finally {
                lock.unlock();
            }
        } else if (i != 2) {
            Log.w("GoogleApiClientImpl", AnonymousClass000.A0r("Unknown message id: ", AnonymousClass000.A0u(), i));
        } else {
            AnonymousClass0JO.A01(this.A00);
        }
    }
}
