package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.9kV  reason: invalid class name and case insensitive filesystem */
public abstract class C201839kV {
    public static final String[] A00 = new String[0];

    public static String[] A01(AnonymousClass11F r4, C64933Qa r5, String[] strArr) {
        String str;
        String[] strArr2 = new String[5];
        strArr2[0] = strArr[0];
        AnonymousClass11F r0 = r5.A00;
        C18740tg.A06(r0);
        strArr2[1] = r0.getRawString();
        strArr2[2] = r5.A01;
        strArr2[3] = C165617ti.A0Y(r5.A02 ? 1 : 0);
        if (r4 != null) {
            str = r4.getRawString();
        } else {
            str = "0";
        }
        strArr2[4] = str;
        return strArr2;
    }

    public static Boolean A00(String str) {
        boolean z;
        if ("1".equals(str)) {
            z = true;
        } else if (!"0".equals(str)) {
            return null;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static String[] A02(Collection collection) {
        LinkedHashSet A17 = C36441kJ.A17();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A17.add(((C201669k5) it.next()).A06());
        }
        return (String[]) A17.toArray(A00);
    }
}
