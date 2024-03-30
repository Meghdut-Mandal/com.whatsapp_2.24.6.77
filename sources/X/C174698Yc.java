package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.8Yc  reason: invalid class name and case insensitive filesystem */
public final class C174698Yc extends AnonymousClass2IR {
    public boolean A00;
    public final TextEmojiLabel A01 = C36401kF.A0P(this, R.id.message_text);
    public final String A02;

    public int A1Q(int i) {
        return 0;
    }

    public int A1R(int i) {
        return 0;
    }

    public int getBubbleAlpha() {
        return 191;
    }

    public int getUserNameInGroupLayoutOption() {
        return 3;
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

    public void A2D() {
        TextEmojiLabel textEmojiLabel = this.A01;
        textEmojiLabel.setText(this.A02);
        C36331k8.A0r(getContext(), textEmojiLabel, R.color.f6nameremoved);
        textEmojiLabel.setTypeface(textEmojiLabel.getTypeface(), 2);
        textEmojiLabel.setAutoLinkMask(0);
        textEmojiLabel.setLinksClickable(false);
        textEmojiLabel.setFocusable(false);
        textEmojiLabel.setClickable(false);
        textEmojiLabel.setLongClickable(false);
    }

    public C174698Yc(Context context, C89004Uw r5, C46982bz r6) {
        super(context, r5, r6);
        A16();
        StringBuilder A0u = AnonymousClass000.A0u();
        String str = C19430v1.A09;
        A0u.append(str);
        this.A02 = AnonymousClass000.A0p(context.getString(R.string.f12nameremoved), str, A0u);
        A2D();
    }

    public boolean A1E() {
        return C175108Zr.A15(this);
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, getFMessage());
        super.A22(r2, z);
        if (z || A1W) {
            A2D();
        }
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
