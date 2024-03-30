package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.5au  reason: invalid class name and case insensitive filesystem */
public abstract class C110585au {
    public static String[] A00(Collection collection) {
        String[] strArr = new String[(collection.size() * 3)];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            AnonymousClass6EZ r3 = (AnonymousClass6EZ) it.next();
            int i2 = i * 3;
            strArr[i2] = r3.A02;
            C36431kI.A1O(strArr, r3.A01, i2 + 1);
            C36431kI.A1O(strArr, r3.A00, i2 + 2);
            i++;
        }
        return strArr;
    }
}
