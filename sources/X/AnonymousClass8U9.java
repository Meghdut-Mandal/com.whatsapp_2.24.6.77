package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaFrameLayout;

/* renamed from: X.8U9  reason: invalid class name */
public final class AnonymousClass8U9 extends WaFrameLayout {
    public final TextEmojiLabel A00 = C36351kA.A0O(this, R.id.subtitle);
    public final TextEmojiLabel A01 = C36351kA.A0O(this, R.id.header_title);

    public AnonymousClass8U9(Context context) {
        super(context, (AttributeSet) null, 0);
        C36351kA.A0C(this).inflate(R.layout.f9nameremoved, this, true);
    }

    public final TextEmojiLabel getSubTitle() {
        return this.A00;
    }

    public final TextEmojiLabel getTitle() {
        return this.A01;
    }
}
