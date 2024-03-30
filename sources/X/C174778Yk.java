package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.8Yk  reason: invalid class name and case insensitive filesystem */
public class C174778Yk extends AnonymousClass2IR {
    public TextEmojiLabel A00;
    public boolean A01;

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    private void A0C() {
        if (((AnonymousClass2cT) this.A0K).A00 != null) {
            TextEmojiLabel textEmojiLabel = this.A00;
            textEmojiLabel.setText(A0B(getContext(), textEmojiLabel.getPaint(), ((AnonymousClass2cT) this.A0K).A00.A04, C36401kF.A1X(this.A0E)));
        }
    }

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
        }
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, this.A0K);
        super.A22(r2, z);
        if (z || A1W) {
            A0C();
        }
    }

    public AnonymousClass2cT getFMessage() {
        return (AnonymousClass2cT) this.A0K;
    }

    public void setFMessage(AnonymousClass3T1 r2) {
        C18740tg.A0C(r2 instanceof AnonymousClass2cT);
        this.A0K = r2;
    }

    public C174778Yk(Context context, C89004Uw r4, AnonymousClass2cT r5) {
        super(context, r4, r5);
        A16();
        TextEmojiLabel A0O = C36401kF.A0O(this, R.id.message_text);
        this.A00 = A0O;
        C36331k8.A1A(this.A0G, A0O);
        this.A00.setAutoLinkMask(0);
        this.A00.setLinksClickable(false);
        this.A00.setFocusable(false);
        this.A00.setClickable(false);
        this.A00.setLongClickable(false);
        this.A00.setTextColor(getSecondaryTextColor());
        A0C();
    }

    public static SpannableStringBuilder A0B(Context context, Paint paint, String str, boolean z) {
        Drawable A02;
        int length;
        int i;
        SpannableStringBuilder A0P;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        if (z) {
            A02 = AnonymousClass3UF.A02(context, R.drawable.vec_flows_termination_check_icon, R.color.f6nameremoved);
            i = 0;
            length = 1;
            A0P = C36441kJ.A0P(AnonymousClass000.A0l(str, "  ", AnonymousClass000.A0u()));
        } else {
            String A0q = AnonymousClass000.A0q("  ", AnonymousClass000.A0v(str));
            A02 = AnonymousClass3UF.A02(context, R.drawable.vec_flows_termination_check_icon, R.color.f6nameremoved);
            length = A0q.length();
            i = length - 1;
            A0P = C36441kJ.A0P(A0q);
        }
        C37351mE.A03(paint, A02, A0P, dimensionPixelSize, i, length);
        return A0P;
    }

    public void A1Y() {
        A0C();
        super.A1Y();
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
