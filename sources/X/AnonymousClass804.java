package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;

/* renamed from: X.804  reason: invalid class name */
public final class AnonymousClass804 extends AnonymousClass0D3 {
    public final ImageView A00;
    public final TextView A01;
    public final TextEmojiLabel A02;
    public final WaImageView A03;
    public final /* synthetic */ C178308fj A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass804(View view, C178308fj r3) {
        super(view);
        this.A04 = r3;
        this.A03 = C90474aD.A0P(view, R.id.reactions_bottom_sheet_row_contact_thumbnail);
        this.A02 = C36351kA.A0O(view, R.id.reactions_bottom_sheet_row_contact_reaction);
        this.A01 = C36341k9.A0M(view, R.id.reactions_bottom_sheet_row_contact_name);
        this.A00 = (ImageView) C36361kB.A0G(view, R.id.reactions_bottom_sheet_row_contact_media);
    }
}
