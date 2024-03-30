package X;

/* renamed from: X.9Zj  reason: invalid class name and case insensitive filesystem */
public abstract class C196369Zj {
    public static final Object A00 = C36441kJ.A11();

    public static final void A00(int i, int i2) {
        if (i < 0 || i >= i2) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("index (");
            A0u.append(i);
            A0u.append(") is out of bound of [0, ");
            throw C165617ti.A0W(C36321k7.A0G(A0u, i2));
        }
    }
}
