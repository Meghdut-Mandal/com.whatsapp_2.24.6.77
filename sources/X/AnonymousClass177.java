package X;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.177  reason: invalid class name */
public class AnonymousClass177 {
    public int A00 = 0;
    public final C002000v A01 = new C35961jX(this);
    public final Map A02 = new HashMap();

    public synchronized AnonymousClass3T1 A00(C64933Qa r5) {
        AnonymousClass3T1 r2;
        C002000v r3 = this.A01;
        r2 = (AnonymousClass3T1) r3.A04(r5);
        if (r2 == null) {
            Map map = this.A02;
            WeakReference weakReference = (WeakReference) map.get(r5);
            if (weakReference != null) {
                r2 = (AnonymousClass3T1) weakReference.get();
                map.remove(r5);
                if (r2 != null) {
                    r3.A08(r5, r2);
                }
            }
        }
        return r2;
    }

    public synchronized void A01(AnonymousClass3T1 r2, C64933Qa r3) {
        this.A02.remove(r3);
        this.A01.A08(r3, r2);
    }

    public synchronized void A02(C64933Qa r2) {
        this.A02.remove(r2);
        this.A01.A05(r2);
    }
}
