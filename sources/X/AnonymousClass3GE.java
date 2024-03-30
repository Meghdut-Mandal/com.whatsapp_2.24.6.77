package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.3GE  reason: invalid class name */
public class AnonymousClass3GE {
    public View A00;
    public AnonymousClass4P5 A01;
    public Runnable A02;

    public void A00(View.OnClickListener onClickListener, String str, int i) {
        C36391kE.A0O(this.A00, R.id.share_link_action_item_text).setText(str);
        ImageView A0G = C36401kF.A0G(this.A00, R.id.share_link_action_item_icon);
        if (this instanceof AnonymousClass23u) {
            A0G.setImageResource(0);
        } else {
            C36391kE.A18(this.A00.getContext(), A0G, i);
        }
        C48812i6.A00(this.A00, onClickListener, this, 1);
    }
}
