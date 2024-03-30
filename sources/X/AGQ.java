package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.payments.ui.BrazilOrderDetailsActivity;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

public class AGQ implements C23080B3m {
    public final /* synthetic */ AnonymousClass16U A00;
    public final /* synthetic */ AnonymousClass16X A01;
    public final /* synthetic */ C207249un A02;
    public final /* synthetic */ AnonymousClass6O3 A03;
    public final /* synthetic */ BrazilPaymentActivity A04;
    public final /* synthetic */ ConfirmPaymentFragment A05;
    public final /* synthetic */ String A06;

    public /* synthetic */ void BRP(ViewGroup viewGroup) {
    }

    public /* synthetic */ void BRS(ViewGroup viewGroup) {
    }

    public boolean BtN(C207249un r2) {
        return true;
    }

    public boolean BtO() {
        return true;
    }

    public boolean Btt() {
        return true;
    }

    public AGQ(AnonymousClass16U r1, AnonymousClass16X r2, C207249un r3, AnonymousClass6O3 r4, BrazilPaymentActivity brazilPaymentActivity, ConfirmPaymentFragment confirmPaymentFragment, String str) {
        this.A04 = brazilPaymentActivity;
        this.A06 = str;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A05 = confirmPaymentFragment;
    }

    public void B1W(ViewGroup viewGroup) {
        C198299dE r7;
        AnonymousClass6O3 r0 = this.A03;
        if (r0 != null && (r7 = r0.A01) != null) {
            BrazilPaymentActivity brazilPaymentActivity = this.A04;
            int i = brazilPaymentActivity.A01;
            C166427vn r3 = new C166427vn(brazilPaymentActivity, brazilPaymentActivity.A05, this.A01, r7, i, true);
            int i2 = brazilPaymentActivity.A01;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (!(i2 == 2 || i2 == 3)) {
                        if (i2 != 4) {
                            if (!(i2 == 5 || i2 == 7)) {
                                return;
                            }
                        } else if (r7.A01 == 0) {
                            viewGroup.addView(r3);
                            brazilPaymentActivity.A0T.A05(-1, 1);
                            return;
                        } else {
                            return;
                        }
                    }
                } else if (r7.A00 == 0) {
                    viewGroup.addView(r3);
                    brazilPaymentActivity.A0T.A05(1, -1);
                    return;
                } else {
                    return;
                }
            }
            viewGroup.addView(r3);
        }
    }

    public int BBP(C207249un r3, int i) {
        C175858bB r1 = (C175858bB) r3.A08;
        if (r1 == null) {
            return 0;
        }
        if (BrazilPaymentActivity.A1C(r3, i)) {
            if (!"ACTIVE".equals(r1.A0I)) {
                return R.string.f12nameremoved;
            }
            BrazilPaymentActivity brazilPaymentActivity = this.A04;
            if (brazilPaymentActivity.A0O.A0E() || brazilPaymentActivity.A0O.A0B()) {
                return R.string.f12nameremoved;
            }
            return R.string.f12nameremoved;
        } else if (r1.A0a) {
            return 0;
        } else {
            return R.string.f12nameremoved;
        }
    }

    public String BIS() {
        return this.A00.B7d(this.A04.A05, this.A01);
    }

    public boolean BMc() {
        return this.A04.A0e;
    }

    public void BRQ(ViewGroup viewGroup) {
        BrazilPaymentActivity brazilPaymentActivity = this.A04;
        TextView A0P = C36391kE.A0P(brazilPaymentActivity.getLayoutInflater().inflate(R.layout.f9nameremoved, viewGroup, true), R.id.text);
        C36341k9.A0s(brazilPaymentActivity.A02, A0P, new Object[]{brazilPaymentActivity.A04.A0H(brazilPaymentActivity.A06.A01(brazilPaymentActivity.A0G))}, R.string.f12nameremoved);
        String str = this.A06;
        if (TextUtils.isEmpty(str)) {
            if (brazilPaymentActivity instanceof BrazilOrderDetailsActivity) {
                str = "order_details";
            } else {
                str = "new_payment";
            }
        }
        C203049nB.A04(C203049nB.A02(brazilPaymentActivity.A07, this.A01, this.A03, brazilPaymentActivity.A0e), brazilPaymentActivity.A0J, "payment_confirm_prompt", str);
    }

    public void BYH(ViewGroup viewGroup, C207249un r17) {
        BrazilPaymentActivity brazilPaymentActivity = this.A04;
        View inflate = brazilPaymentActivity.getLayoutInflater().inflate(R.layout.f9nameremoved, viewGroup, true);
        TextEmojiLabel A0O = C36401kF.A0O(inflate, R.id.footer_text);
        boolean equals = "p2m".equals(brazilPaymentActivity.A0p);
        int i = R.string.f12nameremoved;
        if (equals) {
            i = R.string.f12nameremoved;
        }
        Context context = brazilPaymentActivity.A02;
        SpannableString spannableString = new SpannableString(C36391kE.A0v(context, context.getString(i), new Object[1], 0, R.string.f12nameremoved));
        AnonymousClass1RJ A0X = C36341k9.A0X(inflate, R.id.hidden_additional_tos);
        if ("p2m".equals(brazilPaymentActivity.A0p)) {
            A0X.A03(0);
            C32681e1 r9 = brazilPaymentActivity.A0Z;
            Context context2 = brazilPaymentActivity.A02;
            String[] strArr = {brazilPaymentActivity.A0D.A09(2671), brazilPaymentActivity.A0D.A09(2670), "https://faq.whatsapp.com/1445437352532377"};
            SpannableString A012 = r9.A01(context2, context2.getString(R.string.f12nameremoved), new Runnable[]{AWB.A00, AWC.A00, AWD.A00}, new String[]{"meta-terms-privacy", "wa-terms-privacy", "wa-brazil-p2m-learn-more"}, strArr);
            C36331k8.A1A(brazilPaymentActivity.A0D, (TextEmojiLabel) A0X.A01());
            ((TextView) A0X.A01()).setText(A012);
        }
        C36331k8.A16(A0O, brazilPaymentActivity.A08);
        C36331k8.A1A(brazilPaymentActivity.A0D, A0O);
        A0O.setText(spannableString);
    }

    public String BA2(C207249un r8, int i) {
        int i2;
        Context context;
        if (BrazilPaymentActivity.A1C(r8, i)) {
            Context context2 = this.A04.A02;
            i2 = R.string.f12nameremoved;
            context = context2;
        } else {
            C175898bF r0 = this.A02.A08;
            C18740tg.A06(r0);
            boolean A09 = r0.A09();
            BrazilPaymentActivity brazilPaymentActivity = this.A04;
            i2 = R.string.f12nameremoved;
            context = brazilPaymentActivity;
            if (A09) {
                return C36391kE.A0v(brazilPaymentActivity, this.A00.B7d(brazilPaymentActivity.A05, this.A01), AnonymousClass001.A0L(), 0, R.string.f12nameremoved);
            }
        }
        return context.getString(i2);
    }

    public int BAl() {
        return R.string.f12nameremoved;
    }

    public /* synthetic */ String BEB() {
        return null;
    }

    public /* synthetic */ boolean Bt5() {
        return false;
    }

    public boolean Bt8(C207249un r2, String str, int i) {
        return BrazilPaymentActivity.A1C(r2, i);
    }

    public void Bti(C207249un r2, PaymentMethodRow paymentMethodRow) {
        if (C203449o2.A08(r2) && !this.A05.A0a) {
            this.A04.A0P.A02(r2, paymentMethodRow);
        }
    }

    public /* synthetic */ int BA1(C207249un r2) {
        return 0;
    }

    public /* synthetic */ String BAm(C207249un r2) {
        return null;
    }
}
