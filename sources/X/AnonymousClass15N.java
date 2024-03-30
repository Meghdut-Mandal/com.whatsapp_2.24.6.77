package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.15N  reason: invalid class name */
public class AnonymousClass15N {
    public final List A00;
    public final long A01;
    public final Map A02;
    public final CountDownLatch A03 = new CountDownLatch(1);
    public volatile boolean A04 = false;

    public AnonymousClass15N(List list, Map map, long j) {
        this.A01 = j;
        this.A00 = list;
        this.A02 = map;
    }
}
