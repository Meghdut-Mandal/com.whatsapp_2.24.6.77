package X;

import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.PaymentMethodsListPickerFragment;
import java.util.List;

public final /* synthetic */ class ATH implements C25711Hj {
    public final /* synthetic */ AGW A00;
    public final /* synthetic */ ConfirmPaymentFragment A01;
    public final /* synthetic */ PaymentBottomSheet A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ ATH(AGW agw, ConfirmPaymentFragment confirmPaymentFragment, PaymentBottomSheet paymentBottomSheet, String str) {
        this.A00 = agw;
        this.A01 = confirmPaymentFragment;
        this.A03 = str;
        this.A02 = paymentBottomSheet;
    }

    public final void accept(Object obj) {
        AGW agw = this.A00;
        ConfirmPaymentFragment confirmPaymentFragment = this.A01;
        String str = this.A03;
        PaymentBottomSheet paymentBottomSheet = this.A02;
        List list = (List) obj;
        C18740tg.A06(list);
        PaymentMethodsListPickerFragment A002 = PaymentMethodsListPickerFragment.A00(list);
        A002.A0y(confirmPaymentFragment, 0);
        A002.A07 = new C21303AGh(agw, str);
        paymentBottomSheet.A1n(A002);
    }
}
