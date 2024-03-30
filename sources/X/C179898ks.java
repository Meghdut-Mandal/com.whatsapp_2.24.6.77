package X;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.8ks  reason: invalid class name and case insensitive filesystem */
public class C179898ks extends AnonymousClass80F {
    public final Context A00;
    public final View A01;
    public final Button A02;
    public final ImageView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextEmojiLabel A06;

    public C179898ks(View view) {
        super(view);
        this.A00 = view.getContext();
        this.A02 = (Button) C012005e.A02(view, R.id.complaint_button);
        this.A01 = C012005e.A02(view, R.id.transaction_complaint_status);
        this.A03 = C36401kF.A0G(view, R.id.transaction_complaint_status_icon);
        this.A05 = C36391kE.A0O(view, R.id.transaction_complaint_status_title);
        this.A04 = C36391kE.A0O(view, R.id.transaction_complaint_status_subtitle);
        this.A06 = C36401kF.A0O(view, R.id.transaction_complaint_status_time);
    }
}
