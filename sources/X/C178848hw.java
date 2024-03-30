package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.CheckFirstTransaction;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.IndiaUpiAccountTypeSelectionFragment;
import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity;
import com.whatsapp.payments.ui.IndiaUpiForgotPinDialogFragment;
import com.whatsapp.payments.ui.IndiaUpiInterOpHybridActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentMethodSelectionActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity;
import com.whatsapp.payments.ui.IndiaUpiPinSetUpCompletedActivity;
import com.whatsapp.payments.ui.IndiaUpiQuickBuyActivity;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.payments.ui.IndiaWebViewUpiP2mHybridActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.payments.ui.widget.PaymentDescriptionRow;
import com.whatsapp.payments.ui.widget.PaymentView;
import com.whatsapp.util.Log;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.8hw  reason: invalid class name and case insensitive filesystem */
public abstract class C178848hw extends C179078j2 implements B1N, C23055B2b, C23030B1b, C22826Awb {
    public int A00;
    public AnonymousClass1Pp A01;
    public C27731Pn A02;
    public C20830yE A03;
    public AnonymousClass12O A04;
    public AnonymousClass16U A05;
    public AnonymousClass16X A06;
    public AnonymousClass16T A07;
    public C146506vi A08;
    public CheckFirstTransaction A09;
    public AnonymousClass2ZN A0A;
    public C202939my A0B;
    public AnonymousClass1XA A0C;
    public AnonymousClass8gO A0D;
    public AnonymousClass8gL A0E;
    public C193619Me A0F;
    public C199799fz A0G;
    public AnonymousClass9RU A0H;
    public C198199d4 A0I;
    public C183418ql A0J;
    public C199849g7 A0K;
    public PaymentDescriptionRow A0L;
    public PaymentView A0M;
    public C198629dt A0N;
    public C201529jn A0O;
    public String A0P;
    public String A0Q = "";
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U = null;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public C199059ed A0b;
    public boolean A0c;
    public AnonymousClass1RY A0d;
    public AnonymousClass9UF A0e;
    public String A0f;
    public final C24611Dc A0g = C165607th.A0a("IndiaUpiPaymentActivity");
    public final C61233Bb A0h = new B7G(this, 4);
    public final String[] A0i = {"payments_camera", "payments_camera_gallery", "main_qr_code_camera", "main_qr_code_gallery"};

    public void A3m(Bundle bundle) {
        this.A0I = null;
        this.A0h = null;
        super.A3m(bundle);
    }

    public C199359fB A4K(AnonymousClass16X r5, int i) {
        C198299dE r2;
        if (i == 0 && (r2 = this.A0T.A01().A01) != null) {
            if (r5.A00.compareTo(r2.A09.A00.A02.A00) >= 0) {
                return r2.A08;
            }
        }
        return null;
    }

    public void A4W(C207249un r1, C207119ua r2, PaymentBottomSheet paymentBottomSheet) {
    }

    public void A4X(C175698au r8, C175698au r9, C202059ky r10, String str, String str2, boolean z) {
        String str3;
        boolean z2;
        int i;
        boolean z3 = true;
        boolean A1V = AnonymousClass000.A1V(r8);
        boolean A1V2 = AnonymousClass000.A1V(r9);
        C176658cT A022 = this.A0S.A02(r10, 21);
        if (r10 == null) {
            if (A1V) {
                i = 3;
            } else if (A1V2) {
                i = 4;
            }
            A022.A0D = Integer.valueOf(i);
        }
        C175898bF r0 = this.A0B.A08;
        if (r0 != null) {
            str3 = ((C175818b6) r0).A0B;
        } else {
            str3 = "";
        }
        A022.A0O = str3;
        C24611Dc r2 = this.A0g;
        C165567td.A16(r2, A022, "PaymentWamEvent checkpin event:", AnonymousClass000.A0u());
        A022.A0b = "precheck";
        C173858Tk.A0r(A022, this);
        if (r10 == null && r8 == null && r9 == null && str != null) {
            r2.A06("onPrecheck success, sending payment");
            this.A0o = str;
            this.A0U = str2;
            if (A1K(this)) {
                this.A0Y = true;
                if (this.A0W) {
                    Intent A0H2 = C36441kJ.A0H(this, IndiaUpiPaymentSettingsActivity.class);
                    A1F(A0H2, this);
                    finish();
                    startActivity(A0H2);
                    return;
                }
                return;
            }
            this.A09.A00.A0A(new C23211B9t(0, this, z));
            return;
        }
        Bnv();
        this.A0Z = false;
        if (r10 == null) {
            if (r9 != null) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("onPrecheck received receiver vpa update: jid: ");
                A0u.append(r9.A04);
                A0u.append("vpa: ");
                A0u.append(r9.A01);
                A0u.append("vpaId: ");
                C165567td.A18(r2, r9.A02, A0u);
                this.A0G = r9.A04;
                this.A0I = r9.A01;
                this.A0h = r9.A02;
                z2 = !A4g(r9);
            } else {
                z2 = false;
            }
            if (r8 != null) {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("onPrecheck received sender vpa update: jid");
                A0u2.append(r8.A04);
                A0u2.append("vpa: ");
                A0u2.append(r8.A01);
                A0u2.append("vpaId: ");
                C165567td.A18(r2, r8.A02, A0u2);
            } else if (z2) {
                z3 = false;
            } else {
                return;
            }
            Bnv();
            C39001qm A002 = AnonymousClass3LW.A00(this);
            int i2 = R.string.f12nameremoved;
            if (z3) {
                i2 = R.string.f12nameremoved;
            }
            A002.A0c(i2);
            B84.A00(A002, this, 2, R.string.f12nameremoved);
            B84.A01(A002, this, 3, R.string.f12nameremoved);
            A002.A0b();
            return;
        }
        int i3 = r10.A00;
        if (i3 == 2896004 || i3 == 2896003) {
            C203049nB.A04(C203049nB.A01(this.A07, (AnonymousClass16X) null, this.A0U, (String) null, false), this.A0S, "incentive_unavailable", "payment_confirm_prompt");
            this.A01 = 7;
            A3s((String) null);
            this.A0E = false;
            this.A0B.A06(this, (DialogInterface.OnDismissListener) null, new C23186B8u(this, 14), (DialogInterface.OnDismissListener) null, (String) null, r10.A00).show();
            return;
        }
        C199059ed r4 = this.A0b;
        C195089Sl r22 = new C195089Sl("pay-precheck");
        UserJid userJid = this.A0E;
        r22.A05 = true;
        r22.A01 = userJid;
        r22.A06 = true;
        r22.A02 = (String) C165577te.A0g(this.A0G);
        r4.A01(this, r10, r22.A00(), "pay-precheck");
    }

    private AnonymousClass0FM A19(Bundle bundle) {
        this.A0S.A09(0, 51, "payment_confirm_prompt", this.A0f, this.A0i, this.A0h, C179148jG.A1P(this));
        C39001qm A002 = AnonymousClass3LW.A00(this);
        A002.A0d(R.string.f12nameremoved);
        B84.A00(A002, this, 6, R.string.f12nameremoved);
        A002.A0r(false);
        if (bundle != null) {
            A002.A0Z(this.A09.A02(bundle, getString(R.string.f12nameremoved)));
        }
        return A002.create();
    }

    public static C131606Ps A1A(AnonymousClass16X r3, AnonymousClass6O3 r4, C178848hw r5) {
        if (C202349ld.A02(r5.A0F) || !r5.A0W.A0i(r5.A0G)) {
            return C203049nB.A01(r5.A07, r3, r4, (String) null, true);
        }
        return C178558gj.A00();
    }

    public static String A1B(C178848hw r2) {
        C135086c7 r0;
        if (!C202349ld.A02(r2.A0G)) {
            r0 = r2.A0G;
        } else if (r2.A08 != null && !r2.A45()) {
            return r2.A06.A0M(r2.A08);
        } else {
            r0 = r2.A0I;
        }
        return (String) C165577te.A0g(r0);
    }

    public static String A1C(C178848hw r4) {
        if (!TextUtils.isEmpty(r4.A0X)) {
            C24611Dc r2 = r4.A0g;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("getSeqNum/incomingPayRequestId");
            C165567td.A18(r2, r4.A0X, A0u);
            return r4.A0X;
        } else if (!TextUtils.isEmpty(r4.A0o)) {
            C24611Dc r22 = r4.A0g;
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("getSeqNum/transactionId");
            C165567td.A18(r22, r4.A0o, A0u2);
            return r4.A0o;
        } else {
            String A0J2 = C173858Tk.A0J(r4);
            C24611Dc r23 = r4.A0g;
            StringBuilder A0u3 = AnonymousClass000.A0u();
            A0u3.append("getSeqNum/seqNum generated:");
            C165567td.A18(r23, C200449hQ.A00(A0J2), A0u3);
            return A0J2;
        }
    }

    private void A1D() {
        if (!this.A03.A0F()) {
            this.A0V.A05("request_phone_number_permission", this.A00);
            RequestPermissionActivity.A0B.A0C(this);
            return;
        }
        int A022 = this.A0O.A02();
        if (A022 == 1) {
            A35(new B8A(this, 3), R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved);
        } else if (A022 != 2) {
            C175818b6 r0 = (C175818b6) this.A0B.A08;
            if (r0 == null || !"OD_UNSECURED".equals(r0.A0A) || this.A0n) {
                this.A04.A00("pay-entry-ui");
                Bu1(R.string.f12nameremoved);
                this.A0E = true;
                if (A1K(this)) {
                    A1E();
                    A4c(A4K(this.A09, this.A01), false);
                    this.A0Z = true;
                }
                this.A08.A02();
                return;
            }
            BO5(R.string.f12nameremoved);
        } else {
            C39001qm A002 = AnonymousClass3LW.A00(this);
            A002.A0d(R.string.f12nameremoved);
            A002.A0c(R.string.f12nameremoved);
            B84.A00(A002, this, 4, R.string.f12nameremoved);
            B84.A01(A002, this, 5, R.string.f12nameremoved);
            A002.A0r(false);
            A002.A0b();
        }
    }

    private void A1E() {
        C175898bF r1 = this.A0B.A08;
        C24611Dc r2 = this.A0g;
        C175818b6 A0Q2 = C165597tg.A0Q(r2, r1, "onListKeys: Cannot get IndiaUpiMethodData");
        this.A0O.A0S = A1C(this);
        C175928bI r12 = this.A0O;
        r12.A0J = this.A0H;
        r12.A0Q = AE0.A00(this.A0M);
        this.A0O.A0R = this.A0M.A0E();
        C135086c7 r0 = this.A0I;
        if (r0 == null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("vpa is null, while fetching list-keys, vpaId: ");
            C165567td.A18(r2, this.A0h, A0u);
        } else {
            this.A0O.A0O = C165577te.A0k(r0);
        }
        C175928bI r22 = this.A0O;
        r22.A0M = this.A0Z;
        r22.A0N = this.A0c;
        r22.A0P = this.A0h;
        r22.A05 = C19970wo.A00(this.A07);
        this.A0O.A0C = A0Q2.A05;
    }

    public static void A1F(Intent intent, C178848hw r3) {
        r3.A0O.A0K = C165607th.A0p(r3);
        C175928bI r1 = r3.A0O;
        r1.A0U = r3.A0U;
        intent.putExtra("extra_country_transaction_data", r1);
        intent.putExtra("extra_transaction_send_amount", r3.A09);
        intent.putExtra("extra_payment_method", r3.A0B);
        intent.putExtra("extra_open_transaction_confirmation_fragment", true);
        intent.putExtra("extra_encrypted_interop_description", r3.A0R);
        C165597tg.A0z(intent, r3.A0f);
        intent.putExtra("extra_receiver_vpa", r3.A0I);
        intent.putExtra("extra_payment_upi_number", r3.A0H);
        r3.A42(intent);
    }

    public static void A1G(C207249un r3, C178848hw r4) {
        String str;
        C207249un r1 = r4.A0B;
        if (r1 != r3) {
            if (C201659k4.A00(r1, r4.A0p)) {
                str = "add_credential_prompt";
            } else {
                str = "available_payment_methods_prompt";
            }
            r4.A40(63, str);
        }
        r4.A0B = r3;
        PaymentView paymentView = r4.A0M;
        if (paymentView != null) {
            paymentView.setBankLogo(r3.A0A());
            r4.A0M.setPaymentMethodText(r4.A0K.A02(r4.A0B, true));
        }
    }

    public static void A1H(C202319lY r4, C178848hw r5, boolean z) {
        String str;
        Intent A0H2 = C36441kJ.A0H(r5, IndiaUpiPaymentTransactionDetailsActivity.class);
        C202319lY.A01(A0H2, r4, r4.A0C);
        A0H2.putExtra("extra_transaction_ref", r5.A0g);
        A0H2.putExtra("extra_mapper_alias_resolved", r5.A0V);
        A0H2.putExtra("extra_receiver_platform", r5.A0P);
        if (r5.A0c) {
            A0H2.setFlags(33554432);
            A0H2.putExtra("extra_return_after_completion", true);
            str = "external_app";
        } else {
            str = r5.A0f;
        }
        A0H2.putExtra("referral_screen", str);
        A0H2.putExtra("extra_payment_flow_entry_point", r5.A01);
        if (z) {
            A0H2.setFlags(67108864);
        }
        A0H2.putExtra("extra_action_bar_display_close", true);
        r5.A33(A0H2, true);
        r5.Bnv();
        r5.A3v();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r0.A00 != 1) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A1J(X.C207249un r4, X.C178848hw r5, java.lang.String r6) {
        /*
            java.lang.String r0 = r5.A0p
            boolean r0 = X.C201659k4.A00(r4, r0)
            if (r0 != 0) goto L_0x001e
            X.9k4 r3 = r5.A0N
            com.whatsapp.payments.ui.widget.PaymentView r0 = r5.A0M
            if (r0 == 0) goto L_0x0014
            int r2 = r0.A00
            r0 = 1
            r1 = 1
            if (r2 == r0) goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            boolean r0 = r5.A0t
            boolean r1 = r3.A07(r4, r6, r1, r0)
            r0 = 0
            if (r1 == 0) goto L_0x001f
        L_0x001e:
            r0 = 1
        L_0x001f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178848hw.A1J(X.9un, X.8hw, java.lang.String):boolean");
    }

    public ConfirmPaymentFragment A4L(AnonymousClass16X r22, AnonymousClass16X r23, PaymentBottomSheet paymentBottomSheet) {
        C135066c4 r15;
        C135106c9 r11;
        AnonymousClass3T1 r14;
        Integer num;
        C79593ty A012;
        PaymentIncentiveViewModel paymentIncentiveViewModel;
        PaymentView paymentView = this.A0M;
        if (paymentView != null) {
            r15 = paymentView.getStickerIfSelected();
        } else {
            r15 = null;
        }
        if (paymentView != null) {
            r11 = paymentView.getPaymentBackground();
        } else {
            r11 = null;
        }
        if (r15 == null && r11 == null) {
            A012 = null;
        } else {
            C29951Yq r10 = this.A0S;
            AnonymousClass11F r12 = this.A0E;
            C18740tg.A06(r12);
            UserJid userJid = this.A0G;
            long j = this.A02;
            if (j != 0) {
                r14 = C36421kH.A0R(this.A0e, j);
            } else {
                r14 = null;
            }
            PaymentView paymentView2 = this.A0M;
            if (paymentView2 != null) {
                num = paymentView2.getStickerSendOrigin();
            } else {
                num = null;
            }
            A012 = r10.A01(r11, r12, userJid, r14, r15, num);
        }
        this.A08 = null;
        this.A0T = null;
        AnonymousClass16U A013 = this.A07.A01("INR");
        AnonymousClass6O3 r7 = null;
        ConfirmPaymentFragment A002 = ConfirmPaymentFragment.A00(this.A0B, (UserJid) null, (C206349tD) null, this.A0p, this.A0Z, !this.A0n ? 1 : 0);
        AnonymousClass16X r6 = r23;
        if (!(r23 != null || (paymentIncentiveViewModel = this.A0Y) == null || paymentIncentiveViewModel.A02.A04() == null)) {
            r7 = (AnonymousClass6O3) ((C121835tn) this.A0Y.A02.A04()).A01;
        }
        AnonymousClass16X r5 = r22;
        A002.A0I = new AGR(A013, r5, r6, r7, A002, this, paymentBottomSheet);
        A002.A0J = new AGV(A012, r5, r7, A002, this);
        return A002;
    }

    public void A4M() {
        int size = this.A0i.size();
        List list = this.A0i;
        if (size == 1) {
            C175818b6 r0 = (C175818b6) ((C207249un) list.get(0)).A08;
            if (r0 == null || C175818b6.A00(r0)) {
                C128166Be r4 = new C128166Be("upi_p2p_check_balance", (String) null, (Map) null);
                HashMap A0J2 = AnonymousClass001.A0J();
                A0J2.put("credential_id", ((C207249un) this.A0i.get(0)).A0A);
                this.A05.A05(0, R.string.f12nameremoved);
                ((AnonymousClass627) this.A0j.get()).A00(new C23218BAa(this, 5), new C203569oK(this, 1), r4, "available_payment_methods_prompt", A0J2);
            } else {
                AnonymousClass3SJ.A01(this, 29);
                return;
            }
        } else {
            Intent A0H2 = C36441kJ.A0H(this, IndiaUpiPaymentMethodSelectionActivity.class);
            A0H2.putExtra("bank_accounts", (Serializable) list);
            startActivityForResult(A0H2, 1015);
        }
        A40(62, "available_payment_methods_prompt");
    }

    public void A4N() {
        if (this instanceof IndiaUpiSendPaymentActivity) {
            IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = (IndiaUpiSendPaymentActivity) this;
            if (IndiaUpiSendPaymentActivity.A18(indiaUpiSendPaymentActivity)) {
                AnonymousClass16X r2 = indiaUpiSendPaymentActivity.A09;
                indiaUpiSendPaymentActivity.Bu1(R.string.f12nameremoved);
                AVb.A00(indiaUpiSendPaymentActivity.A04, indiaUpiSendPaymentActivity, r2, 46);
                return;
            }
            indiaUpiSendPaymentActivity.A0M.BcN();
        } else if (this instanceof IndiaUpiCheckOrderDetailsActivity) {
            IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = (IndiaUpiCheckOrderDetailsActivity) this;
            if (indiaUpiCheckOrderDetailsActivity.A0D.A0E(1916) && !C179148jG.A1P(indiaUpiCheckOrderDetailsActivity)) {
                C135086c7 r1 = indiaUpiCheckOrderDetailsActivity.A0I;
                if (!C202349ld.A03(r1)) {
                    IndiaUpiCheckOrderDetailsActivity.A0z(indiaUpiCheckOrderDetailsActivity.A09, indiaUpiCheckOrderDetailsActivity, (String) r1.A00);
                }
            }
        }
    }

    public void A4O() {
        AF7 af7;
        int i;
        int i2;
        String str;
        String str2;
        C131606Ps A012 = C203049nB.A01(this.A07, (AnonymousClass16X) null, this.A0U, (String) null, true);
        if (this.A0V) {
            if (A012 == null) {
                A012 = new C131606Ps((String) null, new C131606Ps[0]);
            }
            C173858Tk.A0t(A012, this);
        }
        if (this.A0F != null) {
            if (TextUtils.isEmpty(this.A0f)) {
                this.A0f = "chat";
            }
            af7 = this.A0S;
            i = 1;
            i2 = 53;
            str2 = this.A0f;
            str = "new_payment";
        } else {
            af7 = this.A0S;
            i = 0;
            i2 = null;
            if (this instanceof IndiaUpiCheckOrderDetailsActivity) {
                str = "order_details";
            } else {
                str = "new_payment";
            }
            str2 = this.A0f;
        }
        af7.BOp(A012, i, i2, str, str2);
    }

    public void A4P() {
        UserJid A0b2;
        AnonymousClass141 A012;
        AnonymousClass141 r0;
        if (this instanceof IndiaWebViewUpiP2mHybridActivity) {
            C222813r r02 = UserJid.Companion;
            UserJid A013 = C222813r.A01(getIntent().getStringExtra("extra_receiver_jid"));
            this.A0E = A013;
            this.A08 = this.A06.A01(A013);
        } else if (this instanceof IndiaUpiCheckOrderDetailsActivity) {
            IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = (IndiaUpiCheckOrderDetailsActivity) this;
            UserJid A0b3 = C36401kF.A0b(indiaUpiCheckOrderDetailsActivity.A06.A07.A00);
            indiaUpiCheckOrderDetailsActivity.A0E = A0b3;
            if (A0b3 == null || indiaUpiCheckOrderDetailsActivity.A45()) {
                r0 = null;
            } else {
                r0 = indiaUpiCheckOrderDetailsActivity.A06.A01(indiaUpiCheckOrderDetailsActivity.A0E);
            }
            indiaUpiCheckOrderDetailsActivity.A08 = r0;
        } else {
            if (this.A0E == null) {
                this.A0E = C36401kF.A0Z(getIntent(), "extra_jid");
                this.A0G = C36431kI.A0l(getIntent().getStringExtra("extra_receiver_jid"));
            }
            AnonymousClass11F r1 = this.A0E;
            if (AnonymousClass143.A0G(r1)) {
                A0b2 = this.A0G;
            } else {
                A0b2 = C36401kF.A0b(r1);
            }
            this.A0E = A0b2;
            if (A45()) {
                A012 = null;
            } else {
                A012 = this.A06.A01(this.A0E);
            }
            this.A08 = A012;
            PaymentView paymentView = this.A0M;
            if (paymentView != null) {
                String str = (String) C165577te.A0g(this.A0G);
                if (A012 != null) {
                    if (TextUtils.isEmpty(str)) {
                        str = BGY();
                    }
                    boolean A4f = A4f();
                    paymentView.A1A = str;
                    paymentView.A0E.setText(str);
                    paymentView.A06.setVisibility(C36351kA.A00(A4f ? 1 : 0));
                    paymentView.A0S.A08(paymentView.A0Q, A012);
                    return;
                }
                Object[] A0L2 = AnonymousClass001.A0L();
                Object obj = this.A0I.A00;
                C18740tg.A06(obj);
                String A0v = C36391kE.A0v(this, obj, A0L2, 0, R.string.f12nameremoved);
                PaymentView paymentView2 = this.A0M;
                boolean A4f2 = A4f();
                if (!TextUtils.isEmpty(str)) {
                    paymentView2.A1A = str;
                    paymentView2.A0F.setText(A0v);
                } else {
                    paymentView2.A1A = A0v;
                }
                paymentView2.A0E.setText(PaymentView.A01(paymentView2, paymentView2.A1A, R.string.f12nameremoved));
                paymentView2.A06.setVisibility(C36351kA.A00(A4f2 ? 1 : 0));
                paymentView2.A0R.A06(paymentView2.A0Q, R.drawable.avatar_contact);
            }
        }
    }

    public void A4Q() {
        startActivity(IndiaUpiPinPrimerFullSheetActivity.A0z(this, (C175748az) this.A0B, this.A0a, true));
        A3v();
        finish();
    }

    public void A4R(Context context) {
        if (!this.A0N.A09(C173858Tk.A0K(this)) || !C173858Tk.A0x(this)) {
            A4S(context, (String) null, false);
            return;
        }
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        paymentBottomSheet.A02 = new IndiaUpiAccountTypeSelectionFragment(new AGY(context, this, paymentBottomSheet));
        Btl(paymentBottomSheet, "IndiaUpiAccountTypeSelectionFragment");
    }

    public /* synthetic */ void A4T(AnonymousClass02E r2) {
        if (((this instanceof IndiaWebViewUpiP2mHybridActivity) || (this instanceof IndiaUpiQuickBuyActivity)) && (r2 instanceof PaymentBottomSheet)) {
            ((PaymentBottomSheet) r2).A01 = null;
        }
    }

    public /* synthetic */ void A4U(AnonymousClass02E r4) {
        PaymentBottomSheet paymentBottomSheet;
        B87 b87;
        if (this instanceof IndiaWebViewUpiP2mHybridActivity) {
            if (r4 instanceof PaymentBottomSheet) {
                paymentBottomSheet = (PaymentBottomSheet) r4;
                paymentBottomSheet.A01 = new C23186B8u(this, 20);
                b87 = new B87(this, 20);
            } else {
                return;
            }
        } else if (this instanceof IndiaUpiQuickBuyActivity) {
            C179048iy r2 = (C179048iy) this;
            if (r4 instanceof PaymentBottomSheet) {
                paymentBottomSheet = (PaymentBottomSheet) r4;
                if (!C179148jG.A1P(r2) || r2.A0A) {
                    r2.A4p(false);
                    paymentBottomSheet.A01 = new C23186B8u(r2, 19);
                    return;
                }
                paymentBottomSheet.A01 = new C23186B8u(r2, 18);
                b87 = new B87(r2, 19);
            } else {
                return;
            }
        } else {
            return;
        }
        paymentBottomSheet.A00 = b87;
    }

    public void A4V(AnonymousClass16X r16) {
        this.A0V.A05("confirm_payment", this.A00);
        AnonymousClass16X r1 = r16;
        this.A09 = r1;
        C131606Ps A1A = A1A(r1, this.A0U, this);
        int i = 47;
        if ("p2m".equals(this.A0p)) {
            i = 4;
            A1A = this.A0S.A05(this.A0B, A1A);
        }
        if (this.A0V) {
            if (A1A == null) {
                A1A = C165567td.A0F();
            }
            C173858Tk.A0t(A1A, this);
        }
        this.A0S.BOq(A1A, 1, Integer.valueOf(i), "payment_confirm_prompt", this.A0f, this.A0i, this.A0h, false, "p2m".equals(this.A0p));
        C175818b6 r6 = (C175818b6) this.A0B.A08;
        String[] split = this.A0P.A03().getString("payments_sent_payment_with_account", "").split(";");
        int length = split.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            } else if (split[i2].equalsIgnoreCase(this.A0B.A0A)) {
                this.A0X = true;
                break;
            } else {
                i2++;
            }
        }
        if (r6 == null || !Boolean.TRUE.equals(r6.A04.A00) || this.A0X) {
            A1D();
            return;
        }
        C207249un r2 = this.A0B;
        Bundle A072 = AnonymousClass001.A07();
        A072.putParcelable("extra_bank_account", r2);
        IndiaUpiForgotPinDialogFragment indiaUpiForgotPinDialogFragment = new IndiaUpiForgotPinDialogFragment();
        indiaUpiForgotPinDialogFragment.A17(A072);
        indiaUpiForgotPinDialogFragment.A07 = this;
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        paymentBottomSheet.A02 = indiaUpiForgotPinDialogFragment;
        Btl(paymentBottomSheet, "IndiaUpiForgotPinDialogFragment");
        A4U(paymentBottomSheet);
    }

    public void A4Z(C202059ky r7) {
        PaymentView paymentView;
        this.A0V.A06("network_op_error_code", (long) this.A04.A00, this.A00);
        AnonymousClass5GM r5 = this.A0V;
        int i = this.A00;
        r5.A06("error_code", (long) r7.A00, i);
        r5.A02(i, 3);
        Bnv();
        C199729fr A032 = this.A01.A03(this.A04, 0);
        if (A032.A00 == R.string.f12nameremoved && (paymentView = this.A0M) != null && paymentView.A00 == 1) {
            A032.A00 = R.string.f12nameremoved;
        }
        A4d(A032, String.valueOf(r7.A00), C90524aI.A0w());
    }

    public void A4a(C131606Ps r11, String str, int i) {
        C131606Ps r1 = r11;
        String str2 = str;
        this.A0S.BOq(r1, C36361kB.A0i(), Integer.valueOf(i), str2, this.A0f, this.A0i, this.A0h, false, C179148jG.A1P(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r4.A00(X.C36371kC.A09(r3.A07)) != 1) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r4 != null) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4b(X.AnonymousClass6O3 r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x002e
            boolean r0 = r3.A45()
            if (r0 != 0) goto L_0x0018
            int r2 = r4.A00
        L_0x000a:
            r3.A01 = r2
            r3.A0U = r4
        L_0x000e:
            X.9dE r0 = r4.A01
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = r0.A0F
        L_0x0014:
            r3.A3s(r0)
            return
        L_0x0018:
            java.lang.String r0 = r3.A0X
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x002e
            X.0wo r0 = r3.A07
            long r0 = X.C36371kC.A09(r0)
            int r1 = r4.A00(r0)
            r0 = 1
            r2 = 2
            if (r1 == r0) goto L_0x000a
        L_0x002e:
            r0 = 6
            r3.A01 = r0
            if (r4 == 0) goto L_0x0034
            goto L_0x000e
        L_0x0034:
            r0 = 0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178848hw.A4b(X.6O3):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (android.text.TextUtils.isEmpty(r0.A0X) != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4c(X.C199359fB r40, boolean r41) {
        /*
            r39 = this;
            r0 = r39
            boolean r1 = r0 instanceof com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity
            r16 = r40
            if (r1 == 0) goto L_0x004a
            boolean r1 = r0.A45()
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = r0.A0X
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r31 = 1
            if (r1 == 0) goto L_0x001a
        L_0x0018:
            r31 = 0
        L_0x001a:
            java.lang.String r2 = r0.A0Q
            X.9Me r1 = r0.A0F
            java.lang.String r1 = X.AnonymousClass972.A00(r1, r2)
            r0.A0R = r1
            if (r41 != 0) goto L_0x0093
            if (r40 != 0) goto L_0x0093
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r4 = r0.A0Y
            if (r4 == 0) goto L_0x0093
            X.1YQ r1 = r4.A06
            X.9dE r3 = r1.A02()
            X.9cl r2 = r1.A03()
            X.9Yc r1 = r4.A04
            boolean r1 = r1.A04(r3, r2)
            if (r1 == 0) goto L_0x0093
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r3 = r0.A0Y
            com.whatsapp.jid.UserJid r2 = r0.A0E
            X.0wU r1 = r3.A07
            r0 = 17
            X.C36391kE.A1S(r1, r3, r2, r0)
        L_0x0049:
            return
        L_0x004a:
            boolean r1 = r0 instanceof com.whatsapp.payments.ui.IndiaUpiInterOpHybridActivity
            if (r1 != 0) goto L_0x0049
            boolean r1 = r0 instanceof com.whatsapp.payments.ui.IndiaWebViewUpiP2mHybridActivity
            if (r1 == 0) goto L_0x00d4
            X.8iy r0 = (X.C179048iy) r0
            X.9tz r1 = r0.A0U
            r3 = 0
            if (r1 == 0) goto L_0x005b
            java.lang.String r3 = r1.A00
        L_0x005b:
            X.9RU r10 = r0.A0H
            X.9un r12 = r0.A0B
            com.whatsapp.jid.UserJid r13 = r0.A0E
            X.16X r11 = r0.A09
            java.lang.String r7 = r0.A0p
            r18 = 0
            r29 = 1
            X.8bI r15 = r0.A0O
            java.lang.String r6 = r0.A06
            long r1 = r0.A00
            java.lang.String r5 = r0.A0i
            java.lang.String r4 = r0.A07
            X.6c7 r14 = r0.A0G
            r31 = 0
            r21 = r18
            r24 = r18
            r26 = r18
            r30 = 1
            r32 = 0
            r20 = r18
            r25 = r3
            r27 = r1
            r22 = r5
            r23 = r4
            r17 = r7
            r19 = r6
            r10.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32)
            return
        L_0x0093:
            r3 = 0
            X.9tz r1 = r0.A0U
            if (r1 == 0) goto L_0x009a
            java.lang.String r3 = r1.A00
        L_0x009a:
            X.9RU r10 = r0.A0H
            X.9un r12 = r0.A0B
            com.whatsapp.jid.UserJid r13 = r0.A0E
            X.16X r11 = r0.A09
            java.lang.String r6 = r0.A0p
            java.lang.String r5 = r0.A0q
            boolean r4 = r0.A0t
            boolean r2 = r0.A0v
            X.8bI r15 = r0.A0O
            r19 = 0
            r27 = 0
            X.6c7 r14 = r0.A0G
            java.lang.String r1 = r0.A0R
            X.9k4 r0 = r0.A0N
            boolean r32 = r0.A06(r12)
            r21 = r19
            r22 = r19
            r23 = r19
            r26 = r19
            r20 = r19
            r25 = r3
            r29 = r4
            r30 = r2
            r24 = r1
            r17 = r6
            r18 = r5
            r10.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32)
            return
        L_0x00d4:
            com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity r0 = (com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity) r0
            X.9tz r1 = r0.A0U
            r9 = 0
            if (r1 == 0) goto L_0x0165
            java.lang.String r1 = r1.A00
            r18 = r1
        L_0x00df:
            boolean r1 = X.C173858Tk.A0y(r0)
            if (r1 == 0) goto L_0x00fc
            X.8bI r6 = r0.A0O
            X.9uo r1 = r6.A02
            X.C18740tg.A06(r1)
            java.lang.String r5 = r0.A05
            X.C18740tg.A06(r5)
            java.lang.String r4 = r1.A02
            long r2 = r1.A00
            X.9uo r1 = new X.9uo
            r1.<init>(r2, r5, r4)
            r6.A02 = r1
        L_0x00fc:
            X.9RU r1 = r0.A0H
            r17 = r1
            X.9un r15 = r0.A0B
            com.whatsapp.jid.UserJid r14 = r0.A0E
            X.16X r13 = r0.A09
            java.lang.String r12 = r0.A0p
            r24 = 0
            r35 = 1
            X.8bI r10 = r0.A0O
            boolean r1 = X.C173858Tk.A0y(r0)
            if (r1 == 0) goto L_0x0160
            java.lang.String r8 = r0.A05
        L_0x0116:
            boolean r1 = X.C173858Tk.A0y(r0)
            if (r1 == 0) goto L_0x0120
            X.AGg r1 = r0.A06
            java.lang.String r9 = r1.A0B
        L_0x0120:
            X.AGg r3 = r0.A06
            java.lang.String r7 = r3.A09
            long r1 = r3.A00
            java.lang.String r6 = r0.A0i
            java.lang.String r5 = r3.A0C
            java.util.List r4 = r0.A0B
            X.6c7 r3 = r0.A0G
            r37 = 0
            X.9k4 r11 = r0.A0N
            X.9un r0 = r0.A0B
            boolean r38 = r11.A06(r0)
            r36 = 1
            r22 = r16
            r23 = r12
            r25 = r8
            r26 = r9
            r27 = r7
            r28 = r6
            r29 = r5
            r30 = r24
            r31 = r18
            r32 = r4
            r33 = r1
            r19 = r14
            r20 = r3
            r21 = r10
            r16 = r17
            r17 = r13
            r18 = r15
            r16.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r36, r37, r38)
            return
        L_0x0160:
            X.AGg r1 = r0.A06
            java.lang.String r8 = r1.A0B
            goto L_0x0116
        L_0x0165:
            r18 = r9
            goto L_0x00df
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178848hw.A4c(X.9fB, boolean):void");
    }

    public boolean A4g(C175698au r13) {
        if (!r13.A03 || r13.A04) {
            return false;
        }
        Bnv();
        if (!r13.A05) {
            AnonymousClass3SJ.A01(this, 15);
            return true;
        } else if (!C173858Tk.A0x(this)) {
            Intent A0G2 = C165597tg.A0G(this);
            A0G2.putExtra("extra_setup_mode", 1);
            Jid jid = this.A0E;
            if (jid == null && (jid = r13.A04) == null) {
                Log.e("showNodalDisallowAlert, jid and contactData.jid is null");
            } else {
                A0G2.putExtra("extra_jid", jid.getRawString());
            }
            int i = 3;
            if ("payment_composer_icon".equals(this.A0f)) {
                i = 10;
            }
            C165607th.A18(A0G2, "extra_payments_entry_type", i, true, false);
            A0G2.putExtra("extra_receiver_jid", AnonymousClass143.A03(this.A0E));
            AnonymousClass3M9.A01(A0G2, "composer");
            A33(A0G2, true);
            return true;
        } else {
            C199549fV r3 = new C199549fV(this, this, this.A05, this.A0P, (C167527yC) C36441kJ.A0b(this).A00(C167527yC.class), (Runnable) null, new AVY(this, 7), true);
            if (TextUtils.isEmpty(this.A0f)) {
                this.A0f = "chat";
            }
            r3.A01(this.A0E, (C23036B1h) null, this.A0f);
            return true;
        }
    }

    public void BTu() {
        A3D("IndiaUpiPinPrimerDialogFragment");
    }

    public void BYL() {
        A3D("IndiaUpiForgotPinDialogFragment");
    }

    /* JADX WARNING: type inference failed for: r14v2, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BZk(X.C202059ky r17, java.lang.String r18) {
        /*
            r16 = this;
            r4 = r16
            X.AF7 r2 = r4.A0S
            X.9un r1 = r4.A0B
            r0 = 1
            r3 = r17
            r2.A06(r1, r3, r0)
            r7 = r18
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r14 = 0
            if (r0 != 0) goto L_0x0073
            X.1Dc r2 = r4.A0g
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "starting sendPaymentToVpa for jid: "
            r1.append(r0)
            X.11F r0 = r4.A0E
            r1.append(r0)
            java.lang.String r0 = " vpa: "
            r1.append(r0)
            X.6c7 r0 = r4.A0I
            X.C165567td.A17(r2, r0, r1)
            X.9un r0 = r4.A0B
            X.8bF r1 = r0.A08
            java.lang.String r0 = "onListKeys: Cannot get IndiaUpiMethodData"
            X.8b6 r2 = X.C165597tg.A0Q(r2, r1, r0)
            r4.A1E()
            X.9YX r1 = r4.A04
            java.lang.String r0 = "upi-get-credential"
            r1.A01(r0)
            X.9un r0 = r4.A0B
            java.lang.String r8 = r0.A0B
            X.6c7 r6 = r2.A07
            X.8bI r1 = r4.A0O
            X.16X r5 = r4.A09
            java.lang.Object r12 = X.C207249un.A06(r0)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = A1B(r4)
            X.141 r0 = r4.A08
            if (r0 == 0) goto L_0x005f
            java.lang.String r14 = X.AnonymousClass3U8.A03(r0)
        L_0x005f:
            java.lang.String r0 = r4.A0X
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r15 = 6
            if (r0 != 0) goto L_0x0069
            r15 = 5
        L_0x0069:
            java.lang.String r9 = r1.A0Q
            java.lang.String r10 = r1.A0O
            java.lang.String r11 = r1.A0S
            r4.A4G(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x0072:
            return
        L_0x0073:
            if (r17 == 0) goto L_0x0072
            int r2 = r3.A00
            r0 = 0
            java.lang.String r1 = "upi-list-keys"
            boolean r0 = X.AEA.A02(r4, r1, r2, r0)
            if (r0 != 0) goto L_0x0072
            X.9YX r0 = r4.A04
            boolean r0 = r0.A05(r1)
            if (r0 == 0) goto L_0x008c
            X.C173858Tk.A0w(r4)
            return
        L_0x008c:
            X.1Dc r2 = r4.A0g
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "onListKeys: "
            r1.append(r0)
            if (r18 == 0) goto L_0x00a1
            int r0 = r7.length()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
        L_0x00a1:
            r1.append(r14)
            java.lang.String r0 = " failed; ; showErrorAndFinish"
            X.C165567td.A18(r2, r0, r1)
            r4.A4Z(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178848hw.BZk(X.9ky, java.lang.String):void");
    }

    public void BgO(C202059ky r3) {
        throw AnonymousClass001.A0E(this.A0g.A03("onSetPin unsupported"));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 155) {
            if (i == 1000) {
                HashMap hashMap = this.A0L.A08;
                if (i2 != -1 || hashMap == null) {
                    this.A0g.A0A("REQUEST_TOS_UPDATED but found null credentialBlobs", (Throwable) null);
                } else {
                    Bnv();
                    Bu1(R.string.f12nameremoved);
                    A4c(A4K(this.A09, this.A01), false);
                    return;
                }
            } else if (i != 1001) {
                switch (i) {
                    case 1016:
                        if (i2 == -1 && intent != null) {
                            C207249un r0 = (C207249un) intent.getParcelableExtra("extra_bank_account");
                            if (r0 != null) {
                                this.A0B = r0;
                            }
                            C24601Db r3 = this.A0P;
                            StringBuilder A0j = C165587tf.A0j(r3);
                            A0j.append(";");
                            r3.A0M(AnonymousClass000.A0q(this.A0B.A0A, A0j));
                            C207249un r32 = this.A0B;
                            Intent A0H2 = C36441kJ.A0H(this, IndiaUpiPinSetUpCompletedActivity.class);
                            A0H2.putExtra("extra_bank_account", r32);
                            A0H2.putExtra("on_settings_page", false);
                            startActivity(A0H2);
                            return;
                        }
                        return;
                    case 1017:
                        if (i2 == -1) {
                            C24601Db r33 = this.A0P;
                            StringBuilder A0j2 = C165587tf.A0j(r33);
                            A0j2.append(";");
                            r33.A0M(AnonymousClass000.A0q(this.A0B.A0A, A0j2));
                            Intent A0I2 = C165577te.A0I(this, this.A0B, IndiaUpiPinSetUpCompletedActivity.class);
                            A0I2.putExtra("on_settings_page", false);
                            startActivityForResult(A0I2, 1018);
                            return;
                        }
                        return;
                    case 1018:
                        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
                        paymentBottomSheet.A02 = A4L(this.A09, this.A06, paymentBottomSheet);
                        Btl(paymentBottomSheet, String.valueOf(30));
                        return;
                    default:
                        super.onActivityResult(i, i2, intent);
                        return;
                }
            } else if (i2 == -1) {
                this.A0G = C36431kI.A0l(intent.getStringExtra("extra_receiver_jid"));
                return;
            } else if (!(i2 == 0 && this.A0G == null)) {
                return;
            }
            A3v();
            finish();
        } else if (i2 == -1) {
            A1D();
        }
    }

    public void onBackPressed() {
        String str;
        PaymentView paymentView = this.A0M;
        if (paymentView != null && paymentView.A0J()) {
            return;
        }
        if (!AnonymousClass143.A0G(this.A0E) || this.A00 != 0) {
            A3v();
            finish();
            if (this instanceof IndiaUpiCheckOrderDetailsActivity) {
                str = "order_details";
            } else {
                str = "new_payment";
            }
            A4a(C203049nB.A01(this.A07, (AnonymousClass16X) null, this.A0U, (String) null, true), str, 1);
            return;
        }
        this.A0G = null;
        A3m((Bundle) null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C165567td.A0j(this);
        this.A0A.registerObserver(this.A0h);
        this.A0d = this.A02.A05(this, "india-upi-payment-activity");
        this.A0c = getIntent().getBooleanExtra("return-after-pay", false);
        this.A05 = this.A07.A01("INR");
        AnonymousClass1Pp r1 = this.A01;
        AnonymousClass171 r10 = this.A06;
        C18820ts r9 = this.A00;
        this.A0e = new AnonymousClass9UF(r1, r10, r9);
        C20810yC r31 = this.A0D;
        AnonymousClass17Y r30 = this.A05;
        AnonymousClass19A r12 = this.A0H;
        C29131Vl r24 = this.A0D;
        C202269lR r15 = this.A0L;
        C29121Vk r122 = this.A0M;
        C29221Vu r14 = this.A0K;
        C202269lR r21 = r15;
        this.A0D = new AnonymousClass8gO(this, r30, r31, r12, r21, r14, r122, r24);
        C19970wo r13 = this.A07;
        C19730wQ r8 = this.A02;
        C19770wU r11 = this.A04;
        AnonymousClass1EU r7 = this.A0P;
        AnonymousClass12O r5 = this.A04;
        AnonymousClass16T r4 = this.A07;
        AnonymousClass1YQ r2 = this.A0T;
        C19730wQ r16 = r8;
        C19970wo r17 = r13;
        AnonymousClass12O r18 = r5;
        AnonymousClass17Y r152 = r30;
        this.A0H = new AnonymousClass9RU(new AnonymousClass8gI(this, r152, r16, r17, r18, r4, r31, r21, this.A0M, r14, r122, r7, r2, this.A0V, r24, r11), new AnonymousClass9FL(this), new AVY(this, 5));
        C20760y7 r0 = C199059ed.A0E;
        C24611Dc r82 = this.A0g;
        C24631De r72 = this.A0N;
        C195479Ul r52 = this.A06;
        AnonymousClass6PS r42 = this.A09;
        C24881Ed r3 = this.A07;
        this.A0b = new C199059ed(r10, r9, this.A06, r3, r122, r72, r52, r42, r82, this, new AnonymousClass9FM(this), r11);
        this.A0f = C165597tg.A0j(this);
        C19770wU r43 = this.A04;
        AnonymousClass1EU r32 = this.A0P;
        CheckFirstTransaction checkFirstTransaction = new CheckFirstTransaction(this.A0I, this.A0P, r32, r43);
        this.A09 = checkFirstTransaction;
        this.A06.A04(checkFirstTransaction);
    }

    public Dialog onCreateDialog(int i, Bundle bundle) {
        if (i == 33) {
            return A19(bundle);
        }
        return super.onCreateDialog(i, bundle);
    }

    public static void A1I(C202059ky r3, C178848hw r4, boolean z) {
        r4.Bnv();
        if (r3 == null) {
            r4.A3v();
            r4.A04.Boy(new AnonymousClass75B(44, (Object) r4, z));
        } else if (!AEA.A02(r4, "upi-send-to-vpa", r3.A00, false)) {
            r4.A4Z(r3);
        }
    }

    public static boolean A1K(C178848hw r2) {
        if (!Arrays.asList(r2.A0i).contains(C165597tg.A0j(r2)) || !r2.A0D.A0E(2820)) {
            return false;
        }
        return true;
    }

    public void A2x(int i) {
        if (i != R.string.f12nameremoved && i != R.string.f12nameremoved) {
            A3v();
            finish();
        }
    }

    public void A4S(Context context, String str, boolean z) {
        Intent A0G2 = C165597tg.A0G(context);
        A0G2.putExtra("extra_setup_mode", 1);
        if (context instanceof IndiaUpiCheckOrderDetailsActivity) {
            A0G2.putExtra("extra_payments_entry_type", 11);
            A0G2.putExtra("extra_order_type", this.A0i);
            A0G2.putExtra("extra_payment_config_id", this.A0h);
        } else if (context instanceof IndiaUpiInterOpHybridActivity) {
            A42(A0G2);
            A0G2.putExtra("extra_is_interop_add_payment_method", true);
            A0G2.putExtra("extra_skip_value_props_display", z);
        } else {
            A0G2.putExtra("extra_payments_entry_type", 6);
        }
        A0G2.putExtra("extra_is_first_payment_method", !C173858Tk.A0x(this));
        A0G2.putExtra("extra_skip_value_props_display", z);
        C135086c7 r1 = this.A0F;
        if (r1 != null) {
            A0G2.putExtra("extra_order_formatted_discount_amount", r1);
        }
        UserJid userJid = this.A0G;
        if (userJid != null) {
            A0G2.putExtra("extra_receiver_jid", userJid.getRawString());
        }
        C165597tg.A0z(A0G2, this.A0f);
        if (this.A0N.A08(str)) {
            A0G2.putExtra("extra_payment_method_type", "CREDIT");
            A0G2.putExtra("extra_referral_screen", "add_credit_card");
        }
        AnonymousClass3M9.A01(A0G2, "payViewAddPayment");
        startActivityForResult(A0G2, 1008);
    }

    public void A4Y(C202059ky r6) {
        Bnv();
        if (r6 == null) {
            A3v();
            AVY.A00(this.A04, this, 6);
            return;
        }
        C199059ed r4 = this.A0b;
        C195089Sl r2 = new C195089Sl("upi-accept-collect");
        String str = this.A0o;
        r2.A08 = true;
        r2.A03 = str;
        AnonymousClass16X r0 = this.A09;
        r2.A07 = true;
        r2.A00 = r0;
        r2.A09 = true;
        r2.A04 = (String) this.A0I.A00;
        r4.A01(this, r6, r2.A00(), "upi-accept-collect");
    }

    public void A4d(C199729fr r9, String str, Object... objArr) {
        String str2;
        Bnv();
        C131606Ps A012 = C203049nB.A01(this.A07, (AnonymousClass16X) null, this.A0U, (String) null, true);
        if (this instanceof IndiaUpiCheckOrderDetailsActivity) {
            str2 = "order_details";
        } else {
            str2 = "new_payment";
        }
        C203049nB.A03(A012, this.A0S, 51, str2, this.A0f, 4);
        C176658cT A042 = this.A0S.A04(4, 51, str2, this.A0f);
        A042.A0S = str;
        C173858Tk.A0r(A042, this);
        this.A0E = false;
        int i = r9.A00;
        if (i == 0) {
            i = R.string.f12nameremoved;
            r9.A00 = R.string.f12nameremoved;
        } else if (i == R.string.f12nameremoved || i == R.string.f12nameremoved || i == R.string.f12nameremoved || i == R.string.f12nameremoved || i == R.string.f12nameremoved) {
            objArr = new Object[]{BGY()};
        }
        BO9(objArr, 0, i);
    }

    public void A4e(String str) {
        Intent A082 = AnonymousClass190.A08(this);
        A082.putExtra("extra_payments_entry_type", 6);
        A082.putExtra("extra_is_first_payment_method", !C173858Tk.A0x(this));
        A082.putExtra("extra_skip_value_props_display", C173858Tk.A0x(this));
        if ("CREDIT".equals(str)) {
            A082.putExtra("extra_referral_screen", "add_credit_card");
            A082.putExtra("extra_payment_method_type", str);
        }
        startActivityForResult(A082, 1008);
    }

    public boolean A4f() {
        PaymentView paymentView;
        if (!C173858Tk.A0x(this) || (paymentView = this.A0M) == null || paymentView.A00 == 1 || (this instanceof C179048iy) || !(!A45())) {
            return false;
        }
        return true;
    }

    public void BUb() {
        A4T(getSupportFragmentManager().A0N("IndiaUpiPinPrimerDialogFragment"));
        A3D("IndiaUpiPinPrimerDialogFragment");
        Intent A0H2 = C36441kJ.A0H(this, IndiaUpiDebitCardVerificationActivity.class);
        A0H2.putExtra("extra_bank_account", this.A0B);
        A42(A0H2);
        A0H2.putExtra("extra_previous_screen", "setup_pin_prompt");
        startActivityForResult(A0H2, 1016);
    }

    public void BUe() {
        A4T(getSupportFragmentManager().A0N("IndiaUpiForgotPinDialogFragment"));
        A3D("IndiaUpiForgotPinDialogFragment");
        C24601Db r2 = this.A0P;
        StringBuilder A0j = C165587tf.A0j(r2);
        A0j.append(";");
        r2.A0M(AnonymousClass000.A0q(this.A0B.A0A, A0j));
        this.A0X = true;
        A1D();
    }

    public void BYK() {
        A4T(getSupportFragmentManager().A0N("IndiaUpiForgotPinDialogFragment"));
        A3D("IndiaUpiForgotPinDialogFragment");
        Intent A0z = IndiaUpiPinPrimerFullSheetActivity.A0z(this, (C175748az) this.A0B, this.A0a, true);
        A42(A0z);
        startActivityForResult(A0z, 1017);
    }

    public void onDestroy() {
        super.onDestroy();
        C36331k8.A1E(this.A0J);
        this.A0d.A02();
        this.A0A.unregisterObserver(this.A0h);
        C24611Dc r2 = this.A0g;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("onDestroy states: ");
        C165567td.A17(r2, this.A04, A0u);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        this.A0g.A06("action bar home");
        if (!AnonymousClass143.A0G(this.A0E) || this.A00 != 0) {
            A3v();
            finish();
            if (this instanceof IndiaUpiCheckOrderDetailsActivity) {
                str = "order_details";
            } else {
                str = "new_payment";
            }
            A40(1, str);
            return true;
        }
        this.A0G = null;
        A3m((Bundle) null);
        return true;
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A0B = (C207249un) bundle.getParcelable("paymentMethodSavedInst");
        String string = bundle.getString("extra_jid");
        C222813r r1 = UserJid.Companion;
        this.A0E = r1.A02(string);
        this.A0G = r1.A02(bundle.getString("extra_receiver_jid"));
        this.A0E = bundle.getBoolean("sending_payment");
        this.A0X = bundle.getString("extra_incoming_pay_request_id");
        this.A01 = bundle.getInt("extra_offer_eligibility_state");
        if (this.A0B != null) {
            this.A0B.A08 = (C175898bF) bundle.getParcelable("countryDataSavedInst");
        }
        C175928bI r0 = (C175928bI) bundle.getParcelable("countryTransDataSavedInst");
        if (r0 != null) {
            this.A0O = r0;
        }
        String string2 = bundle.getString("sendAmountSavedInst");
        if (string2 != null) {
            this.A09 = C165607th.A0R(this.A05, string2);
        }
        AnonymousClass16X r02 = (AnonymousClass16X) bundle.getParcelable("ExchangeAmountSavedInst");
        if (r02 != null) {
            this.A06 = r02;
        }
        this.A02 = bundle.getLong("quotedMessageRowIdSavedInst");
        this.A0j = bundle.getString("paymentNoteSavedInst");
        this.A0r = C65713Te.A03(bundle.getString("paymentNoteMentionsSavedInst"));
        this.A0I = (C135086c7) bundle.getParcelable("receiverVpaSavedInst");
        this.A0h = bundle.getString("receiverVpaIdSavedInst");
        this.A0T = bundle.getString("paymentStickerMediaJobIdSavedInst");
        PaymentView paymentView = this.A0M;
        if (paymentView != null) {
            paymentView.A1E = bundle.getString("extra_payment_preset_amount");
        } else {
            this.A0f = bundle.getString("restoredPaymentAmount");
        }
        this.A00 = bundle.getInt("flowInstanceKey");
    }

    public void onResume() {
        super.onResume();
        C24611Dc r2 = this.A0g;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("onResume states: ");
        C165567td.A17(r2, this.A04, A0u);
    }

    public void onSaveInstanceState(Bundle bundle) {
        C175898bF r1;
        super.onSaveInstanceState(bundle);
        bundle.putString("extra_jid", AnonymousClass143.A03(this.A0E));
        bundle.putString("extra_receiver_jid", AnonymousClass143.A03(this.A0G));
        bundle.putBoolean("sending_payment", this.A0E);
        bundle.putString("extra_incoming_pay_request_id", this.A0X);
        bundle.putString("extra_request_message_key", this.A0n);
        bundle.putInt("extra_offer_eligibility_state", this.A01);
        C207249un r12 = this.A0B;
        if (r12 != null) {
            bundle.putParcelable("paymentMethodSavedInst", r12);
        }
        C207249un r0 = this.A0B;
        if (!(r0 == null || (r1 = r0.A08) == null)) {
            bundle.putParcelable("countryDataSavedInst", r1);
        }
        C175928bI r13 = this.A0O;
        if (r13 != null) {
            bundle.putParcelable("countryTransDataSavedInst", r13);
        }
        AnonymousClass16X r02 = this.A09;
        if (r02 != null) {
            bundle.putString("sendAmountSavedInst", r02.A00.toString());
        }
        AnonymousClass16X r14 = this.A06;
        if (r14 != null) {
            bundle.putParcelable("ExchangeAmountSavedInst", r14);
        }
        long j = this.A02;
        if (j != 0) {
            bundle.putLong("quotedMessageRowIdSavedInst", j);
        }
        C135086c7 r15 = this.A0I;
        if (!C202349ld.A03(r15)) {
            bundle.putParcelable("receiverVpaSavedInst", r15);
        }
        String str = this.A0h;
        if (str != null) {
            bundle.putString("receiverVpaIdSavedInst", str);
        }
        String str2 = this.A0T;
        if (str2 != null) {
            bundle.putString("paymentStickerMediaJobIdSavedInst", str2);
        }
        PaymentView paymentView = this.A0M;
        if (paymentView != null) {
            String A0n = C36361kB.A0n(paymentView.A0r);
            paymentView.A1E = A0n;
            paymentView.A1B = A0n;
            bundle.putString("extra_payment_preset_amount", A0n);
            bundle.putString("paymentNoteSavedInst", this.A0M.getPaymentNote());
            bundle.putString("paymentNoteMentionsSavedInst", C65713Te.A01(this.A0M.getMentionedJids()));
            bundle.putString("restoredPaymentAmount", this.A0M.getPaymentAmountString());
        }
        bundle.putInt("flowInstanceKey", this.A00);
    }

    public Dialog onCreateDialog(int i) {
        C39001qm r4;
        int i2;
        C39001qm A002;
        int i3;
        int i4;
        if (i != 15) {
            if (i == 22) {
                r4 = AnonymousClass3LW.A00(this);
                r4.A0p(C36341k9.A0e(this, new Object[1], R.string.f12nameremoved, 0, R.string.f12nameremoved));
                i3 = R.string.f12nameremoved;
                i4 = 46;
            } else if (i == 26) {
                BigDecimal bigDecimal = new BigDecimal(this.A06.A04(C21100yf.A1k));
                r4 = AnonymousClass3LW.A00(this);
                C165587tf.A0t(this, r4, new Object[]{AnonymousClass16W.A05.B7e(this.A00, bigDecimal)}, R.string.f12nameremoved);
                i3 = R.string.f12nameremoved;
                i4 = 42;
            } else if (i == 33) {
                return A19((Bundle) null);
            } else {
                if (i != 34) {
                    switch (i) {
                        case 10:
                            A002 = AnonymousClass3LW.A00(this);
                            A002.A0c(R.string.f12nameremoved);
                            A002.A0g(new B83(this, 48), R.string.f12nameremoved);
                            B83.A00(A002, this, 49, R.string.f12nameremoved);
                            B84.A00(A002, this, 0, R.string.f12nameremoved);
                            A002.A0r(true);
                            i2 = 17;
                            break;
                        case 11:
                            A002 = AnonymousClass3LW.A00(this);
                            A002.A0c(R.string.f12nameremoved);
                            B84.A00(A002, this, 1, R.string.f12nameremoved);
                            B84.A01(A002, this, 7, R.string.f12nameremoved);
                            A002.A0r(true);
                            i2 = 13;
                            break;
                        case 12:
                            A002 = AnonymousClass3LW.A00(this);
                            A002.A0c(R.string.f12nameremoved);
                            B84.A00(A002, this, 8, R.string.f12nameremoved);
                            B83.A00(A002, this, 41, R.string.f12nameremoved);
                            A002.A0r(true);
                            i2 = 14;
                            break;
                        case 13:
                            this.A0M.A0G();
                            A002 = AnonymousClass3LW.A00(this);
                            A002.A0c(R.string.f12nameremoved);
                            B83.A01(A002, this, 43, R.string.f12nameremoved);
                            B83.A00(A002, this, 44, R.string.f12nameremoved);
                            A002.A0r(true);
                            i2 = 15;
                            break;
                        default:
                            return super.onCreateDialog(i);
                    }
                } else {
                    r4 = AnonymousClass3LW.A00(this);
                    r4.A0c(R.string.f12nameremoved);
                    B83.A01(r4, this, 47, R.string.f12nameremoved);
                    r4.A0r(true);
                    return r4.create();
                }
            }
            B83.A01(r4, this, i4, i3);
            r4.A0r(false);
            return r4.create();
        }
        A002 = AnonymousClass3LW.A00(this);
        C165587tf.A0t(this, A002, new Object[]{this.A06.A0M(this.A08)}, R.string.f12nameremoved);
        B83.A01(A002, this, 45, R.string.f12nameremoved);
        A002.A0r(false);
        i2 = 16;
        B87.A00(r4, this, i2);
        return r4.create();
    }
}
