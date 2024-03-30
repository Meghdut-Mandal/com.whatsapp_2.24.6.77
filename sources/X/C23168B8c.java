package X;

import com.whatsapp.R;
import com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment;
import com.whatsapp.payments.ui.PaymentSettingsFragment;
import com.whatsapp.payments.ui.ReTosFragment;
import com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.B8c  reason: case insensitive filesystem */
public class C23168B8c implements AnonymousClass1XD {
    public Object A00;
    public final int A01;

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010b, code lost:
        r1 = (X.C225314u) r9.A00;
        X.C36391kE.A0Q(r1, com.whatsapp.R.id.unlink_payment_accounts_title).setText(com.whatsapp.R.string.f12nameremoved);
        X.C36331k8.A11(r1, com.whatsapp.R.id.unlink_payment_accounts_desc);
        r1.BO5(com.whatsapp.R.string.f12nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0125, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0185, code lost:
        r10 = (X.C178548gi) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x020e, code lost:
        X.C36341k9.A17(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0211, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bf1(X.AnonymousClass9KX r10) {
        /*
            r9 = this;
            r4 = r9
            int r0 = r9.A01
            switch(r0) {
                case 0: goto L_0x01b9;
                case 1: goto L_0x001c;
                case 2: goto L_0x0059;
                case 3: goto L_0x008c;
                case 4: goto L_0x009e;
                case 5: goto L_0x0126;
                case 6: goto L_0x014a;
                case 7: goto L_0x0181;
                case 8: goto L_0x01e2;
                case 9: goto L_0x01ff;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.String r0 = "DyiViewModel/delete-report/on-success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r9.A00
            X.8ld r1 = (X.C180358ld) r1
            X.9jf r2 = r1.A06
            java.lang.String r0 = r1.A08
            monitor-enter(r2)
            r2.A04(r0)     // Catch:{ all -> 0x0019 }
            goto L_0x0207
        L_0x0019:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x001c:
            java.lang.Object r2 = r9.A00
            X.8hf r2 = (X.C178828hf) r2
            r2.Bnv()
            X.8gh r10 = (X.C178538gh) r10
            java.util.List r1 = r10.A00
            if (r1 == 0) goto L_0x004c
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x004c
            int r0 = X.C203449o2.A01(r1)
            java.lang.Object r0 = r1.get(r0)
            X.9un r0 = (X.C207249un) r0
            X.8bF r1 = r0.A08
            boolean r0 = r1 instanceof X.C175818b6
            if (r0 == 0) goto L_0x004c
            X.8b6 r1 = (X.C175818b6) r1
            if (r1 == 0) goto L_0x004c
            X.AE0 r0 = r2.A0M
            r0.Bws(r1)
            r2.A48(r1)
            return
        L_0x004c:
            X.17Y r2 = r2.A05
            r1 = 37
            X.AVX r0 = new X.AVX
            r0.<init>(r9, r1)
            r2.A0H(r0)
            return
        L_0x0059:
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x010b
            java.lang.Object r3 = r9.A00
            X.8jA r3 = (X.C179098jA) r3
            X.AE0 r0 = r3.A0M
            X.1Db r2 = r0.A01     // Catch:{ JSONException -> 0x0077 }
            org.json.JSONObject r1 = X.C165567td.A0h(r2)     // Catch:{ JSONException -> 0x0077 }
            java.lang.String r0 = "smsVerifDataSentToPsp"
            r1.remove(r0)     // Catch:{ JSONException -> 0x0077 }
            java.lang.String r0 = "smsVerifData"
            r1.remove(r0)     // Catch:{ JSONException -> 0x0077 }
            X.C165577te.A1B(r2, r1)     // Catch:{ JSONException -> 0x0077 }
            goto L_0x007d
        L_0x0077:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs deleteSmsVerificationData threw: "
            com.whatsapp.util.Log.w(r0, r1)
        L_0x007d:
            r3.A3v()
            r3.Bnv()
            android.content.Intent r1 = r3.A4K()
            r0 = 1
            r3.A33(r1, r0)
            return
        L_0x008c:
            java.lang.Object r0 = r9.A00
            X.14p r0 = (X.C224914p) r0
            X.0wU r2 = r0.A04
            r0 = 0
            X.B7V r1 = new X.B7V
            r1.<init>(r9, r0)
            java.lang.String[] r0 = new java.lang.String[r0]
            r2.Box(r1, r0)
            return
        L_0x009e:
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x010b
            java.lang.Object r3 = r9.A00
            X.8hw r3 = (X.C178848hw) r3
            X.AE0 r1 = r3.A0M
            java.lang.String r0 = r1.A0B()
            r4 = 1
            r1.B5D(r0, r4)
            r3.A3v()
            android.content.Intent r2 = X.C165597tg.A0G(r3)
            com.whatsapp.payments.ui.widget.PaymentView r0 = r3.A0M
            if (r0 == 0) goto L_0x00d7
            java.lang.String r0 = r0.getPaymentNote()
            r3.A0j = r0
            com.whatsapp.payments.ui.widget.PaymentView r0 = r3.A0M
            X.6c9 r0 = r0.getPaymentBackground()
            r3.A0B = r0
            com.whatsapp.payments.ui.widget.PaymentView r1 = r3.A0M
            X.6c4 r0 = r1.getStickerIfSelected()
            r3.A0c = r0
            java.lang.Integer r0 = r1.getStickerSendOrigin()
            r3.A0f = r0
        L_0x00d7:
            r3.A42(r2)
            java.lang.String r1 = r3.A0f
            java.lang.String r0 = "payment_composer_icon"
            boolean r0 = r0.equals(r1)
            r1 = 3
            if (r0 == 0) goto L_0x00e7
            r1 = 10
        L_0x00e7:
            java.lang.String r0 = "extra_payments_entry_type"
            r2.putExtra(r0, r1)
            java.lang.String r0 = "extra_is_first_payment_method"
            r2.putExtra(r0, r4)
            java.lang.String r0 = "extra_skip_value_props_display"
            r2.putExtra(r0, r4)
            com.whatsapp.jid.UserJid r0 = r3.A0E
            java.lang.String r1 = X.AnonymousClass143.A03(r0)
            java.lang.String r0 = "extra_receiver_jid"
            r2.putExtra(r0, r1)
            r3.startActivity(r2)
            r3.finish()
            r3.Bnv()
            return
        L_0x010b:
            r2 = 2131892149(0x7f1217b5, float:1.9419038E38)
            java.lang.Object r1 = r9.A00
            X.14u r1 = (X.C225314u) r1
            r0 = 2131434933(0x7f0b1db5, float:1.8491694E38)
            android.widget.TextView r0 = X.C36391kE.A0Q(r1, r0)
            r0.setText(r2)
            r0 = 2131434932(0x7f0b1db4, float:1.8491692E38)
            X.C36331k8.A11(r1, r0)
            r1.BO5(r2)
            return
        L_0x0126:
            r3 = 0
            X.AnonymousClass00C.A0D(r10, r3)
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x0140
            java.lang.Object r2 = r9.A00
            com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment r2 = (com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment) r2
            X.1Db r0 = r2.A0Z
            android.content.SharedPreferences$Editor r1 = X.C90494aF.A0E(r0)
            java.lang.String r0 = "has_p2mlite_account"
            X.C36331k8.A0w(r1, r0, r3)
            com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment.A03(r2)
        L_0x0140:
            java.lang.Object r0 = r9.A00
            com.whatsapp.payments.ui.PaymentSettingsFragment r0 = (com.whatsapp.payments.ui.PaymentSettingsFragment) r0
            X.17Y r0 = r0.A0D
            r0.A02()
            return
        L_0x014a:
            java.lang.Object r3 = r9.A00
            com.whatsapp.payments.ui.ReTosFragment r3 = (com.whatsapp.payments.ui.ReTosFragment) r3
            X.1Dc r2 = r3.A06
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "accept-tos/result="
            r1.append(r0)
            boolean r0 = r10.A02
            X.C165577te.A1E(r2, r1, r0)
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x0177
            r0 = 1
            r3.A1g(r0)
            android.widget.Button r1 = r3.A00
            r0 = 0
            r1.setVisibility(r0)
            android.widget.ProgressBar r1 = r3.A01
            r0 = 8
            r1.setVisibility(r0)
            r3.A1b()
            return
        L_0x0177:
            r1 = 0
            X.9ky r0 = new X.9ky
            r0.<init>((int) r1)
            r9.A00(r0)
            return
        L_0x0181:
            boolean r0 = r10 instanceof X.C178548gi
            if (r0 == 0) goto L_0x01d1
            X.8gi r10 = (X.C178548gi) r10
            java.util.List r0 = r10.A01
            if (r0 == 0) goto L_0x01d1
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x01d1
            java.lang.Object r2 = r9.A00
            X.7yq r2 = (X.C167797yq) r2
            X.1Dc r1 = r2.A0c
            java.lang.String r0 = "BrazilConsumer/getTransactions/onResponseSuccess"
            r1.A04(r0)
            X.9u9 r1 = r10.A00
            if (r1 == 0) goto L_0x01c9
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x01c8
            java.lang.String r0 = r1.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01c8
            X.1XC r3 = r2.A0Z
            X.9u9 r0 = r10.A00
            java.lang.String r7 = r0.A00
            r5 = 0
            r8 = r5
            r6 = r5
            r3.A01(r4, r5, r6, r7, r8)
            return
        L_0x01b9:
            java.lang.Object r0 = r9.A00
            X.9ok r0 = (X.C203749ok) r0
            java.lang.Object r1 = r0.A01
            X.3ty r1 = (X.C79593ty) r1
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r1.A0C(r0)
        L_0x01c8:
            return
        L_0x01c9:
            r0 = 0
            r2.A0p(r0)
            r2.A0q(r0)
            return
        L_0x01d1:
            java.lang.Object r0 = r9.A00
            X.7yq r0 = (X.C167797yq) r0
            X.1Rs r2 = r0.A08
            r1 = 24
            X.9Og r0 = new X.9Og
            r0.<init>(r1)
            r2.A0D(r0)
            return
        L_0x01e2:
            java.lang.Object r3 = r9.A00
            X.7yi r3 = (X.C167737yi) r3
            X.C167737yi.A02(r3)
            java.lang.String r0 = "PAY: BrazilMerchantDetailsViewModel removePayment Success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2 = 2131893978(0x7f121eda, float:1.9422748E38)
            r0 = 6
            X.9O9 r1 = new X.9O9
            r1.<init>(r0)
            r1.A00 = r2
            X.1Rs r0 = r3.A03
            r0.A0D(r1)
            return
        L_0x01ff:
            java.lang.Object r0 = r9.A00
            com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel r0 = (com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel) r0
            X.00s r1 = r0.A01
            r0 = 3
            goto L_0x020e
        L_0x0207:
            monitor-exit(r2)
            X.00s r1 = r1.A02
            int r0 = r2.A02(r0)
        L_0x020e:
            X.C36341k9.A17(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23168B8c.Bf1(X.9KX):void");
    }

    public C23168B8c(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00(C202059ky r7) {
        ReTosFragment reTosFragment = (ReTosFragment) this.A00;
        reTosFragment.A1g(true);
        reTosFragment.A00.setVisibility(0);
        reTosFragment.A01.setVisibility(8);
        AnonymousClass01I A0h = reTosFragment.A0h();
        if (A0h != null) {
            C23186B8u b8u = new C23186B8u(this, 22);
            C204149pX r2 = C204149pX.A00;
            AnonymousClass0FM A04 = reTosFragment.A05.A04(A0h, b8u, r2, r7.A00);
            if (A04 == null) {
                A04 = C202939my.A00(A0h, r2, reTosFragment.A0n(R.string.f12nameremoved));
            }
            A04.show();
        }
    }

    public void Bes(C202059ky r5) {
        switch (this.A01) {
            case 0:
                ((C79593ty) ((C203749ok) this.A00).A01).A0C(C36381kD.A0j());
                return;
            case 1:
                ((C225314u) this.A00).A05.A0H(new AVX(this, 35));
                return;
            case 2:
                C179098jA r1 = (C179098jA) this.A00;
                r1.Bnv();
                r1.A4N(r1.A09);
                return;
            case 3:
                C179008it r3 = (C179008it) this.A00;
                r3.A03.A0A(AnonymousClass000.A0l(r5, "incorrect format retry: get-methods request error: ", AnonymousClass000.A0u()), (Throwable) null);
                r3.A4D();
                return;
            case 4:
                return;
            case 5:
                ((PaymentSettingsFragment) this.A00).A0D.A02();
                return;
            case 6:
                A00(r5);
                return;
            case 7:
                ((C167797yq) this.A00).A08.A0D(new C194139Og(24));
                return;
            case 8:
                C167737yi r32 = (C167737yi) this.A00;
                C167737yi.A02(r32);
                C36321k7.A1L(r5, "PAY: BrazilMerchantDetailsViewModel removePayment/onRequestError. paymentNetworkError: ", AnonymousClass000.A0u());
                AnonymousClass9O9 r12 = new AnonymousClass9O9(6);
                r12.A00 = R.string.f12nameremoved;
                r32.A03.A0D(r12);
                return;
            case 9:
                C36341k9.A17(((BrazilPixKeySettingViewModel) this.A00).A01, 2);
                C165577te.A1M("BrazilPixKeySettingViewModel", "deleteAccount/onRequestError");
                return;
            default:
                Log.i("DyiViewModel/delete-report/on-error");
                if (r5.A00 == 404) {
                    C180358ld r13 = (C180358ld) this.A00;
                    C201469jf r2 = r13.A06;
                    String str = r13.A08;
                    synchronized (r2) {
                        r2.A04(str);
                    }
                    C36341k9.A17(r13.A02, r2.A02(str));
                    return;
                }
                C165587tf.A11(((C180358ld) this.A00).A03, C36361kB.A0i(), r5);
                return;
        }
    }

    public void Bf0(C202059ky r5) {
        switch (this.A01) {
            case 0:
                ((C79593ty) ((C203749ok) this.A00).A01).A0C(C36381kD.A0j());
                return;
            case 1:
                ((C225314u) this.A00).A05.A0H(new AVX(this, 36));
                return;
            case 2:
                C179098jA r1 = (C179098jA) this.A00;
                r1.Bnv();
                r1.A4N(r1.A09);
                return;
            case 3:
                C179008it r3 = (C179008it) this.A00;
                r3.A03.A0A(AnonymousClass000.A0l(r5, "incorrect format retry: get-methods response error: ", AnonymousClass000.A0u()), (Throwable) null);
                r3.A4D();
                return;
            case 4:
                ((C225314u) this.A00).Bnv();
                return;
            case 5:
                AnonymousClass00C.A0D(r5, 0);
                P2mLitePaymentSettingsFragment p2mLitePaymentSettingsFragment = (P2mLitePaymentSettingsFragment) this.A00;
                C194509Pz r2 = p2mLitePaymentSettingsFragment.A07;
                if (r2 != null) {
                    r2.A00((long) r5.A00);
                }
                p2mLitePaymentSettingsFragment.A0D.A02();
                return;
            case 6:
                A00(r5);
                return;
            case 7:
                ((C167797yq) this.A00).A08.A0D(new C194139Og(24));
                return;
            case 8:
                C167737yi r32 = (C167737yi) this.A00;
                C167737yi.A02(r32);
                C36321k7.A1K(r5, "PAY: BrazilMerchantDetailsViewModel removePayment/onResponseError. paymentNetworkError: ", AnonymousClass000.A0u());
                AnonymousClass9O9 r12 = new AnonymousClass9O9(6);
                r12.A00 = R.string.f12nameremoved;
                r32.A03.A0D(r12);
                return;
            case 9:
                AnonymousClass00C.A0D(r5, 0);
                C36341k9.A17(((BrazilPixKeySettingViewModel) this.A00).A01, 2);
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("deleteAccount/onRequestError");
                C165577te.A1M("BrazilPixKeySettingViewModel", C36381kD.A10(A0u, r5.A00));
                return;
            default:
                Log.i("DyiViewModel/delete-report/on-error");
                C165587tf.A11(((C180358ld) this.A00).A03, C36361kB.A0i(), r5);
                return;
        }
    }
}
