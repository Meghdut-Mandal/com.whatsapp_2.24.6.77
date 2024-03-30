package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.6rR  reason: invalid class name and case insensitive filesystem */
public final class C143986rR implements C159397jI {
    public final C123745x1 A00;
    public final C130896Mv A01;
    public final Collection A02;
    public final AnonymousClass040 A03;

    public C143986rR(C123745x1 r2, C130896Mv r3, Collection collection, AnonymousClass040 r5) {
        AnonymousClass00C.A0D(r3, 1);
        this.A01 = r3;
        this.A03 = r5;
        this.A00 = r2;
        this.A02 = collection;
    }

    public C1278569x BOH() {
        C130896Mv r4 = this.A01;
        AnonymousClass040 r3 = this.A03;
        C123745x1 r2 = this.A00;
        Collection collection = this.A02;
        List list = r4.A00;
        if (list == null) {
            list = C110315aT.A00(r4.A01(r2, collection, r3));
            r4.A00 = list;
            if (list == null) {
                throw C36381kD.A0k();
            }
        }
        return new C1278569x(this, list);
    }

    public C1278569x BOI() {
        return new C1278569x(this, this.A01.A01(this.A00, this.A02, this.A03));
    }
}
