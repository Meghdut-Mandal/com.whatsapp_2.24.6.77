package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.8ZK  reason: invalid class name */
public final class AnonymousClass8ZK extends C175078Zo {
    public boolean A00;

    public void setFMessage(AnonymousClass3T1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        C18740tg.A0C(r2 instanceof AnonymousClass2bP);
        this.A0K = r2;
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
        }
    }

    public AnonymousClass2bP getFMessage() {
        AnonymousClass3T1 r1 = this.A0K;
        AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type com.whatsapp.newsletter.fmessage.FMessageNewsletterAdminInvite");
        return (AnonymousClass2bP) r1;
    }

    public View.OnClickListener getOnActionClickListener() {
        return new C48742hy(this, 9);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8ZK(Context context, C89004Uw r2, AnonymousClass2bP r3) {
        super(context, r2, r3);
        C36321k7.A0x(context, r3);
        A16();
    }

    public void A2D() {
        super.A2D();
        this.A09.setText(getFMessage().A03);
        this.A08.setText(R.string.f12nameremoved);
        this.A07.setText(R.string.f12nameremoved);
    }

    public String getInviteCaption() {
        return getFMessage().A02;
    }
}
