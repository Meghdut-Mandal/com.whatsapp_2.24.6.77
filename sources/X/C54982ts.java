package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2ts  reason: invalid class name and case insensitive filesystem */
public abstract class C54982ts {
    public static final ArrayList A00(List list, List list2) {
        C207219uk r0;
        C207199ui r1;
        ArrayList A0I = AnonymousClass001.A0I();
        if (!list2.isEmpty()) {
            HashMap A0J = AnonymousClass001.A0J();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass141 A0f = C36391kE.A0f(it);
                AnonymousClass11F r02 = A0f.A0H;
                if (r02 != null) {
                    A0J.put(r02.getRawString(), A0f);
                }
            }
            list2.size();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                AnonymousClass2bZ r3 = (AnonymousClass2bZ) it2.next();
                AnonymousClass11F r12 = r3.A1J.A00;
                String str = null;
                if (r12 != null) {
                    str = r12.getRawString();
                }
                Object obj = A0J.get(str);
                if (!(obj == null || A0I.contains(obj) || (r0 = r3.A00) == null || (r1 = r0.A01) == null)) {
                    if (C207199ui.A00(r1.A09.A01) != 1 || r1.A06 != null || r1.A07) {
                        A0I.add(obj);
                    }
                }
            }
            A0I.size();
        }
        return A0I;
    }
}
