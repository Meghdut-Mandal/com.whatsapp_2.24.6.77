package X;

import java.util.Set;

/* renamed from: X.1Gk  reason: invalid class name and case insensitive filesystem */
public final class C25461Gk {
    public static final Set A04;
    public final C25601Gy A00;
    public final C25481Gm A01;
    public final AnonymousClass00T A02 = new AnonymousClass00U(new C25611Gz(this));
    public final AnonymousClass00T A03 = new AnonymousClass00U(new AnonymousClass1H0(this));

    public C25461Gk(C25481Gm r3, C19770wU r4) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A01 = r3;
        this.A00 = new C25601Gy(r4);
    }

    public final void A00(AnonymousClass64a r3, C25471Gl r4) {
        AnonymousClass00T r0;
        AnonymousClass00C.A0D(r4, 1);
        if (A04.contains(r4)) {
            r0 = this.A02;
        } else {
            r0 = this.A03;
        }
        AnonymousClass00C.A08(((AnonymousClass1GM) r0.getValue()).A04(r3.A02, r3));
    }

    static {
        C25471Gl[] r2 = {C25471Gl.A0D, C25471Gl.A0l, C25471Gl.A0J, C25471Gl.A0b, C25471Gl.A08, C25471Gl.A0O, C25471Gl.A09, C25471Gl.A0T, C25471Gl.A0G, C25471Gl.A0H};
        AnonymousClass00C.A0D(r2, 0);
        A04 = AnonymousClass02R.A0E(r2);
    }
}
