package X;

import android.os.Bundle;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Ba  reason: invalid class name and case insensitive filesystem */
public final class C61223Ba {
    public /* bridge */ /* synthetic */ CartFragment A00(UserJid userJid, String str, int i) {
        AnonymousClass00C.A0D(userJid, 0);
        CartFragment cartFragment = new CartFragment();
        Bundle A07 = AnonymousClass001.A07();
        A07.putParcelable("extra_business_id", userJid);
        A07.putInt("extra_entry_point", i);
        A07.putString("extra_product_id", str);
        cartFragment.A17(A07);
        return cartFragment;
    }
}
