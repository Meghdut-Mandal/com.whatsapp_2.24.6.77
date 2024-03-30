package X;

import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.AGl  reason: case insensitive filesystem */
public class C21307AGl implements C23033B1e {
    public final /* synthetic */ C22981AzX A00;
    public final /* synthetic */ C179048iy A01;
    public final /* synthetic */ PaymentBottomSheet A02;
    public final /* synthetic */ PaymentBottomSheet A03;

    public C21307AGl(C22981AzX azX, C179048iy r2, PaymentBottomSheet paymentBottomSheet, PaymentBottomSheet paymentBottomSheet2) {
        this.A01 = r2;
        this.A00 = azX;
        this.A02 = paymentBottomSheet;
        this.A03 = paymentBottomSheet2;
    }

    public void BT0() {
        PaymentBottomSheet paymentBottomSheet = this.A02;
        AnonymousClass01z A0k = paymentBottomSheet.A0k();
        int A0I = A0k.A0I();
        for (int i = 0; i < A0I; i++) {
            A0k.A0V();
        }
        paymentBottomSheet.A1m();
    }

    public void BUa(PaymentBottomSheet paymentBottomSheet, String str) {
        C179048iy r4 = this.A01;
        r4.A01.A01(new C21267AEx(this), str, "p2m-in-buyer-check");
        r4.BOo((C131606Ps) null, C36361kB.A0i(), C36371kC.A0p(), "enter_name");
    }
}
