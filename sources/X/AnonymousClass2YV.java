package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;

/* renamed from: X.2YV  reason: invalid class name */
public final class AnonymousClass2YV extends C42531yy {
    public final TextEmojiLabel A00;
    public final AnonymousClass3SF A01;
    public final WaImageView A02;
    public final AnonymousClass1RJ A03;
    public final /* synthetic */ C40991wR A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2YV(View view, C40991wR r4) {
        super(view);
        this.A04 = r4;
        this.A01 = AnonymousClass3SF.A01(view, r4.A02, R.id.name);
        this.A00 = C36351kA.A0O(view, R.id.about_info);
        this.A02 = (WaImageView) C36361kB.A0G(view, R.id.avatar);
        this.A03 = C36341k9.A0X(view, R.id.admin_label_container);
    }
}
