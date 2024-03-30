package X;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.BrazilPaymentTypePickerFragment;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.InstallmentBottomSheetFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.PaymentRailPickerFragment;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.ArrayList;
import java.util.List;

public class AGW implements B3P {
    public final /* synthetic */ C79593ty A00;
    public final /* synthetic */ AnonymousClass16X A01;
    public final /* synthetic */ AnonymousClass6O3 A02;
    public final /* synthetic */ ConfirmPaymentFragment A03;
    public final /* synthetic */ PaymentBottomSheet A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ BrazilPaymentActivity A07;

    public void BUD(View view, View view2, C207079uW r14, C175728ax r15, C207249un r16, PaymentBottomSheet paymentBottomSheet) {
        C79593ty r4 = this.A00;
        C207079uW r6 = r14;
        C175728ax r7 = r15;
        C207249un r8 = r16;
        PaymentBottomSheet paymentBottomSheet2 = paymentBottomSheet;
        if (r4 != null) {
            BrazilPaymentActivity brazilPaymentActivity = this.A07;
            brazilPaymentActivity.Bu1(R.string.f12nameremoved);
            C203269nh r2 = brazilPaymentActivity.A0W;
            r4.A0B(new C23206B9o(brazilPaymentActivity, new C21317AGv(r6, r7, r8, this, paymentBottomSheet2), r2, 1), r2.A00.A04);
            return;
        }
        A00(r14, r15, r8, (C146506vi) null, this, paymentBottomSheet2);
    }

    public void BcS(C207249un r1, PaymentMethodRow paymentMethodRow) {
    }

    public void BjR(PaymentBottomSheet paymentBottomSheet) {
    }

    public AGW(C79593ty r1, AnonymousClass16X r2, AnonymousClass6O3 r3, BrazilPaymentActivity brazilPaymentActivity, ConfirmPaymentFragment confirmPaymentFragment, PaymentBottomSheet paymentBottomSheet, String str, String str2) {
        this.A07 = brazilPaymentActivity;
        this.A00 = r1;
        this.A04 = paymentBottomSheet;
        this.A02 = r3;
        this.A01 = r2;
        this.A06 = str;
        this.A03 = confirmPaymentFragment;
        this.A05 = str2;
    }

    public static void A00(C207079uW r18, C175728ax r19, C207249un r20, C146506vi r21, AGW agw, PaymentBottomSheet paymentBottomSheet) {
        AGW agw2 = agw;
        BrazilPaymentActivity brazilPaymentActivity = agw2.A07;
        AnonymousClass6O3 r5 = agw2.A02;
        AnonymousClass16X r12 = agw2.A01;
        C23075B3f b3f = brazilPaymentActivity.A0J;
        String str = agw2.A06;
        C131606Ps A022 = C203049nB.A02(brazilPaymentActivity.A07, r12, r5, brazilPaymentActivity.A0e);
        C18740tg.A06(b3f);
        C207079uW r11 = r18;
        if (r18 != null) {
            A022.A02("num_installments", r11.A01);
            A022.A04("has_installments_fees", false);
        }
        b3f.BOp(A022, 1, 47, "payment_confirm_prompt", str);
        C175728ax r6 = r19;
        C207249un r13 = r20;
        if (r19 != null) {
            int A072 = r6.A07();
            if (BrazilPaymentActivity.A1C(r13, A072)) {
                PaymentBottomSheet paymentBottomSheet2 = paymentBottomSheet;
                if (paymentBottomSheet != null) {
                    agw2.BcO(paymentBottomSheet2, A072);
                    return;
                }
                return;
            }
            AVb.A00(brazilPaymentActivity.A04, agw2, r6, 28);
        }
        C175898bF r0 = r13.A08;
        C18740tg.A06(r0);
        if (((C175858bB) r0).A0a) {
            brazilPaymentActivity.A0P.A01().A04((C22935Ayl) null, r13);
            agw2.A04.A1b();
            C146506vi r14 = r21;
            if (Build.VERSION.SDK_INT < 23 || !brazilPaymentActivity.A0N.A05() || brazilPaymentActivity.A0N.A02() != 1) {
                BrazilPaymentActivity.A16(r11, r12, r13, r14, brazilPaymentActivity, r12.toString(), brazilPaymentActivity.A0p);
                return;
            }
            BrazilPaymentActivity.A15(r11, r12, r13, r14, brazilPaymentActivity, r12.toString(), brazilPaymentActivity.A0p);
            return;
        }
        boolean A0E = brazilPaymentActivity.A0D.A0E(1927);
        String str2 = r13.A0A;
        brazilPaymentActivity.Bu1(R.string.f12nameremoved);
        if (A0E) {
            BrazilPaymentActivity.A19(brazilPaymentActivity, str2);
            brazilPaymentActivity.A0W.A01(new C203519oD(brazilPaymentActivity, 1), new C23218BAa(brazilPaymentActivity, 2), new C23184B8s(brazilPaymentActivity, 1), str2, "payment_method_details").A0A(new C23210B9s(1, str2, brazilPaymentActivity));
            return;
        }
        BrazilPaymentActivity.A19(brazilPaymentActivity, str2);
        C19970wo r132 = brazilPaymentActivity.A07;
        AnonymousClass17Y r112 = brazilPaymentActivity.A05;
        C19730wQ r122 = brazilPaymentActivity.A02;
        AnonymousClass19A r15 = brazilPaymentActivity.A0H;
        C29131Vl r62 = brazilPaymentActivity.A0X;
        AnonymousClass1EU r52 = brazilPaymentActivity.A0P;
        C29121Vk r4 = brazilPaymentActivity.A0M;
        AnonymousClass646 r3 = brazilPaymentActivity.A0L;
        new C195159Ss(brazilPaymentActivity, r112, r122, r132, brazilPaymentActivity.A06, r15, brazilPaymentActivity.A0A, brazilPaymentActivity.A0K, r4, r52, r3, r62, str2).A00(new AER(brazilPaymentActivity, str2));
    }

    public void BZF(PaymentBottomSheet paymentBottomSheet, List list, int i, int i2) {
        String str = this.A06;
        int i3 = ((C206629ti) list.get(i)).A00;
        C131606Ps A0F = C165567td.A0F();
        A0F.A02("num_installments", i3);
        C203049nB.A04(A0F, this.A07.A0J, "installments_selection_prompt", str);
        Bundle A072 = AnonymousClass001.A07();
        A072.putParcelableArrayList("arg_installment_list", (ArrayList) list);
        A072.putInt("arg_selected_position", i);
        A072.putString("arg_referral_screen", str);
        A072.putInt("arg_max_installment_count", i2);
        InstallmentBottomSheetFragment installmentBottomSheetFragment = new InstallmentBottomSheetFragment();
        installmentBottomSheetFragment.A17(A072);
        installmentBottomSheetFragment.A0y(this.A03, 0);
        paymentBottomSheet.A1n(installmentBottomSheetFragment);
    }

    public void BcO(PaymentBottomSheet paymentBottomSheet, int i) {
        BrazilPaymentActivity brazilPaymentActivity = this.A07;
        AnonymousClass6O3 r3 = this.A02;
        AnonymousClass16X r2 = this.A01;
        C203049nB.A03(C203049nB.A02(brazilPaymentActivity.A07, r2, r3, brazilPaymentActivity.A0e), brazilPaymentActivity.A0J, 84, "payment_confirm_prompt", (String) null, 1);
        brazilPaymentActivity.A03.A0A(new ATH(this, this.A03, paymentBottomSheet, this.A05));
    }

    public void BcV(PaymentBottomSheet paymentBottomSheet, int i, int i2) {
        PaymentRailPickerFragment A002 = PaymentRailPickerFragment.A00(i, "p2p".equals(this.A07.A0p));
        A002.A0y(this.A03, 0);
        paymentBottomSheet.A1n(A002);
    }

    public void Bca(int i) {
        String str;
        BrazilPaymentActivity brazilPaymentActivity = this.A07;
        if (i == 1) {
            str = "p2p";
        } else {
            str = "p2m";
        }
        brazilPaymentActivity.A0p = str;
    }

    public void BcZ(PaymentBottomSheet paymentBottomSheet, int i) {
        String str;
        Bundle A072 = AnonymousClass001.A07();
        if (i != 0) {
            str = "friendsAndFamily";
        } else {
            str = "goodAndServices";
        }
        A072.putString("arg_type", str);
        BrazilPaymentTypePickerFragment brazilPaymentTypePickerFragment = new BrazilPaymentTypePickerFragment();
        brazilPaymentTypePickerFragment.A17(A072);
        brazilPaymentTypePickerFragment.A0y(this.A03, 0);
        paymentBottomSheet.A1n(brazilPaymentTypePickerFragment);
    }
}
