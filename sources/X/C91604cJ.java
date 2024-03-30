package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.4cJ  reason: invalid class name and case insensitive filesystem */
public final class C91604cJ extends Handler {
    public final Handler.Callback A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91604cJ(Looper looper, Handler.Callback callback) {
        super(looper, new C133746Zv(callback));
        AnonymousClass00C.A0D(looper, 1);
        this.A00 = callback;
    }

    public final void A00(Message message) {
        AnonymousClass00C.A0D(message, 0);
        if (AnonymousClass00C.A0J(Looper.myLooper(), getLooper())) {
            this.A00.handleMessage(message);
        } else {
            sendMessageAtFrontOfQueue(message);
        }
    }
}
