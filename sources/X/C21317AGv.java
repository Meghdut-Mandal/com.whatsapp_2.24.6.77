package X;

import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.AGv  reason: case insensitive filesystem */
public class C21317AGv implements B6L {
    public final /* synthetic */ C207079uW A00;
    public final /* synthetic */ C175728ax A01;
    public final /* synthetic */ C207249un A02;
    public final /* synthetic */ AGW A03;
    public final /* synthetic */ PaymentBottomSheet A04;

    public C21317AGv(C207079uW r1, C175728ax r2, C207249un r3, AGW agw, PaymentBottomSheet paymentBottomSheet) {
        this.A03 = agw;
        this.A04 = paymentBottomSheet;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void B5a() {
        this.A03.A04.A1b();
    }

    public void Bam(C146506vi r7) {
        AGW agw = this.A03;
        PaymentBottomSheet paymentBottomSheet = this.A04;
        C207249un r2 = this.A02;
        AGW.A00(this.A00, this.A01, r2, r7, agw, paymentBottomSheet);
    }

    public void Bnj() {
        PaymentView paymentView = this.A03.A07.A0U;
        if (paymentView != null) {
            paymentView.A0A();
        }
    }

    public void Bnv() {
        this.A03.A07.Bnv();
    }

    public void Bo1() {
        PaymentView paymentView = this.A03.A07.A0U;
        if (paymentView != null) {
            paymentView.A0B();
        }
    }
}
