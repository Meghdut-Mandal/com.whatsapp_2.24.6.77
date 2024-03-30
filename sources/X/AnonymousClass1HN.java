package X;

import java.util.HashMap;

/* renamed from: X.1HN  reason: invalid class name */
public class AnonymousClass1HN {
    public final HashMap A00 = new HashMap();
    public final HashMap A01 = new HashMap();

    public void A00(AnonymousClass5Ng r3) {
        HashMap hashMap = this.A00;
        synchronized (hashMap) {
            hashMap.put(r3.A00, r3);
        }
        if (r3.A02 != null) {
            HashMap hashMap2 = this.A01;
            synchronized (hashMap2) {
                hashMap2.put(r3.A02, r3);
            }
        }
    }
}
