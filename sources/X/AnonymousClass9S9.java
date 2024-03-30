package X;

import android.content.Context;

/* renamed from: X.9S9  reason: invalid class name */
public class AnonymousClass9S9 {
    public Context A00;
    public AnonymousClass1EU A01;
    public final C19730wQ A02;
    public final C24611Dc A03 = C165607th.A0c("PaymentMethodNotificationUtil", "notification");
    public final C19460v5 A04;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008a, code lost:
        if ((2 - r0) == 0) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
        r1 = X.C36441kJ.A0H(r7, com.whatsapp.payments.ui.BusinessHubActivity.class);
        r1.addFlags(335544320);
        r1.putExtra("extra_force_get_methods", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009e, code lost:
        return X.C65743Th.A00(r7, 0, r1, 268435456);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009f, code lost:
        r1 = X.C165577te.A0I(r7, r8, com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity.class);
        r1.addFlags(268435456);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.PendingIntent A00(android.content.Context r7, X.C207249un r8, java.lang.String r9) {
        /*
            r6 = this;
            if (r8 == 0) goto L_0x000f
            X.8bF r0 = r8.A08
            if (r0 == 0) goto L_0x000f
            int r0 = r9.hashCode()
            r5 = 1
            r4 = 0
            switch(r0) {
                case -1573204880: goto L_0x0049;
                case -945151213: goto L_0x005d;
                case -863506419: goto L_0x0067;
                case -188177059: goto L_0x0071;
                case 1084491615: goto L_0x007b;
                default: goto L_0x000f;
            }
        L_0x000f:
            r5 = 335544320(0x14000000, float:6.4623485E-27)
            r4 = 0
            X.1EU r0 = r6.A01
            X.B66 r0 = r0.A05()
            if (r8 == 0) goto L_0x002f
            java.lang.Class r0 = r0.B89()
            android.content.Intent r1 = X.C36441kJ.A0H(r7, r0)
            r1.addFlags(r5)
            java.lang.String r0 = "extra_bank_account"
            r1.putExtra(r0, r8)
        L_0x002a:
            android.app.PendingIntent r0 = X.C65743Th.A00(r7, r4, r1, r4)
            return r0
        L_0x002f:
            java.lang.Class r3 = r0.BFl()
            X.1Dc r2 = r6.A03
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "getPendingIntent for "
            r1.append(r0)
            X.C165567td.A18(r2, r9, r1)
            android.content.Intent r1 = X.C36441kJ.A0H(r7, r3)
            r1.addFlags(r5)
            goto L_0x002a
        L_0x0049:
            java.lang.String r0 = "MERCHANT_LINKED"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.0v5 r0 = r6.A04
            r0.A02()
            java.lang.String r0 = "getOrdersActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x005d:
            java.lang.String r0 = "MERCHANT_DISABLED"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000f
            r0 = 1
            goto L_0x0084
        L_0x0067:
            java.lang.String r0 = "PAYMENT_METHOD_VERIFIED"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000f
            r0 = 2
            goto L_0x0084
        L_0x0071:
            java.lang.String r0 = "MERCHANT_VERIFICATION_FAILURE"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000f
            r0 = 3
            goto L_0x0084
        L_0x007b:
            java.lang.String r0 = "MERCHANT_VERIFIED"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000f
            r0 = 4
        L_0x0084:
            r3 = 335544320(0x14000000, float:6.4623485E-27)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            int r0 = 2 - r0
            if (r0 == 0) goto L_0x009f
            java.lang.Class<com.whatsapp.payments.ui.BusinessHubActivity> r0 = com.whatsapp.payments.ui.BusinessHubActivity.class
            android.content.Intent r1 = X.C36441kJ.A0H(r7, r0)
            r1.addFlags(r3)
            java.lang.String r0 = "extra_force_get_methods"
            r1.putExtra(r0, r5)
        L_0x009a:
            android.app.PendingIntent r0 = X.C65743Th.A00(r7, r4, r1, r2)
            return r0
        L_0x009f:
            java.lang.Class<com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity> r0 = com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity.class
            android.content.Intent r1 = X.C165577te.A0I(r7, r8, r0)
            r1.addFlags(r2)
            goto L_0x009a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9S9.A00(android.content.Context, X.9un, java.lang.String):android.app.PendingIntent");
    }

    public AnonymousClass9S9(Context context, C19460v5 r4, C19730wQ r5, AnonymousClass1EU r6) {
        this.A00 = context;
        this.A01 = r6;
        this.A02 = r5;
        this.A04 = r4;
    }
}
