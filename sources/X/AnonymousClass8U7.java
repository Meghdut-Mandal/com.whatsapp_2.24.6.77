package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaFrameLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.8U7  reason: invalid class name */
public final class AnonymousClass8U7 extends WaFrameLayout {
    public final TextEmojiLabel A00 = C36351kA.A0O(this, R.id.subtitle);
    public final TextEmojiLabel A01 = C36351kA.A0O(this, R.id.header_title);
    public final WaImageView A02 = C90474aD.A0P(this, R.id.thumbnail);
    public final WaTextView A03 = ((WaTextView) C36361kB.A0G(this, R.id.surface));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8U7(Context context) {
        super(context, (AttributeSet) null);
        AnonymousClass00C.A0D(context, 1);
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
    }
}
