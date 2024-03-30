package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.contact.FacepileView;

/* renamed from: X.803  reason: invalid class name */
public class AnonymousClass803 extends AnonymousClass0D3 {
    public FacepileView A00;
    public final TextView A01;
    public final TextView A02;
    public final TextEmojiLabel A03;
    public final /* synthetic */ C178298fi A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass803(View view, C178298fi r4) {
        super(view);
        this.A04 = r4;
        this.A01 = C36341k9.A0M(view, R.id.reactions_bottom_sheet_row_primary_text);
        this.A03 = C36351kA.A0O(view, R.id.reactions_bottom_sheet_row_emoji);
        this.A02 = C36341k9.A0M(view, R.id.reactions_bottom_sheet_row_secondary_text);
        if (r4.A02.A00.A0E(5185)) {
            FacepileView facepileView = (FacepileView) view.findViewById(R.id.facepile_view);
            this.A00 = facepileView;
            if (facepileView != null) {
                facepileView.setVisibility(0);
            }
        }
    }
}
