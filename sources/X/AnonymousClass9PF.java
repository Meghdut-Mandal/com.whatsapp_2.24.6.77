package X;

/* renamed from: X.9PF  reason: invalid class name */
public class AnonymousClass9PF {
    public final /* synthetic */ A2E A00;

    public AnonymousClass9PF(A2E a2e) {
        this.A00 = a2e;
    }

    public void A00(C197979ch r5) {
        AnonymousClass9WY r0;
        if (r5.A04 == null && r5.A01 == null) {
            A2E a2e = this.A00;
            a2e.A08 = C36381kD.A0j();
            a2e.A06 = new C21829Ab6("Could not retrieve data from photo processor.");
            r0 = a2e.A02;
        } else {
            A2E a2e2 = this.A00;
            a2e2.A08 = C36371kC.A0m();
            a2e2.A07 = r5;
            if (a2e2.A04) {
                AnonymousClass9QP r2 = a2e2.A01;
                if (r2.A01[((r2.A00 + 3) - 1) % 3] == null) {
                    return;
                }
            }
            r0 = a2e2.A02;
        }
        r0.A01();
    }
}
