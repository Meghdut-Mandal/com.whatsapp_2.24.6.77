package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.1ll  reason: invalid class name and case insensitive filesystem */
public class C37071ll extends Handler {
    public final /* synthetic */ C70803fk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37071ll(C70803fk r2) {
        super(Looper.getMainLooper());
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        C70803fk r2 = this.A00;
        if (r2.A2l.BL8() && !r2.A2l.getScreenLockStateProvider().A01()) {
            r2.A4I.A09();
            if (r2.A6S) {
                r2.A4I.A0H(false);
            }
            r2.A6Z = false;
            r2.A6S = true;
        }
    }
}
