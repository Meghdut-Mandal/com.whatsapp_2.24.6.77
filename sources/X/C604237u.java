package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.SelectionCheckView;

/* renamed from: X.37u  reason: invalid class name and case insensitive filesystem */
public final class C604237u {
    public final ImageView A00;
    public final TextEmojiLabel A01;
    public final TextEmojiLabel A02;
    public final SelectionCheckView A03;

    public C604237u(View view) {
        AnonymousClass00C.A0D(view, 1);
        this.A00 = C36361kB.A0M(view, R.id.contactpicker_row_photo);
        TextEmojiLabel A0R = C36361kB.A0R(view, R.id.name);
        this.A01 = A0R;
        this.A03 = (SelectionCheckView) C36361kB.A0F(view, R.id.selection_check);
        this.A02 = C36361kB.A0R(view, R.id.phone_number);
        C011504z.A06(A0R, 2);
        C33511fU.A03(A0R);
    }
}
