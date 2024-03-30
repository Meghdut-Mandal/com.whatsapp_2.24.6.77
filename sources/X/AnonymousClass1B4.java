package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1B4  reason: invalid class name */
public class AnonymousClass1B4 {
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();

    public synchronized String A00(String str) {
        return (String) this.A00.get(str);
    }

    public synchronized void A01(String str, String str2) {
        if (str2 != null) {
            this.A01.put(str2, str);
        }
        this.A00.put(str, str2);
    }

    public synchronized void A02(String str, String str2) {
        if (str2 != null) {
            this.A01.remove(str2);
        }
        this.A00.remove(str);
    }
}
