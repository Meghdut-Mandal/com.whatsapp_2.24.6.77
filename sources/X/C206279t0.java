package X;

import android.os.Parcelable;

/* renamed from: X.9t0  reason: invalid class name and case insensitive filesystem */
public abstract class C206279t0 implements Parcelable {
    public abstract String A05();

    public abstract void A06(String str);

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0247, code lost:
        if (r1 == false) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0259, code lost:
        if (r1 != false) goto L_0x025b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.AnonymousClass16T r9, X.C203399nx r10, int r11) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.C175938bJ
            if (r0 == 0) goto L_0x0053
            r5 = r8
            X.8bJ r5 = (X.C175938bJ) r5
            if (r10 == 0) goto L_0x0071
            java.lang.String r0 = "psp_transaction_id"
            java.lang.String r0 = X.C36391kE.A0x(r10, r0)
            r5.A06 = r0
            java.lang.String r1 = "installment"
            X.9nx r0 = r10.A0c(r1)
            if (r0 == 0) goto L_0x0071
            X.9nx r6 = r10.A0c(r1)
            r1 = 0
            X.C36331k8.A1I(r6, r9)
            java.lang.String r0 = "max_count"
            int r4 = r6.A0S(r0, r1)     // Catch:{ 19b -> 0x004b }
            java.lang.String r0 = "selected_count"
            int r3 = r6.A0S(r0, r1)     // Catch:{ 19b -> 0x004b }
            java.lang.String r0 = "due_amount"
            X.9nx r0 = r6.A0c(r0)     // Catch:{ 19b -> 0x004b }
            X.9ua r2 = X.C175938bJ.A00(r9, r0)     // Catch:{ 19b -> 0x004b }
            java.lang.String r0 = "interest"
            X.9nx r0 = r6.A0c(r0)     // Catch:{ 19b -> 0x004b }
            X.9ua r1 = X.C175938bJ.A00(r9, r0)     // Catch:{ 19b -> 0x004b }
            if (r2 == 0) goto L_0x004f
            if (r1 == 0) goto L_0x004f
            X.9uW r0 = new X.9uW     // Catch:{ 19b -> 0x004b }
            r0.<init>(r2, r1, r4, r3)     // Catch:{ 19b -> 0x004b }
            goto L_0x0050
        L_0x004b:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x004f:
            r0 = 0
        L_0x0050:
            r5.A01 = r0
            return
        L_0x0053:
            boolean r0 = r8 instanceof X.C175918bH
            if (r0 == 0) goto L_0x0072
            r2 = r8
            X.8bH r2 = (X.C175918bH) r2
            if (r10 == 0) goto L_0x0071
            java.lang.String r0 = "psp_transaction_id"
            r1 = 0
            java.lang.String r0 = r10.A0i(r0, r1)
            if (r0 == 0) goto L_0x0067
            r2.A04 = r0
        L_0x0067:
            java.lang.String r0 = "psp_receipt_url"
            java.lang.String r0 = r10.A0i(r0, r1)
            if (r0 == 0) goto L_0x0071
            r2.A03 = r0
        L_0x0071:
            return
        L_0x0072:
            boolean r0 = r8 instanceof X.C175928bI
            if (r0 == 0) goto L_0x01db
            r2 = r8
            X.8bI r2 = (X.C175928bI) r2
            java.lang.String r0 = "seq-no"
            r5 = 0
            java.lang.String r1 = r10.A0i(r0, r5)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0088
            r2.A0S = r1
        L_0x0088:
            java.lang.String r0 = "ref-url"
            java.lang.String r1 = r10.A0i(r0, r5)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0096
            r2.A0V = r1
        L_0x0096:
            java.lang.String r0 = "sync-status"
            java.lang.String r1 = r10.A0i(r0, r5)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00a4
            r2.A0T = r1
        L_0x00a4:
            java.lang.String r0 = "upi-bank-info"
            java.lang.String r4 = r10.A0i(r0, r5)
            if (r4 == 0) goto L_0x00ba
            X.6vT r3 = X.C146356vT.A00()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = "bankInfo"
            X.6c7 r0 = X.C165617ti.A0P(r3, r1, r4, r0)
            r2.A0C = r0
        L_0x00ba:
            java.lang.String r0 = "sender-name"
            java.lang.String r0 = r10.A0i(r0, r5)
            java.lang.String r1 = "legalName"
            if (r0 == 0) goto L_0x00ca
            X.6c7 r0 = X.C165577te.A0T(r0, r1)
            r2.A0B = r0
        L_0x00ca:
            java.lang.String r0 = "receiver-name"
            java.lang.String r0 = r10.A0i(r0, r5)
            if (r0 == 0) goto L_0x00d8
            X.6c7 r0 = X.C165577te.A0T(r0, r1)
            r2.A0A = r0
        L_0x00d8:
            java.lang.String r0 = "mandate"
            X.9nx r1 = r10.A0c(r0)
            if (r1 == 0) goto L_0x00e7
            X.9jw r0 = new X.9jw
            r0.<init>(r9, r1)
            r2.A0G = r0
        L_0x00e7:
            java.lang.String r0 = "is-complaint-eligible"
            java.lang.String r3 = r10.A0i(r0, r5)
            java.lang.String r0 = "complaint"
            X.9nx r1 = r10.A0c(r0)
            if (r3 != 0) goto L_0x00f7
            if (r1 == 0) goto L_0x00fe
        L_0x00f7:
            X.9uh r0 = new X.9uh
            r0.<init>(r1, r3)
            r2.A0H = r0
        L_0x00fe:
            java.lang.String r0 = "international-transaction-detail"
            X.9nx r1 = r10.A0c(r0)
            if (r1 == 0) goto L_0x010d
            X.9e1 r0 = new X.9e1
            r0.<init>((X.C203399nx) r1)
            r2.A0F = r0
        L_0x010d:
            java.lang.String r0 = "mandate-transaction-id"
            java.lang.String r1 = r10.A0i(r0, r5)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x011b
            r2.A0L = r1
        L_0x011b:
            java.lang.String r0 = "mcc"
            java.lang.String r1 = r10.A0i(r0, r5)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0129
            r2.A0M = r1
        L_0x0129:
            java.lang.String r0 = "is_p2m_hybrid"
            java.lang.String r1 = r10.A0i(r0, r5)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x013d
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r1)
            r2.A0X = r0
        L_0x013d:
            java.lang.String r0 = "payment_instrument_type"
            java.lang.String r4 = r10.A0i(r0, r5)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0157
            X.6vT r3 = X.C146356vT.A00()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = "paymentInstrumentType"
            X.6c7 r0 = X.C165617ti.A0P(r3, r1, r4, r0)
            r2.A08 = r0
        L_0x0157:
            java.lang.String r0 = "psp_transaction_id"
            java.lang.String r4 = r10.A0i(r0, r5)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0171
            X.6vT r3 = X.C146356vT.A00()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = "pspTransactionId"
            X.6c7 r0 = X.C165617ti.A0P(r3, r1, r4, r0)
            r2.A09 = r0
        L_0x0171:
            java.lang.String r0 = "external_payment_method"
            X.9nx r1 = r10.A0c(r0)
            if (r1 == 0) goto L_0x0192
            java.lang.String r0 = "type"
            java.lang.String r3 = r1.A0h(r0)     // Catch:{ 19b -> 0x018b }
            java.lang.String r0 = "name"
            java.lang.String r1 = r1.A0h(r0)     // Catch:{ 19b -> 0x018b }
            X.9tC r0 = new X.9tC     // Catch:{ 19b -> 0x018b }
            r0.<init>(r3, r1)     // Catch:{ 19b -> 0x018b }
            goto L_0x0190
        L_0x018b:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = 0
        L_0x0190:
            r2.A0E = r0
        L_0x0192:
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r2.A0W = r0
            java.lang.String r0 = "offer"
            java.util.Iterator r3 = X.C203399nx.A08(r10, r0)
        L_0x019e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01c4
            X.9nx r1 = X.C36431kI.A0s(r3)
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            java.lang.String r0 = "id"
            java.lang.String r0 = r1.A0h(r0)     // Catch:{ 19b -> 0x01bd }
            X.9tX r1 = new X.9tX     // Catch:{ 19b -> 0x01bd }
            r1.<init>(r0)     // Catch:{ 19b -> 0x01bd }
            java.util.List r0 = r2.A0W
            r0.add(r1)
            goto L_0x019e
        L_0x01bd:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiTransactionOfferData/fromProtocolNode threw: "
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x019e
        L_0x01c4:
            java.lang.String r0 = "offer_amount"
            X.9nx r1 = r10.A0c(r0)
            if (r1 == 0) goto L_0x0071
            java.lang.String r0 = "money"
            X.9nx r0 = r1.A0c(r0)
            if (r0 == 0) goto L_0x0071
            X.9ua r0 = X.AnonymousClass97M.A00(r9, r0)
            r2.A06 = r0
            return
        L_0x01db:
            boolean r0 = r8 instanceof X.C175908bG
            if (r0 == 0) goto L_0x01ef
            r1 = r8
            X.8bG r1 = (X.C175908bG) r1
            if (r10 == 0) goto L_0x0071
            java.lang.String r0 = "psp_transaction_id"
            java.lang.String r0 = X.C36391kE.A0x(r10, r0)
            if (r0 == 0) goto L_0x0071
            r1.A01 = r0
            return
        L_0x01ef:
            boolean r0 = r8 instanceof X.C175728ax
            if (r0 == 0) goto L_0x0270
            r4 = r8
            X.8ax r4 = (X.C175728ax) r4
            boolean r0 = r4 instanceof X.C175698au
            if (r0 == 0) goto L_0x0071
            X.8au r4 = (X.C175698au) r4
            java.lang.String r0 = "user"
            r5 = 0
            java.lang.String r0 = r10.A0i(r0, r5)
            com.whatsapp.jid.UserJid r0 = X.C36431kI.A0l(r0)
            r4.A04 = r0
            X.6vT r2 = X.C146356vT.A00()
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.String r0 = "vpa"
            java.lang.String r1 = r10.A0i(r0, r5)
            java.lang.String r0 = "upiHandle"
            X.6c7 r0 = X.C165617ti.A0P(r2, r3, r1, r0)
            r4.A01 = r0
            java.lang.String r0 = "vpa-id"
            java.lang.String r0 = r10.A0i(r0, r5)
            r4.A02 = r0
            X.6vT r2 = X.C146356vT.A00()
            java.lang.String r0 = "user-name"
            java.lang.String r1 = r10.A0i(r0, r5)
            java.lang.String r0 = "accountHolderName"
            X.6c7 r0 = X.C165617ti.A0P(r2, r3, r1, r0)
            r4.A00 = r0
            java.lang.String r0 = "nodal"
            java.lang.String r0 = r10.A0i(r0, r5)
            r3 = 1
            java.lang.String r2 = "1"
            if (r0 == 0) goto L_0x0249
            boolean r1 = r0.equals(r2)
            r0 = 1
            if (r1 != 0) goto L_0x024a
        L_0x0249:
            r0 = 0
        L_0x024a:
            r4.A03 = r0
            java.lang.String r0 = "nodal-allowed"
            java.lang.String r0 = r10.A0i(r0, r5)
            if (r0 == 0) goto L_0x025b
            boolean r1 = r0.equals(r2)
            r0 = 0
            if (r1 == 0) goto L_0x025c
        L_0x025b:
            r0 = 1
        L_0x025c:
            r4.A04 = r0
            java.lang.String r0 = "notif-allowed"
            java.lang.String r0 = r10.A0i(r0, r5)
            if (r0 == 0) goto L_0x026d
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x026d
            r3 = 0
        L_0x026d:
            r4.A05 = r3
            return
        L_0x0270:
            boolean r0 = r8 instanceof X.C175738ay
            if (r0 == 0) goto L_0x02ce
            r6 = r8
            X.8b9 r6 = (X.C175838b9) r6
            java.lang.String r5 = "BrazilCustomPaymentMethodData"
            if (r10 != 0) goto L_0x0281
            java.lang.String r0 = "fromNetwork: the customPaymentNode is null"
            X.C165577te.A1M(r5, r0)
            return
        L_0x0281:
            java.lang.String r0 = "country"
            java.lang.String r0 = r10.A0h(r0)     // Catch:{ 19b -> 0x04be }
            r6.A00 = r0     // Catch:{ 19b -> 0x04be }
            java.lang.String r0 = "credential-id"
            java.lang.String r0 = r10.A0h(r0)     // Catch:{ 19b -> 0x04be }
            r6.A01 = r0     // Catch:{ 19b -> 0x04be }
            java.lang.String r0 = "type"
            java.lang.String r0 = r10.A0h(r0)     // Catch:{ 19b -> 0x04be }
            r6.A02 = r0     // Catch:{ 19b -> 0x04be }
            java.lang.String r0 = "metadata_info"
            X.9nx r1 = r10.A0c(r0)     // Catch:{ 19b -> 0x04be }
            if (r1 == 0) goto L_0x0071
            java.util.HashMap r0 = X.AnonymousClass001.A0J()     // Catch:{ 19b -> 0x04be }
            r6.A03 = r0     // Catch:{ 19b -> 0x04be }
            java.lang.String r0 = "metadata"
            java.util.Iterator r4 = X.C203399nx.A08(r1, r0)     // Catch:{ 19b -> 0x04be }
        L_0x02ad:
            boolean r0 = r4.hasNext()     // Catch:{ 19b -> 0x04be }
            if (r0 == 0) goto L_0x0071
            X.9nx r1 = X.C36431kI.A0s(r4)     // Catch:{ 19b -> 0x04be }
            java.lang.String r0 = "key"
            java.lang.String r3 = r1.A0h(r0)     // Catch:{ 19b -> 0x04be }
            java.lang.String r0 = "value"
            java.lang.String r2 = r1.A0h(r0)     // Catch:{ 19b -> 0x04be }
            java.util.HashMap r1 = r6.A03     // Catch:{ 19b -> 0x04be }
            X.9u7 r0 = new X.9u7     // Catch:{ 19b -> 0x04be }
            r0.<init>(r3, r2)     // Catch:{ 19b -> 0x04be }
            r1.put(r3, r0)     // Catch:{ 19b -> 0x04be }
            goto L_0x02ad
        L_0x02ce:
            boolean r0 = r8 instanceof X.C175808b5
            if (r0 == 0) goto L_0x033f
            r2 = r8
            X.8b5 r2 = (X.C175808b5) r2
            java.lang.String r0 = "country"
            r1 = 0
            java.lang.String r0 = r10.A0i(r0, r1)
            r2.A05 = r0
            java.lang.String r0 = "credential-id"
            java.lang.String r0 = r10.A0i(r0, r1)
            r2.A06 = r0
            java.lang.String r0 = "account-number"
            java.lang.String r3 = r10.A0i(r0, r1)
            java.lang.String r0 = "bankAccountNumber"
            X.6c7 r0 = X.C202349ld.A01(r3, r0)
            r2.A02 = r0
            java.lang.String r0 = "bank-name"
            java.lang.String r3 = r10.A0i(r0, r1)
            java.lang.String r0 = "bankName"
            X.6c7 r0 = X.C202349ld.A01(r3, r0)
            r2.A01 = r0
            java.lang.String r0 = "code"
            java.lang.String r0 = r10.A0i(r0, r1)
            r2.A01 = r0
            if (r0 != 0) goto L_0x0314
            java.lang.String r0 = "bank-code"
            java.lang.String r0 = r10.A0i(r0, r1)
            r2.A01 = r0
        L_0x0314:
            java.lang.String r0 = "verification-status"
            java.lang.String r0 = r10.A0i(r0, r1)
            int r0 = X.C207249un.A04(r0)
            r2.A00 = r0
            java.lang.String r0 = "short-name"
            java.lang.String r0 = r10.A0i(r0, r1)
            r2.A02 = r0
            java.lang.String r0 = "bank-image"
            java.lang.String r0 = r10.A0i(r0, r1)
            r2.A03 = r0
            java.lang.String r0 = "accept-savings"
            java.lang.String r1 = r10.A0i(r0, r1)
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r1)
            r2.A03 = r0
            return
        L_0x033f:
            boolean r0 = r8 instanceof X.C175868bC
            if (r0 == 0) goto L_0x0461
            r4 = r8
            X.8bC r4 = (X.C175868bC) r4
            java.lang.String r0 = "can-sell"
            r2 = 0
            java.lang.String r0 = r10.A0i(r0, r2)
            java.lang.String r5 = "1"
            boolean r7 = r5.equals(r0)
            java.lang.String r0 = "can-payout"
            boolean r6 = X.C203399nx.A0J(r10, r0, r5)
            java.lang.String r0 = "can-add-payout"
            boolean r1 = X.C203399nx.A0J(r10, r0, r5)
            r3 = 0
            int r0 = X.C165587tf.A03(r6)
            int r7 = r7 + r0
            r0 = 0
            if (r1 == 0) goto L_0x0369
            r0 = 4
        L_0x0369:
            int r7 = r7 + r0
            r4.A01 = r7
            java.lang.String r0 = "display-state"
            java.lang.String r1 = r10.A0i(r0, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x037a
            java.lang.String r1 = "ACTIVE"
        L_0x037a:
            r4.A07 = r1
            java.lang.String r0 = "merchant-id"
            java.lang.String r0 = r10.A0i(r0, r2)
            r4.A09 = r0
            java.lang.String r0 = "p2m-eligible"
            boolean r0 = X.C203399nx.A0J(r10, r0, r5)
            r4.A0E = r0
            java.lang.String r0 = "p2p-eligible"
            boolean r0 = X.C203399nx.A0J(r10, r0, r5)
            r4.A0F = r0
            java.lang.String r0 = "support-phone-number"
            java.lang.String r0 = r10.A0i(r0, r2)
            r4.A0C = r0
            java.lang.String r0 = "business-name"
            java.lang.String r0 = r10.A0i(r0, r2)
            r4.A03 = r0
            java.lang.String r0 = "gateway-name"
            java.lang.String r0 = r10.A0i(r0, r2)
            r4.A03 = r0
            java.lang.String r0 = "max_installment_count"
            int r0 = r10.A0S(r0, r3)     // Catch:{ 19b -> 0x03b5 }
            r4.A00 = r0     // Catch:{ 19b -> 0x03b5 }
            goto L_0x03bf
        L_0x03b5:
            r5 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Exception in parsing maxInstallmentCount: "
            X.C36321k7.A1J(r5, r0, r1)
        L_0x03bf:
            java.lang.String r0 = "country"
            java.lang.String r0 = r10.A0i(r0, r2)
            r4.A04 = r0
            java.lang.String r0 = "credential-id"
            java.lang.String r0 = r10.A0i(r0, r2)
            r4.A05 = r0
            java.lang.String r0 = "created"
            long r0 = X.C203399nx.A02(r10, r0)
            r4.A02 = r0
            java.lang.String r0 = "dashboard-url"
            java.lang.String r0 = r10.A0i(r0, r2)
            r4.A06 = r0
            java.lang.String r0 = "provider_contact_website"
            java.lang.String r0 = r10.A0i(r0, r2)
            r4.A0B = r0
            java.lang.String r0 = "logo-uri"
            java.lang.String r0 = r10.A0i(r0, r2)
            r4.A08 = r0
            java.lang.String r0 = "provider-type"
            java.lang.String r0 = r10.A0i(r0, r2)
            r4.A05 = r0
            java.lang.String r0 = "pix-onboarding-state"
            java.lang.String r1 = r10.A0i(r0, r2)
            r0 = -1
            int r0 = X.AnonymousClass6R8.A00(r1, r0)
            r4.A01 = r0
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r4.A0D = r0
            java.lang.String r0 = "payout"
            java.util.Iterator r5 = X.C203399nx.A08(r10, r0)
        L_0x0410:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0071
            X.9nx r2 = X.C36431kI.A0s(r5)
            java.lang.String r0 = "type"
            java.lang.String r1 = X.C36391kE.A0x(r2, r0)
            java.lang.String r0 = "bank"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0444
            X.8b5 r0 = new X.8b5
            r0.<init>()
            r0.A04(r9, r2, r3)
            X.9un r2 = r0.A07()
            if (r2 == 0) goto L_0x0410
            int r0 = r0.A00
        L_0x0438:
            r2.A04 = r0
            java.lang.String r0 = r4.A05
            r2.A0C = r0
            java.util.List r0 = r4.A0D
            r0.add(r2)
            goto L_0x0410
        L_0x0444:
            java.lang.String r0 = "prepaid-card"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0410
            X.8b7 r1 = new X.8b7
            r1.<init>()
            r1.A04(r9, r2, r3)
            r0 = 8
            r1.A00 = r0
            X.9un r2 = r1.A07()
            if (r2 == 0) goto L_0x0410
            int r0 = r1.A01
            goto L_0x0438
        L_0x0461:
            r2 = r8
            X.8bD r2 = (X.C175878bD) r2
            java.lang.String r0 = "display-state"
            r3 = 0
            java.lang.String r1 = r10.A0i(r0, r3)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0473
            java.lang.String r1 = "ACTIVE"
        L_0x0473:
            r2.A07 = r1
            java.lang.String r0 = "merchant-id"
            java.lang.String r0 = r10.A0i(r0, r3)
            r2.A09 = r0
            java.lang.String r0 = "business-name"
            java.lang.String r0 = r10.A0i(r0, r3)
            r2.A03 = r0
            java.lang.String r0 = "country"
            java.lang.String r0 = r10.A0i(r0, r3)
            r2.A04 = r0
            java.lang.String r0 = "credential-id"
            java.lang.String r0 = r10.A0i(r0, r3)
            r2.A05 = r0
            java.lang.String r0 = "vpa"
            java.lang.String r1 = r10.A0i(r0, r3)
            java.lang.String r0 = "upiHandle"
            X.6c7 r0 = X.C202349ld.A01(r1, r0)
            r2.A00 = r0
            java.lang.String r0 = "vpa-id"
            java.lang.String r0 = r10.A0i(r0, r3)
            r2.A02 = r0
            java.lang.String r0 = "bank"
            X.9nx r1 = r10.A0c(r0)
            if (r1 == 0) goto L_0x0071
            X.8b6 r0 = new X.8b6
            r0.<init>()
            r2.A01 = r0
            r0.A04(r9, r1, r11)
            return
        L_0x04be:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Error creating an instance of BrazilCustomPaymentMethodData. Exception = "
            java.lang.String r0 = X.C36331k8.A0i(r0, r1, r2)
            X.C165577te.A1M(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206279t0.A04(X.16T, X.9nx, int):void");
    }
}
