package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;

/* renamed from: X.2Y1  reason: invalid class name */
public final class AnonymousClass2Y1 extends C42521yx {
    public final TextEmojiLabel A00;
    public final AnonymousClass3SF A01;
    public final WaImageView A02;
    public final /* synthetic */ C40961wO A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2Y1(View view, C40961wO r4) {
        super(view);
        this.A03 = r4;
        this.A01 = AnonymousClass3SF.A01(view, r4.A01, R.id.name);
        this.A00 = C36351kA.A0O(view, R.id.about_info);
        this.A02 = (WaImageView) C36361kB.A0G(view, R.id.avatar);
    }
}
