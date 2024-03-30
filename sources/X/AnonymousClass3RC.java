package X;

import android.os.Bundle;

/* renamed from: X.3RC  reason: invalid class name */
public class AnonymousClass3RC implements AnonymousClass05T {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public AnonymousClass3RC(AnonymousClass155 r1, C63093Is r2, C235718z r3, C88484Sw r4, AnonymousClass11F r5, int i) {
        this.A05 = i;
        if (i != 0) {
            this.A00 = r5;
            this.A01 = r3;
            this.A02 = r4;
            this.A03 = r2;
            this.A04 = r1;
            return;
        }
        this.A00 = r3;
        this.A01 = r1;
        this.A02 = r5;
        this.A03 = r4;
        this.A04 = r2;
    }

    public final void BYP(String str, Bundle bundle) {
        Bundle bundle2 = bundle;
        if (this.A05 != 0) {
            C235718z r4 = (C235718z) this.A01;
            C88484Sw r5 = (C88484Sw) this.A02;
            C63093Is r3 = (C63093Is) this.A03;
            C235718z.A05(bundle2, (AnonymousClass155) this.A04, r3, r4, r5, (AnonymousClass11F) this.A00);
            return;
        }
        AnonymousClass155 r2 = (AnonymousClass155) this.A01;
        C88484Sw r52 = (C88484Sw) this.A03;
        C235718z.A04(bundle2, r2, (C63093Is) this.A04, (C235718z) this.A00, r52, (AnonymousClass11F) this.A02);
    }
}
