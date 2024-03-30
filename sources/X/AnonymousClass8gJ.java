package X;

import org.json.JSONObject;

/* renamed from: X.8gJ  reason: invalid class name */
public class AnonymousClass8gJ extends AnonymousClass9I1 {
    public JSONObject A00;
    public JSONObject A01;
    public JSONObject A02;
    public JSONObject A03;
    public final AnonymousClass19A A04;
    public final C19970wo A05;
    public final C20810yC A06;

    public AnonymousClass8gJ(C19970wo r2, C20810yC r3, AnonymousClass19A r4, C202269lR r5, C29121Vk r6) {
        super(r5.A04, r6);
        this.A05 = r2;
        this.A06 = r3;
        this.A04 = r4;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00eb, code lost:
        if (r4.A03.equals(r0.A01.getString(r10)) == false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ed, code lost:
        r3 = "Matches";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ef, code lost:
        r4 = X.AnonymousClass000.A0v(r3);
        r4.append(" in salt and request params");
        X.C90504aG.A1J(r4, r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fc, code lost:
        r3 = "Mismatches";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(java.lang.String r23, java.util.List r24) {
        /*
            r22 = this;
            r0 = r22
            X.0yC r2 = r0.A06
            r1 = 635(0x27b, float:8.9E-43)
            boolean r1 = r2.A0E(r1)
            if (r1 == 0) goto L_0x0015
            r2 = r23
            int r1 = r2.hashCode()
            switch(r1) {
                case -120834421: goto L_0x0042;
                case 83413: goto L_0x0035;
                case 1282366491: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            return
        L_0x0016:
            java.lang.String r3 = "SIM_SWAP"
            boolean r1 = r2.equals(r3)
            if (r1 == 0) goto L_0x0015
            java.lang.String r5 = "event-ts"
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.lang.String r2 = "action"
            java.lang.String r1 = "upi-log-event"
            X.C36381kD.A1M(r2, r1, r4)
            java.lang.String r1 = "event-id"
            X.C36381kD.A1M(r1, r3, r4)
            long r2 = java.lang.System.currentTimeMillis()
            goto L_0x0060
        L_0x0035:
            java.lang.String r8 = "U66"
            boolean r1 = r2.equals(r8)
            if (r1 == 0) goto L_0x0015
            org.json.JSONObject r1 = r0.A01
            if (r1 == 0) goto L_0x0015
            goto L_0x008e
        L_0x0042:
            java.lang.String r3 = "SKIPPED_DEVICE_BINDING"
            boolean r1 = r2.equals(r3)
            if (r1 == 0) goto L_0x0015
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.lang.String r2 = "action"
            java.lang.String r1 = "upi-log-event"
            X.C36381kD.A1M(r2, r1, r5)
            java.lang.String r1 = "event-id"
            X.C36381kD.A1M(r1, r3, r5)
            long r3 = java.lang.System.currentTimeMillis()
            goto L_0x01ac
        L_0x0060:
            org.json.JSONObject r1 = r0.A03     // Catch:{ JSONException -> 0x006b }
            r1.put(r5, r2)     // Catch:{ JSONException -> 0x006b }
            org.json.JSONObject r1 = r0.A02     // Catch:{ JSONException -> 0x006b }
            r1.put(r5, r2)     // Catch:{ JSONException -> 0x006b }
            goto L_0x006f
        L_0x006b:
            r1 = move-exception
            r1.printStackTrace()
        L_0x006f:
            org.json.JSONObject r1 = r0.A03
            java.lang.String r2 = r1.toString()
            java.lang.String r1 = "event-info"
            X.C36381kD.A1M(r1, r2, r4)
            org.json.JSONObject r1 = r0.A02
            java.lang.String r2 = r1.toString()
            java.lang.String r1 = "event-dl-info"
            X.C36381kD.A1M(r1, r2, r4)
            X.1Vk r6 = r0.A01
            X.9nx r9 = X.C203399nx.A06(r4)
            r1 = 0
            goto L_0x01d5
        L_0x008e:
            X.19A r12 = r0.A04     // Catch:{ JSONException -> 0x01a6 }
            java.lang.String r15 = r12.A09()     // Catch:{ JSONException -> 0x01a6 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x01a6 }
            org.json.JSONObject r7 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x01a6 }
            java.lang.String r9 = "event-ts"
            r7.put(r9, r1)     // Catch:{ JSONException -> 0x01a6 }
            org.json.JSONObject r5 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x01a6 }
            java.util.Iterator r11 = r24.iterator()     // Catch:{ JSONException -> 0x01a6 }
        L_0x00a9:
            boolean r3 = r11.hasNext()     // Catch:{ JSONException -> 0x01a6 }
            if (r3 == 0) goto L_0x00ff
            java.lang.Object r4 = r11.next()     // Catch:{ JSONException -> 0x01a6 }
            X.1AL r4 = (X.AnonymousClass1AL) r4     // Catch:{ JSONException -> 0x01a6 }
            java.lang.String r6 = r4.A02     // Catch:{ JSONException -> 0x01a6 }
            int r3 = r6.hashCode()     // Catch:{ JSONException -> 0x01a6 }
            switch(r3) {
                case -1413853096: goto L_0x00d5;
                case -756180983: goto L_0x00ca;
                case 996422991: goto L_0x00bf;
                default: goto L_0x00be;
            }     // Catch:{ JSONException -> 0x01a6 }
        L_0x00be:
            goto L_0x00a9
        L_0x00bf:
            java.lang.String r3 = "sender-vpa"
            boolean r3 = r6.equals(r3)     // Catch:{ JSONException -> 0x01a6 }
            if (r3 == 0) goto L_0x00a9
            java.lang.String r10 = "payerAddr"
            goto L_0x00df
        L_0x00ca:
            java.lang.String r3 = "receiver-vpa"
            boolean r3 = r6.equals(r3)     // Catch:{ JSONException -> 0x01a6 }
            if (r3 == 0) goto L_0x00a9
            java.lang.String r10 = "payeeAddr"
            goto L_0x00df
        L_0x00d5:
            java.lang.String r3 = "amount"
            boolean r3 = r6.equals(r3)     // Catch:{ JSONException -> 0x01a6 }
            if (r3 == 0) goto L_0x00a9
            java.lang.String r10 = "txnAmount"
        L_0x00df:
            java.lang.String r4 = r4.A03     // Catch:{ JSONException -> 0x01a6 }
            org.json.JSONObject r3 = r0.A01     // Catch:{ JSONException -> 0x01a6 }
            java.lang.String r3 = r3.getString(r10)     // Catch:{ JSONException -> 0x01a6 }
            boolean r3 = r4.equals(r3)     // Catch:{ JSONException -> 0x01a6 }
            if (r3 == 0) goto L_0x00fc
            java.lang.String r3 = "Matches"
        L_0x00ef:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0v(r3)     // Catch:{ JSONException -> 0x01a6 }
            java.lang.String r3 = " in salt and request params"
            r4.append(r3)     // Catch:{ JSONException -> 0x01a6 }
            X.C90504aG.A1J(r4, r6, r5)     // Catch:{ JSONException -> 0x01a6 }
            goto L_0x00a9
        L_0x00fc:
            java.lang.String r3 = "Mismatches"
            goto L_0x00ef
        L_0x00ff:
            java.lang.String r6 = "request-params"
            org.json.JSONObject r5 = X.C90484aE.A0x(r5, r6, r7)     // Catch:{ JSONException -> 0x01a6 }
            r5.put(r9, r1)     // Catch:{ JSONException -> 0x01a6 }
            org.json.JSONObject r4 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x01a6 }
            org.json.JSONObject r1 = r0.A01     // Catch:{ JSONException -> 0x01a6 }
            java.util.Iterator r3 = r1.keys()     // Catch:{ JSONException -> 0x01a6 }
        L_0x0112:
            boolean r1 = r3.hasNext()     // Catch:{ JSONException -> 0x01a6 }
            if (r1 == 0) goto L_0x0126
            java.lang.String r2 = X.AnonymousClass001.A0C(r3)     // Catch:{ JSONException -> 0x01a6 }
            org.json.JSONObject r1 = r0.A01     // Catch:{ JSONException -> 0x01a6 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ JSONException -> 0x01a6 }
            X.C90504aG.A1J(r1, r2, r4)     // Catch:{ JSONException -> 0x01a6 }
            goto L_0x0112
        L_0x0126:
            java.lang.String r1 = "salt-params"
            org.json.JSONObject r4 = X.C90484aE.A0x(r4, r1, r5)     // Catch:{ JSONException -> 0x01a6 }
            java.util.Iterator r3 = r24.iterator()     // Catch:{ JSONException -> 0x01a6 }
        L_0x0130:
            boolean r1 = r3.hasNext()     // Catch:{ JSONException -> 0x01a6 }
            if (r1 == 0) goto L_0x0144
            java.lang.Object r1 = r3.next()     // Catch:{ JSONException -> 0x01a6 }
            X.1AL r1 = (X.AnonymousClass1AL) r1     // Catch:{ JSONException -> 0x01a6 }
            java.lang.String r2 = r1.A02     // Catch:{ JSONException -> 0x01a6 }
            java.lang.String r1 = r1.A03     // Catch:{ JSONException -> 0x01a6 }
            r4.put(r2, r1)     // Catch:{ JSONException -> 0x01a6 }
            goto L_0x0130
        L_0x0144:
            r5.put(r6, r4)     // Catch:{ JSONException -> 0x01a6 }
            java.lang.String r7 = r7.toString()     // Catch:{ JSONException -> 0x01a6 }
            java.lang.String r6 = r5.toString()     // Catch:{ JSONException -> 0x01a6 }
            X.6QB r4 = X.C36421kH.A0T()     // Catch:{ JSONException -> 0x01a6 }
            X.C165567td.A1D(r4)     // Catch:{ JSONException -> 0x01a6 }
            r5 = 0
            X.C203539oF.A0E(r4, r15)     // Catch:{ JSONException -> 0x01a6 }
            X.6QB r3 = X.C165587tf.A0a()     // Catch:{ JSONException -> 0x01a6 }
            java.lang.String r2 = "action"
            java.lang.String r1 = "upi-log-event"
            X.C36331k8.A1D(r3, r2, r1)     // Catch:{ JSONException -> 0x01a6 }
            r1 = 1
            boolean r1 = X.C203539oF.A0S(r8, r1, r5)     // Catch:{ JSONException -> 0x01a6 }
            if (r1 == 0) goto L_0x0172
            java.lang.String r1 = "event-id"
            X.C36331k8.A1D(r3, r1, r8)     // Catch:{ JSONException -> 0x01a6 }
        L_0x0172:
            r19 = 10000(0x2710, double:4.9407E-320)
            r17 = 1
            r21 = 0
            r16 = r7
            boolean r1 = X.C203539oF.A0P(r16, r17, r19, r21)     // Catch:{ JSONException -> 0x01a6 }
            if (r1 == 0) goto L_0x0185
            java.lang.String r1 = "event-info"
            X.C36331k8.A1D(r3, r1, r7)     // Catch:{ JSONException -> 0x01a6 }
        L_0x0185:
            r9 = 10000(0x2710, double:4.9407E-320)
            r7 = 1
            r11 = 0
            boolean r1 = X.C203539oF.A0P(r6, r7, r9, r11)     // Catch:{ JSONException -> 0x01a6 }
            if (r1 == 0) goto L_0x0195
            java.lang.String r1 = "event-dl-info"
            X.C36331k8.A1D(r3, r1, r6)     // Catch:{ JSONException -> 0x01a6 }
        L_0x0195:
            X.9nx r14 = X.C165567td.A0I(r3, r4)     // Catch:{ JSONException -> 0x01a6 }
            r16 = 204(0xcc, float:2.86E-43)
            X.BAZ r13 = new X.BAZ     // Catch:{ JSONException -> 0x01a6 }
            r13.<init>(r0, r5)     // Catch:{ JSONException -> 0x01a6 }
            r17 = 0
            r12.A0E(r13, r14, r15, r16, r17)     // Catch:{ JSONException -> 0x01a6 }
            return
        L_0x01a6:
            java.lang.String r0 = "PAY: IndiaUpiLogEventAction: exception while creating collecting U66 event info"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x01ac:
            org.json.JSONObject r2 = r0.A00     // Catch:{ JSONException -> 0x01b4 }
            java.lang.String r1 = "event-ts"
            r2.put(r1, r3)     // Catch:{ JSONException -> 0x01b4 }
            goto L_0x01b8
        L_0x01b4:
            r1 = move-exception
            r1.printStackTrace()
        L_0x01b8:
            org.json.JSONObject r1 = r0.A00
            java.lang.String r2 = r1.toString()
            java.lang.String r1 = "event-info"
            X.C36381kD.A1M(r1, r2, r5)
            org.json.JSONObject r1 = r0.A00
            java.lang.String r2 = r1.toString()
            java.lang.String r1 = "event-dl-info"
            X.C36381kD.A1M(r1, r2, r5)
            X.1Vk r6 = r0.A01
            X.9nx r9 = X.C203399nx.A06(r5)
            r1 = 1
        L_0x01d5:
            X.BAf r7 = new X.BAf
            r7.<init>(r0, r1)
            java.lang.String r10 = "set"
            r12 = 30000(0x7530, double:1.4822E-319)
            X.0wG r0 = r6.A03
            android.content.Context r3 = r0.A00
            X.17Y r5 = r6.A00
            X.1Vu r4 = r6.A08
            r8 = 0
            X.B7J r2 = new X.B7J
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.lang.String r11 = "w:pay"
            r7 = r6
            r8 = r2
            r7.A0I(r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8gJ.A00(java.lang.String, java.util.List):void");
    }
}
