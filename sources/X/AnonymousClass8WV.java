package X;

/* renamed from: X.8WV  reason: invalid class name */
public class AnonymousClass8WV extends C142266ob {
    public final C21117A9c A00;

    public AnonymousClass8WV(C21117A9c a9c) {
        super("wa.action.novi.EncryptLogEventV2", "bk.action.waffle.HasPaymentAccount", "bk.action.waffle.StartPaymentOnboarding", "bk.action.waffle.DeletePaymentAccount", "bk.action.waffle.EligibleToShowPaymentsRow", "bk.action.waffle.ShowPaymentSettings", "wa.action.CheckCpfCnpj", "wa.action.GetProcessedData", "wa.action.CheckCardNumber", "wa.action.CheckPinr");
        this.A00 = a9c;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        if (r4.equals("bk.action.waffle.HasPaymentAccount") == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        r1 = r2.A00;
        com.whatsapp.util.Log.i("WaBkPaymentsInterpreterExtImpl/hasPaymentAccount");
        r0 = r1.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0097, code lost:
        if (r0 == null) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0099, code lost:
        r1 = r0.A05().BK1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a1, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a2, code lost:
        if (r1 != false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a4, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ac, code lost:
        if (r4.equals("wa.action.GetProcessedData") == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b0, code lost:
        r2 = r1.A00;
        r3 = X.C36401kF.A0s(r2, 1);
        r2 = X.C142296oe.A02((java.util.Map) r2.get(0));
        r1 = (java.lang.String) r2.remove("case");
        r6 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d0, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d8, code lost:
        if ("get_card_network".equals(r1) == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00de, code lost:
        return X.C179158jJ.A0Q(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e5, code lost:
        if (r4.equals("wa.action.CheckCpfCnpj") == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e9, code lost:
        r0 = X.C201879kb.A00(X.AnonymousClass6MO.A02(r1, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f9, code lost:
        if (r4.equals("wa.action.CheckCardNumber") == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fd, code lost:
        r0 = X.C201879kb.A01(X.AnonymousClass6MO.A02(r1, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0124, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01ac, code lost:
        r1.startActivityForResult(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01af, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object B6u(X.AnonymousClass6MO r19, X.C115215iW r20, X.C124125xd r21) {
        /*
            r18 = this;
            r11 = r21
            X.4vP r11 = (X.C100674vP) r11
            r0 = r20
            java.lang.String r4 = r0.A00
            int r0 = r4.hashCode()
            r3 = -1
            r2 = r18
            r1 = r19
            switch(r0) {
                case -1123270799: goto L_0x010f;
                case -854340780: goto L_0x0107;
                case 51260781: goto L_0x00f3;
                case 268909162: goto L_0x00df;
                case 764653078: goto L_0x00a6;
                case 1643238473: goto L_0x0085;
                case 1711378359: goto L_0x007b;
                case 1819198730: goto L_0x0071;
                case 1970461926: goto L_0x004f;
                default: goto L_0x0014;
            }
        L_0x0014:
            r6 = 0
            switch(r3) {
                case 1: goto L_0x0174;
                case 2: goto L_0x00fd;
                case 3: goto L_0x00e9;
                case 4: goto L_0x00b0;
                case 5: goto L_0x008e;
                case 6: goto L_0x0019;
                case 7: goto L_0x0125;
                default: goto L_0x0018;
            }
        L_0x0018:
            return r6
        L_0x0019:
            r12 = 0
            java.util.List r0 = r1.A00
            java.lang.Object r0 = r0.get(r12)
            X.6JJ r0 = (X.AnonymousClass6JJ) r0
            X.7ku r0 = r0.A00
            X.A9c r10 = r2.A00
            X.B96 r9 = new X.B96
            r9.<init>(r0, r12)
            android.app.Activity r1 = X.C142326oh.A01(r11)
            java.lang.String r0 = "WaBkPaymentsInterpreterExtImpl/startPaymentOnboarding"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1EU r0 = r10.A07
            X.B66 r0 = r0.A05()
            android.content.Intent r2 = r0.B8C(r1)
            if (r2 == 0) goto L_0x0018
            r8 = r1
            X.155 r8 = (X.AnonymousClass155) r8
            X.B92 r7 = new X.B92
            r7.<init>(r8, r9, r10, r11, r12)
            r8.A3Z(r7)
            r0 = 1001(0x3e9, float:1.403E-42)
            goto L_0x01ac
        L_0x004f:
            java.lang.String r0 = "bk.action.waffle.EligibleToShowPaymentsRow"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0014
            X.A9c r1 = r2.A00
            java.lang.String r0 = "WaBkPaymentsInterpreterExtImpl/isEligibleToShowPaymentsRow"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1EV r0 = r1.A05
            if (r0 == 0) goto L_0x00a4
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x00a4
            X.1M4 r1 = r1.A09
            java.lang.String r0 = "BR"
            boolean r1 = r1.A05(r0)
            goto L_0x00a1
        L_0x0071:
            java.lang.String r0 = "bk.action.waffle.DeletePaymentAccount"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0014
            r3 = 7
            goto L_0x0014
        L_0x007b:
            java.lang.String r0 = "bk.action.waffle.StartPaymentOnboarding"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0014
            r3 = 6
            goto L_0x0014
        L_0x0085:
            java.lang.String r0 = "bk.action.waffle.HasPaymentAccount"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x008e
            goto L_0x0014
        L_0x008e:
            X.A9c r1 = r2.A00
            java.lang.String r0 = "WaBkPaymentsInterpreterExtImpl/hasPaymentAccount"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1EU r0 = r1.A07
            if (r0 == 0) goto L_0x00a4
            X.B66 r0 = r0.A05()
            boolean r1 = r0.BK1()
        L_0x00a1:
            r0 = 1
            if (r1 != 0) goto L_0x0120
        L_0x00a4:
            r0 = 0
            goto L_0x0120
        L_0x00a6:
            java.lang.String r0 = "wa.action.GetProcessedData"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00b0
            goto L_0x0014
        L_0x00b0:
            r0 = 0
            java.util.List r2 = r1.A00
            java.lang.Object r1 = r2.get(r0)
            java.util.Map r1 = (java.util.Map) r1
            r0 = 1
            java.lang.String r3 = X.C36401kF.A0s(r2, r0)
            java.util.HashMap r2 = X.C142296oe.A02(r1)
            java.lang.String r0 = "case"
            java.lang.Object r1 = r2.remove(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r6 = ""
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "get_card_network"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0018
            java.lang.String r6 = X.C179158jJ.A0Q(r3, r2)
            return r6
        L_0x00df:
            java.lang.String r0 = "wa.action.CheckCpfCnpj"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00e9
            goto L_0x0014
        L_0x00e9:
            r0 = 0
            java.lang.String r0 = X.AnonymousClass6MO.A02(r1, r0)
            boolean r0 = X.C201879kb.A00(r0)
            goto L_0x0120
        L_0x00f3:
            java.lang.String r0 = "wa.action.CheckCardNumber"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00fd
            goto L_0x0014
        L_0x00fd:
            r0 = 0
            java.lang.String r0 = X.AnonymousClass6MO.A02(r1, r0)
            boolean r0 = X.C201879kb.A01(r0)
            goto L_0x0120
        L_0x0107:
            java.lang.String r0 = "bk.action.waffle.ShowPaymentSettings"
            short r3 = X.C90514aH.A1B(r0, r4)
            goto L_0x0014
        L_0x010f:
            java.lang.String r0 = "wa.action.CheckPinr"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            java.lang.String r0 = X.AnonymousClass6MO.A02(r1, r0)
            boolean r0 = X.C201879kb.A02(r0)
        L_0x0120:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        L_0x0125:
            r0 = 0
            java.util.List r3 = r1.A00
            java.lang.Object r0 = r3.get(r0)
            X.6JJ r0 = (X.AnonymousClass6JJ) r0
            X.7ku r1 = r0.A00
            r0 = 1
            java.lang.Object r0 = r3.get(r0)
            X.6JJ r0 = (X.AnonymousClass6JJ) r0
            X.7ku r5 = r0.A00
            X.A9c r4 = r2.A00
            r0 = 1
            X.B96 r3 = new X.B96
            r3.<init>(r1, r0)
            r0 = 2
            X.B96 r1 = new X.B96
            r1.<init>(r5, r0)
            android.app.Activity r8 = X.C142326oh.A01(r11)
            java.lang.String r0 = "WaBkPaymentsInterpreterExtImpl/deletePaymentAccount"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.ADv r2 = new X.ADv
            r2.<init>(r1, r3, r4, r11)
            X.17Y r9 = r4.A00
            X.0wU r1 = r4.A0A
            X.1Vl r0 = r4.A08
            X.1EU r15 = r4.A07
            X.0xM r10 = r4.A01
            X.1Db r12 = r4.A03
            X.1Vk r13 = r4.A04
            X.1XA r14 = r4.A06
            X.1Vu r11 = r4.A02
            X.9XR r7 = new X.9XR
            r16 = r0
            r17 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r7.A00(r2)
            return r6
        L_0x0174:
            r3 = 0
            java.util.List r0 = r1.A00
            java.lang.Object r0 = r0.get(r3)
            X.6JJ r0 = (X.AnonymousClass6JJ) r0
            X.7ku r1 = r0.A00
            X.A9c r10 = r2.A00
            r0 = 3
            X.B96 r9 = new X.B96
            r9.<init>(r1, r0)
            android.app.Activity r1 = X.C142326oh.A01(r11)
            java.lang.String r0 = "WaBkPaymentsInterpreterExtImpl/showPaymentSettings"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1EU r0 = r10.A07
            X.B66 r0 = r0.A05()
            java.lang.Class r0 = r0.BFS()
            android.content.Intent r2 = X.C36441kJ.A0H(r1, r0)
            r8 = r1
            X.155 r8 = (X.AnonymousClass155) r8
            r12 = 1
            X.B92 r7 = new X.B92
            r7.<init>(r8, r9, r10, r11, r12)
            r8.A3Z(r7)
            r0 = 1002(0x3ea, float:1.404E-42)
        L_0x01ac:
            r1.startActivityForResult(r2, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8WV.B6u(X.6MO, X.5iW, X.5xd):java.lang.Object");
    }
}
