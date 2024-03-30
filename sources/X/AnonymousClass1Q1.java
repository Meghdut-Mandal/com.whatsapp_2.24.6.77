package X;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1Q1  reason: invalid class name */
public final class AnonymousClass1Q1 {
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();

    public final WeakReference A00(String str) {
        AnonymousClass00C.A0D(str, 0);
        return (WeakReference) this.A00.get(str);
    }

    public final void A01(AnonymousClass15K r4) {
        ConcurrentHashMap concurrentHashMap = this.A00;
        String BCV = r4.BCV();
        AnonymousClass00C.A08(BCV);
        concurrentHashMap.put(BCV, new WeakReference(r4));
    }

    public final void A02(AnonymousClass15K r3) {
        this.A00.remove(r3.BCV());
    }
}
