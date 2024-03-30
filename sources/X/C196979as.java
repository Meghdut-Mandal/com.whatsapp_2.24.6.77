package X;

import java.util.HashMap;
import java.util.LinkedHashSet;

/* renamed from: X.9as  reason: invalid class name and case insensitive filesystem */
public abstract class C196979as {
    public static HashMap A00 = AnonymousClass001.A0J();
    public static HashMap A01 = AnonymousClass001.A0J();

    public static void A00(Class cls) {
        Class<Object> cls2 = Object.class;
        HashMap hashMap = A01;
        synchronized (hashMap) {
            LinkedHashSet linkedHashSet = (LinkedHashSet) hashMap.get(cls2);
            if (linkedHashSet == null) {
                linkedHashSet = C36441kJ.A17();
                hashMap.put(cls2, linkedHashSet);
            }
            linkedHashSet.add(cls);
        }
    }

    static {
        A00(C1902697n.class);
        A00(C203069nE.class);
    }
}
