package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.8ZL  reason: invalid class name */
public class AnonymousClass8ZL extends C175078Zo {
    public AnonymousClass1EM A00;
    public boolean A01;

    public void A16() {
        if (!this.A01) {
            this.A01 = true;
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
            this.A00 = C36371kC.A0l(r4);
        }
    }

    public AnonymousClass2bQ getFMessage() {
        return (AnonymousClass2bQ) this.A0K;
    }

    public String getInviteCaption() {
        return ((AnonymousClass2bQ) this.A0K).A04;
    }

    public View.OnClickListener getOnActionClickListener() {
        return new C48812i6(this.A0K, this, 42);
    }

    public void setFMessage(AnonymousClass3T1 r2) {
        C18740tg.A0C(r2 instanceof AnonymousClass2bQ);
        this.A0K = r2;
    }

    public AnonymousClass8ZL(Context context, C89004Uw r2, AnonymousClass2bQ r3) {
        super(context, r2, r3);
        A16();
    }

    public void A2D() {
        super.A2D();
        AnonymousClass2bQ r3 = (AnonymousClass2bQ) this.A0K;
        String str = r3.A05;
        if (AnonymousClass3M0.A01(this.A0G, str)) {
            this.A09.setText(R.string.f12nameremoved);
            this.A08.setVisibility(8);
        } else {
            this.A09.setText(str);
        }
        boolean A03 = this.A00.A03(r3.A00);
        TextEmojiLabel textEmojiLabel = this.A08;
        int i = R.string.f12nameremoved;
        if (A03) {
            i = R.string.f12nameremoved;
        }
        textEmojiLabel.setText(i);
        TextEmojiLabel textEmojiLabel2 = this.A07;
        boolean z = r3.A1J.A02;
        int i2 = R.string.f12nameremoved;
        if (z) {
            i2 = R.string.f12nameremoved;
        }
        textEmojiLabel2.setText(i2);
    }
}
