package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6Qj  reason: invalid class name and case insensitive filesystem */
public abstract class C131746Qj {
    public static int capacity(int i) {
        return (int) ((((float) 4) / 0.75f) + 1.0f);
    }

    public static boolean equalsImpl(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static String toStringImpl(Map map) {
        StringBuilder newStringBuilderForCollection = C109735Yx.newStringBuilderForCollection(map.size());
        newStringBuilderForCollection.append('{');
        Iterator A0y = AnonymousClass000.A0y(map);
        boolean z = true;
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            if (!z) {
                C90504aG.A1M(newStringBuilderForCollection);
            }
            z = false;
            newStringBuilderForCollection.append(A11.getKey());
            newStringBuilderForCollection.append('=');
            newStringBuilderForCollection.append(A11.getValue());
        }
        return AnonymousClass000.A0s(newStringBuilderForCollection);
    }
}
