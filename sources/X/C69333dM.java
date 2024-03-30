package X;

import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.3dM  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C69333dM implements C22915AyR {
    public final /* synthetic */ C225314u A00;
    public final /* synthetic */ C64723Pe A01;

    public /* synthetic */ C69333dM(C225314u r1, C64723Pe r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void BZx(C21097A8i a8i) {
        C64723Pe r3 = this.A01;
        C225314u r2 = this.A00;
        Log.w("product-details/send-product/product load failed");
        r2.Bnv();
        r2.BO5(R.string.f12nameremoved);
        Log.w("product-details/send-product/product load failed");
        r3.A05.A05("send_product_message_tag", false);
    }
}
