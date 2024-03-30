package X;

/* renamed from: X.5W7  reason: invalid class name */
public abstract class AnonymousClass5W7 {
    public static final void A00(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("both minLines ");
            A0u.append(i);
            A0u.append(" and maxLines ");
            A0u.append(i2);
            throw AnonymousClass000.A0c(" must be greater than zero", A0u);
        } else if (i > i2) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("minLines ");
            A0u2.append(i);
            throw AnonymousClass000.A0d(" must be less than or equal to maxLines ", A0u2, i2);
        }
    }
}
