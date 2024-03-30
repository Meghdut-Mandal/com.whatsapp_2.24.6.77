package X;

import android.widget.CompoundButton;

/* renamed from: X.4XA  reason: invalid class name */
public class AnonymousClass4XA implements CompoundButton.OnCheckedChangeListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4XA(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (((X.C74173lB) r0.get()).A04() != X.C52472pU.NONE) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCheckedChanged(android.widget.CompoundButton r9, boolean r10) {
        /*
            r8 = this;
            int r0 = r8.A02
            switch(r0) {
                case 0: goto L_0x00b1;
                case 1: goto L_0x00c9;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r5 = r8.A00
            com.whatsapp.report.ReportActivity r5 = (com.whatsapp.report.ReportActivity) r5
            java.lang.Object r4 = r8.A01
            X.2o7 r4 = (X.C51622o7) r4
            X.2o7 r2 = X.C51622o7.ACCOUNT
            if (r4 != r2) goto L_0x00a5
            android.content.SharedPreferences r1 = X.C36331k8.A06(r5)
            java.lang.String r0 = "automatic_account_report_enabled"
        L_0x0017:
            r6 = 0
            boolean r0 = r1.getBoolean(r0, r6)
            if (r0 == r10) goto L_0x007b
            if (r10 == 0) goto L_0x008d
            if (r4 != r2) goto L_0x007f
            X.005 r0 = r5.A0H
        L_0x0024:
            java.lang.Object r0 = r0.get()
            X.3lB r0 = (X.C74173lB) r0
            X.2pU r1 = r0.A04()
            X.2pU r0 = X.C52472pU.NONE
            if (r1 == r0) goto L_0x0086
        L_0x0032:
            X.3Gx r7 = r5.A07
            X.0yC r1 = r7.A02
            r0 = 7222(0x1c36, float:1.012E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0055
            int r3 = r4.ordinal()
            r2 = 1
            X.0v0 r0 = r7.A01
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            if (r3 == r2) goto L_0x007c
            java.lang.String r0 = "automatic_channel_report_enabled"
        L_0x004d:
            X.C36331k8.A0w(r1, r0, r2)
            if (r6 == 0) goto L_0x0055
            r7.A00(r4)
        L_0x0055:
            X.005 r0 = r5.A0G
            java.lang.Object r3 = r0.get()
            X.32q r3 = (X.C591032q) r3
            X.2O3 r2 = new X.2O3
            r2.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r2.A00 = r0
            int r1 = r4.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0070
            r0 = 2
        L_0x0070:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A01 = r0
            X.0yW r0 = r3.A00
            r0.Bly(r2)
        L_0x007b:
            return
        L_0x007c:
            java.lang.String r0 = "automatic_account_report_enabled"
            goto L_0x004d
        L_0x007f:
            X.2o7 r0 = X.C51622o7.NEWSLETTER
            if (r4 != r0) goto L_0x0086
            X.005 r0 = r5.A0I
            goto L_0x0024
        L_0x0086:
            boolean r0 = com.whatsapp.report.ReportActivity.A0G(r4, r5)
            r6 = r0 ^ 1
            goto L_0x0032
        L_0x008d:
            X.3Gx r0 = r5.A07
            int r3 = r4.ordinal()
            r2 = 1
            X.0v0 r0 = r0.A01
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            if (r3 == r2) goto L_0x00a2
            java.lang.String r0 = "automatic_channel_report_enabled"
        L_0x009e:
            X.C36331k8.A0w(r1, r0, r6)
            goto L_0x0055
        L_0x00a2:
            java.lang.String r0 = "automatic_account_report_enabled"
            goto L_0x009e
        L_0x00a5:
            X.2o7 r0 = X.C51622o7.NEWSLETTER
            if (r4 != r0) goto L_0x007b
            android.content.SharedPreferences r1 = X.C36331k8.A06(r5)
            java.lang.String r0 = "automatic_channel_report_enabled"
            goto L_0x0017
        L_0x00b1:
            java.lang.Object r2 = r8.A00
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            java.lang.Object r3 = r8.A01
            X.01z r3 = (X.AnonymousClass01z) r3
            X.1NU r1 = r2.A0U
            X.141 r0 = r2.A0z
            com.whatsapp.jid.UserJid r4 = X.C36351kA.A0k(r0)
            r6 = r10 ^ 1
            java.lang.String r5 = "profile_view"
            r1.A00(r2, r3, r4, r5, r6)
            return
        L_0x00c9:
            java.util.List r0 = X.AnonymousClass0D3.A0I
            java.lang.String r1 = "isChecked"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XA.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
