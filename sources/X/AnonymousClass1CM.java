package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* renamed from: X.1CM  reason: invalid class name */
public class AnonymousClass1CM {
    public final C20810yC A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Long[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.HashSet A00(java.util.HashMap r8) {
        /*
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.util.Set r0 = r8.entrySet()
            java.util.Iterator r8 = r0.iterator()
        L_0x000d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0064
            java.lang.Object r1 = r8.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getKey()
            X.3PO r0 = (X.AnonymousClass3PO) r0
            X.11F r6 = r0.A00
            java.lang.Object r0 = r1.getKey()
            X.3PO r0 = (X.AnonymousClass3PO) r0
            X.11F r5 = r0.A01
            java.lang.Object r4 = r1.getValue()
            java.util.List r4 = (java.util.List) r4
            int r0 = r4.size()
            java.lang.Long[] r3 = new java.lang.Long[r0]
            int r0 = r4.size()
            java.lang.String[] r2 = new java.lang.String[r0]
            r1 = 0
        L_0x003c:
            int r0 = r4.size()
            if (r1 >= r0) goto L_0x0059
            java.lang.Object r0 = r4.get(r1)
            X.9U0 r0 = (X.AnonymousClass9U0) r0
            java.lang.Object r0 = r0.A00
            r3[r1] = r0
            java.lang.Object r0 = r4.get(r1)
            X.9U0 r0 = (X.AnonymousClass9U0) r0
            java.lang.Object r0 = r0.A01
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x003c
        L_0x0059:
            if (r6 == 0) goto L_0x000d
            X.9Rs r0 = new X.9Rs
            r0.<init>(r6, r5, r3, r2)
            r7.add(r0)
            goto L_0x000d
        L_0x0064:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CM.A00(java.util.HashMap):java.util.HashSet");
    }

    public static HashSet A01(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C194909Rs r6 = (C194909Rs) it.next();
            int i = 0;
            AnonymousClass3PO r4 = new AnonymousClass3PO(r6.A01, r6.A00, false);
            ArrayList arrayList = new ArrayList();
            while (true) {
                Long[] lArr = r6.A02;
                if (i >= lArr.length) {
                    break;
                }
                arrayList.add(new AnonymousClass9U0(lArr[i], r6.A03[i]));
                i++;
            }
            if (hashMap.containsKey(r4)) {
                List list = (List) hashMap.get(r4);
                Objects.requireNonNull(list);
                list.addAll(arrayList);
            } else {
                hashMap.put(r4, arrayList);
            }
        }
        return A00(hashMap);
    }

    public static boolean A02(AnonymousClass3T1 r4) {
        int i;
        C64933Qa r3 = r4.A1J;
        if (r3.A02) {
            return false;
        }
        if (!(r4.A09 == 1 || (i = r4.A1I) == 81 || C66013Ui.A0K(i) || i == 78 || i == 82)) {
            if (i != 2) {
                return false;
            }
            if (!(r3.A00 instanceof C28981Uw) && r4.A0W() == null) {
                return false;
            }
        }
        int i2 = r4.A0D;
        if (i2 == 9 || i2 == 10) {
            return false;
        }
        return true;
    }

    public AnonymousClass1CM(C20810yC r1) {
        this.A00 = r1;
    }
}
