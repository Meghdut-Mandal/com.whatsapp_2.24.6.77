package X;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: X.AXl  reason: case insensitive filesystem */
public final class C21713AXl implements Comparator, Serializable {
    public final float average;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C173678Sp r4 = (C173678Sp) obj;
        C173678Sp r5 = (C173678Sp) obj2;
        int compare = Integer.compare(r5.A01, r4.A01);
        if (compare != 0) {
            return compare;
        }
        float f = r4.A00;
        float f2 = this.average;
        return Float.compare(C90494aF.A01(f, f2), C90494aF.A01(r5.A00, f2));
    }

    public C21713AXl(float f) {
        this.average = f;
    }
}
