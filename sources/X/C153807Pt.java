package X;

import android.os.HandlerThread;

/* renamed from: X.7Pt  reason: invalid class name and case insensitive filesystem */
public final class C153807Pt extends AnonymousClass00R implements AnonymousClass00S {
    public static final C153807Pt A00 = new C153807Pt();

    public C153807Pt() {
        super(0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        HandlerThread handlerThread = new HandlerThread("FrescoAnimationWorker");
        handlerThread.start();
        return C90514aH.A0M(handlerThread);
    }
}
