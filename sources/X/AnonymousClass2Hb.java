package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.2Hb  reason: invalid class name */
public final class AnonymousClass2Hb extends AnonymousClass2IR {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2Hb(Context context, C89004Uw r8, AnonymousClass2c4 r9) {
        super(context, r8, r9);
        C36321k7.A0v(context, 1, r9);
        TextEmojiLabel A0P = C36401kF.A0P(this, R.id.message_text);
        C36331k8.A1A(this.A0G, A0P);
        C36361kB.A19(A0P);
        C36331k8.A16(A0P, this.A0D);
        C36341k9.A0s(getContext(), A0P, new Object[]{r9.A00}, R.string.f12nameremoved);
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
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
