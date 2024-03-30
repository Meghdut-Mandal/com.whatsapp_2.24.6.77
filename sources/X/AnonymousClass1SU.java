package X;

import java.util.HashMap;

/* renamed from: X.1SU  reason: invalid class name */
public class AnonymousClass1SU {
    public final HashMap A00 = new HashMap();

    public C101334xN A00(C65013Qj r3) {
        C101334xN r0;
        HashMap hashMap = this.A00;
        synchronized (hashMap) {
            r0 = (C101334xN) hashMap.get(r3);
        }
        return r0;
    }
}
