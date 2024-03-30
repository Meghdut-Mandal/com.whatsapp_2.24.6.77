package X;

import com.facebook.cameracore.ardelivery.listener.CancelableToken;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6ji  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C139366ji implements CancelableToken {
    public final /* synthetic */ AtomicBoolean A00;

    public /* synthetic */ C139366ji(AtomicBoolean atomicBoolean) {
        this.A00 = atomicBoolean;
    }

    public final boolean cancel() {
        AtomicBoolean atomicBoolean = this.A00;
        AnonymousClass00C.A0D(atomicBoolean, 0);
        return atomicBoolean.compareAndSet(false, true);
    }
}
