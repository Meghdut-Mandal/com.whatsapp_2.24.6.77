package X;

import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.5Oj  reason: invalid class name and case insensitive filesystem */
public class C107375Oj extends C101084wy {
    public void A02(Intent intent, Bundle bundle) {
        C101084wy.A00(this.A03, this);
    }

    public void A03(C158057fj r4) {
        try {
            this.A01 = (String) C140456lc.A0I(r4.B7w(), 48);
            C101084wy.A00(this.A03, this);
        } catch (ClassCastException e) {
            C36321k7.A1J(e, "Bloks: Invalid navigation bar type", AnonymousClass000.A0u());
        }
    }

    public C107375Oj(C18820ts r1, WaBloksActivity waBloksActivity) {
        super(r1, waBloksActivity);
    }
}
