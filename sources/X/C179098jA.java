package X;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity;
import com.whatsapp.payments.ui.IndiaUpiForgotPinDialogFragment;
import com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity;
import com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity;
import com.whatsapp.payments.ui.IndiaUpiPinSetUpCompletedActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.PaymentMethodsListPickerFragment;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiPauseMandateViewModel;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.8jA  reason: invalid class name and case insensitive filesystem */
public abstract class C179098jA extends C179108jC implements C23080B3m, B3P, AnonymousClass4PI, C23055B2b, C22978AzU, C23030B1b {
    public AnonymousClass1Pp A00;
    public C20830yE A01;
    public AnonymousClass16T A02;
    public C207249un A03;
    public AnonymousClass16S A04;
    public C202319lY A05;
    public AnonymousClass2ZN A06;
    public AnonymousClass3EU A07;
    public AnonymousClass1XA A08;
    public PaymentBottomSheet A09 = new PaymentBottomSheet();
    public C199849g7 A0A;
    public C202699mR A0B;
    public C198629dt A0C;
    public C201529jn A0D;
    public String A0E;
    public String A0F;
    public List A0G;
    public boolean A0H;
    public boolean A0I;
    public final C61233Bb A0J = new B7G(this, 3);
    public final C24611Dc A0K = C165587tf.A0X("IndiaUpiBaseRequestPaymentActivity");

    public int BBP(C207249un r2, int i) {
        return 0;
    }

    public void BRP(ViewGroup viewGroup) {
    }

    public void BZF(PaymentBottomSheet paymentBottomSheet, List list, int i, int i2) {
    }

    public void BcV(PaymentBottomSheet paymentBottomSheet, int i, int i2) {
    }

    public void BcZ(PaymentBottomSheet paymentBottomSheet, int i) {
    }

    public void Bca(int i) {
        String str;
        if (i == 1) {
            str = "p2p";
        } else {
            str = "p2m";
        }
        this.A0p = str;
    }

    public void BjR(PaymentBottomSheet paymentBottomSheet) {
    }

    public boolean BtN(C207249un r2) {
        return true;
    }

    public /* synthetic */ void Bti(C207249un r1, PaymentMethodRow paymentMethodRow) {
    }

    public void A4L() {
        if (!this.A01.A0F()) {
            RequestPermissionActivity.A0B.A0C(this);
            return;
        }
        int A022 = this.A0D.A02();
        if (A022 == 1) {
            A35(new B8A(this, 2), R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved);
        } else if (A022 != 2) {
            C175818b6 r0 = (C175818b6) this.A03.A08;
            if (r0 == null || !"OD_UNSECURED".equals(r0.A0A) || this.A0H) {
                this.A08.A02();
            } else {
                BO5(R.string.f12nameremoved);
            }
        } else {
            C39001qm A002 = AnonymousClass3LW.A00(this);
            A002.A0d(R.string.f12nameremoved);
            A002.A0c(R.string.f12nameremoved);
            B83.A01(A002, this, 33, R.string.f12nameremoved);
            B83.A00(A002, this, 34, R.string.f12nameremoved);
            A002.A0r(false);
            A002.A0b();
        }
    }

    public void A4M(C207249un r25, HashMap hashMap) {
        C207249un r8 = r25;
        IndiaUpiPauseMandateActivity indiaUpiPauseMandateActivity = (IndiaUpiPauseMandateActivity) this;
        C202269lR r7 = indiaUpiPauseMandateActivity.A0L;
        AnonymousClass17Y r15 = indiaUpiPauseMandateActivity.A05;
        C19700wN r14 = indiaUpiPauseMandateActivity.A03;
        AnonymousClass9YX r6 = indiaUpiPauseMandateActivity.A04;
        AnonymousClass19A r5 = indiaUpiPauseMandateActivity.A0H;
        C29131Vl r4 = indiaUpiPauseMandateActivity.A0D;
        C29121Vk r3 = indiaUpiPauseMandateActivity.A0M;
        AnonymousClass8gJ r2 = indiaUpiPauseMandateActivity.A07;
        C29221Vu r1 = indiaUpiPauseMandateActivity.A0K;
        AnonymousClass19A r16 = r5;
        C202269lR r17 = r7;
        AE0 ae0 = indiaUpiPauseMandateActivity.A0M;
        C29221Vu r19 = r1;
        AnonymousClass8gS r12 = new AnonymousClass8gS(indiaUpiPauseMandateActivity, r14, r15, r16, r17, ae0, r19, r6, r3, r2, r4);
        indiaUpiPauseMandateActivity.Bu1(R.string.f12nameremoved);
        IndiaUpiPauseMandateViewModel indiaUpiPauseMandateViewModel = indiaUpiPauseMandateActivity.A05;
        long A0z = IndiaUpiPauseMandateActivity.A0z(indiaUpiPauseMandateActivity.A01);
        long A0z2 = IndiaUpiPauseMandateActivity.A0z(indiaUpiPauseMandateActivity.A00);
        String str = indiaUpiPauseMandateActivity.A06;
        if (r25 == null) {
            r8 = indiaUpiPauseMandateViewModel.A00;
        }
        C202319lY r9 = indiaUpiPauseMandateViewModel.A01;
        C147226ws r142 = new C147226ws(indiaUpiPauseMandateViewModel, A0z, A0z2);
        Log.i("PAY: pausePayeeMandate called");
        ArrayList A0I2 = AnonymousClass001.A0I();
        C36381kD.A1M("action", "upi-pause-mandate", A0I2);
        AnonymousClass8gS.A01(r9, r12, A0I2);
        C175928bI r10 = (C175928bI) r9.A0A;
        C18740tg.A06(r10);
        AnonymousClass8gS.A02((C201459je) null, r10, str, A0I2, true);
        AnonymousClass8gS.A00(r8, r12, "upi-pause-mandate", hashMap, A0I2);
        C203399nx[] A032 = AnonymousClass8gS.A03(r9, r12);
        C165597tg.A1I("pause-start-ts", A0I2, A0z / 1000);
        C165597tg.A1I("pause-end-ts", A0I2, A0z2 / 1000);
        C36381kD.A1M("receiver-name", C165577te.A0k(r10.A0A), A0I2);
        AnonymousClass8gJ r13 = r12.A07;
        if (r13 != null) {
            r13.A00("U66", A0I2);
        }
        AnonymousClass9YX A042 = AnonymousClass9I1.A04(r12, "upi-pause-mandate");
        r12.A01.A0H(new B7M(r12.A00, r12.A02, r12.A06, A042, (C22963AzF) r142, r12, 7), C203399nx.A05("account", C165577te.A1a(A0I2, 0), A032), "set", 0);
    }

    public void A4N(PaymentBottomSheet paymentBottomSheet) {
        ConfirmPaymentFragment A002 = ConfirmPaymentFragment.A00(this.A03, (UserJid) null, (C206349tD) null, this.A0p, this.A0Z, this.A0H ^ true ? 1 : 0);
        A002.A0I = this;
        A002.A0J = this;
        paymentBottomSheet.A02 = A002;
        Btl(paymentBottomSheet, "ConfirmPaymentFragment");
    }

    public void A4O(PaymentBottomSheet paymentBottomSheet) {
        paymentBottomSheet.A02 = C165607th.A0d(this.A03, this);
        Btl(paymentBottomSheet, "IndiaUpiPinPrimerDialogFragment");
    }

    public void A4P(PaymentBottomSheet paymentBottomSheet) {
        C207249un r2 = this.A03;
        Bundle A072 = AnonymousClass001.A07();
        A072.putParcelable("extra_bank_account", r2);
        IndiaUpiForgotPinDialogFragment indiaUpiForgotPinDialogFragment = new IndiaUpiForgotPinDialogFragment();
        indiaUpiForgotPinDialogFragment.A17(A072);
        indiaUpiForgotPinDialogFragment.A07 = this;
        paymentBottomSheet.A02 = indiaUpiForgotPinDialogFragment;
        Btl(paymentBottomSheet, "IndiaUpiForgotPinDialogFragment");
    }

    public void A4Q(PaymentBottomSheet paymentBottomSheet, String str) {
        if (this instanceof IndiaUpiMandatePaymentActivity) {
            paymentBottomSheet.A01 = null;
        }
        A3D(str);
    }

    public void B1W(ViewGroup viewGroup) {
        C201599jw r4;
        String A052;
        if (this instanceof IndiaUpiMandatePaymentActivity) {
            IndiaUpiMandatePaymentActivity indiaUpiMandatePaymentActivity = (IndiaUpiMandatePaymentActivity) this;
            View A0J2 = C36411kG.A0J(indiaUpiMandatePaymentActivity.getLayoutInflater(), viewGroup, R.layout.f9nameremoved);
            View A022 = C012005e.A02(A0J2, R.id.start_date_label);
            TextView A0O = C36391kE.A0O(A0J2, R.id.start_date_value);
            TextView A0O2 = C36391kE.A0O(A0J2, R.id.end_date_label);
            TextView A0O3 = C36391kE.A0O(A0J2, R.id.end_date_value);
            TextView A0O4 = C36391kE.A0O(A0J2, R.id.frequency_value);
            TextView A0O5 = C36391kE.A0O(A0J2, R.id.total_value);
            View A023 = C012005e.A02(A0J2, R.id.blurb_layout);
            C202319lY r5 = indiaUpiMandatePaymentActivity.A03.A07;
            C175708av r2 = r5.A0A;
            if ((r2 instanceof C175928bI) && (r4 = ((C175928bI) r2).A0G) != null) {
                if (C202699mR.A03(r4.A0E)) {
                    A022.setVisibility(0);
                    A0O.setVisibility(0);
                    C202699mR r22 = indiaUpiMandatePaymentActivity.A0B;
                    A0O.setText(C20040wv.A09(r22.A02, r4.A02));
                    A0O2.setText(R.string.f12nameremoved);
                    C202699mR r23 = indiaUpiMandatePaymentActivity.A0B;
                    A052 = C20040wv.A09(r23.A02, r4.A01);
                } else {
                    A022.setVisibility(8);
                    A0O.setVisibility(8);
                    A0O2.setText(R.string.f12nameremoved);
                    A052 = indiaUpiMandatePaymentActivity.A0B.A05(r4.A01);
                }
                A0O3.setText(A052);
                A0O4.setText(indiaUpiMandatePaymentActivity.A0B.A07(r4.A0E));
                A0O5.setText(indiaUpiMandatePaymentActivity.A0B.A06(r5.A08, r4.A0G));
                if (C202699mR.A03(r4.A0E)) {
                    A023.setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        View A0J3 = C36411kG.A0J(getLayoutInflater(), viewGroup, R.layout.f9nameremoved);
        if (this.A05 != null) {
            C36391kE.A0O(A0J3, R.id.amount).setText(this.A02.A01("INR").B7d(this.A00, this.A05.A08));
        }
    }

    public String BA2(C207249un r2, int i) {
        int i2;
        if (this instanceof IndiaUpiMandatePaymentActivity) {
            i2 = R.string.f12nameremoved;
        } else {
            i2 = R.string.f12nameremoved;
        }
        return getString(i2);
    }

    public String BAm(C207249un r3) {
        return this.A0A.A02(r3, false);
    }

    public String BEB() {
        C135086c7 A082 = this.A0M.A08();
        if (C202349ld.A02(A082)) {
            return null;
        }
        Object[] A0L = AnonymousClass001.A0L();
        C18740tg.A06(A082);
        Object obj = A082.A00;
        C18740tg.A06(obj);
        return C36391kE.A0v(this, obj, A0L, 0, R.string.f12nameremoved);
    }

    public boolean BMc() {
        C175728ax r0 = this.A0A;
        if (r0 == null || !r0.A0C()) {
            return false;
        }
        return true;
    }

    public void BTu() {
        this.A09.A1m();
    }

    public void BUD(View view, View view2, C207079uW r8, C175728ax r9, C207249un r10, PaymentBottomSheet paymentBottomSheet) {
        A4Q(this.A09, "ConfirmPaymentFragment");
        String[] split = this.A0P.A03().getString("payments_sent_payment_with_account", "").split(";");
        int length = split.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (split[i].equalsIgnoreCase(this.A03.A0A)) {
                this.A0I = true;
                break;
            } else {
                i++;
            }
        }
        C175818b6 r0 = (C175818b6) this.A03.A08;
        if (r0 == null || !C175818b6.A00(r0) || this.A0I) {
            A4L();
            return;
        }
        PaymentBottomSheet paymentBottomSheet2 = new PaymentBottomSheet();
        this.A09 = paymentBottomSheet2;
        A4P(paymentBottomSheet2);
    }

    public void BUb() {
        Intent A0H2 = C36441kJ.A0H(this, IndiaUpiDebitCardVerificationActivity.class);
        A0H2.putExtra("extra_bank_account", this.A03);
        A42(A0H2);
        A0H2.putExtra("extra_previous_screen", "setup_pin_prompt");
        BuO(A0H2, 1016);
    }

    public void BUe() {
        A4Q(this.A09, "IndiaUpiForgotPinDialogFragment");
        C24601Db r2 = this.A0P;
        StringBuilder A0j = C165587tf.A0j(r2);
        A0j.append(";");
        r2.A0M(AnonymousClass000.A0q(this.A03.A0A, A0j));
        this.A0I = true;
        A4L();
    }

    public void BYH(ViewGroup viewGroup, C207249un r6) {
        boolean z = this instanceof IndiaUpiMandatePaymentActivity;
        LayoutInflater layoutInflater = getLayoutInflater();
        if (z) {
            AnonymousClass9IL.A00(C36401kF.A0G(C36411kG.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved), R.id.psp_logo), this.A0C, C173858Tk.A0K(this), (String) null);
        } else {
            AnonymousClass9IL.A00(C36401kF.A0G(C36411kG.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved), R.id.psp_logo), this.A0C, C173858Tk.A0K(this), (String) null);
        }
    }

    public void BYK() {
        Intent A0z = IndiaUpiPinPrimerFullSheetActivity.A0z(this, (C175748az) this.A03, this.A0a, true);
        A42(A0z);
        BuO(A0z, 1017);
    }

    public void BYL() {
        this.A09.A1m();
    }

    public void BcO(PaymentBottomSheet paymentBottomSheet, int i) {
        PaymentMethodsListPickerFragment A002 = PaymentMethodsListPickerFragment.A00(this.A0G);
        A002.A07 = new C202739mZ(this, 1);
        A002.A04 = this;
        A002.A0y(paymentBottomSheet.A02, 0);
        paymentBottomSheet.A1n(A002);
    }

    public void BcS(C207249un r2, PaymentMethodRow paymentMethodRow) {
        if (this instanceof IndiaUpiMandatePaymentActivity) {
            this.A03 = r2;
        }
    }

    public void BfK(boolean z) {
        if (z) {
            A4N(this.A09);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        PaymentBottomSheet paymentBottomSheet;
        String str;
        if (i != 155) {
            switch (i) {
                case 1015:
                    return;
                case 1016:
                    if (i2 == -1 && intent != null) {
                        C207249un r0 = (C207249un) intent.getParcelableExtra("extra_bank_account");
                        if (r0 != null) {
                            this.A03 = r0;
                        }
                        C24601Db r2 = this.A0P;
                        StringBuilder A0j = C165587tf.A0j(r2);
                        A0j.append(";");
                        r2.A0M(AnonymousClass000.A0q(this.A03.A0A, A0j));
                        paymentBottomSheet = this.A09;
                        str = "IndiaUpiPinPrimerDialogFragment";
                        break;
                    } else {
                        return;
                    }
                    break;
                case 1017:
                    if (i2 == -1) {
                        C24601Db r22 = this.A0P;
                        StringBuilder A0j2 = C165587tf.A0j(r22);
                        A0j2.append(";");
                        r22.A0M(AnonymousClass000.A0q(this.A03.A0A, A0j2));
                        paymentBottomSheet = this.A09;
                        str = "IndiaUpiForgotPinDialogFragment";
                        break;
                    } else {
                        return;
                    }
                case 1018:
                    if (TextUtils.isEmpty(this.A0E)) {
                        Bu1(R.string.f12nameremoved);
                        A12(this.A05, this);
                        return;
                    }
                    A4N(this.A09);
                    return;
                default:
                    super.onActivityResult(i, i2, intent);
                    return;
            }
            A4Q(paymentBottomSheet, str);
            Intent A0I2 = C165577te.A0I(this, this.A03, IndiaUpiPinSetUpCompletedActivity.class);
            A0I2.putExtra("on_settings_page", false);
            BuO(A0I2, 1018);
        } else if (i2 == -1) {
            A4L();
        }
    }

    public Dialog onCreateDialog(int i) {
        if (i != 34) {
            return super.onCreateDialog(i);
        }
        C39001qm A002 = AnonymousClass3LW.A00(this);
        A002.A0c(R.string.f12nameremoved);
        C165587tf.A17(A002);
        A002.A00.A0V(new C23186B8u(this, 6));
        return A002.create();
    }

    public static void A12(C202319lY r3, C179098jA r4) {
        C175928bI A002 = C202319lY.A00(r3);
        String str = A002.A0O;
        if (!r4.A0D.A0E(2700) || A002.A0G == null) {
            C165587tf.A0W(r4.A0P).BFN().BxJ(C165577te.A0S(str), new AE1(r4, str));
            return;
        }
        r4.A0K.A06("skipping verifyReceiver for mandates");
        r4.A0F = str;
        r4.A0E = (String) C165577te.A0g(A002.A0A);
        r4.A4N(r4.A09);
    }

    public Intent A4K() {
        Intent A0G2 = C165597tg.A0G(this);
        A0G2.putExtra("extra_setup_mode", 2);
        A0G2.putExtra("extra_payments_entry_type", 6);
        A0G2.putExtra("extra_is_first_payment_method", true);
        A0G2.putExtra("extra_skip_value_props_display", false);
        return A0G2;
    }

    public int BAl() {
        return R.string.f12nameremoved;
    }

    public /* synthetic */ String BIS() {
        return null;
    }

    public void BRQ(ViewGroup viewGroup) {
        View A0J2 = C36411kG.A0J(getLayoutInflater(), viewGroup, R.layout.f9nameremoved);
        C36391kE.A0O(A0J2, R.id.text).setText(R.string.f12nameremoved);
        ImageView A0G2 = C36401kF.A0G(A0J2, R.id.icon);
        A0G2.setImageResource(R.drawable.ic_close);
        C207359uy.A00(A0G2, this, 9);
    }

    public void BRS(ViewGroup viewGroup) {
        View inflate = getLayoutInflater().inflate(R.layout.f9nameremoved, viewGroup, true);
        ImageView A0G2 = C36401kF.A0G(inflate, R.id.payment_recipient_profile_pic);
        TextView A0O = C36391kE.A0O(inflate, R.id.payment_recipient_name);
        TextView A0O2 = C36391kE.A0O(inflate, R.id.payment_recipient_vpa);
        C012005e.A02(inflate, R.id.expand_receiver_details_button).setVisibility(0);
        C207359uy.A00(inflate, this, 10);
        this.A00.A06(A0G2, R.drawable.avatar_contact);
        A0O.setText(this.A0E);
        C36341k9.A0s(this, A0O2, new Object[]{this.A0F}, R.string.f12nameremoved);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ea, code lost:
        if (r2.A02 == null) goto L_0x00c4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BZk(X.C202059ky r8, java.lang.String r9) {
        /*
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0058
            X.1Dc r1 = r7.A0K
            java.lang.String r0 = "onListKeys contains non empty keys"
            r1.A06(r0)
            X.9YX r1 = r7.A04
            java.lang.String r0 = "upi-get-credential"
            r1.A01(r0)
            X.9un r6 = r7.A03
            r1 = r7
            boolean r0 = r7 instanceof com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity
            if (r0 == 0) goto L_0x0071
            com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity r1 = (com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity) r1
            com.whatsapp.payments.ui.viewmodel.IndiaUpiPauseMandateViewModel r5 = r1.A05
            if (r6 != 0) goto L_0x0023
            X.9un r6 = r5.A00
        L_0x0023:
            X.9lY r4 = r5.A01
            X.8av r3 = r4.A0A
            X.8bI r3 = (X.C175928bI) r3
            X.8bF r2 = r6.A08
            X.C18740tg.A06(r2)
            X.8b6 r2 = (X.C175818b6) r2
            r0 = 0
            X.9OA r1 = new X.9OA
            r1.<init>(r0)
            r1.A06 = r9
            java.lang.String r0 = r6.A0B
            r1.A05 = r0
            X.6c7 r0 = r2.A07
            r1.A02 = r0
            r1.A03 = r3
            X.6c7 r0 = r6.A09
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = (java.lang.String) r0
            r1.A08 = r0
            java.lang.String r0 = r3.A0O
            r1.A07 = r0
            X.16X r0 = r4.A08
            r1.A01 = r0
            X.1Rs r0 = r5.A02
            r0.A0D(r1)
        L_0x0057:
            return
        L_0x0058:
            if (r8 == 0) goto L_0x0057
            int r2 = r8.A00
            r0 = 0
            java.lang.String r1 = "upi-list-keys"
            boolean r0 = X.AEA.A02(r7, r1, r2, r0)
            if (r0 != 0) goto L_0x0057
            X.9YX r0 = r7.A04
            boolean r0 = r0.A05(r1)
            if (r0 == 0) goto L_0x00ed
            X.C173858Tk.A0w(r7)
            return
        L_0x0071:
            com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity r1 = (com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity) r1
            X.7yZ r3 = r1.A03
            if (r6 != 0) goto L_0x0079
            X.9un r6 = r3.A05
        L_0x0079:
            X.9lY r4 = r3.A07
            X.8av r5 = r4.A0A
            X.8bI r5 = (X.C175928bI) r5
            X.8bF r2 = r6.A08
            X.1Dc r1 = r3.A0L
            java.lang.String r0 = "onListKeys: Cannot get IndiaUpiMethodData"
            X.8b6 r1 = X.C165597tg.A0Q(r1, r2, r0)
            r0 = 0
            X.9OX r2 = new X.9OX
            r2.<init>(r0)
            r2.A0A = r9
            java.lang.String r0 = r6.A0B
            r2.A09 = r0
            X.6c7 r0 = r1.A07
            r2.A04 = r0
            r2.A05 = r5
            X.6c7 r0 = r6.A09
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = (java.lang.String) r0
            r2.A0C = r0
            java.lang.String r0 = r5.A0O
            r2.A0B = r0
            r0 = 8
            int r1 = r3.A00
            if (r0 == r1) goto L_0x00ce
            r0 = 1
            if (r0 == r1) goto L_0x00ce
            r0 = 4
            if (r0 == r1) goto L_0x00ce
            r0 = 9
            if (r0 == r1) goto L_0x00ce
            r0 = 7
            if (r0 == r1) goto L_0x00ce
            r0 = 3
            if (r0 == r1) goto L_0x00c0
            r0 = 6
            if (r0 != r1) goto L_0x00c8
        L_0x00c0:
            java.lang.String r0 = r3.A0A
            r5.A0S = r0
        L_0x00c4:
            X.16X r0 = r4.A08
            r2.A02 = r0
        L_0x00c8:
            X.1Rs r0 = r3.A09
            r0.A0D(r2)
            return
        L_0x00ce:
            X.9jw r0 = r5.A0G
            if (r0 == 0) goto L_0x00e8
            X.9je r1 = r0.A0C
            if (r1 == 0) goto L_0x00e8
            X.6c7 r0 = r1.A04
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = (java.lang.String) r0
            r5.A0S = r0
            X.6c7 r0 = r1.A03
            if (r0 == 0) goto L_0x00e8
            X.16X r0 = r1.A00()
            r2.A02 = r0
        L_0x00e8:
            X.16X r0 = r2.A02
            if (r0 != 0) goto L_0x00c8
            goto L_0x00c4
        L_0x00ed:
            X.1Dc r2 = r7.A0K
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.Integer r0 = X.C173858Tk.A0I(r9, r1)
            r1.append(r0)
            java.lang.String r0 = " failed; ; showErrorAndFinish"
            X.C165567td.A18(r2, r0, r1)
            r7.A4D()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C179098jA.BZk(X.9ky, java.lang.String):void");
    }

    public /* synthetic */ boolean Bt5() {
        return false;
    }

    public /* synthetic */ boolean BtO() {
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A06.registerObserver(this.A0J);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A06.unregisterObserver(this.A0J);
    }

    public /* synthetic */ int BA1(C207249un r2) {
        return 0;
    }

    public void BcR(C207249un r1) {
        this.A03 = r1;
    }

    public /* synthetic */ boolean Bt8(C207249un r2, String str, int i) {
        return false;
    }
}
