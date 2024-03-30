package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaFrameLayout;
import com.whatsapp.WaImageView;

/* renamed from: X.8UA  reason: invalid class name */
public final class AnonymousClass8UA extends WaFrameLayout {
    public final TextEmojiLabel A00 = C36351kA.A0O(this, R.id.subtitle);
    public final TextEmojiLabel A01 = C36351kA.A0O(this, R.id.header_title);
    public final WaImageView A02 = C90474aD.A0P(this, R.id.thumbnail);

    public AnonymousClass8UA(Context context) {
        super(context, (AttributeSet) null);
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
    }

    public final TextEmojiLabel getSubTitle() {
        return this.A00;
    }

    public final WaImageView getThumbnail() {
        return this.A02;
    }

    public final TextEmojiLabel getTitle() {
        return this.A01;
    }
}
