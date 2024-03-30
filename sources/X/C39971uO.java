package X;

import java.util.Objects;

/* renamed from: X.1uO  reason: invalid class name and case insensitive filesystem */
public class C39971uO extends AnonymousClass04R {
    public final AnonymousClass08S A00;
    public final C28201Rs A01;
    public final C28201Rs A02 = new C28201Rs(false);
    public final C28201Rs A03 = new C28201Rs(false);
    public final C603937r A04;
    public final AnonymousClass147 A05;

    public static void A01(C39971uO r2, int i) {
        C28201Rs r0;
        C36341k9.A19(r2.A03, false);
        int i2 = 2;
        if (i == 0) {
            r0 = r2.A01;
        } else if (i == 1) {
            r0 = r2.A01;
            i2 = 3;
        } else if (i == 2) {
            r0 = r2.A01;
            i2 = 4;
        } else {
            return;
        }
        C36341k9.A17(r0, i2);
    }

    public void A0S() {
        C36331k8.A13(this.A03);
        C603937r r8 = this.A04;
        AnonymousClass147 r4 = this.A05;
        C81323wp r10 = new C81323wp((Object) this, 26);
        C89854Yd r6 = new C89854Yd(this, 0);
        C89854Yd r5 = new C89854Yd(this, 1);
        C89854Yd r7 = new C89854Yd(this, 1);
        AnonymousClass00C.A0D(r4, 0);
        AnonymousClass19A r11 = r8.A03;
        String A09 = r11.A09();
        C186018vH r9 = new C186018vH((C16420pD) new C50622lD(C023409w.A00, C36371kC.A11(new C185648uZ(new C50632lE(r4, 0)))), A09);
        C203399nx r13 = r9.A00;
        AnonymousClass00C.A08(r13);
        r11.A0E(new AI4(r5, r6, r7, r8, r9, r10), r13, A09, 16, AnonymousClass6X5.A0L);
    }

    public C39971uO(C603937r r5, AnonymousClass147 r6) {
        C28201Rs r3 = new C28201Rs(0);
        this.A01 = r3;
        AnonymousClass08S A0Y = C36441kJ.A0Y();
        this.A00 = A0Y;
        this.A04 = r5;
        this.A05 = r6;
        Objects.requireNonNull(A0Y);
        A0Y.A0F(r3, new C55422ub(A0Y, 26));
    }
}
