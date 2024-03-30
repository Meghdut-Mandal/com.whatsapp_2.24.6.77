package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* renamed from: X.78p  reason: invalid class name and case insensitive filesystem */
public final class C1511978p extends WeakReference {
    public final int A00;

    public C1511978p(Throwable th) {
        super(th, (ReferenceQueue) null);
        Objects.requireNonNull(th, "The referent cannot be null");
        this.A00 = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this != obj) {
                C1511978p r5 = (C1511978p) obj;
                if (!(this.A00 == r5.A00 && get() == r5.get())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A00;
    }
}
