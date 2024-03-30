package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.12p  reason: invalid class name and case insensitive filesystem */
public final class C220312p implements AnonymousClass12J {
    public final C219712j A00;

    public C220312p(C219712j r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public List BDF(AnonymousClass11F r9) {
        AnonymousClass00C.A0D(r9, 0);
        List singletonList = Collections.singletonList(Long.valueOf(this.A00.A07(r9)));
        AnonymousClass00C.A08(singletonList);
        ArrayList arrayList = new ArrayList();
        for (Object next : singletonList) {
            if (((Number) next).longValue() >= 0) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public List BDG(AnonymousClass11F r2) {
        AnonymousClass00C.A0D(r2, 0);
        return BDF(r2);
    }

    public List BDH(AnonymousClass11F r2) {
        List singletonList = Collections.singletonList(r2);
        AnonymousClass00C.A08(singletonList);
        return singletonList;
    }
}
