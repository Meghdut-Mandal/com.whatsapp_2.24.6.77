package X;

import android.os.Debug;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0zB  reason: invalid class name and case insensitive filesystem */
public class C21400zB {
    public final Set A00 = new HashSet();

    public void A00() {
        Runtime runtime = Runtime.getRuntime();
        synchronized (this) {
            for (WeakReference weakReference : this.A00) {
                AnonymousClass12L r1 = (AnonymousClass12L) weakReference.get();
                if (!(r1 == null || r1.BHv() == null)) {
                    r1.BHv();
                }
            }
        }
        runtime.freeMemory();
        runtime.totalMemory();
        runtime.maxMemory();
        Debug.getNativeHeapFreeSize();
        Debug.getNativeHeapAllocatedSize();
    }
}
