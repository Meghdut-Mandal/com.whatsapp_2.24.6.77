package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.99X  reason: invalid class name */
public abstract class AnonymousClass99X {
    public static final C22816AwR A00;

    static {
        C197459bk r4 = C197459bk.A00;
        C22816AwR awR = r4.cache;
        if (awR == null) {
            awR = new A8N();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C197459bk.A01;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(r4, (Object) null, awR)) {
                    if (atomicReferenceFieldUpdater.get(r4) != null) {
                        awR = r4.cache;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        A00 = awR;
    }
}
