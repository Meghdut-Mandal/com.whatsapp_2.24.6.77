package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilPaymentTransactionDetailActivity;
import java.util.List;
import java.util.Map;

public class B7J extends AIB {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B7J(Context context, C29221Vu r2, C19640wH r3, Object obj, Object obj2, int i) {
        super(context, r2, r3);
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public void A05(C202059ky r5) {
        AnonymousClass1XD r0;
        switch (this.A02) {
            case 0:
                return;
            case 1:
                C165567td.A15(((C198249d9) this.A00).A07, r5, "BrazilAddCredentialAction : onRequestError: ", AnonymousClass000.A0u());
                C179158jJ.A0j(((AnonymousClass9I8) this.A01).A00, (Map) null, r5.A00);
                return;
            case 2:
                BrazilPaymentTransactionDetailActivity brazilPaymentTransactionDetailActivity = ((AnonymousClass9FE) this.A01).A00;
                brazilPaymentTransactionDetailActivity.Bnv();
                C36401kF.A1D(brazilPaymentTransactionDetailActivity, R.string.f12nameremoved, R.string.f12nameremoved);
                return;
            case 3:
                C36321k7.A1K(r5, "PAY: BrazilFetchNetworkInfoAction/onRequestError: ", AnonymousClass000.A0u());
                ((AnonymousClass9RX) this.A01).A00((C193879Ng) null);
                return;
            case 4:
                ((AnonymousClass9SX) this.A00).A01.BYY(r5, (List) null);
                return;
            case 5:
                C36321k7.A1K(r5, "PAY: BrazilGetVerificationMethods onRequestError: ", AnonymousClass000.A0u());
                ((B1J) this.A01).BfN(r5, (List) null);
                return;
            case 6:
                C36321k7.A1K(r5, "PAY: BrazilRemoveMerchantAccount onRequestError: ", AnonymousClass000.A0u());
                break;
            case 7:
                C36321k7.A1K(r5, "PAY: BrazilFetchEloChallengeIdAction onRequestError: ", AnonymousClass000.A0u());
                ((AnonymousClass9F2) this.A01).A00.A03(r5, (String) null);
                return;
            case 8:
                C36321k7.A1K(r5, "PAY: BrazilSubmitVerificationMethodAction onRequestError: ", AnonymousClass000.A0u());
                ((AnonymousClass9RY) this.A01).A00(r5, (AnonymousClass8b7) null);
                return;
            case 9:
                C23075B3f BBn = ((AnonymousClass9XR) this.A00).A07.A05().BBn();
                if (BBn != null) {
                    BBn.reset();
                }
                r0 = (AnonymousClass1XD) this.A01;
                if (r0 == null) {
                    return;
                }
                break;
            case 10:
                ((AnonymousClass9SB) this.A01).A00(r5);
                return;
            case 11:
                break;
            case 12:
                ((C194649Qo) this.A01).A00(r5);
                return;
            case 13:
                C194659Qp r3 = (C194659Qp) this.A01;
                C165567td.A16(r3.A01.A06, r5, "performNameCheck onError: ", AnonymousClass000.A0u());
                r3.A00.BWg(r5);
                return;
            case 14:
                C194669Qq r32 = (C194669Qq) this.A01;
                C165567td.A16(r32.A01.A06, r5, "performDobComplianceCheck onError: ", AnonymousClass000.A0u());
                r32.A00.BWg(r5);
                return;
            case 15:
                AnonymousClass00C.A0D(r5, 0);
                C24611Dc r2 = ((AnonymousClass9SR) this.A01).A01;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("providerKey: onRequestError ");
                r2.A05(C36381kD.A10(A0u, r5.A00));
                ((B1Q) this.A00).Bdl(r5);
                return;
            case 16:
                ((B1R) this.A01).BWg(r5);
                return;
            default:
                ((C194739Ra) this.A01).A00(r5);
                return;
        }
        r0 = (AnonymousClass1XD) this.A01;
        r0.Bes(r5);
    }

    public void A06(C202059ky r5) {
        AnonymousClass1XD r0;
        switch (this.A02) {
            case 0:
                return;
            case 1:
                C165567td.A15(((C198249d9) this.A00).A07, r5, "BrazilAddCredentialAction : onResponseError: ", AnonymousClass000.A0u());
                C179158jJ.A0j(((AnonymousClass9I8) this.A01).A00, (Map) null, r5.A00);
                return;
            case 2:
                BrazilPaymentTransactionDetailActivity brazilPaymentTransactionDetailActivity = ((AnonymousClass9FE) this.A01).A00;
                brazilPaymentTransactionDetailActivity.Bnv();
                C36401kF.A1D(brazilPaymentTransactionDetailActivity, R.string.f12nameremoved, R.string.f12nameremoved);
                return;
            case 3:
                C36321k7.A1K(r5, "PAY: BrazilFetchNetworkInfoAction/onResponseError: ", AnonymousClass000.A0u());
                ((AnonymousClass9RX) this.A01).A00((C193879Ng) null);
                return;
            case 4:
                ((AnonymousClass9SX) this.A00).A01.BYY(r5, (List) null);
                return;
            case 5:
                C36321k7.A1K(r5, "PAY: BrazilGetVerificationMethods onResponseError: ", AnonymousClass000.A0u());
                ((B1J) this.A01).BfN(r5, (List) null);
                return;
            case 6:
                C36321k7.A1J(r5, "PAY: BrazilRemoveMerchantAccount onResponseError=", AnonymousClass000.A0u());
                break;
            case 7:
                C36321k7.A1K(r5, "PAY: BrazilFetchEloChallengeIdAction onResponseError: ", AnonymousClass000.A0u());
                ((AnonymousClass9F2) this.A01).A00.A03(r5, (String) null);
                return;
            case 8:
                C36321k7.A1K(r5, "PAY: BrazilSubmitVerificationMethodAction onResponseError: ", AnonymousClass000.A0u());
                ((AnonymousClass9RY) this.A01).A00(r5, (AnonymousClass8b7) null);
                return;
            case 9:
                C23075B3f BBn = ((AnonymousClass9XR) this.A00).A07.A05().BBn();
                if (BBn != null) {
                    BBn.reset();
                }
                r0 = (AnonymousClass1XD) this.A01;
                if (r0 == null) {
                    return;
                }
                break;
            case 10:
                ((AnonymousClass9SB) this.A01).A00(r5);
                return;
            case 11:
                break;
            case 12:
                ((C194649Qo) this.A01).A00(r5);
                return;
            case 13:
                C194659Qp r3 = (C194659Qp) this.A01;
                C165567td.A16(r3.A01.A06, r5, "performNameCheck onError: ", AnonymousClass000.A0u());
                r3.A00.BWg(r5);
                return;
            case 14:
                C165567td.A15(((AnonymousClass9NG) this.A00).A05, r5, "performDobComplianceCheck onResponseError: ", AnonymousClass000.A0u());
                C194669Qq r32 = (C194669Qq) this.A01;
                C165567td.A16(r32.A01.A06, r5, "performDobComplianceCheck onError: ", AnonymousClass000.A0u());
                r32.A00.BWg(r5);
                return;
            case 15:
                AnonymousClass00C.A0D(r5, 0);
                C24611Dc r2 = ((AnonymousClass9SR) this.A01).A01;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("providerKey: onResponseError ");
                r2.A05(C36381kD.A10(A0u, r5.A00));
                ((B1Q) this.A00).Bdl(r5);
                return;
            case 16:
                ((B1R) this.A01).BWg(r5);
                return;
            default:
                A05(r5);
                return;
        }
        r0 = (AnonymousClass1XD) this.A01;
        r0.Bf0(r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:234:0x05af, code lost:
        com.whatsapp.util.Log.e("Pay: requestDyiReport -> error parsing the response");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x05b4, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x05c0  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x05c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C203399nx r15) {
        /*
            r14 = this;
            int r0 = r14.A02
            r5 = r15
            switch(r0) {
                case 1: goto L_0x049f;
                case 2: goto L_0x0006;
                case 3: goto L_0x03ca;
                case 4: goto L_0x030f;
                case 5: goto L_0x011b;
                case 6: goto L_0x02fc;
                case 7: goto L_0x02d5;
                case 8: goto L_0x028a;
                case 9: goto L_0x00e7;
                case 10: goto L_0x000d;
                case 11: goto L_0x0007;
                case 12: goto L_0x0226;
                case 13: goto L_0x020a;
                case 14: goto L_0x01ee;
                case 15: goto L_0x0182;
                case 16: goto L_0x0551;
                case 17: goto L_0x016e;
                default: goto L_0x0006;
            }
        L_0x0006:
            return
        L_0x0007:
            java.lang.Object r1 = r14.A01
            X.1XD r1 = (X.AnonymousClass1XD) r1
            goto L_0x0112
        L_0x000d:
            java.lang.Object r4 = r14.A01
            X.9SB r4 = (X.AnonymousClass9SB) r4
            X.9nx r2 = X.C203399nx.A03(r15)     // Catch:{ Exception -> 0x05af }
            X.9ky r0 = X.C202059ky.A01(r2)     // Catch:{ Exception -> 0x05af }
            if (r0 != 0) goto L_0x0032
            r1 = 500(0x1f4, float:7.0E-43)
            if (r2 != 0) goto L_0x0025
            X.9ky r0 = new X.9ky     // Catch:{ Exception -> 0x05af }
            r0.<init>((int) r1)     // Catch:{ Exception -> 0x05af }
            goto L_0x0032
        L_0x0025:
            java.lang.String r0 = "document"
            X.9nx r8 = r2.A0c(r0)     // Catch:{ Exception -> 0x05af }
            if (r8 != 0) goto L_0x0037
            X.9ky r0 = new X.9ky     // Catch:{ Exception -> 0x05af }
            r0.<init>((int) r1)     // Catch:{ Exception -> 0x05af }
        L_0x0032:
            r4.A00(r0)     // Catch:{ Exception -> 0x05af }
            goto L_0x05a1
        L_0x0037:
            java.lang.String r0 = "creation"
            r2 = 0
            long r5 = r8.A0V(r0, r2)     // Catch:{ Exception -> 0x05af }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r0
            java.lang.String r7 = "expiration"
            long r2 = r8.A0V(r7, r2)     // Catch:{ Exception -> 0x05af }
            long r0 = r0 * r2
            byte[] r9 = r8.A01     // Catch:{ Exception -> 0x05af }
            java.lang.String r2 = "DyiViewModel/request-report/on-success"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ Exception -> 0x05af }
            X.8ld r2 = r4.A04     // Catch:{ Exception -> 0x05af }
            X.9jf r3 = r2.A06     // Catch:{ Exception -> 0x05af }
            java.lang.String r7 = r2.A08     // Catch:{ Exception -> 0x05af }
            monitor-enter(r3)     // Catch:{ Exception -> 0x05af }
            java.lang.String r8 = "dyiReportManager/on-report-available"
            com.whatsapp.util.Log.i((java.lang.String) r8)     // Catch:{ all -> 0x05ac }
            java.io.File r8 = X.C201469jf.A01(r3, r7)     // Catch:{ IOException -> 0x009b }
            X.C18750th.A0A(r8, r9)     // Catch:{ IOException -> 0x009b }
            X.9KY r8 = X.C201469jf.A00(r9, r5)     // Catch:{ all -> 0x05ac }
            r3.A01 = r8     // Catch:{ all -> 0x05ac }
            if (r8 != 0) goto L_0x0071
            java.lang.String r0 = "dyiReportManager/on-report-available/cannot-create-message"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x05ac }
            goto L_0x00a1
        L_0x0071:
            X.1Db r10 = r3.A08     // Catch:{ all -> 0x05ac }
            android.content.SharedPreferences$Editor r11 = X.C90494aF.A0E(r10)     // Catch:{ all -> 0x05ac }
            java.lang.String r8 = "personal"
            boolean r9 = r8.equals(r7)     // Catch:{ all -> 0x05ac }
            if (r9 == 0) goto L_0x0089
            java.lang.String r8 = "payment_dyi_report_timestamp"
        L_0x0081:
            X.C36341k9.A0w(r11, r8, r5)     // Catch:{ all -> 0x05ac }
            android.content.SharedPreferences$Editor r6 = X.C90494aF.A0E(r10)     // Catch:{ all -> 0x05ac }
            goto L_0x008c
        L_0x0089:
            java.lang.String r8 = "business_payment_dyi_report_timestamp"
            goto L_0x0081
        L_0x008c:
            if (r9 == 0) goto L_0x0091
            java.lang.String r5 = "payment_dyi_report_expiration_timestamp"
            goto L_0x0093
        L_0x0091:
            java.lang.String r5 = "business_payment_dyi_report_expiration_timestamp"
        L_0x0093:
            X.C36341k9.A0w(r6, r5, r0)     // Catch:{ all -> 0x05ac }
            r0 = 2
            r10.A0F(r0, r7)     // Catch:{ all -> 0x05ac }
            goto L_0x00a1
        L_0x009b:
            r1 = move-exception
            java.lang.String r0 = "dyiReportManager/on-report-available/cannot-save"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x05ac }
        L_0x00a1:
            monitor-exit(r3)     // Catch:{ Exception -> 0x05af }
            X.9KY r0 = r3.A03(r7)     // Catch:{ Exception -> 0x05af }
            if (r0 != 0) goto L_0x00d0
            java.lang.String r0 = "DyiViewModel/request-report/on-error :: invalid report info"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x05af }
            X.00s r0 = r2.A02     // Catch:{ Exception -> 0x05af }
            java.lang.Integer r3 = X.C36381kD.A0m()     // Catch:{ Exception -> 0x05af }
            r0.A0C(r3)     // Catch:{ Exception -> 0x05af }
            X.00s r2 = r2.A03     // Catch:{ Exception -> 0x05af }
            r1 = 500(0x1f4, float:7.0E-43)
            X.9ky r0 = new X.9ky     // Catch:{ Exception -> 0x05af }
            r0.<init>((int) r1)     // Catch:{ Exception -> 0x05af }
            X.C165587tf.A11(r2, r3, r0)     // Catch:{ Exception -> 0x05af }
        L_0x00c2:
            int r1 = r4.A01     // Catch:{ Exception -> 0x05af }
            r0 = 1
            if (r1 != r0) goto L_0x00e3
            com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment r0 = r4.A03     // Catch:{ Exception -> 0x05af }
            if (r0 == 0) goto L_0x0006
            r0.A1c()     // Catch:{ Exception -> 0x05af }
            goto L_0x05a2
        L_0x00d0:
            X.00s r1 = r2.A01     // Catch:{ Exception -> 0x05af }
            X.9KY r0 = r3.A03(r7)     // Catch:{ Exception -> 0x05af }
            r1.A0C(r0)     // Catch:{ Exception -> 0x05af }
            X.00s r1 = r2.A02     // Catch:{ Exception -> 0x05af }
            int r0 = r3.A02(r7)     // Catch:{ Exception -> 0x05af }
            X.C36341k9.A17(r1, r0)     // Catch:{ Exception -> 0x05af }
            goto L_0x00c2
        L_0x00e3:
            if (r1 != 0) goto L_0x0006
            goto L_0x05a3
        L_0x00e7:
            java.lang.Object r4 = r14.A00
            X.9XR r4 = (X.AnonymousClass9XR) r4
            X.1Db r0 = r4.A04
            android.content.SharedPreferences r2 = r0.A03()
            java.lang.String r1 = "has_p2mlite_transactions"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 != 0) goto L_0x010c
            X.0wU r3 = r4.A08
            X.0xM r2 = r4.A02
            r0 = 4
            X.AVX r1 = new X.AVX
            r1.<init>(r14, r0)
            X.5M0 r0 = new X.5M0
            r0.<init>(r2, r1)
            X.C36391kE.A1Q(r0, r3)
        L_0x010c:
            java.lang.Object r1 = r14.A01
            X.1XD r1 = (X.AnonymousClass1XD) r1
            if (r1 == 0) goto L_0x0006
        L_0x0112:
            X.8gg r0 = new X.8gg
            r0.<init>()
            r1.Bf1(r0)
            return
        L_0x011b:
            X.9nx r1 = X.C203399nx.A03(r15)
            if (r1 == 0) goto L_0x0006
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "verify-method-list"
            X.9nx r5 = r1.A0c(r0)
            java.lang.String r0 = "card"
            X.9nx r1 = r1.A0c(r0)
            r3 = 0
            if (r1 == 0) goto L_0x0154
            X.8b7 r2 = new X.8b7
            r2.<init>()
            java.lang.Object r0 = r14.A00
            X.9Ss r0 = (X.C195159Ss) r0
            X.16T r0 = r0.A00
            r2.A04(r0, r1, r3)
            X.9un r1 = r2.A07()
            X.8b4 r1 = (X.C175798b4) r1
            boolean r0 = r2.A0a
            if (r0 == 0) goto L_0x0154
            java.lang.Object r0 = r14.A01
            X.B1J r0 = (X.B1J) r0
            r0.BTB(r1)
            return
        L_0x0154:
            if (r5 == 0) goto L_0x0006
            X.9nx[] r0 = r5.A02
            if (r0 == 0) goto L_0x05b5
            int r2 = r0.length
            if (r2 <= 0) goto L_0x05b5
        L_0x015d:
            X.9nx r1 = r5.A0b(r3)
            X.AUm r0 = new X.AUm
            r0.<init>(r1)
            r4.add(r0)
            int r3 = r3 + 1
            if (r3 >= r2) goto L_0x05b5
            goto L_0x015d
        L_0x016e:
            X.9nx r0 = X.C203399nx.A03(r15)
            if (r0 == 0) goto L_0x0180
            X.9ky r1 = X.C202059ky.A01(r0)
        L_0x0178:
            java.lang.Object r0 = r14.A01
            X.9Ra r0 = (X.C194739Ra) r0
            r0.A00(r1)
            return
        L_0x0180:
            r1 = 0
            goto L_0x0178
        L_0x0182:
            r0 = 0
            X.AnonymousClass00C.A0D(r15, r0)
            java.lang.String r0 = "account"
            X.9nx r1 = r15.A0d(r0)     // Catch:{ 19b -> 0x01d3 }
            java.lang.String r0 = "key"
            X.9nx r1 = r1.A0d(r0)     // Catch:{ 19b -> 0x01d3 }
            java.lang.Object r0 = r14.A01     // Catch:{ 19b -> 0x01d3 }
            X.9SR r0 = (X.AnonymousClass9SR) r0     // Catch:{ 19b -> 0x01d3 }
            X.9gU r4 = r0.A00     // Catch:{ 19b -> 0x01d3 }
            X.AF3 r3 = r4.A00(r1)     // Catch:{ 19b -> 0x01d3 }
            X.1Dc r2 = r0.A01     // Catch:{ 19b -> 0x01d3 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 19b -> 0x01d3 }
            java.lang.String r0 = "providerKey/onSuccess: isValidSignature="
            r1.append(r0)     // Catch:{ 19b -> 0x01d3 }
            boolean r0 = X.AnonymousClass000.A1V(r3)
            java.lang.String r0 = X.C36421kH.A0d(r1, r0)     // Catch:{ 19b -> 0x01d3 }
            r2.A07(r0)     // Catch:{ 19b -> 0x01d3 }
            if (r3 == 0) goto L_0x01bf
            r4.A03(r3)     // Catch:{ 19b -> 0x01d3 }
            java.lang.Object r0 = r14.A00     // Catch:{ 19b -> 0x01d3 }
            X.B1Q r0 = (X.B1Q) r0     // Catch:{ 19b -> 0x01d3 }
            r0.Bdm(r3)     // Catch:{ 19b -> 0x01d3 }
            return
        L_0x01bf:
            java.lang.String r0 = "providerKey/onSuccess signature is not valid"
            r2.A05(r0)     // Catch:{ 19b -> 0x01d3 }
            java.lang.Object r2 = r14.A00     // Catch:{ 19b -> 0x01d3 }
            X.B1Q r2 = (X.B1Q) r2     // Catch:{ 19b -> 0x01d3 }
            r1 = 8
            X.9ky r0 = new X.9ky     // Catch:{ 19b -> 0x01d3 }
            r0.<init>((int) r1)     // Catch:{ 19b -> 0x01d3 }
            r2.Bdl(r0)     // Catch:{ 19b -> 0x01d3 }
            return
        L_0x01d3:
            r2 = move-exception
            java.lang.Object r0 = r14.A01
            X.9SR r0 = (X.AnonymousClass9SR) r0
            X.1Dc r1 = r0.A01
            java.lang.String r0 = "providerKey/parseResponse failed: "
            r1.A0A(r0, r2)
            java.lang.Object r2 = r14.A00
            X.B1Q r2 = (X.B1Q) r2
            r1 = 9
            X.9ky r0 = new X.9ky
            r0.<init>((int) r1)
            r2.Bdl(r0)
            return
        L_0x01ee:
            java.lang.Object r4 = r14.A01
            X.9Qq r4 = (X.C194669Qq) r4
            r3 = 1
            X.9Uc r0 = r4.A01
            X.1Dc r2 = r0.A06
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "performDobComplianceCheck onDobCheckComplete, eligible: "
            java.lang.String r0 = X.C36371kC.A0z(r0, r1, r3)
            r2.A06(r0)
            X.B1S r0 = r4.A00
            r0.BVz(r3)
            return
        L_0x020a:
            java.lang.Object r4 = r14.A01
            X.9Qp r4 = (X.C194659Qp) r4
            r3 = 1
            X.9Uc r0 = r4.A01
            X.1Dc r2 = r0.A06
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "performNameCheck onNameCheckComplete, eligible: "
            java.lang.String r0 = X.C36371kC.A0z(r0, r1, r3)
            r2.A06(r0)
            X.B1T r0 = r4.A00
            r0.BbK(r3)
            return
        L_0x0226:
            if (r15 == 0) goto L_0x027e
            r0 = 0
            X.9nx r1 = r15.A0b(r0)
            if (r1 == 0) goto L_0x027e
            java.lang.String r0 = "account-eligibility-state"
            java.lang.String r5 = X.C36391kE.A0x(r1, r0)
            if (r5 == 0) goto L_0x027e
            java.lang.Object r4 = r14.A01
            X.9Qo r4 = (X.C194649Qo) r4
            X.9Uc r3 = r4.A00
            X.1Dc r2 = r3.A06
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "getComplianceStatus onStatus: "
            r1.append(r0)
            X.C165567td.A18(r2, r5, r1)
            int r0 = r5.hashCode()
            switch(r0) {
                case -2093369835: goto L_0x0258;
                case -1753873386: goto L_0x025b;
                case 35394935: goto L_0x025e;
                case 1383663147: goto L_0x0261;
                default: goto L_0x0252;
            }
        L_0x0252:
            java.lang.String r0 = "Compliance state unknown"
            r2.A06(r0)
            return
        L_0x0258:
            java.lang.String r0 = "UNSUPPORTED"
            goto L_0x0263
        L_0x025b:
            java.lang.String r0 = "NEEDS_MORE_INFO"
            goto L_0x0263
        L_0x025e:
            java.lang.String r0 = "PENDING"
            goto L_0x0263
        L_0x0261:
            java.lang.String r0 = "COMPLETED"
        L_0x0263:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0252
            r3.A00 = r5
            X.9IA r1 = r4.A01
            java.util.HashMap r2 = X.AnonymousClass001.A0J()
            java.lang.String r0 = "compliance_status"
            r2.put(r0, r5)
            X.6C8 r1 = r1.A01
            java.lang.String r0 = "on_success"
            r1.A01(r0, r2)
            return
        L_0x027e:
            java.lang.Object r1 = r14.A01
            X.9Qo r1 = (X.C194649Qo) r1
            X.9ky r0 = X.C202059ky.A00()
            r1.A00(r0)
            return
        L_0x028a:
            X.9nx r5 = X.C203399nx.A03(r15)
            r4 = 0
            if (r5 == 0) goto L_0x02c9
            java.lang.String r0 = "card"
            X.9nx r3 = r5.A0c(r0)
            if (r3 == 0) goto L_0x02c7
            X.8b7 r2 = new X.8b7
            r2.<init>()
            java.lang.Object r0 = r14.A00
            X.9O8 r0 = (X.AnonymousClass9O8) r0
            X.16T r1 = r0.A02
            r0 = 0
            r2.A04(r1, r3, r0)
        L_0x02a8:
            java.lang.String r0 = "elo"
            X.9nx r1 = r5.A0c(r0)
            if (r1 == 0) goto L_0x02bf
            java.lang.String r0 = "challenge_id"
            java.lang.String r1 = r1.A0i(r0, r4)
            java.lang.Object r0 = r14.A00
            X.9O8 r0 = (X.AnonymousClass9O8) r0
            X.9Sy r0 = r0.A05
            r0.A00(r1)
        L_0x02bf:
            java.lang.Object r0 = r14.A01
            X.9RY r0 = (X.AnonymousClass9RY) r0
            r0.A00(r4, r2)
            return
        L_0x02c7:
            r2 = r4
            goto L_0x02a8
        L_0x02c9:
            java.lang.Object r1 = r14.A01
            X.9RY r1 = (X.AnonymousClass9RY) r1
            X.9ky r0 = X.C202059ky.A00()
            r1.A00(r0, r4)
            return
        L_0x02d5:
            X.9nx r1 = X.C203399nx.A03(r15)
            r2 = 0
            if (r1 == 0) goto L_0x02ee
            java.lang.String r0 = "challenge_id"
            java.lang.String r1 = r1.A0i(r0, r2)
            if (r1 == 0) goto L_0x02ee
            java.lang.Object r0 = r14.A01
            X.9F2 r0 = (X.AnonymousClass9F2) r0
            X.9XQ r0 = r0.A00
            r0.A03(r2, r1)
            return
        L_0x02ee:
            java.lang.Object r0 = r14.A01
            X.9F2 r0 = (X.AnonymousClass9F2) r0
            X.9ky r1 = X.C202059ky.A00()
            X.9XQ r0 = r0.A00
            r0.A03(r1, r2)
            return
        L_0x02fc:
            java.lang.String r0 = "Pay: BrazilRemoveMerchantAccount successfully removed merchant account"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r0 = r14.A00
            X.9Sd r0 = (X.C195019Sd) r0
            X.0wU r2 = r0.A02
            java.lang.Object r1 = r14.A01
            r0 = 10
            X.AVb.A00(r2, r14, r1, r0)
            return
        L_0x030f:
            java.lang.String r1 = "account"
            X.9nx r0 = r15.A0c(r1)
            r2 = 0
            if (r0 == 0) goto L_0x0328
            X.9ky r3 = X.C202059ky.A01(r0)
            if (r3 == 0) goto L_0x0333
            java.lang.Object r0 = r14.A00
            X.9SX r0 = (X.AnonymousClass9SX) r0
            X.AzC r0 = r0.A01
        L_0x0324:
            r0.BYY(r3, r2)
            return
        L_0x0328:
            java.lang.Object r0 = r14.A00
            X.9SX r0 = (X.AnonymousClass9SX) r0
            X.AzC r0 = r0.A01
            X.9ky r3 = X.C202059ky.A00()
            goto L_0x0324
        L_0x0333:
            java.lang.Object r0 = r14.A01     // Catch:{ 19b -> 0x03b2 }
            X.33b r0 = (X.C592133b) r0     // Catch:{ 19b -> 0x03b2 }
            X.9nx r4 = X.C90514aH.A0e(r15, r0)     // Catch:{ 19b -> 0x03b2 }
            java.lang.String r0 = "action"
            java.lang.String[] r10 = new java.lang.String[]{r1, r0}     // Catch:{ 19b -> 0x03b2 }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            java.lang.Long r7 = X.C165567td.A0P()     // Catch:{ 19b -> 0x03b2 }
            java.lang.Long r8 = X.C165567td.A0Q()     // Catch:{ 19b -> 0x03b2 }
            r11 = 0
            java.lang.String r9 = "br-get-payout-banks"
            X.C203379ns.A03(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ 19b -> 0x03b2 }
            r0 = 19
            X.B9u r3 = new X.B9u     // Catch:{ 19b -> 0x03b2 }
            r3.<init>(r4, r0)     // Catch:{ 19b -> 0x03b2 }
            r0 = 0
            X.C203539oF.A0B(r15, r3)     // Catch:{ 19b -> 0x03b2 }
            java.lang.String r3 = "bank"
            java.lang.String[] r7 = new java.lang.String[]{r1, r3}     // Catch:{ 19b -> 0x03b2 }
            X.AJJ r6 = X.AJJ.A00     // Catch:{ 19b -> 0x03b2 }
            r8 = 0
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.ArrayList r3 = X.C203539oF.A09(r5, r6, r7, r8, r10)     // Catch:{ 19b -> 0x03b2 }
            java.lang.String[] r7 = new java.lang.String[]{r1}     // Catch:{ 19b -> 0x03b2 }
            X.AJK r6 = X.AJK.A00     // Catch:{ 19b -> 0x03b2 }
            r8 = 1
            r10 = 1
            java.util.ArrayList r1 = X.C203539oF.A09(r5, r6, r7, r8, r10)     // Catch:{ 19b -> 0x03b2 }
            r1.get(r0)     // Catch:{ 19b -> 0x03b2 }
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()     // Catch:{ 19b -> 0x03b2 }
            java.util.Iterator r6 = r3.iterator()     // Catch:{ 19b -> 0x03b2 }
        L_0x0388:
            boolean r1 = r6.hasNext()     // Catch:{ 19b -> 0x03b2 }
            if (r1 == 0) goto L_0x03a8
            java.lang.Object r5 = r6.next()     // Catch:{ 19b -> 0x03b2 }
            X.5nK r5 = (X.C118095nK) r5     // Catch:{ 19b -> 0x03b2 }
            X.8b5 r4 = new X.8b5     // Catch:{ 19b -> 0x03b2 }
            r4.<init>()     // Catch:{ 19b -> 0x03b2 }
            java.lang.Object r1 = r14.A00     // Catch:{ 19b -> 0x03b2 }
            X.9SX r1 = (X.AnonymousClass9SX) r1     // Catch:{ 19b -> 0x03b2 }
            X.16T r3 = r1.A00     // Catch:{ 19b -> 0x03b2 }
            X.9nx r1 = r5.A00     // Catch:{ 19b -> 0x03b2 }
            r4.A04(r3, r1, r0)     // Catch:{ 19b -> 0x03b2 }
            r7.add(r4)     // Catch:{ 19b -> 0x03b2 }
            goto L_0x0388
        L_0x03a8:
            java.lang.Object r0 = r14.A00     // Catch:{ 19b -> 0x03b2 }
            X.9SX r0 = (X.AnonymousClass9SX) r0     // Catch:{ 19b -> 0x03b2 }
            X.AzC r0 = r0.A01     // Catch:{ 19b -> 0x03b2 }
            r0.BYY(r2, r7)     // Catch:{ 19b -> 0x03b2 }
            return
        L_0x03b2:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.lang.String r0 = "GetMerchantPayoutBanks"
            X.C165577te.A1M(r0, r1)
            java.lang.Object r0 = r14.A00
            X.9SX r0 = (X.AnonymousClass9SX) r0
            X.AzC r1 = r0.A01
            X.9ky r0 = X.C202059ky.A00()
            r1.BYY(r0, r2)
            return
        L_0x03ca:
            java.lang.String r2 = "registration_status"
            X.9nx r5 = X.C203399nx.A03(r15)
            r3 = 0
            if (r5 == 0) goto L_0x0492
            java.lang.String r0 = "network_type"
            java.lang.String r1 = r5.A0i(r0, r3)
            java.lang.String r0 = "ELO"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x0481
            java.lang.String r0 = "elo"
            X.9nx r1 = r5.A0d(r0)     // Catch:{ 19b -> 0x0472 }
            java.lang.String r4 = r1.A0i(r2, r3)     // Catch:{ 19b -> 0x0472 }
            java.lang.String r0 = "0"
            boolean r0 = android.text.TextUtils.equals(r4, r0)     // Catch:{ 19b -> 0x0472 }
            r4 = 5
            if (r0 == 0) goto L_0x045b
            java.lang.String r0 = "key"
            X.9nx r6 = r5.A0d(r0)     // Catch:{ 19b -> 0x0472 }
            java.lang.Object r5 = r14.A00     // Catch:{ 19b -> 0x0472 }
            X.9O5 r5 = (X.AnonymousClass9O5) r5     // Catch:{ 19b -> 0x0472 }
            byte[] r0 = X.C200049gU.A04     // Catch:{ 19b -> 0x0472 }
            java.lang.String r0 = "key-type"
            java.lang.String r11 = r6.A0h(r0)     // Catch:{ 19b -> 0x0472 }
            java.lang.String r0 = "provider"
            java.lang.String r9 = r6.A0h(r0)     // Catch:{ 19b -> 0x0472 }
            java.lang.String r0 = "key-version"
            java.lang.String r12 = r6.A0h(r0)     // Catch:{ 19b -> 0x0472 }
            java.lang.String r0 = "key-scope"
            java.lang.String r10 = r6.A0h(r0)     // Catch:{ 19b -> 0x0472 }
            java.lang.String r0 = "expiry-ts"
            r13 = 0
            java.lang.String r7 = r6.A0i(r0, r3)     // Catch:{ 19b -> 0x0472 }
            java.lang.String r0 = "none"
            boolean r0 = r0.equals(r11)     // Catch:{ 19b -> 0x0472 }
            r8 = 0
            if (r0 != 0) goto L_0x0430
            java.lang.String r0 = "data"
            X.9nx r0 = r6.A0d(r0)     // Catch:{ 19b -> 0x0472 }
            byte[] r13 = r0.A01     // Catch:{ 19b -> 0x0472 }
        L_0x0430:
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ 19b -> 0x0472 }
            if (r0 != 0) goto L_0x043a
            java.lang.Long r8 = X.C165597tg.A0f(r7)     // Catch:{ 19b -> 0x0472 }
        L_0x043a:
            X.AF3 r7 = new X.AF3     // Catch:{ 19b -> 0x0472 }
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch:{ 19b -> 0x0472 }
            X.9gU r0 = r5.A06     // Catch:{ 19b -> 0x0472 }
            r0.A03(r7)     // Catch:{ 19b -> 0x0472 }
            java.lang.String r2 = r1.A0i(r2, r3)     // Catch:{ 19b -> 0x0472 }
            java.lang.String r0 = "wallet_id"
            java.lang.String r0 = r1.A0i(r0, r3)     // Catch:{ 19b -> 0x0472 }
            X.9Ng r1 = new X.9Ng     // Catch:{ 19b -> 0x0472 }
            r1.<init>(r4, r2, r3, r0)     // Catch:{ 19b -> 0x0472 }
            java.lang.Object r0 = r14.A01     // Catch:{ 19b -> 0x0472 }
            X.9RX r0 = (X.AnonymousClass9RX) r0     // Catch:{ 19b -> 0x0472 }
            r0.A00(r1)     // Catch:{ 19b -> 0x0472 }
            return
        L_0x045b:
            java.lang.String r2 = r1.A0i(r2, r3)     // Catch:{ 19b -> 0x0472 }
            java.lang.String r0 = "challenge_id"
            java.lang.String r0 = r1.A0i(r0, r3)     // Catch:{ 19b -> 0x0472 }
            X.9Ng r1 = new X.9Ng     // Catch:{ 19b -> 0x0472 }
            r1.<init>(r4, r2, r0, r3)     // Catch:{ 19b -> 0x0472 }
            java.lang.Object r0 = r14.A01     // Catch:{ 19b -> 0x0472 }
            X.9RX r0 = (X.AnonymousClass9RX) r0     // Catch:{ 19b -> 0x0472 }
            r0.A00(r1)     // Catch:{ 19b -> 0x0472 }
            return
        L_0x0472:
            java.lang.Object r2 = r14.A01
            X.9RX r2 = (X.AnonymousClass9RX) r2
            r1 = 9
            X.9ky r0 = new X.9ky
            r0.<init>((int) r1)
            r2.A00(r3)
            return
        L_0x0481:
            int r0 = X.C175798b4.A01(r1)
            X.9Ng r1 = new X.9Ng
            r1.<init>(r0, r3, r3, r3)
            java.lang.Object r0 = r14.A01
            X.9RX r0 = (X.AnonymousClass9RX) r0
            r0.A00(r1)
            return
        L_0x0492:
            java.lang.Object r1 = r14.A01
            X.9RX r1 = (X.AnonymousClass9RX) r1
            X.9ky r0 = new X.9ky
            r0.<init>()
            r1.A00(r3)
            return
        L_0x049f:
            java.lang.Object r8 = r14.A00
            X.9d9 r8 = (X.C198249d9) r8
            X.1Dc r1 = r8.A07
            java.lang.String r0 = "BrazilAddCredentialAction : onResponseSuccess received"
            r1.A05(r0)
            X.9nx r1 = X.C203399nx.A03(r15)
            if (r1 == 0) goto L_0x0540
            java.lang.String r0 = "callback_url"
            java.lang.String r5 = X.C36391kE.A0x(r1, r0)
            java.lang.String r0 = "credential"
            X.9nx r3 = r1.A0c(r0)
            if (r3 == 0) goto L_0x0540
            java.lang.String r0 = "card"
            X.9nx r1 = r3.A0c(r0)
            if (r1 == 0) goto L_0x0540
            X.8b7 r2 = new X.8b7
            r2.<init>()
            X.16T r0 = r8.A02
            r7 = 0
            r2.A04(r0, r1, r7)
            X.9un r4 = r2.A07()
            X.8b4 r4 = (X.C175798b4) r4
            X.9j5 r1 = r8.A08
            r0 = 0
            X.C201219j5.A01(r0, r4, r1)
            boolean r0 = r2.A0a
            if (r0 == 0) goto L_0x04f4
            X.1EU r0 = r8.A05
            X.9YB r3 = r0.A01()
            java.lang.Object r0 = r14.A01
            X.9I8 r0 = (X.AnonymousClass9I8) r0
            X.9hj r2 = new X.9hj
            r2.<init>(r4, r0, r5, r7)
        L_0x04f0:
            r3.A04(r2, r4)
            return
        L_0x04f4:
            boolean r0 = r2.A07
            if (r0 != 0) goto L_0x051c
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "verify-method-list"
            X.9nx r3 = r3.A0c(r0)
            if (r3 == 0) goto L_0x052d
            X.9nx[] r0 = r3.A02
            if (r0 == 0) goto L_0x052d
            int r2 = r0.length
            if (r2 <= 0) goto L_0x052d
        L_0x050b:
            X.9nx r1 = r3.A0b(r7)
            X.AUm r0 = new X.AUm
            r0.<init>(r1)
            r6.add(r0)
            int r7 = r7 + 1
            if (r7 >= r2) goto L_0x052d
            goto L_0x050b
        L_0x051c:
            X.1EU r0 = r8.A05
            X.9YB r3 = r0.A01()
            java.lang.Object r1 = r14.A01
            X.9I8 r1 = (X.AnonymousClass9I8) r1
            r0 = 1
            X.9hj r2 = new X.9hj
            r2.<init>(r4, r1, r5, r0)
            goto L_0x04f0
        L_0x052d:
            X.1EU r0 = r8.A05
            X.9YB r2 = r0.A01()
            java.lang.Object r1 = r14.A01
            X.9I8 r1 = (X.AnonymousClass9I8) r1
            X.AAK r0 = new X.AAK
            r0.<init>(r4, r1, r5, r6)
            r2.A04(r0, r4)
            return
        L_0x0540:
            java.lang.Object r1 = r14.A01
            X.9I8 r1 = (X.AnonymousClass9I8) r1
            X.9ky r0 = X.C202059ky.A00()
            int r2 = r0.A00
            X.6C8 r1 = r1.A00
            r0 = 0
            X.C179158jJ.A0j(r1, r0, r2)
            return
        L_0x0551:
            java.lang.String r0 = "account"
            X.9nx r3 = r15.A0d(r0)     // Catch:{ 19b -> 0x0589 }
            X.9ky r1 = X.C202059ky.A01(r3)     // Catch:{ 19b -> 0x0589 }
            if (r1 == 0) goto L_0x0562
            java.lang.Object r0 = r14.A01     // Catch:{ 19b -> 0x0589 }
            X.B1R r0 = (X.B1R) r0
            goto L_0x0577
        L_0x0562:
            java.lang.String r0 = "webview_url"
            r1 = 0
            java.lang.String r2 = r3.A0i(r0, r1)     // Catch:{ 19b -> 0x0589 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ 19b -> 0x0589 }
            if (r0 == 0) goto L_0x057b
            java.lang.Object r0 = r14.A01     // Catch:{ 19b -> 0x0589 }
            X.B1R r0 = (X.B1R) r0     // Catch:{ 19b -> 0x0589 }
            X.9ky r1 = X.C202059ky.A00()     // Catch:{ 19b -> 0x0589 }
        L_0x0577:
            r0.BWg(r1)     // Catch:{ 19b -> 0x0589 }
            return
        L_0x057b:
            java.lang.String r0 = "callback_url"
            java.lang.String r1 = r3.A0i(r0, r1)     // Catch:{ 19b -> 0x0589 }
            java.lang.Object r0 = r14.A01     // Catch:{ 19b -> 0x0589 }
            X.B1R r0 = (X.B1R) r0     // Catch:{ 19b -> 0x0589 }
            r0.BiE(r2, r1)     // Catch:{ 19b -> 0x0589 }
            return
        L_0x0589:
            r2 = move-exception
            java.lang.Object r0 = r14.A00
            X.9S6 r0 = (X.AnonymousClass9S6) r0
            X.1Dc r1 = r0.A00
            java.lang.String r0 = "PAY: PaymentStepUpWebviewAction : invalid response"
            r1.A0A(r0, r2)
            java.lang.Object r1 = r14.A01
            X.B1R r1 = (X.B1R) r1
            X.9ky r0 = X.C202059ky.A00()
            r1.BWg(r0)
            return
        L_0x05a1:
            return
        L_0x05a2:
            return
        L_0x05a3:
            X.155 r0 = r4.A02     // Catch:{ Exception -> 0x05af }
            X.C18740tg.A06(r0)     // Catch:{ Exception -> 0x05af }
            r0.Bnv()     // Catch:{ Exception -> 0x05af }
            return
        L_0x05ac:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ Exception -> 0x05af }
            throw r0     // Catch:{ Exception -> 0x05af }
        L_0x05af:
            java.lang.String r0 = "Pay: requestDyiReport -> error parsing the response"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x05b5:
            boolean r0 = r4.isEmpty()
            r2 = 0
            java.lang.Object r1 = r14.A01
            X.B1J r1 = (X.B1J) r1
            if (r0 != 0) goto L_0x05c4
            r1.BfN(r2, r4)
            return
        L_0x05c4:
            X.9ky r0 = X.C202059ky.A00()
            r1.BfN(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B7J.A07(X.9nx):void");
    }
}
