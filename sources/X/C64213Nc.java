package X;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

/* renamed from: X.3Nc  reason: invalid class name and case insensitive filesystem */
public class C64213Nc {
    public AnonymousClass3QK A00;
    public AnonymousClass3QK A01;
    public final Set A02;

    public C64213Nc(AnonymousClass3QK r3, AnonymousClass3QK r4, Set set) {
        ConcurrentSkipListSet concurrentSkipListSet = new ConcurrentSkipListSet(C81663xN.A00);
        this.A02 = concurrentSkipListSet;
        concurrentSkipListSet.addAll(set);
        this.A00 = r3;
        this.A01 = r4;
    }

    public C64213Nc() {
        this.A02 = new ConcurrentSkipListSet(C81663xN.A00);
    }
}
