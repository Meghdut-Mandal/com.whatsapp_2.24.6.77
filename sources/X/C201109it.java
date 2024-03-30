package X;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.9it  reason: invalid class name and case insensitive filesystem */
public class C201109it {
    public static final Map A03 = new IdentityHashMap();
    public int A00 = 1;
    public Object A01;
    public final C22868AxN A02;

    public static void A00(C201109it r1) {
        boolean A1R;
        synchronized (r1) {
            A1R = AnonymousClass000.A1R(r1.A00);
        }
        if (!A1R) {
            throw new C21812Aan();
        }
    }

    public synchronized Object A01() {
        return this.A01;
    }

    public C201109it(C22868AxN axN, Object obj) {
        Objects.requireNonNull(obj);
        this.A01 = obj;
        this.A02 = axN;
        Map map = A03;
        synchronized (map) {
            Integer num = (Integer) map.get(obj);
            if (num == null) {
                C36421kH.A1M(obj, map, 1);
            } else {
                C36421kH.A1M(obj, map, num.intValue() + 1);
            }
        }
    }
}
