package X;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiAccountTypeSelectionFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.PaymentMethodsListPickerFragment;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

/* renamed from: X.AGi  reason: case insensitive filesystem */
public class C21304AGi implements C23078B3k {
    public final /* synthetic */ PaymentMethodsListPickerFragment A00;
    public final /* synthetic */ C178848hw A01;

    public boolean BtW() {
        return false;
    }

    public /* synthetic */ void Bti(C207249un r1, PaymentMethodRow paymentMethodRow) {
    }

    public C21304AGi(C178848hw r1, PaymentMethodsListPickerFragment paymentMethodsListPickerFragment) {
        this.A01 = r1;
        this.A00 = paymentMethodsListPickerFragment;
    }

    public View B8I(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C178848hw r3 = this.A01;
        if (r3.A0i.size() == 0) {
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, (ViewGroup) null);
        C165567td.A0n(inflate, R.id.check_balance_icon, AnonymousClass00F.A00(r3, R.color.f6nameremoved));
        return inflate;
    }

    public int BEA(C207249un r4) {
        C178848hw r2 = this.A01;
        if (C178848hw.A1J(r4, r2, r2.A0Z) || !r4.equals(r2.A0B)) {
            return 0;
        }
        return R.drawable.countrypicker_checkmark;
    }

    public String BEC(C207249un r3) {
        C178848hw r1 = this.A01;
        if (C178848hw.A1J(r3, r1, r1.A0Z)) {
            return r1.getString(R.string.f12nameremoved);
        }
        if (C201659k4.A01(r1.A0i)) {
            return "";
        }
        return null;
    }

    public String BED(C207249un r3) {
        return this.A01.A0K.A02(r3, false);
    }

    public View BFd(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C178848hw r0 = this.A01;
        r0.A0S.BOm(C36381kD.A0m(), (Integer) null, "available_payment_methods_prompt", r0.A0f);
        return null;
    }

    public void BQp() {
        C178848hw r2 = this.A01;
        r2.A40(57, "available_payment_methods_prompt");
        if (TextUtils.isEmpty(r2.A0Z) || !r2.A0N.A09(C173858Tk.A0K(r2)) || !C173858Tk.A0x(r2)) {
            r2.A4e((String) null);
            return;
        }
        PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) this.A00.A0I;
        paymentBottomSheet.A1n(new IndiaUpiAccountTypeSelectionFragment(new C200629hk(this, paymentBottomSheet, 1)));
    }

    public void BQt() {
        PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) this.A00.A0f();
        if (paymentBottomSheet != null) {
            paymentBottomSheet.A1m();
        }
        this.A01.A4M();
    }

    public void BRn() {
        this.A01.A40(1, "available_payment_methods_prompt");
    }

    public boolean Bt7(C207249un r3) {
        C178848hw r1 = this.A01;
        return C178848hw.A1J(r3, r1, r1.A0Z);
    }

    public boolean BtM() {
        return AnonymousClass000.A1W(this.A01.A0U);
    }

    public View BC1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        return C36361kB.A0E(layoutInflater, frameLayout, R.layout.f9nameremoved);
    }

    public /* synthetic */ boolean BtO() {
        return false;
    }
}
