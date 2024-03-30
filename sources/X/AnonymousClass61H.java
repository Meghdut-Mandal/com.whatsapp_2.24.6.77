package X;

/* renamed from: X.61H  reason: invalid class name */
public final /* synthetic */ class AnonymousClass61H {
    public final /* synthetic */ AnonymousClass5NR A00;

    public /* synthetic */ AnonymousClass61H(AnonymousClass5NR r1) {
        this.A00 = r1;
    }

    public final void A00(String str, boolean z, int i) {
        AnonymousClass5NR r3 = this.A00;
        boolean z2 = false;
        if (i == 1) {
            AnonymousClass5NR.A02(r3, C36371kC.A0p(), str, "download_failed", z);
        } else if (i == 2) {
            AnonymousClass5NI r0 = r3.A0D;
            if (r0 != null) {
                r0.setPlayControlVisibility(0);
            }
            r3.A0D();
            r3.A0C();
        }
        AnonymousClass5NU r32 = r3.A0V;
        if (i == 1) {
            z2 = true;
        }
        r32.A03 = str;
        AnonymousClass6D2 r2 = r32.A01;
        if (r2 != null && r32.A04 != z2) {
            int i2 = r32.A00;
            if (z2) {
                if (i2 == 2) {
                    r2.A02(str);
                }
            } else if (i2 == 2) {
                r2.A01();
            }
            r32.A04 = z2;
        }
    }
}
