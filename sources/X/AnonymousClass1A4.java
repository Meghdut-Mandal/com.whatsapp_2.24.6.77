package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1A4  reason: invalid class name */
public class AnonymousClass1A4 {
    public long A00 = -1;
    public final C220412q A01;
    public final Map A02 = Collections.synchronizedMap(new HashMap());
    public final C19970wo A03;

    public void A00(AnonymousClass11F r6, String str) {
        if (this.A00 == -1) {
            this.A00 = C19970wo.A00(this.A03);
        }
        Map map = this.A02;
        Set set = (Set) map.get(r6);
        if (set == null) {
            set = new HashSet();
        }
        set.add(str);
        map.put(r6, set);
    }

    public AnonymousClass1A4(C19970wo r3, C220412q r4) {
        this.A03 = r3;
        this.A01 = r4;
    }
}
