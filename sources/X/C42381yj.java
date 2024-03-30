package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.1yj  reason: invalid class name and case insensitive filesystem */
public class C42381yj extends AnonymousClass0D3 {
    public final View A00;
    public final View A01;
    public final TextEmojiLabel A02;
    public final C33751fs A03;
    public final C21060yb A04;
    public final C18820ts A05;
    public final C20810yC A06;
    public final C32681e1 A07;

    public C42381yj(View view, C28431Sq r13, C33751fs r14, C21060yb r15, C18820ts r16, C20810yC r17, C32681e1 r18) {
        super(view);
        this.A01 = view;
        C20810yC r5 = r17;
        this.A06 = r5;
        C32681e1 r7 = r18;
        this.A07 = r7;
        this.A04 = r15;
        this.A05 = r16;
        this.A03 = r14;
        this.A00 = C012005e.A02(view, R.id.empty_community_row_container);
        View A022 = C012005e.A02(view, R.id.empty_community_row_button);
        TextView A0O = C36391kE.A0O(view, R.id.empty_community_row_title);
        TextEmojiLabel A0O2 = C36401kF.A0O(view, R.id.empty_community_row_description);
        this.A02 = A0O2;
        C33511fU.A03(A0O);
        A0O2.setText(r7.A02(A0O2.getContext(), new C81093wS((Object) this, 31), view.getContext().getString(R.string.f12nameremoved), "learn-more"));
        C36331k8.A10(A0O2, r5);
        C36331k8.A16(A0O2, r15);
        if (r5.A0E(5543)) {
            A022.setVisibility(8);
        } else {
            A022.setVisibility(0);
            AnonymousClass3YE.A00(A022, r13, view, 24);
        }
        this.A02.setText(R.string.f12nameremoved);
        View view2 = this.A01;
        View A023 = C012005e.A02(view2, R.id.empty_community_row_see_example_communities);
        TextView A0O3 = C36391kE.A0O(view2, R.id.empty_community_row_see_example_communities_text);
        ImageView A0G = C36401kF.A0G(view2, R.id.empty_community_row_see_example_communities_arrow);
        A0O3.setText(this.A07.A02(A0O3.getContext(), new C81093wS((Object) this, 30), C36391kE.A0v(view2.getContext(), "learn-more", AnonymousClass001.A0L(), 0, R.string.f12nameremoved), "learn-more"));
        C36331k8.A10(A0O3, this.A06);
        C36371kC.A1I(A0O3, this.A04);
        C36321k7.A0L(view2.getContext(), A0G, this.A05, R.drawable.chevron_right);
        C66943Xx.A00(A0G, this, 4);
        A023.setVisibility(0);
    }
}
