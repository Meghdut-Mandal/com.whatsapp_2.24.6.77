package X;

import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilPixKeySettingActivity;
import com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

/* renamed from: X.AmY  reason: case insensitive filesystem */
public final class C22433AmY extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ BrazilPixKeySettingActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22433AmY(BrazilPixKeySettingActivity brazilPixKeySettingActivity) {
        super(1);
        this.this$0 = brazilPixKeySettingActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass9WG r8 = (AnonymousClass9WG) obj;
        BrazilPixKeySettingActivity brazilPixKeySettingActivity = this.this$0;
        if (r8 != null) {
            PaymentMethodRow paymentMethodRow = brazilPixKeySettingActivity.A04;
            if (paymentMethodRow == null) {
                throw C36331k8.A0d("paymentMethodRow");
            }
            paymentMethodRow.A02.setText(brazilPixKeySettingActivity.getString(R.string.f12nameremoved));
            PaymentMethodRow paymentMethodRow2 = brazilPixKeySettingActivity.A04;
            if (paymentMethodRow2 == null) {
                throw C36331k8.A0d("paymentMethodRow");
            }
            paymentMethodRow2.setAccountId(r8.A02);
            PaymentMethodRow paymentMethodRow3 = brazilPixKeySettingActivity.A04;
            if (paymentMethodRow3 == null) {
                throw C36331k8.A0d("paymentMethodRow");
            }
            paymentMethodRow3.A03(r8.A00);
            PaymentMethodRow paymentMethodRow4 = brazilPixKeySettingActivity.A04;
            if (paymentMethodRow4 == null) {
                throw C36331k8.A0d("paymentMethodRow");
            }
            paymentMethodRow4.A03.A01();
            if (BrazilPixKeySettingActivity.A07(brazilPixKeySettingActivity)) {
                PaymentMethodRow paymentMethodRow5 = brazilPixKeySettingActivity.A04;
                if (paymentMethodRow5 == null) {
                    throw C36331k8.A0d("paymentMethodRow");
                }
                paymentMethodRow5.A04.setImageResource(R.drawable.ic_action_delete);
                paymentMethodRow5.A04.setVisibility(0);
                int A00 = AnonymousClass00F.A00(brazilPixKeySettingActivity, R.color.f6nameremoved);
                int applyDimension = (int) TypedValue.applyDimension(1, 24.0f, AnonymousClass000.A0X(brazilPixKeySettingActivity));
                PaymentMethodRow paymentMethodRow6 = brazilPixKeySettingActivity.A04;
                if (paymentMethodRow6 == null) {
                    throw C36331k8.A0d("paymentMethodRow");
                }
                ImageView A0N = C36391kE.A0N(paymentMethodRow6, R.id.payment_method_decorate_icon);
                A0N.getLayoutParams().height = applyDimension;
                A0N.getLayoutParams().width = applyDimension;
                AnonymousClass3UF.A0E(A0N, A00);
            }
            View findViewById = brazilPixKeySettingActivity.findViewById(R.id.delete_payments_account_action);
            C165567td.A0n(findViewById, R.id.delete_payments_account_icon, AnonymousClass00F.A00(brazilPixKeySettingActivity, R.color.f6nameremoved));
            C36391kE.A0P(findViewById, R.id.delete_payments_account_label).setText(R.string.f12nameremoved);
            brazilPixKeySettingActivity.A05.A0A(brazilPixKeySettingActivity);
            C36391kE.A1I(findViewById, brazilPixKeySettingActivity, 24);
            if (BrazilPixKeySettingActivity.A07(brazilPixKeySettingActivity)) {
                findViewById.setVisibility(8);
                PaymentMethodRow paymentMethodRow7 = brazilPixKeySettingActivity.A04;
                if (paymentMethodRow7 == null) {
                    throw C36331k8.A0d("paymentMethodRow");
                }
                C36391kE.A1I(paymentMethodRow7.findViewById(R.id.payment_method_decorate_icon), brazilPixKeySettingActivity, 23);
            }
            BrazilPixKeySettingViewModel brazilPixKeySettingViewModel = brazilPixKeySettingActivity.A03;
            if (brazilPixKeySettingViewModel == null) {
                throw C36331k8.A0d("brazilPixKeySettingViewModel");
            }
            BA9.A01(brazilPixKeySettingActivity, brazilPixKeySettingViewModel.A01, new C22432AmX(brazilPixKeySettingActivity), 14);
            PaymentMethodRow paymentMethodRow8 = (PaymentMethodRow) brazilPixKeySettingActivity.findViewById(R.id.step_up_row_container);
            if (!BrazilPixKeySettingActivity.A07(brazilPixKeySettingActivity)) {
                paymentMethodRow8.setVisibility(8);
            } else {
                paymentMethodRow8.A02.setText(C36391kE.A0v(brazilPixKeySettingActivity, brazilPixKeySettingActivity.A06, new Object[1], 0, R.string.f12nameremoved));
                paymentMethodRow8.A03(brazilPixKeySettingActivity.getString(R.string.f12nameremoved));
                int applyDimension2 = (int) TypedValue.applyDimension(1, 40.0f, AnonymousClass000.A0X(brazilPixKeySettingActivity));
                ImageView A0N2 = C36391kE.A0N(paymentMethodRow8, R.id.payment_method_provider_icon);
                A0N2.getLayoutParams().height = applyDimension2;
                A0N2.getLayoutParams().width = applyDimension2;
                A0N2.setImageResource(R.drawable.vec_plus_icon);
                paymentMethodRow8.A05(false);
                brazilPixKeySettingActivity.A05.A0A(brazilPixKeySettingActivity);
                C36391kE.A1I(paymentMethodRow8, brazilPixKeySettingActivity, 25);
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
