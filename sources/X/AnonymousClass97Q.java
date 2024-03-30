package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.97Q  reason: invalid class name */
public abstract class AnonymousClass97Q {
    public static final C21332AHk A00(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            B5M b5m = ((C206909uC) it.next()).A00;
            if (b5m instanceof C21332AHk) {
                return (C21332AHk) b5m;
            }
        }
        return null;
    }
}
