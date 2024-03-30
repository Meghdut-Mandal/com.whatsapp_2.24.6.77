package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.1yh  reason: invalid class name and case insensitive filesystem */
public class C42361yh extends AnonymousClass0D3 {
    public View A00;
    public TextView A01;
    public ImageView A02;
    public TextEmojiLabel A03;
    public TextEmojiLabel A04;
    public AnonymousClass3SF A05;

    public C42361yh(View view, AnonymousClass1LI r4) {
        super(view);
        this.A05 = AnonymousClass3SF.A01(view, r4, R.id.name);
        this.A04 = C36401kF.A0P(view, R.id.status);
        this.A02 = C36391kE.A0N(view, R.id.avatar);
        this.A00 = view.findViewById(R.id.divider);
        this.A01 = C36391kE.A0P(view, R.id.invite);
        this.A03 = C36401kF.A0P(view, R.id.push_name);
        C011504z.A06(this.A02, 2);
        view.setBackgroundResource(R.drawable.selector_orange_gradient);
        view.setFocusable(true);
        view.setClickable(true);
    }
}
