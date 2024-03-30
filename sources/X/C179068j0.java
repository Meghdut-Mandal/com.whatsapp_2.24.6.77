package X;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiInterOpHybridActivity;
import com.whatsapp.payments.ui.IndiaWebViewUpiP2mHybridActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import java.util.List;

/* renamed from: X.8j0  reason: invalid class name and case insensitive filesystem */
public abstract class C179068j0 extends C178848hw implements AnonymousClass4RN {
    public C175758b0 A00;
    public C202409lm A01;

    public ConfirmPaymentFragment A4h(C175758b0 r14, C207119ua r15, PaymentBottomSheet paymentBottomSheet) {
        C175758b0 r6 = r14;
        ConfirmPaymentFragment A002 = ConfirmPaymentFragment.A00(r6, this.A0G, (C206349tD) null, "p2m", this.A0Z, 0);
        AF7 af7 = this.A0S;
        AnonymousClass9UF r12 = this.A0e;
        PaymentBottomSheet paymentBottomSheet2 = paymentBottomSheet;
        A002.A0I = new AGS(this, this.A0d, this.A08, r6, r15, this.A0I, af7, this, paymentBottomSheet2, r12);
        A002.A0J = new AGU(r14, r15, this, paymentBottomSheet2);
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b2, code lost:
        if (r7.A0W.A0i(r7.A0E) == false) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4n(X.C207119ua r15) {
        /*
            r14 = this;
            r7 = r14
            boolean r0 = r14 instanceof com.whatsapp.payments.ui.IndiaUpiInterOpHybridActivity
            if (r0 == 0) goto L_0x000f
            boolean r0 = X.C173858Tk.A0x(r14)
            if (r0 != 0) goto L_0x000e
            r14.A4R(r14)
        L_0x000e:
            return
        L_0x000f:
            boolean r0 = r14 instanceof com.whatsapp.payments.ui.IndiaWebViewUpiP2mHybridActivity
            r8 = r15
            if (r0 == 0) goto L_0x006f
            X.8iy r7 = (X.C179048iy) r7
            r0 = 0
            X.AnonymousClass00C.A0D(r15, r0)
            X.9un r0 = r7.A0B
            if (r0 != 0) goto L_0x0025
            r7.A4R(r7)
            r7.Bnv()
            return
        L_0x0025:
            X.8bF r0 = r0.A08
            X.8b6 r0 = (X.C175818b6) r0
            if (r0 == 0) goto L_0x0051
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            X.6c7 r0 = r0.A04
            java.lang.Object r0 = r0.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0051
            X.9un r0 = r7.A0B
            com.whatsapp.payments.ui.IndiaUpiPinPrimerDialogFragment r0 = X.C165607th.A0d(r0, r7)
            com.whatsapp.payments.ui.PaymentBottomSheet r1 = new com.whatsapp.payments.ui.PaymentBottomSheet
            r1.<init>()
            r1.A02 = r0
            java.lang.String r0 = "IndiaUpiPinPrimerDialogFragment"
            r7.Btl(r1, r0)
            r7.A4U(r1)
            r0 = 0
            r7.A4p(r0)
            return
        L_0x0051:
            r0 = 1
            r7.A4p(r0)
            r9 = 0
            r0 = 47
            X.AVb r12 = new X.AVb
            r12.<init>(r7, r15, r0)
            r0 = 1
            X.B9X r10 = new X.B9X
            r10.<init>(r7, r0)
            r0 = 24
            X.AVY r13 = new X.AVY
            r13.<init>(r7, r0)
            r11 = r9
            r7.A4r(r8, r9, r10, r11, r12, r13)
            return
        L_0x006f:
            com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity r7 = (com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity) r7
            X.AGg r0 = r7.A06
            java.lang.String r0 = r0.A0A
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x009b
            X.1FR r1 = r7.A0W
            com.whatsapp.jid.UserJid r0 = r7.A0E
            boolean r0 = r1.A0i(r0)
            if (r0 == 0) goto L_0x009b
            X.6vT r3 = X.C146356vT.A00()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            X.AGg r0 = r7.A06
            java.lang.String r1 = r0.A0A
            java.lang.String r0 = "moneyStringValue"
            X.6c7 r0 = X.C165617ti.A0P(r3, r2, r1, r0)
            r7.A0F = r0
            com.whatsapp.jid.UserJid r0 = r7.A0E
            r7.A0G = r0
        L_0x009b:
            X.9un r0 = r7.A0B
            if (r0 != 0) goto L_0x0107
            X.AGg r0 = r7.A06
            java.lang.String r0 = r0.A0A
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00b4
            X.1FR r1 = r7.A0W
            com.whatsapp.jid.UserJid r0 = r7.A0E
            boolean r1 = r1.A0i(r0)
            r0 = 1
            if (r1 != 0) goto L_0x00b5
        L_0x00b4:
            r0 = 0
        L_0x00b5:
            r6 = 0
            if (r0 == 0) goto L_0x0103
            r7.overridePendingTransition(r6, r6)
            com.whatsapp.payments.ui.PaymentBottomSheet r4 = new com.whatsapp.payments.ui.PaymentBottomSheet
            r4.<init>()
            X.AGg r0 = r7.A06
            java.lang.String r3 = r0.A0A
            X.AnonymousClass00C.A0D(r3, r6)
            com.whatsapp.payments.ui.PaymentCheckoutIncentiveFragment r2 = new com.whatsapp.payments.ui.PaymentCheckoutIncentiveFragment
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            java.lang.String r0 = "extra_formatted_discount"
            r1.putString(r0, r3)
            r2.A17(r1)
            X.9Px r0 = new X.9Px
            r0.<init>(r7)
            r2.A00 = r0
            r4.A02 = r2
            java.lang.String r0 = "PaymentCheckoutOrderDiscountFragment"
            r7.Btl(r4, r0)
            r7.A4U(r4)
            X.AF7 r5 = r7.A0S
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r3 = 0
            java.lang.String r2 = r7.A0f
            X.8gj r1 = X.C178558gj.A00()
            java.lang.String r0 = "payment_intro_prompt"
            X.8cT r0 = r5.A04(r4, r3, r0, r2)
            X.C176658cT.A03(r0, r1, r5, r6)
        L_0x00ff:
            r7.A4p(r6)
            return
        L_0x0103:
            r7.A4R(r7)
            goto L_0x00ff
        L_0x0107:
            X.8bF r0 = r0.A08
            X.8b6 r0 = (X.C175818b6) r0
            if (r0 == 0) goto L_0x0133
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            X.6c7 r0 = r0.A04
            java.lang.Object r0 = r0.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0133
            X.9un r0 = r7.A0B
            com.whatsapp.payments.ui.IndiaUpiPinPrimerDialogFragment r0 = X.C165607th.A0d(r0, r7)
            com.whatsapp.payments.ui.PaymentBottomSheet r1 = new com.whatsapp.payments.ui.PaymentBottomSheet
            r1.<init>()
            r1.A02 = r0
            java.lang.String r0 = "IndiaUpiPinPrimerDialogFragment"
            r7.Btl(r1, r0)
            r7.A4U(r1)
            r0 = 0
            r7.A4p(r0)
            return
        L_0x0133:
            r0 = 1
            r7.A4p(r0)
            r9 = 0
            r0 = 35
            X.AVb r12 = new X.AVb
            r12.<init>(r7, r15, r0)
            r0 = 0
            X.B9X r10 = new X.B9X
            r10.<init>(r7, r0)
            r0 = 49
            X.AVX r13 = new X.AVX
            r13.<init>(r7, r0)
            r11 = r9
            r7.A4r(r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C179068j0.A4n(X.9ua):void");
    }

    public void BOo(C131606Ps r15, Integer num, Integer num2, String str) {
        C131606Ps r4 = r15;
        Integer num3 = num;
        Integer num4 = num2;
        String str2 = str;
        if (this instanceof C179048iy) {
            this.A0S.BOq(r4, num3, num4, str2, this.A0f, this.A0i, this.A0h, false, true);
            return;
        }
        IndiaUpiInterOpHybridActivity indiaUpiInterOpHybridActivity = (IndiaUpiInterOpHybridActivity) this;
        int intValue = num3.intValue();
        if (r15 == null) {
            r4 = C165567td.A0F();
        }
        AnonymousClass11F r0 = indiaUpiInterOpHybridActivity.A0D;
        if (r0 != null) {
            AnonymousClass185 r1 = indiaUpiInterOpHybridActivity.A00;
            if (r1 != null) {
                AnonymousClass3L0 A012 = r1.A01(C36401kF.A0b(r0));
                if (A012 != null) {
                    r4.A03("biz_platform", C36331k8.A0h(Integer.valueOf(AnonymousClass6W7.A00(A012))));
                }
            } else {
                throw C36331k8.A0d("verifiedNameManager");
            }
        }
        indiaUpiInterOpHybridActivity.A0S.BOp(r4, Integer.valueOf(intValue), num4, str2, indiaUpiInterOpHybridActivity.A0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x018f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4W(X.C207249un r12, X.C207119ua r13, com.whatsapp.payments.ui.PaymentBottomSheet r14) {
        /*
            r11 = this;
            if (r14 == 0) goto L_0x0029
            r9 = r14
        L_0x0003:
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.List r0 = X.C202409lm.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x000d:
            boolean r0 = r2.hasNext()
            r8 = r11
            if (r0 == 0) goto L_0x002f
            java.lang.String r1 = X.AnonymousClass001.A0C(r2)
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            X.AnonymousClass1L0.A02(r11, r1)     // Catch:{ NameNotFoundException -> 0x000d }
            boolean r0 = X.C202409lm.A02(r11, r1)
            if (r0 == 0) goto L_0x000d
            r5.add(r1)
            goto L_0x000d
        L_0x0029:
            com.whatsapp.payments.ui.PaymentBottomSheet r9 = new com.whatsapp.payments.ui.PaymentBottomSheet
            r9.<init>()
            goto L_0x0003
        L_0x002f:
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            android.content.res.Resources r4 = r11.getResources()
            java.util.ArrayList r3 = X.C36321k7.A0J(r5)
            java.util.Iterator r1 = r5.iterator()
        L_0x003f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = X.AnonymousClass001.A0C(r1)
            X.AnonymousClass00C.A0B(r4)
            X.8b0 r0 = X.C202409lm.A00(r4, r0)
            r3.add(r0)
            goto L_0x003f
        L_0x0054:
            r2.addAll(r3)
            X.AnonymousClass00C.A0B(r4)
            java.lang.String r0 = "other"
            X.8b0 r0 = X.C202409lm.A00(r4, r0)
            r2.add(r0)
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "whatsapp"
            r10.add(r0)
            java.util.Iterator r1 = r2.iterator()
        L_0x0070:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0082
            X.9un r0 = X.C165607th.A0S(r1)
            java.lang.String r0 = X.AF7.A00(r0)
            r10.add(r0)
            goto L_0x0070
        L_0x0082:
            boolean r3 = r11 instanceof X.C179048iy
            if (r3 == 0) goto L_0x0191
            r1 = r8
            X.8iy r1 = (X.C179048iy) r1
            boolean r0 = X.C173858Tk.A0y(r1)
            if (r0 == 0) goto L_0x0191
            X.1EV r0 = r1.A0O
            com.whatsapp.jid.UserJid r4 = r1.A0E
            if (r4 == 0) goto L_0x0191
            X.0yC r1 = r0.A02
            r0 = 4709(0x1265, float:6.599E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0191
            r0 = 4806(0x12c6, float:6.735E-42)
            java.lang.String r1 = r1.A09(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00bd
            java.lang.String r0 = ","
            java.lang.String[] r0 = r1.split(r0)
            java.util.List r1 = java.util.Arrays.asList(r0)
            java.lang.String r0 = r4.user
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0191
        L_0x00bd:
            r4 = 1
        L_0x00be:
            if (r3 == 0) goto L_0x018f
            r5 = r8
            X.8iy r5 = (X.C179048iy) r5
            X.1EV r0 = r5.A0O
            java.util.List r3 = r5.A09
            X.0yC r1 = r0.A02
            r0 = 6472(0x1948, float:9.069E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x018c
            if (r3 == 0) goto L_0x018c
            java.util.Iterator r3 = r3.iterator()
        L_0x00d7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x018c
            java.lang.Object r1 = r3.next()
            X.9uC r1 = (X.C206909uC) r1
            X.B5M r0 = r1.A00
            if (r0 == 0) goto L_0x00d7
            java.lang.String r1 = r1.A01
            java.lang.String r0 = "upi_merchant_configuration"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d7
            r0 = 1
        L_0x00f2:
            r3 = 0
            if (r0 == 0) goto L_0x011f
            java.util.List r0 = r5.A09
            java.util.Objects.requireNonNull(r0)
            java.util.List r0 = r5.A09
            boolean r0 = X.C36401kF.A1a(r0)
            X.C18740tg.A0B(r0)
            java.util.List r0 = r5.A09
            java.lang.Object r0 = r0.get(r3)
            X.9uC r0 = (X.C206909uC) r0
            X.B5M r0 = r0.A00
            X.AHm r0 = (X.C21334AHm) r0
            java.util.Objects.requireNonNull(r0)
            X.AHl r0 = r0.A00
            if (r0 == 0) goto L_0x011f
            java.lang.String r0 = r0.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x011f
            r3 = 1
        L_0x011f:
            if (r4 == 0) goto L_0x0187
            java.lang.String r0 = "hpp"
        L_0x0123:
            r10.add(r0)
        L_0x0126:
            java.util.List r1 = r11.A0i
            android.content.Intent r0 = r11.getIntent()
            X.3Qa r6 = X.AnonymousClass3UJ.A02(r0)
            com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment r7 = new com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment
            r7.<init>()
            android.os.Bundle r5 = X.AnonymousClass001.A07()
            if (r1 != 0) goto L_0x013d
            X.09w r1 = X.C023409w.A00
        L_0x013d:
            java.util.ArrayList r1 = X.C36441kJ.A15(r1)
            java.lang.String r0 = "arg_native_methods"
            r5.putParcelableArrayList(r0, r1)
            java.util.ArrayList r1 = X.C36441kJ.A15(r2)
            java.lang.String r0 = "arg_external_methods"
            r5.putParcelableArrayList(r0, r1)
            java.lang.String r0 = "arg_selected_method"
            r5.putParcelable(r0, r12)
            java.lang.String r0 = "arg_hpp_checkout_enabled"
            r5.putBoolean(r0, r4)
            if (r6 == 0) goto L_0x015e
            X.AnonymousClass3UJ.A08(r5, r6)
        L_0x015e:
            java.lang.String r0 = "arg_has_merchant_configuration_payment_link"
            r5.putBoolean(r0, r3)
            r7.A17(r5)
            X.9Kc r0 = new X.9Kc
            r0.<init>(r11, r4, r3)
            r7.A0B = r0
            X.9Mg r5 = new X.9Mg
            r6 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            r7.A0C = r5
            if (r14 == 0) goto L_0x017e
            r14.A1n(r7)
        L_0x017a:
            r11.Bnv()
            return
        L_0x017e:
            r9.A02 = r7
            X.C65443Sb.A00(r9, r11)
            r11.A4U(r9)
            goto L_0x017a
        L_0x0187:
            if (r3 == 0) goto L_0x0126
            java.lang.String r0 = "payment_link"
            goto L_0x0123
        L_0x018c:
            r0 = 0
            goto L_0x00f2
        L_0x018f:
            r3 = 0
            goto L_0x011f
        L_0x0191:
            r4 = 0
            goto L_0x00be
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C179068j0.A4W(X.9un, X.9ua, com.whatsapp.payments.ui.PaymentBottomSheet):void");
    }

    public String A4i() {
        if (!C202349ld.A02(this.A0G)) {
            return C165607th.A0s(this.A0G);
        }
        AnonymousClass141 r0 = this.A08;
        if (r0 == null || TextUtils.isEmpty(r0.A0K())) {
            return BGY();
        }
        return this.A08.A0K();
    }

    public void A4j() {
        if (this instanceof IndiaUpiInterOpHybridActivity) {
            IndiaUpiInterOpHybridActivity indiaUpiInterOpHybridActivity = (IndiaUpiInterOpHybridActivity) this;
            AnonymousClass11F r2 = indiaUpiInterOpHybridActivity.A0D;
            if (r2 != null) {
                String A0t = C36371kC.A0t(indiaUpiInterOpHybridActivity.A0P.A03(), "pref_p2m_hybrid_last_used_payment_option");
                if (A0t == null || A0t.length() == 0) {
                    A0t = "other";
                }
                C188568zn A002 = AnonymousClass973.A00(A0t);
                if (A002 != null) {
                    C29151Vn r3 = indiaUpiInterOpHybridActivity.A01;
                    if (r3 != null) {
                        r3.A03(r2.user, A002.methodName, "QRC", 1);
                        return;
                    }
                    throw C36331k8.A0d("paymentDailyUsageManager");
                }
            }
        } else if (!(this instanceof IndiaWebViewUpiP2mHybridActivity)) {
            IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = (IndiaUpiCheckOrderDetailsActivity) this;
            if (C173858Tk.A0y(indiaUpiCheckOrderDetailsActivity)) {
                indiaUpiCheckOrderDetailsActivity.Bu1(R.string.f12nameremoved);
                AnonymousClass8gG r4 = indiaUpiCheckOrderDetailsActivity.A04;
                UserJid userJid = indiaUpiCheckOrderDetailsActivity.A0E;
                C18740tg.A06(userJid);
                String str = indiaUpiCheckOrderDetailsActivity.A07;
                C18740tg.A06(str);
                String str2 = indiaUpiCheckOrderDetailsActivity.A06;
                C18740tg.A06(str2);
                AnonymousClass9FK r6 = new AnonymousClass9FK(indiaUpiCheckOrderDetailsActivity);
                C165567td.A1K(userJid, str, str2);
                r4.A09.Boy(new AVn(r4, userJid, r6, str, str2, 4));
                return;
            }
            AVb.A00(indiaUpiCheckOrderDetailsActivity.A04, indiaUpiCheckOrderDetailsActivity, new C147336x3(indiaUpiCheckOrderDetailsActivity), 37);
        }
    }

    public void A4k(C175758b0 r13, C207119ua r14, PaymentBottomSheet paymentBottomSheet) {
        C175758b0 r9 = r13;
        C207119ua r2 = r14;
        if (this instanceof C179048iy) {
            C179048iy r1 = (C179048iy) this;
            PaymentBottomSheet paymentBottomSheet2 = paymentBottomSheet;
            if (paymentBottomSheet == null) {
                r1.A4p(true);
            }
            AnonymousClass73N r6 = new AnonymousClass73N(r1, paymentBottomSheet, r9, r14, 3);
            r1.A4r(r2, new C23159B7t(r13, r14, r1, 0), new B9W(paymentBottomSheet, r1, 2), paymentBottomSheet2, r6, new AVb(r1, paymentBottomSheet, 39));
            return;
        }
        AnonymousClass00C.A0D(r14, 0);
        A4l(r13, r14, (PaymentBottomSheet) null);
    }

    public void A4l(C175758b0 r3, C207119ua r4, PaymentBottomSheet paymentBottomSheet) {
        PaymentBottomSheet paymentBottomSheet2;
        if (paymentBottomSheet != null) {
            paymentBottomSheet2 = paymentBottomSheet;
        } else {
            paymentBottomSheet2 = new PaymentBottomSheet();
        }
        ConfirmPaymentFragment A4h = A4h(r3, r4, paymentBottomSheet2);
        if (paymentBottomSheet != null) {
            paymentBottomSheet.A1n(A4h);
            return;
        }
        paymentBottomSheet2.A02 = A4h;
        Btm(paymentBottomSheet2);
        A4U(paymentBottomSheet2);
    }

    public void A4m(C207249un r3, C207119ua r4, PaymentBottomSheet paymentBottomSheet) {
        ConfirmPaymentFragment A4L;
        if (r3 instanceof C175758b0) {
            A4L = A4h((C175758b0) r3, r4, paymentBottomSheet);
        } else {
            this.A0B = r3;
            A4L = A4L(r4.A02, (AnonymousClass16X) null, paymentBottomSheet);
        }
        paymentBottomSheet.A1n(A4L);
    }

    public final void A4o(C207119ua r6, C207199ui r7) {
        C188568zn A002;
        Bitmap bitmap;
        int i;
        String A0t = C36371kC.A0t(this.A0P.A03(), "pref_p2m_hybrid_last_used_payment_option");
        if (!"WhatsappPay".equals(A0t) || !this.A0P.A02("p2p_context").A0D()) {
            if (!TextUtils.isEmpty(A0t) && this.A0W.A0I(r7) == C188098z2.TOS_NONE && (A002 = AnonymousClass973.A00(A0t)) != null) {
                String str = A002.packageName;
                List list = C202409lm.A00;
                AnonymousClass00C.A0D(str, 1);
                try {
                    AnonymousClass1L0.A02(this, str);
                    if (C202409lm.A02(this, str)) {
                        Resources resources = getResources();
                        AnonymousClass00C.A0D(resources, 1);
                        String A012 = C202409lm.A01(resources, str);
                        C188568zn A003 = AnonymousClass973.A00(str);
                        if (A003 != null) {
                            i = A003.appIcon;
                        } else if ("other".equals(str)) {
                            i = R.drawable.ic_send_to_upi;
                        } else {
                            bitmap = null;
                            A4k(new C175758b0(bitmap, str, A012), r6, (PaymentBottomSheet) null);
                            return;
                        }
                        bitmap = BitmapFactory.decodeResource(resources, i);
                        A4k(new C175758b0(bitmap, str, A012), r6, (PaymentBottomSheet) null);
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            A4p(false);
            A4W(this.A0B, r6, (PaymentBottomSheet) null);
            return;
        }
        A4n(r6);
    }

    public void A4p(boolean z) {
        if (this instanceof IndiaUpiInterOpHybridActivity) {
            return;
        }
        if (!(this instanceof IndiaWebViewUpiP2mHybridActivity)) {
            IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = (IndiaUpiCheckOrderDetailsActivity) this;
            boolean z2 = !indiaUpiCheckOrderDetailsActivity.BMo();
            if (z) {
                if (!z2) {
                    indiaUpiCheckOrderDetailsActivity.Bu1(R.string.f12nameremoved);
                }
            } else if (z2) {
                C21302AGg aGg = indiaUpiCheckOrderDetailsActivity.A06;
                aGg.A0F.A0H(new AVY(aGg, 31));
            } else {
                indiaUpiCheckOrderDetailsActivity.Bnv();
            }
        } else if (z) {
            Bu1(R.string.f12nameremoved);
        } else {
            Bnv();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        if (i != 1022) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && intent != null) {
            Bundle extras = intent.getExtras();
            String str = "SUCCESS";
            if (extras == null || !str.equalsIgnoreCase(extras.getString("Status"))) {
                z = false;
            } else {
                z = true;
                A4j();
            }
            C131606Ps r2 = new C131606Ps((String) null, new C131606Ps[0]);
            if (!z) {
                str = "FAILED";
            }
            r2.A03("transaction_status", str);
            C175758b0 r1 = this.A00;
            if (r1 != null) {
                r2 = this.A0S.A05(r1, r2);
            }
            BOo(r2, 0, (Integer) null, "payment_complete");
        }
    }
}
