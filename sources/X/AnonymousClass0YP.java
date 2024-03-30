package X;

/* renamed from: X.0YP  reason: invalid class name */
public abstract class AnonymousClass0YP {
    public static final int A00(int i, int i2) {
        int i3 = i + (i >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        return i3 - 2147483639 > 0 ? i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i3;
    }

    public static final void A01(int i, int i2) {
        if (i < 0 || i >= i2) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("index: ");
            A0u.append(i);
            throw new IndexOutOfBoundsException(AnonymousClass000.A0r(", size: ", A0u, i2));
        }
    }

    public static final void A02(int i, int i2) {
        if (i < 0 || i > i2) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("index: ");
            A0u.append(i);
            throw new IndexOutOfBoundsException(AnonymousClass000.A0r(", size: ", A0u, i2));
        }
    }

    public static final void A03(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder A0v = AnonymousClass000.A0v("fromIndex: ");
            A0v.append(i);
            A0v.append(", toIndex: ");
            A0v.append(i2);
            throw new IndexOutOfBoundsException(AnonymousClass000.A0r(", size: ", A0v, i3));
        } else if (i > i2) {
            StringBuilder A0v2 = AnonymousClass000.A0v("fromIndex: ");
            A0v2.append(i);
            throw AnonymousClass000.A0d(" > toIndex: ", A0v2, i2);
        }
    }
}
