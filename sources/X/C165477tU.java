package X;

import java.util.Collection;

/* renamed from: X.7tU  reason: invalid class name and case insensitive filesystem */
public class C165477tU implements C158317gj {
    public Object A00;
    public final int A01;

    public C165477tU(AnonymousClass66P r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final void BfJ(Collection collection) {
        int i = this.A01;
        AnonymousClass66P r1 = (AnonymousClass66P) this.A00;
        if (2 - i != 0) {
            AnonymousClass00C.A0D(r1, 0);
        }
        C18740tg.A01();
        if (collection != null) {
            r1.A01.addAll(collection);
        }
        C158307gi r0 = r1.A00;
        if (r0 != null) {
            r0.BfQ(r1);
        }
    }
}
