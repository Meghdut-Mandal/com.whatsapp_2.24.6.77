package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.96O  reason: invalid class name */
public abstract class AnonymousClass96O {
    public static final AnonymousClass9XV A00(View view) {
        TextEmojiLabel A0R = C36361kB.A0R(view, R.id.quoted_title);
        TextEmojiLabel A0R2 = C36361kB.A0R(view, R.id.quoted_text);
        TextEmojiLabel A0R3 = C36361kB.A0R(view, R.id.quoted_sub_text);
        ImageView A0M = C36361kB.A0M(view, R.id.quoted_thumb);
        ImageView A0M2 = C36361kB.A0M(view, R.id.quoted_payment_amount_expressive_background);
        TextView textView = (TextView) C36361kB.A0F(view, R.id.quoted_bullet_divider);
        TextEmojiLabel A0R4 = C36361kB.A0R(view, R.id.quoted_subtitle);
        return new AnonymousClass9XV(C36361kB.A0F(view, R.id.quoted_color), C36361kB.A0F(view, R.id.quoted_payment_amount_container), A0M, A0M2, C36361kB.A0M(view, R.id.contact_photo), (TextView) C36361kB.A0F(view, R.id.quoted_payment_amount_text), textView, A0R, A0R2, A0R3, A0R4, (StickerView) C36361kB.A0F(view, R.id.quoted_sticker));
    }
}
