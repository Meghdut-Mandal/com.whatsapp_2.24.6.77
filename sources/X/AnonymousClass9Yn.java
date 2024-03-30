package X;

/* renamed from: X.9Yn  reason: invalid class name */
public abstract class AnonymousClass9Yn {
    public static final void A00(int i, int i2) {
        if (i < 0 || i >= i2) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("index: ");
            A0u.append(i);
            throw C165617ti.A0W(AnonymousClass000.A0r(", size: ", A0u, i2));
        }
    }

    public static final void A01(int i, int i2) {
        if (i < 0 || i > i2) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("index: ");
            A0u.append(i);
            throw C165617ti.A0W(AnonymousClass000.A0r(", size: ", A0u, i2));
        }
    }
}
