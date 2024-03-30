package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9jw  reason: invalid class name and case insensitive filesystem */
public class C201599jw {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public C207119ua A05;
    public C135086c7 A06;
    public C135086c7 A07;
    public C135086c7 A08;
    @Deprecated
    public C135086c7 A09;
    public C135086c7 A0A;
    public C201169iz A0B;
    public C201459je A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public C198689e2[] A0P;

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a7, code lost:
        if (r7.equals(r1) == false) goto L_0x01a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C201599jw(X.AnonymousClass16T r18, X.C203399nx r19) {
        /*
            r17 = this;
            r4 = r17
            r4.<init>()
            r6 = 1
            r4.A0M = r6
            java.lang.String r0 = "mandate-no"
            r3 = 0
            r5 = r19
            java.lang.String r7 = r5.A0i(r0, r3)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0025
            X.6vT r2 = X.C146356vT.A00()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = "mandateNo"
            X.6c7 r0 = X.C165617ti.A0P(r2, r1, r7, r0)
            r4.A08 = r0
        L_0x0025:
            java.lang.String r0 = "amount-rule"
            java.lang.String r1 = r5.A0i(r0, r3)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0033
            r4.A0G = r1
        L_0x0033:
            java.lang.String r0 = "is-revocable"
            java.lang.String r0 = r5.A0i(r0, r3)
            r9 = 0
            if (r0 == 0) goto L_0x0045
            int r0 = X.AnonymousClass6R8.A00(r0, r9)
            if (r0 == r6) goto L_0x0043
            r6 = 0
        L_0x0043:
            r4.A0N = r6
        L_0x0045:
            java.lang.String r0 = "mandate-name"
            java.lang.String r6 = r5.A0i(r0, r3)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x005f
            X.6vT r2 = X.C146356vT.A00()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = "mandateName"
            X.6c7 r0 = X.C165617ti.A0P(r2, r1, r6, r0)
            r4.A07 = r0
        L_0x005f:
            java.lang.String r0 = "purpose-code"
            java.lang.String r6 = r5.A0i(r0, r3)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0079
            X.6vT r2 = X.C146356vT.A00()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = "upiPurposeCode"
            X.6c7 r0 = X.C165617ti.A0P(r2, r1, r6, r0)
            r4.A0A = r0
        L_0x0079:
            java.lang.String r0 = "start-ts"
            java.lang.String r2 = r5.A0i(r0, r3)
            r10 = 1000(0x3e8, double:4.94E-321)
            r0 = 0
            if (r2 == 0) goto L_0x008c
            long r6 = X.AnonymousClass6R8.A01(r2, r0)
            long r6 = r6 * r10
            r4.A02 = r6
        L_0x008c:
            java.lang.String r2 = "end-ts"
            java.lang.String r2 = r5.A0i(r2, r3)
            if (r2 == 0) goto L_0x009b
            long r6 = X.AnonymousClass6R8.A01(r2, r0)
            long r6 = r6 * r10
            r4.A01 = r6
        L_0x009b:
            java.lang.String r2 = "debit-ts"
            java.lang.String r2 = r5.A0i(r2, r3)
            if (r2 == 0) goto L_0x00a5
            r4.A0D = r2
        L_0x00a5:
            java.lang.String r2 = "next-payment-ts"
            java.lang.String r2 = r5.A0i(r2, r3)
            if (r2 == 0) goto L_0x00b4
            long r6 = X.AnonymousClass6R8.A01(r2, r0)
            long r6 = r6 * r10
            r4.A04 = r6
        L_0x00b4:
            java.lang.String r2 = "next-payment-end-ts"
            java.lang.String r2 = r5.A0i(r2, r3)
            if (r2 == 0) goto L_0x00c3
            long r0 = X.AnonymousClass6R8.A01(r2, r0)
            long r0 = r0 * r10
            r4.A03 = r0
        L_0x00c3:
            java.lang.String r0 = "error-code"
            java.lang.String r0 = r5.A0i(r0, r3)
            if (r0 == 0) goto L_0x00cd
            r4.A0H = r0
        L_0x00cd:
            java.lang.String r0 = "original-amount"
            X.9nx r1 = r5.A0c(r0)
            java.lang.String r7 = "moneyStringValue"
            r6 = r18
            if (r1 != 0) goto L_0x00e6
            java.lang.String r0 = r5.A0i(r0, r3)
            if (r0 == 0) goto L_0x010e
            X.6c7 r0 = X.C165577te.A0T(r0, r7)
            r4.A09 = r0
            goto L_0x010e
        L_0x00e6:
            java.lang.String r0 = "money"
            X.9nx r0 = r1.A0c(r0)
            if (r0 == 0) goto L_0x010e
            X.9ua r0 = X.AnonymousClass97M.A00(r6, r0)
            r4.A05 = r0     // Catch:{ Exception -> 0x0109 }
            X.6vT r2 = X.C146356vT.A00()     // Catch:{ Exception -> 0x0109 }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            X.16X r0 = r0.A02     // Catch:{ Exception -> 0x0109 }
            java.math.BigDecimal r0 = r0.A00     // Catch:{ Exception -> 0x0109 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0109 }
            X.6c7 r0 = X.C165617ti.A0P(r2, r1, r0, r7)     // Catch:{ Exception -> 0x0109 }
            r4.A09 = r0     // Catch:{ Exception -> 0x0109 }
            goto L_0x010e
        L_0x0109:
            java.lang.String r0 = "PAY: IndiaUpiMandateMetadata - and error occured while parsing the money node"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x010e:
            java.lang.String r0 = "total-expected-txns"
            int r0 = r5.A0S(r0, r9)     // Catch:{ 19b -> 0x014d }
            r4.A00 = r0     // Catch:{ 19b -> 0x014d }
            java.lang.String r0 = "pause-resume-status-details"
            X.9nx r1 = r5.A0c(r0)     // Catch:{ 19b -> 0x014d }
            if (r1 == 0) goto L_0x0125
            X.9iz r0 = new X.9iz     // Catch:{ 19b -> 0x014d }
            r0.<init>((X.C203399nx) r1)     // Catch:{ 19b -> 0x014d }
            r4.A0B = r0     // Catch:{ 19b -> 0x014d }
        L_0x0125:
            java.lang.String r0 = "transaction"
            java.util.List r8 = r5.A0j(r0)     // Catch:{ 19b -> 0x014d }
            boolean r0 = r8.isEmpty()     // Catch:{ 19b -> 0x014d }
            if (r0 != 0) goto L_0x0152
            int r7 = r8.size()     // Catch:{ 19b -> 0x014d }
            X.9e2[] r0 = new X.C198689e2[r7]     // Catch:{ 19b -> 0x014d }
            r4.A0P = r0     // Catch:{ 19b -> 0x014d }
        L_0x0139:
            if (r9 >= r7) goto L_0x0152
            X.9e2[] r2 = r4.A0P     // Catch:{ 19b -> 0x014d }
            java.lang.Object r1 = r8.get(r9)     // Catch:{ 19b -> 0x014d }
            X.9nx r1 = (X.C203399nx) r1     // Catch:{ 19b -> 0x014d }
            X.9e2 r0 = new X.9e2     // Catch:{ 19b -> 0x014d }
            r0.<init>((X.C203399nx) r1)     // Catch:{ 19b -> 0x014d }
            r2[r9] = r0     // Catch:{ 19b -> 0x014d }
            int r9 = r9 + 1
            goto L_0x0139
        L_0x014d:
            java.lang.String r0 = "PAY: IndiaUpiMandateMetadata - and error occurred while parsing recurring mandate info"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0152:
            java.lang.String r0 = "mandate-info"
            java.lang.String r7 = r5.A0i(r0, r3)
            if (r7 == 0) goto L_0x0168
            X.6vT r2 = X.C146356vT.A00()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = "mandateInfo"
            X.6c7 r0 = X.C165617ti.A0P(r2, r1, r7, r0)
            r4.A06 = r0
        L_0x0168:
            java.lang.String r0 = "frequency-rule"
            java.lang.String r0 = r5.A0i(r0, r3)
            java.lang.String r2 = "UNKNOWN"
            if (r0 == 0) goto L_0x018d
            int r16 = r0.hashCode()
            java.lang.String r15 = "MONTHLY"
            java.lang.String r14 = "ASPRESENTED"
            java.lang.String r13 = "QUARTERLY"
            java.lang.String r12 = "BIMONTHLY"
            java.lang.String r11 = "FORTNIGHTLY"
            java.lang.String r10 = "HALFYEARLY"
            java.lang.String r9 = "DAILY"
            java.lang.String r8 = "ONETIME"
            java.lang.String r7 = "YEARLY"
            java.lang.String r1 = "WEEKLY"
            switch(r16) {
                case -1738378111: goto L_0x0216;
                case -1681232246: goto L_0x020d;
                case -602281453: goto L_0x0205;
                case 64808441: goto L_0x01fd;
                case 1134556285: goto L_0x01f5;
                case 1271097434: goto L_0x01ed;
                case 1297843654: goto L_0x01e5;
                case 1720567065: goto L_0x01dd;
                case 1896178312: goto L_0x01d5;
                case 1954618349: goto L_0x01cd;
                default: goto L_0x018d;
            }
        L_0x018d:
            r4.A0E = r2
            java.lang.String r0 = "recurrence-rule"
            java.lang.String r7 = r5.A0i(r0, r3)
            java.lang.String r2 = "ON"
            if (r7 == 0) goto L_0x01a9
            java.lang.String r1 = "AFTER"
            boolean r0 = r7.equals(r1)
            if (r0 != 0) goto L_0x01cb
            java.lang.String r1 = "BEFORE"
            boolean r0 = r7.equals(r1)
            if (r0 != 0) goto L_0x01cb
        L_0x01a9:
            r4.A0K = r2
            java.lang.String r0 = "recurrence-day"
            java.lang.String r0 = r5.A0i(r0, r3)
            r4.A0J = r0
            java.lang.String r0 = "ref-id"
            java.lang.String r0 = r5.A0i(r0, r3)
            r4.A0L = r0
            java.lang.String r0 = "mandate-update"
            X.9nx r1 = r5.A0c(r0)
            if (r1 == 0) goto L_0x01ca
            X.9je r0 = new X.9je
            r0.<init>(r6, r1)
            r4.A0C = r0
        L_0x01ca:
            return
        L_0x01cb:
            r2 = r1
            goto L_0x01a9
        L_0x01cd:
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x018d
            r2 = r15
            goto L_0x018d
        L_0x01d5:
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x018d
            r2 = r14
            goto L_0x018d
        L_0x01dd:
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x018d
            r2 = r13
            goto L_0x018d
        L_0x01e5:
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x018d
            r2 = r12
            goto L_0x018d
        L_0x01ed:
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x018d
            r2 = r11
            goto L_0x018d
        L_0x01f5:
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x018d
            r2 = r10
            goto L_0x018d
        L_0x01fd:
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x018d
            r2 = r9
            goto L_0x018d
        L_0x0205:
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x018d
            r2 = r8
            goto L_0x018d
        L_0x020d:
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x018d
            r2 = r7
            goto L_0x018d
        L_0x0216:
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018d
            r2 = r1
            goto L_0x018d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201599jw.<init>(X.16T, X.9nx):void");
    }

    public int A00() {
        C201169iz r7 = this.A0B;
        if (r7 != null) {
            String str = r7.A02;
            if (!str.equals("RESUME")) {
                if (str.equals("PAUSE")) {
                    String str2 = r7.A03;
                    switch (str2.hashCode()) {
                        case -1149187101:
                            if (str2.equals("SUCCESS")) {
                                return 2;
                            }
                            break;
                        case -368591510:
                            if (str2.equals("FAILURE")) {
                                return 3;
                            }
                            break;
                        case 35394935:
                            if (str2.equals("PENDING")) {
                                return 1;
                            }
                            break;
                    }
                }
            }
            String str3 = r7.A03;
            switch (str3.hashCode()) {
                case -1149187101:
                    if (str3.equals("SUCCESS")) {
                        return 5;
                    }
                    break;
                case -368591510:
                    if (str3.equals("FAILURE")) {
                        return 6;
                    }
                    break;
                case 35394935:
                    if (str3.equals("PENDING")) {
                        return 4;
                    }
                    break;
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C201599jw)) {
            return false;
        }
        return A01().equals(((C201599jw) obj).A01());
    }

    public int hashCode() {
        Object[] objArr = new Object[26];
        C165577te.A1V(objArr, this.A0M);
        C36421kH.A1R(objArr, this.A0N);
        C165587tf.A1X(objArr, this.A0O);
        C165587tf.A1W(objArr, this.A02);
        C165607th.A1T(objArr, this.A01);
        objArr[5] = this.A0D;
        objArr[6] = this.A0I;
        objArr[7] = Long.valueOf(this.A04);
        objArr[8] = Long.valueOf(this.A03);
        objArr[9] = Integer.valueOf(this.A00);
        objArr[10] = this.A0G;
        objArr[11] = this.A08;
        objArr[12] = this.A07;
        objArr[13] = this.A0A;
        objArr[14] = this.A0H;
        objArr[15] = this.A05;
        objArr[16] = this.A09;
        objArr[17] = this.A06;
        objArr[18] = this.A0E;
        objArr[19] = this.A0K;
        objArr[20] = this.A0J;
        objArr[21] = this.A0L;
        objArr[22] = this.A0B;
        objArr[23] = this.A0P;
        objArr[24] = this.A0C;
        return AnonymousClass000.A0M(this.A0F, objArr, 25);
    }

    public String toString() {
        String obj;
        C201459je r0 = this.A0C;
        String str = "null";
        if (r0 == null) {
            obj = str;
        } else {
            obj = r0.toString();
        }
        C201169iz r02 = this.A0B;
        if (r02 != null) {
            str = r02.toString();
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[ ");
        C198689e2[] r6 = this.A0P;
        if (r6 != null) {
            for (C198689e2 A1K : r6) {
                C36351kA.A1K(A1K, A0u);
            }
        }
        StringBuilder A0q = C90484aE.A0q(" ]", A0u);
        A0q.append("[ mandateNo: ");
        A0q.append(this.A08);
        A0q.append(" mandateErrorCode: ");
        A0q.append(this.A0H);
        A0q.append(" isMandate : ");
        A0q.append(this.A0M);
        A0q.append(" mandateName : ");
        A0q.append(this.A07);
        A0q.append(" upiPurposeCode : ");
        A0q.append(this.A0A);
        StringBuilder A0q2 = C90484aE.A0q(" mandateStartTs: ", A0q);
        A0q2.append(this.A02);
        C200449hQ.A04(A0q2, A0q);
        StringBuilder A0q3 = C90484aE.A0q(" mandateEndTs: ", A0q);
        A0q3.append(this.A01);
        C200449hQ.A04(A0q3, A0q);
        StringBuilder A0q4 = C90484aE.A0q(" debitTs: ", A0q);
        A0q4.append(this.A0D);
        C200449hQ.A04(A0q4, A0q);
        StringBuilder A0q5 = C90484aE.A0q(" previousDebitTs: ", A0q);
        A0q5.append(this.A0I);
        C200449hQ.A04(A0q5, A0q);
        StringBuilder A0q6 = C90484aE.A0q(" nextPaymentTs: ", A0q);
        A0q6.append(this.A04);
        C200449hQ.A04(A0q6, A0q);
        StringBuilder A0q7 = C90484aE.A0q(" nextPaymentEndTs: ", A0q);
        A0q7.append(this.A03);
        C200449hQ.A04(A0q7, A0q);
        StringBuilder A0q8 = C90484aE.A0q(" totalRecurringTxnCount: ", A0q);
        A0q8.append(this.A00);
        C200449hQ.A04(A0q8, A0q);
        StringBuilder A0q9 = C90484aE.A0q(" initiationMode: ", A0q);
        A0q9.append(this.A0F);
        C200449hQ.A04(A0q9, A0q);
        A0q.append(" mandateInfo: ");
        A0q.append(this.A06);
        A0q.append(" pendingMandateUpdate: {");
        A0q.append(obj);
        A0q.append("}  pauseResumeStatusDetails: {");
        A0q.append(str);
        C165567td.A1M(A0u, "}  instanceTransactions: {", A0q);
        return AnonymousClass000.A0q("} ]", A0q);
    }

    public String A01() {
        String str;
        Object obj;
        String str2;
        String str3;
        Object obj2;
        Object obj3;
        try {
            JSONObject A1B = C36441kJ.A1B();
            A1B.put("isMandate", this.A0M);
            A1B.put("isRevocable", this.A0N);
            A1B.put("isShareToPayee", this.A0O);
            long j = this.A02;
            if (j > 0) {
                A1B.put("mandateStartTs", j);
            }
            long j2 = this.A01;
            if (j2 > 0) {
                A1B.put("mandateEndTs", j2);
            }
            String str4 = this.A0G;
            if (str4 != null) {
                A1B.put("mandateAmountRule", str4);
            }
            C135086c7 r1 = this.A08;
            if (r1 != null) {
                C165607th.A1D(r1, "mandateNo", A1B);
            }
            C135086c7 r12 = this.A07;
            if (r12 != null) {
                C165607th.A1D(r12, "mandateName", A1B);
            }
            C135086c7 r13 = this.A0A;
            if (r13 != null) {
                C165607th.A1D(r13, "upiPurposeCode", A1B);
            }
            String str5 = this.A0H;
            if (str5 != null) {
                A1B.put("mandateErrorCode", str5);
            }
            C135086c7 r14 = this.A09;
            if (!C202349ld.A03(r14)) {
                C165607th.A1D(r14, "originalAmount", A1B);
            }
            C207119ua r0 = this.A05;
            if (r0 != null) {
                A1B.put("originalMoney", r0.A02());
            }
            C201459je r2 = this.A0C;
            if (r2 != null) {
                try {
                    JSONObject A1B2 = C36441kJ.A1B();
                    C135086c7 r15 = r2.A03;
                    if (r15 != null) {
                        C165607th.A1D(r15, "pendingAmount", A1B2);
                    }
                    C207119ua r02 = r2.A01;
                    if (r02 != null) {
                        A1B2.put("pendingMoney", r02.A02());
                    }
                    String str6 = r2.A06;
                    if (str6 != null) {
                        A1B2.put("isRevocable", str6);
                    }
                    long j3 = r2.A00;
                    if (j3 > 0) {
                        A1B2.put("mandateEndTs", j3);
                    }
                    String str7 = r2.A07;
                    if (str7 != null) {
                        A1B2.put("mandateAmountRule", str7);
                    }
                    C135086c7 r6 = r2.A04;
                    if (!C202349ld.A03(r6)) {
                        if (r6 == null) {
                            obj3 = null;
                        } else {
                            obj3 = r6.A00;
                        }
                        A1B2.put("seqNum", obj3);
                    }
                    String str8 = r2.A05;
                    if (str8 != null) {
                        A1B2.put("errorCode", str8);
                    }
                    String str9 = r2.A09;
                    if (str9 != null) {
                        A1B2.put("mandateUpdateStatus", str9);
                    }
                    String str10 = r2.A08;
                    if (str10 != null) {
                        A1B2.put("mandateUpdateAction", str10);
                    }
                    C135086c7 r22 = r2.A02;
                    if (!C202349ld.A03(r22)) {
                        if (r22 == null) {
                            obj2 = null;
                        } else {
                            obj2 = r22.A00;
                        }
                        A1B2.put("mandateUpdateInfo", obj2);
                    }
                    str3 = A1B2.toString();
                } catch (JSONException e) {
                    Log.w("PAY: IndiaUpiTransactionPendingUpdateMetadata toJsonString threw: ", e);
                    str3 = null;
                }
                A1B.put("pendingMandateUpdate", str3);
            }
            C135086c7 r16 = this.A06;
            if (r16 != null) {
                C165607th.A1D(r16, "mandateInfo", A1B);
            }
            String str11 = this.A0E;
            if (str11 != null) {
                A1B.put("frequencyRule", str11);
            }
            String str12 = this.A0K;
            if (str12 != null) {
                A1B.put("recurrenceRule", str12);
            }
            String str13 = this.A0J;
            if (str13 != null) {
                A1B.put("recurrenceDay", str13);
            }
            String str14 = this.A0L;
            if (str14 != null) {
                A1B.put("refId", str14);
            }
            int i = this.A00;
            if (i > 0) {
                A1B.put("totalRecurringTxnCount", i);
            }
            String str15 = this.A0D;
            if (str15 != null) {
                A1B.put("debitTs", str15);
            }
            String str16 = this.A0I;
            if (str16 != null) {
                A1B.put("previousDebitTs", str16);
            }
            long j4 = this.A04;
            if (j4 > 0) {
                A1B.put("nextPaymentTs", j4);
            }
            long j5 = this.A03;
            if (j5 > 0) {
                A1B.put("nextPaymentEndTs", j5);
            }
            C201169iz r62 = this.A0B;
            if (r62 != null) {
                JSONObject A1B3 = C36441kJ.A1B();
                try {
                    A1B3.put("action", r62.A02);
                    A1B3.put("status", r62.A03);
                    A1B3.put("pauseStartTs", r62.A01);
                    A1B3.put("pauseEndTs", r62.A00);
                    str2 = A1B3.toString();
                } catch (JSONException e2) {
                    Log.w("PAY: IndiaUpiMandateMetadata:PauseResumeStatusDetails toJsonString threw: ", e2);
                    str2 = null;
                }
                A1B.put("pauseResumeStatusDetails", str2);
            }
            C198689e2[] r03 = this.A0P;
            if (r03 != null && r03.length > 0) {
                JSONArray A0u = C90524aI.A0u();
                for (C198689e2 r3 : this.A0P) {
                    JSONObject A1B4 = C36441kJ.A1B();
                    try {
                        C135086c7 r04 = r3.A00;
                        if (r04 == null) {
                            obj = null;
                        } else {
                            obj = r04.A00;
                        }
                        A1B4.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, obj);
                        A1B4.put("status", r3.A01);
                        str = A1B4.toString();
                    } catch (JSONException e3) {
                        Log.w("PAY: IndiaUpiMandateMetadata:InstanceTransaction toJsonString threw: ", e3);
                        str = null;
                    }
                    A0u.put(str);
                }
                A1B.put("instanceTransactions", A0u);
            }
            String str17 = this.A0F;
            if (str17 != null) {
                A1B.put("initiationMode", str17);
            }
            return A1B.toString();
        } catch (JSONException e4) {
            Log.w("PAY: IndiaUpiTransactionMetadata toDBString threw: ", e4);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0174, code lost:
        r6 = new org.json.JSONArray(r2.optString("instanceTransactions", "[]"));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C201599jw(java.lang.String r15) {
        /*
            r14 = this;
            java.lang.String r10 = "instanceTransactions"
            java.lang.String r9 = "pauseResumeStatusDetails"
            java.lang.String r8 = "pendingMandateUpdate"
            java.lang.String r7 = "mandateInfo"
            java.lang.String r6 = "upiPurposeCode"
            java.lang.String r5 = "mandateName"
            java.lang.String r4 = "mandateNo"
            java.lang.String r3 = "originalMoney"
            r14.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x01af
            org.json.JSONObject r2 = X.C36441kJ.A1C(r15)     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = "isMandate"
            r1 = 0
            boolean r0 = r2.optBoolean(r0, r1)     // Catch:{ JSONException -> 0x01a9 }
            r14.A0M = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = "isRevocable"
            boolean r0 = r2.optBoolean(r0, r1)     // Catch:{ JSONException -> 0x01a9 }
            r14.A0N = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = "isShareToPayee"
            boolean r0 = r2.optBoolean(r0, r1)     // Catch:{ JSONException -> 0x01a9 }
            r14.A0O = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r11 = "mandateStartTs"
            long r0 = r14.A02     // Catch:{ JSONException -> 0x01a9 }
            long r0 = r2.optLong(r11, r0)     // Catch:{ JSONException -> 0x01a9 }
            r14.A02 = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r11 = "mandateEndTs"
            long r0 = r14.A01     // Catch:{ JSONException -> 0x01a9 }
            long r0 = r2.optLong(r11, r0)     // Catch:{ JSONException -> 0x01a9 }
            r14.A01 = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r1 = "debitTs"
            java.lang.String r0 = r14.A0D     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = r2.optString(r1, r0)     // Catch:{ JSONException -> 0x01a9 }
            r14.A0D = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r1 = "previousDebitTs"
            java.lang.String r0 = r14.A0I     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = r2.optString(r1, r0)     // Catch:{ JSONException -> 0x01a9 }
            r14.A0I = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r11 = "nextPaymentTs"
            long r0 = r14.A04     // Catch:{ JSONException -> 0x01a9 }
            long r0 = r2.optLong(r11, r0)     // Catch:{ JSONException -> 0x01a9 }
            r14.A04 = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r11 = "nextPaymentEndTs"
            long r0 = r14.A03     // Catch:{ JSONException -> 0x01a9 }
            long r0 = r2.optLong(r11, r0)     // Catch:{ JSONException -> 0x01a9 }
            r14.A03 = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r1 = "totalRecurringTxnCount"
            int r0 = r14.A00     // Catch:{ JSONException -> 0x01a9 }
            int r0 = r2.optInt(r1, r0)     // Catch:{ JSONException -> 0x01a9 }
            r14.A00 = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r1 = "mandateAmountRule"
            java.lang.String r0 = r14.A0G     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = r2.optString(r1, r0)     // Catch:{ JSONException -> 0x01a9 }
            r14.A0G = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r12 = "moneyStringValue"
            X.6vT r1 = X.C146356vT.A00()     // Catch:{ JSONException -> 0x01a9 }
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            java.lang.String r13 = "originalAmount"
            X.6c7 r0 = r14.A09     // Catch:{ JSONException -> 0x01a9 }
            if (r0 != 0) goto L_0x0096
            r0 = 0
            goto L_0x0098
        L_0x0096:
            java.lang.Object r0 = r0.A00     // Catch:{ JSONException -> 0x01a9 }
        L_0x0098:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = r2.optString(r13, r0)     // Catch:{ JSONException -> 0x01a9 }
            X.6c7 r0 = X.C165617ti.A0P(r1, r11, r0, r12)     // Catch:{ JSONException -> 0x01a9 }
            r14.A09 = r0     // Catch:{ JSONException -> 0x01a9 }
            boolean r0 = r2.has(r3)     // Catch:{ JSONException -> 0x01a9 }
            if (r0 == 0) goto L_0x00b9
            org.json.JSONObject r1 = r2.optJSONObject(r3)     // Catch:{ JSONException -> 0x01a9 }
            X.9fK r0 = new X.9fK     // Catch:{ JSONException -> 0x01a9 }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x01a9 }
            X.9ua r0 = r0.A01()     // Catch:{ JSONException -> 0x01a9 }
            r14.A05 = r0     // Catch:{ JSONException -> 0x01a9 }
        L_0x00b9:
            X.6vT r1 = X.C146356vT.A00()     // Catch:{ JSONException -> 0x01a9 }
            X.6c7 r0 = r14.A08     // Catch:{ JSONException -> 0x01a9 }
            if (r0 != 0) goto L_0x00c3
            r0 = 0
            goto L_0x00c5
        L_0x00c3:
            java.lang.Object r0 = r0.A00     // Catch:{ JSONException -> 0x01a9 }
        L_0x00c5:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = r2.optString(r4, r0)     // Catch:{ JSONException -> 0x01a9 }
            X.6c7 r0 = X.C165617ti.A0P(r1, r11, r0, r4)     // Catch:{ JSONException -> 0x01a9 }
            r14.A08 = r0     // Catch:{ JSONException -> 0x01a9 }
            X.6vT r1 = X.C146356vT.A00()     // Catch:{ JSONException -> 0x01a9 }
            X.6c7 r0 = r14.A07     // Catch:{ JSONException -> 0x01a9 }
            if (r0 != 0) goto L_0x00db
            r0 = 0
            goto L_0x00dd
        L_0x00db:
            java.lang.Object r0 = r0.A00     // Catch:{ JSONException -> 0x01a9 }
        L_0x00dd:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = r2.optString(r5, r0)     // Catch:{ JSONException -> 0x01a9 }
            X.6c7 r0 = X.C165617ti.A0P(r1, r11, r0, r5)     // Catch:{ JSONException -> 0x01a9 }
            r14.A07 = r0     // Catch:{ JSONException -> 0x01a9 }
            X.6vT r1 = X.C146356vT.A00()     // Catch:{ JSONException -> 0x01a9 }
            X.6c7 r0 = r14.A0A     // Catch:{ JSONException -> 0x01a9 }
            if (r0 != 0) goto L_0x00f3
            r0 = 0
            goto L_0x00f5
        L_0x00f3:
            java.lang.Object r0 = r0.A00     // Catch:{ JSONException -> 0x01a9 }
        L_0x00f5:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = r2.optString(r6, r0)     // Catch:{ JSONException -> 0x01a9 }
            X.6c7 r0 = X.C165617ti.A0P(r1, r11, r0, r6)     // Catch:{ JSONException -> 0x01a9 }
            r14.A0A = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r1 = "mandateErrorCode"
            java.lang.String r0 = r14.A0H     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = r2.optString(r1, r0)     // Catch:{ JSONException -> 0x01a9 }
            r14.A0H = r0     // Catch:{ JSONException -> 0x01a9 }
            X.6vT r1 = X.C146356vT.A00()     // Catch:{ JSONException -> 0x01a9 }
            X.6c7 r0 = r14.A06     // Catch:{ JSONException -> 0x01a9 }
            if (r0 != 0) goto L_0x0115
            r0 = 0
            goto L_0x0117
        L_0x0115:
            java.lang.Object r0 = r0.A00     // Catch:{ JSONException -> 0x01a9 }
        L_0x0117:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = r2.optString(r7, r0)     // Catch:{ JSONException -> 0x01a9 }
            X.6c7 r0 = X.C165617ti.A0P(r1, r11, r0, r7)     // Catch:{ JSONException -> 0x01a9 }
            r14.A06 = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r1 = "frequencyRule"
            java.lang.String r0 = r14.A0E     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = r2.optString(r1, r0)     // Catch:{ JSONException -> 0x01a9 }
            r14.A0E = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r1 = "recurrenceRule"
            java.lang.String r0 = r14.A0K     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = r2.optString(r1, r0)     // Catch:{ JSONException -> 0x01a9 }
            r14.A0K = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r1 = "recurrenceDay"
            java.lang.String r0 = r14.A0J     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = r2.optString(r1, r0)     // Catch:{ JSONException -> 0x01a9 }
            r14.A0J = r0     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r1 = "refId"
            java.lang.String r0 = r14.A0L     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r0 = r2.optString(r1, r0)     // Catch:{ JSONException -> 0x01a9 }
            r14.A0L = r0     // Catch:{ JSONException -> 0x01a9 }
            boolean r0 = r2.has(r8)     // Catch:{ JSONException -> 0x01a9 }
            r3 = 0
            if (r0 == 0) goto L_0x015d
            java.lang.String r1 = r2.optString(r8, r3)     // Catch:{ JSONException -> 0x01a9 }
            X.9je r0 = new X.9je     // Catch:{ JSONException -> 0x01a9 }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x01a9 }
            r14.A0C = r0     // Catch:{ JSONException -> 0x01a9 }
        L_0x015d:
            boolean r0 = r2.has(r9)     // Catch:{ JSONException -> 0x01a9 }
            if (r0 == 0) goto L_0x016e
            java.lang.String r1 = r2.optString(r9, r3)     // Catch:{ JSONException -> 0x01a9 }
            X.9iz r0 = new X.9iz     // Catch:{ JSONException -> 0x01a9 }
            r0.<init>((java.lang.String) r1)     // Catch:{ JSONException -> 0x01a9 }
            r14.A0B = r0     // Catch:{ JSONException -> 0x01a9 }
        L_0x016e:
            boolean r0 = r2.has(r10)     // Catch:{ JSONException -> 0x01a9 }
            if (r0 == 0) goto L_0x01a0
            java.lang.String r0 = "[]"
            java.lang.String r0 = r2.optString(r10, r0)     // Catch:{ JSONException -> 0x01a9 }
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ JSONException -> 0x01a9 }
            r6.<init>(r0)     // Catch:{ JSONException -> 0x01a9 }
            int r5 = r6.length()     // Catch:{ JSONException -> 0x01a9 }
            if (r5 <= 0) goto L_0x01a0
            X.9e2[] r0 = new X.C198689e2[r5]     // Catch:{ JSONException -> 0x01a9 }
            r14.A0P = r0     // Catch:{ JSONException -> 0x01a9 }
            r4 = 0
        L_0x018a:
            X.9e2[] r3 = r14.A0P     // Catch:{ JSONException -> 0x01a9 }
            java.lang.Object r0 = r6.get(r4)     // Catch:{ JSONException -> 0x01a9 }
            java.lang.String r1 = r0.toString()     // Catch:{ JSONException -> 0x01a9 }
            X.9e2 r0 = new X.9e2     // Catch:{ JSONException -> 0x01a9 }
            r0.<init>((java.lang.String) r1)     // Catch:{ JSONException -> 0x01a9 }
            r3[r4] = r0     // Catch:{ JSONException -> 0x01a9 }
            int r4 = r4 + 1
            if (r4 >= r5) goto L_0x01a0
            goto L_0x018a
        L_0x01a0:
            java.lang.String r0 = "initiationMode"
            java.lang.String r0 = r2.optString(r0)     // Catch:{ JSONException -> 0x01a9 }
            r14.A0F = r0     // Catch:{ JSONException -> 0x01a9 }
            return
        L_0x01a9:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiTransactionPendingUpdateMetadata threw: "
            com.whatsapp.util.Log.w(r0, r1)
        L_0x01af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201599jw.<init>(java.lang.String):void");
    }

    public C201599jw(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, long j, long j2, boolean z, boolean z2) {
        C135086c7 r0;
        C135086c7 r02;
        C135086c7 r03;
        this.A0M = true;
        this.A0N = z;
        this.A0O = z2;
        this.A02 = j;
        this.A01 = j2;
        this.A0G = str;
        C135086c7 r3 = null;
        if (str2 != null) {
            r0 = C202349ld.A00(str2, "mandateNo");
        } else {
            r0 = null;
        }
        this.A08 = r0;
        if (str3 != null) {
            r02 = C165617ti.A0P(C146356vT.A00(), String.class, str3, "mandateName");
        } else {
            r02 = null;
        }
        this.A07 = r02;
        if (str4 != null) {
            r03 = C165617ti.A0P(C146356vT.A00(), String.class, str4, "upiPurposeCode");
        } else {
            r03 = null;
        }
        this.A0A = r03;
        this.A09 = str5 != null ? C165617ti.A0P(C146356vT.A00(), String.class, str5, "moneyStringValue") : r3;
        this.A0E = str6;
        this.A0K = str7;
        this.A0J = str8;
        this.A0L = str9;
        this.A0F = str10;
    }
}
