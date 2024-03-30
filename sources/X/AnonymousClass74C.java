package X;

/* renamed from: X.74C  reason: invalid class name */
public final /* synthetic */ class AnonymousClass74C implements Runnable {
    public final /* synthetic */ AnonymousClass1Y4 A00;
    public final /* synthetic */ C146506vi A01;
    public final /* synthetic */ AnonymousClass3Ot A02;
    public final /* synthetic */ AnonymousClass3SC A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ byte[] A08;

    public /* synthetic */ AnonymousClass74C(AnonymousClass1Y4 r1, C146506vi r2, AnonymousClass3Ot r3, AnonymousClass3SC r4, byte[] bArr, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = z;
        this.A05 = z2;
        this.A02 = r3;
        this.A06 = z3;
        this.A07 = z4;
        this.A08 = bArr;
    }

    public final void run() {
        C122615v9 r7;
        C132466Tv r1;
        AnonymousClass1Y4 r2 = this.A00;
        C146506vi r12 = this.A01;
        AnonymousClass3SC r13 = this.A03;
        boolean z = this.A04;
        boolean z2 = this.A05;
        AnonymousClass3Ot r122 = this.A02;
        boolean z3 = this.A06;
        boolean z4 = this.A07;
        byte[] bArr = this.A08;
        if (r12 != null) {
            Number number = (Number) r12.A0C.A00();
            if (!r12.A04 && (number == null || number.intValue() == 0)) {
                AnonymousClass1Y4.A02(r2, r12, r13);
                if (r12.A08()) {
                    r2.A06(r12, r13, z, z2);
                    C132976Wa r3 = r12.A0N;
                    synchronized (r3) {
                        if (!r3.A0I) {
                            r3.A0B = C36381kD.A0m();
                        } else if (!r3.A0H) {
                            r3.A0B = C36371kC.A0n();
                        } else {
                            r3.A0B = C36361kB.A0j();
                        }
                    }
                    r3.A07();
                    r2.A0C.A0C(r12);
                    return;
                }
                r2.A06(r12, r13, z, z2);
                return;
            }
        }
        C65233Rg A012 = C65233Rg.A01(r2.A02, r2.A08, r2.A0I, r2.A0J, r122, r13, z3);
        AnonymousClass1D0 r6 = r2.A0C;
        C146506vi A082 = r6.A08(A012, z4);
        r2.A06(A082, r13, z, z2);
        if (!(r12 == null || (r7 = (C122615v9) r12.A0G.A00()) == null || !r7.A02)) {
            Object A002 = r12.A0A.A00();
            if (A002 != null) {
                A082.A0A.A04(A002);
            }
            A082.A0G.A04(r7);
            C132976Wa r32 = r12.A0N;
            synchronized (r32) {
                r1 = r32.A06;
            }
            if (r1 != null) {
                A082.A0N.A0A(r1);
            }
        }
        AnonymousClass1Y4.A02(r2, A082, r13);
        if (r6.A0G(A082.A03().A08, A082.A02().A0H, A082.A0O.A03.A02)) {
            A082.A05 = bArr;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(r13.A02());
        r6.A0E(A082, AnonymousClass000.A0l(r122, "; action_params: ", A0u));
    }
}
