package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* renamed from: X.1C7  reason: invalid class name */
public class AnonymousClass1C7 {
    public final Handler A00;
    public final Handler A01;
    public final HandlerThread A02;
    public final HandlerThread A03;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r3.A01.getLooper() == android.os.Looper.myLooper()) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
            r3 = this;
            android.os.Handler r0 = r3.A00
            android.os.Looper r1 = r0.getLooper()
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r1 == r0) goto L_0x0019
            android.os.Handler r0 = r3.A01
            android.os.Looper r2 = r0.getLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            r0 = 0
            if (r2 != r1) goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            X.C18740tg.A0C(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1C7.A00():void");
    }

    public void A01(Runnable runnable, int i) {
        Handler handler = this.A00;
        Message obtain = Message.obtain(handler, runnable);
        obtain.arg1 = i;
        handler.sendMessage(obtain);
    }

    public void A02(Runnable runnable, int i) {
        Handler handler = this.A01;
        Message obtain = Message.obtain(handler, runnable);
        obtain.arg1 = i;
        handler.sendMessage(obtain);
    }

    public AnonymousClass1C7() {
        HandlerThread handlerThread = new HandlerThread("AsyncCommitThread");
        this.A02 = handlerThread;
        handlerThread.start();
        this.A00 = new C35931jU(handlerThread.getLooper(), this, 0);
        HandlerThread handlerThread2 = new HandlerThread("ReceiptProcessingThread");
        this.A03 = handlerThread2;
        handlerThread2.start();
        this.A01 = new C35931jU(handlerThread2.getLooper(), this, 1);
    }
}
