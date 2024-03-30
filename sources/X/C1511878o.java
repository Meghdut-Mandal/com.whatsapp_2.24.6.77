package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* renamed from: X.78o  reason: invalid class name and case insensitive filesystem */
public final class C1511878o extends WeakReference {
    public final int A00;

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this != obj) {
                C1511878o r5 = (C1511878o) obj;
                if (!(this.A00 == r5.A00 && get() == r5.get())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public C1511878o(Throwable th, ReferenceQueue referenceQueue) {
        super(th, referenceQueue);
        Objects.requireNonNull(th, "The referent cannot be null");
        this.A00 = System.identityHashCode(th);
    }

    public final int hashCode() {
        return this.A00;
    }
}
