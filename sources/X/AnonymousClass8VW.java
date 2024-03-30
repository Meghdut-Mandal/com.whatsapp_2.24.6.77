package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.biz.catalog.view.widgets.QuantitySelector;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.8VW  reason: invalid class name */
public class AnonymousClass8VW extends AnonymousClass80H {
    public final ImageView A00;
    public final LinearLayout A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final C198329dH A07;
    public final AnonymousClass9EA A08;
    public final CartFragment A09;
    public final QuantitySelector A0A;
    public final AnonymousClass1KP A0B;
    public final C18820ts A0C;
    public final UserJid A0D;
    public final C196089Xp A0E;
    public final AnonymousClass966 A0F;

    public static boolean A00(ImageView imageView, AnonymousClass8VW r6, C207269up r7) {
        List<C206759tv> list = r7.A07;
        if (!list.isEmpty() && !r7.A02()) {
            for (C206759tv r2 : list) {
                if (r2 != null && !TextUtils.isEmpty(r2.A01)) {
                    C134966bu r4 = new C134966bu(r2.A04, r2.A01);
                    C196089Xp r3 = r6.A0E;
                    UserJid userJid = r6.A0D;
                    AnonymousClass9HG r1 = null;
                    if (userJid != null) {
                        r1 = new AnonymousClass9HG(new AnonymousClass9ED(897453112), userJid);
                    }
                    C109905Zo.A00(imageView, r1, r3, r4);
                    return true;
                }
            }
        }
        return false;
    }

    public AnonymousClass8VW(View view, C198329dH r4, AnonymousClass9EA r5, AnonymousClass4PD r6, CartFragment cartFragment, CartFragment cartFragment2, C196089Xp r9, AnonymousClass1KP r10, AnonymousClass966 r11, C18820ts r12, UserJid userJid) {
        super(view);
        this.A0C = r12;
        this.A07 = r4;
        this.A0E = r9;
        this.A09 = cartFragment2;
        this.A0B = r10;
        this.A0F = r11;
        this.A04 = C36391kE.A0O(view, R.id.cart_item_title);
        this.A02 = C36391kE.A0O(view, R.id.cart_item_price);
        this.A03 = C36391kE.A0O(view, R.id.cart_item_original_price);
        this.A01 = C90514aH.A0U(view, R.id.cart_item_price_container);
        QuantitySelector quantitySelector = (QuantitySelector) C012005e.A02(view, R.id.cart_item_quantity_selector);
        this.A0A = quantitySelector;
        quantitySelector.A03 = new A9G(r6, this, cartFragment2);
        quantitySelector.A04 = new A9H(r6, this, cartFragment2);
        this.A00 = C36401kF.A0G(view, R.id.cart_item_thumbnail);
        view.setOnClickListener(new C48932iI(cartFragment, this, r6, 2));
        this.A05 = C36391kE.A0O(view, R.id.cart_item_variant_info_1);
        this.A06 = C36391kE.A0O(view, R.id.cart_item_variant_info_2);
        this.A0D = userJid;
        this.A08 = r5;
    }
}
