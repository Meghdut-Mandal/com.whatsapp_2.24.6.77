package X;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.04R  reason: invalid class name */
public abstract class AnonymousClass04R {
    public final Map A00 = new HashMap();
    public final Set A01 = new LinkedHashSet();
    public volatile boolean A02 = false;

    public void A0R() {
    }

    public static void A00(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Object A0Q(Object obj, String str) {
        Object obj2;
        Map map = this.A00;
        synchronized (map) {
            obj2 = map.get(str);
            if (obj2 == null) {
                map.put(str, obj);
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.A02) {
            A00(obj);
        }
        return obj;
    }
}
