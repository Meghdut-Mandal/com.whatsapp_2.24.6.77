package X;

/* renamed from: X.6H2  reason: invalid class name */
public final class AnonymousClass6H2 {
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0146, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0150, code lost:
        return new X.AnonymousClass54N(r0.getMessage());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0146 A[ExcHandler: Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException (r0v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0004] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C110555ar A00(X.AnonymousClass6SL r12, java.util.Map r13) {
        /*
            java.lang.String r2 = "kid"
            r5 = 0
            r11 = 1
            org.json.JSONObject r1 = r12.A02     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            if (r1 == 0) goto L_0x013e
            boolean r0 = r1.has(r2)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            if (r0 == 0) goto L_0x013e
            java.lang.String r0 = r1.getString(r2)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            java.lang.String r1 = X.C36431kI.A1A(r0, r13)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            if (r1 == 0) goto L_0x013e
            java.lang.String r0 = "-----BEGIN PUBLIC KEY-----\n"
            java.lang.String r3 = ""
            r6 = 0
            java.lang.String r1 = X.AnonymousClass098.A05(r1, r0, r3, r5)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            java.lang.String r0 = "-----END PUBLIC KEY-----"
            java.lang.String r2 = X.AnonymousClass098.A05(r1, r0, r3, r5)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            java.lang.String r1 = "\n"
            X.0fN r0 = new X.0fN     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            r0.<init>((java.lang.String) r1)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            java.lang.String r4 = r0.A00(r2, r3)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            int r3 = r4.length()     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            int r3 = r3 - r11
            r2 = 0
        L_0x0038:
            if (r6 > r3) goto L_0x005a
            r0 = r3
            if (r2 != 0) goto L_0x003e
            r0 = r6
        L_0x003e:
            char r1 = r4.charAt(r0)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            r0 = 32
            int r0 = X.AnonymousClass00C.A00(r1, r0)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            boolean r0 = X.C90484aE.A1Q(r0)
            if (r2 != 0) goto L_0x0055
            if (r0 != 0) goto L_0x0052
            r2 = 1
            goto L_0x0038
        L_0x0052:
            int r6 = r6 + 1
            goto L_0x0038
        L_0x0055:
            if (r0 == 0) goto L_0x005a
            int r3 = r3 + -1
            goto L_0x0038
        L_0x005a:
            int r0 = r3 + 1
            java.lang.CharSequence r0 = r4.subSequence(r6, r0)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            byte[] r2 = android.util.Base64.decode(r0, r5)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            java.lang.String r0 = "EC"
            java.security.KeyFactory r1 = java.security.KeyFactory.getInstance(r0)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            java.security.spec.X509EncodedKeySpec r0 = new java.security.spec.X509EncodedKeySpec     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            r0.<init>(r2)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            java.security.PublicKey r1 = r1.generatePublic(r0)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            java.lang.String r0 = "SHA256withECDSA"
            java.security.Signature r6 = java.security.Signature.getInstance(r0)     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            r6.initVerify(r1)     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            java.lang.String r2 = "."
            java.lang.String[] r1 = X.C36441kJ.A1S()     // Catch:{ UnsupportedEncodingException -> 0x010c }
            java.lang.String r0 = r12.A04     // Catch:{ UnsupportedEncodingException -> 0x010c }
            r1[r5] = r0     // Catch:{ UnsupportedEncodingException -> 0x010c }
            java.lang.String r0 = r12.A05     // Catch:{ UnsupportedEncodingException -> 0x010c }
            r1[r11] = r0     // Catch:{ UnsupportedEncodingException -> 0x010c }
            java.lang.String r1 = android.text.TextUtils.join(r2, r1)     // Catch:{ UnsupportedEncodingException -> 0x010c }
            java.lang.String r0 = X.C19430v1.A0B     // Catch:{ UnsupportedEncodingException -> 0x010c }
            byte[] r0 = r1.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x010c }
            r6.update(r0)     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            java.lang.String r1 = r12.A01     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            r0 = 8
            byte[] r2 = android.util.Base64.decode(r1, r0)     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            int r1 = r2.length     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            r10 = 2
            int r0 = r1 % r10
            java.lang.String r3 = "Invalid JWT Signature"
            if (r0 != 0) goto L_0x0121
            int r1 = r1 / r10
            byte[][] r1 = X.C203239na.A06(r2, r1, r1)     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            r0 = r1[r5]     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            byte[] r9 = X.AnonymousClass6SL.A00(r0)     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            r0 = r1[r11]     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            byte[] r7 = X.AnonymousClass6SL.A00(r0)     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            int r8 = r9.length     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            int r2 = r8 + 4
            int r4 = r7.length     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            int r2 = r2 + r4
            r0 = 255(0xff, float:3.57E-43)
            if (r2 > r0) goto L_0x0106
            r0 = 127(0x7f, float:1.78E-43)
            r1 = 48
            if (r2 <= r0) goto L_0x00da
            int r0 = r2 + 3
            byte[] r3 = new byte[r0]     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            r3[r5] = r1     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            r0 = -127(0xffffffffffffff81, float:NaN)
            r3[r11] = r0     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            byte r0 = (byte) r2     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            r3[r10] = r0     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            r0 = 3
            goto L_0x00e4
        L_0x00da:
            int r0 = r2 + 2
            byte[] r3 = new byte[r0]     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            r3[r5] = r1     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            byte r0 = (byte) r2     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            r3[r11] = r0     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            r0 = 2
        L_0x00e4:
            int r2 = r0 + 1
            r3[r0] = r10     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            int r1 = r2 + 1
            byte r0 = (byte) r8     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            r3[r2] = r0     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            java.lang.System.arraycopy(r9, r5, r3, r1, r8)     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            int r1 = r1 + r8
            int r2 = r1 + 1
            r3[r1] = r10     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            int r1 = r2 + 1
            byte r0 = (byte) r4     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            r3[r2] = r0     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            java.lang.System.arraycopy(r7, r5, r3, r1, r4)     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            boolean r0 = r6.verify(r3)     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            if (r0 == 0) goto L_0x0136
            X.54O r1 = X.AnonymousClass54O.A00     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            return r1
        L_0x0106:
            X.5UY r0 = new X.5UY     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            goto L_0x0126
        L_0x010c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            java.lang.String r0 = "JWT: "
            r1.append(r0)     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            java.lang.String r0 = ": getSigningPayload threw "
            X.C36321k7.A1L(r2, r0, r1)     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            java.lang.Error r0 = new java.lang.Error     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            goto L_0x0126
        L_0x0121:
            X.5UY r0 = new X.5UY     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
        L_0x0126:
            throw r0     // Catch:{ Exception -> 0x0127, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146, Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
        L_0x0127:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            java.lang.String r0 = "JWT: "
            r1.append(r0)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            java.lang.String r0 = ": Can't verify signature "
            X.C36351kA.A1P(r0, r1, r2)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
        L_0x0136:
            java.lang.String r0 = "Token did not verify"
            X.54N r1 = new X.54N
            r1.<init>(r0)
            return r1
        L_0x013e:
            java.lang.String r0 = "Public key doesn't exist"
            X.54N r1 = new X.54N     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            r1.<init>(r0)     // Catch:{ Exception | IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException | JSONException -> 0x0146 }
            return r1
        L_0x0146:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            X.54N r0 = new X.54N
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6H2.A00(X.6SL, java.util.Map):X.5ar");
    }
}
