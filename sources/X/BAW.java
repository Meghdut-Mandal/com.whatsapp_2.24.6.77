package X;

public class BAW implements C22963AzF {
    public Object A00;
    public Object A01;
    public final int A02;

    public BAW(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void Bf8(C202059ky r6) {
        C19770wU r4;
        int i;
        C202319lY r2;
        int i2 = this.A02;
        C167687yZ r3 = (C167687yZ) this.A00;
        Object obj = this.A01;
        if (i2 != 0) {
            if (r6 == null) {
                r4 = r3.A0M;
                i = 13;
                r2 = obj;
            }
            AnonymousClass9OX r1 = new AnonymousClass9OX(2);
            r1.A06 = r6;
            r3.A09.A0D(r1);
            return;
        }
        C202319lY r22 = (C202319lY) obj;
        if (r6 != null) {
            AnonymousClass9IK.A01(r3.A01);
            AnonymousClass9OX r12 = new AnonymousClass9OX(2);
            r12.A06 = r6;
            r3.A09.A0D(r12);
            return;
        }
        C175928bI r0 = (C175928bI) r22.A0A;
        C18740tg.A06(r0);
        C201599jw r02 = r0.A0G;
        C18740tg.A06(r02);
        C201459je r13 = r02.A0C;
        r13.A08 = "ACCEPT";
        r13.A09 = "PENDING";
        r4 = r3.A0M;
        i = 12;
        r2 = r22;
        r4.Boy(new C1498072v(r3, r2, i));
    }
}
