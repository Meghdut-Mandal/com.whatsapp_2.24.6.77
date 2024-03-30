package com.whatsapp.inappbugreporting.network;

import X.AnonymousClass00C;
import X.AnonymousClass19A;

public final class ReportBugProtocolHelper {
    public final AnonymousClass19A A00;

    public ReportBugProtocolHelper(AnonymousClass19A r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0238, code lost:
        if (r6.equals(r14) == false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b5, code lost:
        if (r6.length() == 0) goto L_0x00b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.util.List r35, X.C023509x r36) {
        /*
            r29 = this;
            r5 = r36
            boolean r0 = r5 instanceof X.C82433yh
            r4 = r29
            if (r0 == 0) goto L_0x029f
            r0 = r5
            X.3yh r0 = (X.C82433yh) r0
            int r3 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x029f
            int r3 = r3 - r2
            r0.label = r3
        L_0x0016:
            java.lang.Object r2 = r0.result
            X.0AO r27 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r1 = r0.label
            if (r1 == 0) goto L_0x008c
            r0 = 1
            if (r1 != r0) goto L_0x02ab
            X.AnonymousClass0AN.A00(r2)
        L_0x0024:
            X.96o r2 = (X.C1900196o) r2
            boolean r0 = r2 instanceof X.C177778eM
            if (r0 == 0) goto L_0x005d
            X.8eM r2 = (X.C177778eM) r2
            X.9nx r1 = r2.A00
            java.lang.String r0 = "task_id"
            X.9nx r0 = r1.A0c(r0)
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = "ReportBugProtocolHelper/onSuccess called with empty taskIdNode"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r1 = "onSuccess called with empty taskIdNode"
        L_0x003d:
            X.2WV r0 = new X.2WV
            r0.<init>(r1)
            return r0
        L_0x0043:
            java.lang.String r1 = r0.A0e()
            if (r1 == 0) goto L_0x0055
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0055
            X.2WW r0 = new X.2WW
            r0.<init>(r1)
            return r0
        L_0x0055:
            java.lang.String r0 = "ReportBugProtocolHelper/onSuccess called with null task id"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r1 = "onSuccess called with null task id"
            goto L_0x003d
        L_0x005d:
            boolean r0 = r2 instanceof X.C177768eL
            if (r0 == 0) goto L_0x0080
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ReportBugProtocolHelper/onError: "
            r1.append(r0)
            X.8eL r2 = (X.C177768eL) r2
            X.9nx r0 = r2.A00
            X.C36331k8.A1P(r0, r1)
            android.util.Pair r2 = X.AnonymousClass3ME.A01(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "OnError: "
            java.lang.String r1 = X.AnonymousClass000.A0l(r2, r0, r1)
            goto L_0x003d
        L_0x0080:
            boolean r0 = r2 instanceof X.C177788eN
            if (r0 == 0) goto L_0x02a6
            java.lang.String r0 = "ReportBugProtocolHelper/onDeliveryFailure: Network Failure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r1 = "onDeliveryFailure: Network Failure"
            goto L_0x003d
        L_0x008c:
            X.AnonymousClass0AN.A00(r2)
            X.19A r1 = r4.A00
            r28 = r1
            java.lang.String r26 = r28.A09()
            r2 = r33
            if (r33 != 0) goto L_0x0250
            r7 = 0
        L_0x009c:
            r2 = r30
            if (r30 == 0) goto L_0x024d
            int r1 = r2.length()
            if (r1 == 0) goto L_0x024d
            r1 = 5
            X.8uZ r4 = new X.8uZ
            r4.<init>((java.lang.String) r2, (int) r1)
        L_0x00ac:
            r6 = r34
            if (r34 == 0) goto L_0x00b7
            int r2 = r6.length()
            r1 = 0
            if (r2 != 0) goto L_0x00b8
        L_0x00b7:
            r1 = 1
        L_0x00b8:
            r3 = 0
            if (r1 != 0) goto L_0x00ee
            r1 = 0
            X.AnonymousClass00C.A0D(r6, r1)
            int r25 = r6.hashCode()
            java.lang.String r14 = "sharing"
            java.lang.String r24 = "whatsapp_ai_agents"
            java.lang.String r23 = "platforms_delivery"
            java.lang.String r22 = "channels"
            java.lang.String r21 = "new_devices"
            java.lang.String r20 = "rich_messaging"
            java.lang.String r19 = "cross_app_integrations"
            java.lang.String r18 = "whatsapp_vr"
            java.lang.String r17 = "calling"
            java.lang.String r16 = "integrity"
            java.lang.String r13 = "ui_redesign"
            java.lang.String r12 = "support_experience"
            java.lang.String r11 = "other"
            java.lang.String r15 = "infra"
            java.lang.String r10 = "business_search"
            java.lang.String r9 = "privacy"
            java.lang.String r8 = "growth_broadcast"
            java.lang.String r1 = "business"
            java.lang.String r5 = "messaging"
            java.lang.String r2 = "data_management"
            switch(r25) {
                case -2113777672: goto L_0x0194;
                case -1440008444: goto L_0x019d;
                case -1146830912: goto L_0x01a2;
                case -744327095: goto L_0x01a8;
                case -314498168: goto L_0x01ae;
                case -123573497: goto L_0x01b4;
                case 100348368: goto L_0x01ba;
                case 106069776: goto L_0x01c4;
                case 146900954: goto L_0x01cc;
                case 361719548: goto L_0x01d4;
                case 492830541: goto L_0x01dc;
                case 548640964: goto L_0x01e7;
                case 594331785: goto L_0x01f2;
                case 631882908: goto L_0x01fd;
                case 814298977: goto L_0x0208;
                case 815160638: goto L_0x0213;
                case 1432626128: goto L_0x021e;
                case 1716507379: goto L_0x0229;
                case 1777117080: goto L_0x023c;
                case 2054222044: goto L_0x0234;
                default: goto L_0x00ee;
            }
        L_0x00ee:
            boolean r1 = r35.isEmpty()
            if (r1 == 0) goto L_0x0156
            X.09w r6 = X.C023409w.A00
        L_0x00f6:
            X.6QB r5 = X.C36421kH.A0T()
            java.lang.String r2 = "xmlns"
            java.lang.String r1 = "fb:thrift_iq"
            X.C36331k8.A1D(r5, r2, r1)
            java.lang.String r8 = "smax_id"
            r1 = 105(0x69, double:5.2E-322)
            X.C36411kG.A1K(r5, r8, r1)
            X.C36341k9.A1C(r5)
            java.lang.String r2 = "type"
            java.lang.String r1 = "set"
            X.C36331k8.A1D(r5, r2, r1)
            r1 = 0
            r14 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            r10 = 0
            r12 = 0
            r16 = 0
            r11 = r26
            boolean r8 = X.C203539oF.A0P(r11, r12, r14, r16)
            if (r8 == 0) goto L_0x012b
            java.lang.String r9 = "id"
            X.C36331k8.A1D(r5, r9, r11)
        L_0x012b:
            if (r7 == 0) goto L_0x0132
            X.9nx r7 = r7.A00
            r5.A05(r7)
        L_0x0132:
            if (r4 == 0) goto L_0x0139
            X.9nx r4 = r4.A00
            r5.A05(r4)
        L_0x0139:
            if (r3 == 0) goto L_0x0140
            X.9nx r3 = r3.A00
            r5.A05(r3)
        L_0x0140:
            r3 = 10
            boolean r1 = X.C203539oF.A0Y(r6, r1, r3)
            if (r1 == 0) goto L_0x0258
            java.util.Iterator r2 = r6.iterator()
        L_0x014c:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0258
            X.C592133b.A01(r5, r2)
            goto L_0x014c
        L_0x0156:
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.util.Iterator r11 = r35.iterator()
        L_0x015e:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x00f6
            java.lang.Object r2 = r11.next()
            X.3Js r2 = (X.C63353Js) r2
            java.lang.String r10 = r2.A04
            if (r10 == 0) goto L_0x015e
            java.lang.String r9 = r2.A03
            if (r9 == 0) goto L_0x015e
            java.lang.String r8 = r2.A02
            if (r8 == 0) goto L_0x015e
            java.util.ArrayList r1 = X.C50532l4.A00
            java.lang.Integer r1 = r2.A01
            r5 = 0
            if (r1 == 0) goto L_0x0188
            int r2 = r1.intValue()
            if (r2 == 0) goto L_0x0191
            r1 = 1
            if (r2 != r1) goto L_0x0188
            java.lang.String r5 = "video"
        L_0x0188:
            X.2l4 r1 = new X.2l4
            r1.<init>(r9, r8, r10, r5)
            r6.add(r1)
            goto L_0x015e
        L_0x0191:
            java.lang.String r5 = "image"
            goto L_0x0188
        L_0x0194:
            boolean r1 = r6.equals(r2)
            if (r1 == 0) goto L_0x00ee
            r14 = r2
            goto L_0x0246
        L_0x019d:
            boolean r1 = r6.equals(r5)
            goto L_0x01bf
        L_0x01a2:
            r5 = r1
            boolean r1 = r6.equals(r1)
            goto L_0x01bf
        L_0x01a8:
            r5 = r8
            boolean r1 = r6.equals(r8)
            goto L_0x01bf
        L_0x01ae:
            r5 = r9
            boolean r1 = r6.equals(r9)
            goto L_0x01bf
        L_0x01b4:
            r5 = r10
            boolean r1 = r6.equals(r10)
            goto L_0x01bf
        L_0x01ba:
            r5 = r15
            boolean r1 = r6.equals(r15)
        L_0x01bf:
            if (r1 == 0) goto L_0x00ee
            r14 = r5
            goto L_0x0246
        L_0x01c4:
            boolean r1 = r6.equals(r11)
            if (r1 == 0) goto L_0x00ee
            r14 = r11
            goto L_0x0246
        L_0x01cc:
            boolean r1 = r6.equals(r12)
            if (r1 == 0) goto L_0x00ee
            r14 = r12
            goto L_0x0246
        L_0x01d4:
            boolean r1 = r6.equals(r13)
            if (r1 == 0) goto L_0x00ee
            r14 = r13
            goto L_0x0246
        L_0x01dc:
            r1 = r16
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x00ee
            r14 = r16
            goto L_0x0246
        L_0x01e7:
            r1 = r17
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x00ee
            r14 = r17
            goto L_0x0246
        L_0x01f2:
            r1 = r18
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x00ee
            r14 = r18
            goto L_0x0246
        L_0x01fd:
            r1 = r19
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x00ee
            r14 = r19
            goto L_0x0246
        L_0x0208:
            r1 = r20
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x00ee
            r14 = r20
            goto L_0x0246
        L_0x0213:
            r1 = r21
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x00ee
            r14 = r21
            goto L_0x0246
        L_0x021e:
            r1 = r22
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x00ee
            r14 = r22
            goto L_0x0246
        L_0x0229:
            r1 = r23
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x00ee
            r14 = r23
            goto L_0x0246
        L_0x0234:
            boolean r1 = r6.equals(r14)
            if (r1 != 0) goto L_0x0246
            goto L_0x00ee
        L_0x023c:
            r1 = r24
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x00ee
            r14 = r24
        L_0x0246:
            X.2l3 r3 = new X.2l3
            r3.<init>(r14)
            goto L_0x00ee
        L_0x024d:
            r4 = 0
            goto L_0x00ac
        L_0x0250:
            r1 = 4
            X.8uZ r7 = new X.8uZ
            r7.<init>((java.lang.String) r2, (int) r1)
            goto L_0x009c
        L_0x0258:
            java.lang.String r1 = "description"
            X.6QB r2 = X.C36441kJ.A0q(r1)
            r12 = 1
            r14 = 10000(0x2710, double:4.9407E-320)
            r3 = r31
            r11 = r3
            boolean r1 = X.C203539oF.A0P(r11, r12, r14, r16)
            if (r1 == 0) goto L_0x026e
            r2.A07(r3)
        L_0x026e:
            X.C36361kB.A1H(r2, r5)
            java.lang.String r1 = "debug_information_json"
            X.6QB r2 = X.C36441kJ.A0q(r1)
            r3 = r32
            r11 = r3
            boolean r1 = X.C203539oF.A0P(r11, r12, r14, r16)
            if (r1 == 0) goto L_0x0283
            r2.A07(r3)
        L_0x0283:
            X.C36361kB.A1H(r2, r5)
            X.9nx r4 = r5.A03()
            r1 = 1
            r0.label = r1
            r7 = 350(0x15e, float:4.9E-43)
            r8 = 32000(0x7d00, double:1.581E-319)
            r3 = r28
            r5 = r26
            r6 = r0
            java.lang.Object r2 = r3.A08(r4, r5, r6, r7, r8, r10)
            r0 = r27
            if (r2 != r0) goto L_0x0024
            return r27
        L_0x029f:
            X.3yh r0 = new X.3yh
            r0.<init>(r4, r5)
            goto L_0x0016
        L_0x02a6:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x02ab:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.inappbugreporting.network.ReportBugProtocolHelper.A00(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, X.09x):java.lang.Object");
    }
}
