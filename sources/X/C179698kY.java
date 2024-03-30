package X;

import android.text.Html;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;

/* renamed from: X.8kY  reason: invalid class name and case insensitive filesystem */
public class C179698kY extends C96954oA {
    public final TextEmojiLabel A00;
    public final WaTextView A01;

    public void A0B(AnonymousClass9FU r3, int i) {
        C179948kx r32 = (C179948kx) r3;
        this.A01.setText(r32.A02);
        this.A00.A0I(Html.fromHtml(r32.A01));
        this.A0H.setOnClickListener(r32.A00);
    }

    public C179698kY(View view) {
        super(view);
        this.A01 = C36401kF.A0Q(view, R.id.title);
        this.A00 = C36401kF.A0O(view, R.id.desc);
    }
}
