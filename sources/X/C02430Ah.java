package X;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.0Ah  reason: invalid class name and case insensitive filesystem */
public final class C02430Ah {
    public final AnonymousClass007 A00 = new AnonymousClass007(0);
    public final C017007h A01 = new C017107i(10);
    public final ArrayList A02 = new ArrayList();
    public final HashSet A03 = new HashSet();

    public static void A00(C02430Ah r4, Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            AbstractList abstractList = (AbstractList) r4.A00.get(obj);
            if (abstractList != null) {
                int size = abstractList.size();
                for (int i = 0; i < size; i++) {
                    A00(r4, abstractList.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }
}
