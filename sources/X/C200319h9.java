package X;

/* renamed from: X.9h9  reason: invalid class name and case insensitive filesystem */
public abstract class C200319h9 {
    public static void A00(int i, int i2) {
        if (i < 0 || i >= i2) {
            Object[] A1Q = C36441kJ.A1Q();
            AnonymousClass000.A1L(A1Q, i, 0);
            C165567td.A1X(A1Q, 0, i2);
            throw C165617ti.A0W(String.format("Index: %d. Start: %d. Limit: %d", A1Q));
        }
    }

    public static void A01(boolean z) {
        if (!z) {
            throw C165617ti.A0U();
        }
    }

    public static void A02(boolean z) {
        if (!z) {
            throw C165617ti.A0V();
        }
    }
}
