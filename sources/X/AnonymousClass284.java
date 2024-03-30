package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaFrameLayout;

/* renamed from: X.284  reason: invalid class name */
public final class AnonymousClass284 extends WaFrameLayout {
    public C20810yC A00;
    public boolean A01;
    public final TextEmojiLabel A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass284(Context context) {
        super(context, (AttributeSet) null);
        AnonymousClass00C.A0D(context, 1);
        A03();
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
        TextEmojiLabel A0O = C36351kA.A0O(this, R.id.im_header_title);
        this.A02 = A0O;
        C36321k7.A0r(A0O.getAbProps(), A0O);
    }

    public final void setAbProps(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final C20810yC getAbProps() {
        C20810yC r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A07();
    }
}
