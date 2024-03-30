package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass02E;
import X.AnonymousClass1EU;
import X.AnonymousClass1EV;
import X.B3P;
import X.C012005e;
import X.C165617ti;
import X.C175728ax;
import X.C175758b0;
import X.C175858bB;
import X.C175898bF;
import X.C18740tg;
import X.C18820ts;
import X.C199849g7;
import X.C203449o2;
import X.C206349tD;
import X.C207249un;
import X.C20810yC;
import X.C22978AzU;
import X.C23080B3m;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36431kI;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

public class ConfirmPaymentFragment extends Hilt_ConfirmPaymentFragment implements C22978AzU {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public ViewGroup A04;
    public FrameLayout A05;
    public FrameLayout A06;
    public ProgressBar A07;
    public TextView A08;
    public TextView A09;
    public WaTextView A0A;
    public WaTextView A0B;
    public C18820ts A0C;
    public C175728ax A0D;
    public C207249un A0E;
    public C20810yC A0F;
    public AnonymousClass1EV A0G;
    public AnonymousClass1EU A0H;
    public C23080B3m A0I;
    public B3P A0J;
    public C199849g7 A0K;
    public C206349tD A0L;
    public PaymentMethodRow A0M;
    public WDSButton A0N;
    public Integer A0O;
    public String A0P;
    public String A0Q;
    public List A0R;
    public View A0S;
    public ViewGroup A0T;
    public TextView A0U;
    public WaImageView A0V;
    public WaTextView A0W;

    public static ConfirmPaymentFragment A00(C207249un r4, UserJid userJid, C206349tD r6, String str, String str2, int i) {
        ConfirmPaymentFragment confirmPaymentFragment = new ConfirmPaymentFragment();
        Bundle A072 = AnonymousClass001.A07();
        A072.putParcelable("arg_payment_method", r4);
        if (userJid != null) {
            A072.putString("arg_jid", userJid.getRawString());
        }
        A072.putInt("arg_payment_type", i);
        A072.putString("arg_transaction_type", str);
        A072.putParcelable("arg_order_payment_installment_content", r6);
        A072.putString("arg_merchant_code", str2);
        confirmPaymentFragment.A17(A072);
        return confirmPaymentFragment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.C207249un r7, com.whatsapp.payments.ui.ConfirmPaymentFragment r8, X.C206349tD r9, java.lang.Integer r10) {
        /*
            android.view.ViewGroup r0 = r8.A0T
            r1 = 8
            r0.setVisibility(r1)
            android.view.ViewGroup r0 = r8.A04
            r0.setVisibility(r1)
            X.B3m r1 = r8.A0I
            if (r1 == 0) goto L_0x0119
            int r0 = r8.A01
            java.lang.String r1 = r1.BA2(r7, r0)
            X.B3m r0 = r8.A0I
            int r2 = r0.BA1(r7)
        L_0x001c:
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0N
            r0.setText(r1)
            com.whatsapp.wds.components.button.WDSButton r1 = r8.A0N
            X.B3m r0 = r8.A0I
            boolean r0 = r0.Bt5()
            r0 = r0 ^ 1
            r1.setEnabled(r0)
            if (r2 == 0) goto L_0x0035
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0N
            r0.setIcon((int) r2)
        L_0x0035:
            if (r9 == 0) goto L_0x0112
            if (r10 == 0) goto L_0x0112
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x0112
            int r1 = r7.A09()
            r0 = 4
            if (r1 == r0) goto L_0x004b
            r0 = 6
            if (r1 != r0) goto L_0x0112
            int r0 = r8.A00
            if (r0 != 0) goto L_0x0112
        L_0x004b:
            boolean r0 = r7 instanceof X.C175798b4
            if (r0 == 0) goto L_0x0112
            X.0yC r1 = r8.A0F
            r0 = 4443(0x115b, float:6.226E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0112
            X.8b4 r7 = (X.C175798b4) r7
            int r0 = r7.A01
            java.lang.String r4 = X.C175798b4.A02(r0)
            java.util.List r1 = r9.A01
            if (r1 == 0) goto L_0x0116
            boolean r0 = X.C36401kF.A1a(r1)
            if (r0 == 0) goto L_0x0116
            java.util.Iterator r3 = r1.iterator()
        L_0x006f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0116
            java.lang.Object r2 = r3.next()
            X.9tj r2 = (X.C206639tj) r2
            java.lang.String r1 = r2.A00
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = X.C36431kI.A1D(r0, r1)
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x006f
            java.util.List r7 = r2.A01
        L_0x008b:
            r8.A0R = r7
            if (r7 == 0) goto L_0x0112
            int r6 = r10.intValue()
            X.0ts r5 = r8.A0C
            r0 = 2
            X.AnonymousClass00C.A0D(r5, r0)
            int r3 = r7.size()
            r2 = 0
        L_0x009e:
            r4 = 0
            if (r2 >= r3) goto L_0x00be
            if (r2 != r6) goto L_0x0113
            java.lang.Object r0 = r7.get(r2)
            X.9ti r0 = (X.C206629ti) r0
            X.9ua r0 = r0.A01
            if (r0 == 0) goto L_0x0113
            X.16X r0 = r0.A02
            if (r0 == 0) goto L_0x0113
            java.math.BigDecimal r1 = r0.A00
            if (r1 == 0) goto L_0x0113
            X.16U r0 = X.AnonymousClass16W.A04
            X.C18740tg.A06(r0)
            java.lang.String r4 = r0.B7e(r5, r1)
        L_0x00be:
            java.util.List r0 = r8.A0R
            java.lang.Object r0 = r0.get(r6)
            X.9ti r0 = (X.C206629ti) r0
            int r0 = r0.A00
            if (r4 == 0) goto L_0x0112
            android.content.res.Resources r5 = X.C36341k9.A0G(r8)
            r3 = 2131888207(0x7f12084f, float:1.9411043E38)
            java.lang.Object[] r1 = X.AnonymousClass001.A0M()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2 = 0
            X.C90494aF.A1H(r0, r4, r1)
            java.lang.String r1 = r5.getString(r3, r1)
            com.whatsapp.WaTextView r0 = r8.A0W
            r0.setText(r1)
            android.view.ViewGroup r0 = r8.A0T
            r0.setVisibility(r2)
            android.view.ViewGroup r0 = r8.A04
            r0.setVisibility(r2)
            X.B3m r0 = r8.A0I
            if (r0 == 0) goto L_0x0105
            java.lang.String r0 = r0.BIS()
            if (r0 == 0) goto L_0x0105
            X.B3m r0 = r8.A0I
            java.lang.String r1 = r0.BIS()
            com.whatsapp.WaTextView r0 = r8.A0B
            r0.setText(r1)
        L_0x0105:
            com.whatsapp.WaTextView r0 = r8.A0A
            r0.setText(r4)
            com.whatsapp.wds.components.button.WDSButton r1 = r8.A0N
            r0 = 2131890493(0x7f12113d, float:1.941568E38)
            r1.setText(r0)
        L_0x0112:
            return
        L_0x0113:
            int r2 = r2 + 1
            goto L_0x009e
        L_0x0116:
            r7 = 0
            goto L_0x008b
        L_0x0119:
            java.lang.String r1 = ""
            r2 = 0
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.ConfirmPaymentFragment.A03(X.9un, com.whatsapp.payments.ui.ConfirmPaymentFragment, X.9tD, java.lang.Integer):void");
    }

    public void A1Z(int i) {
        String str;
        this.A01 = i;
        this.A03.setVisibility(0);
        TextView textView = this.A0U;
        if (i == 0) {
            textView.setText(R.string.f12nameremoved);
            this.A0V.setImageResource(R.drawable.cart);
            str = "p2m";
        } else {
            textView.setText(R.string.f12nameremoved);
            this.A0V.setImageResource(R.drawable.ic_contacts_storage_usage);
            str = "p2p";
        }
        this.A0Q = str;
        B3P b3p = this.A0J;
        if (b3p != null) {
            b3p.Bca(i);
        }
    }

    public void BcR(C207249un r6) {
        boolean z;
        String str;
        int BAl;
        C175858bB r0;
        this.A0E = r6;
        C36371kC.A1F(this.A0N, this, r6, 19);
        if (r6.A09() == 6 && (r0 = (C175858bB) r6.A08) != null) {
            this.A00 = r0.A03;
        }
        C23080B3m b3m = this.A0I;
        if (b3m != null) {
            z = b3m.BtN(r6);
            if (z && (BAl = b3m.BAl()) != 0) {
                this.A0M.A01.setText(BAl);
            }
        } else {
            z = false;
        }
        this.A0M.A01.setVisibility(C36351kA.A00(z ? 1 : 0));
        C23080B3m b3m2 = this.A0I;
        String str2 = null;
        if (b3m2 != null) {
            str = b3m2.BAm(r6);
        } else {
            str = null;
        }
        PaymentMethodRow paymentMethodRow = this.A0M;
        if (TextUtils.isEmpty(str)) {
            str = this.A0K.A02(r6, true);
        }
        paymentMethodRow.A02.setText(str);
        C23080B3m b3m3 = this.A0I;
        if ((b3m3 == null || (str2 = b3m3.BEB()) == null) && !(r6 instanceof C175758b0)) {
            C175898bF r02 = r6.A08;
            C18740tg.A06(r02);
            if (!r02.A09()) {
                str2 = A0n(R.string.f12nameremoved);
            }
        }
        this.A0M.A03(str2);
        C23080B3m b3m4 = this.A0I;
        if (b3m4 == null || !b3m4.BtO()) {
            C203449o2.A07(r6, this.A0M);
        } else {
            b3m4.Bti(r6, this.A0M);
        }
        C23080B3m b3m5 = this.A0I;
        if (b3m5 != null) {
            boolean Bt8 = b3m5.Bt8(r6, this.A0P, this.A01);
            PaymentMethodRow paymentMethodRow2 = this.A0M;
            if (Bt8) {
                paymentMethodRow2.A04(false);
                this.A0M.A03(A0n(R.string.f12nameremoved));
            } else {
                paymentMethodRow2.A04(true);
            }
        }
        A03(r6, this, this.A0L, this.A0O);
        C23080B3m b3m6 = this.A0I;
        if (b3m6 != null) {
            b3m6.BRQ(this.A06);
            FrameLayout frameLayout = this.A05;
            if (frameLayout != null) {
                this.A0I.BYH(frameLayout, r6);
            }
            int BBP = this.A0I.BBP(r6, this.A01);
            TextView textView = this.A08;
            if (BBP != 0) {
                textView.setText(BBP);
            } else {
                textView.setVisibility(8);
                this.A02.setVisibility(8);
            }
            this.A0N.setEnabled(!this.A0I.Bt5());
        }
        B3P b3p = this.A0J;
        if (b3p != null) {
            b3p.BcS(r6, this.A0M);
        }
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        this.A06 = (FrameLayout) C012005e.A02(inflate, R.id.title_view);
        this.A0M = (PaymentMethodRow) C012005e.A02(inflate, R.id.payment_method_row);
        ViewGroup A0O2 = C36411kG.A0O(inflate, R.id.transaction_description_container);
        this.A0N = C36431kI.A0y(inflate, R.id.confirm_payment);
        this.A05 = (FrameLayout) C012005e.A02(inflate, R.id.footer_view);
        this.A08 = C36391kE.A0O(inflate, R.id.education);
        this.A07 = (ProgressBar) C012005e.A02(inflate, R.id.confirm_payment_progressbar);
        this.A02 = C012005e.A02(inflate, R.id.education_divider);
        inflate.findViewById(R.id.account_number_divider).setVisibility(8);
        C36341k9.A10(inflate, R.id.payment_method_account_id, 8);
        this.A0T = C36411kG.A0O(inflate, R.id.installment_container);
        this.A0W = C36401kF.A0Q(inflate, R.id.installment_content);
        this.A04 = C36411kG.A0O(inflate, R.id.amount_container);
        this.A0B = C36401kF.A0Q(inflate, R.id.total_amount_value_text);
        this.A0A = C36401kF.A0Q(inflate, R.id.due_today_value_text);
        C207249un r6 = this.A0E;
        C175898bF r4 = r6.A08;
        if ((r4 instanceof C175858bB) && r6.A09() == 6 && "p2p".equals(this.A0Q)) {
            ((C175858bB) r4).A03 = 1;
        }
        BcR(r6);
        this.A03 = C012005e.A02(inflate, R.id.payment_to_merchant_options_container);
        this.A0U = C36391kE.A0O(inflate, R.id.payment_to_merchant_options);
        this.A0V = C36431kI.A0X(inflate, R.id.payment_to_merchant_options_icon);
        this.A0S = C012005e.A02(inflate, R.id.payment_rails_container);
        this.A09 = C36391kE.A0O(inflate, R.id.payment_rails_label);
        AnonymousClass02E r62 = this.A0I;
        C36371kC.A1F(inflate.findViewById(R.id.payment_method_container), this, r62, 20);
        C36371kC.A1F(A0O2, this, r62, 21);
        C36371kC.A1F(inflate.findViewById(R.id.payment_to_merchant_options_container), this, r62, 22);
        C36371kC.A1F(inflate.findViewById(R.id.payment_rails_container), this, r62, 23);
        C36371kC.A1F(inflate.findViewById(R.id.installment_container), this, r62, 24);
        if (this.A0I != null) {
            ViewGroup A0P2 = C36411kG.A0P(inflate, R.id.contact_info_view);
            if (A0P2 != null) {
                this.A0I.BRS(A0P2);
            }
            this.A0I.BRP(A0O2);
            View findViewById = inflate.findViewById(R.id.payment_method_container);
            if (findViewById != null) {
                if (!this.A0I.Btt()) {
                    i = 8;
                }
                findViewById.setVisibility(i);
            }
            ViewGroup A0P3 = C36411kG.A0P(inflate, R.id.extra_info_view);
            if (A0P3 != null) {
                this.A0I.B1W(A0P3);
            }
        }
        return inflate;
    }

    public void A1J() {
        super.A1J();
        this.A05 = null;
    }

    public void A1L() {
        C175728ax r0;
        C23080B3m b3m;
        super.A1L();
        UserJid A0l = C36431kI.A0l(A0b().getString("arg_jid"));
        if (A0l != null) {
            r0 = C165617ti.A0O(this.A0H).A05(A0l);
        } else {
            r0 = null;
        }
        this.A0D = r0;
        int A092 = this.A0E.A09();
        View view = this.A0S;
        if (A092 == 6) {
            view.setVisibility(0);
            if (this.A0E.A08 != null) {
                int i = this.A00;
                TextView textView = this.A09;
                int i2 = R.string.f12nameremoved;
                if (i == 0) {
                    i2 = R.string.f12nameremoved;
                }
                textView.setText(i2);
            }
        } else {
            view.setVisibility(8);
        }
        if ((this.A0G.A0E() || this.A0G.A09()) && (b3m = this.A0I) != null && b3m.BMc()) {
            A1Z(this.A01);
            this.A03.setVisibility(8);
            FrameLayout frameLayout = this.A05;
            if (frameLayout != null) {
                this.A0I.BYH(frameLayout, this.A0E);
            }
        }
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        Parcelable parcelable = A0b().getParcelable("arg_payment_method");
        C18740tg.A06(parcelable);
        this.A0E = (C207249un) parcelable;
        int i = A0b().getInt("arg_payment_type");
        C18740tg.A06(Integer.valueOf(i));
        this.A01 = i;
        String string = A0b().getString("arg_transaction_type");
        C18740tg.A06(string);
        this.A0Q = string;
        this.A0L = (C206349tD) A0b().getParcelable("arg_order_payment_installment_content");
        this.A0P = A0b().getString("arg_merchant_code");
        Integer num = null;
        if (this.A0L != null) {
            num = C36381kD.A0m();
        }
        this.A0O = num;
    }
}
