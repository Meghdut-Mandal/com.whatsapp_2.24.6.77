package X;

import java.util.List;

/* renamed from: X.3o5  reason: invalid class name and case insensitive filesystem */
public final class C75953o5 implements B1B {
    public final /* synthetic */ C28981Uw A00;
    public final /* synthetic */ AnonymousClass2EJ A01;

    public void Bcb(List list) {
    }

    public C75953o5(C28981Uw r1, AnonymousClass2EJ r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BQu(int i) {
        C44072La r4;
        AnonymousClass2EJ r3 = this.A01;
        C36341k9.A17(r3.A05, i);
        C28981Uw r5 = this.A00;
        C65073Qp A09 = r3.A0D.A09(r3.A01.A0H, false);
        if (A09 instanceof C44072La) {
            r4 = (C44072La) A09;
        } else {
            r4 = null;
        }
        if (r4 == null) {
            C36341k9.A19(r3.A09, true);
            return;
        }
        r3.A00 = r4;
        if (AnonymousClass00C.A0J(r4.A0J(), r5)) {
            C44072La r0 = r3.A00;
            if (r0 == null) {
                throw C36331k8.A0d("newsletterInfo");
            } else if (r0.A0O() && r3.A0G.A00.A0E(7245)) {
                C44072La r1 = r3.A00;
                if (r1 == null) {
                    throw C36331k8.A0d("newsletterInfo");
                } else if (i != r1.A00) {
                    r1.A00 = i;
                    C30131Zi r52 = r3.A0H;
                    C28981Uw A0J = r1.A0J();
                    C44072La r02 = r3.A00;
                    if (r02 == null) {
                        throw C36331k8.A0d("newsletterInfo");
                    }
                    int i2 = r02.A00;
                    AnonymousClass00C.A0D(A0J, 0);
                    r52.A0S.Boy(new C35261iP((Object) r52, i2, 31, (Object) A0J));
                }
            }
        }
    }
}
