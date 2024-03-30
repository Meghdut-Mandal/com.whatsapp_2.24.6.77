package X;

/* renamed from: X.3h7  reason: invalid class name and case insensitive filesystem */
public final class C71653h7 implements AnonymousClass7gT {
    public final C19420v0 A00;
    public final AnonymousClass1DY A01;

    public C71653h7(C19420v0 r2, AnonymousClass1DY r3) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public void Bcw(AnonymousClass591 r4) {
        int i;
        AnonymousClass00C.A0D(r4, 0);
        if (this.A01.A00()) {
            C19420v0 r2 = this.A00;
            String A0i = r2.A0i();
            if (A0i == null || A0i.length() == 0) {
                i = 1;
            } else {
                int i2 = 2;
                if (C36371kC.A1U(C36341k9.A0E(r2), "settings_verification_email_address_verified")) {
                    i2 = 3;
                }
                i = Integer.valueOf(i2);
            }
        } else {
            i = null;
        }
        r4.A0h = i;
    }
}
