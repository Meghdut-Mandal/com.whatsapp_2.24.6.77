package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.7zy  reason: invalid class name and case insensitive filesystem */
public final class C168267zy extends AnonymousClass0D3 {
    public final TextEmojiLabel A00;
    public final /* synthetic */ C177128dF A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C168267zy(View view, C177128dF r4) {
        super(view);
        this.A01 = r4;
        TextEmojiLabel A0R = C36361kB.A0R(view, R.id.disclaimer_text_view);
        this.A00 = A0R;
        A0R.setText(R.string.f12nameremoved);
    }
}
