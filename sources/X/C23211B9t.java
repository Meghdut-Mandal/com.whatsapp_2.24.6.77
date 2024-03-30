package X;

/* renamed from: X.B9t  reason: case insensitive filesystem */
public class C23211B9t implements C25711Hj {
    public Object A00;
    public boolean A01;
    public final int A02;

    public C23211B9t(int i, Object obj, boolean z) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        if (r0.getStickerIfSelected() == null) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r32) {
        /*
            r31 = this;
            r4 = r32
            r1 = r31
            int r0 = r1.A02
            if (r0 == 0) goto L_0x0024
            java.lang.Object r3 = r1.A00
            X.8jE r3 = (X.C179128jE) r3
            boolean r2 = r1.A01
            X.9un r4 = (X.C207249un) r4
            r3.A0B = r4
            X.8az r4 = (X.C175748az) r4
            java.lang.String r0 = r3.A0a
            android.content.Intent r1 = com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity.A0z(r3, r4, r0, r2)
            r0 = 1016(0x3f8, float:1.424E-42)
            if (r2 == 0) goto L_0x0020
            r0 = 1017(0x3f9, float:1.425E-42)
        L_0x0020:
            r3.startActivityForResult(r1, r0)
        L_0x0023:
            return
        L_0x0024:
            java.lang.Object r2 = r1.A00
            X.8hw r2 = (X.C178848hw) r2
            boolean r7 = r1.A01
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            X.8bI r0 = r2.A0O
            r0.A0I = r4
            boolean r1 = r2.A45()
            X.9lR r0 = r2.A0L
            if (r1 == 0) goto L_0x0042
            java.util.HashMap r1 = r0.A08
            if (r1 != 0) goto L_0x00b9
            java.lang.String r0 = "IndiaUpiPaymentActivity/sendToNonWhatsAppUser: CredentialBlobs is null"
        L_0x003e:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0042:
            java.util.HashMap r8 = r0.A08
            if (r8 != 0) goto L_0x0049
            java.lang.String r0 = "IndiaUpiPaymentActivity/sendToWhatsAppUser: CredentialBlobs is null"
            goto L_0x003e
        L_0x0049:
            X.5GM r3 = r2.A0V
            int r1 = r2.A00
            java.lang.String r0 = "send_p2p"
            r3.A05(r0, r1)
            X.5GM r4 = r2.A0V
            com.whatsapp.payments.ui.widget.PaymentView r0 = r2.A3i()
            if (r0 == 0) goto L_0x0061
            X.6c4 r0 = r0.getStickerIfSelected()
            r3 = 1
            if (r0 != 0) goto L_0x0062
        L_0x0061:
            r3 = 0
        L_0x0062:
            int r1 = r2.A00
            java.lang.String r0 = "is_sticker"
            r4.A08(r0, r3, r1)
            X.9un r0 = r2.A0B
            if (r0 == 0) goto L_0x0023
            X.1Dc r3 = r2.A0g
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "sending payment to: "
            r1.append(r0)
            X.11F r0 = r2.A0E
            X.C165567td.A17(r3, r0, r1)
            X.8bI r6 = r2.A0O
            X.6vT r5 = X.C146356vT.A00()
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            X.9lR r3 = r2.A0L
            r1 = 6
            java.lang.String r0 = "MPIN"
            java.lang.String r1 = r3.A06(r0, r8, r1)
            java.lang.String r0 = "pin"
            X.6c7 r0 = X.C165617ti.A0P(r5, r4, r1, r0)
            r6.A0D = r0
            X.8bI r1 = r2.A0O
            java.lang.String r0 = r2.A0U
            r1.A0U = r0
            java.lang.String r0 = r2.A0Z
            r1.A0M = r0
            X.6c7 r0 = r2.A0I
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = (java.lang.String) r0
            r1.A0O = r0
            if (r7 == 0) goto L_0x00ad
            r2.A3o(r1)
        L_0x00ad:
            X.0wU r3 = r2.A04
            r1 = 2
            X.B7V r0 = new X.B7V
            r0.<init>(r2, r1)
            X.C36331k8.A1F(r0, r3)
            return
        L_0x00b9:
            java.lang.String r0 = r2.A0X
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            X.9un r4 = r2.A0B
            X.8bF r3 = r4.A08
            X.C18740tg.A06(r3)
            X.8b6 r3 = (X.C175818b6) r3
            if (r0 != 0) goto L_0x00f1
            X.8gO r5 = r2.A0D
            java.lang.String r11 = r2.A0o
            X.16X r6 = r2.A09
            X.8bI r0 = r2.A0O
            java.lang.String r12 = r0.A0Q
            java.lang.String r13 = r0.A0R
            java.lang.String r14 = r0.A0O
            java.lang.String r15 = r0.A0P
            X.6c7 r7 = r3.A05
            java.lang.String r0 = r4.A0A
            r17 = 0
            X.8gJ r9 = r2.A07
            X.AF7 r10 = r2.A0S
            X.AES r8 = new X.AES
            r8.<init>(r2)
            r18 = r1
            r16 = r0
            r5.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x00f1:
            X.8bI r4 = r2.A0O
            java.lang.String r0 = X.C165607th.A0p(r2)
            r4.A0K = r0
            X.8bI r14 = r2.A0O
            java.lang.String r0 = r2.A0U
            r14.A0U = r0
            r13 = 0
            X.9tz r0 = r2.A0U
            if (r0 == 0) goto L_0x0106
            java.lang.String r13 = r0.A00
        L_0x0106:
            X.8gL r0 = r2.A0E
            r30 = r0
            X.6c7 r0 = r3.A05
            r29 = r0
            X.9un r0 = r2.A0B
            java.lang.String r0 = r0.A0A
            r16 = r0
            X.16X r0 = r2.A09
            r28 = r0
            X.16U r0 = r2.A05
            X.16V r0 = (X.AnonymousClass16V) r0
            java.lang.String r0 = r0.A02
            r17 = r0
            X.6c7 r15 = r2.A0G
            java.lang.String r12 = r2.A0g
            java.lang.String r11 = r2.A0Z
            java.lang.String r10 = r2.A0d
            java.lang.String r9 = r2.A0c
            java.lang.String r8 = r2.A0Y
            X.8gJ r7 = r2.A07
            boolean r27 = X.C179148jG.A1P(r2)
            java.lang.String r6 = r2.A0o
            java.lang.String r5 = r2.A0R
            X.6c7 r4 = r2.A0H
            r3 = 0
            X.9hL r0 = new X.9hL
            r0.<init>(r2, r3)
            r21 = r9
            r22 = r8
            r23 = r6
            r24 = r5
            r25 = r13
            r26 = r1
            r18 = r12
            r19 = r11
            r20 = r10
            r11 = r15
            r12 = r4
            r13 = r14
            r14 = r7
            r15 = r0
            r8 = r30
            r9 = r28
            r10 = r29
            r8.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23211B9t.accept(java.lang.Object):void");
    }
}
