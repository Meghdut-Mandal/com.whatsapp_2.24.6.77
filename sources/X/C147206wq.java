package X;

/* renamed from: X.6wq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C147206wq implements AnonymousClass7hF {
    public final /* synthetic */ C22982AzY A00;
    public final /* synthetic */ C179048iy A01;
    public final /* synthetic */ Runnable A02;

    public /* synthetic */ C147206wq(C22982AzY azY, C179048iy r2, Runnable runnable) {
        this.A01 = r2;
        this.A02 = runnable;
        this.A00 = azY;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0077, code lost:
        if (r1.verify(android.util.Base64.decode(r7.A01, r6)) != false) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bf9(X.C202059ky r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            r8 = this;
            X.8iy r6 = r8.A01
            java.lang.Runnable r3 = r8.A02
            X.AzY r2 = r8.A00
            r6.Bnv()
            if (r9 != 0) goto L_0x0081
            r6.A0Z = r10
            r6.A0c = r13
            X.6vT r4 = X.C146356vT.A00()
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            java.lang.String r1 = "upiHandle"
            X.6c7 r0 = new X.6c7
            r0.<init>(r4, r5, r11, r1)
            r6.A0I = r0
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0031
            X.6vT r4 = X.C146356vT.A00()
            java.lang.String r1 = "accountHolderName"
            X.6c7 r0 = new X.6c7
            r0.<init>(r4, r5, r12, r1)
            r6.A0G = r0
        L_0x0031:
            boolean r0 = r6 instanceof com.whatsapp.payments.ui.IndiaWebViewUpiP2mHybridActivity
            if (r0 == 0) goto L_0x0079
            r5 = 0
            if (r14 == 0) goto L_0x007d
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "extra_merchant_signature_data"
            android.os.Parcelable r7 = r1.getParcelableExtra(r0)
            X.6bS r7 = (X.C134696bS) r7
            boolean r6 = X.C36371kC.A1V(r7)
            byte[] r0 = android.util.Base64.decode(r14, r6)
            java.security.spec.X509EncodedKeySpec r1 = new java.security.spec.X509EncodedKeySpec
            r1.<init>(r0)
            java.lang.String r0 = r7.A02
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0)
            java.security.PublicKey r4 = r0.generatePublic(r1)
            java.lang.String r0 = "SHA256withRSA"
            java.security.Signature r1 = java.security.Signature.getInstance(r0)
            r1.initVerify(r4)
            java.lang.String r0 = r7.A00
            byte[] r0 = X.C36351kA.A1b(r0)
            r1.update(r0)
            java.lang.String r0 = r7.A01
            byte[] r0 = android.util.Base64.decode(r0, r6)
            boolean r0 = r1.verify(r0)
            if (r0 == 0) goto L_0x007d
        L_0x0079:
            r3.run()
            return
        L_0x007d:
            r2.BWg(r5)
            return
        L_0x0081:
            r2.BWg(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C147206wq.Bf9(X.9ky, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
