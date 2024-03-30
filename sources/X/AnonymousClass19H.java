package X;

import java.util.LinkedHashMap;

/* renamed from: X.19H  reason: invalid class name */
public class AnonymousClass19H {
    public final LinkedHashMap A00 = new LinkedHashMap();

    public boolean A00(String str) {
        boolean z;
        C18740tg.A07(str, "remove ackable message with null id");
        LinkedHashMap linkedHashMap = this.A00;
        synchronized (linkedHashMap) {
            z = false;
            if (linkedHashMap.remove(str) != null) {
                z = true;
            }
        }
        return z;
    }
}
