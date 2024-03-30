package X;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0iY  reason: invalid class name and case insensitive filesystem */
public final class C12720iY implements C16970qV {
    public final AtomicReference A00;

    public Iterator iterator() {
        C16970qV r0 = (C16970qV) this.A00.getAndSet((Object) null);
        if (r0 != null) {
            return r0.iterator();
        }
        throw AnonymousClass001.A09("This sequence can be consumed only once.");
    }

    public C12720iY(C16970qV r2) {
        this.A00 = new AtomicReference(r2);
    }
}
