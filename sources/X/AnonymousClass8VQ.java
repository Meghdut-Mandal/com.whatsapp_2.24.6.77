package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.8VQ  reason: invalid class name */
public class AnonymousClass8VQ extends AnonymousClass80H {
    public final WaTextView A00;
    public final WDSButton A01;

    public AnonymousClass8VQ(View view, CartFragment cartFragment) {
        super(view);
        this.A00 = C36401kF.A0Q(view, R.id.total_quantity_textview);
        WDSButton A0y = C36431kI.A0y(view, R.id.add_more_btn);
        this.A01 = A0y;
        if (cartFragment != null) {
            A0y.setOnClickListener(new C48812i6(cartFragment, this, 11));
        }
    }
}
