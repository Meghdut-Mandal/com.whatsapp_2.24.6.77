package X;

import java.util.List;

/* renamed from: X.9yR  reason: invalid class name and case insensitive filesystem */
public class C208549yR implements C22854Ax4 {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public B0T Bvf(AnonymousClass9Y2 r2, C165737u4 r3, C208409yC r4) {
        return new C208359y6(r2, r3, this, r4);
    }

    public C208549yR(String str, List list, boolean z) {
        this.A00 = str;
        this.A01 = list;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ShapeGroup{name='");
        A0u.append(this.A00);
        A0u.append("' Shapes: ");
        C90514aH.A1T(A0u, this.A01.toArray());
        return AnonymousClass000.A0s(A0u);
    }
}
