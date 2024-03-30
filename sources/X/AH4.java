package X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.IndiaUpiAccountTypeSelectionFragment;
import com.whatsapp.payments.ui.IndiaUpiInteropSendToUpiActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentTwoFactorNudgeFragment;
import com.whatsapp.payments.ui.IndiaUpiPinPrimerDialogFragment;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.PaymentIncentiveViewFragment;
import com.whatsapp.payments.ui.PaymentMethodsListPickerFragment;
import com.whatsapp.payments.ui.widget.PaymentView;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class AH4 implements C162067ny {
    public final /* synthetic */ IndiaUpiSendPaymentActivity A00;

    public AH4(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        this.A00 = indiaUpiSendPaymentActivity;
    }

    public void BQq() {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        indiaUpiSendPaymentActivity.A40(57, "available_payment_methods_prompt");
        if (TextUtils.isEmpty(indiaUpiSendPaymentActivity.A0Z) || !indiaUpiSendPaymentActivity.A0N.A09(C173858Tk.A0K(indiaUpiSendPaymentActivity)) || !C173858Tk.A0x(indiaUpiSendPaymentActivity)) {
            indiaUpiSendPaymentActivity.A4S(indiaUpiSendPaymentActivity, (String) null, false);
            return;
        }
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        paymentBottomSheet.A02 = new IndiaUpiAccountTypeSelectionFragment(new C200629hk(this, paymentBottomSheet, 2));
        indiaUpiSendPaymentActivity.Btl(paymentBottomSheet, "IndiaUpiAccountTypeSelectionFragment");
    }

    public void BR5(String str) {
        C21129A9p a9p;
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        C180448lp r2 = indiaUpiSendPaymentActivity.A0C;
        boolean z = !str.isEmpty();
        r2.A00.setEnabled(z);
        r2.A00.setClickable(z);
        if (indiaUpiSendPaymentActivity.A0U != null && (a9p = indiaUpiSendPaymentActivity.A0B) != null) {
            a9p.B1n(new AnonymousClass9HZ(2, new AnonymousClass9VE(C36381kD.A0r(indiaUpiSendPaymentActivity, IndiaUpiSendPaymentActivity.A0z(indiaUpiSendPaymentActivity, str), new Object[1], R.string.f12nameremoved))));
        }
    }

    public void BWo(String str) {
        String str2;
        String str3;
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        indiaUpiSendPaymentActivity.A0S.BOm(C36381kD.A0m(), 51, "max_amount_shake", indiaUpiSendPaymentActivity.A0f);
        if (indiaUpiSendPaymentActivity.A0D.A0E(1933)) {
            if (indiaUpiSendPaymentActivity.A0D.A00.A00.compareTo(new BigDecimal(indiaUpiSendPaymentActivity.A06.A04(C21100yf.A1m))) == 0) {
                str2 = "-10022";
                str3 = "MAX_AMOUNT_2K_INLINE";
            } else {
                str2 = "-10020";
                str3 = "MAX_AMOUNT_100K";
            }
            IndiaUpiSendPaymentActivity.A15(indiaUpiSendPaymentActivity, str2, str3);
        }
    }

    public void BYe() {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        AnonymousClass6O3 r0 = indiaUpiSendPaymentActivity.A0U;
        if (r0 != null && r0.A01 != null) {
            indiaUpiSendPaymentActivity.overridePendingTransition(0, 0);
            AnonymousClass6O3 r3 = indiaUpiSendPaymentActivity.A0U;
            AF7 af7 = indiaUpiSendPaymentActivity.A0S;
            Bundle A07 = AnonymousClass001.A07();
            PaymentIncentiveViewFragment paymentIncentiveViewFragment = new PaymentIncentiveViewFragment(af7, r3);
            paymentIncentiveViewFragment.A17(A07);
            Objects.requireNonNull(paymentIncentiveViewFragment);
            paymentIncentiveViewFragment.A04 = new C117675me(paymentIncentiveViewFragment);
            indiaUpiSendPaymentActivity.Btm(paymentIncentiveViewFragment);
        }
    }

    public void BcM() {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        if (AnonymousClass143.A0G(indiaUpiSendPaymentActivity.A0E) && indiaUpiSendPaymentActivity.A00 == 0) {
            indiaUpiSendPaymentActivity.A3m((Bundle) null);
        } else if (indiaUpiSendPaymentActivity.A4f() && (!indiaUpiSendPaymentActivity.A45())) {
            indiaUpiSendPaymentActivity.startActivity(C36441kJ.A0H(indiaUpiSendPaymentActivity, IndiaUpiInteropSendToUpiActivity.class));
        }
    }

    public void BcN() {
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        PaymentMethodsListPickerFragment A002 = PaymentMethodsListPickerFragment.A00(indiaUpiSendPaymentActivity.A0i);
        A002.A07 = new C21304AGi(indiaUpiSendPaymentActivity, A002);
        A002.A04 = new AGX(indiaUpiSendPaymentActivity);
        paymentBottomSheet.A02 = A002;
        indiaUpiSendPaymentActivity.Btl(paymentBottomSheet, String.valueOf(18));
    }

    public void BcT() {
        this.A00.A40(64, "enter_user_payment_id");
    }

    public void Bet(AnonymousClass16X r14, String str) {
        String str2;
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        indiaUpiSendPaymentActivity.A0V.A05("request_payment", indiaUpiSendPaymentActivity.A00);
        if (indiaUpiSendPaymentActivity.A0B == null || indiaUpiSendPaymentActivity.A0M.A0O()) {
            BQq();
            return;
        }
        indiaUpiSendPaymentActivity.A09 = r14;
        if (indiaUpiSendPaymentActivity.A45()) {
            PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
            ConfirmPaymentFragment A002 = ConfirmPaymentFragment.A00(indiaUpiSendPaymentActivity.A0B, (UserJid) null, (C206349tD) null, indiaUpiSendPaymentActivity.A0p, indiaUpiSendPaymentActivity.A0Z, indiaUpiSendPaymentActivity.A0n ^ true ? 1 : 0);
            A002.A0I = new AGP(indiaUpiSendPaymentActivity.A07.A01("INR"), indiaUpiSendPaymentActivity, paymentBottomSheet);
            A002.A0J = new AGT(indiaUpiSendPaymentActivity);
            paymentBottomSheet.A02 = A002;
            indiaUpiSendPaymentActivity.Btm(paymentBottomSheet);
            return;
        }
        C24611Dc r6 = indiaUpiSendPaymentActivity.A0g;
        C119975ql[] r5 = new C119975ql[1];
        UserJid userJid = indiaUpiSendPaymentActivity.A0G;
        if (userJid != null) {
            str2 = userJid.toString();
        } else {
            str2 = "";
        }
        r5[0] = new C119975ql("receiver_jid", str2);
        AnonymousClass3T1 r10 = null;
        r6.A09((String) null, "requesting payment ", r5);
        PaymentView A3i = indiaUpiSendPaymentActivity.A3i();
        if (A3i == null || A3i.getStickerIfSelected() == null) {
            AVY.A00(indiaUpiSendPaymentActivity.A04, this, 20);
            indiaUpiSendPaymentActivity.Bnv();
            indiaUpiSendPaymentActivity.A3v();
            indiaUpiSendPaymentActivity.A3k();
            return;
        }
        indiaUpiSendPaymentActivity.Bu1(R.string.f12nameremoved);
        C29951Yq r62 = indiaUpiSendPaymentActivity.A0S;
        PaymentView paymentView = indiaUpiSendPaymentActivity.A0M;
        C18740tg.A04(paymentView);
        C135066c4 stickerIfSelected = paymentView.getStickerIfSelected();
        C18740tg.A06(stickerIfSelected);
        AnonymousClass11F r8 = indiaUpiSendPaymentActivity.A0E;
        C18740tg.A06(r8);
        UserJid userJid2 = indiaUpiSendPaymentActivity.A0G;
        long j = indiaUpiSendPaymentActivity.A02;
        if (j != 0) {
            r10 = C36421kH.A0R(indiaUpiSendPaymentActivity.A0e, j);
        }
        PaymentView paymentView2 = indiaUpiSendPaymentActivity.A0M;
        r62.A01(paymentView2.getPaymentBackground(), r8, userJid2, r10, stickerIfSelected, paymentView2.getStickerSendOrigin()).A0B(new C23209B9r(r14, this, 9), indiaUpiSendPaymentActivity.A05.A04);
    }

    public void BgF(AnonymousClass16X r11) {
        AnonymousClass16X r4;
        BigDecimal bigDecimal;
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        if (indiaUpiSendPaymentActivity.A0U != null) {
            BigDecimal bigDecimal2 = r11.A00;
            r4 = AnonymousClass16X.A00(IndiaUpiSendPaymentActivity.A0z(indiaUpiSendPaymentActivity, bigDecimal2.toEngineeringString()), 2);
            Objects.requireNonNull(r4);
            C206799tz r5 = indiaUpiSendPaymentActivity.A0U;
            JSONObject A1C = C36441kJ.A1C(r5.A00);
            A1C.put("fxBaseAmt", bigDecimal2.toEngineeringString());
            r5.A00 = C36381kD.A0y(A1C);
        } else {
            r4 = r11;
        }
        indiaUpiSendPaymentActivity.A0V.A05("send_payment", indiaUpiSendPaymentActivity.A00);
        C131606Ps r2 = null;
        boolean z = false;
        if (indiaUpiSendPaymentActivity.A0V) {
            r2 = new C131606Ps((String) null, new C131606Ps[0]);
            C173858Tk.A0t(r2, indiaUpiSendPaymentActivity);
        }
        indiaUpiSendPaymentActivity.A4a(r2, "new_payment", 5);
        if (indiaUpiSendPaymentActivity.A0B == null || indiaUpiSendPaymentActivity.A0M.A0O()) {
            BQq();
            return;
        }
        if (indiaUpiSendPaymentActivity.A0K) {
            if (indiaUpiSendPaymentActivity.A00 != 5) {
                indiaUpiSendPaymentActivity.A0J = true;
                IndiaUpiSendPaymentActivity.A12(indiaUpiSendPaymentActivity);
                return;
            } else if (indiaUpiSendPaymentActivity.A0U != null) {
                C20810yC r1 = indiaUpiSendPaymentActivity.A0D;
                BigDecimal bigDecimal3 = C202809mh.A00;
                if (C165617ti.A0b(IndiaUpiSendPaymentActivity.A0z(indiaUpiSendPaymentActivity, indiaUpiSendPaymentActivity.A0U.A08)).compareTo(C165617ti.A0b(Integer.toString(C165607th.A07(r1)))) > 0) {
                    AnonymousClass3SJ.A01(indiaUpiSendPaymentActivity, 39);
                }
            } else {
                String A0M = C173858Tk.A0M(indiaUpiSendPaymentActivity);
                if (!AnonymousClass14B.A0F(A0M) && r4.A00.compareTo(C165617ti.A0b(A0M)) > 0) {
                    int i = 41;
                    if (indiaUpiSendPaymentActivity.A0n) {
                        i = 40;
                    }
                    AnonymousClass3SJ.A01(indiaUpiSendPaymentActivity, i);
                    return;
                } else if (!indiaUpiSendPaymentActivity.A0n && (bigDecimal = indiaUpiSendPaymentActivity.A0H) != null && r4.A00.compareTo(bigDecimal) > 0) {
                    AnonymousClass3SJ.A01(indiaUpiSendPaymentActivity, 39);
                    return;
                }
            }
        }
        C207249un r12 = indiaUpiSendPaymentActivity.A0B;
        C175818b6 r0 = (C175818b6) r12.A08;
        if (r0 == null || C175818b6.A00(r0)) {
            if (indiaUpiSendPaymentActivity.A0P.A03().getBoolean("payments_upi_pin_primer_dialog_shown", false)) {
                C36331k8.A0w(C90494aF.A0E(indiaUpiSendPaymentActivity.A0P), "payments_upi_pin_primer_dialog_shown", false);
            } else {
                int A07 = indiaUpiSendPaymentActivity.A0D.A07(1124);
                String[] split = indiaUpiSendPaymentActivity.A0P.A03().getString("payments_sent_payment_with_account", "").split(";");
                int length = split.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (split[i2].equalsIgnoreCase(indiaUpiSendPaymentActivity.A0B.A0A)) {
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!(!indiaUpiSendPaymentActivity.A0F.A02().isEmpty()) && z && A07 > 0 && indiaUpiSendPaymentActivity.A0P.A03().getInt("payments_two_factor_nudge_count", 0) < A07) {
                    C24601Db r13 = indiaUpiSendPaymentActivity.A0P;
                    if (C19970wo.A00(r13.A01) - C36341k9.A0B(r13.A03(), "payments_last_two_factor_nudge_time") > TimeUnit.HOURS.toMillis(24)) {
                        IndiaUpiPaymentTwoFactorNudgeFragment indiaUpiPaymentTwoFactorNudgeFragment = new IndiaUpiPaymentTwoFactorNudgeFragment();
                        indiaUpiPaymentTwoFactorNudgeFragment.A02 = indiaUpiSendPaymentActivity;
                        indiaUpiSendPaymentActivity.Btm(indiaUpiPaymentTwoFactorNudgeFragment);
                        return;
                    }
                }
            }
            if (IndiaUpiSendPaymentActivity.A18(indiaUpiSendPaymentActivity)) {
                indiaUpiSendPaymentActivity.A09 = r4;
                indiaUpiSendPaymentActivity.A06 = r11;
                indiaUpiSendPaymentActivity.Bu1(R.string.f12nameremoved);
                AVb.A00(indiaUpiSendPaymentActivity.A04, indiaUpiSendPaymentActivity, r4, 46);
                return;
            }
            PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
            paymentBottomSheet.A02 = indiaUpiSendPaymentActivity.A4L(r4, r11, paymentBottomSheet);
            indiaUpiSendPaymentActivity.Btm(paymentBottomSheet);
            return;
        }
        IndiaUpiPinPrimerDialogFragment A0d = C165607th.A0d(r12, indiaUpiSendPaymentActivity);
        PaymentBottomSheet paymentBottomSheet2 = new PaymentBottomSheet();
        paymentBottomSheet2.A02 = A0d;
        indiaUpiSendPaymentActivity.Btl(paymentBottomSheet2, "IndiaUpiPinPrimerDialogFragment");
        C36331k8.A0w(C90494aF.A0E(indiaUpiSendPaymentActivity.A0P), "payments_upi_pin_primer_dialog_shown", true);
    }

    public void BgG() {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        indiaUpiSendPaymentActivity.A3r(indiaUpiSendPaymentActivity.A0S, indiaUpiSendPaymentActivity.A0U);
    }

    public void BgI() {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        Object[] A0L = AnonymousClass001.A0L();
        A0L[0] = indiaUpiSendPaymentActivity.A06.A0M(indiaUpiSendPaymentActivity.A08);
        indiaUpiSendPaymentActivity.BO9(A0L, 0, R.string.f12nameremoved);
    }

    public void Biw(boolean z) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        AnonymousClass6O3 r2 = indiaUpiSendPaymentActivity.A0U;
        AF7 af7 = indiaUpiSendPaymentActivity.A0S;
        if (z) {
            C179148jG.A1O(indiaUpiSendPaymentActivity, af7, r2, 49);
        } else {
            C179148jG.A1O(indiaUpiSendPaymentActivity, af7, r2, 48);
        }
        indiaUpiSendPaymentActivity.A4P();
    }

    public void Btj(DialogFragment dialogFragment) {
        this.A00.Btm(dialogFragment);
    }

    public void BYE(String str, boolean z) {
        if (!TextUtils.isEmpty(str) && !z) {
            IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
            indiaUpiSendPaymentActivity.A3q(indiaUpiSendPaymentActivity.A0S, indiaUpiSendPaymentActivity.A0U);
        }
    }
}
