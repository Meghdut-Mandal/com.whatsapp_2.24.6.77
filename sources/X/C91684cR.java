package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* renamed from: X.4cR  reason: invalid class name and case insensitive filesystem */
public class C91684cR extends Handler {
    public AnonymousClass5VT A00;
    public AnonymousClass6Q9 A01;
    public HandlerThread A02;

    public void handleMessage(Message message) {
        AnonymousClass5VT r3 = this.A00;
        r3.A00.set(Double.doubleToRawLongBits((double) this.A01.A02()));
        sendEmptyMessageDelayed(0, (long) 50);
    }

    public C91684cR(HandlerThread handlerThread, AnonymousClass5VT r3, AnonymousClass6Q9 r4) {
        super(handlerThread.getLooper());
        this.A02 = handlerThread;
        this.A00 = r3;
        this.A01 = r4;
    }
}
