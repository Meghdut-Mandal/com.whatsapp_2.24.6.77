package X;

import android.content.res.Resources;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilOrderDetailsActivity;
import com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.AAp  reason: case insensitive filesystem */
public class C21155AAp implements AnonymousClass4T4 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BrazilOrderDetailsActivity A01;
    public final /* synthetic */ C188008yt A02;
    public final /* synthetic */ C194219Oo A03;

    public void Bha() {
    }

    public C21155AAp(BrazilOrderDetailsActivity brazilOrderDetailsActivity, C188008yt r2, C194219Oo r3, int i) {
        this.A01 = brazilOrderDetailsActivity;
        this.A03 = r3;
        this.A02 = r2;
        this.A00 = i;
    }

    public void BhX() {
        Resources resources;
        int A05;
        int[] iArr;
        int i;
        BrazilOrderDetailsActivity brazilOrderDetailsActivity = this.A01;
        AnonymousClass07B supportActionBar = brazilOrderDetailsActivity.getSupportActionBar();
        if (supportActionBar != null) {
            int i2 = this.A03.A00;
            if (i2 == 1 || i2 == 7) {
                resources = brazilOrderDetailsActivity.getResources();
                A05 = C165587tf.A05(brazilOrderDetailsActivity.A0D);
                iArr = new int[4];
                iArr[0] = R.string.f12nameremoved;
                iArr[1] = R.string.f12nameremoved;
                iArr[2] = R.string.f12nameremoved;
                i = R.string.f12nameremoved;
            } else {
                resources = brazilOrderDetailsActivity.getResources();
                A05 = C165587tf.A05(brazilOrderDetailsActivity.A0D);
                iArr = new int[4];
                iArr[0] = R.string.f12nameremoved;
                iArr[1] = R.string.f12nameremoved;
                iArr[2] = R.string.f12nameremoved;
                i = R.string.f12nameremoved;
            }
            iArr[3] = i;
            supportActionBar.A0Q(resources.getString(iArr[A05]));
        }
        PaymentCheckoutOrderDetailsViewV2 paymentCheckoutOrderDetailsViewV2 = brazilOrderDetailsActivity.A0A;
        C188008yt r13 = this.A02;
        C194219Oo r14 = this.A03;
        AnonymousClass9SC A002 = paymentCheckoutOrderDetailsViewV2.A00(r13, r14, "WhatsappPay", (List) null, 3);
        brazilOrderDetailsActivity.A0C = A002;
        PaymentCheckoutOrderDetailsViewV2 paymentCheckoutOrderDetailsViewV22 = brazilOrderDetailsActivity.A0A;
        int i3 = r14.A00;
        boolean A032 = paymentCheckoutOrderDetailsViewV22.A03(A002, r14, i3);
        if (this.A00 == 0) {
            C199969gL r2 = brazilOrderDetailsActivity.A0J;
            AnonymousClass2bZ r3 = brazilOrderDetailsActivity.A0I;
            ArrayList A003 = brazilOrderDetailsActivity.A0C.A00();
            r2.A02(r3, BrazilOrderDetailsActivity.A0z(brazilOrderDetailsActivity), AnonymousClass1FR.A03(brazilOrderDetailsActivity.A0C.A01), A003, 4, true, A032, true);
        }
        brazilOrderDetailsActivity.A0A.A02(brazilOrderDetailsActivity, brazilOrderDetailsActivity.A02, r13, r14, "WhatsappPay", (List) null, 3, i3);
    }
}
