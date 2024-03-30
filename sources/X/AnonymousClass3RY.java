package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;

/* renamed from: X.3RY  reason: invalid class name */
public final class AnonymousClass3RY {
    public final C63193Jc A00;

    public AnonymousClass3RY(C63193Jc r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public static final void A00(Context context, Drawable drawable, TextEmojiLabel textEmojiLabel, C87184Nu r7, AnonymousClass3P8 r8) {
        r8.A04 = true;
        textEmojiLabel.setSelected(true);
        AnonymousClass2IR r2 = ((C70553fL) r7).A00;
        AnonymousClass3T1 fMessage = r2.getFMessage();
        AnonymousClass4V7 A02 = AnonymousClass3SS.A02(r2);
        if (A02 != null) {
            A02.Bpv(fMessage, r8);
            C80403vL.A01(r2.A21, r2, fMessage, r8, 3);
            r2.A1q.A00(fMessage, "quick-reply", String.valueOf(r8.A05));
        } else {
            Log.e("ConversationRow/onQuickReplyButtonClicked/error: not click in Conversation");
        }
        AnonymousClass076.A06(drawable, AnonymousClass00F.A00(context, R.color.f6nameremoved));
    }

    public static final void A01(Context context, Drawable drawable, TextEmojiLabel textEmojiLabel, AnonymousClass3P8 r8) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        textEmojiLabel.setText(C37351mE.A00(textEmojiLabel.getPaint(), drawable, r8.A08, dimensionPixelSize, context.getResources().getInteger(R.integer.f8nameremoved)));
    }
}
