package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.1yW  reason: invalid class name and case insensitive filesystem */
public class C42251yW extends AnonymousClass0D3 {
    public final ImageView A00;
    public final TextView A01;
    public final TextView A02;
    public final TextEmojiLabel A03;

    public C42251yW(View view) {
        super(view);
        this.A01 = C36391kE.A0O(view, R.id.reactions_bottom_sheet_row_primary_text);
        this.A03 = C36401kF.A0O(view, R.id.reactions_bottom_sheet_row_emoji);
        this.A02 = C36391kE.A0O(view, R.id.reactions_bottom_sheet_row_secondary_text);
        this.A00 = C36401kF.A0G(view, R.id.reactions_bottom_sheet_row_contact_image);
    }
}
