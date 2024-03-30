package X;

import android.text.TextUtils;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.AEc  reason: case insensitive filesystem */
public class C21246AEc implements B1M {
    public final /* synthetic */ C22981AzX A00;
    public final /* synthetic */ C22982AzY A01;
    public final /* synthetic */ C179048iy A02;
    public final /* synthetic */ PaymentBottomSheet A03;
    public final /* synthetic */ Runnable A04;
    public final /* synthetic */ Runnable A05;

    public C21246AEc(C22981AzX azX, C22982AzY azY, C179048iy r3, PaymentBottomSheet paymentBottomSheet, Runnable runnable, Runnable runnable2) {
        this.A02 = r3;
        this.A05 = runnable;
        this.A04 = runnable2;
        this.A03 = paymentBottomSheet;
        this.A00 = azX;
        this.A01 = azY;
    }

    public void BWg(C202059ky r4) {
        C179048iy r2 = this.A02;
        int i = r4.A00;
        if (i == 10752 || i == 10756 || i == 10755) {
            this.A04.run();
            C179048iy.A12(r4, this.A00, r2, this.A03);
            return;
        }
        this.A01.BWg(r4);
    }

    public void BfF(C186238vd r7) {
        C184408sO r5 = r7.A01;
        if (r5 != null) {
            C179048iy r4 = this.A02;
            r4.A05 = r5.A06;
            r4.A0Z = r5.A02;
            r4.A0c = r5.A04;
            Class<String> cls = String.class;
            r4.A0I = C165617ti.A0P(C146356vT.A00(), cls, r5.A05, "upiHandle");
            String str = r5.A03;
            if (!TextUtils.isEmpty(str)) {
                r4.A0G = C165617ti.A0P(C146356vT.A00(), cls, str, "accountHolderName");
            }
            r4.A0j = r5.A01;
        }
        this.A05.run();
    }
}
