package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.2IK  reason: invalid class name */
public class AnonymousClass2IK extends AnonymousClass8YY {
    public final TextEmojiLabel A00 = C36401kF.A0P(this, R.id.message_text);

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    public void A2D() {
        TextEmojiLabel textEmojiLabel = this.A00;
        textEmojiLabel.setText(getMessageString());
        C36321k7.A0r(this.A0G, textEmojiLabel);
        if (this.A0d.BLu(getFMessage())) {
            View view = this.A0b;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = -1;
            view.setLayoutParams(layoutParams);
        }
    }

    public AnonymousClass2IK(Context context, C89004Uw r3, AnonymousClass2bO r4) {
        super(context, r3, r4);
        A2D();
    }

    public int A1Q(int i) {
        if (!C37541mm.A06(this)) {
            return 0;
        }
        return R.drawable.message_unsent;
    }

    public int A1R(int i) {
        if (!C37541mm.A06(this)) {
            return 0;
        }
        return R.color.f6nameremoved;
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

    public String getMessageString() {
        int i;
        boolean A04 = C64933Qa.A04(getFMessage());
        if (C37541mm.A06(this)) {
            i = R.string.f12nameremoved;
            if (A04) {
                i = R.string.f12nameremoved;
            }
        } else {
            i = R.string.f12nameremoved;
            if (A04) {
                i = R.string.f12nameremoved;
            }
        }
        return C36381kD.A0t(this, i);
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }
}
