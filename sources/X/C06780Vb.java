package X;

/* renamed from: X.0Vb  reason: invalid class name and case insensitive filesystem */
public abstract class C06780Vb {
    public static final void A00(int i) {
        if (!new C15020mZ(2, 36).A02(i)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("radix ");
            A0u.append(i);
            A0u.append(" was not in valid range ");
            A0u.append(new C15020mZ(2, 36));
            throw AnonymousClass000.A0b(A0u);
        }
    }

    public static final boolean A01(char c) {
        if (Character.isWhitespace(c) || Character.isSpaceChar(c)) {
            return true;
        }
        return false;
    }
}
