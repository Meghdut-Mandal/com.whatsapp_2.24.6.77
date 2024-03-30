package X;

import android.os.HandlerThread;

/* renamed from: X.7Pr  reason: invalid class name and case insensitive filesystem */
public final class C153787Pr extends AnonymousClass00R implements AnonymousClass00S {
    public static final C153787Pr A00 = new C153787Pr();

    public C153787Pr() {
        super(0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        HandlerThread handlerThread = new HandlerThread("BloksScriptDispatchLowPriThread", 10);
        handlerThread.start();
        return C90514aH.A0M(handlerThread);
    }
}
