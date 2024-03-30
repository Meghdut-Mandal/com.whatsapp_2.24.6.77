package X;

/* renamed from: X.6Mk  reason: invalid class name and case insensitive filesystem */
public final class C130786Mk {
    public int A00;
    public C120625ro A01;
    public final C1506776e A02 = C1506776e.A02(new C120625ro[16]);

    public static final void A00(C130786Mk r2, int i) {
        if (i < 0 || i >= r2.A00) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Index ");
            A0u.append(i);
            A0u.append(", size ");
            throw new IndexOutOfBoundsException(C36381kD.A10(A0u, r2.A00));
        }
    }

    public C120625ro A01(int i) {
        A00(this, i);
        C120625ro r0 = this.A01;
        if (r0 != null) {
            int i2 = r0.A01;
            if (i < r0.A00 + i2 && i2 <= i) {
                return r0;
            }
        }
        C1506776e r02 = this.A02;
        C120625ro r03 = (C120625ro) r02.A01[AnonymousClass5W1.A00(r02, i)];
        this.A01 = r03;
        return r03;
    }
}
