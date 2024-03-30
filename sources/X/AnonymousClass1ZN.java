package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1ZN  reason: invalid class name */
public final class AnonymousClass1ZN {
    public final C19970wo A00;
    public final C20810yC A01;
    public final Map A02 = new LinkedHashMap();

    public AnonymousClass1ZN(C19970wo r2, C20810yC r3) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public static final void A00(AnonymousClass1ZN r10) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Map map = r10.A02;
        synchronized (map) {
            Set entrySet = map.entrySet();
            ArrayList<Map.Entry> arrayList = new ArrayList<>();
            for (Object next : entrySet) {
                if (((AnonymousClass3JF) ((Map.Entry) next).getValue()).A00 <= C19970wo.A00(r10.A00)) {
                    arrayList.add(next);
                }
            }
            for (Map.Entry key : arrayList) {
                linkedHashSet.add(key.getKey());
            }
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                map.remove((String) it.next());
            }
        }
    }
}
