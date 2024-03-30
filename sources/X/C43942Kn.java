package X;

import android.view.View;
import android.widget.RadioButton;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.2Kn  reason: invalid class name and case insensitive filesystem */
public class C43942Kn extends C41781xl {
    public final RadioButton A00;
    public final TextEmojiLabel A01;
    public final TextEmojiLabel A02;
    public final TextEmojiLabel A03;
    public final TextEmojiLabel A04;
    public final /* synthetic */ C40791w7 A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43942Kn(View view, C40791w7 r3) {
        super(view, r3);
        this.A05 = r3;
        this.A02 = C36401kF.A0O(view, R.id.select_list_item_header);
        this.A04 = C36401kF.A0O(view, R.id.select_list_item_title);
        this.A01 = C36401kF.A0O(view, R.id.select_list_item_description);
        this.A00 = (RadioButton) C012005e.A02(view, R.id.select_list_item_radio_button);
        this.A03 = C36401kF.A0O(view, R.id.select_list_item_highlight);
        C66963Xz.A00(view, this, 35);
    }
}
