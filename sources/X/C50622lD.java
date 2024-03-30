package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.2lD  reason: invalid class name and case insensitive filesystem */
public final class C50622lD extends C50492l0 implements C16420pD {
    public C50622lD(List list, List list2) {
        AnonymousClass6QB A0q = C36441kJ.A0q("leave");
        if (C203539oF.A0Y(list, 0, 1024)) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0A("getNode");
            }
        }
        if (C203539oF.A0Y(list2, 1, 1024)) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                C592133b.A01(A0q, it2);
            }
        }
        C592133b.A00(A0q, this);
    }
}
