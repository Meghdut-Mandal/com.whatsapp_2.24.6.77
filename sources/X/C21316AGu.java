package X;

import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.AGu  reason: case insensitive filesystem */
public class C21316AGu implements B6L {
    public final /* synthetic */ AGV A00;
    public final /* synthetic */ PaymentBottomSheet A01;

    public C21316AGu(AGV agv, PaymentBottomSheet paymentBottomSheet) {
        this.A00 = agv;
        this.A01 = paymentBottomSheet;
    }

    public void B5a() {
        PaymentBottomSheet paymentBottomSheet = this.A01;
        if (paymentBottomSheet != null) {
            paymentBottomSheet.A1b();
        }
    }

    public void Bam(C146506vi r4) {
        String str;
        AGV agv = this.A00;
        C178848hw r1 = agv.A04;
        r1.A08 = r4;
        if (r4 == null) {
            str = null;
        } else {
            str = r4.A0M.A0D;
        }
        r1.A0T = str;
        r1.A4T(this.A01);
        B5a();
        r1.A4V(agv.A01);
    }

    public void Bnj() {
        PaymentView paymentView = this.A00.A04.A0M;
        if (paymentView != null) {
            paymentView.A0A();
        }
    }

    public void Bnv() {
        this.A00.A04.Bnv();
    }

    public void Bo1() {
        PaymentView paymentView = this.A00.A04.A0M;
        if (paymentView != null) {
            paymentView.A0B();
        }
    }
}
