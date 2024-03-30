package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.widget.PaymentDescriptionRow;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import com.whatsapp.wds.components.button.WDSButton;
import java.math.BigDecimal;
import java.text.NumberFormat;

public class AGR implements C23080B3m {
    public final /* synthetic */ AnonymousClass16U A00;
    public final /* synthetic */ AnonymousClass16X A01;
    public final /* synthetic */ AnonymousClass16X A02;
    public final /* synthetic */ AnonymousClass6O3 A03;
    public final /* synthetic */ PaymentBottomSheet A04;
    public final /* synthetic */ ConfirmPaymentFragment A05;
    public final /* synthetic */ C178848hw A06;

    public /* synthetic */ void Bti(C207249un r1, PaymentMethodRow paymentMethodRow) {
    }

    public boolean Btt() {
        return true;
    }

    public AGR(AnonymousClass16U r1, AnonymousClass16X r2, AnonymousClass16X r3, AnonymousClass6O3 r4, ConfirmPaymentFragment confirmPaymentFragment, C178848hw r6, PaymentBottomSheet paymentBottomSheet) {
        this.A06 = r6;
        this.A04 = paymentBottomSheet;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A05 = confirmPaymentFragment;
        this.A00 = r1;
    }

    public void B1W(ViewGroup viewGroup) {
        C198299dE r15;
        AnonymousClass16X r5;
        C178848hw r12 = this.A06;
        if (!C178848hw.A1J(r12.A0B, r12, r12.A0Z)) {
            ViewGroup viewGroup2 = viewGroup;
            if (r12.A0U == null || (r5 = this.A02) == null) {
                AnonymousClass9UF r8 = r12.A0e;
                AnonymousClass16U r7 = this.A00;
                AnonymousClass16X r14 = this.A01;
                C36391kE.A0O(r12.getLayoutInflater().inflate(R.layout.f9nameremoved, viewGroup2, true), R.id.amount).setText(r7.B7d(r8.A01, r14));
                if (!TextUtils.isEmpty(r12.A0X) && r12.A45()) {
                    TextView textView = (TextView) r12.getLayoutInflater().inflate(R.layout.f9nameremoved, viewGroup2, false);
                    AnonymousClass3UF.A0F(textView, r12.getResources().getColor(R.color.f6nameremoved));
                    viewGroup2.addView(textView);
                }
                AnonymousClass6O3 r2 = this.A03;
                if (r2 != null && (r15 = r2.A01) != null) {
                    C166427vn r11 = new C166427vn(r12, r12.A00, r14, r15, r12.A01, false);
                    int i = r12.A01;
                    if (i != 0) {
                        if (i != 1) {
                            if (!(i == 2 || i == 3)) {
                                if (i != 4) {
                                    if (!(i == 5 || i == 7)) {
                                        return;
                                    }
                                } else if (r15.A01 == 0) {
                                    viewGroup2.addView(r11);
                                    r12.A0T.A05(-1, 1);
                                    return;
                                } else {
                                    return;
                                }
                            }
                        } else if (r15.A00 == 0) {
                            viewGroup2.addView(r11);
                            r12.A0T.A05(1, -1);
                            return;
                        } else {
                            return;
                        }
                    }
                    viewGroup2.addView(r11);
                    return;
                }
                return;
            }
            View inflate = r12.getLayoutInflater().inflate(R.layout.f9nameremoved, viewGroup2, true);
            TextView A0O = C36391kE.A0O(inflate, R.id.sending_value);
            C18820ts r13 = r12.A00;
            AnonymousClass16V r3 = (AnonymousClass16V) r12.A05;
            String str = r3.A02;
            String str2 = r3.A03;
            BigDecimal bigDecimal = this.A01.A00;
            A0O.setText(AnonymousClass6US.A00(r13, str, str2, bigDecimal, bigDecimal.scale(), false));
            TextView A0O2 = C36391kE.A0O(inflate, R.id.exchange_rate);
            C206799tz r82 = r12.A0U;
            C36341k9.A0s(r12, A0O2, new Object[]{r82.A01, r82.A03}, R.string.f12nameremoved);
            NumberFormat A0N = r12.A00.A0N();
            A0N.setMaximumFractionDigits(2);
            C36391kE.A0O(inflate, R.id.fees_rate).setText(A0N.format(C165617ti.A0b(r12.A0U.A05).divide(new BigDecimal(100))));
            AnonymousClass16U A012 = r12.A07.A01(r12.A0U.A01);
            TextView A0O3 = C36391kE.A0O(inflate, R.id.total_value);
            C18820ts r132 = r12.A00;
            AnonymousClass16V r6 = (AnonymousClass16V) A012;
            String str3 = r6.A02;
            String str4 = r6.A03;
            BigDecimal bigDecimal2 = r5.A00;
            A0O3.setText(AnonymousClass6US.A00(r132, str3, str4, bigDecimal2, bigDecimal2.scale(), false));
            CompoundButton compoundButton = (CompoundButton) C012005e.A02(inflate, R.id.send_payment_agreement_checkbox);
            if (r12.A0U != null) {
                ConfirmPaymentFragment confirmPaymentFragment = this.A05;
                boolean isChecked = compoundButton.isChecked();
                WDSButton wDSButton = confirmPaymentFragment.A0N;
                if (wDSButton != null) {
                    wDSButton.setEnabled(isChecked);
                }
            }
            compoundButton.setOnCheckedChangeListener(new C23165B7z(compoundButton, this, 0));
        }
    }

    public String BA2(C207249un r4, int i) {
        C178848hw r2 = this.A06;
        boolean A1J = C178848hw.A1J(r4, r2, r2.A0Z);
        int i2 = R.string.f12nameremoved;
        if (A1J) {
            i2 = R.string.f12nameremoved;
        }
        return r2.getString(i2);
    }

    public String BAm(C207249un r3) {
        return this.A06.A0K.A02(r3, false);
    }

    public int BBP(C207249un r3, int i) {
        if (C201659k4.A00(r3, this.A06.A0p)) {
            return R.string.f12nameremoved;
        }
        return 0;
    }

    public String BEB() {
        C178848hw r3 = this.A06;
        String A002 = AE0.A00(r3.A0M);
        if (!TextUtils.isEmpty(A002)) {
            return C36321k7.A0A(r3, A002, R.string.f12nameremoved);
        }
        return null;
    }

    public boolean BMc() {
        C175728ax r0 = this.A06.A0A;
        if (r0 == null || !r0.A0C()) {
            return false;
        }
        return true;
    }

    public void BRP(ViewGroup viewGroup) {
        C178848hw r3 = this.A06;
        boolean A45 = r3.A45();
        int i = 0;
        boolean A1V = AnonymousClass000.A1V(r3.A0X);
        if (!A45 || A1V || C201659k4.A00(r3.A0B, r3.A0p)) {
            i = 8;
        }
        viewGroup.setVisibility(i);
        PaymentDescriptionRow paymentDescriptionRow = (PaymentDescriptionRow) viewGroup.findViewById(R.id.payment_description_row);
        r3.A0L = paymentDescriptionRow;
        paymentDescriptionRow.A01(r3.A0Q);
    }

    public void BRQ(ViewGroup viewGroup) {
        C131606Ps A052;
        C178848hw r1 = this.A06;
        boolean A1J = C178848hw.A1J(r1.A0B, r1, r1.A0Z);
        Integer A0m = C36381kD.A0m();
        View inflate = r1.getLayoutInflater().inflate(R.layout.f9nameremoved, viewGroup, true);
        TextView A0O = C36391kE.A0O(inflate, R.id.text);
        if (A1J) {
            A0O.setText(R.string.f12nameremoved);
            ImageView A0G = C36401kF.A0G(inflate, R.id.icon);
            A0G.setImageResource(R.drawable.ic_close);
            C36371kC.A1F(A0G, this, this.A04, 31);
            r1.A0S.BOq((C131606Ps) null, A0m, (Integer) null, "add_credential_prompt", r1.A0f, r1.A0i, r1.A0h, false, C179148jG.A1P(r1));
            return;
        }
        A0O.setText(R.string.f12nameremoved);
        ImageView A0G2 = C36401kF.A0G(inflate, R.id.icon);
        PaymentBottomSheet paymentBottomSheet = this.A04;
        int A0I = paymentBottomSheet.A0k().A0I();
        int i = R.drawable.ic_back;
        if (A0I <= 1) {
            i = R.drawable.ic_close;
        }
        A0G2.setImageResource(i);
        if ((!C179148jG.A1P(r1) || TextUtils.isEmpty(r1.A0h)) && !r1.A0O.A0H(r1.A0D, r1.A0Z, r1.A0g)) {
            A052 = C178848hw.A1A(this.A01, this.A03, r1);
        } else {
            A052 = r1.A0S.A05(r1.A0B, C178848hw.A1A(this.A01, this.A03, r1));
        }
        AnonymousClass3YM.A00(A0G2, this, A052, paymentBottomSheet, 12);
        if (r1.A0V) {
            if (A052 == null) {
                A052 = C165567td.A0F();
            }
            C173858Tk.A0t(A052, r1);
        }
        r1.A0S.BOq(A052, A0m, (Integer) null, "payment_confirm_prompt", r1.A0f, r1.A0i, r1.A0h, false, C179148jG.A1P(r1));
    }

    public void BRS(ViewGroup viewGroup) {
        boolean z;
        C178848hw r3 = this.A06;
        if (!C178848hw.A1J(r3.A0B, r3, r3.A0Z)) {
            boolean A4f = r3.A4f();
            C207359uy r4 = null;
            boolean z2 = r3 instanceof C179048iy;
            if (!z2 && (!r3.A45())) {
                r4 = new C207359uy(this, 32);
            }
            AnonymousClass9UF r2 = r3.A0e;
            AnonymousClass141 r7 = r3.A08;
            AnonymousClass1RY r6 = r3.A0d;
            C135086c7 r8 = r3.A0G;
            C135086c7 r9 = r3.A0I;
            if (z2) {
                z = false;
            } else {
                z = true;
            }
            r2.A00(r3, r4, viewGroup, r6, r7, r8, r9, A4f, z);
        }
    }

    public void BYH(ViewGroup viewGroup, C207249un r7) {
        C178848hw r4 = this.A06;
        AnonymousClass9IL.A00(C36401kF.A0G(C36411kG.A0J(r4.getLayoutInflater(), viewGroup, R.layout.f9nameremoved), R.id.psp_logo), r4.A0N, C173858Tk.A0K(r4), r4.A0a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0.A00 != 1) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Bt5() {
        /*
            r6 = this;
            X.8hw r5 = r6.A06
            X.9k4 r4 = r5.A0N
            X.9un r3 = r5.A0B
            com.whatsapp.payments.ui.widget.PaymentView r0 = r5.A0M
            if (r0 == 0) goto L_0x0010
            int r1 = r0.A00
            r0 = 1
            r2 = 1
            if (r1 == r0) goto L_0x0011
        L_0x0010:
            r2 = 0
        L_0x0011:
            java.lang.String r1 = r5.A0Z
            boolean r0 = r5.A0t
            boolean r0 = r4.A07(r3, r1, r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AGR.Bt5():boolean");
    }

    public boolean Bt8(C207249un r2, String str, int i) {
        return C178848hw.A1J(r2, this.A06, str);
    }

    public boolean BtN(C207249un r2) {
        return !C201659k4.A00(r2, this.A06.A0p);
    }

    public int BAl() {
        return R.string.f12nameremoved;
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
}
