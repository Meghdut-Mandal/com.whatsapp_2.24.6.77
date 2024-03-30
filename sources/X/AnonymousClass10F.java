package X;

import android.os.StrictMode;
import java.util.Map;

/* renamed from: X.10F  reason: invalid class name */
public abstract class AnonymousClass10F {
    public int A02(StrictMode.ThreadPolicy threadPolicy, String str, int i) {
        Object obj;
        int A04;
        if (!(this instanceof AnonymousClass10G)) {
            return ((AnonymousClass10H) this).A02.A02(threadPolicy, str, i);
        }
        AnonymousClass10G r3 = (AnonymousClass10G) this;
        if (!(r3 instanceof AnonymousClass10I)) {
            return r3.A04(threadPolicy, r3.A00, str, i);
        }
        AnonymousClass10I r32 = (AnonymousClass10I) r3;
        Map map = r32.A04;
        synchronized (map) {
            obj = map.get(str);
            if (obj == null) {
                obj = new Object();
                map.put(str, obj);
            }
        }
        synchronized (obj) {
            A04 = r32.A04(threadPolicy, r32.A00, str, i);
        }
        return A04;
    }

    public void A03(int i) {
        if (this instanceof AnonymousClass10H) {
            ((AnonymousClass10H) this).A02.A03(i);
        }
    }
}
