package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.391  reason: invalid class name */
public class AnonymousClass391 {
    public final View A00;
    public final ImageView A01;
    public final TextEmojiLabel A02;
    public final AnonymousClass3SF A03;
    public final WDSButton A04;

    public AnonymousClass391(View view, AnonymousClass1LI r4) {
        this.A01 = C36401kF.A0G(view, R.id.photo);
        this.A00 = C012005e.A02(view, R.id.row_container);
        this.A04 = C36431kI.A0y(view, R.id.invite_btn);
        this.A02 = C36401kF.A0O(view, R.id.name);
        AnonymousClass3SF A012 = AnonymousClass3SF.A01(view, r4, R.id.name);
        this.A03 = A012;
        TextEmojiLabel textEmojiLabel = A012.A01;
        C011504z.A06(textEmojiLabel, 2);
        C33511fU.A03(textEmojiLabel);
    }
}
