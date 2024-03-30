package X;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Objects;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.5zb  reason: invalid class name and case insensitive filesystem */
public abstract class C125265zb {
    public void A00(Throwable th, Throwable th2) {
        if (this instanceof C98914sK) {
            th.addSuppressed(th2);
        } else if (this instanceof C98924sL) {
            C98924sL r1 = (C98924sL) this;
            if (th2 != th) {
                Objects.requireNonNull(th2, "The suppressed exception cannot be null.");
                C118735oe r2 = r1.A00;
                ReferenceQueue referenceQueue = r2.A00;
                while (true) {
                    Reference poll = referenceQueue.poll();
                    if (poll == null) {
                        break;
                    }
                    r2.A01.remove(poll);
                }
                C1511878o r0 = new C1511878o(th, (ReferenceQueue) null);
                ConcurrentHashMap concurrentHashMap = r2.A01;
                List A0n = C90524aI.A0n(r0, concurrentHashMap);
                if (A0n == null) {
                    A0n = new Vector(2);
                    List list = (List) concurrentHashMap.putIfAbsent(new C1511878o(th, referenceQueue), A0n);
                    if (list != null) {
                        A0n = list;
                    }
                }
                A0n.add(th2);
                return;
            }
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
    }
}
