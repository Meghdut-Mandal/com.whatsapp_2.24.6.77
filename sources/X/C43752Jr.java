package X;

/* renamed from: X.2Jr  reason: invalid class name and case insensitive filesystem */
public abstract class C43752Jr extends C70693fZ {
    public final C24801Dv A00;
    public final AnonymousClass319 A01;
    public final AnonymousClass17X A02;

    public boolean A02(AnonymousClass155 r6, AnonymousClass3T1 r7) {
        if (this instanceof C43742Jq) {
            C43742Jq r4 = (C43742Jq) this;
            AnonymousClass00C.A0D(r7, 0);
            AnonymousClass11F A0J = r7.A0J();
            if (A0J == null) {
                return false;
            }
            C66033Uk.A00(r6, r4.A02.A02(A0J, C64933Qa.A03(r7)), new C86814Mj(r6, r4, r7, r4.A00.A0P(A0J)), 17);
            return true;
        }
        AnonymousClass11F A0J2 = r7.A0J();
        if (A0J2 == null) {
            return false;
        }
        C66033Uk.A00(r6, this.A02.A02(A0J2, C64933Qa.A03(r7)), new C86814Mj(r6, this, r7, false), 17);
        return true;
    }

    public C43752Jr(C24801Dv r1, AnonymousClass319 r2, AnonymousClass17X r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public boolean BBr() {
        return true;
    }
}
