package X;

import android.view.View;

/* renamed from: X.3YS  reason: invalid class name */
public class AnonymousClass3YS implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public AnonymousClass3YS(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A03 = str;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0092, code lost:
        if (r5.A04.A0E() != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0094, code lost:
        r1 = X.C36441kJ.A0H(r3, com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity.class);
        r1.putExtra("extra_setup_mode", 1);
        X.AnonymousClass3M9.A01(r1, "mandateRequest");
        r3.startActivity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00a7, code lost:
        r3 = r5.A06;
        r4 = 1;
        r5 = 104;
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00b5, code lost:
        r5.A05.A04(r3, r4, new X.C76073oH(r3, r4, r5, r6, r7), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00fe, code lost:
        r5 = java.lang.Integer.valueOf(r0);
        r7 = null;
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0104, code lost:
        r3.BOn(r4, r5, r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0107, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x008b, code lost:
        r8 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            int r0 = r9.A04
            switch(r0) {
                case 0: goto L_0x0134;
                case 1: goto L_0x0108;
                case 2: goto L_0x00e0;
                case 3: goto L_0x00c1;
                case 4: goto L_0x007b;
                case 5: goto L_0x006b;
                case 6: goto L_0x004b;
                case 7: goto L_0x0025;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r9.A00
            android.view.View r1 = (android.view.View) r1
            java.lang.String r3 = r9.A03
            java.lang.Object r2 = r9.A01
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r0 = r9.A02
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            android.app.Activity r1 = X.C36361kB.A06(r1)
            X.14u r1 = (X.C225314u) r1
            X.3Qa r0 = r0.A1J
            java.lang.String r0 = r0.A01
            com.whatsapp.SuspiciousLinkWarningDialogFragment r0 = X.C53152qr.A00(r3, r0, r2)
            r1.Btm(r0)
            return
        L_0x0025:
            java.lang.Object r3 = r9.A00
            X.8fs r3 = (X.C178398fs) r3
            java.lang.Object r2 = r9.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r9.A02
            X.9lY r0 = (X.C202319lY) r0
            java.lang.String r5 = r9.A03
            r1 = 3
            android.content.Intent r0 = com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity.A0z(r2, r0, r5, r1)
            r2.startActivity(r0)
            X.AF7 r2 = r3.A06
            r7 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r6 = 0
            r2.BOn(r3, r4, r5, r6, r7)
            return
        L_0x004b:
            java.lang.Object r3 = r9.A00
            X.8fs r3 = (X.C178398fs) r3
            java.lang.Object r2 = r9.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r9.A02
            X.9lY r1 = (X.C202319lY) r1
            java.lang.String r6 = r9.A03
            r0 = 2
            android.content.Intent r0 = com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity.A0z(r2, r1, r6, r0)
            r2.startActivity(r0)
            X.AF7 r3 = r3.A06
            java.lang.Integer r4 = X.C36361kB.A0i()
            r0 = 105(0x69, float:1.47E-43)
            goto L_0x00fe
        L_0x006b:
            java.lang.Object r5 = r9.A00
            X.8fs r5 = (X.C178398fs) r5
            java.lang.Object r3 = r9.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r4 = r9.A02
            X.9lY r4 = (X.C202319lY) r4
            java.lang.String r6 = r9.A03
            r7 = 1
            goto L_0x008b
        L_0x007b:
            java.lang.Object r5 = r9.A00
            X.8fs r5 = (X.C178398fs) r5
            java.lang.Object r3 = r9.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r4 = r9.A02
            X.9lY r4 = (X.C202319lY) r4
            java.lang.String r6 = r9.A03
            r7 = 8
        L_0x008b:
            X.1EZ r0 = r5.A04
            boolean r0 = r0.A0E()
            r8 = 1
            if (r0 != 0) goto L_0x00b5
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity> r0 = com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity.class
            android.content.Intent r1 = X.C36441kJ.A0H(r3, r0)
            java.lang.String r0 = "extra_setup_mode"
            r1.putExtra(r0, r8)
            java.lang.String r0 = "mandateRequest"
            X.AnonymousClass3M9.A01(r1, r0)
            r3.startActivity(r1)
        L_0x00a7:
            X.AF7 r3 = r5.A06
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r0 = 104(0x68, float:1.46E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r7 = 0
            goto L_0x0104
        L_0x00b5:
            X.9mK r1 = r5.A05
            X.3oH r2 = new X.3oH
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = 0
            r1.A04(r3, r4, r2, r0)
            goto L_0x00a7
        L_0x00c1:
            java.lang.Object r3 = r9.A00
            X.8fs r3 = (X.C178398fs) r3
            java.lang.Object r2 = r9.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r9.A02
            X.9lY r1 = (X.C202319lY) r1
            java.lang.String r6 = r9.A03
            r0 = 6
            android.content.Intent r0 = com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity.A0z(r2, r1, r6, r0)
            r2.startActivity(r0)
            X.AF7 r3 = r3.A06
            java.lang.Integer r4 = X.C36361kB.A0i()
            r0 = 118(0x76, float:1.65E-43)
            goto L_0x00fe
        L_0x00e0:
            java.lang.Object r3 = r9.A00
            X.8fs r3 = (X.C178398fs) r3
            java.lang.Object r2 = r9.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r9.A02
            X.9lY r1 = (X.C202319lY) r1
            java.lang.String r6 = r9.A03
            r0 = 5
            android.content.Intent r0 = com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity.A0z(r2, r1, r6, r0)
            r2.startActivity(r0)
            X.AF7 r3 = r3.A06
            java.lang.Integer r4 = X.C36361kB.A0i()
            r0 = 117(0x75, float:1.64E-43)
        L_0x00fe:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r7 = 0
            r8 = 1
        L_0x0104:
            r3.BOn(r4, r5, r6, r7, r8)
            return
        L_0x0108:
            java.lang.Object r0 = r9.A00
            android.app.Dialog r0 = (android.app.Dialog) r0
            java.lang.String r2 = r9.A03
            java.lang.Object r4 = r9.A01
            X.2KO r4 = (X.AnonymousClass2KO) r4
            java.lang.Object r3 = r9.A02
            android.content.Context r3 = (android.content.Context) r3
            r0.dismiss()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "package:"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)
            android.net.Uri r2 = android.net.Uri.parse(r0)
            java.lang.String r0 = "android.settings.REQUEST_SCHEDULE_EXACT_ALARM"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0, r2)
            X.1Dv r0 = r4.A04
            r0.A06(r3, r1)
            return
        L_0x0134:
            java.lang.Object r4 = r9.A00
            X.1Dv r4 = (X.C24801Dv) r4
            java.lang.Object r2 = r9.A01
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r3 = r9.A02
            X.0xT r3 = (X.C20380xT) r3
            java.lang.String r1 = r9.A03
            java.util.List r0 = X.AnonymousClass0D3.A0I
            android.content.Context r2 = r2.getContext()
            android.net.Uri r1 = r3.A03(r1)
            r0 = 0
            r4.Bp7(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3YS.onClick(android.view.View):void");
    }
}
