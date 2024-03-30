package X;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.04J  reason: invalid class name */
public class AnonymousClass04J {
    public final HashMap A00 = new HashMap();

    public final void A00() {
        HashMap hashMap = this.A00;
        for (AnonymousClass04R r3 : hashMap.values()) {
            r3.A02 = true;
            Map map = r3.A00;
            synchronized (map) {
                for (Object A002 : map.values()) {
                    AnonymousClass04R.A00(A002);
                }
            }
            Set<Closeable> set = r3.A01;
            synchronized (set) {
                for (Closeable A003 : set) {
                    AnonymousClass04R.A00(A003);
                }
            }
            r3.A0R();
        }
        hashMap.clear();
    }
}
