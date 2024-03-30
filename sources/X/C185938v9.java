package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8v9  reason: invalid class name and case insensitive filesystem */
public final class C185938v9 extends C50502l1 {
    public static final ArrayList A00 = C165567td.A0e("get_participating_groups_paginated", "per_group_dirty_recovery");

    public C185938v9(String str, String str2, List list) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36351kA.A1I(C177578e1.A00, A0T, "to");
        C165567td.A1G(A0T, "w:g2");
        C203539oF.A0E(A0T, str);
        AnonymousClass6QB A0q = C36441kJ.A0q("query");
        A0q.A08(str2, "context", A00);
        if (C203539oF.A0Y(list, 1, 10000)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C592133b.A01(A0q, it);
            }
        }
        C165567td.A1F(A0q, A0T, this);
    }
}
