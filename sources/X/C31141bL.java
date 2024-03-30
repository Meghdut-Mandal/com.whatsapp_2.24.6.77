package X;

import com.whatsapp.calling.telecom.SelfManagedConnectionService;

/* renamed from: X.1bL  reason: invalid class name and case insensitive filesystem */
public final class C31141bL extends C31131bK {
    public AnonymousClass004 A00;
    public AnonymousClass004 A01;
    public AnonymousClass004 A02;
    public AnonymousClass004 A03;
    public AnonymousClass004 A04;
    public final C18800tq A05;
    public final C31141bL A06 = this;

    public C31141bL(C18800tq r1) {
        this.A05 = r1;
        A01();
    }

    public static C61533Ci A00(C31141bL r2) {
        return new C61533Ci((C19630wG) r2.A05.A91.get());
    }

    private void A01() {
        this.A04 = new C31151bM(this.A06, this.A05, 0);
        this.A00 = C19530w6.A00(new C31151bM(this.A06, this.A05, 1));
        this.A01 = C19530w6.A00(new C31151bM(this.A06, this.A05, 2));
        this.A02 = C19530w6.A00(new C31151bM(this.A06, this.A05, 3));
        this.A03 = new C31151bM(this.A06, this.A05, 4);
    }

    private void A02(SelfManagedConnectionService selfManagedConnectionService) {
        A03(selfManagedConnectionService, (C27671Pf) this.A05.A7a.get());
    }

    public void A04(SelfManagedConnectionService selfManagedConnectionService) {
        A02(selfManagedConnectionService);
    }

    public static void A03(SelfManagedConnectionService selfManagedConnectionService, C27671Pf r1) {
        selfManagedConnectionService.A00 = r1;
    }
}
