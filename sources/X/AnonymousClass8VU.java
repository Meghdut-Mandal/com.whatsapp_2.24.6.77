package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.biz.order.view.fragment.OrderDetailFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8VU  reason: invalid class name */
public class AnonymousClass8VU extends AnonymousClass80H {
    public final ImageView A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextEmojiLabel A04;
    public final TextEmojiLabel A05;
    public final AnonymousClass1KK A06;
    public final C196089Xp A07;
    public final AnonymousClass1KP A08;
    public final C18820ts A09;
    public final UserJid A0A;

    public AnonymousClass8VU(View view, AnonymousClass1KK r4, AnonymousClass4PD r5, C196089Xp r6, AnonymousClass1KP r7, OrderDetailFragment orderDetailFragment, C18820ts r9, UserJid userJid) {
        super(view);
        this.A09 = r9;
        this.A08 = r7;
        this.A06 = r4;
        this.A07 = r6;
        this.A02 = C36391kE.A0O(view, R.id.cart_item_title);
        this.A03 = C36391kE.A0O(view, R.id.cart_item_subtitle);
        this.A01 = C36391kE.A0O(view, R.id.cart_item_price);
        this.A00 = C36401kF.A0G(view, R.id.cart_item_thumbnail);
        this.A04 = C36401kF.A0O(view, R.id.cart_item_variant_info_1);
        this.A05 = C36401kF.A0O(view, R.id.cart_item_variant_info_2);
        view.setOnClickListener(new C48932iI(r5, this, orderDetailFragment, 4));
        this.A0A = userJid;
    }
}
