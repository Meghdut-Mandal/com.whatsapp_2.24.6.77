package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1AE  reason: invalid class name */
public final class AnonymousClass1AE {
    public final AnonymousClass00T A00;

    public AnonymousClass1AE(AnonymousClass005 r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A00 = new AnonymousClass00U(new AnonymousClass1AF(r3));
    }

    public final AnonymousClass1LZ A00(String str) {
        AnonymousClass1LZ r1;
        AnonymousClass00C.A0D(str, 0);
        synchronized (this) {
            r1 = (AnonymousClass1LZ) ((Map) this.A00.getValue()).get(str);
            if (r1 == null || !r1.A0H()) {
                r1 = null;
            }
        }
        return r1;
    }

    public final List A01() {
        ArrayList arrayList;
        synchronized (this) {
            Collection values = ((Map) this.A00.getValue()).values();
            arrayList = new ArrayList();
            for (Object next : values) {
                if (((AnonymousClass1LZ) next).A0H()) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    public final Set A02() {
        List<AnonymousClass1LZ> A01 = A01();
        ArrayList arrayList = new ArrayList(AnonymousClass03U.A06(A01, 10));
        for (AnonymousClass1LZ A0C : A01) {
            arrayList.add(A0C.A0C());
        }
        return C007103b.A0f(arrayList);
    }
}
