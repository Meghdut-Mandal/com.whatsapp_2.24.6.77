package X;

/* renamed from: X.4WA  reason: invalid class name */
public class AnonymousClass4WA extends C34711hW {
    public Object A00;
    public final int A01;

    public AnonymousClass4WA(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00(AnonymousClass6X6 r3, AnonymousClass147 r4) {
        if (2 - this.A01 != 0) {
            super.A00(r3, r4);
            return;
        }
        AnonymousClass00C.A0D(r4, 0);
        AnonymousClass3OF.A00((AnonymousClass3OF) this.A00, C36411kG.A15(r4));
    }

    public void A01(AnonymousClass147 r4) {
        switch (this.A01) {
            case 0:
                C39951uL r1 = (C39951uL) this.A00;
                if (r4.equals(r1.A01)) {
                    r1.A0T();
                    return;
                }
                return;
            case 1:
                C39811tr r2 = (C39811tr) this.A00;
                if (r4.equals(r2.A0D)) {
                    C80253v6.A01(r2.A0M, r2, 0);
                    return;
                }
                return;
            default:
                super.A01(r4);
                return;
        }
    }
}
