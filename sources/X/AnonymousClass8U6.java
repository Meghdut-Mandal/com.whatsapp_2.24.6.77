package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaFrameLayout;
import com.whatsapp.WaImageView;

/* renamed from: X.8U6  reason: invalid class name */
public final class AnonymousClass8U6 extends WaFrameLayout {
    public final TextEmojiLabel A00 = C36351kA.A0O(this, R.id.items_count);
    public final TextEmojiLabel A01 = C36351kA.A0O(this, R.id.header_title);
    public final WaImageView A02 = C90474aD.A0P(this, R.id.thumbnail);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8U6(Context context) {
        super(context, (AttributeSet) null);
        AnonymousClass00C.A0D(context, 1);
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
    }
}
