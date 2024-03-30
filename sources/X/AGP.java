package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.widget.PaymentDescriptionRow;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

public class AGP implements C23080B3m {
    public final /* synthetic */ AnonymousClass16U A00;
    public final /* synthetic */ IndiaUpiSendPaymentActivity A01;
    public final /* synthetic */ PaymentBottomSheet A02;

    public /* synthetic */ void Bti(C207249un r1, PaymentMethodRow paymentMethodRow) {
    }

    public boolean Btt() {
        return false;
    }

    public AGP(AnonymousClass16U r1, IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity, PaymentBottomSheet paymentBottomSheet) {
        this.A01 = indiaUpiSendPaymentActivity;
        this.A02 = paymentBottomSheet;
        this.A00 = r1;
    }

    public void B1W(ViewGroup viewGroup) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        C36391kE.A0O(C36411kG.A0J(indiaUpiSendPaymentActivity.getLayoutInflater(), viewGroup, R.layout.f9nameremoved), R.id.amount).setText(this.A00.B7d(indiaUpiSendPaymentActivity.A00, indiaUpiSendPaymentActivity.A09));
    }

    public String BA2(C207249un r4, int i) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        boolean A06 = indiaUpiSendPaymentActivity.A0N.A06(r4);
        int i2 = R.string.f12nameremoved;
        if (A06) {
            i2 = R.string.f12nameremoved;
        }
        return indiaUpiSendPaymentActivity.getString(i2);
    }

    public boolean BMc() {
        C175728ax r0 = this.A01.A0A;
        if (r0 == null || !r0.A0C()) {
            return false;
        }
        return true;
    }

    public void BRP(ViewGroup viewGroup) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        boolean A45 = indiaUpiSendPaymentActivity.A45();
        int i = 0;
        boolean A1V = AnonymousClass000.A1V(indiaUpiSendPaymentActivity.A0X);
        if (!A45 || A1V) {
            i = 8;
        }
        viewGroup.setVisibility(i);
        PaymentDescriptionRow paymentDescriptionRow = (PaymentDescriptionRow) C012005e.A02(viewGroup, R.id.payment_description_row);
        indiaUpiSendPaymentActivity.A0L = paymentDescriptionRow;
        paymentDescriptionRow.A01(indiaUpiSendPaymentActivity.A0Q);
    }

    public void BRQ(ViewGroup viewGroup) {
        View A0J = C36411kG.A0J(this.A01.getLayoutInflater(), viewGroup, R.layout.f9nameremoved);
        C36391kE.A0O(A0J, R.id.text).setText(R.string.f12nameremoved);
        ImageView A0G = C36401kF.A0G(A0J, R.id.icon);
        A0G.setImageResource(R.drawable.ic_close);
        C36421kH.A13(A0G, this.A02, 16);
    }

    public void BRS(ViewGroup viewGroup) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        View inflate = indiaUpiSendPaymentActivity.getLayoutInflater().inflate(R.layout.f9nameremoved, viewGroup, true);
        ImageView A0G = C36401kF.A0G(inflate, R.id.payment_recipient_profile_pic);
        TextView A0O = C36391kE.A0O(inflate, R.id.payment_recipient_direction_label);
        TextView A0O2 = C36391kE.A0O(inflate, R.id.payment_recipient_name);
        TextView A0O3 = C36391kE.A0O(inflate, R.id.payment_recipient_vpa);
        C36351kA.A19(inflate, R.id.expand_receiver_details_button);
        A0O.setText(R.string.f12nameremoved);
        indiaUpiSendPaymentActivity.A01.A06(A0G, R.drawable.avatar_contact);
        C165607th.A1A(A0O2, C165577te.A0g(indiaUpiSendPaymentActivity.A0G));
        Object obj = indiaUpiSendPaymentActivity.A0I.A00;
        C18740tg.A06(obj);
        C36341k9.A0s(indiaUpiSendPaymentActivity, A0O3, new Object[]{obj}, R.string.f12nameremoved);
    }

    public void BYH(ViewGroup viewGroup, C207249un r7) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        AnonymousClass9IL.A00(C36401kF.A0G(C36411kG.A0J(indiaUpiSendPaymentActivity.getLayoutInflater(), viewGroup, R.layout.f9nameremoved), R.id.psp_logo), indiaUpiSendPaymentActivity.A0N, C173858Tk.A0K(indiaUpiSendPaymentActivity), indiaUpiSendPaymentActivity.A0a);
    }

    public boolean Bt5() {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        return indiaUpiSendPaymentActivity.A0N.A06(indiaUpiSendPaymentActivity.A0B);
    }

    public /* synthetic */ int BAl() {
        return 0;
    }

    public /* synthetic */ String BEB() {
        return null;
    }

    public /* synthetic */ String BIS() {
        return null;
    }

    public /* synthetic */ boolean BtO() {
        return false;
    }

    public /* synthetic */ int BA1(C207249un r2) {
        return 0;
    }

    public /* synthetic */ String BAm(C207249un r2) {
        return null;
    }

    public /* synthetic */ boolean BtN(C207249un r2) {
        return false;
    }

    public /* synthetic */ int BBP(C207249un r2, int i) {
        return 0;
    }

    public /* synthetic */ boolean Bt8(C207249un r2, String str, int i) {
        return false;
    }
}
