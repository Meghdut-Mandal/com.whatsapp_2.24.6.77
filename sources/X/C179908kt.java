package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;

/* renamed from: X.8kt  reason: invalid class name and case insensitive filesystem */
public class C179908kt extends AnonymousClass80F {
    public final Context A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextEmojiLabel A04;
    public final WaTextView A05;
    public final WaTextView A06;
    public final C21060yb A07;
    public final C20810yC A08;

    public C179908kt(View view, C21060yb r3, C20810yC r4) {
        super(view);
        this.A08 = r4;
        this.A07 = r3;
        this.A00 = view.getContext();
        this.A05 = C36401kF.A0Q(view, R.id.status_icon);
        this.A06 = C36401kF.A0Q(view, R.id.transaction_status);
        this.A03 = C36391kE.A0O(view, R.id.transaction_time);
        this.A04 = C36401kF.A0O(view, R.id.status_error_text);
        this.A02 = C36391kE.A0O(view, R.id.status_tertiary_text);
        this.A01 = C36391kE.A0O(view, R.id.status_action_button);
    }
}
