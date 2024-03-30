package X;

import android.os.SystemClock;
import java.util.HashMap;

/* renamed from: X.1AT  reason: invalid class name */
public class AnonymousClass1AT {
    public final HashMap A00 = new HashMap();

    public synchronized void A00() {
        this.A00.clear();
    }

    public synchronized void A01(Object obj) {
        this.A00.remove(obj);
    }

    public synchronized boolean A02(Object obj) {
        boolean z;
        HashMap hashMap = this.A00;
        Long l = (Long) hashMap.get(obj);
        if (l == null || l.longValue() + 60000 <= SystemClock.elapsedRealtime()) {
            hashMap.put(obj, Long.valueOf(SystemClock.elapsedRealtime()));
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
