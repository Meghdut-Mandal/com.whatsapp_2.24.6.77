package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.5B7  reason: invalid class name */
public class AnonymousClass5B7 extends C96984oD {
    public AnonymousClass141 A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextEmojiLabel A04;
    public final TextEmojiLabel A05;
    public final /* synthetic */ C142466ov A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5B7(View view, C142466ov r4) {
        super(view, r4);
        this.A06 = r4;
        this.A04 = C36401kF.A0P(view, R.id.name);
        this.A02 = C36391kE.A0P(view, R.id.status);
        this.A03 = C36391kE.A0P(view, R.id.time_left);
        ImageView A0N = C36391kE.A0N(view, R.id.avatar);
        this.A01 = A0N;
        this.A05 = C36401kF.A0P(view, R.id.push_name);
        C011504z.A06(A0N, 2);
    }
}
