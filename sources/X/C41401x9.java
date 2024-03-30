package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.1x9  reason: invalid class name and case insensitive filesystem */
public class C41401x9 extends AnonymousClass0D3 {
    public C41401x9(View view, C28431Sq r7, C27751Pr r8) {
        super(view);
        View view2 = this.A0H;
        C33521fV.A07(view2, true);
        C33511fU.A03(C36391kE.A0O(view, R.id.community_subject));
        C36391kE.A1B(C36361kB.A09(view), C36341k9.A0F(view), C36401kF.A0G(view, R.id.community_icon), C68443bu.A00, r8);
        ImageView A0G = C36401kF.A0G(view2, R.id.community_mark);
        A0G.setImageResource(C222013h.A05 ? R.drawable.my_status_add_button_new : R.drawable.my_status_add_button);
        A0G.setVisibility(0);
        view.setOnClickListener(new AnonymousClass3YE(r7, view, 25));
    }
}
