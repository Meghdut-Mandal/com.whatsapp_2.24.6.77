package X;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.1yX  reason: invalid class name and case insensitive filesystem */
public class C42261yX extends AnonymousClass0D3 {
    public final Button A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextEmojiLabel A03;

    public C42261yX(View view) {
        super(view);
        C012005e.A0a(view, true);
        this.A03 = C36401kF.A0P(view, R.id.name);
        this.A02 = C36391kE.A0P(view, R.id.description);
        this.A01 = C36391kE.A0N(view, R.id.image);
        this.A00 = (Button) view.findViewById(R.id.add_contact_btn);
    }
}
