package X;

import android.app.Activity;

/* renamed from: X.2Vl  reason: invalid class name and case insensitive filesystem */
public final class C46202Vl extends C75173mn {
    public final /* synthetic */ C70803fk A00;
    public final /* synthetic */ AnonymousClass2K2 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46202Vl(C70803fk r8, AnonymousClass2K2 r9, C19970wo r10, C24381Cf r11, C20310xM r12, C20350xQ r13, AnonymousClass3B9 r14, C238019x r15) {
        super(r10, r11, r12, r13, r14, r15);
        this.A00 = r8;
        this.A01 = r9;
    }

    public void BiP(AnonymousClass39E r9, AnonymousClass147 r10) {
        AnonymousClass147 r5 = r10;
        C36321k7.A0w(r10, r9);
        Activity A0D = C36441kJ.A0D(AnonymousClass001.A0F(C70803fk.A0C(this.A00)));
        if (A0D != null && !A0D.isFinishing()) {
            super.BiP(r9, r10);
            String A002 = C54452sy.A00(A0D, r9);
            AnonymousClass2K2 r4 = this.A01;
            r4.A01.A0H(new C1502774q(this, A0D, r4, r5, A002, 5));
        }
    }

    public void Bj9() {
        super.Bj9();
        Activity A0D = C36441kJ.A0D(AnonymousClass001.A0F(C70803fk.A0C(this.A00)));
        if (A0D != null && !A0D.isFinishing()) {
            this.A01.A01.A0H(new C80283v9(this, A0D, 45));
        }
    }
}
