package X;

import android.app.Application;
import com.whatsapp.R;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationViewModel;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalValidateQrViewModel;
import com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BAc  reason: case insensitive filesystem */
public class C23220BAc implements C236119d {
    public Object A00;
    public Object A01;
    public final int A02;

    public C23220BAc(C178188fF r2, C186018vH r3) {
        this.A02 = 4;
        this.A00 = r3;
        this.A01 = new C191879Ev(r2);
    }

    public static C186018vH A00(C23220BAc bAc, Object obj) {
        AnonymousClass00C.A0D(obj, 1);
        return (C186018vH) bAc.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006c, code lost:
        X.C36321k7.A1Q(r0, r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BVN(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = r3.A02
            switch(r0) {
                case 0: goto L_0x000a;
                case 1: goto L_0x0050;
                case 2: goto L_0x000b;
                case 3: goto L_0x0058;
                case 4: goto L_0x005f;
                case 5: goto L_0x0066;
                case 6: goto L_0x0028;
                case 7: goto L_0x004d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = "validateInternationalQrCode/onDeliveryFailure"
        L_0x0007:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x000a:
            return
        L_0x000b:
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            java.lang.Object r2 = r3.A01
            X.9Et r2 = (X.C191859Et) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GetNewsletterMessagesJob/onDeliveryFailure iqId = "
            X.C36321k7.A1Q(r0, r4, r1)
            X.8fH r0 = r2.A00
            X.Az1 r1 = r0.callback
            if (r1 == 0) goto L_0x000a
            java.lang.String r0 = r0.token
            r1.BoK(r0)
            return
        L_0x0028:
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            java.lang.Object r0 = r3.A01
            X.9KV r0 = (X.AnonymousClass9KV) r0
            X.9Lw r0 = r0.A01
            com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel r0 = r0.A00
            X.00s r1 = r0.A00
            r0 = 2
            X.C36341k9.A17(r1, r0)
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CreateCustomPaymentMethodAction iq onDeliveryFailure: {"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.AnonymousClass000.A0t(r1, r2)
            goto L_0x0007
        L_0x004d:
            java.lang.String r0 = "activateInternationalPayments/onActivateInternational/onDeliveryFailure"
            goto L_0x0007
        L_0x0050:
            java.lang.Object r0 = r3.A01
            X.1MQ r0 = (X.AnonymousClass1MQ) r0
            r0.A00()
            return
        L_0x0058:
            java.lang.StringBuilder r1 = X.C36341k9.A0i(r4)
            java.lang.String r0 = "GetNewsletterMessagesUpdatesJob/onDeliveryFailure iqId = "
            goto L_0x006c
        L_0x005f:
            java.lang.StringBuilder r1 = X.C36341k9.A0i(r4)
            java.lang.String r0 = "GetNewsletterMyAddOnsMessagesJob/onDeliveryFailure iqId = "
            goto L_0x006c
        L_0x0066:
            java.lang.StringBuilder r1 = X.C36341k9.A0i(r4)
            java.lang.String r0 = "SubscribeNewsletterRequest/onDeliveryFailure iqId = "
        L_0x006c:
            X.C36321k7.A1Q(r0, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23220BAc.BVN(java.lang.String):void");
    }

    public void BWw(C203399nx r14, String str) {
        switch (this.A02) {
            case 0:
                AnonymousClass00C.A0D(r14, 1);
                try {
                    C203539oF.A0B(r14, new C23212B9u(C90514aH.A0e(r14, (C592133b) this.A01), 47));
                    C22993Azj[] azjArr = new C22993Azj[4];
                    azjArr[0] = AMY.A00;
                    azjArr[1] = AMZ.A00;
                    azjArr[2] = C21452AMa.A00;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Fetching parent participants failed: ");
                    C36351kA.A1S(A0u, ((B00) C203379ns.A06(r14, "IQErrorBadRequest|IQErrorItemNotFound|IQErrorNotAuthorized|IQErrorRateOverlimit", C165567td.A0d(C21453AMb.A00, azjArr, 3), C165607th.A1a())).B9o().longValue());
                    return;
                } catch (C235919b e) {
                    Log.e((Throwable) e);
                    return;
                }
            case 1:
                ((AnonymousClass1MQ) this.A01).A00();
                return;
            case 2:
                A01((C191859Et) this.A01, r14, A00(this, r14));
                return;
            case 3:
                A02((C191869Eu) this.A01, r14, A00(this, r14));
                return;
            case 4:
                A03((C191879Ev) this.A01, r14, A00(this, r14));
                return;
            case 5:
                A04((AnonymousClass9KR) this.A01, r14, A00(this, r14));
                return;
            case 6:
                AnonymousClass00C.A0D(r14, 1);
                A05(((AnonymousClass9KV) this.A01).A01, r14, (C185928v8) this.A00);
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("CreateCustomPaymentMethodAction iq onError: {");
                A0u2.append(r14);
                C36321k7.A1Z(A0u2, ".toString()}");
                return;
            case 7:
                AnonymousClass00C.A0D(r14, 1);
                C199809g0 r3 = null;
                C184988tK r2 = (C184988tK) new C186268vg(r14, (C186008vG) this.A01, 12).A00;
                long A0B = C165587tf.A0B(r2.A00);
                String str2 = r2.A03;
                AnonymousClass00C.A08(str2);
                IndiaUpiInternationalActivationViewModel indiaUpiInternationalActivationViewModel = ((AnonymousClass9IF) this.A00).A01;
                AF7 af7 = indiaUpiInternationalActivationViewModel.A04;
                C131606Ps r7 = new C131606Ps((String) null, new C131606Ps[0]);
                r7.A03("payments_error_code", String.valueOf(A0B));
                r7.A03("payments_error_text", str2);
                C203049nB.A03(r7, af7, 51, "international_payment_prompt", (String) null, 4);
                C001700s r6 = indiaUpiInternationalActivationViewModel.A00;
                C199809g0 r5 = (C199809g0) r6.A04();
                if (r5 != null) {
                    Application application = indiaUpiInternationalActivationViewModel.A00;
                    r3 = new C199809g0(new AnonymousClass9WH(A0B, application.getString(R.string.f12nameremoved), application.getString(R.string.f12nameremoved)), r5.A01, false);
                }
                r6.A0C(r3);
                return;
            default:
                AnonymousClass00C.A0D(r14, 1);
                C186268vg r0 = new C186268vg(r14, (C186008vG) this.A01, 14);
                C199739fs r22 = null;
                IndiaUpiInternationalValidateQrViewModel indiaUpiInternationalValidateQrViewModel = ((C193179Kd) this.A00).A01;
                C001700s r62 = indiaUpiInternationalValidateQrViewModel.A00;
                C199739fs r52 = (C199739fs) r62.A04();
                if (r52 != null) {
                    long A0B2 = C165587tf.A0B(((C184988tK) r0.A00).A00);
                    Application application2 = indiaUpiInternationalValidateQrViewModel.A00;
                    r22 = new C199739fs(new AnonymousClass9WI(A0B2, application2.getString(R.string.f12nameremoved), application2.getString(R.string.f12nameremoved)), r52.A01);
                }
                r62.A0C(r22);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007f, code lost:
        if (java.math.BigDecimal.ZERO.compareTo(X.C165617ti.A0b(r9)) == 0) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BiM(X.C203399nx r24, java.lang.String r25) {
        /*
            r23 = this;
            r0 = r23
            int r2 = r0.A02
            r1 = r24
            switch(r2) {
                case 0: goto L_0x028f;
                case 1: goto L_0x027e;
                case 2: goto L_0x0272;
                case 3: goto L_0x0266;
                case 4: goto L_0x025a;
                case 5: goto L_0x024e;
                case 6: goto L_0x023c;
                case 7: goto L_0x00e3;
                default: goto L_0x0009;
            }
        L_0x0009:
            r2 = 1
            X.AnonymousClass00C.A0D(r1, r2)
            java.lang.Object r3 = r0.A01
            X.8vG r3 = (X.C186008vG) r3
            X.8vY r2 = new X.8vY
            r2.<init>(r1, r3)
            java.lang.Object r4 = r0.A00
            X.9Kd r4 = (X.C193179Kd) r4
            r10 = 0
            r8 = 0
            com.whatsapp.payments.ui.international.IndiaUpiInternationalValidateQrViewModel r5 = r4.A01
            X.8sF r3 = r2.A00
            java.lang.String r13 = r3.A01
            X.AnonymousClass00C.A08(r13)
            X.0yC r1 = r5.A01
            r6 = 0
            r0 = 3102(0xc1e, float:4.347E-42)
            java.lang.String r1 = X.C36431kI.A19(r1, r0)
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00b7
            java.lang.String r0 = ","
            java.util.List r1 = X.C90494aF.A0i(r1, r0)
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.Object[] r7 = r1.toArray(r0)
            java.lang.String[] r7 = (java.lang.String[]) r7
            int r6 = r7.length
            r1 = 0
        L_0x0044:
            if (r1 >= r6) goto L_0x00b7
            r0 = r7[r1]
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0072
            java.lang.String r9 = r3.A00
            int r0 = X.C165607th.A08(r9)
            if (r0 != 0) goto L_0x006f
            java.lang.String r7 = "01"
        L_0x0058:
            X.6c7 r0 = r4.A00
            java.lang.Object r1 = r0.A00
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "UTF-8"
            java.lang.String r0 = java.net.URLDecoder.decode(r1, r0)
            android.net.Uri r1 = android.net.Uri.parse(r0)
            java.lang.String r0 = "mc"
            java.lang.String r6 = X.C203479o6.A02(r1, r0)
            goto L_0x0075
        L_0x006f:
            java.lang.String r7 = "15"
            goto L_0x0058
        L_0x0072:
            int r1 = r1 + 1
            goto L_0x0044
        L_0x0075:
            java.math.BigDecimal r1 = java.math.BigDecimal.ZERO     // Catch:{ NumberFormatException -> 0x0081 }
            java.math.BigDecimal r0 = X.C165617ti.A0b(r9)     // Catch:{ NumberFormatException -> 0x0081 }
            int r0 = r1.compareTo(r0)     // Catch:{ NumberFormatException -> 0x0081 }
            if (r0 != 0) goto L_0x0082
        L_0x0081:
            r9 = r10
        L_0x0082:
            X.1Rs r1 = r5.A04
            java.lang.String r5 = r2.A02
            X.AnonymousClass00C.A08(r5)
            if (r6 != 0) goto L_0x008d
            java.lang.String r6 = r2.A01
        L_0x008d:
            java.lang.String r11 = r4.A02
            java.lang.String r12 = r2.A03
            X.AnonymousClass00C.A08(r12)
            java.lang.String r14 = r3.A02
            X.AnonymousClass00C.A08(r14)
            java.lang.String r15 = r3.A03
            X.AnonymousClass00C.A08(r15)
            java.lang.String r0 = r2.A04
            X.AnonymousClass00C.A08(r0)
            java.lang.String r8 = "11"
            r17 = 1
            X.9tz r4 = new X.9tz
            r16 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.8jn r0 = new X.8jn
            r0.<init>(r4)
            r1.A0C(r0)
            return
        L_0x00b7:
            X.00s r7 = r5.A00
            java.lang.Object r6 = r7.A04()
            X.9fs r6 = (X.C199739fs) r6
            if (r6 == 0) goto L_0x00df
            r2 = 0
            android.app.Application r1 = r5.A00
            r0 = 2131895482(0x7f1224ba, float:1.9425798E38)
            java.lang.String r4 = r1.getString(r0)
            r0 = 2131895481(0x7f1224b9, float:1.9425796E38)
            java.lang.String r0 = r1.getString(r0)
            X.9WI r1 = new X.9WI
            r1.<init>(r2, r4, r0)
            boolean r0 = r6.A01
            X.9fs r8 = new X.9fs
            r8.<init>(r1, r0)
        L_0x00df:
            r7.A0C(r8)
            return
        L_0x00e3:
            r2 = 1
            X.AnonymousClass00C.A0D(r1, r2)
            java.lang.Object r3 = r0.A01
            X.33b r3 = (X.C592133b) r3
            java.util.ArrayList r2 = X.C186068vM.A00
            r14 = 0
            X.9nx r10 = X.C90514aH.A0e(r1, r3)
            java.lang.String r2 = "account"
            java.lang.String r3 = "action"
            java.lang.String[] r20 = new java.lang.String[]{r2, r3}
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            java.lang.String[] r15 = new java.lang.String[]{r2, r3}
            java.lang.Long r12 = X.C165567td.A0P()
            java.lang.Long r13 = X.C165567td.A0Q()
            r7 = 0
            X.9oF r9 = X.C203379ns.A00
            r16 = 0
            java.lang.Object r19 = r9.A0Z(r10, r11, r12, r13, r14, r15, r16)
            r21 = 1
            r15 = r1
            r16 = r11
            r17 = r12
            r18 = r13
            X.C203379ns.A03(r15, r16, r17, r18, r19, r20, r21)
            java.lang.String r3 = "start-ts"
            java.lang.String[] r21 = new java.lang.String[]{r2, r3}
            java.lang.Class<java.lang.Long> r17 = java.lang.Long.class
            java.lang.Long r18 = X.C36411kG.A0t()
            r22 = 0
            r15 = r9
            r16 = r1
            r19 = r13
            r20 = r14
            java.lang.Object r6 = r15.A0Z(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Number r6 = (java.lang.Number) r6
            java.lang.String r3 = "end-ts"
            java.lang.String[] r21 = new java.lang.String[]{r2, r3}
            java.lang.Object r3 = r15.A0Z(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Number r3 = (java.lang.Number) r3
            java.lang.String r4 = "version"
            java.lang.String[] r21 = new java.lang.String[]{r2, r4}
            r4 = 1
            java.lang.Long r18 = java.lang.Long.valueOf(r4)
            X.C203379ns.A03(r16, r17, r18, r19, r20, r21, r22)
            java.util.ArrayList r9 = X.C186068vM.A00
            java.lang.String r8 = "international-payments-status"
            java.lang.String r15 = X.C203379ns.A07(r1, r2, r8, r9)
            r9 = 5
            X.B9w r8 = new X.B9w
            r8.<init>(r10, r9)
            X.C203539oF.A0B(r1, r8)
            java.lang.String[] r10 = new java.lang.String[]{r2}
            X.ARu r9 = X.C21602ARu.A00
            r11 = 1
            r13 = 1
            r8 = r1
            java.util.ArrayList r1 = X.C203539oF.A09(r8, r9, r10, r11, r13)
            r1.get(r7)
            java.lang.Object r0 = r0.A00
            X.9IF r0 = (X.AnonymousClass9IF) r0
            X.AnonymousClass00C.A08(r15)
            X.AnonymousClass00C.A08(r6)
            long r13 = r6.longValue()
            X.AnonymousClass00C.A08(r3)
            long r16 = r3.longValue()
            X.9WE r12 = new X.9WE
            r12.<init>(r13, r15, r16)
            com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationViewModel r6 = r0.A01
            X.9fz r9 = r6.A05
            X.9WD r3 = r0.A00
            java.lang.String r15 = r3.A02
            java.lang.String r8 = r12.A02
            long r13 = r12.A01
            long r0 = r12.A00
            X.9Wg r12 = new X.9Wg
            r16 = r0
            r18 = r8
            r12.<init>(r13, r15, r16, r18)
            X.00T r11 = r9.A01
            java.util.Map r10 = X.C90514aH.A16(r11)
            java.lang.String r2 = r12.A03
            r10.put(r2, r12)
            java.util.Map r2 = X.C90514aH.A16(r11)
            X.C199799fz.A00(r9, r2)
            java.lang.String r2 = "activated"
            boolean r2 = X.AnonymousClass00C.A0J(r8, r2)
            r10 = 1
            android.app.Application r9 = r6.A00
            if (r2 == 0) goto L_0x0234
            r11 = 2131892718(0x7f1219ee, float:1.9420192E38)
            java.lang.Object[] r8 = new java.lang.Object[r10]
            X.0ts r2 = r6.A01
            java.lang.String r2 = X.C202809mh.A00(r2, r0)
            java.lang.String r8 = X.C36391kE.A0v(r9, r2, r8, r7, r11)
        L_0x01d3:
            X.AnonymousClass00C.A0B(r8)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            long r11 = r2.toSeconds(r4)
            long r15 = r0 + r11
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.6c7 r2 = r3.A00
            java.lang.Object r14 = r2.A00
            X.C18740tg.A06(r14)
            X.AnonymousClass00C.A08(r14)
            r13 = r14
            java.lang.Number r13 = (java.lang.Number) r13
            long r2 = r13.longValue()
            long r11 = r11.toSeconds(r2)
            int r2 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r2 < 0) goto L_0x0224
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            long r2 = r2.toSeconds(r4)
            long r11 = r0 - r2
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.C18740tg.A06(r14)
            long r2 = r13.longValue()
            long r3 = r4.toSeconds(r2)
            int r2 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0224
            java.lang.String r0 = ""
        L_0x0214:
            X.1Rs r2 = r6.A06
            X.9uT r1 = new X.9uT
            r1.<init>(r8, r0, r7)
            X.8jm r0 = new X.8jm
            r0.<init>(r1)
            r2.A0C(r0)
            return
        L_0x0224:
            r4 = 2131890535(0x7f121167, float:1.9415765E38)
            java.lang.Object[] r3 = new java.lang.Object[r10]
            X.0ts r2 = r6.A01
            java.lang.String r0 = X.C202809mh.A00(r2, r0)
            java.lang.String r0 = X.C36351kA.A0x(r9, r0, r3, r7, r4)
            goto L_0x0214
        L_0x0234:
            r2 = 2131892721(0x7f1219f1, float:1.9420198E38)
            java.lang.String r8 = r9.getString(r2)
            goto L_0x01d3
        L_0x023c:
            r2 = 1
            X.AnonymousClass00C.A0D(r1, r2)
            java.lang.Object r2 = r0.A00
            X.8v8 r2 = (X.C185928v8) r2
            java.lang.Object r0 = r0.A01
            X.9KV r0 = (X.AnonymousClass9KV) r0
            X.9Lw r0 = r0.A01
            A05(r0, r1, r2)
            return
        L_0x024e:
            X.8vH r2 = A00(r0, r1)
            java.lang.Object r0 = r0.A01
            X.9KR r0 = (X.AnonymousClass9KR) r0
            A04(r0, r1, r2)
            return
        L_0x025a:
            X.8vH r2 = A00(r0, r1)
            java.lang.Object r0 = r0.A01
            X.9Ev r0 = (X.C191879Ev) r0
            A03(r0, r1, r2)
            return
        L_0x0266:
            X.8vH r2 = A00(r0, r1)
            java.lang.Object r0 = r0.A01
            X.9Eu r0 = (X.C191869Eu) r0
            A02(r0, r1, r2)
            return
        L_0x0272:
            X.8vH r2 = A00(r0, r1)
            java.lang.Object r0 = r0.A01
            X.9Et r0 = (X.C191859Et) r0
            A01(r0, r1, r2)
            return
        L_0x027e:
            java.lang.Object r2 = r0.A01
            X.1MQ r2 = (X.AnonymousClass1MQ) r2
            X.19B r1 = r2.A01
            java.lang.Object r0 = r0.A00
            X.9WB r0 = (X.AnonymousClass9WB) r0
            r1.A08(r0)
            r2.A00()
            return
        L_0x028f:
            r2 = 1
            X.AnonymousClass00C.A0D(r1, r2)
            java.lang.Object r2 = r0.A01
            X.33b r2 = (X.C592133b) r2
            X.9nx r4 = X.C90514aH.A0e(r1, r2)
            r3 = 48
            X.B9u r2 = new X.B9u
            r2.<init>(r4, r3)
            X.C203539oF.A0C(r1, r2)
            java.lang.String r3 = "linked_groups_participants"
            java.lang.String r2 = "participant"
            java.lang.String[] r3 = new java.lang.String[]{r3, r2}
            X.AMc r2 = X.C21454AMc.A00
            r4 = 1
            r6 = 19999(0x4e1f, double:9.881E-320)
            java.util.ArrayList r1 = X.C203539oF.A09(r1, r2, r3, r4, r6)
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r1.iterator()
        L_0x02bf:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x02d8
            java.lang.Object r1 = r2.next()
            X.8rq r1 = (X.C184068rq) r1
            java.lang.Object r1 = r1.A00
            X.8tv r1 = (X.C185298tv) r1
            com.whatsapp.jid.UserJid r1 = r1.A00
            X.AnonymousClass00C.A08(r1)
            r5.add(r1)
            goto L_0x02bf
        L_0x02d8:
            java.lang.Object r0 = r0.A00
            X.342 r0 = (X.AnonymousClass342) r0
            X.1Sn r4 = r0.A00
            X.0wU r3 = r4.A0C
            X.147 r2 = r0.A01
            r1 = 37
            X.74n r0 = new X.74n
            r0.<init>(r4, r2, r5, r1)
            r3.Boy(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23220BAc.BiM(X.9nx, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r11.fetchingForGaps != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C191859Et r20, X.C203399nx r21, X.C186018vH r22) {
        /*
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            r0 = 3
            r6 = r20
            r5 = r21
            r4 = r22
            X.8vf r7 = new X.8vf     // Catch:{ 19b -> 0x00d7 }
            r7.<init>(r5, r4, r0)     // Catch:{ 19b -> 0x00d7 }
            X.8fH r11 = r6.A00     // Catch:{ 19b -> 0x00d7 }
            java.lang.Long r0 = r11.afterServerId     // Catch:{ 19b -> 0x00d7 }
            if (r0 != 0) goto L_0x001c
            boolean r0 = r11.fetchingForGaps     // Catch:{ 19b -> 0x00d7 }
            r17 = 1
            if (r0 == 0) goto L_0x001e
        L_0x001c:
            r17 = 0
        L_0x001e:
            X.1SL r10 = r11.A03     // Catch:{ 19b -> 0x00d7 }
            if (r10 != 0) goto L_0x0029
            java.lang.String r0 = "newsletterBatchedMessagesManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)     // Catch:{ 19b -> 0x00d7 }
            throw r0     // Catch:{ 19b -> 0x00d7 }
        L_0x0029:
            X.1Uw r9 = r11.newsletterJid     // Catch:{ 19b -> 0x00d7 }
            long r1 = r11.count     // Catch:{ 19b -> 0x00d7 }
            boolean r0 = r11.fetchingForGaps     // Catch:{ 19b -> 0x00d7 }
            r16 = r0
            java.lang.Object r12 = r7.A01     // Catch:{ 19b -> 0x00d7 }
            X.1jM r12 = (X.C35851jM) r12     // Catch:{ 19b -> 0x00d7 }
            X.AnonymousClass00C.A08(r12)     // Catch:{ 19b -> 0x00d7 }
            r13 = 0
            X.AnonymousClass00C.A0D(r9, r13)     // Catch:{ 19b -> 0x00d7 }
            java.lang.Object r0 = r12.A01     // Catch:{ 19b -> 0x00d7 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ 19b -> 0x00d7 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ 19b -> 0x00d7 }
            int r14 = r0.size()     // Catch:{ 19b -> 0x00d7 }
            long r7 = (long) r14     // Catch:{ 19b -> 0x00d7 }
            int r15 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r15 >= 0) goto L_0x0070
            if (r17 == 0) goto L_0x0070
            X.1Ja r15 = r10.A03     // Catch:{ 19b -> 0x00d7 }
            X.12q r1 = r15.A02     // Catch:{ 19b -> 0x00d7 }
            X.3Qp r8 = r1.A09(r9, r13)     // Catch:{ 19b -> 0x00d7 }
            boolean r1 = r8 instanceof X.C44072La     // Catch:{ 19b -> 0x00d7 }
            if (r1 == 0) goto L_0x0070
            X.2La r8 = (X.C44072La) r8     // Catch:{ 19b -> 0x00d7 }
            if (r8 == 0) goto L_0x0070
            r1 = 1
            r8.A0P = r1     // Catch:{ 19b -> 0x00d7 }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ 19b -> 0x00d7 }
            r7.<init>()     // Catch:{ 19b -> 0x00d7 }
            boolean r2 = r8.A0P     // Catch:{ 19b -> 0x00d7 }
            java.lang.String r1 = "oldest_message_retrieved"
            X.C54272sg.A00(r7, r1, r2)     // Catch:{ 19b -> 0x00d7 }
            X.C26141Ja.A01(r7, r8, r15)     // Catch:{ 19b -> 0x00d7 }
        L_0x0070:
            if (r14 == 0) goto L_0x00c2
            X.12q r1 = r10.A01     // Catch:{ 19b -> 0x00d7 }
            X.3Qp r7 = r1.A09(r9, r13)     // Catch:{ 19b -> 0x00d7 }
            X.2La r7 = (X.C44072La) r7     // Catch:{ 19b -> 0x00d7 }
            if (r7 == 0) goto L_0x00c2
            java.lang.Object r1 = r12.A02     // Catch:{ 19b -> 0x00d7 }
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ 19b -> 0x00d7 }
            if (r1 != 0) goto L_0x0088
            r1 = -1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ 19b -> 0x00d7 }
        L_0x0088:
            long r20 = r1.longValue()     // Catch:{ 19b -> 0x00d7 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ 19b -> 0x00d7 }
        L_0x0090:
            boolean r0 = r2.hasNext()     // Catch:{ 19b -> 0x00d7 }
            if (r0 == 0) goto L_0x00ad
            java.lang.Object r1 = r2.next()     // Catch:{ 19b -> 0x00d7 }
            X.1jK r1 = (X.C35831jK) r1     // Catch:{ 19b -> 0x00d7 }
            X.1TZ r0 = r10.A09     // Catch:{ 19b -> 0x00d7 }
            X.AnonymousClass00C.A0B(r1)     // Catch:{ 19b -> 0x00d7 }
            r22 = 0
            r17 = r0
            r18 = r9
            r19 = r1
            r17.A02(r18, r19, r20, r22)     // Catch:{ 19b -> 0x00d7 }
            goto L_0x0090
        L_0x00ad:
            X.1SP r8 = r10.A0A     // Catch:{ 19b -> 0x00d7 }
            if (r16 != 0) goto L_0x00cc
            boolean r7 = r7.A0P     // Catch:{ 19b -> 0x00d7 }
            X.0wI r2 = r8.A02     // Catch:{ 19b -> 0x00d7 }
            r0 = 14
            X.1iS r1 = new X.1iS     // Catch:{ 19b -> 0x00d7 }
            r1.<init>(r8, r9, r0, r7)     // Catch:{ 19b -> 0x00d7 }
        L_0x00bc:
            r2.A00(r1)     // Catch:{ 19b -> 0x00d7 }
            r10.A03(r9)     // Catch:{ 19b -> 0x00d7 }
        L_0x00c2:
            X.Az1 r1 = r11.callback     // Catch:{ 19b -> 0x00d7 }
            if (r1 == 0) goto L_0x0137
            java.lang.String r0 = r11.token     // Catch:{ 19b -> 0x00d7 }
            r1.BoK(r0)     // Catch:{ 19b -> 0x00d7 }
            goto L_0x00d6
        L_0x00cc:
            X.0wI r2 = r8.A02     // Catch:{ 19b -> 0x00d7 }
            r0 = 34
            X.1jB r1 = new X.1jB     // Catch:{ 19b -> 0x00d7 }
            r1.<init>(r8, r9, r0)     // Catch:{ 19b -> 0x00d7 }
            goto L_0x00bc
        L_0x00d6:
            return
        L_0x00d7:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GetNewsletterMessagesResponseSuccess: "
            X.C165567td.A1R(r0, r1, r2, r3)
            r1 = 7
            X.8vg r0 = new X.8vg     // Catch:{ 19b -> 0x011c }
            r0.<init>((X.C203399nx) r5, (X.C186018vH) r4, (int) r1)     // Catch:{ 19b -> 0x011c }
            java.lang.Object r9 = r0.A00     // Catch:{ 19b -> 0x011c }
            X.B04 r9 = (X.B04) r9     // Catch:{ 19b -> 0x011c }
            X.8fH r8 = r6.A00     // Catch:{ 19b -> 0x011c }
            X.1Uw r7 = r8.newsletterJid     // Catch:{ 19b -> 0x011c }
            X.1Ja r2 = r8.A01     // Catch:{ 19b -> 0x011c }
            if (r2 != 0) goto L_0x00fa
            java.lang.String r0 = "newsletterStore"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)     // Catch:{ 19b -> 0x011c }
        L_0x00f9:
            throw r0     // Catch:{ 19b -> 0x011c }
        L_0x00fa:
            X.1Zi r0 = r8.A02     // Catch:{ 19b -> 0x011c }
            if (r0 != 0) goto L_0x0105
            java.lang.String r0 = "newsletterManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)     // Catch:{ 19b -> 0x011c }
            goto L_0x00f9
        L_0x0105:
            X.9UD r1 = new X.9UD     // Catch:{ 19b -> 0x011c }
            r1.<init>(r2, r7, r0)     // Catch:{ 19b -> 0x011c }
            X.9Es r0 = new X.9Es     // Catch:{ 19b -> 0x011c }
            r0.<init>(r1)     // Catch:{ 19b -> 0x011c }
            r9.Azy(r0)     // Catch:{ 19b -> 0x011c }
            X.Az1 r1 = r8.callback     // Catch:{ 19b -> 0x011c }
            if (r1 == 0) goto L_0x0137
            java.lang.String r0 = r8.token     // Catch:{ 19b -> 0x011c }
            r1.BoK(r0)     // Catch:{ 19b -> 0x011c }
            return
        L_0x011c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GetNewsletterMessagesResponseClientError: "
            X.C165567td.A1R(r0, r1, r2, r3)
            r1 = 2
            X.8vf r0 = new X.8vf     // Catch:{ 19b -> 0x0138 }
            r0.<init>(r5, r4, r1)     // Catch:{ 19b -> 0x0138 }
            X.8fH r0 = r6.A00     // Catch:{ 19b -> 0x0138 }
            X.Az1 r1 = r0.callback     // Catch:{ 19b -> 0x0138 }
            if (r1 == 0) goto L_0x0137
            java.lang.String r0 = r0.token     // Catch:{ 19b -> 0x0138 }
            r1.BoK(r0)     // Catch:{ 19b -> 0x0138 }
        L_0x0137:
            return
        L_0x0138:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GetNewsletterMessagesResponseServerError: "
            X.19b r0 = X.C165567td.A0H(r0, r1, r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23220BAc.A01(X.9Et, X.9nx, X.8vH):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0085, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.C05600Qi.A00(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0089, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        X.C05600Qi.A00(r1, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0090, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a9 A[Catch:{ 19b -> 0x00d8, 19b -> 0x011d }, LOOP:0: B:42:0x00a3->B:44:0x00a9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d2 A[Catch:{ 19b -> 0x00d8, 19b -> 0x011d }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[Catch:{ 19b -> 0x0139 }, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C191869Eu r20, X.C203399nx r21, X.C186018vH r22) {
        /*
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            r0 = 15
            r8 = r20
            r7 = r21
            r6 = r22
            X.8vh r1 = new X.8vh     // Catch:{ 19b -> 0x00d8 }
            r1.<init>((X.C203399nx) r7, (X.C186018vH) r6, (int) r0)     // Catch:{ 19b -> 0x00d8 }
            X.8fG r4 = r8.A00     // Catch:{ 19b -> 0x00d8 }
            boolean r0 = r4.isCancelled     // Catch:{ 19b -> 0x00d8 }
            if (r0 != 0) goto L_0x0138
            X.1SL r3 = r4.A03     // Catch:{ 19b -> 0x00d8 }
            if (r3 != 0) goto L_0x0022
            java.lang.String r0 = "newsletterBatchedMessagesManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)     // Catch:{ 19b -> 0x00d8 }
            throw r0     // Catch:{ 19b -> 0x00d8 }
        L_0x0022:
            X.1Uw r2 = r4.newsletterJid     // Catch:{ 19b -> 0x00d8 }
            long r14 = r4.count     // Catch:{ 19b -> 0x00d8 }
            java.lang.Long r0 = r4.beforeServerId     // Catch:{ 19b -> 0x00d8 }
            r16 = r0
            java.lang.Long r0 = r4.afterServerId     // Catch:{ 19b -> 0x00d8 }
            r17 = r0
            java.lang.Object r9 = r1.A01     // Catch:{ 19b -> 0x00d8 }
            X.1jM r9 = (X.C35851jM) r9     // Catch:{ 19b -> 0x00d8 }
            X.AnonymousClass00C.A08(r9)     // Catch:{ 19b -> 0x00d8 }
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)     // Catch:{ 19b -> 0x00d8 }
            java.lang.Object r0 = r9.A02     // Catch:{ 19b -> 0x00d8 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ 19b -> 0x00d8 }
            if (r0 == 0) goto L_0x00ce
            long r20 = r0.longValue()     // Catch:{ 19b -> 0x00d8 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r20 = r20 * r0
            X.1SM r13 = r3.A07     // Catch:{ 19b -> 0x00d8 }
            X.12P r0 = r13.A03     // Catch:{ SQLNonTransientException -> 0x0091, IllegalArgumentException -> 0x0095 }
            X.1M0 r1 = r0.A05()     // Catch:{ SQLNonTransientException -> 0x0091, IllegalArgumentException -> 0x0095 }
            X.71s r10 = r1.B1k()     // Catch:{ all -> 0x008a }
            X.14e r0 = r1.A02     // Catch:{ all -> 0x0083 }
            r22 = r0
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ all -> 0x0083 }
            r0.<init>()     // Catch:{ all -> 0x0083 }
            java.lang.Long r12 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x0083 }
            java.lang.String r11 = "extra_table_last_update_ts"
            r0.put(r11, r12)     // Catch:{ all -> 0x0083 }
            r18 = r14
            r14 = r2
            r15 = r13
            java.lang.String[] r16 = X.AnonymousClass1SM.A01(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0083 }
            java.lang.String r13 = "newsletter_message"
            java.lang.String r14 = "chat_row_id = ? AND server_message_id < ? AND server_message_id > ?"
            java.lang.String r15 = "UPDATE_NEWSLETTER_MESSAGE_TABLE_MESSAGE_UPDATES_REQUEST"
            r12 = r0
            r11 = r22
            r11.A01(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0083 }
            r10.A00()     // Catch:{ all -> 0x0083 }
            r10.close()     // Catch:{ all -> 0x008a }
            r1.close()     // Catch:{ SQLNonTransientException -> 0x0091, IllegalArgumentException -> 0x0095 }
            goto L_0x009b
        L_0x0083:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            X.C05600Qi.A00(r10, r11)     // Catch:{ all -> 0x008a }
            throw r0     // Catch:{ all -> 0x008a }
        L_0x008a:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x008c }
        L_0x008c:
            r0 = move-exception
            X.C05600Qi.A00(r1, r10)     // Catch:{ SQLNonTransientException -> 0x0091, IllegalArgumentException -> 0x0095 }
            throw r0     // Catch:{ SQLNonTransientException -> 0x0091, IllegalArgumentException -> 0x0095 }
        L_0x0091:
            r1 = move-exception
            java.lang.String r0 = "NewsletterMessageStore/failed to update the message"
            goto L_0x0098
        L_0x0095:
            r1 = move-exception
            java.lang.String r0 = "NewsletterMessageStore/failed to update the message due to message constraints"
        L_0x0098:
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ 19b -> 0x00d8 }
        L_0x009b:
            java.lang.Object r0 = r9.A01     // Catch:{ 19b -> 0x00d8 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ 19b -> 0x00d8 }
            java.util.Iterator r9 = X.C90514aH.A14(r0)     // Catch:{ 19b -> 0x00d8 }
        L_0x00a3:
            boolean r0 = r9.hasNext()     // Catch:{ 19b -> 0x00d8 }
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r1 = r9.next()     // Catch:{ 19b -> 0x00d8 }
            X.1jK r1 = (X.C35831jK) r1     // Catch:{ 19b -> 0x00d8 }
            X.1TZ r0 = r3.A09     // Catch:{ 19b -> 0x00d8 }
            X.AnonymousClass00C.A0B(r1)     // Catch:{ 19b -> 0x00d8 }
            r22 = 0
            r17 = r0
            r18 = r2
            r19 = r1
            r17.A02(r18, r19, r20, r22)     // Catch:{ 19b -> 0x00d8 }
            goto L_0x00a3
        L_0x00c0:
            X.1SP r9 = r3.A0A     // Catch:{ 19b -> 0x00d8 }
            X.0wI r3 = r9.A02     // Catch:{ 19b -> 0x00d8 }
            r1 = 35
            X.1jB r0 = new X.1jB     // Catch:{ 19b -> 0x00d8 }
            r0.<init>(r9, r2, r1)     // Catch:{ 19b -> 0x00d8 }
            r3.A00(r0)     // Catch:{ 19b -> 0x00d8 }
        L_0x00ce:
            X.02t r1 = r4.callback     // Catch:{ 19b -> 0x00d8 }
            if (r1 == 0) goto L_0x0138
            java.lang.String r0 = r4.token     // Catch:{ 19b -> 0x00d8 }
            r1.invoke(r0)     // Catch:{ 19b -> 0x00d8 }
            return
        L_0x00d8:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GetNewsletterMessageUpdatesResponseSuccess: "
            X.C165567td.A1R(r0, r1, r2, r5)
            r1 = 5
            X.8vg r0 = new X.8vg     // Catch:{ 19b -> 0x011d }
            r0.<init>((X.C203399nx) r7, (X.C186018vH) r6, (int) r1)     // Catch:{ 19b -> 0x011d }
            java.lang.Object r9 = r0.A00     // Catch:{ 19b -> 0x011d }
            X.B03 r9 = (X.B03) r9     // Catch:{ 19b -> 0x011d }
            X.8fG r4 = r8.A00     // Catch:{ 19b -> 0x011d }
            X.1Uw r3 = r4.newsletterJid     // Catch:{ 19b -> 0x011d }
            X.1Ja r2 = r4.A01     // Catch:{ 19b -> 0x011d }
            if (r2 != 0) goto L_0x00fb
            java.lang.String r0 = "newsletterStore"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)     // Catch:{ 19b -> 0x011d }
        L_0x00fa:
            throw r0     // Catch:{ 19b -> 0x011d }
        L_0x00fb:
            X.1Zi r0 = r4.A02     // Catch:{ 19b -> 0x011d }
            if (r0 != 0) goto L_0x0106
            java.lang.String r0 = "newsletterManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)     // Catch:{ 19b -> 0x011d }
            goto L_0x00fa
        L_0x0106:
            X.9UD r1 = new X.9UD     // Catch:{ 19b -> 0x011d }
            r1.<init>(r2, r3, r0)     // Catch:{ 19b -> 0x011d }
            X.9Er r0 = new X.9Er     // Catch:{ 19b -> 0x011d }
            r0.<init>(r1)     // Catch:{ 19b -> 0x011d }
            r9.Azx(r0)     // Catch:{ 19b -> 0x011d }
            X.02t r1 = r4.callback     // Catch:{ 19b -> 0x011d }
            if (r1 == 0) goto L_0x0138
            java.lang.String r0 = r4.token     // Catch:{ 19b -> 0x011d }
            r1.invoke(r0)     // Catch:{ 19b -> 0x011d }
            return
        L_0x011d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GetNewsletterMessageUpdatesResponseClientError: "
            X.C165567td.A1R(r0, r1, r2, r5)
            r1 = 6
            X.8vg r0 = new X.8vg     // Catch:{ 19b -> 0x0139 }
            r0.<init>((X.C203399nx) r7, (X.C186018vH) r6, (int) r1)     // Catch:{ 19b -> 0x0139 }
            X.8fG r0 = r8.A00     // Catch:{ 19b -> 0x0139 }
            X.02t r1 = r0.callback     // Catch:{ 19b -> 0x0139 }
            if (r1 == 0) goto L_0x0138
            java.lang.String r0 = r0.token     // Catch:{ 19b -> 0x0139 }
            r1.invoke(r0)     // Catch:{ 19b -> 0x0139 }
        L_0x0138:
            return
        L_0x0139:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GetNewsletterMessageUpdatesResponseServerError: "
            X.19b r0 = X.C165567td.A0H(r0, r1, r2, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23220BAc.A02(X.9Eu, X.9nx, X.8vH):void");
    }

    public static void A03(C191879Ev r15, C203399nx r16, C186018vH r17) {
        RuntimeException A0d;
        RuntimeException A0d2;
        ArrayList A0I = AnonymousClass001.A0I();
        C203399nx r4 = r16;
        C186018vH r2 = r17;
        C191879Ev r0 = r15;
        try {
            C186278vh r8 = new C186278vh(r4, r2, 16);
            C178188fF r1 = r15.A00;
            C19420v0 r5 = r1.A00;
            if (r5 == null) {
                A0d2 = C36331k8.A0d("waSharedPreferences");
            } else {
                C36331k8.A0w(C19420v0.A00(r5), "newsletter_my_reactions_fetched", true);
                Iterator A14 = C90514aH.A14((List) r8.A01);
                loop0:
                while (A14.hasNext()) {
                    C184818t3 r52 = (C184818t3) A14.next();
                    C28981Uw r12 = (C28981Uw) r52.A00;
                    AnonymousClass00C.A08(r12);
                    Iterator A142 = C90514aH.A14((List) r52.A01);
                    while (true) {
                        if (A142.hasNext()) {
                            C184068rq r53 = (C184068rq) A142.next();
                            AnonymousClass00C.A0B(r53);
                            C184268sA r6 = (C184268sA) r53.A00;
                            AnonymousClass00C.A08(r6);
                            long A0B = C165587tf.A0B(r6.A02);
                            C184958tH r54 = (C184958tH) r6.A01;
                            if (r54 != null) {
                                String str = r54.A02;
                                AnonymousClass00C.A08(str);
                                long A0B2 = C165587tf.A0B(r54.A01);
                                C31051bC r11 = r1.A03;
                                if (r11 == null) {
                                    A0d2 = C36331k8.A0d("newsletterIncomingMessageManager");
                                    break loop0;
                                }
                                r11.A01(r12, str, A0B, A0B2);
                            }
                            C184268sA r7 = (C184268sA) r6.A00;
                            if (r7 != null) {
                                HashSet A16 = C36441kJ.A16();
                                Iterator A13 = C90514aH.A13(r7.A02);
                                while (A13.hasNext()) {
                                    String A132 = C36441kJ.A13((byte[]) ((C184078rr) A13.next()).A00);
                                    AnonymousClass00C.A08(A132);
                                    A16.add(A132);
                                }
                                long A0B3 = C165587tf.A0B(r7.A01);
                                C31051bC r112 = r1.A03;
                                if (r112 == null) {
                                    A0d2 = C36331k8.A0d("newsletterIncomingMessageManager");
                                    break loop0;
                                }
                                r112.A02(r12, A16, A0B, A0B3);
                            }
                        }
                    }
                }
                return;
            }
            throw A0d2;
        } catch (C235919b e) {
            C165567td.A1R("MyAddOnsResponseSuccess: ", AnonymousClass000.A0u(), e, A0I);
            C186268vg r13 = new C186268vg(r4, r2, 8);
            C178188fF r02 = r0.A00;
            C28981Uw r72 = r02.newsletterJid;
            if (r72 != null) {
                B05 b05 = (B05) r13.A00;
                C26141Ja r55 = r02.A01;
                if (r55 == null) {
                    A0d = C36331k8.A0d("newsletterStore");
                } else {
                    C30131Zi r03 = r02.A02;
                    if (r03 == null) {
                        A0d = C36331k8.A0d("newsletterManager");
                    } else {
                        b05.Azz(new C191889Ew(new AnonymousClass9UD(r55, r72, r03)));
                        return;
                    }
                }
                throw A0d;
            }
        } catch (C235919b e2) {
            C165567td.A1R("MyAddOnsResponseClientError: ", AnonymousClass000.A0u(), e2, A0I);
            try {
                new C186268vg(r4, r2, 9);
            } catch (C235919b e3) {
                throw C165567td.A0H("MyAddOnsResponseServerError: ", AnonymousClass000.A0u(), e3, A0I);
            }
        }
    }

    public static void A04(AnonymousClass9KR r9, C203399nx r10, C186018vH r11) {
        ArrayList A0I = AnonymousClass001.A0I();
        try {
            C186278vh r0 = new C186278vh(r10, r11, 17);
            AnonymousClass3F8 r7 = r9.A01;
            C28981Uw r8 = r9.A00;
            long A09 = C36431kI.A09(r0.A01) * 1000;
            Runnable runnable = r7.A08;
            if (runnable != null) {
                r7.A06.Bnx(runnable);
            }
            r7.A08 = null;
            C1502074j r6 = new C1502074j(r7, r8, 31);
            r7.A08 = r6;
            r7.A06.BpM(r6, "NewsletterLiveSubscriptionManager/handleSuccess", A09 - 3000);
        } catch (C235919b e) {
            C165567td.A1R("SubscribeToLiveUpdatesResponseSuccess: ", AnonymousClass000.A0u(), e, A0I);
            try {
                ((B08) new C186268vg(r10, r11, 10).A00).B00(r9.A02);
            } catch (C235919b e2) {
                C165567td.A1R("SubscribeToLiveUpdatesResponseClientError: ", AnonymousClass000.A0u(), e2, A0I);
                try {
                    new C186268vg(r10, r11, 11);
                } catch (C235919b e3) {
                    throw C165567td.A0H("SubscribeToLiveUpdatesResponseServerError: ", AnonymousClass000.A0u(), e3, A0I);
                }
            }
        }
    }

    public static void A05(C193539Lw r13, C203399nx r14, C185928v8 r15) {
        Collection A09;
        ArrayList A0I = AnonymousClass001.A0I();
        try {
            C186258vf r0 = new C186258vf(r14, r15);
            BrazilAddPixKeyViewModel brazilAddPixKeyViewModel = r13.A00;
            String str = r13.A02;
            String str2 = r13.A03;
            String str3 = r13.A01;
            C184968tI r1 = (C184968tI) r0.A00;
            AnonymousClass00C.A08(r1);
            String str4 = r1.A00.A00;
            AnonymousClass00C.A08(str4);
            String str5 = r1.A01;
            AnonymousClass00C.A08(str5);
            HashMap A0J = AnonymousClass001.A0J();
            A0J.put("pix_key_type", new C206859u7("pix_key_type", str));
            A0J.put("pix_key", new C206859u7("pix_key", str2));
            A0J.put("pix_display_name", new C206859u7("pix_display_name", str3));
            C175788b3 r7 = new C175788b3(C202159l8.A0E, new C175738ay("BR", str4, str5, A0J), str5, str4, str5);
            AnonymousClass96A r6 = new AnonymousClass96A(brazilAddPixKeyViewModel, 6);
            AnonymousClass9UE r5 = brazilAddPixKeyViewModel.A05;
            if (r5.A01()) {
                AnonymousClass5FZ r4 = r5.A01;
                AnonymousClass16S A0O = C165617ti.A0O(r5.A00);
                AnonymousClass00C.A08(A0O);
                if (!A0O.A09) {
                    Log.e("Payment store cannot be initialized for device sync!");
                    A09 = C023409w.A00;
                } else {
                    A09 = A0O.A09();
                }
                ArrayList A0q = C36361kB.A0q(A09);
                A0q.add(r7);
                r4.A01(r5.A00(A0q));
            }
            brazilAddPixKeyViewModel.A07.A01().A05(r6, r7, "custom_payment_method_linking");
            if (r5.A01()) {
                r5.A01.A00();
            }
        } catch (C235919b e) {
            C165567td.A1R("CreateCustomPaymentMethodResponseSuccess: ", AnonymousClass000.A0u(), e, A0I);
            try {
                new C186268vg(r14, r15);
                C36341k9.A17(r13.A00.A00, 2);
            } catch (C235919b e2) {
                throw C165567td.A0H("CreateCustomPaymentMethodResponseIQErrorWithCodeAndReason: ", AnonymousClass000.A0u(), e2, A0I);
            }
        }
    }

    public C23220BAc(C28981Uw r2, AnonymousClass3F8 r3, C191899Ex r4, C186018vH r5) {
        this.A02 = 5;
        this.A00 = r5;
        this.A01 = new AnonymousClass9KR(r2, r3, r4);
    }

    public C23220BAc(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public C23220BAc(AnonymousClass8fH r2, C186018vH r3) {
        this.A02 = 2;
        this.A00 = r3;
        this.A01 = new C191859Et(r2);
    }

    public C23220BAc(AnonymousClass8fG r2, C186018vH r3) {
        this.A02 = 3;
        this.A00 = r3;
        this.A01 = new C191869Eu(r2);
    }
}
