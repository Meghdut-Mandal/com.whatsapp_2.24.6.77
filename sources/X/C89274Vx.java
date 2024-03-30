package X;

import android.content.Context;

/* renamed from: X.4Vx  reason: invalid class name and case insensitive filesystem */
public class C89274Vx extends C429721s {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03 = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89274Vx(Context context, Context context2, C24791Du r10, AnonymousClass17Y r11, C64833Pp r12, AnonymousClass1N3 r13, C21060yb r14, String str) {
        super(context, r10, r11, r14, str);
        this.A00 = r13;
        this.A02 = r12;
        this.A01 = context2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r5) {
        /*
            r4 = this;
            int r0 = r4.A03
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r4.A02
            X.380 r0 = (X.AnonymousClass380) r0
            X.0v5 r1 = r0.A00
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x0023
            r1.A02()
            java.lang.String r0 = "showPaymentAmountDetectionBottomsheetHelper"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x001a:
            java.lang.String r3 = r4.A0A
            if (r3 != 0) goto L_0x0024
            java.lang.String r0 = "WaLinkFactory/onClick anchor url is null"
        L_0x0020:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0023:
            return
        L_0x0024:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WaLinkFactory/onClick link = "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " isEu = "
            r1.append(r0)
            java.lang.Object r2 = r4.A02
            X.3Pp r2 = (X.C64833Pp) r2
            boolean r0 = r2.A00
            r1.append(r0)
            java.lang.String r0 = " isUk = "
            r1.append(r0)
            boolean r0 = r2.A01
            X.C36331k8.A1S(r1, r0)
            java.util.Map r0 = X.AnonymousClass1N3.A05
            java.lang.String r1 = X.C36431kI.A1A(r3, r0)
            if (r1 == 0) goto L_0x00be
            java.lang.String r0 = "terms-of-service-age"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00b9
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x00ae
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r1)
            java.lang.String r0 = "-uk"
        L_0x0062:
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            android.net.Uri r3 = android.net.Uri.parse(r0)
        L_0x006a:
            java.lang.String r1 = r3.getAuthority()
            java.lang.String r0 = "whatsapp"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0096
            android.net.Uri$Builder r3 = r3.buildUpon()
            java.lang.Object r0 = r4.A00
            X.1N3 r0 = (X.AnonymousClass1N3) r0
            X.0ts r2 = r0.A03
            java.lang.String r1 = r2.A06()
            java.lang.String r0 = "lg"
            r3.appendQueryParameter(r0, r1)
            java.lang.String r1 = r2.A05()
            java.lang.String r0 = "lc"
            r3.appendQueryParameter(r0, r1)
            android.net.Uri r3 = r3.build()
        L_0x0096:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WaLinkFactory/onClick targetLink = "
            X.C36321k7.A1K(r3, r0, r1)
            java.lang.Object r0 = r4.A00
            X.1N3 r0 = (X.AnonymousClass1N3) r0
            X.1Dv r2 = r0.A00
            java.lang.Object r1 = r4.A01
            android.content.Context r1 = (android.content.Context) r1
            r0 = 0
            r2.Bp7(r1, r3, r0)
            return
        L_0x00ae:
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x00b9
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r1)
            java.lang.String r0 = "-eea"
            goto L_0x0062
        L_0x00b9:
            android.net.Uri r3 = android.net.Uri.parse(r1)
            goto L_0x006a
        L_0x00be:
            java.lang.String r0 = "WaLinkFactory/onClick target url is null"
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89274Vx.onClick(android.view.View):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89274Vx(Context context, AnonymousClass17Y r9, C32691e2 r10, AnonymousClass380 r11, C21060yb r12, AnonymousClass3T1 r13, String str) {
        super(context, r10, r9, r12, str);
        this.A00 = context;
        this.A02 = r11;
        this.A01 = r13;
    }
}
