package X;

/* renamed from: X.049  reason: invalid class name */
public abstract class AnonymousClass049 implements AnonymousClass048 {
    public final AnonymousClass04B A00;

    public abstract boolean A00();

    public boolean BN4(CharSequence charSequence, int i, int i2) {
        if (i2 < 0 || charSequence.length() - i2 < 0) {
            throw new IllegalArgumentException();
        }
        AnonymousClass04B r0 = this.A00;
        if (r0 != null) {
            int B2k = r0.B2k(charSequence, 0, i2);
            if (B2k == 0) {
                return true;
            }
            if (B2k == 1) {
                return false;
            }
        }
        return A00();
    }

    public AnonymousClass049(AnonymousClass04B r1) {
        this.A00 = r1;
    }
}
