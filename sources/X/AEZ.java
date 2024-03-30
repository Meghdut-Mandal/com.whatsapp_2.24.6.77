package X;

public final class AEZ implements B1M {
    public final /* synthetic */ C198199d4 A00;
    public final /* synthetic */ AnonymousClass2bZ A01;
    public final /* synthetic */ String A02;

    public AEZ(C198199d4 r1, AnonymousClass2bZ r2, String str) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = str;
    }

    public void BWg(C202059ky r5) {
        C198199d4 r3 = this.A00;
        C24611Dc r2 = r3.A04;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Error fetching checkout session for ");
        r2.A05(AnonymousClass000.A0q(this.A01.A1J.A01, A0u));
        C183358qf r0 = r3.A05;
        String str = this.A02;
        r0.A0A(str);
        C198199d4.A00(r5, r3, (C186238vd) null, str);
    }

    public void BfF(C186238vd r5) {
        C198199d4 r3 = this.A00;
        C24611Dc r2 = r3.A04;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Caching checkout session for ");
        r2.A07(AnonymousClass000.A0q(this.A01.A1J.A01, A0u));
        C183358qf r22 = r3.A05;
        String str = this.A02;
        r22.A09(r5, str, "UPI");
        C198199d4.A00((C202059ky) null, r3, r5, str);
    }
}
