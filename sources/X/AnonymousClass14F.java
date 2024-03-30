package X;

import android.os.HandlerThread;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* renamed from: X.14F  reason: invalid class name */
public class AnonymousClass14F extends AnonymousClass14D {
    public final AnonymousClass14G A00;
    public final AnonymousClass14I A01 = new AnonymousClass14I(this);
    public final WeakHashMap A02 = new WeakHashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass14F(HandlerThread handlerThread, C19820wZ r4, Executor executor) {
        super(r4, executor, 2);
        AnonymousClass14G r1 = new AnonymousClass14G(handlerThread);
        this.A00 = r1;
    }
}
