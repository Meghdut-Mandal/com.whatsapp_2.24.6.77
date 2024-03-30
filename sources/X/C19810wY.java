package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.0wY  reason: invalid class name and case insensitive filesystem */
public final class C19810wY {
    public final C19820wZ A00 = new C19820wZ();
    public final List A01 = new ArrayList(2);
    public volatile C19700wN A02;

    public synchronized void A00(C19840wb r6) {
        synchronized (this) {
            C19860wd r3 = C19860wd.A00;
            C19820wZ r2 = this.A00;
            synchronized (r2) {
                HashMap hashMap = r2.A00;
                C19870we r0 = (C19870we) hashMap.get(r6);
                if (r0 == null) {
                    hashMap.put(r6, new C19870we(r3));
                } else {
                    r0.A00 = r3;
                }
            }
        }
    }
}
