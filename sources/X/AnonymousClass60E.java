package X;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.60E  reason: invalid class name */
public final class AnonymousClass60E {
    public final int A00;

    public final LinkedHashMap A00(int i, int i2, int i3) {
        if (i3 < 1) {
            i3 = 1;
        }
        int i4 = this.A00;
        if (i3 > i4) {
            i3 = i4;
        }
        float f = ((float) i3) * (((float) i) / 1000.0f);
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = (float) i2;
        if (f > f2) {
            f = f2;
        }
        float f3 = f2 / f;
        int i5 = 0;
        C15020mZ A05 = C15040mb.A05(0, i2);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C36331k8.A01(A05));
        Iterator it = A05.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int A0I = AnonymousClass000.A0I(next);
            if (((int) (((float) A0I) % f3)) == 0) {
                i5 = A0I;
            }
            C36341k9.A1K(next, linkedHashMap, i5);
        }
        return linkedHashMap;
    }

    public AnonymousClass60E(int i) {
        this.A00 = i;
    }
}
