package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.23u  reason: invalid class name */
public class AnonymousClass23u extends AnonymousClass3GE {
    public TextView A00;

    public void A01(View.OnClickListener onClickListener, String str, String str2) {
        super.A00(onClickListener, str, 0);
        TextView A0O = C36391kE.A0O(this.A00, R.id.share_link_action_item_description);
        this.A00 = A0O;
        A0O.setVisibility(0);
        TextView textView = this.A00;
        if (textView != null) {
            textView.setText(str2);
        }
    }
}
