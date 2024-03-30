package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1i5  reason: invalid class name and case insensitive filesystem */
public final class C35061i5 {
    public final C35071i6 A00;

    public C35061i5(C35071i6 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public final boolean A00(Collection collection) {
        Integer A01;
        AnonymousClass00C.A0D(collection, 0);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            C35071i6 r2 = this.A00;
            if (r2.A03(longValue) && ((A01 = r2.A01(longValue)) == null || 4 != A01.intValue())) {
                return false;
            }
        }
        return true;
    }
}
