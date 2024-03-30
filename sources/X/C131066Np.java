package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: X.6Np  reason: invalid class name and case insensitive filesystem */
public class C131066Np {
    public final Map A00;
    public final Set A01;

    public boolean equals(Object obj) {
        boolean A1W;
        boolean A1W2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C131066Np)) {
            return false;
        }
        C131066Np r5 = (C131066Np) obj;
        Set set = r5.A01;
        Set set2 = this.A01;
        if (set != null) {
            A1W = set.equals(set2);
        } else {
            A1W = AnonymousClass000.A1W(set2);
        }
        Map map = r5.A00;
        Map map2 = this.A00;
        if (map != null) {
            A1W2 = map.equals(map2);
        } else {
            A1W2 = AnonymousClass000.A1W(map2);
        }
        return A1W && A1W2;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.A01, this.A00});
    }

    public C131066Np(Map map) {
        HashSet A16 = C36441kJ.A16();
        HashMap A0J = AnonymousClass001.A0J();
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            Object key = A11.getKey();
            Set set = (Set) A11.getValue();
            if (set == null || !set.contains("*|all_packages|*")) {
                if (!A0J.containsKey(key)) {
                    A0J.put(key, C36441kJ.A16());
                }
                ((Set) A0J.get(key)).addAll(set);
            } else {
                A16.add(key);
            }
        }
        this.A01 = Collections.unmodifiableSet(A16);
        this.A00 = Collections.unmodifiableMap(A0J);
    }

    public static boolean A00(AnonymousClass72I r4, AnonymousClass72I r5, boolean z) {
        if (!r4.equals(r5)) {
            if (!z) {
                return false;
            }
            Set A0r = C90524aI.A0r(r5, C197129bB.A0z);
            if (A0r == null) {
                A0r = Collections.unmodifiableSet(C36421kH.A0g(new AnonymousClass72I[]{C197129bB.A01}));
            }
            if (A0r.contains(r4)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
