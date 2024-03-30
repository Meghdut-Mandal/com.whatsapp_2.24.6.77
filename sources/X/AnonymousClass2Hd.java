package X;

import android.content.Context;
import android.text.Html;
import android.text.SpannableString;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.2Hd  reason: invalid class name */
public class AnonymousClass2Hd extends AnonymousClass2IR {
    public int getBubbleAlpha() {
        return 153;
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    public AnonymousClass2Hd(Context context, C89004Uw r7, AnonymousClass2c0 r8, C20380xT r9) {
        super(context, r7, r8);
        TextEmojiLabel A0P = C36401kF.A0P(this, R.id.message_text);
        C36331k8.A1A(this.A0G, A0P);
        C36361kB.A19(A0P);
        SpannableString valueOf = SpannableString.valueOf(Html.fromHtml(C36351kA.A0w(getContext(), r9.A05("835452491239734"), 1, R.string.f12nameremoved)));
        A1l(valueOf);
        C36331k8.A16(A0P, this.A0D);
        A0P.setText(valueOf);
        this.A0M.A01(r8, 2);
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
