package X;

import android.content.Context;
import android.text.Html;
import android.text.SpannableString;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.2Hc  reason: invalid class name and case insensitive filesystem */
public final class C43342Hc extends AnonymousClass2IR {
    public int getBubbleAlpha() {
        return 153;
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    public C43342Hc(Context context, C89004Uw r8, AnonymousClass2c2 r9, C20380xT r10) {
        super(context, r8, r9);
        TextEmojiLabel A0P = C36401kF.A0P(this, R.id.message_text);
        C36331k8.A1A(this.A0G, A0P);
        C36361kB.A19(A0P);
        SpannableString valueOf = SpannableString.valueOf(Html.fromHtml(C36351kA.A0w(getContext(), r10.A05("26000015"), 1, R.string.f12nameremoved)));
        A1l(valueOf);
        C36331k8.A16(A0P, this.A0D);
        A0P.setText(valueOf);
        C36321k7.A0q(this.A1B, "decryption_failure_views", C36341k9.A0E(this.A1B).getInt("decryption_failure_views", 0) + 1);
        this.A0M.A01(r9, 2);
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
