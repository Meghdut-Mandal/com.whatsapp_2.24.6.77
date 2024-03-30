package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.components.SelectionCheckView;

/* renamed from: X.1yp  reason: invalid class name and case insensitive filesystem */
public class C42441yp extends AnonymousClass0D3 {
    public boolean A00;
    public final ImageView A01;
    public final C19700wN A02;
    public final TextEmojiLabel A03;
    public final WaTextView A04;
    public final WaTextView A05;
    public final SelectionCheckView A06;
    public final AnonymousClass16D A07;
    public final AnonymousClass1RY A08;
    public final C19420v0 A09;

    public C42441yp(View view, C19700wN r6, AnonymousClass16D r7, AnonymousClass1RY r8, C19420v0 r9) {
        super(view);
        this.A02 = r6;
        this.A07 = r7;
        this.A08 = r8;
        this.A09 = r9;
        View view2 = this.A0H;
        this.A01 = C36401kF.A0G(view2, R.id.community_icon);
        TextEmojiLabel A0O = C36401kF.A0O(view2, R.id.community_subject);
        this.A03 = A0O;
        this.A04 = C36401kF.A0Q(view2, R.id.community_new);
        this.A05 = C36401kF.A0Q(view2, R.id.community_suspended_subtitle);
        this.A06 = (SelectionCheckView) C012005e.A02(view, R.id.community_selection_check);
        C36401kF.A0G(view, R.id.community_mark).setImageResource(C222013h.A05 ? R.drawable.my_status_add_button_new : R.drawable.my_status_add_button);
        C33521fV.A07(view, true);
        C33511fU.A03(A0O);
    }
}
