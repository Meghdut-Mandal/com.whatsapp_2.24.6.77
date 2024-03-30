package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.12K  reason: invalid class name */
public final class AnonymousClass12K implements AnonymousClass12J {
    public final C220212o A00;
    public final C220312p A01;
    public final C20810yC A02;

    public AnonymousClass12K(C220212o r2, C220312p r3, C20810yC r4) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r3, 3);
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
    }

    public List BDF(AnonymousClass11F r2) {
        AnonymousClass00C.A0D(r2, 0);
        if (A00()) {
            return this.A00.BDF(r2);
        }
        return this.A01.BDF(r2);
    }

    public List BDG(AnonymousClass11F r2) {
        AnonymousClass00C.A0D(r2, 0);
        if (A00()) {
            return this.A00.BDG(r2);
        }
        return this.A01.BDF(r2);
    }

    private final boolean A00() {
        C20810yC r2 = this.A02;
        C21000yV r1 = C21000yV.A02;
        if (!C20800yB.A01(r1, r2, 2939) || !C20800yB.A01(r1, r2, 2479)) {
            return false;
        }
        return true;
    }

    public List BDH(AnonymousClass11F r2) {
        if (A00()) {
            return this.A00.BDH(r2);
        }
        List singletonList = Collections.singletonList(r2);
        AnonymousClass00C.A08(singletonList);
        return singletonList;
    }
}
