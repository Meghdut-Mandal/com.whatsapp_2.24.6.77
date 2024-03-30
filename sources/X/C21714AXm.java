package X;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: X.AXm  reason: case insensitive filesystem */
public final class C21714AXm implements Comparator, Serializable {
    public final float average;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        float f = ((C173678Sp) obj2).A00;
        float f2 = this.average;
        return Float.compare(C90494aF.A01(f, f2), C90494aF.A01(((C173678Sp) obj).A00, f2));
    }

    public C21714AXm(float f) {
        this.average = f;
    }
}
