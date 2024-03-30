package X;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;

/* renamed from: X.5zc  reason: invalid class name and case insensitive filesystem */
public abstract class C125275zc {
    public void A00(Throwable th) {
        if ((this instanceof C99144sh) || !(this instanceof C99154si)) {
            th.printStackTrace();
            return;
        }
        th.printStackTrace();
        C118745of r3 = ((C99154si) this).A00;
        ReferenceQueue referenceQueue = r3.A00;
        while (true) {
            Reference poll = referenceQueue.poll();
            if (poll == null) {
                break;
            }
            r3.A01.remove(poll);
        }
        List<Throwable> A0n = C90524aI.A0n(new C1511978p(th), r3.A01);
        if (A0n != null) {
            synchronized (A0n) {
                for (Throwable printStackTrace : A0n) {
                    System.err.print("Suppressed: ");
                    printStackTrace.printStackTrace();
                }
            }
        }
    }
}
