package X;

/* renamed from: X.3dU  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C69413dU implements C158007fe {
    public final /* synthetic */ C159967kF A00;
    public final /* synthetic */ C102264ze A01;
    public final /* synthetic */ C88374Sl A02;

    public /* synthetic */ C69413dU(C159967kF r1, C102264ze r2, C88374Sl r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void Bdy(long j) {
        AnonymousClass367 r0;
        String str;
        String str2;
        C159967kF r1 = this.A00;
        C102264ze r3 = this.A01;
        C88374Sl r4 = this.A02;
        AnonymousClass00C.A0D(r1, 0);
        C36321k7.A0x(r3, r4);
        int i = r3.A05;
        if (i == -1) {
            i = r3.A04;
        }
        C207269up BGG = r1.BGG(i);
        AnonymousClass4PF r12 = r3.A01;
        String str3 = null;
        if (r12 != null) {
            int i2 = r3.A05;
            if (i2 == -1) {
                i2 = r3.A04;
            }
            r0 = r12.B9s(i2);
        } else {
            r0 = null;
        }
        int i3 = r3.A05;
        if (i3 == -1) {
            i3 = r3.A04;
        }
        if (r0 != null) {
            str3 = r0.A01;
            str = r0.A02;
            str2 = r0.A00;
        } else {
            str = null;
            str2 = null;
        }
        r4.Bdz(BGG, str3, str, str2, i3, j);
    }
}
