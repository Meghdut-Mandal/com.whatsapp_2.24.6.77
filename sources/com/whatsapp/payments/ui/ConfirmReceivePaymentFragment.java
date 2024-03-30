package com.whatsapp.payments.ui;

import X.AnonymousClass00C;
import X.AnonymousClass02E;
import X.AnonymousClass1EU;
import X.AnonymousClass2ZN;
import X.AnonymousClass9YB;
import X.B7G;
import X.C175898bF;
import X.C18740tg;
import X.C199849g7;
import X.C203449o2;
import X.C207249un;
import X.C22978AzU;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C61233Bb;
import X.C79593ty;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.whatsapp.R;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

public abstract class ConfirmReceivePaymentFragment extends Hilt_ConfirmReceivePaymentFragment implements C22978AzU {
    public C79593ty A00;
    public C207249un A01;
    public AnonymousClass2ZN A02;
    public AnonymousClass1EU A03;
    public PaymentMethodRow A04;
    public Button A05;
    public final C61233Bb A06 = new B7G(this, 1);

    public void BcR(C207249un r6) {
        this.A01 = r6;
        BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = (BrazilConfirmReceivePaymentFragment) this;
        brazilConfirmReceivePaymentFragment.A04.A01.setVisibility(0);
        PaymentMethodRow paymentMethodRow = brazilConfirmReceivePaymentFragment.A04;
        C199849g7 r0 = brazilConfirmReceivePaymentFragment.A0H;
        AnonymousClass00C.A0D(r6, 0);
        paymentMethodRow.A02.setText(r0.A02(r6, true));
        C175898bF r02 = r6.A08;
        C18740tg.A06(r02);
        if (!r02.A09()) {
            brazilConfirmReceivePaymentFragment.A04.A03(brazilConfirmReceivePaymentFragment.A0n(R.string.f12nameremoved));
        }
        PaymentMethodRow paymentMethodRow2 = brazilConfirmReceivePaymentFragment.A04;
        if (C203449o2.A08(r6)) {
            brazilConfirmReceivePaymentFragment.A0F.A02(r6, paymentMethodRow2);
        }
        brazilConfirmReceivePaymentFragment.A04.A04(true);
        C36371kC.A1F(this.A05, this, r6, 25);
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0E = C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
        this.A04 = (PaymentMethodRow) A0E.findViewById(R.id.payment_method_row);
        this.A05 = (Button) A0E.findViewById(R.id.confirm_payment);
        View findViewById = A0E.findViewById(R.id.add_another_method);
        A0E.findViewById(R.id.account_number_divider).setVisibility(8);
        C36341k9.A10(A0E, R.id.payment_method_account_id, 8);
        C207249un r0 = this.A01;
        C18740tg.A06(r0);
        BcR(r0);
        AnonymousClass02E r2 = this.A0I;
        if (r2 != null) {
            C36371kC.A1F(A0E.findViewById(R.id.payment_method_container), this, r2, 26);
            C36371kC.A1F(findViewById, this, r2, 27);
        }
        return A0E;
    }

    public void A1H() {
        super.A1H();
        this.A02.unregisterObserver(this.A06);
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        C79593ty r0 = this.A00;
        if (r0 != null) {
            r0.A0E();
        }
        this.A00 = AnonymousClass9YB.A00(this.A03);
        Parcelable parcelable = A0b().getParcelable("args_payment_method");
        C18740tg.A06(parcelable);
        this.A01 = (C207249un) parcelable;
        this.A02.registerObserver(this.A06);
    }
}
