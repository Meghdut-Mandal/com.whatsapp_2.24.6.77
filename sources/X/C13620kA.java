package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0kA  reason: invalid class name and case insensitive filesystem */
public abstract class C13620kA extends C13630kB {
    public static final List A0F(Map map) {
        if (map.size() != 0) {
            Iterator A0y = AnonymousClass000.A0y(map);
            if (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                if (!A0y.hasNext()) {
                    List singletonList = Collections.singletonList(new AnonymousClass011(A11.getKey(), A11.getValue()));
                    AnonymousClass00C.A08(singletonList);
                    return singletonList;
                }
                ArrayList arrayList = new ArrayList(map.size());
                arrayList.add(new AnonymousClass011(A11.getKey(), A11.getValue()));
                do {
                    Map.Entry A112 = AnonymousClass000.A11(A0y);
                    arrayList.add(new AnonymousClass011(A112.getKey(), A112.getValue()));
                } while (A0y.hasNext());
                return arrayList;
            }
        }
        return C023409w.A00;
    }
}
