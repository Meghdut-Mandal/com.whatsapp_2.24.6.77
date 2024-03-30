package X;

import android.content.Context;

/* renamed from: X.8ZF  reason: invalid class name */
public class AnonymousClass8ZF extends AnonymousClass2IB {
    public boolean A00;

    public boolean A1E() {
        return false;
    }

    public String getGroupRoleTitle() {
        return null;
    }

    public void A16() {
        if (!this.A00) {
            this.A00 = true;
            C27861Qc A0n = C175108Zr.A0n(this);
            C18800tq r4 = A0n.A0M;
            C27111My A0m = C175108Zr.A0m(r4, A0n, this);
            C18830tt r2 = r4.A00;
            C175108Zr.A0y(r4, r2, r2, this);
            C175108Zr.A11(r4, this);
            C175108Zr.A14(r4, this, C165597tg.A0h(r4));
            C175108Zr.A12(r4, this);
            C175108Zr.A10(r4, r2, this, C175108Zr.A0q(r4));
            C175108Zr.A13(r4, this);
            C19470v6 A0k = C175108Zr.A0k(A0m, r4, r2, this, C165577te.A0U(r4));
            C175108Zr.A0v(A0k, r4, r2, this, C175108Zr.A0o(r4, this));
            C175108Zr.A0w(A0m, r4, r2, this);
            C175108Zr.A0z(r4, r2, A0n, this, C175108Zr.A0p(r2));
            C175108Zr.A0x(A0m, A0n, this);
            C175108Zr.A0u(A0k, r4, r2, A0n, this);
            AnonymousClass8ZJ.A0Y(A0k, r4, r2, this);
            AnonymousClass8ZJ.A0g(r4, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8ZF(Context context, C89004Uw r2, C46882bp r3) {
        super(context, r2, r3);
        C36321k7.A0x(context, r3);
        A16();
    }

    public C89014Ux getRowCustomizer() {
        C89004Uw r0;
        if (!C197029b1.A00(getFMessage().A1J.A00) && (r0 = this.A0c) != null && r0.getContainerType() == 0) {
            return this.A0C.A05;
        }
        C89014Ux rowCustomizer = super.getRowCustomizer();
        AnonymousClass00C.A08(rowCustomizer);
        return rowCustomizer;
    }
}
