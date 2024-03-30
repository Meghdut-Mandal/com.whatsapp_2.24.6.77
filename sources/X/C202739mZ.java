package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment;
import com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentMethodSelectionActivity;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.io.Serializable;
import java.util.List;

/* renamed from: X.9mZ  reason: invalid class name and case insensitive filesystem */
public class C202739mZ implements C23078B3k {
    public Object A00;
    public final int A01;

    public C202739mZ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public /* synthetic */ View B8I(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.A01 == 0) {
            return null;
        }
        C179098jA r1 = (C179098jA) this.A00;
        if (r1.A0G.size() == 0) {
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, (ViewGroup) null);
        C165567td.A0n(inflate, R.id.check_balance_icon, AnonymousClass00F.A00(r1, R.color.f6nameremoved));
        return inflate;
    }

    public /* synthetic */ View BC1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        if (this.A01 != 0) {
            return C36361kB.A0E(layoutInflater, frameLayout, R.layout.f9nameremoved);
        }
        return null;
    }

    public /* synthetic */ int BEA(C207249un r3) {
        if (this.A01 == 0 || !r3.equals(((C179098jA) this.A00).A03)) {
            return 0;
        }
        return R.drawable.countrypicker_checkmark;
    }

    public /* synthetic */ String BED(C207249un r3) {
        if (this.A01 != 0) {
            return ((C179098jA) this.A00).A0A.A02(r3, false);
        }
        return null;
    }

    public void BQp() {
        if (this.A01 != 0) {
            C179148jG r3 = (C179148jG) this.A00;
            Intent A08 = AnonymousClass190.A08(r3);
            A08.putExtra("extra_payments_entry_type", 6);
            A08.putExtra("extra_is_first_payment_method", !C173858Tk.A0x(r3));
            A08.putExtra("extra_skip_value_props_display", C173858Tk.A0x(r3));
            r3.A33(A08, false);
            return;
        }
        BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = (BrazilConfirmReceivePaymentFragment) this.A00;
        String A012 = C201649k3.A01(brazilConfirmReceivePaymentFragment.A0G, "p2p_context", false);
        Intent A0F = C165597tg.A0F(brazilConfirmReceivePaymentFragment.A0h());
        if (A012 == null) {
            A012 = "brpay_p_add_card";
        }
        A0F.putExtra("screen_name", A012);
        C1025050g.A01(A0F, "onboarding_context", "p2p_context");
        brazilConfirmReceivePaymentFragment.A1C(A0F);
    }

    public /* synthetic */ void BQt() {
        Intent intent;
        if (this.A01 != 0) {
            C179098jA r3 = (C179098jA) this.A00;
            if (r3.A0G.size() == 1) {
                C175818b6 r0 = (C175818b6) ((C207249un) r3.A0G.get(0)).A08;
                if (r0 == null || C175818b6.A00(r0)) {
                    intent = C165577te.A0I(r3, (C207249un) r3.A0G.get(0), IndiaUpiCheckBalanceActivity.class);
                } else {
                    r3.A4Q(r3.A09, "ConfirmPaymentFragment");
                    C39001qm A002 = AnonymousClass3LW.A00(r3);
                    C165587tf.A16(A002);
                    B83.A01(A002, r3, 35, R.string.f12nameremoved);
                    A002.A0f((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
                    A002.A00.A0V(new C23186B8u(r3, 7));
                    C36341k9.A11(A002);
                    return;
                }
            } else {
                List list = r3.A0G;
                intent = C36441kJ.A0H(r3, IndiaUpiPaymentMethodSelectionActivity.class);
                intent.putExtra("bank_accounts", (Serializable) list);
            }
            r3.BuO(intent, 1015);
        }
    }

    public boolean BtO() {
        if (this.A01 != 0) {
            return false;
        }
        return true;
    }

    public /* synthetic */ boolean BtW() {
        if (this.A01 != 0) {
            return false;
        }
        return true;
    }

    public void Bti(C207249un r2, PaymentMethodRow paymentMethodRow) {
        if (this.A01 == 0 && C203449o2.A08(r2)) {
            ((BrazilConfirmReceivePaymentFragment) this.A00).A0F.A02(r2, paymentMethodRow);
        }
    }

    public /* synthetic */ void BRn() {
    }

    public /* synthetic */ boolean BtM() {
        return true;
    }

    public /* synthetic */ String BEC(C207249un r2) {
        return null;
    }

    public /* synthetic */ boolean Bt7(C207249un r2) {
        return false;
    }

    public /* synthetic */ View BFd(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }
}
