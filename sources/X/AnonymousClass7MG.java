package X;

import android.os.ConditionVariable;
import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: X.7MG  reason: invalid class name */
public final class AnonymousClass7MG extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass6KH this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7MG(AnonymousClass6KH r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ConditionVariable conditionVariable = C18740tg.A00;
        HandlerThread handlerThread = new HandlerThread("WAHeroPlayerThread", -2);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        AnonymousClass00C.A08(looper);
        return looper;
    }
}
