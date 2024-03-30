package X;

import android.util.Pair;
import android.util.TypedValue;
import com.whatsapp.R;
import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.3Fk  reason: invalid class name and case insensitive filesystem */
public class C62253Fk {
    public final /* synthetic */ MessageReplyActivity A00;

    public C62253Fk(MessageReplyActivity messageReplyActivity) {
        this.A00 = messageReplyActivity;
    }

    public void A00(File file) {
        MessageReplyActivity messageReplyActivity = this.A00;
        if (C36381kD.A1X(messageReplyActivity)) {
            HashMap hashMap = MessageReplyActivity.A1g;
            if (messageReplyActivity.A0t.A01()) {
                int applyDimension = (int) TypedValue.applyDimension(1, 28.0f, C36341k9.A0F(messageReplyActivity.A04).getDisplayMetrics());
                MessageReplyActivity.A0L(AnonymousClass6Y8.A09(new C130396Kx(applyDimension, applyDimension), file).A02, messageReplyActivity);
            }
        }
    }

    public void A01(List list) {
        MessageReplyActivity messageReplyActivity = this.A00;
        if (C36381kD.A1X(messageReplyActivity)) {
            HashMap hashMap = MessageReplyActivity.A1g;
            if (!messageReplyActivity.A0t.A01()) {
                return;
            }
            if (list.size() != 6) {
                Log.e("MessageReplyActivity/setStatusReactionsAvatarList/invalid avatar reaction list size");
                return;
            }
            for (Pair pair : C56802wu.A00) {
                int A04 = C36381kD.A04(pair);
                C55442ud r1 = (C55442ud) list.get(C36381kD.A03(pair));
                StickerView stickerView = (StickerView) C012005e.A02(messageReplyActivity.A04, A04);
                if (r1 instanceof C47462eo) {
                    Log.e("MessageReplyActivity/setAvatar/AvatarReactionData returned Error");
                } else if (!(r1 instanceof C47482eq)) {
                    if (r1 instanceof C47472ep) {
                        C135066c4 r7 = ((C47472ep) r1).A00;
                        messageReplyActivity.A10.A09(stickerView, r7, new C90154Zh(stickerView, 0), r7.A03, r7.A02, true, false);
                        stickerView.setOnClickListener(new AnonymousClass3YI(new AnonymousClass3YM(messageReplyActivity, stickerView, r7, 26), messageReplyActivity.A07));
                    }
                }
                stickerView.setImageResource(R.drawable.sticker_loading_indicator);
            }
        }
    }
}
