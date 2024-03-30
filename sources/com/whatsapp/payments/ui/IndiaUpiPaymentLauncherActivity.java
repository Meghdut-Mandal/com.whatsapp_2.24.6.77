package com.whatsapp.payments.ui;

import X.B7Z;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C173858Tk;
import X.C179128jE;
import X.C18800tq;
import X.C18830tt;
import X.C202699mR;
import X.C22827Awc;
import X.C24611Dc;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;

public class IndiaUpiPaymentLauncherActivity extends C179128jE implements C22827Awc {
    public C202699mR A00;
    public boolean A01;
    public final C24611Dc A02;

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173858Tk.A0h(A0L, r2, r1, this);
            C173858Tk.A0i(A0L, r2, r1, this, C165577te.A0f(r2));
            C173858Tk.A0q(r2, r1, this);
            C173858Tk.A0p(r2, r1, this);
            this.A00 = (C202699mR) r1.A2F.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        if (X.C36371kC.A0H(r5).getBoolean("intent_source") == false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r5 = r17
            r0 = r18
            super.onCreate(r0)
            X.1EV r1 = r5.A0O
            r0 = 0
            boolean r0 = r1.A04(r0)
            r6 = 0
            if (r0 != 0) goto L_0x001c
            X.1Dc r1 = r5.A02
            java.lang.String r0 = "payment feature is not enabled."
            r1.A0A(r0, r6)
        L_0x0018:
            r5.finish()
            return
        L_0x001c:
            android.content.Intent r0 = r5.getIntent()
            if (r0 == 0) goto L_0x0018
            android.net.Uri r0 = X.C165607th.A0H(r5)
            if (r0 == 0) goto L_0x0018
            android.net.Uri r3 = X.C165607th.A0H(r5)
            android.os.Bundle r0 = X.C36371kC.A0H(r5)
            if (r0 == 0) goto L_0x003f
            android.os.Bundle r1 = X.C36371kC.A0H(r5)
            java.lang.String r0 = "intent_source"
            boolean r0 = r1.getBoolean(r0)
            r2 = 1
            if (r0 != 0) goto L_0x0040
        L_0x003f:
            r2 = 0
        L_0x0040:
            X.1Dc r4 = r5.A02
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "received payment intent: isFromQrCode "
            java.lang.String r0 = X.C36371kC.A0z(r0, r1, r2)
            r4.A06(r0)
            if (r2 == 0) goto L_0x0095
            java.lang.String r9 = "SCANNED_QR_CODE"
            java.lang.String r10 = "payments_camera"
        L_0x0055:
            X.AE0 r14 = r5.A0M
            X.0yf r12 = r5.A06
            X.AF7 r1 = r5.A0S
            X.0yC r13 = r5.A0D
            X.9mR r0 = r5.A00
            X.AED r4 = new X.AED
            r11 = r4
            r15 = r1
            r16 = r0
            r11.<init>(r12, r13, r14, r15, r16)
            X.9o6 r8 = X.C203479o6.A00(r3, r9)
            if (r8 == 0) goto L_0x009a
            java.lang.String r1 = r3.toString()
            if (r1 == 0) goto L_0x009a
            java.lang.String r0 = "upi://mandate"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x009a
            X.0yC r1 = r5.A0D
            r0 = 2211(0x8a3, float:3.098E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x009a
            X.9mR r6 = r5.A00
            r1 = 1
            X.9n9 r0 = new X.9n9
            r0.<init>(r5, r1)
            r7 = r5
            r9 = r0
            r11 = r2
            r6.A08(r7, r8, r9, r10, r11)
            return
        L_0x0095:
            java.lang.String r9 = "DEEP_LINK"
            java.lang.String r10 = "deeplink"
            goto L_0x0055
        L_0x009a:
            if (r2 == 0) goto L_0x00b5
            X.0yC r1 = r5.A0D
            r0 = 1354(0x54a, float:1.897E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00b5
            java.lang.String r8 = r3.toString()
            X.ADn r7 = new X.ADn
            r7.<init>(r5)
            r11 = 0
            r12 = 0
            r4.A00(r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x00b5:
            java.lang.String r0 = r3.toString()
            com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment r0 = com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment.A03(r6, r0, r9, r10)
            r5.Btl(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiPaymentLauncherActivity.onCreate(android.os.Bundle):void");
    }

    public IndiaUpiPaymentLauncherActivity(int i) {
        this.A01 = false;
        B7Z.A00(this, 24);
    }

    public IndiaUpiPaymentLauncherActivity() {
        this(0);
        this.A02 = C165587tf.A0X("IndiaUpiPaymentLauncherActivity");
    }
}
