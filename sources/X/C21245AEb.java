package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.AEb  reason: case insensitive filesystem */
public class C21245AEb implements B1M {
    public final /* synthetic */ C22981AzX A00;
    public final /* synthetic */ C179048iy A01;
    public final /* synthetic */ PaymentBottomSheet A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ Runnable A04;

    public C21245AEb(C22981AzX azX, C179048iy r2, PaymentBottomSheet paymentBottomSheet, Runnable runnable, Runnable runnable2) {
        this.A01 = r2;
        this.A02 = paymentBottomSheet;
        this.A04 = runnable;
        this.A00 = azX;
        this.A03 = runnable2;
    }

    public void BWg(C202059ky r4) {
        C179048iy r2 = this.A01;
        int i = r4.A00;
        if (i == 10752 || i == 10756 || i == 10755) {
            C179048iy.A12(r4, this.A00, r2, this.A02);
        } else {
            r2.BO6(r2.A4q(r4));
        }
        this.A03.run();
    }

    public void BfF(C186238vd r7) {
        C184308sE r0 = r7.A00;
        if (r0 != null) {
            C179048iy r4 = this.A01;
            r4.startActivityForResult(AnonymousClass190.A1J(r4, r0.A03, r0.A02, r0.A01, -1), EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
            PaymentBottomSheet paymentBottomSheet = this.A02;
            if (paymentBottomSheet != null) {
                paymentBottomSheet.A1b();
            }
            r4.BOo((C131606Ps) null, C36381kD.A0m(), (Integer) null, "in_app_browser_checkout");
        }
        this.A04.run();
    }
}
