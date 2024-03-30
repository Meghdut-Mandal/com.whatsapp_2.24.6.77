package X;

import android.content.Context;
import android.text.Html;
import android.text.SpannableString;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.8Ya  reason: invalid class name and case insensitive filesystem */
public class C174678Ya extends AnonymousClass2IR {
    public boolean A00;

    public int getUserNameInGroupLayoutOption() {
        return 0;
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

    public C174678Ya(Context context, C89004Uw r5, AnonymousClass2c1 r6) {
        super(context, r5, r6);
        A16();
        SpannableString valueOf = SpannableString.valueOf(Html.fromHtml(C36321k7.A0A(getContext(), this.A0G.A09(7550), R.string.f12nameremoved)));
        A1l(valueOf);
        TextEmojiLabel A0P = C36401kF.A0P(this, R.id.message_text);
        A0P.setText(valueOf);
        C36331k8.A1A(this.A0G, A0P);
    }

    public int getCenteredLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }
}
