package X;

/* renamed from: X.3tG  reason: invalid class name and case insensitive filesystem */
public class C79153tG implements AnonymousClass4UX {
    public final /* synthetic */ C39471sS A00;

    public long BIK() {
        return 3000;
    }

    public C79153tG(C39471sS r1) {
        this.A00 = r1;
    }

    public void Baz(AnonymousClass3T1 r4) {
        C39471sS r0 = this.A00;
        String str = r0.A06;
        AnonymousClass389 r1 = r0.A02;
        if (r1 != null && str != null && str.equals(r1.A02)) {
            r1.A00 = r4;
        }
    }

    public void Bb0(AnonymousClass3T1 r6) {
        C39471sS r4 = this.A00;
        AnonymousClass389 r3 = r4.A02;
        if (r3 != null && r3.A00 == r6) {
            r4.A0F.A0C(r3.A01);
            r4.A02 = null;
        }
    }

    public boolean Bt3() {
        C39471sS r1 = this.A00;
        AnonymousClass3L1 r0 = r1.A04;
        if (r0 == null || r0.A01() || r1.A00 != 3) {
            return false;
        }
        return true;
    }
}
