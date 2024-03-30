package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Ot  reason: invalid class name and case insensitive filesystem */
public class C194239Ot {
    public int[] A00(List list) {
        int i;
        Iterator it = list.iterator();
        int[] iArr = null;
        int i2 = Integer.MAX_VALUE;
        while (it.hasNext()) {
            int[] iArr2 = (int[]) it.next();
            if (iArr2[1] >= 30000 && (i = iArr2[0]) < i2) {
                i2 = i;
                iArr = iArr2;
            }
        }
        if (iArr == null) {
            return (int[]) list.get(C36421kH.A06(list, 1));
        }
        return iArr;
    }
}
