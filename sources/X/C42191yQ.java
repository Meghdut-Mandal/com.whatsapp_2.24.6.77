package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.1yQ  reason: invalid class name and case insensitive filesystem */
public final class C42191yQ extends AnonymousClass0D3 {
    public final ImageView A00;
    public final TextView A01;
    public final TextEmojiLabel A02;

    public C42191yQ(View view) {
        super(view);
        ImageView A0M = C36361kB.A0M(view, R.id.contact_photo);
        this.A00 = A0M;
        A0M.setEnabled(false);
        TextEmojiLabel A0R = C36361kB.A0R(view, R.id.contact_name);
        this.A02 = A0R;
        C33511fU.A03(A0R);
        this.A01 = C36351kA.A0F(view, R.id.date_time);
    }
}
