package X;

import android.os.HandlerThread;

/* renamed from: X.5eu  reason: invalid class name and case insensitive filesystem */
public abstract class C113045eu {
    public static final HandlerThread A00;

    static {
        HandlerThread handlerThread = new HandlerThread("Bloks_ACQ_ResponseThread", -4);
        handlerThread.start();
        A00 = handlerThread;
    }
}
