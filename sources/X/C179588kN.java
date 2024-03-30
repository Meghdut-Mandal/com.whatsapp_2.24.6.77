package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;

/* renamed from: X.8kN  reason: invalid class name and case insensitive filesystem */
public final class C179588kN extends AnonymousClass80E {
    public final ImageView A00;
    public final TextEmojiLabel A01;
    public final TextEmojiLabel A02;
    public final WaImageView A03;

    public C179588kN(View view) {
        super(view);
        this.A03 = C90474aD.A0P(view, R.id.banner_icon);
        this.A02 = C36351kA.A0O(view, R.id.banner_title);
        this.A01 = C36351kA.A0O(view, R.id.banner_subtitle);
        this.A00 = (ImageView) C36361kB.A0G(view, R.id.button_close);
    }
}
