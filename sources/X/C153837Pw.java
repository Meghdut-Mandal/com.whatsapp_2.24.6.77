package X;

import android.os.HandlerThread;

/* renamed from: X.7Pw  reason: invalid class name and case insensitive filesystem */
public final class C153837Pw extends AnonymousClass00R implements AnonymousClass00S {
    public static final C153837Pw A00 = new C153837Pw();

    public C153837Pw() {
        super(0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        HandlerThread handlerThread = new HandlerThread("ThreadUtilsBackgroundHandler", 5);
        handlerThread.start();
        return C90514aH.A0M(handlerThread);
    }
}
