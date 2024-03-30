package X;

/* renamed from: X.2rq  reason: invalid class name and case insensitive filesystem */
public class C53762rq implements AnonymousClass1IX {
    public Object A00;
    public Object A01;
    public final int A02;

    public C53762rq(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void Bis() {
        if (this.A02 == 0) {
            ((C79593ty) this.A01).A0C(C36381kD.A0j());
        }
    }

    public void Bit() {
        C79593ty r1;
        boolean A0m;
        if (this.A02 == 0) {
            C608539p r12 = (C608539p) this.A00;
            AnonymousClass1IT r8 = r12.A04;
            long A0A = C36371kC.A0A(r8.A01("critical_block"));
            r8.A01("critical_unblock_low");
            if (r8.A06("critical_block") && A0A >= 1) {
                C36341k9.A0v(C19980wp.A00(r12.A03).edit(), "companion_syncd_critical_bootstrap_state", 2);
            }
            if (r8.A06("critical_block") && A0A >= 1 && r8.A06("critical_unblock_low")) {
                r1 = (C79593ty) this.A01;
                A0m = C36371kC.A0m();
            } else {
                return;
            }
        } else if (AnonymousClass1AC.A04(((C20260xH) this.A00).A0c, "sentinel", true).isEmpty()) {
            r1 = (C79593ty) this.A01;
            A0m = true;
        } else {
            return;
        }
        r1.A0C(A0m);
    }
}
