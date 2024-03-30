package X;

/* renamed from: X.5XQ  reason: invalid class name */
public abstract class AnonymousClass5XQ {
    public static final long A00(int i, int i2) {
        if (!C36401kF.A1U(i)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            C90464aC.A1K("start cannot be negative. [start: ", ", end: ", A0u, i, i2);
            A0u.append(']');
            throw AnonymousClass000.A0b(A0u);
        } else if (i2 >= 0) {
            return C90484aE.A0J(i, i2);
        } else {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            C90464aC.A1K("end cannot be negative. [start: ", ", end: ", A0u2, i, i2);
            A0u2.append(']');
            throw AnonymousClass000.A0b(A0u2);
        }
    }
}
