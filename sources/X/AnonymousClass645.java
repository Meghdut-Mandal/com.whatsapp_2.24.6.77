package X;

/* renamed from: X.645  reason: invalid class name */
public class AnonymousClass645 {
    public final C19630wG A00;
    public final C122715vJ A01;
    public final C123395wQ A02;
    public final C119935qh A03;
    public final AnonymousClass6VG A04;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:22|23|24|25|26|(1:28)) */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03d0, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03d1, code lost:
        com.whatsapp.util.Log.e("PAY: DefaultTrustTokenBuilder/constructInputForSigning", r1);
        r0 = new X.AnonymousClass5VA(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03e9, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:?, code lost:
        com.whatsapp.util.Log.w("PAY: DefaultTrustTokenBuilder/signWith", r1);
        r0 = new X.AnonymousClass5VA(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0414, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0415, code lost:
        com.whatsapp.util.Log.e("PAY: MFAFactors/registerTD/", r1);
        r2.BWi(new X.C130696Mb(6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0423, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        com.whatsapp.util.Log.e("PAY: Secp256r1KeyStoreHelper/deleteKeyPair failed");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03dc A[Catch:{ 5Uj | NoSuchAlgorithmException -> 0x03e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03e9 A[ExcHandler: 5Uj | NoSuchAlgorithmException (r1v14 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:90:0x0227] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0414 A[ExcHandler: 5VA | NoSuchAlgorithmException | JSONException (r1v2 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:73:0x013b] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005f A[Catch:{ KeyStoreException -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b6 A[Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }, LOOP:0: B:75:0x01b0->B:77:0x01b6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01cc A[Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0204 A[Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0221 A[Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x023a A[Catch:{ 5Uj | NoSuchAlgorithmException -> 0x03e9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C159617je r23, boolean r24) {
        /*
            r22 = this;
            r4 = r22
            X.5qh r3 = r4.A03
            r5 = 0
            r2 = r23
            X.1Db r0 = r3.A00     // Catch:{ JSONException -> 0x002f }
            java.lang.String r1 = r0.A06()     // Catch:{ JSONException -> 0x002f }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x002f }
            if (r0 != 0) goto L_0x0035
            org.json.JSONObject r1 = X.C36441kJ.A1C(r1)     // Catch:{ JSONException -> 0x002f }
            java.lang.String r0 = "td"
            org.json.JSONObject r1 = r1.optJSONObject(r0)     // Catch:{ JSONException -> 0x002f }
            if (r1 == 0) goto L_0x0035
            java.lang.String r0 = "td_is_committed"
            boolean r0 = r1.optBoolean(r0, r5)     // Catch:{ JSONException -> 0x002f }
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = X.C36441kJ.A11()
            r2.onResult(r0)
            return
        L_0x002f:
            r1 = move-exception
            java.lang.String r0 = "PAY: TrustedDeviceKeyStore isCommitted failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0035:
            if (r24 == 0) goto L_0x00d4
            X.61A r0 = r3.A01     // Catch:{ InvalidAlgorithmParameterException -> 0x0401 }
            java.lang.String r7 = "alias-payments-br-trusted-device-key"
            X.77V r0 = r0.A00     // Catch:{ InvalidAlgorithmParameterException -> 0x0401 }
            java.lang.Object r0 = r0.get()     // Catch:{ InvalidAlgorithmParameterException -> 0x0401 }
            X.626 r0 = (X.AnonymousClass626) r0     // Catch:{ InvalidAlgorithmParameterException -> 0x0401 }
            if (r0 == 0) goto L_0x007f
            r6 = 0
            java.security.KeyStore r5 = r0.A00     // Catch:{ Exception -> 0x007a }
            java.security.cert.Certificate r1 = r5.getCertificate(r7)     // Catch:{ Exception -> 0x007a }
            if (r1 == 0) goto L_0x007f
            boolean r0 = r1 instanceof java.security.cert.X509Certificate     // Catch:{ Exception -> 0x007a }
            if (r0 == 0) goto L_0x0069
            r0 = r1
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0     // Catch:{ Exception -> 0x007a }
            r0.checkValidity()     // Catch:{ CertificateExpiredException | CertificateNotYetValidException -> 0x0059 }
            goto L_0x0069
        L_0x0059:
            boolean r0 = r5.containsAlias(r7)     // Catch:{ KeyStoreException -> 0x0063 }
            if (r0 == 0) goto L_0x007f
            r5.deleteEntry(r7)     // Catch:{ KeyStoreException -> 0x0063 }
            goto L_0x007f
        L_0x0063:
            java.lang.String r0 = "PAY: Secp256r1KeyStoreHelper/deleteKeyPair failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x007a }
            goto L_0x007f
        L_0x0069:
            java.security.PublicKey r1 = r1.getPublicKey()     // Catch:{ Exception -> 0x007a }
            java.security.Key r0 = r5.getKey(r7, r6)     // Catch:{ Exception -> 0x007a }
            java.security.PrivateKey r0 = (java.security.PrivateKey) r0     // Catch:{ Exception -> 0x007a }
            java.security.KeyPair r8 = new java.security.KeyPair     // Catch:{ Exception -> 0x007a }
            r8.<init>(r1, r0)     // Catch:{ Exception -> 0x007a }
            goto L_0x013b
        L_0x007a:
            java.lang.String r0 = "PAY: Secp256r1KeyStoreHelper/retrieveKeyPair failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InvalidAlgorithmParameterException -> 0x0401 }
        L_0x007f:
            X.1Db r0 = r3.A00     // Catch:{ JSONException -> 0x00ce }
            java.lang.String r1 = r0.A06()     // Catch:{ JSONException -> 0x00ce }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x00ce }
            if (r0 != 0) goto L_0x00d4
            org.json.JSONObject r1 = X.C36441kJ.A1C(r1)     // Catch:{ JSONException -> 0x00ce }
            java.lang.String r0 = "td"
            org.json.JSONObject r6 = r1.optJSONObject(r0)     // Catch:{ JSONException -> 0x00ce }
            if (r6 == 0) goto L_0x00d4
            java.lang.String r0 = "td_public_key_bytes"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ JSONException -> 0x00ce }
            r1 = 11
            byte[] r5 = android.util.Base64.decode(r0, r1)     // Catch:{ JSONException -> 0x00ce }
            java.lang.String r0 = "td_private_key_bytes"
            byte[] r0 = X.C90514aH.A1b(r0, r6, r1)     // Catch:{ JSONException -> 0x00ce }
            java.lang.String r6 = "PAY: TrustedDeviceKeyStore recreateKeyPair failed"
            java.security.spec.X509EncodedKeySpec r1 = new java.security.spec.X509EncodedKeySpec     // Catch:{ JSONException -> 0x00ce }
            r1.<init>(r5)     // Catch:{ JSONException -> 0x00ce }
            java.security.spec.PKCS8EncodedKeySpec r5 = new java.security.spec.PKCS8EncodedKeySpec     // Catch:{ JSONException -> 0x00ce }
            r5.<init>(r0)     // Catch:{ JSONException -> 0x00ce }
            java.lang.String r0 = "EC"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x00c9 }
            java.security.PublicKey r1 = r0.generatePublic(r1)     // Catch:{  }
            java.security.PrivateKey r0 = r0.generatePrivate(r5)     // Catch:{  }
            java.security.KeyPair r8 = new java.security.KeyPair     // Catch:{  }
            r8.<init>(r1, r0)     // Catch:{  }
            goto L_0x013b
        L_0x00c9:
            r0 = move-exception
            com.whatsapp.util.Log.w(r6, r0)     // Catch:{ JSONException -> 0x00ce }
            goto L_0x00d4
        L_0x00ce:
            r1 = move-exception
            java.lang.String r0 = "PAY: TrustedDeviceKeyStore retrieveKeyPair failed"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ InvalidAlgorithmParameterException -> 0x0401 }
        L_0x00d4:
            X.61A r0 = r3.A01     // Catch:{ InvalidAlgorithmParameterException -> 0x0401 }
            X.00I r0 = r0.A00()     // Catch:{ InvalidAlgorithmParameterException -> 0x0401 }
            java.lang.Object r8 = r0.A00     // Catch:{ InvalidAlgorithmParameterException -> 0x0401 }
            if (r8 == 0) goto L_0x0409
            java.lang.Object r0 = r0.A01     // Catch:{ InvalidAlgorithmParameterException -> 0x0401 }
            X.C18740tg.A06(r0)     // Catch:{ InvalidAlgorithmParameterException -> 0x0401 }
            boolean r0 = X.AnonymousClass000.A1X(r0)     // Catch:{ InvalidAlgorithmParameterException -> 0x0401 }
            if (r0 != 0) goto L_0x0135
            r10 = r8
            java.security.KeyPair r10 = (java.security.KeyPair) r10     // Catch:{ InvalidAlgorithmParameterException -> 0x0401 }
            java.lang.String r9 = "td"
            X.1Db r7 = r3.A00     // Catch:{ JSONException -> 0x012e }
            java.lang.String r1 = r7.A06()     // Catch:{ JSONException -> 0x012e }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x012e }
            if (r0 != 0) goto L_0x0135
            org.json.JSONObject r6 = X.C36441kJ.A1C(r1)     // Catch:{ JSONException -> 0x012e }
            org.json.JSONObject r5 = X.C90474aD.A0t(r9, r6)     // Catch:{ JSONException -> 0x012e }
            java.lang.String r1 = "td_public_key_bytes"
            java.security.PublicKey r0 = r10.getPublic()     // Catch:{ JSONException -> 0x012e }
            byte[] r0 = r0.getEncoded()     // Catch:{ JSONException -> 0x012e }
            r3 = 11
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r3)     // Catch:{ JSONException -> 0x012e }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x012e }
            java.lang.String r1 = "td_private_key_bytes"
            java.security.PrivateKey r0 = r10.getPrivate()     // Catch:{ JSONException -> 0x012e }
            byte[] r0 = r0.getEncoded()     // Catch:{ JSONException -> 0x012e }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r3)     // Catch:{ JSONException -> 0x012e }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x012e }
            java.lang.String r0 = X.C90484aE.A0l(r5, r9, r6)     // Catch:{ JSONException -> 0x012e }
            r7.A0K(r0)     // Catch:{ JSONException -> 0x012e }
            goto L_0x0135
        L_0x012e:
            r1 = move-exception
            java.lang.String r0 = "PAY: TrustedDeviceKeyStore store failed"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ InvalidAlgorithmParameterException -> 0x0401 }
            throw r1     // Catch:{ InvalidAlgorithmParameterException -> 0x0401 }
        L_0x0135:
            java.security.KeyPair r8 = (java.security.KeyPair) r8     // Catch:{ InvalidAlgorithmParameterException -> 0x0401 }
            if (r8 != 0) goto L_0x013b
            goto L_0x0409
        L_0x013b:
            X.5vJ r7 = r4.A01     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            X.0wG r0 = r4.A00     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            android.content.Context r11 = r0.A00     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            java.security.PublicKey r0 = r8.getPublic()     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            byte[] r0 = r0.getEncoded()     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            java.lang.String r5 = X.C36441kJ.A13(r0)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            X.C36321k7.A0w(r11, r5)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            java.lang.String r3 = "auth_ticket_type"
            java.lang.String r1 = "TRUSTED_DEVICE"
            X.5qg r0 = new X.5qg     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            r0.<init>(r3, r1)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            r10.add(r0)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            java.lang.String r1 = "public_key"
            X.5qg r0 = new X.5qg     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            r0.<init>(r1, r5)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            r10.add(r0)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            X.17Y r6 = r7.A00     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            X.0wD r5 = r7.A01     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            X.1Vu r1 = r7.A02     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            X.1Vk r0 = r7.A03     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            X.09w r19 = X.C023409w.A00     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            java.lang.String r3 = "CREATE_AUTH_TICKET_BASED_FACTOR"
            java.lang.String r9 = "mfa-create-auth-ticket-based-factor"
            X.5xt r7 = new X.5xt     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            r12 = r7
            r13 = r11
            r14 = r6
            r15 = r5
            r16 = r1
            r17 = r0
            r18 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            X.5wQ r6 = r4.A02     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            org.json.JSONObject r5 = X.C36441kJ.A1B()     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            java.lang.String r1 = "ver"
            r0 = 1
            r5.put(r1, r0)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            java.lang.String r0 = "op"
            r5.put(r0, r3)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            X.0wo r1 = r6.A01     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            X.0wQ r0 = r6.A00     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            java.lang.String r1 = X.C237919w.A00(r0, r1)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            java.lang.String r0 = "nonce"
            org.json.JSONObject r10 = X.C90484aE.A0x(r1, r0, r5)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            org.json.JSONObject r3 = X.C36441kJ.A1B()     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            java.util.List r0 = r7.A05     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
        L_0x01b0:
            boolean r0 = r11.hasNext()     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            if (r0 == 0) goto L_0x01c4
            java.lang.Object r0 = r11.next()     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            X.5qg r0 = (X.C119925qg) r0     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            java.lang.String r1 = r0.A00     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            java.lang.String r0 = r0.A01     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            r10.put(r1, r0)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            goto L_0x01b0
        L_0x01c4:
            java.util.List r1 = r7.A06     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            boolean r0 = r1.isEmpty()     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            if (r0 != 0) goto L_0x01e7
            org.json.JSONArray r11 = X.C90524aI.A0u()     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
        L_0x01d4:
            boolean r0 = r1.hasNext()     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            if (r0 == 0) goto L_0x01e2
            java.lang.Object r0 = r1.next()     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            r11.put(r0)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            goto L_0x01d4
        L_0x01e2:
            java.lang.String r0 = "caps"
            r10.put(r0, r11)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
        L_0x01e7:
            java.lang.String r1 = "com.whatsapp"
            java.lang.String r0 = "app_id"
            r10.put(r0, r1)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            X.1Vl r0 = r6.A03     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            java.lang.String r1 = r0.A01()     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            java.lang.String r0 = "device_id"
            r10.put(r0, r1)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            java.lang.String r0 = "data"
            r5.put(r0, r10)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            int r0 = r3.length()     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            if (r0 <= 0) goto L_0x0221
            r1 = 0
            java.lang.String r0 = "server key was never set, its null"
            X.C18740tg.A07(r1, r0)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            X.00b r1 = r6.A04     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            X.61A r0 = r6.A02     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            X.5Fl r10 = new X.5Fl     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            r10.<init>(r0, r1, r5, r3)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
        L_0x0213:
            r0 = 1
            java.security.PublicKey[] r1 = new java.security.PublicKey[r0]     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            r15 = 0
            java.security.PublicKey r0 = r8.getPublic()     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            r1[r15] = r0     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            r10.A00(r1)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            goto L_0x0227
        L_0x0221:
            X.5Fk r10 = new X.5Fk     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            r10.<init>(r5)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            goto L_0x0213
        L_0x0227:
            java.util.List r1 = r10.A00     // Catch:{ 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            X.C18740tg.A06(r1)     // Catch:{ 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            java.security.PublicKey r0 = r8.getPublic()     // Catch:{ 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            java.lang.String r0 = X.AnonymousClass6HB.A00(r0)     // Catch:{ 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            boolean r0 = r1.contains(r0)     // Catch:{ 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            if (r0 == 0) goto L_0x03dc
            java.security.PublicKey r0 = r8.getPublic()     // Catch:{ 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            java.lang.String r13 = r10.A01()     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d0, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            X.C18740tg.A06(r13)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d0, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            org.json.JSONObject r1 = X.C36441kJ.A1B()     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d0, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            java.lang.String r12 = "alg"
            java.lang.String r11 = "ES256"
            r1.put(r12, r11)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d0, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            java.lang.String r0 = X.AnonymousClass6HB.A00(r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d0, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            java.lang.String r5 = "kid"
            java.lang.String r0 = X.C90484aE.A0l(r0, r5, r1)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d0, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            java.lang.String r6 = X.C19430v1.A0B     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d0, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            byte[] r0 = r0.getBytes(r6)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d0, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            java.lang.String r3 = X.C90504aG.A0o(r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d0, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            java.lang.String r1 = "."
            java.lang.String[] r0 = X.C36441kJ.A1S()     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d0, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            X.C90494aF.A1H(r3, r13, r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d0, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            java.lang.String r0 = android.text.TextUtils.join(r1, r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d0, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            byte[] r3 = r0.getBytes(r6)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03d0, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            java.lang.String r0 = "SHA256withECDSA"
            java.security.Signature r1 = java.security.Signature.getInstance(r0)     // Catch:{ Exception -> 0x03e3, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            java.security.PrivateKey r0 = r8.getPrivate()     // Catch:{ Exception -> 0x03e3, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            r1.initSign(r0)     // Catch:{ Exception -> 0x03e3, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            r1.update(r3)     // Catch:{ Exception -> 0x03e3, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            byte[] r14 = r1.sign()     // Catch:{ Exception -> 0x03e3, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            if (r14 == 0) goto L_0x03e3
            java.security.PublicKey r21 = r8.getPublic()     // Catch:{ 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            java.util.List r1 = r10.A00     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            X.C18740tg.A06(r1)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            java.lang.String r0 = X.AnonymousClass6HB.A00(r21)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            boolean r0 = r1.contains(r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            if (r0 == 0) goto L_0x03b8
            int r0 = r14.length     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            java.lang.String r20 = "Invalid ECDSA signature format"
            r1 = 8
            if (r0 < r1) goto L_0x03b3
            byte r3 = r14[r15]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            r1 = 48
            if (r3 != r1) goto L_0x03b3
            r1 = 1
            byte r8 = r14[r1]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            r1 = 2
            if (r8 <= 0) goto L_0x02b4
            r19 = 2
            goto L_0x02ba
        L_0x02b4:
            r3 = -127(0xffffffffffffff81, float:NaN)
            if (r8 != r3) goto L_0x03ae
            r19 = 3
        L_0x02ba:
            int r3 = r19 + 1
            byte r18 = r14[r3]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            r15 = r18
        L_0x02c0:
            if (r15 <= 0) goto L_0x02ce
            int r3 = r19 + 2
            int r3 = r3 + r18
            int r3 = r3 - r15
            byte r3 = r14[r3]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            if (r3 != 0) goto L_0x02ce
            int r15 = r15 + -1
            goto L_0x02c0
        L_0x02ce:
            int r17 = r19 + 2
            int r17 = r17 + r18
            int r3 = r17 + 1
            byte r16 = r14[r3]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            r13 = r16
        L_0x02d8:
            if (r13 <= 0) goto L_0x02e6
            int r3 = r17 + 2
            int r3 = r3 + r16
            int r3 = r3 - r13
            byte r3 = r14[r3]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            if (r3 != 0) goto L_0x02e6
            int r13 = r13 + -1
            goto L_0x02d8
        L_0x02e6:
            int r8 = java.lang.Math.max(r15, r13)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            r3 = 32
            int r8 = java.lang.Math.max(r8, r3)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            int r3 = r19 + -1
            byte r3 = r14[r3]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r0 = r0 - r19
            if (r3 != r0) goto L_0x03bf
            int r0 = r18 + 2
            int r0 = r0 + 2
            int r0 = r0 + r16
            if (r3 != r0) goto L_0x03bf
            byte r0 = r14[r19]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            if (r0 != r1) goto L_0x03bf
            byte r0 = r14[r17]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            if (r0 != r1) goto L_0x03bf
            int r3 = r8 * 2
            byte[] r1 = new byte[r3]     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            int r0 = r17 - r15
            int r8 = r8 - r15
            java.lang.System.arraycopy(r14, r0, r1, r8, r15)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            int r0 = r17 + 2
            int r0 = r0 + r16
            int r0 = r0 - r13
            int r3 = r3 - r13
            java.lang.System.arraycopy(r14, r0, r1, r3, r13)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            java.lang.String r1 = X.C90504aG.A0o(r1)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            org.json.JSONObject r8 = X.C36441kJ.A1B()     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            java.lang.String r0 = "signature"
            r8.put(r0, r1)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            java.lang.String r3 = "protected"
            org.json.JSONObject r1 = X.C36441kJ.A1B()     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            r1.put(r12, r11)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            java.lang.String r0 = X.AnonymousClass6HB.A00(r21)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            java.lang.String r0 = X.C90484aE.A0l(r0, r5, r1)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            byte[] r0 = r0.getBytes(r6)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            java.lang.String r0 = X.C90504aG.A0o(r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            r8.put(r3, r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            org.json.JSONArray r5 = r10.A01     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            r5.put(r8)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            java.lang.String r3 = r10.A01()     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f5 }
            X.C18740tg.A06(r3)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f5 }
            org.json.JSONObject r1 = X.C36441kJ.A1B()     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f5 }
            java.lang.String r0 = "payload"
            r1.put(r0, r3)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f5 }
            java.lang.String r0 = "signatures"
            java.lang.String r0 = X.C90484aE.A0l(r5, r0, r1)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f5 }
            byte[] r0 = r0.getBytes(r6)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f5 }
            java.lang.String r3 = X.C90504aG.A0o(r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03f5 }
            java.lang.String r1 = "trust-token"
            r0 = 0
            X.9nx r5 = new X.9nx     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            r5.<init>((java.lang.String) r1, (java.lang.String) r3, (X.AnonymousClass1AL[]) r0)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            X.5qf r8 = new X.5qf     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            r8.<init>(r2, r4)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            X.1Vk r6 = r7.A04     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            r4 = 0
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            java.lang.String r0 = "action"
            X.C36381kD.A1M(r0, r9, r1)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            X.1AL[] r0 = new X.AnonymousClass1AL[r4]     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            java.lang.Object[] r3 = r1.toArray(r0)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            X.1AL[] r3 = (X.AnonymousClass1AL[]) r3     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            r0 = 1
            X.9nx[] r1 = new X.C203399nx[r0]     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            r1[r4] = r5     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            java.lang.String r0 = "account"
            X.9nx r5 = new X.9nx     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            r5.<init>((java.lang.String) r0, (X.AnonymousClass1AL[]) r3, (X.C203399nx[]) r1)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            android.content.Context r4 = r7.A00     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            X.17Y r3 = r7.A01     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            X.1Vu r0 = r7.A03     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            r15 = 1
            X.7pJ r1 = new X.7pJ     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            r9 = r1
            r10 = r4
            r11 = r0
            r12 = r3
            r13 = r7
            r14 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            java.lang.String r0 = "set"
            r6.A0F(r1, r5, r0)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            return
        L_0x03ae:
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r20)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            goto L_0x03c3
        L_0x03b3:
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r20)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            goto L_0x03c3
        L_0x03b8:
            java.lang.String r0 = "cannot sign with public key that has not been declared"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            goto L_0x03c3
        L_0x03bf:
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r20)     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
        L_0x03c3:
            throw r0     // Catch:{ UnsupportedEncodingException | NoSuchAlgorithmException | JSONException -> 0x03c4, 5Uj | NoSuchAlgorithmException -> 0x03e9 }
        L_0x03c4:
            r1 = move-exception
            java.lang.String r0 = "PAY: DefaultTrustTokenBuilder/addSignature"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            X.5VA r0 = new X.5VA     // Catch:{ 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            r0.<init>(r1)     // Catch:{ 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            goto L_0x03e8
        L_0x03d0:
            r1 = move-exception
            java.lang.String r0 = "PAY: DefaultTrustTokenBuilder/constructInputForSigning"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            X.5VA r0 = new X.5VA     // Catch:{ 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            r0.<init>(r1)     // Catch:{ 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            goto L_0x03e8
        L_0x03dc:
            java.lang.String r0 = "cannot sign with public key that has not been declared"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            goto L_0x03e8
        L_0x03e3:
            X.5Uj r0 = new X.5Uj     // Catch:{ 5Uj | NoSuchAlgorithmException -> 0x03e9 }
            r0.<init>()     // Catch:{ 5Uj | NoSuchAlgorithmException -> 0x03e9 }
        L_0x03e8:
            throw r0     // Catch:{ 5Uj | NoSuchAlgorithmException -> 0x03e9 }
        L_0x03e9:
            r1 = move-exception
            java.lang.String r0 = "PAY: DefaultTrustTokenBuilder/signWith"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            X.5VA r0 = new X.5VA     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            r0.<init>(r1)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            goto L_0x0400
        L_0x03f5:
            r1 = move-exception
            java.lang.String r0 = "PAY: DefaultTrustTokenBuilder/build"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            X.5VA r0 = new X.5VA     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            r0.<init>(r1)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
        L_0x0400:
            throw r0     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
        L_0x0401:
            r0 = 8
            X.6Mb r1 = new X.6Mb     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            r1.<init>((int) r0)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            goto L_0x0410
        L_0x0409:
            r0 = 8
            X.6Mb r1 = new X.6Mb     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            r1.<init>((int) r0)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
        L_0x0410:
            r2.BWi(r1)     // Catch:{ 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414, 5VA | NoSuchAlgorithmException | JSONException -> 0x0414 }
            return
        L_0x0414:
            r1 = move-exception
            java.lang.String r0 = "PAY: MFAFactors/registerTD/"
            com.whatsapp.util.Log.e(r0, r1)
            r1 = 6
            X.6Mb r0 = new X.6Mb
            r0.<init>((int) r1)
            r2.BWi(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass645.A00(X.7je, boolean):void");
    }

    public AnonymousClass645(C19630wG r1, C122715vJ r2, C123395wQ r3, C119935qh r4, AnonymousClass6VG r5) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
    }
}
