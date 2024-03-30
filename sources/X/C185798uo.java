package X;

import android.os.ConditionVariable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8uo  reason: invalid class name and case insensitive filesystem */
public final class C185798uo extends C50492l0 implements C16480pJ {
    public C185798uo(C185688ud r6, List list) {
        AnonymousClass6QB A0q = C36441kJ.A0q("config");
        if (C203539oF.A0Y(list, 0, Long.MAX_VALUE)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C592133b.A01(A0q, it);
            }
        }
        ConditionVariable conditionVariable = C18740tg.A00;
        C165577te.A1H(A0q, r6, this);
    }
}
