package X;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiChangePinActivity;
import com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity;
import com.whatsapp.payments.ui.IndiaUpiInterOpHybridActivity;
import com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiStepUpActivity;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalDeactivationActivity;
import java.util.HashMap;

/* renamed from: X.8jC  reason: invalid class name and case insensitive filesystem */
public abstract class C179108jC extends C179118jD implements B1N, C22971AzN {
    public C18820ts A00;
    public AEA A01;
    public B2W A02 = new C21234ADq(this);
    public C195049Sg A03;
    public AnonymousClass9YX A04;
    public C24641Df A05;
    public C195479Ul A06;
    public AnonymousClass8gJ A07;
    public AnonymousClass8gR A08;
    public AnonymousClass6PS A09;
    public AFC A0A;
    public AFF A0B;
    public C194949Rw A0C;
    public C29131Vl A0D;
    public boolean A0E;
    public boolean A0F;
    public int A0G;
    public String A0H;
    public String A0I;
    public final C24611Dc A0J = C165587tf.A0X("IndiaUpiPinHandlerActivity");

    public void A4H(C175818b6 r9, String str, String str2, String str3, String str4, int i) {
        A4I(r9, str, str2, str3, str4, i, false);
    }

    public static C199729fr A1L(C179108jC r3) {
        C199729fr A032 = r3.A01.A03(r3.A04, 0);
        r3.A3w();
        if (A032.A00 == 0) {
            A032.A00 = R.string.f12nameremoved;
        }
        return A032;
    }

    public Dialog A47(C175748az r10, int i) {
        if (i == 11) {
            return A48(new AVb(this, r10, 44), getString(R.string.f12nameremoved), 11, R.string.f12nameremoved, R.string.f12nameremoved);
        } else if (i != 28) {
            return super.onCreateDialog(i);
        } else {
            C39001qm A002 = AnonymousClass3LW.A00(this);
            A002.A0c(R.string.f12nameremoved);
            B84.A00(A002, this, 15, R.string.f12nameremoved);
            return A002.create();
        }
    }

    public AnonymousClass0FM A48(Runnable runnable, String str, int i, int i2, int i3) {
        C24611Dc r2 = this.A0J;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("IndiaUpiPinHandlerActivity showMessageDialog id:");
        A0u.append(i);
        A0u.append(" message:");
        C165567td.A18(r2, str, A0u);
        C39001qm A002 = AnonymousClass3LW.A00(this);
        A002.A0p(str);
        A002.A0h(new C163307pz(this, runnable, i, 0), i2);
        A002.A0f(new B8L(this, i, 0), i3);
        A002.A0r(true);
        A002.A0e(new B81(this, i, 0));
        return A002.create();
    }

    public AnonymousClass0FM A49(Runnable runnable, String str, String str2, int i, int i2, int i3) {
        C24611Dc r2 = this.A0J;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("IndiaUpiPinHandlerActivity showMessageDialog id:");
        A0u.append(i);
        A0u.append(" message:");
        A0u.append(str2);
        A0u.append("title: ");
        C165567td.A18(r2, str, A0u);
        C39001qm A002 = AnonymousClass3LW.A00(this);
        A002.A0p(str2);
        A002.A0q(str);
        A002.A0h(new C163307pz(this, runnable, i, 1), i2);
        A002.A0f(new B8L(this, i, 1), i3);
        A002.A0r(true);
        A002.A0e(new B81(this, i, 1));
        return A002.create();
    }

    public void A4A() {
        C195049Sg r2 = this.A03;
        if (r2 != null) {
            C194949Rw r1 = this.A0C;
            if (r1.A00 == null) {
                r1.A00(new AGM(this));
            } else {
                r2.A00();
            }
        } else {
            C36331k8.A1F(new C183508qu(this, true), this.A04);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002e, code lost:
        if ((r1 instanceof X.C179008it) != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4B() {
        /*
            r1 = this;
            boolean r0 = r1 instanceof com.whatsapp.payments.ui.international.IndiaUpiInternationalDeactivationActivity
            if (r0 != 0) goto L_0x0016
            boolean r0 = r1 instanceof com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity
            if (r0 != 0) goto L_0x0016
            boolean r0 = r1 instanceof com.whatsapp.payments.ui.IndiaUpiStepUpActivity
            if (r0 != 0) goto L_0x001b
            boolean r0 = r1 instanceof X.C178848hw
            if (r0 == 0) goto L_0x001c
            r0 = 0
            r1.A0E = r0
        L_0x0013:
            r1.Bnv()
        L_0x0016:
            r0 = 19
            X.AnonymousClass3SJ.A01(r1, r0)
        L_0x001b:
            return
        L_0x001c:
            boolean r0 = r1 instanceof com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity
            if (r0 != 0) goto L_0x0013
            boolean r0 = r1 instanceof com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity
            if (r0 != 0) goto L_0x0013
            boolean r0 = r1 instanceof com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity
            if (r0 != 0) goto L_0x0013
            boolean r0 = r1 instanceof com.whatsapp.payments.ui.IndiaUpiChangePinActivity
            if (r0 != 0) goto L_0x0016
            boolean r0 = r1 instanceof X.C179008it
            if (r0 == 0) goto L_0x0013
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C179108jC.A4B():void");
    }

    public void A4D() {
        if (this instanceof IndiaUpiInternationalDeactivationActivity) {
            throw C90464aC.A0o();
        } else if (this instanceof IndiaUpiInternationalActivationActivity) {
            C39001qm A002 = AnonymousClass3LW.A00(this);
            A002.A0r(false);
            A002.A0q(getString(R.string.f12nameremoved));
            C39001qm.A02(this, A002, R.string.f12nameremoved);
            B84.A01(A002, this, 46, R.string.f12nameremoved);
            C36341k9.A11(A002);
        } else if (this instanceof IndiaUpiStepUpActivity) {
            C36331k8.A12(C199729fr.A00(this, A1L(this)), this);
        } else if (this instanceof C178848hw) {
            C178848hw r2 = (C178848hw) this;
            r2.A4Z(new C202059ky(AEA.A00(r2.A04, 0)));
        } else if (this instanceof IndiaUpiPauseMandateActivity) {
            C199729fr A1L = A1L(this);
            overridePendingTransition(0, 0);
            C36331k8.A12(C199729fr.A00(this, A1L), this);
        } else if (this instanceof IndiaUpiMandatePaymentActivity) {
            C199729fr A032 = this.A01.A03(this.A04, 0);
            A3w();
            if (A032.A00 == 0) {
                A032.A00 = R.string.f12nameremoved;
            }
            overridePendingTransition(0, 0);
            C36331k8.A12(C199729fr.A00(this, A032), this);
        } else if (this instanceof IndiaUpiCheckBalanceActivity) {
            C36331k8.A12(C199729fr.A00(this, A1L(this)), this);
        } else if (this instanceof IndiaUpiChangePinActivity) {
            C199729fr A033 = this.A01.A03(this.A04, 0);
            A3w();
            if (A033.A00 == 0) {
                A033.A00 = R.string.f12nameremoved;
            }
            BO6(A033.A01(this));
        } else if (this instanceof C179008it) {
            C179008it r3 = (C179008it) this;
            C179008it.A13(r3, r3.A01.A03(r3.A04, 0));
        } else {
            C199729fr A1L2 = A1L(this);
            C39001qm A003 = AnonymousClass3LW.A00(this);
            A003.A0p(A1L2.A01(this));
            BA8.A02(this, A003, 40, R.string.f12nameremoved);
            A003.A0r(true);
            B87.A00(A003, this, 7);
            C36341k9.A11(A003);
        }
    }

    public void A4E() {
        String str;
        UserJid userJid;
        AnonymousClass141 A012;
        UserJid userJid2;
        if (this instanceof IndiaUpiInternationalDeactivationActivity) {
            throw C90464aC.A0o();
        } else if (this instanceof IndiaUpiInternationalActivationActivity) {
            throw AnonymousClass001.A0E(((IndiaUpiInternationalActivationActivity) this).A0B.A03("showMainPaneAfterPayAppRegistered unsupported"));
        } else if (!(this instanceof IndiaUpiStepUpActivity) && !(this instanceof IndiaUpiPauseMandateActivity) && !(this instanceof IndiaUpiMandatePaymentActivity)) {
            if (this instanceof IndiaUpiSendPaymentActivity) {
                IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = (IndiaUpiSendPaymentActivity) this;
                AnonymousClass11F r1 = indiaUpiSendPaymentActivity.A0E;
                if (AnonymousClass143.A0G(r1)) {
                    userJid = indiaUpiSendPaymentActivity.A0G;
                    if (userJid == null) {
                        indiaUpiSendPaymentActivity.A3m(C36371kC.A0H(indiaUpiSendPaymentActivity));
                        return;
                    }
                } else {
                    userJid = C36401kF.A0b(r1);
                }
                indiaUpiSendPaymentActivity.A0E = userJid;
                if (indiaUpiSendPaymentActivity.A45()) {
                    A012 = null;
                } else {
                    A012 = indiaUpiSendPaymentActivity.A06.A01(indiaUpiSendPaymentActivity.A0E);
                }
                indiaUpiSendPaymentActivity.A08 = A012;
                boolean z = false;
                if (C202349ld.A02(indiaUpiSendPaymentActivity.A0I) && indiaUpiSendPaymentActivity.A0E != null) {
                    C183768rK r12 = new C183768rK(indiaUpiSendPaymentActivity, true);
                    indiaUpiSendPaymentActivity.A0A = r12;
                    C36391kE.A1Q(r12, indiaUpiSendPaymentActivity.A04);
                    indiaUpiSendPaymentActivity.Bu1(R.string.f12nameremoved);
                } else if ((C202349ld.A02(indiaUpiSendPaymentActivity.A0I) || !indiaUpiSendPaymentActivity.A03.A03(indiaUpiSendPaymentActivity.A0I)) && ((userJid2 = indiaUpiSendPaymentActivity.A0E) == null || !C36351kA.A1X(indiaUpiSendPaymentActivity.A01, userJid2))) {
                    IndiaUpiSendPaymentActivity.A14(indiaUpiSendPaymentActivity);
                } else {
                    indiaUpiSendPaymentActivity.A05.A00(indiaUpiSendPaymentActivity, new C23155B7p(indiaUpiSendPaymentActivity, 1), indiaUpiSendPaymentActivity.A0E, indiaUpiSendPaymentActivity.A0I, true, false);
                }
                if (indiaUpiSendPaymentActivity.A0F == null && C173858Tk.A0x(indiaUpiSendPaymentActivity)) {
                    boolean A45 = indiaUpiSendPaymentActivity.A45();
                    if (indiaUpiSendPaymentActivity.A0X != null) {
                        z = true;
                    }
                    if (A45 && !z) {
                        indiaUpiSendPaymentActivity.A04.Bp1(new AVY(indiaUpiSendPaymentActivity, 18));
                    }
                }
            } else if (!(this instanceof C179048iy) && !(this instanceof IndiaUpiInterOpHybridActivity) && !(this instanceof IndiaUpiCheckBalanceActivity)) {
                if (this instanceof IndiaUpiChangePinActivity) {
                    IndiaUpiChangePinActivity indiaUpiChangePinActivity = (IndiaUpiChangePinActivity) this;
                    if (!indiaUpiChangePinActivity.A04.A07.contains("pin-entry-ui")) {
                        if (!(indiaUpiChangePinActivity.getIntent() == null || C36371kC.A0H(indiaUpiChangePinActivity) == null)) {
                            indiaUpiChangePinActivity.A02 = (C175748az) C36371kC.A0H(indiaUpiChangePinActivity).get("extra_bank_account");
                        }
                        if (indiaUpiChangePinActivity.A02 == null) {
                            C36331k8.A1F(new C183408qk(indiaUpiChangePinActivity), indiaUpiChangePinActivity.A04);
                            return;
                        }
                        indiaUpiChangePinActivity.A04.A00("pin-entry-ui");
                        if (indiaUpiChangePinActivity.A02 != null) {
                            indiaUpiChangePinActivity.A08.A02();
                            return;
                        }
                        indiaUpiChangePinActivity.A05.A06("could not find bank account; showErrorAndFinish");
                        indiaUpiChangePinActivity.A4D();
                    }
                } else if (this instanceof C179008it) {
                    C179008it r3 = (C179008it) this;
                    if (!r3.A04.A07.contains("pin-entry-ui")) {
                        C24611Dc r2 = r3.A03;
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("showMainPaneAfterPayAppRegistered: bankAccount: ");
                        A0u.append(r3.A00);
                        A0u.append(" inSetup: ");
                        C165577te.A1E(r2, A0u, r3.A0k);
                        r3.A04.A00("pin-entry-ui");
                        C175748az r0 = r3.A00;
                        if (r0 != null) {
                            C175818b6 r13 = (C175818b6) r0.A08;
                            if (r13 == null) {
                                str = "could not find bank info to reset pin";
                            } else if (!r3.A0k || !C175818b6.A00(r13)) {
                                r3.A4F();
                                return;
                            } else {
                                r2.A06("showOrCheckPin insetup and upi pin already set; showSuccessAndFinish");
                                r3.A0I.A0B("2fa");
                                r3.Bnv();
                                r3.A3v();
                                Intent A0D2 = C36431kI.A0D();
                                A0D2.putExtra("extra_bank_account", r3.A00);
                                C36331k8.A0o(r3, A0D2);
                                return;
                            }
                        } else {
                            str = "could not find bank account";
                        }
                        r2.A06(str);
                        r3.A4D();
                    }
                }
            }
        }
    }

    public void A4F() {
        int i = this.A0G;
        if (i < 3) {
            AnonymousClass8gR r0 = this.A08;
            if (r0 != null) {
                r0.A02();
                return;
            }
            return;
        }
        C24611Dc r2 = this.A0J;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("startShowPinFlow at count: ");
        A0u.append(i);
        A0u.append(" max: ");
        A0u.append(3);
        C165567td.A18(r2, "; showErrorAndFinish", A0u);
        A4D();
    }

    public void A4G(AnonymousClass16X r26, C135086c7 r27, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        String str9 = str4;
        C24611Dc r3 = this.A0J;
        r3.A06("getCredentials for pin check called");
        AFF aff = this.A0B;
        String B4Q = aff.A00.B4Q(AnonymousClass000.A0I(r27.A00));
        C135086c7 A092 = this.A0M.A09();
        String str10 = str;
        if (TextUtils.isEmpty(str10) || TextUtils.isEmpty(B4Q) || A092.A00 == null) {
            r3.A06("getCredentials for set got empty xml or controls or token");
            A4B();
            return;
        }
        int i2 = i;
        if ((!this.A0D.A0E(3640) || i2 != 5) && !TextUtils.isEmpty(str9)) {
            str9 = C90514aH.A0y(str9);
        }
        AFF aff2 = this.A0B;
        String str11 = this.A0I;
        String str12 = this.A0g;
        String str13 = this.A0d;
        AnonymousClass16X r7 = r26;
        aff2.Bue(this, r7, A092, this.A07, new AFA(this), str10, str2, str3, str9, str5, str6, str7, str8, str11, B4Q, str12, str13, i2, this.A0v);
    }

    public void A4I(C175818b6 r17, String str, String str2, String str3, String str4, int i, boolean z) {
        String str5;
        C24611Dc r1 = this.A0J;
        r1.A06("getCredentials for pin setup called.");
        int i2 = i;
        C175818b6 r3 = r17;
        if (r17 != null) {
            str5 = this.A0B.BAR(r3, i2, z);
        } else {
            str5 = null;
        }
        C135086c7 A092 = this.A0M.A09();
        String str6 = str;
        if (TextUtils.isEmpty(str6) || TextUtils.isEmpty(str5) || A092.A00 == null) {
            r1.A06("getCredentials for set got empty xml or controls or token");
            A4B();
            return;
        }
        this.A0B.Bud(this, A092, new AFA(this), str6, str2, str3, str4, str5, this.A0g, this.A0d, this.A0I, i2);
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [X.B2a] */
    /* JADX WARNING: type inference failed for: r4v24, types: [X.AEY] */
    /* JADX WARNING: type inference failed for: r4v25, types: [X.AEW] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4J(java.util.HashMap r22) {
        /*
            r21 = this;
            r0 = r21
            boolean r1 = r0 instanceof com.whatsapp.payments.ui.international.IndiaUpiInternationalDeactivationActivity
            r15 = r22
            if (r1 == 0) goto L_0x0042
            com.whatsapp.payments.ui.international.IndiaUpiInternationalDeactivationActivity r0 = (com.whatsapp.payments.ui.international.IndiaUpiInternationalDeactivationActivity) r0
            r1 = 0
            X.AnonymousClass00C.A0D(r15, r1)
            android.content.Intent r6 = X.C36431kI.A0D()
            X.6vT r5 = X.C146356vT.A00()
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            X.9lR r3 = r0.A0L
            java.lang.String r2 = "MPIN"
            r1 = 3
            java.lang.String r2 = r3.A06(r2, r15, r1)
            java.lang.String r1 = "pin"
            X.6c7 r2 = X.C165617ti.A0P(r5, r4, r2, r1)
            java.lang.String r1 = "DEACTIVATION_MPIN_BLOB"
            android.content.Intent r3 = r6.putExtra(r1, r2)
            X.6c7 r2 = r0.A01
            if (r2 != 0) goto L_0x0038
            java.lang.String r0 = "seqNumber"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0038:
            java.lang.String r1 = "DEACTIVATION_SEQ_NUMBER"
            android.content.Intent r1 = r3.putExtra(r1, r2)
            X.C36331k8.A0o(r0, r1)
            return
        L_0x0042:
            boolean r1 = r0 instanceof com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity
            if (r1 == 0) goto L_0x017f
            com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity r0 = (com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity) r0
            r1 = 0
            X.AnonymousClass00C.A0D(r15, r1)
            android.widget.DatePicker r1 = r0.A01
            if (r1 != 0) goto L_0x0057
            java.lang.String r0 = "endDatePicker"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0057:
            long r10 = com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity.A0z(r1)
            X.00T r1 = r0.A0C
            java.lang.Object r1 = r1.getValue()
            com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationViewModel r1 = (com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationViewModel) r1
            X.8az r7 = r0.A05
            java.lang.String r2 = "paymentBankAccount"
            if (r7 != 0) goto L_0x006e
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x006e:
            X.6c7 r4 = r0.A06
            if (r4 != 0) goto L_0x0079
            java.lang.String r0 = "seqNumber"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0079:
            java.lang.String r9 = r7.A0A
            X.AnonymousClass00C.A08(r9)
            X.6vT r5 = X.C146356vT.A00()
            java.lang.Class r8 = java.lang.Long.TYPE
            long r2 = r0.A00
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r6 = "cardExpiryDate"
            X.6c7 r5 = X.C165617ti.A0P(r5, r8, r2, r6)
            X.6vT r3 = X.C146356vT.A00()
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            X.6c7 r3 = X.C165617ti.A0P(r3, r8, r2, r6)
            X.9WD r2 = new X.9WD
            r2.<init>(r5, r3, r9)
            java.lang.String r11 = r0.A0e
            r6 = 3
            X.8bF r3 = r7.A08
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.payments.IndiaUpiMethodData"
            X.AnonymousClass00C.A0E(r3, r0)
            X.8b6 r3 = (X.C175818b6) r3
            X.9lR r5 = r1.A02
            java.lang.String r0 = "MPIN"
            java.lang.String r6 = r5.A06(r0, r15, r6)
            X.6c7 r0 = r3.A08
            if (r0 == 0) goto L_0x01b0
            X.00s r9 = r1.A00
            java.lang.Object r0 = r9.A04()
            X.9g0 r0 = (X.C199809g0) r0
            if (r0 == 0) goto L_0x017c
            r8 = 1
            X.9WH r7 = r0.A00
            X.9uT r5 = r0.A01
            X.9g0 r0 = new X.9g0
            r0.<init>(r7, r5, r8)
        L_0x00cd:
            r9.A0D(r0)
            java.lang.String r5 = "activate_international_payments"
            r0 = 0
            X.6Ps[] r0 = new X.C131606Ps[r0]
            r9 = 0
            X.6Ps r7 = new X.6Ps
            r7.<init>(r9, r0)
            java.lang.String r0 = "payments_request_name"
            r7.A03(r0, r5)
            X.AF7 r8 = r1.A04
            java.lang.String r10 = "international_payment_prompt"
            r12 = 3
            X.C203049nB.A03(r7, r8, r9, r10, r11, r12)
            X.8g8 r7 = r1.A03
            X.6c7 r8 = r3.A08
            X.AnonymousClass00C.A0B(r8)
            java.lang.String r15 = r3.A0E
            if (r15 != 0) goto L_0x00f5
            java.lang.String r15 = ""
        L_0x00f5:
            X.6vT r9 = X.C146356vT.A00()
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            java.lang.String r0 = "pin"
            X.6c7 r10 = X.C165617ti.A0P(r9, r5, r6, r0)
            X.6c7 r5 = r3.A05
            X.AnonymousClass00C.A07(r5)
            X.9IF r3 = new X.9IF
            r3.<init>(r2, r1)
            r0 = 0
            X.AnonymousClass00C.A0D(r8, r0)
            java.lang.String r0 = "PAY: activateInternationalPayments called"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.19A r6 = r7.A00
            java.lang.String r13 = r6.A09()
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.6c7 r0 = r2.A01
            X.C18740tg.A06(r0)
            java.lang.Object r0 = X.C135086c7.A00(r0)
            long r0 = X.C36431kI.A09(r0)
            long r0 = r9.toSeconds(r0)
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
            X.6c7 r0 = r2.A00
            X.C18740tg.A06(r0)
            java.lang.Object r0 = X.C135086c7.A00(r0)
            long r0 = X.C36431kI.A09(r0)
            long r0 = r9.toSeconds(r0)
            java.lang.Long r12 = java.lang.Long.valueOf(r0)
            java.lang.String r14 = X.C165577te.A0k(r8)
            java.lang.String r1 = r2.A02
            X.1Vl r0 = r7.A02
            java.lang.String r17 = r0.A01()
            java.lang.String r18 = X.C165577te.A0k(r10)
            java.lang.String r19 = X.C165577te.A0k(r4)
            java.lang.String r20 = X.C165577te.A0k(r5)
            X.8vG r10 = new X.8vG
            r16 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.9nx r2 = r10.A00
            X.AnonymousClass00C.A08(r2)
            r1 = 7
            X.BAc r0 = new X.BAc
            r0.<init>(r3, r10, r1)
            r7 = 204(0xcc, float:2.86E-43)
            r8 = 0
            r3 = r6
            r4 = r0
            r5 = r2
            r6 = r13
            r3.A0E(r4, r5, r6, r7, r8)
            return
        L_0x017c:
            r0 = 0
            goto L_0x00cd
        L_0x017f:
            boolean r1 = r0 instanceof com.whatsapp.payments.ui.IndiaUpiStepUpActivity
            if (r1 == 0) goto L_0x01b1
            com.whatsapp.payments.ui.IndiaUpiStepUpActivity r0 = (com.whatsapp.payments.ui.IndiaUpiStepUpActivity) r0
            X.1Dc r2 = r0.A07
            java.lang.String r1 = "onGetCredentials called"
            r2.A06(r1)
            X.7yI r5 = r0.A04
            X.00s r3 = r5.A00
            X.0wG r0 = r5.A04
            android.content.Context r1 = r0.A00
            r0 = 2131892331(0x7f12186b, float:1.9419407E38)
            X.AnonymousClass9IK.A00(r1, r3, r0)
            X.8az r2 = r5.A05
            X.8bF r4 = r2.A08
            X.8b6 r4 = (X.C175818b6) r4
            if (r4 != 0) goto L_0x0435
            X.AnonymousClass9IK.A01(r3)
            r0 = 2
            X.9Nv r1 = new X.9Nv
            r1.<init>(r0)
            X.1Rs r0 = r5.A02
            r0.A0D(r1)
        L_0x01b0:
            return
        L_0x01b1:
            boolean r1 = r0 instanceof X.C178848hw
            if (r1 == 0) goto L_0x0200
            X.8hw r0 = (X.C178848hw) r0
            X.9un r1 = r0.A0B
            if (r1 == 0) goto L_0x01b0
            X.9lR r1 = r0.A0L
            r1.A08 = r15
            r0.A4P()
            r0.Bnv()
            r1 = 2131893491(0x7f121cf3, float:1.942176E38)
            r0.Bu1(r1)
            boolean r1 = X.C178848hw.A1K(r0)
            r3 = 0
            if (r1 == 0) goto L_0x01f4
            r1 = 1
            r0.A0W = r1
            boolean r1 = r0.A0Y
            if (r1 == 0) goto L_0x01f0
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "extra_return_result_and_finish_on_send_money_complete"
            boolean r1 = r2.getBooleanExtra(r1, r3)
            if (r1 == 0) goto L_0x04a2
            android.content.Intent r1 = X.C36431kI.A0D()
            X.C178848hw.A1F(r1, r0)
            X.C36331k8.A0o(r0, r1)
            return
        L_0x01f0:
            boolean r1 = r0.A0Z
            if (r1 != 0) goto L_0x01b0
        L_0x01f4:
            int r2 = r0.A01
            X.16X r1 = r0.A09
            X.9fB r1 = r0.A4K(r1, r2)
            r0.A4c(r1, r3)
            return
        L_0x0200:
            boolean r1 = r0 instanceof com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity
            if (r1 == 0) goto L_0x02ec
            com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity r0 = (com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity) r0
            X.1Dc r2 = r0.A06
            java.lang.String r1 = "onGetCredentials called"
            r2.A06(r1)
            X.7yG r3 = r0.A04
            X.00s r2 = r3.A01
            X.0wG r0 = r3.A02
            android.content.Context r1 = r0.A00
            r0 = 2131889946(0x7f120f1a, float:1.941457E38)
            X.AnonymousClass9IK.A00(r1, r2, r0)
            X.8az r2 = r3.A04
            X.8bF r1 = r2.A08
            X.8b6 r1 = (X.C175818b6) r1
            X.8gQ r0 = r3.A05
            X.6c7 r8 = r1.A08
            java.lang.String r6 = r1.A0E
            X.6c7 r7 = r1.A05
            X.6c7 r4 = r3.A00
            java.lang.String r5 = r2.A0A
            X.9Q2 r11 = new X.9Q2
            r11.<init>(r3)
            X.19A r13 = r0.A04
            java.lang.String r12 = r13.A09()
            if (r22 == 0) goto L_0x02e9
            X.9lR r3 = r0.A00
            r2 = 4
            java.lang.String r1 = "MPIN"
            java.lang.String r9 = r3.A06(r1, r15, r2)
        L_0x0243:
            java.lang.String r15 = X.C165607th.A0s(r4)
            java.lang.String r4 = r0.A07
            java.lang.String r10 = X.C165607th.A0s(r8)
            java.lang.String r3 = X.C165577te.A0k(r7)
            X.6QB r2 = X.C36421kH.A0T()
            X.C165567td.A1E(r2)
            java.lang.String r7 = "type"
            java.lang.String r1 = "get"
            X.C36331k8.A1D(r2, r7, r1)
            r8 = 0
            X.C203539oF.A0E(r2, r12)
            X.6QB r1 = X.C165587tf.A0a()
            java.lang.String r14 = "action"
            java.lang.String r7 = "upi-check-balance"
            X.C36331k8.A1D(r1, r14, r7)
            boolean r14 = X.C203539oF.A0X(r5, r8)
            if (r14 == 0) goto L_0x0279
            java.lang.String r14 = "credential-id"
            X.C36331k8.A1D(r1, r14, r5)
        L_0x0279:
            r16 = 35
            r18 = 35
            r20 = 0
            boolean r5 = X.C203539oF.A0P(r15, r16, r18, r20)
            if (r5 == 0) goto L_0x028a
            java.lang.String r5 = "seq-no"
            X.C36331k8.A1D(r1, r5, r15)
        L_0x028a:
            X.C203539oF.A0G(r1, r4, r8)
            r4 = 0
            boolean r4 = X.C203539oF.A0U(r9, r4, r8)
            if (r4 == 0) goto L_0x029a
            java.lang.String r4 = "mpin"
            X.C36331k8.A1D(r1, r4, r9)
        L_0x029a:
            r15 = 1
            r17 = 100
            r19 = 0
            r14 = r10
            boolean r4 = X.C203539oF.A0P(r14, r15, r17, r19)
            if (r4 == 0) goto L_0x02ac
            java.lang.String r4 = "vpa"
            X.C36331k8.A1D(r1, r4, r10)
        L_0x02ac:
            if (r6 == 0) goto L_0x02bc
            r19 = 1
            r14 = r6
            boolean r4 = X.C203539oF.A0P(r14, r15, r17, r19)
            if (r4 == 0) goto L_0x02bc
            java.lang.String r4 = "vpa-id"
            X.C36331k8.A1D(r1, r4, r6)
        L_0x02bc:
            r4 = 0
            boolean r4 = X.C203539oF.A0Q(r3, r4, r8)
            if (r4 == 0) goto L_0x02c9
            java.lang.String r4 = "upi-bank-info"
            X.C36331k8.A1D(r1, r4, r3)
        L_0x02c9:
            X.9nx r15 = X.C165567td.A0I(r1, r2)
            X.9YX r5 = X.AnonymousClass9I1.A04(r0, r7)
            android.content.Context r2 = r0.A01
            X.17Y r3 = r0.A02
            X.1Vu r4 = r0.A05
            X.B7M r1 = new X.B7M
            r6 = r0
            r7 = r11
            r1.<init>((android.content.Context) r2, (X.AnonymousClass17Y) r3, (X.C29221Vu) r4, (X.AnonymousClass9YX) r5, (X.AnonymousClass8gQ) r6, (X.AnonymousClass9Q2) r7)
            r17 = 204(0xcc, float:2.86E-43)
            r18 = 0
            r14 = r1
            r16 = r12
            r13.A0E(r14, r15, r16, r17, r18)
            return
        L_0x02e9:
            r9 = 0
            goto L_0x0243
        L_0x02ec:
            boolean r1 = r0 instanceof com.whatsapp.payments.ui.IndiaUpiChangePinActivity
            if (r1 == 0) goto L_0x0326
            com.whatsapp.payments.ui.IndiaUpiChangePinActivity r0 = (com.whatsapp.payments.ui.IndiaUpiChangePinActivity) r0
            X.8az r1 = r0.A02
            X.8bF r3 = r1.A08
            X.1Dc r2 = r0.A05
            java.lang.String r1 = "IndiaUpiChangePinActivity could not cast country data to IndiaUpiMethodData"
            X.8b6 r1 = X.C165597tg.A0Q(r2, r3, r1)
            X.8gR r11 = r0.A08
            X.6c7 r9 = r1.A08
            java.lang.String r12 = r1.A0E
            X.6c7 r10 = r1.A05
            X.8az r1 = r0.A02
            java.lang.String r13 = r1.A0A
            java.lang.String r14 = r0.A03
            boolean r0 = X.C202349ld.A02(r9)
            if (r0 == 0) goto L_0x04b2
            X.9Ul r3 = r11.A04
            android.content.Context r2 = r11.A02
            r1 = 0
            X.AEW r0 = new X.AEW
            r4 = r0
            r5 = r10
            r6 = r11
            r7 = r13
            r8 = r14
            r9 = r15
            r4.<init>(r5, r6, r7, r8, r9)
        L_0x0322:
            r3.A01(r2, r1, r0)
            return
        L_0x0326:
            boolean r1 = r0 instanceof X.C179008it
            if (r1 == 0) goto L_0x03bd
            X.8it r0 = (X.C179008it) r0
            r1 = 2131892734(0x7f1219fe, float:1.9420225E38)
            r0.Bu1(r1)
            java.lang.String r13 = r0.A02
            boolean r1 = r0 instanceof com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity
            if (r1 == 0) goto L_0x037a
            com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity r0 = (com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity) r0
            X.8az r1 = r0.A05
            X.8bF r5 = r1.A08
            X.C18740tg.A06(r5)
            X.8b6 r5 = (X.C175818b6) r5
            java.lang.String r4 = r0.A09
            java.lang.String r3 = r0.A07
            java.lang.String r2 = r0.A08
            r1 = 13
            X.8uf r9 = new X.8uf
            r9.<init>(r4, r3, r2, r1)
            X.8gR r8 = r0.A08
            X.6c7 r6 = r5.A08
            java.lang.String r11 = r5.A0E
            X.6c7 r7 = r5.A05
            X.8az r0 = r0.A05
            java.lang.String r12 = r0.A0A
            java.lang.String r14 = "BANK"
            r10 = 0
        L_0x035f:
            boolean r0 = X.C202349ld.A02(r6)
            if (r0 == 0) goto L_0x04b6
            X.9Ul r3 = r8.A04
            android.content.Context r2 = r8.A02
            X.9YX r1 = r8.A00
            X.AEY r0 = new X.AEY
            r4 = r0
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r12
            r10 = r13
            r11 = r14
            r12 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0322
        L_0x037a:
            com.whatsapp.payments.ui.IndiaUpiAadhaarCardVerificationActivity r0 = (com.whatsapp.payments.ui.IndiaUpiAadhaarCardVerificationActivity) r0
            r1 = 1
            X.AnonymousClass00C.A0D(r15, r1)
            X.8az r1 = r0.A02
            java.lang.String r4 = "bankAccount"
            if (r1 != 0) goto L_0x038b
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x038b:
            X.8bF r3 = r1.A08
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.payments.IndiaUpiMethodData"
            X.AnonymousClass00C.A0E(r3, r1)
            X.C18740tg.A06(r3)
            X.8b6 r3 = (X.C175818b6) r3
            java.lang.String r2 = r0.A05
            X.C18740tg.A06(r2)
            java.lang.String r1 = r0.A06
            X.C18740tg.A06(r1)
            X.8uf r10 = new X.8uf
            r10.<init>((java.lang.String) r2, (java.lang.String) r1)
            X.8gR r8 = r0.A08
            X.6c7 r6 = r3.A08
            java.lang.String r11 = r3.A0E
            X.6c7 r7 = r3.A05
            X.8az r0 = r0.A02
            if (r0 != 0) goto L_0x03b7
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x03b7:
            java.lang.String r12 = r0.A0A
            r9 = 0
            java.lang.String r14 = "AADHAAR"
            goto L_0x035f
        L_0x03bd:
            boolean r1 = r0 instanceof X.C179098jA
            if (r1 == 0) goto L_0x03d0
            X.8jA r0 = (X.C179098jA) r0
            X.1Dc r2 = r0.A0K
            java.lang.String r1 = "onGetCredentials called"
            r2.A06(r1)
            X.9un r1 = r0.A03
            r0.A4M(r1, r15)
            return
        L_0x03d0:
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r0 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity) r0
            r7 = 0
            X.AnonymousClass00C.A0D(r15, r7)
            X.9lR r3 = r0.A0L
            java.lang.String r1 = r0.A4K()
            int r2 = com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity.A0z(r1)
            java.lang.String r1 = "MPIN"
            java.lang.String r6 = r3.A06(r1, r15, r2)
            X.6c7 r1 = r0.A03
            r5 = 0
            if (r1 != 0) goto L_0x03f2
            java.lang.String r0 = "seqNumber"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x03f2:
            java.lang.Object r4 = r1.A00
            java.lang.String r2 = r0.A4K()
            java.lang.String r1 = "pay"
            boolean r1 = X.AnonymousClass00C.A0J(r2, r1)
            if (r1 == 0) goto L_0x0404
            java.lang.String r5 = X.C165607th.A0p(r0)
        L_0x0404:
            if (r6 == 0) goto L_0x01b0
            if (r4 == 0) goto L_0x01b0
            r1 = 2
            X.011[] r3 = new X.AnonymousClass011[r1]
            java.lang.String r1 = "mpin"
            X.C36341k9.A1J(r1, r6, r3, r7)
            r2 = 1
            java.lang.String r1 = "npci_common_library_transaction_id"
            X.C36341k9.A1J(r1, r4, r3, r2)
            java.util.LinkedHashMap r2 = X.C000400e.A08(r3)
            if (r5 == 0) goto L_0x0421
            java.lang.String r1 = "nonce"
            r2.put(r1, r5)
        L_0x0421:
            X.7o1 r1 = com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity.A10(r0)
            if (r1 == 0) goto L_0x042a
            r1.B7N(r2)
        L_0x042a:
            boolean r1 = r0.A08
            if (r1 == 0) goto L_0x01b0
            r0.A3v()
            r0.finish()
            return
        L_0x0435:
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            X.6c7 r0 = r4.A08
            java.lang.String r1 = X.C165577te.A0k(r0)
            java.lang.String r0 = "vpa"
            X.C36381kD.A1M(r0, r1, r3)
            java.lang.String r0 = r4.A0E
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0453
            java.lang.String r1 = r4.A0E
            java.lang.String r0 = "vpa-id"
            X.C36381kD.A1M(r0, r1, r3)
        L_0x0453:
            java.lang.String r1 = r5.A03
            java.lang.String r0 = "seq-no"
            X.C36381kD.A1M(r0, r1, r3)
            X.6c7 r0 = r4.A05
            java.lang.Object r1 = X.C165577te.A0g(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "upi-bank-info"
            X.C36381kD.A1M(r0, r1, r3)
            X.1Vl r0 = r5.A09
            java.lang.String r1 = r0.A01()
            java.lang.String r0 = "device-id"
            X.C36381kD.A1M(r0, r1, r3)
            java.lang.String r1 = r2.A0A
            java.lang.String r0 = "credential-id"
            X.C36381kD.A1M(r0, r1, r3)
            X.9lR r2 = r5.A01
            r1 = 3
            java.lang.String r0 = "MPIN"
            java.lang.String r0 = r2.A06(r0, r15, r1)
            java.lang.String r1 = "mpin"
            X.C36381kD.A1M(r1, r0, r3)
            r0 = 0
            X.1AL[] r0 = X.C165577te.A1a(r3, r0)
            X.9nx r4 = X.C203399nx.A04(r1, r0)
            X.9S6 r3 = r5.A08
            X.1Db r0 = r5.A06
            X.9tF r2 = r0.A04()
            X.AEq r1 = new X.AEq
            r1.<init>(r5)
            r0 = 0
            r3.A00(r1, r2, r4, r0)
            return
        L_0x04a2:
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiPaymentSettingsActivity> r1 = com.whatsapp.payments.ui.IndiaUpiPaymentSettingsActivity.class
            android.content.Intent r1 = X.C36441kJ.A0H(r0, r1)
            X.C178848hw.A1F(r1, r0)
            r0.finish()
            r0.startActivity(r1)
            return
        L_0x04b2:
            X.AnonymousClass8gR.A01(r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x04b6:
            X.AnonymousClass8gR.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C179108jC.A4J(java.util.HashMap):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BeH(int r6, android.os.Bundle r7) {
        /*
            r5 = this;
            java.lang.String r1 = "user canceled"
            r0 = 1
            java.lang.String r4 = "india-upi-payment-cl-result-error"
            r3 = 0
            if (r6 != r0) goto L_0x0022
            if (r7 != 0) goto L_0x0036
            X.1Dc r0 = r5.A0J
            r0.A06(r1)
            r5.A0F = r3
            X.0wN r1 = r5.A03
            java.lang.String r0 = "user cancelled"
            r1.A0E(r4, r0, r3)
        L_0x0018:
            boolean r0 = r5.A0E
            if (r0 == 0) goto L_0x0048
            r5.A0E = r3
            r5.Bnv()
        L_0x0021:
            return
        L_0x0022:
            if (r6 == r0) goto L_0x0036
            r0 = 2
            if (r6 != r0) goto L_0x0021
            java.lang.String r0 = "TRIGGER_OTP"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0)
            X.0YC r0 = X.AnonymousClass0YC.A00(r5)
            r0.A03(r1)
            return
        L_0x0036:
            java.lang.String r0 = "error"
            java.io.Serializable r2 = r7.getSerializable(r0)
            java.lang.String r0 = "USER_ABORTED"
            if (r2 != r0) goto L_0x004f
            X.1Dc r0 = r5.A0J
            r0.A06(r1)
            r5.A0F = r3
            goto L_0x0018
        L_0x0048:
            r5.A3v()
            r5.finish()
            return
        L_0x004f:
            if (r2 == 0) goto L_0x005d
            X.0wN r1 = r5.A03
            java.lang.String r0 = r2.toString()
            r1.A0E(r4, r0, r3)
            r5.A4B()
        L_0x005d:
            java.lang.String r0 = "credBlocks"
            java.io.Serializable r1 = r7.getSerializable(r0)
            java.util.HashMap r1 = (java.util.HashMap) r1
            if (r1 == 0) goto L_0x0071
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0071
            r5.A4J(r1)
            return
        L_0x0071:
            X.1Dc r0 = r5.A0J
            java.lang.String r1 = "credBlocks is empty"
            r0.A05(r1)
            X.0wN r0 = r5.A03
            r0.A0E(r4, r1, r3)
            r5.A4B()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C179108jC.BeH(int, android.os.Bundle):void");
    }

    public void onCreate(Bundle bundle) {
        String str;
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        C165567td.A0j(this);
        PhoneUserJid A0j = C36411kG.A0j(this);
        if (A0j == null) {
            str = null;
        } else {
            str = A0j.user;
        }
        C18740tg.A06(str);
        this.A0I = str;
        this.A0H = this.A0D.A01();
        this.A04 = this.A0L.A04;
        C36391kE.A1Q(new C183508qu(this, false), this.A04);
        if (getIntent() != null) {
            getIntent().getStringExtra("extra_request_id");
        }
        if (bundle != null) {
            this.A0F = bundle2.getBoolean("payAppShowPinErrorSavedInst");
            this.A0G = bundle2.getInt("showPinConfirmCountSavedInst");
            this.A03 = bundle2.getInt("setupModeSavedInst", 1);
        }
        AnonymousClass17Y r5 = this.A05;
        AnonymousClass19A r6 = this.A0H;
        C29131Vl r15 = this.A0D;
        C202269lR r7 = this.A0L;
        C29121Vk r10 = this.A0M;
        C195479Ul r11 = this.A06;
        AF7 af7 = this.A0S;
        this.A08 = new AnonymousClass8gR(this, r5, r6, r7, this.A0M, this.A0K, r10, r11, this, af7, this.A0V, r15);
        this.A07 = new AnonymousClass8gJ(this.A07, this.A0D, r6, r7, r10);
    }

    public Dialog onCreateDialog(int i) {
        if (i != 19) {
            return super.onCreateDialog(i);
        }
        C39001qm A002 = AnonymousClass3LW.A00(this);
        A002.A0c(R.string.f12nameremoved);
        B84.A00(A002, this, 16, R.string.f12nameremoved);
        B84.A01(A002, this, 17, R.string.f12nameremoved);
        A002.A0r(true);
        B87.A00(A002, this, 18);
        return A002.create();
    }

    public void A4C() {
        Bu1(R.string.f12nameremoved);
        this.A0E = true;
        AnonymousClass3SJ.A00(this, 19);
        this.A0F = true;
        this.A0G++;
        this.A0J.A06("showUPIAppErrorAndConfirmRetry got yes; deleting tokens and keys");
        this.A0M.A0G();
        A4A();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 200) {
            boolean z = false;
            if (i2 == 250) {
                HashMap hashMap = (HashMap) intent.getSerializableExtra("credBlocks");
                this.A0J.A07(AnonymousClass000.A0l(hashMap, "onLibraryResult for credentials: ", AnonymousClass000.A0u()));
                if (hashMap != null && !hashMap.isEmpty()) {
                    z = true;
                }
                C18740tg.A0C(z);
                A4J(hashMap);
            } else if (i2 == 251) {
                A4B();
            } else if (i2 == 252) {
                this.A0J.A06("user canceled");
                this.A0F = false;
                if (this.A0E) {
                    this.A0E = false;
                    Bnv();
                    return;
                }
                A3v();
                finish();
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass8gR r1 = this.A08;
        if (r1 != null) {
            r1.A00 = null;
        }
        this.A02 = null;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("payAppShowPinErrorSavedInst", this.A0F);
        bundle.putInt("showPinConfirmCountSavedInst", this.A0G);
        bundle.putInt("setupModeSavedInst", this.A03);
    }
}
